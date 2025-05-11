package fossils.fossils.client.blockentity.model.achelousaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AchelousaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftleg;
	private final ModelPart leftleg2;
	private final ModelPart leftleg3;
	private final ModelPart leftfoot;
	private final ModelPart leftfoot2;
	private final ModelPart rightleg;
	private final ModelPart rightleg2;
	private final ModelPart rightleg3;
	private final ModelPart rightfoot;
	private final ModelPart rightfoot2;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart lefthand;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart righthand;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftCheek;
	private final ModelPart rightCheek;
	private final ModelPart leftBeak;
	private final ModelPart rightBeak;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart leftLowerbeak;
	private final ModelPart rightLowerbeak;
	private final ModelPart frill;
	private final ModelPart leftFrill;
	private final ModelPart rightFrill;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public AchelousaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftleg = this.hips.getChild("leftleg");
		this.leftleg2 = this.leftleg.getChild("leftleg2");
		this.leftleg3 = this.leftleg2.getChild("leftleg3");
		this.leftfoot = this.leftleg3.getChild("leftfoot");
		this.leftfoot2 = this.leftfoot.getChild("leftfoot2");
		this.rightleg = this.hips.getChild("rightleg");
		this.rightleg2 = this.rightleg.getChild("rightleg2");
		this.rightleg3 = this.rightleg2.getChild("rightleg3");
		this.rightfoot = this.rightleg3.getChild("rightfoot");
		this.rightfoot2 = this.rightfoot.getChild("rightfoot2");
		this.bone = this.hips.getChild("bone");
		this.bone2 = this.hips.getChild("bone2");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.lefthand = this.leftarm2.getChild("lefthand");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.righthand = this.rightarm2.getChild("righthand");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftCheek = this.head.getChild("leftCheek");
		this.rightCheek = this.head.getChild("rightCheek");
		this.leftBeak = this.head.getChild("leftBeak");
		this.rightBeak = this.head.getChild("rightBeak");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.leftLowerbeak = this.jaw.getChild("leftLowerbeak");
		this.rightLowerbeak = this.jaw.getChild("rightLowerbeak");
		this.frill = this.head.getChild("frill");
		this.leftFrill = this.frill.getChild("leftFrill");
		this.rightFrill = this.frill.getChild("rightFrill");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, -1.2889F, -5.6091F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -14.7892F, 4.441F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(31, 0).mirror().addBox(-0.6F, -3.0F, -5.0F, 0.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4323F, 1.2351F, 0.0087F, -0.0349F, -1.5708F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(31, 0).addBox(0.6F, -3.0F, -5.0F, 0.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4323F, 1.2351F, 0.0087F, 0.0349F, 1.5708F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(29, 29).addBox(0.0F, -2.6F, -5.0F, 0.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8425F, 0.7149F, -0.1149F, 0.0192F, 0.003F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(24, 80).addBox(-1.5F, 11.7833F, -5.8553F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.9F, -1.3442F, 1.2219F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r4 = leftleg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(95, 87).addBox(0.5F, -0.5872F, 0.6264F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.0F, 10.1705F, -5.7817F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r5 = leftleg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(113, 91).addBox(0.5F, -2.0872F, -0.9736F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.0F, 11.8705F, -1.8817F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r6 = leftleg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(84, 9).addBox(-1.5F, -1.3F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r7 = leftleg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(75, 9).addBox(-0.5F, -0.1075F, -1.9404F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 2.2114F, 0.1013F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r8 = leftleg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(67, 86).addBox(-0.5F, -5.9225F, -1.5513F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 7.5114F, -2.2987F, -0.3927F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.776F, -4.3925F, 1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r9 = leftleg2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 116).addBox(-0.1F, -1.4382F, -0.6279F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F))
				.texOffs(88, 97).addBox(-0.1F, -0.4383F, -0.1279F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 0.3503F, 1.0988F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r10 = leftleg2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(84, 16).addBox(-1.5F, -2.1773F, 0.1893F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 1.7007F, -0.2687F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r11 = leftleg2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(95, 93).addBox(-1.0F, -0.3F, -1.8F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 8.9595F, 5.4154F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r12 = leftleg2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(106, 87).addBox(-1.0F, -0.5F, -1.3F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.013F))
				.texOffs(106, 87).addBox(-1.0F, -3.5F, -1.3F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(81, 92).addBox(-1.0F, -3.5F, -0.5F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.6F, 3.6774F, 3.4611F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r13 = leftleg2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(69, 34).addBox(-1.0F, -1.0F, -0.3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-0.6F, 7.9691F, 3.8221F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r14 = leftleg2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(138, 139).addBox(-1.0F, -0.6F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-0.6F, 5.8322F, 4.8238F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r15 = leftleg2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(23, 31).addBox(-0.601F, -0.0989F, -0.0792F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.499F, 1.3879F, 0.5086F, 0.4712F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.7174F, 4.4837F, 0.2773F, -0.0627F, 0.0607F));

		PartDefinition cube_r16 = leftleg3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(99, 29).addBox(-1.102F, -2.4938F, -0.3569F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(14, 114).addBox(-1.102F, -0.4938F, 0.1431F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.499F, 2.0848F, -1.2602F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.5042F, -1.1405F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r17 = leftfoot.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(116, 66).addBox(-1.0F, -2.1328F, 1.6483F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.499F, 3.2195F, -0.2088F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leftfoot2 = leftfoot.addOrReplaceChild("leftfoot2", CubeListBuilder.create().texOffs(32, 55).addBox(-1.999F, -0.5853F, -4.8254F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9888F, -0.2891F, 1.2043F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(39, 80).mirror().addBox(-1.5F, 11.7833F, -5.8553F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.9F, -1.3442F, 1.2219F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r18 = rightleg.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 97).mirror().addBox(-3.5F, -0.5872F, 0.6264F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(2.0F, 10.1705F, -5.7817F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r19 = rightleg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(38, 114).mirror().addBox(-3.5F, -2.0872F, -0.9736F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.0F, 11.8705F, -1.8817F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r20 = rightleg.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(84, 23).mirror().addBox(-1.5F, -1.3F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r21 = rightleg.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(15, 75).mirror().addBox(-1.5F, -0.1075F, -1.9404F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.2114F, 0.1013F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r22 = rightleg.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(88, 85).mirror().addBox(-1.5F, -5.9225F, -1.5513F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.5F, 7.5114F, -2.2987F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.776F, -4.3925F, 1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r23 = rightleg2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(117, 14).mirror().addBox(-0.9F, -1.4382F, -0.6279F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(98, 99).mirror().addBox(-0.9F, -0.4383F, -0.1279F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.3503F, 1.0988F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r24 = rightleg2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(85, 51).mirror().addBox(-0.5F, -2.1773F, 0.1893F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 1.7007F, -0.2687F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r25 = rightleg2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(97, 7).mirror().addBox(-1.0F, -0.3F, -1.8F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, 8.9595F, 5.4154F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r26 = rightleg2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 108).mirror().addBox(-1.0F, -0.5F, -1.3F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false)
				.texOffs(0, 108).mirror().addBox(-1.0F, -3.5F, -1.3F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(37, 93).mirror().addBox(-1.0F, -3.5F, -0.5F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.6F, 3.6774F, 3.4611F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r27 = rightleg2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(69, 34).mirror().addBox(-1.0F, -1.0F, -0.3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(0.6F, 7.9691F, 3.8221F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r28 = rightleg2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(7, 114).mirror().addBox(-1.0F, -0.6F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(0.6F, 5.8322F, 4.8238F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r29 = rightleg2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(93, 99).mirror().addBox(-0.399F, -0.0989F, -0.0792F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.499F, 1.3879F, 0.5086F, 0.4712F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.7174F, 4.4837F, 0.2337F, 0.0627F, -0.0607F));

		PartDefinition cube_r30 = rightleg3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(99, 34).mirror().addBox(-1.898F, -2.4938F, -0.3569F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(54, 114).mirror().addBox(-1.898F, -0.4938F, 0.1431F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.499F, 2.0848F, -1.2602F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.5042F, -1.1405F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r31 = rightfoot.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(117, 19).mirror().addBox(-2.0F, -2.1328F, 1.6483F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.499F, 3.2195F, -0.2088F, 0.9599F, 0.0F, 0.0F));

		PartDefinition rightfoot2 = rightfoot.addOrReplaceChild("rightfoot2", CubeListBuilder.create().texOffs(51, 55).mirror().addBox(-2.001F, -0.5853F, -4.8254F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9888F, -0.2891F, 1.2043F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(65, 132).addBox(3.0F, 0.9457F, 3.5168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 132).mirror().addBox(-4.0F, 0.9457F, 3.5168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.1324F, 5.2071F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(22, 101).mirror().addBox(-1.5F, -0.1272F, 0.045F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(22, 101).addBox(6.5F, -0.1272F, 0.045F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.5F, -0.9439F, -0.7753F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(98, 51).mirror().addBox(-0.5564F, -0.0757F, -3.7529F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0923F, -0.9154F, -6.914F, 0.3482F, 0.2452F, 0.0615F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(49, 62).mirror().addBox(0.4713F, -0.0614F, -6.2977F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0923F, -0.9154F, -6.914F, 0.3542F, 0.2909F, 0.0945F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(16, 108).mirror().addBox(-0.2177F, 7.1288F, 5.3606F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 3.7248F, -2.4781F, 0.1429F, 0.1955F, -0.1629F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(112, 69).mirror().addBox(-0.2177F, -3.1363F, 6.0067F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 3.7248F, -2.4781F, -1.0352F, 0.1955F, -0.1629F));

		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(-0.0767F, -0.934F, 1.637F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 3.7248F, -2.4781F, -0.683F, 0.2012F, -0.1172F));

		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(92, 110).mirror().addBox(-0.0961F, -0.2249F, -0.9552F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 3.7248F, -2.4781F, -0.3577F, 0.2002F, -0.0827F));

		PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(97, 19).mirror().addBox(-0.0961F, -1.6321F, -1.2497F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 3.7248F, -2.4781F, -0.9162F, 0.2002F, -0.0827F));

		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(70, 132).mirror().addBox(-1.5F, -0.2068F, 2.9826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(86, 119).mirror().addBox(-0.5F, -0.2068F, 2.9826F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(70, 132).addBox(7.5F, -0.2068F, 2.9826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 119).addBox(6.5F, -0.2068F, 2.9826F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -0.9439F, -0.7753F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r41 = bone.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(79, 119).mirror().addBox(-3.888F, -0.3532F, 1.7766F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -0.9439F, -0.7753F, -0.5468F, 0.6219F, -0.3408F));

		PartDefinition cube_r42 = bone.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(60, 71).mirror().addBox(-0.5F, 1.5723F, -1.4194F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(60, 71).addBox(6.5F, 1.5723F, -1.4194F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.5F, -0.9439F, -0.7753F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r43 = bone.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(97, 13).mirror().addBox(-2.3435F, -0.0927F, -0.3694F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -0.9439F, -0.7753F, -0.3787F, 0.1289F, -0.0537F));

		PartDefinition cube_r44 = bone.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(77, 34).mirror().addBox(-0.1121F, 0.8704F, 1.8422F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 15).mirror().addBox(-2.1121F, -0.1296F, -0.1578F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4923F, -0.9154F, -6.614F, -0.0014F, -0.0492F, -0.0211F));

		PartDefinition cube_r45 = bone.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(110, 30).mirror().addBox(-0.5F, -0.379F, -1.9851F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(110, 30).addBox(6.5F, -0.379F, -1.9851F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.5F, -0.1581F, -5.9218F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r46 = bone.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(11, 97).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9895F, 4.2391F, -4.4683F, 0.1766F, 0.2173F, 0.0193F));

		PartDefinition cube_r47 = bone.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(75, 71).mirror().addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1963F, 1.9781F, -4.9741F, -0.0221F, 0.0404F, -0.1367F));

		PartDefinition cube_r48 = bone.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(110, 25).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.7662F, 7.215F, -9.3664F, 0.7685F, 0.0462F, 0.0246F));

		PartDefinition cube_r49 = bone.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(124, 14).mirror().addBox(-0.5F, -0.3F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7733F, 6.657F, -9.8155F, 1.9466F, 0.0462F, 0.0246F));

		PartDefinition cube_r50 = bone.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(28, 117).mirror().addBox(-0.6104F, -0.0277F, -7.1966F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(75, 85).mirror().addBox(-0.6104F, 0.4723F, -4.8966F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 3.4642F, -5.8347F, 0.5503F, 0.0462F, 0.0246F));

		PartDefinition cube_r51 = bone.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(109, 51).mirror().addBox(-0.6104F, -0.7892F, -2.8562F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 3.4642F, -5.8347F, 0.9867F, 0.0462F, 0.0246F));

		PartDefinition cube_r52 = bone.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(32, 62).mirror().addBox(-1.4898F, -0.082F, -6.3045F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0923F, -0.9154F, -6.914F, 0.3381F, 0.0643F, -0.0038F));

		PartDefinition cube_r53 = bone.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(98, 51).addBox(-0.4436F, -0.0757F, -3.7529F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0923F, -0.9154F, -6.914F, 0.3482F, -0.2452F, -0.0615F));

		PartDefinition cube_r54 = bone.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(49, 62).addBox(-1.4713F, -0.0614F, -6.2977F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0923F, -0.9154F, -6.914F, 0.3542F, -0.2909F, -0.0945F));

		PartDefinition cube_r55 = bone.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(16, 108).addBox(-0.7823F, 7.1288F, 5.3606F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, 3.7248F, -2.4781F, 0.1429F, -0.1955F, 0.1629F));

		PartDefinition cube_r56 = bone.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(112, 69).addBox(-0.7823F, -3.1363F, 6.0067F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.3F, 3.7248F, -2.4781F, -1.0352F, -0.1955F, 0.1629F));

		PartDefinition cube_r57 = bone.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(86, 0).addBox(-0.9233F, -0.934F, 1.637F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, 3.7248F, -2.4781F, -0.683F, -0.2012F, 0.1172F));

		PartDefinition cube_r58 = bone.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(92, 110).addBox(-0.9039F, -0.2249F, -0.9552F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, 3.7248F, -2.4781F, -0.3577F, -0.2002F, 0.0827F));

		PartDefinition cube_r59 = bone.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(97, 19).addBox(-0.9039F, -1.6321F, -1.2497F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.3F, 3.7248F, -2.4781F, -0.9162F, -0.2002F, 0.0827F));

		PartDefinition cube_r60 = bone.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(79, 119).addBox(2.888F, -0.3532F, 1.7766F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -0.9439F, -0.7753F, -0.5468F, -0.6219F, 0.3408F));

		PartDefinition cube_r61 = bone.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(97, 13).addBox(1.3435F, -0.0927F, -0.3694F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.5F, -0.9439F, -0.7753F, -0.3787F, -0.1289F, 0.0537F));

		PartDefinition cube_r62 = bone.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(77, 34).addBox(-0.8879F, 0.8704F, 1.8422F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(54, 15).addBox(-0.8879F, -0.1296F, -0.1578F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4923F, -0.9154F, -6.614F, -0.0014F, 0.0492F, 0.0211F));

		PartDefinition cube_r63 = bone.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(11, 97).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9895F, 4.2391F, -4.4683F, 0.1766F, -0.2173F, -0.0193F));

		PartDefinition cube_r64 = bone.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(75, 71).addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1963F, 1.9781F, -4.9741F, -0.0221F, -0.0404F, 0.1367F));

		PartDefinition cube_r65 = bone.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(110, 25).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.7662F, 7.215F, -9.3664F, 0.7685F, -0.0462F, -0.0246F));

		PartDefinition cube_r66 = bone.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(124, 14).addBox(-0.5F, -0.3F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7733F, 6.657F, -9.8155F, 1.9466F, -0.0462F, -0.0246F));

		PartDefinition cube_r67 = bone.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(28, 117).addBox(-0.3896F, -0.0277F, -7.1966F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(75, 85).addBox(-0.3896F, 0.4723F, -4.8966F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.4F, 3.4642F, -5.8347F, 0.5503F, -0.0462F, -0.0246F));

		PartDefinition cube_r68 = bone.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(109, 51).addBox(-0.3896F, -0.7892F, -2.8562F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, 3.4642F, -5.8347F, 0.9867F, -0.0462F, -0.0246F));

		PartDefinition cube_r69 = bone.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(32, 62).addBox(0.4898F, -0.082F, -6.3045F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0923F, -0.9154F, -6.914F, 0.3381F, -0.0643F, 0.0038F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.1324F, 5.2071F, -0.1309F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5213F, -5.4155F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(50, 87).addBox(0.0F, -4.0976F, -0.0647F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7877F, -0.9747F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(27, 126).addBox(0.0F, -4.9616F, -2.8978F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 125).addBox(0.0F, -4.8616F, -4.6978F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4123F, -0.3747F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(3, 125).addBox(0.0F, -4.8908F, -0.3637F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9877F, -6.5747F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 125).addBox(0.0F, -4.9749F, -0.1539F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2123F, -12.8747F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(93, 119).addBox(0.0F, -4.9105F, -0.135F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3877F, -10.8747F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(124, 124).addBox(0.0F, -4.8762F, -0.8887F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5877F, -8.0747F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(35, 130).mirror().addBox(-2.8704F, -0.5454F, -0.334F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.6877F, -8.9747F, 0.0637F, -0.0065F, -0.3139F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(13, 130).mirror().addBox(-4.1722F, -1.9589F, -0.4082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.6877F, -8.9747F, 0.0165F, 0.0243F, -0.8576F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(50, 39).mirror().addBox(-14.5532F, -3.7826F, -0.7844F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.6877F, -8.9747F, 0.0022F, 0.1864F, -1.3811F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(75, 81).mirror().addBox(-14.4485F, -3.766F, -1.5118F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0877F, -10.7747F, 0.0211F, 0.2981F, -1.3763F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(86, 7).mirror().addBox(-6.5641F, -3.7871F, -0.784F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0877F, -10.7747F, 0.0206F, 0.1934F, -1.3786F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(6, 130).mirror().addBox(-4.1516F, -1.9761F, -0.5635F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0877F, -10.7747F, 0.0796F, 0.0968F, -0.8538F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(129, 118).mirror().addBox(-2.8645F, -0.5765F, -0.4884F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0877F, -10.7747F, 0.155F, 0.0231F, -0.3132F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(31, 13).mirror().addBox(-14.8265F, -3.7453F, -0.5175F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1877F, -12.9747F, 0.0477F, 0.2606F, -1.3748F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(129, 116).mirror().addBox(-4.3205F, -1.8302F, -0.5175F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1877F, -12.9747F, 0.1731F, 0.2015F, -0.8399F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(115, 129).mirror().addBox(-2.9327F, -0.3626F, -0.449F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1877F, -12.9747F, 0.2881F, 0.0658F, -0.3072F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(124, 121).mirror().addBox(-0.8705F, -0.3797F, 3.4961F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(42, 126).mirror().addBox(-0.9353F, -0.4398F, 1.4981F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(124, 113).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4464F, -0.7624F, -4.5842F, -0.0072F, -0.0098F, 0.5446F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(103, 129).mirror().addBox(-2.9365F, -0.3355F, -0.2682F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.2877F, -0.7747F, -0.5848F, -0.1986F, -0.2448F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(128, 105).mirror().addBox(-4.3201F, -1.8312F, -0.3873F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.2877F, -0.7747F, -0.3878F, -0.4083F, -0.7776F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(120, 42).mirror().addBox(-5.5404F, -3.7531F, -1.3509F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.2877F, -0.7747F, -0.0802F, -0.1638F, -1.3855F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(23, 42).mirror().addBox(-5.2728F, -3.7551F, -3.8674F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.2877F, -0.7747F, -0.0743F, 0.3403F, -1.4196F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(126, 96).mirror().addBox(-2.9118F, -0.4142F, -0.2965F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.2877F, -2.7747F, -0.4135F, -0.1537F, -0.2749F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(19, 132).mirror().addBox(-4.2564F, -1.8861F, -0.4108F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.2877F, -2.7747F, -0.2586F, -0.283F, -0.8215F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(42, 120).mirror().addBox(-5.4552F, -3.7693F, -1.3415F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.2877F, -2.7747F, -0.0482F, 0.0078F, -1.388F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(118, 40).mirror().addBox(-2.9663F, 0.0137F, -0.0729F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8818F, 3.4411F, -3.8107F, -0.0395F, 0.2075F, -1.3935F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(80, 49).mirror().addBox(-10.37F, -3.7856F, -1.3321F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.2877F, -4.7747F, -0.0323F, 0.0936F, -1.3872F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(96, 129).mirror().addBox(-4.1928F, -1.941F, -0.4342F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.2877F, -4.7747F, -0.1977F, -0.2186F, -0.8366F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(129, 90).mirror().addBox(-2.8871F, -0.493F, -0.3247F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.2877F, -4.7747F, -0.3288F, -0.1295F, -0.2869F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(52, 10).mirror().addBox(-12.5514F, -3.7553F, -1.2655F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7877F, -6.5747F, -0.0275F, 0.1193F, -1.3867F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(35, 132).mirror().addBox(-4.2788F, -1.8659F, -0.5984F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7877F, -6.5747F, -0.0864F, -0.0944F, -0.854F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(124, 0).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3464F, -1.0624F, -6.5842F, -0.0072F, -0.0098F, 0.5446F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(124, 110).mirror().addBox(-1.6633F, -0.9132F, -0.9878F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(124, 107).mirror().addBox(-1.8257F, -1.2627F, -2.9906F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5877F, -8.0747F, 0.2664F, -0.1385F, 0.558F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(124, 47).mirror().addBox(-1.8257F, -1.6761F, -4.8972F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5877F, -8.0747F, 0.3537F, -0.1385F, 0.558F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(129, 88).mirror().addBox(-2.929F, -0.3768F, -0.482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7877F, -6.5747F, -0.1693F, -0.0811F, -0.3037F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(35, 130).addBox(0.8704F, -0.5454F, -0.334F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6877F, -8.9747F, 0.0637F, 0.0065F, 0.3139F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(13, 130).addBox(2.1722F, -1.9589F, -0.4082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6877F, -8.9747F, 0.0165F, -0.0243F, 0.8576F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(50, 39).addBox(2.5532F, -3.7826F, -0.7844F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6877F, -8.9747F, 0.0022F, -0.1864F, 1.3811F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(75, 81).addBox(6.4485F, -3.766F, -1.5118F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0877F, -10.7747F, 0.0211F, -0.2981F, 1.3763F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(86, 7).addBox(2.5641F, -3.7871F, -0.784F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0877F, -10.7747F, 0.0206F, -0.1934F, 1.3786F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(6, 130).addBox(2.1516F, -1.9761F, -0.5635F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0877F, -10.7747F, 0.0796F, -0.0968F, 0.8538F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(129, 118).addBox(0.8646F, -0.5765F, -0.4884F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0877F, -10.7747F, 0.155F, -0.0231F, 0.3132F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(31, 13).addBox(2.8266F, -3.7453F, -0.5175F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1877F, -12.9747F, 0.0477F, -0.2606F, 1.3748F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(129, 116).addBox(2.3205F, -1.8302F, -0.5175F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1877F, -12.9747F, 0.1731F, -0.2015F, 0.8399F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(115, 129).addBox(0.9327F, -0.3626F, -0.449F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1877F, -12.9747F, 0.2881F, -0.0658F, 0.3072F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(124, 121).addBox(-1.1295F, -0.3797F, 3.4961F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 126).addBox(-1.0647F, -0.4398F, 1.4981F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(124, 113).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4464F, -0.7624F, -4.5842F, -0.0072F, 0.0098F, -0.5446F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(103, 129).addBox(0.9366F, -0.3355F, -0.2682F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.2877F, -0.7747F, -0.5848F, 0.1986F, 0.2448F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(128, 105).addBox(2.3201F, -1.8312F, -0.3873F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.2877F, -0.7747F, -0.3878F, 0.4083F, 0.7776F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(120, 42).addBox(2.5404F, -3.7531F, -1.3509F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.2877F, -0.7747F, -0.0802F, 0.1638F, 1.3855F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(23, 42).addBox(4.2728F, -3.7551F, -3.8674F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.2877F, -0.7747F, -0.0743F, -0.3403F, 1.4196F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(126, 96).addBox(0.9118F, -0.4142F, -0.2965F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.2877F, -2.7747F, -0.4135F, 0.1537F, 0.2749F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(19, 132).addBox(2.2564F, -1.8861F, -0.4108F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.2877F, -2.7747F, -0.2586F, 0.283F, 0.8215F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(42, 120).addBox(2.4552F, -3.7693F, -1.3415F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.2877F, -2.7747F, -0.0482F, -0.0078F, 1.388F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(118, 40).addBox(-0.0337F, 0.0137F, -0.0729F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8818F, 3.4411F, -3.8107F, -0.0395F, -0.2075F, 1.3935F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(80, 49).addBox(2.37F, -3.7856F, -1.3321F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.2877F, -4.7747F, -0.0323F, -0.0936F, 1.3872F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(96, 129).addBox(2.1928F, -1.941F, -0.4342F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.2877F, -4.7747F, -0.1977F, 0.2186F, 0.8366F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(129, 90).addBox(0.8871F, -0.493F, -0.3247F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.2877F, -4.7747F, -0.3288F, 0.1295F, 0.2869F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(52, 10).addBox(2.5514F, -3.7553F, -1.2655F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7877F, -6.5747F, -0.0275F, -0.1193F, 1.3867F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(35, 132).addBox(2.2788F, -1.8659F, -0.5984F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7877F, -6.5747F, -0.0864F, 0.0944F, 0.854F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(124, 0).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3464F, -1.0624F, -6.5842F, -0.0072F, 0.0098F, -0.5446F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(124, 110).addBox(-0.3367F, -0.9132F, -0.9878F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(124, 107).addBox(-0.1743F, -1.2627F, -2.9906F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5877F, -8.0747F, 0.2664F, 0.1385F, -0.558F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(124, 47).addBox(-0.1743F, -1.6761F, -4.8972F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5877F, -8.0747F, 0.3537F, 0.1385F, -0.558F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(129, 88).addBox(0.929F, -0.3768F, -0.482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7877F, -6.5747F, -0.1693F, 0.0811F, 0.3037F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(63, 43).addBox(-1.0F, -0.3573F, -5.8422F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.5877F, -8.0747F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(21, 44).addBox(-1.0F, -1.3073F, -7.6535F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.4123F, -0.3747F, -0.0087F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7627F, -14.1322F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(52, 125).addBox(0.0F, -4.893F, -0.1509F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0141F, -2.3216F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(49, 125).addBox(0.0F, -5.0054F, 0.0064F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9141F, -0.6216F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(24, 125).addBox(0.0F, -4.6802F, -0.2265F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2859F, -4.0216F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(29, 106).addBox(0.0F, -4.7823F, -0.0234F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.186F, -6.0216F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(130, 98).mirror().addBox(-2.9138F, -0.4154F, -0.1482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.6939F, 0.2541F, -0.2826F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(72, 130).mirror().addBox(-4.2761F, -1.8779F, -0.2185F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.4502F, 0.5626F, -0.7755F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(58, 12).mirror().addBox(-8.7642F, -3.7644F, -0.2185F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.0683F, 0.7023F, -1.4062F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(130, 65).mirror().addBox(-2.9789F, -0.2358F, -0.5082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7952F, -3.8299F, 0.6425F, 0.1686F, -0.2998F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(65, 130).mirror().addBox(-4.426F, -1.7433F, -0.5728F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7952F, -3.8299F, 0.4454F, 0.4635F, -0.7843F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(75, 83).mirror().addBox(-10.9613F, -3.7227F, -0.5728F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7952F, -3.8299F, 0.1357F, 0.6186F, -1.3712F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(130, 63).mirror().addBox(-2.9152F, -0.418F, -0.4639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.314F, -2.0216F, 0.523F, 0.1372F, -0.2833F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(69, 32).mirror().addBox(-11.77F, -3.756F, -0.5341F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.314F, -2.0216F, 0.1014F, 0.4999F, -1.3547F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(132, 33).mirror().addBox(-4.2769F, -1.8678F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.314F, -2.0216F, 0.3478F, 0.3797F, -0.7895F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(84, 30).mirror().addBox(-2.8886F, -0.5014F, -0.4794F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.814F, -0.5216F, 0.4555F, 0.1174F, -0.2919F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(50, 41).mirror().addBox(-13.6845F, -3.7724F, -0.5521F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.814F, -0.5216F, 0.0849F, 0.4316F, -1.3621F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(129, 16).mirror().addBox(-4.211F, -1.9247F, -0.5521F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.814F, -0.5216F, 0.2959F, 0.3297F, -0.8075F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(108, 0).mirror().addBox(-4.5106F, -7.0063F, -2.24F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9512F, 2.7523F, -2.5739F, 2.6325F, -0.1136F, -0.8266F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(44, 102).mirror().addBox(-4.5106F, -5.6486F, -4.1181F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.9512F, 2.7523F, -2.5739F, 1.8907F, -0.1136F, -0.8266F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(44, 93).mirror().addBox(-3.6399F, -3.7025F, -5.1503F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9512F, 2.7523F, -2.5739F, 1.281F, -0.1635F, -0.4997F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(30, 71).mirror().addBox(-0.5F, 0.0F, -6.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(-5.0193F, -5.6578F, 2.1505F, 0.8789F, -0.0554F, 0.0889F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(71, 0).mirror().addBox(-0.5F, 0.0F, -6.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-5.1853F, -1.1258F, -2.1207F, 0.9226F, -0.0554F, 0.0889F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(70, 52).mirror().addBox(-0.5F, -1.0F, -3.5F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-5.0763F, -3.8002F, 0.2022F, 1.1407F, -0.0554F, 0.0889F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(69, 23).mirror().addBox(-2.0461F, -1.1421F, 1.7994F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9512F, 2.7523F, -2.5739F, 0.9662F, -0.0554F, 0.0889F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(107, 63).mirror().addBox(-2.0461F, -1.9225F, -2.9565F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-4.0464F, 3.7259F, -2.4217F, 1.5509F, -0.0554F, 0.0889F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(66, 62).mirror().addBox(-2.0461F, -1.2226F, -4.0565F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.9512F, 2.7523F, -2.5739F, 0.94F, -0.0554F, 0.0889F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(15, 55).mirror().addBox(-2.0461F, -1.7749F, -5.1044F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.9512F, 2.7523F, -2.5739F, 0.7917F, -0.0554F, 0.0889F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(60, 79).mirror().addBox(-0.7271F, 0.8487F, 0.1605F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7246F, 9.3367F, 2.7985F, 0.5371F, -1.1231F, -0.477F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(37, 87).mirror().addBox(-0.7271F, 0.8487F, 0.1605F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7246F, 9.3367F, 2.7985F, 1.1221F, -1.2311F, -0.9029F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(101, 74).mirror().addBox(-0.7271F, 0.6486F, 0.1605F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4684F, 9.7925F, 0.9987F, 0.9F, -1.1195F, -0.5498F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(101, 69).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3638F, 10.1811F, -0.7469F, 0.9499F, -1.0609F, -0.4094F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(84, 132).mirror().addBox(0.9737F, -0.1026F, 8.9214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(80, 42).mirror().addBox(-0.0263F, -0.1026F, 3.9214F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(84, 132).addBox(2.3737F, -0.1026F, 8.9214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(80, 42).addBox(2.3737F, -0.1026F, 3.9214F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.1737F, 10.115F, -6.2548F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(88, 70).mirror().addBox(-0.0263F, -1.0354F, -0.0942F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(88, 70).addBox(2.3737F, -1.0354F, -0.0942F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1737F, 10.115F, -6.2548F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(125, 37).mirror().addBox(-0.8F, -0.2F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(125, 34).mirror().addBox(-0.7F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5818F, -2.1266F, 0.4373F, -0.2635F, 0.5083F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(130, 98).addBox(0.9138F, -0.4154F, -0.1482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.6939F, -0.2541F, 0.2826F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(72, 130).addBox(2.2761F, -1.8779F, -0.2185F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.4502F, -0.5626F, 0.7755F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(58, 12).addBox(2.7642F, -3.7644F, -0.2185F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.0683F, -0.7023F, 1.4062F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(130, 65).addBox(0.9789F, -0.2358F, -0.5082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7952F, -3.8299F, 0.6425F, -0.1686F, 0.2998F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(65, 130).addBox(2.426F, -1.7433F, -0.5728F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7952F, -3.8299F, 0.4454F, -0.4635F, 0.7843F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(75, 83).addBox(2.9613F, -3.7227F, -0.5728F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7952F, -3.8299F, 0.1357F, -0.6186F, 1.3712F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(130, 63).addBox(0.9152F, -0.418F, -0.4639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.314F, -2.0216F, 0.523F, -0.1372F, 0.2833F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(69, 32).addBox(2.77F, -3.756F, -0.5341F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.314F, -2.0216F, 0.1014F, -0.4999F, 1.3547F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(132, 33).addBox(2.2769F, -1.8678F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.314F, -2.0216F, 0.3478F, -0.3797F, 0.7895F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(84, 30).addBox(0.8886F, -0.5014F, -0.4794F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.814F, -0.5216F, 0.4555F, -0.1174F, 0.2919F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(50, 41).addBox(2.6845F, -3.7724F, -0.5521F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.814F, -0.5216F, 0.0849F, -0.4316F, 1.3621F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(129, 16).addBox(2.211F, -1.9247F, -0.5521F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.814F, -0.5216F, 0.2959F, -0.3297F, 0.8075F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(108, 0).addBox(3.5106F, -7.0063F, -2.24F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9512F, 2.7523F, -2.5739F, 2.6325F, 0.1136F, 0.8266F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(44, 102).addBox(3.5106F, -5.6486F, -4.1181F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.9512F, 2.7523F, -2.5739F, 1.8907F, 0.1136F, 0.8266F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(44, 93).addBox(2.6399F, -3.7025F, -5.1503F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9512F, 2.7523F, -2.5739F, 1.281F, 0.1635F, 0.4997F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(30, 71).addBox(-0.5F, 0.0F, -6.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(5.0193F, -5.6578F, 2.1505F, 0.8789F, 0.0554F, -0.0889F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(71, 0).addBox(-0.5F, 0.0F, -6.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(5.1853F, -1.1258F, -2.1207F, 0.9226F, 0.0554F, -0.0889F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(70, 52).addBox(-0.5F, -1.0F, -3.5F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(5.0763F, -3.8002F, 0.2022F, 1.1407F, 0.0554F, -0.0889F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(69, 23).addBox(1.0461F, -1.1421F, 1.7994F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9512F, 2.7523F, -2.5739F, 0.9662F, 0.0554F, -0.0889F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(107, 63).addBox(1.0461F, -1.9225F, -2.9565F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(4.0464F, 3.7259F, -2.4217F, 1.5509F, 0.0554F, -0.0889F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(66, 62).addBox(1.0461F, -1.2226F, -4.0565F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.9512F, 2.7523F, -2.5739F, 0.94F, 0.0554F, -0.0889F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(15, 55).addBox(1.0461F, -1.7749F, -5.1044F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.9512F, 2.7523F, -2.5739F, 0.7917F, 0.0554F, -0.0889F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(60, 79).addBox(-0.2728F, 0.8487F, 0.1605F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7246F, 9.3367F, 2.7985F, 0.5371F, 1.1231F, 0.477F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(37, 87).addBox(-0.2728F, 0.8487F, 0.1605F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7246F, 9.3367F, 2.7985F, 1.1221F, 1.2311F, 0.9029F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(101, 74).addBox(-0.2729F, 0.6486F, 0.1605F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4684F, 9.7925F, 0.9987F, 0.9F, 1.1195F, 0.5498F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(101, 69).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3638F, 10.1811F, -0.7469F, 0.9499F, 1.0609F, 0.4094F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(125, 37).addBox(-1.2F, -0.2F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(125, 34).addBox(-1.3F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5818F, -2.1266F, 0.4373F, 0.2635F, -0.5083F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(42, 44).addBox(-1.0F, -0.907F, -0.4667F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.186F, -6.0216F, 0.5061F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.1874F, 7.7792F, -3.4424F, 0.6587F, 0.1002F, -0.0901F));

		PartDefinition cube_r195 = leftarm.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(101, 117).addBox(-0.5F, -0.675F, 0.45F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.2434F, -1.0021F, -1.4663F, -0.714F, -0.5672F, -0.0056F));

		PartDefinition cube_r196 = leftarm.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(60, 106).addBox(-0.5F, -1.9F, -1.8F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2838F, 1.4054F, 0.0611F, 0.3769F, -0.5672F, -0.0056F));

		PartDefinition cube_r197 = leftarm.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(130, 56).addBox(-0.1791F, -0.4311F, -1.6052F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0289F, 3.3523F, -0.097F, 1.4939F, -0.5672F, -0.0056F));

		PartDefinition cube_r198 = leftarm.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(53, 98).addBox(-1.5F, -2.5F, -1.3F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 1.0521F, 0.6065F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r199 = leftarm.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(0, 103).addBox(-2.0F, 0.9F, -0.7F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 7.1432F, 3.4116F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r200 = leftarm.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(119, 5).addBox(-0.9824F, -2.9907F, -1.0712F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.7735F, 5.7059F, 3.4765F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r201 = leftarm.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(7, 120).addBox(-0.9824F, -1.6907F, -1.5712F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(101, 110).addBox(-0.9824F, -4.6907F, -1.0712F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.7735F, 6.775F, 4.8896F, 0.637F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1062F, 8.1112F, 3.8051F, -1.8699F, -0.015F, 0.2211F));

		PartDefinition cube_r202 = leftarm2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(108, 110).addBox(-0.1933F, -4.0546F, 0.3397F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.808F, 4.1708F, -2.2954F, -0.303F, 0.0393F, 0.1249F));

		PartDefinition cube_r203 = leftarm2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(78, 108).addBox(-1.1933F, -0.6546F, 0.3397F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.192F, 4.5523F, -2.4156F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r204 = leftarm2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(0, 121).addBox(-1.6F, 0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F))
				.texOffs(94, 65).addBox(-1.6F, -0.9F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.6732F, 1.3745F, -0.009F, -0.1789F, -0.2489F, -0.9375F));

		PartDefinition cube_r205 = leftarm2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(22, 106).addBox(0.3067F, -2.4546F, 0.3397F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(92, 30).addBox(0.6067F, -5.4546F, 0.3397F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.192F, 4.5523F, -2.4156F, -0.3011F, 0.0522F, 0.1666F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1479F, 7.9656F, -2.8375F, 2.3235F, 0.1483F, 0.3987F));

		PartDefinition cube_r206 = lefthand.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(104, 47).addBox(-0.9935F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0013F, 1.3347F, -2.5899F, -0.0242F, 0.2026F, -0.2301F));

		PartDefinition cube_r207 = lefthand.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(88, 76).addBox(-1.5205F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -1.1382F, 0.0511F, -0.1759F));

		PartDefinition cube_r208 = lefthand.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(114, 99).addBox(0.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -0.9763F, -0.3374F, 0.2997F));

		PartDefinition cube_r209 = lefthand.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(114, 56).addBox(0.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.1013F, 1.2347F, -2.7899F, -0.0166F, -0.1742F, 0.1964F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.1874F, 7.7792F, -3.4424F, 0.6587F, -0.1002F, 0.0901F));

		PartDefinition cube_r210 = rightarm.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(108, 117).mirror().addBox(-0.5F, -0.675F, 0.45F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.2434F, -1.0021F, -1.4663F, -0.714F, 0.5672F, 0.0056F));

		PartDefinition cube_r211 = rightarm.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(106, 79).mirror().addBox(-0.5F, -1.9F, -1.8F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.2838F, 1.4054F, 0.0611F, 0.3769F, 0.5672F, 0.0056F));

		PartDefinition cube_r212 = rightarm.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(60, 130).mirror().addBox(-0.8209F, -0.4311F, -1.6052F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0289F, 3.3523F, -0.097F, 1.4939F, 0.5672F, 0.0056F));

		PartDefinition cube_r213 = rightarm.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(62, 98).mirror().addBox(-0.5F, -2.5F, -1.3F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.2559F, 1.0521F, 0.6065F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r214 = rightarm.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(11, 103).mirror().addBox(-1.0F, 0.9F, -0.7F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.2559F, 7.1432F, 3.4116F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r215 = rightarm.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(119, 25).mirror().addBox(-1.0176F, -2.9907F, -1.0712F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.7735F, 5.7059F, 3.4765F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r216 = rightarm.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(21, 121).mirror().addBox(-1.0176F, -1.6907F, -1.5712F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(111, 35).mirror().addBox(-1.0176F, -4.6907F, -1.0712F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.7735F, 6.775F, 4.8896F, 0.637F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1062F, 8.1112F, 3.8051F, -1.8699F, 0.015F, -0.2211F));

		PartDefinition cube_r217 = rightarm2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(67, 111).mirror().addBox(-0.8067F, -4.0546F, 0.3397F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.808F, 4.1708F, -2.2954F, -0.303F, -0.0393F, -0.1249F));

		PartDefinition cube_r218 = rightarm2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(85, 108).mirror().addBox(0.1933F, -0.6546F, 0.3397F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.192F, 4.5523F, -2.4156F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r219 = rightarm2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(51, 121).mirror().addBox(0.6F, 0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(97, 25).mirror().addBox(-2.4F, -0.9F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.6732F, 1.3745F, -0.009F, -0.1789F, 0.2489F, 0.9375F));

		PartDefinition cube_r220 = rightarm2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(53, 106).mirror().addBox(-1.3067F, -2.4546F, 0.3397F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(74, 92).mirror().addBox(-1.6067F, -5.4546F, 0.3397F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.192F, 4.5523F, -2.4156F, -0.3011F, -0.0522F, -0.1666F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1479F, 7.9656F, -2.8375F, 2.3235F, -0.1483F, -0.3987F));

		PartDefinition cube_r221 = righthand.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(106, 95).mirror().addBox(-2.0065F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(1.0013F, 1.3347F, -2.5899F, -0.0242F, -0.2026F, 0.2301F));

		PartDefinition cube_r222 = righthand.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(53, 93).mirror().addBox(-1.4795F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -1.1382F, -0.0511F, 0.1759F));

		PartDefinition cube_r223 = righthand.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(74, 115).mirror().addBox(-2.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -0.9763F, 0.3374F, -0.2997F));

		PartDefinition cube_r224 = righthand.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(115, 47).mirror().addBox(-2.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.1013F, 1.2347F, -2.7899F, -0.0166F, 0.1742F, -0.1964F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.4859F, -6.1216F, -0.0879F, -0.1744F, 0.0077F));

		PartDefinition cube_r225 = neck2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(40, 104).addBox(0.0F, -2.4703F, -0.1461F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -1.8F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r226 = neck2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(74, 111).addBox(0.0F, -2.9F, -2.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 76).addBox(-1.0F, -1.1F, -3.3F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2F, -1.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r227 = neck2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(99, 39).mirror().addBox(-2.7107F, -1.0354F, -0.5375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4156F, -3.4754F, 0.1041F, 0.9361F, -1.3476F));

		PartDefinition cube_r228 = neck2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(131, 22).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4156F, -3.4754F, 0.6995F, 0.7021F, -0.6109F));

		PartDefinition cube_r229 = neck2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(131, 0).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0156F, -1.4754F, 0.739F, 0.4429F, -0.3033F));

		PartDefinition cube_r230 = neck2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(127, 130).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0156F, -1.4754F, 0.3779F, 0.7475F, -0.8558F));

		PartDefinition cube_r231 = neck2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(114, 60).mirror().addBox(-6.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0156F, -1.4754F, -0.1536F, 0.8096F, -1.5951F));

		PartDefinition cube_r232 = neck2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(99, 39).addBox(1.7107F, -1.0354F, -0.5375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4156F, -3.4754F, 0.1041F, -0.9361F, 1.3476F));

		PartDefinition cube_r233 = neck2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(131, 22).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4156F, -3.4754F, 0.6995F, -0.7021F, 0.6109F));

		PartDefinition cube_r234 = neck2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(131, 0).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0156F, -1.4754F, 0.739F, -0.4429F, 0.3033F));

		PartDefinition cube_r235 = neck2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(127, 130).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0156F, -1.4754F, 0.3779F, -0.7475F, 0.8558F));

		PartDefinition cube_r236 = neck2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(114, 60).addBox(2.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0156F, -1.4754F, -0.1536F, -0.8096F, 1.5951F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -4.6F, -0.0854F, -0.0472F, -0.0397F));

		PartDefinition cube_r237 = neck.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(54, 80).addBox(0.0F, -1.7F, -2.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4781F, -4.6234F, 0.023F, 0.0117F, -0.0255F));

		PartDefinition cube_r238 = neck.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(129, 135).addBox(0.0F, -1.3F, 0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5099F, -4.0213F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r239 = neck.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(63, 114).addBox(0.0F, -3.0F, -1.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 0).addBox(-1.0F, -1.4F, -6.7F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.2F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r240 = neck.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(131, 24).mirror().addBox(-2.7792F, 0.2788F, 0.0614F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0844F, -2.7754F, 0.3928F, 0.8184F, -1.059F));

		PartDefinition cube_r241 = neck.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(131, 24).addBox(0.7792F, 0.2788F, 0.0614F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0844F, -2.7754F, 0.3928F, -0.8184F, 1.059F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4477F, -4.9935F, 0.1767F, -0.1264F, -0.0341F));

		PartDefinition cube_r242 = head.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(99, 0).addBox(-1.5F, -4.0689F, -0.1176F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.1118F, -1.1765F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r243 = head.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(126, 19).addBox(-1.0F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(125, 60).addBox(-1.0F, -1.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.5185F, -12.7126F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r244 = head.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(28, 122).addBox(-1.0F, -1.95F, 0.025F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2475F, -12.6774F, -1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r245 = head.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(121, 103).addBox(-1.0F, -1.95F, -0.975F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 2.1045F, -12.1762F, -0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r246 = head.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(54, 86).addBox(-1.0F, -0.25F, -2.875F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.6056F, -9.3093F, 2.4522F, 0.0F, 0.0F));

		PartDefinition cube_r247 = head.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(121, 73).addBox(-1.0F, -1.025F, -0.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.6117F, -10.018F, -2.8274F, 0.0F, 0.0F));

		PartDefinition cube_r248 = head.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(121, 69).addBox(-1.0F, -1.767F, -0.0594F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.3285F, -10.9359F, -1.8675F, 0.0F, 0.0F));

		PartDefinition cube_r249 = head.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(126, 27).addBox(-1.0F, 0.0F, -1.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F))
				.texOffs(117, 95).addBox(-1.5F, 0.6F, -1.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.9611F, -8.2029F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r250 = head.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(29, 112).addBox(-1.5F, -2.7F, -0.65F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.4915F, -11.9311F, -1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r251 = head.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(92, 115).addBox(-1.0F, -2.0F, -1.025F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 0.027F, -11.1886F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r252 = head.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(83, 115).addBox(-1.5F, -0.9F, -2.175F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.8451F, -11.8358F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r253 = head.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(126, 30).addBox(-1.5F, 0.0F, -1.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, -0.7337F, -12.8605F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r254 = head.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(63, 118).addBox(-1.5F, 0.0F, -1.025F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.1642F, -11.958F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r255 = head.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(117, 22).addBox(-1.5F, -0.4F, -0.75F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, -0.6788F, -11.2871F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r256 = head.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(55, 125).addBox(-1.0F, -0.5F, 2.625F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, -2.7863F, -13.9089F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r257 = head.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(111, 42).addBox(-1.0F, -2.067F, 0.8906F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -1.1474F, -11.4174F, -1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r258 = head.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(117, 122).addBox(-1.0F, -1.967F, -0.0594F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.4291F, -8.1173F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r259 = head.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(103, 122).addBox(-1.0F, 1.633F, 0.3406F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(0, 54).addBox(-1.0F, -2.367F, 0.8406F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.6942F, -6.3941F, -1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r260 = head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(133, 95).addBox(-0.5F, 1.366F, -0.2567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7769F, -12.8871F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r261 = head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(89, 131).addBox(-0.5F, -1.425F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 2.9629F, -12.3598F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r262 = head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(79, 131).addBox(-0.5F, -0.5F, -0.925F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4486F, -10.6939F, -1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r263 = head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(30, 131).addBox(-0.5F, -1.975F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 2.308F, -11.2436F, -0.3709F, 0.0F, 0.0F));

		PartDefinition cube_r264 = head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(79, 126).addBox(-0.5F, -1.5F, -0.05F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 4.4819F, -8.3924F, 2.3126F, 0.0F, 0.0F));

		PartDefinition cube_r265 = head.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(118, 51).addBox(-0.5F, -1.725F, -1.825F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2088F, -9.6831F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r266 = head.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(118, 35).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 3.6456F, -11.4315F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r267 = head.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(65, 135).addBox(-0.5F, -0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8522F, -11.2415F, 0.4931F, 0.0F, 0.0F));

		PartDefinition cube_r268 = head.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(30, 126).addBox(-0.5F, -0.275F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 2.3037F, -11.2008F, -0.0742F, 0.0F, 0.0F));

		PartDefinition cube_r269 = head.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(125, 53).addBox(-1.0F, -0.4626F, -0.2441F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(125, 50).addBox(-1.0F, -0.0626F, -0.2441F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.7769F, -12.8871F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r270 = head.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(83, 135).addBox(-1.0F, -0.675F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 4.3355F, -12.7861F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r271 = head.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(88, 135).addBox(-1.0F, -1.45F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(78, 135).addBox(-1.0F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 3.3414F, -12.6665F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r272 = head.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(45, 71).addBox(-2.5F, 0.0F, -1.9F, 5.0F, 6.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -4.5459F, -5.138F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r273 = head.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(0, 66).addBox(-2.5F, 0.0F, -1.9F, 5.0F, 7.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -5.0636F, -3.2061F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r274 = head.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(15, 65).addBox(-2.5F, -3.4F, -0.3F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6799F, -2.7581F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r275 = head.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(50, 29).addBox(-2.5F, -0.025F, -0.075F, 5.0F, 5.0F, 4.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -5.1595F, -4.8959F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r276 = head.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(54, 23).addBox(-2.5F, -2.125F, -0.8F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, -3.955F, -0.8318F, 0.5585F, 0.0F, 0.0F));

		PartDefinition leftCheek = head.addOrReplaceChild("leftCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4319F, -0.3695F, -0.8156F, -1.6997F, -0.2905F, -0.0709F));

		PartDefinition cube_r277 = leftCheek.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(58, 121).addBox(-0.5F, -0.335F, -0.6967F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2592F, 0.1163F, 1.1218F, 0.2579F, 0.6816F, 0.3825F));

		PartDefinition cube_r278 = leftCheek.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(119, 30).addBox(-0.5F, 0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.4093F, -0.532F, 1.0323F, 0.4265F, 0.6509F, 0.3741F));

		PartDefinition cube_r279 = leftCheek.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(124, 135).addBox(-0.5F, 0.0F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3394F, -0.1059F, 2.3436F, 0.2114F, 0.6586F, 0.2645F));

		PartDefinition cube_r280 = leftCheek.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(119, 135).addBox(-1.4265F, -2.5653F, -0.9288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.326F, 1.6018F, 2.637F, 0.6477F, 0.6586F, 0.2645F));

		PartDefinition cube_r281 = leftCheek.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(132, 60).addBox(-1.4519F, -1.5053F, 0.1585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.072F, 1.6209F, 2.3286F, 1.6498F, 0.6627F, 0.2584F));

		PartDefinition cube_r282 = leftCheek.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(94, 58).addBox(-0.8737F, -1.4468F, -5.8576F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.326F, -0.2982F, 2.637F, 1.0513F, 0.6867F, 0.4214F));

		PartDefinition cube_r283 = leftCheek.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(7, 108).addBox(-0.5F, -0.0274F, -2.3442F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2592F, 0.1163F, 1.1218F, -0.0737F, 0.6816F, 0.3825F));

		PartDefinition rightCheek = head.addOrReplaceChild("rightCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4319F, -0.3695F, -0.8156F, -1.6997F, 0.2905F, 0.0709F));

		PartDefinition cube_r284 = rightCheek.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(58, 121).mirror().addBox(-0.5F, -0.335F, -0.6967F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2592F, 0.1163F, 1.1218F, 0.2579F, -0.6816F, -0.3825F));

		PartDefinition cube_r285 = rightCheek.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(119, 30).mirror().addBox(-0.5F, 0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4093F, -0.532F, 1.0323F, 0.4265F, -0.6509F, -0.3741F));

		PartDefinition cube_r286 = rightCheek.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(124, 135).mirror().addBox(-0.5F, 0.0F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3394F, -0.1059F, 2.3436F, 0.2114F, -0.6586F, -0.2645F));

		PartDefinition cube_r287 = rightCheek.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(119, 135).mirror().addBox(0.4265F, -2.5653F, -0.9288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.326F, 1.6018F, 2.637F, 0.6477F, -0.6586F, -0.2645F));

		PartDefinition cube_r288 = rightCheek.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(132, 60).mirror().addBox(0.4519F, -1.5053F, 0.1585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.072F, 1.6209F, 2.3286F, 1.6498F, -0.6627F, -0.2584F));

		PartDefinition cube_r289 = rightCheek.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(94, 58).mirror().addBox(-0.1263F, -1.4468F, -5.8576F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.326F, -0.2982F, 2.637F, 1.0513F, -0.6867F, -0.4214F));

		PartDefinition cube_r290 = rightCheek.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(7, 108).mirror().addBox(-0.5F, -0.0274F, -2.3442F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2592F, 0.1163F, 1.1218F, -0.0737F, -0.6816F, -0.3825F));

		PartDefinition leftBeak = head.addOrReplaceChild("leftBeak", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5296F, 7.017F, -11.1805F, -0.0873F, 0.0484F, -0.048F));

		PartDefinition cube_r291 = leftBeak.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(128, 68).addBox(-0.5F, -0.6F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.1057F, -1.7475F, -0.0927F, -2.3075F, 0.0636F, 0.0753F));

		PartDefinition cube_r292 = leftBeak.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(132, 35).addBox(-0.5F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.1737F, -1.3181F, -0.6504F, -1.6967F, 0.0636F, 0.0753F));

		PartDefinition cube_r293 = leftBeak.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(133, 18).addBox(-0.7505F, -0.047F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.261F, -0.8961F, 0.9568F, -2.5127F, 0.1224F, -0.0352F));

		PartDefinition cube_r294 = leftBeak.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(96, 119).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0683F, -1.099F, 0.3919F, -1.1252F, 0.1224F, -0.0352F));

		PartDefinition cube_r295 = leftBeak.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(133, 8).addBox(-1.3695F, -1.0543F, -0.0781F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.6095F, -1.7096F, -2.1929F, 0.0218F, 0.0785F, 0.0156F));

		PartDefinition cube_r296 = leftBeak.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(133, 5).addBox(-1.3695F, -1.0543F, -0.0531F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5633F, -0.7577F, -1.896F, 0.328F, 0.0699F, 0.0695F));

		PartDefinition cube_r297 = leftBeak.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(133, 2).addBox(-1.2852F, -1.0456F, -0.0906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5717F, -0.0432F, 0.1372F, 1.3228F, 0.0699F, 0.0695F));

		PartDefinition cube_r298 = leftBeak.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(131, 132).addBox(-1.376F, 0.0185F, -0.0074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5581F, -0.0022F, -1.315F, 0.8254F, 0.0699F, 0.0695F));

		PartDefinition cube_r299 = leftBeak.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(126, 132).addBox(-1.3697F, 0.3627F, -0.0772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5704F, -1.0934F, -2.1304F, 0.6945F, 0.0699F, 0.0695F));

		PartDefinition rightBeak = head.addOrReplaceChild("rightBeak", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5296F, 7.017F, -11.1805F, -0.0873F, -0.0484F, 0.048F));

		PartDefinition cube_r300 = rightBeak.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(128, 68).mirror().addBox(-0.5F, -0.6F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.1057F, -1.7475F, -0.0927F, -2.3075F, -0.0636F, -0.0753F));

		PartDefinition cube_r301 = rightBeak.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(132, 35).mirror().addBox(-0.5F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.1737F, -1.3181F, -0.6504F, -1.6967F, -0.0636F, -0.0753F));

		PartDefinition cube_r302 = rightBeak.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(133, 18).mirror().addBox(-0.2495F, -0.047F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.261F, -0.8961F, 0.9568F, -2.5127F, -0.1224F, 0.0352F));

		PartDefinition cube_r303 = rightBeak.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(96, 119).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0683F, -1.099F, 0.3919F, -1.1252F, -0.1224F, 0.0352F));

		PartDefinition cube_r304 = rightBeak.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(133, 8).mirror().addBox(0.3695F, -1.0543F, -0.0781F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.6095F, -1.7096F, -2.1929F, 0.0218F, -0.0785F, -0.0156F));

		PartDefinition cube_r305 = rightBeak.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(133, 5).mirror().addBox(0.3695F, -1.0543F, -0.0531F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5633F, -0.7577F, -1.896F, 0.328F, -0.0699F, -0.0695F));

		PartDefinition cube_r306 = rightBeak.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(133, 2).mirror().addBox(0.2852F, -1.0456F, -0.0906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5717F, -0.0432F, 0.1372F, 1.3228F, -0.0699F, -0.0695F));

		PartDefinition cube_r307 = rightBeak.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(131, 132).mirror().addBox(0.376F, 0.0185F, -0.0074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5581F, -0.0022F, -1.315F, 0.8254F, -0.0699F, -0.0695F));

		PartDefinition cube_r308 = rightBeak.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(126, 132).mirror().addBox(0.3697F, 0.3627F, -0.0772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, -1.0934F, -2.1304F, 0.6945F, -0.0699F, -0.0695F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.3F, 5.1433F, -6.3625F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(71, 103).addBox(-1.0F, 0.4F, -0.6F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0287F, -4.9928F, 1.4102F, -0.058F, 0.1988F, 0.0708F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(81, 61).addBox(-2.0447F, -0.1274F, -5.1887F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2328F, -8.0425F, 1.2962F, 0.5092F, 0.1988F, 0.0708F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(108, 14).addBox(-1.3F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2567F, -6.8494F, 2.4969F, 2.9559F, 0.0734F, 0.0627F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(13, 89).addBox(-0.5F, -1.7F, -3.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6443F, -8.1425F, 2.1517F, -2.7757F, 0.0F, 0.1309F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(65, 121).addBox(-1.771F, -1.0024F, -1.2413F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4337F, -7.9419F, 3.6444F, 0.1978F, 0.0676F, -0.194F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(35, 123).addBox(-1.6288F, -1.4782F, -1.5515F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.4337F, -7.9419F, 3.6444F, 0.7047F, 0.2195F, -0.1197F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(112, 104).addBox(-1.205F, -0.85F, -1.125F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F))
				.texOffs(103, 99).addBox(-1.515F, -0.85F, -1.125F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F))
				.texOffs(112, 74).addBox(-0.845F, -0.85F, -1.125F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.5533F, -7.339F, 0.8683F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(35, 118).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0708F, -1.427F, 1.2978F, 0.4431F, 0.2086F, -0.0185F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(103, 135).addBox(-0.5F, 0.025F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.2195F, 0.2951F, -1.9879F, 2.3387F, 0.0349F, 0.0F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(133, 92).addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.2406F, -0.0734F, -2.592F, 1.8588F, 0.0349F, 0.0F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(133, 73).addBox(-0.5F, -1.625F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2319F, -0.3647F, -2.3435F, 1.7279F, 0.0349F, 0.0F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(133, 70).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4862F, -0.2001F, -4.4969F, 1.3539F, 0.1048F, -0.0697F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(52, 132).addBox(-0.5F, -0.9F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.3591F, 0.1866F, -3.5473F, 0.7866F, 0.1048F, -0.0697F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(110, 126).addBox(-0.4F, -1.7055F, -0.3591F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -1.9996F, -1.2994F, 2.8972F, 0.0F, 0.0F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(133, 67).addBox(-0.5F, -0.7F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4977F, -0.262F, -5.1839F, 1.6503F, 0.087F, -0.0733F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(42, 133).addBox(-0.5F, -0.65F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5691F, -0.7144F, -5.6194F, 0.9958F, 0.087F, -0.0733F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(133, 29).addBox(-0.5F, -0.375F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.7132F, -0.9776F, -6.3566F, 0.3619F, 0.2973F, -0.1475F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(133, 26).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9011F, -2.0703F, -6.4613F, 0.0066F, 0.2882F, -0.1453F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(98, 135).addBox(-0.5F, -0.5F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.6603F, -1.3767F, -5.9964F, -0.3425F, 0.2882F, -0.1453F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(70, 135).addBox(-0.5F, 0.525F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0399F, -3.2345F, 3.2782F, -0.2963F, 0.2094F, 0.0037F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(14, 123).addBox(-0.5F, -0.475F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0399F, -3.2345F, 3.2782F, 0.6636F, 0.2094F, 0.0037F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(14, 118).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4072F, -2.2447F, 1.1918F, 0.4716F, 0.2094F, 0.0037F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(115, 117).addBox(-0.5091F, -1.981F, -1.9845F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5925F, -0.7239F, 0.3319F, 0.3328F, 0.2091F, 0.0111F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(127, 124).addBox(-1.0F, -0.625F, -0.525F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.648F, -9.9661F, 1.027F, -0.5338F, 0.0457F, 0.2165F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(35, 127).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
				.texOffs(13, 127).addBox(-1.0F, -0.575F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.49F, -9.5341F, -0.3178F, -0.3592F, 0.0457F, 0.2165F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(122, 117).addBox(-1.0F, -0.7309F, -1.505F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.4F, -8.8432F, 0.7698F, -1.1883F, 0.0457F, 0.2165F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(72, 123).addBox(-1.9337F, -0.0208F, -0.2436F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.2201F, -8.6497F, -1.2466F, -0.2752F, 0.029F, 0.3925F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(72, 127).addBox(-1.9444F, 0.2856F, -0.6466F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(1.2201F, -8.6497F, -1.2466F, 0.292F, 0.029F, 0.3925F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(127, 44).addBox(-1.0F, -0.225F, -0.875F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.3923F, -9.1837F, -0.7605F, 0.0771F, 0.0457F, 0.2165F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(6, 127).addBox(-1.0F, -0.0277F, -1.9843F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4F, -8.8432F, 0.7698F, -0.4901F, 0.0457F, 0.2165F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(0, 91).addBox(-1.0F, -0.3178F, -1.5556F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.4F, -8.8432F, 0.7698F, -2.5409F, 0.0457F, 0.2165F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(127, 127).addBox(-1.0F, -0.4F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.6736F, -9.9858F, 2.083F, -2.2801F, -0.1271F, 0.2411F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(123, 56).addBox(-2.3F, -1.7719F, -1.7993F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6837F, -8.4025F, 1.7983F, -1.7129F, -0.1271F, 0.2411F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(115, 126).addBox(-1.0F, -1.0993F, -1.6701F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4F, -8.8432F, 0.7698F, -1.581F, 0.0457F, 0.2165F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(104, 39).addBox(-0.5F, -2.5F, -0.7F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0339F, -6.6925F, 5.1867F, -0.2297F, 0.5999F, -0.0949F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(115, 109).addBox(-1.9762F, -0.04F, -0.172F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8506F, -9.4563F, 4.044F, -0.3062F, 0.1688F, -0.177F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(121, 131).addBox(-1.0F, -1.967F, -0.0594F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -7.5723F, -1.7548F, -0.7943F, 0.1889F, 0.1824F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(24, 94).addBox(-1.0F, 0.0F, -3.9F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.2F, -8.8439F, -0.5881F, 0.9395F, 0.1945F, 0.237F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(108, 10).addBox(-2.9962F, -0.0828F, -1.9452F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8506F, -9.4563F, 3.944F, 0.6419F, 0.128F, -0.1663F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(105, 57).addBox(-0.5592F, -1.065F, -0.3976F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -9.1497F, 5.8393F, -0.1195F, 0.6629F, -0.0816F));

		PartDefinition cube_r349 = leftFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(0, 84).addBox(-0.4372F, -0.398F, -0.0513F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5898F, -9.5821F, 7.6938F, 0.0439F, 0.5771F, -0.1008F));

		PartDefinition cube_r350 = leftFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(126, 22).addBox(-0.5F, -3.5F, 1.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.108F, -1.7981F, 4.8617F, 0.3609F, 0.4157F, -0.0332F));

		PartDefinition cube_r351 = leftFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(33, 104).addBox(0.0F, -0.475F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6297F, -9.7888F, 5.617F, -0.0755F, 0.4157F, -0.0332F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.3F, 5.1433F, -6.3625F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(71, 103).mirror().addBox(-1.0F, 0.4F, -0.6F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0287F, -4.9928F, 1.4102F, -0.058F, -0.1988F, -0.0708F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(81, 61).mirror().addBox(0.0447F, -0.1274F, -5.1887F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.2328F, -8.0425F, 1.2962F, 0.5092F, -0.1988F, -0.0708F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(108, 14).mirror().addBox(-0.7F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2567F, -6.8494F, 2.4969F, 2.9559F, -0.0734F, -0.0627F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(13, 89).mirror().addBox(-0.5F, -1.7F, -3.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6443F, -8.1425F, 2.1517F, -2.7757F, 0.0F, -0.1309F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(65, 121).mirror().addBox(-0.229F, -1.0024F, -1.2413F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4337F, -7.9419F, 3.6444F, 0.1978F, -0.0676F, 0.194F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(35, 123).mirror().addBox(-0.3712F, -1.4782F, -1.5515F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4337F, -7.9419F, 3.6444F, 0.7047F, -0.2195F, 0.1197F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(112, 104).mirror().addBox(-0.795F, -0.85F, -1.125F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)).mirror(false)
				.texOffs(103, 99).mirror().addBox(-1.485F, -0.85F, -1.125F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false)
				.texOffs(112, 74).mirror().addBox(-1.155F, -0.85F, -1.125F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.5533F, -7.339F, 0.8683F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(35, 118).mirror().addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0708F, -1.427F, 1.2978F, 0.4431F, -0.2086F, 0.0185F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(103, 135).mirror().addBox(-0.5F, 0.025F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.2195F, 0.2951F, -1.9879F, 2.3387F, -0.0349F, 0.0F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(133, 92).mirror().addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.2406F, -0.0734F, -2.592F, 1.8588F, -0.0349F, 0.0F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(133, 73).mirror().addBox(-0.5F, -1.625F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2319F, -0.3647F, -2.3435F, 1.7279F, -0.0349F, 0.0F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(133, 70).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4862F, -0.2001F, -4.4969F, 1.3539F, -0.1048F, 0.0697F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(52, 132).mirror().addBox(-0.5F, -0.9F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.3591F, 0.1866F, -3.5473F, 0.7866F, -0.1048F, 0.0697F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(110, 126).mirror().addBox(-0.6F, -1.7055F, -0.3591F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, -1.9996F, -1.2994F, 2.8972F, 0.0F, 0.0F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(133, 67).mirror().addBox(-0.5F, -0.7F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.4977F, -0.262F, -5.1839F, 1.6503F, -0.087F, 0.0733F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(42, 133).mirror().addBox(-0.5F, -0.65F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5691F, -0.7144F, -5.6194F, 0.9958F, -0.087F, 0.0733F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(133, 29).mirror().addBox(-0.5F, -0.375F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.7132F, -0.9776F, -6.3566F, 0.3619F, -0.2973F, 0.1475F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(133, 26).mirror().addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9011F, -2.0703F, -6.4613F, 0.0066F, -0.2882F, 0.1453F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(98, 135).mirror().addBox(-0.5F, -0.5F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.6603F, -1.3767F, -5.9964F, -0.3425F, -0.2882F, 0.1453F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(70, 135).mirror().addBox(-0.5F, 0.525F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0399F, -3.2345F, 3.2782F, -0.2963F, -0.2094F, -0.0037F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(14, 123).mirror().addBox(-0.5F, -0.475F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-0.0399F, -3.2345F, 3.2782F, 0.6636F, -0.2094F, -0.0037F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(14, 118).mirror().addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.4072F, -2.2447F, 1.1918F, 0.4716F, -0.2094F, -0.0037F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(115, 117).mirror().addBox(-0.4909F, -1.981F, -1.9845F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.5925F, -0.7239F, 0.3319F, 0.3328F, -0.2091F, -0.0111F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(127, 124).mirror().addBox(-1.0F, -0.625F, -0.525F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-0.648F, -9.9661F, 1.027F, -0.5338F, -0.0457F, -0.2165F));

		PartDefinition cube_r376 = rightFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(35, 127).mirror().addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false)
				.texOffs(13, 127).mirror().addBox(-1.0F, -0.575F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -9.5341F, -0.3178F, -0.3592F, -0.0457F, -0.2165F));

		PartDefinition cube_r377 = rightFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(122, 117).mirror().addBox(-1.0F, -0.7309F, -1.505F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -8.8432F, 0.7698F, -1.1883F, -0.0457F, -0.2165F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(72, 123).mirror().addBox(-0.0663F, -0.0208F, -0.2436F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.2201F, -8.6497F, -1.2466F, -0.2752F, -0.029F, -0.3925F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(72, 127).mirror().addBox(-0.0556F, 0.2856F, -0.6466F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-1.2201F, -8.6497F, -1.2466F, 0.292F, -0.029F, -0.3925F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(127, 44).mirror().addBox(-1.0F, -0.225F, -0.875F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-0.3923F, -9.1837F, -0.7605F, 0.0771F, -0.0457F, -0.2165F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(6, 127).mirror().addBox(-1.0F, -0.0277F, -1.9843F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -8.8432F, 0.7698F, -0.4901F, -0.0457F, -0.2165F));

		PartDefinition cube_r382 = rightFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(0, 91).mirror().addBox(-1.0F, -0.3178F, -1.5556F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -8.8432F, 0.7698F, -2.5409F, -0.0457F, -0.2165F));

		PartDefinition cube_r383 = rightFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(127, 127).mirror().addBox(-1.0F, -0.4F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-0.6736F, -9.9858F, 2.083F, -2.2801F, 0.1271F, -0.2411F));

		PartDefinition cube_r384 = rightFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(123, 56).mirror().addBox(0.3F, -1.7719F, -1.7993F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6837F, -8.4025F, 1.7983F, -1.7129F, 0.1271F, -0.2411F));

		PartDefinition cube_r385 = rightFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(115, 126).mirror().addBox(-1.0F, -1.0993F, -1.6701F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -8.8432F, 0.7698F, -1.581F, -0.0457F, -0.2165F));

		PartDefinition cube_r386 = rightFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(104, 39).mirror().addBox(-0.5F, -2.5F, -0.7F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0339F, -6.6925F, 5.1867F, -0.2297F, -0.5999F, 0.0949F));

		PartDefinition cube_r387 = rightFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(115, 109).mirror().addBox(-0.0238F, -0.04F, -0.172F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8506F, -9.4563F, 4.044F, -0.3062F, -0.1688F, 0.177F));

		PartDefinition cube_r388 = rightFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(121, 131).mirror().addBox(0.0F, -1.967F, -0.0594F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, -7.5723F, -1.7548F, -0.7943F, -0.1889F, -0.1824F));

		PartDefinition cube_r389 = rightFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(24, 94).mirror().addBox(0.0F, 0.0F, -3.9F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -8.8439F, -0.5881F, 0.9395F, -0.1945F, -0.237F));

		PartDefinition cube_r390 = rightFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(108, 10).mirror().addBox(-0.0038F, -0.0828F, -1.9452F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8506F, -9.4563F, 3.944F, 0.6419F, -0.128F, 0.1663F));

		PartDefinition cube_r391 = rightFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(105, 57).mirror().addBox(-0.4408F, -1.065F, -0.3976F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -9.1497F, 5.8393F, -0.1195F, -0.6629F, 0.0816F));

		PartDefinition cube_r392 = rightFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(-0.5628F, -0.398F, -0.0513F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5898F, -9.5821F, 7.6938F, 0.0439F, -0.5771F, 0.1008F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(126, 22).mirror().addBox(-0.5F, -3.5F, 1.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.108F, -1.7981F, 4.8617F, 0.3609F, -0.4157F, 0.0332F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(33, 104).mirror().addBox(-1.0F, -0.475F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6297F, -9.7888F, 5.617F, -0.0755F, -0.4157F, 0.0332F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 2.2691F, -0.198F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r395 = jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(33, 101).mirror().addBox(-0.05F, 0.4505F, -0.6448F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6777F, 3.096F, -3.8418F, -0.6502F, -0.0694F, -0.1483F));

		PartDefinition cube_r396 = jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(71, 98).mirror().addBox(0.05F, -2.4611F, -0.5225F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6777F, 3.096F, -3.8418F, -0.8247F, -0.0694F, -0.1483F));

		PartDefinition cube_r397 = jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(5, 134).mirror().addBox(-0.5F, -1.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1226F, 5.7349F, -5.6014F, -0.8617F, -0.0386F, -0.159F));

		PartDefinition cube_r398 = jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(122, 77).mirror().addBox(-0.5F, -0.425F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.239F, 5.1364F, -5.0806F, -0.2508F, -0.0386F, -0.159F));

		PartDefinition cube_r399 = jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(0, 134).mirror().addBox(-0.5F, -0.3F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1009F, 6.1902F, -4.289F, -1.0362F, -0.0386F, -0.159F));

		PartDefinition cube_r400 = jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(114, 133).mirror().addBox(-0.5F, -1.1F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.0552F, 6.5923F, -3.8104F, -0.7744F, -0.0386F, -0.159F));

		PartDefinition cube_r401 = jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(133, 100).mirror().addBox(-0.5F, -0.4F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3355F, 4.9995F, -3.148F, -0.8158F, -0.072F, -0.147F));

		PartDefinition cube_r402 = jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(129, 40).mirror().addBox(0.6472F, 0.048F, 0.1581F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.9006F, 2.4127F, -3.4687F, -0.7221F, -0.0386F, -0.159F));

		PartDefinition cube_r403 = jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(23, 114).mirror().addBox(-0.5F, -3.275F, -1.95F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.409F, 4.8893F, -2.1304F, -0.7831F, -0.0386F, -0.159F));

		PartDefinition cube_r404 = jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(99, 131).mirror().addBox(-0.5F, -1.575F, -1.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.409F, 4.8893F, -2.1304F, -0.5678F, -0.0034F, -0.1636F));

		PartDefinition cube_r405 = jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(91, 127).mirror().addBox(-0.5F, -1.6F, -0.875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5432F, 4.074F, -2.0415F, -0.8704F, -0.0386F, -0.159F));

		PartDefinition cube_r406 = jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(129, 12).mirror().addBox(-0.5F, -2.075F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.31F, 4.7078F, -5.4057F, -0.8966F, -0.0386F, -0.159F));

		PartDefinition cube_r407 = jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(128, 72).mirror().addBox(-0.5F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2386F, 1.4575F, -0.5766F, -1.0481F, -0.116F, -0.1593F));

		PartDefinition cube_r408 = jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(132, 49).mirror().addBox(-0.5F, -0.325F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.1843F, 2.0376F, -0.2474F, 0.0777F, -0.116F, -0.1593F));

		PartDefinition cube_r409 = jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(47, 132).mirror().addBox(-0.5F, -3.575F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(-2.0174F, 2.8406F, -0.5684F, -0.5768F, -0.116F, -0.1593F));

		PartDefinition cube_r410 = jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(24, 75).mirror().addBox(-0.5F, -1.8F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.1876F, 2.0836F, -0.1569F, -0.795F, -0.116F, -0.1593F));

		PartDefinition cube_r411 = jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(72, 119).mirror().addBox(-0.5F, -1.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.8216F, 2.8552F, -2.0334F, -0.062F, -0.116F, -0.1593F));

		PartDefinition cube_r412 = jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(128, 101).mirror().addBox(-0.5F, -0.9F, -0.875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8272F, 2.4914F, -2.0069F, -0.9453F, -0.0502F, -0.209F));

		PartDefinition cube_r413 = jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(119, 10).mirror().addBox(-0.5F, -0.15F, -1.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-2.3545F, 0.3179F, -0.4689F, -0.3992F, -0.1104F, -0.1847F));

		PartDefinition cube_r414 = jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(93, 135).mirror().addBox(-0.5F, -0.5F, -1.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-2.2277F, 0.1608F, -1.8543F, 0.3862F, -0.1104F, -0.1847F));

		PartDefinition cube_r415 = jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(42, 122).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.1552F, 0.071F, -2.6459F, -0.0938F, -0.1104F, -0.1847F));

		PartDefinition cube_r416 = jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(94, 131).mirror().addBox(-0.6399F, -1.2915F, -0.4446F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9164F, 1.1547F, -1.6973F, 0.6043F, -0.1104F, -0.1847F));

		PartDefinition cube_r417 = jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(82, 103).mirror().addBox(-0.5F, -0.85F, -0.475F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1893F, 0.6706F, -1.3492F, 1.3636F, -0.1104F, -0.1847F));

		PartDefinition cube_r418 = jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(33, 101).addBox(0.05F, 0.4505F, -0.6448F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4777F, 3.096F, -3.8418F, -0.6502F, 0.0694F, 0.1483F));

		PartDefinition cube_r419 = jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(71, 98).addBox(-0.05F, -2.4611F, -0.5225F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4777F, 3.096F, -3.8418F, -0.8247F, 0.0694F, 0.1483F));

		PartDefinition cube_r420 = jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(5, 134).addBox(-0.5F, -1.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0773F, 5.7349F, -5.6014F, -0.8617F, 0.0386F, 0.159F));

		PartDefinition cube_r421 = jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(122, 77).addBox(-0.5F, -0.425F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0391F, 5.1364F, -5.0806F, -0.2508F, 0.0386F, 0.159F));

		PartDefinition cube_r422 = jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(0, 134).addBox(-0.5F, -0.3F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.099F, 6.1902F, -4.289F, -1.0362F, 0.0386F, 0.159F));

		PartDefinition cube_r423 = jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(114, 133).addBox(-0.5F, -1.1F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1448F, 6.5923F, -3.8104F, -0.7744F, 0.0386F, 0.159F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(133, 100).addBox(-0.5F, -0.4F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1356F, 4.9995F, -3.148F, -0.8158F, 0.072F, 0.147F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(129, 40).addBox(-1.6472F, 0.048F, 0.1581F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.7006F, 2.4127F, -3.4687F, -0.7221F, 0.0386F, 0.159F));

		PartDefinition cube_r426 = jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(23, 114).addBox(-0.5F, -3.275F, -1.95F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2091F, 4.8893F, -2.1304F, -0.7831F, 0.0386F, 0.159F));

		PartDefinition cube_r427 = jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(99, 131).addBox(-0.5F, -1.575F, -1.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2091F, 4.8893F, -2.1304F, -0.5678F, 0.0034F, 0.1636F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(91, 127).addBox(-0.5F, -1.6F, -0.875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3433F, 4.074F, -2.0415F, -0.8704F, 0.0386F, 0.159F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(129, 12).addBox(-0.5F, -2.075F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1101F, 4.7078F, -5.4057F, -0.8966F, 0.0386F, 0.159F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(128, 72).addBox(-0.5F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0387F, 1.4575F, -0.5766F, -1.0481F, 0.116F, 0.1593F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(132, 49).addBox(-0.5F, -0.325F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9844F, 2.0376F, -0.2474F, 0.0777F, 0.116F, 0.1593F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(47, 132).addBox(-0.5F, -3.575F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.8175F, 2.8406F, -0.5684F, -0.5768F, 0.116F, 0.1593F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(24, 75).addBox(-0.5F, -1.8F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.9876F, 2.0836F, -0.1569F, -0.795F, 0.116F, 0.1593F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(72, 119).addBox(-0.5F, -1.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.6217F, 2.8552F, -2.0334F, -0.062F, 0.116F, 0.1593F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(128, 101).addBox(-0.5F, -0.9F, -0.875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.6273F, 2.4914F, -2.0069F, -0.9453F, 0.0502F, 0.209F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(119, 10).addBox(-0.5F, -0.15F, -1.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(1.1546F, 0.3179F, -0.4689F, -0.3992F, 0.1104F, 0.1847F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(93, 135).addBox(-0.5F, -0.5F, -1.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.0277F, 0.1608F, -1.8543F, 0.3862F, 0.1104F, 0.1847F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(42, 122).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.9553F, 0.071F, -2.6459F, -0.0938F, 0.1104F, 0.1847F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(94, 131).addBox(-0.3601F, -1.2915F, -0.4446F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.7165F, 1.1547F, -1.6973F, 0.6043F, 0.1104F, 0.1847F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(82, 103).addBox(-0.5F, -0.85F, -0.475F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9894F, 0.6706F, -1.3492F, 1.3636F, 0.1104F, 0.1847F));

		PartDefinition leftLowerbeak = jaw.addOrReplaceChild("leftLowerbeak", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0967F, 7.2264F, -4.4947F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r441 = leftLowerbeak.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(134, 82).addBox(-1.0F, 0.1047F, -1.1971F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1947F, -1.0786F, -0.0682F, -1.0559F, 0.0873F, 0.0F));

		PartDefinition cube_r442 = leftLowerbeak.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(134, 79).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4196F, -1.1315F, -1.3528F, -1.0729F, 0.0865F, 0.0114F));

		PartDefinition cube_r443 = leftLowerbeak.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(55, 128).addBox(-0.8344F, -0.0673F, 0.7249F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.1465F, -1.1728F, -2.144F, -2.1198F, 0.0852F, 0.0189F));

		PartDefinition cube_r444 = leftLowerbeak.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(134, 76).addBox(-0.7933F, -0.5894F, -0.026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(57, 134).addBox(-0.7933F, -0.5894F, 0.549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.1465F, -1.1728F, -2.144F, -1.6917F, 0.082F, 0.0299F));

		PartDefinition cube_r445 = leftLowerbeak.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(134, 42).addBox(-0.7933F, 0.1583F, 0.1221F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1465F, -1.1728F, -2.144F, -1.2118F, 0.082F, 0.0299F));

		PartDefinition cube_r446 = leftLowerbeak.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(134, 39).addBox(-0.7933F, -0.0476F, 0.5581F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-0.1465F, -1.1728F, -2.144F, -1.7354F, 0.082F, 0.0299F));

		PartDefinition cube_r447 = leftLowerbeak.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(104, 131).addBox(-0.8351F, -0.596F, -0.2574F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.216F)), PartPose.offsetAndRotation(-0.1465F, -1.1728F, -2.144F, -1.299F, 0.082F, 0.0299F));

		PartDefinition cube_r448 = leftLowerbeak.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(35, 134).addBox(-0.8344F, 0.6994F, 0.1143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.215F)), PartPose.offsetAndRotation(-0.1465F, -1.1728F, -2.144F, -1.6485F, 0.0852F, 0.0189F));

		PartDefinition cube_r449 = leftLowerbeak.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(24, 134).addBox(-1.0F, 0.0515F, -0.9483F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.102F, 0.1891F, -1.1286F, -1.5795F, 0.0873F, 0.0F));

		PartDefinition cube_r450 = leftLowerbeak.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(19, 134).addBox(-1.09F, -0.9801F, -1.0024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2403F, 0.0286F, -0.2091F, -0.8136F, 0.0343F, -0.0455F));

		PartDefinition cube_r451 = leftLowerbeak.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(134, 11).addBox(-1.09F, -0.9801F, -1.0024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.2153F, 0.2188F, -1.1905F, -1.3808F, 0.0343F, -0.0455F));

		PartDefinition rightLowerbeak = jaw.addOrReplaceChild("rightLowerbeak", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2967F, 7.2264F, -4.4947F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r452 = rightLowerbeak.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(134, 82).mirror().addBox(0.0F, 0.1047F, -1.1971F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, -1.0786F, -0.0682F, -1.0559F, -0.0873F, 0.0F));

		PartDefinition cube_r453 = rightLowerbeak.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(134, 79).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4196F, -1.1315F, -1.3528F, -1.0729F, -0.0865F, -0.0114F));

		PartDefinition cube_r454 = rightLowerbeak.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(55, 128).mirror().addBox(-0.1656F, -0.0673F, 0.7249F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.1465F, -1.1728F, -2.144F, -2.1198F, -0.0852F, -0.0189F));

		PartDefinition cube_r455 = rightLowerbeak.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(134, 76).mirror().addBox(-0.2067F, -0.5894F, -0.026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(57, 134).mirror().addBox(-0.2067F, -0.5894F, 0.549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.1465F, -1.1728F, -2.144F, -1.6917F, -0.082F, -0.0299F));

		PartDefinition cube_r456 = rightLowerbeak.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(134, 42).mirror().addBox(-0.2067F, 0.1583F, 0.1221F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1465F, -1.1728F, -2.144F, -1.2118F, -0.082F, -0.0299F));

		PartDefinition cube_r457 = rightLowerbeak.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(134, 39).mirror().addBox(-0.2067F, -0.0476F, 0.5581F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(0.1465F, -1.1728F, -2.144F, -1.7354F, -0.082F, -0.0299F));

		PartDefinition cube_r458 = rightLowerbeak.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(104, 131).mirror().addBox(-0.1649F, -0.596F, -0.2574F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.216F)).mirror(false), PartPose.offsetAndRotation(0.1465F, -1.1728F, -2.144F, -1.299F, -0.082F, -0.0299F));

		PartDefinition cube_r459 = rightLowerbeak.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(35, 134).mirror().addBox(-0.1656F, 0.6994F, 0.1143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.215F)).mirror(false), PartPose.offsetAndRotation(0.1465F, -1.1728F, -2.144F, -1.6485F, -0.0852F, -0.0189F));

		PartDefinition cube_r460 = rightLowerbeak.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(24, 134).mirror().addBox(0.0F, 0.0515F, -0.9483F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.102F, 0.1891F, -1.1286F, -1.5795F, -0.0873F, 0.0F));

		PartDefinition cube_r461 = rightLowerbeak.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(19, 134).mirror().addBox(0.09F, -0.9801F, -1.0024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2403F, 0.0286F, -0.2091F, -0.8136F, -0.0343F, 0.0455F));

		PartDefinition cube_r462 = rightLowerbeak.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(134, 11).mirror().addBox(0.09F, -0.9801F, -1.0024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2153F, 0.2188F, -1.1905F, -1.3808F, -0.0343F, 0.0455F));

		PartDefinition frill = head.addOrReplaceChild("frill", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6857F, -1.5926F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r463 = frill.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(29, 135).addBox(-0.5F, 0.2438F, -3.4614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -5.426F, 0.4162F, -2.4958F, 0.0F, 0.0F));

		PartDefinition cube_r464 = frill.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(134, 127).addBox(-0.5F, -0.9459F, -2.9048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -5.426F, 0.4162F, -2.0595F, 0.0F, 0.0F));

		PartDefinition cube_r465 = frill.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(134, 124).addBox(-0.5F, 0.2455F, -1.9653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -5.426F, 0.4162F, -2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r466 = frill.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(134, 85).addBox(-0.5F, -0.762F, -1.6638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -5.426F, 0.4162F, -1.885F, 0.0F, 0.0F));

		PartDefinition cube_r467 = frill.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(42, 118).addBox(-0.5F, -2.5198F, 0.2394F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.751F, 4.1162F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r468 = frill.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(67, 125).addBox(-0.5F, -2.7482F, -0.0347F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.651F, 2.5161F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r469 = frill.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(110, 122).addBox(-1.0F, -3.3422F, 0.1863F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.651F, 2.5161F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r470 = frill.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(62, 125).addBox(-0.5F, -3.1083F, -0.0026F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.751F, 4.1162F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r471 = frill.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(95, 41).addBox(-1.5F, -5.26F, 0.3506F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -5.426F, 0.4162F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r472 = frill.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(122, 81).addBox(-1.0F, -2.7028F, 0.1012F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.751F, 4.1162F, -0.7156F, 0.0F, 0.0F));

		PartDefinition leftFrill = frill.addOrReplaceChild("leftFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3796F, -8.2842F, 5.1672F, -0.3734F, -0.4415F, 0.3258F));

		PartDefinition cube_r473 = leftFrill.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(24, 87).addBox(-4.5F, -2.8F, -0.5F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7459F, 3.7253F, -1.64F, -0.0075F, -0.2318F, -0.9756F));

		PartDefinition cube_r474 = leftFrill.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(85, 58).addBox(-4.8F, -1.3F, 0.05F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.4483F, 3.6741F, -1.91F, -0.1718F, -0.1096F, -0.1567F));

		PartDefinition cube_r475 = leftFrill.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(95, 81).addBox(-4.8F, -0.7F, 0.05F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4483F, 3.6741F, -1.91F, -0.1617F, -0.1241F, -0.2433F));

		PartDefinition cube_r476 = leftFrill.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(132, 52).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.112F)), PartPose.offsetAndRotation(2.6868F, -4.6327F, 0.7175F, -0.282F, -0.284F, -0.0181F));

		PartDefinition cube_r477 = leftFrill.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(47, 135).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.112F)), PartPose.offsetAndRotation(3.612F, -3.7816F, 0.6235F, -0.3492F, -0.1856F, 0.0974F));

		PartDefinition cube_r478 = leftFrill.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(120, 44).addBox(-1.3648F, -0.783F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.112F)), PartPose.offsetAndRotation(4.2849F, -2.7101F, 0.4532F, -0.3083F, -0.0833F, 0.1331F));

		PartDefinition cube_r479 = leftFrill.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(63, 52).addBox(-0.6448F, -0.7949F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(4.2849F, -2.7101F, 0.4532F, -0.1533F, 0.2809F, 1.4511F));

		PartDefinition cube_r480 = leftFrill.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(96, 126).addBox(-1.3648F, -0.783F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.112F)), PartPose.offsetAndRotation(5.3849F, -1.5101F, 0.2532F, -0.3083F, -0.0833F, 0.3513F));

		PartDefinition cube_r481 = leftFrill.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(103, 126).addBox(-0.6448F, -0.7949F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(5.3849F, -1.5101F, 0.2532F, -0.1533F, 0.2809F, 1.6693F));

		PartDefinition cube_r482 = leftFrill.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(126, 9).addBox(-0.174F, -0.167F, -0.485F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(6.7351F, -0.2897F, 0.0382F, -0.0188F, 0.2424F, 1.8327F));

		PartDefinition cube_r483 = leftFrill.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(123, 98).addBox(-1.8511F, -0.1684F, -0.485F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.112F)), PartPose.offsetAndRotation(6.7217F, -0.3174F, 0.0435F, -0.2407F, 0.0341F, 0.4782F));

		PartDefinition cube_r484 = leftFrill.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(126, 6).addBox(-1.5603F, -0.6529F, -0.4721F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.112F)), PartPose.offsetAndRotation(6.8231F, 1.9296F, -0.5677F, -0.1976F, 0.1194F, 0.8406F));

		PartDefinition cube_r485 = leftFrill.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(126, 3).addBox(-0.0695F, -0.1246F, -0.4721F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(7.4373F, 1.8035F, -0.4846F, -0.0248F, 0.2291F, 1.7658F));

		PartDefinition cube_r486 = leftFrill.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(7, 124).addBox(-1.8434F, -0.0751F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.112F)), PartPose.offsetAndRotation(8.0474F, 4.7866F, -1.005F, -0.2495F, 0.1105F, 1.0495F));

		PartDefinition cube_r487 = leftFrill.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(126, 93).addBox(-0.063F, -0.1873F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(8.0084F, 4.7599F, -1.0055F, 0.0205F, 0.2717F, 2.2879F));

		PartDefinition cube_r488 = leftFrill.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(79, 123).addBox(-1.8811F, -0.1874F, -0.5223F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.112F)), PartPose.offsetAndRotation(6.9713F, 7.6496F, -1.7842F, -0.1921F, 0.1952F, 1.3906F));

		PartDefinition cube_r489 = leftFrill.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(108, 135).addBox(-0.2447F, -0.7254F, -0.5223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(6.4768F, 7.537F, -1.8372F, 0.2504F, 0.1099F, -2.94F));

		PartDefinition cube_r490 = leftFrill.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(135, 103).addBox(-0.45F, -0.5928F, -0.5223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(6.4768F, 7.537F, -1.8372F, 0.0534F, 0.2678F, 2.3766F));

		PartDefinition cube_r491 = leftFrill.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(86, 123).addBox(-1.1F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.8026F, 8.0381F, -2.0205F, -0.142F, 0.2332F, 1.7885F));

		PartDefinition cube_r492 = leftFrill.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(84, 128).addBox(-0.1F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(6.5534F, 7.434F, -1.7533F, 0.0326F, 0.2705F, 2.4641F));

		PartDefinition cube_r493 = leftFrill.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(108, 20).addBox(-1.6F, -0.7F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(6.3365F, 5.8173F, -1.4719F, -0.121F, 0.2447F, 1.8775F));

		PartDefinition cube_r494 = leftFrill.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(115, 113).addBox(-2.2F, -0.8F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1392F, -0.7798F, -0.0087F, -0.2896F, 0.1742F, 1.0191F));

		PartDefinition cube_r495 = leftFrill.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(40, 109).addBox(-2.7F, 1.2F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(7.9879F, 1.7498F, -0.2937F, -0.1839F, 0.2117F, 1.3267F));

		PartDefinition cube_r496 = leftFrill.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(103, 104).addBox(-1.7F, -1.0F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(6.2115F, 3.6394F, -1.0105F, -0.1839F, 0.2117F, 1.3267F));

		PartDefinition cube_r497 = leftFrill.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(113, 87).addBox(-2.0F, -1.45F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.9573F, -2.6532F, 0.1316F, -0.3723F, 0.0766F, 0.7573F));

		PartDefinition cube_r498 = leftFrill.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(131, 111).addBox(-0.4F, -1.825F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0692F, -3.862F, 0.1362F, -0.3567F, 0.0136F, 0.5552F));

		PartDefinition cube_r499 = leftFrill.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(42, 129).addBox(-0.6022F, -2.0356F, -0.9702F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.5984F, -5.3954F, 1.2536F, -0.1809F, 0.1742F, 0.2507F));

		PartDefinition cube_r500 = leftFrill.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(125, 63).addBox(-1.357F, -2.0222F, -0.9702F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.5984F, -5.3954F, 1.2536F, -0.1651F, 0.1892F, 0.3381F));

		PartDefinition cube_r501 = leftFrill.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(129, 84).addBox(-1.9088F, -3.4991F, -0.92F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.5984F, -5.3954F, 1.2536F, -0.1542F, 0.1627F, 0.6439F));

		PartDefinition cube_r502 = leftFrill.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(129, 76).addBox(-1.2974F, -3.5626F, -0.92F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.5984F, -5.3954F, 1.2536F, -0.1678F, 0.1487F, 0.5567F));

		PartDefinition cube_r503 = leftFrill.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(14, 132).addBox(-0.8506F, -3.7757F, -0.1388F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.4984F, -9.0954F, 1.2536F, -0.0973F, 0.284F, 1.123F));

		PartDefinition cube_r504 = leftFrill.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(109, 131).addBox(-0.4024F, -1.9179F, -0.1388F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.4984F, -9.0954F, 1.2536F, -0.1686F, 0.2491F, 0.854F));

		PartDefinition cube_r505 = leftFrill.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(129, 80).addBox(-0.1089F, -1.8638F, -0.1388F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.4984F, -9.0954F, 1.2536F, -0.1897F, 0.2335F, 0.7656F));

		PartDefinition cube_r506 = leftFrill.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(131, 107).addBox(-0.8417F, -1.3642F, -0.4669F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.0259F, -5.6963F, 0.9644F, -0.3685F, -0.3328F, -1.3265F));

		PartDefinition cube_r507 = leftFrill.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(113, 83).addBox(-1.5F, -0.1F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.8979F, 2.0121F, -1.2596F, -0.0862F, -0.2712F, -0.9229F));

		PartDefinition cube_r508 = leftFrill.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(108, 6).addBox(-0.6F, -0.2F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(4.0962F, -0.1277F, -0.4689F, 0.3455F, -0.1438F, -2.2921F));

		PartDefinition cube_r509 = leftFrill.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(54, 118).addBox(-1.5F, -0.7F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(3.9691F, 0.3377F, -0.6339F, 0.2398F, -0.2822F, -1.6445F));

		PartDefinition cube_r510 = leftFrill.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(67, 108).addBox(-4.0F, -0.6F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.4807F, -0.7956F, -0.6095F, -0.149F, -0.3044F, -1.5807F));

		PartDefinition cube_r511 = leftFrill.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(116, 62).addBox(-1.0F, -1.6F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.4807F, -0.7956F, -0.6095F, -0.2003F, -0.274F, -1.4013F));

		PartDefinition cube_r512 = leftFrill.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(96, 122).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5163F, -4.0215F, 0.4287F, -0.2911F, 0.2956F, 0.5406F));

		PartDefinition cube_r513 = leftFrill.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(113, 79).addBox(-1.5F, -1.3F, -0.4F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1135F, -2.9427F, -0.0875F, -0.374F, -0.0621F, -0.4719F));

		PartDefinition cube_r514 = leftFrill.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(122, 89).addBox(-1.5F, -2.2F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(1.6505F, -2.2074F, -0.2964F, -0.357F, -0.0163F, 0.3033F));

		PartDefinition cube_r515 = leftFrill.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(122, 85).addBox(-1.95F, -0.15F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6705F, -5.47F, 0.6903F, -0.2064F, 0.1385F, 0.1227F));

		PartDefinition rightFrill = frill.addOrReplaceChild("rightFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3796F, -8.2842F, 5.1672F, -0.3734F, 0.4415F, -0.3258F));

		PartDefinition cube_r516 = rightFrill.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(24, 87).mirror().addBox(-0.5F, -2.8F, -0.5F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7459F, 3.7253F, -1.64F, -0.0075F, 0.2318F, 0.9756F));

		PartDefinition cube_r517 = rightFrill.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(85, 58).mirror().addBox(1.8F, -1.3F, 0.05F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.4483F, 3.6741F, -1.91F, -0.1718F, 0.1096F, 0.1567F));

		PartDefinition cube_r518 = rightFrill.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(95, 81).mirror().addBox(0.8F, -0.7F, 0.05F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4483F, 3.6741F, -1.91F, -0.1617F, 0.1241F, 0.2433F));

		PartDefinition cube_r519 = rightFrill.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(132, 52).mirror().addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.112F)).mirror(false), PartPose.offsetAndRotation(-2.6868F, -4.6327F, 0.7175F, -0.282F, 0.284F, 0.0181F));

		PartDefinition cube_r520 = rightFrill.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(47, 135).mirror().addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.112F)).mirror(false), PartPose.offsetAndRotation(-3.612F, -3.7816F, 0.6235F, -0.3492F, 0.1856F, -0.0974F));

		PartDefinition cube_r521 = rightFrill.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(120, 44).mirror().addBox(-0.6352F, -0.783F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.112F)).mirror(false), PartPose.offsetAndRotation(-4.2849F, -2.7101F, 0.4532F, -0.3083F, 0.0833F, -0.1331F));

		PartDefinition cube_r522 = rightFrill.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(63, 52).mirror().addBox(-1.3552F, -0.7949F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-4.2849F, -2.7101F, 0.4532F, -0.1533F, -0.2809F, -1.4511F));

		PartDefinition cube_r523 = rightFrill.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(96, 126).mirror().addBox(-0.6352F, -0.783F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.112F)).mirror(false), PartPose.offsetAndRotation(-5.3849F, -1.5101F, 0.2532F, -0.3083F, 0.0833F, -0.3513F));

		PartDefinition cube_r524 = rightFrill.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(103, 126).mirror().addBox(-1.3552F, -0.7949F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-5.3849F, -1.5101F, 0.2532F, -0.1533F, -0.2809F, -1.6693F));

		PartDefinition cube_r525 = rightFrill.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(126, 9).mirror().addBox(-1.826F, -0.167F, -0.485F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-6.7351F, -0.2897F, 0.0382F, -0.0188F, -0.2424F, -1.8327F));

		PartDefinition cube_r526 = rightFrill.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(123, 98).mirror().addBox(-0.1489F, -0.1684F, -0.485F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.112F)).mirror(false), PartPose.offsetAndRotation(-6.7217F, -0.3174F, 0.0435F, -0.2407F, -0.0341F, -0.4782F));

		PartDefinition cube_r527 = rightFrill.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(126, 6).mirror().addBox(-0.4397F, -0.6529F, -0.4721F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.112F)).mirror(false), PartPose.offsetAndRotation(-6.8231F, 1.9296F, -0.5677F, -0.1976F, -0.1194F, -0.8406F));

		PartDefinition cube_r528 = rightFrill.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(126, 3).mirror().addBox(-1.9305F, -0.1246F, -0.4721F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-7.4373F, 1.8035F, -0.4846F, -0.0248F, -0.2291F, -1.7658F));

		PartDefinition cube_r529 = rightFrill.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(7, 124).mirror().addBox(-0.1566F, -0.0751F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.112F)).mirror(false), PartPose.offsetAndRotation(-8.0474F, 4.7866F, -1.005F, -0.2495F, -0.1105F, -1.0495F));

		PartDefinition cube_r530 = rightFrill.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(126, 93).mirror().addBox(-1.937F, -0.1873F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-8.0084F, 4.7599F, -1.0055F, 0.0205F, -0.2717F, -2.2879F));

		PartDefinition cube_r531 = rightFrill.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(79, 123).mirror().addBox(-0.1189F, -0.1874F, -0.5223F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.112F)).mirror(false), PartPose.offsetAndRotation(-6.9713F, 7.6496F, -1.7842F, -0.1921F, -0.1952F, -1.3906F));

		PartDefinition cube_r532 = rightFrill.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(108, 135).mirror().addBox(-0.7553F, -0.7254F, -0.5223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.115F)).mirror(false), PartPose.offsetAndRotation(-6.4768F, 7.537F, -1.8372F, 0.2504F, -0.1099F, 2.94F));

		PartDefinition cube_r533 = rightFrill.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(135, 103).mirror().addBox(-0.55F, -0.5928F, -0.5223F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-6.4768F, 7.537F, -1.8372F, 0.0534F, -0.2678F, -2.3766F));

		PartDefinition cube_r534 = rightFrill.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(86, 123).mirror().addBox(0.1F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.8026F, 8.0381F, -2.0205F, -0.142F, -0.2332F, -1.7885F));

		PartDefinition cube_r535 = rightFrill.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(84, 128).mirror().addBox(-0.9F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-6.5534F, 7.434F, -1.7533F, 0.0326F, -0.2705F, -2.4641F));

		PartDefinition cube_r536 = rightFrill.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(108, 20).mirror().addBox(-1.4F, -0.7F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-6.3365F, 5.8173F, -1.4719F, -0.121F, -0.2447F, -1.8775F));

		PartDefinition cube_r537 = rightFrill.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(115, 113).mirror().addBox(-0.8F, -0.8F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.1392F, -0.7798F, -0.0087F, -0.2896F, -0.1742F, -1.0191F));

		PartDefinition cube_r538 = rightFrill.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(40, 109).mirror().addBox(-0.3F, 1.2F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-7.9879F, 1.7498F, -0.2937F, -0.1839F, -0.2117F, -1.3267F));

		PartDefinition cube_r539 = rightFrill.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(103, 104).mirror().addBox(-1.3F, -1.0F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-6.2115F, 3.6394F, -1.0105F, -0.1839F, -0.2117F, -1.3267F));

		PartDefinition cube_r540 = rightFrill.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(113, 87).mirror().addBox(-1.0F, -1.45F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.9573F, -2.6532F, 0.1316F, -0.3723F, -0.0766F, -0.7573F));

		PartDefinition cube_r541 = rightFrill.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(131, 111).mirror().addBox(-0.6F, -1.825F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0692F, -3.862F, 0.1362F, -0.3567F, -0.0136F, -0.5552F));

		PartDefinition cube_r542 = rightFrill.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(42, 129).mirror().addBox(-0.3978F, -2.0356F, -0.9702F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5984F, -5.3954F, 1.2536F, -0.1809F, -0.1742F, -0.2507F));

		PartDefinition cube_r543 = rightFrill.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(125, 63).mirror().addBox(0.357F, -2.0222F, -0.9702F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5984F, -5.3954F, 1.2536F, -0.1651F, -0.1892F, -0.3381F));

		PartDefinition cube_r544 = rightFrill.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(129, 84).mirror().addBox(0.9088F, -3.4991F, -0.92F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5984F, -5.3954F, 1.2536F, -0.1542F, -0.1627F, -0.6439F));

		PartDefinition cube_r545 = rightFrill.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(129, 76).mirror().addBox(0.2974F, -3.5626F, -0.92F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5984F, -5.3954F, 1.2536F, -0.1678F, -0.1487F, -0.5567F));

		PartDefinition cube_r546 = rightFrill.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(14, 132).mirror().addBox(-0.1494F, -3.7757F, -0.1388F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.4984F, -9.0954F, 1.2536F, -0.0973F, -0.284F, -1.123F));

		PartDefinition cube_r547 = rightFrill.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(109, 131).mirror().addBox(-0.5976F, -1.9179F, -0.1388F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.4984F, -9.0954F, 1.2536F, -0.1686F, -0.2491F, -0.854F));

		PartDefinition cube_r548 = rightFrill.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(129, 80).mirror().addBox(-0.8911F, -1.8638F, -0.1388F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.4984F, -9.0954F, 1.2536F, -0.1897F, -0.2335F, -0.7656F));

		PartDefinition cube_r549 = rightFrill.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(131, 107).mirror().addBox(-0.1583F, -1.3642F, -0.4669F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0259F, -5.6963F, 0.9644F, -0.3685F, 0.3328F, 1.3265F));

		PartDefinition cube_r550 = rightFrill.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(113, 83).mirror().addBox(-1.5F, -0.1F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.8979F, 2.0121F, -1.2596F, -0.0862F, 0.2712F, 0.9229F));

		PartDefinition cube_r551 = rightFrill.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(108, 6).mirror().addBox(-3.4F, -0.2F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-4.0962F, -0.1277F, -0.4689F, 0.3455F, 0.1438F, 2.2921F));

		PartDefinition cube_r552 = rightFrill.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(54, 118).mirror().addBox(-1.5F, -0.7F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-3.9691F, 0.3377F, -0.6339F, 0.2398F, 0.2822F, 1.6445F));

		PartDefinition cube_r553 = rightFrill.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(67, 108).mirror().addBox(0.0F, -0.6F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(0.4807F, -0.7956F, -0.6095F, -0.149F, 0.3044F, 1.5807F));

		PartDefinition cube_r554 = rightFrill.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(116, 62).mirror().addBox(-2.0F, -1.6F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(0.4807F, -0.7956F, -0.6095F, -0.2003F, 0.274F, 1.4013F));

		PartDefinition cube_r555 = rightFrill.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(96, 122).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.5163F, -4.0215F, 0.4287F, -0.2911F, -0.2956F, -0.5406F));

		PartDefinition cube_r556 = rightFrill.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(113, 79).mirror().addBox(-1.5F, -1.3F, -0.4F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1135F, -2.9427F, -0.0875F, -0.374F, 0.0621F, 0.4719F));

		PartDefinition cube_r557 = rightFrill.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(122, 89).mirror().addBox(-0.5F, -2.2F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-1.6505F, -2.2074F, -0.2964F, -0.357F, 0.0163F, -0.3033F));

		PartDefinition cube_r558 = rightFrill.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(122, 85).mirror().addBox(-0.05F, -0.15F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6705F, -5.47F, 0.6903F, -0.2064F, -0.1385F, -0.1227F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 31).addBox(-1.0F, -0.1962F, 0.0069F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.004F))
				.texOffs(131, 47).addBox(1.0F, 0.8039F, 2.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(114, 131).addBox(0.8F, 0.8039F, 4.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 120).addBox(0.6F, 0.8039F, 6.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 122).addBox(0.5F, 0.8039F, 8.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 47).mirror().addBox(-3.0F, 0.8039F, 2.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(114, 131).mirror().addBox(-2.8F, 0.8039F, 4.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(131, 120).mirror().addBox(-2.6F, 0.8039F, 6.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(131, 122).mirror().addBox(-2.5F, 0.8039F, 8.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0994F, 6.3032F, -0.4542F, -0.0392F, 0.0191F));

		PartDefinition cube_r559 = tail.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(13, 136).addBox(0.0F, -3.4783F, 1.4815F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(135, 135).addBox(0.0F, -2.8783F, -0.4185F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7301F, 6.0938F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r560 = tail.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(52, 135).addBox(0.0F, -0.0541F, -0.0285F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8972F, 8.3283F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r561 = tail.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(62, 134).addBox(0.0F, 0.0616F, -0.0148F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7972F, 6.0282F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r562 = tail.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(132, 135).addBox(0.0F, -0.1585F, -0.0752F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1035F, 4.0702F, 0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r563 = tail.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(10, 134).addBox(0.0F, -2.1473F, -0.0968F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2081F, 4.2394F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r564 = tail.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(75, 132).addBox(0.0F, -4.482F, 1.192F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7357F, 0.4245F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r565 = tail.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(49, 109).addBox(0.0F, -3.982F, -0.808F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7357F, 0.4245F, -0.1222F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(29, 16).addBox(-1.0F, -1.1697F, -0.1085F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(0, 132).addBox(0.3F, -0.1697F, 0.8915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 132).addBox(0.1F, -0.1697F, 2.8915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 49).addBox(1.0F, -0.1697F, 4.8915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(101, 79).addBox(0.8F, -0.1697F, 6.8915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 132).mirror().addBox(-2.3F, -0.1697F, 0.8915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(7, 132).mirror().addBox(-2.1F, -0.1697F, 2.8915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(99, 49).mirror().addBox(-2.0F, -0.1697F, 4.8915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(101, 79).mirror().addBox(-1.8F, -0.1697F, 6.8915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9361F, 8.8961F, -0.0142F, -0.0888F, -0.0857F));

		PartDefinition cube_r566 = tail2.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(136, 130).addBox(0.0F, -4.1544F, 7.2508F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 110).addBox(0.0F, -3.8544F, 5.2508F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 106).addBox(0.0F, -3.6544F, 3.2508F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 88).addBox(0.0F, -3.6544F, 1.2508F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7791F, 1.3414F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r567 = tail2.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(43, 136).addBox(0.0F, 4.5024F, 10.8768F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 136).addBox(0.0F, 3.4024F, 8.8768F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 136).addBox(0.0F, 2.3024F, 6.8768F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(135, 55).addBox(0.0F, 0.3024F, 4.8768F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5469F, -2.2129F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r568 = tail2.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(136, 14).addBox(0.0F, -1.8547F, 0.0262F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0209F, 0.8414F, -0.2443F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, -0.203F, -0.0166F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.9272F, 9.6761F, 0.3159F, -0.028F, -0.055F));

		PartDefinition cube_r569 = tail3.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(6, 137).addBox(0.0F, 9.7423F, 17.0451F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(116, 136).addBox(0.0F, 7.8423F, 15.4451F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4559F, -11.8198F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r570 = tail3.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(136, 114).addBox(0.0F, 0.3186F, -0.1258F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6559F, 3.0802F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r571 = tail3.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(113, 136).addBox(0.0F, 0.0606F, -0.0133F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8559F, 1.1802F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r572 = tail3.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(3, 137).addBox(0.0F, -2.3976F, 1.1233F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6881F, 1.6345F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r573 = tail3.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(0, 137).addBox(0.0F, -0.7849F, -0.0497F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2119F, 1.0345F, -0.3403F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.2532F, -0.1914F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0741F, 8.8502F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r574 = tail4.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(25, 137).addBox(0.0F, 8.4206F, 15.884F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 137).addBox(0.0F, 10.8574F, 19.2002F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 137).addBox(0.0F, 9.739F, 17.5421F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.501F, -17.6618F, 0.6807F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 144, 144);
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