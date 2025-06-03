package fossils.fossils.client.blockentity.model.kunbarrasaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class KunbarrasaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart osteoderms5;
	private final ModelPart osteoderms13;
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
	private final ModelPart osteoderms12;
	private final ModelPart chest;
	private final ModelPart osteoderms3;
	private final ModelPart osteoderms11;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart lefthand;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart righthand;
	private final ModelPart neck;
	private final ModelPart osteoderms2;
	private final ModelPart osteoderms10;
	private final ModelPart neck2;
	private final ModelPart osteoderms;
	private final ModelPart osteoderms9;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart osteoderms6;
	private final ModelPart osteoderms14;
	private final ModelPart tail2;
	private final ModelPart osteoderms7;
	private final ModelPart osteoderms15;
	private final ModelPart tail3;
	private final ModelPart osteoderms8;

	public KunbarrasaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.osteoderms5 = this.hips.getChild("osteoderms5");
		this.osteoderms13 = this.hips.getChild("osteoderms13");
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
		this.osteoderms12 = this.body.getChild("osteoderms12");
		this.chest = this.body.getChild("chest");
		this.osteoderms3 = this.chest.getChild("osteoderms3");
		this.osteoderms11 = this.chest.getChild("osteoderms11");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.lefthand = this.leftarm2.getChild("lefthand");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.righthand = this.rightarm2.getChild("righthand");
		this.neck = this.chest.getChild("neck");
		this.osteoderms2 = this.neck.getChild("osteoderms2");
		this.osteoderms10 = this.neck.getChild("osteoderms10");
		this.neck2 = this.neck.getChild("neck2");
		this.osteoderms = this.neck2.getChild("osteoderms");
		this.osteoderms9 = this.neck2.getChild("osteoderms9");
		this.head = this.neck2.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.osteoderms6 = this.tail.getChild("osteoderms6");
		this.osteoderms14 = this.tail.getChild("osteoderms14");
		this.tail2 = this.tail.getChild("tail2");
		this.osteoderms7 = this.tail2.getChild("osteoderms7");
		this.osteoderms15 = this.tail2.getChild("osteoderms15");
		this.tail3 = this.tail2.getChild("tail3");
		this.osteoderms8 = this.tail3.getChild("osteoderms8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(14, 16).addBox(1.9407F, -1.4595F, -1.0339F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(14, 16).mirror().addBox(-2.9407F, -1.4595F, -1.0339F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -11.939F, 8.1542F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(7, 16).addBox(0.0F, -0.9F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3681F, 2.7633F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(46, 3).addBox(0.0F, -1.4978F, 1.9074F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(36, 12).addBox(0.0F, -1.4978F, -0.0926F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 10).addBox(-0.5F, -0.0978F, -0.0926F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.711F, -3.6542F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(8, 7).mirror().addBox(-0.5F, -0.8553F, -0.8739F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.5407F, 0.2405F, -0.5339F, 0.6545F, 0.0F, -0.4014F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 54).mirror().addBox(-0.5F, 1.7223F, -0.5532F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-2.5407F, 0.2405F, -0.5339F, 0.4974F, 0.0F, -0.4014F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-0.5F, 2.3531F, 0.1344F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.4407F, 0.3405F, 1.2661F, 0.1745F, 0.0F, -0.3665F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(8, 0).mirror().addBox(-0.5F, -0.3312F, -0.3949F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.4407F, 0.3405F, 1.2661F, 0.3403F, 0.0F, -0.3665F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(22, 63).mirror().addBox(-0.5F, -1.9062F, -0.0494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(22, 63).addBox(4.3815F, -1.9062F, -0.0494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.4407F, 1.9405F, 1.4661F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(10, 44).mirror().addBox(0.2442F, -0.5783F, -4.6473F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.5698F, -1.5595F, -3.3873F, 0.1659F, 0.7413F, -0.1489F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.9059F, -0.5783F, -4.8299F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5698F, -1.5595F, -3.3873F, 0.1392F, 0.4998F, -0.1945F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(10, 39).mirror().addBox(-0.1966F, -0.5783F, -1.4187F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.5698F, -1.5595F, -3.3873F, 0.2397F, 1.0322F, -0.0547F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(29, 29).mirror().addBox(0.3698F, -0.1476F, -4.7055F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5698F, -1.5595F, 0.9127F, -0.0972F, 0.009F, -0.2616F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-0.5216F, -0.1476F, 0.0538F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.5698F, -1.5595F, 0.9127F, -0.3612F, 0.3903F, -0.4177F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 29).mirror().addBox(-0.4772F, -0.1476F, -4.8179F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.5698F, -1.5595F, 0.9127F, -0.0983F, 0.148F, -0.2753F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(37, 29).mirror().addBox(-0.5F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(37, 29).addBox(1.3815F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4407F, -0.6595F, 0.4661F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(21, 35).mirror().addBox(0.5751F, -0.1476F, -0.2245F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5698F, -1.5595F, 0.9127F, -0.335F, 0.1111F, -0.3135F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 0).addBox(-0.0941F, -0.5783F, -4.8299F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5698F, -1.5595F, -3.3873F, 0.1392F, -0.4998F, 0.1945F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(10, 39).addBox(-1.8034F, -0.5783F, -1.4187F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.5698F, -1.5595F, -3.3873F, 0.2397F, -1.0322F, 0.0547F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(10, 44).addBox(-1.2442F, -0.5783F, -4.6473F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.5698F, -1.5595F, -3.3873F, 0.1659F, -0.7413F, 0.1489F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(29, 29).addBox(-1.3698F, -0.1476F, -4.7055F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5698F, -1.5595F, 0.9127F, -0.0972F, -0.009F, 0.2616F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(21, 35).addBox(-1.5751F, -0.1476F, -0.2245F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5698F, -1.5595F, 0.9127F, -0.335F, -0.1111F, 0.3135F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 16).addBox(-0.4784F, -0.1476F, 0.0538F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.5698F, -1.5595F, 0.9127F, -0.3612F, -0.3903F, 0.4177F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 62).addBox(-0.5F, 2.3531F, 0.1344F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.4407F, 0.3405F, 1.2661F, 0.1745F, 0.0F, 0.3665F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(17, 6).mirror().addBox(-4.6488F, -1.4084F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.311F, -3.1542F, -0.0931F, -0.0792F, -0.7555F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(16, 29).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.311F, -3.1542F, -0.1193F, -0.0264F, -0.269F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(17, 6).addBox(2.6488F, -1.4084F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.311F, -3.1542F, -0.0931F, 0.0792F, 0.7555F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(16, 29).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.311F, -3.1542F, -0.1193F, 0.0264F, 0.269F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(8, 0).addBox(-0.5F, -0.3312F, -0.3949F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.4407F, 0.3405F, 1.2661F, 0.3403F, 0.0F, 0.3665F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 54).addBox(-0.5F, 1.7223F, -0.5532F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(2.5407F, 0.2405F, -0.5339F, 0.4974F, 0.0F, 0.4014F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(8, 7).addBox(-0.5F, -0.8553F, -0.8739F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5407F, 0.2405F, -0.5339F, 0.6545F, 0.0F, 0.4014F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 29).addBox(-1.5228F, -0.1476F, -4.8179F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.5698F, -1.5595F, 0.9127F, -0.0983F, -0.148F, 0.2753F));

		PartDefinition osteoderms5 = hips.addOrReplaceChild("osteoderms5", CubeListBuilder.create(), PartPose.offset(5.6838F, -0.785F, 2.1713F));

		PartDefinition cube_r31 = osteoderms5.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(52, 26).addBox(-0.2488F, -0.6816F, 1.1583F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-1.7965F, -0.6416F, -0.4066F, -0.3437F, -0.4893F, 0.2277F));

		PartDefinition cube_r32 = osteoderms5.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(52, 30).addBox(-1.9559F, -0.6816F, 0.087F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-1.7965F, -0.6416F, -0.4066F, -0.3048F, 0.1334F, 0.0192F));

		PartDefinition cube_r33 = osteoderms5.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(52, 12).addBox(-0.0955F, -0.5522F, -1.4938F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F))
				.texOffs(25, 59).addBox(0.6045F, -0.5522F, -1.6938F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.7965F, -0.6416F, -0.4066F, -0.2886F, 0.8103F, -0.1524F));

		PartDefinition cube_r34 = osteoderms5.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(5, 62).addBox(0.212F, -0.5522F, -1.0611F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-1.7965F, -0.6416F, -0.4066F, -0.1976F, -0.0405F, 0.0676F));

		PartDefinition cube_r35 = osteoderms5.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(58, 23).addBox(1.883F, -0.5522F, -0.8966F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.7965F, -0.6416F, -0.4066F, -0.3821F, 1.0166F, -0.2698F));

		PartDefinition cube_r36 = osteoderms5.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(62, 30).addBox(-1.0684F, -0.6816F, -0.5732F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.7965F, -0.6416F, -0.4066F, -0.3033F, 0.0918F, 0.0324F));

		PartDefinition cube_r37 = osteoderms5.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(50, 0).addBox(-1.2F, -1.2F, -2.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.7838F, -0.7604F, -1.4874F, -0.0248F, -0.2527F, -0.4475F));

		PartDefinition cube_r38 = osteoderms5.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(35, 68).addBox(-1.6872F, -1.0711F, 8.206F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(40, 68).addBox(-1.3439F, -1.4474F, 6.497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(45, 68).addBox(-1.1923F, -1.593F, 4.7865F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.9088F, -1.438F, -10.7539F, -0.1026F, 0.1305F, 0.87F));

		PartDefinition cube_r39 = osteoderms5.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(68, 54).addBox(-0.4285F, -0.5228F, 0.1927F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6169F, -0.8811F, -4.4118F, -0.1219F, -0.0143F, -0.4643F));

		PartDefinition cube_r40 = osteoderms5.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(48, 71).addBox(-0.5109F, -0.6582F, -1.1784F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6169F, -0.8811F, -4.4118F, 0.1396F, 0.0723F, -0.4749F));

		PartDefinition cube_r41 = osteoderms5.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(43, 71).addBox(-2.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.9857F, 0.6062F, -5.5902F, 0.0F, 0.0F, -0.48F));

		PartDefinition osteoderms13 = hips.addOrReplaceChild("osteoderms13", CubeListBuilder.create(), PartPose.offset(-5.6838F, -0.785F, 2.1713F));

		PartDefinition cube_r42 = osteoderms13.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(52, 26).mirror().addBox(-0.7512F, -0.6816F, 1.1583F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(1.7965F, -0.6416F, -0.4066F, -0.3437F, 0.4893F, -0.2277F));

		PartDefinition cube_r43 = osteoderms13.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(52, 30).mirror().addBox(0.9559F, -0.6816F, 0.087F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(1.7965F, -0.6416F, -0.4066F, -0.3048F, -0.1334F, -0.0192F));

		PartDefinition cube_r44 = osteoderms13.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(52, 12).mirror().addBox(-0.9045F, -0.5522F, -1.4938F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false)
				.texOffs(25, 59).mirror().addBox(-1.6045F, -0.5522F, -1.6938F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.7965F, -0.6416F, -0.4066F, -0.2886F, -0.8103F, 0.1524F));

		PartDefinition cube_r45 = osteoderms13.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(5, 62).mirror().addBox(-1.212F, -0.5522F, -1.0611F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(1.7965F, -0.6416F, -0.4066F, -0.1976F, 0.0405F, -0.0676F));

		PartDefinition cube_r46 = osteoderms13.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(58, 23).mirror().addBox(-2.883F, -0.5522F, -0.8966F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.7965F, -0.6416F, -0.4066F, -0.3821F, -1.0166F, 0.2698F));

		PartDefinition cube_r47 = osteoderms13.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(62, 30).mirror().addBox(0.0684F, -0.6816F, -0.5732F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.7965F, -0.6416F, -0.4066F, -0.3033F, -0.0918F, -0.0324F));

		PartDefinition cube_r48 = osteoderms13.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(50, 0).mirror().addBox(0.2F, -1.2F, -2.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.7838F, -0.7604F, -1.4874F, -0.0248F, 0.2527F, 0.4475F));

		PartDefinition cube_r49 = osteoderms13.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(35, 68).mirror().addBox(0.6872F, -1.0711F, 8.206F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(40, 68).mirror().addBox(0.3439F, -1.4474F, 6.497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(45, 68).mirror().addBox(0.1923F, -1.593F, 4.7865F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(3.9088F, -1.438F, -10.7539F, -0.1026F, -0.1305F, -0.87F));

		PartDefinition cube_r50 = osteoderms13.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(68, 54).mirror().addBox(-0.5715F, -0.5228F, 0.1927F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.6169F, -0.8811F, -4.4118F, -0.1219F, 0.0143F, 0.4643F));

		PartDefinition cube_r51 = osteoderms13.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(48, 71).mirror().addBox(-0.4891F, -0.6582F, -1.1784F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.6169F, -0.8811F, -4.4118F, 0.1396F, -0.0723F, 0.4749F));

		PartDefinition cube_r52 = osteoderms13.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(43, 71).mirror().addBox(1.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.9857F, 0.6062F, -5.5902F, 0.0F, 0.0F, 0.48F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(39, 53).addBox(0.5F, 4.7891F, -2.9534F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(3.2F, -0.0577F, 0.0664F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r53 = leftleg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(25, 68).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2696F, 2.4789F, -0.7853F, -0.4537F, 0.4715F, -0.0414F));

		PartDefinition cube_r54 = leftleg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(28, 28).addBox(-0.5F, -1.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3696F, 2.0789F, 0.4147F, -0.2863F, 0.23F, -0.1349F));

		PartDefinition cube_r55 = leftleg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(30, 68).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0696F, 1.1789F, -0.3853F, -0.4671F, 0.3546F, -0.0843F));

		PartDefinition cube_r56 = leftleg.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(5, 41).addBox(1.0F, -4.1F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 2.6967F, -1.6206F, -0.4363F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 5.7948F, -2.6816F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftleg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(72, 19).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.301F, 1.3729F, 2.6116F, -0.9797F, 0.2996F, -0.4143F));

		PartDefinition cube_r58 = leftleg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(41, 44).addBox(-0.5F, -3.0F, -0.3F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 2.5307F, 1.8473F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftleg2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(53, 21).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.4388F, 0.8705F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftleg2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(14, 49).addBox(-0.601F, -1.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.499F, 2.0977F, 1.5973F, 0.5236F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.0246F, 3.5116F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftleg3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(59, 13).addBox(-0.602F, -0.5F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.499F, 0.2307F, -0.7197F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(0, 36).addBox(-1.499F, -0.5693F, -2.2197F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.6F, -1.2F, -0.3054F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(19, 53).addBox(-1.5F, 4.7891F, -2.9534F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-3.2F, -0.0577F, 0.0664F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightleg.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(67, 37).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2696F, 2.4789F, -0.7853F, -0.4537F, -0.4715F, 0.0414F));

		PartDefinition cube_r63 = rightleg.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(28, 10).addBox(-0.5F, -1.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3696F, 2.0789F, 0.4147F, -0.2863F, -0.23F, 0.1349F));

		PartDefinition cube_r64 = rightleg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(67, 51).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0696F, 1.1789F, -0.3853F, -0.4671F, -0.3546F, 0.0843F));

		PartDefinition cube_r65 = rightleg.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 41).addBox(-2.0F, -4.1F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 2.6967F, -1.6206F, -0.4363F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 5.7948F, -2.6816F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightleg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(14, 72).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.301F, 1.3729F, 2.6116F, -0.9797F, -0.2996F, 0.4143F));

		PartDefinition cube_r67 = rightleg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(36, 43).addBox(-0.5F, -3.0F, -0.3F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 2.5307F, 1.8473F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r68 = rightleg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(52, 35).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.4388F, 0.8705F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r69 = rightleg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(29, 47).addBox(-0.399F, -1.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.499F, 2.0977F, 1.5973F, 0.5236F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.0246F, 3.5116F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r70 = rightleg3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(53, 16).addBox(-1.398F, -0.5F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.499F, 0.2307F, -0.7197F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(12, 34).addBox(-1.501F, -0.5693F, -2.2197F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.6F, -1.2F, 0.2182F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, -0.55F, -8.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.003F))
				.texOffs(68, 73).addBox(0.0F, -1.85F, -8.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 73).addBox(0.0F, -1.95F, -6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 73).addBox(0.0F, -1.95F, -4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.261F, -3.6542F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(43, 12).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.95F, -1.5F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(5, 73).mirror().addBox(-5.1878F, -4.0441F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.05F, -3.5F, -0.0233F, -0.0658F, -1.2297F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(26, 54).mirror().addBox(-6.1878F, -4.0441F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.05F, -5.5F, 0.0F, 0.0F, -1.2305F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(57, 6).mirror().addBox(-7.1878F, -4.0441F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.05F, -7.5F, 0.0439F, 0.1234F, -1.2277F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(57, 11).mirror().addBox(-5.6488F, -1.4084F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.05F, -7.5F, 0.0998F, 0.0849F, -0.7026F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(56, 51).mirror().addBox(-5.6488F, -1.4084F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.05F, -5.5F, 0.0F, 0.0F, -0.7069F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(25, 56).mirror().addBox(-5.6488F, -1.4084F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.05F, -3.5F, -0.0531F, -0.0453F, -0.7057F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-5.6488F, -1.4084F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.05F, -1.5F, -0.0818F, -0.0925F, -0.7041F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(50, 4).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.05F, -1.5F, -0.1156F, -0.0434F, -0.2167F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(56, 44).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.05F, -3.5F, -0.0682F, -0.0151F, -0.2177F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(57, 2).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.05F, -5.5F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(13, 57).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.05F, -7.5F, 0.1278F, 0.0283F, -0.2164F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(51, 53).addBox(2.6488F, -1.4084F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.05F, -1.5F, -0.0818F, 0.0925F, 0.7041F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(50, 4).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.05F, -1.5F, -0.1156F, 0.0434F, 0.2167F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(56, 44).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.05F, -3.5F, -0.0682F, 0.0151F, 0.2177F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(25, 56).addBox(2.6488F, -1.4084F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.05F, -3.5F, -0.0531F, 0.0453F, 0.7057F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(5, 73).addBox(4.1878F, -4.0441F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.05F, -3.5F, -0.0233F, 0.0658F, 1.2297F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(57, 2).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.05F, -5.5F, 0.0F, 0.0F, 0.2182F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(56, 51).addBox(2.6488F, -1.4084F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.05F, -5.5F, 0.0F, 0.0F, 0.7069F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(26, 54).addBox(4.1878F, -4.0441F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.05F, -5.5F, 0.0F, 0.0F, 1.2305F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(57, 6).addBox(4.1878F, -4.0441F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.05F, -7.5F, 0.0439F, -0.1234F, 1.2277F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(57, 11).addBox(2.6488F, -1.4084F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.05F, -7.5F, 0.0998F, -0.0849F, 0.7026F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(13, 57).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.05F, -7.5F, 0.1278F, -0.0283F, 0.2164F));

		PartDefinition osteoderms4 = body.addOrReplaceChild("osteoderms4", CubeListBuilder.create(), PartPose.offset(6.05F, 0.25F, -2.5F));

		PartDefinition cube_r94 = osteoderms4.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(64, 8).addBox(-0.1537F, -1.1653F, 1.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7F, 0.6F, 0.0F, 0.0607F, -0.116F, -0.4835F));

		PartDefinition cube_r95 = osteoderms4.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(57, 66).addBox(-0.2817F, -0.6601F, -1.2857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.4323F, -0.6857F, -2.6384F, 0.0893F, 0.0293F, 0.8755F));

		PartDefinition cube_r96 = osteoderms4.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(64, 71).addBox(-1.0171F, -1.0318F, -2.8217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-4.275F, -0.712F, -2.4283F, -0.0224F, 0.0267F, 0.8724F));

		PartDefinition cube_r97 = osteoderms4.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(0, 72).addBox(-0.4799F, -0.5411F, -2.7822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.4323F, -0.5857F, -2.6384F, 0.0893F, 0.0293F, 0.8755F));

		PartDefinition cube_r98 = osteoderms4.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(62, 27).addBox(0.0528F, -1.3152F, -0.7928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7282F, 1.7346F, -4.5572F, -0.047F, 0.0736F, -0.569F));

		PartDefinition cube_r99 = osteoderms4.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(63, 17).addBox(-1.0362F, 0.5911F, -0.5928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(59, 8).addBox(-0.99F, 0.5024F, 1.2072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1282F, 1.3346F, -4.5572F, -0.0404F, 0.0774F, -0.4815F));

		PartDefinition cube_r100 = osteoderms4.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(20, 16).addBox(-0.9135F, 2.2765F, -0.0928F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0282F, 1.1346F, -4.5572F, -0.0404F, 0.0774F, -0.4815F));

		PartDefinition cube_r101 = osteoderms4.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(23, 71).addBox(0.0167F, -1.3385F, 0.7072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7282F, 1.7346F, -4.5572F, -0.0437F, 0.0756F, -0.5253F));

		PartDefinition cube_r102 = osteoderms4.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(18, 70).addBox(-0.5231F, -0.4556F, -2.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7F, 0.7F, 0.0F, 0.0607F, -0.116F, -0.4835F));

		PartDefinition cube_r103 = osteoderms4.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(68, 57).addBox(-1.1704F, 0.6612F, -1.9308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(38, 71).addBox(-1.185F, 0.6865F, -0.1422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1F, 0.3F, 0.0F, 0.4835F, 0.1161F, -0.4629F));

		PartDefinition cube_r104 = osteoderms4.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(66, 14).addBox(-0.3384F, -0.8105F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2F, 0.7F, 0.0F, 0.0607F, -0.116F, -0.4835F));

		PartDefinition cube_r105 = osteoderms4.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(71, 12).addBox(-0.1966F, -0.7616F, 0.3373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(71, 25).addBox(-0.1966F, -0.7616F, 1.7373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.4323F, -0.6857F, -2.6384F, -0.0781F, -0.1108F, 0.8747F));

		PartDefinition cube_r106 = osteoderms4.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(37, 65).addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.3F, -1.35F, 0.05F, 0.0F, 0.0F, -0.6109F));

		PartDefinition cube_r107 = osteoderms4.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(65, 60).addBox(-0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.0F, -1.35F, -1.35F, 0.0F, 0.0F, -0.6109F));

		PartDefinition cube_r108 = osteoderms4.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(47, 65).addBox(-0.9F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.9F, -1.15F, -2.65F, 0.0F, 0.0F, -0.6109F));

		PartDefinition cube_r109 = osteoderms4.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(52, 65).addBox(-0.6F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.3F, -0.85F, -4.15F, 0.0F, 0.0F, -0.6109F));

		PartDefinition cube_r110 = osteoderms4.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(33, 71).addBox(-0.8885F, -1.185F, -1.2217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-4.275F, -0.912F, -2.4283F, -0.0224F, 0.0267F, 0.8724F));

		PartDefinition cube_r111 = osteoderms4.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(71, 49).addBox(-1.0814F, -1.0712F, 0.2425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-4.275F, -0.812F, -2.4283F, -0.0923F, 0.0267F, 0.8724F));

		PartDefinition cube_r112 = osteoderms4.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(9, 71).addBox(-1.0814F, -1.0712F, 2.0425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-4.275F, -1.112F, -2.4283F, -0.0923F, 0.0267F, 0.8724F));

		PartDefinition cube_r113 = osteoderms4.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(42, 65).addBox(-0.3F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.7F, -1.15F, 1.35F, 0.0F, 0.0F, -0.6109F));

		PartDefinition osteoderms12 = body.addOrReplaceChild("osteoderms12", CubeListBuilder.create(), PartPose.offset(-6.05F, 0.25F, -2.5F));

		PartDefinition cube_r114 = osteoderms12.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(64, 8).mirror().addBox(-0.8463F, -1.1653F, 1.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.6F, 0.0F, 0.0607F, 0.116F, 0.4835F));

		PartDefinition cube_r115 = osteoderms12.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(57, 66).mirror().addBox(-0.7183F, -0.6601F, -1.2857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.4323F, -0.6857F, -2.6384F, 0.0893F, -0.0293F, -0.8755F));

		PartDefinition cube_r116 = osteoderms12.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(64, 71).mirror().addBox(0.0171F, -1.0318F, -2.8217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(4.275F, -0.712F, -2.4283F, -0.0224F, -0.0267F, -0.8724F));

		PartDefinition cube_r117 = osteoderms12.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-0.5201F, -0.5411F, -2.7822F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.4323F, -0.5857F, -2.6384F, 0.0893F, -0.0293F, -0.8755F));

		PartDefinition cube_r118 = osteoderms12.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(62, 27).mirror().addBox(-1.0528F, -1.3152F, -0.7928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.7282F, 1.7346F, -4.5572F, -0.047F, -0.0736F, 0.569F));

		PartDefinition cube_r119 = osteoderms12.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(63, 17).mirror().addBox(0.0362F, 0.5911F, -0.5928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(59, 8).mirror().addBox(-0.01F, 0.5024F, 1.2072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1282F, 1.3346F, -4.5572F, -0.0404F, -0.0774F, 0.4815F));

		PartDefinition cube_r120 = osteoderms12.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(20, 16).mirror().addBox(0.9135F, 2.2765F, -0.0928F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0282F, 1.1346F, -4.5572F, -0.0404F, -0.0774F, 0.4815F));

		PartDefinition cube_r121 = osteoderms12.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(23, 71).mirror().addBox(-1.0167F, -1.3385F, 0.7072F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.7282F, 1.7346F, -4.5572F, -0.0437F, -0.0756F, 0.5253F));

		PartDefinition cube_r122 = osteoderms12.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(18, 70).mirror().addBox(-0.4769F, -0.4556F, -2.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.7F, 0.0F, 0.0607F, 0.116F, 0.4835F));

		PartDefinition cube_r123 = osteoderms12.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(68, 57).mirror().addBox(0.1704F, 0.6612F, -1.9308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(38, 71).mirror().addBox(0.185F, 0.6865F, -0.1422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.3F, 0.0F, 0.4835F, -0.1161F, 0.4629F));

		PartDefinition cube_r124 = osteoderms12.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(66, 14).mirror().addBox(-0.6616F, -0.8105F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.7F, 0.0F, 0.0607F, 0.116F, 0.4835F));

		PartDefinition cube_r125 = osteoderms12.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(71, 12).mirror().addBox(-0.8034F, -0.7616F, 0.3373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(71, 25).mirror().addBox(-0.8034F, -0.7616F, 1.7373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.4323F, -0.6857F, -2.6384F, -0.0781F, 0.1108F, -0.8747F));

		PartDefinition cube_r126 = osteoderms12.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(37, 65).mirror().addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.3F, -1.35F, 0.05F, 0.0F, 0.0F, 0.6109F));

		PartDefinition cube_r127 = osteoderms12.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(65, 60).mirror().addBox(-0.3F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.0F, -1.35F, -1.35F, 0.0F, 0.0F, 0.6109F));

		PartDefinition cube_r128 = osteoderms12.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(47, 65).mirror().addBox(-0.1F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.9F, -1.15F, -2.65F, 0.0F, 0.0F, 0.6109F));

		PartDefinition cube_r129 = osteoderms12.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(52, 65).mirror().addBox(-0.4F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.3F, -0.85F, -4.15F, 0.0F, 0.0F, 0.6109F));

		PartDefinition cube_r130 = osteoderms12.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(33, 71).mirror().addBox(-0.1115F, -1.185F, -1.2217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(4.275F, -0.912F, -2.4283F, -0.0224F, -0.0267F, -0.8724F));

		PartDefinition cube_r131 = osteoderms12.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(71, 49).mirror().addBox(0.0814F, -1.0712F, 0.2425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(4.275F, -0.812F, -2.4283F, -0.0923F, -0.0267F, -0.8724F));

		PartDefinition cube_r132 = osteoderms12.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(9, 71).mirror().addBox(0.0814F, -1.0712F, 2.0425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(4.275F, -1.112F, -2.4283F, -0.0923F, -0.0267F, -0.8724F));

		PartDefinition cube_r133 = osteoderms12.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(42, 65).mirror().addBox(-0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.7F, -1.15F, 1.35F, 0.0F, 0.0F, 0.6109F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.229F, -7.8756F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(19, 27).mirror().addBox(-0.4725F, 0.0849F, 0.3798F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 5.2313F, -4.5597F, -0.3399F, -0.6805F, 0.374F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(36, 12).mirror().addBox(-0.4725F, -0.1151F, -0.3202F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 5.2313F, -4.5597F, -0.5392F, -1.1503F, 0.7036F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(28, 0).mirror().addBox(-0.4725F, 0.0849F, -0.8202F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 5.2313F, -4.5597F, -0.3251F, -0.8642F, 0.4525F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(19, 27).addBox(-0.5275F, 0.0849F, 0.3798F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 5.2313F, -4.5597F, -0.3399F, 0.6805F, -0.374F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(28, 0).addBox(-0.5275F, 0.0849F, -0.8202F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 5.2313F, -4.5597F, -0.3251F, 0.8642F, -0.4525F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(36, 12).addBox(-0.5275F, -0.1151F, -0.3202F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 5.2313F, -4.5597F, -0.5392F, 1.1503F, -0.7036F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(17, 0).mirror().addBox(0.1F, 0.0273F, -0.0326F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5F, 2.1977F, -6.3534F, -0.4693F, -0.3627F, -0.6105F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(44, 61).mirror().addBox(-3.0F, -0.1F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 61).addBox(1.0F, -0.1F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 5.2505F, -2.7857F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(10, 29).mirror().addBox(-0.5F, -0.2281F, -0.2031F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 2.1183F, -6.1956F, 0.6807F, 0.0873F, 0.0F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(39, 19).mirror().addBox(-0.4198F, -1.9942F, 0.2007F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 2.1183F, -3.9956F, 0.1766F, 0.2169F, 0.0576F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(71, 73).addBox(0.0F, -1.3F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 5).addBox(0.0F, -1.2F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 7).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2183F, -4.8956F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(72, 65).addBox(4.1878F, -4.0441F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.779F, -5.3244F, 0.2507F, -0.6112F, 1.3255F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(5, 56).mirror().addBox(-7.1878F, -4.0441F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.279F, -1.4244F, 0.08F, 0.2219F, -1.2739F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(46, 55).mirror().addBox(-5.6488F, -1.4084F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.279F, -1.4244F, 0.1806F, 0.1522F, -0.7454F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(55, 55).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.279F, -1.4244F, 0.2302F, 0.0505F, -0.2647F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(45, 0).mirror().addBox(-6.1878F, -4.0441F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.579F, -3.3244F, 0.1374F, 0.3691F, -1.2746F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(55, 0).mirror().addBox(-5.6488F, -1.4084F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.579F, -3.3244F, 0.3051F, 0.2512F, -0.7379F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(55, 41).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.579F, -3.3244F, 0.3843F, 0.0829F, -0.2718F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(54, 49).mirror().addBox(-5.6488F, -1.4084F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.779F, -5.3244F, 0.5282F, 0.4065F, -0.7701F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(54, 39).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.779F, -5.3244F, 0.6429F, 0.1321F, -0.3486F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(14, 22).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.479F, -7.3244F, 0.7638F, 0.205F, -0.4854F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(14, 22).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.479F, -7.3244F, 0.7638F, -0.205F, 0.4854F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(54, 49).addBox(2.6488F, -1.4084F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.779F, -5.3244F, 0.5282F, -0.4065F, 0.7701F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(54, 39).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.779F, -5.3244F, 0.6429F, -0.1321F, 0.3486F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(45, 0).addBox(4.1878F, -4.0441F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.579F, -3.3244F, 0.1374F, -0.3691F, 1.2746F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(55, 41).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.579F, -3.3244F, 0.3843F, -0.0829F, 0.2718F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(55, 0).addBox(2.6488F, -1.4084F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.579F, -3.3244F, 0.3051F, -0.2512F, 0.7379F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(5, 56).addBox(4.1878F, -4.0441F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.279F, -1.4244F, 0.08F, -0.2219F, 1.2739F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(55, 55).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.279F, -1.4244F, 0.2302F, -0.0505F, 0.2647F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(46, 55).addBox(2.6488F, -1.4084F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.279F, -1.4244F, 0.1806F, -0.1522F, 0.7454F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(17, 0).addBox(-1.1F, 0.0273F, -0.0326F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 2.1977F, -6.3534F, -0.4693F, 0.3627F, 0.6105F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(44, 51).addBox(-0.5F, -1.0352F, -1.6943F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 1.6183F, -4.2956F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(10, 29).addBox(-0.5F, -0.2281F, -0.2031F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 2.1183F, -6.1956F, 0.6807F, -0.0873F, 0.0F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(39, 19).addBox(-0.5802F, -1.9942F, 0.2007F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 2.1183F, -3.9956F, 0.1766F, -0.2169F, -0.0576F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(74, 40).addBox(1.0F, -0.7611F, 0.0073F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 74).addBox(1.0F, -1.0611F, 2.0073F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 34).addBox(0.5F, -0.0611F, 0.0073F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 0.929F, -7.8244F, 0.2007F, 0.0F, 0.0F));

		PartDefinition osteoderms3 = chest.addOrReplaceChild("osteoderms3", CubeListBuilder.create(), PartPose.offset(3.9F, 0.9346F, -6.2149F));

		PartDefinition cube_r169 = osteoderms3.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(24, 41).addBox(-1.2689F, 0.481F, -1.6516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.136F, 0.5592F, -0.6589F));

		PartDefinition cube_r170 = osteoderms3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(65, 43).addBox(-1.2267F, 0.4546F, 0.261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2556F, 0.4438F, -0.6365F));

		PartDefinition cube_r171 = osteoderms3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(64, 48).addBox(-0.3259F, -0.9594F, 0.8347F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2F, 0.4F, 0.0F, -0.2556F, 0.4438F, -0.6365F));

		PartDefinition cube_r172 = osteoderms3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(50, 41).addBox(-0.8551F, -0.5633F, -1.2898F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0863F, 0.5727F, -0.6502F));

		PartDefinition cube_r173 = osteoderms3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(64, 40).addBox(-1.0203F, -2.0219F, -0.0376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2097F, 0.4809F, -0.6964F));

		PartDefinition cube_r174 = osteoderms3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(71, 34).addBox(-0.5139F, -0.9699F, -9.3261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.125F, -1.3677F, 9.1622F, 0.0787F, 0.055F, -0.6087F));

		PartDefinition cube_r175 = osteoderms3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(65, 3).addBox(-1.5664F, 1.5589F, -0.5136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1719F, 0.5911F, 3.2952F, -0.3679F, 0.099F, -0.5487F));

		PartDefinition cube_r176 = osteoderms3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(11, 65).addBox(-0.5242F, -0.077F, -1.1431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0719F, 0.7911F, 3.2952F, -0.1169F, 0.2578F, -0.5885F));

		PartDefinition cube_r177 = osteoderms3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(27, 65).addBox(0.3907F, -1.513F, -1.1688F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4719F, 1.1911F, 3.2952F, -0.1169F, 0.2578F, -0.5885F));

		PartDefinition cube_r178 = osteoderms3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(63, 63).addBox(-0.7322F, -1.5782F, 1.5878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.5F, -0.2097F, 0.4809F, -0.6964F));

		PartDefinition cube_r179 = osteoderms3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(71, 67).addBox(-0.2992F, -1.5277F, -7.7007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.125F, -1.0677F, 9.1622F, 0.0787F, 0.055F, -0.6087F));

		PartDefinition cube_r180 = osteoderms3.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(66, 11).addBox(-0.0921F, -1.4749F, -5.976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(72, 28).addBox(-0.0237F, -1.3982F, -4.2645F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.125F, -1.1677F, 9.1622F, 0.0787F, 0.055F, -0.6087F));

		PartDefinition cube_r181 = osteoderms3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(68, 46).addBox(-0.2813F, -2.4535F, 0.3006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2719F, 0.4911F, 3.3952F, -0.058F, 0.3023F, -0.6381F));

		PartDefinition cube_r182 = osteoderms3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(32, 65).addBox(0.1968F, -1.2088F, 0.2167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4719F, 1.1911F, 3.3952F, -0.1169F, 0.2578F, -0.5885F));

		PartDefinition cube_r183 = osteoderms3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(10, 29).addBox(-0.5793F, 1.5792F, 0.9422F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1719F, 0.5911F, 3.3952F, -0.3679F, 0.099F, -0.5487F));

		PartDefinition cube_r184 = osteoderms3.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(16, 65).addBox(-0.5552F, -0.0283F, 0.328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0719F, 0.7911F, 3.3952F, -0.3679F, 0.099F, -0.5487F));

		PartDefinition cube_r185 = osteoderms3.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(14, 16).addBox(-1.1223F, 2.3254F, -1.2893F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1218F, 0.6789F, 7.0334F, -0.3497F, 0.0692F, -0.5471F));

		PartDefinition cube_r186 = osteoderms3.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(63, 22).addBox(-1.0982F, 0.7179F, -1.9035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0218F, 0.8789F, 7.0334F, -0.3497F, 0.0692F, -0.5471F));

		PartDefinition cube_r187 = osteoderms3.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(65, 0).addBox(0.1423F, -1.2293F, -2.0798F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4218F, 1.2789F, 7.0334F, -0.097F, 0.2288F, -0.5837F));

		PartDefinition cube_r188 = osteoderms3.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(66, 34).addBox(0.1658F, -2.7424F, -1.7378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7218F, 0.5789F, 7.0334F, -0.0364F, 0.2742F, -0.632F));

		PartDefinition osteoderms11 = chest.addOrReplaceChild("osteoderms11", CubeListBuilder.create(), PartPose.offset(-3.9F, 0.9346F, -6.2149F));

		PartDefinition cube_r189 = osteoderms11.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(24, 41).mirror().addBox(0.2689F, 0.481F, -1.6516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.136F, -0.5592F, 0.6589F));

		PartDefinition cube_r190 = osteoderms11.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(65, 43).mirror().addBox(0.2267F, 0.4546F, 0.261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2556F, -0.4438F, 0.6365F));

		PartDefinition cube_r191 = osteoderms11.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(64, 48).mirror().addBox(-0.6741F, -0.9594F, 0.8347F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.4F, 0.0F, -0.2556F, -0.4438F, 0.6365F));

		PartDefinition cube_r192 = osteoderms11.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(50, 41).mirror().addBox(-0.1449F, -0.5633F, -1.2898F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0863F, -0.5727F, 0.6502F));

		PartDefinition cube_r193 = osteoderms11.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(64, 40).mirror().addBox(0.0203F, -2.0219F, -0.0376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2097F, -0.4809F, 0.6964F));

		PartDefinition cube_r194 = osteoderms11.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(71, 34).mirror().addBox(-0.4861F, -0.9699F, -9.3261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.125F, -1.3677F, 9.1622F, 0.0787F, -0.055F, 0.6087F));

		PartDefinition cube_r195 = osteoderms11.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(65, 3).mirror().addBox(0.5664F, 1.5589F, -0.5136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1719F, 0.5911F, 3.2952F, -0.3679F, -0.099F, 0.5487F));

		PartDefinition cube_r196 = osteoderms11.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(11, 65).mirror().addBox(-0.4758F, -0.077F, -1.1431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0719F, 0.7911F, 3.2952F, -0.1169F, -0.2578F, 0.5885F));

		PartDefinition cube_r197 = osteoderms11.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(27, 65).mirror().addBox(-1.3907F, -1.513F, -1.1688F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4719F, 1.1911F, 3.2952F, -0.1169F, -0.2578F, 0.5885F));

		PartDefinition cube_r198 = osteoderms11.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(63, 63).mirror().addBox(-0.2678F, -1.5782F, 1.5878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.0F, 0.5F, -0.2097F, -0.4809F, 0.6964F));

		PartDefinition cube_r199 = osteoderms11.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(71, 67).mirror().addBox(-0.7008F, -1.5277F, -7.7007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.125F, -1.0677F, 9.1622F, 0.0787F, -0.055F, 0.6087F));

		PartDefinition cube_r200 = osteoderms11.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(66, 11).mirror().addBox(-0.9079F, -1.4749F, -5.976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(72, 28).mirror().addBox(-0.9763F, -1.3982F, -4.2645F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.125F, -1.1677F, 9.1622F, 0.0787F, -0.055F, 0.6087F));

		PartDefinition cube_r201 = osteoderms11.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(68, 46).mirror().addBox(-0.7187F, -2.4535F, 0.3006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2719F, 0.4911F, 3.3952F, -0.058F, -0.3023F, 0.6381F));

		PartDefinition cube_r202 = osteoderms11.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(32, 65).mirror().addBox(-1.1968F, -1.2088F, 0.2167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4719F, 1.1911F, 3.3952F, -0.1169F, -0.2578F, 0.5885F));

		PartDefinition cube_r203 = osteoderms11.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(10, 29).mirror().addBox(0.5793F, 1.5792F, 0.9422F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1719F, 0.5911F, 3.3952F, -0.3679F, -0.099F, 0.5487F));

		PartDefinition cube_r204 = osteoderms11.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(16, 65).mirror().addBox(-0.4448F, -0.0283F, 0.328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0719F, 0.7911F, 3.3952F, -0.3679F, -0.099F, 0.5487F));

		PartDefinition cube_r205 = osteoderms11.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(14, 16).mirror().addBox(1.1223F, 2.3254F, -1.2893F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1218F, 0.6789F, 7.0334F, -0.3497F, -0.0692F, 0.5471F));

		PartDefinition cube_r206 = osteoderms11.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(63, 22).mirror().addBox(0.0982F, 0.7179F, -1.9035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0218F, 0.8789F, 7.0334F, -0.3497F, -0.0692F, 0.5471F));

		PartDefinition cube_r207 = osteoderms11.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(65, 0).mirror().addBox(-1.1423F, -1.2293F, -2.0798F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.4218F, 1.2789F, 7.0334F, -0.097F, -0.2288F, 0.5837F));

		PartDefinition cube_r208 = osteoderms11.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(66, 34).mirror().addBox(-1.1658F, -2.7424F, -1.7378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7218F, 0.5789F, 7.0334F, -0.0364F, -0.2742F, 0.632F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6F, 4.3941F, -4.7684F, -0.7418F, 0.0F, -0.2618F));

		PartDefinition cube_r209 = leftarm.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(66, 25).addBox(-0.5F, 0.4F, 0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.75F, 3.5818F, -0.3379F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r210 = leftarm.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(50, 68).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.25F, -0.1682F, 0.1621F, 0.5236F, 0.2291F, -0.3747F));

		PartDefinition cube_r211 = leftarm.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(62, 36).addBox(-0.4551F, -2.0307F, -0.1511F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.7314F, 0.953F, 0.0142F, 0.5704F, -0.4968F, -0.2861F));

		PartDefinition cube_r212 = leftarm.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(58, 63).addBox(-0.7123F, -0.913F, 0.0622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.7314F, 1.453F, 0.8142F, 1.2511F, -0.4968F, -0.2861F));

		PartDefinition cube_r213 = leftarm.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(34, 51).addBox(0.0F, -3.6481F, -0.862F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 1.7806F, 1.8093F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r214 = leftarm.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(52, 7).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 4.2209F, 2.7038F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r215 = leftarm.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(0, 7).addBox(0.0F, 2.1F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 0.4806F, 0.0093F, 0.6894F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.4457F, 3.1653F, -0.2574F, 0.0338F, 0.2597F));

		PartDefinition cube_r216 = leftarm2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(9, 49).addBox(-0.601F, -1.5F, 0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(46, 44).addBox(0.499F, -1.5F, 0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.499F, 0.9605F, -1.4405F, -0.3054F, 0.0F, 0.0F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create().texOffs(36, 7).addBox(-1.499F, -0.4895F, -2.3405F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 4.5076F, -1.5054F, 1.8762F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6F, 4.3941F, -4.7684F, 0.1309F, 0.0F, 0.2618F));

		PartDefinition cube_r217 = rightarm.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(5, 66).addBox(-0.5F, 0.4F, 0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.75F, 3.5818F, -0.3379F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r218 = rightarm.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(67, 28).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.25F, -0.1682F, 0.1621F, 0.5236F, -0.2291F, 0.3747F));

		PartDefinition cube_r219 = rightarm.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5449F, -2.0307F, -0.1511F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.7314F, 0.953F, 0.0142F, 0.5704F, 0.4968F, 0.2861F));

		PartDefinition cube_r220 = rightarm.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(63, 53).addBox(-0.2877F, -0.913F, 0.0622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.7314F, 1.453F, 0.8142F, 1.2511F, 0.4968F, 0.2861F));

		PartDefinition cube_r221 = rightarm.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(28, 0).addBox(-1.0F, -3.6481F, -0.862F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 1.7806F, 1.8093F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r222 = rightarm.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(51, 45).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 4.2209F, 2.7038F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r223 = rightarm.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 2.1F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 0.4806F, 0.0093F, 0.6894F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.4457F, 3.1653F, 0.0044F, -0.0338F, -0.2597F));

		PartDefinition cube_r224 = rightarm2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(24, 47).addBox(-0.399F, -1.5F, 0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(19, 46).addBox(-1.499F, -1.5F, 0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.499F, 0.9605F, -1.4405F, -0.3054F, 0.0F, 0.0F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create().texOffs(32, 24).addBox(-1.501F, -0.4895F, -2.3405F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 4.5076F, -1.5054F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4324F, -7.7065F, -0.1589F, -0.1815F, -0.0884F));

		PartDefinition cube_r225 = neck.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(26, 19).addBox(-1.0F, -1.4F, 2.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1034F, -4.4678F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r226 = neck.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(40, 39).addBox(0.5F, -1.1F, 1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.1034F, -4.4678F, -0.1309F, 0.0F, 0.0F));

		PartDefinition osteoderms2 = neck.addOrReplaceChild("osteoderms2", CubeListBuilder.create(), PartPose.offset(3.0213F, 1.1518F, -1.4929F));

		PartDefinition cube_r227 = osteoderms2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(58, 59).addBox(-0.5F, -0.7125F, -0.3742F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 1.9635F));

		PartDefinition cube_r228 = osteoderms2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(66, 68).addBox(-0.5F, -0.0533F, -1.0166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 1.9635F));

		PartDefinition cube_r229 = osteoderms2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(69, 31).addBox(-0.5F, -0.7864F, -0.5846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 1.9635F));

		PartDefinition cube_r230 = osteoderms2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(62, 66).addBox(-0.5F, -0.7864F, -0.5846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.1F, -1.55F, 0.0F, 0.48F, 0.0F, 1.3963F));

		PartDefinition cube_r231 = osteoderms2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(70, 43).addBox(-0.5F, -0.0533F, -1.0166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.55F, 0.0F, -0.3927F, 0.0F, 1.3963F));

		PartDefinition cube_r232 = osteoderms2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(15, 61).addBox(-0.5F, -0.7125F, -0.3742F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.1F, -1.55F, 0.0F, -0.5236F, 0.0F, 1.3963F));

		PartDefinition cube_r233 = osteoderms2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(37, 61).addBox(0.0F, -1.8075F, 2.3007F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-1.7213F, -3.2474F, -2.4877F, -0.5236F, 0.0F, 0.2182F));

		PartDefinition cube_r234 = osteoderms2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(30, 61).addBox(0.0F, -0.7F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7793F, -2.9857F, 0.5915F, 0.5672F, 0.0F, 0.2182F));

		PartDefinition osteoderms10 = neck.addOrReplaceChild("osteoderms10", CubeListBuilder.create(), PartPose.offset(-3.0213F, 1.1518F, -1.4929F));

		PartDefinition cube_r235 = osteoderms10.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(58, 59).mirror().addBox(-0.5F, -0.7125F, -0.3742F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, -1.9635F));

		PartDefinition cube_r236 = osteoderms10.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(66, 68).mirror().addBox(-0.5F, -0.0533F, -1.0166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, -1.9635F));

		PartDefinition cube_r237 = osteoderms10.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(69, 31).mirror().addBox(-0.5F, -0.7864F, -0.5846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, -1.9635F));

		PartDefinition cube_r238 = osteoderms10.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(62, 66).mirror().addBox(-0.5F, -0.7864F, -0.5846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.55F, 0.0F, 0.48F, 0.0F, -1.3963F));

		PartDefinition cube_r239 = osteoderms10.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(70, 43).mirror().addBox(-0.5F, -0.0533F, -1.0166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.55F, 0.0F, -0.3927F, 0.0F, -1.3963F));

		PartDefinition cube_r240 = osteoderms10.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(15, 61).mirror().addBox(-0.5F, -0.7125F, -0.3742F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.55F, 0.0F, -0.5236F, 0.0F, -1.3963F));

		PartDefinition cube_r241 = osteoderms10.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(37, 61).mirror().addBox(-1.0F, -1.8075F, 2.3007F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(1.7213F, -3.2474F, -2.4877F, -0.5236F, 0.0F, -0.2182F));

		PartDefinition cube_r242 = osteoderms10.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(30, 61).mirror().addBox(-1.0F, -0.7F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7793F, -2.9857F, 0.5915F, 0.5672F, 0.0F, -0.2182F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5035F, -2.7222F, -0.093F, -0.1308F, 0.044F));

		PartDefinition cube_r243 = neck2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, -1.5F, -0.9F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(44, 14).addBox(0.0F, -1.0F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.4001F, -1.7456F, -0.0873F, 0.0F, 0.0F));

		PartDefinition osteoderms = neck2.addOrReplaceChild("osteoderms", CubeListBuilder.create(), PartPose.offset(2.4205F, 0.8319F, -1.2879F));

		PartDefinition cube_r244 = osteoderms.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(69, 40).addBox(-0.5F, -0.5287F, -0.3044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5007F, -0.1289F, 1.9184F));

		PartDefinition cube_r245 = osteoderms.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(72, 52).addBox(-0.5F, -0.7859F, -0.4084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.8555F, -0.1289F, 1.9184F));

		PartDefinition cube_r246 = osteoderms.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(55, 69).addBox(-1.0F, -0.3075F, -0.2993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.1795F, -0.9239F, 0.0294F, -0.5236F, 0.0F, 1.3963F));

		PartDefinition cube_r247 = osteoderms.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(53, 72).addBox(-1.0F, -1.1384F, -0.5608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1795F, -0.9239F, 0.0294F, 1.3526F, 0.0F, 1.3963F));

		PartDefinition cube_r248 = osteoderms.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(72, 37).addBox(-1.0F, -0.9384F, -1.1608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5205F, -2.1239F, 0.0294F, 0.8727F, 0.0F, 0.2182F));

		PartDefinition cube_r249 = osteoderms.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(67, 19).addBox(-1.0F, -0.7546F, -0.5149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.5205F, -2.1239F, 0.0294F, 0.4363F, 0.0F, 0.2182F));

		PartDefinition cube_r250 = osteoderms.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(20, 67).addBox(-1.0F, -0.8075F, -0.2993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5205F, -2.1239F, 0.0294F, -0.5236F, 0.0F, 0.2182F));

		PartDefinition osteoderms9 = neck2.addOrReplaceChild("osteoderms9", CubeListBuilder.create(), PartPose.offset(-2.4205F, 0.8319F, -1.2879F));

		PartDefinition cube_r251 = osteoderms9.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(69, 40).mirror().addBox(-0.5F, -0.5287F, -0.3044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5007F, 0.1289F, -1.9184F));

		PartDefinition cube_r252 = osteoderms9.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(72, 52).mirror().addBox(-0.5F, -0.7859F, -0.4084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.8555F, 0.1289F, -1.9184F));

		PartDefinition cube_r253 = osteoderms9.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(55, 69).mirror().addBox(0.0F, -0.3075F, -0.2993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-0.1795F, -0.9239F, 0.0294F, -0.5236F, 0.0F, -1.3963F));

		PartDefinition cube_r254 = osteoderms9.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(53, 72).mirror().addBox(0.0F, -1.1384F, -0.5608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1795F, -0.9239F, 0.0294F, 1.3526F, 0.0F, -1.3963F));

		PartDefinition cube_r255 = osteoderms9.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(72, 37).mirror().addBox(0.0F, -0.9384F, -1.1608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5205F, -2.1239F, 0.0294F, 0.8727F, 0.0F, -0.2182F));

		PartDefinition cube_r256 = osteoderms9.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(67, 19).mirror().addBox(0.0F, -0.7546F, -0.5149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.5205F, -2.1239F, 0.0294F, 0.4363F, 0.0F, -0.2182F));

		PartDefinition cube_r257 = osteoderms9.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(20, 67).mirror().addBox(0.0F, -0.8075F, -0.2993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5205F, -2.1239F, 0.0294F, -0.5236F, 0.0F, -0.2182F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3003F, -2.6904F, -0.3491F, 0.0F, -0.0436F));

		PartDefinition cube_r258 = head.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(4, 70).mirror().addBox(0.0F, -0.0229F, -0.0461F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(68, 22).mirror().addBox(0.0F, 0.9771F, -0.1461F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.3032F, -6.1119F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r259 = head.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(70, 16).mirror().addBox(0.0F, -1.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 1.5968F, -5.5119F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r260 = head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(70, 9).mirror().addBox(0.0F, -0.9598F, -0.1126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.5968F, -6.5119F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r261 = head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(14, 68).mirror().addBox(0.0F, -1.1F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 2.2088F, -5.9963F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r262 = head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(45, 28).mirror().addBox(-1.0F, -0.986F, -0.1342F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3455F, -4.4767F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r263 = head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(60, 69).mirror().addBox(-0.1F, -1.2F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 2.2088F, -5.9963F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r264 = head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(10, 59).mirror().addBox(-1.0F, -1.3F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3101F, -0.0866F, -1.0758F, 0.0F, 0.4451F, 0.0F));

		PartDefinition cube_r265 = head.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(9, 68).mirror().addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6486F, 0.3036F, -0.6243F, 0.313F, 0.0729F, 0.018F));

		PartDefinition cube_r266 = head.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(70, 3).mirror().addBox(-0.7F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-1.8478F, -1.0634F, -0.8056F, 0.6458F, -0.1745F, 0.0F));

		PartDefinition cube_r267 = head.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(58, 46).mirror().addBox(-0.6895F, 0.0F, -0.0002F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.675F, -1.4866F, -2.0857F, 0.1745F, -0.0349F, 0.0F));

		PartDefinition cube_r268 = head.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(28, 36).mirror().addBox(-0.7F, -0.4F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(27, 42).mirror().addBox(-0.6F, -0.9F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.675F, -0.1866F, -1.7857F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r269 = head.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(45, 24).mirror().addBox(-0.1462F, -0.0814F, -0.0751F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.1873F, -1.1677F, -3.0586F, 0.2757F, 0.0638F, 0.1217F));

		PartDefinition cube_r270 = head.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(37, 0).mirror().addBox(-1.0F, -1.7F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7873F, 0.6323F, -3.2586F, 0.2633F, -0.654F, -0.0918F));

		PartDefinition cube_r271 = head.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(70, 3).addBox(-0.3F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.8478F, -1.0634F, -0.8056F, 0.6458F, 0.1745F, 0.0F));

		PartDefinition cube_r272 = head.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(70, 9).addBox(-1.0F, -0.9598F, -0.1126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7F, 0.5968F, -6.5119F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r273 = head.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(58, 46).addBox(-1.3105F, 0.0F, -0.0002F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.675F, -1.4866F, -2.0857F, 0.1745F, 0.0349F, 0.0F));

		PartDefinition cube_r274 = head.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(9, 68).addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6486F, 0.3036F, -0.6243F, 0.313F, -0.0729F, -0.018F));

		PartDefinition cube_r275 = head.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(10, 59).addBox(-1.0F, -1.3F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3101F, -0.0866F, -1.0758F, 0.0F, -0.4451F, 0.0F));

		PartDefinition cube_r276 = head.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(63, 56).addBox(-0.3F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8231F, 0.0134F, -3.2569F, 0.2182F, 0.0349F, 0.0F));

		PartDefinition cube_r277 = head.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(28, 36).addBox(-1.3F, -0.4F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 42).addBox(-1.4F, -0.9F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.675F, -0.1866F, -1.7857F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r278 = head.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(32, 36).addBox(-1.0F, 0.02F, -1.9431F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4839F, -2.0598F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r279 = head.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(46, 32).mirror().addBox(-0.7F, -0.0012F, -1.4504F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0032F, -3.9119F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r280 = head.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(46, 32).addBox(-0.3F, -0.0012F, -1.4504F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.0032F, -3.9119F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r281 = head.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(68, 22).addBox(-1.0F, 0.9771F, -0.1461F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(4, 70).addBox(-1.0F, -0.0229F, -0.0461F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.3032F, -6.1119F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r282 = head.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(70, 16).addBox(-1.0F, -1.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0025F)), PartPose.offsetAndRotation(0.7F, 1.5968F, -5.5119F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r283 = head.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(60, 69).addBox(-0.9F, -1.2F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.9F, 2.2088F, -5.9963F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r284 = head.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(14, 68).addBox(-1.0F, -1.1F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.9F, 2.2088F, -5.9963F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r285 = head.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(45, 28).addBox(-1.0F, -0.986F, -0.1342F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 1.3455F, -4.4767F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r286 = head.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(45, 24).addBox(-1.8538F, -0.0814F, -0.0751F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.1873F, -1.1677F, -3.0586F, 0.2757F, -0.0638F, -0.1217F));

		PartDefinition cube_r287 = head.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(37, 0).addBox(-1.0F, -1.7F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7873F, 0.6323F, -3.2586F, 0.2633F, 0.654F, 0.0918F));

		PartDefinition cube_r288 = head.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(17, 10).addBox(-3.0F, -0.75F, 1.95F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.6004F, -4.1052F, 0.2618F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8491F, -0.7783F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r289 = jaw.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(67, 65).mirror().addBox(0.0F, -1.0031F, 0.0368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.0605F, -3.4978F, 0.4451F, -0.6283F, 0.0F));

		PartDefinition cube_r290 = jaw.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(69, 62).mirror().addBox(-1.0F, -0.2153F, -0.0452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(69, 62).addBox(0.0F, -0.2153F, -0.0452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 1.7446F, -4.3656F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r291 = jaw.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(70, 0).mirror().addBox(-1.0F, -0.3F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(70, 0).addBox(0.0F, -0.3F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7446F, -3.9656F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r292 = jaw.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(3, 58).mirror().addBox(-2.0F, -1.0434F, -1.7627F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(3, 58).addBox(1.0F, -1.0434F, -1.7627F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.5399F, -0.611F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r293 = jaw.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-2.0F, -0.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(0, 68).addBox(1.0F, -0.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.5399F, -0.611F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r294 = jaw.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(18, 41).mirror().addBox(-2.0F, -0.8F, -1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(18, 41).addBox(1.0F, -0.8F, -1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8387F, -0.5848F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r295 = jaw.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(68, 6).mirror().addBox(0.0F, -1.1169F, 0.8917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.0605F, -3.4978F, 0.3316F, -0.6283F, 0.0F));

		PartDefinition cube_r296 = jaw.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(51, 61).mirror().addBox(0.0F, -0.9881F, -0.0925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.0605F, -3.4978F, 0.2967F, -0.6283F, 0.0F));

		PartDefinition cube_r297 = jaw.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(67, 65).addBox(-1.0F, -1.0031F, 0.0368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.0F, 2.0605F, -3.4978F, 0.4451F, 0.6283F, 0.0F));

		PartDefinition cube_r298 = jaw.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(68, 6).addBox(-1.0F, -1.1169F, 0.8917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, 2.0605F, -3.4978F, 0.3316F, 0.6283F, 0.0F));

		PartDefinition cube_r299 = jaw.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(51, 61).addBox(-1.0F, -0.9881F, -0.0925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, 2.0605F, -3.4978F, 0.2967F, 0.6283F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4585F, 3.1952F, 0.4215F, -0.275F, 0.1288F));

		PartDefinition cube_r300 = tail.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(10, 44).addBox(0.5F, -1.1025F, 6.9128F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 53).addBox(0.5F, -1.3025F, 4.9128F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 36).addBox(0.5F, -1.3025F, 2.9128F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 16).addBox(0.5F, -1.5025F, 0.9128F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 16).addBox(0.0F, -0.3025F, -0.0872F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.1024F, -0.0494F, -0.2443F, 0.0F, 0.0F));

		PartDefinition osteoderms6 = tail.addOrReplaceChild("osteoderms6", CubeListBuilder.create(), PartPose.offset(1.0F, -0.5535F, 1.829F));

		PartDefinition cube_r301 = osteoderms6.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(32, 74).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2095F, -0.1582F, -0.6378F));

		PartDefinition cube_r302 = osteoderms6.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(58, 18).addBox(-1.5F, -1.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 2.4182F, -0.5427F, -0.398F, 0.9453F, -0.2721F));

		PartDefinition cube_r303 = osteoderms6.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(53, 57).addBox(-0.4651F, -1.1823F, -1.7557F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 2.4182F, 0.8573F, -1.3444F, 1.3993F, -1.1741F));

		PartDefinition cube_r304 = osteoderms6.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(74, 31).addBox(-0.5F, -0.5F, 1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -0.2F, -0.5F, -0.2095F, -0.1582F, -0.6378F));

		PartDefinition cube_r305 = osteoderms6.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(46, 57).addBox(-1.5F, -1.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 3.0182F, 1.4573F, -0.398F, 0.9453F, -0.2721F));

		PartDefinition cube_r306 = osteoderms6.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(0, 50).addBox(-0.4651F, -1.1823F, -1.7557F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 3.0182F, 2.8573F, -1.3444F, 1.3993F, -1.1741F));

		PartDefinition cube_r307 = osteoderms6.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(19, 31).addBox(-0.5F, -0.5F, 2.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -0.1F, 0.0F, -0.2095F, -0.1582F, -0.6378F));

		PartDefinition cube_r308 = osteoderms6.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(27, 74).addBox(-0.5F, -0.5F, 3.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.1F, 0.5F, -0.2095F, -0.1582F, -0.6378F));

		PartDefinition cube_r309 = osteoderms6.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(49, 49).addBox(-0.5272F, -1.2277F, -1.6477F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 3.6182F, 5.2573F, -0.3031F, 0.6736F, -0.2027F));

		PartDefinition cube_r310 = osteoderms6.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(39, 57).addBox(-0.4651F, -1.1823F, -1.7557F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 3.6182F, 5.4573F, -1.3444F, 1.3993F, -1.1741F));

		PartDefinition cube_r311 = osteoderms6.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(22, 74).addBox(-0.5F, -0.5F, 3.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.5F, 2.0F, -0.2095F, -0.1582F, -0.6378F));

		PartDefinition osteoderms14 = tail.addOrReplaceChild("osteoderms14", CubeListBuilder.create(), PartPose.offset(-1.0F, -0.5535F, 1.829F));

		PartDefinition cube_r312 = osteoderms14.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(32, 74).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2095F, 0.1582F, 0.6378F));

		PartDefinition cube_r313 = osteoderms14.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(58, 18).mirror().addBox(0.5F, -1.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 2.4182F, -0.5427F, -0.398F, -0.9453F, 0.2721F));

		PartDefinition cube_r314 = osteoderms14.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(53, 57).mirror().addBox(-0.5349F, -1.1823F, -1.7557F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 2.4182F, 0.8573F, -1.3444F, -1.3993F, 1.1741F));

		PartDefinition cube_r315 = osteoderms14.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(74, 31).mirror().addBox(-0.5F, -0.5F, 1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.2F, -0.5F, -0.2095F, 0.1582F, 0.6378F));

		PartDefinition cube_r316 = osteoderms14.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(46, 57).mirror().addBox(0.5F, -1.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 3.0182F, 1.4573F, -0.398F, -0.9453F, 0.2721F));

		PartDefinition cube_r317 = osteoderms14.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-0.5349F, -1.1823F, -1.7557F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 3.0182F, 2.8573F, -1.3444F, -1.3993F, 1.1741F));

		PartDefinition cube_r318 = osteoderms14.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(19, 31).mirror().addBox(-0.5F, -0.5F, 2.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.1F, 0.0F, -0.2095F, 0.1582F, 0.6378F));

		PartDefinition cube_r319 = osteoderms14.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(27, 74).mirror().addBox(-0.5F, -0.5F, 3.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.1F, 0.5F, -0.2095F, 0.1582F, 0.6378F));

		PartDefinition cube_r320 = osteoderms14.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(49, 49).mirror().addBox(-0.4728F, -1.2277F, -1.6477F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 3.6182F, 5.2573F, -0.3031F, -0.6736F, 0.2027F));

		PartDefinition cube_r321 = osteoderms14.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(39, 57).mirror().addBox(-0.5349F, -1.1823F, -1.7557F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 3.6182F, 5.4573F, -1.3444F, -1.3993F, 1.1741F));

		PartDefinition cube_r322 = osteoderms14.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(22, 74).mirror().addBox(-0.5F, -0.5F, 3.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.5F, 2.0F, -0.2095F, 0.1582F, 0.6378F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.2461F, 8.4411F, 0.3445F, -0.1221F, -0.0666F));

		PartDefinition cube_r323 = tail2.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(22, 34).addBox(0.0F, -0.226F, 9.5746F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 36).addBox(0.0F, -0.226F, 7.5746F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 7).addBox(0.0F, -0.226F, 5.5746F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 0).addBox(0.0F, -0.226F, 3.5746F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 29).addBox(0.0F, -0.326F, 1.5746F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 39).addBox(0.0F, -0.526F, -0.4254F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 16).addBox(-0.5F, 0.074F, -0.4254F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5486F, 0.3095F, -0.1222F, 0.0F, 0.0F));

		PartDefinition osteoderms7 = tail2.addOrReplaceChild("osteoderms7", CubeListBuilder.create(), PartPose.offset(1.5629F, 0.5115F, 1.422F));

		PartDefinition cube_r324 = osteoderms7.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(48, 19).addBox(-0.2575F, -0.443F, -1.1457F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2922F, 0.6308F, -0.1961F));

		PartDefinition cube_r325 = osteoderms7.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(74, 15).addBox(-0.5F, -0.5F, 3.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5629F, -2.4111F, -4.5341F, -0.2095F, -0.1582F, -0.6378F));

		PartDefinition cube_r326 = osteoderms7.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(57, 32).addBox(-0.7766F, -0.5226F, -1.0792F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1326F, 1.3783F, -0.9657F));

		PartDefinition cube_r327 = osteoderms7.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(9, 74).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6629F, -0.696F, 1.0465F, -0.0693F, -0.0531F, -0.6283F));

		PartDefinition cube_r328 = osteoderms7.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(47, 37).addBox(-0.2575F, -0.443F, -1.1457F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 2.4F, -0.2922F, 0.6308F, -0.1961F));

		PartDefinition cube_r329 = osteoderms7.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(57, 28).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5043F, 0.2079F, 2.369F, -3.0268F, -0.0654F, -2.9962F));

		PartDefinition cube_r330 = osteoderms7.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(32, 57).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1043F, 0.3079F, 2.969F, -2.8814F, 1.2098F, -2.6797F));

		PartDefinition cube_r331 = osteoderms7.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(58, 72).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6629F, -0.596F, 2.5465F, -0.0693F, -0.0531F, -0.6283F));

		PartDefinition cube_r332 = osteoderms7.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(72, 56).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6629F, -0.496F, 4.0465F, -0.0693F, -0.0531F, -0.6283F));

		PartDefinition cube_r333 = osteoderms7.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(47, 10).addBox(-0.2575F, -0.443F, -1.1457F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.5F, 5.0F, -0.3557F, 0.8439F, -0.2391F));

		PartDefinition cube_r334 = osteoderms7.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(20, 57).addBox(-0.7766F, -0.5226F, -1.0792F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.5F, 5.0F, -1.1326F, 1.3783F, -0.9657F));

		PartDefinition cube_r335 = osteoderms7.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(74, 2).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7629F, -0.296F, 5.5465F, -0.0693F, -0.0531F, -0.6283F));

		PartDefinition cube_r336 = osteoderms7.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(28, 71).addBox(-0.4466F, -0.5011F, -0.5638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7061F, 0.9842F, 9.2273F, 0.0288F, 0.6079F, 0.0197F));

		PartDefinition cube_r337 = osteoderms7.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(73, 22).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7629F, 0.104F, 9.9465F, -0.0693F, -0.0531F, -0.6283F));

		PartDefinition cube_r338 = osteoderms7.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(73, 46).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8629F, 0.004F, 8.5465F, -0.0693F, -0.0531F, -0.6283F));

		PartDefinition cube_r339 = osteoderms7.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(73, 58).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7629F, -0.196F, 7.0465F, -0.0693F, -0.0531F, -0.6283F));

		PartDefinition cube_r340 = osteoderms7.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(70, 70).addBox(-0.3F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7135F, 0.7941F, 7.3096F, -2.8566F, 0.9562F, -2.9212F));

		PartDefinition osteoderms15 = tail2.addOrReplaceChild("osteoderms15", CubeListBuilder.create(), PartPose.offset(-1.5629F, 0.5115F, 1.422F));

		PartDefinition cube_r341 = osteoderms15.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(48, 19).mirror().addBox(-0.7425F, -0.443F, -1.1457F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2922F, -0.6308F, 0.1961F));

		PartDefinition cube_r342 = osteoderms15.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(74, 15).mirror().addBox(-0.5F, -0.5F, 3.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5629F, -2.4111F, -4.5341F, -0.2095F, 0.1582F, 0.6378F));

		PartDefinition cube_r343 = osteoderms15.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(57, 32).mirror().addBox(-0.2234F, -0.5226F, -1.0792F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1326F, -1.3783F, 0.9657F));

		PartDefinition cube_r344 = osteoderms15.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(9, 74).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6629F, -0.696F, 1.0465F, -0.0693F, 0.0531F, 0.6283F));

		PartDefinition cube_r345 = osteoderms15.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(47, 37).mirror().addBox(-0.7425F, -0.443F, -1.1457F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3F, 2.4F, -0.2922F, -0.6308F, 0.1961F));

		PartDefinition cube_r346 = osteoderms15.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(57, 28).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5043F, 0.2079F, 2.369F, -3.0268F, 0.0654F, 2.9962F));

		PartDefinition cube_r347 = osteoderms15.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(32, 57).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1043F, 0.3079F, 2.969F, -2.8814F, -1.2098F, 2.6797F));

		PartDefinition cube_r348 = osteoderms15.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(58, 72).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6629F, -0.596F, 2.5465F, -0.0693F, 0.0531F, 0.6283F));

		PartDefinition cube_r349 = osteoderms15.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(72, 56).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6629F, -0.496F, 4.0465F, -0.0693F, 0.0531F, 0.6283F));

		PartDefinition cube_r350 = osteoderms15.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(47, 10).mirror().addBox(-0.7425F, -0.443F, -1.1457F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.5F, 5.0F, -0.3557F, -0.8439F, 0.2391F));

		PartDefinition cube_r351 = osteoderms15.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(20, 57).mirror().addBox(-0.2234F, -0.5226F, -1.0792F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 0.5F, 5.0F, -1.1326F, -1.3783F, 0.9657F));

		PartDefinition cube_r352 = osteoderms15.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(74, 2).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7629F, -0.296F, 5.5465F, -0.0693F, 0.0531F, 0.6283F));

		PartDefinition cube_r353 = osteoderms15.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(28, 71).mirror().addBox(-0.5534F, -0.5011F, -0.5638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7061F, 0.9842F, 9.2273F, 0.0288F, -0.6079F, -0.0197F));

		PartDefinition cube_r354 = osteoderms15.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(73, 22).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7629F, 0.104F, 9.9465F, -0.0693F, 0.0531F, 0.6283F));

		PartDefinition cube_r355 = osteoderms15.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(73, 46).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8629F, 0.004F, 8.5465F, -0.0693F, 0.0531F, 0.6283F));

		PartDefinition cube_r356 = osteoderms15.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(73, 58).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7629F, -0.196F, 7.0465F, -0.0693F, 0.0531F, 0.6283F));

		PartDefinition cube_r357 = osteoderms15.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(70, 70).mirror().addBox(-0.7F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7135F, 0.7941F, 7.3096F, -2.8566F, -0.9562F, 2.9212F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0755F, 10.539F, 0.2887F, -0.229F, 0.1599F));

		PartDefinition cube_r358 = tail3.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.2174F, 0.0593F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9838F, 0.0975F, 0.0873F, 0.0F, 0.0F));

		PartDefinition osteoderms8 = tail3.addOrReplaceChild("osteoderms8", CubeListBuilder.create(), PartPose.offset(-1.0F, -0.5162F, 11.4975F));

		PartDefinition cube_r359 = osteoderms8.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(0, 75).addBox(1.0F, -1.25F, -9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r360 = osteoderms8.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(74, 72).addBox(0.0F, -1.25F, -9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1F, 1.4F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r361 = osteoderms8.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(65, 74).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1627F, -6.1311F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r362 = osteoderms8.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(74, 61).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2627F, -4.6311F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r363 = osteoderms8.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(57, 74).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3627F, -3.0311F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r364 = osteoderms8.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(51, 74).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4627F, -1.4311F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r365 = osteoderms8.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(48, 74).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5627F, 0.1689F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r366 = osteoderms8.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(45, 74).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6627F, 1.7689F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r367 = osteoderms8.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(45, 19).mirror().addBox(5.9864F, -0.2054F, 6.173F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(58, 57).mirror().addBox(4.6325F, -0.1937F, 4.6875F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(37, 19).mirror().addBox(3.6203F, -0.2346F, 3.5767F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(42, 24).mirror().addBox(2.6752F, -0.2663F, 2.5395F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(59, 4).mirror().addBox(1.8706F, -0.3787F, 1.6563F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(20, 61).mirror().addBox(0.7125F, -0.389F, 0.6824F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(70, 60).mirror().addBox(-0.4326F, -0.4002F, -0.5741F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4358F, 0.9112F, -7.9702F, 0.15F, -0.7332F, -0.1033F));

		PartDefinition cube_r368 = osteoderms8.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(37, 74).mirror().addBox(-0.5115F, -0.3006F, -0.5101F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4358F, 0.9373F, -9.47F, 0.1383F, -0.8214F, -0.1034F));

		PartDefinition cube_r369 = osteoderms8.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(45, 19).addBox(-6.9864F, -0.2054F, 6.173F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 57).addBox(-5.6325F, -0.1937F, 4.6875F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 19).addBox(-4.6203F, -0.2346F, 3.5767F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 24).addBox(-3.6752F, -0.2663F, 2.5395F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 4).addBox(-2.8706F, -0.3787F, 1.6563F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 61).addBox(-1.7125F, -0.389F, 0.6824F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 60).addBox(-0.5674F, -0.4002F, -0.5741F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5642F, 0.9112F, -7.9702F, 0.15F, 0.7332F, 0.1033F));

		PartDefinition cube_r370 = osteoderms8.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(37, 74).addBox(-0.4885F, -0.3006F, -0.5101F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5642F, 0.9373F, -9.47F, 0.1383F, 0.8214F, 0.1034F));

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