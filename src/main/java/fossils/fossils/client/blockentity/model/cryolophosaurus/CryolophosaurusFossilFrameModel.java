package fossils.fossils.client.blockentity.model.cryolophosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CryolophosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart LegL;
	private final ModelPart TibiaL;
	private final ModelPart MetatarsalL;
	private final ModelPart FootL;
	private final ModelPart FootL2;
	private final ModelPart LegL2;
	private final ModelPart TibiaL2;
	private final ModelPart MetatarsalL2;
	private final ModelPart FootL3;
	private final ModelPart FootL4;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart ArmL;
	private final ModelPart ElbowL;
	private final ModelPart HandL;
	private final ModelPart ArmL2;
	private final ModelPart ElbowL2;
	private final ModelPart HandL2;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart immobile;
	private final ModelPart immobile2;
	private final ModelPart immobile3;
	private final ModelPart immobile4;
	private final ModelPart immobile5;
	private final ModelPart immobile6;
	private final ModelPart immobile7;
	private final ModelPart immobile8;
	private final ModelPart immobile9;
	private final ModelPart immobile10;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone5;
	private final ModelPart immobile14;
	private final ModelPart immobile15;
	private final ModelPart bone4;
	private final ModelPart bone6;
	private final ModelPart bone7;
	private final ModelPart immobile13;
	private final ModelPart jaw;
	private final ModelPart immobile11;
	private final ModelPart immobile12;
	private final ModelPart throatPouch3;
	private final ModelPart throatPouch;
	private final ModelPart throatPouch2;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;

	public CryolophosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.LegL = this.hips.getChild("LegL");
		this.TibiaL = this.LegL.getChild("TibiaL");
		this.MetatarsalL = this.TibiaL.getChild("MetatarsalL");
		this.FootL = this.MetatarsalL.getChild("FootL");
		this.FootL2 = this.FootL.getChild("FootL2");
		this.LegL2 = this.hips.getChild("LegL2");
		this.TibiaL2 = this.LegL2.getChild("TibiaL2");
		this.MetatarsalL2 = this.TibiaL2.getChild("MetatarsalL2");
		this.FootL3 = this.MetatarsalL2.getChild("FootL3");
		this.FootL4 = this.FootL3.getChild("FootL4");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.ArmL = this.chest.getChild("ArmL");
		this.ElbowL = this.ArmL.getChild("ElbowL");
		this.HandL = this.ElbowL.getChild("HandL");
		this.ArmL2 = this.chest.getChild("ArmL2");
		this.ElbowL2 = this.ArmL2.getChild("ElbowL2");
		this.HandL2 = this.ElbowL2.getChild("HandL2");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.immobile = this.head.getChild("immobile");
		this.immobile2 = this.immobile.getChild("immobile2");
		this.immobile3 = this.immobile2.getChild("immobile3");
		this.immobile4 = this.immobile2.getChild("immobile4");
		this.immobile5 = this.immobile4.getChild("immobile5");
		this.immobile6 = this.immobile5.getChild("immobile6");
		this.immobile7 = this.immobile6.getChild("immobile7");
		this.immobile8 = this.immobile7.getChild("immobile8");
		this.immobile9 = this.immobile8.getChild("immobile9");
		this.immobile10 = this.immobile9.getChild("immobile10");
		this.bone2 = this.immobile10.getChild("bone2");
		this.bone3 = this.immobile10.getChild("bone3");
		this.bone5 = this.immobile10.getChild("bone5");
		this.immobile14 = this.immobile8.getChild("immobile14");
		this.immobile15 = this.immobile14.getChild("immobile15");
		this.bone4 = this.immobile15.getChild("bone4");
		this.bone6 = this.immobile15.getChild("bone6");
		this.bone7 = this.immobile15.getChild("bone7");
		this.immobile13 = this.immobile8.getChild("immobile13");
		this.jaw = this.head.getChild("jaw");
		this.immobile11 = this.jaw.getChild("immobile11");
		this.immobile12 = this.immobile11.getChild("immobile12");
		this.throatPouch3 = this.jaw.getChild("throatPouch3");
		this.throatPouch = this.neck3.getChild("throatPouch");
		this.throatPouch2 = this.throatPouch.getChild("throatPouch2");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -28.0F, 5.0F, 1.0F, 28.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -6.5F, -0.5F, 1.0F, 29.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(3.4F, -22.5F, -18.2F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-0.9F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.4F, -22.5F, -18.2F, -0.2618F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-4.5F, -2.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -22.5F, 5.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -0.25F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -28.2671F, 2.7389F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(39, 42).addBox(1.0F, -0.3F, 2.8F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F))
				.texOffs(43, 68).addBox(1.0F, -0.3F, -0.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.5F, -0.2867F, -2.6255F, -0.0436F, 0.0F, 0.0F));

		PartDefinition LegL = hips.addOrReplaceChild("LegL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2F, 1.2798F, 2.9044F, -0.3054F, 0.0F, 0.0F));

		PartDefinition TibiaL = LegL.addOrReplaceChild("TibiaL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 11.2248F, -4.5723F, 0.4363F, 0.0F, 0.0F));

		PartDefinition MetatarsalL = TibiaL.addOrReplaceChild("MetatarsalL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.0872F, 4.892F, -0.8727F, 0.0F, 0.0F));

		PartDefinition FootL = MetatarsalL.addOrReplaceChild("FootL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 5.885F, -1.393F, 1.6144F, 0.0F, 0.0F));

		PartDefinition FootL2 = FootL.addOrReplaceChild("FootL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.0F, -2.3F, 0.6545F, 0.0F, 0.0F));

		PartDefinition LegL2 = hips.addOrReplaceChild("LegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2F, 1.2798F, 2.9044F, 0.5236F, 0.0F, 0.0F));

		PartDefinition TibiaL2 = LegL2.addOrReplaceChild("TibiaL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 11.2248F, -4.5723F, 0.1309F, 0.0F, 0.0F));

		PartDefinition MetatarsalL2 = TibiaL2.addOrReplaceChild("MetatarsalL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.0872F, 4.892F, -0.2182F, 0.0F, 0.0F));

		PartDefinition FootL3 = MetatarsalL2.addOrReplaceChild("FootL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 5.885F, -1.393F, 0.48F, 0.0F, 0.0F));

		PartDefinition FootL4 = FootL3.addOrReplaceChild("FootL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.0F, -2.3F, -0.7854F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(31, 30).addBox(-0.5F, 0.3418F, -10.9879F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.9867F, -3.2255F, 0.0792F, -0.1305F, -0.0103F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1418F, -10.788F, 0.22F, -0.1278F, -0.0285F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(59, 38).addBox(-1.0F, -0.2364F, -0.3378F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.2183F, -5.7115F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(32, 66).addBox(-1.0F, -0.1734F, 0.0394F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.5457F, -9.7788F, 0.0873F, 0.0F, 0.0F));

		PartDefinition ArmL = chest.addOrReplaceChild("ArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9076F, 5.9061F, -9.0738F, 0.1255F, 0.2282F, -0.0705F));

		PartDefinition ElbowL = ArmL.addOrReplaceChild("ElbowL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4202F, 4.3634F, 3.849F, -0.6628F, 0.0269F, 0.0344F));

		PartDefinition HandL = ElbowL.addOrReplaceChild("HandL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1461F, 4.6839F, -1.5493F, -0.1757F, 0.1908F, 0.2917F));

		PartDefinition ArmL2 = chest.addOrReplaceChild("ArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9076F, 5.9061F, -9.0738F, 0.2564F, -0.2282F, 0.0705F));

		PartDefinition ElbowL2 = ArmL2.addOrReplaceChild("ElbowL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4202F, 4.3634F, 3.849F, -0.1833F, 0.0F, 0.0F));

		PartDefinition HandL2 = ElbowL2.addOrReplaceChild("HandL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1461F, 4.6839F, -1.5493F, -0.1757F, -0.1908F, -0.2917F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0941F, -9.6057F, -0.4544F, -0.3309F, 0.0201F));

		PartDefinition cube_r7 = neck.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(59, 12).addBox(-2.5F, -0.5F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.0F, 0.9922F, -5.0045F, 0.0785F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2929F, -4.4351F, -0.5433F, -0.1825F, 0.1202F));

		PartDefinition cube_r8 = neck2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(60, 6).addBox(-1.5F, 0.4048F, -0.0742F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 1.0F, -4.9536F, 0.2269F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -4.8536F, 0.6524F, -0.0556F, -0.0792F));

		PartDefinition cube_r9 = neck3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(60, 64).addBox(-1.0F, 0.0F, 0.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -1.6609F, -4.279F, -0.4363F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(0, 79).addBox(-0.5902F, 0.1657F, -2.8787F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0902F, -1.4266F, -3.4003F, 0.0621F, -0.3915F, -0.1368F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0902F, -0.2281F, -3.6178F, 0.0865F, 0.0114F, -0.1304F));

		PartDefinition immobile = head.addOrReplaceChild("immobile", CubeListBuilder.create(), PartPose.offset(0.0F, 2.7954F, -4.0521F));

		PartDefinition immobile2 = immobile.addOrReplaceChild("immobile2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition immobile3 = immobile2.addOrReplaceChild("immobile3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition immobile4 = immobile2.addOrReplaceChild("immobile4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.25F, -3.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition immobile5 = immobile4.addOrReplaceChild("immobile5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -1.25F, 0.829F, 0.0F, 0.0F));

		PartDefinition immobile6 = immobile5.addOrReplaceChild("immobile6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.4669F, 0.0F, 0.0F));

		PartDefinition immobile7 = immobile6.addOrReplaceChild("immobile7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition immobile8 = immobile7.addOrReplaceChild("immobile8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.1658F, 0.0F, 0.0F));

		PartDefinition immobile9 = immobile8.addOrReplaceChild("immobile9", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.0443F, 0.1744F, 0.0077F));

		PartDefinition immobile10 = immobile9.addOrReplaceChild("immobile10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0701F, 0.9163F, 2.6024F, 0.4816F, -0.0756F, -0.0437F));

		PartDefinition bone2 = immobile10.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3318F, -0.5786F, 0.6773F, 0.049F, -0.5472F, 0.3005F));

		PartDefinition bone3 = immobile10.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7972F, -0.7754F, 0.7191F, 0.2146F, -0.3337F, -0.0688F));

		PartDefinition bone5 = immobile10.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2943F, -0.8173F, 0.6853F, 0.2628F, -0.1907F, -0.2185F));

		PartDefinition immobile14 = immobile8.addOrReplaceChild("immobile14", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0443F, -0.1744F, -0.0077F));

		PartDefinition immobile15 = immobile14.addOrReplaceChild("immobile15", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0701F, 0.9163F, 2.6024F, 0.4816F, 0.0756F, 0.0437F));

		PartDefinition bone4 = immobile15.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3318F, -0.5786F, 0.6773F, 0.049F, 0.5472F, -0.3005F));

		PartDefinition bone6 = immobile15.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7972F, -0.7754F, 0.7191F, 0.2146F, 0.3337F, 0.0688F));

		PartDefinition bone7 = immobile15.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2943F, -0.8173F, 0.6853F, 0.2628F, 0.1907F, 0.2185F));

		PartDefinition immobile13 = immobile8.addOrReplaceChild("immobile13", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0443F, -0.1744F, -0.0077F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.3486F, 0.1924F, 0.5061F, 0.0F, 0.0F));

		PartDefinition immobile11 = jaw.addOrReplaceChild("immobile11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -2.7F, 0.2182F, 0.0F, 0.0F));

		PartDefinition immobile12 = immobile11.addOrReplaceChild("immobile12", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.0F));

		PartDefinition throatPouch3 = jaw.addOrReplaceChild("throatPouch3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9F, -1.7F, -0.3054F, 0.0F, 0.0F));

		PartDefinition throatPouch = neck3.addOrReplaceChild("throatPouch", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.8391F, -2.279F, 0.4363F, 0.0F, 0.0F));

		PartDefinition throatPouch2 = throatPouch.addOrReplaceChild("throatPouch2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.0F, -2.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3717F, 8.3345F, -0.0788F, 0.087F, -0.0069F));

		PartDefinition cube_r10 = tail.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 42).addBox(-0.5F, -0.1591F, 0.3264F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4142F, 0.1512F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(21, 43).addBox(-0.5F, 0.3099F, 0.3111F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4791F, 8.5888F, 0.1715F, 0.2581F, 0.0442F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(31, 0).addBox(-0.5F, 0.2994F, -0.4183F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.15F))
				.texOffs(43, 12).addBox(-0.5F, 0.2994F, 12.2817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0443F, 8.2764F, 0.0532F, 0.1743F, 0.0092F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, 0.2F, -0.1F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1496F, 12.8904F, 0.0928F, -0.3477F, -0.0317F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.3255F, 0.2114F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1497F, 13.3131F, -0.0632F, -0.2613F, 0.0164F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(31, 15).addBox(-0.5F, 0.2747F, -0.2823F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0762F, 13.894F, -0.3193F, -0.2909F, 0.0945F));

		return LayerDefinition.create(meshdefinition, 112, 112);
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