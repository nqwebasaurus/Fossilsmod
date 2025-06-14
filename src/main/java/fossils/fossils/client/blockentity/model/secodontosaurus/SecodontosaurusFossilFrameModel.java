package fossils.fossils.client.blockentity.model.secodontosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SecodontosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart Bodyfront;
	private final ModelPart Neckbase;
	private final ModelPart Neckend;
	private final ModelPart Head;
	private final ModelPart Lowerjawback;
	private final ModelPart Lowerjawmiddle;
	private final ModelPart Lowerjawfront;
	private final ModelPart Lowerjawslope;
	private final ModelPart Jawparting;
	private final ModelPart Upperjawback;
	private final ModelPart Upperjawmiddle;
	private final ModelPart Nosebridge;
	private final ModelPart Upperjawfront;
	private final ModelPart Forehead;
	private final ModelPart bone;
	private final ModelPart sailbaseneck;
	private final ModelPart Rightupperarm;
	private final ModelPart Rightlowerarm;
	private final ModelPart Rightfrontfoot;
	private final ModelPart Leftupperarm;
	private final ModelPart Leftlowerarm;
	private final ModelPart Leftfrontfoot;
	private final ModelPart sailbasebodyfront;
	private final ModelPart sailbasebodymiddle;
	private final ModelPart Tailbase;
	private final ModelPart Tailmiddlebase;
	private final ModelPart Tailmiddleend;
	private final ModelPart Tailend;
	private final ModelPart sailbasetail;
	private final ModelPart Rightthigh;
	private final ModelPart Rightshin;
	private final ModelPart Righthindfoot;
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart Lefthindfoot;
	private final ModelPart sailbasehips;

	public SecodontosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.Bodyfront = this.Bodymiddle.getChild("Bodyfront");
		this.Neckbase = this.Bodyfront.getChild("Neckbase");
		this.Neckend = this.Neckbase.getChild("Neckend");
		this.Head = this.Neckend.getChild("Head");
		this.Lowerjawback = this.Head.getChild("Lowerjawback");
		this.Lowerjawmiddle = this.Lowerjawback.getChild("Lowerjawmiddle");
		this.Lowerjawfront = this.Lowerjawmiddle.getChild("Lowerjawfront");
		this.Lowerjawslope = this.Lowerjawback.getChild("Lowerjawslope");
		this.Jawparting = this.Lowerjawback.getChild("Jawparting");
		this.Upperjawback = this.Head.getChild("Upperjawback");
		this.Upperjawmiddle = this.Upperjawback.getChild("Upperjawmiddle");
		this.Nosebridge = this.Upperjawmiddle.getChild("Nosebridge");
		this.Upperjawfront = this.Upperjawmiddle.getChild("Upperjawfront");
		this.Forehead = this.Head.getChild("Forehead");
		this.bone = this.Head.getChild("bone");
		this.sailbaseneck = this.Neckbase.getChild("sailbaseneck");
		this.Rightupperarm = this.Bodyfront.getChild("Rightupperarm");
		this.Rightlowerarm = this.Rightupperarm.getChild("Rightlowerarm");
		this.Rightfrontfoot = this.Rightlowerarm.getChild("Rightfrontfoot");
		this.Leftupperarm = this.Bodyfront.getChild("Leftupperarm");
		this.Leftlowerarm = this.Leftupperarm.getChild("Leftlowerarm");
		this.Leftfrontfoot = this.Leftlowerarm.getChild("Leftfrontfoot");
		this.sailbasebodyfront = this.Bodyfront.getChild("sailbasebodyfront");
		this.sailbasebodymiddle = this.Bodymiddle.getChild("sailbasebodymiddle");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.Tailmiddlebase = this.Tailbase.getChild("Tailmiddlebase");
		this.Tailmiddleend = this.Tailmiddlebase.getChild("Tailmiddleend");
		this.Tailend = this.Tailmiddleend.getChild("Tailend");
		this.sailbasetail = this.Tailbase.getChild("sailbasetail");
		this.Rightthigh = this.Hips.getChild("Rightthigh");
		this.Rightshin = this.Rightthigh.getChild("Rightshin");
		this.Righthindfoot = this.Rightshin.getChild("Righthindfoot");
		this.Leftthigh = this.Hips.getChild("Leftthigh");
		this.Leftshin = this.Leftthigh.getChild("Leftshin");
		this.Lefthindfoot = this.Leftshin.getChild("Lefthindfoot");
		this.sailbasehips = this.Hips.getChild("sailbasehips");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -8.0F, 5.6F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(0.7F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.1F, -8.0F, 6.1F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(1.0F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(2.8F, -8.0F, -11.4F, -0.288F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-0.6F, -4.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(2.8F, -8.0F, -11.4F, 0.0F, -0.288F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -21.25F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.9F, 6.6F, -0.1878F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(22, 20).addBox(-1.0F, 0.7F, -0.4F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -1.1697F, -2.5506F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7697F, -2.5506F, 0.1372F, -0.0865F, -0.0119F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.4F, 0.6881F, -0.1144F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1F, -2.6715F, -8.5434F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Bodyfront = Bodymiddle.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.3834F, -8.4578F, 0.0502F, -0.1743F, -0.0087F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(32, 20).addBox(-0.5F, 0.7F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.5726F, -4.892F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Neckbase = Bodyfront.addOrReplaceChild("Neckbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1726F, -4.892F, 0.0456F, 0.0F, 0.0F));

		PartDefinition Neckbase_r1 = Neckbase.addOrReplaceChild("Neckbase_r1", CubeListBuilder.create().texOffs(40, 18).addBox(-0.5F, 0.3F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.2576F, -3.8624F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Neckend = Neckbase.addOrReplaceChild("Neckend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2576F, -3.6624F, 0.0464F, -0.3492F, 0.0066F));

		PartDefinition Neckend_r1 = Neckend.addOrReplaceChild("Neckend_r1", CubeListBuilder.create().texOffs(33, 39).addBox(-0.5F, 0.2F, -0.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.875F, -3.3935F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Head = Neckend.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.775F, -3.7935F, 0.369F, -0.3152F, 0.0382F));

		PartDefinition Lowerjawback = Head.addOrReplaceChild("Lowerjawback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5536F, -0.0352F, 0.2923F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddle = Lowerjawback.addOrReplaceChild("Lowerjawmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2085F, -3.9823F, 0.1911F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront = Lowerjawmiddle.addOrReplaceChild("Lowerjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -4.0F, -0.2335F, 0.0F, 0.0F));

		PartDefinition Lowerjawslope = Lowerjawback.addOrReplaceChild("Lowerjawslope", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.3415F, -2.7323F, 0.3768F, 0.0F, 0.0F));

		PartDefinition Jawparting = Lowerjawback.addOrReplaceChild("Jawparting", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2585F, -2.7323F, -0.3183F, 0.0F, 0.0F));

		PartDefinition Upperjawback = Head.addOrReplaceChild("Upperjawback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4036F, -4.0852F, -0.0119F, 0.0F, 0.0F));

		PartDefinition Upperjawmiddle = Upperjawback.addOrReplaceChild("Upperjawmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -4.0F, -0.1143F, 0.0F, 0.0F));

		PartDefinition Nosebridge = Upperjawmiddle.addOrReplaceChild("Nosebridge", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.975F, 0.15F, 0.5526F, 0.0F, 0.0F));

		PartDefinition Upperjawfront = Upperjawmiddle.addOrReplaceChild("Upperjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -2.0F, -4.05F, 0.7383F, 0.0F, 0.0F));

		PartDefinition Forehead = Head.addOrReplaceChild("Forehead", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, -2.3464F, -4.5852F, 0.2311F, 0.0F, 0.0F));

		PartDefinition bone = Head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.53F, -1.2447F, -3.7831F, -0.3491F, 0.0F, 0.0F));

		PartDefinition sailbaseneck = Neckbase.addOrReplaceChild("sailbaseneck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8424F, -6.5624F, 0.4098F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 5.8274F, -7.392F, 1.1114F, 0.4803F, -0.1728F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 4.4F, 0.4F, -0.8084F, -0.0597F, 0.4918F));

		PartDefinition Rightfrontfoot = Rightlowerarm.addOrReplaceChild("Rightfrontfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.4F, -0.5F, -0.3226F, -0.1928F, 0.0821F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 5.8274F, -7.392F, -0.4408F, -0.3815F, 0.4399F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 4.4F, 0.4F, -0.8501F, -0.0223F, -0.3897F));

		PartDefinition Leftfrontfoot = Leftlowerarm.addOrReplaceChild("Leftfrontfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.4F, -0.5F, 1.1475F, 0.1191F, 0.0755F));

		PartDefinition sailbasebodyfront = Bodyfront.addOrReplaceChild("sailbasebodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.6726F, -8.192F, 0.0456F, 0.0F, 0.0F));

		PartDefinition sailbasebodymiddle = Bodymiddle.addOrReplaceChild("sailbasebodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.9834F, 1.2422F, -0.0456F, 0.0F, 0.0F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(12, 18).addBox(-0.5F, 0.209F, -0.031F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.3303F, 3.2494F, -0.1399F, 0.2161F, -0.0302F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create().texOffs(0, 21).addBox(-0.5F, 0.2907F, -0.1053F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.091F, 6.469F, 0.0099F, 0.0921F, -0.0513F));

		PartDefinition Tailmiddleend = Tailmiddlebase.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(-1, 10).addBox(-0.5F, 0.2F, -0.4F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0907F, 6.7947F, -0.0467F, 0.2609F, 0.0218F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(24, 12).addBox(-0.6F, 0.2F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, 0.0714F, 0.5661F, 0.0383F));

		PartDefinition sailbasetail = Tailbase.addOrReplaceChild("sailbasetail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.109F, 0.369F, -0.182F, 0.0F, 0.0F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, 1.7303F, -0.4506F, -0.9657F, -0.3976F, -0.2828F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1F, 4.0F, 0.0F, 1.2579F, -0.1274F, 0.0848F));

		PartDefinition Righthindfoot = Rightshin.addOrReplaceChild("Righthindfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5111F, 4.6598F, 1.346F, 0.0F, 0.0F, 0.0213F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, 1.7303F, -0.4506F, -0.3549F, 0.3976F, 0.2828F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1F, 4.0F, 0.0F, 1.6942F, 0.1274F, -0.0848F));

		PartDefinition Lefthindfoot = Leftshin.addOrReplaceChild("Lefthindfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5111F, 4.6598F, 1.346F, -0.6545F, 0.0F, -0.0213F));

		PartDefinition sailbasehips = Hips.addOrReplaceChild("sailbasehips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.3697F, 5.1494F, -0.182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 65, 65);
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