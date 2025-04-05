package fossils.fossils.client.blockentity.model.coelophysis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CoelophysisFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart Bodyfront;
	private final ModelPart Neckbase;
	private final ModelPart neck;
	private final ModelPart Neckmiddle;
	private final ModelPart neck2;
	private final ModelPart Neckend;
	private final ModelPart Head;
	private final ModelPart Lowerjawbase;
	private final ModelPart Lowerjawmiddle;
	private final ModelPart Lowerjawfront;
	private final ModelPart Upperjawbase;
	private final ModelPart Upperjawend;
	private final ModelPart Snout;
	private final ModelPart Leftupperfrontteeth;
	private final ModelPart Rightupperfrontteeth;
	private final ModelPart Headslope;
	private final ModelPart Rightupperarm;
	private final ModelPart Rightlowerarm;
	private final ModelPart Righthand;
	private final ModelPart Leftupperarm;
	private final ModelPart Leftlowerarm;
	private final ModelPart Lefthand;
	private final ModelPart Tailbase;
	private final ModelPart Tailmiddlebase;
	private final ModelPart Tailmiddleend;
	private final ModelPart Tailend;
	private final ModelPart Tailend2;
	private final ModelPart Tailend3;
	private final ModelPart Rightthigh;
	private final ModelPart Rightshin;
	private final ModelPart Rightankle;
	private final ModelPart Rightfoot;
	private final ModelPart Rightfoot2;
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart Leftankle;
	private final ModelPart Leftfoot;
	private final ModelPart Leftfoot2;

	public CoelophysisFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.Bodyfront = this.Bodymiddle.getChild("Bodyfront");
		this.Neckbase = this.Bodyfront.getChild("Neckbase");
		this.neck = this.Neckbase.getChild("neck");
		this.Neckmiddle = this.neck.getChild("Neckmiddle");
		this.neck2 = this.Neckmiddle.getChild("neck2");
		this.Neckend = this.neck2.getChild("Neckend");
		this.Head = this.Neckend.getChild("Head");
		this.Lowerjawbase = this.Head.getChild("Lowerjawbase");
		this.Lowerjawmiddle = this.Lowerjawbase.getChild("Lowerjawmiddle");
		this.Lowerjawfront = this.Lowerjawmiddle.getChild("Lowerjawfront");
		this.Upperjawbase = this.Head.getChild("Upperjawbase");
		this.Upperjawend = this.Upperjawbase.getChild("Upperjawend");
		this.Snout = this.Upperjawend.getChild("Snout");
		this.Leftupperfrontteeth = this.Upperjawend.getChild("Leftupperfrontteeth");
		this.Rightupperfrontteeth = this.Upperjawend.getChild("Rightupperfrontteeth");
		this.Headslope = this.Upperjawbase.getChild("Headslope");
		this.Rightupperarm = this.Bodyfront.getChild("Rightupperarm");
		this.Rightlowerarm = this.Rightupperarm.getChild("Rightlowerarm");
		this.Righthand = this.Rightlowerarm.getChild("Righthand");
		this.Leftupperarm = this.Bodyfront.getChild("Leftupperarm");
		this.Leftlowerarm = this.Leftupperarm.getChild("Leftlowerarm");
		this.Lefthand = this.Leftlowerarm.getChild("Lefthand");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.Tailmiddlebase = this.Tailbase.getChild("Tailmiddlebase");
		this.Tailmiddleend = this.Tailmiddlebase.getChild("Tailmiddleend");
		this.Tailend = this.Tailmiddleend.getChild("Tailend");
		this.Tailend2 = this.Tailend.getChild("Tailend2");
		this.Tailend3 = this.Tailend2.getChild("Tailend3");
		this.Rightthigh = this.Hips.getChild("Rightthigh");
		this.Rightshin = this.Rightthigh.getChild("Rightshin");
		this.Rightankle = this.Rightshin.getChild("Rightankle");
		this.Rightfoot = this.Rightankle.getChild("Rightfoot");
		this.Rightfoot2 = this.Rightfoot.getChild("Rightfoot2");
		this.Leftthigh = this.Hips.getChild("Leftthigh");
		this.Leftshin = this.Leftthigh.getChild("Leftshin");
		this.Leftankle = this.Leftshin.getChild("Leftankle");
		this.Leftfoot = this.Leftankle.getChild("Leftfoot");
		this.Leftfoot2 = this.Leftfoot.getChild("Leftfoot2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -18.0F, -2.1F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.6F, -2.0F, -0.5F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(4.5F, -16.0F, -17.1F, 0.0F, -0.4625F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(0.8F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(4.5F, -16.0F, -17.1F, -0.4625F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-1.8F, -2.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -16.0F, -1.6F, 0.0F, 0.0F, 1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -20.6F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.099F, -0.5318F, -0.0986F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5F, -2.0F, -4.7F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.9702F, 0.4353F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.4172F, -3.5662F, 0.0427F, -0.2616F, -0.0111F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(21, 15).addBox(-0.49F, -1.7F, -3.6F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.1892F, -5.8242F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront = Bodymiddle.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1892F, -9.3242F, 0.0935F, -0.1661F, -0.1028F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(42, 10).addBox(-0.49F, 0.05F, -6.8F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.4128F, -0.1452F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Neckbase = Bodyfront.addOrReplaceChild("Neckbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6012F, -7.0133F, -0.2694F, -0.2711F, -0.1466F));

		PartDefinition Neckbase_r1 = Neckbase.addOrReplaceChild("Neckbase_r1", CubeListBuilder.create().texOffs(51, 3).addBox(-0.49F, -0.2987F, 2.9368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(48, 0).addBox(-0.49F, -0.2987F, -0.8632F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.0924F, -3.1767F, -0.1745F, 0.0F, 0.0F));

		PartDefinition neck = Neckbase.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7848F, -3.5897F, -0.1822F, -0.2518F, -0.033F));

		PartDefinition Neckmiddle_r1 = neck.addOrReplaceChild("Neckmiddle_r1", CubeListBuilder.create().texOffs(41, 46).addBox(-0.49F, 0.118F, -4.3524F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.1828F, 0.3121F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Neckmiddle = neck.addOrReplaceChild("Neckmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0499F, -3.9271F, 0.1172F, -0.4184F, -0.2966F));

		PartDefinition Neckmiddle_r2 = Neckmiddle.addOrReplaceChild("Neckmiddle_r2", CubeListBuilder.create().texOffs(0, 50).addBox(-0.49F, 0.1171F, -3.4025F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.2422F, -0.485F, 0.1571F, 0.0F, 0.0F));

		PartDefinition neck2 = Neckmiddle.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6184F, -3.7389F, 0.0646F, -0.5572F, -0.2927F));

		PartDefinition cube_r4 = neck2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(59, 0).addBox(-0.49F, 0.2F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4451F, 0.0F, 0.0F));

		PartDefinition Neckend = neck2.addOrReplaceChild("Neckend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 1.0315F, -2.5258F, 0.4308F, -0.3878F, 0.0989F));

		PartDefinition Neckend_r1 = Neckend.addOrReplaceChild("Neckend_r1", CubeListBuilder.create().texOffs(57, 25).addBox(-0.5F, 0.2013F, -0.1332F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.9871F, -2.6603F, 0.3142F, 0.0F, 0.0F));

		PartDefinition Head = Neckend.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.56F, -2.5029F, 0.4569F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase = Head.addOrReplaceChild("Lowerjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1333F, -0.0924F, 0.3403F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddle = Lowerjawbase.addOrReplaceChild("Lowerjawmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 0.9926F, -2.2597F, -0.0637F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront = Lowerjawmiddle.addOrReplaceChild("Lowerjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -5.0F, 0.0424F, 0.0F, 0.0F));

		PartDefinition Upperjawbase = Head.addOrReplaceChild("Upperjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1F, -3.83F, 0.0637F, 0.0F, 0.0F));

		PartDefinition Upperjawend = Upperjawbase.addOrReplaceChild("Upperjawend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -5.0F, -0.1274F, 0.0F, 0.0F));

		PartDefinition Snout = Upperjawend.addOrReplaceChild("Snout", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.7F, -0.2F, 0.3183F, 0.0F, 0.0F));

		PartDefinition Leftupperfrontteeth = Upperjawend.addOrReplaceChild("Leftupperfrontteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.5F, 0.5F, -0.0424F, -0.2335F, 0.1485F));

		PartDefinition Rightupperfrontteeth = Upperjawend.addOrReplaceChild("Rightupperfrontteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -0.5F, 0.5F, -0.0424F, 0.2335F, -0.1485F));

		PartDefinition Headslope = Upperjawbase.addOrReplaceChild("Headslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.85F, 0.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7639F, 4.6955F, -4.8779F, 0.6392F, 0.1859F, -0.2438F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7205F, 4.3794F, 0.0748F, -0.8436F, 0.2398F, 0.1911F));

		PartDefinition Righthand = Rightlowerarm.addOrReplaceChild("Righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8819F, 2.7246F, 0.0444F, 0.078F, 0.0103F, 0.3153F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7439F, 4.6955F, -4.8779F, 0.8573F, -0.1859F, 0.2438F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7205F, 4.3794F, 0.0748F, -0.8436F, -0.2398F, -0.1911F));

		PartDefinition Lefthand = Leftlowerarm.addOrReplaceChild("Lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8819F, 2.7246F, 0.0444F, 0.078F, -0.0103F, -0.3153F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(36, 6).addBox(-0.5F, 0.1698F, 7.2594F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(29, 0).addBox(-0.5F, 0.1698F, -0.5406F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.2062F, 2.9334F, 0.1575F, 0.1724F, 0.0272F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2569F, 7.8363F, 0.2573F, 0.1689F, 0.0442F));

		PartDefinition Tailmiddlebase_r1 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(12, 12).addBox(-0.5F, 0.3F, 11.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(0, 0).addBox(-0.5F, 0.3F, -1.2F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.1038F, 0.9873F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = Tailmiddlebase.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4655F, 12.9912F, 0.1667F, 0.3751F, -0.1044F));

		PartDefinition Tailmiddleend_r1 = Tailmiddleend.addOrReplaceChild("Tailmiddleend_r1", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.0037F, 0.5038F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5101F, 8.8559F, 0.2344F, 0.3698F, -0.0399F));

		PartDefinition Tailend_r1 = Tailend.addOrReplaceChild("Tailend_r1", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend2 = Tailend.addOrReplaceChild("Tailend2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3392F, 8.921F, -0.445F, 0.1396F, -0.1138F));

		PartDefinition Tailend_r2 = Tailend2.addOrReplaceChild("Tailend_r2", CubeListBuilder.create().texOffs(21, 26).addBox(-0.5F, 0.3F, -0.4F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend3 = Tailend2.addOrReplaceChild("Tailend3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2675F, 8.9066F, -0.3341F, 0.2895F, -0.0988F));

		PartDefinition Tailend_r3 = Tailend3.addOrReplaceChild("Tailend_r3", CubeListBuilder.create().texOffs(36, 37).addBox(-0.5F, 0.3F, -0.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3F, 0.7994F, -0.8146F, -0.5556F, 0.0594F, 0.1167F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 7.2283F, 1.9698F, 1.2081F, 0.0F, 0.0F));

		PartDefinition Rightankle = Rightshin.addOrReplaceChild("Rightankle", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 8.0916F, -0.049F, -1.0684F, -0.1149F, -0.0629F));

		PartDefinition Rightfoot = Rightankle.addOrReplaceChild("Rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0995F, 0.2951F, 0.539F, 0.0F, 0.0F));

		PartDefinition Rightfoot2 = Rightfoot.addOrReplaceChild("Rightfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0118F, -1.4031F, -0.0021F, 0.0F, 0.0F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3F, 0.7994F, -0.8146F, -0.0784F, -0.0103F, -0.1305F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 7.2283F, 1.9698F, 1.2081F, 0.0F, 0.0F));

		PartDefinition Leftankle = Leftshin.addOrReplaceChild("Leftankle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 8.0916F, -0.049F, -0.8933F, 0.1022F, 0.0819F));

		PartDefinition Leftfoot = Leftankle.addOrReplaceChild("Leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0995F, 0.2951F, 0.4953F, 0.0F, 0.0F));

		PartDefinition Leftfoot2 = Leftfoot.addOrReplaceChild("Leftfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0118F, -1.4031F, -0.4384F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 87, 87);
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