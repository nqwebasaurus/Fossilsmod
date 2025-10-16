package fossils.fossils.client.blockentity.model.tetraceratops;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TetraceratopsFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Tetraceratops;
	private final ModelPart hips;
	private final ModelPart Rightthigh;
	private final ModelPart Rightshin;
	private final ModelPart leftFoot3;
	private final ModelPart leftFoot4;
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart rightFoot3;
	private final ModelPart rightFoot4;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;
	private final ModelPart tail10;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart chest;
	private final ModelPart Rightupperarm;
	private final ModelPart Rightlowerarm;
	private final ModelPart leftFoot;
	private final ModelPart leftFoot2;
	private final ModelPart Leftupperarm;
	private final ModelPart Leftlowerarm;
	private final ModelPart rightFoot;
	private final ModelPart rightFoot2;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart lower_jaw;

	public TetraceratopsFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Tetraceratops = this.fossil.getChild("Tetraceratops");
		this.hips = this.Tetraceratops.getChild("hips");
		this.Rightthigh = this.hips.getChild("Rightthigh");
		this.Rightshin = this.Rightthigh.getChild("Rightshin");
		this.leftFoot3 = this.Rightshin.getChild("leftFoot3");
		this.leftFoot4 = this.leftFoot3.getChild("leftFoot4");
		this.Leftthigh = this.hips.getChild("Leftthigh");
		this.Leftshin = this.Leftthigh.getChild("Leftshin");
		this.rightFoot3 = this.Leftshin.getChild("rightFoot3");
		this.rightFoot4 = this.rightFoot3.getChild("rightFoot4");
		this.bone2 = this.hips.getChild("bone2");
		this.bone4 = this.hips.getChild("bone4");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
		this.tail10 = this.tail9.getChild("tail10");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.chest = this.body4.getChild("chest");
		this.Rightupperarm = this.chest.getChild("Rightupperarm");
		this.Rightlowerarm = this.Rightupperarm.getChild("Rightlowerarm");
		this.leftFoot = this.Rightlowerarm.getChild("leftFoot");
		this.leftFoot2 = this.leftFoot.getChild("leftFoot2");
		this.Leftupperarm = this.chest.getChild("Leftupperarm");
		this.Leftlowerarm = this.Leftupperarm.getChild("Leftlowerarm");
		this.rightFoot = this.Leftlowerarm.getChild("rightFoot");
		this.rightFoot2 = this.rightFoot.getChild("rightFoot2");
		this.bone = this.chest.getChild("bone");
		this.bone3 = this.chest.getChild("bone3");
		this.neck = this.chest.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.lower_jaw = this.head.getChild("lower_jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -4.15F, -0.5F, 1.0F, 19.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-4.25F, -14.85F, -8.1F, 0.0F, 0.4712F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-3.65F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-4.2F, -14.85F, -8.1F, -0.4712F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-3.65F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -14.85F, 18.2F, -0.0873F, 0.0F, -1.5708F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -0.15F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -14.85F, 18.2F, 0.0F, 0.0873F, 0.0F));

		PartDefinition Tetraceratops = fossil.addOrReplaceChild("Tetraceratops", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.6973F, -0.939F, -0.0873F, 0.0F, 0.0F));

		PartDefinition hips = Tetraceratops.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.279F, 18.3157F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(23, 16).addBox(-0.5F, -0.3904F, -0.009F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.2266F, -3.0755F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Rightthigh = hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3046F, 2.4699F, 0.4417F, -0.4794F, 0.3791F, -0.6442F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6347F, 7.0502F, -0.6217F, 1.0841F, -1.0933F, -0.6303F));

		PartDefinition leftFoot3 = Rightshin.addOrReplaceChild("leftFoot3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0562F, 6.1685F, 0.6928F, 2.7388F, 0.6285F, 2.9398F));

		PartDefinition leftFoot4 = leftFoot3.addOrReplaceChild("leftFoot4", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 0.6F, 0.9F, 0.0F, 0.0F, -0.3054F));

		PartDefinition Leftthigh = hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3046F, 2.4699F, 0.4417F, -0.0422F, 0.0006F, 0.3225F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6347F, 7.0502F, -0.6217F, 1.8742F, 0.6017F, 0.9179F));

		PartDefinition rightFoot3 = Leftshin.addOrReplaceChild("rightFoot3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0562F, 6.1685F, 0.6928F, 3.1284F, -0.7314F, 2.736F));

		PartDefinition rightFoot4 = rightFoot3.addOrReplaceChild("rightFoot4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 0.6F, 0.9F, 0.0F, 0.0F, 0.5672F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.769F, 0.224F, 1.5557F, 0.0F, 0.0F, 0.3142F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.769F, 0.224F, 1.5557F, 0.0F, 0.0F, -0.3142F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6542F, 4.6243F, 0.112F, -0.1735F, -0.0194F));

		PartDefinition cube_r6 = tail.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(8, 8).addBox(-0.5F, -0.2432F, 9.0991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 0).addBox(-0.5F, -0.2432F, -0.601F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1844F, 0.3155F, -0.4363F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.8392F, 9.1501F, -0.1642F, -0.1744F, 0.0058F));

		PartDefinition cube_r7 = tail2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(42, 24).addBox(-0.5F, 0.4F, -4.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9117F, 5.6011F, -0.167F, -0.136F, -0.0341F));

		PartDefinition cube_r8 = tail3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(34, 36).addBox(-1.0F, -0.25F, -2.75F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 1.2749F, 2.4865F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8214F, 5.7215F, -0.0962F, 0.1303F, -0.0125F));

		PartDefinition cube_r9 = tail4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(45, 48).addBox(-0.5F, 2.45F, -1.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(41, 44).addBox(-0.5F, 2.45F, -6.55F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.8166F, 6.3062F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 45).addBox(-0.5F, 0.1675F, -0.0812F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2931F, 4.8349F, -0.0095F, 0.3491F, -0.0033F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(49, 32).addBox(-0.5F, 0.1675F, -0.4812F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(53, 36).addBox(-0.5F, 0.1675F, 4.2188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0146F, 4.9356F, 0.0449F, 0.2615F, 0.0116F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(28, 51).addBox(-0.5F, 0.1675F, -0.0812F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0111F, 5.0006F, -0.0545F, 0.2614F, -0.0141F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(54, 51).addBox(-0.5F, 0.1675F, -0.4812F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(58, 55).addBox(-0.5F, 0.1675F, 4.2188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0115F, 5.001F, -0.0192F, 0.3926F, -0.0073F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(41, 51).addBox(-0.5F, 0.1675F, -0.0812F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0115F, 5.001F, -0.0725F, 0.2611F, -0.0188F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(42, 16).addBox(-0.5F, 0.1675F, -0.3812F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0205F, 4.9357F, -0.0745F, 0.3482F, -0.0255F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3823F, -3.1544F, -0.1752F, 0.0859F, -0.0152F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(30, 33).addBox(-0.5F, -0.6F, 14.4974F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(23, 26).addBox(-0.5F, -0.6F, 6.7974F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3254F, -14.9819F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8418F, -7.9575F, -0.0993F, 0.0868F, -0.0086F));

		PartDefinition cube_r11 = body2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(28, 44).addBox(-0.5F, 0.3284F, 3.9779F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3902F, -4.9138F, 0.0843F, 0.0F, 0.0F));

		PartDefinition cube_r12 = body3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(13, 52).addBox(-0.5F, 0.3284F, 4.1779F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3888F, -4.8803F, 0.0762F, 0.1305F, 0.0099F));

		PartDefinition cube_r13 = body4.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(58, 48).addBox(-0.5F, 0.3284F, 8.4779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(54, 44).addBox(-0.5F, 0.3284F, 3.7779F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition chest = body4.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4267F, -4.8855F, 0.0565F, 0.1701F, 0.0956F));

		PartDefinition cube_r14 = chest.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5F, 0.3285F, 2.9779F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = chest.addOrReplaceChild("Rightupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.503F, 6.8043F, -0.8554F, -0.1618F, 0.1114F, -0.4752F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2549F, 7.3932F, -0.5251F, -1.3223F, 1.1289F, -1.003F));

		PartDefinition leftFoot = Rightlowerarm.addOrReplaceChild("leftFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1859F, 5.519F, 0.0F, -0.0994F, 0.122F, 0.8172F));

		PartDefinition leftFoot2 = leftFoot.addOrReplaceChild("leftFoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 0.6F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition Leftupperarm = chest.addOrReplaceChild("Leftupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.503F, 6.8043F, -0.8554F, 0.5363F, -0.1114F, 0.4752F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2549F, 7.3932F, -0.5251F, -1.4532F, -1.1289F, 1.003F));

		PartDefinition rightFoot = Leftlowerarm.addOrReplaceChild("rightFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1859F, 5.519F, 0.0F, -0.1469F, -0.0561F, -0.2956F));

		PartDefinition rightFoot2 = rightFoot.addOrReplaceChild("rightFoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 0.6F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6392F, 3.6077F, -2.665F, -0.0115F, 0.1304F, -0.088F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6392F, 3.6077F, -2.665F, -0.0115F, -0.1304F, 0.088F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5414F, -5.7509F, 0.0804F, 0.2616F, 0.0095F));

		PartDefinition cube_r15 = neck.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(61, 58).addBox(-1.0F, -2.2F, -2.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 2.2293F, -1.2392F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3586F, -4.1808F, -0.3129F, 0.3849F, 0.0801F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5F, 0.9104F, 0.9196F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.9104F, 0.9196F));

		PartDefinition lower_jaw = head.addOrReplaceChild("lower_jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1596F, -0.0661F, 0.5672F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 103, 103);
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