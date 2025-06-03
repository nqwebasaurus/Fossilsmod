package fossils.fossils.client.blockentity.model.lotosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LotosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart Belly;
	private final ModelPart Bodyfront;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart Neck;
	private final ModelPart Head;
	private final ModelPart Upperjawback;
	private final ModelPart Upperjawmiddle;
	private final ModelPart Upperjawfront;
	private final ModelPart Faceslopefront;
	private final ModelPart Faceslopemiddle;
	private final ModelPart Lefteye;
	private final ModelPart Righteye;
	private final ModelPart Lowerjawback;
	private final ModelPart Lowerjawmiddleback;
	private final ModelPart Lowerjawmiddlefront;
	private final ModelPart Lowerjawfront;
	private final ModelPart Lowerjawslopeback;
	private final ModelPart Lowerjawslopefront;
	private final ModelPart Rightupperarm;
	private final ModelPart Rightlowerarm;
	private final ModelPart Rightfrontfoot;
	private final ModelPart Leftupperarm;
	private final ModelPart Leftlowerarm;
	private final ModelPart Leftfrontfoot;
	private final ModelPart Bellyhump;
	private final ModelPart Tailbase;
	private final ModelPart Tailmiddlebase;
	private final ModelPart Tailmiddle;
	private final ModelPart Tailmiddleend;
	private final ModelPart Tailend;
	private final ModelPart Tailbasehump;
	private final ModelPart Hiphumpfront;
	private final ModelPart Hiphumpback;
	private final ModelPart Rightthigh;
	private final ModelPart Rightshin;
	private final ModelPart Rightheel;
	private final ModelPart Righttoes;
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart Leftheel;
	private final ModelPart Lefttoes;

	public LotosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.body2 = this.Hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.Belly = this.body.getChild("Belly");
		this.Bodyfront = this.Belly.getChild("Bodyfront");
		this.neck3 = this.Bodyfront.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.Neck = this.neck2.getChild("Neck");
		this.Head = this.Neck.getChild("Head");
		this.Upperjawback = this.Head.getChild("Upperjawback");
		this.Upperjawmiddle = this.Upperjawback.getChild("Upperjawmiddle");
		this.Upperjawfront = this.Upperjawmiddle.getChild("Upperjawfront");
		this.Faceslopefront = this.Upperjawfront.getChild("Faceslopefront");
		this.Faceslopemiddle = this.Upperjawmiddle.getChild("Faceslopemiddle");
		this.Lefteye = this.Upperjawback.getChild("Lefteye");
		this.Righteye = this.Upperjawback.getChild("Righteye");
		this.Lowerjawback = this.Head.getChild("Lowerjawback");
		this.Lowerjawmiddleback = this.Lowerjawback.getChild("Lowerjawmiddleback");
		this.Lowerjawmiddlefront = this.Lowerjawmiddleback.getChild("Lowerjawmiddlefront");
		this.Lowerjawfront = this.Lowerjawmiddlefront.getChild("Lowerjawfront");
		this.Lowerjawslopeback = this.Lowerjawmiddleback.getChild("Lowerjawslopeback");
		this.Lowerjawslopefront = this.Lowerjawslopeback.getChild("Lowerjawslopefront");
		this.Rightupperarm = this.Bodyfront.getChild("Rightupperarm");
		this.Rightlowerarm = this.Rightupperarm.getChild("Rightlowerarm");
		this.Rightfrontfoot = this.Rightlowerarm.getChild("Rightfrontfoot");
		this.Leftupperarm = this.Bodyfront.getChild("Leftupperarm");
		this.Leftlowerarm = this.Leftupperarm.getChild("Leftlowerarm");
		this.Leftfrontfoot = this.Leftlowerarm.getChild("Leftfrontfoot");
		this.Bellyhump = this.Belly.getChild("Bellyhump");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.Tailmiddlebase = this.Tailbase.getChild("Tailmiddlebase");
		this.Tailmiddle = this.Tailmiddlebase.getChild("Tailmiddle");
		this.Tailmiddleend = this.Tailmiddle.getChild("Tailmiddleend");
		this.Tailend = this.Tailmiddleend.getChild("Tailend");
		this.Tailbasehump = this.Tailbase.getChild("Tailbasehump");
		this.Hiphumpfront = this.Hips.getChild("Hiphumpfront");
		this.Hiphumpback = this.Hiphumpfront.getChild("Hiphumpback");
		this.Rightthigh = this.Hips.getChild("Rightthigh");
		this.Rightshin = this.Rightthigh.getChild("Rightshin");
		this.Rightheel = this.Rightshin.getChild("Rightheel");
		this.Righttoes = this.Rightheel.getChild("Righttoes");
		this.Leftthigh = this.Hips.getChild("Leftthigh");
		this.Leftshin = this.Leftthigh.getChild("Leftshin");
		this.Leftheel = this.Leftshin.getChild("Leftheel");
		this.Lefttoes = this.Leftheel.getChild("Lefttoes");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(29, 57).addBox(1.5F, -0.2989F, -1.6141F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(29, 57).mirror().addBox(-2.5F, -0.2989F, -1.6141F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 7.0252F, 8.4832F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(70, 0).addBox(0.098F, -1.7299F, 0.0341F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -3.7688F, -1.3268F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(68, 14).addBox(0.1F, -3.0293F, -1.0856F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 52).addBox(0.1F, -1.9293F, 2.9144F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 62).addBox(0.1F, -1.9293F, 1.1144F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 67).addBox(0.1F, -2.9293F, 0.0144F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -0.6688F, -0.5268F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Hips_r3 = Hips.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(15, 71).addBox(0.098F, -1.914F, -0.0014F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -2.2688F, 2.5732F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Hips_r4 = Hips.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(73, 43).addBox(0.1F, -2.1928F, -0.0898F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 12).addBox(0.098F, -1.9928F, -0.0898F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -2.4688F, 0.8732F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Hips_r5 = Hips.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(41, 73).addBox(0.1F, -1.6139F, 0.0192F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 27).addBox(0.098F, -1.0139F, 0.0192F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -3.5688F, -0.2268F, -0.3142F, 0.0F, 0.0F));

		PartDefinition Hips_r6 = Hips.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(56, 18).mirror().addBox(-2.6F, 0.1F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(56, 18).mirror().addBox(-2.6F, 0.9F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(56, 18).mirror().addBox(-2.6F, -0.6F, -0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(56, 18).addBox(1.4F, 0.1F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(56, 18).addBox(1.4F, 0.9F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F))
				.texOffs(56, 18).addBox(1.4F, -0.6F, -0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1F, 0.3312F, 0.4732F, -0.192F, 0.0F, 0.0F));

		PartDefinition Hips_r7 = Hips.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(51, 4).mirror().addBox(-1.6F, -0.3F, -1.2F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(51, 4).addBox(0.4F, -0.3F, -1.2F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(28, 31).addBox(-0.6F, -0.9F, -2.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.3312F, 0.4732F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Hips_r8 = Hips.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(31, 44).mirror().addBox(0.0F, -0.5076F, -0.2576F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 2.6349F, 0.5885F, -0.8038F, 0.2733F, -0.1997F));

		PartDefinition Hips_r9 = Hips.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(47, 57).mirror().addBox(0.0F, 0.3887F, 2.4648F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 2.6349F, 0.5885F, -0.4722F, 0.2733F, -0.1997F));

		PartDefinition Hips_r10 = Hips.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(64, 31).mirror().addBox(0.0F, -1.0179F, -0.1867F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(5, 45).mirror().addBox(0.0F, -0.3179F, -0.1867F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.7802F, -1.0409F, -2.3736F, 0.0F, -0.5672F));

		PartDefinition Hips_r11 = Hips.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(45, 24).mirror().addBox(0.0F, -0.4679F, 0.4102F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.7802F, -1.0409F, -1.693F, 0.0F, -0.5672F));

		PartDefinition Hips_r12 = Hips.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(45, 64).mirror().addBox(-2.6F, -1.2553F, 1.3028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(22, 44).mirror().addBox(-2.6F, -0.5553F, 0.7028F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(45, 64).addBox(1.4F, -1.2553F, 1.3028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(22, 44).addBox(1.4F, -0.5553F, 0.7028F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.2688F, -2.4268F, -1.0647F, 0.0F, 0.0F));

		PartDefinition Hips_r13 = Hips.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(64, 34).mirror().addBox(-2.6F, -0.0301F, -0.7874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(64, 34).addBox(1.4F, -0.0301F, -0.7874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1F, -0.2688F, -1.6268F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Hips_r14 = Hips.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(64, 31).addBox(-1.0F, -1.0179F, -0.1867F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 45).addBox(-1.0F, -0.3179F, -0.1867F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.2F, 2.7802F, -1.0409F, -2.3736F, 0.0F, 0.5672F));

		PartDefinition Hips_r15 = Hips.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(31, 44).addBox(-1.0F, -0.5076F, -0.2576F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3F, 2.6349F, 0.5885F, -0.8038F, -0.2733F, 0.1997F));

		PartDefinition Hips_r16 = Hips.addOrReplaceChild("Hips_r16", CubeListBuilder.create().texOffs(47, 57).addBox(-1.0F, 0.3887F, 2.4648F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.3F, 2.6349F, 0.5885F, -0.4722F, -0.2733F, 0.1997F));

		PartDefinition Hips_r17 = Hips.addOrReplaceChild("Hips_r17", CubeListBuilder.create().texOffs(45, 24).addBox(-1.0F, -0.4679F, 0.4102F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.2F, 2.7802F, -1.0409F, -1.693F, 0.0F, 0.5672F));

		PartDefinition body2 = Hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4809F, -1.5666F, 0.0354F, 0.1744F, 0.0062F));

		PartDefinition Belly_r1 = body2.addOrReplaceChild("Belly_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -2.0145F, 0.0307F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.9168F, -5.6087F, 0.2793F, 0.0F, 0.0F));

		PartDefinition body7_r1 = body2.addOrReplaceChild("body7_r1", CubeListBuilder.create().texOffs(71, 41).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.167F, -1.5642F, -0.0618F, -0.0641F, -0.4564F));

		PartDefinition body8_r1 = body2.addOrReplaceChild("body8_r1", CubeListBuilder.create().texOffs(71, 16).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.167F, -1.5642F, -0.0304F, -0.0837F, -0.876F));

		PartDefinition body9_r1 = body2.addOrReplaceChild("body9_r1", CubeListBuilder.create().texOffs(57, 37).mirror().addBox(-4.4538F, -1.309F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.167F, -1.5642F, 0.0157F, -0.0877F, -1.4016F));

		PartDefinition body8_r2 = body2.addOrReplaceChild("body8_r2", CubeListBuilder.create().texOffs(48, 40).mirror().addBox(-5.4538F, -1.309F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.267F, -3.5642F, 0.0157F, -0.0877F, -1.3492F));

		PartDefinition body7_r2 = body2.addOrReplaceChild("body7_r2", CubeListBuilder.create().texOffs(70, 66).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.267F, -3.5642F, -0.0304F, -0.0837F, -0.8236F));

		PartDefinition body6_r1 = body2.addOrReplaceChild("body6_r1", CubeListBuilder.create().texOffs(47, 55).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.267F, -3.5642F, -0.0618F, -0.0641F, -0.404F));

		PartDefinition body7_r3 = body2.addOrReplaceChild("body7_r3", CubeListBuilder.create().texOffs(48, 40).addBox(1.4538F, -1.309F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.267F, -3.5642F, 0.0157F, 0.0877F, 1.3492F));

		PartDefinition body6_r2 = body2.addOrReplaceChild("body6_r2", CubeListBuilder.create().texOffs(70, 66).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.267F, -3.5642F, -0.0304F, 0.0837F, 0.8236F));

		PartDefinition Belly_r2 = body2.addOrReplaceChild("Belly_r2", CubeListBuilder.create().texOffs(37, 38).addBox(-0.5F, -0.0145F, 0.0307F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body5_r1 = body2.addOrReplaceChild("body5_r1", CubeListBuilder.create().texOffs(47, 55).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.267F, -3.5642F, -0.0618F, 0.0641F, 0.404F));

		PartDefinition body8_r3 = body2.addOrReplaceChild("body8_r3", CubeListBuilder.create().texOffs(57, 37).addBox(1.4538F, -1.309F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.167F, -1.5642F, 0.0157F, 0.0877F, 1.4016F));

		PartDefinition body7_r4 = body2.addOrReplaceChild("body7_r4", CubeListBuilder.create().texOffs(71, 16).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.167F, -1.5642F, -0.0304F, 0.0837F, 0.876F));

		PartDefinition body6_r3 = body2.addOrReplaceChild("body6_r3", CubeListBuilder.create().texOffs(71, 41).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.167F, -1.5642F, -0.0618F, 0.0641F, 0.4564F));

		PartDefinition Belly_r3 = body2.addOrReplaceChild("Belly_r3", CubeListBuilder.create().texOffs(70, 8).addBox(-0.002F, -4.8488F, -0.8935F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -1.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Belly_r4 = body2.addOrReplaceChild("Belly_r4", CubeListBuilder.create().texOffs(11, 72).addBox(-0.002F, -4.921F, -0.8124F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -3.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Belly_r5 = body2.addOrReplaceChild("Belly_r5", CubeListBuilder.create().texOffs(39, 67).addBox(0.0F, -2.8507F, -0.9927F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -1.0F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Belly_r6 = body2.addOrReplaceChild("Belly_r6", CubeListBuilder.create().texOffs(39, 61).addBox(0.0F, -2.9273F, -0.9655F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -3.0F, -0.1571F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -0.5145F, -5.9693F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(63, 69).addBox(0.0F, -2.5145F, -5.9693F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 18).addBox(-3.0F, 6.9855F, -5.9693F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -4.0F, 0.044F, 0.1308F, 0.0057F));

		PartDefinition body9_r2 = body.addOrReplaceChild("body9_r2", CubeListBuilder.create().texOffs(28, 72).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.033F, -5.5642F, 0.0999F, -0.0268F, -0.3068F));

		PartDefinition body10_r1 = body.addOrReplaceChild("body10_r1", CubeListBuilder.create().texOffs(23, 72).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.033F, -5.5642F, 0.1021F, 0.0161F, -0.7235F));

		PartDefinition body11_r1 = body.addOrReplaceChild("body11_r1", CubeListBuilder.create().texOffs(38, 0).mirror().addBox(-7.4538F, -1.309F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.033F, -5.5642F, 0.0805F, 0.0649F, -1.2453F));

		PartDefinition body8_r4 = body.addOrReplaceChild("body8_r4", CubeListBuilder.create().texOffs(18, 73).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.067F, -3.5642F, 0.0236F, -0.0455F, -0.2866F));

		PartDefinition body9_r3 = body.addOrReplaceChild("body9_r3", CubeListBuilder.create().texOffs(73, 10).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.067F, -3.5642F, 0.0401F, -0.032F, -0.7055F));

		PartDefinition body10_r2 = body.addOrReplaceChild("body10_r2", CubeListBuilder.create().texOffs(38, 6).mirror().addBox(-6.4538F, -1.309F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.067F, -3.5642F, 0.0507F, -0.0077F, -1.2287F));

		PartDefinition body7_r5 = body.addOrReplaceChild("body7_r5", CubeListBuilder.create().texOffs(6, 72).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.067F, -1.5642F, 0.0236F, -0.0455F, -0.3564F));

		PartDefinition body8_r5 = body.addOrReplaceChild("body8_r5", CubeListBuilder.create().texOffs(71, 60).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.067F, -1.5642F, 0.0401F, -0.032F, -0.7753F));

		PartDefinition body9_r4 = body.addOrReplaceChild("body9_r4", CubeListBuilder.create().texOffs(38, 4).mirror().addBox(-6.4538F, -1.309F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.067F, -1.5642F, 0.0507F, -0.0077F, -1.2985F));

		PartDefinition body9_r5 = body.addOrReplaceChild("body9_r5", CubeListBuilder.create().texOffs(23, 72).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.033F, -5.5642F, 0.1021F, -0.0161F, 0.7235F));

		PartDefinition body10_r3 = body.addOrReplaceChild("body10_r3", CubeListBuilder.create().texOffs(38, 0).addBox(1.4538F, -1.309F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.033F, -5.5642F, 0.0805F, -0.0649F, 1.2453F));

		PartDefinition body8_r6 = body.addOrReplaceChild("body8_r6", CubeListBuilder.create().texOffs(28, 72).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.033F, -5.5642F, 0.0999F, 0.0268F, 0.3068F));

		PartDefinition body9_r6 = body.addOrReplaceChild("body9_r6", CubeListBuilder.create().texOffs(38, 6).addBox(1.4538F, -1.309F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.067F, -3.5642F, 0.0507F, 0.0077F, 1.2287F));

		PartDefinition body8_r7 = body.addOrReplaceChild("body8_r7", CubeListBuilder.create().texOffs(73, 10).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.067F, -3.5642F, 0.0401F, 0.032F, 0.7055F));

		PartDefinition body7_r6 = body.addOrReplaceChild("body7_r6", CubeListBuilder.create().texOffs(18, 73).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.067F, -3.5642F, 0.0236F, 0.0455F, 0.2866F));

		PartDefinition body8_r8 = body.addOrReplaceChild("body8_r8", CubeListBuilder.create().texOffs(38, 4).addBox(1.4538F, -1.309F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.067F, -1.5642F, 0.0507F, 0.0077F, 1.2985F));

		PartDefinition body7_r7 = body.addOrReplaceChild("body7_r7", CubeListBuilder.create().texOffs(71, 60).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.067F, -1.5642F, 0.0401F, 0.032F, 0.7753F));

		PartDefinition body6_r4 = body.addOrReplaceChild("body6_r4", CubeListBuilder.create().texOffs(6, 72).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.067F, -1.5642F, 0.0236F, 0.0455F, 0.3564F));

		PartDefinition Belly_r7 = body.addOrReplaceChild("Belly_r7", CubeListBuilder.create().texOffs(57, 63).addBox(-0.002F, -5.5432F, -0.6649F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -1.0F, 0.0611F, 0.0F, 0.0F));

		PartDefinition Belly_r8 = body.addOrReplaceChild("Belly_r8", CubeListBuilder.create().texOffs(54, 63).addBox(0.002F, -5.5595F, -0.8684F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -1.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Belly_r9 = body.addOrReplaceChild("Belly_r9", CubeListBuilder.create().texOffs(66, 69).addBox(0.0F, -1.9622F, -0.968F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -1.0F, -0.096F, 0.0F, 0.0F));

		PartDefinition Belly_r10 = body.addOrReplaceChild("Belly_r10", CubeListBuilder.create().texOffs(20, 68).addBox(0.0F, -2.2145F, -0.9693F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Belly_r11 = body.addOrReplaceChild("Belly_r11", CubeListBuilder.create().texOffs(21, 62).addBox(-0.002F, -5.6835F, -0.7816F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Belly_r12 = body.addOrReplaceChild("Belly_r12", CubeListBuilder.create().texOffs(42, 63).addBox(0.002F, -5.6142F, -0.9344F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Belly_r13 = body.addOrReplaceChild("Belly_r13", CubeListBuilder.create().texOffs(18, 62).addBox(-0.002F, -3.9889F, -0.0159F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -6.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Belly_r14 = body.addOrReplaceChild("Belly_r14", CubeListBuilder.create().texOffs(15, 62).addBox(0.002F, -3.6145F, -0.9693F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, -5.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Belly = body.addOrReplaceChild("Belly", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2493F, -5.9347F, 0.111F, 0.0F, 0.0F));

		PartDefinition Belly_r15 = Belly.addOrReplaceChild("Belly_r15", CubeListBuilder.create().texOffs(67, 52).addBox(-0.002F, -3.0354F, -0.9048F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1507F, -1.2653F, 0.2443F, 0.0F, 0.0F));

		PartDefinition Belly_r16 = Belly.addOrReplaceChild("Belly_r16", CubeListBuilder.create().texOffs(45, 67).addBox(0.002F, -3.0354F, -0.9048F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1507F, -1.2653F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Belly_r17 = Belly.addOrReplaceChild("Belly_r17", CubeListBuilder.create().texOffs(56, 69).addBox(0.0F, -2.8F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 31).addBox(-0.5F, -0.8F, 1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.9493F, -5.9653F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Belly_r18 = Belly.addOrReplaceChild("Belly_r18", CubeListBuilder.create().texOffs(69, 69).addBox(-0.002F, -4.7338F, -0.3962F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0507F, -3.1653F, 0.288F, 0.0F, 0.0F));

		PartDefinition Belly_r19 = Belly.addOrReplaceChild("Belly_r19", CubeListBuilder.create().texOffs(67, 0).addBox(0.0F, -2.996F, -0.8631F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0507F, -3.1653F, 0.1309F, 0.0F, 0.0F));

		PartDefinition body11_r2 = Belly.addOrReplaceChild("body11_r2", CubeListBuilder.create().texOffs(72, 70).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5823F, -3.5295F, 0.175F, -0.0043F, -0.3779F));

		PartDefinition body12_r1 = Belly.addOrReplaceChild("body12_r1", CubeListBuilder.create().texOffs(72, 68).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5823F, -3.5295F, 0.1619F, 0.0669F, -0.791F));

		PartDefinition body13_r1 = Belly.addOrReplaceChild("body13_r1", CubeListBuilder.create().texOffs(41, 31).mirror().addBox(-6.4538F, -1.309F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5823F, -3.5295F, 0.1071F, 0.1387F, -1.3126F));

		PartDefinition body10_r4 = Belly.addOrReplaceChild("body10_r4", CubeListBuilder.create().texOffs(45, 72).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3823F, -1.6295F, 0.0999F, -0.0268F, -0.3417F));

		PartDefinition body11_r3 = Belly.addOrReplaceChild("body11_r3", CubeListBuilder.create().texOffs(33, 72).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3823F, -1.6295F, 0.1021F, 0.0161F, -0.7584F));

		PartDefinition body12_r2 = Belly.addOrReplaceChild("body12_r2", CubeListBuilder.create().texOffs(38, 2).mirror().addBox(-7.4538F, -1.309F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3823F, -1.6295F, 0.0805F, 0.0649F, -1.2802F));

		PartDefinition body12_r3 = Belly.addOrReplaceChild("body12_r3", CubeListBuilder.create().texOffs(41, 31).addBox(1.4538F, -1.309F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5823F, -3.5295F, 0.1071F, -0.1387F, 1.3126F));

		PartDefinition body11_r4 = Belly.addOrReplaceChild("body11_r4", CubeListBuilder.create().texOffs(72, 68).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5823F, -3.5295F, 0.1619F, -0.0669F, 0.791F));

		PartDefinition body10_r5 = Belly.addOrReplaceChild("body10_r5", CubeListBuilder.create().texOffs(72, 70).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5823F, -3.5295F, 0.175F, 0.0043F, 0.3779F));

		PartDefinition body11_r5 = Belly.addOrReplaceChild("body11_r5", CubeListBuilder.create().texOffs(38, 2).addBox(1.4538F, -1.309F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3823F, -1.6295F, 0.0805F, -0.0649F, 1.2802F));

		PartDefinition body10_r6 = Belly.addOrReplaceChild("body10_r6", CubeListBuilder.create().texOffs(33, 72).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3823F, -1.6295F, 0.1021F, -0.0161F, 0.7584F));

		PartDefinition body9_r7 = Belly.addOrReplaceChild("body9_r7", CubeListBuilder.create().texOffs(45, 72).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3823F, -1.6295F, 0.0999F, 0.0268F, 0.3417F));

		PartDefinition Belly_r20 = Belly.addOrReplaceChild("Belly_r20", CubeListBuilder.create().texOffs(0, 36).addBox(-2.5F, -0.9145F, -2.7693F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.2493F, -0.0653F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Bodyfront = Belly.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4069F, -5.0662F, 0.1406F, 0.1728F, 0.0243F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(50, 72).addBox(0.0F, -3.2984F, -0.9428F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 64).addBox(-0.002F, -2.9984F, -0.9428F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2534F, -0.0052F, 0.2967F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = Bodyfront.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(68, 73).addBox(0.0F, -1.997F, 4.8697F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 18).addBox(0.0F, -1.997F, 2.8697F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 38).addBox(-0.5F, -0.997F, 1.8697F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.0466F, -5.7052F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = Bodyfront.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(73, 21).addBox(0.0F, -2.4988F, -1.0402F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 69).addBox(-0.002F, -1.9988F, -1.0402F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1534F, -1.9052F, 0.4189F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r4 = Bodyfront.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(41, 33).mirror().addBox(-4.9951F, -0.038F, -0.332F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 7.0407F, 0.6054F, -0.2449F, 0.7871F, -0.0155F));

		PartDefinition Bodyfront_r5 = Bodyfront.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(48, 42).mirror().addBox(-3.9951F, -0.038F, -0.332F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 7.0407F, 0.6054F, -0.2608F, 0.5669F, -0.0349F));

		PartDefinition body13_r2 = Bodyfront.addOrReplaceChild("body13_r2", CubeListBuilder.create().texOffs(73, 8).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2754F, -2.4633F, 0.211F, -0.0037F, -0.5704F));

		PartDefinition body14_r1 = Bodyfront.addOrReplaceChild("body14_r1", CubeListBuilder.create().texOffs(73, 2).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2754F, -2.4633F, 0.1947F, 0.0819F, -0.9809F));

		PartDefinition body15_r1 = Bodyfront.addOrReplaceChild("body15_r1", CubeListBuilder.create().texOffs(62, 57).mirror().addBox(-3.4538F, -1.309F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2754F, -2.4633F, 0.1283F, 0.1681F, -1.5017F));

		PartDefinition body12_r4 = Bodyfront.addOrReplaceChild("body12_r4", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2754F, -0.4633F, 0.1088F, -0.0266F, -0.4991F));

		PartDefinition body13_r3 = Bodyfront.addOrReplaceChild("body13_r3", CubeListBuilder.create().texOffs(72, 72).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2754F, -0.4633F, 0.1103F, 0.0198F, -0.9154F));

		PartDefinition body14_r2 = Bodyfront.addOrReplaceChild("body14_r2", CubeListBuilder.create().texOffs(58, 16).mirror().addBox(-4.4538F, -1.309F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2754F, -0.4633F, 0.0857F, 0.0722F, -1.437F));

		PartDefinition Bodyfront_r6 = Bodyfront.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(45, 29).mirror().addBox(-3.3F, 0.0948F, -0.6892F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.8407F, 0.1054F, -0.0995F, 0.4317F, 0.233F));

		PartDefinition Bodyfront_r7 = Bodyfront.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(63, 27).mirror().addBox(0.0F, 1.6356F, -0.9598F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 2.304F, -3.0606F, -0.0175F, 0.0F, -0.5236F));

		PartDefinition Bodyfront_r8 = Bodyfront.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(63, 18).mirror().addBox(0.0F, 0.1528F, -0.0953F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 2.304F, -3.0606F, -0.4538F, 0.0F, -0.5236F));

		PartDefinition Bodyfront_r9 = Bodyfront.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(45, 49).mirror().addBox(0.0F, -1.3092F, -1.9816F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 5.5271F, -1.8336F, 1.4465F, -0.1467F, -0.8635F));

		PartDefinition Bodyfront_r10 = Bodyfront.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(65, 8).mirror().addBox(-0.5F, -2.6695F, 1.5624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(10, 62).mirror().addBox(-0.5F, -2.6695F, 0.5624F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(34, 61).mirror().addBox(-0.5F, -2.6695F, -0.4376F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 1.96F, -1.2531F, 0.3142F, 0.0F, 0.1745F));

		PartDefinition Bodyfront_r11 = Bodyfront.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(15, 68).mirror().addBox(-0.5F, 1.2395F, -2.9219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 1.96F, -1.2531F, 0.5411F, 0.0F, 0.1745F));

		PartDefinition Bodyfront_r12 = Bodyfront.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(56, 28).mirror().addBox(-0.5F, -0.6984F, -3.594F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 1.96F, -1.2531F, 1.3788F, 0.0F, 0.1745F));

		PartDefinition Bodyfront_r13 = Bodyfront.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(67, 5).mirror().addBox(-0.5F, 2.0255F, -0.7419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 1.96F, -1.2531F, -0.4014F, 0.0F, 0.1745F));

		PartDefinition Bodyfront_r14 = Bodyfront.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(62, 53).mirror().addBox(-0.5F, 0.1664F, -0.2574F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 1.96F, -1.2531F, -0.6458F, 0.0F, 0.1745F));

		PartDefinition Bodyfront_r15 = Bodyfront.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(24, 62).mirror().addBox(-0.5F, 0.5563F, -0.2625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 1.96F, -1.2531F, -0.1745F, 0.0F, 0.1745F));

		PartDefinition Bodyfront_r16 = Bodyfront.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(57, 53).mirror().addBox(-0.5F, -3.3279F, -0.0812F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 1.96F, -1.2531F, -0.4189F, 0.0F, 0.1745F));

		PartDefinition Bodyfront_r17 = Bodyfront.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(15, 68).addBox(-0.5F, 1.2395F, -2.9219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.7F, 1.96F, -1.2531F, 0.5411F, 0.0F, -0.1745F));

		PartDefinition Bodyfront_r18 = Bodyfront.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(45, 49).addBox(-1.0F, -1.3092F, -1.9816F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(3.5F, 5.5271F, -1.8336F, 1.4465F, 0.1467F, 0.8635F));

		PartDefinition Bodyfront_r19 = Bodyfront.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(56, 28).addBox(-0.5F, -0.6984F, -3.594F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.7F, 1.96F, -1.2531F, 1.3788F, 0.0F, -0.1745F));

		PartDefinition Bodyfront_r20 = Bodyfront.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(67, 5).addBox(-0.5F, 2.0255F, -0.7419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(2.7F, 1.96F, -1.2531F, -0.4014F, 0.0F, -0.1745F));

		PartDefinition Bodyfront_r21 = Bodyfront.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(62, 53).addBox(-0.5F, 0.1664F, -0.2574F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.7F, 1.96F, -1.2531F, -0.6458F, 0.0F, -0.1745F));

		PartDefinition Bodyfront_r22 = Bodyfront.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(63, 27).addBox(-1.0F, 1.6356F, -0.9598F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(2.9F, 2.304F, -3.0606F, -0.0175F, 0.0F, 0.5236F));

		PartDefinition Bodyfront_r23 = Bodyfront.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(63, 18).addBox(-1.0F, 0.1528F, -0.0953F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.9F, 2.304F, -3.0606F, -0.4538F, 0.0F, 0.5236F));

		PartDefinition Bodyfront_r24 = Bodyfront.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(24, 62).addBox(-0.5F, 0.5563F, -0.2625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(2.7F, 1.96F, -1.2531F, -0.1745F, 0.0F, -0.1745F));

		PartDefinition Bodyfront_r25 = Bodyfront.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(65, 8).addBox(-0.5F, -2.6695F, 1.5624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(10, 62).addBox(-0.5F, -2.6695F, 0.5624F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(34, 61).addBox(-0.5F, -2.6695F, -0.4376F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(2.7F, 1.96F, -1.2531F, 0.3142F, 0.0F, -0.1745F));

		PartDefinition Bodyfront_r26 = Bodyfront.addOrReplaceChild("Bodyfront_r26", CubeListBuilder.create().texOffs(57, 53).addBox(-0.5F, -3.3279F, -0.0812F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.7F, 1.96F, -1.2531F, -0.4189F, 0.0F, -0.1745F));

		PartDefinition Bodyfront_r27 = Bodyfront.addOrReplaceChild("Bodyfront_r27", CubeListBuilder.create().texOffs(49, 8).addBox(-0.5F, -1.0094F, -0.0506F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 7.2407F, -1.5946F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r28 = Bodyfront.addOrReplaceChild("Bodyfront_r28", CubeListBuilder.create().texOffs(41, 33).addBox(-0.0049F, -0.038F, -0.332F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.0407F, 0.6054F, -0.2449F, -0.7871F, 0.0155F));

		PartDefinition Bodyfront_r29 = Bodyfront.addOrReplaceChild("Bodyfront_r29", CubeListBuilder.create().texOffs(48, 42).addBox(-0.0049F, -0.038F, -0.332F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.0407F, 0.6054F, -0.2608F, -0.5669F, 0.0349F));

		PartDefinition Bodyfront_r30 = Bodyfront.addOrReplaceChild("Bodyfront_r30", CubeListBuilder.create().texOffs(45, 29).addBox(-0.7F, 0.0948F, -0.6892F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.8407F, 0.1054F, -0.0995F, -0.4317F, -0.233F));

		PartDefinition Bodyfront_r31 = Bodyfront.addOrReplaceChild("Bodyfront_r31", CubeListBuilder.create().texOffs(49, 13).addBox(-0.5F, 0.4F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 5.5407F, -1.5946F, -0.5934F, 0.0F, 0.0F));

		PartDefinition body14_r3 = Bodyfront.addOrReplaceChild("body14_r3", CubeListBuilder.create().texOffs(62, 57).addBox(1.4538F, -1.309F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2754F, -2.4633F, 0.1283F, -0.1681F, 1.5017F));

		PartDefinition body13_r4 = Bodyfront.addOrReplaceChild("body13_r4", CubeListBuilder.create().texOffs(73, 2).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2754F, -2.4633F, 0.1947F, -0.0819F, 0.9809F));

		PartDefinition body12_r5 = Bodyfront.addOrReplaceChild("body12_r5", CubeListBuilder.create().texOffs(73, 8).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2754F, -2.4633F, 0.211F, 0.0037F, 0.5704F));

		PartDefinition body13_r5 = Bodyfront.addOrReplaceChild("body13_r5", CubeListBuilder.create().texOffs(58, 16).addBox(1.4538F, -1.309F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2754F, -0.4633F, 0.0857F, -0.0722F, 1.437F));

		PartDefinition body12_r6 = Bodyfront.addOrReplaceChild("body12_r6", CubeListBuilder.create().texOffs(72, 72).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2754F, -0.4633F, 0.1103F, -0.0198F, 0.9154F));

		PartDefinition body11_r6 = Bodyfront.addOrReplaceChild("body11_r6", CubeListBuilder.create().texOffs(73, 0).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2754F, -0.4633F, 0.1088F, 0.0266F, 0.4991F));

		PartDefinition neck3 = Bodyfront.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(57, 49).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.5F, -3.8F, -0.0777F, 0.4086F, 0.1306F));

		PartDefinition cube_r1 = neck3.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(53, 69).addBox(-0.002F, -1.9809F, -0.9272F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, -0.2F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Neck_r1 = neck3.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(62, 0).mirror().addBox(0.0729F, -0.5038F, 0.0099F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4608F, -1.0372F, -0.6297F, -0.4792F, 0.2252F));

		PartDefinition Neck_r2 = neck3.addOrReplaceChild("Neck_r2", CubeListBuilder.create().texOffs(62, 0).addBox(-0.0729F, -0.5038F, 0.0099F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4608F, -1.0372F, -0.6297F, 0.4792F, -0.2252F));

		PartDefinition cube_r2 = neck3.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(73, 24).addBox(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, 0.1396F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2792F, -1.7595F, -0.3526F, 0.116F, -0.0607F));

		PartDefinition Neck_r3 = neck2.addOrReplaceChild("Neck_r3", CubeListBuilder.create().texOffs(38, 72).addBox(0.0F, -1.9691F, -1.0433F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -1.9F, 0.733F, 0.0F, 0.0F));

		PartDefinition Neck_r4 = neck2.addOrReplaceChild("Neck_r4", CubeListBuilder.create().texOffs(11, 40).addBox(-0.002F, -1.9749F, -0.9251F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -0.6F, 0.9076F, 0.0F, 0.0F));

		PartDefinition Neck_r5 = neck2.addOrReplaceChild("Neck_r5", CubeListBuilder.create().texOffs(59, 72).addBox(0.0F, -1.0371F, -0.9656F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.1F, 0.6807F, 0.0F, 0.0F));

		PartDefinition Neck_r6 = neck2.addOrReplaceChild("Neck_r6", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(0.0685F, -0.4961F, -0.0235F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.84F, -0.7777F, 0.0186F, -0.349F, -0.0064F));

		PartDefinition Neck_r7 = neck2.addOrReplaceChild("Neck_r7", CubeListBuilder.create().texOffs(61, 59).mirror().addBox(-0.0295F, -0.4085F, -0.0034F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.04F, -2.7777F, -0.0545F, -0.2789F, 0.015F));

		PartDefinition Neck_r8 = neck2.addOrReplaceChild("Neck_r8", CubeListBuilder.create().texOffs(0, 62).addBox(-0.0685F, -0.4961F, -0.0235F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.84F, -0.7777F, 0.0186F, 0.349F, 0.0064F));

		PartDefinition Neck_r9 = neck2.addOrReplaceChild("Neck_r9", CubeListBuilder.create().texOffs(61, 59).addBox(0.0295F, -0.4085F, -0.0034F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.04F, -2.7777F, -0.0545F, 0.2789F, -0.015F));

		PartDefinition Neck_r10 = neck2.addOrReplaceChild("Neck_r10", CubeListBuilder.create().texOffs(23, 49).addBox(-0.5F, -0.2447F, 2.7796F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -5.6F, 0.192F, 0.0F, 0.0F));

		PartDefinition Neck = neck2.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6417F, -2.76F, -0.1337F, 0.3464F, 0.0437F));

		PartDefinition Neck_r11 = Neck.addOrReplaceChild("Neck_r11", CubeListBuilder.create().texOffs(73, 62).addBox(0.0F, -0.9856F, 0.0161F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0017F, -2.1177F, -0.2967F, 0.0F, 0.0F));

		PartDefinition Neck_r12 = Neck.addOrReplaceChild("Neck_r12", CubeListBuilder.create().texOffs(29, 54).mirror().addBox(0.0F, -0.4073F, -0.0085F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8983F, -1.9177F, -0.0532F, -0.1743F, 0.0092F));

		PartDefinition Neck_r13 = Neck.addOrReplaceChild("Neck_r13", CubeListBuilder.create().texOffs(29, 54).addBox(0.0F, -0.4073F, -0.0085F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8983F, -1.9177F, -0.0532F, 0.1743F, -0.0092F));

		PartDefinition Neck_r14 = Neck.addOrReplaceChild("Neck_r14", CubeListBuilder.create().texOffs(14, 49).addBox(-0.5F, -0.2447F, -0.2204F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.3983F, -2.8177F, 0.192F, 0.0F, 0.0F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.363F, -2.8704F, 0.5792F, 0.2883F, 0.1765F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(66, 40).mirror().addBox(-1.5F, -0.0038F, -1.0429F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(66, 40).addBox(0.5F, -0.0038F, -1.0429F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2761F, 0.5731F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(58, 12).mirror().addBox(-1.5F, -0.1F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(58, 12).addBox(0.5F, -0.1F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.8737F, 0.6856F, -1.1694F, 0.0F, 0.0F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(11, 44).addBox(-1.5F, -0.8706F, -0.0499F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5118F, -1.7658F, -0.2967F, 0.0F, 0.0F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(65, 63).mirror().addBox(-0.2F, -0.9286F, -0.603F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(69, 34).mirror().addBox(-0.2F, -0.3286F, -0.603F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(65, 63).addBox(0.24F, -0.9286F, -0.603F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(69, 34).addBox(0.24F, -0.3286F, -0.603F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.52F, -0.4652F, -3.9303F, -1.2741F, 0.0F, 0.0F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(33, 69).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(33, 69).addBox(0.54F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.52F, -0.3488F, -2.4343F, -0.5585F, 0.0F, 0.0F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(65, 11).mirror().addBox(-0.3F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(69, 31).mirror().addBox(-0.3F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(69, 31).addBox(1.34F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(65, 11).addBox(1.34F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.02F, -0.6062F, -1.8149F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-0.5F, -0.7984F, -1.0155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 69).addBox(1.54F, -0.7984F, -1.0155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.02F, -0.3138F, 0.1414F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(28, 69).mirror().addBox(-0.5F, -0.9764F, -0.0702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(28, 69).addBox(1.54F, -0.9764F, -0.0702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.02F, 0.7862F, -0.6586F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(60, 63).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(60, 63).addBox(1.54F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.02F, -0.3138F, -0.8586F, -0.2967F, 0.0F, 0.0F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(65, 66).mirror().addBox(-1.6F, -1.214F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(66, 59).mirror().addBox(-1.6F, -1.214F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(65, 66).addBox(0.6F, -1.214F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(66, 59).addBox(0.6F, -1.214F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 40).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.4761F, -0.6269F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Upperjawback = Head.addOrReplaceChild("Upperjawback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3761F, -2.1269F, 0.0424F, 0.0F, 0.0F));

		PartDefinition Upperjawback_r1 = Upperjawback.addOrReplaceChild("Upperjawback_r1", CubeListBuilder.create().texOffs(61, 23).mirror().addBox(-1.3F, 0.0F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2F, 0.7F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Upperjawback_r2 = Upperjawback.addOrReplaceChild("Upperjawback_r2", CubeListBuilder.create().texOffs(61, 23).addBox(-0.7F, 0.0F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.2F, 0.7F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Upperjawmiddle = Upperjawback.addOrReplaceChild("Upperjawmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.93F, -1.6F, 0.1061F, 0.0F, 0.0F));

		PartDefinition Upperjawmiddle_r1 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r1", CubeListBuilder.create().texOffs(61, 43).mirror().addBox(-1.3F, -0.942F, -0.7871F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(61, 43).addBox(-0.7F, -0.942F, -0.7871F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(47, 61).addBox(-1.0F, -1.642F, -1.7871F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(41, 35).addBox(-1.0F, -0.942F, -1.7871F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1954F, 1.8046F, -0.3142F, 0.0F, 0.0F));

		PartDefinition Upperjawmiddle_r2 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r2", CubeListBuilder.create().texOffs(34, 66).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.9F, 1.1F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Upperjawfront = Upperjawmiddle.addOrReplaceChild("Upperjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.82F, -1.0F, 0.1698F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r1 = Upperjawfront.addOrReplaceChild("Upperjawfront_r1", CubeListBuilder.create().texOffs(69, 49).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.1F, 1.3F, -0.3142F, 0.0F, 0.0F));

		PartDefinition Faceslopefront = Upperjawfront.addOrReplaceChild("Faceslopefront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 0.0F, -2.0F, 0.7391F, 0.0F, 0.0F));

		PartDefinition Faceslopefront_r1 = Faceslopefront.addOrReplaceChild("Faceslopefront_r1", CubeListBuilder.create().texOffs(68, 46).addBox(-0.5F, -0.4F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.991F, 1.9622F, -0.5411F, 0.0F, 0.0F));

		PartDefinition Faceslopefront_r2 = Faceslopefront.addOrReplaceChild("Faceslopefront_r2", CubeListBuilder.create().texOffs(10, 69).addBox(-0.5F, -0.4F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.2923F, 2.2436F, -1.0647F, 0.0F, 0.0F));

		PartDefinition Faceslopefront_r3 = Faceslopefront.addOrReplaceChild("Faceslopefront_r3", CubeListBuilder.create().texOffs(66, 37).addBox(-0.5F, -0.2399F, -0.2503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.5396F, 2.5148F, -0.6632F, 0.0F, 0.0F));

		PartDefinition Faceslopefront_r4 = Faceslopefront.addOrReplaceChild("Faceslopefront_r4", CubeListBuilder.create().texOffs(68, 22).addBox(-0.5F, -0.2636F, -0.1246F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.4396F, 1.8148F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Faceslopefront_r5 = Faceslopefront.addOrReplaceChild("Faceslopefront_r5", CubeListBuilder.create().texOffs(23, 69).addBox(-0.5F, -0.4755F, -0.4846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.7816F, 1.3548F, 0.6109F, 0.0F, 0.0F));

		PartDefinition Faceslopefront_r6 = Faceslopefront.addOrReplaceChild("Faceslopefront_r6", CubeListBuilder.create().texOffs(5, 69).addBox(-0.5F, -0.4836F, -0.3646F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.7396F, 1.5148F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Faceslopefront_r7 = Faceslopefront.addOrReplaceChild("Faceslopefront_r7", CubeListBuilder.create().texOffs(48, 69).addBox(-0.51F, 0.0F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, 3.4F, -0.6981F, 0.0F, 0.0F));

		PartDefinition Faceslopemiddle = Upperjawmiddle.addOrReplaceChild("Faceslopemiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.41F, -1.75F, 0.2546F, 0.0F, 0.0F));

		PartDefinition Faceslopemiddle_r1 = Faceslopemiddle.addOrReplaceChild("Faceslopemiddle_r1", CubeListBuilder.create().texOffs(61, 46).addBox(-1.0F, 0.0F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 3.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Lefteye = Upperjawback.addOrReplaceChild("Lefteye", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.45F, 1.1F, -1.9F, -0.0424F, -0.1911F, 0.0F));

		PartDefinition Righteye = Upperjawback.addOrReplaceChild("Righteye", CubeListBuilder.create(), PartPose.offsetAndRotation(1.45F, 1.1F, -1.9F, -0.0424F, 0.1911F, 0.0F));

		PartDefinition Lowerjawback = Head.addOrReplaceChild("Lowerjawback", CubeListBuilder.create().texOffs(54, 59).addBox(0.6F, -0.1001F, -1.3956F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F))
				.texOffs(54, 59).mirror().addBox(-1.6F, -0.1001F, -1.3956F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5239F, 0.6731F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Lowerjawback_r1 = Lowerjawback.addOrReplaceChild("Lowerjawback_r1", CubeListBuilder.create().texOffs(68, 43).mirror().addBox(-0.5F, 0.4F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(68, 28).mirror().addBox(-0.52F, 0.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(68, 25).mirror().addBox(-0.52F, 0.2F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(68, 28).addBox(1.72F, 0.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(68, 25).addBox(1.72F, 0.2F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(68, 43).addBox(1.7F, 0.4F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-1.1F, -0.2001F, -1.4956F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Lowerjawback_r2 = Lowerjawback.addOrReplaceChild("Lowerjawback_r2", CubeListBuilder.create().texOffs(29, 66).mirror().addBox(-0.5F, -0.8214F, -0.8016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(29, 66).addBox(1.7F, -0.8214F, -0.8016F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1F, 1.0999F, -1.8956F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Lowerjawback_r3 = Lowerjawback.addOrReplaceChild("Lowerjawback_r3", CubeListBuilder.create().texOffs(68, 19).mirror().addBox(-0.5F, -0.1943F, -0.7918F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.1001F, -2.0956F, 0.3142F, 0.0F, 0.0F));

		PartDefinition Lowerjawback_r4 = Lowerjawback.addOrReplaceChild("Lowerjawback_r4", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.2001F, -1.4956F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Lowerjawback_r5 = Lowerjawback.addOrReplaceChild("Lowerjawback_r5", CubeListBuilder.create().texOffs(60, 4).mirror().addBox(-0.5F, -0.1856F, -1.7591F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(60, 4).addBox(1.7F, -0.1856F, -1.7591F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-1.1F, 0.0999F, 0.0044F, -0.192F, 0.0F, 0.0F));

		PartDefinition Lowerjawback_r6 = Lowerjawback.addOrReplaceChild("Lowerjawback_r6", CubeListBuilder.create().texOffs(15, 58).mirror().addBox(-0.5F, -0.7205F, -1.7524F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(15, 58).addBox(1.7F, -0.7205F, -1.7524F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1F, 0.5999F, 0.2044F, 0.2094F, 0.0F, 0.0F));

		PartDefinition Lowerjawback_r7 = Lowerjawback.addOrReplaceChild("Lowerjawback_r7", CubeListBuilder.create().texOffs(68, 19).addBox(-0.5F, -0.1943F, -0.7918F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.1F, -0.1001F, -2.0956F, 0.3142F, 0.0F, 0.0F));

		PartDefinition Lowerjawback_r8 = Lowerjawback.addOrReplaceChild("Lowerjawback_r8", CubeListBuilder.create().texOffs(0, 66).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1F, -0.2001F, -1.4956F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddleback = Lowerjawback.addOrReplaceChild("Lowerjawmiddleback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0899F, -2.6656F, 0.0424F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddleback_r1 = Lowerjawmiddleback.addOrReplaceChild("Lowerjawmiddleback_r1", CubeListBuilder.create().texOffs(64, 49).addBox(-0.5F, -0.8179F, -0.1635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.5F, -2.8F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddleback_r2 = Lowerjawmiddleback.addOrReplaceChild("Lowerjawmiddleback_r2", CubeListBuilder.create().texOffs(24, 66).mirror().addBox(-0.5F, -0.201F, -1.1508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(10, 66).mirror().addBox(-0.5F, -0.201F, -0.7508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(24, 66).addBox(-0.1F, -0.201F, -1.1508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(10, 66).addBox(-0.1F, -0.201F, -0.7508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(5, 66).addBox(-0.3F, -0.201F, -1.7508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.2F, 0.4F, -1.5F, 0.3316F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddleback_r3 = Lowerjawmiddleback.addOrReplaceChild("Lowerjawmiddleback_r3", CubeListBuilder.create().texOffs(59, 39).mirror().addBox(-0.2F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(59, 39).addBox(1.2F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.1F, 0.2443F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddlefront = Lowerjawmiddleback.addOrReplaceChild("Lowerjawmiddlefront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.0848F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront = Lowerjawmiddlefront.addOrReplaceChild("Lowerjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.1323F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopeback = Lowerjawmiddleback.addOrReplaceChild("Lowerjawslopeback", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 1.9F, -0.12F, -0.1698F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopeback_r1 = Lowerjawslopeback.addOrReplaceChild("Lowerjawslopeback_r1", CubeListBuilder.create().texOffs(58, 8).mirror().addBox(-1.19F, -0.7716F, -1.7654F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(58, 8).addBox(0.19F, -0.7716F, -1.7654F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.01F, -0.9382F, 0.0752F, 0.2443F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopefront = Lowerjawslopeback.addOrReplaceChild("Lowerjawslopefront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.01F, -1.7F, -0.0087F, 0.0F, 0.0F));

		PartDefinition Lowerjawslopefront_r1 = Lowerjawslopefront.addOrReplaceChild("Lowerjawslopefront_r1", CubeListBuilder.create().texOffs(57, 33).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, -0.6426F, -0.0353F, 0.4014F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create().texOffs(5, 61).addBox(0.5339F, 1.1065F, -0.1784F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 23).addBox(0.5339F, -0.8935F, -0.9784F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9905F, 6.2235F, -1.0481F, -0.271F, 0.0F, -0.0424F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0985F, 4.1856F, 0.5657F, -0.7652F, 0.0F, 0.0424F));

		PartDefinition Rightlowerarm_r1 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r1", CubeListBuilder.create().texOffs(37, 53).addBox(-1.0F, -3.0F, -1.05F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(5, 53).addBox(-1.0F, -3.0F, 0.05F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1254F, 2.9826F, -0.8528F, 0.0F, 1.5708F, 0.0F));

		PartDefinition Rightfrontfoot = Rightlowerarm.addOrReplaceChild("Rightfrontfoot", CubeListBuilder.create().texOffs(0, 24).addBox(-1.5F, -0.4317F, -3.5433F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0254F, 6.1692F, -0.3025F, 0.7842F, 0.0F, 0.0F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create().texOffs(29, 61).addBox(-1.5339F, 1.1065F, -0.1784F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 44).addBox(-1.5339F, -0.8935F, -0.9784F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9905F, 6.2235F, -1.0481F, 0.558F, 0.0F, 0.0424F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0985F, 4.1856F, 0.5657F, -0.8088F, 0.0F, -0.0424F));

		PartDefinition Leftlowerarm_r1 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r1", CubeListBuilder.create().texOffs(10, 54).addBox(0.0F, -3.0F, -1.05F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 54).addBox(0.0F, -3.0F, 0.05F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1254F, 2.9826F, -0.8528F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Leftfrontfoot = Leftlowerarm.addOrReplaceChild("Leftfrontfoot", CubeListBuilder.create().texOffs(15, 25).addBox(-1.5F, -0.4317F, -3.5433F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0254F, 6.1692F, -0.3025F, 0.2596F, 0.0225F, -0.0843F));

		PartDefinition Bellyhump = Belly.addOrReplaceChild("Bellyhump", CubeListBuilder.create(), PartPose.offset(0.0F, -1.2507F, 0.0347F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0443F, 3.3614F, -0.1964F, -0.257F, 0.0505F));

		PartDefinition Tailbase_r1 = Tailbase.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(3, 72).addBox(0.0F, -1.9554F, 0.0075F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0338F, 6.9761F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailbase_r2 = Tailbase.addOrReplaceChild("Tailbase_r2", CubeListBuilder.create().texOffs(56, 73).addBox(-0.002F, -2.2383F, -0.0943F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 72).addBox(0.0F, -2.0383F, -0.0943F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0338F, 5.0761F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Tailbase_r3 = Tailbase.addOrReplaceChild("Tailbase_r3", CubeListBuilder.create().texOffs(53, 73).addBox(-0.002F, -0.9275F, -0.0046F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1338F, 3.0761F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Tailbase_r4 = Tailbase.addOrReplaceChild("Tailbase_r4", CubeListBuilder.create().texOffs(71, 56).addBox(0.0F, -2.3F, 3.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 37).addBox(0.0F, -2.3F, 1.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 8).addBox(-0.5F, -0.3F, 0.9F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.0338F, -0.9239F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Tailbase_r5 = Tailbase.addOrReplaceChild("Tailbase_r5", CubeListBuilder.create().texOffs(73, 52).addBox(0.0F, -1.3149F, -0.0021F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 46).addBox(-0.002F, -1.0149F, -0.0021F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2338F, 1.0761F, -0.2356F, 0.0F, 0.0F));

		PartDefinition Tailbase_r6 = Tailbase.addOrReplaceChild("Tailbase_r6", CubeListBuilder.create().texOffs(71, 37).addBox(0.0F, 1.6F, 5.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 37).addBox(0.0F, 0.3F, 3.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 37).addBox(0.0F, -0.4F, 1.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 37).addBox(0.0F, -1.0F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.069F, 1.3866F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4911F, 7.9609F, -0.2064F, 0.2565F, -0.0531F));

		PartDefinition Tailmiddlebase_r1 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(19, 8).addBox(-0.5F, 0.2F, -0.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.5963F, 0.014F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r2 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r2", CubeListBuilder.create().texOffs(62, 73).addBox(0.0F, -0.8421F, 0.005F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6963F, 4.914F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r3 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r3", CubeListBuilder.create().texOffs(72, 4).addBox(0.0F, -1.4023F, 0.0071F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5963F, 2.914F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r4 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r4", CubeListBuilder.create().texOffs(37, 49).addBox(0.0F, 2.0F, 4.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 49).addBox(0.0F, 0.9F, 2.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 49).addBox(0.0F, -0.1F, 0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7321F, 1.4447F, 0.6283F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r5 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r5", CubeListBuilder.create().texOffs(37, 49).addBox(0.0F, -1.7625F, 0.0092F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4963F, 0.914F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Tailmiddle = Tailmiddlebase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create().texOffs(21, 17).addBox(-0.5F, -0.5057F, -0.0998F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F))
				.texOffs(65, 73).addBox(0.0F, -0.8057F, -0.0998F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3698F, 6.9713F, 0.3382F, 0.1281F, 0.0269F));

		PartDefinition Tailmiddleend = Tailmiddle.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(36, 18).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.0364F, 5.7995F, 0.2916F, 0.3881F, 0.0613F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(15, 38).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0192F, 3.9068F, -0.2336F, 0.345F, 0.0542F));

		PartDefinition Tailbasehump = Tailbase.addOrReplaceChild("Tailbasehump", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5338F, -1.2239F, -0.1061F, 0.0F, 0.0F));

		PartDefinition Hiphumpfront = Hips.addOrReplaceChild("Hiphumpfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4302F, -7.6013F, -0.0637F, 0.0F, 0.0F));

		PartDefinition Hiphumpback = Hiphumpfront.addOrReplaceChild("Hiphumpback", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -5.0F, 6.0F, -0.2122F, 0.0F, 0.0F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1923F, 0.8431F, 0.0365F, -0.41F, -0.0376F, -0.0196F));

		PartDefinition Rightthigh_r1 = Rightthigh.addOrReplaceChild("Rightthigh_r1", CubeListBuilder.create().texOffs(45, 44).addBox(-1.0F, -0.1206F, -0.6049F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 7.1F, -0.7F, 0.4014F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r2 = Rightthigh.addOrReplaceChild("Rightthigh_r2", CubeListBuilder.create().texOffs(47, 18).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.2363F, 0.1191F, -0.4189F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r3 = Rightthigh.addOrReplaceChild("Rightthigh_r3", CubeListBuilder.create().texOffs(32, 49).addBox(-0.4995F, -5.6438F, -1.3337F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 6.8F, 0.7F, -0.0524F, 0.001F, -0.0036F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.926F, -0.1976F, 0.4705F, 0.0F, 0.0F));

		PartDefinition Rightshin_r1 = Rightshin.addOrReplaceChild("Rightshin_r1", CubeListBuilder.create().texOffs(40, 44).addBox(-0.5F, -3.5F, 0.25F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(53, 0).addBox(-0.9F, -3.5F, -1.75F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(24, 54).addBox(-0.5F, -2.5F, -1.25F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6669F, 0.8071F, 0.0F, 1.5708F, 0.0F));

		PartDefinition Rightheel = Rightshin.addOrReplaceChild("Rightheel", CubeListBuilder.create().texOffs(0, 30).addBox(-1.4996F, -0.277F, -3.0302F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.4688F, 0.6196F, -0.0625F, 0.0F, 0.0F));

		PartDefinition Righttoes = Rightheel.addOrReplaceChild("Righttoes", CubeListBuilder.create().texOffs(36, 8).addBox(-1.4996F, -0.0098F, -2.7812F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.01F, -0.2772F, -2.799F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1923F, 0.8431F, 0.0365F, 0.2882F, 0.0376F, 0.0196F));

		PartDefinition Leftthigh_r1 = Leftthigh.addOrReplaceChild("Leftthigh_r1", CubeListBuilder.create().texOffs(48, 35).addBox(-1.0F, -0.1206F, -0.6049F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 7.1F, -0.7F, 0.4014F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r2 = Leftthigh.addOrReplaceChild("Leftthigh_r2", CubeListBuilder.create().texOffs(5, 48).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.2363F, 0.1191F, -0.4189F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r3 = Leftthigh.addOrReplaceChild("Leftthigh_r3", CubeListBuilder.create().texOffs(52, 49).addBox(-0.5005F, -5.6438F, -1.3337F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 6.8F, 0.7F, -0.0524F, -0.001F, 0.0036F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.926F, -0.1976F, 0.5142F, 0.0F, 0.0F));

		PartDefinition Leftshin_r1 = Leftshin.addOrReplaceChild("Leftshin_r1", CubeListBuilder.create().texOffs(0, 45).addBox(-0.5F, -3.5F, 0.25F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(15, 54).addBox(-1.1F, -3.5F, -1.75F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(42, 55).addBox(-0.5F, -2.5F, -1.25F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6669F, 0.8071F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Leftheel = Leftshin.addOrReplaceChild("Leftheel", CubeListBuilder.create().texOffs(30, 25).addBox(-1.5004F, -0.277F, -3.0302F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.4688F, 0.6196F, -0.1061F, 0.0F, 0.0F));

		PartDefinition Lefttoes = Leftheel.addOrReplaceChild("Lefttoes", CubeListBuilder.create().texOffs(36, 13).addBox(-1.5004F, -0.0098F, -2.7812F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -0.2772F, -2.799F, -0.5672F, 0.0F, 0.0F));

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