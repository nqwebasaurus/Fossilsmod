package fossils.fossils.client.blockentity.model.huaxiazhoulong;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HuaxiazhoulongFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart osteoderms5;
	private final ModelPart osteoderms14;
	private final ModelPart leftleg;
	private final ModelPart leftleg2;
	private final ModelPart leftleg3;
	private final ModelPart leftfoot;
	private final ModelPart rightleg;
	private final ModelPart rightleg2;
	private final ModelPart rightleg3;
	private final ModelPart rightfoot;
	private final ModelPart body;
	private final ModelPart osteoderms4;
	private final ModelPart osteoderms15;
	private final ModelPart chest;
	private final ModelPart osteoderms3;
	private final ModelPart osteoderms16;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart lefthand;
	private final ModelPart lefthand2;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart righthand;
	private final ModelPart righthand2;
	private final ModelPart neck;
	private final ModelPart osteoderms2;
	private final ModelPart osteoderms11;
	private final ModelPart osteoderms9;
	private final ModelPart osteoderms17;
	private final ModelPart neck2;
	private final ModelPart osteoderms;
	private final ModelPart osteoderms10;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart osteoderms6;
	private final ModelPart osteoderms13;
	private final ModelPart tail2;
	private final ModelPart osteoderms7;
	private final ModelPart osteoderms12;
	private final ModelPart tail3;
	private final ModelPart osteoderms8;
	private final ModelPart leftClub2;
	private final ModelPart rightClub2;

	public HuaxiazhoulongFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.osteoderms5 = this.hips.getChild("osteoderms5");
		this.osteoderms14 = this.hips.getChild("osteoderms14");
		this.leftleg = this.hips.getChild("leftleg");
		this.leftleg2 = this.leftleg.getChild("leftleg2");
		this.leftleg3 = this.leftleg2.getChild("leftleg3");
		this.leftfoot = this.leftleg3.getChild("leftfoot");
		this.rightleg = this.hips.getChild("rightleg");
		this.rightleg2 = this.rightleg.getChild("rightleg2");
		this.rightleg3 = this.rightleg2.getChild("rightleg3");
		this.rightfoot = this.rightleg3.getChild("rightfoot");
		this.body = this.hips.getChild("body");
		this.osteoderms4 = this.body.getChild("osteoderms4");
		this.osteoderms15 = this.body.getChild("osteoderms15");
		this.chest = this.body.getChild("chest");
		this.osteoderms3 = this.chest.getChild("osteoderms3");
		this.osteoderms16 = this.chest.getChild("osteoderms16");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.lefthand = this.leftarm2.getChild("lefthand");
		this.lefthand2 = this.leftarm2.getChild("lefthand2");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.righthand = this.rightarm2.getChild("righthand");
		this.righthand2 = this.rightarm2.getChild("righthand2");
		this.neck = this.chest.getChild("neck");
		this.osteoderms2 = this.neck.getChild("osteoderms2");
		this.osteoderms11 = this.neck.getChild("osteoderms11");
		this.osteoderms9 = this.neck.getChild("osteoderms9");
		this.osteoderms17 = this.neck.getChild("osteoderms17");
		this.neck2 = this.neck.getChild("neck2");
		this.osteoderms = this.neck2.getChild("osteoderms");
		this.osteoderms10 = this.neck2.getChild("osteoderms10");
		this.head = this.neck2.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.osteoderms6 = this.tail.getChild("osteoderms6");
		this.osteoderms13 = this.tail.getChild("osteoderms13");
		this.tail2 = this.tail.getChild("tail2");
		this.osteoderms7 = this.tail2.getChild("osteoderms7");
		this.osteoderms12 = this.tail2.getChild("osteoderms12");
		this.tail3 = this.tail2.getChild("tail3");
		this.osteoderms8 = this.tail3.getChild("osteoderms8");
		this.leftClub2 = this.osteoderms8.getChild("leftClub2");
		this.rightClub2 = this.osteoderms8.getChild("rightClub2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -13.639F, 9.5542F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(45, 95).addBox(0.0F, -1.3F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3681F, 2.7633F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(41, 59).addBox(0.0F, -1.7978F, 1.9074F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(17, 32).addBox(-0.5F, -0.0978F, 0.9074F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.711F, -3.6542F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(28, 79).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.9762F, 0.9466F, 1.2769F, -0.4955F, -0.0245F, -0.1552F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-1.2066F, -0.6327F, -6.9107F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7698F, -1.7595F, 1.5127F, -0.0304F, 0.219F, -0.2662F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(47, 29).mirror().addBox(1.829F, -0.6327F, -3.4827F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7698F, -1.7595F, 1.5127F, -0.0553F, 1.0038F, -0.3063F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(1.8703F, -0.6327F, -6.257F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7698F, -1.7595F, 1.5127F, -0.0391F, 0.7074F, -0.285F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(22, 45).mirror().addBox(0.3707F, -0.1379F, -3.8051F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7698F, -1.7595F, 1.5127F, -0.2489F, -0.0315F, -0.2599F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(44, 45).mirror().addBox(-0.4139F, -0.1149F, -0.3184F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(11, 45).mirror().addBox(0.5861F, -0.1149F, -0.3184F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.7698F, -1.7595F, 1.5127F, -0.4847F, 0.0616F, -0.3265F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(42, 0).mirror().addBox(-1.3528F, -0.1149F, -0.4223F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7698F, -1.7595F, 1.5127F, -0.5253F, 0.3833F, -0.5075F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(26, 71).mirror().addBox(-0.5F, -0.6911F, -0.3311F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7627F, 2.7378F, 1.5035F, -0.0233F, -0.1843F, -0.4929F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(78, 44).mirror().addBox(0.6501F, 1.3173F, -2.296F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.5698F, -1.7595F, 1.5127F, 0.5691F, -0.0245F, -0.1552F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(41, 79).mirror().addBox(-0.5F, -2.1147F, -0.4011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.7627F, 2.7378F, 1.5035F, 0.0116F, -0.1843F, -0.4929F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(53, 68).mirror().addBox(-0.5F, -0.4865F, -0.3924F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-2.1187F, 1.8182F, 0.3041F, 0.1755F, -0.0646F, -0.5551F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(60, 77).mirror().addBox(-0.5F, -3.0117F, -0.3695F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1187F, 1.8182F, 0.3041F, 0.5507F, -0.0646F, -0.5551F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(25, 0).mirror().addBox(0.5985F, 0.0297F, -2.0289F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5698F, -1.7595F, 1.5127F, -0.1966F, 0.0493F, 0.1675F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(0.6501F, 0.5029F, -2.5466F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5698F, -1.7595F, 1.5127F, -0.1552F, -0.0245F, -0.1552F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(41, 40).mirror().addBox(-1.4625F, -0.1379F, -2.9164F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7698F, -1.7595F, 1.5127F, -0.2502F, 0.1038F, -0.2944F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 38).addBox(0.2066F, -0.6327F, -6.9107F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7698F, -1.7595F, 1.5127F, -0.0304F, -0.219F, 0.2662F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(47, 29).addBox(-3.829F, -0.6327F, -3.4827F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.7698F, -1.7595F, 1.5127F, -0.0553F, -1.0038F, 0.3063F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 57).addBox(-2.8703F, -0.6327F, -6.257F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.7698F, -1.7595F, 1.5127F, -0.0391F, -0.7074F, 0.285F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(22, 45).addBox(-1.3707F, -0.1379F, -3.8051F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7698F, -1.7595F, 1.5127F, -0.2489F, 0.0315F, 0.2599F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(44, 45).addBox(-1.5861F, -0.1149F, -0.3184F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(11, 45).addBox(-1.5861F, -0.1149F, -0.3184F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.7698F, -1.7595F, 1.5127F, -0.4847F, -0.0616F, 0.3265F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(42, 0).addBox(0.3528F, -0.1149F, -0.4223F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.7698F, -1.7595F, 1.5127F, -0.5253F, -0.3833F, 0.5075F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(26, 71).addBox(-0.5F, -0.6911F, -0.3311F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7627F, 2.7378F, 1.5035F, -0.0233F, 0.1843F, 0.4929F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(28, 79).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.9762F, 0.9466F, 1.2769F, -0.4955F, 0.0245F, 0.1552F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(78, 44).addBox(-1.6501F, 1.3173F, -2.296F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.5698F, -1.7595F, 1.5127F, 0.5691F, 0.0245F, 0.1552F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(41, 79).addBox(-0.5F, -2.1147F, -0.4011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.7627F, 2.7378F, 1.5035F, 0.0116F, 0.1843F, 0.4929F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(53, 68).addBox(-0.5F, -0.4865F, -0.3924F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(2.1187F, 1.8182F, 0.3041F, 0.1755F, 0.0646F, 0.5551F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(60, 77).addBox(-0.5F, -3.0117F, -0.3695F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1187F, 1.8182F, 0.3041F, 0.5507F, 0.0646F, 0.5551F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(25, 0).addBox(-4.5985F, 0.0297F, -2.0289F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5698F, -1.7595F, 1.5127F, -0.1966F, -0.0493F, -0.1675F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 45).addBox(-1.6501F, 0.5029F, -2.5466F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5698F, -1.7595F, 1.5127F, -0.1552F, 0.0245F, 0.1552F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(41, 40).addBox(-1.5375F, -0.1379F, -2.9164F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.7698F, -1.7595F, 1.5127F, -0.2502F, -0.1038F, 0.2944F));

		PartDefinition osteoderms5 = hips.addOrReplaceChild("osteoderms5", CubeListBuilder.create(), PartPose.offset(5.6838F, -1.785F, 2.1713F));

		PartDefinition cube_r33 = osteoderms5.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(17, 80).addBox(-0.1147F, -0.4128F, -0.0289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.6792F, 1.9682F, 2.095F, -0.0644F, 0.1039F, -0.1203F));

		PartDefinition cube_r34 = osteoderms5.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 66).addBox(-0.2438F, -0.4903F, -1.3423F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6792F, 1.9682F, 2.095F, -0.5115F, 0.5572F, -0.3612F));

		PartDefinition cube_r35 = osteoderms5.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(48, 77).addBox(-0.5208F, -0.5246F, -0.5268F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.6792F, 1.9682F, 2.095F, -2.6733F, 0.4016F, -3.019F));

		PartDefinition cube_r36 = osteoderms5.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(77, 48).addBox(-0.5602F, -0.5246F, -0.557F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(-0.6792F, 1.9682F, 2.095F, -2.7107F, -0.1039F, 3.0213F));

		PartDefinition cube_r37 = osteoderms5.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(46, 68).addBox(-0.3332F, -0.4521F, -1.3305F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1662F, 0.7969F, -0.0544F, -0.4179F, 0.6376F, -0.5144F));

		PartDefinition cube_r38 = osteoderms5.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(21, 77).addBox(-0.4878F, -0.4863F, -0.6107F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(0.1662F, 0.7969F, -0.0544F, -2.8046F, -0.1653F, 2.828F));

		PartDefinition cube_r39 = osteoderms5.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(14, 77).addBox(-0.4878F, -0.4863F, -0.6107F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.1662F, 0.7969F, -0.0544F, -2.7855F, 0.3616F, 3.0165F));

		PartDefinition cube_r40 = osteoderms5.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(12, 80).addBox(-0.1871F, -0.3579F, 0.0075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.1662F, 0.7969F, -0.0544F, 0.0296F, 0.1653F, -0.3135F));

		PartDefinition cube_r41 = osteoderms5.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(74, 32).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.356F, 0.2953F, -2.1847F, -3.0679F, 0.0769F, 2.9929F));

		PartDefinition cube_r42 = osteoderms5.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(79, 74).addBox(-0.9159F, -0.498F, -0.2294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.6346F, 0.1165F, -2.3544F, 0.2837F, 0.48F, -0.1927F));

		PartDefinition cube_r43 = osteoderms5.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(65, 55).addBox(-0.2432F, -0.5F, -0.9654F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5221F, 0.2894F, -2.3835F, -0.1328F, 0.9835F, -0.2651F));

		PartDefinition cube_r44 = osteoderms5.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(48, 74).addBox(-1.0286F, -0.5F, -0.7575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.5221F, 0.2894F, -5.0835F, 2.6297F, 1.2414F, 2.5613F));

		PartDefinition cube_r45 = osteoderms5.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(65, 51).addBox(-0.2432F, -0.5F, -0.9654F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5221F, 0.2894F, -5.0835F, 0.1843F, 0.5266F, 0.0018F));

		PartDefinition cube_r46 = osteoderms5.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(91, 52).addBox(-0.7086F, 0.8249F, 2.5548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(0, 90).addBox(-0.6199F, 0.1708F, 1.2843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(90, 61).addBox(-0.5378F, -0.3607F, 0.084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-4.9089F, -1.039F, -1.123F, 0.2815F, 0.0105F, -0.0014F));

		PartDefinition cube_r47 = osteoderms5.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(90, 58).addBox(-0.4687F, -0.8105F, -0.9066F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-4.9089F, -1.039F, -1.123F, 0.3862F, 0.0105F, -0.0014F));

		PartDefinition cube_r48 = osteoderms5.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(83, 89).addBox(-0.4002F, -1.753F, -1.6837F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-4.9089F, -1.039F, -1.123F, 0.6302F, 0.009F, 0.0138F));

		PartDefinition cube_r49 = osteoderms5.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(89, 46).addBox(-0.3029F, -3.0688F, -2.6197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-4.9089F, -1.039F, -1.123F, 0.7524F, 0.009F, 0.0138F));

		PartDefinition cube_r50 = osteoderms5.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(91, 55).addBox(-0.7393F, 2.4414F, 2.048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(30, 88).addBox(-0.7393F, 1.1414F, 0.848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.6212F, -0.5203F, -2.0906F, 0.5381F, 0.0878F, 0.8151F));

		PartDefinition cube_r51 = osteoderms5.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(89, 33).addBox(-0.503F, -0.6649F, -0.3709F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.6212F, -0.5203F, -2.0906F, 0.5983F, 0.0245F, 0.8191F));

		PartDefinition cube_r52 = osteoderms5.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(10, 89).addBox(-0.5808F, -2.3328F, -1.5968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.6212F, -0.5203F, -2.0906F, 0.6883F, -0.0706F, 0.8179F));

		PartDefinition osteoderms14 = hips.addOrReplaceChild("osteoderms14", CubeListBuilder.create(), PartPose.offset(-5.6838F, -1.785F, 2.1713F));

		PartDefinition cube_r53 = osteoderms14.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(17, 80).mirror().addBox(-0.8853F, -0.4128F, -0.0289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.6792F, 1.9682F, 2.095F, -0.0644F, -0.1039F, 0.1203F));

		PartDefinition cube_r54 = osteoderms14.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-0.7562F, -0.4903F, -1.3423F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.6792F, 1.9682F, 2.095F, -0.5115F, -0.5572F, 0.3612F));

		PartDefinition cube_r55 = osteoderms14.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(48, 77).mirror().addBox(-1.4792F, -0.5246F, -0.5268F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.6792F, 1.9682F, 2.095F, -2.6733F, -0.4016F, 3.019F));

		PartDefinition cube_r56 = osteoderms14.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(77, 48).mirror().addBox(-1.4398F, -0.5246F, -0.557F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)).mirror(false), PartPose.offsetAndRotation(0.6792F, 1.9682F, 2.095F, -2.7107F, 0.1039F, -3.0213F));

		PartDefinition cube_r57 = osteoderms14.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(46, 68).mirror().addBox(-0.6668F, -0.4521F, -1.3305F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1662F, 0.7969F, -0.0544F, -0.4179F, -0.6376F, 0.5144F));

		PartDefinition cube_r58 = osteoderms14.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(21, 77).mirror().addBox(-1.5122F, -0.4863F, -0.6107F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)).mirror(false), PartPose.offsetAndRotation(-0.1662F, 0.7969F, -0.0544F, -2.8046F, 0.1653F, -2.828F));

		PartDefinition cube_r59 = osteoderms14.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(14, 77).mirror().addBox(-1.5122F, -0.4863F, -0.6107F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.1662F, 0.7969F, -0.0544F, -2.7855F, -0.3616F, -3.0165F));

		PartDefinition cube_r60 = osteoderms14.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(12, 80).mirror().addBox(-0.8129F, -0.3579F, 0.0075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.1662F, 0.7969F, -0.0544F, 0.0296F, -0.1653F, 0.3135F));

		PartDefinition cube_r61 = osteoderms14.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(74, 32).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.356F, 0.2953F, -2.1847F, -3.0679F, -0.0769F, -2.9929F));

		PartDefinition cube_r62 = osteoderms14.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(79, 74).mirror().addBox(-0.0841F, -0.498F, -0.2294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-1.6346F, 0.1165F, -2.3544F, 0.2837F, -0.48F, 0.1927F));

		PartDefinition cube_r63 = osteoderms14.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(65, 55).mirror().addBox(-0.7568F, -0.5F, -0.9654F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5221F, 0.2894F, -2.3835F, -0.1328F, -0.9835F, 0.2651F));

		PartDefinition cube_r64 = osteoderms14.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(48, 74).mirror().addBox(-0.9714F, -0.5F, -0.7575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.5221F, 0.2894F, -5.0835F, 2.6297F, -1.2414F, -2.5613F));

		PartDefinition cube_r65 = osteoderms14.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(65, 51).mirror().addBox(-0.7568F, -0.5F, -0.9654F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5221F, 0.2894F, -5.0835F, 0.1843F, -0.5266F, -0.0018F));

		PartDefinition cube_r66 = osteoderms14.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(91, 52).mirror().addBox(-0.2914F, 0.8249F, 2.5548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(0, 90).mirror().addBox(-0.3801F, 0.1708F, 1.2843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(90, 61).mirror().addBox(-0.4622F, -0.3607F, 0.084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(4.9089F, -1.039F, -1.123F, 0.2815F, -0.0105F, 0.0014F));

		PartDefinition cube_r67 = osteoderms14.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(90, 58).mirror().addBox(-0.5313F, -0.8105F, -0.9066F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(4.9089F, -1.039F, -1.123F, 0.3862F, -0.0105F, 0.0014F));

		PartDefinition cube_r68 = osteoderms14.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(83, 89).mirror().addBox(-0.5998F, -1.753F, -1.6837F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(4.9089F, -1.039F, -1.123F, 0.6302F, -0.009F, -0.0138F));

		PartDefinition cube_r69 = osteoderms14.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(89, 46).mirror().addBox(-0.6971F, -3.0688F, -2.6197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(4.9089F, -1.039F, -1.123F, 0.7524F, -0.009F, -0.0138F));

		PartDefinition cube_r70 = osteoderms14.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(91, 55).mirror().addBox(-0.2607F, 2.4414F, 2.048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(30, 88).mirror().addBox(-0.2607F, 1.1414F, 0.848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.6212F, -0.5203F, -2.0906F, 0.5381F, -0.0878F, -0.8151F));

		PartDefinition cube_r71 = osteoderms14.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(89, 33).mirror().addBox(-0.497F, -0.6649F, -0.3709F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.6212F, -0.5203F, -2.0906F, 0.5983F, -0.0245F, -0.8191F));

		PartDefinition cube_r72 = osteoderms14.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(10, 89).mirror().addBox(-0.4192F, -2.3328F, -1.5968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.6212F, -0.5203F, -2.0906F, 0.6883F, 0.0706F, -0.8179F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(55, 10).addBox(-0.5F, 4.8943F, -2.8481F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.2F, -0.5626F, 0.0961F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftleg.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(47, 54).addBox(0.0F, -4.4273F, -1.2834F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(48, 63).addBox(0.0F, -3.0273F, -0.9834F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 3.7019F, -0.7153F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftleg.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(71, 16).addBox(0.0F, -0.512F, -1.0012F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.5F, 4.6019F, -1.1153F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r75 = leftleg.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(63, 36).addBox(0.0F, 0.0455F, 0.0436F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 3.2019F, -1.6153F, -0.4363F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 7.1108F, -2.6201F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r76 = leftleg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(9, 63).addBox(0.499F, -1.2091F, -0.0869F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.499F, 0.9977F, 0.8973F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r77 = leftleg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(62, 0).addBox(-1.5F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.4388F, 0.8705F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r78 = leftleg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(9, 57).addBox(-1.601F, -0.1974F, -0.4438F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.499F, 0.9977F, 0.8973F, 0.4538F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.7943F, 2.821F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r79 = leftleg3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(48, 59).addBox(-1.602F, -0.5F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.499F, 0.2307F, -0.7197F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(40, 11).addBox(-2.499F, -0.5693F, -2.2197F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.6F, -1.2F, 0.0F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(55, 44).addBox(-1.5F, 4.8943F, -2.8481F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-4.2F, -0.5626F, 0.0961F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightleg.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(55, 5).addBox(-2.0F, -4.4273F, -1.2834F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(62, 63).addBox(-2.0F, -3.0273F, -0.9834F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 3.7019F, -0.7153F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightleg.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(71, 20).addBox(-2.0F, -0.512F, -1.0012F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.5F, 4.6019F, -1.1153F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightleg.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(55, 63).addBox(-2.0F, 0.0455F, 0.0436F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 3.2019F, -1.6153F, -0.4363F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 7.1108F, -2.6201F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightleg2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(14, 63).addBox(-1.499F, -1.2091F, -0.0869F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.499F, 0.9977F, 0.8973F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightleg2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(62, 15).addBox(-0.5F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.4388F, 0.8705F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r85 = rightleg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(16, 57).addBox(-0.399F, -0.1974F, -0.4438F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.499F, 0.9977F, 0.8973F, 0.4538F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.7943F, 2.821F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r86 = rightleg3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(57, 59).addBox(-1.398F, -0.5F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.499F, 0.2307F, -0.7197F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(13, 40).addBox(-1.501F, -0.5693F, -2.2197F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.6F, -1.2F, -0.2618F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(21, 13).addBox(-0.5F, -0.55F, -8.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.003F))
				.texOffs(48, 95).addBox(0.0F, -2.55F, -7.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 95).addBox(0.0F, -2.55F, -5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.161F, -2.6542F, 0.0964F, -0.0869F, -0.0084F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(95, 62).addBox(0.0F, -1.8473F, -0.0165F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.45F, -1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(95, 58).addBox(0.0F, -1.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.95F, -2.5F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(71, 6).mirror().addBox(-3.0023F, 0.0417F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.0911F, -0.5F, -0.0867F, 0.0099F, 0.0432F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(71, 4).mirror().addBox(-5.2991F, -1.9463F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.0911F, -0.5F, -0.072F, -0.0494F, -0.6702F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-3.0023F, 0.0417F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.0911F, -2.5F, -0.0867F, 0.0099F, 0.0432F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(69, 65).mirror().addBox(-5.2991F, -1.9463F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.0911F, -2.5F, -0.072F, -0.0494F, -0.6702F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(69, 63).mirror().addBox(-5.5418F, -5.0402F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.0911F, -2.5F, -0.0189F, -0.0852F, -1.4216F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(36, 69).mirror().addBox(-3.0023F, 0.0417F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.0911F, -4.5F, 0.0F, 0.0F, 0.1134F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(67, 68).mirror().addBox(-5.2991F, -1.9463F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.0911F, -4.5F, 0.0F, 0.0F, -0.6021F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(53, 26).mirror().addBox(-6.5418F, -5.0402F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.0911F, -4.5F, 0.0F, 0.0F, -1.3526F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(58, 68).mirror().addBox(-3.0023F, 0.0417F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.0911F, -6.5F, 0.052F, -0.0059F, 0.1133F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(68, 49).mirror().addBox(-5.2991F, -1.9463F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.0911F, -6.5F, 0.0432F, 0.0296F, -0.6015F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(44, 50).mirror().addBox(-7.5418F, -5.0402F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, -0.0911F, -6.5F, 0.0113F, 0.0511F, -1.3523F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(71, 4).addBox(2.2991F, -1.9463F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.0911F, -0.5F, -0.072F, 0.0494F, 0.6702F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(71, 6).addBox(0.0023F, 0.0417F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.0911F, -0.5F, -0.0867F, -0.0099F, -0.0432F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(0, 70).addBox(0.0023F, 0.0417F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.0911F, -2.5F, -0.0867F, -0.0099F, -0.0432F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(69, 65).addBox(2.2991F, -1.9463F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.0911F, -2.5F, -0.072F, 0.0494F, 0.6702F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(69, 63).addBox(2.5418F, -5.0402F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.0911F, -2.5F, -0.0189F, 0.0852F, 1.4216F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(36, 69).addBox(0.0023F, 0.0417F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.0911F, -4.5F, 0.0F, 0.0F, -0.1134F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(67, 68).addBox(2.2991F, -1.9463F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.0911F, -4.5F, 0.0F, 0.0F, 0.6021F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(53, 26).addBox(2.5418F, -5.0402F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.0911F, -4.5F, 0.0F, 0.0F, 1.3526F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(58, 68).addBox(0.0023F, 0.0417F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.0911F, -6.5F, 0.052F, 0.0059F, -0.1133F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(68, 49).addBox(2.2991F, -1.9463F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.0911F, -6.5F, 0.0432F, -0.0296F, 0.6015F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(44, 50).addBox(2.5418F, -5.0402F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, -0.0911F, -6.5F, 0.0113F, -0.0511F, 1.3523F));

		PartDefinition osteoderms4 = body.addOrReplaceChild("osteoderms4", CubeListBuilder.create(), PartPose.offset(6.05F, 0.25F, -2.5F));

		PartDefinition cube_r111 = osteoderms4.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(35, 88).addBox(-0.4978F, -0.5051F, -0.7957F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(1.3987F, 1.1763F, 1.0987F, 1.7237F, -0.253F, 1.5985F));

		PartDefinition cube_r112 = osteoderms4.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(88, 15).addBox(-0.4978F, -0.6039F, -0.1649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(1.3987F, 1.1763F, 1.0987F, 0.3798F, -0.253F, 1.5985F));

		PartDefinition cube_r113 = osteoderms4.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(86, 55).addBox(-0.4978F, -0.6114F, -0.7284F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3987F, 1.1763F, 1.0987F, 0.7812F, -0.253F, 1.5985F));

		PartDefinition cube_r114 = osteoderms4.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(7, 74).addBox(-0.6143F, 1.031F, 0.0548F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7164F, 2.2347F, -2.5234F, 1.0156F, -0.2527F, 1.5396F));

		PartDefinition cube_r115 = osteoderms4.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(74, 28).addBox(-0.6143F, 1.6836F, -0.7423F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(1.7164F, 2.2347F, -2.5234F, 1.4519F, -0.2527F, 1.5396F));

		PartDefinition cube_r116 = osteoderms4.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(0, 74).addBox(-0.5013F, -0.337F, -0.9728F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F))
				.texOffs(16, 73).addBox(-0.3893F, -2.3441F, -1.1942F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(1.7164F, 2.2347F, -2.5234F, 1.5034F, -0.2543F, 1.5426F));

		PartDefinition cube_r117 = osteoderms4.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(73, 59).addBox(-0.5013F, -0.7028F, -1.008F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(72, 51).addBox(-0.3893F, -2.4283F, -2.0569F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7164F, 2.2347F, -2.5234F, 1.0671F, -0.2543F, 1.5426F));

		PartDefinition cube_r118 = osteoderms4.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(25, 89).addBox(-1.0305F, 1.4347F, 2.1668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-1.3843F, -1.6636F, -1.6687F, 0.4532F, -0.0174F, 0.7926F));

		PartDefinition cube_r119 = osteoderms4.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(93, 18).addBox(-1.0405F, 1.7491F, -3.1235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-1.3843F, -1.6636F, -1.6687F, 2.2684F, -0.0174F, 0.7926F));

		PartDefinition cube_r120 = osteoderms4.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(78, 89).addBox(-0.759F, 0.6006F, 1.0574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-1.1843F, -1.7636F, -1.6687F, 0.4532F, -0.0174F, 0.7926F));

		PartDefinition cube_r121 = osteoderms4.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(40, 92).addBox(-0.769F, 0.8745F, -2.0458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-1.1843F, -1.7636F, -1.6687F, 2.2684F, -0.0174F, 0.7926F));

		PartDefinition cube_r122 = osteoderms4.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(92, 82).addBox(-0.3868F, -0.5177F, -0.2299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.3843F, -1.6636F, -1.6687F, 0.3638F, -0.0362F, 0.8003F));

		PartDefinition cube_r123 = osteoderms4.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(30, 94).addBox(-0.4036F, -0.0907F, -0.9587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-1.3843F, -1.6636F, -1.6687F, 2.5803F, -0.0362F, 0.8003F));

		PartDefinition cube_r124 = osteoderms4.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(91, 39).addBox(-0.1104F, -1.3697F, -1.8071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(91, 27).addBox(-0.0076F, -2.1572F, -3.5447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.6843F, -1.3636F, -1.6687F, 0.3638F, -0.0362F, 0.8003F));

		PartDefinition cube_r125 = osteoderms4.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(93, 67).addBox(-0.1271F, -0.8376F, 0.671F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F))
				.texOffs(93, 24).addBox(-0.0243F, -1.7514F, 2.3456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-1.6843F, -1.3636F, -1.6687F, 2.5803F, -0.0362F, 0.8003F));

		PartDefinition cube_r126 = osteoderms4.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(35, 91).addBox(-0.759F, 0.6006F, 1.0574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8157F, 0.2364F, -1.6687F, 0.5332F, -0.0585F, 1.112F));

		PartDefinition cube_r127 = osteoderms4.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(79, 92).addBox(-0.769F, 0.8745F, -2.0458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.8157F, 0.2364F, -1.6687F, 2.3484F, -0.0585F, 1.112F));

		PartDefinition cube_r128 = osteoderms4.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(93, 91).addBox(-0.3868F, -0.5177F, -0.2299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3157F, 0.2364F, -1.6687F, 0.4436F, -0.078F, 1.1182F));

		PartDefinition cube_r129 = osteoderms4.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(35, 94).addBox(-0.4036F, -0.0907F, -0.9587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.3157F, 0.2364F, -1.6687F, 2.6601F, -0.078F, 1.1182F));

		PartDefinition cube_r130 = osteoderms4.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(88, 91).addBox(-0.1104F, -1.3697F, -1.8071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(90, 0).addBox(-0.0076F, -2.1572F, -3.5447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0157F, 0.2364F, -1.6687F, 0.4436F, -0.078F, 1.1182F));

		PartDefinition cube_r131 = osteoderms4.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(5, 94).addBox(-0.1271F, -0.8376F, 0.671F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F))
				.texOffs(93, 21).addBox(-0.0243F, -1.7514F, 2.3456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.0157F, 0.2364F, -1.6687F, 2.6601F, -0.078F, 1.1182F));

		PartDefinition cube_r132 = osteoderms4.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(93, 15).addBox(-2.4198F, 0.0F, -1.7565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F))
				.texOffs(64, 92).addBox(-2.1483F, -0.8746F, -0.6788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-3.4343F, -2.5484F, 0.3356F, 2.3555F, 0.0684F, 0.1839F));

		PartDefinition cube_r133 = osteoderms4.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(40, 89).addBox(-2.4098F, 0.5314F, 0.1389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(69, 89).addBox(-2.1383F, -0.3027F, -0.9704F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.4343F, -2.5484F, 0.3356F, 0.5403F, 0.0684F, 0.1839F));

		PartDefinition cube_r134 = osteoderms4.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(94, 33).addBox(-2.1295F, 1.7147F, -5.5667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F))
				.texOffs(93, 12).addBox(-1.8531F, 0.9677F, -3.937F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F))
				.texOffs(93, 9).addBox(-1.7502F, 0.054F, -2.2624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-3.4343F, -2.7696F, -6.7714F, 2.668F, 0.0489F, 0.19F));

		PartDefinition cube_r135 = osteoderms4.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(69, 92).addBox(-2.1127F, 2.0759F, 3.9852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(91, 30).addBox(-1.8363F, 1.2239F, 2.4079F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(30, 91).addBox(-1.7335F, 0.4364F, 0.6703F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.4343F, -2.7696F, -6.7714F, 0.4514F, 0.0489F, 0.19F));

		PartDefinition osteoderms15 = body.addOrReplaceChild("osteoderms15", CubeListBuilder.create(), PartPose.offset(-6.05F, 0.25F, -2.5F));

		PartDefinition cube_r136 = osteoderms15.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(35, 88).mirror().addBox(-0.5022F, -0.5051F, -0.7957F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-1.3987F, 1.1763F, 1.0987F, 1.7237F, 0.253F, -1.5985F));

		PartDefinition cube_r137 = osteoderms15.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(88, 15).mirror().addBox(-0.5022F, -0.6039F, -0.1649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.115F)).mirror(false), PartPose.offsetAndRotation(-1.3987F, 1.1763F, 1.0987F, 0.3798F, 0.253F, -1.5985F));

		PartDefinition cube_r138 = osteoderms15.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(86, 55).mirror().addBox(-0.5022F, -0.6114F, -0.7284F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3987F, 1.1763F, 1.0987F, 0.7812F, 0.253F, -1.5985F));

		PartDefinition cube_r139 = osteoderms15.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(7, 74).mirror().addBox(-0.3857F, 1.031F, 0.0548F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.7164F, 2.2347F, -2.5234F, 1.0156F, 0.2527F, -1.5396F));

		PartDefinition cube_r140 = osteoderms15.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(74, 28).mirror().addBox(-0.3857F, 1.6836F, -0.7423F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-1.7164F, 2.2347F, -2.5234F, 1.4519F, 0.2527F, -1.5396F));

		PartDefinition cube_r141 = osteoderms15.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-0.4987F, -0.337F, -0.9728F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false)
				.texOffs(16, 73).mirror().addBox(-0.6107F, -2.3441F, -1.1942F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-1.7164F, 2.2347F, -2.5234F, 1.5034F, 0.2543F, -1.5426F));

		PartDefinition cube_r142 = osteoderms15.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(73, 59).mirror().addBox(-0.4987F, -0.7028F, -1.008F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(72, 51).mirror().addBox(-0.6107F, -2.4283F, -2.0569F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.7164F, 2.2347F, -2.5234F, 1.0671F, 0.2543F, -1.5426F));

		PartDefinition cube_r143 = osteoderms15.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(25, 89).mirror().addBox(0.0305F, 1.4347F, 2.1668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(1.3843F, -1.6636F, -1.6687F, 0.4532F, 0.0174F, -0.7926F));

		PartDefinition cube_r144 = osteoderms15.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(93, 18).mirror().addBox(0.0405F, 1.7491F, -3.1235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(1.3843F, -1.6636F, -1.6687F, 2.2684F, 0.0174F, -0.7926F));

		PartDefinition cube_r145 = osteoderms15.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(78, 89).mirror().addBox(-0.241F, 0.6006F, 1.0574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(1.1843F, -1.7636F, -1.6687F, 0.4532F, 0.0174F, -0.7926F));

		PartDefinition cube_r146 = osteoderms15.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(40, 92).mirror().addBox(-0.231F, 0.8745F, -2.0458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(1.1843F, -1.7636F, -1.6687F, 2.2684F, 0.0174F, -0.7926F));

		PartDefinition cube_r147 = osteoderms15.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(92, 82).mirror().addBox(-0.6132F, -0.5177F, -0.2299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.3843F, -1.6636F, -1.6687F, 0.3638F, 0.0362F, -0.8003F));

		PartDefinition cube_r148 = osteoderms15.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(30, 94).mirror().addBox(-0.5964F, -0.0907F, -0.9587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(1.3843F, -1.6636F, -1.6687F, 2.5803F, 0.0362F, -0.8003F));

		PartDefinition cube_r149 = osteoderms15.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(91, 39).mirror().addBox(-0.8896F, -1.3697F, -1.8071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(91, 27).mirror().addBox(-0.9924F, -2.1572F, -3.5447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.6843F, -1.3636F, -1.6687F, 0.3638F, 0.0362F, -0.8003F));

		PartDefinition cube_r150 = osteoderms15.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(93, 67).mirror().addBox(-0.8729F, -0.8376F, 0.671F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false)
				.texOffs(93, 24).mirror().addBox(-0.9757F, -1.7514F, 2.3456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(1.6843F, -1.3636F, -1.6687F, 2.5803F, 0.0362F, -0.8003F));

		PartDefinition cube_r151 = osteoderms15.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(35, 91).mirror().addBox(-0.241F, 0.6006F, 1.0574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8157F, 0.2364F, -1.6687F, 0.5332F, 0.0585F, -1.112F));

		PartDefinition cube_r152 = osteoderms15.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(79, 92).mirror().addBox(-0.231F, 0.8745F, -2.0458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-0.8157F, 0.2364F, -1.6687F, 2.3484F, 0.0585F, -1.112F));

		PartDefinition cube_r153 = osteoderms15.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(93, 91).mirror().addBox(-0.6132F, -0.5177F, -0.2299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3157F, 0.2364F, -1.6687F, 0.4436F, 0.078F, -1.1182F));

		PartDefinition cube_r154 = osteoderms15.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(35, 94).mirror().addBox(-0.5964F, -0.0907F, -0.9587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-0.3157F, 0.2364F, -1.6687F, 2.6601F, 0.078F, -1.1182F));

		PartDefinition cube_r155 = osteoderms15.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(88, 91).mirror().addBox(-0.8896F, -1.3697F, -1.8071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(90, 0).mirror().addBox(-0.9924F, -2.1572F, -3.5447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0157F, 0.2364F, -1.6687F, 0.4436F, 0.078F, -1.1182F));

		PartDefinition cube_r156 = osteoderms15.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(5, 94).mirror().addBox(-0.8729F, -0.8376F, 0.671F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false)
				.texOffs(93, 21).mirror().addBox(-0.9757F, -1.7514F, 2.3456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-0.0157F, 0.2364F, -1.6687F, 2.6601F, 0.078F, -1.1182F));

		PartDefinition cube_r157 = osteoderms15.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(93, 15).mirror().addBox(1.4198F, 0.0F, -1.7565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false)
				.texOffs(64, 92).mirror().addBox(1.1483F, -0.8746F, -0.6788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(3.4343F, -2.5484F, 0.3356F, 2.3555F, -0.0684F, -0.1839F));

		PartDefinition cube_r158 = osteoderms15.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(40, 89).mirror().addBox(1.4098F, 0.5314F, 0.1389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(69, 89).mirror().addBox(1.1383F, -0.3027F, -0.9704F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(3.4343F, -2.5484F, 0.3356F, 0.5403F, -0.0684F, -0.1839F));

		PartDefinition cube_r159 = osteoderms15.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(94, 33).mirror().addBox(1.1295F, 1.7147F, -5.5667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false)
				.texOffs(93, 12).mirror().addBox(0.8531F, 0.9677F, -3.937F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false)
				.texOffs(93, 9).mirror().addBox(0.7502F, 0.054F, -2.2624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(3.4343F, -2.7696F, -6.7714F, 2.668F, -0.0489F, -0.19F));

		PartDefinition cube_r160 = osteoderms15.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(69, 92).mirror().addBox(1.1127F, 2.0759F, 3.9852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(91, 30).mirror().addBox(0.8363F, 1.2239F, 2.4079F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(30, 91).mirror().addBox(0.7335F, 0.4364F, 0.6703F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(3.4343F, -2.7696F, -6.7714F, 0.4514F, -0.0489F, -0.19F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.129F, -8.0756F, 0.0349F, -0.0436F, -0.0015F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(21, 23).mirror().addBox(-0.7613F, -0.1212F, -0.4157F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.344F, 6.3673F, -8.0863F, -0.3064F, -0.5375F, 0.4087F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(79, 53).mirror().addBox(-2.0027F, 0.0153F, -0.5061F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 0.7995F, -6.3237F, 0.1555F, -0.0222F, 0.1642F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(72, 72).mirror().addBox(-4.5273F, -1.3104F, -0.5061F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 0.7995F, -6.3237F, 0.1323F, 0.0849F, -0.544F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(72, 70).mirror().addBox(-5.411F, -4.0488F, -0.5061F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 0.7995F, -6.3237F, 0.0387F, 0.1522F, -1.2972F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(71, 8).mirror().addBox(-0.2939F, -0.6566F, -1.8897F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.7403F, 3.6687F, -8.5696F, 1.3281F, -0.639F, -0.5681F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(53, 16).mirror().addBox(-0.2946F, 1.6056F, -2.41F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7403F, 3.6687F, -8.5696F, -0.3474F, -0.639F, -0.5681F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(7, 78).mirror().addBox(-0.6487F, -0.2196F, -0.9697F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-4.7817F, -0.11F, -3.9335F, 0.7661F, -0.1026F, 0.0846F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(32, 63).mirror().addBox(-0.4002F, -1.0252F, -3.4006F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7817F, 0.59F, -6.9335F, 1.3595F, -0.1026F, 0.0846F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(29, 51).mirror().addBox(-0.4002F, -0.0252F, -3.0006F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.7817F, 0.59F, -6.9335F, 0.5043F, -0.1026F, 0.0846F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(43, 72).mirror().addBox(-3.0023F, 0.0417F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 0.3995F, -0.3237F, 0.0173F, -0.002F, 0.1134F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(72, 42).mirror().addBox(-5.2991F, -1.9463F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 0.3995F, -0.3237F, 0.0144F, 0.0099F, -0.6021F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(51, 52).mirror().addBox(-7.5418F, -5.0402F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 0.3995F, -0.3237F, 0.0038F, 0.017F, -1.3526F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(25, 6).mirror().addBox(-0.7613F, -0.1212F, -0.4157F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.344F, 6.3673F, -8.0863F, -0.1724F, -0.6251F, 0.4178F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(40, 23).mirror().addBox(-1.4408F, 0.0333F, -0.907F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.344F, 6.3673F, -7.3863F, -0.1233F, -0.9245F, 0.5543F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(66, 59).mirror().addBox(-0.42F, -0.8341F, -0.7861F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7403F, 3.6687F, -8.5696F, 3.1369F, -0.7129F, -0.6276F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(79, 51).mirror().addBox(-2.0027F, 0.0153F, -0.5061F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 0.5995F, -4.3237F, 0.0694F, -0.0079F, 0.1655F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(57, 49).mirror().addBox(-6.411F, -4.0488F, -0.5061F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 0.5995F, -4.3237F, 0.0151F, 0.0682F, -1.2998F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(72, 57).mirror().addBox(-4.5273F, -1.3104F, -0.5061F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 0.5995F, -4.3237F, 0.0576F, 0.0395F, -0.5486F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(38, 52).mirror().addBox(-7.5418F, -5.0402F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 0.3995F, -2.3237F, 0.0113F, 0.0511F, -1.3523F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(72, 40).mirror().addBox(-5.2991F, -1.9463F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 0.3995F, -2.3237F, 0.0432F, 0.0296F, -0.6015F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-3.0023F, 0.0417F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 0.3995F, -2.3237F, 0.052F, -0.0059F, 0.1133F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(20, 51).mirror().addBox(-0.2939F, -1.7568F, -2.476F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7403F, 3.6687F, -8.5696F, 0.8743F, -0.639F, -0.5681F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(11, 51).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7817F, 1.29F, -6.5335F, 0.2599F, -0.1026F, 0.0846F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(72, 55).mirror().addBox(-4.7378F, -1.1259F, -0.6095F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 0.8995F, -8.0237F, 0.2468F, 0.1664F, -0.8258F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(78, 65).mirror().addBox(-2.0405F, 0.2926F, -0.6095F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.493F, 0.8995F, -8.0237F, 0.2949F, -0.0331F, -0.1358F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(21, 23).addBox(-0.2387F, -0.1212F, -0.4157F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.344F, 6.3673F, -8.0863F, -0.3064F, 0.5375F, -0.4087F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(25, 6).addBox(-0.2387F, -0.1212F, -0.4157F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.344F, 6.3673F, -8.0863F, -0.1724F, 0.6251F, -0.4178F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(40, 23).addBox(0.4408F, 0.0333F, -0.907F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.344F, 6.3673F, -7.3863F, -0.1233F, 0.9245F, -0.5543F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(40, 6).addBox(-4.344F, -0.474F, -2.8107F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.344F, 6.3673F, -7.3863F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(51, 85).addBox(0.0F, -2.2254F, -0.0249F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3201F, -0.8949F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(30, 83).addBox(0.0F, -2.4F, 3.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 24).addBox(0.0F, -2.4F, 1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 32).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1799F, -5.8949F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(66, 59).addBox(-0.58F, -0.8341F, -0.7861F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7403F, 3.6687F, -8.5696F, 3.1369F, 0.7129F, 0.6276F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(72, 70).addBox(2.411F, -4.0488F, -0.5061F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 0.7995F, -6.3237F, 0.0387F, -0.1522F, 1.2972F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(72, 72).addBox(1.5273F, -1.3104F, -0.5061F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 0.7995F, -6.3237F, 0.1323F, -0.0849F, 0.544F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(79, 53).addBox(0.0027F, 0.0153F, -0.5061F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 0.7995F, -6.3237F, 0.1555F, 0.0222F, -0.1642F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(79, 51).addBox(0.0027F, 0.0153F, -0.5061F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 0.5995F, -4.3237F, 0.0694F, 0.0079F, -0.1655F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(57, 49).addBox(2.411F, -4.0488F, -0.5061F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 0.5995F, -4.3237F, 0.0151F, -0.0682F, 1.2998F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(72, 57).addBox(1.5273F, -1.3104F, -0.5061F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 0.5995F, -4.3237F, 0.0576F, -0.0395F, 0.5486F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(51, 52).addBox(2.5418F, -5.0402F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 0.3995F, -0.3237F, 0.0038F, -0.017F, 1.3526F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(72, 42).addBox(2.2991F, -1.9463F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 0.3995F, -0.3237F, 0.0144F, -0.0099F, 0.6021F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(43, 72).addBox(0.0023F, 0.0417F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 0.3995F, -0.3237F, 0.0173F, 0.002F, -0.1134F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(38, 52).addBox(2.5418F, -5.0402F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 0.3995F, -2.3237F, 0.0113F, -0.0511F, 1.3523F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(72, 40).addBox(2.2991F, -1.9463F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 0.3995F, -2.3237F, 0.0432F, -0.0296F, 0.6015F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(0, 72).addBox(0.0023F, 0.0417F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 0.3995F, -2.3237F, 0.052F, 0.0059F, -0.1133F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(53, 16).addBox(-0.7054F, 1.6056F, -2.41F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7403F, 3.6687F, -8.5696F, -0.3474F, 0.639F, 0.5681F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(71, 8).addBox(-0.7061F, -0.6566F, -1.8897F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.7403F, 3.6687F, -8.5696F, 1.3281F, 0.639F, 0.5681F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(20, 51).addBox(-0.7061F, -1.7568F, -2.476F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7403F, 3.6687F, -8.5696F, 0.8743F, 0.639F, 0.5681F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(32, 63).addBox(-0.5998F, -1.0252F, -3.4006F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7817F, 0.59F, -6.9335F, 1.3595F, 0.1026F, -0.0846F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(29, 51).addBox(-0.5998F, -0.0252F, -3.0006F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.7817F, 0.59F, -6.9335F, 0.5043F, 0.1026F, -0.0846F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(7, 78).addBox(-0.3513F, -0.2196F, -0.9697F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(4.7817F, -0.11F, -3.9335F, 0.7661F, 0.1026F, -0.0846F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(11, 51).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7817F, 1.29F, -6.5335F, 0.2599F, 0.1026F, -0.0846F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(72, 55).addBox(1.7378F, -1.1259F, -0.6095F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 0.8995F, -8.0237F, 0.2468F, -0.1664F, 0.8258F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(78, 65).addBox(0.0405F, 0.2926F, -0.6095F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.493F, 0.8995F, -8.0237F, 0.2949F, 0.0331F, 0.1358F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(26, 95).addBox(1.0F, -1.9611F, 0.0073F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 80).addBox(1.0F, -2.1611F, 2.0073F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 21).addBox(0.5F, -0.0611F, 0.0073F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 0.8906F, -8.8237F, 0.2007F, 0.0F, 0.0F));

		PartDefinition osteoderms3 = chest.addOrReplaceChild("osteoderms3", CubeListBuilder.create(), PartPose.offset(4.9F, 0.5843F, -8.1852F));

		PartDefinition cube_r215 = osteoderms3.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(86, 52).addBox(-0.5F, -0.5762F, -0.682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.2271F, 2.8421F, 6.7684F, 0.685F, -0.0354F, 1.7451F));

		PartDefinition cube_r216 = osteoderms3.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(88, 12).addBox(-0.5F, -0.3208F, -0.4173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(2.2271F, 2.8421F, 6.7684F, 1.4268F, -0.0354F, 1.7451F));

		PartDefinition cube_r217 = osteoderms3.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(0, 87).addBox(-0.5F, -0.3208F, -0.4173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(2.2271F, 2.8421F, 4.9684F, 1.4268F, -0.0354F, 1.7451F));

		PartDefinition cube_r218 = osteoderms3.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(86, 40).addBox(-0.5F, -0.5762F, -0.682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.2271F, 2.8421F, 4.9684F, 0.685F, -0.0354F, 1.7451F));

		PartDefinition cube_r219 = osteoderms3.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(88, 9).addBox(-0.5F, -0.3208F, -0.4173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(1.8271F, 2.8421F, 3.1684F, 1.4268F, -0.0354F, 1.7451F));

		PartDefinition cube_r220 = osteoderms3.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(86, 49).addBox(-0.5F, -0.5762F, -0.682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.8271F, 2.8421F, 3.1684F, 0.685F, -0.0354F, 1.7451F));

		PartDefinition cube_r221 = osteoderms3.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(88, 6).addBox(-0.5F, -0.3208F, -0.4173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(1.1271F, 2.6421F, 1.5684F, 1.4975F, 0.1803F, 1.8898F));

		PartDefinition cube_r222 = osteoderms3.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(46, 86).addBox(-0.5F, -0.5762F, -0.682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1271F, 2.6421F, 1.5684F, 0.7557F, 0.1803F, 1.8898F));

		PartDefinition cube_r223 = osteoderms3.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(87, 76).addBox(-0.5F, -0.3208F, -0.4173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.5271F, 2.1421F, 0.0684F, 1.4975F, 0.1803F, 1.8898F));

		PartDefinition cube_r224 = osteoderms3.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(41, 86).addBox(-0.5F, -0.5762F, -0.682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5271F, 2.1421F, 0.0684F, 0.7557F, 0.1803F, 1.8898F));

		PartDefinition cube_r225 = osteoderms3.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(74, 92).addBox(-0.5231F, -2.3143F, 2.4359F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F))
				.texOffs(93, 42).addBox(-0.4219F, -1.2474F, 1.09F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.4327F, -1.2282F, 3.5389F, 2.734F, 0.0086F, 0.7719F));

		PartDefinition cube_r226 = osteoderms3.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(45, 89).addBox(-0.5231F, -3.1387F, -2.9345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(78, 86).addBox(-0.4219F, -2.0211F, -1.6304F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4327F, -1.2282F, 3.5389F, 0.9712F, 0.0086F, 0.7719F));

		PartDefinition cube_r227 = osteoderms3.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(0, 93).addBox(-0.4219F, -1.2474F, 1.09F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.6673F, 0.7718F, 3.5389F, 2.7611F, 0.1709F, 1.0449F));

		PartDefinition cube_r228 = osteoderms3.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(54, 86).addBox(-0.4219F, -2.0211F, -1.6304F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6673F, 0.7718F, 3.5389F, 0.9983F, 0.1709F, 1.0449F));

		PartDefinition cube_r229 = osteoderms3.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(45, 92).addBox(-0.3994F, -0.2655F, -0.3222F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.6673F, 0.7718F, 3.5389F, 2.9007F, 0.1709F, 1.0449F));

		PartDefinition cube_r230 = osteoderms3.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(90, 3).addBox(-0.3827F, -0.9209F, -0.7525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6673F, 0.7718F, 3.5389F, 0.6842F, 0.1709F, 1.0449F));

		PartDefinition cube_r231 = osteoderms3.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(91, 70).addBox(-0.4923F, -0.1504F, 1.0178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6673F, 0.7718F, 3.5389F, 0.564F, 0.1946F, 1.0431F));

		PartDefinition cube_r232 = osteoderms3.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(50, 92).addBox(-0.509F, 0.6846F, -2.0029F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.6673F, 0.7718F, 3.5389F, 2.7806F, 0.1946F, 1.0431F));

		PartDefinition cube_r233 = osteoderms3.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(15, 92).addBox(-0.603F, 0.4442F, 2.5883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6673F, 0.7718F, 3.5389F, 0.4778F, 0.2113F, 1.04F));

		PartDefinition cube_r234 = osteoderms3.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(94, 45).addBox(-0.6197F, 1.581F, -3.4229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.6673F, 0.7718F, 3.5389F, 2.6944F, 0.2113F, 1.04F));

		PartDefinition cube_r235 = osteoderms3.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(89, 73).addBox(-0.3827F, -0.9209F, -0.7525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4327F, -1.2282F, 3.5389F, 0.6571F, 0.0086F, 0.7719F));

		PartDefinition cube_r236 = osteoderms3.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(92, 76).addBox(-0.3994F, -0.2655F, -0.3222F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.4327F, -1.2282F, 3.5389F, 2.8736F, 0.0086F, 0.7719F));

		PartDefinition cube_r237 = osteoderms3.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(59, 91).addBox(-0.4923F, -0.1504F, 1.0178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4327F, -1.2282F, 3.5389F, 0.5372F, 0.0322F, 0.7694F));

		PartDefinition cube_r238 = osteoderms3.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(25, 92).addBox(-0.509F, 0.6846F, -2.0029F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.4327F, -1.2282F, 3.5389F, 2.7537F, 0.0322F, 0.7694F));

		PartDefinition cube_r239 = osteoderms3.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(10, 92).addBox(-0.603F, 0.4442F, 2.5883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4327F, -1.2282F, 3.5389F, 0.4514F, 0.0489F, 0.7659F));

		PartDefinition cube_r240 = osteoderms3.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(94, 36).addBox(-0.6197F, 1.581F, -3.4229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.4327F, -1.2282F, 3.5389F, 2.668F, 0.0489F, 0.7659F));

		PartDefinition cube_r241 = osteoderms3.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(91, 49).addBox(-1.6686F, -0.3901F, -0.817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.2843F, -3.0133F, 6.9901F, 0.4514F, 0.0489F, 0.19F));

		PartDefinition cube_r242 = osteoderms3.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(92, 79).addBox(-1.6854F, -0.6365F, -0.7072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-2.2843F, -3.0133F, 6.9901F, 2.668F, 0.0489F, 0.19F));

		PartDefinition cube_r243 = osteoderms3.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(5, 91).addBox(-1.6686F, -0.3901F, -0.817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.2843F, -3.007F, 5.2784F, 0.5372F, 0.0322F, 0.1935F));

		PartDefinition cube_r244 = osteoderms3.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(93, 6).addBox(-1.6854F, -0.6365F, -0.7072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-2.2843F, -3.007F, 5.2784F, 2.7537F, 0.0322F, 0.1935F));

		PartDefinition cube_r245 = osteoderms3.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(93, 88).addBox(-1.6978F, -0.6466F, -0.4383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-2.2818F, -2.6622F, 3.5959F, 2.8736F, 0.0086F, 0.1959F));

		PartDefinition cube_r246 = osteoderms3.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(90, 64).addBox(-1.6811F, -0.5297F, -0.8664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.2867F, -2.6438F, 3.4582F, 0.6571F, 0.0086F, 0.1959F));

		PartDefinition cube_r247 = osteoderms3.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(64, 89).addBox(-1.8086F, -0.1046F, -0.3539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(54, 89).addBox(-1.9097F, -1.2222F, -1.6581F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.2867F, -2.2854F, 1.3038F, 0.9712F, 0.0086F, 0.1959F));

		PartDefinition cube_r248 = osteoderms3.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(93, 85).addBox(-1.8086F, -0.4321F, -0.916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F))
				.texOffs(20, 92).addBox(-1.9097F, -1.499F, 0.4299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-2.2818F, -2.3038F, 1.4415F, 2.734F, 0.0086F, 0.1959F));

		PartDefinition osteoderms16 = chest.addOrReplaceChild("osteoderms16", CubeListBuilder.create(), PartPose.offset(-4.9F, 0.5843F, -8.1852F));

		PartDefinition cube_r249 = osteoderms16.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(86, 52).mirror().addBox(-0.5F, -0.5762F, -0.682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.2271F, 2.8421F, 6.7684F, 0.685F, 0.0354F, -1.7451F));

		PartDefinition cube_r250 = osteoderms16.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(88, 12).mirror().addBox(-0.5F, -0.3208F, -0.4173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-2.2271F, 2.8421F, 6.7684F, 1.4268F, 0.0354F, -1.7451F));

		PartDefinition cube_r251 = osteoderms16.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(-0.5F, -0.3208F, -0.4173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-2.2271F, 2.8421F, 4.9684F, 1.4268F, 0.0354F, -1.7451F));

		PartDefinition cube_r252 = osteoderms16.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(86, 40).mirror().addBox(-0.5F, -0.5762F, -0.682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.2271F, 2.8421F, 4.9684F, 0.685F, 0.0354F, -1.7451F));

		PartDefinition cube_r253 = osteoderms16.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(88, 9).mirror().addBox(-0.5F, -0.3208F, -0.4173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-1.8271F, 2.8421F, 3.1684F, 1.4268F, 0.0354F, -1.7451F));

		PartDefinition cube_r254 = osteoderms16.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(86, 49).mirror().addBox(-0.5F, -0.5762F, -0.682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.8271F, 2.8421F, 3.1684F, 0.685F, 0.0354F, -1.7451F));

		PartDefinition cube_r255 = osteoderms16.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(88, 6).mirror().addBox(-0.5F, -0.3208F, -0.4173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-1.1271F, 2.6421F, 1.5684F, 1.4975F, -0.1803F, -1.8898F));

		PartDefinition cube_r256 = osteoderms16.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(46, 86).mirror().addBox(-0.5F, -0.5762F, -0.682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1271F, 2.6421F, 1.5684F, 0.7557F, -0.1803F, -1.8898F));

		PartDefinition cube_r257 = osteoderms16.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(87, 76).mirror().addBox(-0.5F, -0.3208F, -0.4173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-0.5271F, 2.1421F, 0.0684F, 1.4975F, -0.1803F, -1.8898F));

		PartDefinition cube_r258 = osteoderms16.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(41, 86).mirror().addBox(-0.5F, -0.5762F, -0.682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5271F, 2.1421F, 0.0684F, 0.7557F, -0.1803F, -1.8898F));

		PartDefinition cube_r259 = osteoderms16.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(74, 92).mirror().addBox(-0.4769F, -2.3143F, 2.4359F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false)
				.texOffs(93, 42).mirror().addBox(-0.5781F, -1.2474F, 1.09F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.4327F, -1.2282F, 3.5389F, 2.734F, -0.0086F, -0.7719F));

		PartDefinition cube_r260 = osteoderms16.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(45, 89).mirror().addBox(-0.4769F, -3.1387F, -2.9345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(78, 86).mirror().addBox(-0.5781F, -2.0211F, -1.6304F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4327F, -1.2282F, 3.5389F, 0.9712F, -0.0086F, -0.7719F));

		PartDefinition cube_r261 = osteoderms16.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(0, 93).mirror().addBox(-0.5781F, -1.2474F, 1.09F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-0.6673F, 0.7718F, 3.5389F, 2.7611F, -0.1709F, -1.0449F));

		PartDefinition cube_r262 = osteoderms16.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(54, 86).mirror().addBox(-0.5781F, -2.0211F, -1.6304F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6673F, 0.7718F, 3.5389F, 0.9983F, -0.1709F, -1.0449F));

		PartDefinition cube_r263 = osteoderms16.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(45, 92).mirror().addBox(-0.6006F, -0.2655F, -0.3222F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-0.6673F, 0.7718F, 3.5389F, 2.9007F, -0.1709F, -1.0449F));

		PartDefinition cube_r264 = osteoderms16.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(90, 3).mirror().addBox(-0.6173F, -0.9209F, -0.7525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6673F, 0.7718F, 3.5389F, 0.6842F, -0.1709F, -1.0449F));

		PartDefinition cube_r265 = osteoderms16.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(91, 70).mirror().addBox(-0.5077F, -0.1504F, 1.0178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6673F, 0.7718F, 3.5389F, 0.564F, -0.1946F, -1.0431F));

		PartDefinition cube_r266 = osteoderms16.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(50, 92).mirror().addBox(-0.491F, 0.6846F, -2.0029F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-0.6673F, 0.7718F, 3.5389F, 2.7806F, -0.1946F, -1.0431F));

		PartDefinition cube_r267 = osteoderms16.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(15, 92).mirror().addBox(-0.397F, 0.4442F, 2.5883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6673F, 0.7718F, 3.5389F, 0.4778F, -0.2113F, -1.04F));

		PartDefinition cube_r268 = osteoderms16.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(94, 45).mirror().addBox(-0.3803F, 1.581F, -3.4229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-0.6673F, 0.7718F, 3.5389F, 2.6944F, -0.2113F, -1.04F));

		PartDefinition cube_r269 = osteoderms16.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(89, 73).mirror().addBox(-0.6173F, -0.9209F, -0.7525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4327F, -1.2282F, 3.5389F, 0.6571F, -0.0086F, -0.7719F));

		PartDefinition cube_r270 = osteoderms16.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(92, 76).mirror().addBox(-0.6006F, -0.2655F, -0.3222F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.4327F, -1.2282F, 3.5389F, 2.8736F, -0.0086F, -0.7719F));

		PartDefinition cube_r271 = osteoderms16.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(59, 91).mirror().addBox(-0.5077F, -0.1504F, 1.0178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4327F, -1.2282F, 3.5389F, 0.5372F, -0.0322F, -0.7694F));

		PartDefinition cube_r272 = osteoderms16.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(25, 92).mirror().addBox(-0.491F, 0.6846F, -2.0029F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.4327F, -1.2282F, 3.5389F, 2.7537F, -0.0322F, -0.7694F));

		PartDefinition cube_r273 = osteoderms16.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(10, 92).mirror().addBox(-0.397F, 0.4442F, 2.5883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4327F, -1.2282F, 3.5389F, 0.4514F, -0.0489F, -0.7659F));

		PartDefinition cube_r274 = osteoderms16.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(94, 36).mirror().addBox(-0.3803F, 1.581F, -3.4229F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.4327F, -1.2282F, 3.5389F, 2.668F, -0.0489F, -0.7659F));

		PartDefinition cube_r275 = osteoderms16.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(91, 49).mirror().addBox(0.6686F, -0.3901F, -0.817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.2843F, -3.0133F, 6.9901F, 0.4514F, -0.0489F, -0.19F));

		PartDefinition cube_r276 = osteoderms16.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(92, 79).mirror().addBox(0.6854F, -0.6365F, -0.7072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(2.2843F, -3.0133F, 6.9901F, 2.668F, -0.0489F, -0.19F));

		PartDefinition cube_r277 = osteoderms16.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(5, 91).mirror().addBox(0.6686F, -0.3901F, -0.817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.2843F, -3.007F, 5.2784F, 0.5372F, -0.0322F, -0.1935F));

		PartDefinition cube_r278 = osteoderms16.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(93, 6).mirror().addBox(0.6854F, -0.6365F, -0.7072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(2.2843F, -3.007F, 5.2784F, 2.7537F, -0.0322F, -0.1935F));

		PartDefinition cube_r279 = osteoderms16.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(93, 88).mirror().addBox(0.6978F, -0.6466F, -0.4383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(2.2818F, -2.6622F, 3.5959F, 2.8736F, -0.0086F, -0.1959F));

		PartDefinition cube_r280 = osteoderms16.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(90, 64).mirror().addBox(0.6811F, -0.5297F, -0.8664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.2867F, -2.6438F, 3.4582F, 0.6571F, -0.0086F, -0.1959F));

		PartDefinition cube_r281 = osteoderms16.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(64, 89).mirror().addBox(0.8086F, -0.1046F, -0.3539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(54, 89).mirror().addBox(0.9097F, -1.2222F, -1.6581F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.2867F, -2.2854F, 1.3038F, 0.9712F, -0.0086F, -0.1959F));

		PartDefinition cube_r282 = osteoderms16.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(93, 85).mirror().addBox(0.8086F, -0.4321F, -0.916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false)
				.texOffs(20, 92).mirror().addBox(0.9097F, -1.499F, 0.4299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(2.2818F, -2.3038F, 1.4415F, 2.734F, -0.0086F, -0.1959F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.7F, 4.1161F, -8.7485F, 0.0044F, 0.0338F, -0.0021F));

		PartDefinition cube_r283 = leftarm.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(78, 8).addBox(-0.2906F, -2.8552F, -0.8092F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2984F, 3.0149F, 1.2277F, 0.4823F, -0.8654F, -0.7515F));

		PartDefinition cube_r284 = leftarm.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(65, 83).addBox(-0.2906F, -1.0857F, -0.1436F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2984F, 3.0149F, 1.2277F, 1.163F, -0.8654F, -0.7515F));

		PartDefinition cube_r285 = leftarm.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(5, 82).addBox(-0.5F, -1.1F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2329F, 0.6382F, 0.4713F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r286 = leftarm.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(31, 74).addBox(0.0F, -2.9481F, -0.862F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.7329F, 2.6425F, 1.9228F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r287 = leftarm.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(76, 67).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2329F, 4.0044F, 2.1792F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r288 = leftarm.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(64, 86).addBox(-2.3F, -1.1695F, -1.4508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8877F, 4.0815F, 2.6361F, 0.9048F, 0.3465F, 1.6768F));

		PartDefinition cube_r289 = leftarm.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(88, 85).addBox(-0.5F, -0.597F, -0.6014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5929F, 0.8244F, 0.9032F, 0.2781F, 0.8081F, 0.8098F));

		PartDefinition cube_r290 = leftarm.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(15, 89).addBox(-0.5F, -0.3692F, -0.449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.5929F, 0.8244F, 0.9032F, 0.7144F, 0.8081F, 0.8098F));

		PartDefinition cube_r291 = leftarm.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(78, 16).addBox(0.0F, 2.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.7329F, 1.3425F, 0.1228F, 0.6894F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create().texOffs(55, 74).addBox(-1.1F, 0.8605F, -2.2405F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2329F, 3.724F, 3.9546F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r292 = leftarm2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(78, 24).addBox(0.499F, -2.0489F, -0.9306F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.499F, 0.9605F, 0.0595F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r293 = leftarm2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(26, 65).addBox(0.499F, -0.5F, 0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.499F, 0.9605F, -1.4405F, -0.3054F, 0.0F, 0.0F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offset(0.0F, 5.5121F, -1.474F));

		PartDefinition cube_r294 = lefthand.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(71, 24).addBox(-0.8F, -0.5F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5729F, 0.0105F, -0.4836F, 0.0F, -0.7767F, 0.0F));

		PartDefinition cube_r295 = lefthand.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(23, 61).addBox(-0.4F, 0.0F, -1.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.499F, -0.4895F, -0.8405F, 0.0F, -0.2182F, 0.0F));

		PartDefinition lefthand2 = leftarm2.addOrReplaceChild("lefthand2", CubeListBuilder.create().texOffs(67, 74).addBox(-0.499F, -0.4895F, -0.3405F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 4.5207F, -1.6045F, 0.1309F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.7F, 4.1161F, -8.7485F, -0.4756F, -0.0338F, 0.0021F));

		PartDefinition cube_r296 = rightarm.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(78, 12).addBox(-0.7094F, -2.8552F, -0.8092F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2984F, 3.0149F, 1.2277F, 0.4823F, 0.8654F, 0.7515F));

		PartDefinition cube_r297 = rightarm.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(85, 0).addBox(-0.7094F, -1.0857F, -0.1436F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2984F, 3.0149F, 1.2277F, 1.163F, 0.8654F, 0.7515F));

		PartDefinition cube_r298 = rightarm.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(33, 82).addBox(-0.5F, -1.1F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2329F, 0.6382F, 0.4713F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r299 = rightarm.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(43, 74).addBox(-1.0F, -2.9481F, -0.862F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.7329F, 2.6425F, 1.9228F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r300 = rightarm.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(77, 35).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2329F, 4.0044F, 2.1792F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r301 = rightarm.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(83, 86).addBox(1.3F, -1.1695F, -1.4508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8877F, 4.0815F, 2.6361F, 0.9048F, -0.3465F, -1.6768F));

		PartDefinition cube_r302 = rightarm.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(88, 88).addBox(-0.5F, -0.597F, -0.6014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5929F, 0.8244F, 0.9032F, 0.2781F, -0.8081F, -0.8098F));

		PartDefinition cube_r303 = rightarm.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(20, 89).addBox(-0.5F, -0.3692F, -0.449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.5929F, 0.8244F, 0.9032F, 0.7144F, -0.8081F, -0.8098F));

		PartDefinition cube_r304 = rightarm.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(78, 20).addBox(-1.0F, 2.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.7329F, 1.3425F, 0.1228F, 0.6894F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create().texOffs(74, 74).addBox(0.1F, 0.8605F, -2.2405F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2329F, 3.724F, 3.9546F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r305 = rightarm2.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(36, 78).addBox(-1.499F, -2.0489F, -0.9306F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.499F, 0.9605F, 0.0595F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r306 = rightarm2.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(31, 68).addBox(-1.499F, -0.5F, 0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.499F, 0.9605F, -1.4405F, -0.3054F, 0.0F, 0.0F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.5121F, -1.474F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r307 = righthand.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(36, 71).addBox(-0.2F, -0.5F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5729F, 0.0105F, -0.4836F, 0.0F, 0.7767F, 0.0F));

		PartDefinition cube_r308 = righthand.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(0, 62).addBox(-1.6F, 0.0F, -1.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.499F, -0.4895F, -0.8405F, 0.0F, 0.2182F, 0.0F));

		PartDefinition righthand2 = rightarm2.addOrReplaceChild("righthand2", CubeListBuilder.create().texOffs(36, 75).addBox(-1.501F, -0.4895F, -0.3405F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, 4.5207F, -1.6045F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.394F, -8.7058F, 0.0793F, -0.1672F, -0.1008F));

		PartDefinition cube_r309 = neck.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(0, 33).addBox(-2.0F, -2.1F, -0.5F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.0616F, -4.4668F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r310 = neck.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(63, 95).addBox(1.0F, -1.4352F, -0.9909F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.6616F, -0.8668F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r311 = neck.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(40, 16).addBox(0.5F, -1.1F, -0.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.0616F, -4.4668F, -0.1309F, 0.0F, 0.0F));

		PartDefinition osteoderms2 = neck.addOrReplaceChild("osteoderms2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8471F, 0.9936F, -3.9968F, 0.0F, 0.2443F, 0.0F));

		PartDefinition cube_r312 = osteoderms2.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(81, 55).addBox(-0.5F, -0.592F, -0.649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5066F, -2.6909F, -0.0326F, 0.3464F, 0.0407F, 1.0445F));

		PartDefinition cube_r313 = osteoderms2.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(65, 80).addBox(-0.5F, -0.6097F, -0.3635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.5066F, -2.6909F, -0.0326F, -0.8841F, 0.0407F, 1.0445F));

		PartDefinition cube_r314 = osteoderms2.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(83, 9).addBox(-0.5F, -0.1F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.9101F, -0.3712F, 0.9319F, 0.2361F, 0.1253F, 2.0915F));

		PartDefinition cube_r315 = osteoderms2.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(19, 69).addBox(-0.5134F, -0.7539F, -1.0913F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.1596F, -1.0637F, 0.2799F, 0.9168F, 0.1253F, 2.0915F));

		PartDefinition cube_r316 = osteoderms2.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(67, 28).addBox(-0.5F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.2517F, -1.0786F, 0.4343F, -1.867F, 0.1253F, 2.0915F));

		PartDefinition cube_r317 = osteoderms2.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(83, 67).addBox(-0.5F, -0.5869F, -0.342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-1.8903F, -2.9811F, -0.3888F, -0.5344F, -0.1742F, 0.062F));

		PartDefinition cube_r318 = osteoderms2.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(20, 86).addBox(-0.5F, -0.6F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8903F, -2.9811F, -0.3888F, 0.5565F, -0.1742F, 0.062F));

		PartDefinition osteoderms11 = neck.addOrReplaceChild("osteoderms11", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8471F, 0.9936F, -3.9968F, 0.0F, -0.2443F, 0.0F));

		PartDefinition cube_r319 = osteoderms11.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(81, 55).mirror().addBox(-0.5F, -0.592F, -0.649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.5066F, -2.6909F, -0.0326F, 0.3464F, -0.0407F, -1.0445F));

		PartDefinition cube_r320 = osteoderms11.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(65, 80).mirror().addBox(-0.5F, -0.6097F, -0.3635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.5066F, -2.6909F, -0.0326F, -0.8841F, -0.0407F, -1.0445F));

		PartDefinition cube_r321 = osteoderms11.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(83, 9).mirror().addBox(-0.5F, -0.1F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.9101F, -0.3712F, 0.9319F, 0.2361F, -0.1253F, -2.0915F));

		PartDefinition cube_r322 = osteoderms11.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(19, 69).mirror().addBox(-0.4866F, -0.7539F, -1.0913F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.1596F, -1.0637F, 0.2799F, 0.9168F, -0.1253F, -2.0915F));

		PartDefinition cube_r323 = osteoderms11.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(67, 28).mirror().addBox(-0.5F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.2517F, -1.0786F, 0.4343F, -1.867F, -0.1253F, -2.0915F));

		PartDefinition cube_r324 = osteoderms11.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(83, 67).mirror().addBox(-0.5F, -0.5869F, -0.342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(1.8903F, -2.9811F, -0.3888F, -0.5344F, 0.1742F, -0.062F));

		PartDefinition cube_r325 = osteoderms11.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(20, 86).mirror().addBox(-0.5F, -0.6F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8903F, -2.9811F, -0.3888F, 0.5565F, 0.1742F, -0.062F));

		PartDefinition osteoderms9 = neck.addOrReplaceChild("osteoderms9", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6213F, 0.6936F, -0.8918F, 0.0F, 0.2443F, 0.0F));

		PartDefinition cube_r326 = osteoderms9.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(81, 70).addBox(0.0273F, -0.3667F, -0.8257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5066F, -2.6909F, -0.0326F, 0.3464F, 0.0407F, 1.0445F));

		PartDefinition cube_r327 = osteoderms9.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(80, 3).addBox(0.0273F, -0.3679F, -0.2101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.5066F, -2.6909F, -0.0326F, -0.8841F, 0.0407F, 1.0445F));

		PartDefinition cube_r328 = osteoderms9.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(15, 86).addBox(0.4341F, -2.4032F, 0.1615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5066F, -1.3909F, -0.0326F, 0.3464F, 0.0407F, 1.8648F));

		PartDefinition cube_r329 = osteoderms9.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(70, 83).addBox(0.4341F, -1.9783F, -1.8003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.5066F, -1.3909F, -0.0326F, -0.8841F, 0.0407F, 1.8648F));

		PartDefinition cube_r330 = osteoderms9.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(58, 36).addBox(-1.0052F, -0.6374F, -0.3895F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-1.8903F, -2.9811F, -0.3888F, -0.5344F, -0.1742F, 0.062F));

		PartDefinition cube_r331 = osteoderms9.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(86, 70).addBox(-1.0052F, -0.6654F, -0.6271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8903F, -2.9811F, -0.3888F, 0.5565F, -0.1742F, 0.062F));

		PartDefinition osteoderms17 = neck.addOrReplaceChild("osteoderms17", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6213F, 0.6936F, -0.8918F, 0.0F, -0.2443F, 0.0F));

		PartDefinition cube_r332 = osteoderms17.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(81, 70).mirror().addBox(-1.0273F, -0.3667F, -0.8257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.5066F, -2.6909F, -0.0326F, 0.3464F, -0.0407F, -1.0445F));

		PartDefinition cube_r333 = osteoderms17.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(80, 3).mirror().addBox(-1.0273F, -0.3679F, -0.2101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.5066F, -2.6909F, -0.0326F, -0.8841F, -0.0407F, -1.0445F));

		PartDefinition cube_r334 = osteoderms17.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(15, 86).mirror().addBox(-1.4341F, -2.4032F, 0.1615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.5066F, -1.3909F, -0.0326F, 0.3464F, -0.0407F, -1.8648F));

		PartDefinition cube_r335 = osteoderms17.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(70, 83).mirror().addBox(-1.4341F, -1.9783F, -1.8003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.5066F, -1.3909F, -0.0326F, -0.8841F, -0.0407F, -1.8648F));

		PartDefinition cube_r336 = osteoderms17.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(58, 36).mirror().addBox(0.0052F, -0.6374F, -0.3895F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(1.8903F, -2.9811F, -0.3888F, -0.5344F, 0.1742F, -0.062F));

		PartDefinition cube_r337 = osteoderms17.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(86, 70).mirror().addBox(0.0052F, -0.6654F, -0.6271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8903F, -2.9811F, -0.3888F, 0.5565F, 0.1742F, -0.062F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4617F, -4.7211F, -0.1757F, -0.144F, -0.0631F));

		PartDefinition cube_r338 = neck2.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(28, 40).addBox(-1.5F, -2.0F, -0.2F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(33, 45).addBox(0.0F, -1.0F, -1.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.0233F, -2.5398F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r339 = neck2.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(54, 39).addBox(-1.1F, -1.9045F, -0.0075F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0015F))
				.texOffs(58, 28).addBox(-1.1F, -0.9045F, 1.9925F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0015F)), PartPose.offsetAndRotation(0.1F, 1.7692F, -3.9072F, -0.1047F, 0.0F, 0.0F));

		PartDefinition osteoderms = neck2.addOrReplaceChild("osteoderms", CubeListBuilder.create(), PartPose.offset(2.4205F, 0.4551F, -2.0821F));

		PartDefinition cube_r340 = osteoderms.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(89, 36).addBox(-0.5F, -0.7423F, -0.3996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7273F, -1.833F, 0.4189F, 1.9261F, 0.1304F, 1.2158F));

		PartDefinition cube_r341 = osteoderms.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(22, 80).addBox(-0.5F, -0.5897F, -0.2535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.7273F, -1.833F, 0.4189F, -0.3864F, 0.1304F, 1.2158F));

		PartDefinition cube_r342 = osteoderms.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(60, 82).addBox(-0.5F, -0.741F, -0.4757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.1966F, -0.3117F, 0.7127F, -1.5075F, 0.2096F, 2.0403F));

		PartDefinition cube_r343 = osteoderms.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(72, 79).addBox(-0.5F, -1.1346F, -0.2986F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1966F, -0.3117F, 0.7127F, 2.5155F, 0.2096F, 2.0403F));

		PartDefinition cube_r344 = osteoderms.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(85, 61).addBox(-1.0F, -0.7546F, -0.5149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-1.0205F, -1.8239F, 0.4294F, 0.4363F, 0.0F, 0.2182F));

		PartDefinition cube_r345 = osteoderms.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(85, 64).addBox(-1.0F, -0.8075F, -0.2993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0205F, -1.8239F, 0.4294F, -0.5236F, 0.0F, 0.2182F));

		PartDefinition osteoderms10 = neck2.addOrReplaceChild("osteoderms10", CubeListBuilder.create(), PartPose.offset(-2.4205F, 0.4551F, -2.0821F));

		PartDefinition cube_r346 = osteoderms10.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(89, 36).mirror().addBox(-0.5F, -0.7423F, -0.3996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7273F, -1.833F, 0.4189F, 1.9261F, -0.1304F, -1.2158F));

		PartDefinition cube_r347 = osteoderms10.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(22, 80).mirror().addBox(-0.5F, -0.5897F, -0.2535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.7273F, -1.833F, 0.4189F, -0.3864F, -0.1304F, -1.2158F));

		PartDefinition cube_r348 = osteoderms10.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(60, 82).mirror().addBox(-0.5F, -0.741F, -0.4757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.1966F, -0.3117F, 0.7127F, -1.5075F, -0.2096F, -2.0403F));

		PartDefinition cube_r349 = osteoderms10.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(72, 79).mirror().addBox(-0.5F, -1.1346F, -0.2986F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1966F, -0.3117F, 0.7127F, 2.5155F, -0.2096F, -2.0403F));

		PartDefinition cube_r350 = osteoderms10.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(85, 61).mirror().addBox(0.0F, -0.7546F, -0.5149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(1.0205F, -1.8239F, 0.4294F, 0.4363F, 0.0F, -0.2182F));

		PartDefinition cube_r351 = osteoderms10.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(85, 64).mirror().addBox(0.0F, -0.8075F, -0.2993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0205F, -1.8239F, 0.4294F, -0.5236F, 0.0F, -0.2182F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3771F, -4.0846F, -0.0219F, -0.2279F, -0.208F));

		PartDefinition cube_r352 = head.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(38, 54).addBox(-2.5873F, 0.0384F, -1.0184F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(1.5873F, -0.8469F, -2.0721F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r353 = head.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(87, 82).addBox(-2.2873F, 1.2299F, -2.5918F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.5873F, -0.8469F, -2.0721F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r354 = head.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(55, 79).mirror().addBox(-0.7F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8231F, 0.1341F, -1.5704F, 0.2182F, -0.0349F, 0.0F));

		PartDefinition cube_r355 = head.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(47, 34).mirror().addBox(-0.0278F, -0.1183F, -3.0347F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.5873F, -0.8469F, -2.0721F, 0.3586F, -0.3147F, 0.0019F));

		PartDefinition cube_r356 = head.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(88, 24).mirror().addBox(0.3621F, 0.9811F, -1.8084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5873F, -0.8469F, -2.0721F, 0.0F, -0.0175F, 0.0F));

		PartDefinition cube_r357 = head.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(69, 86).mirror().addBox(-3.032F, 1.2811F, -1.6924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5873F, -0.8469F, -2.0721F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r358 = head.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(87, 79).mirror().addBox(0.8873F, 1.3333F, -2.6883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0025F)).mirror(false), PartPose.offsetAndRotation(-1.5873F, -0.8469F, -2.0721F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r359 = head.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(25, 86).mirror().addBox(-2.6609F, 0.1514F, -0.9175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.5873F, -0.8469F, -2.0721F, 0.1624F, -0.964F, -1.7855F));

		PartDefinition cube_r360 = head.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(86, 27).mirror().addBox(-0.5109F, 1.4968F, -0.9408F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.5873F, -0.8469F, -2.0721F, -0.9493F, -0.3208F, -0.1358F));

		PartDefinition cube_r361 = head.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(88, 18).mirror().addBox(0.4444F, 0.0146F, -0.2774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.5873F, -0.8469F, -2.0721F, -1.4022F, 0.3607F, 0.0661F));

		PartDefinition cube_r362 = head.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(39, 65).mirror().addBox(-0.7F, -1.4F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0101F, 0.0341F, -0.0894F, 0.0F, 0.4451F, 0.0F));

		PartDefinition cube_r363 = head.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(64, 44).mirror().addBox(-0.6937F, -0.5761F, -1.0404F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.1478F, -0.9426F, -2.0192F, 0.8229F, 0.2278F, -1.0413F));

		PartDefinition cube_r364 = head.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(64, 23).mirror().addBox(-0.5563F, -0.1894F, -0.1124F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-1.8478F, -1.2426F, -1.8192F, 0.4739F, 0.2278F, -1.0413F));

		PartDefinition cube_r365 = head.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(64, 9).mirror().addBox(-0.638F, -0.5973F, -0.4818F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0663F, 0.5822F, -1.6438F, 0.8126F, 0.13F, -1.879F));

		PartDefinition cube_r366 = head.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(64, 4).mirror().addBox(-0.638F, -1.2101F, 0.6906F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.0663F, 0.5822F, -1.6438F, 0.2715F, 0.13F, -1.879F));

		PartDefinition cube_r367 = head.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(85, 58).mirror().addBox(-0.605F, -0.6F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.075F, -0.0659F, -0.9992F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r368 = head.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(64, 4).addBox(-0.362F, -1.2101F, 0.6906F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.0663F, 0.5822F, -1.6438F, 0.2715F, -0.13F, 1.879F));

		PartDefinition cube_r369 = head.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(64, 9).addBox(-0.362F, -0.5973F, -0.4818F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0663F, 0.5822F, -1.6438F, 0.8126F, -0.13F, 1.879F));

		PartDefinition cube_r370 = head.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(64, 23).addBox(-0.4437F, -0.1894F, -0.1124F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(1.8478F, -1.2426F, -1.8192F, 0.4739F, -0.2278F, 1.0413F));

		PartDefinition cube_r371 = head.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(64, 44).addBox(-0.3063F, -0.5761F, -1.0404F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.1478F, -0.9426F, -2.0192F, 0.8229F, -0.2278F, 1.0413F));

		PartDefinition cube_r372 = head.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(58, 32).addBox(-2.2F, -2.881F, -0.0312F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.7F, -0.7825F, -2.8254F, -1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r373 = head.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(62, 19).addBox(-1.7F, -1.881F, -0.1312F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2F, -0.7825F, -2.8254F, -1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r374 = head.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(88, 18).addBox(-1.4444F, 0.0146F, -0.2774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5873F, -0.8469F, -2.0721F, -1.4022F, -0.3607F, -0.0661F));

		PartDefinition cube_r375 = head.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(65, 77).addBox(-2.5873F, 0.1424F, -0.3117F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5873F, -0.8469F, -2.0721F, -1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r376 = head.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(63, 41).addBox(-3.0873F, 0.906F, -0.4351F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5873F, -0.8469F, -2.0721F, -1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r377 = head.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(25, 86).addBox(1.6609F, 0.1514F, -0.9175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5873F, -0.8469F, -2.0721F, 0.1624F, 0.964F, 1.7855F));

		PartDefinition cube_r378 = head.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(86, 27).addBox(-0.4891F, 1.4968F, -0.9408F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5873F, -0.8469F, -2.0721F, -0.9493F, 0.3208F, 0.1358F));

		PartDefinition cube_r379 = head.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(86, 30).addBox(-2.0873F, 1.5122F, -0.9949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5873F, -0.8469F, -2.0721F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r380 = head.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(0, 78).addBox(-2.5873F, 1.6434F, -1.9622F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5873F, -0.8469F, -2.0721F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r381 = head.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(39, 65).addBox(-1.3F, -1.4F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0101F, 0.0341F, -0.0894F, 0.0F, -0.4451F, 0.0F));

		PartDefinition cube_r382 = head.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(55, 79).addBox(-0.3F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8231F, 0.1341F, -1.5704F, 0.2182F, 0.0349F, 0.0F));

		PartDefinition cube_r383 = head.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(69, 86).addBox(2.032F, 1.2811F, -1.6924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5873F, -0.8469F, -2.0721F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r384 = head.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(88, 24).addBox(-1.3621F, 0.9811F, -1.8084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5873F, -0.8469F, -2.0721F, 0.0F, 0.0175F, 0.0F));

		PartDefinition cube_r385 = head.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(85, 58).addBox(-0.395F, -0.6F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 52).addBox(-1.4F, -0.9F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.075F, -0.0659F, -0.9992F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r386 = head.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(56, 54).addBox(-1.0F, 0.02F, -1.9431F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3632F, -0.3733F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r387 = head.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(88, 21).addBox(-1.5873F, 0.4904F, -2.5745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5873F, -0.8469F, -2.0721F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r388 = head.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(87, 79).addBox(-1.8873F, 1.3333F, -2.6883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0025F)), PartPose.offsetAndRotation(1.5873F, -0.8469F, -2.0721F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r389 = head.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(40, 29).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0F, 1.6008F, -4.4065F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r390 = head.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(23, 57).addBox(-2.5873F, -0.8176F, -4.1135F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(1.5873F, -0.8469F, -1.9721F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r391 = head.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(47, 34).addBox(-1.9722F, -0.1183F, -3.0347F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5873F, -0.8469F, -2.0721F, 0.3586F, 0.3147F, -0.0019F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9698F, 0.4081F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r392 = jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(83, 6).mirror().addBox(-0.036F, -0.8713F, -1.7774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 1.1605F, -2.1978F, 0.5709F, -0.2425F, -0.0304F));

		PartDefinition cube_r393 = jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(82, 80).mirror().addBox(-1.0F, -0.2153F, -0.0452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(82, 80).addBox(-0.2F, -0.2153F, -0.0452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.1F, 1.4446F, -3.8656F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r394 = jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(5, 88).mirror().addBox(-1.0F, -0.3F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(5, 88).addBox(-0.2F, -0.3F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1F, 1.4446F, -3.4656F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r395 = jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(67, 32).mirror().addBox(-2.0F, -1.0434F, -1.7627F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(67, 32).addBox(-0.2F, -1.0434F, -1.7627F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.6F, 1.5399F, -0.611F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r396 = jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(77, 79).mirror().addBox(-2.0F, -0.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(77, 79).addBox(-0.2F, -0.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.6F, 0.5399F, -0.611F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r397 = jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(53, 0).mirror().addBox(-2.0F, -0.8F, -1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(53, 0).addBox(-0.2F, -0.8F, -1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.8387F, -0.5848F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r398 = jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(82, 77).mirror().addBox(-0.036F, -0.7805F, -0.8959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 1.1605F, -2.1978F, 0.4575F, -0.2425F, -0.0304F));

		PartDefinition cube_r399 = jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(77, 82).mirror().addBox(-0.036F, -0.5896F, -0.8673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 1.1605F, -2.1978F, 0.283F, -0.2425F, -0.0304F));

		PartDefinition cube_r400 = jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(83, 6).addBox(-0.964F, -0.8713F, -1.7774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.2F, 1.1605F, -2.1978F, 0.5709F, 0.2425F, 0.0304F));

		PartDefinition cube_r401 = jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(82, 77).addBox(-0.964F, -0.7805F, -0.8959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.3F, 1.1605F, -2.1978F, 0.4575F, 0.2425F, 0.0304F));

		PartDefinition cube_r402 = jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(77, 82).addBox(-0.964F, -0.5896F, -0.8673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.3F, 1.1605F, -2.1978F, 0.283F, 0.2425F, 0.0304F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4585F, 3.0952F, 0.1416F, 0.1732F, 0.0188F));

		PartDefinition cube_r403 = tail.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(23, 95).addBox(0.5F, -2.1025F, 4.9128F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 94).addBox(0.5F, -2.3025F, 2.9128F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 95).addBox(0.5F, -2.1025F, 0.9128F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 24).addBox(0.0F, -0.3025F, -0.0872F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.1016F, 0.0506F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r404 = tail.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(23, 73).addBox(0.0F, -0.2F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 82).addBox(0.0F, -1.3F, 2.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 85).addBox(0.0F, -1.8F, 0.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6635F, 0.8173F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r405 = tail.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(89, 94).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3995F, 5.2549F, -0.2383F, -0.0544F, -0.2204F));

		PartDefinition cube_r406 = tail.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(78, 63).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9157F, 3.3143F, -0.2421F, -0.0337F, -0.1355F));

		PartDefinition cube_r407 = tail.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(77, 38).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4318F, 1.3737F, -0.2408F, -0.042F, -0.1694F));

		PartDefinition cube_r408 = tail.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(89, 94).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3995F, 5.2549F, -0.2383F, 0.0544F, 0.2204F));

		PartDefinition cube_r409 = tail.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(78, 63).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9157F, 3.3143F, -0.2421F, 0.0337F, 0.1355F));

		PartDefinition cube_r410 = tail.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(77, 38).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4318F, 1.3737F, -0.2408F, 0.042F, 0.1694F));

		PartDefinition osteoderms6 = tail.addOrReplaceChild("osteoderms6", CubeListBuilder.create(), PartPose.offset(1.0F, -0.5526F, 1.929F));

		PartDefinition cube_r411 = osteoderms6.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(82, 83).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4788F, 0.1994F, 5.4816F, -0.1905F, 0.1937F, -1.6286F));

		PartDefinition cube_r412 = osteoderms6.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(80, 59).addBox(-0.8583F, -0.4041F, -1.0392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4694F, -0.9889F, 4.1011F, -0.1978F, 0.3307F, -1.6565F));

		PartDefinition cube_r413 = osteoderms6.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(81, 40).addBox(-0.8264F, -0.4041F, -0.1566F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.4694F, -0.9889F, 4.1011F, -0.4236F, -1.1017F, -1.2091F));

		PartDefinition cube_r414 = osteoderms6.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(46, 80).addBox(-0.8583F, -0.4041F, -1.0392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4694F, -1.4889F, 2.4011F, -0.1978F, 0.3307F, -1.6565F));

		PartDefinition cube_r415 = osteoderms6.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(81, 31).addBox(-0.8264F, -0.4041F, -0.1566F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.4694F, -1.4889F, 2.4011F, -0.4236F, -1.1017F, -1.2091F));

		PartDefinition cube_r416 = osteoderms6.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(81, 28).addBox(-0.8264F, -0.4041F, -0.0566F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.4694F, -1.7889F, 0.7011F, -0.3637F, -1.0211F, -1.2777F));

		PartDefinition cube_r417 = osteoderms6.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(0, 81).addBox(-0.2976F, -0.4641F, -0.263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4694F, -1.0889F, 0.3011F, -0.1945F, 0.2793F, -1.6458F));

		PartDefinition cube_r418 = osteoderms6.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(71, 0).addBox(-1.5F, -1.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1F, 2.4182F, 0.1573F, -0.398F, 0.9453F, -0.2721F));

		PartDefinition cube_r419 = osteoderms6.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(65, 70).addBox(-0.4651F, -1.1823F, -1.7557F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1F, 2.4182F, 1.5573F, -1.3444F, 1.3993F, -1.1741F));

		PartDefinition cube_r420 = osteoderms6.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(58, 70).addBox(-1.5F, -1.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3F, 3.0182F, 2.2573F, -0.398F, 0.9453F, -0.2721F));

		PartDefinition cube_r421 = osteoderms6.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(70, 36).addBox(-0.4651F, -1.1823F, -1.7557F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3F, 3.0182F, 3.6573F, -1.3444F, 1.3993F, -1.1741F));

		PartDefinition osteoderms13 = tail.addOrReplaceChild("osteoderms13", CubeListBuilder.create(), PartPose.offset(-1.0F, -0.5526F, 1.929F));

		PartDefinition cube_r422 = osteoderms13.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(82, 83).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4788F, 0.1994F, 5.4816F, -0.1905F, -0.1937F, 1.6286F));

		PartDefinition cube_r423 = osteoderms13.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(80, 59).mirror().addBox(-0.1417F, -0.4041F, -1.0392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4694F, -0.9889F, 4.1011F, -0.1978F, -0.3307F, 1.6565F));

		PartDefinition cube_r424 = osteoderms13.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(81, 40).mirror().addBox(-0.1736F, -0.4041F, -0.1566F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.4694F, -0.9889F, 4.1011F, -0.4236F, 1.1017F, 1.2091F));

		PartDefinition cube_r425 = osteoderms13.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(46, 80).mirror().addBox(-0.1417F, -0.4041F, -1.0392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4694F, -1.4889F, 2.4011F, -0.1978F, -0.3307F, 1.6565F));

		PartDefinition cube_r426 = osteoderms13.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(81, 31).mirror().addBox(-0.1736F, -0.4041F, -0.1566F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.4694F, -1.4889F, 2.4011F, -0.4236F, 1.1017F, 1.2091F));

		PartDefinition cube_r427 = osteoderms13.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(81, 28).mirror().addBox(-0.1736F, -0.4041F, -0.0566F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.4694F, -1.7889F, 0.7011F, -0.3637F, 1.0211F, 1.2777F));

		PartDefinition cube_r428 = osteoderms13.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-0.7024F, -0.4641F, -0.263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4694F, -1.0889F, 0.3011F, -0.1945F, -0.2793F, 1.6458F));

		PartDefinition cube_r429 = osteoderms13.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(71, 0).mirror().addBox(0.5F, -1.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 2.4182F, 0.1573F, -0.398F, -0.9453F, 0.2721F));

		PartDefinition cube_r430 = osteoderms13.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(65, 70).mirror().addBox(-0.5349F, -1.1823F, -1.7557F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 2.4182F, 1.5573F, -1.3444F, -1.3993F, 1.1741F));

		PartDefinition cube_r431 = osteoderms13.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(58, 70).mirror().addBox(0.5F, -1.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 3.0182F, 2.2573F, -0.398F, -0.9453F, 0.2721F));

		PartDefinition cube_r432 = osteoderms13.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(70, 36).mirror().addBox(-0.5349F, -1.1823F, -1.7557F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 3.0182F, 3.6573F, -1.3444F, -1.3993F, 1.1741F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.747F, 6.8411F, 0.1776F, 0.2608F, 0.0233F));

		PartDefinition cube_r433 = tail2.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(81, 95).addBox(0.0F, -0.226F, 7.5746F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 95).addBox(0.0F, -0.226F, 5.5746F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 95).addBox(0.0F, -0.526F, 3.5746F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 95).addBox(0.0F, -0.926F, 1.5746F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 0).addBox(0.0F, -1.526F, -0.4254F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 13).addBox(-0.5F, 0.074F, -0.4254F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5486F, 0.3095F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r434 = tail2.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(69, 95).addBox(0.0F, 2.7F, 15.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 70).addBox(0.0F, 2.4F, 13.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 95).addBox(0.0F, 2.1F, 11.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 79).addBox(0.0F, 1.8F, 9.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 94).addBox(0.0F, 0.5F, 7.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4165F, -7.7238F, 0.1484F, 0.0F, 0.0F));

		PartDefinition osteoderms7 = tail2.addOrReplaceChild("osteoderms7", CubeListBuilder.create(), PartPose.offset(1.5629F, 0.5115F, 1.422F));

		PartDefinition cube_r435 = osteoderms7.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(10, 95).addBox(-1.0304F, 0.8011F, -3.4819F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 4).addBox(-1.0095F, 0.7779F, -1.9789F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 95).addBox(-0.9886F, 0.7547F, -0.4759F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0076F, -1.8439F, 3.9852F, -0.2555F, -0.1848F, -0.6061F));

		PartDefinition cube_r436 = osteoderms7.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(0, 84).addBox(-0.4159F, -0.447F, -0.0677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 0.3F, 4.7F, -0.2922F, 0.6308F, -0.1961F));

		PartDefinition cube_r437 = osteoderms7.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(83, 15).addBox(-0.2575F, -0.443F, -0.2457F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(15, 83).addBox(-0.2575F, -0.443F, 0.0543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.3F, 2.4F, -0.2922F, 0.6308F, -0.1961F));

		PartDefinition cube_r438 = osteoderms7.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(83, 12).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3043F, 0.3079F, 2.969F, -2.8814F, 1.2098F, -2.6797F));

		PartDefinition cube_r439 = osteoderms7.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(10, 83).addBox(-0.8272F, -1.2277F, -1.3477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0371F, 0.8071F, -0.0768F, -0.3031F, 0.6736F, -0.2027F));

		PartDefinition cube_r440 = osteoderms7.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(9, 70).addBox(-0.4651F, -1.1823F, -1.7557F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0371F, 0.8071F, 0.1232F, -1.3444F, 1.3993F, -1.1741F));

		PartDefinition cube_r441 = osteoderms7.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(10, 86).addBox(-0.0187F, -0.5072F, -0.8133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4135F, 0.7941F, 7.3096F, -2.8566F, 0.9562F, -2.9212F));

		PartDefinition osteoderms12 = tail2.addOrReplaceChild("osteoderms12", CubeListBuilder.create(), PartPose.offset(-1.5629F, 0.5115F, 1.422F));

		PartDefinition cube_r442 = osteoderms12.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(10, 95).mirror().addBox(0.0304F, 0.8011F, -3.4819F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(95, 4).mirror().addBox(0.0095F, 0.7779F, -1.9789F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 95).mirror().addBox(-0.0114F, 0.7547F, -0.4759F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0076F, -1.8439F, 3.9852F, -0.2555F, 0.1848F, 0.6061F));

		PartDefinition cube_r443 = osteoderms12.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(-0.5841F, -0.447F, -0.0677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8F, 0.3F, 4.7F, -0.2922F, -0.6308F, 0.1961F));

		PartDefinition cube_r444 = osteoderms12.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(83, 15).mirror().addBox(-0.7425F, -0.443F, -0.2457F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(15, 83).mirror().addBox(-0.7425F, -0.443F, 0.0543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.3F, 2.4F, -0.2922F, -0.6308F, 0.1961F));

		PartDefinition cube_r445 = osteoderms12.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(83, 12).mirror().addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3043F, 0.3079F, 2.969F, -2.8814F, -1.2098F, 2.6797F));

		PartDefinition cube_r446 = osteoderms12.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(10, 83).mirror().addBox(-0.1728F, -1.2277F, -1.3477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0371F, 0.8071F, -0.0768F, -0.3031F, -0.6736F, 0.2027F));

		PartDefinition cube_r447 = osteoderms12.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(9, 70).mirror().addBox(-0.5349F, -1.1823F, -1.7557F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0371F, 0.8071F, 0.1232F, -1.3444F, -1.3993F, 1.1741F));

		PartDefinition cube_r448 = osteoderms12.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(10, 86).mirror().addBox(-0.9813F, -0.5072F, -0.8133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4135F, 0.7941F, 7.3096F, -2.8566F, -0.9562F, 2.9212F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(84, 46).addBox(-0.5F, -1.5977F, 14.5801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(83, 18).addBox(-0.5F, -1.8128F, 12.8575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.7755F, 8.539F, 0.0256F, 0.2618F, -0.0047F));

		PartDefinition cube_r449 = tail3.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(46, 83).addBox(-1.0F, 0.0264F, -1.3042F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -0.9284F, 12.6498F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r450 = tail3.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(54, 83).addBox(-1.0F, -0.0487F, -0.4686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9284F, 12.6498F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r451 = tail3.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(59, 85).addBox(-1.0F, 0.0516F, 0.2854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, -0.9284F, 12.6498F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r452 = tail3.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(20, 83).addBox(-1.0761F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5761F, -1.8128F, 12.8575F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r453 = tail3.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(83, 21).addBox(-1.0761F, -0.0492F, -0.9571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5761F, -1.5128F, 11.8575F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r454 = tail3.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.2174F, 0.0593F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9838F, 0.0975F, 0.0873F, 0.0F, 0.0F));

		PartDefinition osteoderms8 = tail3.addOrReplaceChild("osteoderms8", CubeListBuilder.create(), PartPose.offset(-1.0F, -0.5162F, 11.4975F));

		PartDefinition cube_r455 = osteoderms8.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(32, 57).mirror().addBox(2.6752F, -0.2663F, 2.5395F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(84, 94).mirror().addBox(0.7125F, -0.389F, 0.6824F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4358F, 0.9112F, -7.9702F, 0.15F, -0.7332F, -0.1033F));

		PartDefinition cube_r456 = osteoderms8.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(40, 95).mirror().addBox(-0.5115F, -0.3006F, -0.5101F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4358F, 0.9373F, -9.47F, 0.1383F, -0.8214F, -0.1034F));

		PartDefinition cube_r457 = osteoderms8.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(32, 57).addBox(-3.6752F, -0.2663F, 2.5395F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 94).addBox(-1.7125F, -0.389F, 0.6824F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5642F, 0.9112F, -7.9702F, 0.15F, 0.7332F, 0.1033F));

		PartDefinition cube_r458 = osteoderms8.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(40, 95).addBox(-0.4885F, -0.3006F, -0.5101F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5642F, 0.9373F, -9.47F, 0.1383F, 0.8214F, 0.1034F));

		PartDefinition leftClub2 = osteoderms8.addOrReplaceChild("leftClub2", CubeListBuilder.create(), PartPose.offset(1.9731F, -1.2702F, -1.8274F));

		PartDefinition cube_r459 = leftClub2.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(84, 37).addBox(-0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3649F, 0.7332F, 5.3994F, 0.1943F, -0.9627F, -0.1586F));

		PartDefinition cube_r460 = leftClub2.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(84, 34).addBox(-0.8F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7254F, 0.733F, 5.3933F, 0.135F, -0.6009F, -0.0742F));

		PartDefinition cube_r461 = leftClub2.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(60, 74).addBox(-1.9919F, 0.4782F, 0.0472F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.8F, 0.0F, 3.2F, 0.1189F, -0.3584F, -0.0394F));

		PartDefinition cube_r462 = leftClub2.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(88, 67).addBox(-1.0134F, -0.5438F, -0.0311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3013F, 0.8184F, 5.0554F, 2.9895F, -0.751F, -3.0395F));

		PartDefinition cube_r463 = leftClub2.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(71, 44).addBox(-1.1612F, -0.555F, -0.0275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(59, 88).addBox(-0.9612F, -0.555F, -0.0275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6987F, 0.8184F, 5.1554F, 2.9699F, -0.8714F, -3.0099F));

		PartDefinition cube_r464 = leftClub2.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(88, 43).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4987F, 0.8184F, 4.6554F, 2.5075F, -1.3841F, -2.5161F));

		PartDefinition cube_r465 = leftClub2.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(32, 59).addBox(-1.5F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1292F, 1.1513F, 1.3477F, 2.3494F, 1.4142F, 2.358F));

		PartDefinition cube_r466 = leftClub2.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(55, 94).addBox(-1.063F, 0.6887F, -1.0158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.6F, 0.0F, 1.3F, 0.1576F, 0.7849F, 0.1143F));

		PartDefinition cube_r467 = leftClub2.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(94, 73).addBox(0.0795F, 0.8292F, 1.6945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1165F, 0.3005F, 0.0371F));

		PartDefinition cube_r468 = leftClub2.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(78, 0).addBox(-2.0533F, 0.5784F, -0.0539F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 0.0F, 2.3F, 0.1114F, -0.0463F, -0.0027F));

		PartDefinition cube_r469 = leftClub2.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(85, 3).addBox(0.2205F, 0.0516F, 0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4731F, 0.858F, 2.9797F, 0.437F, -0.9128F, -0.3541F));

		PartDefinition cube_r470 = leftClub2.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(5, 85).addBox(0.0087F, 0.0564F, 0.2328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4731F, 0.858F, 2.9797F, 0.2794F, -0.0336F, -0.0096F));

		PartDefinition cube_r471 = leftClub2.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(83, 43).addBox(0.0F, -0.0487F, -0.4686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4731F, 0.858F, 2.9797F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r472 = leftClub2.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(19, 65).addBox(0.0795F, -0.1444F, -1.4593F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4731F, 0.858F, 2.9797F, -0.0663F, 0.7784F, 0.0663F));

		PartDefinition cube_r473 = leftClub2.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(33, 85).addBox(0.2376F, 0.2166F, 0.3586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4731F, 0.858F, 2.9797F, 0.5351F, -0.4695F, -0.4295F));

		PartDefinition cube_r474 = leftClub2.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(71, 12).addBox(-1.0761F, -0.0492F, -1.9571F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.603F, 0.2736F, 2.1874F, 0.4313F, 0.7621F, 0.1893F));

		PartDefinition cube_r475 = leftClub2.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(41, 83).addBox(-0.9761F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.503F, -0.0264F, 3.1874F, -0.0175F, -0.0349F, 0.0006F));

		PartDefinition cube_r476 = leftClub2.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(25, 83).addBox(-0.0761F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.397F, -0.0264F, 3.1874F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r477 = leftClub2.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(84, 73).addBox(-0.3761F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.397F, 0.4736F, 4.1874F, -0.2533F, -0.5623F, 0.2896F));

		PartDefinition cube_r478 = leftClub2.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(83, 24).addBox(-0.8761F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.397F, 0.4736F, 4.1874F, 0.0F, -0.9599F, 0.0F));

		PartDefinition rightClub2 = osteoderms8.addOrReplaceChild("rightClub2", CubeListBuilder.create(), PartPose.offset(0.0269F, -1.2702F, -1.8274F));

		PartDefinition cube_r479 = rightClub2.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(84, 37).mirror().addBox(-0.3F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3649F, 0.7332F, 5.3994F, 0.1943F, 0.9627F, 0.1586F));

		PartDefinition cube_r480 = rightClub2.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(84, 34).mirror().addBox(-0.2F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.7254F, 0.733F, 5.3933F, 0.135F, 0.6009F, 0.0742F));

		PartDefinition cube_r481 = rightClub2.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(60, 74).mirror().addBox(-0.0081F, 0.4782F, 0.0472F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 0.0F, 3.2F, 0.1189F, 0.3584F, 0.0394F));

		PartDefinition cube_r482 = rightClub2.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(88, 67).mirror().addBox(0.0134F, -0.5438F, -0.0311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3013F, 0.8184F, 5.0554F, 2.9895F, 0.751F, 3.0395F));

		PartDefinition cube_r483 = rightClub2.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(71, 44).mirror().addBox(0.1612F, -0.555F, -0.0275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(59, 88).mirror().addBox(-0.0388F, -0.555F, -0.0275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6987F, 0.8184F, 5.1554F, 2.9699F, 0.8714F, 3.0099F));

		PartDefinition cube_r484 = rightClub2.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(88, 43).mirror().addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4987F, 0.8184F, 4.6554F, 2.5075F, 1.3841F, 2.5161F));

		PartDefinition cube_r485 = rightClub2.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(32, 59).mirror().addBox(-0.5F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1292F, 1.1513F, 1.3477F, 2.3494F, -1.4142F, -2.358F));

		PartDefinition cube_r486 = rightClub2.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(55, 94).mirror().addBox(0.063F, 0.6887F, -1.0158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.0F, 1.3F, 0.1576F, -0.7849F, -0.1143F));

		PartDefinition cube_r487 = rightClub2.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(94, 73).mirror().addBox(-1.0795F, 0.8292F, 1.6945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1165F, -0.3005F, -0.0371F));

		PartDefinition cube_r488 = rightClub2.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(78, 0).mirror().addBox(0.0533F, 0.5784F, -0.0539F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.0F, 2.3F, 0.1114F, 0.0463F, 0.0027F));

		PartDefinition cube_r489 = rightClub2.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(85, 3).mirror().addBox(-1.2205F, 0.0516F, 0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.4731F, 0.858F, 2.9797F, 0.437F, 0.9128F, 0.3541F));

		PartDefinition cube_r490 = rightClub2.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(5, 85).mirror().addBox(-1.0087F, 0.0564F, 0.2328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4731F, 0.858F, 2.9797F, 0.2794F, 0.0336F, 0.0096F));

		PartDefinition cube_r491 = rightClub2.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(83, 43).mirror().addBox(-1.0F, -0.0487F, -0.4686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4731F, 0.858F, 2.9797F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r492 = rightClub2.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(19, 65).mirror().addBox(-1.0795F, -0.1444F, -1.4593F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.4731F, 0.858F, 2.9797F, -0.0663F, -0.7784F, -0.0663F));

		PartDefinition cube_r493 = rightClub2.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(33, 85).mirror().addBox(-1.2376F, 0.2166F, 0.3586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.4731F, 0.858F, 2.9797F, 0.5351F, 0.4695F, 0.4295F));

		PartDefinition cube_r494 = rightClub2.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(71, 12).mirror().addBox(0.0761F, -0.0492F, -1.9571F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.603F, 0.2736F, 2.1874F, 0.4313F, -0.7621F, -0.1893F));

		PartDefinition cube_r495 = rightClub2.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(41, 83).mirror().addBox(-0.0239F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.503F, -0.0264F, 3.1874F, -0.0175F, 0.0349F, -0.0006F));

		PartDefinition cube_r496 = rightClub2.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(25, 83).mirror().addBox(-0.9239F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.397F, -0.0264F, 3.1874F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r497 = rightClub2.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(84, 73).mirror().addBox(-0.6239F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.397F, 0.4736F, 4.1874F, -0.2533F, 0.5623F, -0.2896F));

		PartDefinition cube_r498 = rightClub2.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(83, 24).mirror().addBox(-0.1239F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.397F, 0.4736F, 4.1874F, 0.0F, 0.9599F, 0.0F));

		return LayerDefinition.create(meshdefinition, 100, 100);
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