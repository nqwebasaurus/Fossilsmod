package fossils.fossils.client.blockentity.model.ichthyovenator;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class IchthyovenatorFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart rightthigh;
	private final ModelPart rightshin;
	private final ModelPart rightankle;
	private final ModelPart rightfoot;
	private final ModelPart righttoes;
	private final ModelPart leftthigh;
	private final ModelPart leftshin;
	private final ModelPart leftankle;
	private final ModelPart leftfoot;
	private final ModelPart lefttoes;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart rightupperarm;
	private final ModelPart rightlowerarm;
	private final ModelPart righthand;
	private final ModelPart rightouterfingers;
	private final ModelPart rightthumb;
	private final ModelPart rightthumbclaw;
	private final ModelPart leftupperarm;
	private final ModelPart leftlowerarm;
	private final ModelPart lefthand;
	private final ModelPart leftouterfingers;
	private final ModelPart leftthumb;
	private final ModelPart leftthumbclaw;
	private final ModelPart neck5;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftAngularSurangular;
	private final ModelPart leftDentary;
	private final ModelPart rightAngularSurangular;
	private final ModelPart rightDentary;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;

	public IchthyovenatorFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.rightthigh = this.hips.getChild("rightthigh");
		this.rightshin = this.rightthigh.getChild("rightshin");
		this.rightankle = this.rightshin.getChild("rightankle");
		this.rightfoot = this.rightankle.getChild("rightfoot");
		this.righttoes = this.rightfoot.getChild("righttoes");
		this.leftthigh = this.hips.getChild("leftthigh");
		this.leftshin = this.leftthigh.getChild("leftshin");
		this.leftankle = this.leftshin.getChild("leftankle");
		this.leftfoot = this.leftankle.getChild("leftfoot");
		this.lefttoes = this.leftfoot.getChild("lefttoes");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.rightupperarm = this.chest.getChild("rightupperarm");
		this.rightlowerarm = this.rightupperarm.getChild("rightlowerarm");
		this.righthand = this.rightlowerarm.getChild("righthand");
		this.rightouterfingers = this.righthand.getChild("rightouterfingers");
		this.rightthumb = this.righthand.getChild("rightthumb");
		this.rightthumbclaw = this.rightthumb.getChild("rightthumbclaw");
		this.leftupperarm = this.chest.getChild("leftupperarm");
		this.leftlowerarm = this.leftupperarm.getChild("leftlowerarm");
		this.lefthand = this.leftlowerarm.getChild("lefthand");
		this.leftouterfingers = this.lefthand.getChild("leftouterfingers");
		this.leftthumb = this.lefthand.getChild("leftthumb");
		this.leftthumbclaw = this.leftthumb.getChild("leftthumbclaw");
		this.neck5 = this.chest.getChild("neck5");
		this.neck4 = this.neck5.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.leftAngularSurangular = this.jaw.getChild("leftAngularSurangular");
		this.leftDentary = this.leftAngularSurangular.getChild("leftDentary");
		this.rightAngularSurangular = this.jaw.getChild("rightAngularSurangular");
		this.rightDentary = this.rightAngularSurangular.getChild("rightDentary");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -28.0F, -6.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(65, 31).addBox(-0.01F, -2.0546F, -0.0991F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.2095F, 8.3356F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(92, 72).addBox(0.0F, -4.7944F, -0.1803F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1095F, 8.9356F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(98, 18).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7095F, 8.3356F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(98, 98).addBox(-0.01F, -1.7347F, -1.0734F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.3709F, 8.9266F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(93, 2).addBox(0.0F, -2.0F, -0.1F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.8709F, 7.3266F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(40, 88).addBox(0.01F, -2.5F, -0.4F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.8709F, 7.3266F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(10, 78).addBox(0.01F, -2.5F, -1.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.376F, 6.0396F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 18).addBox(-0.01F, -2.535F, -1.8844F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.7201F, 6.3636F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(9, 18).addBox(0.02F, -2.8534F, -0.0065F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.7201F, 4.5636F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(63, 76).addBox(0.0F, -7.7F, 9.2F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(80, 68).addBox(-0.02F, -4.7F, 6.3F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(25, 95).addBox(0.0F, -3.4F, 4.6F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 92).addBox(0.01F, -4.7F, 4.3F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 83).addBox(0.01F, -6.7F, 1.1F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 78).addBox(0.0F, -8.7F, 0.5F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 26).addBox(0.0F, -3.8F, 3.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 95).addBox(0.01F, -3.8F, 2.3F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 18).addBox(-1.0F, -0.1F, 1.0F, 2.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4F, -5.2F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(58, 83).addBox(0.0F, -3.3829F, -1.9624F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.3F, 3.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(20, 18).addBox(-0.01F, -3.1809F, -0.0441F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.2F, 1.6F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(53, 83).addBox(0.01F, -4.3445F, -1.294F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2F, 2.3F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(98, 13).addBox(-0.01F, -3.0893F, -0.9937F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.9F, 0.8F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(99, 0).addBox(-0.01F, -0.1205F, -0.9614F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -11.6F, -2.5F, 0.1396F, 0.0F, 0.0F));

		PartDefinition hips_r1 = hips.addOrReplaceChild("hips_r1", CubeListBuilder.create().texOffs(23, 82).mirror().addBox(-1.7399F, -9.5024F, -0.5107F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2746F, 2.7544F, 1.1864F, -0.8379F, -0.0433F, 0.2235F));

		PartDefinition hips_r2 = hips.addOrReplaceChild("hips_r2", CubeListBuilder.create().texOffs(33, 72).mirror().addBox(-1.0964F, -10.3376F, -3.2076F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2746F, 2.7544F, 1.1864F, 0.5291F, 0.2252F, 0.19F));

		PartDefinition hips_r3 = hips.addOrReplaceChild("hips_r3", CubeListBuilder.create().texOffs(75, 44).mirror().addBox(-1.0964F, -8.6846F, -5.6124F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2746F, 2.7544F, 1.1864F, -0.0381F, 0.2252F, 0.19F));

		PartDefinition hips_r4 = hips.addOrReplaceChild("hips_r4", CubeListBuilder.create().texOffs(47, 63).mirror().addBox(-1.8254F, -8.1204F, -3.8238F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.2746F, 2.7544F, 1.1864F, -0.2094F, 0.0F, 0.2182F));

		PartDefinition hips_r5 = hips.addOrReplaceChild("hips_r5", CubeListBuilder.create().texOffs(58, 60).mirror().addBox(-1.7399F, -8.1784F, -0.1269F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2746F, 2.7544F, 1.1864F, -0.2445F, -0.0433F, 0.2235F));

		PartDefinition hips_r6 = hips.addOrReplaceChild("hips_r6", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-1.7399F, -6.827F, 0.9783F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.2746F, 2.7544F, 1.1864F, -0.2096F, -0.0433F, 0.2235F));

		PartDefinition hips_r7 = hips.addOrReplaceChild("hips_r7", CubeListBuilder.create().texOffs(34, 0).mirror().addBox(-1.8254F, -6.6796F, -3.1439F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2746F, 2.7544F, 1.1864F, -0.1222F, 0.0F, 0.2182F));

		PartDefinition hips_r8 = hips.addOrReplaceChild("hips_r8", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(-0.4324F, -0.5773F, -1.7607F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.2746F, 2.7544F, 1.1864F, 0.5391F, 0.0785F, -0.1067F));

		PartDefinition hips_r9 = hips.addOrReplaceChild("hips_r9", CubeListBuilder.create().texOffs(34, 0).mirror().addBox(-0.4324F, -0.4013F, -2.7711F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.2746F, 2.7544F, 1.1864F, 1.5514F, 0.0785F, -0.1067F));

		PartDefinition hips_r10 = hips.addOrReplaceChild("hips_r10", CubeListBuilder.create().texOffs(82, 0).mirror().addBox(0.2506F, 5.7796F, -0.6007F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2746F, 2.7544F, 1.1864F, 0.7085F, -0.0009F, -0.0137F));

		PartDefinition hips_r11 = hips.addOrReplaceChild("hips_r11", CubeListBuilder.create().texOffs(86, 87).mirror().addBox(-0.6417F, 3.891F, 0.4658F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2746F, 2.7544F, 1.1864F, -1.2421F, -0.1223F, -0.0845F));

		PartDefinition hips_r12 = hips.addOrReplaceChild("hips_r12", CubeListBuilder.create().texOffs(49, 89).mirror().addBox(-0.4485F, 0.4375F, -1.7992F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2746F, 2.7544F, 1.1864F, -0.8499F, -0.0499F, -0.1064F));

		PartDefinition hips_r13 = hips.addOrReplaceChild("hips_r13", CubeListBuilder.create().texOffs(62, 89).mirror().addBox(-0.4485F, 3.2258F, 0.3776F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.2746F, 2.7544F, 1.1864F, -0.9895F, -0.0499F, -0.1064F));

		PartDefinition hips_r14 = hips.addOrReplaceChild("hips_r14", CubeListBuilder.create().texOffs(95, 71).mirror().addBox(-0.3119F, -1.9964F, -4.904F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2746F, 2.7544F, 1.1864F, -0.5765F, -0.0097F, -0.0755F));

		PartDefinition hips_r15 = hips.addOrReplaceChild("hips_r15", CubeListBuilder.create().texOffs(95, 75).mirror().addBox(-0.3119F, -3.1775F, -3.8221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2746F, 2.7544F, 1.1864F, 0.1391F, -0.0097F, -0.0755F));

		PartDefinition hips_r16 = hips.addOrReplaceChild("hips_r16", CubeListBuilder.create().texOffs(67, 89).mirror().addBox(-0.4485F, -0.6387F, -3.8171F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.2746F, 2.7544F, 1.1864F, -0.3263F, -0.0499F, -0.1064F));

		PartDefinition hips_r17 = hips.addOrReplaceChild("hips_r17", CubeListBuilder.create().texOffs(18, 82).mirror().addBox(-0.4324F, 0.7787F, 0.2926F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2746F, 2.7544F, 1.1864F, 0.574F, 0.0785F, -0.1067F));

		PartDefinition hips_r18 = hips.addOrReplaceChild("hips_r18", CubeListBuilder.create().texOffs(85, 74).mirror().addBox(0.6279F, 8.878F, -2.607F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2746F, 2.7544F, 1.1864F, -0.555F, 0.0144F, -0.0025F));

		PartDefinition hips_r19 = hips.addOrReplaceChild("hips_r19", CubeListBuilder.create().texOffs(86, 53).mirror().addBox(-0.4485F, 3.8305F, -3.2613F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2746F, 2.7544F, 1.1864F, -0.4659F, -0.0499F, -0.1064F));

		PartDefinition hips_r20 = hips.addOrReplaceChild("hips_r20", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5421F, -5.0306F, -3.5439F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2746F, 2.7544F, 1.1864F, -0.118F, -0.0315F, -0.0418F));

		PartDefinition hips_r21 = hips.addOrReplaceChild("hips_r21", CubeListBuilder.create().texOffs(38, 21).mirror().addBox(-1.0964F, -7.8571F, -2.762F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.2746F, 2.7544F, 1.1864F, 0.5728F, 0.2252F, 0.19F));

		PartDefinition hips_r22 = hips.addOrReplaceChild("hips_r22", CubeListBuilder.create().texOffs(38, 21).addBox(0.0964F, -7.8571F, -2.762F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2746F, 2.7544F, 1.1864F, 0.5728F, -0.2252F, -0.19F));

		PartDefinition hips_r23 = hips.addOrReplaceChild("hips_r23", CubeListBuilder.create().texOffs(0, 18).addBox(0.7399F, -6.827F, 0.9783F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.2746F, 2.7544F, 1.1864F, -0.2096F, 0.0433F, -0.2235F));

		PartDefinition hips_r24 = hips.addOrReplaceChild("hips_r24", CubeListBuilder.create().texOffs(58, 60).addBox(0.7399F, -8.1784F, -0.1269F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2746F, 2.7544F, 1.1864F, -0.2445F, 0.0433F, -0.2235F));

		PartDefinition hips_r25 = hips.addOrReplaceChild("hips_r25", CubeListBuilder.create().texOffs(23, 82).addBox(0.7399F, -9.5024F, -0.5107F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.2746F, 2.7544F, 1.1864F, -0.8379F, 0.0433F, -0.2235F));

		PartDefinition hips_r26 = hips.addOrReplaceChild("hips_r26", CubeListBuilder.create().texOffs(47, 63).addBox(0.8254F, -8.1204F, -3.8238F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.2746F, 2.7544F, 1.1864F, -0.2094F, 0.0F, -0.2182F));

		PartDefinition hips_r27 = hips.addOrReplaceChild("hips_r27", CubeListBuilder.create().texOffs(33, 72).addBox(0.0964F, -10.3376F, -3.2076F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2746F, 2.7544F, 1.1864F, 0.5291F, -0.2252F, -0.19F));

		PartDefinition hips_r28 = hips.addOrReplaceChild("hips_r28", CubeListBuilder.create().texOffs(75, 44).addBox(0.0964F, -8.6846F, -5.6124F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.2746F, 2.7544F, 1.1864F, -0.0381F, -0.2252F, -0.19F));

		PartDefinition hips_r29 = hips.addOrReplaceChild("hips_r29", CubeListBuilder.create().texOffs(34, 0).addBox(0.8254F, -6.6796F, -3.1439F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2746F, 2.7544F, 1.1864F, -0.1222F, 0.0F, -0.2182F));

		PartDefinition hips_r30 = hips.addOrReplaceChild("hips_r30", CubeListBuilder.create().texOffs(0, 0).addBox(-0.4579F, -5.0306F, -3.5439F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2746F, 2.7544F, 1.1864F, -0.118F, 0.0315F, 0.0418F));

		PartDefinition hips_r31 = hips.addOrReplaceChild("hips_r31", CubeListBuilder.create().texOffs(95, 71).addBox(-0.6881F, -1.9964F, -4.904F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2746F, 2.7544F, 1.1864F, -0.5765F, 0.0097F, 0.0755F));

		PartDefinition hips_r32 = hips.addOrReplaceChild("hips_r32", CubeListBuilder.create().texOffs(95, 75).addBox(-0.6881F, -3.1775F, -3.8221F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2746F, 2.7544F, 1.1864F, 0.1391F, 0.0097F, 0.0755F));

		PartDefinition hips_r33 = hips.addOrReplaceChild("hips_r33", CubeListBuilder.create().texOffs(49, 89).addBox(-0.5515F, 0.4375F, -1.7992F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2746F, 2.7544F, 1.1864F, -0.8499F, 0.0499F, 0.1064F));

		PartDefinition hips_r34 = hips.addOrReplaceChild("hips_r34", CubeListBuilder.create().texOffs(67, 89).addBox(-0.5515F, -0.6387F, -3.8171F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.2746F, 2.7544F, 1.1864F, -0.3263F, 0.0499F, 0.1064F));

		PartDefinition hips_r35 = hips.addOrReplaceChild("hips_r35", CubeListBuilder.create().texOffs(86, 87).addBox(-0.3583F, 3.891F, 0.4658F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2746F, 2.7544F, 1.1864F, -1.2421F, 0.1223F, 0.0845F));

		PartDefinition hips_r36 = hips.addOrReplaceChild("hips_r36", CubeListBuilder.create().texOffs(62, 89).addBox(-0.5515F, 3.2258F, 0.3776F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2746F, 2.7544F, 1.1864F, -0.9895F, 0.0499F, 0.1064F));

		PartDefinition hips_r37 = hips.addOrReplaceChild("hips_r37", CubeListBuilder.create().texOffs(86, 53).addBox(-0.5515F, 3.8305F, -3.2613F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2746F, 2.7544F, 1.1864F, -0.4659F, 0.0499F, 0.1064F));

		PartDefinition hips_r38 = hips.addOrReplaceChild("hips_r38", CubeListBuilder.create().texOffs(85, 74).addBox(-1.6279F, 8.878F, -2.607F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2746F, 2.7544F, 1.1864F, -0.555F, -0.0144F, 0.0025F));

		PartDefinition hips_r39 = hips.addOrReplaceChild("hips_r39", CubeListBuilder.create().texOffs(82, 0).addBox(-1.2506F, 5.7796F, -0.6007F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2746F, 2.7544F, 1.1864F, 0.7085F, 0.0009F, 0.0137F));

		PartDefinition hips_r40 = hips.addOrReplaceChild("hips_r40", CubeListBuilder.create().texOffs(73, 0).addBox(-0.5676F, -0.5773F, -1.7607F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2746F, 2.7544F, 1.1864F, 0.5391F, -0.0785F, 0.1067F));

		PartDefinition hips_r41 = hips.addOrReplaceChild("hips_r41", CubeListBuilder.create().texOffs(34, 0).addBox(-0.5676F, -0.4013F, -2.7711F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.2746F, 2.7544F, 1.1864F, 1.5514F, -0.0785F, 0.1067F));

		PartDefinition hips_r42 = hips.addOrReplaceChild("hips_r42", CubeListBuilder.create().texOffs(18, 82).addBox(-0.5676F, 0.7787F, 0.2926F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2746F, 2.7544F, 1.1864F, 0.574F, -0.0785F, 0.1067F));

		PartDefinition rightthigh = hips.addOrReplaceChild("rightthigh", CubeListBuilder.create().texOffs(78, 77).addBox(-1.0117F, -0.9658F, -1.1091F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.0009F, 0.461F, 0.589F, 0.0339F, -0.011F, -0.041F));

		PartDefinition rightthigh_r1 = rightthigh.addOrReplaceChild("rightthigh_r1", CubeListBuilder.create().texOffs(54, 76).addBox(-1.0F, -0.2F, -0.1F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0098F, 6.7721F, -2.4336F, 0.1222F, 0.0F, 0.0F));

		PartDefinition rightthigh_r2 = rightthigh.addOrReplaceChild("rightthigh_r2", CubeListBuilder.create().texOffs(52, 8).addBox(-0.6057F, -0.5616F, -0.8311F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0941F, 2.0756F, -0.3953F, -0.0698F, 0.0F, 0.0F));

		PartDefinition rightthigh_r3 = rightthigh.addOrReplaceChild("rightthigh_r3", CubeListBuilder.create().texOffs(0, 51).addBox(-1.1057F, -0.7642F, -0.914F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0941F, 2.0756F, -0.3953F, -0.2618F, 0.0F, 0.0F));

		PartDefinition rightshin = rightthigh.addOrReplaceChild("rightshin", CubeListBuilder.create().texOffs(76, 13).addBox(-1.5134F, 3.0449F, 0.1212F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 7).addBox(-1.5134F, 0.0449F, -0.3788F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(23, 70).addBox(0.7866F, 0.0449F, 0.1212F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2618F, 10.2892F, -1.5228F, 0.6651F, 0.0F, 0.0424F));

		PartDefinition rightankle = rightshin.addOrReplaceChild("rightankle", CubeListBuilder.create().texOffs(9, 70).addBox(-1.471F, 0.0843F, -0.7824F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0524F, 10.5142F, 0.8396F, -0.7674F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightankle.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(55, 42).addBox(-1.971F, -0.1695F, -2.9994F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4862F, -0.2121F, 0.1485F, 0.0F, 0.0F));

		PartDefinition righttoes = rightfoot.addOrReplaceChild("righttoes", CubeListBuilder.create().texOffs(52, 0).addBox(-2.471F, -0.8557F, -5.0231F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.6962F, -2.1762F));

		PartDefinition leftthigh = hips.addOrReplaceChild("leftthigh", CubeListBuilder.create().texOffs(77, 62).addBox(-0.9883F, -0.9658F, -1.1091F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-3.0009F, 0.461F, 0.589F, -0.2715F, 0.011F, 0.041F));

		PartDefinition leftthigh_r1 = leftthigh.addOrReplaceChild("leftthigh_r1", CubeListBuilder.create().texOffs(75, 34).addBox(-1.0F, -0.2F, -0.1F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0098F, 6.7721F, -2.4336F, 0.1222F, 0.0F, 0.0F));

		PartDefinition leftthigh_r2 = leftthigh.addOrReplaceChild("leftthigh_r2", CubeListBuilder.create().texOffs(25, 51).addBox(-0.3943F, -0.5616F, -0.8311F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0941F, 2.0756F, -0.3953F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftthigh_r3 = leftthigh.addOrReplaceChild("leftthigh_r3", CubeListBuilder.create().texOffs(41, 38).addBox(-0.8943F, -0.7642F, -0.914F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.0941F, 2.0756F, -0.3953F, -0.2618F, 0.0F, 0.0F));

		PartDefinition leftshin = leftthigh.addOrReplaceChild("leftshin", CubeListBuilder.create().texOffs(73, 70).addBox(-0.4866F, 3.0449F, 0.1212F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 54).addBox(-0.4866F, 0.0449F, -0.3788F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(18, 70).addBox(-1.7866F, 0.0449F, 0.1212F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2618F, 10.2892F, -1.5228F, 0.796F, 0.0F, -0.0424F));

		PartDefinition leftankle = leftshin.addOrReplaceChild("leftankle", CubeListBuilder.create().texOffs(0, 70).addBox(-1.529F, 0.0843F, -0.7824F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0524F, 10.5142F, 0.8396F, -0.7674F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftankle.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(55, 35).addBox(-2.029F, -0.1695F, -2.9994F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4862F, -0.2121F, 0.2794F, 0.0F, 0.0F));

		PartDefinition lefttoes = leftfoot.addOrReplaceChild("lefttoes", CubeListBuilder.create().texOffs(15, 38).addBox(-2.529F, -0.8557F, -5.0231F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.6962F, -2.1762F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.0F, -4.2F, 0.0436F, 0.1309F, 0.0F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(38, 80).addBox(-0.01F, -4.9618F, -1.9453F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.9F, -0.7F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(28, 70).addBox(0.0F, -9.0077F, 5.1052F, 0.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(44, 70).addBox(0.0F, -8.7077F, 2.8052F, 0.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(49, 70).addBox(0.0F, -8.0077F, 0.1052F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -8.1F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -4.0736F, -12.7648F, 10.0F, 4.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.1547F, -2.9428F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 51).addBox(-1.0F, -0.3443F, -0.1957F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.6F, -8.8F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(68, 76).addBox(0.0F, -8.0F, 4.8F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(73, 79).addBox(0.0F, -7.2F, 1.8F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(3, 88).addBox(0.0F, -6.1F, -0.2F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -15.8F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r1 = body.addOrReplaceChild("bodymiddle_r1", CubeListBuilder.create().texOffs(83, 25).mirror().addBox(-4.7693F, -0.819F, -1.0651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.046F, -1.6588F, 0.0679F, 0.1106F, -1.1385F));

		PartDefinition bodymiddle_r2 = body.addOrReplaceChild("bodymiddle_r2", CubeListBuilder.create().texOffs(68, 36).mirror().addBox(-1.9517F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.046F, -1.6588F, 0.1037F, 0.0696F, -0.7463F));

		PartDefinition bodymiddle_r3 = body.addOrReplaceChild("bodymiddle_r3", CubeListBuilder.create().texOffs(74, 29).mirror().addBox(-1.9517F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.054F, -3.9588F, 0.1914F, 0.1275F, -0.6678F));

		PartDefinition bodymiddle_r4 = body.addOrReplaceChild("bodymiddle_r4", CubeListBuilder.create().texOffs(47, 4).mirror().addBox(-4.7208F, -3.0939F, -1.0651F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.054F, -3.9588F, 0.0099F, 0.2342F, -1.5946F));

		PartDefinition bodymiddle_r5 = body.addOrReplaceChild("bodymiddle_r5", CubeListBuilder.create().texOffs(84, 38).mirror().addBox(-4.7693F, -0.819F, -1.0651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.054F, -3.9588F, 0.1272F, 0.1974F, -1.0595F));

		PartDefinition bodymiddle_r6 = body.addOrReplaceChild("bodymiddle_r6", CubeListBuilder.create().texOffs(87, 10).mirror().addBox(-6.7208F, -3.0939F, -1.0651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.154F, -6.4588F, 0.0099F, 0.2342F, -1.5073F));

		PartDefinition bodymiddle_r7 = body.addOrReplaceChild("bodymiddle_r7", CubeListBuilder.create().texOffs(84, 62).mirror().addBox(-4.7693F, -0.819F, -1.0651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.154F, -6.4588F, 0.1272F, 0.1974F, -0.9723F));

		PartDefinition bodymiddle_r8 = body.addOrReplaceChild("bodymiddle_r8", CubeListBuilder.create().texOffs(87, 81).mirror().addBox(-1.9517F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.154F, -6.4588F, 0.1914F, 0.1275F, -0.5805F));

		PartDefinition bodymiddle_r9 = body.addOrReplaceChild("bodymiddle_r9", CubeListBuilder.create().texOffs(89, 16).mirror().addBox(-1.9517F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.154F, -9.4588F, 0.2655F, 0.175F, -0.5345F));

		PartDefinition bodymiddle_r10 = body.addOrReplaceChild("bodymiddle_r10", CubeListBuilder.create().texOffs(84, 83).mirror().addBox(-4.7693F, -0.819F, -1.0651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.154F, -9.4588F, 0.1781F, 0.2693F, -0.9256F));

		PartDefinition bodymiddle_r11 = body.addOrReplaceChild("bodymiddle_r11", CubeListBuilder.create().texOffs(38, 28).mirror().addBox(-7.7208F, -3.0939F, -1.0651F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.154F, -9.4588F, 0.0157F, 0.3213F, -1.4708F));

		PartDefinition bodymiddle_r12 = body.addOrReplaceChild("bodymiddle_r12", CubeListBuilder.create().texOffs(42, 2).mirror().addBox(-9.7208F, -3.0939F, -1.0651F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.154F, -12.4588F, 0.0219F, 0.4084F, -1.4512F));

		PartDefinition bodymiddle_r13 = body.addOrReplaceChild("bodymiddle_r13", CubeListBuilder.create().texOffs(85, 47).mirror().addBox(-4.7693F, -0.819F, -1.0651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.154F, -12.4588F, 0.2312F, 0.3404F, -0.8922F));

		PartDefinition bodymiddle_r14 = body.addOrReplaceChild("bodymiddle_r14", CubeListBuilder.create().texOffs(89, 22).mirror().addBox(-1.9517F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.154F, -12.4588F, 0.3408F, 0.2215F, -0.5022F));

		PartDefinition bodymiddle_r15 = body.addOrReplaceChild("bodymiddle_r15", CubeListBuilder.create().texOffs(89, 33).mirror().addBox(-1.9517F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.246F, -14.9588F, 0.4021F, 0.2578F, -0.4701F));

		PartDefinition bodymiddle_r16 = body.addOrReplaceChild("bodymiddle_r16", CubeListBuilder.create().texOffs(85, 49).mirror().addBox(-4.7693F, -0.819F, -1.0651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.246F, -14.9588F, 0.2755F, 0.3966F, -0.8588F));

		PartDefinition bodymiddle_r17 = body.addOrReplaceChild("bodymiddle_r17", CubeListBuilder.create().texOffs(34, 63).mirror().addBox(-10.7208F, -3.0939F, -1.0651F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.246F, -14.9588F, 0.0272F, 0.478F, -1.4314F));

		PartDefinition bodymiddle_r18 = body.addOrReplaceChild("bodymiddle_r18", CubeListBuilder.create().texOffs(83, 25).addBox(1.7693F, -0.819F, -1.0651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.046F, -1.6588F, 0.0679F, -0.1106F, 1.1385F));

		PartDefinition bodymiddle_r19 = body.addOrReplaceChild("bodymiddle_r19", CubeListBuilder.create().texOffs(68, 36).addBox(-0.0483F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.046F, -1.6588F, 0.1037F, -0.0696F, 0.7463F));

		PartDefinition bodymiddle_r20 = body.addOrReplaceChild("bodymiddle_r20", CubeListBuilder.create().texOffs(84, 38).addBox(1.7693F, -0.819F, -1.0651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.054F, -3.9588F, 0.1272F, -0.1974F, 1.0595F));

		PartDefinition bodymiddle_r21 = body.addOrReplaceChild("bodymiddle_r21", CubeListBuilder.create().texOffs(74, 29).addBox(-0.0483F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.054F, -3.9588F, 0.1914F, -0.1275F, 0.6678F));

		PartDefinition bodymiddle_r22 = body.addOrReplaceChild("bodymiddle_r22", CubeListBuilder.create().texOffs(47, 4).addBox(3.7208F, -3.0939F, -1.0651F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.054F, -3.9588F, 0.0099F, -0.2342F, 1.5946F));

		PartDefinition bodymiddle_r23 = body.addOrReplaceChild("bodymiddle_r23", CubeListBuilder.create().texOffs(84, 62).addBox(1.7693F, -0.819F, -1.0651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.154F, -6.4588F, 0.1272F, -0.1974F, 0.9723F));

		PartDefinition bodymiddle_r24 = body.addOrReplaceChild("bodymiddle_r24", CubeListBuilder.create().texOffs(87, 81).addBox(-0.0483F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.154F, -6.4588F, 0.1914F, -0.1275F, 0.5805F));

		PartDefinition bodymiddle_r25 = body.addOrReplaceChild("bodymiddle_r25", CubeListBuilder.create().texOffs(87, 10).addBox(3.7208F, -3.0939F, -1.0651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.154F, -6.4588F, 0.0099F, -0.2342F, 1.5073F));

		PartDefinition bodymiddle_r26 = body.addOrReplaceChild("bodymiddle_r26", CubeListBuilder.create().texOffs(84, 83).addBox(1.7693F, -0.819F, -1.0651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.154F, -9.4588F, 0.1781F, -0.2693F, 0.9256F));

		PartDefinition bodymiddle_r27 = body.addOrReplaceChild("bodymiddle_r27", CubeListBuilder.create().texOffs(89, 16).addBox(-0.0483F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.154F, -9.4588F, 0.2655F, -0.175F, 0.5345F));

		PartDefinition bodymiddle_r28 = body.addOrReplaceChild("bodymiddle_r28", CubeListBuilder.create().texOffs(38, 28).addBox(3.7208F, -3.0939F, -1.0651F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.154F, -9.4588F, 0.0157F, -0.3213F, 1.4708F));

		PartDefinition bodymiddle_r29 = body.addOrReplaceChild("bodymiddle_r29", CubeListBuilder.create().texOffs(85, 47).addBox(1.7693F, -0.819F, -1.0651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.154F, -12.4588F, 0.2312F, -0.3404F, 0.8922F));

		PartDefinition bodymiddle_r30 = body.addOrReplaceChild("bodymiddle_r30", CubeListBuilder.create().texOffs(89, 22).addBox(-0.0483F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.154F, -12.4588F, 0.3408F, -0.2215F, 0.5022F));

		PartDefinition bodymiddle_r31 = body.addOrReplaceChild("bodymiddle_r31", CubeListBuilder.create().texOffs(42, 2).addBox(3.7208F, -3.0939F, -1.0651F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.154F, -12.4588F, 0.0219F, -0.4084F, 1.4512F));

		PartDefinition bodymiddle_r32 = body.addOrReplaceChild("bodymiddle_r32", CubeListBuilder.create().texOffs(89, 33).addBox(-0.0483F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.246F, -14.9588F, 0.4021F, -0.2578F, 0.4701F));

		PartDefinition bodymiddle_r33 = body.addOrReplaceChild("bodymiddle_r33", CubeListBuilder.create().texOffs(85, 49).addBox(1.7693F, -0.819F, -1.0651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.246F, -14.9588F, 0.2755F, -0.3966F, 0.8588F));

		PartDefinition bodymiddle_r34 = body.addOrReplaceChild("bodymiddle_r34", CubeListBuilder.create().texOffs(34, 63).addBox(3.7208F, -3.0939F, -1.0651F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.246F, -14.9588F, 0.0272F, -0.478F, 1.4314F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(52, 8).addBox(-1.0F, -0.1F, -0.2F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -15.8F, 0.0349F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -16.8F, 0.0436F, 0.1745F, 0.0F));

		PartDefinition cube_r22 = chest.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(73, 14).addBox(0.0F, -6.0265F, -0.1656F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -0.8F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r23 = chest.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(72, 89).addBox(0.0F, -5.0457F, 0.0299F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -3.0F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r24 = chest.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(9, 43).addBox(0.0F, -3.2631F, 0.0229F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -5.0F, -0.0262F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r35 = chest.addOrReplaceChild("bodymiddle_r35", CubeListBuilder.create().texOffs(55, 49).mirror().addBox(-10.7208F, -3.0939F, -1.0651F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.346F, -0.0588F, 0.0258F, 0.4606F, -1.4495F));

		PartDefinition bodymiddle_r36 = chest.addOrReplaceChild("bodymiddle_r36", CubeListBuilder.create().texOffs(68, 44).mirror().addBox(-4.7693F, -0.819F, -1.0651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.346F, -0.0588F, 0.2642F, 0.3826F, -0.8805F));

		PartDefinition bodymiddle_r37 = chest.addOrReplaceChild("bodymiddle_r37", CubeListBuilder.create().texOffs(68, 0).mirror().addBox(-1.9517F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.346F, -0.0588F, 0.3867F, 0.2488F, -0.4915F));

		PartDefinition bodymiddle_r38 = chest.addOrReplaceChild("bodymiddle_r38", CubeListBuilder.create().texOffs(42, 65).mirror().addBox(-4.7693F, -0.819F, -1.0651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.746F, -2.0588F, 0.2984F, 0.4245F, -0.9194F));

		PartDefinition bodymiddle_r39 = chest.addOrReplaceChild("bodymiddle_r39", CubeListBuilder.create().texOffs(48, 38).mirror().addBox(-1.9517F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.746F, -2.0588F, 0.4333F, 0.2757F, -0.5318F));

		PartDefinition bodymiddle_r40 = chest.addOrReplaceChild("bodymiddle_r40", CubeListBuilder.create().texOffs(54, 29).mirror().addBox(-10.7208F, -3.0939F, -1.0651F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.746F, -2.0588F, 0.03F, 0.5128F, -1.4999F));

		PartDefinition bodymiddle_r41 = chest.addOrReplaceChild("bodymiddle_r41", CubeListBuilder.create().texOffs(15, 46).mirror().addBox(-10.7208F, -3.0939F, -1.0651F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.146F, -4.0588F, 0.0374F, 0.5999F, -1.5483F));

		PartDefinition bodymiddle_r42 = chest.addOrReplaceChild("bodymiddle_r42", CubeListBuilder.create().texOffs(54, 63).mirror().addBox(-4.7693F, -0.819F, -1.0651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.146F, -4.0588F, 0.3585F, 0.4932F, -0.9452F));

		PartDefinition bodymiddle_r43 = chest.addOrReplaceChild("bodymiddle_r43", CubeListBuilder.create().texOffs(31, 47).mirror().addBox(-1.9517F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.146F, -4.0588F, 0.5125F, 0.3191F, -0.5609F));

		PartDefinition bodymiddle_r44 = chest.addOrReplaceChild("bodymiddle_r44", CubeListBuilder.create().texOffs(91, 87).mirror().addBox(-1.9517F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.546F, -5.8588F, 0.5448F, 0.3359F, -0.6378F));

		PartDefinition bodymiddle_r45 = chest.addOrReplaceChild("bodymiddle_r45", CubeListBuilder.create().texOffs(41, 47).mirror().addBox(-4.7693F, -0.819F, -1.0651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.546F, -5.8588F, 0.3837F, 0.5203F, -1.0202F));

		PartDefinition bodymiddle_r46 = chest.addOrReplaceChild("bodymiddle_r46", CubeListBuilder.create().texOffs(42, 0).mirror().addBox(-9.7208F, -3.0939F, -1.0651F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.546F, -5.8588F, 0.0407F, 0.6347F, -1.6337F));

		PartDefinition bodymiddle_r47 = chest.addOrReplaceChild("bodymiddle_r47", CubeListBuilder.create().texOffs(41, 47).addBox(1.7693F, -0.819F, -1.0651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.546F, -5.8588F, 0.3837F, -0.5203F, 1.0202F));

		PartDefinition bodymiddle_r48 = chest.addOrReplaceChild("bodymiddle_r48", CubeListBuilder.create().texOffs(42, 0).addBox(3.7208F, -3.0939F, -1.0651F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.546F, -5.8588F, 0.0407F, -0.6347F, 1.6337F));

		PartDefinition bodymiddle_r49 = chest.addOrReplaceChild("bodymiddle_r49", CubeListBuilder.create().texOffs(91, 87).addBox(-0.0483F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.546F, -5.8588F, 0.5448F, -0.3359F, 0.6378F));

		PartDefinition bodymiddle_r50 = chest.addOrReplaceChild("bodymiddle_r50", CubeListBuilder.create().texOffs(54, 63).addBox(1.7693F, -0.819F, -1.0651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.146F, -4.0588F, 0.3585F, -0.4932F, 0.9452F));

		PartDefinition bodymiddle_r51 = chest.addOrReplaceChild("bodymiddle_r51", CubeListBuilder.create().texOffs(15, 46).addBox(3.7208F, -3.0939F, -1.0651F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.146F, -4.0588F, 0.0374F, -0.5999F, 1.5483F));

		PartDefinition bodymiddle_r52 = chest.addOrReplaceChild("bodymiddle_r52", CubeListBuilder.create().texOffs(31, 47).addBox(-0.0483F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.146F, -4.0588F, 0.5125F, -0.3191F, 0.5609F));

		PartDefinition bodymiddle_r53 = chest.addOrReplaceChild("bodymiddle_r53", CubeListBuilder.create().texOffs(42, 65).addBox(1.7693F, -0.819F, -1.0651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.746F, -2.0588F, 0.2984F, -0.4245F, 0.9194F));

		PartDefinition bodymiddle_r54 = chest.addOrReplaceChild("bodymiddle_r54", CubeListBuilder.create().texOffs(54, 29).addBox(3.7208F, -3.0939F, -1.0651F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.746F, -2.0588F, 0.03F, -0.5128F, 1.4999F));

		PartDefinition bodymiddle_r55 = chest.addOrReplaceChild("bodymiddle_r55", CubeListBuilder.create().texOffs(48, 38).addBox(-0.0483F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.746F, -2.0588F, 0.4333F, -0.2757F, 0.5318F));

		PartDefinition bodymiddle_r56 = chest.addOrReplaceChild("bodymiddle_r56", CubeListBuilder.create().texOffs(68, 44).addBox(1.7693F, -0.819F, -1.0651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.346F, -0.0588F, 0.2642F, -0.3826F, 0.8805F));

		PartDefinition bodymiddle_r57 = chest.addOrReplaceChild("bodymiddle_r57", CubeListBuilder.create().texOffs(55, 49).addBox(3.7208F, -3.0939F, -1.0651F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.346F, -0.0588F, 0.0258F, -0.4606F, 1.4495F));

		PartDefinition bodymiddle_r58 = chest.addOrReplaceChild("bodymiddle_r58", CubeListBuilder.create().texOffs(68, 0).addBox(-0.0483F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.346F, -0.0588F, 0.3867F, -0.2488F, 0.4915F));

		PartDefinition cube_r25 = chest.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(6, 99).addBox(0.0F, -2.1805F, 0.0211F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, -7.0F, -0.0087F, 0.0F, 0.0F));

		PartDefinition bodyfront_r1 = chest.addOrReplaceChild("bodyfront_r1", CubeListBuilder.create().texOffs(43, 82).mirror().addBox(0.0773F, -0.0272F, -0.4298F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3089F, 10.9005F, -3.2712F, 2.0093F, 0.125F, -1.6355F));

		PartDefinition bodyfront_r2 = chest.addOrReplaceChild("bodyfront_r2", CubeListBuilder.create().texOffs(34, 86).mirror().addBox(0.0773F, -0.4272F, -0.4298F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9089F, 10.9005F, -3.2712F, 2.006F, 0.1264F, -1.5981F));

		PartDefinition bodyfront_r3 = chest.addOrReplaceChild("bodyfront_r3", CubeListBuilder.create().texOffs(93, 66).mirror().addBox(0.0773F, -0.4272F, -0.4298F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9089F, 10.9005F, -3.2712F, 2.1599F, 0.2641F, -1.5242F));

		PartDefinition bodyfront_r4 = chest.addOrReplaceChild("bodyfront_r4", CubeListBuilder.create().texOffs(31, 80).mirror().addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4694F, 9.9282F, -4.4732F, 1.2721F, -0.4842F, -1.02F));

		PartDefinition bodyfront_r5 = chest.addOrReplaceChild("bodyfront_r5", CubeListBuilder.create().texOffs(74, 22).mirror().addBox(-0.3F, -1.5F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1544F, 7.7754F, -4.0933F, 1.0716F, -0.352F, -0.5639F));

		PartDefinition bodyfront_r6 = chest.addOrReplaceChild("bodyfront_r6", CubeListBuilder.create().texOffs(46, 53).mirror().addBox(-4.0F, -0.3F, -3.2F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 53).addBox(5.2F, -0.3F, -3.2F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 4.2586F, -2.647F, 0.9687F, 0.0F, 0.0F));

		PartDefinition bodyfront_r7 = chest.addOrReplaceChild("bodyfront_r7", CubeListBuilder.create().texOffs(74, 22).addBox(-0.7F, -1.5F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1544F, 7.7754F, -4.0933F, 1.0716F, 0.352F, 0.5639F));

		PartDefinition bodyfront_r8 = chest.addOrReplaceChild("bodyfront_r8", CubeListBuilder.create().texOffs(31, 80).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4694F, 9.9282F, -4.4732F, 1.2721F, 0.4842F, 1.02F));

		PartDefinition bodyfront_r9 = chest.addOrReplaceChild("bodyfront_r9", CubeListBuilder.create().texOffs(43, 82).addBox(-0.0773F, -0.0272F, -0.4298F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3089F, 10.9005F, -3.2712F, 2.0093F, -0.125F, 1.6355F));

		PartDefinition bodyfront_r10 = chest.addOrReplaceChild("bodyfront_r10", CubeListBuilder.create().texOffs(34, 86).addBox(-0.0773F, -0.4272F, -0.4298F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9089F, 10.9005F, -3.2712F, 2.006F, -0.1264F, 1.5981F));

		PartDefinition bodyfront_r11 = chest.addOrReplaceChild("bodyfront_r11", CubeListBuilder.create().texOffs(93, 66).addBox(-0.0773F, -0.4272F, -0.4298F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9089F, 10.9005F, -3.2712F, 2.1599F, -0.2641F, 1.5242F));

		PartDefinition cube_r26 = chest.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(23, 51).addBox(-1.0F, -0.029F, -0.2955F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.2F, -7.7F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightupperarm = chest.addOrReplaceChild("rightupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.1F, 9.3959F, -3.828F, 0.2456F, 0.1977F, -0.819F));

		PartDefinition rightupperarm_r1 = rightupperarm.addOrReplaceChild("rightupperarm_r1", CubeListBuilder.create().texOffs(54, 21).addBox(14.6768F, -6.4371F, 7.9626F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-15.0443F, 9.2318F, -5.5051F, 0.4538F, 0.0F, 0.0F));

		PartDefinition rightupperarm_r2 = rightupperarm.addOrReplaceChild("rightupperarm_r2", CubeListBuilder.create().texOffs(5, 78).addBox(14.6768F, -9.2086F, 5.8863F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.0443F, 9.2318F, -5.5051F, 0.0873F, 0.0F, 0.0F));

		PartDefinition rightlowerarm = rightupperarm.addOrReplaceChild("rightlowerarm", CubeListBuilder.create().texOffs(29, 86).addBox(-0.996F, -0.6218F, -1.2129F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(48, 81).addBox(-0.996F, -0.6218F, 0.0871F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5299F, 7.2649F, -0.0679F, -1.09F, -0.1199F, 0.2569F));

		PartDefinition righthand = rightlowerarm.addOrReplaceChild("righthand", CubeListBuilder.create().texOffs(55, 68).addBox(-1.3251F, -2.4672F, -7.3144F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0074F, 6.3648F, 5.8015F, 0.0F, 0.0F, 0.1698F));

		PartDefinition rightouterfingers = righthand.addOrReplaceChild("rightouterfingers", CubeListBuilder.create().texOffs(69, 48).addBox(-2.2215F, -2.1681F, -7.8144F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.8F, 0.5F, 0.0F, 0.0F, 0.3821F));

		PartDefinition rightthumb = righthand.addOrReplaceChild("rightthumb", CubeListBuilder.create().texOffs(8, 0).addBox(-1.3375F, 0.9222F, -6.7007F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 1.5F, -0.9F, -0.5308F, 0.0F, 0.2122F));

		PartDefinition rightthumbclaw = rightthumb.addOrReplaceChild("rightthumbclaw", CubeListBuilder.create().texOffs(21, 63).addBox(-1.5722F, 1.3754F, -6.6728F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 2.5F, 0.0F, -0.0213F, 0.0F, 0.6793F));

		PartDefinition leftupperarm = chest.addOrReplaceChild("leftupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.1F, 9.3959F, -3.828F, 0.4767F, 0.3316F, 0.9019F));

		PartDefinition leftupperarm_r1 = leftupperarm.addOrReplaceChild("leftupperarm_r1", CubeListBuilder.create().texOffs(48, 53).addBox(-15.6768F, -6.4371F, 7.9626F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(15.0443F, 9.2318F, -5.5051F, 0.4538F, 0.0F, 0.0F));

		PartDefinition leftupperarm_r2 = leftupperarm.addOrReplaceChild("leftupperarm_r2", CubeListBuilder.create().texOffs(0, 78).addBox(-15.6768F, -9.2086F, 5.8863F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.0443F, 9.2318F, -5.5051F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leftlowerarm = leftupperarm.addOrReplaceChild("leftlowerarm", CubeListBuilder.create().texOffs(85, 67).addBox(-0.004F, -0.6218F, -1.2129F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(15, 36).addBox(-0.004F, -0.6218F, 0.0871F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5299F, 7.2649F, -0.0679F, -1.0933F, 0.0424F, -0.2972F));

		PartDefinition lefthand = leftlowerarm.addOrReplaceChild("lefthand", CubeListBuilder.create().texOffs(68, 28).addBox(0.3251F, -2.4672F, -7.3144F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0074F, 6.3648F, 5.8015F, 0.0F, 0.0F, -0.1698F));

		PartDefinition leftouterfingers = lefthand.addOrReplaceChild("leftouterfingers", CubeListBuilder.create().texOffs(64, 68).addBox(1.2215F, -2.1681F, -7.8144F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.8F, 0.5F, 0.0F, 0.0F, -0.3821F));

		PartDefinition leftthumb = lefthand.addOrReplaceChild("leftthumb", CubeListBuilder.create().texOffs(0, 0).addBox(0.3375F, 0.9222F, -6.7007F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.5F, -0.9F, -0.5241F, 0.088F, -0.0613F));

		PartDefinition leftthumbclaw = leftthumb.addOrReplaceChild("leftthumbclaw", CubeListBuilder.create().texOffs(31, 38).addBox(-0.4278F, 1.3754F, -6.6728F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 2.5F, 0.0F, -0.0197F, 0.0081F, -0.2867F));

		PartDefinition neck5 = chest.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -8.0F, 0.0873F, 0.2182F, 0.0F));

		PartDefinition cube_r27 = neck5.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, -0.9286F, 2.8866F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 43).addBox(-0.5F, -1.1286F, 0.8866F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 63).addBox(-1.0F, -0.1286F, -0.1134F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5F, -3.9F, -0.2269F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r59 = neck5.addOrReplaceChild("bodymiddle_r59", CubeListBuilder.create().texOffs(66, 62).mirror().addBox(-8.7208F, -3.0939F, -1.0651F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.554F, -0.1088F, 0.0364F, 0.6869F, -1.6887F));

		PartDefinition bodymiddle_r60 = neck5.addOrReplaceChild("bodymiddle_r60", CubeListBuilder.create().texOffs(38, 30).mirror().addBox(-4.7693F, -0.819F, -1.0651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.554F, -0.1088F, 0.4161F, 0.5647F, -1.0558F));

		PartDefinition bodymiddle_r61 = neck5.addOrReplaceChild("bodymiddle_r61", CubeListBuilder.create().texOffs(92, 37).mirror().addBox(-1.9517F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.554F, -0.1088F, 0.5898F, 0.3667F, -0.6746F));

		PartDefinition bodymiddle_r62 = neck5.addOrReplaceChild("bodymiddle_r62", CubeListBuilder.create().texOffs(87, 79).mirror().addBox(-4.7693F, -0.819F, -1.0651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.954F, -2.1088F, 0.4504F, 0.6086F, -1.2463F));

		PartDefinition bodymiddle_r63 = neck5.addOrReplaceChild("bodymiddle_r63", CubeListBuilder.create().texOffs(91, 35).mirror().addBox(-1.9517F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.954F, -2.1088F, 0.6359F, 0.3969F, -0.8669F));

		PartDefinition bodymiddle_r64 = neck5.addOrReplaceChild("bodymiddle_r64", CubeListBuilder.create().texOffs(91, 35).addBox(-0.0483F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.954F, -2.1088F, 0.6359F, -0.3969F, 0.8669F));

		PartDefinition bodymiddle_r65 = neck5.addOrReplaceChild("bodymiddle_r65", CubeListBuilder.create().texOffs(87, 79).addBox(1.7693F, -0.819F, -1.0651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.954F, -2.1088F, 0.4504F, -0.6086F, 1.2463F));

		PartDefinition bodymiddle_r66 = neck5.addOrReplaceChild("bodymiddle_r66", CubeListBuilder.create().texOffs(68, 56).addBox(3.7208F, -3.0939F, -1.0651F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.954F, -2.1088F, 0.0318F, -0.7392F, 1.9012F));

		PartDefinition bodymiddle_r67 = neck5.addOrReplaceChild("bodymiddle_r67", CubeListBuilder.create().texOffs(92, 37).addBox(-0.0483F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.554F, -0.1088F, 0.5898F, -0.3667F, 0.6746F));

		PartDefinition bodymiddle_r68 = neck5.addOrReplaceChild("bodymiddle_r68", CubeListBuilder.create().texOffs(66, 62).addBox(3.7208F, -3.0939F, -1.0651F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.554F, -0.1088F, 0.0364F, -0.6869F, 1.6887F));

		PartDefinition bodymiddle_r69 = neck5.addOrReplaceChild("bodymiddle_r69", CubeListBuilder.create().texOffs(38, 30).addBox(1.7693F, -0.819F, -1.0651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.554F, -0.1088F, 0.4161F, -0.5647F, 1.0558F));

		PartDefinition neck4 = neck5.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offset(0.0F, -1.3F, -3.9F));

		PartDefinition cube_r28 = neck4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(9, 99).addBox(-0.5F, -2.3F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 99).addBox(-0.5F, -2.5F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 38).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -2.1F, -3.2F, -0.733F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r70 = neck4.addOrReplaceChild("bodymiddle_r70", CubeListBuilder.create().texOffs(63, 87).mirror().addBox(-4.7693F, -0.819F, -1.0651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.454F, -0.2088F, 0.2889F, 0.6189F, -1.3802F));

		PartDefinition bodymiddle_r71 = neck4.addOrReplaceChild("bodymiddle_r71", CubeListBuilder.create().texOffs(91, 24).mirror().addBox(-1.9517F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.454F, -0.2088F, 0.5067F, 0.4578F, -0.9613F));

		PartDefinition bodymiddle_r72 = neck4.addOrReplaceChild("bodymiddle_r72", CubeListBuilder.create().texOffs(87, 0).mirror().addBox(-2.9517F, -0.0789F, -1.0522F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.454F, -1.6088F, 0.433F, 0.3611F, -1.1742F));

		PartDefinition bodymiddle_r73 = neck4.addOrReplaceChild("bodymiddle_r73", CubeListBuilder.create().texOffs(63, 87).addBox(1.7693F, -0.819F, -1.0651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.454F, -0.2088F, 0.2889F, -0.6189F, 1.3802F));

		PartDefinition bodymiddle_r74 = neck4.addOrReplaceChild("bodymiddle_r74", CubeListBuilder.create().texOffs(87, 0).addBox(-0.0483F, -0.0789F, -1.0522F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.454F, -1.6088F, 0.433F, -0.3611F, 1.1742F));

		PartDefinition bodymiddle_r75 = neck4.addOrReplaceChild("bodymiddle_r75", CubeListBuilder.create().texOffs(91, 24).addBox(-0.0483F, -0.0789F, -1.0522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.454F, -0.2088F, 0.5067F, -0.4578F, 0.9613F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.6F, -2.8F, 0.352F, 0.2155F, 0.0153F));

		PartDefinition cube_r29 = neck3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(98, 23).addBox(-0.5F, -2.1293F, 4.0879F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 83).addBox(-0.5F, -3.1293F, 1.0879F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(20, 18).addBox(-1.0F, 0.3707F, -0.9121F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -4.3F, -2.6F, -0.8727F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r76 = neck3.addOrReplaceChild("bodymiddle_r76", CubeListBuilder.create().texOffs(86, 85).mirror().addBox(-2.9517F, -0.0789F, -1.0522F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.354F, -0.2088F, 0.433F, 0.3611F, -1.1742F));

		PartDefinition bodymiddle_r77 = neck3.addOrReplaceChild("bodymiddle_r77", CubeListBuilder.create().texOffs(86, 64).mirror().addBox(-2.9517F, -0.0789F, -1.0522F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.154F, -1.8088F, 0.4077F, 0.4605F, -1.23F));

		PartDefinition bodymiddle_r78 = neck3.addOrReplaceChild("bodymiddle_r78", CubeListBuilder.create().texOffs(86, 64).addBox(-0.0483F, -0.0789F, -1.0522F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.154F, -1.8088F, 0.4077F, -0.4605F, 1.23F));

		PartDefinition bodymiddle_r79 = neck3.addOrReplaceChild("bodymiddle_r79", CubeListBuilder.create().texOffs(86, 85).addBox(-0.0483F, -0.0789F, -1.0522F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.354F, -0.2088F, 0.433F, -0.3611F, 1.1742F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.2F, -3.7F, -0.0193F, 0.2173F, -0.0894F));

		PartDefinition cube_r30 = neck2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(84, 11).addBox(0.0F, -3.14F, -0.0984F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8106F, -0.8426F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r31 = neck2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(29, 18).addBox(0.0F, -3.0517F, -0.1501F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4106F, -3.5426F, -0.3316F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r80 = neck2.addOrReplaceChild("bodymiddle_r80", CubeListBuilder.create().texOffs(86, 40).mirror().addBox(-2.9517F, -0.0789F, -1.0522F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.046F, -0.1088F, 0.3987F, 0.5893F, -1.2213F));

		PartDefinition bodymiddle_r81 = neck2.addOrReplaceChild("bodymiddle_r81", CubeListBuilder.create().texOffs(86, 27).mirror().addBox(-2.9517F, -0.0789F, -1.0522F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.754F, -2.7088F, 0.4235F, 0.8757F, -1.1174F));

		PartDefinition bodymiddle_r82 = neck2.addOrReplaceChild("bodymiddle_r82", CubeListBuilder.create().texOffs(86, 27).addBox(-0.0483F, -0.0789F, -1.0522F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.754F, -2.7088F, 0.4235F, -0.8757F, 1.1174F));

		PartDefinition bodymiddle_r83 = neck2.addOrReplaceChild("bodymiddle_r83", CubeListBuilder.create().texOffs(86, 40).addBox(-0.0483F, -0.0789F, -1.0522F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.046F, -0.1088F, 0.3987F, -0.5893F, 1.2213F));

		PartDefinition cube_r32 = neck2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(26, 63).addBox(-1.0F, -0.1F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -1.4F, -3.7F, -0.2443F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3F, -4.7F, -0.0479F, 0.2129F, -0.2233F));

		PartDefinition cube_r33 = neck.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(14, 51).addBox(0.0F, -3.7936F, 1.6132F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(98, 38).addBox(0.0F, -2.4936F, -0.3868F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0585F, -3.6146F, -0.3403F, 0.0F, 0.0F));

		PartDefinition bodymiddle_r84 = neck.addOrReplaceChild("bodymiddle_r84", CubeListBuilder.create().texOffs(86, 20).mirror().addBox(-2.9517F, -0.0789F, -1.0522F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.046F, -1.0088F, 0.3574F, 1.0507F, -1.1561F));

		PartDefinition bodymiddle_r85 = neck.addOrReplaceChild("bodymiddle_r85", CubeListBuilder.create().texOffs(86, 18).mirror().addBox(-2.9517F, -0.0789F, -1.0522F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.146F, -3.0088F, 0.3854F, 1.1136F, -1.104F));

		PartDefinition bodymiddle_r86 = neck.addOrReplaceChild("bodymiddle_r86", CubeListBuilder.create().texOffs(86, 18).addBox(-0.0483F, -0.0789F, -1.0522F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.146F, -3.0088F, 0.3854F, -1.1136F, 1.104F));

		PartDefinition bodymiddle_r87 = neck.addOrReplaceChild("bodymiddle_r87", CubeListBuilder.create().texOffs(86, 20).addBox(-0.0483F, -0.0789F, -1.0522F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.046F, -1.0088F, 0.3574F, -1.0507F, 1.1561F));

		PartDefinition cube_r34 = neck.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(69, 56).addBox(-0.5F, -0.4168F, -0.0513F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -3.9F, 0.1134F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 27).addBox(-2.0F, -0.7F, -3.1F, 4.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F))
				.texOffs(88, 29).addBox(0.7F, -0.7119F, -2.2654F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(88, 29).mirror().addBox(-1.7F, -0.7119F, -2.2654F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4F, -3.9F, -0.1252F, -0.1786F, 0.1972F));

		PartDefinition cube_r35 = head.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(54, 35).mirror().addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 5.7504F, -6.3539F, 0.75F, -0.0298F, 0.0319F));

		PartDefinition cube_r36 = head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(56, 53).mirror().addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 7.1826F, -7.8898F, 0.75F, -0.0298F, 0.0319F));

		PartDefinition cube_r37 = head.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(38, 21).mirror().addBox(-0.2F, -1.8F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(38, 21).addBox(1.6F, -1.8F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 8.7741F, -8.9604F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r38 = head.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(55, 42).mirror().addBox(0.1F, -0.411F, 1.0827F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(89, 12).mirror().addBox(0.0F, -1.011F, 0.3827F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(55, 42).addBox(1.5F, -0.411F, 1.0827F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 12).addBox(0.6F, -1.011F, 0.3827F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.8F, 8.9F, -11.9F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r39 = head.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 27).mirror().addBox(0.0F, -0.5F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(20, 26).mirror().addBox(0.1F, 1.1F, -2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(20, 26).addBox(1.3F, 1.1F, -2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 27).addBox(1.4F, -0.5F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 9.0634F, -11.774F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r40 = head.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(45, 21).mirror().addBox(-0.1F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 10.4177F, -12.2453F, 0.5916F, -0.0488F, 0.0724F));

		PartDefinition cube_r41 = head.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(16, 89).mirror().addBox(0.0F, -0.022F, -2.031F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(16, 89).addBox(0.6F, -0.022F, -2.031F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 9.5F, -13.7F, 1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r42 = head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(98, 28).mirror().addBox(0.0F, 0.0928F, -0.9674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(98, 28).addBox(0.6F, 0.0928F, -0.9674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.8F, 8.7F, -13.2F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r43 = head.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(8, 63).mirror().addBox(0.0F, 0.0277F, -3.0908F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(8, 63).addBox(0.6F, 0.0277F, -3.0908F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 6.7F, -10.8F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r44 = head.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(64, 18).mirror().addBox(-1.62F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(64, 18).addBox(0.82F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1F, 4.9221F, -7.8458F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r45 = head.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(42, 67).mirror().addBox(-3.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(42, 67).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.0F, 2.1F, 0.3F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r46 = head.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(68, 2).mirror().addBox(-3.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(68, 2).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -0.7F, -0.1F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r47 = head.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(6, 36).mirror().addBox(-1.42F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(6, 36).addBox(0.62F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 2.1182F, -5.1039F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r48 = head.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(46, 95).mirror().addBox(-2.0F, -0.0505F, -0.4432F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(46, 95).addBox(1.2F, -0.0505F, -0.4432F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1F, 1.5896F, -0.4267F, -1.213F, 0.0F, 0.0F));

		PartDefinition cube_r49 = head.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(-2.0F, -1.4F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(0, 36).addBox(1.2F, -1.4F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1F, 1.0296F, -1.2862F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r50 = head.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(95, 61).mirror().addBox(-2.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(95, 61).addBox(1.2F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.6896F, -1.1267F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r51 = head.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(61, 68).mirror().addBox(-2.33F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(97, 53).mirror().addBox(-2.0F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(39, 72).mirror().addBox(-2.22F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(61, 68).addBox(1.53F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(39, 72).addBox(1.42F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(97, 53).addBox(1.2F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.6297F, -3.0183F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r52 = head.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(63, 95).mirror().addBox(-2.0F, -0.8F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(63, 95).addBox(1.2F, -0.8F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1F, 0.9126F, -3.5082F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r53 = head.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(45, 21).addBox(0.1F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 10.4177F, -12.2453F, 0.5916F, 0.0488F, -0.0724F));

		PartDefinition cube_r54 = head.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(54, 21).addBox(-1.0F, -1.9886F, 0.0399F, 3.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 6.3F, -7.4F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r55 = head.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(56, 53).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 7.1826F, -7.8898F, 0.75F, 0.0298F, -0.0319F));

		PartDefinition cube_r56 = head.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(54, 35).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 5.7504F, -6.3539F, 0.75F, 0.0298F, -0.0319F));

		PartDefinition cube_r57 = head.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(14, 51).addBox(-1.0F, -0.009F, -4.9428F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5F, -7.3F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r58 = head.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(94, 10).addBox(-0.5F, -0.0279F, 0.09F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8F, -6.1F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r59 = head.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(82, 57).addBox(-0.5F, -0.0706F, 0.136F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.6F, -7.3F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r60 = head.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(37, 53).addBox(-1.0F, 0.0699F, -3.9421F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.3F, -4.9F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r61 = head.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(64, 8).addBox(-1.0F, -3.0001F, -0.8368F, 4.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(20, 26).addBox(-1.0F, -3.0001F, 0.5632F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 3.5F, -3.1F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r62 = head.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(34, 8).addBox(-1.0F, 0.0F, -2.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.7F, -3.1F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r63 = head.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(88, 42).addBox(-0.5F, 0.1F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -2.4F, 0.733F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.3F, 1.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r64 = jaw.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-0.7296F, 0.0479F, 2.7484F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.4973F, -1.8914F, 0.6818F, -0.0854F, 0.0634F));

		PartDefinition cube_r65 = jaw.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(81, 48).mirror().addBox(0.0F, -0.9881F, 0.0313F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.4973F, -1.8914F, 0.3646F, -0.2865F, -0.1074F));

		PartDefinition cube_r66 = jaw.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(0, 63).addBox(0.7296F, 0.0479F, 2.7484F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4973F, -1.8914F, 0.6818F, 0.0854F, -0.0634F));

		PartDefinition cube_r67 = jaw.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(81, 48).addBox(0.0F, -0.9881F, 0.0313F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4973F, -1.8914F, 0.3646F, 0.2865F, 0.1074F));

		PartDefinition leftAngularSurangular = jaw.addOrReplaceChild("leftAngularSurangular", CubeListBuilder.create(), PartPose.offset(1.0F, 0.3F, -0.5F));

		PartDefinition cube_r68 = leftAngularSurangular.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 43).addBox(0.0F, -0.5F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftAngularSurangular.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(81, 27).addBox(0.0F, -1.8F, -4.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(70, 64).addBox(0.0F, 0.2F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftAngularSurangular.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(6, 88).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2021F, -0.2121F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftAngularSurangular.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(94, 81).addBox(-0.57F, -0.3F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6F, 1.584F, -1.9901F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftAngularSurangular.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(81, 41).addBox(0.0F, -0.0147F, -2.0934F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5F, -3.3F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftAngularSurangular.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(84, 33).addBox(0.0F, -0.0565F, -1.8393F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2F, -1.7F, 0.4363F, 0.0F, 0.0F));

		PartDefinition leftDentary = leftAngularSurangular.addOrReplaceChild("leftDentary", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 2.7F, -3.9F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftDentary.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(34, 65).addBox(-0.7F, 5.4755F, -5.4235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.1F, 0.1F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r75 = leftDentary.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(93, 40).addBox(0.2F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, -2.7111F, -8.536F, -0.1349F, 0.036F, 0.2594F));

		PartDefinition cube_r76 = leftDentary.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(86, 5).addBox(-0.7F, -0.1935F, -9.7762F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.1F, 0.1F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r77 = leftDentary.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(89, 58).addBox(-0.7F, -0.1014F, -8.9928F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.0F, -1.1F, 0.1F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r78 = leftDentary.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(66, 18).addBox(0.0F, 0.9292F, -2.6716F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, -1.1F, 0.1F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r79 = leftDentary.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 63).addBox(-0.5F, 0.9317F, -7.8511F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, -1.1F, 0.1F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r80 = leftDentary.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(0, 36).addBox(0.2F, -0.6016F, -7.0796F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.1F, 0.1F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r81 = leftDentary.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(35, 66).addBox(-0.5F, -0.7193F, -7.0387F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.1F, 0.1F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r82 = leftDentary.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(80, 19).addBox(0.0F, -0.2347F, -3.1128F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, -1.1F, 0.1F, -0.1047F, 0.0F, 0.0F));

		PartDefinition rightAngularSurangular = jaw.addOrReplaceChild("rightAngularSurangular", CubeListBuilder.create(), PartPose.offset(-1.0F, 0.3F, -0.5F));

		PartDefinition cube_r83 = rightAngularSurangular.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-1.0F, -0.5F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightAngularSurangular.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(81, 27).mirror().addBox(-1.0F, -1.8F, -4.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(70, 64).mirror().addBox(-1.0F, 0.2F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightAngularSurangular.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(6, 88).mirror().addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2021F, -0.2121F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightAngularSurangular.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(94, 81).mirror().addBox(-0.43F, -0.3F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.584F, -1.9901F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r87 = rightAngularSurangular.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(81, 41).mirror().addBox(-1.0F, -0.0147F, -2.0934F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.5F, -3.3F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r88 = rightAngularSurangular.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(84, 33).mirror().addBox(-1.0F, -0.0565F, -1.8393F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2F, -1.7F, 0.4363F, 0.0F, 0.0F));

		PartDefinition rightDentary = rightAngularSurangular.addOrReplaceChild("rightDentary", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 2.7F, -3.9F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightDentary.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(34, 65).mirror().addBox(-0.3F, 5.4755F, -5.4235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.1F, 0.1F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r90 = rightDentary.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(93, 40).mirror().addBox(-0.2F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9F, -2.7111F, -8.536F, -0.1349F, -0.036F, -0.2594F));

		PartDefinition cube_r91 = rightDentary.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(86, 5).mirror().addBox(-0.3F, -0.1935F, -9.7762F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.1F, 0.1F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r92 = rightDentary.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(89, 58).mirror().addBox(-0.3F, -0.1014F, -8.9928F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.1F, 0.1F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r93 = rightDentary.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(66, 18).mirror().addBox(-1.0F, 0.9292F, -2.6716F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.1F, 0.1F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightDentary.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-0.5F, 0.9317F, -7.8511F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.1F, 0.1F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightDentary.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(-0.2F, -0.6016F, -7.0796F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.1F, 0.1F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightDentary.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(35, 66).mirror().addBox(-0.5F, -0.7193F, -7.0387F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.1F, 0.1F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightDentary.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(80, 19).mirror().addBox(-1.0F, -0.2347F, -3.1128F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.1F, 0.1F, -0.1047F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(38, 21).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.3F, 10.0F, -0.0467F, 0.2608F, -0.0233F));

		PartDefinition cube_r98 = tail.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(6, 92).addBox(0.0F, -4.8631F, 0.011F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0161F, 10.1211F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r99 = tail.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(6, 92).addBox(0.0F, -4.6826F, -0.3597F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9763F, 8.5185F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r100 = tail.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(54, 90).addBox(0.0F, -4.4424F, 0.0253F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1569F, 5.9932F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r101 = tail.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(57, 90).addBox(0.0F, 4.0848F, 8.9407F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 66).addBox(0.0F, 2.8848F, 6.9407F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 90).addBox(0.0F, 1.7848F, 4.9407F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 90).addBox(0.0F, 0.6848F, 2.9407F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 45).addBox(0.0F, 0.1F, 1.2F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.895F, -0.7173F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r102 = tail.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(95, 17).addBox(0.0F, -3.3139F, -0.1279F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6514F, 0.2152F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r103 = tail.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(22, 95).addBox(0.0F, -3.3139F, -0.1279F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8257F, 2.2076F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r104 = tail.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(78, 92).addBox(0.0F, -4.3139F, -0.1279F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 4.2F, -0.7156F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(35, 6).addBox(-1.0F, -0.9476F, -0.0007F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 11.0F, 0.0266F, 0.1745F, 0.0046F));

		PartDefinition cube_r105 = tail2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(26, 87).addBox(0.0F, -5.7668F, 0.853F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0528F, 9.9053F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r106 = tail2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(46, 87).addBox(0.0F, -5.7511F, 0.8607F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9307F, 7.909F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r107 = tail2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(37, 88).addBox(0.0F, -5.3901F, 1.0329F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2078F, 5.8883F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r108 = tail2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(75, 89).addBox(0.0F, -5.2706F, 0.9468F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0857F, 3.892F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r109 = tail2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(38, 96).addBox(0.0F, 11.9848F, 18.9407F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 65).addBox(0.0F, 10.5848F, 16.9407F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 95).addBox(0.0F, 9.1848F, 14.9407F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 89).addBox(0.0F, 7.7848F, 12.9407F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 95).addBox(0.0F, 6.4848F, 10.9407F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.895F, -11.7173F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r110 = tail2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(16, 93).addBox(0.0F, -5.2695F, 0.8351F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9697F, 1.9956F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r111 = tail2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(90, 91).addBox(0.0F, -5.3297F, 0.7997F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8476F, -0.0007F, -0.5061F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, -0.865F, 0.0084F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1F, 12.0F, 0.0575F, 0.1314F, -0.0109F));

		PartDefinition cube_r112 = tail3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(43, 91).addBox(0.0F, -8.4863F, 9.9545F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 51).addBox(0.0F, -8.0936F, 8.4095F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 91).addBox(0.0F, -7.7766F, 6.5914F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 87).addBox(0.0F, -7.301F, 4.8644F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 88).addBox(0.0F, -6.701F, 2.8644F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 88).addBox(0.0F, -6.101F, 0.8644F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7768F, -0.0333F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r113 = tail3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(57, 97).addBox(0.0F, 18.9848F, 28.9407F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 96).addBox(0.0F, 16.9848F, 26.9407F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 0).addBox(0.0F, 15.8848F, 24.9407F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 96).addBox(0.0F, 14.8848F, 22.9407F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 96).addBox(0.0F, 13.3848F, 20.9407F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.995F, -23.7173F, 0.6021F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(27, 38).addBox(-0.5F, -0.7F, 0.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 12.0F, 0.2262F, -0.4789F, -0.039F));

		PartDefinition cube_r114 = tail4.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(60, 94).addBox(0.0F, -6.9017F, 7.4934F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 51).addBox(0.0F, -6.2012F, 5.62F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 93).addBox(0.0F, -5.5008F, 3.7467F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 93).addBox(0.0F, -4.8004F, 1.8733F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 93).addBox(0.0F, -4.1F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 1.0F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r115 = tail4.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(97, 6).addBox(0.0F, 24.6848F, 38.9407F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 31).addBox(0.0F, 23.6848F, 36.9407F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 96).addBox(0.0F, 22.3848F, 34.9407F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 43).addBox(0.0F, 21.1848F, 32.9407F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 48).addBox(0.0F, 19.9848F, 30.9407F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.095F, -35.7173F, 0.6021F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(42, 41).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.2F, 11.0F, 0.1264F, -0.5657F, -0.0444F));

		PartDefinition cube_r116 = tail5.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(44, 98).addBox(0.0F, -6.5588F, 7.1916F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 84).addBox(0.0F, -5.6693F, 5.2788F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 97).addBox(0.0F, -4.8466F, 3.5545F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 95).addBox(0.0F, -4.4676F, 1.8853F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 51).addBox(0.0F, -3.8F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r117 = tail5.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(54, 97).addBox(0.0F, 29.5848F, 46.9407F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 97).addBox(0.0F, 28.5848F, 44.9407F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 89).addBox(0.0F, 27.2848F, 42.9407F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 94).addBox(0.0F, 26.0848F, 40.9407F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.295F, -46.7173F, 0.6021F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(20, 21).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, -0.1633F, -0.51F, 0.1243F));

		PartDefinition cube_r118 = tail6.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(32, 26).addBox(0.0F, -3.1311F, 5.426F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 98).addBox(0.0F, -3.0523F, 3.6486F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 98).addBox(0.0F, -2.6886F, 1.9242F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 63).addBox(0.0F, -2.6172F, 0.0726F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6046F, 5.9904F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r119 = tail6.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(96, 56).addBox(0.0F, -4.4442F, 3.7268F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 96).addBox(0.0F, -3.6307F, 1.8997F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 97).addBox(0.0F, -2.9999F, -0.0087F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4999F, -0.0087F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r120 = tail6.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(12, 27).addBox(0.0F, 34.2848F, 52.9407F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 71).addBox(0.0F, 32.2848F, 50.9407F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 64).addBox(0.0F, 31.3848F, 48.9407F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.295F, -56.7173F, 0.6021F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 112, 112);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}