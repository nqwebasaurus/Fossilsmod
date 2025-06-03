package fossils.fossils.client.blockentity.model.sinosaurussinensis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SinosaurussinensisFossilModel extends SkullModelBase {
	private final ModelPart fossil;
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
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftCrest;
	private final ModelPart rightCrest;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public SinosaurussinensisFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
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
		this.neck4 = this.chest.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftCrest = this.head.getChild("leftCrest");
		this.rightCrest = this.head.getChild("rightCrest");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(0, 19).addBox(0.2F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 19).mirror().addBox(-1.2F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -18.4F, -2.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(22, 34).mirror().addBox(-1.3625F, 4.9548F, -1.1647F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(58, 24).mirror().addBox(-1.3625F, 3.4548F, -0.5647F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -0.0802F, 0.4048F, 0.6684F, 0.1308F, -0.4124F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(19, 26).mirror().addBox(-0.5F, 0.9262F, -1.4255F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -0.0802F, 0.4048F, 0.9076F, 0.0F, -0.2269F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(48, 56).mirror().addBox(-0.5F, -0.1225F, -0.0079F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -0.0802F, 0.4048F, 0.4189F, 0.0F, -0.2269F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(38, 44).mirror().addBox(-0.5F, -1.2F, -0.2F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(38, 44).addBox(2.7F, -1.2F, -0.2F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, -0.136F, -0.5675F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(11, 26).mirror().addBox(-0.5F, 4.7818F, -3.9331F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -0.0802F, -0.0952F, -0.1222F, 0.0F, -0.2094F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(32, 58).mirror().addBox(-0.5F, 3.7998F, -2.9125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -0.0802F, -0.0952F, -0.3142F, 0.0F, -0.2094F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(27, 57).mirror().addBox(-0.5F, 1.701F, -1.9377F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -0.0802F, -0.0952F, -0.5411F, 0.0F, -0.2094F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(17, 61).mirror().addBox(-1.0F, 0.0677F, 0.0084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.2F, -2.7F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(48, 52).mirror().addBox(-1.0F, -1.0F, 0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(0, 0).mirror().addBox(-1.0F, -1.0F, 2.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(0, 0).addBox(2.2F, -1.0F, 2.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F))
				.texOffs(48, 52).addBox(2.2F, -1.0F, 0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(28, 11).addBox(0.6F, 0.0F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -1.2F, -3.4F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(22, 51).mirror().addBox(-1.0F, -0.0367F, -0.0072F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.1F, -2.8F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(5, 43).mirror().addBox(-0.5F, -0.5F, -1.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(5, 43).addBox(2.7F, -0.5F, -1.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.6F, -0.3264F, 0.128F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(38, 13).mirror().addBox(-1.0F, -0.001F, 0.0292F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.6F, 0.2F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(52, 43).mirror().addBox(-1.0F, -0.0359F, 0.0289F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.6F, -1.8F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(38, 13).addBox(0.0F, -0.001F, 0.0292F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1F, -2.6F, 0.2F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(52, 43).addBox(0.0F, -0.0359F, 0.0289F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.6F, -1.8F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(17, 61).addBox(0.0F, 0.0677F, 0.0084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1F, -2.2F, -2.7F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(22, 51).addBox(0.0F, -0.0367F, -0.0072F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.1F, -1.1F, -2.8F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(11, 26).addBox(-0.5F, 4.7818F, -3.9331F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6F, -0.0802F, -0.0952F, -0.1222F, 0.0F, 0.2094F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(32, 58).addBox(-0.5F, 3.7998F, -2.9125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.6F, -0.0802F, -0.0952F, -0.3142F, 0.0F, 0.2094F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(22, 34).addBox(0.3625F, 4.9548F, -1.1647F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(58, 24).addBox(0.3625F, 3.4548F, -0.5647F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.6F, -0.0802F, 0.4048F, 0.6684F, -0.1308F, 0.4124F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(48, 56).addBox(-0.5F, -0.1225F, -0.0079F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.6F, -0.0802F, 0.4048F, 0.4189F, 0.0F, 0.2269F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(19, 26).addBox(-0.5F, 0.9262F, -1.4255F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6F, -0.0802F, 0.4048F, 0.9076F, 0.0F, 0.2269F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(27, 57).addBox(-0.5F, 1.701F, -1.9377F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6F, -0.0802F, -0.0952F, -0.5411F, 0.0F, 0.2094F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(29, 65).addBox(-0.5F, -1.5695F, -0.0298F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6F, 2.6F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(45, 38).mirror().addBox(-1.9455F, -0.3256F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7098F, -2.8792F, 0.0632F, 0.0836F, -1.3325F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(28, 45).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7098F, -2.8792F, 0.0869F, 0.0585F, -1.001F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(28, 45).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7098F, -2.8792F, 0.0869F, -0.0585F, 1.001F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(45, 38).addBox(0.9455F, -0.3256F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7098F, -2.8792F, 0.0632F, -0.0836F, 1.3325F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(32, 65).addBox(-0.5F, -1.6901F, 0.0796F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8F, 0.5F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(35, 65).addBox(-0.5F, -1.7003F, 0.0895F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0F, -1.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(66, 0).addBox(-0.5F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2F, -3.4F, -0.1745F, 0.0F, 0.0F));

		PartDefinition LegL = hips.addOrReplaceChild("LegL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2F, 1.0F, -0.8F, -0.6504F, 0.0795F, 0.1041F));

		PartDefinition Femur_r1 = LegL.addOrReplaceChild("Femur_r1", CubeListBuilder.create().texOffs(47, 13).addBox(-0.5F, 0.0365F, 0.05F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6092F, -2.0F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Femur_r2 = LegL.addOrReplaceChild("Femur_r2", CubeListBuilder.create().texOffs(60, 49).addBox(-0.5F, 0.388F, -0.03F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 2.5092F, -1.4F, -0.4102F, 0.0F, 0.0F));

		PartDefinition Femur_r3 = LegL.addOrReplaceChild("Femur_r3", CubeListBuilder.create().texOffs(57, 41).addBox(-0.5F, -0.9831F, -1.2341F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 2.5092F, 0.4F, -0.9948F, 0.0F, 0.0F));

		PartDefinition Femur_r4 = LegL.addOrReplaceChild("Femur_r4", CubeListBuilder.create().texOffs(45, 44).addBox(-0.5F, -1.3562F, -0.9007F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 0.0092F, 0.7F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Femur_r5 = LegL.addOrReplaceChild("Femur_r5", CubeListBuilder.create().texOffs(51, 5).addBox(-0.5F, -1.0146F, -0.1353F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4092F, 0.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition TibiaL = LegL.addOrReplaceChild("TibiaL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.1092F, -2.3F, 0.4447F, -0.0188F, 0.0394F));

		PartDefinition TibioFibula_r1 = TibiaL.addOrReplaceChild("TibioFibula_r1", CubeListBuilder.create().texOffs(13, 41).addBox(0.7F, -4.8F, -0.2F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 4.8737F, 2.2087F, 0.3927F, 0.0F, 0.0F));

		PartDefinition TibioFibula_r2 = TibiaL.addOrReplaceChild("TibioFibula_r2", CubeListBuilder.create().texOffs(0, 43).addBox(-1.0F, 3.0746F, 5.2868F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 0).addBox(-1.0F, 1.0746F, 4.7868F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8993F, -5.3764F, 0.3927F, 0.0F, 0.0F));

		PartDefinition MetatarsalL = TibiaL.addOrReplaceChild("MetatarsalL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.7993F, 3.6236F, 0.0F, 0.0F, -0.1309F));

		PartDefinition Metatarsal_r1 = MetatarsalL.addOrReplaceChild("Metatarsal_r1", CubeListBuilder.create().texOffs(42, 20).addBox(-1.0F, -0.4329F, 3.9526F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2559F, -4.6338F, -0.2182F, 0.0F, 0.0F));

		PartDefinition FootL = MetatarsalL.addOrReplaceChild("FootL", CubeListBuilder.create().texOffs(32, 0).addBox(-1.5F, -0.3583F, -2.3992F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.0941F, -1.1838F, -0.0872F, -0.0038F, -0.0435F));

		PartDefinition FootL2 = FootL.addOrReplaceChild("FootL2", CubeListBuilder.create().texOffs(38, 9).addBox(-2.0F, -0.4F, -1.9F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.5F, 0.0F, -2.3F));

		PartDefinition LegL2 = hips.addOrReplaceChild("LegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2F, 1.0F, -0.8F, 0.1731F, 0.0227F, -0.1289F));

		PartDefinition Femur_r6 = LegL2.addOrReplaceChild("Femur_r6", CubeListBuilder.create().texOffs(46, 26).addBox(-1.5F, 0.0365F, 0.05F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6092F, -2.0F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Femur_r7 = LegL2.addOrReplaceChild("Femur_r7", CubeListBuilder.create().texOffs(60, 36).addBox(-0.5F, 0.388F, -0.03F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 2.5092F, -1.4F, -0.4102F, 0.0F, 0.0F));

		PartDefinition Femur_r8 = LegL2.addOrReplaceChild("Femur_r8", CubeListBuilder.create().texOffs(57, 20).addBox(-0.5F, -0.9831F, -1.2341F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 2.5092F, 0.4F, -0.9948F, 0.0F, 0.0F));

		PartDefinition Femur_r9 = LegL2.addOrReplaceChild("Femur_r9", CubeListBuilder.create().texOffs(45, 33).addBox(-0.5F, -1.3562F, -0.9007F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 0.0092F, 0.7F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Femur_r10 = LegL2.addOrReplaceChild("Femur_r10", CubeListBuilder.create().texOffs(10, 50).addBox(-0.5F, -1.0146F, -0.1353F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4092F, 0.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition TibiaL2 = LegL2.addOrReplaceChild("TibiaL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.1092F, -2.3F, 0.1396F, 0.0F, 0.0F));

		PartDefinition TibioFibula_r3 = TibiaL2.addOrReplaceChild("TibioFibula_r3", CubeListBuilder.create().texOffs(33, 40).addBox(-1.7F, -4.8F, -0.2F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 4.8737F, 2.2087F, 0.3927F, 0.0F, 0.0F));

		PartDefinition TibioFibula_r4 = TibiaL2.addOrReplaceChild("TibioFibula_r4", CubeListBuilder.create().texOffs(18, 41).addBox(0.0F, 3.0746F, 5.2868F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 38).addBox(0.0F, 1.0746F, 4.7868F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.8993F, -5.3764F, 0.3927F, 0.0F, 0.0F));

		PartDefinition MetatarsalL2 = TibiaL2.addOrReplaceChild("MetatarsalL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.7993F, 3.6236F, -0.2575F, 0.0474F, 0.0866F));

		PartDefinition Metatarsal_r2 = MetatarsalL2.addOrReplaceChild("Metatarsal_r2", CubeListBuilder.create().texOffs(28, 11).addBox(-1.0F, -0.4329F, 3.9526F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2559F, -4.6338F, -0.2182F, 0.0F, 0.0F));

		PartDefinition FootL3 = MetatarsalL2.addOrReplaceChild("FootL3", CubeListBuilder.create().texOffs(28, 23).addBox(-3.5F, -0.3583F, -2.3992F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.0941F, -1.1838F, 0.217F, -0.0143F, 0.001F));

		PartDefinition FootL4 = FootL3.addOrReplaceChild("FootL4", CubeListBuilder.create().texOffs(27, 36).addBox(-3.0F, -0.4F, -1.9F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -2.3F, -0.48F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(14, 13).addBox(-0.5F, -0.7098F, -8.9792F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -3.4F, -0.088F, 0.1304F, -0.0115F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(38, 65).addBox(-0.5F, -1.8469F, 2.0184F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 65).addBox(-0.5F, -1.3469F, 0.0184F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6F, -4.0F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(14, 0).addBox(-2.5F, -2.9124F, -7.0159F, 5.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.3457F, -1.8417F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(32, 29).addBox(-1.0F, -0.5F, -5.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.2F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 66).addBox(-0.5F, -1.2098F, -0.1792F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7F, -5.8F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(66, 8).addBox(-0.5F, -0.9098F, 0.0208F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7F, -8.0F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(58, 16).mirror().addBox(-2.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2098F, -1.4792F, 0.1381F, 0.1806F, -1.2441F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(46, 0).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2098F, -1.4792F, 0.1891F, 0.1261F, -0.913F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(19, 50).mirror().addBox(-3.532F, -1.5399F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2098F, -3.4792F, 0.0635F, 0.29F, -1.5964F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(31, 49).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2098F, -3.4792F, 0.2482F, 0.1642F, -0.8172F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(53, 58).mirror().addBox(-2.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2098F, -3.4792F, 0.182F, 0.2357F, -1.1478F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(58, 54).mirror().addBox(-4.532F, -1.5399F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2098F, -5.4792F, 0.0755F, 0.3411F, -1.5054F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(59, 13).mirror().addBox(-2.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2098F, -5.4792F, 0.2156F, 0.2767F, -1.052F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(38, 50).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2098F, -5.4792F, 0.2931F, 0.1924F, -0.722F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(53, 11).mirror().addBox(-5.532F, -1.5399F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2098F, -7.4792F, 0.0755F, 0.3411F, -1.4531F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(17, 59).mirror().addBox(-2.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2098F, -7.4792F, 0.2156F, 0.2767F, -0.9996F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(5, 54).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2098F, -7.4792F, 0.2931F, 0.1924F, -0.6696F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(58, 16).addBox(0.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2098F, -1.4792F, 0.1381F, -0.1806F, 1.2441F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(46, 0).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2098F, -1.4792F, 0.1891F, -0.1261F, 0.913F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(53, 58).addBox(0.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2098F, -3.4792F, 0.182F, -0.2357F, 1.1478F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(19, 50).addBox(2.532F, -1.5399F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2098F, -3.4792F, 0.0635F, -0.29F, 1.5964F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(31, 49).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2098F, -3.4792F, 0.2482F, -0.1642F, 0.8172F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(59, 13).addBox(0.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2098F, -5.4792F, 0.2156F, -0.2767F, 1.052F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(38, 50).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2098F, -5.4792F, 0.2931F, -0.1924F, 0.722F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(58, 54).addBox(2.532F, -1.5399F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2098F, -5.4792F, 0.0755F, -0.3411F, 1.5054F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(53, 11).addBox(2.532F, -1.5399F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2098F, -7.4792F, 0.0755F, -0.3411F, 1.4531F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(17, 59).addBox(0.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2098F, -7.4792F, 0.2156F, -0.2767F, 0.9996F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(5, 54).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2098F, -7.4792F, 0.2931F, -0.1924F, 0.6696F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(10, 66).addBox(0.0F, -1.2471F, -0.8739F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -9.1F, -0.176F, 0.1289F, -0.0229F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(13, 66).addBox(-0.5F, -0.7658F, -0.0516F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.8F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(66, 18).addBox(-0.5F, -0.9826F, -0.0015F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -4.8F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(57, 33).mirror().addBox(-2.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0098F, -0.3792F, 0.2618F, 0.3308F, -1.0032F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(32, 5).mirror().addBox(-6.532F, -1.5399F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0098F, -0.3792F, 0.0923F, 0.4092F, -1.4644F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(8, 39).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0098F, -0.3792F, 0.3536F, 0.2295F, -0.6744F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(14, 19).mirror().addBox(-6.532F, -1.5399F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1902F, -2.3792F, 0.1011F, 0.4432F, -1.4957F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(52, 35).mirror().addBox(-5.532F, -1.5399F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4902F, -4.3792F, 0.1342F, 0.5618F, -1.5495F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(55, 47).mirror().addBox(-2.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1902F, -2.3792F, 0.2855F, 0.3577F, -1.0302F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(27, 34).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1902F, -2.3792F, 0.3842F, 0.2477F, -0.7021F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(45, 18).mirror().addBox(-2.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4902F, -4.3792F, 0.3726F, 0.45F, -1.0657F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(11, 32).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4902F, -4.3792F, 0.4939F, 0.3095F, -0.7417F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(11, 32).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4902F, -4.3792F, 0.4939F, -0.3095F, 0.7417F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(45, 18).addBox(0.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4902F, -4.3792F, 0.3726F, -0.45F, 1.0657F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(52, 35).addBox(2.532F, -1.5399F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4902F, -4.3792F, 0.1342F, -0.5618F, 1.5495F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(27, 34).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1902F, -2.3792F, 0.3842F, -0.2477F, 0.7021F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(55, 47).addBox(0.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1902F, -2.3792F, 0.2855F, -0.3577F, 1.0302F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(14, 19).addBox(2.532F, -1.5399F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1902F, -2.3792F, 0.1011F, -0.4432F, 1.4957F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(57, 33).addBox(0.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0098F, -0.3792F, 0.2618F, -0.3308F, 1.0032F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(32, 5).addBox(2.532F, -1.5399F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0098F, -0.3792F, 0.0923F, -0.4092F, 1.4644F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(8, 39).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0098F, -0.3792F, 0.3536F, -0.2295F, 0.6744F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(11, 26).mirror().addBox(-0.5F, -0.0146F, -0.3561F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 5.428F, -2.0339F, -0.1045F, -0.3407F, 0.0677F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(28, 28).mirror().addBox(-0.5F, -0.0146F, -0.0561F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 5.428F, -2.0339F, -0.346F, -0.4807F, 0.1652F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(54, 13).mirror().addBox(-0.5F, -0.0146F, -0.3561F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 5.428F, -2.0339F, -0.5077F, -1.0849F, 0.6398F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(50, 31).mirror().addBox(1.0F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(50, 31).addBox(2.6F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3F, 5.3174F, -3.0015F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(3, 49).mirror().addBox(0.0F, -0.7826F, -2.0015F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 3.8F, -4.0F, 1.0551F, -0.4937F, -0.6963F));

		PartDefinition cube_r84 = chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(37, 58).mirror().addBox(0.0F, -0.7826F, -0.0015F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 13).mirror().addBox(0.0F, -0.2826F, 0.9985F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(37, 58).addBox(4.6F, -0.7826F, -0.0015F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 13).addBox(4.6F, -0.2826F, 0.9985F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.8F, 3.8F, -4.0F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r85 = chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(46, 61).mirror().addBox(-0.5F, -0.0448F, -1.0309F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 61).addBox(4.1F, -0.0448F, -1.0309F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3F, 0.413F, -0.2005F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(53, 16).mirror().addBox(0.0F, -0.4468F, -2.0235F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(53, 16).addBox(4.6F, -0.4468F, -2.0235F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.8F, -0.2F, -1.0F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r87 = chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(11, 26).addBox(-0.5F, -0.0146F, -0.3561F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 5.428F, -2.0339F, -0.1045F, 0.3407F, -0.0677F));

		PartDefinition cube_r88 = chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(54, 13).addBox(-0.5F, -0.0146F, -0.3561F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 5.428F, -2.0339F, -0.5077F, 1.0849F, -0.6398F));

		PartDefinition cube_r89 = chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(28, 28).addBox(-0.5F, -0.0146F, -0.0561F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 5.428F, -2.0339F, -0.346F, 0.4807F, -0.1652F));

		PartDefinition cube_r90 = chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(3, 49).addBox(-1.0F, -0.7826F, -2.0015F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.8F, 3.8F, -4.0F, 1.0551F, 0.4937F, 0.6963F));

		PartDefinition cube_r91 = chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(14, 34).addBox(-1.0F, -0.2826F, -0.0015F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -4.8F, 0.1396F, 0.0F, 0.0F));

		PartDefinition ArmL = chest.addOrReplaceChild("ArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9F, 4.8709F, -3.1339F, -0.7348F, 0.2394F, -0.5325F));

		PartDefinition Humerus_r1 = ArmL.addOrReplaceChild("Humerus_r1", CubeListBuilder.create().texOffs(7, 56).addBox(0.4118F, -10.5386F, -5.8031F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9278F, 2.9944F, 11.1395F, 0.829F, 0.0F, 0.0F));

		PartDefinition ElbowL = ArmL.addOrReplaceChild("ElbowL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1722F, 2.6944F, 2.5395F, -0.6894F, 0.0F, 0.0F));

		PartDefinition Radio_Ulna_r1 = ElbowL.addOrReplaceChild("Radio_Ulna_r1", CubeListBuilder.create().texOffs(56, 6).addBox(1.4118F, 3.0805F, -10.0139F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(12, 58).addBox(1.4118F, 2.8805F, -8.8139F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.1F, -0.5414F, 9.2392F, -0.2618F, 0.0F, 0.0F));

		PartDefinition HandL = ElbowL.addOrReplaceChild("HandL", CubeListBuilder.create().texOffs(0, 26).addBox(-0.6311F, -0.0817F, -0.8046F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 2.6586F, -0.9608F, -0.0756F, 0.0436F, 0.6267F));

		PartDefinition ArmL2 = chest.addOrReplaceChild("ArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9F, 4.8709F, -3.1339F, 0.1923F, -0.3726F, 0.5986F));

		PartDefinition Humerus_r2 = ArmL2.addOrReplaceChild("Humerus_r2", CubeListBuilder.create().texOffs(56, 0).addBox(-1.4118F, -10.5386F, -5.8031F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9278F, 2.9944F, 11.1395F, 0.829F, 0.0F, 0.0F));

		PartDefinition ElbowL2 = ArmL2.addOrReplaceChild("ElbowL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1722F, 2.6944F, 2.5395F, -0.6894F, 0.0F, 0.0F));

		PartDefinition Radio_Ulna_r2 = ElbowL2.addOrReplaceChild("Radio_Ulna_r2", CubeListBuilder.create().texOffs(0, 36).addBox(-2.4118F, 3.0805F, -10.0139F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 58).addBox(-2.4118F, 2.8805F, -8.8139F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.1F, -0.5414F, 9.2392F, -0.2618F, 0.0F, 0.0F));

		PartDefinition HandL2 = ElbowL2.addOrReplaceChild("HandL2", CubeListBuilder.create().texOffs(14, 0).addBox(-0.3689F, -0.0817F, -0.8046F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 2.6586F, -0.9608F, -0.0791F, -0.0368F, -0.5396F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8F, -4.7F, -0.3124F, 0.2079F, -0.0666F));

		PartDefinition cube_r92 = neck4.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(20, 66).addBox(-0.5F, -1.7465F, 1.0826F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 40).addBox(-1.0F, -1.0465F, 0.0826F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0F, -2.9F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r93 = neck4.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(27, 48).mirror().addBox(0.0F, -0.5673F, -0.0537F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4273F, -1.6737F, -0.7561F, -0.416F, 0.2943F));

		PartDefinition cube_r94 = neck4.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(27, 48).addBox(0.0F, -0.5673F, -0.0537F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4273F, -1.6737F, -0.7561F, 0.416F, -0.2943F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -2.9F, -0.3423F, 0.1116F, 0.0526F));

		PartDefinition cube_r95 = neck3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(23, 66).addBox(-0.5F, -1.5F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 27).addBox(-0.5F, -1.4F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 28).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -2.9F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r96 = neck3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(15, 49).mirror().addBox(0.0F, -0.5673F, -0.0537F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2273F, -0.7737F, -0.5794F, -0.3156F, 0.1897F));

		PartDefinition cube_r97 = neck3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(49, 18).mirror().addBox(0.0F, -0.5673F, -0.0537F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0727F, -2.7737F, -0.5212F, -0.2863F, 0.1698F));

		PartDefinition cube_r98 = neck3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(15, 49).addBox(0.0F, -0.5673F, -0.0537F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2273F, -0.7737F, -0.5794F, 0.3156F, -0.1897F));

		PartDefinition cube_r99 = neck3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(49, 18).addBox(0.0F, -0.5673F, -0.0537F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0727F, -2.7737F, -0.5212F, 0.2863F, -0.1698F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -2.9F, -0.1564F, 0.2518F, 0.0571F));

		PartDefinition cube_r100 = neck2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(66, 37).addBox(-0.5F, -0.3883F, 3.0711F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 66).addBox(-0.5F, -0.3883F, 1.0711F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 36).addBox(-1.0F, 0.0117F, 0.0711F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.5F, -4.3F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r101 = neck2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(42, 58).mirror().addBox(0.0F, -0.5673F, -0.0537F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4727F, -1.6737F, -0.591F, -0.2863F, 0.1698F));

		PartDefinition cube_r102 = neck2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(58, 58).mirror().addBox(0.0F, -0.5673F, -0.0537F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0727F, -3.6737F, -0.5599F, -0.2991F, 0.1827F));

		PartDefinition cube_r103 = neck2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(42, 58).addBox(0.0F, -0.5673F, -0.0537F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4727F, -1.6737F, -0.591F, 0.2863F, -0.1698F));

		PartDefinition cube_r104 = neck2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(58, 58).addBox(0.0F, -0.5673F, -0.0537F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0727F, -3.6737F, -0.5599F, 0.2991F, -0.1827F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -4.0F, 0.2384F, 0.088F, 0.1994F));

		PartDefinition cube_r105 = neck.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(66, 63).addBox(0.0F, -0.6F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 26).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.2F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r106 = neck.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(28, 28).mirror().addBox(0.0F, -0.5673F, -0.0537F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5273F, -0.9737F, -0.4727F, -0.2991F, 0.1827F));

		PartDefinition cube_r107 = neck.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(28, 28).addBox(0.0F, -0.5673F, -0.0537F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5273F, -0.9737F, -0.4727F, 0.2991F, -0.1827F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(41, 54).addBox(0.2F, -0.0326F, -4.7415F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.16F))
				.texOffs(41, 54).mirror().addBox(-1.2F, -0.0326F, -4.7415F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.16F)).mirror(false)
				.texOffs(49, 23).addBox(-1.5F, 0.2717F, -2.0399F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -2.0F, -0.1173F, 0.1839F, 0.065F));

		PartDefinition cube_r108 = head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(43, 64).mirror().addBox(-2.0F, 0.4195F, -0.9724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(64, 47).mirror().addBox(-2.0F, -0.0805F, -0.9724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(43, 64).addBox(0.0F, 0.4195F, -0.9724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(64, 47).addBox(0.0F, -0.0805F, -0.9724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.6F, -0.6F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r109 = head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(61, 44).mirror().addBox(-1.5F, -1.0019F, 0.0085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(61, 44).addBox(0.5F, -1.0019F, 0.0085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.151F, -0.0532F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r110 = head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(63, 24).mirror().addBox(-0.5F, -0.7F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(63, 24).addBox(1.9F, -0.7F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.2F, 0.5302F, -0.8299F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r111 = head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(61, 0).mirror().addBox(-0.5F, -1.1F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.16F)).mirror(false)
				.texOffs(21, 63).mirror().addBox(-0.5F, -1.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(21, 63).addBox(1.9F, -1.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(61, 0).addBox(1.9F, -1.1F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-1.2F, 0.1349F, -0.7125F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r112 = head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(63, 31).mirror().addBox(-0.5F, -0.8321F, -0.145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(34, 62).mirror().addBox(-0.6F, -0.8321F, 0.055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(61, 28).mirror().addBox(-0.72F, -0.8321F, 0.055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(61, 28).addBox(2.12F, -0.8321F, 0.055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(34, 62).addBox(2.0F, -0.8321F, 0.055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(63, 31).addBox(1.9F, -0.8321F, -0.145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.2F, -0.9032F, -2.3864F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r113 = head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(64, 34).mirror().addBox(-0.5F, -0.6F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(64, 34).addBox(1.9F, -0.6F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.2F, -0.1032F, -1.7864F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r114 = head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(61, 4).mirror().addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.16F)).mirror(false)
				.texOffs(61, 4).addBox(1.9F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-1.2F, -0.1248F, -1.8841F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r115 = head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(16, 64).mirror().addBox(-0.5F, -0.8326F, -0.2419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false)
				.texOffs(16, 64).addBox(1.9F, -0.8326F, -0.2419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(-1.2F, -0.2032F, -2.4864F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r116 = head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(8, 36).addBox(-1.5F, -0.9793F, 0.0132F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.251F, -1.0532F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r117 = head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(22, 59).mirror().addBox(-0.61F, -0.3996F, 0.0244F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(22, 59).addBox(0.61F, -0.3996F, 0.0244F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.551F, -5.7532F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r118 = head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(65, 66).mirror().addBox(-0.6F, -0.9451F, -0.0426F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(65, 66).addBox(0.6F, -0.9451F, -0.0426F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.951F, -3.6532F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r119 = head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(41, 5).addBox(-1.0F, -0.9996F, 2.0244F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(53, 54).mirror().addBox(-0.7F, -0.9996F, 0.0244F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(53, 54).addBox(-0.3F, -0.9996F, 0.0244F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.551F, -5.9532F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r120 = head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-0.5F, -0.2F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(11, 63).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(39, 62).mirror().addBox(-0.32F, -1.0F, -1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(62, 39).mirror().addBox(-0.32F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 63).addBox(0.9F, -0.2F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(39, 62).addBox(0.72F, -1.0F, -1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(62, 39).addBox(0.72F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(11, 63).addBox(0.9F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.7F, 0.1674F, -4.5415F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r121 = head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(62, 61).mirror().addBox(-0.5F, -0.1994F, -0.1601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false)
				.texOffs(57, 62).mirror().addBox(-0.5F, 0.5006F, -0.1601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false)
				.texOffs(57, 62).addBox(0.9F, 0.5006F, -0.1601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F))
				.texOffs(62, 61).addBox(0.9F, -0.1994F, -0.1601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(-0.7F, -0.6326F, -3.4415F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r122 = head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(55, 50).mirror().addBox(-0.7F, 0.014F, -3.01F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(20, 55).addBox(-1.0F, 0.014F, -1.01F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 50).addBox(-0.3F, 0.014F, -3.01F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.1F, -2.5F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r123 = head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(55, 37).mirror().addBox(-1.0F, 0.006F, -2.0368F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(55, 37).addBox(-0.8F, 0.006F, -2.0368F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1F, -5.3F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r124 = head.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(48, 64).addBox(-0.5F, -0.1135F, -0.8116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.04F)), PartPose.offsetAndRotation(0.0F, 1.5578F, -6.9586F, 1.8937F, 0.0F, 0.0F));

		PartDefinition cube_r125 = head.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(53, 64).addBox(-0.1F, -0.6F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 1.0972F, -6.3884F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r126 = head.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(61, 64).addBox(0.0F, 0.0149F, -0.6025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -1.7F, -0.6F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r127 = head.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(0, 6).addBox(-1.0F, -1.2F, -1.2F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.3F, -1.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftCrest = head.addOrReplaceChild("leftCrest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 0.8167F, -6.6333F, 0.0F, 0.0F, -0.1571F));

		PartDefinition cube_r128 = leftCrest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(50, 47).addBox(-0.5F, -2.2896F, -2.6802F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.3F, -1.5F, 2.6F, 1.1606F, 0.0873F, 0.0873F));

		PartDefinition cube_r129 = leftCrest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(23, 45).addBox(-0.7004F, -0.3092F, -0.7239F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3F, -1.4F, 0.4F, 1.021F, 0.0873F, 0.0873F));

		PartDefinition cube_r130 = leftCrest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(43, 49).addBox(-0.4252F, -0.3526F, -1.7175F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(0.3F, -3.0F, 2.0F, 0.6542F, 0.0673F, 0.1035F));

		PartDefinition cube_r131 = leftCrest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(39, 37).addBox(-0.5453F, -2.0471F, -0.5908F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.3F, -1.3F, 2.2F, -0.0137F, 0.2264F, 0.0892F));

		PartDefinition cube_r132 = leftCrest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(64, 51).addBox(-0.5453F, -3.0234F, -0.0856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(61, 8).addBox(-0.5453F, -3.0234F, 0.3144F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3F, -1.3F, 2.2F, -0.8166F, 0.2264F, 0.0892F));

		PartDefinition rightCrest = head.addOrReplaceChild("rightCrest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 0.8167F, -6.6333F, 0.0F, 0.0F, 0.1571F));

		PartDefinition cube_r133 = rightCrest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(50, 47).mirror().addBox(-0.5F, -2.2896F, -2.6802F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -1.5F, 2.6F, 1.1606F, -0.0873F, -0.0873F));

		PartDefinition cube_r134 = rightCrest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(23, 45).mirror().addBox(-0.2996F, -0.3092F, -0.7239F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -1.4F, 0.4F, 1.021F, -0.0873F, -0.0873F));

		PartDefinition cube_r135 = rightCrest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(43, 49).mirror().addBox(-0.5748F, -0.3526F, -1.7175F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -3.0F, 2.0F, 0.6542F, -0.0673F, -0.1035F));

		PartDefinition cube_r136 = rightCrest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(39, 37).mirror().addBox(-0.4547F, -2.0471F, -0.5908F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -1.3F, 2.2F, -0.0137F, -0.2264F, -0.0892F));

		PartDefinition cube_r137 = rightCrest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(64, 51).mirror().addBox(-0.4547F, -3.0234F, -0.0856F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(61, 8).mirror().addBox(-0.4547F, -3.0234F, 0.3144F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -1.3F, 2.2F, -0.8166F, -0.2264F, -0.0892F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(34, 54).addBox(0.5F, -0.0286F, -1.803F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(34, 54).mirror().addBox(-1.5F, -0.0286F, -1.803F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, 0.8F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r138 = jaw.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(34, 49).mirror().addBox(-0.8F, -1.3F, -0.7F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(27, 53).mirror().addBox(-1.0F, -0.9F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(62, 21).mirror().addBox(-1.4F, -0.9F, 2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(61, 56).addBox(-0.9F, -0.9F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 49).addBox(0.0F, -1.3F, -0.7F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(27, 53).addBox(-0.8F, -0.9F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(62, 21).addBox(-0.4F, -0.9F, 2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4F, 2.0111F, -6.3232F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r139 = jaw.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(61, 18).mirror().addBox(-1.4F, -1.0076F, -0.0044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 54).mirror().addBox(-1.4F, -1.0076F, 0.9956F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 54).addBox(0.4F, -1.0076F, 0.9956F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(61, 18).addBox(0.4F, -1.0076F, -0.0044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8111F, -3.1232F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r140 = jaw.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(13, 54).mirror().addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(13, 54).addBox(0.8F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4F, -0.0286F, -1.803F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r141 = jaw.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(52, 60).mirror().addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(52, 60).addBox(1.7F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.1F, 1.1696F, -2.4976F, -1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r142 = jaw.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(55, 30).addBox(-1.0F, 0.0246F, -0.9605F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 62).addBox(-0.4F, 0.0246F, -1.8605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.04F)), PartPose.offsetAndRotation(0.0F, 0.3714F, -3.803F, 0.4014F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.0F, -1.6688F, 7.0447F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.4F, 0.0252F, -0.1465F, 0.0047F));

		PartDefinition cube_r143 = tail.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(7, 0).addBox(0.0F, -1.4003F, -0.0694F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 5.1F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r144 = tail.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(21, 13).addBox(0.0F, -1.7F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 14).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 1.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r145 = tail.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(5, 61).addBox(0.0F, 1.5F, 5.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 62).addBox(0.0F, 0.6F, 3.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 62).addBox(0.0F, -0.4F, 1.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 13).addBox(0.0F, -0.7F, -0.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1505F, 1.3257F, 0.4887F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(15, 11).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, 0.2376F, -0.1273F, -0.0307F));

		PartDefinition cube_r146 = tail2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(65, 54).addBox(0.0F, -1.6F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 11).addBox(0.0F, -1.5F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 42).addBox(0.0F, -1.5F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 58).addBox(0.0F, -1.6F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 13).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r147 = tail2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(6, 66).addBox(0.0F, 6.0F, 13.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 4).addBox(0.0F, 5.2F, 11.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 66).addBox(0.0F, 4.3F, 9.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 13).addBox(0.0F, 3.5F, 7.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1505F, -6.6743F, 0.4887F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(40, 53).addBox(0.0F, -0.9F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 51).addBox(0.0F, -0.8F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 13).addBox(0.0F, -0.7F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r148 = tail3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(38, 13).addBox(0.0F, 11.4F, 23.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 20).addBox(0.0F, 10.4F, 21.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 28).addBox(0.0F, 9.5F, 19.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 23).addBox(0.0F, 8.6F, 17.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 40).addBox(0.0F, 7.8F, 15.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1505F, -16.6743F, 0.4887F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 11.0F, -0.2833F, 0.1677F, -0.0486F));

		PartDefinition cube_r149 = tail4.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(32, 0).addBox(0.0F, 13.2F, 27.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 28).addBox(0.0F, 12.3F, 25.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1505F, -27.6743F, 0.4887F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(16, 23).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 11.0F, -0.3604F, 0.2457F, -0.0914F));

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