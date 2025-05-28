package fossils.fossils.client.blockentity.model.erythrosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ErythrosuchusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart Bodyfront;
	private final ModelPart Neck;
	private final ModelPart Head;
	private final ModelPart Upperjawback;
	private final ModelPart Upperlipback;
	private final ModelPart UpperteethbackR;
	private final ModelPart Upperjawmiddle;
	private final ModelPart Upperjawfront;
	private final ModelPart Upperfrontteeth;
	private final ModelPart Snoutslope;
	private final ModelPart Upperlipfront;
	private final ModelPart UpperteethmidfrontR;
	private final ModelPart UpperteethmiddleR;
	private final ModelPart UpperteethmiddleR2;
	private final ModelPart Lowerjawback;
	private final ModelPart Lowerjawmiddleback;
	private final ModelPart Lowerjawmiddlefront;
	private final ModelPart Lowerjawfront;
	private final ModelPart Lowerteethfront;
	private final ModelPart Lowerteethback;
	private final ModelPart Lowerjawslope;
	private final ModelPart Jawparting;
	private final ModelPart Leftupperarm;
	private final ModelPart Leftlowerarm;
	private final ModelPart Leftfrontfoot;
	private final ModelPart Rightupperarm;
	private final ModelPart Rightlowerarm;
	private final ModelPart Rightfrontfoot;
	private final ModelPart Tailbase;
	private final ModelPart Tailmiddlebase;
	private final ModelPart Tailmiddle;
	private final ModelPart Tailmiddleend;
	private final ModelPart Tailend;
	private final ModelPart Rightthigh;
	private final ModelPart Rightshin;
	private final ModelPart Rightankle;
	private final ModelPart Righttoes;
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart Leftankle;
	private final ModelPart Lefttoes;

	public ErythrosuchusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.Bodyfront = this.Bodymiddle.getChild("Bodyfront");
		this.Neck = this.Bodyfront.getChild("Neck");
		this.Head = this.Neck.getChild("Head");
		this.Upperjawback = this.Head.getChild("Upperjawback");
		this.Upperlipback = this.Upperjawback.getChild("Upperlipback");
		this.UpperteethbackR = this.Upperlipback.getChild("UpperteethbackR");
		this.Upperjawmiddle = this.Upperjawback.getChild("Upperjawmiddle");
		this.Upperjawfront = this.Upperjawmiddle.getChild("Upperjawfront");
		this.Upperfrontteeth = this.Upperjawfront.getChild("Upperfrontteeth");
		this.Snoutslope = this.Upperjawmiddle.getChild("Snoutslope");
		this.Upperlipfront = this.Upperjawmiddle.getChild("Upperlipfront");
		this.UpperteethmidfrontR = this.Upperlipfront.getChild("UpperteethmidfrontR");
		this.UpperteethmiddleR = this.Upperjawmiddle.getChild("UpperteethmiddleR");
		this.UpperteethmiddleR2 = this.Upperjawmiddle.getChild("UpperteethmiddleR2");
		this.Lowerjawback = this.Head.getChild("Lowerjawback");
		this.Lowerjawmiddleback = this.Lowerjawback.getChild("Lowerjawmiddleback");
		this.Lowerjawmiddlefront = this.Lowerjawmiddleback.getChild("Lowerjawmiddlefront");
		this.Lowerjawfront = this.Lowerjawmiddlefront.getChild("Lowerjawfront");
		this.Lowerteethfront = this.Lowerjawfront.getChild("Lowerteethfront");
		this.Lowerteethback = this.Lowerjawmiddlefront.getChild("Lowerteethback");
		this.Lowerjawslope = this.Lowerjawback.getChild("Lowerjawslope");
		this.Jawparting = this.Lowerjawback.getChild("Jawparting");
		this.Leftupperarm = this.Bodyfront.getChild("Leftupperarm");
		this.Leftlowerarm = this.Leftupperarm.getChild("Leftlowerarm");
		this.Leftfrontfoot = this.Leftlowerarm.getChild("Leftfrontfoot");
		this.Rightupperarm = this.Bodyfront.getChild("Rightupperarm");
		this.Rightlowerarm = this.Rightupperarm.getChild("Rightlowerarm");
		this.Rightfrontfoot = this.Rightlowerarm.getChild("Rightfrontfoot");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.Tailmiddlebase = this.Tailbase.getChild("Tailmiddlebase");
		this.Tailmiddle = this.Tailmiddlebase.getChild("Tailmiddle");
		this.Tailmiddleend = this.Tailmiddle.getChild("Tailmiddleend");
		this.Tailend = this.Tailmiddleend.getChild("Tailend");
		this.Rightthigh = this.Hips.getChild("Rightthigh");
		this.Rightshin = this.Rightthigh.getChild("Rightshin");
		this.Rightankle = this.Rightshin.getChild("Rightankle");
		this.Righttoes = this.Rightankle.getChild("Righttoes");
		this.Leftthigh = this.Hips.getChild("Leftthigh");
		this.Leftshin = this.Leftthigh.getChild("Leftshin");
		this.Leftankle = this.Leftshin.getChild("Leftankle");
		this.Lefttoes = this.Leftankle.getChild("Lefttoes");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.51F, -17.9F, 11.6F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(1, 1).addBox(-3.02F, -17.9F, -11.0F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition crossbeam2_r1 = fossil.addOrReplaceChild("crossbeam2_r1", CubeListBuilder.create().texOffs(-3, 1).addBox(-5.0F, -1.0F, 0.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.7F, -10.0F, -11.0F, -0.0038F, 0.0872F, -0.0438F));

		PartDefinition crossbeam1_r1 = fossil.addOrReplaceChild("crossbeam1_r1", CubeListBuilder.create().texOffs(-2, 1).addBox(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -15.0F, 11.6F, 0.0F, -0.0436F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 5.4F, 0.8F, -0.2972F, 0.0F, 0.0F));

		PartDefinition frame5_r1 = Hips.addOrReplaceChild("frame5_r1", CubeListBuilder.create().texOffs(20, 17).addBox(0.0F, 0.0715F, -0.8309F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.5F, -2.6763F, 7.4945F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -3.7763F, 7.1945F, 0.2398F, 0.1272F, 0.031F));

		PartDefinition frame4_r1 = Bodymiddle.addOrReplaceChild("frame4_r1", CubeListBuilder.create().texOffs(0, 17).addBox(0.0F, -0.8F, -0.3F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 2.6333F, -13.4687F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Bodyfront = Bodymiddle.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(12, 58).addBox(-0.49F, 0.9884F, -5.1641F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.7333F, -13.0687F, 0.2132F, 0.0F, 0.0F));

		PartDefinition frame2_r1 = Bodyfront.addOrReplaceChild("frame2_r1", CubeListBuilder.create().texOffs(49, 48).addBox(0.0F, -1.4419F, -0.0628F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 3.1592F, -11.6427F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Neck = Bodyfront.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4302F, -11.6053F, -0.0006F, 0.3491F, 0.0F));

		PartDefinition frame1_r1 = Neck.addOrReplaceChild("frame1_r1", CubeListBuilder.create().texOffs(23, 61).addBox(0.0F, -1.5991F, -2.0606F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 2.7284F, -2.7373F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0527F, -4.0883F, 0.21F, 0.0F, 0.0F));

		PartDefinition Upperjawback = Head.addOrReplaceChild("Upperjawback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.4677F, -5.0934F, 0.4245F, 0.0F, 0.0F));

		PartDefinition Upperlipback = Upperjawback.addOrReplaceChild("Upperlipback", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 5.65F, -5.9F, -0.2388F, 0.0F, 0.0F));

		PartDefinition UpperteethbackR = Upperlipback.addOrReplaceChild("UpperteethbackR", CubeListBuilder.create(), PartPose.offsetAndRotation(3.05F, -0.5F, 0.4F, 0.1485F, 0.1061F, 0.0F));

		PartDefinition Upperjawmiddle = Upperjawback.addOrReplaceChild("Upperjawmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 5.73F, -5.6F, -0.2546F, 0.0F, 0.0F));

		PartDefinition Upperjawfront = Upperjawmiddle.addOrReplaceChild("Upperjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.0F, -4.0F, 0.4245F, 0.0F, 0.0F));

		PartDefinition Upperfrontteeth = Upperjawfront.addOrReplaceChild("Upperfrontteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -4.8F, -0.1698F, 0.0F, 0.0F));

		PartDefinition Snoutslope = Upperjawmiddle.addOrReplaceChild("Snoutslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.0F, -4.0F, 0.2175F, 0.0F, 0.0F));

		PartDefinition Upperlipfront = Upperjawmiddle.addOrReplaceChild("Upperlipfront", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 0.0F, -4.0F, -0.1911F, 0.0F, 0.0F));

		PartDefinition UpperteethmidfrontR = Upperlipfront.addOrReplaceChild("UpperteethmidfrontR", CubeListBuilder.create(), PartPose.offsetAndRotation(2.05F, -0.5F, -3.2F, 0.2972F, 0.1274F, 0.0F));

		PartDefinition UpperteethmiddleR = Upperjawmiddle.addOrReplaceChild("UpperteethmiddleR", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6F, -0.9F, -4.0F, 0.0848F, 0.0848F, 0.0F));

		PartDefinition UpperteethmiddleR2 = Upperjawmiddle.addOrReplaceChild("UpperteethmiddleR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.62F, -0.9F, -4.0F, 0.0848F, -0.0848F, 0.0F));

		PartDefinition Lowerjawback = Head.addOrReplaceChild("Lowerjawback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.3323F, 0.4066F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddleback = Lowerjawback.addOrReplaceChild("Lowerjawmiddleback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6259F, -5.3665F, 0.1698F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddlefront = Lowerjawmiddleback.addOrReplaceChild("Lowerjawmiddlefront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, -3.0F, -0.1061F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront = Lowerjawmiddlefront.addOrReplaceChild("Lowerjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.0F, -4.0F, 0.1485F, 0.0F, 0.0F));

		PartDefinition Lowerteethfront = Lowerjawfront.addOrReplaceChild("Lowerteethfront", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 0.0F, -2.8F, -0.0424F, 0.0F, 0.0F));

		PartDefinition Lowerteethback = Lowerjawmiddlefront.addOrReplaceChild("Lowerteethback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.0F, -3.6F, -0.0637F, 0.0F, 0.0F));

		PartDefinition Lowerjawslope = Lowerjawback.addOrReplaceChild("Lowerjawslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 3.3741F, -5.3665F, -0.1114F, 0.0F, 0.0F));

		PartDefinition Jawparting = Lowerjawback.addOrReplaceChild("Jawparting", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, -0.5259F, -3.8665F, -0.2759F, 0.0F, 0.0F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8F, 8.4534F, -8.5172F, 0.8463F, -0.0751F, -0.5434F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3194F, 6.5283F, 1.7249F, -0.3082F, 0.2814F, 0.4365F));

		PartDefinition Leftfrontfoot = Leftlowerarm.addOrReplaceChild("Leftfrontfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4875F, 6.3504F, -2.2012F, -0.3729F, 0.0152F, 0.0623F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8F, 8.4534F, -8.5172F, -0.0596F, 0.0836F, 0.6744F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3194F, 6.5283F, 1.7249F, -0.6572F, -0.2814F, -0.4365F));

		PartDefinition Rightfrontfoot = Rightlowerarm.addOrReplaceChild("Rightfrontfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4875F, 6.3504F, -2.2012F, 0.5897F, 0.4973F, 0.0809F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -3.8763F, 16.2945F, -0.1482F, 0.1307F, -0.0079F));

		PartDefinition frame6_r1 = Tailbase.addOrReplaceChild("frame6_r1", CubeListBuilder.create().texOffs(35, 41).addBox(0.0F, -0.8F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 1.8023F, -0.0929F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create().texOffs(14, 49).addBox(-0.5F, 1.2847F, -0.5964F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.1023F, 7.4071F, -0.0756F, 0.0868F, 0.0086F));

		PartDefinition Tailmiddle = Tailmiddlebase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create().texOffs(25, 52).addBox(-0.5F, 1.3876F, 0.1106F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.0986F, 4.6755F, 0.0364F, 0.1308F, 0.0047F));

		PartDefinition Tailmiddleend = Tailmiddle.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0124F, 5.7106F, 0.2432F, 0.0F, 0.0F));

		PartDefinition frame9_r1 = Tailmiddleend.addOrReplaceChild("frame9_r1", CubeListBuilder.create().texOffs(62, 42).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.8586F, -0.4063F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(0, 63).addBox(-0.5F, 0.5055F, -0.126F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.2086F, 4.9937F, 0.419F, 0.0F, 0.0F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, -0.0163F, 12.6945F, -0.2343F, 0.1472F, -0.2173F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.08F, -1.1228F, 0.8876F, -0.2295F, 0.167F));

		PartDefinition Rightankle = Rightshin.addOrReplaceChild("Rightankle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0035F, 6.9631F, 1.1114F, -0.3704F, 0.0F, 0.0F));

		PartDefinition Righttoes = Rightankle.addOrReplaceChild("Righttoes", CubeListBuilder.create(), PartPose.offset(0.01F, 0.49F, -2.8F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, -0.0163F, 12.6945F, 0.4639F, -0.1472F, 0.2173F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.08F, -1.1228F, 1.193F, 0.2295F, -0.167F));

		PartDefinition Leftankle = Leftshin.addOrReplaceChild("Leftankle", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0035F, 6.9631F, 1.1114F, -0.3704F, 0.0F, 0.0F));

		PartDefinition Lefttoes = Leftankle.addOrReplaceChild("Lefttoes", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 0.49F, -2.8F, -0.3052F, -0.0131F, -0.0416F));

		return LayerDefinition.create(meshdefinition, 100, 98);
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