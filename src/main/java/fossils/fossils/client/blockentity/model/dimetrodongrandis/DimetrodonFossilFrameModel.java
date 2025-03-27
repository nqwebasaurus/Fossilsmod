package fossils.fossils.client.blockentity.model.dimetrodongrandis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DimetrodonFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart crossbeam2_r1;
	private final ModelPart crossbeam1_r1;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart frame7_r1;
	private final ModelPart frame6_r1;
	private final ModelPart Bodymiddle;
	private final ModelPart frame5_r1;
	private final ModelPart frame4_r1;
	private final ModelPart Bodyfront;
	private final ModelPart frame3_r1;
	private final ModelPart Neckbase;
	private final ModelPart Neckend;
	private final ModelPart frame1_r1;
	private final ModelPart Head;
	private final ModelPart Lowerjawback;
	private final ModelPart Lowerjawmiddle;
	private final ModelPart Lowerjawfront;
	private final ModelPart Lowerfrontteeth;
	private final ModelPart Lowerfrontteeth2;
	private final ModelPart Lowerjawslope;
	private final ModelPart Rightlowerteeth;
	private final ModelPart Rightlowerteeth2;
	private final ModelPart Upperjawback;
	private final ModelPart Upperjawmiddle;
	private final ModelPart Nosebridge;
	private final ModelPart Upperjawfront;
	private final ModelPart Upperfrontteeth;
	private final ModelPart Rightupperteethback;
	private final ModelPart Rightupperteethback2;
	private final ModelPart Forehead;
	private final ModelPart Rightupperarm;
	private final ModelPart Rightlowerarm;
	private final ModelPart Rightfrontfoot;
	private final ModelPart Leftupperarm;
	private final ModelPart Leftlowerarm;
	private final ModelPart Leftfrontfoot;
	private final ModelPart Sailmiddlefront;
	private final ModelPart Tailbase;
	private final ModelPart frame8_r1;
	private final ModelPart Tailmiddlebase;
	private final ModelPart frame9_r1;
	private final ModelPart Tailmiddleend;
	private final ModelPart Tailend;
	private final ModelPart frame11_r1;
	private final ModelPart Rightthigh;
	private final ModelPart Rightshin;
	private final ModelPart Righthindfoot;
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart Lefthindfoot;

	public DimetrodonFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.crossbeam2_r1 = this.fossil.getChild("crossbeam2_r1");
		this.crossbeam1_r1 = this.fossil.getChild("crossbeam1_r1");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.frame7_r1 = this.Hips.getChild("frame7_r1");
		this.frame6_r1 = this.Hips.getChild("frame6_r1");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.frame5_r1 = this.Bodymiddle.getChild("frame5_r1");
		this.frame4_r1 = this.Bodymiddle.getChild("frame4_r1");
		this.Bodyfront = this.Bodymiddle.getChild("Bodyfront");
		this.frame3_r1 = this.Bodyfront.getChild("frame3_r1");
		this.Neckbase = this.Bodyfront.getChild("Neckbase");
		this.Neckend = this.Neckbase.getChild("Neckend");
		this.frame1_r1 = this.Neckend.getChild("frame1_r1");
		this.Head = this.Neckend.getChild("Head");
		this.Lowerjawback = this.Head.getChild("Lowerjawback");
		this.Lowerjawmiddle = this.Lowerjawback.getChild("Lowerjawmiddle");
		this.Lowerjawfront = this.Lowerjawmiddle.getChild("Lowerjawfront");
		this.Lowerfrontteeth = this.Lowerjawfront.getChild("Lowerfrontteeth");
		this.Lowerfrontteeth2 = this.Lowerjawfront.getChild("Lowerfrontteeth2");
		this.Lowerjawslope = this.Lowerjawback.getChild("Lowerjawslope");
		this.Rightlowerteeth = this.Lowerjawslope.getChild("Rightlowerteeth");
		this.Rightlowerteeth2 = this.Lowerjawslope.getChild("Rightlowerteeth2");
		this.Upperjawback = this.Head.getChild("Upperjawback");
		this.Upperjawmiddle = this.Upperjawback.getChild("Upperjawmiddle");
		this.Nosebridge = this.Upperjawmiddle.getChild("Nosebridge");
		this.Upperjawfront = this.Upperjawmiddle.getChild("Upperjawfront");
		this.Upperfrontteeth = this.Upperjawfront.getChild("Upperfrontteeth");
		this.Rightupperteethback = this.Upperjawback.getChild("Rightupperteethback");
		this.Rightupperteethback2 = this.Upperjawback.getChild("Rightupperteethback2");
		this.Forehead = this.Head.getChild("Forehead");
		this.Rightupperarm = this.Bodyfront.getChild("Rightupperarm");
		this.Rightlowerarm = this.Rightupperarm.getChild("Rightlowerarm");
		this.Rightfrontfoot = this.Rightlowerarm.getChild("Rightfrontfoot");
		this.Leftupperarm = this.Bodyfront.getChild("Leftupperarm");
		this.Leftlowerarm = this.Leftupperarm.getChild("Leftlowerarm");
		this.Leftfrontfoot = this.Leftlowerarm.getChild("Leftfrontfoot");
		this.Sailmiddlefront = this.Bodyfront.getChild("Sailmiddlefront");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.frame8_r1 = this.Tailbase.getChild("frame8_r1");
		this.Tailmiddlebase = this.Tailbase.getChild("Tailmiddlebase");
		this.frame9_r1 = this.Tailmiddlebase.getChild("frame9_r1");
		this.Tailmiddleend = this.Tailmiddlebase.getChild("Tailmiddleend");
		this.Tailend = this.Tailmiddleend.getChild("Tailend");
		this.frame11_r1 = this.Tailend.getChild("frame11_r1");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(35, 21).addBox(-0.5F, -9.9F, 10.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(30, 29).addBox(-2.5F, -12.9F, -13.25F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition crossbeam2_r1 = fossil.addOrReplaceChild("crossbeam2_r1", CubeListBuilder.create().texOffs(23, 8).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.0F, -8.3F, -12.75F, 0.0077F, 0.1744F, 0.0443F));

		PartDefinition crossbeam1_r1 = fossil.addOrReplaceChild("crossbeam1_r1", CubeListBuilder.create().texOffs(36, 11).addBox(-2.0F, -1.0F, 0.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, -7.5F, 10.5F, 0.0F, 0.0436F, -0.0436F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -23.8F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.8F, 10.0F, -0.4245F, 0.0F, 0.0F));

		PartDefinition frame7_r1 = Hips.addOrReplaceChild("frame7_r1", CubeListBuilder.create().texOffs(19, 12).addBox(-0.5F, -0.5F, -3.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.001F, 0.8536F, -0.3049F, -0.1658F, 0.0F, 0.0F));

		PartDefinition frame6_r1 = Hips.addOrReplaceChild("frame6_r1", CubeListBuilder.create().texOffs(35, 33).addBox(-0.5F, -0.45F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.3199F, -4.7934F, 0.0262F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6234F, -6.7758F, 0.3834F, 0.081F, 0.0326F));

		PartDefinition frame5_r1 = Bodymiddle.addOrReplaceChild("frame5_r1", CubeListBuilder.create().texOffs(19, 21).addBox(-0.998F, -0.1045F, 0.0098F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 0.8414F, -5.9852F, 0.0262F, 0.0F, 0.0F));

		PartDefinition frame4_r1 = Bodymiddle.addOrReplaceChild("frame4_r1", CubeListBuilder.create().texOffs(0, 22).addBox(-1.0F, -0.1406F, -0.1354F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 1.6414F, -11.5352F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Bodyfront = Bodymiddle.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7782F, -11.4708F, 0.1065F, 0.0868F, 0.0093F));

		PartDefinition frame3_r1 = Bodyfront.addOrReplaceChild("frame3_r1", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, 0.0389F, 0.029F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0153F, -5.7468F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Neckbase = Bodyfront.addOrReplaceChild("Neckbase", CubeListBuilder.create().texOffs(36, 14).addBox(-0.5F, 0.8015F, -2.8221F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.7431F, -5.6146F, -0.1061F, 0.0F, 0.0F));

		PartDefinition Neckend = Neckbase.addOrReplaceChild("Neckend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.237F, -3.031F, 0.0647F, -0.1742F, -0.0112F));

		PartDefinition frame1_r1 = Neckend.addOrReplaceChild("frame1_r1", CubeListBuilder.create().texOffs(15, 37).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.2945F, -1.5494F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Head = Neckend.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 0.2167F, -2.6779F, 0.243F, 0.4994F, 0.1312F));

		PartDefinition Lowerjawback = Head.addOrReplaceChild("Lowerjawback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2861F, -1.1427F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddle = Lowerjawback.addOrReplaceChild("Lowerjawmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.65F, -3.0F, 0.1911F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront = Lowerjawmiddle.addOrReplaceChild("Lowerjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -4.0F, -0.2335F, 0.0F, 0.0F));

		PartDefinition Lowerfrontteeth = Lowerjawfront.addOrReplaceChild("Lowerfrontteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.7006F, 0.0F, 0.0F));

		PartDefinition Lowerfrontteeth2 = Lowerjawfront.addOrReplaceChild("Lowerfrontteeth2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.02F, 0.0F, -2.0F, 0.7006F, 0.0F, 0.0F));

		PartDefinition Lowerjawslope = Lowerjawback.addOrReplaceChild("Lowerjawslope", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.1F, -3.0F, 0.3768F, 0.0F, 0.0F));

		PartDefinition Rightlowerteeth = Lowerjawslope.addOrReplaceChild("Rightlowerteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, 0.6F, 0.0F, -0.0637F, 0.1698F, 0.0F));

		PartDefinition Rightlowerteeth2 = Lowerjawslope.addOrReplaceChild("Rightlowerteeth2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.46F, 0.6F, 0.0F, -0.0637F, -0.1698F, 0.0F));

		PartDefinition Upperjawback = Head.addOrReplaceChild("Upperjawback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9639F, -5.1427F, 0.4245F, 0.0F, 0.0F));

		PartDefinition Upperjawmiddle = Upperjawback.addOrReplaceChild("Upperjawmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -4.0F, -0.5943F, 0.0F, 0.0F));

		PartDefinition Nosebridge = Upperjawmiddle.addOrReplaceChild("Nosebridge", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.4F, -1.25F, 0.9976F, 0.0F, 0.0F));

		PartDefinition Upperjawfront = Upperjawmiddle.addOrReplaceChild("Upperjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -2.0F, -2.8F, 0.9128F, 0.0F, 0.0F));

		PartDefinition Upperfrontteeth = Upperjawfront.addOrReplaceChild("Upperfrontteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -1.5F, -0.1227F, 0.0F, 0.0F));

		PartDefinition Rightupperteethback = Upperjawback.addOrReplaceChild("Rightupperteethback", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8F, 1.7F, 1.17F, -0.1061F, 0.0213F, 0.0F));

		PartDefinition Rightupperteethback2 = Upperjawback.addOrReplaceChild("Rightupperteethback2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.78F, 1.7F, 1.17F, -0.1061F, -0.0213F, 0.0F));

		PartDefinition Forehead = Head.addOrReplaceChild("Forehead", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, -2.9639F, -5.6427F, 0.3183F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5F, 5.3616F, -5.9681F, -0.2784F, 0.1061F, -0.2122F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.573F, 4.4027F, 0.5233F, -0.6344F, 0.0637F, 0.2122F));

		PartDefinition Rightfrontfoot = Rightlowerarm.addOrReplaceChild("Rightfrontfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.4F, -0.5F, 0.8491F, 0.0F, 0.0F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.5F, 5.3616F, -5.9681F, 0.6954F, -0.2487F, 0.3801F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.573F, 4.4027F, 0.5233F, -0.8312F, -0.0742F, -0.3972F));

		PartDefinition Leftfrontfoot = Leftlowerarm.addOrReplaceChild("Leftfrontfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.4F, -0.5F, 0.0637F, 0.0F, 0.0F));

		PartDefinition Sailmiddlefront = Bodyfront.addOrReplaceChild("Sailmiddlefront", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -2.4397F, -6.6063F, -0.0637F, 0.0F, 0.0F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0495F, 3.5908F, 0.1988F, -0.1712F, -0.0343F));

		PartDefinition frame8_r1 = Tailbase.addOrReplaceChild("frame8_r1", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1F, 1.1482F, -0.9619F, 0.0961F, 0.0347F, 0.0033F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5499F, 4.722F, -0.1356F, -0.173F, 0.0235F));

		PartDefinition frame9_r1 = Tailmiddlebase.addOrReplaceChild("frame9_r1", CubeListBuilder.create().texOffs(15, 29).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.8165F, -0.0899F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = Tailmiddlebase.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, 0.6885F, -0.5256F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.7741F, 5.5583F, 0.1444F, -0.2614F, -0.0148F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0255F, 6.9651F, 0.0723F, -0.3047F, -0.0217F));

		PartDefinition frame11_r1 = Tailend.addOrReplaceChild("frame11_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.8085F, -0.0707F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3F, 2.2387F, 2.205F, -0.7236F, -0.1664F, -0.295F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4882F, 4.1774F, -0.2708F, 1.3043F, -0.1274F, 0.0848F));

		PartDefinition Righthindfoot = Rightshin.addOrReplaceChild("Righthindfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0365F, 5.642F, 0.5809F, -0.0636F, 0.0028F, 0.0648F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3F, 2.2387F, 2.205F, 0.9281F, 0.0223F, 0.1867F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4882F, 4.1774F, -0.2708F, 0.9552F, 0.1274F, -0.0848F));

		PartDefinition Lefthindfoot = Leftshin.addOrReplaceChild("Lefthindfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0365F, 5.642F, 0.5809F, -0.0636F, -0.0028F, -0.0648F));

		return LayerDefinition.create(meshdefinition, 80, 80);
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