package fossils.fossils.client.blockentity.model.dilophosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DilophosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Dilophosaurus;
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
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Body;
	private final ModelPart Chest;
	private final ModelPart ArmL;
	private final ModelPart ElbowL;
	private final ModelPart HandL;
	private final ModelPart ArmL2;
	private final ModelPart ElbowL2;
	private final ModelPart HandL2;
	private final ModelPart Neck1;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Head;
	private final ModelPart ParasagittalCrest2;
	private final ModelPart ParasagittalCrest3;
	private final ModelPart Jaw;

	public DilophosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Dilophosaurus = this.fossil.getChild("Dilophosaurus");
		this.LegL = this.Dilophosaurus.getChild("LegL");
		this.TibiaL = this.LegL.getChild("TibiaL");
		this.MetatarsalL = this.TibiaL.getChild("MetatarsalL");
		this.FootL = this.MetatarsalL.getChild("FootL");
		this.FootL2 = this.FootL.getChild("FootL2");
		this.LegL2 = this.Dilophosaurus.getChild("LegL2");
		this.TibiaL2 = this.LegL2.getChild("TibiaL2");
		this.MetatarsalL2 = this.TibiaL2.getChild("MetatarsalL2");
		this.FootL3 = this.MetatarsalL2.getChild("FootL3");
		this.FootL4 = this.FootL3.getChild("FootL4");
		this.Tail1 = this.Dilophosaurus.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Body = this.Dilophosaurus.getChild("Body");
		this.Chest = this.Body.getChild("Chest");
		this.ArmL = this.Chest.getChild("ArmL");
		this.ElbowL = this.ArmL.getChild("ElbowL");
		this.HandL = this.ElbowL.getChild("HandL");
		this.ArmL2 = this.Chest.getChild("ArmL2");
		this.ElbowL2 = this.ArmL2.getChild("ElbowL2");
		this.HandL2 = this.ElbowL2.getChild("HandL2");
		this.Neck1 = this.Chest.getChild("Neck1");
		this.Neck2 = this.Neck1.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Head = this.Neck3.getChild("Head");
		this.ParasagittalCrest2 = this.Head.getChild("ParasagittalCrest2");
		this.ParasagittalCrest3 = this.Head.getChild("ParasagittalCrest3");
		this.Jaw = this.Head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Dilophosaurus = fossil.addOrReplaceChild("Dilophosaurus", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -22.3F, 8.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition basin_r1 = Dilophosaurus.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(32, 57).mirror().addBox(-1.5F, 0.1154F, 0.0763F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(32, 57).addBox(0.5F, 0.1154F, 0.0763F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(36, 42).addBox(-0.5F, -0.1846F, 0.0763F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -1.5F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Dilophosaurus.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(55, 69).mirror().addBox(0.0348F, 4.1284F, -1.3756F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.23F)).mirror(false), PartPose.offsetAndRotation(-1.8001F, 2.3582F, -0.0932F, 0.9809F, -0.0539F, -0.3155F));

		PartDefinition cube_r2 = Dilophosaurus.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(67, 71).mirror().addBox(-0.3933F, -0.8344F, -1.2816F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.8001F, 2.3582F, -0.0932F, 1.7219F, 0.067F, -0.4541F));

		PartDefinition cube_r3 = Dilophosaurus.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(33, 62).mirror().addBox(-1.0F, -0.9311F, -1.6831F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(33, 62).addBox(2.6F, -0.9311F, -1.6831F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.3F, 2.5458F, -1.118F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Dilophosaurus.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(13, 52).mirror().addBox(0.0348F, 1.9051F, 0.1407F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(24, 58).mirror().addBox(0.0348F, 5.4051F, -0.2593F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8001F, 2.3582F, -0.0932F, 0.6319F, -0.0539F, -0.3155F));

		PartDefinition cube_r5 = Dilophosaurus.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(51, 77).mirror().addBox(-0.3933F, -0.361F, -0.2891F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8001F, 2.3582F, -0.0932F, 0.8143F, 0.067F, -0.4541F));

		PartDefinition cube_r6 = Dilophosaurus.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(45, 79).mirror().addBox(-0.3933F, -0.7925F, 0.3912F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.8001F, 2.3582F, -0.0932F, 0.3256F, 0.067F, -0.4541F));

		PartDefinition cube_r7 = Dilophosaurus.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(56, 77).mirror().addBox(-0.2042F, 1.2975F, -0.3906F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 3.4F, -4.0F, -0.4661F, -0.0503F, -0.1598F));

		PartDefinition cube_r8 = Dilophosaurus.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(61, 79).mirror().addBox(-0.2042F, -0.2874F, -0.2584F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 3.4F, -4.0F, -0.5534F, -0.0503F, -0.1598F));

		PartDefinition cube_r9 = Dilophosaurus.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(77, 56).mirror().addBox(-0.2419F, -0.201F, -0.1958F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 1.4F, -2.7F, -0.5411F, 0.0F, -0.4712F));

		PartDefinition cube_r10 = Dilophosaurus.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(32, 67).mirror().addBox(-1.0F, 0.4689F, -1.1831F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(32, 67).addBox(2.6F, 0.4689F, -1.1831F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.3F, -0.6F, 0.4F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Dilophosaurus.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(60, 67).mirror().addBox(-1.0F, -0.167F, -1.395F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 67).addBox(2.6F, -0.167F, -1.395F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3F, -0.6F, 0.4F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Dilophosaurus.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(54, 0).mirror().addBox(-1.0F, -1.2365F, -0.7412F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(54, 0).addBox(2.6F, -1.2365F, -0.7412F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.3F, -0.6F, 0.4F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r13 = Dilophosaurus.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(73, 40).mirror().addBox(-1.0F, -1.3938F, -2.3951F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(73, 40).addBox(2.6F, -1.3938F, -2.3951F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3F, -0.6F, 0.4F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r14 = Dilophosaurus.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(73, 52).mirror().addBox(-1.0F, -0.7354F, -1.1835F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(73, 52).addBox(2.6F, -0.7354F, -1.1835F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.3F, -0.6F, -1.8F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r15 = Dilophosaurus.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(55, 73).mirror().addBox(-1.0F, -0.3639F, -1.1765F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(55, 73).addBox(2.6F, -0.3639F, -1.1765F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.3F, -0.6F, -1.8F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r16 = Dilophosaurus.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(60, 83).mirror().addBox(-1.0F, -1.2825F, -0.4838F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(60, 83).addBox(2.6F, -1.2825F, -0.4838F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.3F, -0.6F, -1.8F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r17 = Dilophosaurus.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(19, 51).mirror().addBox(-1.0F, -0.5819F, -1.8781F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(19, 51).addBox(2.6F, -0.5819F, -1.8781F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.3F, -0.6F, 0.4F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r18 = Dilophosaurus.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(79, 38).mirror().addBox(-2.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5098F, -2.8792F, -0.0251F, -0.1095F, -1.2296F));

		PartDefinition cube_r19 = Dilophosaurus.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(85, 23).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5098F, -2.8792F, -0.0595F, -0.0953F, -0.8966F));

		PartDefinition cube_r20 = Dilophosaurus.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(77, 56).addBox(-0.7581F, -0.201F, -0.1958F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2F, 1.4F, -2.7F, -0.5411F, 0.0F, 0.4712F));

		PartDefinition cube_r21 = Dilophosaurus.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(61, 79).addBox(-0.7958F, -0.2874F, -0.2584F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.2F, 3.4F, -4.0F, -0.5534F, 0.0503F, 0.1598F));

		PartDefinition cube_r22 = Dilophosaurus.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(45, 83).mirror().addBox(-0.2042F, 3.6574F, -1.5069F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 3.4F, -4.0F, -0.1869F, -0.0503F, -0.1598F));

		PartDefinition cube_r23 = Dilophosaurus.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(45, 83).addBox(-0.7958F, 3.6574F, -1.5069F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.2F, 3.4F, -4.0F, -0.1869F, 0.0503F, 0.1598F));

		PartDefinition cube_r24 = Dilophosaurus.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(56, 77).addBox(-0.7958F, 1.2975F, -0.3906F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2F, 3.4F, -4.0F, -0.4661F, 0.0503F, 0.1598F));

		PartDefinition cube_r25 = Dilophosaurus.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(45, 79).addBox(-0.6067F, -0.7925F, 0.3912F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.8001F, 2.3582F, -0.0932F, 0.3256F, -0.067F, 0.4541F));

		PartDefinition cube_r26 = Dilophosaurus.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(67, 71).addBox(-0.6067F, -0.8344F, -1.2816F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.8001F, 2.3582F, -0.0932F, 1.7219F, -0.067F, 0.4541F));

		PartDefinition cube_r27 = Dilophosaurus.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(51, 77).addBox(-0.6067F, -0.361F, -0.2891F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8001F, 2.3582F, -0.0932F, 0.8143F, -0.067F, 0.4541F));

		PartDefinition cube_r28 = Dilophosaurus.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(55, 69).addBox(-1.0348F, 4.1284F, -1.3756F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.23F)), PartPose.offsetAndRotation(1.8001F, 2.3582F, -0.0932F, 0.9809F, 0.0539F, 0.3155F));

		PartDefinition cube_r29 = Dilophosaurus.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(27, 83).addBox(-1.0348F, 3.9144F, 2.8445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(1.8001F, 2.3582F, -0.0932F, 0.0646F, 0.0539F, 0.3155F));

		PartDefinition cube_r30 = Dilophosaurus.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(13, 52).addBox(-1.0348F, 1.9051F, 0.1407F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(24, 58).addBox(-1.0348F, 5.4051F, -0.2593F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8001F, 2.3582F, -0.0932F, 0.6319F, 0.0539F, 0.3155F));

		PartDefinition cube_r31 = Dilophosaurus.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(85, 23).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5098F, -2.8792F, -0.0595F, 0.0953F, 0.8966F));

		PartDefinition cube_r32 = Dilophosaurus.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(79, 38).addBox(0.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5098F, -2.8792F, -0.0251F, 0.1095F, 1.2296F));

		PartDefinition basin_r2 = Dilophosaurus.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(24, 62).addBox(-0.5F, -0.569F, 1.9612F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5F, -6.4F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Atlas_r1 = Dilophosaurus.addOrReplaceChild("Atlas_r1", CubeListBuilder.create().texOffs(87, 88).addBox(0.0F, -2.1184F, -0.1151F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.1498F, 2.3709F, -0.384F, 0.0F, 0.0F));

		PartDefinition Atlas_r2 = Dilophosaurus.addOrReplaceChild("Atlas_r2", CubeListBuilder.create().texOffs(73, 88).addBox(0.0F, -2.0903F, 0.1716F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.3F, 0.8F, -0.4102F, 0.0F, 0.0F));

		PartDefinition Atlas_r3 = Dilophosaurus.addOrReplaceChild("Atlas_r3", CubeListBuilder.create().texOffs(20, 88).addBox(0.0F, -2.0528F, -0.054F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.5F, -0.3F, -0.288F, 0.0F, 0.0F));

		PartDefinition Atlas_r4 = Dilophosaurus.addOrReplaceChild("Atlas_r4", CubeListBuilder.create().texOffs(40, 87).addBox(0.0F, -1.9418F, -0.0851F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.5F, -1.5F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Atlas_r5 = Dilophosaurus.addOrReplaceChild("Atlas_r5", CubeListBuilder.create().texOffs(9, 59).addBox(0.0F, -1.6953F, -0.0182F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.7641F, -3.3504F, -0.1047F, 0.0F, 0.0F));

		PartDefinition LegL = Dilophosaurus.addOrReplaceChild("LegL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2F, 2.3128F, -1.6962F, -0.7375F, -0.0883F, -0.0968F));

		PartDefinition Femur_r1 = LegL.addOrReplaceChild("Femur_r1", CubeListBuilder.create().texOffs(77, 61).addBox(-1.0F, -1.1F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 6.1889F, -2.8078F, -1.1868F, 0.0F, 0.0F));

		PartDefinition Femur_r2 = LegL.addOrReplaceChild("Femur_r2", CubeListBuilder.create().texOffs(67, 67).addBox(-0.5F, 2.1581F, -0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(7, 78).addBox(0.0F, -0.0419F, -0.9975F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.9108F, -1.3508F, -0.384F, 0.0F, 0.0F));

		PartDefinition Femur_r3 = LegL.addOrReplaceChild("Femur_r3", CubeListBuilder.create().texOffs(80, 40).addBox(0.5F, 0.0014F, 0.0126F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 1.8331F, -1.3196F, -0.5323F, 0.0F, 0.0F));

		PartDefinition Femur_r4 = LegL.addOrReplaceChild("Femur_r4", CubeListBuilder.create().texOffs(0, 80).addBox(0.5F, -0.3831F, -1.2341F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 2.5092F, 0.4F, -0.9948F, 0.0F, 0.0F));

		PartDefinition Femur_r5 = LegL.addOrReplaceChild("Femur_r5", CubeListBuilder.create().texOffs(83, 68).addBox(0.5F, -0.1871F, -0.7632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.5F, 1.5546F, 0.6859F, -0.6632F, 0.0F, 0.0F));

		PartDefinition Femur_r6 = LegL.addOrReplaceChild("Femur_r6", CubeListBuilder.create().texOffs(79, 79).addBox(0.5F, -0.1871F, -0.7632F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 0.0092F, 1.1F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Femur_r7 = LegL.addOrReplaceChild("Femur_r7", CubeListBuilder.create().texOffs(9, 63).addBox(-0.5F, -1.3562F, -0.9007F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0092F, 0.7F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Femur_r8 = LegL.addOrReplaceChild("Femur_r8", CubeListBuilder.create().texOffs(74, 79).addBox(0.5F, 0.6438F, -0.6007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0092F, 0.7F, -0.6109F, 0.0F, 0.0F));

		PartDefinition TibiaL = LegL.addOrReplaceChild("TibiaL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 7.6476F, -2.868F, 0.7505F, 0.0F, 0.0F));

		PartDefinition TibioFibula_r1 = TibiaL.addOrReplaceChild("TibioFibula_r1", CubeListBuilder.create().texOffs(63, 58).addBox(0.7F, -4.6F, -0.2F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 4.8737F, 2.2087F, 0.3927F, 0.0F, 0.0F));

		PartDefinition TibioFibula_r2 = TibiaL.addOrReplaceChild("TibioFibula_r2", CubeListBuilder.create().texOffs(18, 63).addBox(-1.0F, 2.2746F, 5.2868F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 63).addBox(-1.2F, 1.0746F, 4.7868F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8993F, -5.3764F, 0.3927F, 0.0F, 0.0F));

		PartDefinition MetatarsalL = TibiaL.addOrReplaceChild("MetatarsalL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.9872F, 3.692F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Metatarsal_r1 = MetatarsalL.addOrReplaceChild("Metatarsal_r1", CubeListBuilder.create().texOffs(9, 68).addBox(-1.0F, 0.0671F, 3.9526F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8559F, -4.6338F, -0.2182F, 0.0F, 0.0F));

		PartDefinition FootL = MetatarsalL.addOrReplaceChild("FootL", CubeListBuilder.create().texOffs(51, 42).addBox(-1.0F, -0.3583F, -2.3992F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.2911F, -1.2535F, 1.5272F, 0.0F, 0.0F));

		PartDefinition FootL2 = FootL.addOrReplaceChild("FootL2", CubeListBuilder.create().texOffs(51, 47).addBox(-1.5F, -0.4F, -2.9F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 0.0F, -2.3F, 0.6545F, 0.0F, 0.0F));

		PartDefinition LegL2 = Dilophosaurus.addOrReplaceChild("LegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2F, 2.3128F, -1.6962F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Femur_r9 = LegL2.addOrReplaceChild("Femur_r9", CubeListBuilder.create().texOffs(24, 28).mirror().addBox(-1.0F, -1.1F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.1889F, -2.8078F, -1.1868F, 0.0F, 0.0F));

		PartDefinition Femur_r10 = LegL2.addOrReplaceChild("Femur_r10", CubeListBuilder.create().texOffs(25, 31).mirror().addBox(-1.5F, 2.1581F, -0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(26, 35).mirror().addBox(-1.0F, -0.0419F, -0.9975F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.9108F, -1.3508F, -0.384F, 0.0F, 0.0F));

		PartDefinition Femur_r11 = LegL2.addOrReplaceChild("Femur_r11", CubeListBuilder.create().texOffs(21, 36).mirror().addBox(-1.5F, 0.0014F, 0.0126F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.8331F, -1.3196F, -0.5323F, 0.0F, 0.0F));

		PartDefinition Femur_r12 = LegL2.addOrReplaceChild("Femur_r12", CubeListBuilder.create().texOffs(34, 30).mirror().addBox(-1.5F, -0.3831F, -1.2341F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.5092F, 0.4F, -0.9948F, 0.0F, 0.0F));

		PartDefinition Femur_r13 = LegL2.addOrReplaceChild("Femur_r13", CubeListBuilder.create().texOffs(34, 34).mirror().addBox(-1.5F, -0.1871F, -0.7632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.5546F, 0.6859F, -0.6632F, 0.0F, 0.0F));

		PartDefinition Femur_r14 = LegL2.addOrReplaceChild("Femur_r14", CubeListBuilder.create().texOffs(31, 36).mirror().addBox(-1.5F, -0.1871F, -0.7632F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0092F, 1.1F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Femur_r15 = LegL2.addOrReplaceChild("Femur_r15", CubeListBuilder.create().texOffs(16, 29).mirror().addBox(-1.5F, -1.3562F, -0.9007F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0092F, 0.7F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Femur_r16 = LegL2.addOrReplaceChild("Femur_r16", CubeListBuilder.create().texOffs(16, 36).mirror().addBox(-1.5F, 0.6438F, -0.6007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0092F, 0.7F, -0.6109F, 0.0F, 0.0F));

		PartDefinition TibiaL2 = LegL2.addOrReplaceChild("TibiaL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 7.6476F, -2.868F, -0.0349F, 0.0F, 0.0F));

		PartDefinition TibioFibula_r3 = TibiaL2.addOrReplaceChild("TibioFibula_r3", CubeListBuilder.create().texOffs(0, 29).mirror().addBox(-1.7F, -4.6F, -0.2F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.8737F, 2.2087F, 0.3927F, 0.0F, 0.0F));

		PartDefinition TibioFibula_r4 = TibiaL2.addOrReplaceChild("TibioFibula_r4", CubeListBuilder.create().texOffs(6, 29).mirror().addBox(0.0F, 2.2746F, 5.2868F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(42, 35).mirror().addBox(-0.8F, 1.0746F, 4.7868F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8993F, -5.3764F, 0.3927F, 0.0F, 0.0F));

		PartDefinition MetatarsalL2 = TibiaL2.addOrReplaceChild("MetatarsalL2", CubeListBuilder.create(), PartPose.offset(0.0F, 6.9872F, 3.692F));

		PartDefinition Metatarsal_r2 = MetatarsalL2.addOrReplaceChild("Metatarsal_r2", CubeListBuilder.create().texOffs(47, 28).mirror().addBox(-1.0F, 0.0671F, 3.9526F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8559F, -4.6338F, -0.2182F, 0.0F, 0.0F));

		PartDefinition FootL3 = MetatarsalL2.addOrReplaceChild("FootL3", CubeListBuilder.create().texOffs(20, 92).mirror().addBox(-3.0F, -0.3583F, -2.3992F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 4.2911F, -1.2535F, -0.0873F, 0.0F, 0.0F));

		PartDefinition FootL4 = FootL3.addOrReplaceChild("FootL4", CubeListBuilder.create().texOffs(40, 92).mirror().addBox(-2.5F, -0.4F, -2.9F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offset(-0.5F, 0.0F, -2.3F));

		PartDefinition Tail1 = Dilophosaurus.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 0.8F, 4.5F, 0.0784F, -0.2189F, -0.0853F));

		PartDefinition CaudalProximal_r1 = Tail1.addOrReplaceChild("CaudalProximal_r1", CubeListBuilder.create().texOffs(46, 89).addBox(-0.5F, 1.5886F, 2.3419F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 89).addBox(-0.5F, 0.3526F, 0.9777F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 89).addBox(-0.5F, -1.0187F, -0.4664F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.6044F, 6.6084F, 0.6458F, 0.0F, 0.0F));

		PartDefinition CaudalProximal_r2 = Tail1.addOrReplaceChild("CaudalProximal_r2", CubeListBuilder.create().texOffs(74, 83).addBox(-0.5F, 1.3295F, 2.5333F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 82).addBox(-0.5F, 0.4791F, 0.9219F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 51).addBox(-0.5F, -0.8607F, -0.6448F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.6863F, 0.4922F, 0.5585F, 0.0F, 0.0F));

		PartDefinition CaudalProximal_r3 = Tail1.addOrReplaceChild("CaudalProximal_r3", CubeListBuilder.create().texOffs(29, 0).addBox(-1.0F, -0.208F, -0.0696F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.003F))
				.texOffs(88, 68).mirror().addBox(-1.6F, 0.292F, 9.9304F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(88, 6).mirror().addBox(-1.7F, 0.292F, 7.9304F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(87, 46).mirror().addBox(-1.8F, 0.292F, 5.9304F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(86, 77).mirror().addBox(-2.0F, 0.292F, 3.9304F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(80, 52).mirror().addBox(-2.2F, 0.292F, 1.9304F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(79, 64).mirror().addBox(-2.5F, 0.292F, -0.0696F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(88, 68).addBox(-0.4F, 0.292F, 9.9304F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 6).addBox(-0.3F, 0.292F, 7.9304F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 46).addBox(-0.2F, 0.292F, 5.9304F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 77).addBox(0.0F, 0.292F, 3.9304F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 52).addBox(-0.8F, 0.292F, 1.9304F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 64).addBox(-0.5F, 0.292F, -0.0696F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.284F, -0.0072F, -0.096F, 0.0F, 0.0F));

		PartDefinition Atlas_r6 = Tail1.addOrReplaceChild("Atlas_r6", CubeListBuilder.create().texOffs(90, 90).addBox(0.0F, -0.9375F, -0.1192F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.2F, 0.5575F, 10.068F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Atlas_r7 = Tail1.addOrReplaceChild("Atlas_r7", CubeListBuilder.create().texOffs(60, 64).addBox(0.0F, -1.139F, -0.0691F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.2F, 0.4188F, 8.1031F, -0.2269F, 0.0F, 0.0F));

		PartDefinition Atlas_r8 = Tail1.addOrReplaceChild("Atlas_r8", CubeListBuilder.create().texOffs(89, 31).addBox(0.0F, -1.287F, -0.1231F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.2F, 0.2331F, 6.0499F, -0.192F, 0.0F, 0.0F));

		PartDefinition Atlas_r9 = Tail1.addOrReplaceChild("Atlas_r9", CubeListBuilder.create().texOffs(29, 89).addBox(0.0F, -1.3839F, -0.0438F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.2F, -0.0408F, 4.0437F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Atlas_r10 = Tail1.addOrReplaceChild("Atlas_r10", CubeListBuilder.create().texOffs(26, 89).addBox(0.0F, -1.6323F, 0.0019F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.2F, -0.2734F, 1.9022F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Atlas_r11 = Tail1.addOrReplaceChild("Atlas_r11", CubeListBuilder.create().texOffs(23, 89).addBox(0.0F, -1.798F, 0.0046F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.2F, -0.5473F, -0.104F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 1.0966F, 10.6773F, 0.064F, -0.3048F, -0.0192F));

		PartDefinition CaudalMedioproximal_r1 = Tail2.addOrReplaceChild("CaudalMedioproximal_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0324F, -0.0959F, -0.0087F, 0.0F, 0.0F));

		PartDefinition Atlas_r12 = Tail2.addOrReplaceChild("Atlas_r12", CubeListBuilder.create().texOffs(91, 63).addBox(0.0F, -0.6524F, 3.9441F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(38, 91).addBox(0.0F, -0.5524F, 1.9441F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(91, 35).addBox(0.0F, -0.4524F, -0.0558F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.4091F, 7.1306F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Atlas_r13 = Tail2.addOrReplaceChild("Atlas_r13", CubeListBuilder.create().texOffs(91, 27).addBox(0.0F, -0.5937F, -0.0732F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.3712F, 5.0718F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Atlas_r14 = Tail2.addOrReplaceChild("Atlas_r14", CubeListBuilder.create().texOffs(15, 91).addBox(0.0F, -0.7494F, 0.061F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.3802F, 2.9247F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Atlas_r15 = Tail2.addOrReplaceChild("Atlas_r15", CubeListBuilder.create().texOffs(12, 91).addBox(0.0F, -0.9764F, -0.0079F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.3423F, 0.8659F, -0.2793F, 0.0F, 0.0F));

		PartDefinition CaudalProximal_r4 = Tail2.addOrReplaceChild("CaudalProximal_r4", CubeListBuilder.create().texOffs(9, 91).addBox(-0.5F, 8.7546F, 11.6674F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 8).addBox(-0.5F, 7.7191F, 9.9534F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 89).addBox(-0.5F, 5.6837F, 8.2394F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 89).addBox(-0.5F, 4.5653F, 6.5814F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 89).addBox(-0.5F, 3.4127F, 4.8115F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 89).addBox(-0.5F, 1.8772F, 3.0975F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5581F, -3.0821F, 0.6458F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(31, 13).addBox(-0.6F, -0.5228F, 0.0341F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.1F, 0.1365F, 12.8245F, -0.0302F, -0.5234F, 0.0151F));

		PartDefinition CaudalProximal_r5 = Tail3.addOrReplaceChild("CaudalProximal_r5", CubeListBuilder.create().texOffs(18, 92).addBox(-0.5F, 12.698F, 17.6239F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 76).addBox(-0.5F, 11.5512F, 15.9732F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 73).addBox(-0.5F, 10.5565F, 14.1926F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 70).addBox(-0.5F, 9.3336F, 12.6068F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.5228F, -15.6345F, 0.6458F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, -0.0109F, 11.0431F, -0.022F, -0.6544F, 0.0134F));

		PartDefinition CaudalDistal_r1 = Tail4.addOrReplaceChild("CaudalDistal_r1", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -0.5621F, -0.3463F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2F, 0.1121F, 0.0778F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 1.5156F, 11.4095F, 0.1276F, -0.607F, -0.0731F));

		PartDefinition CaudalDistalmost_r1 = Tail5.addOrReplaceChild("CaudalDistalmost_r1", CubeListBuilder.create().texOffs(27, 28).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5002F, 0.0939F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Body = Dilophosaurus.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4629F, -4.3441F, 0.0177F, -0.1745F, -0.0031F));

		PartDefinition Thorax_r1 = Body.addOrReplaceChild("Thorax_r1", CubeListBuilder.create().texOffs(54, 38).addBox(-1.0F, -1.4475F, -1.8533F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 8.2F, -12.4F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Thorax_r2 = Body.addOrReplaceChild("Thorax_r2", CubeListBuilder.create().texOffs(0, 15).addBox(-2.5F, -2.0F, 0.0F, 5.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 7.7565F, -12.2416F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r33 = Body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(89, 48).mirror().addBox(-3.532F, -1.5399F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1098F, -0.7292F, -0.1333F, 0.0376F, -1.6242F));

		PartDefinition cube_r34 = Body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(80, 54).mirror().addBox(-2.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1098F, -0.7292F, -0.1051F, 0.0904F, -1.1901F));

		PartDefinition cube_r35 = Body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(89, 25).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1098F, -0.7292F, -0.07F, 0.1196F, -0.8579F));

		PartDefinition cube_r36 = Body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(90, 88).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2098F, -2.5292F, 0.1021F, 0.0382F, -0.7965F));

		PartDefinition cube_r37 = Body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(83, 16).mirror().addBox(-4.532F, -1.5399F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2098F, -2.5292F, 0.047F, 0.0984F, -1.5641F));

		PartDefinition cube_r38 = Body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(83, 18).mirror().addBox(-2.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2098F, -2.5292F, 0.0842F, 0.0693F, -1.1271F));

		PartDefinition cube_r39 = Body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(67, 90).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2098F, -4.4292F, 0.1696F, 0.0937F, -0.7397F));

		PartDefinition cube_r40 = Body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(76, 20).mirror().addBox(-5.532F, -1.5399F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2098F, -4.4292F, 0.0568F, 0.1851F, -1.5103F));

		PartDefinition cube_r41 = Body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(83, 14).mirror().addBox(-2.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2098F, -4.4292F, 0.1301F, 0.1437F, -1.0699F));

		PartDefinition cube_r42 = Body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(83, 12).mirror().addBox(-2.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2098F, -6.4292F, 0.1581F, 0.1882F, -1.0129F));

		PartDefinition cube_r43 = Body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(75, 50).mirror().addBox(-5.532F, -1.5399F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2098F, -6.4292F, 0.0629F, 0.2371F, -1.4567F));

		PartDefinition cube_r44 = Body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(90, 66).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2098F, -6.4292F, 0.2103F, 0.1269F, -0.6828F));

		PartDefinition cube_r45 = Body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(90, 41).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2098F, -8.4292F, 0.2515F, 0.1598F, -0.6246F));

		PartDefinition cube_r46 = Body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(83, 66).mirror().addBox(-2.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2098F, -8.4292F, 0.1866F, 0.2325F, -0.9546F));

		PartDefinition cube_r47 = Body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(68, 65).mirror().addBox(-6.532F, -1.5399F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2098F, -8.4292F, 0.0691F, 0.2891F, -1.4027F));

		PartDefinition cube_r48 = Body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(67, 23).mirror().addBox(-6.532F, -1.5399F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0902F, -10.4292F, 0.0734F, 0.3238F, -1.384F));

		PartDefinition cube_r49 = Body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(82, 48).mirror().addBox(-2.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0902F, -10.4292F, 0.2059F, 0.262F, -0.9324F));

		PartDefinition cube_r50 = Body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(90, 39).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0902F, -10.4292F, 0.2791F, 0.1816F, -0.6024F));

		PartDefinition cube_r51 = Body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(68, 65).addBox(2.532F, -1.5399F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2098F, -8.4292F, 0.0691F, -0.2891F, 1.4027F));

		PartDefinition cube_r52 = Body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(83, 66).addBox(0.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2098F, -8.4292F, 0.1866F, -0.2325F, 0.9546F));

		PartDefinition cube_r53 = Body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(83, 18).addBox(0.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2098F, -2.5292F, 0.0842F, -0.0693F, 1.1271F));

		PartDefinition cube_r54 = Body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(83, 16).addBox(2.532F, -1.5399F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2098F, -2.5292F, 0.047F, -0.0984F, 1.5641F));

		PartDefinition cube_r55 = Body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(90, 88).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2098F, -2.5292F, 0.1021F, -0.0382F, 0.7965F));

		PartDefinition cube_r56 = Body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(83, 14).addBox(0.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2098F, -4.4292F, 0.1301F, -0.1437F, 1.0699F));

		PartDefinition cube_r57 = Body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(76, 20).addBox(2.532F, -1.5399F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2098F, -4.4292F, 0.0568F, -0.1851F, 1.5103F));

		PartDefinition cube_r58 = Body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(67, 90).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2098F, -4.4292F, 0.1696F, -0.0937F, 0.7397F));

		PartDefinition cube_r59 = Body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(90, 66).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2098F, -6.4292F, 0.2103F, -0.1269F, 0.6828F));

		PartDefinition cube_r60 = Body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(75, 50).addBox(2.532F, -1.5399F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2098F, -6.4292F, 0.0629F, -0.2371F, 1.4567F));

		PartDefinition cube_r61 = Body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(83, 12).addBox(0.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2098F, -6.4292F, 0.1581F, -0.1882F, 1.0129F));

		PartDefinition cube_r62 = Body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(90, 41).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2098F, -8.4292F, 0.2515F, -0.1598F, 0.6246F));

		PartDefinition cube_r63 = Body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(90, 39).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0902F, -10.4292F, 0.2791F, -0.1816F, 0.6024F));

		PartDefinition cube_r64 = Body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(82, 48).addBox(0.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0902F, -10.4292F, 0.2059F, -0.262F, 0.9324F));

		PartDefinition cube_r65 = Body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(67, 23).addBox(2.532F, -1.5399F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0902F, -10.4292F, 0.0734F, -0.3238F, 1.384F));

		PartDefinition Thorax_r3 = Body.addOrReplaceChild("Thorax_r3", CubeListBuilder.create().texOffs(56, 20).addBox(-0.5F, -0.0216F, -3.9885F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6146F, -8.0325F, 0.1134F, 0.0F, 0.0F));

		PartDefinition Thorax_r4 = Body.addOrReplaceChild("Thorax_r4", CubeListBuilder.create().texOffs(0, 42).addBox(0.0F, 0.9F, -9.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.3F, 1.0F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Atlas_r16 = Body.addOrReplaceChild("Atlas_r16", CubeListBuilder.create().texOffs(82, 89).addBox(0.0F, -1.6201F, 0.0482F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.4641F, -3.1004F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Atlas_r17 = Body.addOrReplaceChild("Atlas_r17", CubeListBuilder.create().texOffs(79, 89).addBox(0.0F, -1.4953F, -0.0182F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.4641F, -5.0004F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Atlas_r18 = Body.addOrReplaceChild("Atlas_r18", CubeListBuilder.create().texOffs(76, 89).addBox(0.0F, -1.404F, 0.0403F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.564F, -7.0004F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Atlas_r19 = Body.addOrReplaceChild("Atlas_r19", CubeListBuilder.create().texOffs(64, 89).addBox(0.0F, -1.5996F, 0.0111F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.364F, -1.2004F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r66 = Body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(89, 48).addBox(2.532F, -1.5399F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1098F, -0.7292F, 0.0411F, -0.0463F, 1.6168F));

		PartDefinition cube_r67 = Body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(80, 54).addBox(0.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1098F, -0.7292F, 0.0569F, -0.0246F, 1.1808F));

		PartDefinition cube_r68 = Body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(89, 25).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1098F, -0.7292F, 0.0618F, -0.0048F, 0.8497F));

		PartDefinition Atlas_r20 = Body.addOrReplaceChild("Atlas_r20", CubeListBuilder.create().texOffs(61, 89).addBox(0.0F, -1.3748F, -0.0553F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.4641F, -8.9004F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Atlas_r21 = Body.addOrReplaceChild("Atlas_r21", CubeListBuilder.create().texOffs(89, 59).addBox(0.0F, -1.5144F, -0.09F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.164F, -10.9004F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1994F, -11.9238F, 0.1152F, -0.1734F, -0.02F));

		PartDefinition Scapulo_coracoid_r1 = Chest.addOrReplaceChild("Scapulo_coracoid_r1", CubeListBuilder.create().texOffs(36, 50).mirror().addBox(-0.4F, 0.0F, -0.4F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 6.3909F, -3.7088F, -0.1159F, -0.2583F, 0.5824F));

		PartDefinition Scapulo_coracoid_r2 = Chest.addOrReplaceChild("Scapulo_coracoid_r2", CubeListBuilder.create().texOffs(13, 58).mirror().addBox(-0.4F, 0.0F, -0.1F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 6.3909F, -3.7088F, -0.1905F, -0.3263F, 0.5998F));

		PartDefinition Scapulo_coracoid_r3 = Chest.addOrReplaceChild("Scapulo_coracoid_r3", CubeListBuilder.create().texOffs(78, 22).mirror().addBox(-0.4F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 6.3909F, -3.7088F, 0.1576F, -1.0451F, 0.6782F));

		PartDefinition cube_r69 = Chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(31, 26).mirror().addBox(-6.532F, -1.5399F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0907F, -2.4054F, 0.077F, 0.2886F, -1.4699F));

		PartDefinition cube_r70 = Chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(81, 0).mirror().addBox(-2.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0907F, -2.4054F, 0.1933F, 0.2287F, -1.0225F));

		PartDefinition cube_r71 = Chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(90, 11).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0907F, -2.4054F, 0.2566F, 0.1541F, -0.6933F));

		PartDefinition Scapulo_coracoid_r4 = Chest.addOrReplaceChild("Scapulo_coracoid_r4", CubeListBuilder.create().texOffs(51, 64).mirror().addBox(-1.5F, -0.2F, -3.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(51, 64).addBox(0.5F, -0.2F, -3.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 6.28F, -3.1363F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Scapulo_coracoid_r5 = Chest.addOrReplaceChild("Scapulo_coracoid_r5", CubeListBuilder.create().texOffs(77, 83).mirror().addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 3.5039F, -5.4437F, 2.0592F, -0.1994F, -0.4884F));

		PartDefinition Scapulo_coracoid_r6 = Chest.addOrReplaceChild("Scapulo_coracoid_r6", CubeListBuilder.create().texOffs(65, 10).mirror().addBox(-3.5F, 0.0257F, -2.9924F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(65, 10).addBox(1.9F, 0.0257F, -2.9924F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.3F, -0.112F, -2.0877F, 0.576F, 0.0F, 0.0F));

		PartDefinition Scapulo_coracoid_r7 = Chest.addOrReplaceChild("Scapulo_coracoid_r7", CubeListBuilder.create().texOffs(65, 5).mirror().addBox(-3.5F, 0.0257F, -2.9924F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(65, 5).addBox(1.9F, 0.0257F, -2.9924F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3F, -0.7811F, -2.8309F, 0.8378F, 0.0F, 0.0F));

		PartDefinition Scapulo_coracoid_r8 = Chest.addOrReplaceChild("Scapulo_coracoid_r8", CubeListBuilder.create().texOffs(65, 0).mirror().addBox(-3.5F, -0.0743F, -0.6924F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(65, 0).addBox(1.9F, -0.0743F, -0.6924F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3F, 1.1282F, -4.3976F, 1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r72 = Chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(42, 26).mirror().addBox(-6.532F, -1.5399F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0907F, -0.5054F, 0.065F, 0.2544F, -1.4387F));

		PartDefinition cube_r73 = Chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(81, 2).mirror().addBox(-2.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0907F, -0.5054F, 0.1675F, 0.203F, -0.9936F));

		PartDefinition cube_r74 = Chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(90, 13).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0907F, -0.5054F, 0.224F, 0.1379F, -0.6636F));

		PartDefinition cube_r75 = Chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(90, 15).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2907F, -6.4054F, 0.4213F, 0.2882F, -0.8485F));

		PartDefinition cube_r76 = Chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(81, 4).mirror().addBox(-2.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2907F, -6.4054F, 0.3079F, 0.4076F, -1.178F));

		PartDefinition cube_r77 = Chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(81, 6).mirror().addBox(-4.532F, -1.5399F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2907F, -6.4054F, 0.0964F, 0.497F, -1.654F));

		PartDefinition cube_r78 = Chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(73, 44).mirror().addBox(-5.532F, -1.5399F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0907F, -4.4054F, 0.0799F, 0.3758F, -1.5388F));

		PartDefinition cube_r79 = Chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(66, 80).mirror().addBox(-2.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0907F, -4.4054F, 0.2354F, 0.306F, -1.0812F));

		PartDefinition cube_r80 = Chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(89, 79).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0907F, -4.4054F, 0.3211F, 0.214F, -0.7513F));

		PartDefinition Scapulo_coracoid_r9 = Chest.addOrReplaceChild("Scapulo_coracoid_r9", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-3.5F, -0.9743F, -3.9924F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(64, 52).mirror().addBox(-3.5F, -0.6743F, -3.9924F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 65).addBox(1.9F, -0.9743F, -3.9924F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F))
				.texOffs(64, 52).addBox(1.9F, -0.6743F, -3.9924F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.9407F, -3.0654F, 0.8727F, 0.0F, 0.0F));

		PartDefinition Scapulo_coracoid_r10 = Chest.addOrReplaceChild("Scapulo_coracoid_r10", CubeListBuilder.create().texOffs(16, 72).mirror().addBox(-1.4F, -1.8F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8387F, 4.8034F, -5.7544F, 1.3117F, 0.5344F, 0.7428F));

		PartDefinition Scapulo_coracoid_r11 = Chest.addOrReplaceChild("Scapulo_coracoid_r11", CubeListBuilder.create().texOffs(16, 72).addBox(-0.6F, -1.8F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8387F, 4.8034F, -5.7544F, 1.3117F, -0.5344F, -0.7428F));

		PartDefinition Scapulo_coracoid_r12 = Chest.addOrReplaceChild("Scapulo_coracoid_r12", CubeListBuilder.create().texOffs(77, 83).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7F, 3.5039F, -5.4437F, 2.0592F, 0.1994F, 0.4884F));

		PartDefinition cube_r81 = Chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(81, 6).addBox(2.532F, -1.5399F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2907F, -6.4054F, 0.0964F, -0.497F, 1.654F));

		PartDefinition cube_r82 = Chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(81, 4).addBox(0.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2907F, -6.4054F, 0.3079F, -0.4076F, 1.178F));

		PartDefinition cube_r83 = Chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(90, 15).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2907F, -6.4054F, 0.4213F, -0.2882F, 0.8485F));

		PartDefinition cube_r84 = Chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(90, 13).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0907F, -0.5054F, 0.224F, -0.1379F, 0.6636F));

		PartDefinition cube_r85 = Chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(81, 2).addBox(0.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0907F, -0.5054F, 0.1675F, -0.203F, 0.9936F));

		PartDefinition cube_r86 = Chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(42, 26).addBox(2.532F, -1.5399F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0907F, -0.5054F, 0.065F, -0.2544F, 1.4387F));

		PartDefinition cube_r87 = Chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(90, 11).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0907F, -2.4054F, 0.2566F, -0.1541F, 0.6933F));

		PartDefinition cube_r88 = Chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(81, 0).addBox(0.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0907F, -2.4054F, 0.1933F, -0.2287F, 1.0225F));

		PartDefinition cube_r89 = Chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(31, 26).addBox(2.532F, -1.5399F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0907F, -2.4054F, 0.077F, -0.2886F, 1.4699F));

		PartDefinition cube_r90 = Chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(89, 79).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0907F, -4.4054F, 0.3211F, -0.214F, 0.7513F));

		PartDefinition cube_r91 = Chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(66, 80).addBox(0.9455F, -0.3256F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0907F, -4.4054F, 0.2354F, -0.306F, 1.0812F));

		PartDefinition cube_r92 = Chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(73, 44).addBox(2.532F, -1.5399F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0907F, -4.4054F, 0.0799F, -0.3758F, 1.5388F));

		PartDefinition Scapulo_coracoid_r13 = Chest.addOrReplaceChild("Scapulo_coracoid_r13", CubeListBuilder.create().texOffs(36, 50).addBox(-0.6F, 0.0F, -0.4F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 6.3909F, -3.7088F, -0.1159F, 0.2583F, -0.5824F));

		PartDefinition Scapulo_coracoid_r14 = Chest.addOrReplaceChild("Scapulo_coracoid_r14", CubeListBuilder.create().texOffs(13, 58).addBox(-0.6F, 0.0F, -0.1F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 6.3909F, -3.7088F, -0.1905F, 0.3263F, -0.5998F));

		PartDefinition Scapulo_coracoid_r15 = Chest.addOrReplaceChild("Scapulo_coracoid_r15", CubeListBuilder.create().texOffs(78, 22).addBox(-0.6F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 6.3909F, -3.7088F, 0.1576F, 1.0451F, -0.6782F));

		PartDefinition Scapulo_coracoid_r16 = Chest.addOrReplaceChild("Scapulo_coracoid_r16", CubeListBuilder.create().texOffs(19, 42).addBox(0.0F, -0.4662F, -3.0652F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 0.2709F, -3.8339F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Atlas_r22 = Chest.addOrReplaceChild("Atlas_r22", CubeListBuilder.create().texOffs(6, 90).addBox(0.0F, -1.5123F, -0.0897F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.1932F, -0.7843F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Atlas_r23 = Chest.addOrReplaceChild("Atlas_r23", CubeListBuilder.create().texOffs(3, 90).addBox(0.0F, -1.7208F, -1.1255F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.1068F, -1.8843F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Atlas_r24 = Chest.addOrReplaceChild("Atlas_r24", CubeListBuilder.create().texOffs(0, 90).addBox(0.0F, -1.7271F, -0.061F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.0068F, -4.7843F, -0.0349F, 0.0F, 0.0F));

		PartDefinition ArmL = Chest.addOrReplaceChild("ArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3246F, 5.7867F, -4.7464F, -0.118F, -0.4784F, -0.5613F));

		PartDefinition Humerus_r1 = ArmL.addOrReplaceChild("Humerus_r1", CubeListBuilder.create().texOffs(62, 73).addBox(-2.0F, -2.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4977F, 1.3068F, 0.9518F, 0.829F, 0.0F, 0.0F));

		PartDefinition ElbowL = ArmL.addOrReplaceChild("ElbowL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4977F, 2.5646F, 3.3518F, -0.4944F, -0.3345F, 0.0922F));

		PartDefinition Radio_Ulna_r1 = ElbowL.addOrReplaceChild("Radio_Ulna_r1", CubeListBuilder.create().texOffs(79, 25).addBox(-1.0F, 0.2F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(28, 78).addBox(-1.0F, 0.0F, 1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.0743F, -1.2879F, -0.2618F, 0.0F, 0.0F));

		PartDefinition HandL = ElbowL.addOrReplaceChild("HandL", CubeListBuilder.create().texOffs(65, 26).addBox(-1.1F, -0.2F, -0.3F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 3.1257F, -1.6879F, -0.0852F, 0.0189F, 0.3221F));

		PartDefinition ArmL2 = Chest.addOrReplaceChild("ArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3246F, 5.7867F, -4.7464F, -0.2116F, -0.2101F, 0.4951F));

		PartDefinition Humerus_r2 = ArmL2.addOrReplaceChild("Humerus_r2", CubeListBuilder.create().texOffs(92, 91).mirror().addBox(1.0F, -2.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4977F, 1.3068F, 0.9518F, 0.829F, 0.0F, 0.0F));

		PartDefinition ElbowL2 = ArmL2.addOrReplaceChild("ElbowL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4977F, 2.5646F, 3.3518F, -0.288F, 0.0F, 0.0F));

		PartDefinition Radio_Ulna_r2 = ElbowL2.addOrReplaceChild("Radio_Ulna_r2", CubeListBuilder.create().texOffs(86, 92).mirror().addBox(0.0F, 0.2F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(82, 92).mirror().addBox(0.0F, 0.0F, 1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0743F, -1.2879F, -0.2618F, 0.0F, 0.0F));

		PartDefinition HandL2 = ElbowL2.addOrReplaceChild("HandL2", CubeListBuilder.create().texOffs(68, 90).mirror().addBox(0.1F, -0.2F, -0.3F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 3.1257F, -1.6879F, -0.0852F, -0.0189F, -0.3221F));

		PartDefinition Neck1 = Chest.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3356F, -6.5625F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Atlas_r25 = Neck1.addOrReplaceChild("Atlas_r25", CubeListBuilder.create().texOffs(72, 25).mirror().addBox(-0.0184F, -0.666F, -0.0391F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6515F, -2.2136F, -0.8601F, -0.2109F, 0.2975F));

		PartDefinition Atlas_r26 = Neck1.addOrReplaceChild("Atlas_r26", CubeListBuilder.create().texOffs(23, 72).mirror().addBox(-0.0184F, -0.566F, -0.0391F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.4515F, -3.9136F, -0.8247F, -0.1846F, 0.1805F));

		PartDefinition Atlas_r27 = Neck1.addOrReplaceChild("Atlas_r27", CubeListBuilder.create().texOffs(72, 25).addBox(0.0184F, -0.666F, -0.0391F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6515F, -2.2136F, -0.8601F, 0.2109F, -0.2975F));

		PartDefinition CervicalDistal_r1 = Neck1.addOrReplaceChild("CervicalDistal_r1", CubeListBuilder.create().texOffs(0, 52).addBox(-0.5F, -0.1899F, -0.2974F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.1123F, -3.7315F, -0.4538F, 0.0F, 0.0F));

		PartDefinition Atlas_r28 = Neck1.addOrReplaceChild("Atlas_r28", CubeListBuilder.create().texOffs(23, 72).addBox(0.0184F, -0.566F, -0.0391F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4515F, -3.9136F, -0.8247F, 0.1846F, -0.1805F));

		PartDefinition Atlas_r29 = Neck1.addOrReplaceChild("Atlas_r29", CubeListBuilder.create().texOffs(35, 90).addBox(0.0F, -2.0364F, -0.9787F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.0633F, 0.5446F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Atlas_r30 = Neck1.addOrReplaceChild("Atlas_r30", CubeListBuilder.create().texOffs(90, 21).addBox(0.0F, -1.5308F, -0.5462F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -1.0633F, -1.7554F, -0.3665F, 0.0F, 0.0F));

		PartDefinition Atlas_r31 = Neck1.addOrReplaceChild("Atlas_r31", CubeListBuilder.create().texOffs(90, 17).addBox(0.5F, -1.4072F, -1.0216F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.5F, -1.6382F, -2.9952F, -0.5498F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8703F, -3.8877F, -0.1309F, 0.0F, 0.0F));

		PartDefinition CervicalMedial_r1 = Neck2.addOrReplaceChild("CervicalMedial_r1", CubeListBuilder.create().texOffs(54, 6).addBox(0.0F, -0.2456F, 0.0601F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -2.8558F, -2.8571F, -0.7243F, 0.0F, 0.0F));

		PartDefinition Atlas_r32 = Neck2.addOrReplaceChild("Atlas_r32", CubeListBuilder.create().texOffs(72, 35).mirror().addBox(-0.0167F, -0.5959F, -0.039F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6394F, -1.5145F, -0.7991F, -0.144F, 0.1346F));

		PartDefinition Atlas_r33 = Neck2.addOrReplaceChild("Atlas_r33", CubeListBuilder.create().texOffs(72, 30).mirror().addBox(0.0072F, -0.5336F, 0.0355F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.0742F, -3.0038F, -0.9345F, -0.1796F, 0.128F));

		PartDefinition Atlas_r34 = Neck2.addOrReplaceChild("Atlas_r34", CubeListBuilder.create().texOffs(72, 35).addBox(0.0167F, -0.5959F, -0.039F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6394F, -1.5145F, -0.7991F, 0.144F, -0.1346F));

		PartDefinition Atlas_r35 = Neck2.addOrReplaceChild("Atlas_r35", CubeListBuilder.create().texOffs(92, 43).addBox(0.5F, -0.9415F, -0.9126F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.5F, -0.9558F, -0.4071F, -0.7418F, 0.0F, 0.0F));

		PartDefinition Atlas_r36 = Neck2.addOrReplaceChild("Atlas_r36", CubeListBuilder.create().texOffs(92, 30).addBox(0.5F, -0.822F, 0.0272F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.5F, -2.9558F, -2.6071F, -0.829F, 0.0F, 0.0F));

		PartDefinition Atlas_r37 = Neck2.addOrReplaceChild("Atlas_r37", CubeListBuilder.create().texOffs(72, 30).addBox(-0.0072F, -0.5336F, 0.0355F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.0742F, -3.0038F, -0.9345F, 0.1796F, -0.128F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5081F, -2.8638F, 0.2256F, -0.2555F, -0.0579F));

		PartDefinition Atlas_r38 = Neck3.addOrReplaceChild("Atlas_r38", CubeListBuilder.create().texOffs(92, 59).mirror().addBox(0.0F, -0.5359F, -0.0239F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.5054F, -4.1029F, -0.6969F, -0.1344F, 0.1117F));

		PartDefinition Atlas_r39 = Neck3.addOrReplaceChild("Atlas_r39", CubeListBuilder.create().texOffs(12, 81).mirror().addBox(-0.0532F, -0.4382F, -0.0974F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9587F, -1.5604F, -0.9958F, -0.1641F, 0.0851F));

		PartDefinition Atlas_r40 = Neck3.addOrReplaceChild("Atlas_r40", CubeListBuilder.create().texOffs(81, 8).mirror().addBox(-0.0085F, -0.6084F, -0.0024F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.9054F, -3.0029F, -0.9958F, -0.1641F, 0.0851F));

		PartDefinition Atlas_r41 = Neck3.addOrReplaceChild("Atlas_r41", CubeListBuilder.create().texOffs(12, 81).addBox(0.0532F, -0.4382F, -0.0974F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9587F, -1.5604F, -0.9958F, 0.1641F, -0.0851F));

		PartDefinition Atlas_r42 = Neck3.addOrReplaceChild("Atlas_r42", CubeListBuilder.create().texOffs(81, 8).addBox(0.0085F, -0.6084F, -0.0024F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.9054F, -3.0029F, -0.9958F, 0.1641F, -0.0851F));

		PartDefinition CervicalProximal_r1 = Neck3.addOrReplaceChild("CervicalProximal_r1", CubeListBuilder.create().texOffs(54, 26).addBox(0.0F, -0.1851F, 0.153F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.1054F, -2.9029F, -0.7243F, 0.0F, 0.0F));

		PartDefinition Atlas_r43 = Neck3.addOrReplaceChild("Atlas_r43", CubeListBuilder.create().texOffs(92, 59).addBox(0.0F, -0.5359F, -0.0239F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.5054F, -4.1029F, -0.6969F, 0.1344F, -0.1117F));

		PartDefinition Atlas_r44 = Neck3.addOrReplaceChild("Atlas_r44", CubeListBuilder.create().texOffs(92, 56).addBox(0.5F, -0.8038F, -0.1051F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.5F, -1.5054F, -0.9029F, -0.9338F, 0.0F, 0.0F));

		PartDefinition Atlas_r45 = Neck3.addOrReplaceChild("Atlas_r45", CubeListBuilder.create().texOffs(92, 53).addBox(0.5F, -0.7088F, -0.1222F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.5F, -2.8054F, -2.6029F, -0.6894F, 0.0F, 0.0F));

		PartDefinition Atlas_r46 = Neck3.addOrReplaceChild("Atlas_r46", CubeListBuilder.create().texOffs(92, 50).addBox(0.5F, -0.6133F, 0.111F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 0).addBox(0.0F, -0.3133F, 0.111F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.5F, -3.2054F, -4.8029F, -0.1658F, 0.0F, 0.0F));

		PartDefinition Head = Neck3.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.0584F, -4.0611F, 0.7002F, -0.1846F, -0.1169F));

		PartDefinition cube_r93 = Head.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(5, 87).addBox(-0.5F, -0.1435F, -0.1708F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0F, -1.6339F, -9.9423F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r94 = Head.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(82, 86).mirror().addBox(-0.5F, -1.0067F, -1.4105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(77, 86).mirror().addBox(-0.5F, -0.5067F, -1.4105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.251F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1149F, -7.5102F, -0.2094F, -0.2269F, 0.0F));

		PartDefinition cube_r95 = Head.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(82, 44).mirror().addBox(-0.3F, -0.7404F, -0.6055F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(50, 82).mirror().addBox(-0.5F, -0.5404F, 0.3945F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1149F, -7.5102F, -0.0349F, -0.2269F, 0.0F));

		PartDefinition cube_r96 = Head.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(55, 82).mirror().addBox(-0.5F, -1.201F, -1.4624F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(82, 56).mirror().addBox(-0.4F, -1.201F, -0.4624F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.8449F, -4.685F, -0.0349F, -0.0873F, 0.0F));

		PartDefinition cube_r97 = Head.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(-0.5F, -0.2793F, 0.442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.8449F, -4.685F, -0.3142F, -0.0873F, 0.0F));

		PartDefinition cube_r98 = Head.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(0, 87).addBox(-0.5F, -0.2793F, 0.442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.8F, 0.8449F, -4.685F, -0.3142F, 0.0873F, 0.0F));

		PartDefinition cube_r99 = Head.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(82, 56).addBox(-0.6F, -1.201F, -0.4624F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(55, 82).addBox(-0.5F, -1.201F, -1.4624F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.8F, 0.8449F, -4.685F, -0.0349F, 0.0873F, 0.0F));

		PartDefinition cube_r100 = Head.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(50, 82).addBox(-0.5F, -0.5404F, 0.3945F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(82, 44).addBox(-0.7F, -0.7404F, -0.6055F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5F, -0.1149F, -7.5102F, -0.0349F, 0.2269F, 0.0F));

		PartDefinition cube_r101 = Head.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(82, 86).addBox(-0.5F, -1.0067F, -1.4105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(77, 86).addBox(-0.5F, -0.5067F, -1.4105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.251F)), PartPose.offsetAndRotation(0.5F, -0.1149F, -7.5102F, -0.2094F, 0.2269F, 0.0F));

		PartDefinition cube_r102 = Head.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(33, 82).addBox(-0.5F, -1.3F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(86, 74).addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F))
				.texOffs(86, 71).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -0.6481F, -9.7149F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r103 = Head.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(86, 63).addBox(-0.5F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.3339F, -9.5423F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r104 = Head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(66, 47).addBox(-0.5F, -0.9517F, -0.9977F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.0393F, -8.3924F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r105 = Head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(58, 86).addBox(-0.5F, 0.0087F, -1.021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -2.4267F, -8.5198F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r106 = Head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(74, 75).addBox(-0.5F, -0.004F, -2.0235F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -2.3266F, -6.5198F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r107 = Head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(75, 46).mirror().addBox(-0.53F, -1.0843F, -0.8489F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(43, 86).mirror().addBox(-0.53F, -0.7843F, -0.8489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(75, 46).addBox(1.91F, -1.0843F, -0.8489F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(43, 86).addBox(1.91F, -0.7843F, -0.8489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-1.19F, -0.5282F, -1.411F, -2.1729F, 0.0F, 0.0F));

		PartDefinition cube_r108 = Head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(85, 40).mirror().addBox(-0.53F, -0.8195F, -0.7569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(85, 40).addBox(1.91F, -0.8195F, -0.7569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.19F, 1.7719F, -1.411F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r109 = Head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(74, 4).mirror().addBox(-0.53F, -0.7928F, -1.8644F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(74, 4).addBox(1.91F, -0.7928F, -1.8644F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.19F, 0.9718F, -2.011F, -1.946F, 0.0F, 0.0F));

		PartDefinition cube_r110 = Head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(86, 8).mirror().addBox(-0.53F, -0.7945F, -0.7743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(86, 8).addBox(1.91F, -0.7945F, -0.7743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.19F, 1.4718F, -1.911F, -1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r111 = Head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(22, 81).mirror().addBox(-0.53F, -1.734F, -0.76F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(22, 81).addBox(1.91F, -1.734F, -0.76F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-1.19F, 1.6719F, -0.811F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r112 = Head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(38, 84).mirror().addBox(-0.37F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(84, 60).mirror().addBox(-0.37F, -0.7F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(84, 60).addBox(2.15F, -0.7F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(38, 84).addBox(2.15F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(-1.39F, 0.1148F, -2.6721F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r113 = Head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(48, 86).mirror().addBox(-0.37F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false)
				.texOffs(17, 81).mirror().addBox(-0.37F, -0.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(48, 86).addBox(2.15F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F))
				.texOffs(17, 81).addBox(2.15F, -0.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-1.39F, -0.4013F, -2.1992F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r114 = Head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(84, 79).mirror().addBox(-0.37F, -0.7894F, -0.2243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(15, 85).mirror().addBox(-0.37F, -1.2894F, -0.2243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(15, 85).addBox(2.15F, -1.2894F, -0.2243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(10, 85).addBox(2.15F, -1.1894F, 0.0757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F))
				.texOffs(84, 79).addBox(2.15F, -0.7894F, -0.2243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(-1.39F, -0.3852F, -3.1721F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r115 = Head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(84, 25).mirror().addBox(0.06F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(84, 33).mirror().addBox(-0.05F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(84, 33).addBox(2.61F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(84, 25).addBox(2.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.78F, -0.7952F, -2.1298F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r116 = Head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(85, 20).mirror().addBox(-0.37F, -0.78F, -0.2321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(85, 20).addBox(2.15F, -0.78F, -0.2321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.39F, -1.2852F, -2.0721F, -1.789F, 0.0F, 0.0F));

		PartDefinition cube_r117 = Head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(20, 85).mirror().addBox(-0.37F, -0.7897F, -0.2482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(20, 85).addBox(2.15F, -0.7897F, -0.2482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(-1.39F, -1.1852F, -2.5721F, -1.405F, 0.0F, 0.0F));

		PartDefinition cube_r118 = Head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(7, 74).mirror().addBox(-0.5F, -1.5501F, -1.4054F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.99F, -0.9611F, -4.7076F, -2.0857F, -0.1222F, 0.0F));

		PartDefinition cube_r119 = Head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(74, 8).mirror().addBox(-0.5F, -0.1906F, -1.5302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(44, 75).mirror().addBox(-0.5F, -0.8906F, -1.3302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.99F, -0.9611F, -4.7076F, -3.098F, -0.1222F, 0.0F));

		PartDefinition cube_r120 = Head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(37, 75).mirror().addBox(-0.5F, -0.5226F, -1.1313F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(-0.99F, -0.9611F, -4.7076F, 3.0805F, -0.1222F, 0.0F));

		PartDefinition cube_r121 = Head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(25, 86).mirror().addBox(-0.5F, -0.1537F, -0.0219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)).mirror(false)
				.texOffs(86, 28).mirror().addBox(-0.5F, -0.1537F, 0.5781F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.99F, -0.9611F, -4.7076F, -2.9583F, -0.1222F, 0.0F));

		PartDefinition cube_r122 = Head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(86, 36).mirror().addBox(-0.5F, -1.0357F, 0.3785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(30, 86).mirror().addBox(-0.5F, -1.0357F, -0.1215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.99F, -0.9611F, -4.7076F, 2.6616F, -0.1222F, 0.0F));

		PartDefinition cube_r123 = Head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(74, 71).mirror().addBox(-0.4F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(-0.39F, -1.7057F, -8.0778F, -2.9576F, -0.0858F, -0.0159F));

		PartDefinition cube_r124 = Head.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(53, 86).mirror().addBox(-0.5F, 0.2597F, -1.0866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.923F, -6.8092F, -0.925F, -0.1745F, 0.1309F));

		PartDefinition cube_r125 = Head.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(81, 71).mirror().addBox(-0.5F, -0.9618F, -0.7449F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.923F, -6.8092F, -0.3665F, -0.1745F, 0.1309F));

		PartDefinition cube_r126 = Head.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(81, 75).mirror().addBox(-0.5F, -0.9397F, 0.1399F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.923F, -6.8092F, -0.2618F, -0.1745F, 0.1309F));

		PartDefinition cube_r127 = Head.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(54, 58).mirror().addBox(-1.2F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3329F, -4.8611F, -0.2803F, -0.0839F, 0.0241F));

		PartDefinition cube_r128 = Head.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(65, 15).mirror().addBox(-0.0263F, -0.1597F, -0.037F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.4667F, -1.5984F, -3.0971F, -0.3274F, 1.39F, -0.3123F));

		PartDefinition cube_r129 = Head.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(65, 15).addBox(-3.9737F, -0.1597F, -0.037F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.4667F, -1.5984F, -3.0971F, -0.3274F, -1.39F, 0.3123F));

		PartDefinition cube_r130 = Head.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(54, 32).addBox(-0.5F, -0.0573F, -3.8964F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.025F))
				.texOffs(33, 79).addBox(-1.0F, -0.0573F, -0.8964F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, -1.6266F, -2.7198F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r131 = Head.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(81, 75).addBox(-0.5F, -0.9397F, 0.1399F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.923F, -6.8092F, -0.2618F, 0.1745F, -0.1309F));

		PartDefinition cube_r132 = Head.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(81, 71).addBox(-0.5F, -0.9618F, -0.7449F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4F, -0.923F, -6.8092F, -0.3665F, 0.1745F, -0.1309F));

		PartDefinition cube_r133 = Head.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(53, 86).addBox(-0.5F, 0.2597F, -1.0866F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.923F, -6.8092F, -0.925F, 0.1745F, -0.1309F));

		PartDefinition cube_r134 = Head.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(54, 58).addBox(0.2F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3329F, -4.8611F, -0.2803F, 0.0839F, -0.0241F));

		PartDefinition cube_r135 = Head.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(86, 36).addBox(-0.5F, -1.0357F, 0.3785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(30, 86).addBox(-0.5F, -1.0357F, -0.1215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.99F, -0.9611F, -4.7076F, 2.6616F, 0.1222F, 0.0F));

		PartDefinition cube_r136 = Head.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(44, 75).addBox(-0.5F, -0.8906F, -1.3302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F))
				.texOffs(74, 8).addBox(-0.5F, -0.1906F, -1.5302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.99F, -0.9611F, -4.7076F, -3.098F, 0.1222F, 0.0F));

		PartDefinition cube_r137 = Head.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(37, 75).addBox(-0.5F, -0.5226F, -1.1313F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(0.99F, -0.9611F, -4.7076F, 3.0805F, 0.1222F, 0.0F));

		PartDefinition cube_r138 = Head.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(86, 28).addBox(-0.5F, -0.1537F, 0.5781F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(25, 86).addBox(-0.5F, -0.1537F, -0.0219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(0.99F, -0.9611F, -4.7076F, -2.9583F, 0.1222F, 0.0F));

		PartDefinition cube_r139 = Head.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(74, 71).addBox(-0.6F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(0.39F, -1.7057F, -8.0778F, -2.9576F, 0.0858F, 0.0159F));

		PartDefinition cube_r140 = Head.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(7, 74).addBox(-0.5F, -1.5501F, -1.4054F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.99F, -0.9611F, -4.7076F, -2.0857F, 0.1222F, 0.0F));

		PartDefinition cube_r141 = Head.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(82, 83).mirror().addBox(-1.0F, 0.0342F, -0.0323F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(82, 83).addBox(1.0F, 0.0342F, -0.0323F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.0894F, 0.2606F, -1.501F, 0.0F, 0.0F));

		PartDefinition cube_r142 = Head.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(-1.0F, -0.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(0, 84).addBox(1.0F, -0.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 1.8694F, -0.983F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r143 = Head.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(68, 61).addBox(-2.0F, -1.9831F, -1.0617F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, 1.4894F, -3.4394F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r144 = Head.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(39, 72).addBox(-2.0F, -2.6F, 1.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(51, 52).addBox(-2.0F, -2.0F, -0.6F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 1.6894F, -2.9394F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r145 = Head.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(68, 57).addBox(-2.0F, -0.0386F, -0.0053F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8106F, -0.2394F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r146 = Head.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(39, 68).addBox(-2.0F, 0.0F, -0.2F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, -1.2106F, -0.9394F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r147 = Head.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(79, 30).addBox(-1.0F, 0.0F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.2106F, -0.9394F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r148 = Head.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(43, 58).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.3106F, -1.1394F, -0.2094F, 0.0F, 0.0F));

		PartDefinition ParasagittalCrest2 = Head.addOrReplaceChild("ParasagittalCrest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, -2.3258F, -8.7438F, -0.2226F, 0.0905F, 0.0702F));

		PartDefinition cube_r149 = ParasagittalCrest2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(0, 59).addBox(-0.5F, -3.6956F, -0.5249F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0157F, -3.6684F, 5.5245F, -2.4544F, 0.1921F, -0.0507F));

		PartDefinition cube_r150 = ParasagittalCrest2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(63, 86).addBox(-0.5F, -2.6988F, 1.6585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.0157F, -3.6684F, 5.5245F, -1.5818F, 0.1921F, -0.0507F));

		PartDefinition cube_r151 = ParasagittalCrest2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(30, 73).addBox(-0.5F, -0.8832F, 1.1988F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.0157F, -3.6684F, 5.5245F, -0.8662F, 0.1921F, -0.0507F));

		PartDefinition cube_r152 = ParasagittalCrest2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(66, 40).addBox(-0.5F, -0.2178F, -0.2377F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.0157F, -3.6684F, 5.5245F, -0.4124F, 0.1921F, -0.0507F));

		PartDefinition cube_r153 = ParasagittalCrest2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(56, 12).addBox(0.2F, -0.3799F, -0.2019F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-0.6843F, -3.1644F, 2.9878F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r154 = ParasagittalCrest2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(40, 79).addBox(-0.5F, -0.1978F, 0.2325F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(79, 33).addBox(-0.5F, -0.1978F, -0.1675F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0157F, -2.8838F, 2.0758F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r155 = ParasagittalCrest2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(65, 33).addBox(-0.5F, -0.2061F, -0.2054F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0157F, -1.8838F, 0.8758F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r156 = ParasagittalCrest2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(0, 70).addBox(-0.5F, -1.7F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(0.0157F, -0.6218F, 1.9755F, 1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r157 = ParasagittalCrest2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(48, 69).addBox(0.2F, -0.2909F, -0.5499F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6843F, 0.1356F, -0.0122F, 0.9687F, 0.0F, 0.0F));

		PartDefinition ParasagittalCrest3 = Head.addOrReplaceChild("ParasagittalCrest3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, -2.3258F, -8.7438F, -0.2226F, -0.0905F, -0.0702F));

		PartDefinition cube_r158 = ParasagittalCrest3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-0.5F, -3.6956F, -0.5249F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0157F, -3.6684F, 5.5245F, -2.4544F, -0.1921F, 0.0507F));

		PartDefinition cube_r159 = ParasagittalCrest3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(63, 86).mirror().addBox(-0.5F, -2.6988F, 1.6585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.0157F, -3.6684F, 5.5245F, -1.5818F, -0.1921F, 0.0507F));

		PartDefinition cube_r160 = ParasagittalCrest3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(30, 73).mirror().addBox(-0.5F, -0.8832F, 1.1988F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.0157F, -3.6684F, 5.5245F, -0.8662F, -0.1921F, 0.0507F));

		PartDefinition cube_r161 = ParasagittalCrest3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(66, 40).mirror().addBox(-0.5F, -0.2178F, -0.2377F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.0157F, -3.6684F, 5.5245F, -0.4124F, -0.1921F, 0.0507F));

		PartDefinition cube_r162 = ParasagittalCrest3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(56, 12).mirror().addBox(-1.2F, -0.3799F, -0.2019F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(0.6843F, -3.1644F, 2.9878F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r163 = ParasagittalCrest3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(40, 79).mirror().addBox(-0.5F, -0.1978F, 0.2325F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(79, 33).mirror().addBox(-0.5F, -0.1978F, -0.1675F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0157F, -2.8838F, 2.0758F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r164 = ParasagittalCrest3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(65, 33).mirror().addBox(-0.5F, -0.2061F, -0.2054F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.0157F, -1.8838F, 0.8758F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r165 = ParasagittalCrest3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-0.5F, -1.7F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(-0.0157F, -0.6218F, 1.9755F, 1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r166 = ParasagittalCrest3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(48, 69).mirror().addBox(-1.2F, -0.2909F, -0.5499F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.6843F, 0.1356F, -0.0122F, 0.9687F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(66, 82).addBox(0.3F, 0.3202F, -7.9487F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(5, 83).addBox(0.6F, 0.2202F, -6.9487F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(66, 82).mirror().addBox(-0.3F, 0.3202F, -7.9487F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(5, 83).mirror().addBox(-0.6F, 0.2202F, -6.9487F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.8099F, -0.1023F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r167 = Jaw.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(35, 87).mirror().addBox(-0.9975F, 0.4959F, 3.2644F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(76, 12).mirror().addBox(-0.9975F, 0.4959F, 1.7644F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.3112F, 2.2527F, -3.6361F, 0.5161F, -0.0402F, 0.0907F));

		PartDefinition cube_r168 = Jaw.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(87, 82).mirror().addBox(-2.22F, -1.4121F, 1.7439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(87, 56).mirror().addBox(-1.5F, -1.3121F, 0.0439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(76, 67).mirror().addBox(-2.0F, -1.8121F, 0.8439F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(68, 87).mirror().addBox(-1.5F, -1.8121F, -0.0561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(87, 53).mirror().addBox(-2.0F, -1.3121F, 1.0439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(87, 82).addBox(0.22F, -1.4121F, 1.7439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(76, 67).addBox(0.0F, -1.8121F, 0.8439F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F))
				.texOffs(68, 87).addBox(-0.5F, -1.8121F, -0.0561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(87, 56).addBox(-0.5F, -1.3121F, 0.0439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(87, 53).addBox(0.0F, -1.3121F, 1.0439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 2.7F, -4.4F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r169 = Jaw.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(15, 88).mirror().addBox(-1.7F, -1.5877F, 0.4848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(15, 88).addBox(-1.3F, -1.5877F, 0.4848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(10, 88).mirror().addBox(-1.7F, -1.6877F, -0.5152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(10, 88).addBox(-1.3F, -1.6877F, -0.5152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(88, 3).addBox(-1.5F, -1.0877F, -0.5152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 2.0F, -9.7F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r170 = Jaw.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(87, 43).mirror().addBox(-1.5F, -0.0622F, -1.0126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(87, 43).addBox(-0.5F, -0.0622F, -1.0126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, 0.2F, -4.4F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r171 = Jaw.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(87, 50).mirror().addBox(-2.0F, -0.035F, -0.2776F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(87, 50).addBox(0.0F, -0.035F, -0.2776F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, -0.3F, -2.5F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r172 = Jaw.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(88, 0).mirror().addBox(-2.0F, -0.9708F, 0.0501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(88, 0).addBox(0.0F, -0.9708F, 0.0501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.0F, 1.5F, -1.7F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r173 = Jaw.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(67, 18).mirror().addBox(-0.3112F, -0.7F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.3112F, 2.2527F, -3.6361F, 0.0F, -0.3316F, 0.0F));

		PartDefinition cube_r174 = Jaw.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(87, 85).mirror().addBox(-2.0F, -1.042F, -0.0583F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(87, 85).addBox(0.0F, -1.042F, -0.0583F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.0F, 1.9F, -2.5F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r175 = Jaw.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(67, 76).mirror().addBox(-2.0F, -0.0125F, -1.8801F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(67, 76).addBox(0.0F, -0.0125F, -1.8801F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3F, -2.6F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r176 = Jaw.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(76, 16).mirror().addBox(-2.0F, -0.0199F, -0.0656F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(76, 16).addBox(0.0F, -0.0199F, -0.0656F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.4F, -1.8F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r177 = Jaw.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(21, 77).mirror().addBox(-1.6F, -0.9359F, -1.8905F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(21, 77).addBox(-1.4F, -0.9359F, -1.8905F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.5F, 2.1F, -7.3F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r178 = Jaw.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(23, 67).mirror().addBox(-2.0F, -0.9359F, 0.0095F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(23, 67).addBox(-1.0F, -0.9359F, 0.0095F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.5F, 2.1F, -7.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r179 = Jaw.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(14, 77).mirror().addBox(-2.0F, -0.0688F, -0.0488F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(14, 77).addBox(-1.0F, -0.0688F, -0.0488F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.2F, -7.1F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r180 = Jaw.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-0.5F, -0.6F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false)
				.texOffs(0, 76).addBox(1.5F, -0.6F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 0.4F, -0.2F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r181 = Jaw.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(35, 87).addBox(-0.0025F, 0.4959F, 3.2644F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(76, 12).addBox(-0.0025F, 0.4959F, 1.7644F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.6888F, 2.2527F, -3.6361F, 0.5161F, 0.0402F, -0.0907F));

		PartDefinition cube_r182 = Jaw.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(67, 18).addBox(-0.6888F, -0.7F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.6888F, 2.2527F, -3.6361F, 0.0F, 0.3316F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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