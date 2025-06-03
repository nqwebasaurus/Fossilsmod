package fossils.fossils.client.blockentity.model.australovenator;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AustralovenatorFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart Leftleg1;
	private final ModelPart Leftleg2;
	private final ModelPart Leftleg3;
	private final ModelPart Leftleg4;
	private final ModelPart Leftleg5;
	private final ModelPart Rightleg1;
	private final ModelPart Rightleg2;
	private final ModelPart Rightleg3;
	private final ModelPart Rightleg4;
	private final ModelPart Rightleg5;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart Leftarm1;
	private final ModelPart Leftarm2;
	private final ModelPart Leftarm3;
	private final ModelPart Leftarm4;
	private final ModelPart Rightarm1;
	private final ModelPart Rightarm2;
	private final ModelPart Rightarm3;
	private final ModelPart Rightarm4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;

	public AustralovenatorFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.Leftleg1 = this.hips.getChild("Leftleg1");
		this.Leftleg2 = this.Leftleg1.getChild("Leftleg2");
		this.Leftleg3 = this.Leftleg2.getChild("Leftleg3");
		this.Leftleg4 = this.Leftleg3.getChild("Leftleg4");
		this.Leftleg5 = this.Leftleg4.getChild("Leftleg5");
		this.Rightleg1 = this.hips.getChild("Rightleg1");
		this.Rightleg2 = this.Rightleg1.getChild("Rightleg2");
		this.Rightleg3 = this.Rightleg2.getChild("Rightleg3");
		this.Rightleg4 = this.Rightleg3.getChild("Rightleg4");
		this.Rightleg5 = this.Rightleg4.getChild("Rightleg5");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.Leftarm1 = this.chest.getChild("Leftarm1");
		this.Leftarm2 = this.Leftarm1.getChild("Leftarm2");
		this.Leftarm3 = this.Leftarm2.getChild("Leftarm3");
		this.Leftarm4 = this.Leftarm3.getChild("Leftarm4");
		this.Rightarm1 = this.chest.getChild("Rightarm1");
		this.Rightarm2 = this.Rightarm1.getChild("Rightarm2");
		this.Rightarm3 = this.Rightarm2.getChild("Rightarm3");
		this.Rightarm4 = this.Rightarm3.getChild("Rightarm4");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(50, 65).addBox(0.01F, -3.9738F, -3.1004F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -23.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0567F, -5.0223F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9F, 3.8F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(45, 33).mirror().addBox(-2.0F, 0.2F, 1.4F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(45, 33).addBox(0.0F, 0.2F, 1.4F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(30, 12).addBox(-1.0F, -0.1F, -0.1F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.9F, -4.2F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(1.3203F, 4.3914F, 2.9897F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.2F, -0.8F, -0.9565F, -0.0165F, 0.001F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(19, 66).mirror().addBox(1.3203F, 0.2866F, 5.2639F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.2F, -0.8F, -1.3579F, -0.0165F, 0.001F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(6, 0).mirror().addBox(1.3203F, -0.9376F, 5.2291F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.2F, -0.8F, -1.5674F, -0.0165F, 0.001F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(24, 62).mirror().addBox(-0.3772F, 0.5191F, -1.5276F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.2F, -0.8F, -0.1262F, 0.0949F, -0.3397F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(65, 5).mirror().addBox(-0.4165F, -0.8451F, -2.1461F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.2F, -0.8F, 0.3911F, 0.0236F, -0.0694F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(67, 47).mirror().addBox(-0.4785F, -0.4825F, -1.0509F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.2F, -0.8F, 0.4363F, 0.0F, -0.0611F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5859F, 4.6194F, 0.061F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.151F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.2F, -0.8F, 0.7693F, 0.06F, -0.3516F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(7, 64).mirror().addBox(-0.5859F, 0.0716F, -0.4811F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.2F, -0.8F, 0.8827F, 0.06F, -0.3516F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(18, 45).mirror().addBox(0.0F, -0.2709F, -2.0871F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -0.1F, -0.8F, -0.1047F, 0.0F, -0.2182F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(54, 27).mirror().addBox(-0.4F, 0.4742F, -3.3082F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.6F, -3.8F, -0.7F, 0.0698F, 0.1309F, 0.0F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(47, 57).mirror().addBox(-0.4F, 0.1529F, -4.9528F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.6F, -3.8F, -0.7F, 0.4712F, 0.1309F, 0.0F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(12, 66).mirror().addBox(-0.8177F, -0.2341F, -1.8088F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6F, -2.8F, -3.9F, 0.9599F, 0.1309F, 0.0F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(30, 41).mirror().addBox(-1.0F, -0.7F, 2.7F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(30, 41).addBox(4.0F, -0.7F, 2.7F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -2.1F, -4.8F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(56, 11).mirror().addBox(-1.0F, -0.03F, -2.9557F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(56, 11).addBox(4.0F, -0.03F, -2.9557F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.0F, -2.6F, 2.0F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(65, 14).mirror().addBox(-1.0F, 0.1161F, -2.9887F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(65, 14).addBox(4.0F, 0.1161F, -2.9887F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.0F, -1.7F, 4.9F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(18, 45).addBox(-1.0F, -0.2709F, -2.0871F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.0F, -0.1F, -0.8F, -0.1047F, 0.0F, 0.2182F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(67, 47).addBox(-0.5215F, -0.4825F, -1.0509F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 2.2F, -0.8F, 0.4363F, 0.0F, 0.0611F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(7, 64).addBox(-0.4141F, 0.0716F, -0.4811F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.0F, 2.2F, -0.8F, 0.8827F, -0.06F, 0.3516F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 0).addBox(-0.4141F, 4.6194F, 0.061F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.151F)), PartPose.offsetAndRotation(2.0F, 2.2F, -0.8F, 0.7693F, -0.06F, 0.3516F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(65, 5).addBox(-0.5835F, -0.8451F, -2.1461F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0F, 2.2F, -0.8F, 0.3911F, -0.0236F, 0.0694F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(24, 62).addBox(-0.6228F, 0.5191F, -1.5276F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 2.2F, -0.8F, -0.1262F, -0.0949F, 0.3397F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 75).addBox(-2.3203F, 4.3914F, 2.9897F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.0F, 2.2F, -0.8F, -0.9565F, 0.0165F, -0.001F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(6, 0).addBox(-2.3203F, -0.9376F, 5.2291F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0F, 2.2F, -0.8F, -1.5674F, 0.0165F, -0.001F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(19, 66).addBox(-2.3203F, 0.2866F, 5.2639F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0F, 2.2F, -0.8F, -1.3579F, 0.0165F, -0.001F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(12, 66).addBox(-0.1823F, -0.2341F, -1.8088F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, -2.8F, -3.9F, 0.9599F, -0.1309F, 0.0F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(54, 27).addBox(-0.6F, 0.4742F, -3.3082F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.6F, -3.8F, -0.7F, 0.0698F, -0.1309F, 0.0F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(47, 57).addBox(-0.6F, 0.1529F, -4.9528F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.6F, -3.8F, -0.7F, 0.4712F, -0.1309F, 0.0F));

		PartDefinition Leftleg1 = hips.addOrReplaceChild("Leftleg1", CubeListBuilder.create().texOffs(20, 15).addBox(-1.4F, -0.8224F, -0.6899F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4F, 0.5084F, -0.6257F, -0.654F, 0.0266F, 0.0346F));

		PartDefinition Leftthigh_r1 = Leftleg1.addOrReplaceChild("Leftthigh_r1", CubeListBuilder.create().texOffs(30, 12).addBox(-1.0F, 0.0512F, -0.9059F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4F, -0.8421F, 0.8165F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r2 = Leftleg1.addOrReplaceChild("Leftthigh_r2", CubeListBuilder.create().texOffs(62, 42).addBox(-1.0F, -0.9883F, -0.0359F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4F, 8.1579F, -0.0835F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r3 = Leftleg1.addOrReplaceChild("Leftthigh_r3", CubeListBuilder.create().texOffs(65, 0).addBox(-1.0F, -0.0438F, 0.0015F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4F, 4.1579F, -0.6835F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Leftleg2 = Leftleg1.addOrReplaceChild("Leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 9.4129F, 0.4154F, 0.925F, 0.0F, 0.0F));

		PartDefinition Leftshin_r1 = Leftleg2.addOrReplaceChild("Leftshin_r1", CubeListBuilder.create().texOffs(61, 36).addBox(-1.0F, 2.754F, 4.6608F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, -4.1915F, -3.2512F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Leftshin_r2 = Leftleg2.addOrReplaceChild("Leftshin_r2", CubeListBuilder.create().texOffs(36, 67).addBox(0.2F, -7.1F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(60, 0).addBox(0.2F, -5.5F, -0.4F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 7.2542F, 0.3431F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Leftshin_r3 = Leftleg2.addOrReplaceChild("Leftshin_r3", CubeListBuilder.create().texOffs(11, 55).addBox(-1.0F, -4.4F, -0.7F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.7F, 6.6951F, 0.6802F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Leftleg3 = Leftleg2.addOrReplaceChild("Leftleg3", CubeListBuilder.create().texOffs(0, 57).addBox(-1.2F, 0.0504F, -0.4511F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 9.1191F, 0.371F, -0.5228F, -0.0784F, -0.0464F));

		PartDefinition Leftleg4 = Leftleg3.addOrReplaceChild("Leftleg4", CubeListBuilder.create().texOffs(41, 0).addBox(-3.0F, -0.4127F, -3.3508F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 5.2125F, 0.0756F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Leftleg5 = Leftleg4.addOrReplaceChild("Leftleg5", CubeListBuilder.create().texOffs(39, 41).addBox(-3.0F, -0.3879F, -2.8236F, 5.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.0F, -0.0248F, -3.0271F));

		PartDefinition Rightleg1 = hips.addOrReplaceChild("Rightleg1", CubeListBuilder.create().texOffs(0, 15).addBox(-0.6F, -0.8224F, -0.6899F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.4F, 0.5084F, -0.6257F, 0.0F, 0.0F, -0.1745F));

		PartDefinition Rightthigh_r1 = Rightleg1.addOrReplaceChild("Rightthigh_r1", CubeListBuilder.create().texOffs(30, 0).addBox(-1.0F, 0.0512F, -0.9059F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4F, -0.8421F, 0.8165F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r2 = Rightleg1.addOrReplaceChild("Rightthigh_r2", CubeListBuilder.create().texOffs(62, 9).addBox(-1.0F, -0.9883F, -0.0359F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4F, 8.1579F, -0.0835F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r3 = Rightleg1.addOrReplaceChild("Rightthigh_r3", CubeListBuilder.create().texOffs(62, 64).addBox(-1.0F, -0.0438F, 0.0015F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4F, 4.1579F, -0.6835F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Rightleg2 = Rightleg1.addOrReplaceChild("Rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 9.4129F, 0.4154F, 0.8814F, 0.0F, 0.0F));

		PartDefinition Rightshin_r1 = Rightleg2.addOrReplaceChild("Rightshin_r1", CubeListBuilder.create().texOffs(60, 24).addBox(-1.0F, 2.754F, 4.6608F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -4.1915F, -3.2512F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Rightshin_r2 = Rightleg2.addOrReplaceChild("Rightshin_r2", CubeListBuilder.create().texOffs(29, 67).addBox(-1.2F, -7.1F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(29, 58).addBox(-1.2F, -5.5F, -0.4F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 7.2542F, 0.3431F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Rightshin_r3 = Rightleg2.addOrReplaceChild("Rightshin_r3", CubeListBuilder.create().texOffs(22, 53).addBox(-1.0F, -4.4F, -0.7F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.7F, 6.6951F, 0.6802F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Rightleg3 = Rightleg2.addOrReplaceChild("Rightleg3", CubeListBuilder.create().texOffs(38, 56).addBox(-1.8F, 0.0504F, -0.4511F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 9.1191F, 0.371F, -0.8651F, 0.1334F, 0.1129F));

		PartDefinition Rightleg4 = Rightleg3.addOrReplaceChild("Rightleg4", CubeListBuilder.create().texOffs(17, 39).addBox(-2.0F, -0.4127F, -3.3508F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 5.2125F, 0.0756F, 0.48F, 0.0F, 0.0F));

		PartDefinition Rightleg5 = Rightleg4.addOrReplaceChild("Rightleg5", CubeListBuilder.create().texOffs(12, 27).addBox(-2.0F, -0.3879F, -2.8236F, 5.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.0248F, -3.0271F, -0.2618F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -4.2F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(65, 74).addBox(0.0F, -3.8F, -0.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 75).addBox(0.0F, -3.8F, -2.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 75).addBox(0.0F, -3.8F, -4.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 75).addBox(0.0F, -3.6F, -6.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 75).addBox(0.0F, -3.5F, -8.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 56).addBox(0.0F, -3.0F, -10.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-1.0F, -1.0F, -11.2F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.8F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(78, 67).mirror().addBox(-3.4836F, -2.9596F, -0.4825F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2089F, -0.2844F, -0.0082F, -0.128F, -1.7796F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(71, 54).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2089F, -0.2844F, -0.1172F, -0.038F, -0.644F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(72, 0).mirror().addBox(-3.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2089F, -0.2844F, -0.0804F, -0.1001F, -1.1653F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(72, 20).mirror().addBox(-4.4836F, -2.9596F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2089F, -2.2844F, 0.0089F, 0.0106F, -1.6759F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(72, 32).mirror().addBox(-3.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2089F, -2.2844F, 0.0133F, 0.0036F, -1.0651F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(72, 47).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2089F, -2.2844F, 0.0157F, 0.0052F, -0.5415F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(72, 73).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8089F, -10.2844F, 0.2987F, 0.0955F, -0.3002F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(6, 74).mirror().addBox(-3.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8089F, -10.2844F, 0.2152F, 0.2226F, -0.8152F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(41, 6).mirror().addBox(-8.4836F, -2.9596F, -0.4825F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8089F, -10.2844F, 0.0461F, 0.305F, -1.4431F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(74, 22).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2089F, -8.2844F, 0.2152F, 0.0694F, -0.3071F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(74, 24).mirror().addBox(-3.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2089F, -8.2844F, 0.1546F, 0.1587F, -0.8267F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(43, 17).mirror().addBox(-8.4836F, -2.9596F, -0.4825F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2089F, -8.2844F, 0.0347F, 0.2184F, -1.4461F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(74, 37).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2089F, -6.2844F, 0.1652F, 0.0535F, -0.38F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(39, 74).mirror().addBox(-3.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2089F, -6.2844F, 0.1189F, 0.1201F, -0.9015F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(54, 49).mirror().addBox(-7.4836F, -2.9596F, -0.4825F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2089F, -6.2844F, 0.0281F, 0.1665F, -1.5171F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(25, 45).mirror().addBox(-5.4836F, -2.9596F, -0.4825F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2089F, -4.2844F, 0.0174F, 0.0799F, -1.5708F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(74, 39).mirror().addBox(-3.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2089F, -4.2844F, 0.0601F, 0.0555F, -0.959F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(74, 49).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2089F, -4.2844F, 0.0821F, 0.0267F, -0.4357F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(34, 27).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.689F, -1.3705F, -0.3187F, -0.0147F, 0.1843F, 0.5908F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(52, 11).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.689F, -1.3705F, -2.2187F, -0.0149F, 0.2541F, 0.5897F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(68, 51).mirror().addBox(-2.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6692F, -6.4898F, -0.015F, 0.2715F, 0.5895F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(69, 29).mirror().addBox(-2.3F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6692F, -4.4898F, 0.0239F, 0.2709F, 0.7344F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(70, 13).mirror().addBox(-2.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6692F, -8.4898F, -0.044F, 0.2684F, 0.4808F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(68, 51).addBox(0.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6692F, -6.4898F, -0.015F, -0.2715F, -0.5895F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(34, 27).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.689F, -1.3705F, -0.3187F, -0.0147F, -0.1843F, -0.5908F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(52, 11).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.689F, -1.3705F, -2.2187F, -0.0149F, -0.2541F, -0.5897F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(69, 29).addBox(0.3F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6692F, -4.4898F, 0.0239F, -0.2709F, -0.7344F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(70, 13).addBox(0.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6692F, -8.4898F, -0.044F, -0.2684F, -0.4808F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(51, 19).mirror().addBox(-1.2F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6692F, -10.4898F, -0.015F, 0.2715F, 0.5895F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(51, 19).addBox(0.2F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6692F, -10.4898F, -0.015F, -0.2715F, -0.5895F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(41, 6).addBox(2.4836F, -2.9596F, -0.4825F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8089F, -10.2844F, 0.0461F, -0.305F, 1.4431F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(6, 74).addBox(1.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8089F, -10.2844F, 0.2152F, -0.2226F, 0.8152F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(72, 73).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8089F, -10.2844F, 0.2987F, -0.0955F, 0.3002F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(43, 17).addBox(2.4836F, -2.9596F, -0.4825F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2089F, -8.2844F, 0.0347F, -0.2184F, 1.4461F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(74, 24).addBox(1.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2089F, -8.2844F, 0.1546F, -0.1587F, 0.8267F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(74, 22).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2089F, -8.2844F, 0.2152F, -0.0694F, 0.3071F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(54, 49).addBox(2.4836F, -2.9596F, -0.4825F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2089F, -6.2844F, 0.0281F, -0.1665F, 1.5171F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(39, 74).addBox(1.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2089F, -6.2844F, 0.1189F, -0.1201F, 0.9015F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(74, 37).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2089F, -6.2844F, 0.1652F, -0.0535F, 0.38F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(72, 0).addBox(1.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2089F, -0.2844F, -0.0804F, 0.1001F, 1.1653F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(71, 54).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2089F, -0.2844F, -0.1172F, 0.038F, 0.644F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(78, 67).addBox(2.4836F, -2.9596F, -0.4825F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2089F, -0.2844F, -0.0082F, 0.128F, 1.7796F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(72, 47).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2089F, -2.2844F, 0.0157F, -0.0052F, 0.5415F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(72, 32).addBox(1.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2089F, -2.2844F, 0.0133F, -0.0036F, 1.0651F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(72, 20).addBox(2.4836F, -2.9596F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2089F, -2.2844F, 0.0089F, -0.0106F, 1.6759F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(74, 49).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2089F, -4.2844F, 0.0821F, -0.0267F, 0.4357F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(74, 39).addBox(1.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2089F, -4.2844F, 0.0601F, -0.0555F, 0.959F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(25, 45).addBox(2.4836F, -2.9596F, -0.4825F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2089F, -4.2844F, 0.0174F, -0.0799F, 1.5708F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 36).addBox(-2.5F, -1.1412F, -4.9543F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.6F, -7.7F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(0, 15).addBox(-3.0F, -1.8969F, -6.9501F, 6.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.6F, -0.7F, -0.0349F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, -11.9F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(42, 78).addBox(0.0F, -1.7978F, -1.2394F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 79).addBox(0.0F, -1.3978F, -3.2394F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 10).addBox(-1.0F, -0.0978F, -4.2394F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.9F, 0.2F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(35, 33).mirror().addBox(-0.5F, -0.0868F, -0.5159F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.1269F, -1.9179F, -0.333F, -0.6725F, 0.4291F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(9, 43).mirror().addBox(-0.5F, -0.0868F, -0.0159F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.1269F, -1.9179F, -0.2183F, -0.8095F, 0.4658F));

		PartDefinition cube_r84 = chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(52, 6).mirror().addBox(-0.5F, -0.0868F, -0.0159F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.1269F, -1.9179F, 0.0592F, -1.263F, 0.4281F));

		PartDefinition cube_r85 = chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(59, 17).mirror().addBox(-0.5F, -0.1606F, 0.0988F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(59, 17).addBox(7.1F, -0.1606F, 0.0988F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.8F, 0.5981F, -2.152F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(53, 19).mirror().addBox(-0.0829F, -3.3298F, -3.1438F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 6.0032F, -3.2359F, 1.2111F, -0.7044F, -1.0447F));

		PartDefinition cube_r87 = chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-0.6F, -1.1F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3494F, 4.19F, -3.739F, 0.7534F, -0.4137F, -0.4632F));

		PartDefinition cube_r88 = chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(11, 49).mirror().addBox(-0.5F, -2.2F, -5.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(11, 49).addBox(7.1F, -2.2F, -5.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.8F, 0.747F, 0.1598F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r89 = chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(72, 66).mirror().addBox(-1.5245F, 0.1547F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0911F, -4.4844F, 0.68F, 0.185F, -0.3295F));

		PartDefinition cube_r90 = chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(0, 10).mirror().addBox(-6.4229F, -2.4634F, -0.4863F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0911F, -4.4844F, 0.1293F, 0.686F, -1.4861F));

		PartDefinition cube_r91 = chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(72, 71).mirror().addBox(-3.3977F, -0.6281F, -0.4863F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0911F, -4.4844F, 0.5257F, 0.4799F, -0.79F));

		PartDefinition cube_r92 = chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(0, 73).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2089F, -2.4844F, 0.4672F, 0.1456F, -0.437F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(73, 34).mirror().addBox(-3.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2089F, -2.4844F, 0.3422F, 0.3477F, -0.9364F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(54, 34).mirror().addBox(-7.4836F, -2.9596F, -0.4825F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2089F, -2.4844F, 0.071F, 0.478F, -1.5907F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(73, 56).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4089F, -0.4844F, 0.3827F, 0.121F, -0.3435F));

		PartDefinition cube_r96 = chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(59, 73).mirror().addBox(-3.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4089F, -0.4844F, 0.2775F, 0.2857F, -0.8519F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(12, 32).mirror().addBox(-8.4836F, -2.9596F, -0.4825F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4089F, -0.4844F, 0.0581F, 0.3916F, -1.4914F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(72, 71).addBox(1.3977F, -0.6281F, -0.4863F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0911F, -4.4844F, 0.5257F, -0.4799F, 0.79F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(0, 10).addBox(2.4229F, -2.4634F, -0.4863F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0911F, -4.4844F, 0.1293F, -0.686F, 1.4861F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(72, 66).addBox(-0.4755F, 0.1547F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0911F, -4.4844F, 0.68F, -0.185F, 0.3295F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(54, 34).addBox(2.4836F, -2.9596F, -0.4825F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2089F, -2.4844F, 0.071F, -0.478F, 1.5907F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(73, 34).addBox(1.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2089F, -2.4844F, 0.3422F, -0.3477F, 0.9364F));

		PartDefinition cube_r103 = chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(0, 73).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2089F, -2.4844F, 0.4672F, -0.1456F, 0.437F));

		PartDefinition cube_r104 = chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(73, 56).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4089F, -0.4844F, 0.3827F, -0.121F, 0.3435F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(59, 73).addBox(1.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4089F, -0.4844F, 0.2775F, -0.2857F, 0.8519F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(12, 32).addBox(2.4836F, -2.9596F, -0.4825F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4089F, -0.4844F, 0.0581F, -0.3916F, 1.4914F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(0, 64).addBox(-0.4F, -1.1F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3494F, 4.19F, -3.739F, 0.7534F, 0.4137F, 0.4632F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(53, 19).addBox(-0.9171F, -3.3298F, -3.1438F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 6.0032F, -3.2359F, 1.2111F, 0.7044F, 1.0447F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(22, 79).addBox(0.5F, -1.3978F, -5.2394F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 67).addBox(0.0F, -0.0978F, -6.2394F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9F, 0.2F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(15, 61).addBox(-0.5F, -0.7804F, -2.8947F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.2578F, -2.1052F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(35, 33).addBox(-0.5F, -0.0868F, -0.5159F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.1269F, -1.9179F, -0.333F, 0.6725F, -0.4291F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(9, 43).addBox(-0.5F, -0.0868F, -0.0159F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.1269F, -1.9179F, -0.2183F, 0.8095F, -0.4658F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(52, 6).addBox(-0.5F, -0.0868F, -0.0159F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.1269F, -1.9179F, 0.0592F, 1.263F, -0.4281F));

		PartDefinition Leftarm1 = chest.addOrReplaceChild("Leftarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.7F, 5.8084F, -3.8257F, 0.682F, 0.2264F, -0.1688F));

		PartDefinition Leftupperarm_r1 = Leftarm1.addOrReplaceChild("Leftupperarm_r1", CubeListBuilder.create().texOffs(72, 16).addBox(-0.5049F, 0.0458F, -1.0266F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1092F, 2.7533F, 0.8346F, -0.075F, -0.022F, -0.0102F));

		PartDefinition Leftupperarm_r2 = Leftarm1.addOrReplaceChild("Leftupperarm_r2", CubeListBuilder.create().texOffs(34, 72).addBox(-0.5F, -1.6014F, -0.7196F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5045F, 0.6566F, -0.1437F, -0.63F, -0.3536F, -0.0108F));

		PartDefinition Leftupperarm_r3 = Leftarm1.addOrReplaceChild("Leftupperarm_r3", CubeListBuilder.create().texOffs(71, 43).addBox(-0.481F, -1.9465F, 0.0137F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0942F, 0.8807F, -0.4331F, -0.4939F, -0.022F, -0.0102F));

		PartDefinition Leftupperarm_r4 = Leftarm1.addOrReplaceChild("Leftupperarm_r4", CubeListBuilder.create().texOffs(16, 36).addBox(-0.5F, -0.6142F, -1.011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5045F, 0.6566F, -0.1437F, 0.6441F, -0.3536F, -0.0108F));

		PartDefinition Leftupperarm_r5 = Leftarm1.addOrReplaceChild("Leftupperarm_r5", CubeListBuilder.create().texOffs(71, 8).addBox(-0.5F, -1.3F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.1092F, 2.1533F, 0.3346F, 0.117F, -0.022F, -0.0102F));

		PartDefinition Leftarm2 = Leftarm1.addOrReplaceChild("Leftarm2", CubeListBuilder.create().texOffs(55, 67).addBox(-0.6158F, -0.8649F, 0.3558F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 70).addBox(-0.6158F, 0.1351F, -1.0442F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2789F, 4.8602F, 0.3544F, -1.8447F, -0.2947F, 0.0814F));

		PartDefinition Leftarm3 = Leftarm2.addOrReplaceChild("Leftarm3", CubeListBuilder.create().texOffs(0, 25).addBox(-2.2864F, -0.2951F, 0.237F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 4.5852F, -0.6812F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Leftarm4 = Leftarm3.addOrReplaceChild("Leftarm4", CubeListBuilder.create().texOffs(31, 50).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2864F, -0.2951F, -0.263F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Rightarm1 = chest.addOrReplaceChild("Rightarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7F, 5.8084F, -3.8257F, -0.5397F, -0.2264F, 0.1688F));

		PartDefinition Rightupperarm_r1 = Rightarm1.addOrReplaceChild("Rightupperarm_r1", CubeListBuilder.create().texOffs(67, 71).addBox(-0.4951F, 0.0458F, -1.0266F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1092F, 2.7533F, 0.8346F, -0.075F, 0.022F, 0.0102F));

		PartDefinition Rightupperarm_r2 = Rightarm1.addOrReplaceChild("Rightupperarm_r2", CubeListBuilder.create().texOffs(29, 72).addBox(-0.5F, -1.6014F, -0.7196F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5045F, 0.6566F, -0.1437F, -0.63F, 0.3536F, 0.0108F));

		PartDefinition Rightupperarm_r3 = Rightarm1.addOrReplaceChild("Rightupperarm_r3", CubeListBuilder.create().texOffs(14, 71).addBox(-0.519F, -1.9465F, 0.0137F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0942F, 0.8807F, -0.4331F, -0.4939F, 0.022F, 0.0102F));

		PartDefinition Rightupperarm_r4 = Rightarm1.addOrReplaceChild("Rightupperarm_r4", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, -0.6142F, -1.011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5045F, 0.6566F, -0.1437F, 0.6441F, 0.3536F, 0.0108F));

		PartDefinition Rightupperarm_r5 = Rightarm1.addOrReplaceChild("Rightupperarm_r5", CubeListBuilder.create().texOffs(9, 43).addBox(-0.5F, -1.3F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.1092F, 2.1533F, 0.3346F, 0.117F, 0.022F, 0.0102F));

		PartDefinition Rightarm2 = Rightarm1.addOrReplaceChild("Rightarm2", CubeListBuilder.create().texOffs(43, 67).addBox(-0.3842F, -0.8649F, 0.3558F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 43).addBox(-0.3842F, 0.1351F, -1.0442F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2789F, 4.8602F, 0.3544F, -1.2246F, 0.3442F, 0.2034F));

		PartDefinition Rightarm3 = Rightarm2.addOrReplaceChild("Rightarm3", CubeListBuilder.create().texOffs(17, 0).addBox(0.2864F, -0.2951F, 0.237F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 4.5852F, -0.6812F, -0.4181F, -0.5926F, 0.2106F));

		PartDefinition Rightarm4 = Rightarm3.addOrReplaceChild("Rightarm4", CubeListBuilder.create().texOffs(45, 46).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2864F, -0.2951F, -0.263F, -0.2618F, 0.0F, 0.0F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -5.9F, 0.0F, 0.1309F, -0.1745F));

		PartDefinition cube_r114 = neck3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(80, 56).addBox(0.5F, -2.0F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 51).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, -0.6F, -2.8F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r115 = neck3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(32, 38).mirror().addBox(-3.8279F, -0.3947F, -0.516F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.3089F, -1.2844F, 0.3453F, 0.8281F, -1.0647F));

		PartDefinition cube_r116 = neck3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(32, 38).addBox(0.8279F, -0.3947F, -0.516F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.3089F, -1.2844F, 0.3453F, -0.8281F, 1.0647F));

		PartDefinition cube_r117 = neck3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(58, 36).mirror().addBox(-0.9142F, 0.072F, -0.5242F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.3089F, -1.2844F, 0.7333F, 0.5575F, -0.4729F));

		PartDefinition cube_r118 = neck3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(58, 36).addBox(-0.0858F, 0.072F, -0.5242F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.3089F, -1.2844F, 0.7333F, -0.5575F, 0.4729F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, -2.6F, 0.1104F, -0.2684F, -0.0909F));

		PartDefinition cube_r119 = neck2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(25, 79).addBox(0.5F, -1.1F, 5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 79).addBox(0.5F, -1.3F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 79).addBox(0.5F, -1.2F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 43).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.6F, -4.7F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r120 = neck2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(62, 56).mirror().addBox(-1.9142F, 0.072F, -0.5242F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -2.4089F, -4.2844F, 0.3301F, 0.7948F, -1.1839F));

		PartDefinition cube_r121 = neck2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(68, 60).mirror().addBox(-1.9142F, 0.072F, -0.5242F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -1.2089F, -2.5844F, 0.3238F, 0.6731F, -1.2385F));

		PartDefinition cube_r122 = neck2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(62, 56).addBox(-0.0858F, 0.072F, -0.5242F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -2.4089F, -4.2844F, 0.3301F, -0.7948F, 1.1839F));

		PartDefinition cube_r123 = neck2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(68, 60).addBox(-0.0858F, 0.072F, -0.5242F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -1.2089F, -2.5844F, 0.3238F, -0.6731F, 1.2385F));

		PartDefinition cube_r124 = neck2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(30, 23).mirror().addBox(-2.9142F, 0.072F, -0.5242F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.2089F, -0.6844F, 0.3843F, 0.6827F, -1.1151F));

		PartDefinition cube_r125 = neck2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(30, 23).addBox(-0.0858F, 0.072F, -0.5242F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.2089F, -0.6844F, 0.3843F, -0.6827F, 1.1151F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.1F, -4.6F, -0.0641F, -0.4891F, 0.3979F));

		PartDefinition cube_r126 = neck.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(59, 80).addBox(0.5F, -1.7F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 80).addBox(0.5F, -1.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 62).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 0.6F, -3.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r127 = neck.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(25, 47).mirror().addBox(-0.9142F, 0.072F, -0.5242F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.2911F, -1.0844F, 0.3503F, 0.9054F, -1.2522F));

		PartDefinition cube_r128 = neck.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(25, 47).addBox(-0.0858F, 0.072F, -0.5242F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.2911F, -1.0844F, 0.3503F, -0.9054F, 1.2522F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, -3.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r129 = head.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(34, 63).addBox(-0.5F, -1.0383F, -2.0177F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.7F, -2.6F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r130 = head.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(54, 44).mirror().addBox(-1.0F, 0.0F, -0.1F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 44).addBox(-0.4F, 0.0F, -0.1F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -0.7F, -2.8F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r131 = head.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(76, 41).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8434F, -8.5828F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r132 = head.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(78, 18).addBox(-0.5F, -0.7752F, 0.0734F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 3.6434F, -8.7828F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r133 = head.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(52, 78).addBox(-1.0F, -0.9903F, -1.0161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, 3.2F, -7.7F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r134 = head.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(60, 69).addBox(-1.0F, -0.9147F, -1.8998F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 3.0F, -5.7F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r135 = head.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(70, 3).addBox(-1.0F, -0.9991F, -1.9808F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.7F, -5.8F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r136 = head.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(77, 12).addBox(0.0F, -0.0014F, -1.0113F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -1.7F, -1.2F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r137 = head.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(48, 76).addBox(0.0F, -0.001F, 0.0591F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(77, 15).addBox(0.0F, -0.001F, 0.1591F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.3F, -2.3F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r138 = head.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(18, 77).addBox(0.0F, -0.012F, -0.1599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8F, -2.9F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r139 = head.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(53, 39).addBox(-1.0F, -0.012F, 0.0401F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -2.9F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r140 = head.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(77, 77).addBox(-1.0F, -0.0358F, -0.0115F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5F, -3.8F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r141 = head.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(69, 62).addBox(-0.5F, 0.0421F, 0.0485F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -5.7F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r142 = head.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(38, 50).addBox(-1.0F, -0.0094F, -4.0372F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 0.3F, -5.6F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r143 = head.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(0, 51).addBox(-1.0F, -0.0867F, -2.9283F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.5F, -2.8F, 0.3665F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create().texOffs(51, 51).addBox(-1.7F, 0.0F, 0.3F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offset(1.0F, -0.7F, -3.2F));

		PartDefinition cube_r144 = leftFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(67, 20).addBox(-0.4182F, -0.3665F, -0.2919F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1484F, -0.0844F, 0.5063F));

		PartDefinition cube_r145 = leftFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(46, 23).addBox(-0.7956F, -0.2169F, -1.0396F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.2F, -2.4F, 0.4625F, -0.0844F, 0.5063F));

		PartDefinition cube_r146 = leftFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(76, 6).addBox(0.63F, -1.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(76, 9).addBox(0.46F, -1.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(33, 76).addBox(0.44F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(38, 76).addBox(0.44F, -1.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.0F, 1.5F, 0.9F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r147 = leftFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(61, 78).addBox(-0.08F, 0.2F, 1.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(69, 25).addBox(-0.38F, -0.3F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8F, 2.9168F, -5.1705F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r148 = leftFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(0, 69).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.7F, 0.0F, 0.3F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r149 = leftFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(78, 63).addBox(0.52F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-1.4F, 1.4025F, -0.595F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r150 = leftFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(67, 78).addBox(0.52F, -0.0945F, -0.1303F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.4F, 0.6647F, -1.0862F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r151 = leftFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(72, 78).addBox(0.52F, -0.0909F, -0.124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.4F, 1.0647F, -1.7862F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r152 = leftFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(78, 74).addBox(0.52F, -0.0867F, -0.143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-1.4F, 1.6647F, -2.2862F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r153 = leftFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(69, 39).addBox(0.52F, -0.8866F, -1.8635F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.4F, 2.2647F, -0.4862F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r154 = leftFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(0, 79).addBox(0.52F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.4F, 1.7647F, -0.1862F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r155 = leftFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(23, 76).addBox(0.44F, -0.214F, -0.2492F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, 0.9547F, 2.8296F, -0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r156 = leftFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(19, 73).addBox(0.44F, -0.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.0F, -0.0443F, 2.4017F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r157 = leftFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(76, 26).addBox(0.44F, -0.8746F, -0.9345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.0F, 1.2F, 1.8F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r158 = leftFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(28, 76).addBox(0.44F, -0.8321F, -0.8949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-1.0F, 0.5F, 1.5F, 1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r159 = leftFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(76, 29).addBox(0.44F, -0.0717F, -0.9374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, 0.2F, 0.8F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r160 = leftFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(53, 74).addBox(-0.5F, -0.0867F, -3.9283F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 0.2F, 0.4F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r161 = leftFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(76, 44).addBox(-0.5F, -0.1416F, 0.0336F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7F, 2.9781F, -2.7774F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r162 = leftFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(48, 72).addBox(0.1F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 1.0F, 2.9F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r163 = leftFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(17, 45).addBox(0.0F, -0.0742F, -0.2256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(-0.6F, -0.4F, 3.4F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r164 = leftFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(43, 63).addBox(-1.0F, -0.965F, -2.0157F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 2.4F, 2.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r165 = leftFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(7, 71).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7F, 2.0F, 2.9F, 0.4538F, 0.0F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create().texOffs(51, 51).mirror().addBox(-0.3F, 0.0F, 0.3F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offset(-1.0F, -0.7F, -3.2F));

		PartDefinition cube_r166 = rightFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(67, 20).mirror().addBox(-0.5818F, -0.3665F, -0.2919F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1484F, 0.0844F, -0.5063F));

		PartDefinition cube_r167 = rightFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(46, 23).mirror().addBox(-0.2044F, -0.2169F, -1.0396F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2F, -2.4F, 0.4625F, 0.0844F, -0.5063F));

		PartDefinition cube_r168 = rightFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(76, 6).mirror().addBox(-1.63F, -1.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(76, 9).mirror().addBox(-1.46F, -1.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(33, 76).mirror().addBox(-1.44F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(38, 76).mirror().addBox(-1.44F, -1.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.0F, 1.5F, 0.9F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r169 = rightFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(61, 78).mirror().addBox(-0.92F, 0.2F, 1.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(69, 25).mirror().addBox(-0.62F, -0.3F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.8F, 2.9168F, -5.1705F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r170 = rightFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.0F, 0.3F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r171 = rightFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(78, 63).mirror().addBox(-1.52F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(1.4F, 1.4025F, -0.595F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r172 = rightFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(67, 78).mirror().addBox(-1.52F, -0.0945F, -0.1303F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(1.4F, 0.6647F, -1.0862F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r173 = rightFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(72, 78).mirror().addBox(-1.52F, -0.0909F, -0.124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.4F, 1.0647F, -1.7862F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r174 = rightFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(78, 74).mirror().addBox(-1.52F, -0.0867F, -0.143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(1.4F, 1.6647F, -2.2862F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r175 = rightFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(69, 39).mirror().addBox(-1.52F, -0.8866F, -1.8635F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(1.4F, 2.2647F, -0.4862F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r176 = rightFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-1.52F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.4F, 1.7647F, -0.1862F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r177 = rightFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(23, 76).mirror().addBox(-1.44F, -0.214F, -0.2492F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.9547F, 2.8296F, -0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r178 = rightFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(19, 73).mirror().addBox(-1.44F, -0.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(1.0F, -0.0443F, 2.4017F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r179 = rightFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(76, 26).mirror().addBox(-1.44F, -0.8746F, -0.9345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.0F, 1.2F, 1.8F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r180 = rightFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(28, 76).mirror().addBox(-1.44F, -0.8321F, -0.8949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.5F, 1.5F, 1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r181 = rightFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(76, 29).mirror().addBox(-1.44F, -0.0717F, -0.9374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.2F, 0.8F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r182 = rightFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(53, 74).mirror().addBox(-0.5F, -0.0867F, -3.9283F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.2F, 0.4F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r183 = rightFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(76, 44).mirror().addBox(-0.5F, -0.1416F, 0.0336F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.7F, 2.9781F, -2.7774F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r184 = rightFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(48, 72).mirror().addBox(-1.1F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.6F, 1.0F, 2.9F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r185 = rightFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(17, 45).mirror().addBox(-1.0F, -0.0742F, -0.2256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.4F, 3.4F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r186 = rightFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(43, 63).mirror().addBox(-1.0F, -0.965F, -2.0157F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.7F, 2.4F, 2.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r187 = rightFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(7, 71).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.7F, 2.0F, 2.9F, 0.4538F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1F, 0.9F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r188 = jaw.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(59, 51).mirror().addBox(-0.5F, -0.6F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(74, 61).mirror().addBox(-0.5F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(74, 68).mirror().addBox(-0.5F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(59, 51).addBox(1.74F, -0.6F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(74, 61).addBox(1.74F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(74, 68).addBox(1.74F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.12F, 1.3209F, -3.5489F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r189 = jaw.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(75, 2).mirror().addBox(-0.8F, -1.2331F, -0.934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(75, 51).mirror().addBox(-0.8F, -0.9331F, -0.934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(75, 2).addBox(-0.2F, -1.2331F, -0.934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(75, 51).addBox(-0.2F, -0.9331F, -0.934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3344F, -5.7424F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r190 = jaw.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(68, 34).mirror().addBox(-1.0F, -0.9714F, -2.0228F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(68, 34).addBox(0.0F, -0.9714F, -2.0228F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7344F, -3.7424F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r191 = jaw.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(68, 56).mirror().addBox(-1.0F, 0.0261F, -2.0028F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(68, 56).addBox(0.0F, 0.0261F, -2.0028F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.0656F, -3.9424F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r192 = jaw.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(75, 58).mirror().addBox(-1.0F, -0.0436F, -1.0004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(75, 58).addBox(0.6F, -0.0436F, -1.0004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.3F, -0.0656F, -2.9424F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r193 = jaw.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(68, 75).mirror().addBox(-1.0F, -0.9888F, -1.0226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(68, 75).addBox(0.6F, -0.9888F, -1.0226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 1.7344F, -2.7424F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r194 = jaw.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(73, 75).mirror().addBox(-1.0F, -0.965F, -0.971F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(73, 75).addBox(0.6F, -0.965F, -0.971F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.3F, 1.4344F, -1.8424F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r195 = jaw.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(5, 76).mirror().addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(5, 76).addBox(0.6F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 0.9344F, -0.9424F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r196 = jaw.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(56, 57).mirror().addBox(-1.0F, 0.0F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(56, 57).addBox(0.6F, 0.0F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3F, -0.0656F, -0.4424F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r197 = jaw.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(62, 59).addBox(-0.5F, -0.3649F, -3.1474F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F))
				.texOffs(53, 57).addBox(-0.5F, -0.0649F, -3.2474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(63, 29).addBox(-0.5F, -0.0649F, -2.9474F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6344F, -6.7424F, 0.1047F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(34, 23).addBox(-1.0F, -1.1F, 0.1F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 3.5F, -0.0939F, -0.1389F, -0.0739F));

		PartDefinition cube_r198 = tail.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(45, 33).addBox(0.0F, -2.1F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 23).addBox(0.0F, -2.1F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 50).addBox(0.0F, -2.0F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 0).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 0.1F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r199 = tail.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(34, 79).addBox(0.0F, -1.4F, 0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9404F, 0.1776F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r200 = tail.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(12, 25).addBox(0.0F, 1.3792F, 2.0777F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 58).addBox(0.0F, 0.0792F, 0.0777F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8404F, 2.1776F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r201 = tail.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(34, 33).mirror().addBox(-2.0F, 1.0F, 5.75F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(40, 10).mirror().addBox(-2.0F, 1.0F, 4.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(49, 8).mirror().addBox(-2.0F, 1.0F, 2.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(8, 51).mirror().addBox(-2.0F, 1.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.1F, 0.1F, 0.0F, 0.1047F, 0.0F));

		PartDefinition cube_r202 = tail.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(34, 33).addBox(0.0F, 1.0F, 5.75F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 10).addBox(0.0F, 1.0F, 4.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 8).addBox(0.0F, 1.0F, 2.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 51).addBox(0.0F, 1.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1F, 0.1F, 0.0F, -0.1047F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(21, 27).addBox(-1.0F, -0.4F, 0.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.7F, 7.0F, 0.0542F, 0.2614F, 0.014F));

		PartDefinition cube_r203 = tail2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(80, 46).addBox(0.0F, -1.0F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 80).addBox(0.0F, -1.1F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 50).addBox(0.0F, -1.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 80).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r204 = tail2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(12, 80).addBox(0.0F, 5.9792F, 10.0777F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 0).addBox(0.0F, 5.1792F, 8.0777F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 78).addBox(0.0F, 3.3792F, 6.0777F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 55).addBox(0.0F, 2.4792F, 4.0777F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5404F, -4.8224F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r205 = tail2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(62, 22).mirror().addBox(-1.0F, -0.1F, 4.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(50, 63).mirror().addBox(-1.0F, -0.1F, 2.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 54).mirror().addBox(-1.0F, -0.1F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7F, 1.0F, 0.0F, 0.0698F, 0.0F));

		PartDefinition cube_r206 = tail2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(62, 22).addBox(0.0F, -0.1F, 4.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 63).addBox(0.0F, -0.1F, 2.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 54).addBox(0.0F, -0.1F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7F, 1.0F, 0.0F, -0.0698F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(17, 15).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(80, 35).addBox(0.0F, -0.9F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 80).addBox(0.0F, -0.8F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 80).addBox(0.0F, -0.8F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 4).addBox(0.0F, -0.8F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 60).addBox(0.0F, -0.7F, 9.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, 0.0723F, 0.2611F, 0.0187F));

		PartDefinition cube_r207 = tail3.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(37, 79).addBox(0.0F, -0.5F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 79).addBox(0.0F, -1.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0981F, 6.4663F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r208 = tail3.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(79, 69).addBox(0.0F, 0.7411F, 1.0662F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 0).addBox(0.0F, -0.1589F, -0.9338F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4404F, 2.0776F, 0.4887F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(30, 0).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.006F))
				.texOffs(79, 32).addBox(0.0F, -0.7F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 75).addBox(0.0F, -0.7F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 29).addBox(0.0F, -0.6F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 62).addBox(0.0F, -0.5F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, -0.0928F, -0.3477F, 0.0317F));

		PartDefinition cube_r209 = tail4.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(39, 41).addBox(0.0F, -0.5F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 51).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8482F, 4.8591F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r210 = tail4.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(53, 39).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9084F, 2.8204F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r211 = tail4.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(59, 17).addBox(0.0F, 1.1F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0981F, -3.5337F, 0.3665F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, -0.1084F, -0.2603F, 0.028F));

		PartDefinition cube_r212 = tail5.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(26, 27).addBox(0.0F, -0.4F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 40).addBox(0.0F, -0.4F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8482F, -3.1409F, 0.0873F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, -0.1965F, -0.2141F, 0.0423F));

		return LayerDefinition.create(meshdefinition, 85, 85);
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