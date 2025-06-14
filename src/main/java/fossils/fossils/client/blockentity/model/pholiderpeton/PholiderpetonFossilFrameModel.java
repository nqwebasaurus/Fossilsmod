package fossils.fossils.client.blockentity.model.pholiderpeton;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PholiderpetonFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart body2;
	private final ModelPart Bodyfront;
	private final ModelPart Rightupperarm;
	private final ModelPart Rightlowerarm;
	private final ModelPart Rightfrontfoot;
	private final ModelPart Leftupperarm;
	private final ModelPart Leftlowerarm;
	private final ModelPart Leftfrontfoot;
	private final ModelPart body;
	private final ModelPart Head;
	private final ModelPart Lowerjawback;
	private final ModelPart Lowerjawmidbase;
	private final ModelPart Lowerjawmidfront;
	private final ModelPart Lowerjawfront;
	private final ModelPart Lowerjawslopefront;
	private final ModelPart Lowerfrontteeth;
	private final ModelPart Rightlowerteeth;
	private final ModelPart Leftlowerteeth;
	private final ModelPart Upperjawbase;
	private final ModelPart Upperjawmiddle;
	private final ModelPart Upperjawfront;
	private final ModelPart Snoutmiddle;
	private final ModelPart Rightupperteeth;
	private final ModelPart Leftupperteeth;
	private final ModelPart Snoutbase;
	private final ModelPart Tailbase;
	private final ModelPart Tailmiddlebase;
	private final ModelPart Tailmiddle;
	private final ModelPart Tailmiddleend;
	private final ModelPart Tailend;
	private final ModelPart Rightthigh;
	private final ModelPart Rightshin;
	private final ModelPart Righthindfoot;
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart Lefthindfoot;

	public PholiderpetonFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body2 = this.Bodymiddle.getChild("body2");
		this.Bodyfront = this.body2.getChild("Bodyfront");
		this.Rightupperarm = this.Bodyfront.getChild("Rightupperarm");
		this.Rightlowerarm = this.Rightupperarm.getChild("Rightlowerarm");
		this.Rightfrontfoot = this.Rightlowerarm.getChild("Rightfrontfoot");
		this.Leftupperarm = this.Bodyfront.getChild("Leftupperarm");
		this.Leftlowerarm = this.Leftupperarm.getChild("Leftlowerarm");
		this.Leftfrontfoot = this.Leftlowerarm.getChild("Leftfrontfoot");
		this.body = this.Bodyfront.getChild("body");
		this.Head = this.body.getChild("Head");
		this.Lowerjawback = this.Head.getChild("Lowerjawback");
		this.Lowerjawmidbase = this.Lowerjawback.getChild("Lowerjawmidbase");
		this.Lowerjawmidfront = this.Lowerjawmidbase.getChild("Lowerjawmidfront");
		this.Lowerjawfront = this.Lowerjawmidfront.getChild("Lowerjawfront");
		this.Lowerjawslopefront = this.Lowerjawfront.getChild("Lowerjawslopefront");
		this.Lowerfrontteeth = this.Lowerjawfront.getChild("Lowerfrontteeth");
		this.Rightlowerteeth = this.Lowerjawmidfront.getChild("Rightlowerteeth");
		this.Leftlowerteeth = this.Lowerjawmidfront.getChild("Leftlowerteeth");
		this.Upperjawbase = this.Head.getChild("Upperjawbase");
		this.Upperjawmiddle = this.Upperjawbase.getChild("Upperjawmiddle");
		this.Upperjawfront = this.Upperjawmiddle.getChild("Upperjawfront");
		this.Snoutmiddle = this.Upperjawmiddle.getChild("Snoutmiddle");
		this.Rightupperteeth = this.Upperjawmiddle.getChild("Rightupperteeth");
		this.Leftupperteeth = this.Upperjawmiddle.getChild("Leftupperteeth");
		this.Snoutbase = this.Upperjawbase.getChild("Snoutbase");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.Tailmiddlebase = this.Tailbase.getChild("Tailmiddlebase");
		this.Tailmiddle = this.Tailmiddlebase.getChild("Tailmiddle");
		this.Tailmiddleend = this.Tailmiddle.getChild("Tailmiddleend");
		this.Tailend = this.Tailmiddleend.getChild("Tailend");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.0F, 0.0F, 1.069F, -0.0133F, 0.0862F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(5, 5).addBox(-0.5F, -0.5F, -3.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.9278F, 14.6878F, -1.5708F, 0.1484F, 1.5708F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(10, 10).addBox(1.5F, -7.8F, 0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-2.0F, -1.0194F, 7.8966F, -1.7191F, 0.0F, 0.0F));

		PartDefinition Hips_r3 = Hips.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(0, 0).addBox(1.5F, 0.2F, -0.4F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.0F, -1.0194F, 6.9966F, -0.1484F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1956F, 6.8969F, -0.2422F, -0.1271F, 0.0313F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(35, 8).addBox(1.5F, 0.2F, 8.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(27, 0).addBox(1.5F, 0.2F, -0.6F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.0F, -0.5F, -8.9F, -0.0698F, 0.0F, 0.0F));

		PartDefinition body2 = Bodymiddle.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5F, 0.2745F, -11.065F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4745F, -8.935F, -0.22F, -0.1278F, 0.0285F));

		PartDefinition Bodyfront = body2.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0445F, -10.8813F, -0.2899F, 0.2093F, -0.0619F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(47, 42).addBox(1.5F, 0.1F, 6.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(42, 37).addBox(1.5F, 0.1F, -0.2F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.0F, 0.3F, -7.0F, 0.0262F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = Bodyfront.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(39, 34).addBox(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 4.0908F, -7.2006F, -1.5708F, -0.0262F, 1.5708F));

		PartDefinition Bodyfront_r3 = Bodyfront.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(46, 41).addBox(-0.5F, -0.8F, 0.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 0.3F, -7.6F, -1.5446F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.6437F, 4.05F, -7.3306F, 0.9933F, -1.3436F, -1.2166F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0857F, 0.1059F, 0.5969F, -0.1966F, -0.3035F, -1.1647F));

		PartDefinition Rightfrontfoot = Rightlowerarm.addOrReplaceChild("Rightfrontfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4513F, 4.656F, -0.6013F, 1.8885F, 0.1575F, 0.1734F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.6437F, 4.05F, -7.3306F, 0.5335F, 1.2773F, 0.7387F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0857F, 0.1059F, 0.5969F, -0.1966F, 0.3035F, 1.1647F));

		PartDefinition Leftfrontfoot = Leftlowerarm.addOrReplaceChild("Leftfrontfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4513F, 4.656F, -0.6013F, 1.8885F, -0.1575F, -0.1734F));

		PartDefinition body = Bodyfront.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, -7.0F, -0.3985F, 0.2114F, -0.0341F));

		PartDefinition Bodyfront_r4 = body.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(0, 48).addBox(1.5F, 0.2F, -1.7F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.0F, 0.4F, -3.7F, 0.096F, 0.0F, 0.0F));

		PartDefinition Head = body.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4566F, -5.3203F, -0.432F, 0.3299F, -0.0996F));

		PartDefinition Lowerjawback = Head.addOrReplaceChild("Lowerjawback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.484F, 3.5363F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Lowerjawmidbase = Lowerjawback.addOrReplaceChild("Lowerjawmidbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4526F, -1.8984F, 1.4961F, 0.0F, 0.0F));

		PartDefinition Lowerjawmidfront = Lowerjawmidbase.addOrReplaceChild("Lowerjawmidfront", CubeListBuilder.create(), PartPose.offset(0.0F, -0.2255F, -5.7775F));

		PartDefinition Lowerjawfront = Lowerjawmidfront.addOrReplaceChild("Lowerjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -2.0F, -0.0213F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopefront = Lowerjawfront.addOrReplaceChild("Lowerjawslopefront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, 0.1F, -0.3396F, 0.0F, 0.0F));

		PartDefinition Lowerfrontteeth = Lowerjawfront.addOrReplaceChild("Lowerfrontteeth", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5F, -2.6F));

		PartDefinition Rightlowerteeth = Lowerjawmidfront.addOrReplaceChild("Rightlowerteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(2.45F, 0.5F, -1.0F, 0.0F, 0.1911F, 0.0F));

		PartDefinition Leftlowerteeth = Lowerjawmidfront.addOrReplaceChild("Leftlowerteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.45F, 0.5F, -1.0F, 0.0F, -0.1911F, 0.0F));

		PartDefinition Upperjawbase = Head.addOrReplaceChild("Upperjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.516F, -0.4637F, 0.0213F, 0.0F, 0.0F));

		PartDefinition Upperjawmiddle = Upperjawbase.addOrReplaceChild("Upperjawmiddle", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, -3.0F));

		PartDefinition Upperjawfront = Upperjawmiddle.addOrReplaceChild("Upperjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -2.0F, -0.0213F, 0.0F, 0.0F));

		PartDefinition Snoutmiddle = Upperjawmiddle.addOrReplaceChild("Snoutmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0559F, -1.3767F, 0.3721F, 0.0F, 0.0F));

		PartDefinition Rightupperteeth = Upperjawmiddle.addOrReplaceChild("Rightupperteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(2.45F, 1.5F, -1.1F, 0.0F, 0.1911F, 0.0F));

		PartDefinition Leftupperteeth = Upperjawmiddle.addOrReplaceChild("Leftupperteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.45F, 1.5F, -1.1F, 0.0F, -0.1911F, 0.0F));

		PartDefinition Snoutbase = Upperjawbase.addOrReplaceChild("Snoutbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.3187F, 0.0F, 0.0F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8209F, 18.5953F, -0.1487F, 0.2759F, -0.2928F));

		PartDefinition Tailbase_r1 = Tailbase.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(34, 23).addBox(1.5F, 0.3F, 9.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(25, 14).addBox(1.5F, 0.3F, -0.5F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.0F, -0.2002F, 0.0192F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2998F, 10.0192F, -0.0582F, 0.3461F, -0.2658F));

		PartDefinition Tailmiddlebase_r1 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(29, 45).addBox(1.5F, 0.2F, 9.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(21, 37).addBox(1.5F, 0.2F, 0.6F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.0F, -0.2349F, -0.9994F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Tailmiddle = Tailmiddlebase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, 0.2F, -0.1F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4651F, 8.9006F, -0.0971F, 0.5138F, -0.2487F));

		PartDefinition Tailmiddleend = Tailmiddle.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(25, 26).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F))
				.texOffs(33, 34).addBox(-0.5F, -0.2F, 8.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3919F, 8.5998F, -0.0971F, 0.4279F, -0.3175F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(0, 38).addBox(-0.5F, 0.2F, 0.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4F, 9.1F, 0.0512F, -0.3486F, -0.0175F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2223F, 2.6235F, 14.2081F, 2.6478F, -0.1761F, -1.6876F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.455F, 0.9656F, -5.3113F, -1.118F, 0.0967F, -0.1959F));

		PartDefinition Righthindfoot = Rightshin.addOrReplaceChild("Righthindfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4686F, 4.3979F, -0.315F, 1.1832F, -0.0389F, -0.0921F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2223F, 2.6235F, 14.2081F, 3.0405F, 0.1761F, 1.6876F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.455F, 0.9656F, -5.3113F, -1.118F, -0.0967F, 0.1959F));

		PartDefinition Lefthindfoot = Leftshin.addOrReplaceChild("Lefthindfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4686F, 4.3979F, -0.315F, 1.1832F, 0.0389F, 0.0921F));

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