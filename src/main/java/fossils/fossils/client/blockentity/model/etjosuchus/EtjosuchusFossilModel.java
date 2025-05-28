package fossils.fossils.client.blockentity.model.etjosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EtjosuchusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart upperleg2;
	private final ModelPart leg2;
	private final ModelPart feet2;
	private final ModelPart toes2;
	private final ModelPart upperleg3;
	private final ModelPart leg3;
	private final ModelPart feet3;
	private final ModelPart toes3;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart Leftarm1;
	private final ModelPart Leftarm2;
	private final ModelPart Leftarm3;
	private final ModelPart Rightarm1;
	private final ModelPart Rightarm2;
	private final ModelPart Rightarm3;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart crestl;
	private final ModelPart crestl2;
	private final ModelPart crestl3;
	private final ModelPart crestl4;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public EtjosuchusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone2 = this.hips.getChild("bone2");
		this.upperleg2 = this.hips.getChild("upperleg2");
		this.leg2 = this.upperleg2.getChild("leg2");
		this.feet2 = this.leg2.getChild("feet2");
		this.toes2 = this.feet2.getChild("toes2");
		this.upperleg3 = this.hips.getChild("upperleg3");
		this.leg3 = this.upperleg3.getChild("leg3");
		this.feet3 = this.leg3.getChild("feet3");
		this.toes3 = this.feet3.getChild("toes3");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.Leftarm1 = this.chest.getChild("Leftarm1");
		this.Leftarm2 = this.Leftarm1.getChild("Leftarm2");
		this.Leftarm3 = this.Leftarm2.getChild("Leftarm3");
		this.Rightarm1 = this.chest.getChild("Rightarm1");
		this.Rightarm2 = this.Rightarm1.getChild("Rightarm2");
		this.Rightarm3 = this.Rightarm2.getChild("Rightarm3");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.crestl = this.head.getChild("crestl");
		this.crestl2 = this.crestl.getChild("crestl2");
		this.crestl3 = this.head.getChild("crestl3");
		this.crestl4 = this.crestl3.getChild("crestl4");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -18.0349F, 0.2008F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(8, 98).addBox(0.0F, -1.638F, -0.0036F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 2.0F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(10, 79).addBox(0.0F, -1.5F, 1.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(63, 46).mirror().addBox(-2.0F, 1.0F, 1.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(63, 46).addBox(1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(44, 46).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2F, -3.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(96, 59).addBox(-1.0F, -0.0815F, 7.0947F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(0, 58).addBox(-1.0F, -0.0815F, 3.0947F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, -2.6F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(69, 32).addBox(-1.0F, -0.0718F, -2.9119F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.8F, 0.4F, -0.0262F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(-1.5F, -2.7F, -3.2F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(26, 78).addBox(3.0F, -0.0835F, 0.0701F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.5F, -0.1F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(78, 37).addBox(3.0F, -0.0815F, 0.9934F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.8F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(35, 68).addBox(3.0F, 0.789F, -1.9959F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.9F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(80, 19).addBox(3.0F, 0.7154F, -1.1659F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.4F, 3.8F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(80, 93).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.5F, 2.3101F, 3.9601F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(69, 5).addBox(3.0F, -0.009F, -0.9682F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 2.5F, -0.1F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(46, 68).addBox(3.0F, -1.8233F, -6.3107F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.9F, 6.3F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(63, 88).addBox(-0.5F, 0.9811F, -0.713F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.578F, 4.9127F, 5.6017F, 1.0323F, -0.2506F, 0.1031F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(94, 4).addBox(-0.5F, -3.2853F, 0.4893F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.578F, 4.9127F, 5.6017F, 1.3552F, -0.2506F, 0.1031F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(38, 48).addBox(-0.5F, -3.6271F, -0.4202F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.578F, 4.9127F, 5.6017F, 0.788F, -0.2506F, 0.1031F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(86, 50).addBox(-0.5F, -1.3F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F))
				.texOffs(57, 68).addBox(-0.5F, -0.4F, -2.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(3.5F, 2.8387F, 2.0953F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(79, 68).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 2.8387F, 2.0953F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(13, 94).addBox(-0.6798F, -2.6766F, -5.9432F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6543F, 3.2633F, -0.7542F, 1.6755F, 0.0F, 0.2618F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(49, 74).addBox(-0.6798F, -0.2317F, -5.5629F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.6543F, 3.2633F, -0.7542F, 1.2217F, 0.0F, 0.2618F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(91, 84).addBox(-0.6798F, -3.3013F, -6.599F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.6543F, 3.2633F, -0.7542F, 1.7017F, 0.0F, 0.2618F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(80, 24).addBox(-0.6798F, 0.2706F, -2.524F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.6543F, 3.2633F, -0.7542F, 1.0297F, 0.0F, 0.2618F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(1.5F, -2.7F, -3.2F));

		PartDefinition cube_r21 = bone2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(26, 78).mirror().addBox(-4.0F, -0.0835F, 0.0701F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, -0.1F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r22 = bone2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(78, 37).mirror().addBox(-4.0F, -0.0815F, 0.9934F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4F, 1.8F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r23 = bone2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(35, 68).mirror().addBox(-4.0F, 0.789F, -1.9959F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5F, 1.9F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r24 = bone2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(80, 19).mirror().addBox(-4.0F, 0.7154F, -1.1659F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4F, 3.8F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r25 = bone2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(80, 93).mirror().addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 2.3101F, 3.9601F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r26 = bone2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(69, 5).mirror().addBox(-4.0F, -0.009F, -0.9682F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5F, -0.1F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r27 = bone2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(46, 68).mirror().addBox(-4.0F, -1.8233F, -6.3107F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9F, 6.3F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r28 = bone2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(63, 88).mirror().addBox(-0.5F, 0.9811F, -0.713F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.578F, 4.9127F, 5.6017F, 1.0323F, 0.2506F, -0.1031F));

		PartDefinition cube_r29 = bone2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(94, 4).mirror().addBox(-0.5F, -3.2853F, 0.4893F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.578F, 4.9127F, 5.6017F, 1.3552F, 0.2506F, -0.1031F));

		PartDefinition cube_r30 = bone2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(38, 48).mirror().addBox(-0.5F, -3.6271F, -0.4202F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.578F, 4.9127F, 5.6017F, 0.788F, 0.2506F, -0.1031F));

		PartDefinition cube_r31 = bone2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(86, 50).mirror().addBox(-0.5F, -1.3F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(57, 68).mirror().addBox(-0.5F, -0.4F, -2.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 2.8387F, 2.0953F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r32 = bone2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(79, 68).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 2.8387F, 2.0953F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r33 = bone2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(13, 94).mirror().addBox(-0.3202F, -2.6766F, -5.9432F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6543F, 3.2633F, -0.7542F, 1.6755F, 0.0F, -0.2618F));

		PartDefinition cube_r34 = bone2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(49, 74).mirror().addBox(-0.3202F, -0.2317F, -5.5629F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.6543F, 3.2633F, -0.7542F, 1.2217F, 0.0F, -0.2618F));

		PartDefinition cube_r35 = bone2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(91, 84).mirror().addBox(-0.3202F, -3.3013F, -6.599F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.6543F, 3.2633F, -0.7542F, 1.7017F, 0.0F, -0.2618F));

		PartDefinition cube_r36 = bone2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(80, 24).mirror().addBox(-0.3202F, 0.2706F, -2.524F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.6543F, 3.2633F, -0.7542F, 1.0297F, 0.0F, -0.2618F));

		PartDefinition upperleg2 = hips.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, -0.2825F, -0.7812F, 0.1589F, 0.0F, 0.0F));

		PartDefinition upperleg4_r1 = upperleg2.addOrReplaceChild("upperleg4_r1", CubeListBuilder.create().texOffs(49, 79).addBox(-0.5F, -0.5F, -1.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.5361F, 0.014F, 0.2269F, 0.0F, 0.0F));

		PartDefinition upperleg4_r2 = upperleg2.addOrReplaceChild("upperleg4_r2", CubeListBuilder.create().texOffs(63, 52).addBox(-0.5F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 2.8404F, 0.3953F, 0.4276F, 0.0F, 0.0F));

		PartDefinition upperleg3_r1 = upperleg2.addOrReplaceChild("upperleg3_r1", CubeListBuilder.create().texOffs(70, 52).addBox(-0.5F, -0.1F, -1.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8014F, 1.068F, 0.1658F, 0.0F, 0.0F));

		PartDefinition upperleg2_r1 = upperleg2.addOrReplaceChild("upperleg2_r1", CubeListBuilder.create().texOffs(70, 84).addBox(-0.5F, 0.0F, -0.025F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.7641F, 1.1007F, 0.4014F, 0.0F, 0.0F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6F, 8.5324F, 2.4434F, 0.5452F, 0.0F, 0.0F));

		PartDefinition leg3_r1 = leg2.addOrReplaceChild("leg3_r1", CubeListBuilder.create().texOffs(0, 71).addBox(-0.5F, -5.7F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0535F, 6.1385F, 0.0506F, 1.5708F, 1.501F, 1.5708F));

		PartDefinition leg3_r2 = leg2.addOrReplaceChild("leg3_r2", CubeListBuilder.create().texOffs(80, 29).addBox(-0.7F, -6.2772F, -1.9465F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 6.2671F, 0.7198F, 0.0F, 1.5708F, 0.0F));

		PartDefinition leg3_r3 = leg2.addOrReplaceChild("leg3_r3", CubeListBuilder.create().texOffs(35, 82).addBox(-0.0821F, -2.7095F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.9465F, 3.9899F, 0.7198F, -1.5708F, 1.4923F, -1.5708F));

		PartDefinition leg2_r1 = leg2.addOrReplaceChild("leg2_r1", CubeListBuilder.create().texOffs(35, 74).addBox(-0.3F, -2.5F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9465F, 6.4899F, 0.7198F, 1.5708F, 1.4835F, 1.5708F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create().texOffs(0, 40).addBox(-2.5487F, -0.4749F, -3.7509F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 9.1683F, 0.6358F, 0.0398F, 0.0F, 0.0F));

		PartDefinition toes2 = feet2.addOrReplaceChild("toes2", CubeListBuilder.create().texOffs(54, 0).addBox(-2.4987F, -0.4978F, -2.9636F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0229F, -3.7873F, -0.6109F, 0.0F, 0.0F));

		PartDefinition upperleg3 = hips.addOrReplaceChild("upperleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, -0.2825F, -0.7812F, -1.099F, 0.312F, 0.06F));

		PartDefinition upperleg5_r1 = upperleg3.addOrReplaceChild("upperleg5_r1", CubeListBuilder.create().texOffs(80, 14).addBox(-1.5F, -0.5F, -1.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.5361F, 0.014F, 0.2269F, 0.0F, 0.0F));

		PartDefinition upperleg5_r2 = upperleg3.addOrReplaceChild("upperleg5_r2", CubeListBuilder.create().texOffs(63, 84).addBox(-1.5F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 2.8404F, 0.3953F, 0.4276F, 0.0F, 0.0F));

		PartDefinition upperleg4_r3 = upperleg3.addOrReplaceChild("upperleg4_r3", CubeListBuilder.create().texOffs(10, 71).addBox(-1.5F, -0.1F, -1.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8014F, 1.068F, 0.1658F, 0.0F, 0.0F));

		PartDefinition upperleg3_r2 = upperleg3.addOrReplaceChild("upperleg3_r2", CubeListBuilder.create().texOffs(84, 84).addBox(-1.5F, 0.0F, -0.025F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.7641F, 1.1007F, 0.4014F, 0.0F, 0.0F));

		PartDefinition leg3 = upperleg3.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6F, 8.5324F, 2.4434F, 1.9851F, 0.0F, 0.0F));

		PartDefinition leg4_r1 = leg3.addOrReplaceChild("leg4_r1", CubeListBuilder.create().texOffs(5, 71).addBox(-0.5F, -5.7F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0535F, 6.1385F, 0.0506F, 1.5708F, -1.501F, -1.5708F));

		PartDefinition leg4_r2 = leg3.addOrReplaceChild("leg4_r2", CubeListBuilder.create().texOffs(80, 56).addBox(-1.3F, -6.2772F, -1.9465F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.2671F, 0.7198F, 0.0F, -1.5708F, 0.0F));

		PartDefinition leg4_r3 = leg3.addOrReplaceChild("leg4_r3", CubeListBuilder.create().texOffs(42, 82).addBox(-0.9179F, -2.7095F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.9465F, 3.9899F, 0.7198F, -1.5708F, -1.4923F, 1.5708F));

		PartDefinition leg3_r4 = leg3.addOrReplaceChild("leg3_r4", CubeListBuilder.create().texOffs(42, 74).addBox(-0.7F, -2.5F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9465F, 6.4899F, 0.7198F, 1.5708F, -1.4835F, -1.5708F));

		PartDefinition feet3 = leg3.addOrReplaceChild("feet3", CubeListBuilder.create().texOffs(44, 38).addBox(-2.4513F, -0.4749F, -3.7509F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 9.1683F, 0.6358F, -0.2656F, 0.0F, 0.0F));

		PartDefinition toes3 = feet3.addOrReplaceChild("toes3", CubeListBuilder.create().texOffs(38, 56).addBox(-2.5013F, -0.4978F, -2.9636F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0229F, -3.7873F, 0.2618F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(27, 13).addBox(-1.0F, -1.2F, -10.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.003F))
				.texOffs(55, 56).addBox(-2.0F, 6.9585F, -6.1888F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(23, 34).addBox(0.0F, -2.4F, -7.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 97).addBox(0.0F, -2.3F, -9.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 56).addBox(0.0F, -2.5F, -5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 97).addBox(0.0F, -2.5F, -3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 98).addBox(0.0F, -2.5F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -3.0F, 0.0179F, 0.2181F, 0.0039F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(96, 86).mirror().addBox(-2.8794F, -0.684F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4F, -0.5F, 0.0588F, 0.1074F, -1.1224F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(63, 93).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4F, -0.5F, 0.092F, 0.0809F, -0.7728F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(96, 63).mirror().addBox(-4.1252F, -2.3981F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4F, -2.5F, 0.0071F, 0.2532F, -1.5347F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(93, 51).mirror().addBox(-3.8794F, -0.684F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4F, -2.5F, 0.1251F, 0.2208F, -1.0418F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(93, 49).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4F, -2.5F, 0.1931F, 0.1649F, -0.6906F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(92, 73).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4F, -4.5F, 0.2274F, 0.1926F, -0.6845F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(92, 47).mirror().addBox(-3.8794F, -0.684F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4F, -4.5F, 0.1479F, 0.2584F, -1.0364F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(92, 45).mirror().addBox(-5.1252F, -2.3981F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4F, -4.5F, 0.0087F, 0.2968F, -1.5343F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(33, 92).mirror().addBox(-3.8794F, -0.684F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4F, -6.5F, 0.2267F, 0.2667F, -1.0099F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(26, 92).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4F, -6.5F, 0.303F, 0.1743F, -0.6647F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(80, 61).mirror().addBox(-7.1252F, -2.3981F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4F, -6.5F, 0.075F, 0.3404F, -1.5075F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(71, 66).mirror().addBox(-8.1252F, -2.3981F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.5F, -8.5F, 0.0937F, 0.3636F, -1.4674F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(19, 92).mirror().addBox(-3.8794F, -0.684F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.5F, -8.5F, 0.2542F, 0.2787F, -0.9688F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 92).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.5F, -8.5F, 0.3325F, 0.1767F, -0.6259F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(63, 93).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4F, -0.5F, 0.092F, -0.0809F, 0.7728F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(96, 86).addBox(1.8794F, -0.684F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4F, -0.5F, 0.0588F, -0.1074F, 1.1224F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(93, 49).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4F, -2.5F, 0.1931F, -0.1649F, 0.6906F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(93, 51).addBox(1.8794F, -0.684F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4F, -2.5F, 0.1251F, -0.2208F, 1.0418F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(96, 63).addBox(3.1252F, -2.3981F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4F, -2.5F, 0.0071F, -0.2532F, 1.5347F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(92, 73).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4F, -4.5F, 0.2274F, -0.1926F, 0.6845F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(92, 47).addBox(1.8794F, -0.684F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4F, -4.5F, 0.1479F, -0.2584F, 1.0364F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(92, 45).addBox(3.1252F, -2.3981F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4F, -4.5F, 0.0087F, -0.2968F, 1.5343F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(33, 92).addBox(1.8794F, -0.684F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4F, -6.5F, 0.2267F, -0.2667F, 1.0099F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(26, 92).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4F, -6.5F, 0.303F, -0.1743F, 0.6647F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(80, 61).addBox(3.1252F, -2.3981F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4F, -6.5F, 0.075F, -0.3404F, 1.5075F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(71, 66).addBox(3.1252F, -2.3981F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5F, -8.5F, 0.0937F, -0.3636F, 1.4674F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(19, 92).addBox(1.8794F, -0.684F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5F, -8.5F, 0.2542F, -0.2787F, 0.9688F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(0, 92).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5F, -8.5F, 0.3325F, -0.1767F, 0.6259F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(27, 26).addBox(-1.0F, -0.125F, -10.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.8F, 0.6F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(22, 67).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.8F, -7.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2572F, -9.8912F, -0.0833F, 0.1136F, -0.0193F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(68, 88).mirror().addBox(-0.5251F, -0.4263F, -0.0492F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7958F, 7.2175F, -3.1735F, 1.1386F, -0.4137F, -0.8893F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(76, 46).mirror().addBox(-1.197F, -0.0616F, -2.87F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4526F, -0.0974F, -3.2935F, 1.4813F, -0.0843F, -0.153F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(77, 51).mirror().addBox(-0.7869F, 0.019F, -0.1205F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-2.4526F, 2.6026F, -3.2935F, 1.2456F, -0.0843F, -0.153F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(80, 4).mirror().addBox(-0.7869F, 0.019F, 0.0545F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4526F, 2.6026F, -3.2935F, 0.9402F, -0.0843F, -0.153F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(77, 84).mirror().addBox(-0.5F, -0.8F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(67, 38).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.4526F, 4.6026F, -3.0935F, 1.4202F, -0.0843F, -0.153F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(76, 79).mirror().addBox(-0.5F, -0.8F, -0.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2093F, 5.8499F, -3.6893F, 1.202F, -0.0843F, -0.153F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(87, 36).mirror().addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2539F, 5.777F, -3.2985F, 1.7692F, -0.0843F, -0.153F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(0, 82).mirror().addBox(-0.5251F, -2.912F, -0.9964F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.7958F, 7.2175F, -3.1735F, 1.1823F, -0.4137F, -0.8893F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(91, 34).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0743F, -0.5802F, 0.4488F, 0.2222F, -0.621F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(89, 63).mirror().addBox(-3.8794F, -0.684F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0743F, -0.5802F, 0.3516F, 0.3595F, -0.9565F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(67, 44).mirror().addBox(-8.1252F, -2.3981F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0743F, -0.5802F, 0.1396F, 0.479F, -1.4668F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(45, 89).mirror().addBox(-0.5251F, -0.571F, -0.9126F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7958F, 7.2175F, -3.1735F, 1.4877F, -0.4137F, -0.8893F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(85, 46).mirror().addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2953F, 5.0513F, -4.1241F, 0.8529F, -0.0843F, -0.153F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(54, 5).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4358F, 8.2279F, 0.3481F, 0.5256F, -0.4783F, -0.4238F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(32, 61).mirror().addBox(-0.5F, 0.0F, -0.1F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4992F, 8.186F, 0.3985F, 0.7181F, -0.5861F, -0.5587F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(69, 17).mirror().addBox(-0.5F, 0.0F, -0.4F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5971F, 8.1577F, 0.4218F, 1.3355F, -0.8757F, -0.8655F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(91, 61).mirror().addBox(-3.9008F, -0.5861F, -0.4725F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8257F, -4.5802F, 0.4225F, 0.5927F, -1.0451F));

		PartDefinition cube_r84 = chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(92, 77).mirror().addBox(-1.9866F, 0.0994F, -0.4725F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8257F, -4.5802F, 0.5938F, 0.4209F, -0.6963F));

		PartDefinition cube_r85 = chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(92, 75).mirror().addBox(-5.1894F, -2.321F, -0.4725F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8257F, -4.5802F, 0.0578F, 0.7109F, -1.6344F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(89, 59).mirror().addBox(-3.8794F, -0.684F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3257F, -2.5802F, 0.4205F, 0.4191F, -1.0176F));

		PartDefinition cube_r87 = chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(80, 34).mirror().addBox(-7.1252F, -2.398F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3257F, -2.5802F, 0.1697F, 0.5623F, -1.5391F));

		PartDefinition cube_r88 = chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(88, 71).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3257F, -2.5802F, 0.5309F, 0.2577F, -0.6888F));

		PartDefinition cube_r89 = chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(0, 82).addBox(-0.4749F, -2.912F, -0.9964F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.7958F, 7.2175F, -3.1735F, 1.1823F, 0.4137F, 0.8893F));

		PartDefinition cube_r90 = chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(68, 88).addBox(-0.4749F, -0.4263F, -0.0492F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7958F, 7.2175F, -3.1735F, 1.1386F, 0.4137F, 0.8893F));

		PartDefinition cube_r91 = chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(45, 89).addBox(-0.4749F, -0.571F, -0.9126F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7958F, 7.2175F, -3.1735F, 1.4877F, 0.4137F, 0.8893F));

		PartDefinition cube_r92 = chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(77, 84).addBox(-0.5F, -0.8F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F))
				.texOffs(67, 38).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.4526F, 4.6026F, -3.0935F, 1.4202F, 0.0843F, 0.153F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(76, 46).addBox(0.197F, -0.0616F, -2.87F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4526F, -0.0974F, -3.2935F, 1.4813F, 0.0843F, 0.153F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(77, 51).addBox(-0.2131F, 0.019F, -0.1205F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(2.4526F, 2.6026F, -3.2935F, 1.2456F, 0.0843F, 0.153F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(80, 4).addBox(-0.2131F, 0.019F, 0.0545F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4526F, 2.6026F, -3.2935F, 0.9402F, 0.0843F, 0.153F));

		PartDefinition cube_r96 = chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(76, 79).addBox(-0.5F, -0.8F, -0.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.2093F, 5.8499F, -3.6893F, 1.202F, 0.0843F, 0.153F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(87, 36).addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2539F, 5.777F, -3.2985F, 1.7692F, 0.0843F, 0.153F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(85, 46).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2953F, 5.0513F, -4.1241F, 0.8529F, 0.0843F, 0.153F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(85, 81).addBox(-1.0F, -0.6F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.0228F, -4.1193F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(45, 62).addBox(-1.0F, 0.6692F, 3.7176F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.6743F, -7.4802F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(19, 57).addBox(-1.0F, 0.1428F, 3.1529F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F))
				.texOffs(98, 65).addBox(0.0F, -0.8572F, 6.1529F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 85).addBox(0.0F, -0.8572F, 4.1529F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3257F, -7.2803F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(58, 79).addBox(-1.7216F, 0.4311F, -3.88F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6216F, 7.3539F, 1.3336F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r103 = chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(54, 5).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4358F, 8.2279F, 0.3481F, 0.5256F, 0.4783F, 0.4238F));

		PartDefinition cube_r104 = chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(32, 61).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4992F, 8.186F, 0.3985F, 0.7181F, 0.5861F, 0.5587F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(69, 17).addBox(-0.5F, 0.0F, -0.4F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5971F, 8.1577F, 0.4218F, 1.3355F, 0.8757F, 0.8655F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(91, 61).addBox(1.9007F, -0.5861F, -0.4725F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8257F, -4.5802F, 0.4225F, -0.5927F, 1.0451F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(92, 77).addBox(-0.0134F, 0.0994F, -0.4725F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8257F, -4.5802F, 0.5938F, -0.4209F, 0.6963F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(92, 75).addBox(3.1894F, -2.321F, -0.4725F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8257F, -4.5802F, 0.0578F, -0.7109F, 1.6344F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(67, 44).addBox(3.1252F, -2.3981F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0743F, -0.5802F, 0.1396F, -0.479F, 1.4668F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(89, 63).addBox(1.8794F, -0.684F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0743F, -0.5802F, 0.3516F, -0.3595F, 0.9565F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(91, 34).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0743F, -0.5802F, 0.4488F, -0.2222F, 0.621F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(89, 59).addBox(1.8794F, -0.684F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3257F, -2.5802F, 0.4205F, -0.4191F, 1.0176F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(80, 34).addBox(3.1252F, -2.398F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3257F, -2.5802F, 0.1697F, -0.5623F, 1.5391F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(88, 71).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3257F, -2.5802F, 0.5309F, -0.2577F, 0.6888F));

		PartDefinition Leftarm1 = chest.addOrReplaceChild("Leftarm1", CubeListBuilder.create().texOffs(94, 42).addBox(-0.027F, -0.2648F, -0.1931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(2.425F, 7.311F, -2.602F, 0.8303F, 0.2264F, -0.1688F));

		PartDefinition Leftupperarm_r1 = Leftarm1.addOrReplaceChild("Leftupperarm_r1", CubeListBuilder.create().texOffs(93, 65).addBox(-0.5F, -0.1796F, -0.2077F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.473F, 2.7352F, 0.3069F, -0.1012F, -0.0234F, -0.0062F));

		PartDefinition Leftupperarm_r2 = Leftarm1.addOrReplaceChild("Leftupperarm_r2", CubeListBuilder.create().texOffs(93, 88).addBox(-0.5F, 0.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.473F, 0.6351F, 0.3069F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r3 = Leftarm1.addOrReplaceChild("Leftupperarm_r3", CubeListBuilder.create().texOffs(48, 94).addBox(-0.5F, -0.2F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.473F, 0.2352F, 0.3069F, -0.3665F, 0.0F, 0.0F));

		PartDefinition Leftarm2 = Leftarm1.addOrReplaceChild("Leftarm2", CubeListBuilder.create().texOffs(13, 58).addBox(-0.5F, -1.35F, 0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 89).addBox(-0.5F, 0.0F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.13F)), PartPose.offsetAndRotation(0.523F, 4.4799F, 0.58F, -0.5199F, 0.0653F, 0.1135F));

		PartDefinition Leftarm3 = Leftarm2.addOrReplaceChild("Leftarm3", CubeListBuilder.create().texOffs(71, 60).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8247F, 2.7356F, 0.3F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Rightarm1 = chest.addOrReplaceChild("Rightarm1", CubeListBuilder.create().texOffs(63, 95).addBox(-0.973F, -0.2648F, -0.1931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-2.425F, 7.311F, -2.602F, 0.5249F, -0.2264F, 0.1688F));

		PartDefinition Rightupperarm_r1 = Rightarm1.addOrReplaceChild("Rightupperarm_r1", CubeListBuilder.create().texOffs(70, 93).addBox(-0.5F, -0.1796F, -0.2077F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.473F, 2.7352F, 0.3069F, -0.1012F, 0.0234F, 0.0062F));

		PartDefinition Rightupperarm_r2 = Rightarm1.addOrReplaceChild("Rightupperarm_r2", CubeListBuilder.create().texOffs(0, 94).addBox(-0.5F, 0.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.473F, 0.6351F, 0.3069F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r3 = Rightarm1.addOrReplaceChild("Rightupperarm_r3", CubeListBuilder.create().texOffs(95, 69).addBox(-0.5F, -0.2F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.473F, 0.2352F, 0.3069F, -0.3665F, 0.0F, 0.0F));

		PartDefinition Rightarm2 = Rightarm1.addOrReplaceChild("Rightarm2", CubeListBuilder.create().texOffs(14, 88).addBox(-0.5F, -1.35F, 0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 54).addBox(-0.5F, 0.0F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.13F)), PartPose.offsetAndRotation(-0.523F, 4.4799F, 0.58F, -0.9562F, -0.0653F, -0.1135F));

		PartDefinition Rightarm3 = Rightarm2.addOrReplaceChild("Rightarm3", CubeListBuilder.create().texOffs(17, 72).addBox(0.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8247F, 2.7356F, 0.3F, 0.0F, 0.0F, -0.2182F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5605F, -4.7833F, -0.4925F, 0.2749F, 0.0998F));

		PartDefinition cube_r115 = neck3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(89, 97).addBox(0.5F, -1.3172F, -1.074F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8F, 0.8F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r116 = neck3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(56, 84).mirror().addBox(1.1928F, -1.8244F, 3.3604F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.415F, -5.8017F, -0.3093F, -0.3233F, 0.0746F));

		PartDefinition cube_r117 = neck3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(56, 84).addBox(-1.1928F, -1.8244F, 3.3604F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.415F, -5.8017F, -0.3093F, 0.3233F, -0.0746F));

		PartDefinition cube_r118 = neck3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(29, 97).addBox(0.5F, -1.2476F, -0.8661F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6F, -1.4F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r119 = neck3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(68, 68).addBox(0.0F, 0.7421F, 0.7129F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.2F, -4.9F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r120 = neck3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(0, 64).addBox(0.0F, -1.8046F, 1.876F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.6F, -4.9F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(67, 79).addBox(-0.5F, -2.5679F, -3.4803F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.8F, -3.0F, 0.2126F, 0.2224F, 0.1691F));

		PartDefinition cube_r121 = neck2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(35, 97).addBox(0.5F, -1.0F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 97).addBox(0.5F, -1.1F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 72).addBox(0.0F, -0.1F, 2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -1.1F, -5.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r122 = neck2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(49, 84).mirror().addBox(0.6075F, -1.2492F, 1.6998F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(17, 83).mirror().addBox(0.0F, -0.3954F, -0.0037F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.615F, -2.8017F, -0.3093F, -0.3233F, 0.0746F));

		PartDefinition cube_r123 = neck2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(49, 84).addBox(-0.6075F, -1.2492F, 1.6998F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(17, 83).addBox(0.0F, -0.3954F, -0.0037F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.615F, -2.8017F, -0.3093F, 0.3233F, -0.0746F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, 0.1806F, 0.2577F, 0.0465F));

		PartDefinition cube_r124 = neck.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(55, 89).addBox(0.5F, -0.8F, 0.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -3.0F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r125 = neck.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(92, 79).mirror().addBox(0.0F, -0.3954F, -0.0037F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.315F, -1.8017F, -0.172F, -0.2389F, 0.0518F));

		PartDefinition cube_r126 = neck.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(92, 79).addBox(0.0F, -0.3954F, -0.0037F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.315F, -1.8017F, -0.172F, 0.2389F, -0.0518F));

		PartDefinition cube_r127 = neck.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(94, 39).addBox(-0.5F, -0.0055F, -1.0542F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5394F, -3.2712F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r128 = neck.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(85, 77).addBox(-0.5F, -0.077F, -1.9945F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.9394F, -1.3712F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r129 = neck.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(18, 94).addBox(-0.5F, -1.0586F, -1.1288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0394F, -0.1712F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r130 = neck.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(11, 64).addBox(0.0F, -0.5F, -0.9F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -3.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(8, 94).addBox(0.52F, 0.8194F, -2.1697F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 94).mirror().addBox(-1.52F, 0.8194F, -2.1697F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -4.4F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r131 = head.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(28, 94).addBox(-1.0F, 2.0614F, -0.0122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 3.4F, -10.2F, 1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r132 = head.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(80, 63).addBox(-2.0F, 1.0244F, 0.0136F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(22, 64).addBox(-2.0F, 0.0244F, 0.0136F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 3.6525F, -2.9996F, 1.7628F, 0.0F, 0.0F));

		PartDefinition cube_r133 = head.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(0, 88).addBox(-1.5F, -0.1F, -0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 4.251F, -3.1254F, 1.9722F, 0.0F, 0.0F));

		PartDefinition cube_r134 = head.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(90, 93).mirror().addBox(-0.5F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0277F, 4.2192F, -6.9683F, 1.7993F, -0.119F, -0.0276F));

		PartDefinition cube_r135 = head.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(40, 88).mirror().addBox(-0.1F, -2.9F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 3.8529F, -3.1637F, 1.6675F, -0.1216F, -0.0118F));

		PartDefinition cube_r136 = head.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(90, 93).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0277F, 4.2192F, -6.9683F, 1.7993F, 0.119F, 0.0276F));

		PartDefinition cube_r137 = head.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(40, 88).addBox(-0.9F, -2.9F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.9F, 3.8529F, -3.1637F, 1.6675F, 0.1216F, 0.0118F));

		PartDefinition cube_r138 = head.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(89, 29).mirror().addBox(-0.5F, -3.1F, -2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(89, 14).mirror().addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(89, 29).addBox(1.5F, -3.1F, -2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(89, 14).addBox(1.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 1.8104F, 2.6575F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r139 = head.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(89, 19).mirror().addBox(-1.0F, -2.9974F, 0.7615F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(89, 19).addBox(1.0F, -2.9974F, 0.7615F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 3.6F, 2.9F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r140 = head.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(91, 0).mirror().addBox(-1.0F, -0.985F, -0.4468F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(91, 0).addBox(1.0F, -0.985F, -0.4468F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.3F, 2.5F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r141 = head.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(89, 9).mirror().addBox(-1.0F, 0.0491F, -1.0252F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(80, 9).addBox(-1.0F, 0.0491F, -2.0252F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(89, 9).addBox(1.0F, 0.0491F, -1.0252F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6579F, 0.9926F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r142 = head.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(94, 8).mirror().addBox(-1.92F, -2.0027F, -0.0268F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(94, 8).addBox(0.12F, -2.0027F, -0.0268F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.658F, -0.0475F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r143 = head.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(94, 12).mirror().addBox(-0.5F, -0.9F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(94, 12).addBox(1.54F, -0.9F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.02F, 0.5699F, 0.0655F, -2.5744F, 0.0F, 0.0F));

		PartDefinition cube_r144 = head.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(89, 24).mirror().addBox(-0.5F, -1.9F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(89, 24).addBox(1.54F, -1.9F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.02F, 1.5598F, -0.0729F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r145 = head.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(96, 83).mirror().addBox(-0.5F, -1.05F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(96, 83).addBox(1.54F, -1.05F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.02F, 1.0393F, -2.4934F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r146 = head.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(21, 97).mirror().addBox(-0.335F, -1.0117F, -0.2995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(21, 97).addBox(1.705F, -1.0117F, -0.2995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.185F, 1.123F, -1.7519F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r147 = head.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(95, 95).mirror().addBox(-0.5F, -0.35F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(95, 95).addBox(1.54F, -0.35F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.02F, 1.1102F, -1.8263F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r148 = head.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(95, 92).mirror().addBox(-0.455F, -0.9536F, -0.4928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(94, 22).mirror().addBox(-0.665F, -0.9536F, -0.4928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(94, 22).addBox(2.035F, -0.9536F, -0.4928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(95, 92).addBox(1.825F, -0.9536F, -0.4928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.185F, 1.123F, -1.7519F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r149 = head.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(96, 0).mirror().addBox(-0.5F, -0.7759F, -0.0952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.67F, 1.7529F, -3.7038F, -0.3075F, -0.2139F, -0.0476F));

		PartDefinition cube_r150 = head.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(75, 93).mirror().addBox(-0.5F, -0.5178F, -0.5869F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.67F, 1.7529F, -3.7038F, -1.1016F, -0.2139F, -0.0476F));

		PartDefinition cube_r151 = head.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(23, 94).mirror().addBox(-0.42F, -1.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(94, 53).mirror().addBox(-0.42F, -2.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(94, 53).addBox(-0.38F, -2.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(23, 94).addBox(-0.38F, -1.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 3.1107F, -8.0558F, -0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r152 = head.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(94, 25).mirror().addBox(0.0F, -3.8394F, -0.8824F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 3.676F, -2.9468F, 1.3788F, -0.2094F, 0.0F));

		PartDefinition cube_r153 = head.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(89, 40).mirror().addBox(0.0F, -3.0054F, 0.0122F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 3.676F, -2.9468F, 1.6755F, -0.2094F, 0.0F));

		PartDefinition cube_r154 = head.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(83, 88).mirror().addBox(0.0F, -0.4441F, -3.9472F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.2F, -2.975F, 0.4712F, -0.2269F, -0.0349F));

		PartDefinition cube_r155 = head.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(88, 88).mirror().addBox(0.0F, -0.2356F, -2.9704F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.2F, -2.975F, 0.4014F, -0.2269F, -0.0349F));

		PartDefinition cube_r156 = head.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(7, 89).mirror().addBox(0.0F, -0.0021F, -1.0118F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.2F, -2.975F, 0.2618F, -0.2269F, -0.0349F));

		PartDefinition cube_r157 = head.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(89, 4).mirror().addBox(0.0F, -0.0608F, -1.9827F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.2F, -2.975F, 0.3142F, -0.2269F, -0.0349F));

		PartDefinition cube_r158 = head.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(89, 40).addBox(-1.0F, -3.0054F, 0.0122F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 3.676F, -2.9468F, 1.6755F, 0.2094F, 0.0F));

		PartDefinition cube_r159 = head.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(94, 25).addBox(-1.0F, -3.8394F, -0.8824F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.3F, 3.676F, -2.9468F, 1.3788F, 0.2094F, 0.0F));

		PartDefinition cube_r160 = head.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(85, 93).addBox(-1.0F, -0.9F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.6185F, -7.1767F, 1.8413F, 0.0F, 0.0F));

		PartDefinition cube_r161 = head.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(32, 57).addBox(-1.0F, -0.0703F, -0.9389F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, 1.7593F, -7.4959F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r162 = head.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(40, 93).addBox(-1.0F, -0.0425F, -1.0073F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 1.1968F, -6.6517F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r163 = head.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(83, 88).addBox(-1.0F, -0.4441F, -3.9472F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.4F, -0.2F, -2.975F, 0.4712F, 0.2269F, 0.0349F));

		PartDefinition cube_r164 = head.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(88, 88).addBox(-1.0F, -0.2356F, -2.9704F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.4F, -0.2F, -2.975F, 0.4014F, 0.2269F, 0.0349F));

		PartDefinition cube_r165 = head.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(89, 4).addBox(-1.0F, -0.0608F, -1.9827F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.4F, -0.2F, -2.975F, 0.3142F, 0.2269F, 0.0349F));

		PartDefinition cube_r166 = head.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(7, 89).addBox(-1.0F, -0.0021F, -1.0118F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.4F, -0.2F, -2.975F, 0.2618F, 0.2269F, 0.0349F));

		PartDefinition cube_r167 = head.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(78, 88).addBox(0.0F, -0.0075F, -0.9743F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.7607F, -5.8221F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r168 = head.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(73, 88).addBox(-0.5F, -0.0075F, -0.9743F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.3699F, -4.9016F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r169 = head.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(88, 66).addBox(-0.5F, -0.0075F, -0.8993F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0841F, -4.0219F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r170 = head.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(75, 93).addBox(-0.5F, -0.5178F, -0.5869F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.67F, 1.7529F, -3.7038F, -1.1016F, 0.2139F, 0.0476F));

		PartDefinition cube_r171 = head.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(96, 0).addBox(-0.5F, -0.7759F, -0.0952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.67F, 1.7529F, -3.7038F, -0.3075F, 0.2139F, 0.0476F));

		PartDefinition cube_r172 = head.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(69, 11).addBox(-2.0F, -2.0F, -0.9F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(94, 19).addBox(-1.0F, -2.0F, -1.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 1.5F, -1.6F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r173 = head.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(71, 0).addBox(-2.0F, -0.9592F, 0.3785F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 3.8F, -0.6F, 1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r174 = head.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(69, 22).addBox(-2.0F, -0.4974F, 0.2615F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.6F, -0.1F, 1.7453F, 0.0F, 0.0F));

		PartDefinition crestl = head.addOrReplaceChild("crestl", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7703F, 0.4966F, -4.6288F, 0.5477F, 0.581F, 0.0424F));

		PartDefinition cube_r175 = crestl.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(58, 62).addBox(-1.9357F, -0.4533F, -3.93F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0241F, 0.4748F, 1.9716F, -0.0175F, -0.2182F, 0.0F));

		PartDefinition crestl2 = crestl.addOrReplaceChild("crestl2", CubeListBuilder.create().texOffs(82, 0).addBox(-4.9605F, -0.1531F, 0.624F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.0185F, -0.0787F, 2.6969F, -0.211F, -0.5263F, -0.0234F));

		PartDefinition cube_r176 = crestl2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(7, 85).addBox(-1.153F, -0.0017F, -0.3172F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.9577F, -0.176F, 2.6187F, -0.0356F, -0.5238F, -0.013F));

		PartDefinition crestl3 = head.addOrReplaceChild("crestl3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7703F, 0.4966F, -4.6288F, 0.5477F, -0.581F, -0.0424F));

		PartDefinition cube_r177 = crestl3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(58, 62).mirror().addBox(-0.0643F, -0.4533F, -3.93F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0241F, 0.4748F, 1.9716F, -0.0175F, 0.2182F, 0.0F));

		PartDefinition crestl4 = crestl3.addOrReplaceChild("crestl4", CubeListBuilder.create().texOffs(82, 0).mirror().addBox(2.9605F, -0.1531F, 0.624F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.0185F, -0.0787F, 2.6969F, -0.211F, 0.5263F, 0.0234F));

		PartDefinition cube_r178 = crestl4.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(7, 85).mirror().addBox(0.153F, -0.0017F, -0.3172F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.9577F, -0.176F, 2.6187F, -0.0356F, 0.5238F, 0.013F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9F, 2.6272F, 2.9075F, 1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r179 = jaw.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(76, 74).mirror().addBox(-0.8476F, -2.3337F, -1.7854F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(67, 74).mirror().addBox(-0.8476F, -1.8337F, -2.1854F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.225F, -0.1F, -6.8F, -0.3332F, -0.1745F, 0.0875F));

		PartDefinition cube_r180 = jaw.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(94, 36).mirror().addBox(0.0F, 0.5347F, -1.8306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(33, 94).mirror().addBox(0.0F, 0.5347F, -2.3556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -2.3112F, -7.7669F, -0.7608F, -0.1066F, 0.1177F));

		PartDefinition cube_r181 = jaw.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(94, 31).mirror().addBox(-0.6F, 0.0459F, -2.6481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -2.05F, -7.85F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r182 = jaw.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(58, 95).mirror().addBox(-0.5F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8637F, -3.6056F, -9.4076F, -0.4815F, -0.1014F, 0.1222F));

		PartDefinition cube_r183 = jaw.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(94, 56).mirror().addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0403F, -2.7595F, -8.6984F, -0.6996F, -0.1014F, 0.1222F));

		PartDefinition cube_r184 = jaw.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(85, 73).mirror().addBox(0.0F, -0.0045F, -2.0198F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -2.3112F, -7.7669F, -0.4815F, -0.1066F, 0.1177F));

		PartDefinition cube_r185 = jaw.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(94, 28).mirror().addBox(0.0F, 0.1211F, -1.3266F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -2.3112F, -7.7669F, -0.3943F, -0.1066F, 0.1177F));

		PartDefinition cube_r186 = jaw.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(26, 88).mirror().addBox(0.0F, -0.2861F, -3.1894F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(33, 88).mirror().addBox(0.0F, -0.2988F, -1.9728F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3F, -0.1F, -3.6F, -0.3665F, -0.0873F, 0.0F));

		PartDefinition cube_r187 = jaw.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(19, 88).mirror().addBox(-0.8476F, -1.4423F, -1.9951F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.225F, -0.1F, -6.8F, -0.4379F, -0.1745F, 0.0875F));

		PartDefinition cube_r188 = jaw.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(24, 83).mirror().addBox(-1.0F, -1.75F, -1.95F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(24, 83).addBox(0.8F, -1.75F, -1.95F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.3F, 1.0F, -2.3F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r189 = jaw.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(17, 78).mirror().addBox(0.0F, -1.3427F, -2.9162F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.3F, -0.1F, -3.6F, -0.1396F, -0.0873F, 0.0F));

		PartDefinition cube_r190 = jaw.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(16, 97).mirror().addBox(-0.5F, -1.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(16, 97).addBox(1.34F, -1.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.82F, 0.0904F, -4.3239F, -1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r191 = jaw.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(94, 16).mirror().addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(94, 16).addBox(1.3F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, 0.4772F, -0.8935F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r192 = jaw.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(58, 74).mirror().addBox(-1.0F, 0.0F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(58, 74).addBox(0.8F, 0.0F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.3F, 0.0F, -0.3F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r193 = jaw.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(76, 74).addBox(-0.1524F, -2.3337F, -1.7854F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F))
				.texOffs(67, 74).addBox(-0.1524F, -1.8337F, -2.1854F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.575F, -0.1F, -6.8F, -0.3332F, 0.1745F, -0.0875F));

		PartDefinition cube_r194 = jaw.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(94, 36).addBox(-1.0F, 0.5347F, -1.8306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(33, 94).addBox(-1.0F, 0.5347F, -2.3556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -2.3112F, -7.7669F, -0.7608F, 0.1066F, -0.1177F));

		PartDefinition cube_r195 = jaw.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(58, 95).addBox(-0.5F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.9363F, -3.6056F, -9.4076F, -0.4815F, 0.1014F, -0.1222F));

		PartDefinition cube_r196 = jaw.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(94, 56).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7597F, -2.7595F, -8.6984F, -0.6996F, 0.1014F, -0.1222F));

		PartDefinition cube_r197 = jaw.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(85, 73).addBox(-1.0F, -0.0045F, -2.0198F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -2.3112F, -7.7669F, -0.4815F, 0.1066F, -0.1177F));

		PartDefinition cube_r198 = jaw.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(94, 28).addBox(-1.0F, 0.1211F, -1.3266F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1F, -2.3112F, -7.7669F, -0.3943F, 0.1066F, -0.1177F));

		PartDefinition cube_r199 = jaw.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(26, 88).addBox(-1.0F, -0.2861F, -3.1894F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(33, 88).addBox(-1.0F, -0.2988F, -1.9728F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -3.6F, -0.3665F, 0.0873F, 0.0F));

		PartDefinition cube_r200 = jaw.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(19, 88).addBox(-0.1524F, -1.4423F, -1.9951F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.575F, -0.1F, -6.8F, -0.4379F, 0.1745F, -0.0875F));

		PartDefinition cube_r201 = jaw.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(17, 78).addBox(-1.0F, -1.3427F, -2.9162F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -0.1F, -3.6F, -0.1396F, 0.0873F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.8F, 0.2F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.1743F, 3.7076F, -0.1625F, -0.2585F, 0.0419F));

		PartDefinition cube_r202 = tail.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(61, 98).addBox(0.0F, -1.8581F, 1.7912F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 98).addBox(0.0F, -1.4581F, 0.0912F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 8.2F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r203 = tail.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(51, 97).addBox(0.0F, -1.7054F, 0.0608F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 6.2F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r204 = tail.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(48, 97).addBox(0.0F, -1.7527F, 0.0304F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 4.2F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r205 = tail.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(13, 97).addBox(0.0F, 0.2918F, -1.0203F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8397F, 10.1541F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r206 = tail.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(5, 94).addBox(0.0F, 0.3F, 4.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4397F, 3.1541F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r207 = tail.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(60, 89).addBox(0.0F, -0.0309F, -0.0479F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2397F, 4.8541F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r208 = tail.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(45, 94).addBox(0.0F, -0.1197F, 0.0728F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3397F, 0.3541F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r209 = tail.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(55, 93).addBox(0.0F, -0.2824F, 0.0305F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4397F, 2.6541F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r210 = tail.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(41, 97).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 2.2F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r211 = tail.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(38, 97).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.2F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r212 = tail.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(52, 22).addBox(-1.0F, -0.1045F, -0.0148F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.5F, 6.2F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r213 = tail.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(52, 30).addBox(-1.0F, -0.0998F, -0.014F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.4F, 0.2F, 0.0175F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 14).addBox(-1.0F, -0.8F, 0.1F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 11.0F, -0.1772F, -0.1719F, 0.0306F));

		PartDefinition cube_r214 = tail2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(95, 98).addBox(0.0F, -3.0F, 8.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 88).addBox(0.0F, -2.6F, 6.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 97).addBox(0.0F, -2.2F, 4.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 79).addBox(0.0F, -1.8F, 2.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 97).addBox(0.0F, -1.3F, 0.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.2F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r215 = tail2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(74, 97).addBox(0.0F, 5.5F, 16.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4397F, -7.8459F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r216 = tail2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(71, 97).addBox(0.0F, -0.2611F, -0.144F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1397F, 7.1541F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r217 = tail2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(68, 97).addBox(0.0F, 0.3438F, -0.0112F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0397F, 4.7541F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r218 = tail2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(31, 83).addBox(0.0F, -0.8251F, -0.1624F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3397F, 2.8541F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r219 = tail2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(23, 28).addBox(0.0F, -0.914F, -0.253F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1397F, 0.6541F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r220 = tail2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(27, 0).addBox(-1.0F, -0.0753F, -0.0135F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.7F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(80, 42).addBox(-0.5F, -1.3776F, 4.4343F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(52, 13).addBox(-0.5F, -0.6985F, -0.0349F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 11.0F, 0.1038F, 0.1572F, 0.0122F));

		PartDefinition cube_r221 = tail3.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(99, 33).addBox(0.0F, -0.575F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6244F, 6.4808F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r222 = tail3.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(99, 30).addBox(0.0F, -1.4518F, -0.1486F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1015F, 3.9651F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r223 = tail3.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(64, 98).addBox(0.0F, -0.5666F, -0.6428F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1015F, 4.9651F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r224 = tail3.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(86, 97).addBox(0.0F, 6.7F, 20.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 97).addBox(0.0F, 6.1F, 18.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5413F, -18.8808F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r225 = tail3.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(99, 3).addBox(0.0F, -1.5F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 98).addBox(0.0F, -1.2F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3985F, -0.0349F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r226 = tail3.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(69, 27).addBox(-0.5F, 0.1105F, -0.0999F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8985F, 0.5651F, -0.1047F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4026F, 6.9304F, 0.1828F, 0.3006F, 0.0547F));

		PartDefinition cube_r227 = tail4.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(99, 18).addBox(0.0F, -0.6462F, 2.8574F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 15).addBox(0.0F, -0.6462F, 0.8574F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 12).addBox(0.0F, -0.6462F, -1.1426F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 6.1F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r228 = tail4.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(99, 9).addBox(0.0F, -0.7481F, -0.1088F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 3.1F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r229 = tail4.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(99, 6).addBox(0.0F, -0.7994F, -0.1863F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 1.1F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r230 = tail4.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(99, 24).addBox(0.0F, 12.7F, 34.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 21).addBox(0.0F, 12.1F, 32.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 27).addBox(0.0F, 11.4F, 30.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 82).addBox(0.0F, 10.7F, 28.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9397F, -29.8459F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r231 = tail4.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(23, 38).addBox(-0.5F, 0.05F, 0.5F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 48).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0209F, 9.8515F, -0.085F, 0.3914F, -0.0325F));

		PartDefinition cube_r232 = tail5.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(19, 48).addBox(-0.5F, -0.075F, -0.3F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.0349F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 103, 103);
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