package fossils.fossils.client.blockentity.model.kayentatherium;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class KayentatheriumFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Tailbase;
	private final ModelPart Tailmiddle;
	private final ModelPart Tailend;
	private final ModelPart Bodymiddle;
	private final ModelPart Bodyfront;
	private final ModelPart Neck;
	private final ModelPart Head;
	private final ModelPart Eyeportion;
	private final ModelPart Snout;
	private final ModelPart Nose;
	private final ModelPart Noseunderslope;
	private final ModelPart Rightupperfang;
	private final ModelPart Rightupperbackteeth;
	private final ModelPart leftZygomaticarch;
	private final ModelPart rightZygomaticarch;
	private final ModelPart Lowerjawbase;
	private final ModelPart Lowerjawmiddle;
	private final ModelPart Lowerjawfront;
	private final ModelPart Lowerfrontteeth;
	private final ModelPart Rightlowerfang;
	private final ModelPart Mouthinterior;
	private final ModelPart Jawparting;
	private final ModelPart Lowerjawfluff;
	private final ModelPart Rightupperarm;
	private final ModelPart Rightlowerarm;
	private final ModelPart Rightfrontfoot;
	private final ModelPart Leftupperarm;
	private final ModelPart Leftlowerarm;
	private final ModelPart Leftfrontfoot;
	private final ModelPart Chestslope;
	private final ModelPart Rightthigh;
	private final ModelPart Rightshin;
	private final ModelPart Righthindfoot;
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart Lefthindfoot;

	public KayentatheriumFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.Tailmiddle = this.Tailbase.getChild("Tailmiddle");
		this.Tailend = this.Tailmiddle.getChild("Tailend");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.Bodyfront = this.Bodymiddle.getChild("Bodyfront");
		this.Neck = this.Bodyfront.getChild("Neck");
		this.Head = this.Neck.getChild("Head");
		this.Eyeportion = this.Head.getChild("Eyeportion");
		this.Snout = this.Eyeportion.getChild("Snout");
		this.Nose = this.Snout.getChild("Nose");
		this.Noseunderslope = this.Nose.getChild("Noseunderslope");
		this.Rightupperfang = this.Snout.getChild("Rightupperfang");
		this.Rightupperbackteeth = this.Snout.getChild("Rightupperbackteeth");
		this.leftZygomaticarch = this.Eyeportion.getChild("leftZygomaticarch");
		this.rightZygomaticarch = this.Eyeportion.getChild("rightZygomaticarch");
		this.Lowerjawbase = this.Head.getChild("Lowerjawbase");
		this.Lowerjawmiddle = this.Lowerjawbase.getChild("Lowerjawmiddle");
		this.Lowerjawfront = this.Lowerjawmiddle.getChild("Lowerjawfront");
		this.Lowerfrontteeth = this.Lowerjawfront.getChild("Lowerfrontteeth");
		this.Rightlowerfang = this.Lowerjawfront.getChild("Rightlowerfang");
		this.Mouthinterior = this.Lowerjawfront.getChild("Mouthinterior");
		this.Jawparting = this.Lowerjawmiddle.getChild("Jawparting");
		this.Lowerjawfluff = this.Lowerjawmiddle.getChild("Lowerjawfluff");
		this.Rightupperarm = this.Bodyfront.getChild("Rightupperarm");
		this.Rightlowerarm = this.Rightupperarm.getChild("Rightlowerarm");
		this.Rightfrontfoot = this.Rightlowerarm.getChild("Rightfrontfoot");
		this.Leftupperarm = this.Bodyfront.getChild("Leftupperarm");
		this.Leftlowerarm = this.Leftupperarm.getChild("Leftlowerarm");
		this.Leftfrontfoot = this.Leftlowerarm.getChild("Leftfrontfoot");
		this.Chestslope = this.Bodyfront.getChild("Chestslope");
		this.Rightthigh = this.Hips.getChild("Rightthigh");
		this.Rightshin = this.Rightthigh.getChild("Rightshin");
		this.Righthindfoot = this.Rightshin.getChild("Righthindfoot");
		this.Leftthigh = this.Hips.getChild("Leftthigh");
		this.Leftshin = this.Leftthigh.getChild("Leftshin");
		this.Lefthindfoot = this.Leftshin.getChild("Lefthindfoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -6.0F, 3.9F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(1, 1).addBox(0.0F, -8.0F, -9.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-2.1F, -2.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(1, 1).addBox(-1.6F, -3.0F, 12.4F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -7.0F, -8.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.9F, 6.0F, -0.4245F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(20, 12).addBox(-0.5F, 0.9F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1F, -3.5F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(16, 29).addBox(-0.5F, 0.3F, -0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.1F, 0.1F, -0.1017F, -0.042F, 0.0119F));

		PartDefinition Tailmiddle = Tailbase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create().texOffs(18, 24).addBox(-0.5F, 0.326F, -0.0945F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.2393F, -0.1697F, -0.0412F));

		PartDefinition Tailend = Tailmiddle.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(8, 8).addBox(-0.49F, 0.0816F, -0.5912F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.01F, 0.126F, 3.8055F, 0.3253F, -0.1258F, -0.0363F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(20, 18).addBox(-0.5F, 0.7F, -8.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.8F, -4.0F, 0.4458F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(20, 6).addBox(-0.5F, 0.8F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1F, -3.8F, -0.2793F, 0.0F, 0.0F));

		PartDefinition Bodyfront = Bodymiddle.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 0.6F, -7.5F, -0.0215F, -0.1309F, 0.0028F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(0, 6).addBox(-0.49F, 0.3686F, 0.0016F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3F, -5.2F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Neck = Bodyfront.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(10, 20).addBox(-0.49F, 0.3F, -4.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4F, -5.0F, -0.2903F, -0.3424F, 0.069F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, -0.3F, -3.0F, 0.0725F, 0.0975F, 0.0003F));

		PartDefinition Eyeportion = Head.addOrReplaceChild("Eyeportion", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -1.5F, -2.0F, 0.0637F, 0.0F, 0.0F));

		PartDefinition Snout = Eyeportion.addOrReplaceChild("Snout", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -1.1F, 0.0637F, 0.0F, 0.0F));

		PartDefinition Nose = Snout.addOrReplaceChild("Nose", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.5095F, 0.0F, 0.0F));

		PartDefinition Noseunderslope = Nose.addOrReplaceChild("Noseunderslope", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 1.0F, -1.0F, 0.3821F, 0.0F, 0.0F));

		PartDefinition Rightupperfang = Snout.addOrReplaceChild("Rightupperfang", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 1.5F, -2.1F, -0.4882F, 0.0F, -0.0213F));

		PartDefinition Rightupperbackteeth = Snout.addOrReplaceChild("Rightupperbackteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.78F, 2.3F, -2.3F, 1.5708F, 0.0F, 0.0F));

		PartDefinition leftZygomaticarch = Eyeportion.addOrReplaceChild("leftZygomaticarch", CubeListBuilder.create(), PartPose.offset(1.9F, 0.4F, 0.9F));

		PartDefinition rightZygomaticarch = Eyeportion.addOrReplaceChild("rightZygomaticarch", CubeListBuilder.create(), PartPose.offset(-1.88F, 0.4F, 0.9F));

		PartDefinition Lowerjawbase = Head.addOrReplaceChild("Lowerjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 0.01F, -2.3F, 0.7442F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddle = Lowerjawbase.addOrReplaceChild("Lowerjawmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 0.866F, -2.5877F, 0.0848F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront = Lowerjawmiddle.addOrReplaceChild("Lowerjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.45F, 0.39F, -0.1911F, 0.0F, 0.0F));

		PartDefinition Lowerfrontteeth = Lowerjawfront.addOrReplaceChild("Lowerfrontteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -1.9F, -0.8067F, 0.0F, 0.0F));

		PartDefinition Rightlowerfang = Lowerjawfront.addOrReplaceChild("Rightlowerfang", CubeListBuilder.create(), PartPose.offsetAndRotation(0.51F, -0.7F, -0.4F, 0.0F, 0.0F, 0.1485F));

		PartDefinition Mouthinterior = Lowerjawfront.addOrReplaceChild("Mouthinterior", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -1.0F, -2.0F, 0.2335F, 0.0F, 0.0F));

		PartDefinition Jawparting = Lowerjawmiddle.addOrReplaceChild("Jawparting", CubeListBuilder.create(), PartPose.offsetAndRotation(0.02F, 0.0F, 0.3F, -0.4671F, 0.0F, 0.0F));

		PartDefinition Lowerjawfluff = Lowerjawmiddle.addOrReplaceChild("Lowerjawfluff", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.02F, 1.45F, -0.03F, -0.0637F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2F, 3.5F, -3.5F, -2.1739F, 0.4451F, -0.4333F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, -0.3838F, 2.642F, 1.244F, -0.1077F, -0.554F));

		PartDefinition Rightfrontfoot = Rightlowerarm.addOrReplaceChild("Rightfrontfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.8559F, 0.1488F, 0.8467F, -0.0637F, -0.0213F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.18F, 3.5F, -3.5F, -0.5594F, -0.4451F, 0.4333F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, -0.3838F, 2.642F, 0.8805F, 0.5763F, -0.0784F));

		PartDefinition Leftfrontfoot = Leftlowerarm.addOrReplaceChild("Leftfrontfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.8559F, 0.1488F, 0.0555F, 0.0688F, -0.066F));

		PartDefinition Chestslope = Bodyfront.addOrReplaceChild("Chestslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.5F, -4.5F, -0.1698F, 0.0F, 0.0F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, 1.5F, -1.1F, 0.5212F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, 3.2F, -0.1F, -0.3318F, 0.0F, 0.0F));

		PartDefinition Righthindfoot = Rightshin.addOrReplaceChild("Righthindfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 0.0729F, 3.3327F, 0.7663F, 0.1006F, -0.0081F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, 1.5F, -1.1F, -0.2642F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, 3.2F, -0.1F, -0.6372F, 0.0F, 0.0F));

		PartDefinition Lefthindfoot = Leftshin.addOrReplaceChild("Lefthindfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 0.0729F, 3.3327F, 1.3298F, 0.0637F, 0.2122F));

		return LayerDefinition.create(meshdefinition, 48, 48);
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