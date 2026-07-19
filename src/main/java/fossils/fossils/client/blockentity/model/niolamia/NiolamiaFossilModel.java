package fossils.fossils.client.blockentity.model.niolamia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class NiolamiaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Waluchelys;
	private final ModelPart frontleftleg4;
	private final ModelPart frontleftleg5;
	private final ModelPart frontleftleg6;
	private final ModelPart frontrightleg4;
	private final ModelPart frontrightleg5;
	private final ModelPart frontrightleg6;
	private final ModelPart chest;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart frontleftleg;
	private final ModelPart frontleftleg2;
	private final ModelPart frontleftleg3;
	private final ModelPart frontrightleg;
	private final ModelPart frontrightleg2;
	private final ModelPart frontrightleg3;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart lowerjaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart leftCarapace;
	private final ModelPart rightCarapace;

	public NiolamiaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Waluchelys = this.fossil.getChild("Waluchelys");
		this.frontleftleg4 = this.Waluchelys.getChild("frontleftleg4");
		this.frontleftleg5 = this.frontleftleg4.getChild("frontleftleg5");
		this.frontleftleg6 = this.frontleftleg5.getChild("frontleftleg6");
		this.frontrightleg4 = this.Waluchelys.getChild("frontrightleg4");
		this.frontrightleg5 = this.frontrightleg4.getChild("frontrightleg5");
		this.frontrightleg6 = this.frontrightleg5.getChild("frontrightleg6");
		this.chest = this.Waluchelys.getChild("chest");
		this.bone = this.chest.getChild("bone");
		this.bone2 = this.chest.getChild("bone2");
		this.frontleftleg = this.chest.getChild("frontleftleg");
		this.frontleftleg2 = this.frontleftleg.getChild("frontleftleg2");
		this.frontleftleg3 = this.frontleftleg2.getChild("frontleftleg3");
		this.frontrightleg = this.chest.getChild("frontrightleg");
		this.frontrightleg2 = this.frontrightleg.getChild("frontrightleg2");
		this.frontrightleg3 = this.frontrightleg2.getChild("frontrightleg3");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.lowerjaw = this.head.getChild("lowerjaw");
		this.tail = this.Waluchelys.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.leftCarapace = this.Waluchelys.getChild("leftCarapace");
		this.rightCarapace = this.Waluchelys.getChild("rightCarapace");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Waluchelys = fossil.addOrReplaceChild("Waluchelys", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -1.2F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, -2.5F, 0.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r1 = Waluchelys.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(45, 11).addBox(-1.6939F, -6.5F, -5.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6939F, 5.3F, 6.7391F, 0.0F, -0.0087F, 0.0F));

		PartDefinition cube_r2 = Waluchelys.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(13, 21).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4681F, -7.3787F, -0.1752F, 0.0859F, -0.0152F));

		PartDefinition cube_r3 = Waluchelys.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(17, 10).addBox(-1.0F, -0.5F, -1.4F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -1.225F, -6.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Waluchelys.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(70, 90).addBox(1.3F, -0.025F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(3.3478F, -4.5781F, 8.1766F, -2.3413F, 0.6927F, 0.2504F));

		PartDefinition cube_r5 = Waluchelys.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(24, 29).addBox(-2.0F, -5.0F, 0.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.5F, -8.5203F, 5.0073F, -2.3126F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Waluchelys.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 38).addBox(-2.0F, -3.0F, 0.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -9.8119F, 2.2995F, -2.0159F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Waluchelys.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(20, 41).addBox(-2.0F, -3.0F, 0.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.5F, -10.2294F, -0.6713F, -1.7104F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Waluchelys.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(37, 20).addBox(-2.0F, -3.0F, 0.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -9.994F, -3.662F, -1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Waluchelys.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(20, 36).addBox(-2.0F, -3.0F, 0.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.5F, -8.8702F, -6.4436F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Waluchelys.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(9, 54).addBox(-1.5F, -1.0F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -6.7675F, -8.5833F, -2.6704F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Waluchelys.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(34, 15).addBox(-2.0F, -3.0F, 0.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -6.7675F, -8.5833F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Waluchelys.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(31, 41).addBox(-1.5F, -0.3F, -0.35F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(-0.5F, -4.8619F, 8.655F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r13 = Waluchelys.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(18, 46).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -8.9405F, -3.809F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r14 = Waluchelys.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(31, 45).addBox(-0.5F, -0.2F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, -9.2256F, -0.7959F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r15 = Waluchelys.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(78, 25).mirror().addBox(-2.0F, -0.5F, 0.9F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 25).addBox(0.0F, -0.5F, 0.9F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 92).addBox(0.1F, -1.4F, 0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 43).addBox(-0.5F, -1.0F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.6776F, 6.1461F, -0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r16 = Waluchelys.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(32, 92).addBox(0.0F, -0.3F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 62).addBox(-0.5F, 0.1F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, -6.0556F, 6.2089F, -1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r17 = Waluchelys.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(68, 49).addBox(-0.5F, 0.1F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -7.6316F, 4.9776F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r18 = Waluchelys.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(27, 50).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, -8.7607F, 2.1696F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r19 = Waluchelys.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(44, 29).addBox(-0.5F, -0.3F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -8.9192F, 0.8792F, -0.1222F, 0.0F, 0.0F));

		PartDefinition frontleftleg4 = Waluchelys.addOrReplaceChild("frontleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3331F, -1.7778F, 6.6051F, -0.0953F, 0.1555F, -0.6617F));

		PartDefinition cube_r20 = frontleftleg4.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(65, 58).addBox(4.2F, -1.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F))
				.texOffs(54, 0).addBox(1.2F, -1.4F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(49, 65).addBox(0.2F, -1.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.8867F, 0.8825F, 0.0F, 0.0372F, 0.0661F, 0.6125F));

		PartDefinition cube_r21 = frontleftleg4.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(91, 32).addBox(-0.475F, -0.5F, -1.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 3).addBox(-0.4F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2839F, 2.7366F, -0.8303F, 3.1003F, 0.4571F, -2.5497F));

		PartDefinition cube_r22 = frontleftleg4.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(87, 0).addBox(-1.075F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2001F, 0.5469F, -0.0796F, 3.0881F, 0.8058F, -2.5701F));

		PartDefinition cube_r23 = frontleftleg4.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(56, 65).addBox(0.4F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2001F, 0.5469F, -0.0796F, 0.0667F, 0.9814F, 0.6656F));

		PartDefinition frontleftleg5 = frontleftleg4.addOrReplaceChild("frontleftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(3.298F, 2.6691F, -0.9986F, -0.3944F, -0.8555F, 0.8358F));

		PartDefinition cube_r24 = frontleftleg5.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(45, 16).addBox(-1.95F, -0.5F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(48, 19).addBox(-2.05F, -1.4F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.75F, -1.2F, 0.0126F, 0.3007F, 1.6251F));

		PartDefinition frontleftleg6 = frontleftleg5.addOrReplaceChild("frontleftleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5085F, 3.2017F, -0.7034F, 0.2963F, 0.4134F, -0.0031F));

		PartDefinition cube_r25 = frontleftleg6.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(26, 21).addBox(1.2743F, -1.4713F, -2.7024F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0697F, -1.2466F, -0.9564F, 0.0F, 0.0F, 1.5708F));

		PartDefinition frontrightleg4 = Waluchelys.addOrReplaceChild("frontrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3331F, -1.7778F, 6.6051F, -0.0953F, -0.1555F, 0.6617F));

		PartDefinition cube_r26 = frontrightleg4.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(72, 12).addBox(-5.2F, -1.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F))
				.texOffs(56, 16).addBox(-4.2F, -1.4F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(71, 19).addBox(-1.2F, -1.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.8867F, 0.8825F, 0.0F, 0.0372F, -0.0661F, -0.6125F));

		PartDefinition cube_r27 = frontrightleg4.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(91, 35).addBox(-0.525F, -0.5F, -1.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 48).addBox(-0.6F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2839F, 2.7366F, -0.8303F, 3.1003F, -0.4571F, 2.5497F));

		PartDefinition cube_r28 = frontrightleg4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(90, 45).addBox(0.075F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2001F, 0.5469F, -0.0796F, 3.0881F, -0.8058F, 2.5701F));

		PartDefinition cube_r29 = frontrightleg4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(71, 23).addBox(-1.4F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2001F, 0.5469F, -0.0796F, 0.0667F, -0.9814F, -0.6656F));

		PartDefinition frontrightleg5 = frontrightleg4.addOrReplaceChild("frontrightleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.298F, 2.6691F, -0.9986F, -0.3944F, 0.8555F, -0.8358F));

		PartDefinition cube_r30 = frontrightleg5.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 48).addBox(-2.05F, -0.5F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 51).addBox(-1.95F, -1.4F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.75F, -1.2F, 0.0126F, -0.3007F, -1.6251F));

		PartDefinition frontrightleg6 = frontrightleg5.addOrReplaceChild("frontrightleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5085F, 3.2017F, -0.7034F, 0.2963F, -0.4134F, 0.0031F));

		PartDefinition cube_r31 = frontrightleg6.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(13, 28).addBox(-2.2743F, -1.4713F, -2.7024F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0697F, -1.2466F, -0.9564F, 0.0F, 0.0F, -1.5708F));

		PartDefinition chest = Waluchelys.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -7.3016F, -6.2428F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r32 = chest.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(23, 51).addBox(0.0F, -0.7F, -2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 50).addBox(0.0F, -1.1F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 32).addBox(-0.5F, -0.1F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2F, -1.5F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r33 = chest.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(70, 47).addBox(0.4963F, -0.0487F, -0.5365F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 0.9941F, -3.1794F, 0.2373F, -0.0944F, 0.322F));

		PartDefinition cube_r34 = chest.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(62, 31).addBox(0.4963F, -0.0487F, -0.5365F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.3941F, -1.2794F, 0.2373F, -0.0944F, 0.0776F));

		PartDefinition cube_r35 = chest.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(48, 27).addBox(2.0418F, -2.5888F, -0.5365F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.3941F, -1.2794F, -0.0201F, -0.2543F, 1.3568F));

		PartDefinition cube_r36 = chest.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(44, 34).addBox(1.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.3941F, -1.2794F, 0.1319F, -0.219F, 0.7289F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1043F, 3.6111F, -2.6926F, -0.2256F, 0.2555F, -0.0579F));

		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(40, 80).addBox(-0.5023F, -0.6551F, -0.9032F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5419F, 1.4654F, 3.177F, 0.9315F, -0.8664F, 0.0813F));

		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(80, 46).addBox(-0.4387F, -0.6359F, -0.9032F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5419F, 1.4654F, 3.177F, 1.1067F, -0.5295F, -0.1865F));

		PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(54, 77).addBox(-0.0098F, -0.7726F, -1.4615F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.329F, 0.0385F, 0.6329F));

		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(75, 47).addBox(-1.0152F, -2.5264F, -0.6274F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3367F, -0.9497F, 2.2099F, 0.371F, -0.026F, -0.3935F));

		PartDefinition cube_r41 = bone.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(79, 58).addBox(-0.5F, -1.4394F, -0.3026F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9563F, 0.8477F, 2.6014F, 0.5465F, -0.6102F, -0.078F));

		PartDefinition cube_r42 = bone.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(49, 77).addBox(-0.3405F, 0.1924F, -1.2466F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9108F, -0.5197F, 2.7123F, -0.5114F, 0.1898F, 0.1805F));

		PartDefinition cube_r43 = bone.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(18, 51).addBox(-0.4217F, -4.5724F, -0.3099F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2297F, -0.056F, 0.2516F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1043F, 3.6111F, -2.6926F, -0.2256F, -0.2555F, 0.0579F));

		PartDefinition cube_r44 = bone2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(40, 80).mirror().addBox(-0.4977F, -0.6551F, -0.9032F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5419F, 1.4654F, 3.177F, 0.9315F, 0.8664F, -0.0813F));

		PartDefinition cube_r45 = bone2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(80, 46).mirror().addBox(-0.5613F, -0.6359F, -0.9032F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5419F, 1.4654F, 3.177F, 1.1067F, 0.5295F, 0.1865F));

		PartDefinition cube_r46 = bone2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(54, 77).mirror().addBox(-0.9902F, -0.7726F, -1.4615F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.329F, -0.0385F, -0.6329F));

		PartDefinition cube_r47 = bone2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(75, 47).mirror().addBox(0.0152F, -2.5264F, -0.6274F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3367F, -0.9497F, 2.2099F, 0.371F, 0.026F, 0.3935F));

		PartDefinition cube_r48 = bone2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(79, 58).mirror().addBox(-0.5F, -1.4394F, -0.3026F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9563F, 0.8477F, 2.6014F, 0.5465F, 0.6102F, 0.078F));

		PartDefinition cube_r49 = bone2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(49, 77).mirror().addBox(-0.6595F, 0.1924F, -1.2466F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9108F, -0.5197F, 2.7123F, -0.5114F, -0.1898F, -0.1805F));

		PartDefinition cube_r50 = bone2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(18, 51).mirror().addBox(-0.5783F, -4.5724F, -0.3099F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2297F, 0.056F, -0.2516F));

		PartDefinition frontleftleg = chest.addOrReplaceChild("frontleftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8269F, 4.2487F, -1.6515F, -0.4166F, -0.2696F, -0.3699F));

		PartDefinition cube_r51 = frontleftleg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(58, 61).addBox(4.2F, -1.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F))
				.texOffs(34, 6).addBox(1.2F, -1.4F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(61, 54).addBox(0.2F, -1.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.8867F, 0.8825F, 0.0F, 0.0372F, 0.0661F, 0.6125F));

		PartDefinition cube_r52 = frontleftleg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(10, 91).addBox(-0.475F, -0.5F, -1.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 85).addBox(-0.4F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2839F, 2.7366F, -0.8303F, 3.1003F, 0.4571F, -2.5497F));

		PartDefinition cube_r53 = frontleftleg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(84, 81).addBox(-1.075F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2001F, 0.5469F, -0.0796F, 3.0881F, 0.8058F, -2.5701F));

		PartDefinition cube_r54 = frontleftleg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(35, 61).addBox(0.4F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2001F, 0.5469F, -0.0796F, 0.0667F, 0.9814F, 0.6656F));

		PartDefinition frontleftleg2 = frontleftleg.addOrReplaceChild("frontleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9854F, 3.2963F, -0.5424F, 0.2059F, -0.551F, 0.3102F));

		PartDefinition cube_r55 = frontleftleg2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(52, 8).addBox(-1.95F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(36, 53).addBox(-2.05F, -1.4F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.75F, -1.2F, 0.0126F, 0.3007F, 1.6251F));

		PartDefinition frontleftleg3 = frontleftleg2.addOrReplaceChild("frontleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6987F, 2.5754F, -0.5679F, -0.2199F, 0.5455F, 0.011F));

		PartDefinition cube_r56 = frontleftleg3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(35, 29).addBox(1.25F, -1.5F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0697F, -1.2466F, -0.9564F, 0.0F, 0.0F, 1.5708F));

		PartDefinition frontrightleg = chest.addOrReplaceChild("frontrightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8269F, 4.2487F, -1.6515F, -0.4166F, 0.2696F, 0.3699F));

		PartDefinition cube_r57 = frontrightleg.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(62, 27).addBox(-5.2F, -1.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F))
				.texOffs(51, 42).addBox(-4.2F, -1.4F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(7, 62).addBox(-1.2F, -1.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.8867F, 0.8825F, 0.0F, 0.0372F, -0.0661F, -0.6125F));

		PartDefinition cube_r58 = frontrightleg.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(15, 91).addBox(-0.525F, -0.5F, -1.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 85).addBox(-0.6F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2839F, 2.7366F, -0.8303F, 3.1003F, -0.4571F, 2.5497F));

		PartDefinition cube_r59 = frontrightleg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 85).addBox(0.075F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2001F, 0.5469F, -0.0796F, 3.0881F, -0.8058F, 2.5701F));

		PartDefinition cube_r60 = frontrightleg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(61, 50).addBox(-1.4F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2001F, 0.5469F, -0.0796F, 0.0667F, -0.9814F, -0.6656F));

		PartDefinition frontrightleg2 = frontrightleg.addOrReplaceChild("frontrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9854F, 3.2963F, -0.5424F, 0.2059F, 0.551F, -0.3102F));

		PartDefinition cube_r61 = frontrightleg2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(53, 30).addBox(-1.05F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 54).addBox(-0.95F, -1.4F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.75F, -1.2F, 0.0126F, -0.3007F, -1.6251F));

		PartDefinition frontrightleg3 = frontrightleg2.addOrReplaceChild("frontrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6987F, 2.5754F, -0.5679F, -0.2199F, -0.5455F, -0.011F));

		PartDefinition cube_r62 = frontrightleg3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(11, 36).addBox(-2.25F, -1.5F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0697F, -1.2466F, -0.9564F, 0.0F, 0.0F, -1.5708F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 1.4509F, -3.506F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r63 = neck.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(61, 58).addBox(-0.5F, -0.3F, 1.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 66).addBox(-1.0F, 0.3F, 1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -3.45F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r64 = neck.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(90, 24).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4274F, -1.401F, 0.258F, -0.1293F, 0.4544F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9906F, -1.6125F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r65 = neck2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(51, 57).addBox(-0.5F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 0).addBox(-1.0F, -0.3F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.9F, -2.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r66 = neck2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(79, 63).addBox(-0.6F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.1F, -0.6488F, -1.5236F, -0.0898F, -0.0539F, -0.5386F));

		PartDefinition cube_r67 = neck2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(79, 17).addBox(-0.4F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.1F, -0.6488F, -1.5236F, -0.0898F, 0.0539F, 0.5386F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(-0.5F, -0.9998F, -1.8633F));

		PartDefinition cube_r68 = head.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(77, 43).addBox(-1.492F, -0.2F, -0.825F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.492F, -1.3558F, -1.7686F, 2.2558F, 0.0F, 0.0F));

		PartDefinition cube_r69 = head.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(35, 77).addBox(-1.492F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.492F, -1.3992F, -1.8586F, 1.1214F, 0.0F, 0.0F));

		PartDefinition cube_r70 = head.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(28, 77).addBox(-1.492F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.492F, -1.0287F, -2.7874F, 0.3796F, 0.0F, 0.0F));

		PartDefinition cube_r71 = head.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(42, 77).addBox(-1.492F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.492F, -0.3309F, -3.5037F, -2.1948F, 0.0F, 0.0F));

		PartDefinition cube_r72 = head.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(76, 27).addBox(-1.492F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.492F, -0.6798F, -3.1456F, -0.7985F, 0.0F, 0.0F));

		PartDefinition cube_r73 = head.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(25, 86).addBox(-0.492F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.008F, -0.5983F, -3.5372F, -1.3657F, 0.0F, 0.0F));

		PartDefinition cube_r74 = head.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(20, 86).addBox(-0.492F, -1.0F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.008F, -0.4468F, -3.6678F, -2.282F, 0.0F, 0.0F));

		PartDefinition cube_r75 = head.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(5, 86).addBox(-0.492F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.008F, -0.4172F, -4.0667F, -3.0674F, 0.0F, 0.0F));

		PartDefinition cube_r76 = head.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(47, 85).addBox(-0.992F, -0.2F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.492F, 0.8116F, -4.247F, 2.1249F, 0.0F, 0.0F));

		PartDefinition cube_r77 = head.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(7, 78).addBox(-0.5F, 0.5F, -0.775F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(87, 6).addBox(-0.5F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.479F, -4.7089F, 1.8064F, 0.0F, 0.0F));

		PartDefinition cube_r78 = head.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(20, 89).addBox(-0.5F, -0.525F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(89, 12).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.0F, 0.512F, -5.4834F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r79 = head.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(89, 9).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0F, 0.0058F, -5.231F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r80 = head.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(5, 89).addBox(-0.5F, -0.425F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.3285F, -5.1004F, 1.5882F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.575F, -1.6452F, -1.0427F));

		PartDefinition cube_r81 = leftFace.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(60, 90).addBox(-0.5754F, -0.7305F, -0.4449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.199F, 2.097F, -0.3694F, -0.9169F, 0.1555F, 0.0665F));

		PartDefinition cube_r82 = leftFace.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(91, 54).addBox(-0.4254F, -0.8537F, 0.4153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.199F, 2.097F, -0.3694F, -0.8558F, 0.1555F, 0.0665F));

		PartDefinition cube_r83 = leftFace.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(91, 38).addBox(-0.4254F, -0.2386F, -0.0133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.199F, 2.097F, -0.3694F, -0.7686F, 0.1555F, 0.0665F));

		PartDefinition cube_r84 = leftFace.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(55, 91).addBox(-0.4254F, -0.9195F, 0.184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.199F, 2.097F, -0.3694F, -1.4667F, 0.1555F, 0.0665F));

		PartDefinition cube_r85 = leftFace.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(78, 19).addBox(-1.5754F, -0.444F, 0.2233F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 78).addBox(-1.5754F, -1.144F, 0.2233F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.199F, 2.097F, -0.3694F, 1.9192F, 0.1555F, 0.0665F));

		PartDefinition cube_r86 = leftFace.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(50, 91).addBox(-1.3127F, 0.1281F, 0.6494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.018F, 3.3586F, -1.7932F, 2.2574F, 0.3249F, 0.2163F));

		PartDefinition cube_r87 = leftFace.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(82, 90).addBox(-0.5754F, -0.5828F, -0.3063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(0, 91).addBox(-0.5754F, -1.2828F, -0.3063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.199F, 2.097F, -0.3694F, 1.7011F, 0.1555F, 0.0665F));

		PartDefinition cube_r88 = leftFace.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(5, 83).addBox(-0.5F, -0.325F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(10, 85).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-0.2303F, 2.5366F, -1.5146F, 1.3042F, 0.2341F, -0.0214F));

		PartDefinition cube_r89 = leftFace.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(85, 23).addBox(-0.5008F, -0.5795F, -0.2767F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.1447F, 2.9197F, -1.1932F, 1.6969F, 0.2341F, -0.0214F));

		PartDefinition cube_r90 = leftFace.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(37, 85).addBox(-0.5008F, -0.5854F, -0.5627F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1447F, 2.9197F, -1.1932F, 2.3514F, 0.2341F, -0.0214F));

		PartDefinition cube_r91 = leftFace.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(92, 3).addBox(-0.8825F, -0.3797F, -0.4887F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.082F, 3.3586F, -1.7932F, -3.0542F, 0.408F, -0.0058F));

		PartDefinition cube_r92 = leftFace.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(75, 91).addBox(-0.5008F, -0.7779F, -0.3249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F))
				.texOffs(85, 20).addBox(-0.5008F, -0.7779F, -0.6999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.1447F, 2.9197F, -1.1932F, -3.0591F, 0.2341F, -0.0214F));

		PartDefinition cube_r93 = leftFace.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(90, 76).addBox(-0.5754F, -1.0949F, 0.0239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.199F, 2.097F, -0.3694F, 2.181F, 0.1555F, 0.0665F));

		PartDefinition cube_r94 = leftFace.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(86, 39).addBox(-0.5754F, -0.4265F, -0.5514F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.199F, 2.097F, -0.3694F, 0.6539F, 0.1555F, 0.0665F));

		PartDefinition cube_r95 = leftFace.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(84, 70).addBox(-1.0913F, -1.0482F, -0.1136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.018F, 3.3586F, -1.7932F, 1.2202F, 0.3313F, 0.0115F));

		PartDefinition cube_r96 = leftFace.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(62, 87).addBox(-1.0413F, -1.9367F, 0.0764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.018F, 3.3586F, -1.7932F, 1.4499F, 0.4145F, 0.0681F));

		PartDefinition cube_r97 = leftFace.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(84, 11).addBox(-0.9563F, -1.1636F, -2.7219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.018F, 3.3586F, -1.7932F, -0.1201F, 0.4087F, 0.098F));

		PartDefinition cube_r98 = leftFace.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(84, 67).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.9293F, 2.5391F, -3.4717F, 0.1329F, 0.4087F, 0.098F));

		PartDefinition cube_r99 = leftFace.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(84, 64).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.79F, 2.6729F, -3.1214F, -0.3034F, 0.4087F, 0.098F));

		PartDefinition cube_r100 = leftFace.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(64, 84).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-0.6674F, 2.3552F, -2.9115F, -0.6088F, 0.4087F, 0.098F));

		PartDefinition cube_r101 = leftFace.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(84, 61).addBox(-0.5F, -0.725F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.8389F, 2.2238F, -3.3352F, -0.2947F, 0.4087F, 0.098F));

		PartDefinition cube_r102 = leftFace.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(69, 84).addBox(-0.5F, -0.425F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F))
				.texOffs(84, 58).addBox(-0.5F, -0.425F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8007F, 2.0039F, -3.2972F, 0.5343F, 0.4087F, 0.098F));

		PartDefinition cube_r103 = leftFace.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(84, 42).addBox(-0.9563F, -2.4751F, -1.6377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.018F, 3.3586F, -1.7932F, 0.4907F, 0.4087F, 0.098F));

		PartDefinition cube_r104 = leftFace.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(32, 83).addBox(-1.0792F, -1.0297F, 0.8741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.018F, 3.3586F, -1.7932F, 1.6227F, 0.278F, 0.0906F));

		PartDefinition cube_r105 = leftFace.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(84, 14).addBox(-0.9563F, -1.9264F, 0.788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.018F, 3.3586F, -1.7932F, 1.5379F, 0.4087F, 0.098F));

		PartDefinition cube_r106 = leftFace.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(80, 77).addBox(-0.7425F, 0.3343F, -1.2704F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.018F, 3.3586F, -1.7932F, -1.4739F, 0.4122F, 0.0311F));

		PartDefinition cube_r107 = leftFace.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(64, 80).addBox(-0.7937F, 0.641F, -0.9639F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.018F, 3.3586F, -1.7932F, -1.5655F, 0.4015F, 0.1302F));

		PartDefinition cube_r108 = leftFace.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(45, 91).addBox(-0.7937F, -2.2829F, 1.5384F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.018F, 3.3586F, -1.7932F, 2.1433F, 0.4015F, 0.1302F));

		PartDefinition cube_r109 = leftFace.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(40, 91).addBox(-0.7937F, -3.2532F, -1.1696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.018F, 3.3586F, -1.7932F, 1.1397F, 0.4015F, 0.1302F));

		PartDefinition cube_r110 = leftFace.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(30, 89).addBox(-0.3F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-1.6713F, 2.4152F, -4.4699F, -1.068F, -0.1181F, 0.029F));

		PartDefinition cube_r111 = leftFace.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(30, 86).addBox(-0.3F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.6154F, 2.7665F, -4.6529F, -0.4895F, -0.2325F, -0.0357F));

		PartDefinition cube_r112 = leftFace.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(25, 89).addBox(-0.7F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-1.231F, 2.9466F, -4.5122F, 0.2523F, -0.2325F, -0.0357F));

		PartDefinition cube_r113 = leftFace.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(77, 88).addBox(-0.7937F, -1.5321F, -3.1213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(87, 51).addBox(-0.7937F, -1.5321F, -2.7213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.018F, 3.3586F, -1.7932F, 0.2671F, 0.4015F, 0.1302F));

		PartDefinition cube_r114 = leftFace.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(79, 12).addBox(-0.2467F, -2.4857F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.9204F, 0.8258F, 0.455F, 2.2956F, 0.234F, 1.0224F));

		PartDefinition cube_r115 = leftFace.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(90, 18).addBox(-1.3527F, 0.0556F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.9204F, 0.8258F, 0.455F, 2.6088F, 0.7247F, 1.6637F));

		PartDefinition cube_r116 = leftFace.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(42, 70).addBox(-0.15F, -3.85F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.1738F, 0.0146F, 1.3305F, 2.297F, 0.2405F, 1.0283F));

		PartDefinition cube_r117 = leftFace.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(90, 15).addBox(-0.1374F, -0.0983F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9204F, 0.8258F, 0.455F, 2.2832F, -0.1641F, 0.6797F));

		PartDefinition cube_r118 = leftFace.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(47, 51).addBox(-1.85F, -3.85F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.7356F, -0.613F, 0.9885F, 2.2511F, 0.2757F, 0.2168F));

		PartDefinition cube_r119 = leftFace.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(78, 22).addBox(-1.85F, -0.9F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(89, 89).addBox(-0.85F, -0.85F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.6153F, -1.0537F, 1.5681F, 2.2283F, -0.1387F, -0.1063F));

		PartDefinition cube_r120 = leftFace.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(89, 42).addBox(-0.675F, -0.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(89, 57).addBox(-0.575F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(89, 66).addBox(-0.575F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(89, 63).addBox(-0.575F, -0.7F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(89, 69).addBox(-0.575F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(89, 60).addBox(-0.575F, -0.9F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.0786F, 1.5025F, -3.435F, 1.8033F, 0.5077F, -1.1175F));

		PartDefinition cube_r121 = leftFace.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(89, 80).addBox(-0.7F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6994F, 1.4552F, -3.1115F, 1.2707F, 0.4732F, -2.1673F));

		PartDefinition cube_r122 = leftFace.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(28, 65).addBox(-0.692F, -0.7F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.083F, 1.228F, -3.0239F, -2.9416F, 0.0697F, -1.2208F));

		PartDefinition cube_r123 = leftFace.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(35, 65).addBox(-0.692F, -0.3F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7128F, 1.3572F, -2.9447F, -3.0838F, 0.2036F, -2.1819F));

		PartDefinition cube_r124 = leftFace.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(86, 36).addBox(-0.992F, -1.0F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.083F, 1.1984F, -2.625F, -2.4149F, 0.5086F, -0.5011F));

		PartDefinition cube_r125 = leftFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(86, 33).addBox(-0.992F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.083F, 1.0469F, -2.4945F, -1.4186F, 0.138F, -0.7312F));

		PartDefinition cube_r126 = leftFace.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(86, 30).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.575F, 0.9654F, -2.1029F, -0.883F, 0.3843F, -0.4281F));

		PartDefinition cube_r127 = leftFace.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(35, 91).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.575F, 0.4312F, -1.2803F, 0.3246F, 0.2004F, -0.5343F));

		PartDefinition cube_r128 = leftFace.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(89, 86).addBox(-0.15F, -0.15F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.3288F, -1.2339F, 1.805F, 2.5959F, 0.7839F, 0.8605F));

		PartDefinition cube_r129 = leftFace.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(89, 83).addBox(-1.6412F, 0.4615F, -0.5208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(7, 70).addBox(-1.6412F, -1.2385F, -0.5208F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.375F, -0.0487F, 0.2121F, 2.4398F, 0.6558F, 0.6249F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.575F, -1.6452F, -1.0427F));

		PartDefinition cube_r130 = rightFace.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(60, 90).mirror().addBox(-0.4246F, -0.7305F, -0.4449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.199F, 2.097F, -0.3694F, -0.9169F, -0.1555F, -0.0665F));

		PartDefinition cube_r131 = rightFace.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(91, 54).mirror().addBox(-0.5746F, -0.8537F, 0.4153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.199F, 2.097F, -0.3694F, -0.8558F, -0.1555F, -0.0665F));

		PartDefinition cube_r132 = rightFace.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(91, 38).mirror().addBox(-0.5746F, -0.2386F, -0.0133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.199F, 2.097F, -0.3694F, -0.7686F, -0.1555F, -0.0665F));

		PartDefinition cube_r133 = rightFace.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(55, 91).mirror().addBox(-0.5746F, -0.9195F, 0.184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.199F, 2.097F, -0.3694F, -1.4667F, -0.1555F, -0.0665F));

		PartDefinition cube_r134 = rightFace.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(78, 19).mirror().addBox(-0.4246F, -0.444F, 0.2233F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(12, 78).mirror().addBox(-0.4246F, -1.144F, 0.2233F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.199F, 2.097F, -0.3694F, 1.9192F, -0.1555F, -0.0665F));

		PartDefinition cube_r135 = rightFace.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(50, 91).mirror().addBox(0.3127F, 0.1281F, 0.6494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.018F, 3.3586F, -1.7932F, 2.2574F, -0.3249F, -0.2163F));

		PartDefinition cube_r136 = rightFace.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(82, 90).mirror().addBox(-0.4246F, -0.5828F, -0.3063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(0, 91).mirror().addBox(-0.4246F, -1.2828F, -0.3063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.199F, 2.097F, -0.3694F, 1.7011F, -0.1555F, -0.0665F));

		PartDefinition cube_r137 = rightFace.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(5, 83).mirror().addBox(-0.5F, -0.325F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(10, 85).mirror().addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(0.2303F, 2.5366F, -1.5146F, 1.3042F, -0.2341F, 0.0214F));

		PartDefinition cube_r138 = rightFace.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(85, 23).mirror().addBox(-0.4992F, -0.5795F, -0.2767F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.1447F, 2.9197F, -1.1932F, 1.6969F, -0.2341F, 0.0214F));

		PartDefinition cube_r139 = rightFace.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(37, 85).mirror().addBox(-0.4992F, -0.5854F, -0.5627F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1447F, 2.9197F, -1.1932F, 2.3514F, -0.2341F, 0.0214F));

		PartDefinition cube_r140 = rightFace.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(92, 3).mirror().addBox(-0.1175F, -0.3797F, -0.4887F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.082F, 3.3586F, -1.7932F, -3.0542F, -0.408F, 0.0058F));

		PartDefinition cube_r141 = rightFace.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(75, 91).mirror().addBox(-0.4992F, -0.7779F, -0.3249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false)
				.texOffs(85, 20).mirror().addBox(-0.4992F, -0.7779F, -0.6999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.1447F, 2.9197F, -1.1932F, -3.0591F, -0.2341F, 0.0214F));

		PartDefinition cube_r142 = rightFace.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(90, 76).mirror().addBox(-0.4246F, -1.0949F, 0.0239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.199F, 2.097F, -0.3694F, 2.181F, -0.1555F, -0.0665F));

		PartDefinition cube_r143 = rightFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(86, 39).mirror().addBox(-0.4246F, -0.4265F, -0.5514F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.199F, 2.097F, -0.3694F, 0.6539F, -0.1555F, -0.0665F));

		PartDefinition cube_r144 = rightFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(84, 70).mirror().addBox(0.0913F, -1.0482F, -0.1136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.018F, 3.3586F, -1.7932F, 1.2202F, -0.3313F, -0.0115F));

		PartDefinition cube_r145 = rightFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(62, 87).mirror().addBox(0.0413F, -1.9367F, 0.0764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.018F, 3.3586F, -1.7932F, 1.4499F, -0.4145F, -0.0681F));

		PartDefinition cube_r146 = rightFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(84, 11).mirror().addBox(-0.0437F, -1.1636F, -2.7219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.018F, 3.3586F, -1.7932F, -0.1201F, -0.4087F, -0.098F));

		PartDefinition cube_r147 = rightFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(84, 67).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.9293F, 2.5391F, -3.4717F, 0.1329F, -0.4087F, -0.098F));

		PartDefinition cube_r148 = rightFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(84, 64).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.79F, 2.6729F, -3.1214F, -0.3034F, -0.4087F, -0.098F));

		PartDefinition cube_r149 = rightFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(64, 84).mirror().addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(0.6674F, 2.3552F, -2.9115F, -0.6088F, -0.4087F, -0.098F));

		PartDefinition cube_r150 = rightFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(84, 61).mirror().addBox(-0.5F, -0.725F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.8389F, 2.2238F, -3.3352F, -0.2947F, -0.4087F, -0.098F));

		PartDefinition cube_r151 = rightFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(69, 84).mirror().addBox(-0.5F, -0.425F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false)
				.texOffs(84, 58).mirror().addBox(-0.5F, -0.425F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.8007F, 2.0039F, -3.2972F, 0.5343F, -0.4087F, -0.098F));

		PartDefinition cube_r152 = rightFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(84, 42).mirror().addBox(-0.0437F, -2.4751F, -1.6377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.018F, 3.3586F, -1.7932F, 0.4907F, -0.4087F, -0.098F));

		PartDefinition cube_r153 = rightFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(32, 83).mirror().addBox(0.0792F, -1.0297F, 0.8741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.018F, 3.3586F, -1.7932F, 1.6227F, -0.278F, -0.0906F));

		PartDefinition cube_r154 = rightFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(84, 14).mirror().addBox(-0.0437F, -1.9264F, 0.788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.018F, 3.3586F, -1.7932F, 1.5379F, -0.4087F, -0.098F));

		PartDefinition cube_r155 = rightFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(80, 77).mirror().addBox(-0.2575F, 0.3343F, -1.2704F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.018F, 3.3586F, -1.7932F, -1.4739F, -0.4122F, -0.0311F));

		PartDefinition cube_r156 = rightFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(64, 80).mirror().addBox(-0.2063F, 0.641F, -0.9639F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.018F, 3.3586F, -1.7932F, -1.5655F, -0.4015F, -0.1302F));

		PartDefinition cube_r157 = rightFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(45, 91).mirror().addBox(-0.2063F, -2.2829F, 1.5384F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.018F, 3.3586F, -1.7932F, 2.1433F, -0.4015F, -0.1302F));

		PartDefinition cube_r158 = rightFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(40, 91).mirror().addBox(-0.2063F, -3.2532F, -1.1696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.018F, 3.3586F, -1.7932F, 1.1397F, -0.4015F, -0.1302F));

		PartDefinition cube_r159 = rightFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(30, 89).mirror().addBox(-0.7F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(1.6713F, 2.4152F, -4.4699F, -1.068F, 0.1181F, -0.029F));

		PartDefinition cube_r160 = rightFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(30, 86).mirror().addBox(-0.7F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.6154F, 2.7665F, -4.6529F, -0.4895F, 0.2325F, 0.0357F));

		PartDefinition cube_r161 = rightFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(25, 89).mirror().addBox(-0.3F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(1.231F, 2.9466F, -4.5122F, 0.2523F, 0.2325F, 0.0357F));

		PartDefinition cube_r162 = rightFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(77, 88).mirror().addBox(-0.2063F, -1.5321F, -3.1213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(87, 51).mirror().addBox(-0.2063F, -1.5321F, -2.7213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.018F, 3.3586F, -1.7932F, 0.2671F, -0.4015F, -0.1302F));

		PartDefinition cube_r163 = rightFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(79, 12).mirror().addBox(-0.7533F, -2.4857F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.9204F, 0.8258F, 0.455F, 2.2956F, -0.234F, -1.0224F));

		PartDefinition cube_r164 = rightFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(90, 18).mirror().addBox(0.3527F, 0.0556F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.9204F, 0.8258F, 0.455F, 2.6088F, -0.7247F, -1.6637F));

		PartDefinition cube_r165 = rightFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(42, 70).mirror().addBox(-0.85F, -3.85F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.1738F, 0.0146F, 1.3305F, 2.297F, -0.2405F, -1.0283F));

		PartDefinition cube_r166 = rightFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(90, 15).mirror().addBox(-0.8626F, -0.0983F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.9204F, 0.8258F, 0.455F, 2.2832F, 0.1641F, -0.6797F));

		PartDefinition cube_r167 = rightFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(47, 51).mirror().addBox(-0.15F, -3.85F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.7356F, -0.613F, 0.9885F, 2.2511F, -0.2757F, -0.2168F));

		PartDefinition cube_r168 = rightFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(78, 22).mirror().addBox(-0.15F, -0.9F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(89, 89).mirror().addBox(-0.15F, -0.85F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.6153F, -1.0537F, 1.5681F, 2.2283F, 0.1387F, 0.1063F));

		PartDefinition cube_r169 = rightFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(89, 42).mirror().addBox(-0.325F, -0.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(89, 57).mirror().addBox(-0.425F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(89, 66).mirror().addBox(-0.425F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(89, 63).mirror().addBox(-0.425F, -0.7F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(89, 69).mirror().addBox(-0.425F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(89, 60).mirror().addBox(-0.425F, -0.9F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.0786F, 1.5025F, -3.435F, 1.8033F, -0.5077F, 1.1175F));

		PartDefinition cube_r170 = rightFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(89, 80).mirror().addBox(-0.3F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.6994F, 1.4552F, -3.1115F, 1.2707F, -0.4732F, 2.1673F));

		PartDefinition cube_r171 = rightFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(28, 65).mirror().addBox(-0.308F, -0.7F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.083F, 1.228F, -3.0239F, -2.9416F, -0.0697F, 1.2208F));

		PartDefinition cube_r172 = rightFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(35, 65).mirror().addBox(-0.308F, -0.3F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.7128F, 1.3572F, -2.9447F, -3.0838F, -0.2036F, 2.1819F));

		PartDefinition cube_r173 = rightFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(86, 36).mirror().addBox(-0.008F, -1.0F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.083F, 1.1984F, -2.625F, -2.4149F, -0.5086F, 0.5011F));

		PartDefinition cube_r174 = rightFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(86, 33).mirror().addBox(-0.008F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.083F, 1.0469F, -2.4945F, -1.4186F, -0.138F, 0.7312F));

		PartDefinition cube_r175 = rightFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(86, 30).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.575F, 0.9654F, -2.1029F, -0.883F, -0.3843F, 0.4281F));

		PartDefinition cube_r176 = rightFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(35, 91).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.575F, 0.4312F, -1.2803F, 0.3246F, -0.2004F, 0.5343F));

		PartDefinition cube_r177 = rightFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(89, 86).mirror().addBox(-0.85F, -0.15F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.3288F, -1.2339F, 1.805F, 2.5959F, -0.7839F, -0.8605F));

		PartDefinition cube_r178 = rightFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(89, 83).mirror().addBox(0.6412F, 0.4615F, -0.5208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(7, 70).mirror().addBox(-0.3588F, -1.2385F, -0.5208F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.375F, -0.0487F, 0.2121F, 2.4398F, -0.6558F, -0.6249F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9219F, -0.6034F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r179 = lowerjaw.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(67, 87).mirror().addBox(-0.2F, -0.5179F, -0.9477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.5F, 0.425F, -0.2618F, -0.0873F, 0.0F));

		PartDefinition cube_r180 = lowerjaw.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(72, 87).mirror().addBox(-0.2F, -1.4615F, -1.5976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.5F, 0.425F, 0.6109F, -0.0873F, 0.0F));

		PartDefinition cube_r181 = lowerjaw.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(65, 62).mirror().addBox(-0.2F, -0.5599F, -2.0242F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.5F, 0.425F, 0.0436F, -0.0873F, 0.0F));

		PartDefinition cube_r182 = lowerjaw.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(65, 90).mirror().addBox(-0.5084F, 0.1815F, -2.4036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.5F, 0.425F, -0.3752F, -0.2618F, 0.0F));

		PartDefinition cube_r183 = lowerjaw.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(74, 84).mirror().addBox(-0.2F, -1.5872F, -0.3882F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.5F, 0.425F, 1.4399F, -0.0873F, 0.0F));

		PartDefinition cube_r184 = lowerjaw.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(83, 27).mirror().addBox(-0.5084F, -0.6092F, -3.0811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.5F, 0.425F, -0.0262F, -0.2618F, 0.0F));

		PartDefinition cube_r185 = lowerjaw.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(50, 82).mirror().addBox(-0.5084F, -0.863F, -3.7299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.5F, 0.425F, 0.0611F, -0.2618F, 0.0F));

		PartDefinition cube_r186 = lowerjaw.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(82, 8).mirror().addBox(-0.5084F, -4.0314F, -1.7915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.5F, 0.425F, 1.1519F, -0.2618F, 0.0F));

		PartDefinition cube_r187 = lowerjaw.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(45, 82).mirror().addBox(-0.1286F, -0.8725F, -0.5333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.875F, 0.2F, -3.375F, 1.5882F, -0.3491F, 0.0F));

		PartDefinition cube_r188 = lowerjaw.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(27, 83).mirror().addBox(-0.1286F, -0.8432F, 0.2841F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.875F, 0.2F, -3.375F, 2.6354F, -0.3491F, 0.0F));

		PartDefinition cube_r189 = lowerjaw.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(59, 19).mirror().addBox(-0.1286F, -0.4135F, 0.4528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.875F, 0.2F, -3.375F, 2.9845F, -0.3491F, 0.0F));

		PartDefinition cube_r190 = lowerjaw.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(17, 82).mirror().addBox(-0.1286F, -0.3326F, -0.218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.875F, 0.2F, -3.375F, 3.1154F, -0.3491F, 0.0F));

		PartDefinition cube_r191 = lowerjaw.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(22, 83).mirror().addBox(-0.5084F, 0.3591F, 2.8863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.5F, 0.425F, -3.0369F, -0.2618F, 0.0F));

		PartDefinition cube_r192 = lowerjaw.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(82, 51).mirror().addBox(-0.5084F, 2.3958F, -0.532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.5F, 0.425F, -1.7279F, -0.2618F, 0.0F));

		PartDefinition cube_r193 = lowerjaw.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(82, 74).mirror().addBox(-0.5084F, 0.5797F, -2.6187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.5F, 0.425F, -0.5934F, -0.2618F, 0.0F));

		PartDefinition cube_r194 = lowerjaw.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(63, 0).mirror().addBox(-0.15F, -0.5F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.4195F, -0.0892F, -4.5641F, 2.9939F, -0.0471F, -0.0471F));

		PartDefinition cube_r195 = lowerjaw.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(82, 74).addBox(-0.4915F, 0.5797F, -2.6187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.5F, 0.5F, 0.425F, -0.5934F, 0.2618F, 0.0F));

		PartDefinition cube_r196 = lowerjaw.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(82, 51).addBox(-0.4915F, 2.3958F, -0.532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5F, 0.5F, 0.425F, -1.7279F, 0.2618F, 0.0F));

		PartDefinition cube_r197 = lowerjaw.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(22, 83).addBox(-0.4915F, 0.3591F, 2.8863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.5F, 0.5F, 0.425F, -3.0369F, 0.2618F, 0.0F));

		PartDefinition cube_r198 = lowerjaw.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(17, 82).addBox(-0.8714F, -0.3326F, -0.218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.875F, 0.2F, -3.375F, 3.1154F, 0.3491F, 0.0F));

		PartDefinition cube_r199 = lowerjaw.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(63, 0).addBox(-0.85F, -0.5F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.4195F, -0.0892F, -4.5641F, 2.9939F, 0.0471F, 0.0471F));

		PartDefinition cube_r200 = lowerjaw.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(59, 19).addBox(-0.8714F, -0.4135F, 0.4528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.875F, 0.2F, -3.375F, 2.9845F, 0.3491F, 0.0F));

		PartDefinition cube_r201 = lowerjaw.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(27, 83).addBox(-0.8714F, -0.8432F, 0.2841F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.875F, 0.2F, -3.375F, 2.6354F, 0.3491F, 0.0F));

		PartDefinition cube_r202 = lowerjaw.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(45, 82).addBox(-0.8714F, -0.8725F, -0.5333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.875F, 0.2F, -3.375F, 1.5882F, 0.3491F, 0.0F));

		PartDefinition cube_r203 = lowerjaw.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(82, 8).addBox(-0.4915F, -4.0314F, -1.7915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5F, 0.5F, 0.425F, 1.1519F, 0.2618F, 0.0F));

		PartDefinition cube_r204 = lowerjaw.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(50, 82).addBox(-0.4915F, -0.863F, -3.7299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.5F, 0.5F, 0.425F, 0.0611F, 0.2618F, 0.0F));

		PartDefinition cube_r205 = lowerjaw.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(83, 27).addBox(-0.4915F, -0.6092F, -3.0811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.5F, 0.5F, 0.425F, -0.0262F, 0.2618F, 0.0F));

		PartDefinition cube_r206 = lowerjaw.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(65, 90).addBox(-0.4915F, 0.1815F, -2.4036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5F, 0.5F, 0.425F, -0.3752F, 0.2618F, 0.0F));

		PartDefinition cube_r207 = lowerjaw.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(65, 62).addBox(-0.8F, -0.5599F, -2.0242F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.5F, 0.5F, 0.425F, 0.0436F, 0.0873F, 0.0F));

		PartDefinition cube_r208 = lowerjaw.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(74, 84).addBox(-0.8F, -1.5872F, -0.3882F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5F, 0.5F, 0.425F, 1.4399F, 0.0873F, 0.0F));

		PartDefinition cube_r209 = lowerjaw.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(72, 87).addBox(-0.8F, -1.4615F, -1.5976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.5F, 0.5F, 0.425F, 0.6109F, 0.0873F, 0.0F));

		PartDefinition cube_r210 = lowerjaw.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(67, 87).addBox(-0.8F, -0.5179F, -0.9477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.5F, 0.5F, 0.425F, -0.2618F, 0.0873F, 0.0F));

		PartDefinition tail = Waluchelys.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(14, 67).addBox(-0.5F, -0.8F, 0.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(26, 92).addBox(0.0F, -1.3F, 0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.5F, -1.4686F, 7.9237F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r211 = tail.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(54, 3).mirror().addBox(-1.5F, 0.0F, -1.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2F, 1.55F, 0.0F, 0.0F, -0.3142F));

		PartDefinition cube_r212 = tail.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(54, 3).addBox(-0.5F, 0.0F, -1.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2F, 1.55F, 0.0F, 0.0F, 0.3142F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(63, 66).addBox(-0.5F, -1.0125F, -0.0191F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(23, 92).addBox(0.0F, -1.3125F, -0.0191F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2263F, 1.889F, 0.1861F, -0.1716F, -0.0321F));

		PartDefinition cube_r213 = tail2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(92, 6).mirror().addBox(-1.0F, 0.0F, -2.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5125F, 2.4809F, 0.0F, 0.0F, -0.384F));

		PartDefinition cube_r214 = tail2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(92, 6).addBox(0.0F, 0.0F, -2.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5125F, 2.4809F, 0.0F, 0.0F, 0.384F));

		PartDefinition cube_r215 = tail2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(92, 51).addBox(0.0F, -0.65F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2237F, 0.4799F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2955F, 1.9515F, 0.2748F, -0.2102F, -0.0588F));

		PartDefinition cube_r216 = tail3.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(5, 92).mirror().addBox(-0.6F, 0.0F, -1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3436F, 1.4901F, 0.0984F, 0.0358F, -0.3473F));

		PartDefinition cube_r217 = tail3.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(5, 92).addBox(-0.4F, 0.0F, -1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3436F, 1.4901F, 0.0984F, -0.0358F, 0.3473F));

		PartDefinition cube_r218 = tail3.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(13, 18).addBox(0.0F, -1.3F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(20, 92).addBox(0.0F, -1.3F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(42, 36).addBox(-0.5F, -1.0F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.15F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r219 = tail3.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(27, 46).addBox(0.0F, -0.2F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0418F, 2.2555F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r220 = tail3.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(68, 12).addBox(0.0F, 0.35F, 1.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5192F, -1.4717F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(7, 66).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(55, 82).addBox(0.0F, -0.5F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6799F, 2.8384F, 0.2438F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(42, 66).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0313F, 1.8341F, -0.157F, -0.2618F, -0.0045F));

		PartDefinition cube_r221 = tail5.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(90, 21).addBox(-0.5F, 0.3F, 2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.098F))
				.texOffs(70, 70).addBox(-0.5F, 0.0F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F))
				.texOffs(70, 66).addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.098F)), PartPose.offsetAndRotation(0.0F, -0.3398F, 2.6026F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r222 = tail5.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(63, 70).addBox(-0.5F, -0.4F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, -0.3F, 1.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r223 = tail5.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(35, 73).mirror().addBox(-0.5F, 0.0884F, -0.3011F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.6257F, -0.1158F, 0.719F, -0.1338F, -0.2578F));

		PartDefinition cube_r224 = tail5.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(14, 59).mirror().addBox(-0.5F, -0.3756F, -0.2837F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.6257F, -0.1158F, 0.4136F, -0.1338F, -0.2578F));

		PartDefinition cube_r225 = tail5.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(47, 73).mirror().addBox(-0.5F, 0.0884F, -0.3011F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.4757F, 1.1342F, 0.719F, -0.1338F, -0.2578F));

		PartDefinition cube_r226 = tail5.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(21, 60).mirror().addBox(-0.5F, -0.3756F, -0.2837F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.4757F, 1.1342F, 0.4136F, -0.1338F, -0.2578F));

		PartDefinition cube_r227 = tail5.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(60, 33).mirror().addBox(-0.4507F, -0.6194F, -0.8544F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(60, 37).mirror().addBox(-0.3768F, -0.0302F, -0.0482F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4289F, -0.2907F, 2.8617F, 0.6036F, 0.0315F, -0.2738F));

		PartDefinition cube_r228 = tail5.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(54, 73).mirror().addBox(-0.4507F, -0.3157F, -0.772F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(0, 74).mirror().addBox(-0.3768F, 0.4887F, -0.1803F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.4289F, -0.2907F, 2.8617F, 0.909F, 0.0315F, -0.2738F));

		PartDefinition cube_r229 = tail5.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(60, 41).mirror().addBox(-0.1591F, 0.0872F, 0.9938F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4289F, -0.2907F, 2.8617F, 0.3525F, -0.0371F, -0.2445F));

		PartDefinition cube_r230 = tail5.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(7, 74).mirror().addBox(-0.1591F, 0.914F, 0.7782F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.4289F, -0.2907F, 2.8617F, 0.658F, -0.0371F, -0.2445F));

		PartDefinition cube_r231 = tail5.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(61, 3).mirror().addBox(-0.5F, -0.6133F, -1.0636F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5539F, 0.3093F, 0.6867F, -0.1936F, -0.3379F, -0.065F));

		PartDefinition cube_r232 = tail5.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(74, 31).mirror().addBox(-0.5F, -0.3728F, -0.9734F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.5539F, 0.3093F, 0.6867F, 0.1119F, -0.3379F, -0.065F));

		PartDefinition cube_r233 = tail5.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(74, 35).mirror().addBox(-0.5F, -0.3728F, -0.9734F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.3789F, 0.3593F, 1.8117F, 0.1032F, -0.2073F, -0.0626F));

		PartDefinition cube_r234 = tail5.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(61, 7).mirror().addBox(-0.5F, -0.6133F, -1.0636F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3789F, 0.3593F, 1.8117F, -0.2022F, -0.2073F, -0.0626F));

		PartDefinition cube_r235 = tail5.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(61, 11).mirror().addBox(-0.5F, -0.6133F, -1.0636F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3289F, 0.3593F, 2.9117F, -0.2104F, -0.0766F, -0.0615F));

		PartDefinition cube_r236 = tail5.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(74, 39).mirror().addBox(-0.5F, -0.3728F, -0.9734F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.3289F, 0.3593F, 2.9117F, 0.095F, -0.0766F, -0.0615F));

		PartDefinition cube_r237 = tail5.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(7, 74).addBox(-0.8409F, 0.914F, 0.7782F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.4289F, -0.2907F, 2.8617F, 0.658F, 0.0371F, 0.2445F));

		PartDefinition cube_r238 = tail5.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(60, 41).addBox(-0.8409F, 0.0872F, 0.9938F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4289F, -0.2907F, 2.8617F, 0.3525F, 0.0371F, 0.2445F));

		PartDefinition cube_r239 = tail5.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(60, 37).addBox(-0.6232F, -0.0302F, -0.0482F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(60, 33).addBox(-0.5493F, -0.6194F, -0.8544F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4289F, -0.2907F, 2.8617F, 0.6036F, -0.0315F, 0.2738F));

		PartDefinition cube_r240 = tail5.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(0, 74).addBox(-0.6232F, 0.4887F, -0.1803F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F))
				.texOffs(54, 73).addBox(-0.5493F, -0.3157F, -0.772F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.4289F, -0.2907F, 2.8617F, 0.909F, -0.0315F, 0.2738F));

		PartDefinition cube_r241 = tail5.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(21, 60).addBox(-0.5F, -0.3756F, -0.2837F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, -0.4757F, 1.1342F, 0.4136F, 0.1338F, 0.2578F));

		PartDefinition cube_r242 = tail5.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(47, 73).addBox(-0.5F, 0.0884F, -0.3011F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3F, -0.4757F, 1.1342F, 0.719F, 0.1338F, 0.2578F));

		PartDefinition cube_r243 = tail5.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(74, 39).addBox(-0.5F, -0.3728F, -0.9734F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3289F, 0.3593F, 2.9117F, 0.095F, 0.0766F, 0.0615F));

		PartDefinition cube_r244 = tail5.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(61, 11).addBox(-0.5F, -0.6133F, -1.0636F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3289F, 0.3593F, 2.9117F, -0.2104F, 0.0766F, 0.0615F));

		PartDefinition cube_r245 = tail5.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(61, 7).addBox(-0.5F, -0.6133F, -1.0636F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3789F, 0.3593F, 1.8117F, -0.2022F, 0.2073F, 0.0626F));

		PartDefinition cube_r246 = tail5.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(74, 35).addBox(-0.5F, -0.3728F, -0.9734F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3789F, 0.3593F, 1.8117F, 0.1032F, 0.2073F, 0.0626F));

		PartDefinition cube_r247 = tail5.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(74, 31).addBox(-0.5F, -0.3728F, -0.9734F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.5539F, 0.3093F, 0.6867F, 0.1119F, 0.3379F, 0.065F));

		PartDefinition cube_r248 = tail5.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(61, 3).addBox(-0.5F, -0.6133F, -1.0636F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5539F, 0.3093F, 0.6867F, -0.1936F, 0.3379F, 0.065F));

		PartDefinition cube_r249 = tail5.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(14, 59).addBox(-0.5F, -0.3756F, -0.2837F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, -0.6257F, -0.1158F, 0.4136F, 0.1338F, 0.2578F));

		PartDefinition cube_r250 = tail5.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(35, 73).addBox(-0.5F, 0.0884F, -0.3011F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3F, -0.6257F, -0.1158F, 0.719F, 0.1338F, 0.2578F));

		PartDefinition cube_r251 = tail5.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(70, 43).addBox(-0.5F, -0.525F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.098F)), PartPose.offsetAndRotation(0.0F, -0.3F, 1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 25).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.12F)), PartPose.offsetAndRotation(0.0F, -0.0197F, 1.9602F, 0.0169F, 0.0F, 0.0F));

		PartDefinition cube_r252 = tail6.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(92, 0).addBox(-0.5F, -1.1F, -3.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.12F))
				.texOffs(47, 46).addBox(-0.5F, -1.1F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(0.0F, 1.3119F, 0.9313F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r253 = tail6.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(34, 0).addBox(-0.5F, -1.1F, -4.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, 0.8F, 5.1F, 0.1222F, 0.0F, 0.0F));

		PartDefinition leftCarapace = Waluchelys.addOrReplaceChild("leftCarapace", CubeListBuilder.create().texOffs(0, 0).addBox(-1.1F, -0.4F, -3.25F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.007F)), PartPose.offset(1.0F, -0.8F, 0.25F));

		PartDefinition cube_r254 = leftCarapace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(59, 77).addBox(-2.0F, -0.1F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(3.8799F, -7.3455F, -1.2588F, -1.5105F, 0.0802F, 0.7045F));

		PartDefinition cube_r255 = leftCarapace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(0, 81).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(5.8121F, -3.6001F, -3.4718F, -1.5138F, 0.0331F, 0.7626F));

		PartDefinition cube_r256 = leftCarapace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(69, 27).addBox(0.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(4.3613F, -4.9725F, -3.5798F, -1.5138F, -0.054F, 0.7577F));

		PartDefinition cube_r257 = leftCarapace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(77, 65).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(5.8121F, -3.757F, -1.478F, -1.5134F, 0.1202F, 0.7676F));

		PartDefinition cube_r258 = leftCarapace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(75, 52).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(5.1385F, -5.7725F, -1.436F, -1.5211F, 0.1133F, 0.8973F));

		PartDefinition cube_r259 = leftCarapace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(21, 64).addBox(0.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(3.8799F, -7.1494F, -3.7511F, -1.5213F, -0.061F, 0.8886F));

		PartDefinition cube_r260 = leftCarapace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(68, 53).addBox(0.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.3478F, -8.431F, -3.852F, -1.5106F, -0.0505F, 0.6966F));

		PartDefinition cube_r261 = leftCarapace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(37, 56).addBox(0.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, -9.194F, -3.912F, -1.4982F, -0.03F, 0.3916F));

		PartDefinition cube_r262 = leftCarapace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(59, 80).addBox(-0.625F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(5.9689F, -4.1764F, -0.1448F, -1.6736F, 0.0074F, 0.7459F));

		PartDefinition cube_r263 = leftCarapace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(57, 22).addBox(0.0F, -3.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(4.304F, -5.2243F, -1.5123F, -1.674F, 0.0942F, 0.7369F));

		PartDefinition cube_r264 = leftCarapace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(7, 57).addBox(0.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(3.8799F, -7.3984F, -1.2067F, -1.6561F, 0.1106F, 0.9116F));

		PartDefinition cube_r265 = leftCarapace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(0, 57).addBox(0.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.3478F, -8.6715F, -1.0278F, -1.678F, 0.0896F, 0.6933F));

		PartDefinition cube_r266 = leftCarapace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(54, 56).addBox(0.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, -9.4294F, -0.9213F, -1.6999F, 0.0533F, 0.3893F));

		PartDefinition cube_r267 = leftCarapace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(85, 77).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1F, 0.1F, 4.75F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r268 = leftCarapace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(57, 85).addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0397F, 0.1F, 6.413F, 0.0F, 0.9076F, 0.0F));

		PartDefinition cube_r269 = leftCarapace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(32, 9).addBox(0.2194F, -0.6459F, -6.1799F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1245F, 0.5804F, -1.4593F, -0.1724F, 0.0816F, 0.0355F));

		PartDefinition cube_r270 = leftCarapace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(21, 68).addBox(-0.0336F, -0.724F, 3.099F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1245F, 0.5804F, -1.4593F, 0.0733F, 0.0175F, -0.2183F));

		PartDefinition cube_r271 = leftCarapace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(68, 8).addBox(2.5269F, -0.724F, 3.8132F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(68, 0).addBox(2.5269F, -0.724F, 1.8132F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1245F, 0.5804F, -1.4593F, 0.0859F, -0.548F, -0.2644F));

		PartDefinition cube_r272 = leftCarapace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(68, 4).addBox(1.5444F, -0.724F, 5.6209F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1245F, 0.5804F, -1.4593F, 0.0787F, -0.3741F, -0.2484F));

		PartDefinition cube_r273 = leftCarapace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(45, 88).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.4295F, -0.2771F, 2.2711F, 0.182F, -1.1544F, -0.3863F));

		PartDefinition cube_r274 = leftCarapace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(14, 71).addBox(-0.825F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6398F, -0.2409F, 4.134F, 0.1242F, -0.9387F, -0.32F));

		PartDefinition cube_r275 = leftCarapace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(17, 17).addBox(-2.7355F, -0.9589F, -1.9713F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1245F, 0.5804F, -1.4593F, 0.0F, -1.5708F, -0.2094F));

		PartDefinition cube_r276 = leftCarapace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(85, 48).addBox(-0.375F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.3848F, -0.7363F, 1.5052F, 0.0F, -1.0908F, -0.5585F));

		PartDefinition cube_r277 = leftCarapace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(19, 5).addBox(-1.5355F, -0.2869F, -3.8258F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1245F, 0.5804F, -1.4593F, 0.0F, -1.5708F, -0.5585F));

		PartDefinition cube_r278 = leftCarapace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(85, 17).addBox(-1.6489F, -0.3495F, -1.8168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.5005F, -1.8155F, 2.5728F, 3.0525F, -0.9951F, 2.4671F));

		PartDefinition cube_r279 = leftCarapace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(67, 39).addBox(-1.2002F, -0.3495F, -1.8356F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.5005F, -1.8155F, 2.5728F, 2.9273F, -1.3409F, 2.6012F));

		PartDefinition cube_r280 = leftCarapace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(19, 0).addBox(0.0F, -0.9577F, -2.8886F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5699F, -0.937F, -2.1948F, 0.0F, -1.5708F, -0.7679F));

		PartDefinition cube_r281 = leftCarapace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(31, 36).addBox(-1.6908F, -0.9587F, -2.8886F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.5699F, -0.937F, -2.1948F, -1.5708F, -1.3526F, 0.8029F));

		PartDefinition cube_r282 = leftCarapace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(51, 38).addBox(-1.2853F, -0.8852F, -3.5436F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.5699F, -0.937F, -2.1948F, -0.2483F, -0.8965F, -0.63F));

		PartDefinition cube_r283 = leftCarapace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(51, 34).addBox(-0.7355F, -1.018F, -2.1439F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.1755F, -0.6196F, -2.8593F, -0.3293F, -0.9863F, -0.49F));

		PartDefinition cube_r284 = leftCarapace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(48, 22).addBox(-1.8576F, -0.251F, -2.7579F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5005F, -1.8155F, 2.5728F, -3.1237F, -0.3923F, 2.2959F));

		PartDefinition cube_r285 = leftCarapace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(64, 19).addBox(-1.1061F, -0.2928F, -0.7796F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.5005F, -1.8155F, 2.5728F, 0.0652F, -1.192F, -0.633F));

		PartDefinition cube_r286 = leftCarapace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(28, 73).addBox(-0.5F, -1.0F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.7209F, -0.481F, 2.4602F, 0.0705F, -1.0181F, -0.6F));

		PartDefinition cube_r287 = leftCarapace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(67, 35).addBox(-2.2F, -0.2869F, -3.7411F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1245F, 0.5804F, -1.4593F, 0.0F, -1.5272F, -0.5585F));

		PartDefinition cube_r288 = leftCarapace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(72, 57).addBox(-3.1363F, -0.2869F, -3.0429F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1245F, 0.5804F, -1.4593F, -3.1416F, -1.309F, 2.5831F));

		PartDefinition cube_r289 = leftCarapace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(40, 88).addBox(-3.352F, -0.9589F, 0.4655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1245F, 0.5804F, -1.4593F, -3.1416F, -0.8378F, 2.9322F));

		PartDefinition cube_r290 = leftCarapace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(35, 88).addBox(-2.872F, -0.4109F, 2.0723F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1245F, 0.5804F, -1.4593F, -2.8798F, -0.576F, 2.9322F));

		PartDefinition cube_r291 = leftCarapace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(88, 26).addBox(-0.4575F, -1.4313F, 0.2753F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0661F, -1.8672F, 6.3463F, -1.5846F, 0.2097F, 0.2811F));

		PartDefinition cube_r292 = leftCarapace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(15, 88).addBox(-0.4575F, -1.2984F, -0.152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(0.0661F, -1.8672F, 6.3463F, -1.3665F, 0.2097F, 0.2811F));

		PartDefinition cube_r293 = leftCarapace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(67, 31).addBox(-0.4575F, -1.0206F, 0.3314F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(0.0661F, -1.8672F, 6.3463F, -1.1919F, 0.2097F, 0.2811F));

		PartDefinition cube_r294 = leftCarapace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(9, 43).addBox(-0.4575F, 0.11F, -0.6606F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0661F, -1.8672F, 6.3463F, -0.712F, 0.2097F, 0.2811F));

		PartDefinition cube_r295 = leftCarapace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(52, 85).addBox(-0.4575F, 1.8416F, -0.3435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0661F, -1.8672F, 6.3463F, -1.3839F, 0.2097F, 0.2811F));

		PartDefinition cube_r296 = leftCarapace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(69, 80).addBox(-0.4575F, -1.0274F, 0.0703F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0661F, -1.8672F, 6.3463F, -2.0821F, 0.2097F, 0.2811F));

		PartDefinition cube_r297 = leftCarapace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(74, 80).addBox(-0.4575F, 0.2234F, -0.7729F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(0.0661F, -1.8672F, 6.3463F, -1.1658F, 0.2097F, 0.2811F));

		PartDefinition cube_r298 = leftCarapace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(10, 88).addBox(-0.4575F, -0.3869F, -0.7997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(0.0661F, -1.8672F, 6.3463F, -1.061F, 0.2097F, 0.2811F));

		PartDefinition cube_r299 = leftCarapace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(0, 88).addBox(-0.4575F, -0.9047F, -0.8031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(0.0661F, -1.8672F, 6.3463F, -1.2356F, 0.2097F, 0.2811F));

		PartDefinition cube_r300 = leftCarapace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(84, 87).addBox(-0.4575F, -1.5907F, -0.4745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(12, 81).addBox(-0.4575F, -1.5907F, -0.2745F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(0.0661F, -1.8672F, 6.3463F, -0.8429F, 0.2097F, 0.2811F));

		PartDefinition cube_r301 = leftCarapace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(72, 61).addBox(-0.4363F, -2.1961F, 0.1066F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(21, 72).addBox(-0.4363F, -2.228F, -1.0859F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0661F, -1.8672F, 6.3463F, -0.9359F, 0.1892F, 0.2523F));

		PartDefinition cube_r302 = leftCarapace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(87, 73).addBox(-0.4363F, -2.4558F, -0.0643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0661F, -1.8672F, 6.3463F, -1.1977F, 0.1892F, 0.2523F));

		PartDefinition cube_r303 = leftCarapace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(82, 4).addBox(-1.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(5.2108F, -3.5571F, -4.8702F, -1.2744F, 0.2535F, 0.8296F));

		PartDefinition cube_r304 = leftCarapace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(81, 30).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(4.4561F, -4.9146F, -3.2616F, -1.2748F, -0.2483F, 0.6784F));

		PartDefinition cube_r305 = leftCarapace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(66, 77).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(5.2051F, -5.529F, -3.5098F, -1.3182F, -0.1156F, 0.8541F));

		PartDefinition cube_r306 = leftCarapace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(35, 69).addBox(0.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(3.8799F, -6.1686F, -5.9253F, -1.3092F, -0.2844F, 0.8088F));

		PartDefinition cube_r307 = leftCarapace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(50, 88).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.5584F, -6.7125F, -3.5566F, -1.2706F, -0.2432F, 0.6612F));

		PartDefinition cube_r308 = leftCarapace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(19, 79).addBox(-2.025F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(3.5584F, -6.7125F, -3.5566F, -1.2789F, -0.0762F, 0.7127F));

		PartDefinition cube_r309 = leftCarapace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(28, 69).addBox(0.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.3478F, -7.3606F, -6.4069F, -1.2706F, -0.2432F, 0.6612F));

		PartDefinition cube_r310 = leftCarapace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(30, 56).addBox(0.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, -8.0702F, -6.6936F, -1.2135F, -0.1439F, 0.3667F));

		PartDefinition cube_r311 = leftCarapace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(77, 68).addBox(-0.075F, -0.2F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.9432F, -5.9798F, -6.0414F, -1.0439F, -0.3158F, 0.8051F));

		PartDefinition cube_r312 = leftCarapace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(79, 81).addBox(-1.0F, -2.0F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(4.6252F, -4.0564F, -6.9553F, -1.9578F, 0.4554F, -0.9774F));

		PartDefinition cube_r313 = leftCarapace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(81, 38).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(4.6252F, -4.0564F, -6.9553F, -1.0722F, 0.0275F, 0.9988F));

		PartDefinition cube_r314 = leftCarapace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(81, 34).addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(3.9432F, -4.578F, -7.4679F, -0.9804F, -0.5382F, 0.6529F));

		PartDefinition cube_r315 = leftCarapace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(79, 55).addBox(-2.025F, -0.025F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(3.6353F, -5.839F, -5.6226F, -0.9605F, -0.2702F, 0.6463F));

		PartDefinition cube_r316 = leftCarapace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(49, 69).addBox(0.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(2.3672F, -5.4563F, -8.331F, -0.9119F, -0.4462F, 0.5084F));

		PartDefinition cube_r317 = leftCarapace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(54, 11).addBox(0.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, -5.9675F, -8.8333F, -0.8284F, -0.2539F, 0.2672F));

		PartDefinition cube_r318 = leftCarapace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(42, 62).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.4819F, -5.4501F, -8.4604F, -2.8537F, 0.9599F, 0.8344F));

		PartDefinition cube_r319 = leftCarapace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(14, 75).addBox(0.0F, -1.025F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(6.1336F, -3.1789F, 1.5237F, 3.0828F, -1.4577F, 2.5455F));

		PartDefinition cube_r320 = leftCarapace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(64, 23).addBox(0.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, -3.0753F, 9.7426F, -0.5252F, 0.1895F, -0.1087F));

		PartDefinition cube_r321 = leftCarapace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(85, 45).addBox(-0.25F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.0753F, 9.7426F, -0.5678F, -0.4136F, 0.2509F));

		PartDefinition cube_r322 = leftCarapace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(79, 85).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.6653F, -2.9048F, 10.044F, -0.575F, -0.6967F, 0.4931F));

		PartDefinition cube_r323 = leftCarapace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(55, 88).addBox(-0.625F, -0.125F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(2.5229F, -3.0178F, 9.3988F, -0.1446F, -0.2659F, 0.4136F));

		PartDefinition cube_r324 = leftCarapace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(14, 63).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(3.2956F, -2.4742F, 8.1012F, -0.1504F, 0.3819F, 0.3189F));

		PartDefinition cube_r325 = leftCarapace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(65, 15).addBox(-1.0F, -0.5F, -2.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(4.0467F, -2.0644F, 8.8553F, -0.1395F, -0.0067F, 0.3763F));

		PartDefinition cube_r326 = leftCarapace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(63, 45).addBox(-0.35F, -0.575F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(4.1341F, -2.2579F, 7.3451F, -0.248F, 0.1351F, 0.2232F));

		PartDefinition cube_r327 = leftCarapace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(0, 78).addBox(-1.8F, -0.575F, -0.625F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(4.5366F, -2.4106F, 6.6564F, -1.0721F, -1.2311F, 1.4004F));

		PartDefinition cube_r328 = leftCarapace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(75, 6).addBox(-1.0F, -0.575F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(5.1369F, -2.8876F, 4.7714F, -1.4666F, -1.2283F, 1.8153F));

		PartDefinition cube_r329 = leftCarapace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(75, 3).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(5.4546F, -3.2042F, 3.8467F, -1.452F, -1.2716F, 1.7999F));

		PartDefinition cube_r330 = leftCarapace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(75, 9).addBox(-2.3F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(5.4546F, -3.2042F, 3.8467F, -1.1872F, -1.2497F, 1.5221F));

		PartDefinition cube_r331 = leftCarapace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(68, 74).addBox(-1.0F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(5.9777F, -3.901F, 1.1189F, -0.9281F, -1.3725F, 1.2546F));

		PartDefinition cube_r332 = leftCarapace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(52, 5).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(6.6925F, -4.3996F, -1.4106F, 1.18F, -1.4889F, -0.8678F));

		PartDefinition cube_r333 = leftCarapace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(75, 0).addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(5.9518F, -2.9314F, -6.1995F, 1.1018F, -1.3314F, -0.8269F));

		PartDefinition cube_r334 = leftCarapace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(84, 84).addBox(-2.774F, 0.0322F, -0.9229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(6.5081F, -4.1326F, -4.3974F, 0.2497F, -0.963F, 0.0333F));

		PartDefinition cube_r335 = leftCarapace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(91, 29).addBox(-2.4901F, 0.0322F, 1.5318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(6.5081F, -4.1326F, -4.3974F, 2.6647F, -1.2583F, -2.445F));

		PartDefinition cube_r336 = leftCarapace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(42, 41).addBox(-2.4901F, 0.8535F, 2.0099F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(6.5081F, -4.1326F, -4.3974F, 3.0225F, -1.2583F, -2.445F));

		PartDefinition cube_r337 = leftCarapace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(61, 74).addBox(0.1F, -0.35F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(6.4942F, -4.0898F, -1.4955F, -2.0868F, -1.4574F, 2.3909F));

		PartDefinition cube_r338 = leftCarapace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(75, 74).addBox(-1.1F, -0.45F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.7348F, -2.9474F, 9.7212F, -0.4417F, -0.8507F, 0.7284F));

		PartDefinition cube_r339 = leftCarapace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(21, 76).addBox(-1.85F, -0.5F, -0.175F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.1848F, -2.5571F, 10.1964F, -0.7492F, -1.144F, 1.0894F));

		PartDefinition cube_r340 = leftCarapace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(23, 55).addBox(-1.025F, 0.05F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.9763F, -3.6606F, 9.8251F, -0.4414F, -0.4475F, -1.0543F));

		PartDefinition cube_r341 = leftCarapace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(44, 57).addBox(-1.025F, 0.05F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(2.7313F, -3.0891F, 9.0547F, -0.7001F, -0.4165F, -0.9323F));

		PartDefinition cube_r342 = leftCarapace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(56, 45).addBox(0.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, -9.0119F, 2.0495F, -1.9859F, 0.1655F, 0.3578F));

		PartDefinition cube_r343 = leftCarapace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(56, 69).addBox(0.0F, -3.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.3478F, -8.3211F, 1.72F, -1.9303F, 0.2683F, 0.6142F));

		PartDefinition cube_r344 = leftCarapace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(26, 80).addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(2.3478F, -8.235F, 1.9005F, -1.9176F, 0.0635F, 0.6906F));

		PartDefinition cube_r345 = leftCarapace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(0, 70).addBox(0.0F, -3.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(3.9238F, -7.2097F, 1.1899F, -1.8564F, 0.3461F, 0.8573F));

		PartDefinition cube_r346 = leftCarapace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(33, 80).addBox(0.0F, -1.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(3.5298F, -6.6735F, 1.5989F, -1.8403F, 0.0942F, 0.9306F));

		PartDefinition cube_r347 = leftCarapace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(11, 48).addBox(-0.325F, -3.6F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(5.1551F, -5.2275F, 1.6848F, -1.9099F, -0.0514F, 0.7582F));

		PartDefinition cube_r348 = leftCarapace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(43, 6).addBox(-3.025F, -3.0F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(5.4377F, -3.3106F, 5.1626F, -2.0255F, -0.1219F, 0.7108F));

		PartDefinition cube_r349 = leftCarapace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(40, 46).addBox(0.0F, -5.0F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, -7.7203F, 4.7573F, -2.2733F, 0.2615F, 0.2964F));

		PartDefinition cube_r350 = leftCarapace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(54, 51).addBox(0.0F, -4.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(2.3478F, -7.156F, 4.2402F, -2.1994F, 0.4239F, 0.5148F));

		PartDefinition cube_r351 = leftCarapace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(73, 77).addBox(0.0F, -0.9F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.3478F, -6.9534F, 4.4614F, -2.1625F, 0.2807F, 0.6213F));

		PartDefinition cube_r352 = leftCarapace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(82, 0).addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(3.9345F, -4.9072F, 4.8922F, -2.0985F, 0.5484F, 0.7297F));

		PartDefinition cube_r353 = leftCarapace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(77, 71).addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(3.9345F, -5.8531F, 3.86F, -2.0472F, 0.3569F, 0.8463F));

		PartDefinition cube_r354 = leftCarapace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(53, 27).addBox(-0.7F, -1.025F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(6.3239F, -3.3564F, -0.7615F, -3.0468F, -1.4574F, 2.3909F));

		PartDefinition cube_r355 = leftCarapace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(72, 16).addBox(-1.0F, -0.5F, -0.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(4.9489F, -3.4973F, -5.231F, -2.956F, -0.982F, 2.3401F));

		PartDefinition cube_r356 = leftCarapace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(28, 61).addBox(-4.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F))
				.texOffs(37, 25).addBox(-3.0F, -1.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(6.3873F, -3.4503F, -1.3351F, -1.287F, -1.4638F, 0.6388F));

		PartDefinition cube_r357 = leftCarapace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(51, 61).addBox(-0.175F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.167F, -5.3925F, -7.9051F, -2.471F, 1.1086F, 0.9341F));

		PartDefinition cube_r358 = leftCarapace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(86, 54).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0055F, -5.2042F, -9.23F, -2.307F, 0.9114F, 0.7172F));

		PartDefinition rightCarapace = Waluchelys.addOrReplaceChild("rightCarapace", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.1F, -0.4F, -3.25F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offset(-2.0F, -0.8F, 0.25F));

		PartDefinition cube_r359 = rightCarapace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(59, 77).mirror().addBox(0.0F, -0.1F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(-3.8799F, -7.3455F, -1.2588F, -1.5105F, -0.0802F, -0.7045F));

		PartDefinition cube_r360 = rightCarapace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-5.8121F, -3.6001F, -3.4718F, -1.5138F, -0.0331F, -0.7626F));

		PartDefinition cube_r361 = rightCarapace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(69, 27).mirror().addBox(-2.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-4.3613F, -4.9725F, -3.5798F, -1.5138F, 0.054F, -0.7577F));

		PartDefinition cube_r362 = rightCarapace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(77, 65).mirror().addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-5.8121F, -3.757F, -1.478F, -1.5134F, -0.1202F, -0.7676F));

		PartDefinition cube_r363 = rightCarapace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(75, 52).mirror().addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-5.1385F, -5.7725F, -1.436F, -1.5211F, -0.1133F, -0.8973F));

		PartDefinition cube_r364 = rightCarapace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(21, 64).mirror().addBox(-2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-3.8799F, -7.1494F, -3.7511F, -1.5213F, 0.061F, -0.8886F));

		PartDefinition cube_r365 = rightCarapace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(68, 53).mirror().addBox(-2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-2.3478F, -8.431F, -3.852F, -1.5106F, 0.0505F, -0.6966F));

		PartDefinition cube_r366 = rightCarapace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(37, 56).mirror().addBox(-2.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -9.194F, -3.912F, -1.4982F, 0.03F, -0.3916F));

		PartDefinition cube_r367 = rightCarapace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(59, 80).mirror().addBox(-0.375F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-5.9689F, -4.1764F, -0.1448F, -1.6736F, -0.0074F, -0.7459F));

		PartDefinition cube_r368 = rightCarapace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(57, 22).mirror().addBox(-2.0F, -3.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(-4.304F, -5.2243F, -1.5123F, -1.674F, -0.0942F, -0.7369F));

		PartDefinition cube_r369 = rightCarapace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(7, 57).mirror().addBox(-2.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-3.8799F, -7.3984F, -1.2067F, -1.6561F, -0.1106F, -0.9116F));

		PartDefinition cube_r370 = rightCarapace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(-2.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-2.3478F, -8.6715F, -1.0278F, -1.678F, -0.0896F, -0.6933F));

		PartDefinition cube_r371 = rightCarapace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(54, 56).mirror().addBox(-2.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -9.4294F, -0.9213F, -1.6999F, -0.0533F, -0.3893F));

		PartDefinition cube_r372 = rightCarapace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(85, 77).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.1F, 4.75F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r373 = rightCarapace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(57, 85).mirror().addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0397F, 0.1F, 6.413F, 0.0F, -0.9076F, 0.0F));

		PartDefinition cube_r374 = rightCarapace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(32, 9).mirror().addBox(-1.2194F, -0.6459F, -6.1799F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.1245F, 0.5804F, -1.4593F, -0.1724F, -0.0816F, -0.0355F));

		PartDefinition cube_r375 = rightCarapace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(21, 68).mirror().addBox(-0.9664F, -0.724F, 3.099F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.1245F, 0.5804F, -1.4593F, 0.0733F, -0.0175F, 0.2183F));

		PartDefinition cube_r376 = rightCarapace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(68, 8).mirror().addBox(-3.5269F, -0.724F, 3.8132F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(68, 0).mirror().addBox(-3.5269F, -0.724F, 1.8132F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.1245F, 0.5804F, -1.4593F, 0.0859F, 0.548F, 0.2644F));

		PartDefinition cube_r377 = rightCarapace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(68, 4).mirror().addBox(-2.5444F, -0.724F, 5.6209F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1245F, 0.5804F, -1.4593F, 0.0787F, 0.3741F, 0.2484F));

		PartDefinition cube_r378 = rightCarapace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(45, 88).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4295F, -0.2771F, 2.2711F, 0.182F, 1.1544F, 0.3863F));

		PartDefinition cube_r379 = rightCarapace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(14, 71).mirror().addBox(-0.175F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6398F, -0.2409F, 4.134F, 0.1242F, 0.9387F, 0.32F));

		PartDefinition cube_r380 = rightCarapace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(17, 17).mirror().addBox(-3.2645F, -0.9589F, -1.9713F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.1245F, 0.5804F, -1.4593F, 0.0F, 1.5708F, 0.2094F));

		PartDefinition cube_r381 = rightCarapace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(85, 48).mirror().addBox(-0.625F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3848F, -0.7363F, 1.5052F, 0.0F, 1.0908F, 0.5585F));

		PartDefinition cube_r382 = rightCarapace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(19, 5).mirror().addBox(-3.4644F, -0.2869F, -3.8258F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1245F, 0.5804F, -1.4593F, 0.0F, 1.5708F, 0.5585F));

		PartDefinition cube_r383 = rightCarapace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(85, 17).mirror().addBox(0.649F, -0.3495F, -1.8168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-3.5005F, -1.8155F, 2.5728F, 3.0525F, 0.9951F, -2.4671F));

		PartDefinition cube_r384 = rightCarapace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(67, 39).mirror().addBox(0.2002F, -0.3495F, -1.8356F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.5005F, -1.8155F, 2.5728F, 2.9273F, 1.3409F, -2.6012F));

		PartDefinition cube_r385 = rightCarapace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(19, 0).mirror().addBox(-4.0F, -0.9577F, -2.8886F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5699F, -0.937F, -2.1948F, 0.0F, 1.5708F, 0.7679F));

		PartDefinition cube_r386 = rightCarapace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(31, 36).mirror().addBox(-0.3091F, -0.9587F, -2.8886F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.5699F, -0.937F, -2.1948F, -1.5708F, 1.3526F, -0.8029F));

		PartDefinition cube_r387 = rightCarapace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(51, 38).mirror().addBox(-0.7147F, -0.8852F, -3.5436F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5699F, -0.937F, -2.1948F, -0.2483F, 0.8965F, 0.63F));

		PartDefinition cube_r388 = rightCarapace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(51, 34).mirror().addBox(-1.2645F, -1.018F, -2.1439F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.1755F, -0.6196F, -2.8593F, -0.3293F, 0.9863F, 0.49F));

		PartDefinition cube_r389 = rightCarapace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(48, 22).mirror().addBox(0.8576F, -0.251F, -2.7579F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5005F, -1.8155F, 2.5728F, -3.1237F, 0.3923F, -2.2959F));

		PartDefinition cube_r390 = rightCarapace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(64, 19).mirror().addBox(0.1061F, -0.2928F, -0.7796F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.5005F, -1.8155F, 2.5728F, 0.0652F, 1.192F, 0.633F));

		PartDefinition cube_r391 = rightCarapace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(28, 73).mirror().addBox(-0.5F, -1.0F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.7209F, -0.481F, 2.4602F, 0.0705F, 1.0181F, 0.6F));

		PartDefinition cube_r392 = rightCarapace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(67, 35).mirror().addBox(1.2F, -0.2869F, -3.7411F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.1245F, 0.5804F, -1.4593F, 0.0F, 1.5272F, 0.5585F));

		PartDefinition cube_r393 = rightCarapace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(72, 57).mirror().addBox(2.1363F, -0.2869F, -3.0429F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1245F, 0.5804F, -1.4593F, -3.1416F, 1.309F, -2.5831F));

		PartDefinition cube_r394 = rightCarapace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(40, 88).mirror().addBox(2.352F, -0.9589F, 0.4655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1245F, 0.5804F, -1.4593F, -3.1416F, 0.8378F, -2.9322F));

		PartDefinition cube_r395 = rightCarapace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(35, 88).mirror().addBox(1.872F, -0.4109F, 2.0723F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1245F, 0.5804F, -1.4593F, -2.8798F, 0.576F, -2.9322F));

		PartDefinition cube_r396 = rightCarapace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(88, 26).mirror().addBox(-0.5425F, -1.4313F, 0.2753F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0661F, -1.8672F, 6.3463F, -1.5846F, -0.2097F, -0.2811F));

		PartDefinition cube_r397 = rightCarapace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(15, 88).mirror().addBox(-0.5425F, -1.2984F, -0.152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(-0.0661F, -1.8672F, 6.3463F, -1.3665F, -0.2097F, -0.2811F));

		PartDefinition cube_r398 = rightCarapace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(67, 31).mirror().addBox(-0.5425F, -1.0206F, 0.3314F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.157F)).mirror(false), PartPose.offsetAndRotation(-0.0661F, -1.8672F, 6.3463F, -1.1919F, -0.2097F, -0.2811F));

		PartDefinition cube_r399 = rightCarapace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(9, 43).mirror().addBox(-0.5425F, 0.11F, -0.6606F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.0661F, -1.8672F, 6.3463F, -0.712F, -0.2097F, -0.2811F));

		PartDefinition cube_r400 = rightCarapace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(52, 85).mirror().addBox(-0.5425F, 1.8416F, -0.3435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0661F, -1.8672F, 6.3463F, -1.3839F, -0.2097F, -0.2811F));

		PartDefinition cube_r401 = rightCarapace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(69, 80).mirror().addBox(-0.5425F, -1.0274F, 0.0703F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0661F, -1.8672F, 6.3463F, -2.0821F, -0.2097F, -0.2811F));

		PartDefinition cube_r402 = rightCarapace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(74, 80).mirror().addBox(-0.5425F, 0.2234F, -0.7729F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.157F)).mirror(false), PartPose.offsetAndRotation(-0.0661F, -1.8672F, 6.3463F, -1.1658F, -0.2097F, -0.2811F));

		PartDefinition cube_r403 = rightCarapace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(10, 88).mirror().addBox(-0.5425F, -0.3869F, -0.7997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(-0.0661F, -1.8672F, 6.3463F, -1.061F, -0.2097F, -0.2811F));

		PartDefinition cube_r404 = rightCarapace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(0, 88).mirror().addBox(-0.5425F, -0.9047F, -0.8031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)).mirror(false), PartPose.offsetAndRotation(-0.0661F, -1.8672F, 6.3463F, -1.2356F, -0.2097F, -0.2811F));

		PartDefinition cube_r405 = rightCarapace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(84, 87).mirror().addBox(-0.5425F, -1.5907F, -0.4745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(12, 81).mirror().addBox(-0.5425F, -1.5907F, -0.2745F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(-0.0661F, -1.8672F, 6.3463F, -0.8429F, -0.2097F, -0.2811F));

		PartDefinition cube_r406 = rightCarapace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(72, 61).mirror().addBox(-0.5637F, -2.1961F, 0.1066F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(21, 72).mirror().addBox(-0.5637F, -2.228F, -1.0859F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0661F, -1.8672F, 6.3463F, -0.9359F, -0.1892F, -0.2523F));

		PartDefinition cube_r407 = rightCarapace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(87, 73).mirror().addBox(-0.5637F, -2.4558F, -0.0643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0661F, -1.8672F, 6.3463F, -1.1977F, -0.1892F, -0.2523F));

		PartDefinition cube_r408 = rightCarapace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(82, 4).mirror().addBox(0.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-5.2108F, -3.5571F, -4.8702F, -1.2744F, -0.2535F, -0.8296F));

		PartDefinition cube_r409 = rightCarapace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(81, 30).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(-4.4561F, -4.9146F, -3.2616F, -1.2748F, 0.2483F, -0.6784F));

		PartDefinition cube_r410 = rightCarapace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(66, 77).mirror().addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-5.2051F, -5.529F, -3.5098F, -1.3182F, 0.1156F, -0.8541F));

		PartDefinition cube_r411 = rightCarapace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(35, 69).mirror().addBox(-2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-3.8799F, -6.1686F, -5.9253F, -1.3092F, 0.2844F, -0.8088F));

		PartDefinition cube_r412 = rightCarapace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(50, 88).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.5584F, -6.7125F, -3.5566F, -1.2706F, 0.2432F, -0.6612F));

		PartDefinition cube_r413 = rightCarapace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(19, 79).mirror().addBox(0.025F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-3.5584F, -6.7125F, -3.5566F, -1.2789F, 0.0762F, -0.7127F));

		PartDefinition cube_r414 = rightCarapace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(28, 69).mirror().addBox(-2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-2.3478F, -7.3606F, -6.4069F, -1.2706F, 0.2432F, -0.6612F));

		PartDefinition cube_r415 = rightCarapace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(30, 56).mirror().addBox(-2.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -8.0702F, -6.6936F, -1.2135F, 0.1439F, -0.3667F));

		PartDefinition cube_r416 = rightCarapace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(77, 68).mirror().addBox(-1.925F, -0.2F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.9432F, -5.9798F, -6.0414F, -1.0439F, 0.3158F, -0.8051F));

		PartDefinition cube_r417 = rightCarapace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(79, 81).mirror().addBox(0.0F, -2.0F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-4.6252F, -4.0564F, -6.9553F, -1.9578F, -0.4554F, 0.9774F));

		PartDefinition cube_r418 = rightCarapace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(81, 38).mirror().addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-4.6252F, -4.0564F, -6.9553F, -1.0722F, -0.0275F, -0.9988F));

		PartDefinition cube_r419 = rightCarapace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(81, 34).mirror().addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(-3.9432F, -4.578F, -7.4679F, -0.9804F, 0.5382F, -0.6529F));

		PartDefinition cube_r420 = rightCarapace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(79, 55).mirror().addBox(0.025F, -0.025F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-3.6353F, -5.839F, -5.6226F, -0.9605F, 0.2702F, -0.6463F));

		PartDefinition cube_r421 = rightCarapace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(49, 69).mirror().addBox(-2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-2.3672F, -5.4563F, -8.331F, -0.9119F, 0.4462F, -0.5084F));

		PartDefinition cube_r422 = rightCarapace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(54, 11).mirror().addBox(-2.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -5.9675F, -8.8333F, -0.8284F, 0.2539F, -0.2672F));

		PartDefinition cube_r423 = rightCarapace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(42, 62).mirror().addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-2.4819F, -5.4501F, -8.4604F, -2.8537F, -0.9599F, -0.8344F));

		PartDefinition cube_r424 = rightCarapace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(14, 75).mirror().addBox(-2.0F, -1.025F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-6.1336F, -3.1789F, 1.5237F, 3.0828F, 1.4577F, -2.5455F));

		PartDefinition cube_r425 = rightCarapace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(64, 23).mirror().addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.0753F, 9.7426F, -0.5252F, -0.1895F, 0.1087F));

		PartDefinition cube_r426 = rightCarapace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(85, 45).mirror().addBox(-0.75F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.0753F, 9.7426F, -0.5678F, 0.4136F, -0.2509F));

		PartDefinition cube_r427 = rightCarapace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(79, 85).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.6653F, -2.9048F, 10.044F, -0.575F, 0.6967F, -0.4931F));

		PartDefinition cube_r428 = rightCarapace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(55, 88).mirror().addBox(-0.375F, -0.125F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-2.5229F, -3.0178F, 9.3988F, -0.1446F, 0.2659F, -0.4136F));

		PartDefinition cube_r429 = rightCarapace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(14, 63).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-3.2956F, -2.4742F, 8.1012F, -0.1504F, -0.3819F, -0.3189F));

		PartDefinition cube_r430 = rightCarapace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(65, 15).mirror().addBox(0.0F, -0.5F, -2.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-4.0467F, -2.0644F, 8.8553F, -0.1395F, 0.0067F, -0.3763F));

		PartDefinition cube_r431 = rightCarapace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(63, 45).mirror().addBox(-0.65F, -0.575F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-4.1341F, -2.2579F, 7.3451F, -0.248F, -0.1351F, -0.2232F));

		PartDefinition cube_r432 = rightCarapace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-0.2F, -0.575F, -0.625F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-4.5366F, -2.4106F, 6.6564F, -1.0721F, 1.2311F, -1.4004F));

		PartDefinition cube_r433 = rightCarapace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(75, 6).mirror().addBox(-1.0F, -0.575F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-5.1369F, -2.8876F, 4.7714F, -1.4666F, 1.2283F, -1.8153F));

		PartDefinition cube_r434 = rightCarapace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(75, 3).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-5.4546F, -3.2042F, 3.8467F, -1.452F, 1.2716F, -1.7999F));

		PartDefinition cube_r435 = rightCarapace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(75, 9).mirror().addBox(0.3F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-5.4546F, -3.2042F, 3.8467F, -1.1872F, 1.2497F, -1.5221F));

		PartDefinition cube_r436 = rightCarapace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(68, 74).mirror().addBox(-1.0F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-5.9777F, -3.901F, 1.1189F, -0.9281F, 1.3725F, -1.2546F));

		PartDefinition cube_r437 = rightCarapace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(52, 5).mirror().addBox(0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-6.6925F, -4.3996F, -1.4106F, 1.18F, 1.4889F, 0.8678F));

		PartDefinition cube_r438 = rightCarapace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(75, 0).mirror().addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-5.9518F, -2.9314F, -6.1995F, 1.1018F, 1.3314F, 0.8269F));

		PartDefinition cube_r439 = rightCarapace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(84, 84).mirror().addBox(1.774F, 0.0322F, -0.9229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-6.5081F, -4.1326F, -4.3974F, 0.2497F, 0.963F, -0.0333F));

		PartDefinition cube_r440 = rightCarapace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(91, 29).mirror().addBox(1.4901F, 0.0322F, 1.5318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-6.5081F, -4.1326F, -4.3974F, 2.6647F, 1.2583F, 2.445F));

		PartDefinition cube_r441 = rightCarapace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(42, 41).mirror().addBox(1.4901F, 0.8535F, 2.0099F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-6.5081F, -4.1326F, -4.3974F, 3.0225F, 1.2583F, 2.445F));

		PartDefinition cube_r442 = rightCarapace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(61, 74).mirror().addBox(-2.1F, -0.35F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-6.4942F, -4.0898F, -1.4955F, -2.0868F, 1.4574F, -2.3909F));

		PartDefinition cube_r443 = rightCarapace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(75, 74).mirror().addBox(-0.9F, -0.45F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.7348F, -2.9474F, 9.7212F, -0.4417F, 0.8507F, -0.7284F));

		PartDefinition cube_r444 = rightCarapace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(21, 76).mirror().addBox(-0.15F, -0.5F, -0.175F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.1848F, -2.5571F, 10.1964F, -0.7492F, 1.144F, -1.0894F));

		PartDefinition cube_r445 = rightCarapace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(23, 55).mirror().addBox(0.025F, 0.05F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.9763F, -3.6606F, 9.8251F, -0.4414F, 0.4475F, 1.0543F));

		PartDefinition cube_r446 = rightCarapace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(44, 57).mirror().addBox(0.025F, 0.05F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-2.7313F, -3.0891F, 9.0547F, -0.7001F, 0.4165F, 0.9323F));

		PartDefinition cube_r447 = rightCarapace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(56, 45).mirror().addBox(-2.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -9.0119F, 2.0495F, -1.9859F, -0.1655F, -0.3578F));

		PartDefinition cube_r448 = rightCarapace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(56, 69).mirror().addBox(-2.0F, -3.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-2.3478F, -8.3211F, 1.72F, -1.9303F, -0.2683F, -0.6142F));

		PartDefinition cube_r449 = rightCarapace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(26, 80).mirror().addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-2.3478F, -8.235F, 1.9005F, -1.9176F, -0.0635F, -0.6906F));

		PartDefinition cube_r450 = rightCarapace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-2.0F, -3.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-3.9238F, -7.2097F, 1.1899F, -1.8564F, -0.3461F, -0.8573F));

		PartDefinition cube_r451 = rightCarapace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(33, 80).mirror().addBox(-2.0F, -1.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-3.5298F, -6.6735F, 1.5989F, -1.8403F, -0.0942F, -0.9306F));

		PartDefinition cube_r452 = rightCarapace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(11, 48).mirror().addBox(-1.675F, -3.6F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-5.1551F, -5.2275F, 1.6848F, -1.9099F, 0.0514F, -0.7582F));

		PartDefinition cube_r453 = rightCarapace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(43, 6).mirror().addBox(0.025F, -3.0F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-5.4377F, -3.3106F, 5.1626F, -2.0255F, 0.1219F, -0.7108F));

		PartDefinition cube_r454 = rightCarapace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(40, 46).mirror().addBox(-2.0F, -5.0F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -7.7203F, 4.7573F, -2.2733F, -0.2615F, -0.2964F));

		PartDefinition cube_r455 = rightCarapace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(54, 51).mirror().addBox(-2.0F, -4.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-2.3478F, -7.156F, 4.2402F, -2.1994F, -0.4239F, -0.5148F));

		PartDefinition cube_r456 = rightCarapace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(73, 77).mirror().addBox(-2.0F, -0.9F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-2.3478F, -6.9534F, 4.4614F, -2.1625F, -0.2807F, -0.6213F));

		PartDefinition cube_r457 = rightCarapace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(82, 0).mirror().addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(-3.9345F, -4.9072F, 4.8922F, -2.0985F, -0.5484F, -0.7297F));

		PartDefinition cube_r458 = rightCarapace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(77, 71).mirror().addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-3.9345F, -5.8531F, 3.86F, -2.0472F, -0.3569F, -0.8463F));

		PartDefinition cube_r459 = rightCarapace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(53, 27).mirror().addBox(-2.3F, -1.025F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-6.3239F, -3.3564F, -0.7615F, -3.0468F, 1.4574F, -2.3909F));

		PartDefinition cube_r460 = rightCarapace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(72, 16).mirror().addBox(-1.0F, -0.5F, -0.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-4.9489F, -3.4973F, -5.231F, -2.956F, 0.982F, -2.3401F));

		PartDefinition cube_r461 = rightCarapace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(28, 61).mirror().addBox(3.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(37, 25).mirror().addBox(0.0F, -1.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-6.3873F, -3.4503F, -1.3351F, -1.287F, 1.4638F, -0.6388F));

		PartDefinition cube_r462 = rightCarapace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(51, 61).mirror().addBox(-0.825F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.167F, -5.3925F, -7.9051F, -2.471F, -1.1086F, -0.9341F));

		PartDefinition cube_r463 = rightCarapace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(86, 54).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.0055F, -5.2042F, -9.23F, -2.307F, -0.9114F, -0.7172F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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