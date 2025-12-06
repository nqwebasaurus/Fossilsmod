package fossils.fossils.client.blockentity.model.diadectes;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DiadectesFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart diadectes;
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

	public DiadectesFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.diadectes = this.fossil.getChild("diadectes");
		this.hips = this.diadectes.getChild("hips");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -7.0F, 16.6F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.6F, 0.2F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(7.6F, -11.0F, -10.9F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(8.3F, -4.0F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(7.6F, -11.0F, -10.9F, -0.48F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(6.1F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -11.0F, 17.1F, 0.0F, 0.0F, 1.5708F));

		PartDefinition diadectes = fossil.addOrReplaceChild("diadectes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.0F, -1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition hips = diadectes.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9196F, 18.4022F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, -0.3904F, -0.009F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.2266F, -3.0755F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Rightthigh = hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4774F, 2.2686F, -0.0034F, 0.1087F, 0.6782F, -1.4167F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1015F, 5.9802F, -1.6137F, 1.2916F, -0.9629F, 0.4228F));

		PartDefinition leftFoot3 = Rightshin.addOrReplaceChild("leftFoot3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0827F, 7.7886F, 0.5834F, -0.3517F, 0.55F, 1.0602F));

		PartDefinition leftFoot4 = leftFoot3.addOrReplaceChild("leftFoot4", CubeListBuilder.create(), PartPose.offset(3.0195F, 0.6233F, 1.0F));

		PartDefinition Leftthigh = hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4774F, 2.2686F, -0.0034F, -0.3439F, -0.2911F, 1.9674F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1015F, 5.9802F, -1.6137F, 1.0759F, 0.8815F, -0.777F));

		PartDefinition rightFoot3 = Leftshin.addOrReplaceChild("rightFoot3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0827F, 7.7886F, 0.5834F, -0.1203F, -0.5633F, -1.0188F));

		PartDefinition rightFoot4 = rightFoot3.addOrReplaceChild("rightFoot4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0195F, 0.6233F, 1.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5734F, 3.526F, 1.3557F, 0.0F, 0.0F, 0.3491F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.983F, -0.961F, 1.3557F, 0.0F, 0.0F, -0.3491F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6591F, 4.5244F, 0.1208F, 0.1733F, 0.0209F));

		PartDefinition cube_r5 = tail.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(7, 41).addBox(-0.5F, -0.2432F, 7.0991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 34).addBox(-0.5F, -0.2432F, -0.601F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1844F, 0.3155F, -0.4363F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9798F, 7.2921F, -0.0246F, 0.2181F, -0.0053F));

		PartDefinition cube_r6 = tail2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 60).addBox(-0.5F, 0.4F, -4.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9117F, 5.6011F, 0.0509F, 0.218F, -0.0079F));

		PartDefinition cube_r7 = tail3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(60, 60).addBox(-1.0F, -0.25F, 2.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(55, 55).addBox(-1.0F, -0.25F, -2.95F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 1.2749F, 2.4865F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8214F, 5.7215F, -0.1062F, 0.2613F, -0.0162F));

		PartDefinition cube_r8 = tail4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(45, 63).addBox(-0.5F, 2.45F, -6.15F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.8166F, 6.3062F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(38, 50).addBox(-0.5F, 0.1675F, -0.2812F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2931F, 4.8349F, -0.0449F, 0.218F, -0.0097F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3823F, -3.1544F, -0.1879F, -0.1368F, -0.0181F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(26, 46).addBox(-0.5F, -0.6F, 14.4974F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(19, 39).addBox(-0.5F, -0.6F, 6.7974F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3254F, -14.9819F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8418F, -7.9575F, -0.0294F, -0.1308F, 0.0038F));

		PartDefinition cube_r10 = body2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(58, 63).addBox(-0.5F, 0.3285F, 3.9779F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3902F, -4.9138F, 0.0498F, -0.1307F, -0.0065F));

		PartDefinition cube_r11 = body3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(67, 26).addBox(-0.5F, 0.3285F, 8.2779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(63, 22).addBox(-0.5F, 0.3285F, 3.5779F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3888F, -4.8803F, 0.0756F, 0.0F, 0.0F));

		PartDefinition cube_r12 = body4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(65, 0).addBox(-0.5F, 0.3285F, 3.7779F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition chest = body4.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4267F, -4.8855F, 0.0756F, 0.0F, 0.0F));

		PartDefinition cube_r13 = chest.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(17, 57).addBox(-0.5F, 0.3285F, 2.9779F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = chest.addOrReplaceChild("Rightupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.4095F, 9.2333F, -4.2865F, 0.2977F, 0.0434F, -1.6962F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8686F, 7.0572F, -0.5472F, -1.5662F, 0.2156F, 0.0344F));

		PartDefinition leftFoot = Rightlowerarm.addOrReplaceChild("leftFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1859F, 5.519F, 0.0F, -0.0179F, 0.1562F, 1.3891F));

		PartDefinition leftFoot2 = leftFoot.addOrReplaceChild("leftFoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 0.6F, 0.0F, 0.0086F, -0.0005F, -0.1229F));

		PartDefinition Leftupperarm = chest.addOrReplaceChild("Leftupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.4095F, 9.2333F, -4.2865F, 0.1791F, 0.34F, 1.4883F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8686F, 7.0572F, -0.5472F, -1.9601F, -0.3404F, 0.164F));

		PartDefinition rightFoot = Leftlowerarm.addOrReplaceChild("rightFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1859F, 5.519F, 0.0F, -0.057F, -0.1543F, -1.6983F));

		PartDefinition rightFoot2 = rightFoot.addOrReplaceChild("rightFoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 0.6F, 0.0F, 0.0086F, 0.0005F, 0.1229F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(5.3298F, 1.3421F, -3.5144F, -0.087F, 0.1385F, -0.0003F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.3298F, 1.3421F, -3.5144F, -0.087F, -0.1385F, 0.0003F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5414F, -5.7509F, -0.1255F, -0.387F, -0.0685F));

		PartDefinition cube_r14 = neck.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(63, 8).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2743F, -4.0796F, -0.0698F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5753F, -4.8025F, -0.1637F, -0.3448F, 0.0558F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.2548F, 0.2675F, 0.315F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.2548F, 0.2675F, 0.315F));

		PartDefinition lower_jaw = head.addOrReplaceChild("lower_jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5126F, -0.904F, 0.6545F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 108, 108);
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