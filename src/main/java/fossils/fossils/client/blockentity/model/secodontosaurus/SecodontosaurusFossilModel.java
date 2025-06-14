package fossils.fossils.client.blockentity.model.secodontosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SecodontosaurusFossilModel extends SkullModelBase {
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

	public SecodontosaurusFossilModel(ModelPart root) {
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -21.25F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.9F, 6.6F, -0.1878F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.1648F, -2.689F, -3.4859F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(42, 44).mirror().addBox(-0.7648F, -2.689F, -3.4859F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1486F, 2.4755F, 1.3947F, -0.1652F, 0.0262F, 0.0454F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.8352F, -2.689F, -3.4859F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F))
				.texOffs(42, 44).addBox(-0.2352F, -2.689F, -3.4859F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1486F, 2.4755F, 1.3947F, -0.1652F, -0.0262F, -0.0454F));

		PartDefinition Hips_r3 = Hips.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(52, 10).mirror().addBox(0.022F, 0.9938F, -2.6904F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5893F, 0.9801F, -0.2625F, 0.0355F, 0.0262F, -0.2863F));

		PartDefinition Hips_r4 = Hips.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(25, 11).mirror().addBox(-0.0386F, 1.7293F, 1.1522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5893F, 0.9801F, -0.2625F, 0.1927F, 0.0329F, -0.2909F));

		PartDefinition Hips_r5 = Hips.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(53, 27).mirror().addBox(-0.0386F, 1.3488F, 0.4539F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5893F, 0.9801F, -0.2625F, 0.0356F, 0.0329F, -0.2909F));

		PartDefinition Hips_r6 = Hips.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(45, 7).mirror().addBox(-0.0386F, 1.1873F, -0.9455F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5893F, 0.9801F, -0.2625F, -0.1913F, 0.0329F, -0.2909F));

		PartDefinition Hips_r7 = Hips.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(53, 15).mirror().addBox(0.022F, 0.4563F, -0.7756F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5893F, 0.9801F, -0.2625F, -0.1216F, 0.0262F, -0.2863F));

		PartDefinition Hips_r8 = Hips.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(11, 11).mirror().addBox(0.022F, -0.8369F, -0.6145F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5893F, 0.9801F, -0.2625F, 0.2711F, 0.0262F, -0.2863F));

		PartDefinition Hips_r9 = Hips.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(11, 11).addBox(-1.022F, -0.8369F, -0.6145F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5893F, 0.9801F, -0.2625F, 0.2711F, -0.0262F, 0.2863F));

		PartDefinition Hips_r10 = Hips.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(52, 10).addBox(-1.022F, 0.9938F, -2.6904F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5893F, 0.9801F, -0.2625F, 0.0355F, -0.0262F, 0.2863F));

		PartDefinition Hips_r11 = Hips.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(53, 15).addBox(-1.022F, 0.4563F, -0.7756F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5893F, 0.9801F, -0.2625F, -0.1216F, -0.0262F, 0.2863F));

		PartDefinition Hips_r12 = Hips.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(45, 7).addBox(-0.9614F, 1.1873F, -0.9455F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5893F, 0.9801F, -0.2625F, -0.1913F, -0.0329F, 0.2909F));

		PartDefinition Hips_r13 = Hips.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(25, 11).addBox(-0.9614F, 1.7293F, 1.1522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5893F, 0.9801F, -0.2625F, 0.1927F, -0.0329F, 0.2909F));

		PartDefinition Hips_r14 = Hips.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(53, 27).addBox(-0.9614F, 1.3488F, 0.4539F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5893F, 0.9801F, -0.2625F, 0.0356F, -0.0329F, 0.2909F));

		PartDefinition Hips_r15 = Hips.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(23, 21).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -1.1697F, -2.5506F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r1 = Hips.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(0, 60).addBox(0.0F, -3.8872F, 0.2276F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6034F, 1.172F, -0.3447F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = Hips.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(20, 60).addBox(0.0F, -2.0644F, -0.318F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0475F, -0.1961F, -0.2574F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = Hips.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(8, 59).addBox(0.0005F, 0.9109F, -0.9149F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0005F, -5.1636F, -0.6403F, -0.2138F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r4 = Hips.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(40, 48).addBox(-0.0005F, -6.9336F, -0.6994F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0005F, -5.1636F, -0.6403F, -0.4232F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r5 = Hips.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(25, 58).addBox(-0.001F, -6.0794F, -0.0022F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0475F, 0.0039F, -0.4756F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7697F, -2.5506F, 0.1372F, -0.0865F, -0.0119F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.4F, -0.0119F, -0.0144F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -2.6715F, -8.5434F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r6 = Bodymiddle.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(17, 59).addBox(0.0F, -3.8915F, -0.145F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7743F, -1.6303F, -0.3011F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r7 = Bodymiddle.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(26, 47).addBox(-0.001F, -9.0317F, -0.0983F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4743F, -0.5303F, -0.4407F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r8 = Bodymiddle.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(38, 57).addBox(0.0F, -6.0912F, -0.1354F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0777F, -3.6568F, -0.2138F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r9 = Bodymiddle.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(9, 49).addBox(-0.001F, -7.9945F, 0.0627F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.0777F, -2.5568F, -0.3185F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r10 = Bodymiddle.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(43, 49).addBox(-0.001F, -7.869F, 0.0736F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.1817F, -5.0545F, -0.2138F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r11 = Bodymiddle.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(22, 52).addBox(0.0F, -6.4919F, -0.1642F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5817F, -5.6545F, -0.1265F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r12 = Bodymiddle.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(18, 45).mirror().addBox(-3.3059F, -1.8187F, -0.5221F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2579F, -0.9847F, -0.0925F, -0.1852F, -1.5302F));

		PartDefinition Bodyfront_r13 = Bodymiddle.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(59, 4).mirror().addBox(-2.9063F, -0.422F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2579F, -0.9847F, -0.1727F, -0.1143F, -1.0053F));

		PartDefinition Bodyfront_r14 = Bodymiddle.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(37, 46).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2579F, -0.9847F, -0.2095F, -0.053F, -0.5717F));

		PartDefinition Bodyfront_r15 = Bodymiddle.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(59, 46).mirror().addBox(-2.9063F, -0.422F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7579F, -2.9847F, -0.1727F, -0.1143F, -0.8482F));

		PartDefinition Bodyfront_r16 = Bodymiddle.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(57, 35).mirror().addBox(-5.3059F, -1.8187F, -0.5221F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7579F, -2.9847F, -0.0925F, -0.1852F, -1.3731F));

		PartDefinition Bodyfront_r17 = Bodymiddle.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(29, 47).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7579F, -2.9847F, -0.2095F, -0.053F, -0.4146F));

		PartDefinition Bodyfront_r18 = Bodymiddle.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(45, 32).mirror().addBox(-6.3059F, -1.8187F, -0.5221F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.2579F, -4.9847F, -0.0925F, -0.1852F, -1.3033F));

		PartDefinition Bodyfront_r19 = Bodymiddle.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(59, 48).mirror().addBox(-2.9063F, -0.422F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.2579F, -4.9847F, -0.1727F, -0.1143F, -0.7784F));

		PartDefinition Bodyfront_r20 = Bodymiddle.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(59, 52).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.2579F, -4.9847F, -0.2095F, -0.053F, -0.3448F));

		PartDefinition Bodyfront_r21 = Bodymiddle.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(26, 0).mirror().addBox(-7.3059F, -1.8187F, -0.5221F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.7579F, -6.9847F, -0.0716F, -0.1185F, -1.289F));

		PartDefinition Bodyfront_r22 = Bodymiddle.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(59, 50).mirror().addBox(-2.9063F, -0.422F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.7579F, -6.9847F, -0.1212F, -0.0669F, -0.7656F));

		PartDefinition Bodyfront_r23 = Bodymiddle.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(60, 6).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.7579F, -6.9847F, -0.143F, -0.0316F, -0.3301F));

		PartDefinition Bodyfront_r24 = Bodymiddle.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(18, 45).addBox(2.3059F, -1.8187F, -0.5221F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2579F, -0.9847F, -0.0925F, 0.1852F, 1.5302F));

		PartDefinition Bodyfront_r25 = Bodymiddle.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(59, 4).addBox(0.9063F, -0.422F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2579F, -0.9847F, -0.1727F, 0.1143F, 1.0053F));

		PartDefinition Bodyfront_r26 = Bodymiddle.addOrReplaceChild("Bodyfront_r26", CubeListBuilder.create().texOffs(37, 46).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2579F, -0.9847F, -0.2095F, 0.053F, 0.5717F));

		PartDefinition Bodyfront_r27 = Bodymiddle.addOrReplaceChild("Bodyfront_r27", CubeListBuilder.create().texOffs(57, 35).addBox(2.3059F, -1.8187F, -0.5221F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7579F, -2.9847F, -0.0925F, 0.1852F, 1.3731F));

		PartDefinition Bodyfront_r28 = Bodymiddle.addOrReplaceChild("Bodyfront_r28", CubeListBuilder.create().texOffs(59, 46).addBox(0.9063F, -0.422F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7579F, -2.9847F, -0.1727F, 0.1143F, 0.8482F));

		PartDefinition Bodyfront_r29 = Bodymiddle.addOrReplaceChild("Bodyfront_r29", CubeListBuilder.create().texOffs(29, 47).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7579F, -2.9847F, -0.2095F, 0.053F, 0.4146F));

		PartDefinition Bodyfront_r30 = Bodymiddle.addOrReplaceChild("Bodyfront_r30", CubeListBuilder.create().texOffs(45, 32).addBox(2.3059F, -1.8187F, -0.5221F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2579F, -4.9847F, -0.0925F, 0.1852F, 1.3033F));

		PartDefinition Bodyfront_r31 = Bodymiddle.addOrReplaceChild("Bodyfront_r31", CubeListBuilder.create().texOffs(59, 48).addBox(0.9063F, -0.422F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2579F, -4.9847F, -0.1727F, 0.1143F, 0.7784F));

		PartDefinition Bodyfront_r32 = Bodymiddle.addOrReplaceChild("Bodyfront_r32", CubeListBuilder.create().texOffs(59, 52).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2579F, -4.9847F, -0.2095F, 0.053F, 0.3448F));

		PartDefinition Bodyfront_r33 = Bodymiddle.addOrReplaceChild("Bodyfront_r33", CubeListBuilder.create().texOffs(26, 0).addBox(2.3059F, -1.8187F, -0.5221F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.7579F, -6.9847F, -0.0716F, 0.1185F, 1.289F));

		PartDefinition Bodyfront_r34 = Bodymiddle.addOrReplaceChild("Bodyfront_r34", CubeListBuilder.create().texOffs(59, 50).addBox(0.9063F, -0.422F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.7579F, -6.9847F, -0.1212F, 0.0669F, 0.7656F));

		PartDefinition Bodyfront_r35 = Bodymiddle.addOrReplaceChild("Bodyfront_r35", CubeListBuilder.create().texOffs(49, 57).addBox(0.0F, -6.0174F, -0.3008F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0834F, -7.3578F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r36 = Bodymiddle.addOrReplaceChild("Bodyfront_r36", CubeListBuilder.create().texOffs(5, 53).addBox(-0.001F, -12.9664F, -0.822F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0834F, -7.3578F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r37 = Bodymiddle.addOrReplaceChild("Bodyfront_r37", CubeListBuilder.create().texOffs(60, 6).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.7579F, -6.9847F, -0.143F, 0.0316F, 0.3301F));

		PartDefinition Bodyfront = Bodymiddle.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(52, 58).addBox(-0.001F, -7.1492F, -5.0811F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 58).addBox(-0.001F, -10.1375F, -3.1007F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3834F, -8.4578F, 0.0502F, -0.1743F, -0.0087F));

		PartDefinition Bodyfront_r38 = Bodyfront.addOrReplaceChild("Bodyfront_r38", CubeListBuilder.create().texOffs(28, 58).addBox(0.0F, -4.8F, -0.8F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3726F, -2.092F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r39 = Bodyfront.addOrReplaceChild("Bodyfront_r39", CubeListBuilder.create().texOffs(46, 56).addBox(0.0F, -6.0349F, -0.1015F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1726F, -0.892F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r40 = Bodyfront.addOrReplaceChild("Bodyfront_r40", CubeListBuilder.create().texOffs(56, 46).addBox(-0.001F, -12.0237F, -0.3636F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1726F, -0.892F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r41 = Bodyfront.addOrReplaceChild("Bodyfront_r41", CubeListBuilder.create().texOffs(12, 7).mirror().addBox(-7.3059F, -1.8187F, -0.5221F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2529F, -0.4188F, -0.0612F, -0.0852F, -1.2726F));

		PartDefinition Bodyfront_r42 = Bodyfront.addOrReplaceChild("Bodyfront_r42", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(-2.9063F, -0.422F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2529F, -0.4188F, -0.0956F, -0.0432F, -0.7496F));

		PartDefinition Bodyfront_r43 = Bodyfront.addOrReplaceChild("Bodyfront_r43", CubeListBuilder.create().texOffs(25, 14).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2529F, -0.4188F, -0.1098F, -0.0209F, -0.3136F));

		PartDefinition Bodyfront_r44 = Bodyfront.addOrReplaceChild("Bodyfront_r44", CubeListBuilder.create().texOffs(21, 9).mirror().addBox(-7.3059F, -1.8187F, -0.5221F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0529F, -2.4188F, -0.0567F, -0.0683F, -1.273F));

		PartDefinition Bodyfront_r45 = Bodyfront.addOrReplaceChild("Bodyfront_r45", CubeListBuilder.create().texOffs(38, 1).mirror().addBox(-2.9063F, -0.422F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0529F, -2.4188F, -0.0832F, -0.0308F, -0.75F));

		PartDefinition Bodyfront_r46 = Bodyfront.addOrReplaceChild("Bodyfront_r46", CubeListBuilder.create().texOffs(17, 27).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0529F, -2.4188F, -0.0934F, -0.0149F, -0.3139F));

		PartDefinition Bodyfront_r47 = Bodyfront.addOrReplaceChild("Bodyfront_r47", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(-6.3059F, -1.8187F, -0.5221F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0471F, -4.4188F, -0.0567F, -0.0683F, -1.3079F));

		PartDefinition Bodyfront_r48 = Bodyfront.addOrReplaceChild("Bodyfront_r48", CubeListBuilder.create().texOffs(51, 8).mirror().addBox(-2.9063F, -0.422F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0471F, -4.4188F, -0.0832F, -0.0308F, -0.7849F));

		PartDefinition Bodyfront_r49 = Bodyfront.addOrReplaceChild("Bodyfront_r49", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0471F, -4.4188F, -0.0934F, -0.0149F, -0.3488F));

		PartDefinition Bodyfront_r50 = Bodyfront.addOrReplaceChild("Bodyfront_r50", CubeListBuilder.create().texOffs(25, 14).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2529F, -0.4188F, -0.1098F, 0.0209F, 0.3136F));

		PartDefinition Bodyfront_r51 = Bodyfront.addOrReplaceChild("Bodyfront_r51", CubeListBuilder.create().texOffs(0, 17).addBox(0.9063F, -0.422F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2529F, -0.4188F, -0.0956F, 0.0432F, 0.7496F));

		PartDefinition Bodyfront_r52 = Bodyfront.addOrReplaceChild("Bodyfront_r52", CubeListBuilder.create().texOffs(12, 7).addBox(2.3059F, -1.8187F, -0.5221F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2529F, -0.4188F, -0.0612F, 0.0852F, 1.2726F));

		PartDefinition Bodyfront_r53 = Bodyfront.addOrReplaceChild("Bodyfront_r53", CubeListBuilder.create().texOffs(17, 27).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0529F, -2.4188F, -0.0934F, 0.0149F, 0.3139F));

		PartDefinition Bodyfront_r54 = Bodyfront.addOrReplaceChild("Bodyfront_r54", CubeListBuilder.create().texOffs(38, 1).addBox(0.9063F, -0.422F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0529F, -2.4188F, -0.0832F, 0.0308F, 0.75F));

		PartDefinition Bodyfront_r55 = Bodyfront.addOrReplaceChild("Bodyfront_r55", CubeListBuilder.create().texOffs(21, 9).addBox(2.3059F, -1.8187F, -0.5221F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0529F, -2.4188F, -0.0567F, 0.0683F, 1.273F));

		PartDefinition Bodyfront_r56 = Bodyfront.addOrReplaceChild("Bodyfront_r56", CubeListBuilder.create().texOffs(0, 37).addBox(2.3059F, -1.8187F, -0.5221F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0471F, -4.4188F, -0.0567F, 0.0683F, 1.3079F));

		PartDefinition Bodyfront_r57 = Bodyfront.addOrReplaceChild("Bodyfront_r57", CubeListBuilder.create().texOffs(51, 8).addBox(0.9063F, -0.422F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0471F, -4.4188F, -0.0832F, 0.0308F, 0.7849F));

		PartDefinition Bodyfront_r58 = Bodyfront.addOrReplaceChild("Bodyfront_r58", CubeListBuilder.create().texOffs(0, 33).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0471F, -4.4188F, -0.0934F, 0.0149F, 0.3488F));

		PartDefinition Bodyfront_r59 = Bodyfront.addOrReplaceChild("Bodyfront_r59", CubeListBuilder.create().texOffs(32, 20).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5726F, -4.892F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r60 = Bodyfront.addOrReplaceChild("Bodyfront_r60", CubeListBuilder.create().texOffs(32, 20).addBox(0.0005F, 0.2381F, -0.5434F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0005F, -3.4108F, -4.5486F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Neckbase = Bodyfront.addOrReplaceChild("Neckbase", CubeListBuilder.create().texOffs(41, 58).addBox(-0.001F, -5.857F, -2.03F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1726F, -4.892F, 0.0456F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r61 = Neckbase.addOrReplaceChild("Bodyfront_r61", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(-0.5F, -1.4F, -0.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(0, 11).addBox(5.5F, -1.4F, -0.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-3.0F, 5.508F, -4.2209F, 0.8203F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r62 = Neckbase.addOrReplaceChild("Bodyfront_r62", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-0.5F, 0.026F, -0.9704F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(0, 53).addBox(5.5F, 0.026F, -0.9704F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-3.0F, 0.7206F, -1.5537F, -0.4538F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r63 = Neckbase.addOrReplaceChild("Bodyfront_r63", CubeListBuilder.create().texOffs(52, 34).mirror().addBox(-0.5F, -2.2F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 34).addBox(5.5F, -2.2F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 2.4642F, -3.4999F, -0.2269F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r64 = Neckbase.addOrReplaceChild("Bodyfront_r64", CubeListBuilder.create().texOffs(33, 14).addBox(-2.5F, -2.5F, 0.1F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 6.5785F, -4.6727F, 0.9076F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r65 = Neckbase.addOrReplaceChild("Bodyfront_r65", CubeListBuilder.create().texOffs(38, 35).addBox(-2.5F, 0.0387F, -0.0561F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 35).addBox(-1.0F, 3.0387F, -0.0561F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0785F, -5.1727F, 1.2566F, 0.0F, 0.0F));

		PartDefinition Neckbase_r1 = Neckbase.addOrReplaceChild("Neckbase_r1", CubeListBuilder.create().texOffs(40, 18).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2576F, -3.8624F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r66 = Neckbase.addOrReplaceChild("Bodyfront_r66", CubeListBuilder.create().texOffs(58, 60).addBox(0.0F, -1.6227F, -0.0576F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2388F, -1.9027F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r67 = Neckbase.addOrReplaceChild("Bodyfront_r67", CubeListBuilder.create().texOffs(58, 60).addBox(0.0F, -1.6227F, -0.0576F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1388F, -3.7027F, 0.0F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r68 = Neckbase.addOrReplaceChild("Bodyfront_r68", CubeListBuilder.create().texOffs(41, 58).addBox(-0.001F, -4.6182F, -0.1273F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1388F, -3.7027F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r69 = Neckbase.addOrReplaceChild("Bodyfront_r69", CubeListBuilder.create().texOffs(58, 13).mirror().addBox(-4.3059F, -1.8187F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2831F, -3.3892F, -0.0408F, -0.0093F, -1.483F));

		PartDefinition Bodyfront_r70 = Neckbase.addOrReplaceChild("Bodyfront_r70", CubeListBuilder.create().texOffs(58, 27).mirror().addBox(-2.9063F, -0.422F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1831F, -1.3892F, -0.0524F, 0.0F, -0.8552F));

		PartDefinition Bodyfront_r71 = Neckbase.addOrReplaceChild("Bodyfront_r71", CubeListBuilder.create().texOffs(57, 25).mirror().addBox(-5.3059F, -1.8187F, -0.5221F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1831F, -1.3892F, -0.0454F, -0.0262F, -1.3782F));

		PartDefinition Bodyfront_r72 = Neckbase.addOrReplaceChild("Bodyfront_r72", CubeListBuilder.create().texOffs(8, 44).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1831F, -1.3892F, -0.0524F, 0.0F, -0.4189F));

		PartDefinition Bodyfront_r73 = Neckbase.addOrReplaceChild("Bodyfront_r73", CubeListBuilder.create().texOffs(58, 15).mirror().addBox(-2.9063F, -0.422F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2831F, -3.3892F, -0.04F, 0.0123F, -0.9599F));

		PartDefinition Bodyfront_r74 = Neckbase.addOrReplaceChild("Bodyfront_r74", CubeListBuilder.create().texOffs(40, 3).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2831F, -3.3892F, -0.036F, 0.006F, -0.5235F));

		PartDefinition Bodyfront_r75 = Neckbase.addOrReplaceChild("Bodyfront_r75", CubeListBuilder.create().texOffs(58, 13).addBox(2.3059F, -1.8187F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2831F, -3.3892F, -0.0408F, 0.0093F, 1.483F));

		PartDefinition Bodyfront_r76 = Neckbase.addOrReplaceChild("Bodyfront_r76", CubeListBuilder.create().texOffs(58, 15).addBox(0.9063F, -0.422F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2831F, -3.3892F, -0.04F, -0.0123F, 0.9599F));

		PartDefinition Bodyfront_r77 = Neckbase.addOrReplaceChild("Bodyfront_r77", CubeListBuilder.create().texOffs(40, 3).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2831F, -3.3892F, -0.036F, -0.006F, 0.5235F));

		PartDefinition Bodyfront_r78 = Neckbase.addOrReplaceChild("Bodyfront_r78", CubeListBuilder.create().texOffs(8, 44).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1831F, -1.3892F, -0.0524F, 0.0F, 0.4189F));

		PartDefinition Bodyfront_r79 = Neckbase.addOrReplaceChild("Bodyfront_r79", CubeListBuilder.create().texOffs(58, 27).addBox(0.9063F, -0.422F, -0.5221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1831F, -1.3892F, -0.0524F, 0.0F, 0.8552F));

		PartDefinition Bodyfront_r80 = Neckbase.addOrReplaceChild("Bodyfront_r80", CubeListBuilder.create().texOffs(57, 25).addBox(2.3059F, -1.8187F, -0.5221F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1831F, -1.3892F, -0.0454F, 0.0262F, 1.3782F));

		PartDefinition Neckend = Neckbase.addOrReplaceChild("Neckend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2576F, -3.6624F, 0.0464F, -0.3492F, 0.0066F));

		PartDefinition Neckend_r1 = Neckend.addOrReplaceChild("Neckend_r1", CubeListBuilder.create().texOffs(55, 60).addBox(0.0F, -2.5F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 40).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.875F, -3.3935F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r81 = Neckend.addOrReplaceChild("Bodyfront_r81", CubeListBuilder.create().texOffs(38, 27).mirror().addBox(-0.7156F, -0.2407F, -0.5136F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0495F, -1.6204F, -0.159F, -0.0387F, -0.7397F));

		PartDefinition Bodyfront_r82 = Neckend.addOrReplaceChild("Bodyfront_r82", CubeListBuilder.create().texOffs(57, 37).mirror().addBox(-2.5467F, -0.5202F, -0.5282F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0495F, -1.6204F, -0.1328F, -0.0801F, -1.1749F));

		PartDefinition Bodyfront_r83 = Neckend.addOrReplaceChild("Bodyfront_r83", CubeListBuilder.create().texOffs(38, 27).addBox(-0.2844F, -0.2407F, -0.5136F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0495F, -1.6204F, -0.159F, 0.0387F, 0.7397F));

		PartDefinition Bodyfront_r84 = Neckend.addOrReplaceChild("Bodyfront_r84", CubeListBuilder.create().texOffs(57, 37).addBox(0.5467F, -0.5202F, -0.5282F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0495F, -1.6204F, -0.1328F, 0.0801F, 1.1749F));

		PartDefinition Bodyfront_r85 = Neckend.addOrReplaceChild("Bodyfront_r85", CubeListBuilder.create().texOffs(34, 58).addBox(0.0F, -12.55F, -15.3F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.925F, 13.2065F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Head = Neckend.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.775F, -3.7935F, 0.369F, -0.3152F, 0.0382F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(13, 41).addBox(-2.0F, -0.0255F, -0.0187F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(0.01F, -1.8964F, -0.3852F, -0.7679F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(30, 29).addBox(-2.0F, 0.0249F, 0.0858F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.04F)), PartPose.offsetAndRotation(0.01F, -2.6964F, -3.3852F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(0, 30).mirror().addBox(0.44F, -0.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 30).addBox(1.88F, -0.4F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.65F, 0.0327F, -12.2519F, 0.2269F, 0.0F, 0.0F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(22, 20).mirror().addBox(-0.64F, -1.2F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(46, 0).mirror().addBox(-0.86F, -1.2F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(11, 45).mirror().addBox(-1.08F, -1.2F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false)
				.texOffs(11, 45).addBox(2.12F, -1.2F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(46, 0).addBox(1.9F, -1.2F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(22, 20).addBox(2.68F, -1.2F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.51F, -1.2447F, -3.7831F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(26, 2).mirror().addBox(-0.3F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false)
				.texOffs(26, 2).addBox(2.62F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-1.65F, -1.2378F, -1.2652F, -0.2967F, 0.0F, 0.0F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(0, 39).addBox(-2.0F, 0.1F, -0.7F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(0.01F, -2.4964F, -4.5852F, 0.2269F, 0.0F, 0.0F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(41, 40).addBox(-2.0F, -0.0388F, 0.9873F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.01F, -1.2964F, -1.9852F, -0.2269F, 0.0F, 0.0F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(23, 42).addBox(-1.0F, -0.9958F, 0.0438F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.01F, 0.3022F, -2.4844F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(0, 5).addBox(-1.0F, 0.7F, -1.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.01F, -0.9978F, -1.3844F, -0.7941F, 0.0F, 0.0F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(33, 9).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.01F, 0.5036F, -4.5852F, 0.2967F, 0.0F, 0.0F));

		PartDefinition Lowerjawback = Head.addOrReplaceChild("Lowerjawback", CubeListBuilder.create().texOffs(31, 46).addBox(1.01F, 0.0585F, -3.9823F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F))
				.texOffs(31, 46).mirror().addBox(-1.99F, 0.0585F, -3.9823F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5536F, -0.0352F, 0.2923F, 0.0F, 0.0F));

		PartDefinition Lowerjawback_r1 = Lowerjawback.addOrReplaceChild("Lowerjawback_r1", CubeListBuilder.create().texOffs(57, 8).mirror().addBox(-2.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(57, 8).addBox(1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 1.7585F, -1.4823F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Lowerjawback_r2 = Lowerjawback.addOrReplaceChild("Lowerjawback_r2", CubeListBuilder.create().texOffs(46, 12).mirror().addBox(-2.0F, -0.0301F, 0.0586F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(46, 12).addBox(1.0F, -0.0301F, 0.0586F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.01F, -0.7415F, -2.4823F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Lowerjawback_r3 = Lowerjawback.addOrReplaceChild("Lowerjawback_r3", CubeListBuilder.create().texOffs(56, 31).mirror().addBox(-2.0F, -0.0301F, -1.9414F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(56, 31).addBox(1.0F, -0.0301F, -1.9414F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -0.7415F, -2.4823F, 0.3665F, 0.0F, 0.0F));

		PartDefinition Lowerjawback_r4 = Lowerjawback.addOrReplaceChild("Lowerjawback_r4", CubeListBuilder.create().texOffs(17, 47).mirror().addBox(-2.0F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(17, 47).addBox(1.0F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.01F, 1.7585F, -1.4823F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddle = Lowerjawback.addOrReplaceChild("Lowerjawmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2085F, -3.9823F, 0.1911F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddle_r1 = Lowerjawmiddle.addOrReplaceChild("Lowerjawmiddle_r1", CubeListBuilder.create().texOffs(0, 49).addBox(-0.985F, -0.9454F, -1.5561F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, 1.0622F, -2.6654F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddle_r2 = Lowerjawmiddle.addOrReplaceChild("Lowerjawmiddle_r2", CubeListBuilder.create().texOffs(48, 22).mirror().addBox(-1.515F, -0.3792F, -0.7288F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(48, 22).addBox(0.485F, -0.3792F, -0.7288F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.025F, 0.5622F, -1.8654F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront = Lowerjawmiddle.addOrReplaceChild("Lowerjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -4.0F, -0.2335F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r1 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r1", CubeListBuilder.create().texOffs(40, 0).mirror().addBox(-0.81F, -1.4174F, -3.8746F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.02F, -1.0F, -0.55F, -0.0087F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r2 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r2", CubeListBuilder.create().texOffs(40, 0).addBox(0.81F, -1.4174F, -3.8746F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(25, 35).addBox(-0.99F, -1.0174F, -3.8746F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.0F, -0.55F, -0.0087F, 0.0F, 0.0F));

		PartDefinition Lowerjawslope = Lowerjawback.addOrReplaceChild("Lowerjawslope", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.3415F, -2.7323F, 0.3768F, 0.0F, 0.0F));

		PartDefinition Lowerjawslope_r1 = Lowerjawslope.addOrReplaceChild("Lowerjawslope_r1", CubeListBuilder.create().texOffs(47, 17).mirror().addBox(-1.515F, -0.0424F, -2.943F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(47, 17).addBox(0.485F, -0.0424F, -2.943F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.035F, -0.2945F, -1.5131F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Lowerjawslope_r2 = Lowerjawslope.addOrReplaceChild("Lowerjawslope_r2", CubeListBuilder.create().texOffs(12, 0).mirror().addBox(0.0F, -0.4F, -1.2F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.15F, -0.1553F, -3.0544F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Lowerjawslope_r3 = Lowerjawslope.addOrReplaceChild("Lowerjawslope_r3", CubeListBuilder.create().texOffs(12, 0).addBox(0.0F, -0.4F, -1.2F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.19F, -0.1553F, -3.0544F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Jawparting = Lowerjawback.addOrReplaceChild("Jawparting", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2585F, -2.7323F, -0.3183F, 0.0F, 0.0F));

		PartDefinition Upperjawback = Head.addOrReplaceChild("Upperjawback", CubeListBuilder.create().texOffs(61, 60).addBox(0.77F, -0.075F, -4.35F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 60).mirror().addBox(-0.75F, -0.075F, -4.35F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4036F, -4.0852F, -0.0119F, 0.0F, 0.0F));

		PartDefinition Upperjawback_r1 = Upperjawback.addOrReplaceChild("Upperjawback_r1", CubeListBuilder.create().texOffs(42, 27).addBox(-1.5F, -2.0379F, -1.9466F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(55, 0).addBox(-1.0F, -2.0379F, -2.9466F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.01F, 0.4725F, -1.4852F, -0.0087F, 0.0F, 0.0F));

		PartDefinition Upperjawmiddle = Upperjawback.addOrReplaceChild("Upperjawmiddle", CubeListBuilder.create().texOffs(11, 63).addBox(0.77F, -1.6F, -2.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 0).addBox(0.77F, -2.1F, -3.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 0).mirror().addBox(-0.75F, -2.1F, -3.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(11, 63).mirror().addBox(-0.75F, -1.6F, -2.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0F, -4.0F, -0.1143F, 0.0F, 0.0F));

		PartDefinition Upperjawmiddle_r1 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r1", CubeListBuilder.create().texOffs(0, 44).addBox(-1.0F, -0.9737F, 0.0085F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.01F, -1.6323F, -3.3905F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Nosebridge = Upperjawmiddle.addOrReplaceChild("Nosebridge", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.975F, 0.15F, 0.5526F, 0.0F, 0.0F));

		PartDefinition Nosebridge_r1 = Nosebridge.addOrReplaceChild("Nosebridge_r1", CubeListBuilder.create().texOffs(10, 21).addBox(-0.99F, -0.9F, -0.65F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 30).addBox(-0.99F, -1.8F, -3.65F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, -1.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Upperjawfront = Upperjawmiddle.addOrReplaceChild("Upperjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -2.0F, -4.05F, 0.7383F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r1 = Upperjawfront.addOrReplaceChild("Upperjawfront_r1", CubeListBuilder.create().texOffs(14, 63).mirror().addBox(-0.75F, -1.05F, 0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(14, 63).addBox(0.79F, -1.05F, 0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 41).addBox(-0.98F, -1.3F, 0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Forehead = Head.addOrReplaceChild("Forehead", CubeListBuilder.create().texOffs(12, 35).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.02F))
				.texOffs(61, 57).addBox(1.25F, 2.5F, -2.75F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 57).mirror().addBox(-1.25F, 2.5F, -2.75F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.01F, -2.3464F, -4.5852F, 0.2311F, 0.0F, 0.0F));

		PartDefinition Forehead_r1 = Forehead.addOrReplaceChild("Forehead_r1", CubeListBuilder.create().texOffs(61, 54).mirror().addBox(0.0F, -0.7F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(61, 54).addBox(2.5F, -0.7F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, 3.0F, -0.55F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Forehead_r2 = Forehead.addOrReplaceChild("Forehead_r2", CubeListBuilder.create().texOffs(51, 5).addBox(-1.5F, -1.1123F, -1.3848F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 2.8971F, -0.2081F, 0.0698F, 0.0F, 0.0F));

		PartDefinition bone = Head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.53F, -1.2447F, -3.7831F, -0.3491F, 0.0F, 0.0F));

		PartDefinition sailbaseneck = Neckbase.addOrReplaceChild("sailbaseneck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8424F, -6.5624F, 0.4098F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create().texOffs(10, 30).addBox(-0.4F, 3.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 57).addBox(0.1F, -0.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 5.8274F, -7.392F, 1.1114F, 0.4803F, -0.1728F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create().texOffs(17, 52).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(51, 51).addBox(0.2F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.4F, 0.4F, -0.8084F, -0.0597F, 0.4918F));

		PartDefinition Rightfrontfoot = Rightlowerarm.addOrReplaceChild("Rightfrontfoot", CubeListBuilder.create().texOffs(13, 29).addBox(-1.7F, 0.0F, -3.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4F, -0.5F, -0.3226F, -0.1928F, 0.0821F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create().texOffs(26, 29).addBox(-1.6F, 3.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 54).addBox(-1.1F, -0.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 5.8274F, -7.392F, -0.4408F, -0.3815F, 0.4399F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create().texOffs(51, 44).addBox(0.0F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(34, 51).addBox(-1.2F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.4F, 0.4F, -0.8501F, -0.0223F, -0.3897F));

		PartDefinition Leftfrontfoot = Leftlowerarm.addOrReplaceChild("Leftfrontfoot", CubeListBuilder.create().texOffs(27, 3).addBox(-2.3F, 0.0F, -3.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4F, -0.5F, 1.1475F, 0.1191F, 0.0755F));

		PartDefinition sailbasebodyfront = Bodyfront.addOrReplaceChild("sailbasebodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.6726F, -8.192F, 0.0456F, 0.0F, 0.0F));

		PartDefinition sailbasebodymiddle = Bodymiddle.addOrReplaceChild("sailbasebodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.9834F, 1.2422F, -0.0456F, 0.0F, 0.0F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(12, 18).addBox(-0.5F, -0.491F, -0.031F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3303F, 3.2494F, -0.1399F, 0.2161F, -0.0302F));

		PartDefinition Bodyfront_r86 = Tailbase.addOrReplaceChild("Bodyfront_r86", CubeListBuilder.create().texOffs(61, 20).addBox(0.0F, -1.0462F, 4.0804F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 29).addBox(0.0F, -1.0462F, 2.0804F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 18).addBox(0.0F, -1.2462F, 0.0804F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4684F, 1.8836F, -0.0393F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r87 = Tailbase.addOrReplaceChild("Bodyfront_r87", CubeListBuilder.create().texOffs(61, 39).addBox(0.0F, 1.0F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 42).addBox(0.0F, 0.2F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 35).addBox(0.0F, -1.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2676F, 1.3955F, 0.528F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r88 = Tailbase.addOrReplaceChild("Bodyfront_r88", CubeListBuilder.create().texOffs(3, 61).addBox(0.0F, -1.592F, -0.1258F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5966F, 0.1376F, -0.0829F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create().texOffs(0, 21).addBox(-0.5F, -0.4093F, -0.1053F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.091F, 6.469F, 0.0099F, 0.0921F, -0.0513F));

		PartDefinition Tailmiddlebase_r1 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.6F, 3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 0).addBox(0.0F, -0.6F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 44).addBox(0.0F, -0.6F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5093F, 0.9947F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r89 = Tailmiddlebase.addOrReplaceChild("Bodyfront_r89", CubeListBuilder.create().texOffs(23, 47).addBox(0.0F, 4.1F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 44).addBox(0.0F, 3.1F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 17).addBox(0.0F, 2.0F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3493F, -5.1789F, 0.528F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = Tailmiddlebase.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(0, 11).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0907F, 6.7947F, -0.0467F, 0.2609F, 0.0218F));

		PartDefinition Tailmiddleend_r1 = Tailmiddleend.addOrReplaceChild("Tailmiddleend_r1", CubeListBuilder.create().texOffs(45, 7).addBox(0.0F, -0.5F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 24).addBox(0.0F, -0.5F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 17).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 0.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(24, 12).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, 0.0714F, 0.5661F, 0.0383F));

		PartDefinition sailbasetail = Tailbase.addOrReplaceChild("sailbasetail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.109F, 0.369F, -0.182F, 0.0F, 0.0F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create().texOffs(56, 40).addBox(0.0F, -0.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.7303F, -0.4506F, -0.9657F, -0.3976F, -0.2828F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create().texOffs(29, 51).addBox(-1.2111F, -0.2402F, -0.254F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 50).addBox(-1.2111F, -0.2402F, 1.046F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1F, 4.0F, 0.0F, 1.2579F, -0.1274F, 0.0848F));

		PartDefinition Righthindfoot = Rightshin.addOrReplaceChild("Righthindfoot", CubeListBuilder.create().texOffs(12, 0).addBox(-2.0F, 0.0F, -4.5F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5111F, 4.6598F, 1.346F, 0.0F, 0.0F, 0.0213F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create().texOffs(56, 19).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 1.7303F, -0.4506F, -0.3549F, 0.3976F, 0.2828F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create().texOffs(46, 49).addBox(0.2111F, -0.2402F, -0.254F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 21).addBox(0.2111F, -0.2402F, 1.046F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.1F, 4.0F, 0.0F, 1.6942F, 0.1274F, -0.0848F));

		PartDefinition Lefthindfoot = Leftshin.addOrReplaceChild("Lefthindfoot", CubeListBuilder.create().texOffs(11, 11).addBox(-2.0F, 0.0F, -4.5F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5111F, 4.6598F, 1.346F, -0.6545F, 0.0F, -0.0213F));

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