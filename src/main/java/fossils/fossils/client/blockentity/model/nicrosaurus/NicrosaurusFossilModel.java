package fossils.fossils.client.blockentity.model.nicrosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class NicrosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart hip;
	private final ModelPart backLeftLeg;
	private final ModelPart backLeftLeg2;
	private final ModelPart backLeftLeg3;
	private final ModelPart backRightLeg;
	private final ModelPart backRightLeg2;
	private final ModelPart backRightLeg3;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart frontLeftLeg;
	private final ModelPart frontLeftLeg2;
	private final ModelPart frontLeftLeg3;
	private final ModelPart frontRightLeg;
	private final ModelPart frontRightLeg2;
	private final ModelPart frontRightLeg3;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftFace;
	private final ModelPart rightFace;

	public NicrosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.hip = this.main.getChild("hip");
		this.backLeftLeg = this.hip.getChild("backLeftLeg");
		this.backLeftLeg2 = this.backLeftLeg.getChild("backLeftLeg2");
		this.backLeftLeg3 = this.backLeftLeg2.getChild("backLeftLeg3");
		this.backRightLeg = this.hip.getChild("backRightLeg");
		this.backRightLeg2 = this.backRightLeg.getChild("backRightLeg2");
		this.backRightLeg3 = this.backRightLeg2.getChild("backRightLeg3");
		this.tail = this.hip.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.body = this.hip.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.frontLeftLeg = this.body2.getChild("frontLeftLeg");
		this.frontLeftLeg2 = this.frontLeftLeg.getChild("frontLeftLeg2");
		this.frontLeftLeg3 = this.frontLeftLeg2.getChild("frontLeftLeg3");
		this.frontRightLeg = this.body2.getChild("frontRightLeg");
		this.frontRightLeg2 = this.frontRightLeg.getChild("frontRightLeg2");
		this.frontRightLeg3 = this.frontRightLeg2.getChild("frontRightLeg3");
		this.neck = this.body2.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(0.5F, -2.0F, 0.0F));

		PartDefinition hip = main.addOrReplaceChild("hip", CubeListBuilder.create().texOffs(55, 12).addBox(0.5F, 0.4753F, -0.5664F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(55, 12).mirror().addBox(-1.5F, 0.4753F, -0.5664F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.5F, -9.6F, 9.75F));

		PartDefinition cube_r1 = hip.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(62, 22).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -1.95F, -1.95F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hip.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(71, 77).addBox(0.0F, -2.55F, 2.7F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 80).addBox(0.0F, -1.95F, 0.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 42).addBox(-0.5F, -0.15F, -0.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -1.95F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hip.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(62, 12).mirror().addBox(-0.5F, 1.9329F, 0.8208F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 1.0784F, 0.4586F, -0.0698F, 0.0F, -0.2793F));

		PartDefinition cube_r4 = hip.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(59, 55).mirror().addBox(-0.5F, 1.1848F, 0.0136F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 1.0784F, 0.4586F, -0.3491F, 0.0F, -0.2793F));

		PartDefinition cube_r5 = hip.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(14, 72).mirror().addBox(-0.5F, -0.4292F, 0.9683F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 1.0784F, 0.4586F, -1.1694F, 0.0F, -0.2793F));

		PartDefinition cube_r6 = hip.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-0.5F, 2.5899F, -1.0955F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(38, 72).mirror().addBox(-0.5F, 1.5899F, -1.0955F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 1.0784F, 0.4586F, -0.4189F, 0.0F, -0.2793F));

		PartDefinition cube_r7 = hip.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(7, 70).mirror().addBox(-0.5F, 0.8892F, -0.3355F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 1.0784F, 0.4586F, -0.8552F, 0.0F, -0.2793F));

		PartDefinition cube_r8 = hip.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(63, 65).mirror().addBox(-0.5F, -0.3737F, -1.0501F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 1.0784F, 0.4586F, -0.2094F, 0.0F, -0.2793F));

		PartDefinition cube_r9 = hip.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(49, 34).mirror().addBox(-0.5F, -0.5F, -2.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.6275F, 1.427F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r10 = hip.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 76).addBox(-0.5F, 2.5899F, -1.0955F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 72).addBox(-0.5F, 1.5899F, -1.0955F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.3F, 1.0784F, 0.4586F, -0.4189F, 0.0F, 0.2793F));

		PartDefinition cube_r11 = hip.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(62, 12).addBox(-0.5F, 1.9329F, 0.8208F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.3F, 1.0784F, 0.4586F, -0.0698F, 0.0F, 0.2793F));

		PartDefinition cube_r12 = hip.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(59, 55).addBox(-0.5F, 1.1848F, 0.0136F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.3F, 1.0784F, 0.4586F, -0.3491F, 0.0F, 0.2793F));

		PartDefinition cube_r13 = hip.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(14, 72).addBox(-0.5F, -0.4292F, 0.9683F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 1.0784F, 0.4586F, -1.1694F, 0.0F, 0.2793F));

		PartDefinition cube_r14 = hip.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(7, 70).addBox(-0.5F, 0.8892F, -0.3355F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 1.0784F, 0.4586F, -0.8552F, 0.0F, 0.2793F));

		PartDefinition cube_r15 = hip.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(63, 65).addBox(-0.5F, -0.3737F, -1.0501F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.3F, 1.0784F, 0.4586F, -0.2094F, 0.0F, 0.2793F));

		PartDefinition cube_r16 = hip.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(49, 34).addBox(-0.5F, -0.5F, -2.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.6275F, 1.427F, 0.1222F, 0.0F, 0.0F));

		PartDefinition backLeftLeg = hip.addOrReplaceChild("backLeftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9367F, 2.0782F, 0.5217F, -0.0269F, -0.0206F, -0.3166F));

		PartDefinition cube_r17 = backLeftLeg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(73, 0).addBox(-0.5F, -1.2F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1053F, 0.9632F, 0.4683F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r18 = backLeftLeg.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(61, 74).addBox(-0.5F, -0.0784F, -0.1028F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1053F, 4.3632F, -0.4317F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r19 = backLeftLeg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(56, 72).addBox(-0.5F, -2.5F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1053F, 3.9632F, 0.4683F, -0.2094F, 0.0F, 0.0F));

		PartDefinition backLeftLeg2 = backLeftLeg.addOrReplaceChild("backLeftLeg2", CubeListBuilder.create().texOffs(66, 5).addBox(-0.4369F, 0.1641F, -0.1222F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 66).addBox(-0.4369F, 0.1641F, 0.8778F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1005F, 6.5533F, 0.0486F, 0.6833F, -0.1298F, 0.228F));

		PartDefinition backLeftLeg3 = backLeftLeg2.addOrReplaceChild("backLeftLeg3", CubeListBuilder.create().texOffs(0, 32).addBox(-1.6007F, -0.0164F, -5.0202F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1677F, 3.8238F, 1.1485F, -0.6175F, -0.0358F, 0.0619F));

		PartDefinition backRightLeg = hip.addOrReplaceChild("backRightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9367F, 2.0782F, 0.5217F, -0.5069F, 0.0206F, 0.3166F));

		PartDefinition cube_r20 = backRightLeg.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(73, 29).addBox(-0.5F, -1.2F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1053F, 0.9632F, 0.4683F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r21 = backRightLeg.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(75, 72).addBox(-0.5F, -0.0784F, -0.1028F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1053F, 4.3632F, -0.4317F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r22 = backRightLeg.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(70, 72).addBox(-0.5F, -2.5F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.1053F, 3.9632F, 0.4683F, -0.2094F, 0.0F, 0.0F));

		PartDefinition backRightLeg2 = backRightLeg.addOrReplaceChild("backRightLeg2", CubeListBuilder.create().texOffs(21, 66).addBox(-0.5631F, 0.1641F, -0.1222F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 66).addBox(-0.5631F, 0.1641F, 0.8778F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1005F, 6.5533F, 0.0486F, 0.8142F, 0.1298F, -0.228F));

		PartDefinition backRightLeg3 = backRightLeg2.addOrReplaceChild("backRightLeg3", CubeListBuilder.create().texOffs(17, 34).addBox(-1.3993F, -0.0164F, -5.0202F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1677F, 3.8238F, 1.1485F, -0.3121F, 0.0358F, -0.0619F));

		PartDefinition tail = hip.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(36, 19).addBox(-0.5F, -0.5043F, 0.0653F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6872F, 2.5542F, -0.2436F, -0.2544F, 0.0625F));

		PartDefinition cube_r23 = tail.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(23, 78).addBox(0.0F, -2.8F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5043F, 1.0653F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r24 = tail.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(10, 74).addBox(0.0F, -3.2F, -1.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5043F, 5.0653F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r25 = tail.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(46, 78).addBox(0.0F, -0.8F, 1.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 78).addBox(0.0F, -2.0F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3286F, 2.8112F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r26 = tail.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(7, 74).addBox(0.0F, -3.2F, -1.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5043F, 3.0653F, 0.0873F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(43, 42).addBox(-0.5F, -0.3362F, -0.1887F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1831F, 6.1715F, -0.0587F, -0.4017F, -0.0981F));

		PartDefinition cube_r27 = tail2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(34, 78).addBox(0.0F, -2.7F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3362F, 4.8113F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r28 = tail2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(31, 78).addBox(0.0F, -2.9F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3362F, 2.8113F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r29 = tail2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(78, 52).addBox(0.0F, 1.5F, 5.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 78).addBox(0.0F, 0.5F, 3.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5118F, -3.3603F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r30 = tail2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(78, 30).addBox(0.0F, -3.0F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3362F, 0.8113F, 0.1047F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.3744F, -0.0928F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.053F, 4.7604F, -0.009F, -0.3072F, -0.0805F));

		PartDefinition cube_r31 = tail3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(3, 80).addBox(0.0F, -2.0F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3744F, 5.9072F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r32 = tail3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(40, 78).addBox(0.0F, -2.3F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3744F, 3.9072F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r33 = tail3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(37, 78).addBox(0.0F, -2.5F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3744F, 1.9072F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r34 = tail3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(66, 80).addBox(0.0F, 5.5F, 11.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 78).addBox(0.0F, 4.5F, 9.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 8).addBox(0.0F, 2.8F, 7.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4587F, -8.1207F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(34, 34).addBox(-0.5F, -0.5001F, -0.0087F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(6, 80).addBox(0.0F, -2.4001F, -0.0087F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 80).addBox(0.0F, -2.2001F, 1.9913F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 80).addBox(0.0F, -2.0001F, 3.9913F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1328F, 6.8879F, 0.0213F, -0.6108F, -0.0122F));

		PartDefinition cube_r35 = tail4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(62, 38).addBox(0.0F, 9.4F, 17.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 3).addBox(0.0F, 8.3F, 15.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 51).addBox(0.0F, 6.6F, 13.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3258F, -15.0173F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, -0.4091F, -0.1042F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(55, 80).addBox(0.0F, -1.9091F, -0.1042F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 66).addBox(0.0F, -1.4091F, 1.8958F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 82).addBox(0.0F, -1.0091F, 3.8958F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 69).addBox(0.0F, -0.8091F, 5.8958F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0982F, 6.0127F, 0.2261F, 0.3837F, 0.0859F));

		PartDefinition cube_r36 = tail5.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(83, 9).addBox(0.0F, 11.4F, 21.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 6).addBox(0.0F, 10.4F, 19.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.424F, -21.03F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.2F, 0.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(80, 82).addBox(-0.5F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 0).addBox(-0.5F, -0.4F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2039F, 7.7959F, 0.0567F, 0.3921F, 0.0217F));

		PartDefinition body = hip.addOrReplaceChild("body", CubeListBuilder.create().texOffs(17, 28).addBox(-2.5F, 4.8F, -8.9F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -1.85F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 39).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, -0.4F, -10.9F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(25, 0).addBox(-2.0F, 0.0031F, 0.0408F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, -2.0F, -6.1F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(19, 13).addBox(-2.5F, -1.0F, 0.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 5.8F, -4.9F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(61, 82).addBox(0.5F, -2.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 60).addBox(0.5F, -2.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 6).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.0F, -10.9F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(77, 79).addBox(0.5F, -1.475F, 6.0258F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 79).addBox(0.5F, -1.375F, 4.0258F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 79).addBox(0.5F, -1.175F, 2.0258F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 63).addBox(0.5F, -1.075F, 0.0258F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 19).addBox(0.0F, -0.075F, 0.0258F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2F, -7.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition body7_r1 = body.addOrReplaceChild("body7_r1", CubeListBuilder.create().texOffs(81, 30).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.388F, -10.4933F, 0.3818F, 0.0315F, -0.2711F));

		PartDefinition body8_r1 = body.addOrReplaceChild("body8_r1", CubeListBuilder.create().texOffs(17, 81).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.388F, -10.4933F, 0.3393F, 0.1812F, -0.665F));

		PartDefinition body9_r1 = body.addOrReplaceChild("body9_r1", CubeListBuilder.create().texOffs(62, 34).mirror().addBox(-5.4538F, -1.309F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.388F, -10.4933F, 0.2056F, 0.3255F, -1.1858F));

		PartDefinition body6_r1 = body.addOrReplaceChild("body6_r1", CubeListBuilder.create().texOffs(12, 81).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.188F, -8.4933F, 0.3643F, 0.0307F, -0.2193F));

		PartDefinition body7_r2 = body.addOrReplaceChild("body7_r2", CubeListBuilder.create().texOffs(80, 80).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.188F, -8.4933F, 0.3232F, 0.1738F, -0.6154F));

		PartDefinition body8_r2 = body.addOrReplaceChild("body8_r2", CubeListBuilder.create().texOffs(62, 32).mirror().addBox(-5.4538F, -1.309F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.188F, -8.4933F, 0.195F, 0.3112F, -1.1367F));

		PartDefinition body8_r3 = body.addOrReplaceChild("body8_r3", CubeListBuilder.create().texOffs(82, 46).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.012F, -0.4933F, -0.0193F, 0.0117F, -0.2799F));

		PartDefinition body9_r2 = body.addOrReplaceChild("body9_r2", CubeListBuilder.create().texOffs(81, 55).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.012F, -0.4933F, -0.0224F, 0.0028F, -0.6987F));

		PartDefinition body10_r1 = body.addOrReplaceChild("body10_r1", CubeListBuilder.create().texOffs(36, 76).mirror().addBox(-3.4538F, -1.309F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.012F, -0.4933F, -0.0208F, -0.0087F, -1.2222F));

		PartDefinition body9_r3 = body.addOrReplaceChild("body9_r3", CubeListBuilder.create().texOffs(70, 50).mirror().addBox(-4.4538F, -1.309F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.012F, -2.4933F, 0.0555F, 0.1083F, -1.1485F));

		PartDefinition body8_r4 = body.addOrReplaceChild("body8_r4", CubeListBuilder.create().texOffs(80, 78).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.012F, -2.4933F, 0.1022F, 0.0661F, -0.6246F));

		PartDefinition body7_r3 = body.addOrReplaceChild("body7_r3", CubeListBuilder.create().texOffs(80, 76).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.012F, -2.4933F, 0.1202F, 0.019F, -0.2079F));

		PartDefinition body8_r5 = body.addOrReplaceChild("body8_r5", CubeListBuilder.create().texOffs(62, 30).mirror().addBox(-5.4538F, -1.309F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.088F, -4.4933F, 0.0942F, 0.1666F, -1.1083F));

		PartDefinition body7_r4 = body.addOrReplaceChild("body7_r4", CubeListBuilder.create().texOffs(80, 74).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.088F, -4.4933F, 0.1648F, 0.0974F, -0.5845F));

		PartDefinition body6_r2 = body.addOrReplaceChild("body6_r2", CubeListBuilder.create().texOffs(80, 72).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.088F, -4.4933F, 0.1899F, 0.0225F, -0.1716F));

		PartDefinition body7_r5 = body.addOrReplaceChild("body7_r5", CubeListBuilder.create().texOffs(61, 52).mirror().addBox(-5.4538F, -1.309F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.012F, -6.4933F, 0.1437F, 0.2392F, -1.1332F));

		PartDefinition body6_r3 = body.addOrReplaceChild("body6_r3", CubeListBuilder.create().texOffs(79, 49).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.012F, -6.4933F, 0.2436F, 0.136F, -0.6103F));

		PartDefinition body5_r1 = body.addOrReplaceChild("body5_r1", CubeListBuilder.create().texOffs(79, 44).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.012F, -6.4933F, 0.2771F, 0.0267F, -0.2043F));

		PartDefinition body9_r4 = body.addOrReplaceChild("body9_r4", CubeListBuilder.create().texOffs(36, 76).addBox(1.4538F, -1.309F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.012F, -0.4933F, -0.0208F, 0.0087F, 1.2222F));

		PartDefinition body8_r6 = body.addOrReplaceChild("body8_r6", CubeListBuilder.create().texOffs(81, 55).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.012F, -0.4933F, -0.0224F, -0.0028F, 0.6987F));

		PartDefinition body7_r6 = body.addOrReplaceChild("body7_r6", CubeListBuilder.create().texOffs(82, 46).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.012F, -0.4933F, -0.0193F, -0.0117F, 0.2799F));

		PartDefinition body6_r4 = body.addOrReplaceChild("body6_r4", CubeListBuilder.create().texOffs(80, 76).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.012F, -2.4933F, 0.1202F, -0.019F, 0.2079F));

		PartDefinition body7_r7 = body.addOrReplaceChild("body7_r7", CubeListBuilder.create().texOffs(80, 78).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.012F, -2.4933F, 0.1022F, -0.0661F, 0.6246F));

		PartDefinition body8_r7 = body.addOrReplaceChild("body8_r7", CubeListBuilder.create().texOffs(70, 50).addBox(1.4538F, -1.309F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.012F, -2.4933F, 0.0555F, -0.1083F, 1.1485F));

		PartDefinition body5_r2 = body.addOrReplaceChild("body5_r2", CubeListBuilder.create().texOffs(80, 72).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.088F, -4.4933F, 0.1899F, -0.0225F, 0.1716F));

		PartDefinition body6_r5 = body.addOrReplaceChild("body6_r5", CubeListBuilder.create().texOffs(80, 74).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.088F, -4.4933F, 0.1648F, -0.0974F, 0.5845F));

		PartDefinition body7_r8 = body.addOrReplaceChild("body7_r8", CubeListBuilder.create().texOffs(62, 30).addBox(1.4538F, -1.309F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.088F, -4.4933F, 0.0942F, -0.1666F, 1.1083F));

		PartDefinition body8_r8 = body.addOrReplaceChild("body8_r8", CubeListBuilder.create().texOffs(62, 34).addBox(1.4538F, -1.309F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.388F, -10.4933F, 0.2056F, -0.3255F, 1.1858F));

		PartDefinition body7_r9 = body.addOrReplaceChild("body7_r9", CubeListBuilder.create().texOffs(17, 81).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.388F, -10.4933F, 0.3393F, -0.1812F, 0.665F));

		PartDefinition body6_r6 = body.addOrReplaceChild("body6_r6", CubeListBuilder.create().texOffs(81, 30).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.388F, -10.4933F, 0.3818F, -0.0315F, 0.2711F));

		PartDefinition body7_r10 = body.addOrReplaceChild("body7_r10", CubeListBuilder.create().texOffs(62, 32).addBox(1.4538F, -1.309F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.188F, -8.4933F, 0.195F, -0.3112F, 1.1367F));

		PartDefinition body6_r7 = body.addOrReplaceChild("body6_r7", CubeListBuilder.create().texOffs(80, 80).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.188F, -8.4933F, 0.3232F, -0.1738F, 0.6154F));

		PartDefinition body5_r3 = body.addOrReplaceChild("body5_r3", CubeListBuilder.create().texOffs(12, 81).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.188F, -8.4933F, 0.3643F, -0.0307F, 0.2193F));

		PartDefinition body4_r1 = body.addOrReplaceChild("body4_r1", CubeListBuilder.create().texOffs(79, 44).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.012F, -6.4933F, 0.2771F, -0.0267F, 0.2043F));

		PartDefinition body5_r4 = body.addOrReplaceChild("body5_r4", CubeListBuilder.create().texOffs(79, 49).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.012F, -6.4933F, 0.2436F, -0.136F, 0.6103F));

		PartDefinition body6_r8 = body.addOrReplaceChild("body6_r8", CubeListBuilder.create().texOffs(61, 52).addBox(1.4538F, -1.309F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.012F, -6.4933F, 0.1437F, -0.2392F, 1.1332F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -10.9F, -0.044F, 0.1308F, -0.0057F));

		PartDefinition cube_r42 = body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(27, 62).addBox(0.0F, -1.7F, 2.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 82).addBox(0.0F, -1.7F, 0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 27).addBox(-0.5F, -1.0F, 0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1079F, -4.0707F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r43 = body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(62, 36).mirror().addBox(-4.6525F, -0.3049F, -0.3755F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.7137F, 1.0648F, 1.8323F, 0.6474F, 0.3412F));

		PartDefinition cube_r44 = body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(68, 62).mirror().addBox(-3.4525F, -0.6049F, -0.3755F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.7137F, 1.0648F, 1.8114F, 0.3007F, 0.2816F));

		PartDefinition cube_r45 = body2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(81, 32).mirror().addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.7137F, -1.9352F, 1.4498F, 0.2222F, 0.2369F));

		PartDefinition cube_r46 = body2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(13, 76).mirror().addBox(-2.7593F, -0.4366F, -0.2354F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.7137F, 0.0648F, 1.4271F, 0.2083F, 0.1306F));

		PartDefinition cube_r47 = body2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(66, 0).mirror().addBox(-0.5F, -0.0339F, -2.0009F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(40, 15).addBox(0.5F, -0.7339F, -2.7009F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 0).addBox(4.5F, -0.0339F, -2.0009F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 1.9254F, -4.1513F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r48 = body2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(78, 35).mirror().addBox(-0.5F, -0.0736F, -0.922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 35).addBox(4.5F, -0.0736F, -0.922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 1.7254F, -3.2513F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r49 = body2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(61, 47).mirror().addBox(-0.5F, -0.9622F, -2.9792F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(61, 47).addBox(4.5F, -0.9622F, -2.9792F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 0.8254F, -0.7513F, 0.733F, 0.0F, 0.0F));

		PartDefinition body9_r5 = body2.addOrReplaceChild("body9_r5", CubeListBuilder.create().texOffs(79, 42).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4459F, -3.3641F, 0.5504F, 0.0775F, -0.4713F));

		PartDefinition body10_r2 = body2.addOrReplaceChild("body10_r2", CubeListBuilder.create().texOffs(79, 40).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4459F, -3.3641F, 0.4822F, 0.2868F, -0.8412F));

		PartDefinition body11_r1 = body2.addOrReplaceChild("body11_r1", CubeListBuilder.create().texOffs(68, 60).mirror().addBox(-4.4538F, -1.309F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4459F, -3.3641F, 0.2794F, 0.4863F, -1.366F));

		PartDefinition body8_r9 = body2.addOrReplaceChild("body8_r9", CubeListBuilder.create().texOffs(79, 38).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2459F, -1.3641F, 0.466F, 0.0547F, -0.3548F));

		PartDefinition body9_r6 = body2.addOrReplaceChild("body9_r6", CubeListBuilder.create().texOffs(56, 47).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2459F, -1.3641F, 0.4099F, 0.2346F, -0.7376F));

		PartDefinition body10_r3 = body2.addOrReplaceChild("body10_r3", CubeListBuilder.create().texOffs(42, 6).mirror().addBox(-5.4538F, -1.309F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2459F, -1.3641F, 0.2412F, 0.4061F, -1.2603F));

		PartDefinition cube_r50 = body2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(81, 32).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.7137F, -1.9352F, 1.4498F, -0.2222F, -0.2369F));

		PartDefinition cube_r51 = body2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(62, 36).addBox(-0.3475F, -0.3049F, -0.3755F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.7137F, 1.0648F, 1.8323F, -0.6474F, -0.3412F));

		PartDefinition cube_r52 = body2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(68, 62).addBox(-0.5475F, -0.6049F, -0.3755F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.7137F, 1.0648F, 1.8114F, -0.3007F, -0.2816F));

		PartDefinition cube_r53 = body2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(13, 76).addBox(-0.2407F, -0.4366F, -0.2354F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.7137F, 0.0648F, 1.4271F, -0.2083F, -0.1306F));

		PartDefinition cube_r54 = body2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(51, 70).addBox(-0.5F, 1.9838F, -0.0826F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 64).addBox(-1.5F, -0.0162F, -0.0826F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.8254F, -4.4513F, 1.4486F, 0.0F, 0.0F));

		PartDefinition body10_r4 = body2.addOrReplaceChild("body10_r4", CubeListBuilder.create().texOffs(68, 60).addBox(1.4538F, -1.309F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4459F, -3.3641F, 0.2794F, -0.4863F, 1.366F));

		PartDefinition body9_r7 = body2.addOrReplaceChild("body9_r7", CubeListBuilder.create().texOffs(79, 40).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4459F, -3.3641F, 0.4822F, -0.2868F, 0.8412F));

		PartDefinition body8_r10 = body2.addOrReplaceChild("body8_r10", CubeListBuilder.create().texOffs(79, 42).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4459F, -3.3641F, 0.5504F, -0.0775F, 0.4713F));

		PartDefinition body9_r8 = body2.addOrReplaceChild("body9_r8", CubeListBuilder.create().texOffs(42, 6).addBox(1.4538F, -1.309F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2459F, -1.3641F, 0.2412F, -0.4061F, 1.2603F));

		PartDefinition body8_r11 = body2.addOrReplaceChild("body8_r11", CubeListBuilder.create().texOffs(56, 47).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2459F, -1.3641F, 0.4099F, -0.2346F, 0.7376F));

		PartDefinition body7_r11 = body2.addOrReplaceChild("body7_r11", CubeListBuilder.create().texOffs(79, 38).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2459F, -1.3641F, 0.466F, -0.0547F, 0.3548F));

		PartDefinition cube_r55 = body2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(36, 27).addBox(-0.5F, -0.9901F, -0.1463F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.5F, -0.2421F, -4.5707F, 0.1222F, 0.0F, 0.0F));

		PartDefinition frontLeftLeg = body2.addOrReplaceChild("frontLeftLeg", CubeListBuilder.create().texOffs(21, 72).addBox(-0.4061F, -0.2135F, -0.5464F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.071F, 3.6929F, -3.3897F, -0.0834F, 0.3043F, -0.3075F));

		PartDefinition frontLeftLeg2 = frontLeftLeg.addOrReplaceChild("frontLeftLeg2", CubeListBuilder.create().texOffs(68, 54).addBox(-0.5731F, 0.4514F, -0.8872F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(41, 65).addBox(-0.5731F, -0.2486F, -0.0872F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3258F, 3.7662F, 0.4296F, -0.6875F, 0.0317F, 0.3036F));

		PartDefinition frontLeftLeg3 = frontLeftLeg2.addOrReplaceChild("frontLeftLeg3", CubeListBuilder.create().texOffs(15, 41).addBox(-2.0F, 0.0F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4269F, 4.3014F, -0.4872F, 0.7055F, -0.0289F, -0.0272F));

		PartDefinition frontRightLeg = body2.addOrReplaceChild("frontRightLeg", CubeListBuilder.create().texOffs(45, 72).addBox(-0.5939F, -0.2135F, -0.5464F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.071F, 3.6929F, -3.3897F, 0.7893F, -0.3043F, 0.3075F));

		PartDefinition frontRightLeg2 = frontRightLeg.addOrReplaceChild("frontRightLeg2", CubeListBuilder.create().texOffs(26, 70).addBox(-0.4269F, 0.4514F, -0.8872F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(58, 65).addBox(-0.4269F, -0.2486F, -0.0872F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3258F, 3.7662F, 0.4296F, -0.6862F, -0.0648F, -0.3321F));

		PartDefinition frontRightLeg3 = frontRightLeg2.addOrReplaceChild("frontRightLeg3", CubeListBuilder.create().texOffs(42, 0).addBox(-1.0F, 0.0F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4269F, 4.3014F, -0.4872F, -0.1272F, 0.091F, -0.0343F));

		PartDefinition neck = body2.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(49, 61).addBox(-0.5F, -0.3552F, -2.8769F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F))
				.texOffs(15, 83).addBox(0.0F, -1.3552F, -1.8769F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4631F, -3.8938F, 0.073F, 0.3F, 0.105F));

		PartDefinition cube_r56 = neck.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(40, 8).addBox(-1.5F, 4.7598F, -1.2178F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(39, 55).addBox(-1.0F, 0.7598F, -0.0178F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1302F, -3.1769F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r57 = neck.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(26, 76).mirror().addBox(-0.1F, 0.0F, -0.55F, 0.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(83, 15).mirror().addBox(-0.1F, -1.0F, -0.35F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-0.622F, 1.132F, -1.5174F, 0.0212F, -0.2853F, 0.3998F));

		PartDefinition cube_r58 = neck.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(83, 15).addBox(0.1F, -1.0F, -0.35F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(26, 76).addBox(0.1F, 0.0F, -0.55F, 0.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.622F, 1.132F, -1.5174F, 0.0212F, 0.2853F, -0.3998F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.029F, -2.8305F, 0.088F, 0.1304F, 0.0115F));

		PartDefinition cube_r59 = neck2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(18, 62).addBox(-1.0F, -0.5F, -1.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.8405F, -1.2176F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r60 = neck2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(66, 74).addBox(0.0F, -1.034F, 0.018F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0842F, -2.7464F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r61 = neck2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(49, 79).addBox(0.0F, -1.5294F, -0.0919F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3842F, -0.7464F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r62 = neck2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(12, 83).mirror().addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(31, 74).mirror().addBox(0.0F, 0.5F, -0.8F, 0.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.167F, -2.6473F, -0.224F, 0.0986F, 0.4078F));

		PartDefinition cube_r63 = neck2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(74, 42).mirror().addBox(0.0F, 0.0F, -0.85F, 0.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(83, 12).mirror().addBox(0.0F, -1.0F, -0.65F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-0.7034F, 0.7964F, -0.6717F, -0.2229F, 0.0135F, 0.4271F));

		PartDefinition cube_r64 = neck2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(83, 12).addBox(0.0F, -1.0F, -0.65F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(74, 42).addBox(0.0F, 0.0F, -0.85F, 0.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.7034F, 0.7964F, -0.6717F, -0.2229F, -0.0135F, -0.4271F));

		PartDefinition cube_r65 = neck2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(31, 74).addBox(0.0F, 0.5F, -0.8F, 0.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(12, 83).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.5F, -0.167F, -2.6473F, -0.224F, -0.0986F, -0.4078F));

		PartDefinition cube_r66 = neck2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(0, 53).addBox(-0.5F, -0.2517F, -0.1087F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -1.0842F, -3.6464F, -0.2443F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create().texOffs(9, 65).addBox(0.0F, -1.0573F, -7.6929F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, -1.0F, -3.65F, -0.3491F, 0.3054F, 0.0436F));

		PartDefinition cube_r67 = head.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(62, 26).addBox(-0.5F, -0.0089F, -0.3016F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.5F, -1.2F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r68 = head.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(25, 8).addBox(-0.5F, 0.0298F, 0.0026F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.6F, -2.2F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r69 = head.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(0, 68).addBox(0.0F, 0.0298F, -0.9974F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, -1.6F, -2.2F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r70 = head.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(78, 21).addBox(-0.5F, -0.2205F, -0.1466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -0.3288F, -12.6337F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r71 = head.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(78, 18).addBox(-0.5F, -0.2353F, -0.1811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.0712F, -13.0337F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r72 = head.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(78, 6).addBox(-0.5F, -0.0852F, -1.4349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -0.5288F, -12.7337F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r73 = head.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(66, 77).addBox(-0.5F, -0.1764F, -0.8368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -0.7288F, -11.8337F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r74 = head.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(59, 60).addBox(-1.0F, -0.0838F, -0.0742F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, -0.5573F, -9.7929F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r75 = head.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(40, 60).addBox(-1.0F, -0.0838F, -2.8742F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, -0.5573F, -9.7929F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r76 = head.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(18, 78).addBox(-1.0F, -0.2025F, -0.8273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -0.8573F, -11.2929F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r77 = head.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(70, 68).addBox(-1.0F, -0.2133F, -1.8552F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -1.1573F, -9.6929F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r78 = head.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(22, 56).addBox(-1.0F, 0.0353F, -0.4479F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -1.3573F, -7.8929F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r79 = head.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(27, 65).addBox(-1.0F, 0.0187F, -0.148F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -1.3573F, -9.7929F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r80 = head.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(13, 78).mirror().addBox(-0.8F, -0.3142F, -2.1427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(78, 15).mirror().addBox(-0.8F, -0.3142F, -2.5427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.25F, -4.1F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r81 = head.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(78, 15).addBox(-0.2F, -0.3142F, -2.5427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(13, 78).addBox(-0.2F, -0.3142F, -2.1427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(70, 64).addBox(-1.0F, 0.0054F, -2.0427F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -1.25F, -4.1F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r82 = head.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(78, 12).addBox(-0.5F, -0.1616F, -0.8739F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.5F, 0.6F, -13.8F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r83 = head.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(71, 5).addBox(-0.5F, -0.8651F, -1.7003F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 1.1F, -12.1F, 0.1222F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 1.2F, 0.4F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r84 = jaw.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(75, 76).mirror().addBox(-3.0F, -1.0243F, -1.0564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(75, 76).addBox(0.0F, -1.0243F, -1.0564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, 1.7504F, -3.9231F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r85 = jaw.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(78, 57).mirror().addBox(-3.24F, -0.786F, -0.2242F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(1.0F, 1.4504F, -2.4231F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r86 = jaw.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-3.24F, -1.1807F, -1.7545F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 59).addBox(0.24F, -1.1807F, -1.7545F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 1.7504F, -3.5231F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r87 = jaw.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(50, 55).mirror().addBox(-3.0F, -1.9807F, -0.5545F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(50, 55).addBox(0.0F, -1.9807F, -0.5545F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.0F, 1.7504F, -3.4231F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r88 = jaw.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(31, 70).mirror().addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(31, 70).addBox(2.5F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.5F, 1.0592F, 0.0042F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r89 = jaw.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-3.0F, 0.0228F, 2.157F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(0, 72).addBox(0.0F, 0.0228F, 2.157F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, 1.7504F, -3.4231F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r90 = jaw.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(70, 46).mirror().addBox(-3.0F, 0.0303F, -1.9543F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.0F, -0.6496F, -3.4231F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r91 = jaw.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(50, 49).mirror().addBox(-3.0F, -1.0543F, -3.9735F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(50, 49).addBox(0.0F, -1.0543F, -3.9735F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, 1.0504F, 0.3769F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r92 = jaw.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(51, 21).mirror().addBox(-0.1F, -0.1298F, -3.8699F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 0.7504F, -4.9231F, -0.1047F, -0.3142F, 0.0F));

		PartDefinition cube_r93 = jaw.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(73, 56).mirror().addBox(-0.6F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1432F, 0.0623F, -13.9179F, 0.1628F, -0.0301F, -0.1389F));

		PartDefinition cube_r94 = jaw.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(72, 38).mirror().addBox(-0.1F, -0.5592F, -5.4517F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.9504F, -9.0231F, -0.0873F, -0.0524F, 0.0F));

		PartDefinition cube_r95 = jaw.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(13, 47).mirror().addBox(-0.1F, -0.6805F, -3.6724F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.9504F, -9.0231F, -0.0524F, -0.0524F, 0.0F));

		PartDefinition cube_r96 = jaw.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(26, 49).mirror().addBox(-0.3168F, -0.0782F, -0.1174F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1408F, -0.173F, -13.6387F, -0.0175F, -0.0524F, 0.0F));

		PartDefinition cube_r97 = jaw.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-0.1F, -0.8034F, -3.6523F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.9504F, -9.0231F, -0.0175F, -0.0524F, 0.0F));

		PartDefinition cube_r98 = jaw.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(57, 0).mirror().addBox(0.1F, -0.9034F, -4.0395F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(77, 60).mirror().addBox(-0.32F, -0.3034F, -0.7395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(51, 15).mirror().addBox(-0.1F, -0.6034F, -3.9395F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 0.7504F, -4.9231F, 0.0175F, -0.3142F, 0.0F));

		PartDefinition cube_r99 = jaw.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(78, 57).addBox(2.24F, -0.786F, -0.2242F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-1.0F, 1.4504F, -2.4231F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r100 = jaw.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(70, 46).addBox(2.0F, 0.0303F, -1.9543F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, -0.6496F, -3.4231F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r101 = jaw.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(51, 21).addBox(-0.9F, -0.1298F, -3.8699F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.8F, 0.7504F, -4.9231F, -0.1047F, 0.3142F, 0.0F));

		PartDefinition cube_r102 = jaw.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(73, 56).addBox(-0.4F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1432F, 0.0623F, -13.9179F, 0.1628F, 0.0301F, 0.1389F));

		PartDefinition cube_r103 = jaw.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(72, 38).addBox(-0.9F, -0.5592F, -5.4517F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7F, 0.9504F, -9.0231F, -0.0873F, 0.0524F, 0.0F));

		PartDefinition cube_r104 = jaw.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(13, 47).addBox(-0.9F, -0.6805F, -3.6724F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.7F, 0.9504F, -9.0231F, -0.0524F, 0.0524F, 0.0F));

		PartDefinition cube_r105 = jaw.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(26, 49).addBox(-0.6832F, -0.0782F, -0.1174F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1408F, -0.173F, -13.6387F, -0.0175F, 0.0524F, 0.0F));

		PartDefinition cube_r106 = jaw.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(0, 46).addBox(-0.9F, -0.8034F, -3.6523F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7F, 0.9504F, -9.0231F, -0.0175F, 0.0524F, 0.0F));

		PartDefinition cube_r107 = jaw.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(57, 0).addBox(-0.1F, -0.9034F, -4.0395F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(77, 60).addBox(-0.68F, -0.3034F, -0.7395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(51, 15).addBox(-0.9F, -0.6034F, -3.9395F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.8F, 0.7504F, -4.9231F, 0.0175F, 0.3142F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5F, -0.5771F, -0.1017F));

		PartDefinition cube_r108 = leftFace.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(78, 0).addBox(0.5F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r109 = leftFace.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(77, 69).addBox(1.5F, -0.0423F, -0.0381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.0229F, 0.6017F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r110 = leftFace.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(77, 66).addBox(1.5F, -0.0096F, 0.0659F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, -1.1229F, -0.4983F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r111 = leftFace.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(78, 3).addBox(1.5F, -1.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, 1.6771F, -3.9983F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r112 = leftFace.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(73, 33).addBox(-0.3F, -1.0F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 2.0771F, -5.9983F, 0.1129F, 0.3818F, 0.0422F));

		PartDefinition cube_r113 = leftFace.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(65, 38).addBox(0.1F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6568F, 1.8494F, -7.4712F, 0.124F, 0.1735F, 0.0172F));

		PartDefinition cube_r114 = leftFace.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(56, 41).addBox(-0.1F, -0.1425F, -3.9956F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(11, 54).addBox(-0.9F, -0.9425F, -3.9956F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.6F, 1.7771F, -8.9983F, -0.0175F, 0.0524F, -0.0009F));

		PartDefinition cube_r115 = leftFace.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(55, 77).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(77, 46).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4F, 2.7746F, -13.6013F, 1.922F, -0.3293F, -0.1179F));

		PartDefinition cube_r116 = leftFace.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(77, 63).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3F, 2.0736F, -13.7437F, 0.1214F, -0.3641F, -0.0434F));

		PartDefinition cube_r117 = leftFace.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(78, 9).addBox(-1.0F, -0.831F, 0.0915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.6771F, -9.0983F, 0.1222F, 0.0349F, 0.0F));

		PartDefinition cube_r118 = leftFace.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(9, 60).addBox(-0.9651F, -0.9633F, -0.0997F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.6771F, -8.0983F, 0.0181F, 0.2618F, 0.0041F));

		PartDefinition cube_r119 = leftFace.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(63, 70).addBox(-1.0F, -1.1F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 1.7771F, -5.9983F, 0.0F, 0.384F, 0.0F));

		PartDefinition cube_r120 = leftFace.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(71, 9).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.7037F, 0.6859F, -1.4928F, -0.3491F, 0.1222F, -0.2618F));

		PartDefinition cube_r121 = leftFace.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(31, 56).addBox(-1.0F, -1.0F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(2.0F, 1.6771F, -3.9983F, 0.2706F, 0.2527F, 0.0692F));

		PartDefinition cube_r122 = leftFace.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(31, 60).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(2.0F, 0.8587F, -1.432F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r123 = leftFace.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(65, 43).addBox(-2.9495F, -0.6173F, -0.7321F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1126F, 1.7894F, 0.0302F, -1.1722F, -0.0535F, 0.1574F));

		PartDefinition cube_r124 = leftFace.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(62, 17).addBox(-0.5F, -0.9648F, -1.0674F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 0.405F, -0.9302F, -1.1868F, 0.1222F, -0.2618F));

		PartDefinition cube_r125 = leftFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(71, 21).addBox(-0.5932F, -0.5605F, 0.2693F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F))
				.texOffs(78, 27).addBox(-0.5932F, -0.5605F, -0.3307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.8249F, -0.4771F, -0.6177F, -2.4435F, 0.1222F, -0.2618F));

		PartDefinition cube_r126 = leftFace.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(78, 24).addBox(-0.2849F, 0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(71, 17).addBox(-0.2849F, 0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8249F, 0.7229F, -0.6177F, -2.7576F, 0.1222F, -0.2618F));

		PartDefinition cube_r127 = leftFace.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(51, 66).addBox(-0.8096F, -0.0163F, -1.8852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.7F, -0.895F, -0.7302F, 0.2443F, 0.1222F, -0.2618F));

		PartDefinition cube_r128 = leftFace.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(39, 49).addBox(-0.6F, -0.7F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.3F, 0.4524F, -3.2912F, 0.2674F, 0.2022F, 0.055F));

		PartDefinition cube_r129 = leftFace.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(71, 25).addBox(-0.4F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6289F, 0.1949F, -4.5534F, 0.3043F, 0.0121F, 0.6387F));

		PartDefinition cube_r130 = leftFace.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(71, 13).addBox(-0.1F, 0.0621F, -1.6798F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8229F, -3.0983F, 0.3047F, 0.0537F, 0.6518F));

		PartDefinition cube_r131 = leftFace.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(50, 76).addBox(-0.3F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.02F, -0.4466F, -2.5241F, 0.2415F, -0.0702F, 0.5633F));

		PartDefinition cube_r132 = leftFace.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(73, 52).addBox(-1.0F, 0.0054F, -1.0427F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.6729F, -3.9983F, 0.0964F, -0.0869F, -0.0084F));

		PartDefinition cube_r133 = leftFace.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(34, 65).addBox(-1.0F, -0.0379F, -1.9798F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.0F, -0.8229F, -3.0983F, 0.2015F, 0.0855F, 0.0174F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.5F, -0.5771F, -0.1017F));

		PartDefinition cube_r134 = rightFace.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(78, 0).mirror().addBox(-1.5F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r135 = rightFace.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(77, 69).mirror().addBox(-2.5F, -0.0423F, -0.0381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.0229F, 0.6017F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r136 = rightFace.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(77, 66).mirror().addBox(-2.5F, -0.0096F, 0.0659F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.1229F, -0.4983F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r137 = rightFace.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(78, 3).mirror().addBox(-2.5F, -1.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(1.0F, 1.6771F, -3.9983F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r138 = rightFace.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(73, 33).mirror().addBox(0.3F, -1.0F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 2.0771F, -5.9983F, 0.1129F, -0.3818F, -0.0422F));

		PartDefinition cube_r139 = rightFace.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(65, 38).mirror().addBox(-0.1F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6568F, 1.8494F, -7.4712F, 0.124F, -0.1735F, -0.0172F));

		PartDefinition cube_r140 = rightFace.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(56, 41).mirror().addBox(0.1F, -0.1425F, -3.9956F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(11, 54).mirror().addBox(-0.1F, -0.9425F, -3.9956F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.7771F, -8.9983F, -0.0175F, -0.0524F, 0.0009F));

		PartDefinition cube_r141 = rightFace.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(55, 77).mirror().addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(77, 46).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 2.7746F, -13.6013F, 1.922F, 0.3293F, 0.1179F));

		PartDefinition cube_r142 = rightFace.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(77, 63).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 2.0736F, -13.7437F, 0.1214F, 0.3641F, 0.0434F));

		PartDefinition cube_r143 = rightFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(78, 9).mirror().addBox(0.0F, -0.831F, 0.0915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 1.6771F, -9.0983F, 0.1222F, -0.0349F, 0.0F));

		PartDefinition cube_r144 = rightFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(9, 60).mirror().addBox(-0.0349F, -0.9633F, -0.0997F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 1.6771F, -8.0983F, 0.0181F, -0.2618F, -0.0041F));

		PartDefinition cube_r145 = rightFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(63, 70).mirror().addBox(0.0F, -1.1F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 1.7771F, -5.9983F, 0.0F, -0.384F, 0.0F));

		PartDefinition cube_r146 = rightFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(71, 9).mirror().addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7037F, 0.6859F, -1.4928F, -0.3491F, -0.1222F, 0.2618F));

		PartDefinition cube_r147 = rightFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(31, 56).mirror().addBox(0.0F, -1.0F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.6771F, -3.9983F, 0.2706F, -0.2527F, -0.0692F));

		PartDefinition cube_r148 = rightFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(31, 60).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.8587F, -1.432F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r149 = rightFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(65, 43).mirror().addBox(-0.0505F, -0.6173F, -0.7321F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1126F, 1.7894F, 0.0302F, -1.1722F, 0.0535F, -0.1574F));

		PartDefinition cube_r150 = rightFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(62, 17).mirror().addBox(-0.5F, -0.9648F, -1.0674F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.405F, -0.9302F, -1.1868F, -0.1222F, 0.2618F));

		PartDefinition cube_r151 = rightFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(71, 21).mirror().addBox(-0.4068F, -0.5605F, 0.2693F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(78, 27).mirror().addBox(-0.4068F, -0.5605F, -0.3307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.8249F, -0.4771F, -0.6177F, -2.4435F, -0.1222F, 0.2618F));

		PartDefinition cube_r152 = rightFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(78, 24).mirror().addBox(-0.7151F, 0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(71, 17).mirror().addBox(-0.7151F, 0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8249F, 0.7229F, -0.6177F, -2.7576F, -0.1222F, 0.2618F));

		PartDefinition cube_r153 = rightFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(51, 66).mirror().addBox(-0.1904F, -0.0163F, -1.8852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -0.895F, -0.7302F, 0.2443F, -0.1222F, 0.2618F));

		PartDefinition cube_r154 = rightFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(39, 49).mirror().addBox(-0.4F, -0.7F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.4524F, -3.2912F, 0.2674F, -0.2022F, -0.055F));

		PartDefinition cube_r155 = rightFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(71, 25).mirror().addBox(-0.6F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6289F, 0.1949F, -4.5534F, 0.3043F, -0.0121F, -0.6387F));

		PartDefinition cube_r156 = rightFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(71, 13).mirror().addBox(-0.9F, 0.0621F, -1.6798F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8229F, -3.0983F, 0.3047F, -0.0537F, -0.6518F));

		PartDefinition cube_r157 = rightFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(50, 76).mirror().addBox(-0.7F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.02F, -0.4466F, -2.5241F, 0.2415F, 0.0702F, -0.5633F));

		PartDefinition cube_r158 = rightFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(73, 52).mirror().addBox(0.0F, 0.0054F, -1.0427F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.6729F, -3.9983F, 0.0964F, 0.0869F, 0.0084F));

		PartDefinition cube_r159 = rightFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(34, 65).mirror().addBox(0.0F, -0.0379F, -1.9798F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8229F, -3.0983F, 0.2015F, -0.0855F, -0.0174F));

		return LayerDefinition.create(meshdefinition, 86, 86);
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