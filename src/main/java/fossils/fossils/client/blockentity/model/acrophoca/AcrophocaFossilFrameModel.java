package fossils.fossils.client.blockentity.model.acrophoca;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AcrophocaFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart chest;
	private final ModelPart body6;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart hips;
	private final ModelPart bone4;
	private final ModelPart bone2;
	private final ModelPart leftarm4;
	private final ModelPart leftarm5;
	private final ModelPart leftArm6;
	private final ModelPart rightarm4;
	private final ModelPart rightarm5;
	private final ModelPart rightArm6;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart body5;
	private final ModelPart body7;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart bone3;
	private final ModelPart bone5;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart leftCanine3;
	private final ModelPart rightCanine3;
	private final ModelPart bone;

	public AcrophocaFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.chest = this.fossil.getChild("chest");
		this.body6 = this.chest.getChild("body6");
		this.body = this.body6.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.hips = this.body4.getChild("hips");
		this.bone4 = this.hips.getChild("bone4");
		this.bone2 = this.hips.getChild("bone2");
		this.leftarm4 = this.hips.getChild("leftarm4");
		this.leftarm5 = this.leftarm4.getChild("leftarm5");
		this.leftArm6 = this.leftarm5.getChild("leftArm6");
		this.rightarm4 = this.hips.getChild("rightarm4");
		this.rightarm5 = this.rightarm4.getChild("rightarm5");
		this.rightArm6 = this.rightarm5.getChild("rightArm6");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.body5 = this.body4.getChild("body5");
		this.body7 = this.body4.getChild("body7");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.bone3 = this.chest.getChild("bone3");
		this.bone5 = this.chest.getChild("bone5");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.head = this.neck5.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.leftCanine3 = this.jaw.getChild("leftCanine3");
		this.rightCanine3 = this.jaw.getChild("rightCanine3");
		this.bone = this.neck2.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition chest = fossil.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -10.9747F, -7.9122F, -0.5738F, 1.2116F, -0.5442F));

		PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(15, 23).addBox(-0.5F, 0.5447F, 3.4271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(13, 20).addBox(-0.5F, 0.5447F, -0.2729F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.8854F, -3.7706F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r2 = chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(14, 22).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 2.8723F, -0.7267F, -1.213F, 0.0F, 0.0F));

		PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(8, 16).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.8723F, -0.7267F, -1.5708F, -0.3578F, 1.5708F));

		PartDefinition body6 = chest.addOrReplaceChild("body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1455F, -0.0389F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body6.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(24, 12).addBox(-0.5F, 0.4F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1921F, 1.0781F, 0.0349F, 0.0F, 0.0F));

		PartDefinition body = body6.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.186F, 3.9776F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(22, 6).addBox(-0.5F, -0.2F, -9.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4433F, 8.9202F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9334F, 3.6148F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(14, 34).addBox(-0.5F, 0.6988F, 7.6474F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.4624F, -7.5423F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0994F, 2.7653F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(13, 14).addBox(-0.5F, -0.75F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.1F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(11, 26).addBox(-0.5F, 0.3F, -0.425F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(14, 29).addBox(-0.5F, 0.3F, 3.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.2991F, -0.1251F, 0.0385F));

		PartDefinition hips = body4.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2813F, 10.8351F, 0.4084F, -0.4457F, -0.1844F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(21, 25).addBox(1.7F, 0.2F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.3795F, 0.6277F, -1.5708F, -0.4451F, -1.5708F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(22, 26).addBox(-0.5F, 0.6014F, 0.0389F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4473F, 0.1279F, -0.4451F, 0.0F, 0.0F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3051F, 1.1682F, 1.5735F, 0.1369F, -0.1699F, 0.2387F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3051F, 1.1682F, 1.5735F, 0.1369F, 0.1699F, -0.2387F));

		PartDefinition leftarm4 = hips.addOrReplaceChild("leftarm4", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1627F, 0.7971F, 1.3018F, -0.8733F, 0.1321F, -0.8902F));

		PartDefinition leftarm5 = leftarm4.addOrReplaceChild("leftarm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1452F, 1.7344F, 1.8976F, 1.5034F, -0.6362F, 0.5114F));

		PartDefinition leftArm6 = leftarm5.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3874F, 5.7262F, 0.8643F, -0.0744F, 0.001F, -0.1323F));

		PartDefinition rightarm4 = hips.addOrReplaceChild("rightarm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1627F, 0.7971F, 1.3018F, -0.8733F, -0.1321F, 0.8902F));

		PartDefinition rightarm5 = rightarm4.addOrReplaceChild("rightarm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1452F, 1.7344F, 1.8976F, 1.5034F, 0.6362F, -0.5114F));

		PartDefinition rightArm6 = rightarm5.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3874F, 5.7262F, 0.8643F, -0.0744F, -0.001F, 0.1323F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(35, 10).addBox(-0.5F, 0.4098F, -0.2618F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(37, 12).addBox(-0.5F, 0.4098F, 2.1382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 1.491F, 3.6799F, -0.6109F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(7, 43).addBox(-0.5F, 0.4006F, -0.0157F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(8, 44).addBox(-0.5F, 0.4006F, 1.3843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -0.0057F, 2.7985F, 0.0785F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(42, 25).addBox(-0.5F, 0.3756F, -0.0278F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0321F, 1.9299F, 0.1658F, 0.0F, 0.0F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(22, 0).addBox(-0.5F, 0.3F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body7 = body4.addOrReplaceChild("body7", CubeListBuilder.create().texOffs(33, 0).addBox(-0.5F, 0.3F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1396F, 7.9976F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r10 = body7.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(35, 2).addBox(-0.5F, -0.85F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.15F, 2.575F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.7098F, 2.5976F, -1.2902F, 0.4013F, 0.215F, -0.1353F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3753F, 2.3937F, 2.6665F, -0.2118F, 0.1946F, 0.1214F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2667F, 2.9803F, 1.471F, 0.9696F, -0.03F, 0.0837F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7098F, 2.5976F, -1.2902F, 0.4013F, -0.215F, 0.1353F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3753F, 2.3937F, 2.6665F, -0.2118F, -0.1946F, -0.1214F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2667F, 2.9803F, 1.471F, 0.9696F, 0.03F, -0.0837F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(2.4627F, 0.3449F, -1.6633F));

		PartDefinition bone5 = chest.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-2.4627F, 0.3449F, -1.6633F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2539F, -3.7545F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r11 = neck2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(14, 43).addBox(-0.5F, 0.2435F, -2.2395F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(15, 44).addBox(-0.5F, 0.2435F, -0.5395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1313F, 0.0158F, 0.0698F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0299F, -1.7964F, -0.1752F, 0.0859F, -0.0152F));

		PartDefinition cube_r12 = neck.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(42, 3).addBox(-0.5F, 0.234F, -1.866F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0049F, -0.0064F, 0.0524F, 0.0F, 0.0F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0049F, -1.9064F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r13 = neck3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(28, 48).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.0903F, -0.3953F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r14 = neck3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(28, 48).addBox(-0.5F, 0.3F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -1.8F, -0.134F, 0.2163F, -0.0289F));

		PartDefinition cube_r15 = neck4.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, 0.3F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, -1.925F, 0.3674F, 0.5788F, 0.2075F));

		PartDefinition cube_r16 = neck5.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(27, 32).addBox(-0.5F, 0.3F, -2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.375F, -0.05F, 0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck5.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9093F, -2.5086F, -0.2597F, -0.0338F, -0.1265F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.3F, 5.0495F, -4.4505F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.3F, 5.0495F, -4.4505F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 1.4019F, -0.9103F, 1.9286F, 0.0F, 0.0F));

		PartDefinition leftCanine3 = jaw.addOrReplaceChild("leftCanine3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2572F, 0.9281F, -3.9069F, -1.1202F, 0.0554F, -2.6677F));

		PartDefinition rightCanine3 = jaw.addOrReplaceChild("rightCanine3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9428F, 0.9281F, -3.9069F, -1.1202F, -0.0554F, 2.6677F));

		PartDefinition bone = neck2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 85, 85);
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