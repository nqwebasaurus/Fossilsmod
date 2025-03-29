package fossils.fossils.client.blockentity.model.cryolophosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CryolophosaurusFossilModel extends SkullModelBase {
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

	public CryolophosaurusFossilModel(ModelPart root) {
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -0.25F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -28.2671F, 2.7389F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(56, 38).addBox(1.5F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.8932F, 6.4095F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(27, 38).addBox(1.5F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.9804F, 4.4114F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(39, 108).addBox(1.5F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.0677F, 2.4133F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(24, 102).mirror().addBox(-0.2858F, 2.9708F, 0.1638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(13, 102).mirror().addBox(-0.2858F, 2.9708F, 0.7638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3677F, 5.2422F, 7.0461F, -0.0521F, -0.0372F, -0.0628F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(88, 36).mirror().addBox(-0.2858F, 3.2192F, -0.9413F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(16, 77).mirror().addBox(-0.2858F, -0.2808F, -0.5413F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.3677F, 5.2422F, 7.0461F, 0.5064F, -0.0372F, -0.0628F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(86, 61).mirror().addBox(-0.2858F, 1.4372F, 0.1948F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.24F)).mirror(false), PartPose.offsetAndRotation(-0.3677F, 5.2422F, 7.0461F, -0.0608F, -0.0372F, -0.0628F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(41, 101).mirror().addBox(-0.2858F, 1.7918F, 1.2016F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.23F)).mirror(false), PartPose.offsetAndRotation(-0.3677F, 5.2422F, 7.0461F, 0.1137F, -0.0372F, -0.0628F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(98, 8).mirror().addBox(-0.2858F, 0.1307F, -0.7252F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.23F)).mirror(false), PartPose.offsetAndRotation(-0.3677F, 5.2422F, 7.0461F, 0.8467F, -0.0372F, -0.0628F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(81, 101).mirror().addBox(-0.5F, -0.9F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.6285F, 4.0881F, 7.2317F, 0.2442F, 0.1201F, -0.4438F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(62, 101).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.0567F, 3.5634F, 5.8933F, 1.1169F, 0.1201F, -0.4438F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(95, 96).mirror().addBox(-0.4112F, -0.7458F, -0.5511F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.24F)).mirror(false), PartPose.offsetAndRotation(-0.3677F, 5.2422F, 7.0461F, 0.3422F, 0.0603F, -0.0765F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(51, 105).mirror().addBox(-2.3F, -1.0347F, 0.0168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(51, 105).addBox(1.3F, -1.0347F, 0.0168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2051F, -1.3507F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(39, 105).mirror().addBox(-2.3F, -1.0347F, 0.0168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(39, 105).addBox(1.3F, -1.0347F, 0.0168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -0.7826F, -1.5072F, -1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(34, 105).mirror().addBox(-2.3F, -0.6347F, 0.0168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(34, 105).addBox(1.3F, -0.6347F, 0.0168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.0798F, -1.2395F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(102, 0).mirror().addBox(-2.3F, -0.0503F, -0.0203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(102, 0).addBox(1.3F, -0.0503F, -0.0203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -2.6495F, -0.3359F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(65, 86).mirror().addBox(-2.3F, 0.0217F, -0.0427F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(65, 86).addBox(1.3F, 0.0217F, -0.0427F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.8423F, 6.9617F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(96, 25).mirror().addBox(-2.2021F, -1.0056F, -0.3959F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.9171F, -0.7389F, -0.5892F, 0.0554F, -0.4682F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 102).mirror().addBox(-0.2901F, 2.5953F, -2.5879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(67, 102).mirror().addBox(-0.2901F, 3.7953F, -2.1879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 6.6171F, -2.1389F, 0.3561F, -0.0798F, -0.0252F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(44, 106).mirror().addBox(-0.2901F, 4.037F, 0.1793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(7, 95).mirror().addBox(-0.2901F, 3.537F, 0.1793F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 6.6171F, -2.1389F, -0.377F, -0.0798F, -0.0252F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(99, 51).mirror().addBox(-0.3385F, 2.8523F, -0.3571F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 6.6171F, -2.1389F, -0.3806F, -0.0277F, -0.043F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(93, 92).mirror().addBox(-0.3385F, 4.162F, -1.8293F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(48, 99).mirror().addBox(-0.3385F, 2.062F, -1.3293F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 6.6171F, -2.1389F, -0.049F, -0.0277F, -0.043F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(84, 5).mirror().addBox(-3.1336F, -0.8224F, -2.7805F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3171F, 2.561F, 1.7219F, 0.067F, -0.4541F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(26, 97).mirror().addBox(-0.5F, -1.0F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.6884F, 2.5223F, 4.8694F, 0.4362F, 0.1201F, -0.4438F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(83, 84).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0254F, 3.7601F, 5.6573F, 0.6573F, 0.067F, -0.4541F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(61, 95).mirror().addBox(-0.3385F, -0.285F, -0.6595F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 6.6171F, -2.1389F, -0.3282F, -0.0277F, -0.043F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(100, 97).mirror().addBox(-1.3713F, -0.507F, -0.5914F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.1F, 5.2171F, -1.6389F, -0.4155F, -0.0277F, -0.1651F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(21, 96).mirror().addBox(-2.2021F, -1.0056F, -0.7959F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.9171F, -0.7389F, -0.4321F, 0.0554F, -0.4682F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(40, 74).mirror().addBox(-0.5F, -0.7F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(40, 74).addBox(3.1F, -0.7F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.8F, 2.5787F, 1.5481F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 71).mirror().addBox(-2.3F, -0.6499F, 0.5381F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 71).addBox(1.3F, -0.6499F, 0.5381F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0171F, 1.361F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(9, 76).mirror().addBox(-2.3F, -1.1931F, -0.0841F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(9, 76).addBox(1.3F, -1.1931F, -0.0841F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0171F, 1.361F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(58, 86).mirror().addBox(-2.3F, -1.1347F, -1.1832F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(58, 86).addBox(1.3F, -1.1347F, -1.1832F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.7829F, 0.3611F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(30, 89).mirror().addBox(-2.3F, -1.313F, -1.5246F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(30, 89).addBox(1.3F, -1.313F, -1.5246F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -0.7829F, 0.3611F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(53, 102).mirror().addBox(-2.3F, -1.9503F, -0.4203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(53, 102).addBox(1.3F, -1.9503F, -0.4203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.7829F, 0.3611F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(19, 53).mirror().addBox(-2.3F, -1.013F, 0.1754F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(19, 53).addBox(1.3F, -1.013F, 0.1754F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.9829F, 1.6611F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(73, 11).mirror().addBox(-2.3F, -1.9606F, -1.485F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(73, 11).addBox(1.3F, -1.9606F, -1.485F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9829F, 1.6611F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-2.3F, 0.0217F, -0.0427F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(0, 64).addBox(1.3F, 0.0217F, -0.0427F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -3.1213F, 2.9714F, -0.0698F, 0.0F, 0.0F));

		PartDefinition basin_r1 = hips.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-1.5F, -0.8784F, -1.0019F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 53).addBox(0.5F, -0.8784F, -1.0019F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0171F, 1.361F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(100, 95).mirror().addBox(-2.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9557F, -1.0123F, -0.0029F, -0.0407F, -0.9729F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(85, 108).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9557F, -1.0123F, -0.016F, -0.0375F, -0.6411F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(80, 108).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0556F, -3.0123F, 0.0819F, 0.0356F, -0.6412F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(100, 86).mirror().addBox(-2.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0556F, -3.0123F, 0.0659F, 0.0603F, -0.9723F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(108, 10).mirror().addBox(-3.532F, -1.5399F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0556F, -3.0123F, 0.0342F, 0.0825F, -1.4092F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(85, 108).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9557F, -1.0123F, -0.016F, 0.0375F, 0.6411F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(100, 95).addBox(0.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9557F, -1.0123F, -0.0029F, 0.0407F, 0.9729F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(80, 108).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0556F, -3.0123F, 0.0819F, -0.0356F, 0.6412F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(100, 86).addBox(0.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0556F, -3.0123F, 0.0659F, -0.0603F, 0.9723F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(108, 10).addBox(2.532F, -1.5399F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0556F, -3.0123F, 0.0342F, -0.0825F, 1.4092F));

		PartDefinition cube_r47 = hips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(45, 109).addBox(1.5F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.1549F, 0.4152F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r48 = hips.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(96, 25).addBox(1.2021F, -1.0056F, -0.3959F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.9171F, -0.7389F, -0.5892F, -0.0554F, 0.4682F));

		PartDefinition cube_r49 = hips.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(21, 96).addBox(1.2021F, -1.0056F, -0.7959F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.9171F, -0.7389F, -0.4321F, -0.0554F, 0.4682F));

		PartDefinition cube_r50 = hips.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(100, 97).addBox(0.3712F, -0.507F, -0.5914F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.1F, 5.2171F, -1.6389F, -0.4155F, 0.0277F, 0.1651F));

		PartDefinition cube_r51 = hips.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(61, 95).addBox(-0.6615F, -0.285F, -0.6595F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, 6.6171F, -2.1389F, -0.3282F, 0.0277F, 0.043F));

		PartDefinition cube_r52 = hips.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(99, 51).addBox(-0.6615F, 2.8523F, -0.3571F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.7F, 6.6171F, -2.1389F, -0.3806F, 0.0277F, 0.043F));

		PartDefinition cube_r53 = hips.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 102).addBox(-0.7099F, 2.5953F, -2.5879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(67, 102).addBox(-0.7099F, 3.7953F, -2.1879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.7F, 6.6171F, -2.1389F, 0.3561F, 0.0798F, 0.0252F));

		PartDefinition cube_r54 = hips.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(44, 106).addBox(-0.7099F, 4.037F, 0.1793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(7, 95).addBox(-0.7099F, 3.537F, 0.1793F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.7F, 6.6171F, -2.1389F, -0.377F, 0.0798F, 0.0252F));

		PartDefinition cube_r55 = hips.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(93, 92).addBox(-0.6615F, 4.162F, -1.8293F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F))
				.texOffs(48, 99).addBox(-0.6615F, 2.062F, -1.3293F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.7F, 6.6171F, -2.1389F, -0.049F, 0.0277F, 0.043F));

		PartDefinition cube_r56 = hips.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(83, 84).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0254F, 3.7601F, 5.6573F, 0.6573F, -0.067F, 0.4541F));

		PartDefinition cube_r57 = hips.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(81, 101).addBox(-0.5F, -0.9F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.6285F, 4.0881F, 7.2317F, 0.2442F, -0.1201F, 0.4438F));

		PartDefinition cube_r58 = hips.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(62, 101).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.0567F, 3.5634F, 5.8933F, 1.1169F, -0.1201F, 0.4438F));

		PartDefinition cube_r59 = hips.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(26, 97).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.6884F, 2.5223F, 4.8694F, 0.4362F, -0.1201F, 0.4438F));

		PartDefinition cube_r60 = hips.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(84, 5).addBox(2.1336F, -0.8224F, -2.7805F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, 0.3171F, 2.561F, 1.7219F, -0.067F, 0.4541F));

		PartDefinition cube_r61 = hips.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(16, 77).addBox(-0.7142F, -0.2808F, -0.5413F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(88, 36).addBox(-0.7142F, 3.2192F, -0.9413F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3677F, 5.2422F, 7.0461F, 0.5064F, 0.0372F, 0.0628F));

		PartDefinition cube_r62 = hips.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(98, 8).addBox(-0.7142F, 0.1307F, -0.7252F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.23F)), PartPose.offsetAndRotation(0.3677F, 5.2422F, 7.0461F, 0.8467F, 0.0372F, 0.0628F));

		PartDefinition cube_r63 = hips.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(41, 101).addBox(-0.7142F, 1.7918F, 1.2016F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.23F)), PartPose.offsetAndRotation(0.3677F, 5.2422F, 7.0461F, 0.1137F, 0.0372F, 0.0628F));

		PartDefinition cube_r64 = hips.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(95, 96).addBox(-0.5889F, -0.7458F, -0.5511F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(0.3677F, 5.2422F, 7.0461F, 0.3422F, -0.0603F, 0.0765F));

		PartDefinition cube_r65 = hips.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(86, 61).addBox(-0.7142F, 1.4372F, 0.1948F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(0.3677F, 5.2422F, 7.0461F, -0.0608F, 0.0372F, 0.0628F));

		PartDefinition cube_r66 = hips.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(24, 102).addBox(-0.7142F, 2.9708F, 0.1638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(13, 102).addBox(-0.7142F, 2.9708F, 0.7638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3677F, 5.2422F, 7.0461F, -0.0521F, 0.0372F, 0.0628F));

		PartDefinition cube_r67 = hips.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(40, 43).addBox(1.0F, -1.0F, 3.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(43, 68).addBox(1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.2867F, -2.6255F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r68 = hips.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(107, 34).addBox(-0.5F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3294F, -3.581F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r69 = hips.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(42, 109).addBox(-0.5F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2422F, -1.5829F, -0.1134F, 0.0F, 0.0F));

		PartDefinition LegL = hips.addOrReplaceChild("LegL", CubeListBuilder.create().texOffs(83, 52).addBox(-0.5F, 9.6263F, -5.1013F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.2F, 1.2798F, 2.9044F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Femur_r1 = LegL.addOrReplaceChild("Femur_r1", CubeListBuilder.create().texOffs(95, 0).addBox(-1.0F, -0.9034F, -0.2421F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 9.5263F, -4.3513F, -1.021F, 0.0F, 0.0F));

		PartDefinition Femur_r2 = LegL.addOrReplaceChild("Femur_r2", CubeListBuilder.create().texOffs(99, 64).addBox(-0.5F, -2.0F, 0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(99, 72).addBox(-0.5F, -2.0F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.3483F, -4.3637F, -0.4276F, 0.0F, 0.0F));

		PartDefinition Femur_r3 = LegL.addOrReplaceChild("Femur_r3", CubeListBuilder.create().texOffs(21, 90).addBox(-0.5F, -3.1F, -0.35F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 30).addBox(-0.5F, -3.1F, -0.75F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 9.5263F, -4.3513F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Femur_r4 = LegL.addOrReplaceChild("Femur_r4", CubeListBuilder.create().texOffs(95, 84).addBox(0.5F, 0.0014F, 0.4126F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(75, 95).addBox(0.5F, 0.0014F, 0.0126F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, 2.4331F, -2.3195F, -0.5323F, 0.0F, 0.0F));

		PartDefinition Femur_r5 = LegL.addOrReplaceChild("Femur_r5", CubeListBuilder.create().texOffs(75, 26).addBox(0.5F, -0.3831F, -1.2341F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 4.7092F, -1.1F, -0.9948F, 0.0F, 0.0F));

		PartDefinition Femur_r6 = LegL.addOrReplaceChild("Femur_r6", CubeListBuilder.create().texOffs(96, 101).addBox(0.5F, -0.1872F, -0.7632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.5F, 3.7546F, -0.8141F, -0.6632F, 0.0F, 0.0F));

		PartDefinition Femur_r7 = LegL.addOrReplaceChild("Femur_r7", CubeListBuilder.create().texOffs(5, 99).addBox(0.5F, -0.1871F, -0.7632F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 2.2092F, -0.4F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Femur_r8 = LegL.addOrReplaceChild("Femur_r8", CubeListBuilder.create().texOffs(58, 76).addBox(-0.5F, -1.3562F, -0.9007F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6092F, -0.3F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Femur_r9 = LegL.addOrReplaceChild("Femur_r9", CubeListBuilder.create().texOffs(49, 94).addBox(0.5F, -0.3562F, 0.0993F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(99, 43).addBox(0.5F, 0.6438F, -0.6007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6092F, -0.3F, -0.6109F, 0.0F, 0.0F));

		PartDefinition TibiaL = LegL.addOrReplaceChild("TibiaL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 11.2248F, -4.5723F, 0.4363F, 0.0F, 0.0F));

		PartDefinition TibioFibula_r1 = TibiaL.addOrReplaceChild("TibioFibula_r1", CubeListBuilder.create().texOffs(11, 64).addBox(0.7F, -4.6F, -0.2F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 4.8737F, 2.2087F, 0.3927F, 0.0F, 0.0F));

		PartDefinition TibioFibula_r2 = TibiaL.addOrReplaceChild("TibioFibula_r2", CubeListBuilder.create().texOffs(21, 71).addBox(-1.0F, 2.2746F, 5.2868F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 81).addBox(-1.2F, 1.0746F, 4.7868F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8993F, -5.3764F, 0.3927F, 0.0F, 0.0F));

		PartDefinition MetatarsalL = TibiaL.addOrReplaceChild("MetatarsalL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.0872F, 4.892F, -0.8727F, 0.0F, 0.0F));

		PartDefinition Metatarsal_r1 = MetatarsalL.addOrReplaceChild("Metatarsal_r1", CubeListBuilder.create().texOffs(73, 30).addBox(-1.0F, 0.0671F, 3.9526F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8559F, -4.6338F, -0.2182F, 0.0F, 0.0F));

		PartDefinition FootL = MetatarsalL.addOrReplaceChild("FootL", CubeListBuilder.create().texOffs(60, 20).addBox(-1.0F, -0.3583F, -2.3992F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 5.885F, -1.393F, 1.6144F, 0.0F, 0.0F));

		PartDefinition FootL2 = FootL.addOrReplaceChild("FootL2", CubeListBuilder.create().texOffs(59, 46).addBox(-1.5F, -0.4F, -3.9F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 0.0F, -2.3F, 0.6545F, 0.0F, 0.0F));

		PartDefinition LegL2 = hips.addOrReplaceChild("LegL2", CubeListBuilder.create().texOffs(83, 80).addBox(-1.5F, 9.6263F, -5.1013F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.2F, 1.2798F, 2.9044F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Femur_r10 = LegL2.addOrReplaceChild("Femur_r10", CubeListBuilder.create().texOffs(54, 95).addBox(-1.0F, -0.9034F, -0.2421F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 9.5263F, -4.3513F, -1.021F, 0.0F, 0.0F));

		PartDefinition Femur_r11 = LegL2.addOrReplaceChild("Femur_r11", CubeListBuilder.create().texOffs(99, 68).addBox(-0.5F, -2.0F, 0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(99, 76).addBox(-0.5F, -2.0F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 6.3483F, -4.3637F, -0.4276F, 0.0F, 0.0F));

		PartDefinition Femur_r12 = LegL2.addOrReplaceChild("Femur_r12", CubeListBuilder.create().texOffs(91, 3).addBox(-0.5F, -3.1F, -0.35F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 90).addBox(-0.5F, -3.1F, -0.75F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, 9.5263F, -4.3513F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Femur_r13 = LegL2.addOrReplaceChild("Femur_r13", CubeListBuilder.create().texOffs(96, 3).addBox(-1.5F, 0.0014F, 0.4126F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(80, 95).addBox(-1.5F, 0.0014F, 0.0126F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 2.4331F, -2.3195F, -0.5323F, 0.0F, 0.0F));

		PartDefinition Femur_r14 = LegL2.addOrReplaceChild("Femur_r14", CubeListBuilder.create().texOffs(54, 98).addBox(-1.5F, -0.3831F, -1.2341F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 4.7092F, -1.1F, -0.9948F, 0.0F, 0.0F));

		PartDefinition Femur_r15 = LegL2.addOrReplaceChild("Femur_r15", CubeListBuilder.create().texOffs(101, 101).addBox(-1.5F, -0.1872F, -0.7632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.5F, 3.7546F, -0.8141F, -0.6632F, 0.0F, 0.0F));

		PartDefinition Femur_r16 = LegL2.addOrReplaceChild("Femur_r16", CubeListBuilder.create().texOffs(99, 39).addBox(-1.5F, -0.1871F, -0.7632F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 2.2092F, -0.4F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Femur_r17 = LegL2.addOrReplaceChild("Femur_r17", CubeListBuilder.create().texOffs(67, 76).addBox(-1.5F, -1.3562F, -0.9007F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6092F, -0.3F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Femur_r18 = LegL2.addOrReplaceChild("Femur_r18", CubeListBuilder.create().texOffs(95, 34).addBox(-1.5F, -0.3562F, 0.0993F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(99, 47).addBox(-1.5F, 0.6438F, -0.6007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6092F, -0.3F, -0.6109F, 0.0F, 0.0F));

		PartDefinition TibiaL2 = LegL2.addOrReplaceChild("TibiaL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 11.2248F, -4.5723F, 0.1309F, 0.0F, 0.0F));

		PartDefinition TibioFibula_r3 = TibiaL2.addOrReplaceChild("TibioFibula_r3", CubeListBuilder.create().texOffs(16, 65).addBox(-1.7F, -4.6F, -0.2F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 4.8737F, 2.2087F, 0.3927F, 0.0F, 0.0F));

		PartDefinition TibioFibula_r4 = TibiaL2.addOrReplaceChild("TibioFibula_r4", CubeListBuilder.create().texOffs(26, 71).addBox(0.0F, 2.2746F, 5.2868F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 81).addBox(-0.8F, 1.0746F, 4.7868F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.8993F, -5.3764F, 0.3927F, 0.0F, 0.0F));

		PartDefinition MetatarsalL2 = TibiaL2.addOrReplaceChild("MetatarsalL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.0872F, 4.892F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Metatarsal_r2 = MetatarsalL2.addOrReplaceChild("Metatarsal_r2", CubeListBuilder.create().texOffs(74, 38).addBox(-1.0F, 0.0671F, 3.9526F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8559F, -4.6338F, -0.2182F, 0.0F, 0.0F));

		PartDefinition FootL3 = MetatarsalL2.addOrReplaceChild("FootL3", CubeListBuilder.create().texOffs(60, 25).addBox(-3.0F, -0.3583F, -2.3992F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 5.885F, -1.393F, 0.48F, 0.0F, 0.0F));

		PartDefinition FootL4 = FootL3.addOrReplaceChild("FootL4", CubeListBuilder.create().texOffs(60, 0).addBox(-2.5F, -0.4F, -3.9F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -2.3F, -0.7854F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(31, 30).addBox(-0.5F, -0.3582F, -10.788F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.003F))
				.texOffs(90, 108).addBox(0.0F, -2.2582F, -7.888F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 107).addBox(0.0F, -2.3582F, -5.888F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9867F, -3.2255F, 0.0792F, -0.1305F, -0.0103F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(55, 53).addBox(-3.5F, -3.0F, -0.6F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 11.2652F, -3.8894F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(0, 32).addBox(-3.5F, -2.0F, 0.1F, 6.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 10.77F, -10.9721F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(106, 105).addBox(-0.5F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3582F, -1.888F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(79, 87).addBox(-0.5F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3582F, -3.888F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(101, 107).addBox(0.0F, -1.8781F, 0.0039F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3051F, -9.8033F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(100, 34).mirror().addBox(-4.532F, -1.5399F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0689F, -1.3868F, 0.0314F, 0.0653F, -1.4094F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(100, 23).mirror().addBox(-2.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0689F, -1.3868F, 0.056F, 0.0459F, -0.9728F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(93, 64).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0689F, -1.3868F, 0.0679F, 0.0252F, -0.6416F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(92, 82).mirror().addBox(-5.532F, -1.5399F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0689F, -3.2868F, 0.037F, 0.0997F, -1.4089F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(100, 21).mirror().addBox(-2.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0689F, -3.2868F, 0.0757F, 0.0747F, -0.9716F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(86, 66).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0689F, -3.2868F, 0.0959F, 0.046F, -0.6406F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(81, 43).mirror().addBox(-6.532F, -1.5399F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0689F, -5.2868F, 0.0484F, 0.1686F, -1.4074F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(99, 80).mirror().addBox(-2.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0689F, -5.2868F, 0.1154F, 0.1323F, -0.9675F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(86, 3).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0689F, -5.2868F, 0.1521F, 0.0877F, -0.6369F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(71, 68).mirror().addBox(-7.532F, -1.5399F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0689F, -7.2868F, 0.0572F, 0.2203F, -1.4057F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(95, 89).mirror().addBox(-2.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0689F, -7.2868F, 0.1456F, 0.1754F, -0.9629F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(49, 74).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0689F, -7.2868F, 0.1945F, 0.1187F, -0.6325F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(71, 64).mirror().addBox(-8.532F, -1.5399F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0689F, -9.2868F, 0.0631F, 0.2547F, -1.4043F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(85, 78).mirror().addBox(-2.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0689F, -9.2868F, 0.166F, 0.204F, -0.959F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(54, 68).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0689F, -9.2868F, 0.2229F, 0.1393F, -0.6288F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(93, 64).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0689F, -1.3868F, 0.0679F, -0.0252F, 0.6416F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(100, 23).addBox(0.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0689F, -1.3868F, 0.056F, -0.0459F, 0.9728F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(100, 34).addBox(2.532F, -1.5399F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0689F, -1.3868F, 0.0314F, -0.0653F, 1.4094F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(86, 66).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0689F, -3.2868F, 0.0959F, -0.046F, 0.6406F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(100, 21).addBox(0.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0689F, -3.2868F, 0.0757F, -0.0747F, 0.9716F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(92, 82).addBox(2.532F, -1.5399F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0689F, -3.2868F, 0.037F, -0.0997F, 1.4089F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(86, 3).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0689F, -5.2868F, 0.1521F, -0.0877F, 0.6369F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(99, 80).addBox(0.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0689F, -5.2868F, 0.1154F, -0.1323F, 0.9675F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(81, 43).addBox(2.532F, -1.5399F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0689F, -5.2868F, 0.0484F, -0.1686F, 1.4074F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(49, 74).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0689F, -7.2868F, 0.1945F, -0.1187F, 0.6325F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(95, 89).addBox(0.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0689F, -7.2868F, 0.1456F, -0.1754F, 0.9629F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(71, 68).addBox(2.532F, -1.5399F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0689F, -7.2868F, 0.0572F, -0.2203F, 1.4057F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(54, 68).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0689F, -9.2868F, 0.2229F, -0.1393F, 0.6288F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(85, 78).addBox(0.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0689F, -9.2868F, 0.166F, -0.204F, 0.959F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(71, 64).addBox(2.532F, -1.5399F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0689F, -9.2868F, 0.0631F, -0.2547F, 1.4043F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1418F, -10.788F, 0.22F, -0.1278F, -0.0285F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(36, 53).addBox(-3.0F, -2.0384F, -4.0462F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 10.4766F, -2.2413F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Scapulo_coracoid_r1 = chest.addOrReplaceChild("Scapulo_coracoid_r1", CubeListBuilder.create().texOffs(89, 26).mirror().addBox(-0.5F, -1.3F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(89, 26).addBox(4.9F, -1.3F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-2.7F, 3.7338F, -8.642F, 2.5569F, 0.0F, 0.0F));

		PartDefinition Scapulo_coracoid_r2 = chest.addOrReplaceChild("Scapulo_coracoid_r2", CubeListBuilder.create().texOffs(88, 88).mirror().addBox(-0.5F, 0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(88, 88).addBox(4.9F, 0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-2.7F, 3.5048F, -9.8199F, 1.3788F, 0.0F, 0.0F));

		PartDefinition Scapulo_coracoid_r3 = chest.addOrReplaceChild("Scapulo_coracoid_r3", CubeListBuilder.create().texOffs(88, 84).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(88, 84).addBox(4.9F, -1.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-2.7F, 4.5818F, -10.1199F, 0.192F, 0.0F, 0.0F));

		PartDefinition Scapulo_coracoid_r4 = chest.addOrReplaceChild("Scapulo_coracoid_r4", CubeListBuilder.create().texOffs(29, 105).mirror().addBox(-0.7755F, -0.0166F, 0.0345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(29, 105).addBox(4.6245F, -0.0166F, 0.0345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.4245F, -0.3091F, -4.0413F, -1.4312F, 0.0F, 0.0F));

		PartDefinition Scapulo_coracoid_r5 = chest.addOrReplaceChild("Scapulo_coracoid_r5", CubeListBuilder.create().texOffs(93, 60).mirror().addBox(-0.7755F, -0.0166F, 0.0345F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(93, 60).addBox(4.6245F, -0.0166F, 0.0345F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.4245F, -1.369F, -5.7374F, -0.5585F, 0.0F, 0.0F));

		PartDefinition Scapulo_coracoid_r6 = chest.addOrReplaceChild("Scapulo_coracoid_r6", CubeListBuilder.create().texOffs(24, 105).mirror().addBox(-0.7755F, -0.0166F, 0.0345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(24, 105).addBox(4.6245F, -0.0166F, 0.0345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.4245F, -1.2126F, -6.7251F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Scapulo_coracoid_r7 = chest.addOrReplaceChild("Scapulo_coracoid_r7", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0609F, 7.5435F, -7.6855F, -0.4348F, -0.854F, 0.4955F));

		PartDefinition Scapulo_coracoid_r8 = chest.addOrReplaceChild("Scapulo_coracoid_r8", CubeListBuilder.create().texOffs(56, 30).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9091F, 7.5824F, -8.1305F, -0.3731F, -0.2096F, 0.5626F));

		PartDefinition Scapulo_coracoid_r9 = chest.addOrReplaceChild("Scapulo_coracoid_r9", CubeListBuilder.create().texOffs(77, 0).mirror().addBox(-0.5F, -0.3F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(77, 0).addBox(1.5F, -0.3F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 6.499F, -8.9815F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Scapulo_coracoid_r10 = chest.addOrReplaceChild("Scapulo_coracoid_r10", CubeListBuilder.create().texOffs(36, 60).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9851F, 7.5676F, -7.8329F, -0.5338F, -0.2963F, 0.581F));

		PartDefinition Scapulo_coracoid_r11 = chest.addOrReplaceChild("Scapulo_coracoid_r11", CubeListBuilder.create().texOffs(30, 84).mirror().addBox(1.3812F, -1.9248F, -2.0382F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4245F, 3.139F, -8.2463F, 1.2342F, 0.5921F, 0.7014F));

		PartDefinition Scapulo_coracoid_r12 = chest.addOrReplaceChild("Scapulo_coracoid_r12", CubeListBuilder.create().texOffs(82, 11).mirror().addBox(-0.7755F, -1.0078F, -0.8096F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(82, 11).addBox(4.6245F, -1.0078F, -0.8096F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-2.4245F, 3.139F, -8.2463F, 0.8727F, 0.0F, 0.0F));

		PartDefinition Scapulo_coracoid_r13 = chest.addOrReplaceChild("Scapulo_coracoid_r13", CubeListBuilder.create().texOffs(49, 82).mirror().addBox(-0.7755F, -0.7078F, -0.8096F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(49, 82).addBox(4.6245F, -0.7078F, -0.8096F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4245F, 3.139F, -8.2463F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Scapulo_coracoid_r14 = chest.addOrReplaceChild("Scapulo_coracoid_r14", CubeListBuilder.create().texOffs(76, 70).mirror().addBox(-0.7755F, -1.2873F, 1.4347F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(76, 70).addBox(4.6245F, -1.2873F, 1.4347F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-2.4245F, 3.139F, -8.2463F, 0.4887F, 0.0F, 0.0F));

		PartDefinition Scapulo_coracoid_r15 = chest.addOrReplaceChild("Scapulo_coracoid_r15", CubeListBuilder.create().texOffs(16, 83).mirror().addBox(-0.7755F, -0.3166F, 1.6345F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(16, 83).addBox(4.6245F, -0.3166F, 1.6345F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.4245F, 3.139F, -8.2463F, 1.1694F, 0.0F, 0.0F));

		PartDefinition Scapulo_coracoid_r16 = chest.addOrReplaceChild("Scapulo_coracoid_r16", CubeListBuilder.create().texOffs(76, 75).mirror().addBox(-0.7755F, -1.0967F, 1.6237F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(76, 75).addBox(4.6245F, -1.0967F, 1.6237F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.4245F, 3.139F, -8.2463F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(107, 94).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1107F, -8.4988F, 0.2947F, 0.1902F, -0.617F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(71, 66).mirror().addBox(-8.532F, -1.5399F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1107F, -8.4988F, 0.0784F, 0.3407F, -1.3998F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(100, 84).mirror().addBox(-2.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1107F, -8.4988F, 0.218F, 0.2751F, -0.9467F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(17, 63).mirror().addBox(-9.532F, -1.5399F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2107F, -6.4988F, 0.0691F, 0.2891F, -1.4027F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(74, 100).mirror().addBox(-2.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2107F, -6.4988F, 0.1866F, 0.2325F, -0.9546F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(107, 61).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2107F, -6.4988F, 0.2515F, 0.1598F, -0.6246F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(60, 62).mirror().addBox(-9.532F, -1.5399F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2107F, -4.4988F, 0.0601F, 0.2375F, -1.405F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(85, 50).mirror().addBox(-2.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2107F, -4.4988F, 0.1558F, 0.1897F, -0.961F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(43, 66).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2107F, -4.4988F, 0.2087F, 0.129F, -0.6307F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-9.532F, -1.5399F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1107F, -2.4988F, 0.0484F, 0.1686F, -1.4074F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(100, 61).mirror().addBox(-2.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1107F, -2.4988F, 0.1154F, 0.1323F, -0.9675F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(107, 0).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1107F, -2.4988F, 0.1521F, 0.0877F, -0.6369F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(60, 60).mirror().addBox(-9.532F, -1.5399F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1107F, -0.4988F, -0.1366F, 0.1262F, -1.4285F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(100, 36).mirror().addBox(-2.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1107F, -0.4988F, -0.0703F, 0.172F, -0.9896F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(101, 82).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1107F, -0.4988F, -0.0099F, 0.1855F, -0.6529F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(100, 84).addBox(0.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1107F, -8.4988F, 0.218F, -0.2751F, 0.9467F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(71, 66).addBox(2.532F, -1.5399F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1107F, -8.4988F, 0.0784F, -0.3407F, 1.3998F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(107, 94).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1107F, -8.4988F, 0.2947F, -0.1902F, 0.617F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(107, 61).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2107F, -6.4988F, 0.2515F, -0.1598F, 0.6246F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(74, 100).addBox(0.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2107F, -6.4988F, 0.1866F, -0.2325F, 0.9546F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(17, 63).addBox(2.532F, -1.5399F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2107F, -6.4988F, 0.0691F, -0.2891F, 1.4027F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(43, 66).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2107F, -4.4988F, 0.2087F, -0.129F, 0.6307F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(85, 50).addBox(0.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2107F, -4.4988F, 0.1558F, -0.1897F, 0.961F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(60, 62).addBox(2.532F, -1.5399F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2107F, -4.4988F, 0.0601F, -0.2375F, 1.405F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(107, 0).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1107F, -2.4988F, 0.1521F, -0.0877F, 0.6369F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(100, 61).addBox(0.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1107F, -2.4988F, 0.1154F, -0.1323F, 0.9675F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(0, 62).addBox(2.532F, -1.5399F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1107F, -2.4988F, 0.0484F, -0.1686F, 1.4074F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(101, 82).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1107F, -0.4988F, 0.122F, -0.0111F, 0.6399F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(100, 36).addBox(0.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1107F, -0.4988F, 0.1118F, -0.0501F, 0.9694F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(60, 60).addBox(2.532F, -1.5399F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1107F, -0.4988F, 0.0803F, -0.0926F, 1.4048F));

		PartDefinition Scapulo_coracoid_r17 = chest.addOrReplaceChild("Scapulo_coracoid_r17", CubeListBuilder.create().texOffs(30, 84).addBox(-3.3812F, -1.9248F, -2.0382F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4245F, 3.139F, -8.2463F, 1.2342F, -0.5921F, -0.7014F));

		PartDefinition Scapulo_coracoid_r18 = chest.addOrReplaceChild("Scapulo_coracoid_r18", CubeListBuilder.create().texOffs(36, 60).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9851F, 7.5676F, -7.8329F, -0.5338F, 0.2963F, -0.581F));

		PartDefinition Scapulo_coracoid_r19 = chest.addOrReplaceChild("Scapulo_coracoid_r19", CubeListBuilder.create().texOffs(56, 30).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9091F, 7.5824F, -8.1305F, -0.3731F, 0.2096F, -0.5626F));

		PartDefinition Scapulo_coracoid_r20 = chest.addOrReplaceChild("Scapulo_coracoid_r20", CubeListBuilder.create().texOffs(0, 84).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0609F, 7.5435F, -7.6855F, -0.4348F, 0.854F, -0.4955F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(59, 38).addBox(-1.0F, -0.9364F, -0.2379F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2183F, -5.7115F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(108, 6).addBox(0.0F, -1.7797F, -0.1185F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5307F, -4.9376F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(3, 109).addBox(0.0F, -1.8696F, -0.1814F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5437F, -2.8032F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(0, 108).addBox(0.0F, -1.8321F, -0.1235F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4608F, -0.905F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(109, 38).addBox(-0.5F, -1.7734F, -0.0606F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5214F, -6.7603F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(107, 21).addBox(-0.5F, -1.8734F, -0.0605F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3471F, -8.7527F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(32, 66).addBox(-1.0F, -0.8734F, 0.0394F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5457F, -9.7788F, 0.0873F, 0.0F, 0.0F));

		PartDefinition ArmL = chest.addOrReplaceChild("ArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9076F, 5.9061F, -9.0738F, 0.1255F, 0.2282F, -0.0705F));

		PartDefinition Humerus_r1 = ArmL.addOrReplaceChild("Humerus_r1", CubeListBuilder.create().texOffs(38, 96).addBox(-2.0F, -0.3F, -1.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4977F, 1.976F, 3.4583F, 0.6196F, 0.0F, 0.0F));

		PartDefinition Humerus_r2 = ArmL.addOrReplaceChild("Humerus_r2", CubeListBuilder.create().texOffs(43, 96).addBox(-0.5F, -0.1F, 0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0023F, -0.7508F, -0.5536F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Humerus_r3 = ArmL.addOrReplaceChild("Humerus_r3", CubeListBuilder.create().texOffs(33, 96).addBox(-2.0F, -1.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.4977F, 1.3068F, 0.9519F, 0.829F, 0.0F, 0.0F));

		PartDefinition ElbowL = ArmL.addOrReplaceChild("ElbowL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4202F, 4.3634F, 3.849F, -0.6628F, 0.0269F, 0.0344F));

		PartDefinition Radio_Ulna_r1 = ElbowL.addOrReplaceChild("Radio_Ulna_r1", CubeListBuilder.create().texOffs(44, 85).addBox(-1.0F, -2.8F, -0.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(25, 83).addBox(-1.0F, -3.0F, 1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 2.3257F, -1.2879F, -0.2618F, 0.0F, 0.0F));

		PartDefinition HandL = ElbowL.addOrReplaceChild("HandL", CubeListBuilder.create().texOffs(76, 80).addBox(-1.1F, -0.2F, -0.3F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1461F, 4.6839F, -1.5493F, -0.1757F, 0.1908F, 0.2917F));

		PartDefinition ArmL2 = chest.addOrReplaceChild("ArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9076F, 5.9061F, -9.0738F, 0.2564F, -0.2282F, 0.0705F));

		PartDefinition Humerus_r4 = ArmL2.addOrReplaceChild("Humerus_r4", CubeListBuilder.create().texOffs(90, 96).addBox(1.0F, -0.3F, -1.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4977F, 1.976F, 3.4583F, 0.6196F, 0.0F, 0.0F));

		PartDefinition Humerus_r5 = ArmL2.addOrReplaceChild("Humerus_r5", CubeListBuilder.create().texOffs(85, 96).addBox(-0.5F, -0.1F, 0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0023F, -0.7508F, -0.5536F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Humerus_r6 = ArmL2.addOrReplaceChild("Humerus_r6", CubeListBuilder.create().texOffs(66, 96).addBox(1.0F, -1.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.4977F, 1.3068F, 0.9519F, 0.829F, 0.0F, 0.0F));

		PartDefinition ElbowL2 = ArmL2.addOrReplaceChild("ElbowL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4202F, 4.3634F, 3.849F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Radio_Ulna_r2 = ElbowL2.addOrReplaceChild("Radio_Ulna_r2", CubeListBuilder.create().texOffs(49, 87).addBox(0.0F, -2.8F, -0.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(9, 84).addBox(0.0F, -3.0F, 1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 2.3257F, -1.2879F, -0.2618F, 0.0F, 0.0F));

		PartDefinition HandL2 = ElbowL2.addOrReplaceChild("HandL2", CubeListBuilder.create().texOffs(81, 36).addBox(0.1F, -0.2F, -0.3F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1461F, 4.6839F, -1.5493F, -0.1757F, -0.1908F, -0.2917F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0941F, -9.6057F, -0.4544F, -0.3309F, 0.0201F));

		PartDefinition cube_r143 = neck.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(49, 76).mirror().addBox(-0.2481F, -0.5212F, -0.0063F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2126F, 0.3401F, -0.8839F, -0.7469F, -0.4337F, 0.411F));

		PartDefinition cube_r144 = neck.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(74, 52).mirror().addBox(0.0759F, -0.0803F, 0.0816F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4469F, 0.0997F, -2.6295F, -0.5367F, -0.4239F, 0.3617F));

		PartDefinition cube_r145 = neck.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(14, 88).mirror().addBox(-0.2058F, -1.364F, -0.4273F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4244F, 1.3485F, -4.7234F, -0.3659F, -0.4696F, 0.1118F));

		PartDefinition cube_r146 = neck.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(49, 76).addBox(0.2481F, -0.5212F, -0.0063F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2126F, 0.3401F, -0.8839F, -0.7469F, 0.4337F, -0.411F));

		PartDefinition cube_r147 = neck.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(74, 52).addBox(-0.0759F, -0.0803F, 0.0816F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4469F, 0.0997F, -2.6295F, -0.5367F, 0.4239F, -0.3617F));

		PartDefinition cube_r148 = neck.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(14, 88).addBox(0.2058F, -1.364F, -0.4273F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4244F, 1.3485F, -4.7234F, -0.3659F, 0.4696F, -0.1118F));

		PartDefinition cube_r149 = neck.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(36, 108).addBox(-2.0F, -1.7F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.3248F, -0.0573F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r150 = neck.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(33, 108).addBox(-2.0F, -1.6F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.1067F, -5.0525F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r151 = neck.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(30, 108).addBox(-2.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.2066F, -5.0569F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r152 = neck.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(60, 13).addBox(-2.5F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0F, 0.2929F, -5.0351F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2929F, -4.4351F, -0.5433F, -0.1825F, 0.1202F));

		PartDefinition cube_r153 = neck2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(27, 108).addBox(-1.0F, -1.6952F, -0.9742F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1227F, -1.1535F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r154 = neck2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(24, 108).addBox(-1.0F, -1.6952F, 0.0258F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7975F, -4.0767F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r155 = neck2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(60, 6).addBox(-1.5F, -0.2952F, -0.0742F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0F, -4.9536F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r156 = neck2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(72, 87).mirror().addBox(0.0693F, -0.5379F, -0.2284F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6054F, 0.773F, -1.5881F, -0.0201F, -0.4669F, 0.0438F));

		PartDefinition cube_r157 = neck2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(0, 88).mirror().addBox(0.0036F, -0.5312F, -0.0085F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5126F, 1.3445F, -3.8697F, -0.0816F, -0.2498F, 0.0206F));

		PartDefinition cube_r158 = neck2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(72, 87).addBox(-0.0693F, -0.5379F, -0.2284F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6054F, 0.773F, -1.5881F, -0.0201F, 0.4669F, -0.0438F));

		PartDefinition cube_r159 = neck2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(0, 88).addBox(-0.0036F, -0.5312F, -0.0085F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5126F, 1.3445F, -3.8697F, -0.0816F, 0.2498F, -0.0206F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -4.8536F, 0.6524F, -0.0556F, -0.0792F));

		PartDefinition cube_r160 = neck3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(100, 91).mirror().addBox(0.0439F, -1.272F, 0.2545F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5609F, -3.479F, -0.7931F, -0.1231F, 0.124F));

		PartDefinition cube_r161 = neck3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(100, 13).mirror().addBox(-0.0337F, -1.5002F, -0.0738F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8587F, -1.3471F, -0.6916F, -0.2858F, 0.272F));

		PartDefinition cube_r162 = neck3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(86, 101).mirror().addBox(-0.1676F, -0.6039F, 0.055F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3263F, -1.2573F, -4.1753F, -0.6534F, -0.1231F, 0.124F));

		PartDefinition cube_r163 = neck3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(100, 13).addBox(0.0337F, -1.5002F, -0.0738F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8587F, -1.3471F, -0.6916F, 0.2858F, -0.272F));

		PartDefinition cube_r164 = neck3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(100, 91).addBox(-0.0439F, -1.272F, 0.2545F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5609F, -3.479F, -0.7931F, 0.1231F, -0.124F));

		PartDefinition cube_r165 = neck3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(86, 101).addBox(0.1676F, -0.6039F, 0.055F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3263F, -1.2573F, -4.1753F, -0.6534F, 0.1231F, -0.124F));

		PartDefinition cube_r166 = neck3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(108, 16).addBox(-0.5F, -2.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0972F, -0.9256F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r167 = neck3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(54, 87).addBox(-0.5F, -2.2F, 1.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 64).addBox(-1.0F, -0.7F, 0.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -1.6609F, -4.279F, -0.4363F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(0, 79).addBox(-0.5902F, -0.5343F, -2.8787F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0902F, -1.4266F, -3.4003F, 0.0621F, -0.3915F, -0.1368F));

		PartDefinition cube_r168 = neck4.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(91, 101).mirror().addBox(-0.403F, -0.4168F, 0.054F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1803F, 0.0F, -2.5F, -0.2869F, -0.1231F, 0.124F));

		PartDefinition cube_r169 = neck4.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(91, 101).addBox(0.403F, -0.4168F, 0.054F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, -0.2869F, 0.1231F, -0.124F));

		PartDefinition cube_r170 = neck4.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(6, 109).addBox(-0.5F, -1.9F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4098F, -0.2343F, -0.7787F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r171 = neck4.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(10, 108).addBox(-0.5F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4098F, -0.2343F, -2.8787F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r172 = neck4.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(92, 40).addBox(-1.0F, -0.3F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4098F, -0.2343F, -2.8787F, 0.3491F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create().texOffs(21, 65).addBox(-1.5F, -1.2046F, -4.0521F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(62, 105).addBox(0.521F, -0.7046F, -3.7521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F))
				.texOffs(103, 7).addBox(0.76F, -0.7046F, -3.7521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(103, 7).mirror().addBox(-1.76F, -0.7046F, -3.7521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(62, 105).mirror().addBox(-1.521F, -0.7046F, -3.7521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(-0.0902F, -0.2281F, -3.6178F, 0.0865F, 0.0114F, -0.1304F));

		PartDefinition cube_r173 = head.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(106, 31).addBox(-0.5F, -0.6F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2344F, -1.7015F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r174 = head.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(101, 25).mirror().addBox(-1.02F, -2.1F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(14, 97).mirror().addBox(-1.02F, -3.1F, 0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(0, 97).mirror().addBox(-1.02F, -2.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(101, 25).addBox(1.42F, -2.1F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(14, 97).addBox(1.42F, -3.1F, 0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(0, 97).addBox(1.42F, -2.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.7F, 1.9954F, -3.2521F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r175 = head.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(105, 97).mirror().addBox(-1.02F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)).mirror(false)
				.texOffs(105, 97).addBox(1.42F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(-0.7F, -0.7319F, -1.4572F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r176 = head.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(106, 3).mirror().addBox(-1.02F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(106, 3).addBox(1.42F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7F, -0.3964F, -0.9597F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r177 = head.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(101, 3).mirror().addBox(-1.02F, -0.5F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.207F)).mirror(false)
				.texOffs(101, 3).addBox(1.42F, -0.5F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(-0.7F, 0.1832F, -1.115F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r178 = head.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(19, 101).mirror().addBox(-1.02F, -1.7F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(19, 101).addBox(1.42F, -1.7F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7F, 1.4593F, -0.867F, 1.4573F, 0.0F, 0.0F));

		PartDefinition cube_r179 = head.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(105, 91).mirror().addBox(-1.02F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(105, 91).addBox(1.42F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.7F, 0.3675F, -2.4777F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r180 = head.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(90, 105).mirror().addBox(-1.02F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(90, 105).addBox(1.42F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.7F, -1.0172F, -2.8244F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r181 = head.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(80, 105).mirror().addBox(-1.02F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(80, 105).addBox(1.42F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.7F, -0.7795F, -3.9928F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r182 = head.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(85, 105).mirror().addBox(-1.02F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(85, 105).addBox(1.42F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7F, -0.9649F, -3.4221F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r183 = head.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(92, 78).mirror().addBox(-1.02F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(86, 92).mirror().addBox(-1.02F, -1.3F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(86, 92).addBox(1.42F, -1.3F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F))
				.texOffs(92, 78).addBox(1.42F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7F, 0.3178F, -4.0695F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r184 = head.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(67, 105).mirror().addBox(-1.02F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(72, 105).mirror().addBox(-1.02F, -1.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(72, 105).addBox(1.42F, -1.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(67, 105).addBox(1.42F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7F, 1.3674F, -3.4877F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r185 = head.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(94, 30).mirror().addBox(-0.02F, -0.3F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 2.2076F, -10.7241F, 0.5952F, -0.0723F, -0.0489F));

		PartDefinition cube_r186 = head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(106, 25).mirror().addBox(-0.46F, -0.3502F, -0.9741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(40, 80).mirror().addBox(-0.46F, 0.5498F, -1.9741F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(14, 93).mirror().addBox(-0.46F, -0.0502F, -1.2741F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-0.82F, 0.9714F, -5.924F, -0.0848F, -0.1046F, -0.1049F));

		PartDefinition cube_r187 = head.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(0, 93).mirror().addBox(-0.46F, -1.2515F, -1.8137F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.82F, 0.9714F, -5.924F, 0.8926F, -0.1046F, -0.1049F));

		PartDefinition cube_r188 = head.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(31, 101).mirror().addBox(-0.46F, -1.6339F, -0.4309F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(36, 101).mirror().addBox(-0.46F, -1.6339F, -0.1309F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.82F, 0.9714F, -5.924F, -2.249F, -0.1046F, -0.1049F));

		PartDefinition cube_r189 = head.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(101, 29).mirror().addBox(-0.46F, -1.7313F, 0.0727F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.82F, 0.9714F, -5.924F, -0.1895F, -0.1046F, -0.1049F));

		PartDefinition cube_r190 = head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(5, 106).mirror().addBox(-0.46F, -1.9219F, -0.5761F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.82F, 0.9714F, -5.924F, -0.9226F, -0.1046F, -0.1049F));

		PartDefinition cube_r191 = head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(93, 13).mirror().addBox(-0.46F, -1.5572F, -1.2831F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.82F, 0.9714F, -5.924F, -1.7254F, -0.1046F, -0.1049F));

		PartDefinition cube_r192 = head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(86, 16).mirror().addBox(-0.46F, -1.1767F, -0.5896F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.82F, 0.9714F, -5.924F, 0.526F, -0.1046F, -0.1049F));

		PartDefinition cube_r193 = head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(103, 10).mirror().addBox(-2.0F, 0.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(103, 10).addBox(0.0F, 0.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 22).addBox(-2.0F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -1.2046F, -2.0521F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r194 = head.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(100, 17).mirror().addBox(-2.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(100, 17).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3319F, -0.3526F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r195 = head.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(54, 70).addBox(-1.0F, -3.0F, 0.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 2.5908F, -2.0548F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r196 = head.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(75, 18).addBox(-1.0F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, 2.5908F, -2.0548F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r197 = head.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(36, 101).addBox(-0.54F, -1.6339F, -0.1309F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(31, 101).addBox(-0.54F, -1.6339F, -0.4309F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.82F, 0.9714F, -5.924F, -2.249F, 0.1046F, 0.1049F));

		PartDefinition cube_r198 = head.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(93, 13).addBox(-0.54F, -1.5572F, -1.2831F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.82F, 0.9714F, -5.924F, -1.7254F, 0.1046F, 0.1049F));

		PartDefinition cube_r199 = head.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(5, 106).addBox(-0.54F, -1.9219F, -0.5761F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.82F, 0.9714F, -5.924F, -0.9226F, 0.1046F, 0.1049F));

		PartDefinition cube_r200 = head.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(101, 29).addBox(-0.54F, -1.7313F, 0.0727F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.82F, 0.9714F, -5.924F, -0.1895F, 0.1046F, 0.1049F));

		PartDefinition cube_r201 = head.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(86, 16).addBox(-0.54F, -1.1767F, -0.5896F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.82F, 0.9714F, -5.924F, 0.526F, 0.1046F, 0.1049F));

		PartDefinition cube_r202 = head.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(0, 93).addBox(-0.54F, -1.2515F, -1.8137F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.82F, 0.9714F, -5.924F, 0.8926F, 0.1046F, 0.1049F));

		PartDefinition cube_r203 = head.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(106, 25).addBox(-0.54F, -0.3502F, -0.9741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(14, 93).addBox(-0.54F, -0.0502F, -1.2741F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F))
				.texOffs(40, 80).addBox(-0.54F, 0.5498F, -1.9741F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.82F, 0.9714F, -5.924F, -0.0848F, 0.1046F, 0.1049F));

		PartDefinition cube_r204 = head.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(94, 30).addBox(-0.98F, -0.3F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.7F, 2.2076F, -10.7241F, 0.5952F, 0.0723F, 0.0489F));

		PartDefinition immobile = head.addOrReplaceChild("immobile", CubeListBuilder.create(), PartPose.offset(0.0F, 2.7954F, -4.0521F));

		PartDefinition cube_r205 = immobile.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(92, 52).mirror().addBox(-0.1F, -1.3623F, -3.3523F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.2618F, -0.1047F, 0.0F));

		PartDefinition cube_r206 = immobile.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(79, 91).mirror().addBox(-0.1F, -1.0F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0F, -0.1047F, 0.0F));

		PartDefinition cube_r207 = immobile.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(79, 91).addBox(-0.9F, -1.0F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.0F, 0.1047F, 0.0F));

		PartDefinition cube_r208 = immobile.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(92, 52).addBox(-0.9F, -1.3623F, -3.3523F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.2618F, 0.1047F, 0.0F));

		PartDefinition immobile2 = immobile.addOrReplaceChild("immobile2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r209 = immobile2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(37, 85).mirror().addBox(0.0F, -1.1F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(92, 66).mirror().addBox(0.0F, -0.1F, -3.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -1.4F, 0.4F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r210 = immobile2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(46, 103).mirror().addBox(-0.1F, -0.7217F, -2.9805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.4F, -0.4F, -0.1745F, -0.0873F, 0.0F));

		PartDefinition cube_r211 = immobile2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(91, 9).mirror().addBox(-0.1F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.4F, -0.4F, -0.0349F, -0.0873F, 0.0F));

		PartDefinition cube_r212 = immobile2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(46, 103).addBox(-0.9F, -0.7217F, -2.9805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.4F, -0.4F, -0.1745F, 0.0873F, 0.0F));

		PartDefinition cube_r213 = immobile2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(91, 9).addBox(-0.9F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.4F, -0.4F, -0.0349F, 0.0873F, 0.0F));

		PartDefinition cube_r214 = immobile2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(92, 66).addBox(-1.0F, -0.1F, -3.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F))
				.texOffs(37, 85).addBox(-1.0F, -1.1F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.8F, -1.4F, 0.4F, 0.0F, 0.0873F, 0.0F));

		PartDefinition immobile3 = immobile2.addOrReplaceChild("immobile3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition immobile4 = immobile2.addOrReplaceChild("immobile4", CubeListBuilder.create().texOffs(42, 92).addBox(-0.5F, -0.5F, -1.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(93, 17).addBox(-0.5F, 0.3F, -2.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(86, 21).addBox(-0.3F, -0.4F, 0.35F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(86, 21).mirror().addBox(-0.7F, -0.4F, 0.35F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.25F, -3.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r215 = immobile4.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(103, 55).addBox(-1.0F, 0.0F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, -1.2431F, -0.9309F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r216 = immobile4.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(76, 46).mirror().addBox(0.0F, -1.8F, -0.15F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 1.4F, 2.2F, 0.1055F, -0.1215F, -0.0128F));

		PartDefinition cube_r217 = immobile4.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(76, 46).addBox(-1.0F, -1.8F, -0.15F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.7F, 1.4F, 2.2F, 0.1055F, 0.1215F, 0.0128F));

		PartDefinition immobile5 = immobile4.addOrReplaceChild("immobile5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -1.25F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r218 = immobile5.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(72, 102).addBox(-1.0F, 0.0F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.5F, 0.1314F, 0.4008F, -0.3491F, 0.0F, 0.0F));

		PartDefinition immobile6 = immobile5.addOrReplaceChild("immobile6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.4669F, 0.0F, 0.0F));

		PartDefinition cube_r219 = immobile6.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(85, 45).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.5F, 0.0F, 2.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition immobile7 = immobile6.addOrReplaceChild("immobile7", CubeListBuilder.create().texOffs(85, 68).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition immobile8 = immobile7.addOrReplaceChild("immobile8", CubeListBuilder.create().texOffs(31, 72).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(86, 0).addBox(-1.5F, 0.0F, 2.55F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r220 = immobile8.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(49, 60).mirror().addBox(0.2F, 0.0F, -3.05F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.6F, 2.6F, 0.0F, -0.1134F, -0.1396F));

		PartDefinition cube_r221 = immobile8.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(49, 60).addBox(-1.2F, 0.0F, -3.05F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.5F, 0.6F, 2.6F, 0.0F, 0.1134F, 0.1396F));

		PartDefinition immobile9 = immobile8.addOrReplaceChild("immobile9", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.0443F, 0.1744F, 0.0077F));

		PartDefinition cube_r222 = immobile9.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(92, 48).addBox(-0.8F, -0.3F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1055F, 0.5195F, -1.6132F, 0.3491F, -0.0436F, 0.0F));

		PartDefinition cube_r223 = immobile9.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(92, 44).addBox(-0.8F, -0.3F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0364F, 0.2968F, -0.0303F, 0.1396F, -0.0436F, 0.0F));

		PartDefinition cube_r224 = immobile9.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(73, 6).addBox(-1.5F, -0.5F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3419F, 0.4968F, 1.7549F, 0.0F, -0.0436F, 0.0F));

		PartDefinition immobile10 = immobile9.addOrReplaceChild("immobile10", CubeListBuilder.create().texOffs(5, 103).addBox(-1.2012F, -0.9832F, 0.0135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0701F, 0.9163F, 2.6024F, 0.4816F, -0.0756F, -0.0437F));

		PartDefinition bone2 = immobile10.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3318F, -0.5786F, 0.6773F, 0.049F, -0.5472F, 0.3005F));

		PartDefinition cube_r225 = bone2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(104, 41).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3043F, -0.7976F, 1.2556F, 1.4239F, 0.3132F, 0.7655F));

		PartDefinition cube_r226 = bone2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(104, 72).addBox(-0.9F, -0.8F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, 0.0F, 1.2F, 1.2582F, 0.2791F, 0.2112F));

		PartDefinition cube_r227 = bone2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(104, 38).addBox(-0.6F, -0.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.21F, -0.0048F, 0.9766F, 1.0314F, 0.4337F, 0.4598F));

		PartDefinition cube_r228 = bone2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(103, 58).addBox(-0.5F, -0.3611F, -0.0353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2449F, 0.0374F, 0.4788F, 0.7515F, 0.5068F, 0.4836F));

		PartDefinition cube_r229 = bone2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(92, 70).addBox(-0.5F, -0.4547F, -1.4829F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2449F, 0.0374F, 0.4788F, 0.3675F, 0.5068F, 0.4836F));

		PartDefinition bone3 = immobile10.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7972F, -0.7754F, 0.7191F, 0.2146F, -0.3337F, -0.0688F));

		PartDefinition cube_r230 = bone3.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(104, 75).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(104, 50).addBox(-0.3F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.3712F, -0.8753F, 1.2813F, 1.4278F, 0.392F, 0.7157F));

		PartDefinition cube_r231 = bone3.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(104, 47).addBox(-0.9F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, 0.0F, 1.2F, 1.2582F, 0.2791F, 0.2112F));

		PartDefinition cube_r232 = bone3.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(104, 44).addBox(-0.9F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4955F, 0.3595F, 0.7653F, 0.7172F, 0.2791F, 0.2112F));

		PartDefinition cube_r233 = bone3.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(68, 92).addBox(-0.6F, -0.4F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2253F, -0.0516F, 0.6313F, 0.0726F, 0.6342F, 0.2491F));

		PartDefinition bone5 = immobile10.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2943F, -0.8173F, 0.6853F, 0.2628F, -0.1907F, -0.2185F));

		PartDefinition cube_r234 = bone5.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(104, 69).addBox(-0.9F, -0.8F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(104, 66).addBox(-0.9F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, 0.0F, 1.2F, 1.2582F, 0.2791F, 0.2112F));

		PartDefinition cube_r235 = bone5.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(104, 63).addBox(-0.9F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4955F, 0.3595F, 0.7653F, 0.7172F, 0.2791F, 0.2112F));

		PartDefinition cube_r236 = bone5.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(92, 74).addBox(-0.5F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1195F, 0.2789F, 0.8755F, 0.019F, 0.2791F, 0.2112F));

		PartDefinition immobile14 = immobile8.addOrReplaceChild("immobile14", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0443F, -0.1744F, -0.0077F));

		PartDefinition cube_r237 = immobile14.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(92, 48).mirror().addBox(-0.2F, -0.3F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1055F, 0.5195F, -1.6132F, 0.3491F, 0.0436F, 0.0F));

		PartDefinition cube_r238 = immobile14.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(92, 44).mirror().addBox(-0.2F, -0.3F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0364F, 0.2968F, -0.0303F, 0.1396F, 0.0436F, 0.0F));

		PartDefinition cube_r239 = immobile14.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(73, 6).mirror().addBox(-0.5F, -0.5F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3419F, 0.4968F, 1.7549F, 0.0F, 0.0436F, 0.0F));

		PartDefinition immobile15 = immobile14.addOrReplaceChild("immobile15", CubeListBuilder.create().texOffs(5, 103).mirror().addBox(0.2012F, -0.9832F, 0.0135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0701F, 0.9163F, 2.6024F, 0.4816F, 0.0756F, 0.0437F));

		PartDefinition bone4 = immobile15.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3318F, -0.5786F, 0.6773F, 0.049F, 0.5472F, -0.3005F));

		PartDefinition cube_r240 = bone4.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(104, 41).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3043F, -0.7976F, 1.2556F, 1.4239F, -0.3132F, -0.7655F));

		PartDefinition cube_r241 = bone4.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(104, 72).mirror().addBox(-0.1F, -0.8F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.0F, 1.2F, 1.2582F, -0.2791F, -0.2112F));

		PartDefinition cube_r242 = bone4.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(104, 38).mirror().addBox(-0.4F, -0.6F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.21F, -0.0048F, 0.9766F, 1.0314F, -0.4337F, -0.4598F));

		PartDefinition cube_r243 = bone4.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(103, 58).mirror().addBox(-0.5F, -0.3611F, -0.0353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2449F, 0.0374F, 0.4788F, 0.7515F, -0.5068F, -0.4836F));

		PartDefinition cube_r244 = bone4.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(92, 70).mirror().addBox(-0.5F, -0.4547F, -1.4829F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2449F, 0.0374F, 0.4788F, 0.3675F, -0.5068F, -0.4836F));

		PartDefinition bone6 = immobile15.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7972F, -0.7754F, 0.7191F, 0.2146F, 0.3337F, 0.0688F));

		PartDefinition cube_r245 = bone6.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(104, 75).mirror().addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(104, 50).mirror().addBox(-0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.3712F, -0.8753F, 1.2813F, 1.4278F, -0.392F, -0.7157F));

		PartDefinition cube_r246 = bone6.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(104, 47).mirror().addBox(-0.1F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.0F, 1.2F, 1.2582F, -0.2791F, -0.2112F));

		PartDefinition cube_r247 = bone6.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(104, 44).mirror().addBox(-0.1F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4955F, 0.3595F, 0.7653F, 0.7172F, -0.2791F, -0.2112F));

		PartDefinition cube_r248 = bone6.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(68, 92).mirror().addBox(-0.4F, -0.4F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2253F, -0.0516F, 0.6313F, 0.0726F, -0.6342F, -0.2491F));

		PartDefinition bone7 = immobile15.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2943F, -0.8173F, 0.6853F, 0.2628F, 0.1907F, 0.2185F));

		PartDefinition cube_r249 = bone7.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(104, 69).mirror().addBox(-0.1F, -0.8F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(104, 66).mirror().addBox(-0.1F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.0F, 1.2F, 1.2582F, -0.2791F, -0.2112F));

		PartDefinition cube_r250 = bone7.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(104, 63).mirror().addBox(-0.1F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4955F, 0.3595F, 0.7653F, 0.7172F, -0.2791F, -0.2112F));

		PartDefinition cube_r251 = bone7.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(92, 74).mirror().addBox(-0.5F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1195F, 0.2789F, 0.8755F, 0.019F, -0.2791F, -0.2112F));

		PartDefinition immobile13 = immobile8.addOrReplaceChild("immobile13", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0443F, -0.1744F, -0.0077F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(54, 91).addBox(0.5F, -0.1F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F))
				.texOffs(54, 91).mirror().addBox(-1.5F, -0.1F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.3486F, 0.1924F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r252 = jaw.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(106, 28).mirror().addBox(-0.02F, -0.6758F, -2.0338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(86, 56).mirror().addBox(0.0F, -1.4758F, -3.8338F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.0708F, -0.6579F, 0.1571F, -0.1047F, 0.0F));

		PartDefinition cube_r253 = jaw.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(93, 56).mirror().addBox(0.0F, -0.5708F, -2.0421F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(26, 93).mirror().addBox(0.0F, 0.2039F, -3.6201F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(7, 91).mirror().addBox(0.0F, -1.1708F, -2.0421F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.0708F, -0.6579F, 0.0F, -0.1047F, 0.0F));

		PartDefinition cube_r254 = jaw.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(93, 21).mirror().addBox(0.0F, -0.7325F, -2.0006F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0013F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.0708F, -0.6579F, 0.5061F, -0.1047F, 0.0F));

		PartDefinition cube_r255 = jaw.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(61, 91).mirror().addBox(-2.0F, -1.0F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0013F)).mirror(false)
				.texOffs(61, 91).addBox(0.0F, -1.0F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0013F)), PartPose.offsetAndRotation(0.5F, 0.85F, 1.1187F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r256 = jaw.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(26, 93).addBox(-1.0F, 0.2039F, -3.6201F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(93, 56).addBox(-1.0F, -0.5708F, -2.0421F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F))
				.texOffs(7, 91).addBox(-1.0F, -1.1708F, -2.0421F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.0708F, -0.6579F, 0.0F, 0.1047F, 0.0F));

		PartDefinition cube_r257 = jaw.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(93, 21).addBox(-1.0F, -0.7325F, -2.0006F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0013F)), PartPose.offsetAndRotation(1.5F, 1.0708F, -0.6579F, 0.5061F, 0.1047F, 0.0F));

		PartDefinition cube_r258 = jaw.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(106, 28).addBox(-0.98F, -0.6758F, -2.0338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(86, 56).addBox(-1.0F, -1.4758F, -3.8338F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.5F, 1.0708F, -0.6579F, 0.1571F, 0.1047F, 0.0F));

		PartDefinition immobile11 = jaw.addOrReplaceChild("immobile11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -2.7F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r259 = immobile11.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(77, 58).mirror().addBox(-0.4008F, -0.8105F, -1.4921F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8305F, -3.3834F, 0.0669F, -0.1098F, 0.0538F));

		PartDefinition cube_r260 = immobile11.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(77, 58).addBox(-0.5993F, -0.8105F, -1.4921F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.5F, 0.8305F, -3.3834F, 0.0669F, 0.1098F, -0.0538F));

		PartDefinition immobile12 = immobile11.addOrReplaceChild("immobile12", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.0F));

		PartDefinition cube_r261 = immobile12.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(65, 70).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.0464F, -2.0079F, -0.0437F, -0.0697F, 0.0031F));

		PartDefinition cube_r262 = immobile12.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(80, 31).mirror().addBox(-0.4008F, -0.2062F, -1.4405F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8305F, -0.3834F, -0.2298F, -0.1098F, 0.0538F));

		PartDefinition cube_r263 = immobile12.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(80, 26).mirror().addBox(-1.0F, -0.9712F, -2.8073F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(80, 26).addBox(-0.6F, -0.9712F, -2.8073F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3F, 1.2708F, -1.9292F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r264 = immobile12.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(31, 79).mirror().addBox(-1.0F, -0.0724F, 0.0804F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(31, 79).addBox(-0.6F, -0.0724F, 0.0804F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.3F, 0.0F, -4.9F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r265 = immobile12.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(80, 31).addBox(-0.5993F, -0.2062F, -1.4405F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.5F, 0.8305F, -0.3834F, -0.2298F, 0.1098F, -0.0538F));

		PartDefinition cube_r266 = immobile12.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(65, 70).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2F, -0.0464F, -2.0079F, -0.0437F, 0.0697F, -0.0031F));

		PartDefinition cube_r267 = immobile12.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(105, 13).addBox(-0.5F, -0.1F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.7043F, -4.6815F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r268 = immobile12.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(10, 105).addBox(-0.5F, -0.6F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(101, 104).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.2071F, -4.5684F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r269 = immobile12.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(96, 104).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.5102F, -4.2594F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r270 = immobile12.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(0, 105).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.6041F, -5.0787F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r271 = immobile12.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(102, 88).addBox(-1.0F, -0.8212F, -2.9126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.5F, 1.0F, -3.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition throatPouch3 = jaw.addOrReplaceChild("throatPouch3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9F, -1.7F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r272 = throatPouch3.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(85, 73).mirror().addBox(-0.1139F, -0.4051F, -2.0541F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3078F, -0.6915F, 1.3882F, 0.3927F, -0.2182F, 0.0F));

		PartDefinition cube_r273 = throatPouch3.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(85, 73).addBox(0.1139F, -0.4051F, -2.0541F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3078F, -0.6915F, 1.3882F, 0.3927F, 0.2182F, 0.0F));

		PartDefinition throatPouch = neck3.addOrReplaceChild("throatPouch", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.8391F, -2.279F, 0.4363F, 0.0F, 0.0F));

		PartDefinition throatPouch2 = throatPouch.addOrReplaceChild("throatPouch2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.0F, -2.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(109, 46).addBox(0.0F, -2.6427F, 3.9306F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3717F, 8.3345F, -0.0788F, 0.087F, -0.0069F));

		PartDefinition cube_r274 = tail.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(77, 107).addBox(0.0F, -2.8591F, 7.8264F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 42).addBox(-0.5F, -0.8591F, -0.1736F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.4142F, 0.1512F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r275 = tail.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(49, 108).addBox(0.0F, -1.9591F, 0.0264F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7881F, 5.8962F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r276 = tail.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(56, 105).addBox(0.0F, -2.2591F, 0.0264F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4789F, 1.9069F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r277 = tail.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(10, 99).addBox(0.0F, 0.1585F, -0.2593F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1386F, 6.626F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r278 = tail.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(71, 96).addBox(0.0F, 0.2585F, -0.1593F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3988F, 3.8724F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r279 = tail.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(27, 32).addBox(0.0F, -0.2728F, -0.2354F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8408F, 2.0656F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r280 = tail.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(15, 105).addBox(0.0F, -0.1591F, 0.1264F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.513F, -0.17F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r281 = tail.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(77, 102).addBox(0.0F, -2.1591F, -0.0736F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4794F, 0.0043F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(21, 43).addBox(-0.5F, -0.3901F, 0.3111F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4791F, 8.5888F, 0.1715F, 0.2581F, 0.0442F));

		PartDefinition cube_r282 = tail2.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(52, 108).addBox(-0.5F, -1.5957F, -0.0653F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3943F, 7.3764F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r283 = tail2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(107, 87).addBox(-0.5F, -1.7957F, -0.0653F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2943F, 5.3764F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r284 = tail2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(109, 42).addBox(-0.5F, -1.3957F, 0.0347F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8943F, 3.2764F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r285 = tail2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(107, 83).addBox(-0.5F, -1.9957F, -0.0653F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3943F, 1.3764F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r286 = tail2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(105, 16).addBox(0.0F, 3.8585F, 2.8407F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 100).addBox(0.0F, 1.4585F, 0.8407F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 55).addBox(0.0F, -0.3415F, -1.1593F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0598F, 1.6343F, 0.733F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(31, 0).addBox(-0.5F, -0.4006F, -0.1183F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.003F))
				.texOffs(88, 40).addBox(0.0F, -1.4006F, 4.8817F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 90).addBox(0.0F, -1.2006F, 6.8817F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 92).addBox(0.0F, -1.1006F, 8.8817F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 93).addBox(0.0F, -1.0006F, 10.8817F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0443F, 8.2764F, 0.0532F, 0.1743F, 0.0092F));

		PartDefinition cube_r287 = tail3.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(106, 100).addBox(0.0F, 12.2585F, 12.8407F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 78).addBox(0.0F, 10.6585F, 10.8407F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 106).addBox(0.0F, 9.1585F, 8.8407F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 105).addBox(0.0F, 7.2585F, 6.8407F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 105).addBox(0.0F, 5.5585F, 4.8407F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1042F, -6.6421F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r288 = tail3.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(108, 53).addBox(0.0F, -1.2002F, -0.0087F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4004F, 2.8905F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r289 = tail3.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(95, 107).addBox(0.0F, -1.5002F, -0.0087F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3004F, 0.8905F, -0.0698F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F))
				.texOffs(109, 50).addBox(0.0F, -0.9F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(109, 66).addBox(0.0F, -0.7F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(109, 69).addBox(0.0F, -0.7F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(109, 63).addBox(0.0F, -1.1F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1496F, 12.8904F, 0.0928F, -0.3477F, -0.0317F));

		PartDefinition cube_r290 = tail4.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(71, 108).addBox(0.0F, 5.1F, 7.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 108).addBox(0.0F, 4.0F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 108).addBox(0.0F, 2.9F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 108).addBox(0.0F, 1.7F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 57).addBox(0.0F, 0.6F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0629F, 1.2079F, 0.5585F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.3745F, -0.0886F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.1497F, 13.3131F, -0.0632F, -0.2613F, 0.0164F));

		PartDefinition cube_r291 = tail5.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(109, 78).addBox(0.0F, 9.8F, 15.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(109, 75).addBox(0.0F, 8.7F, 13.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(109, 72).addBox(0.0F, 7.9F, 11.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 108).addBox(0.0F, 6.0F, 9.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2126F, -12.1052F, 0.5585F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(31, 15).addBox(-0.5F, -0.4253F, -0.2823F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0762F, 13.894F, -0.3193F, -0.2909F, 0.0945F));

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