package fossils.fossils.client.blockentity.model.spectrovenator;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SpectrovenatorFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart crest;
	private final ModelPart crest2;
	private final ModelPart jugal_quadratojugal;
	private final ModelPart jugal_quadratojugal2;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public SpectrovenatorFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.crest = this.head.getChild("crest");
		this.crest2 = this.head.getChild("crest2");
		this.jugal_quadratojugal = this.head.getChild("jugal_quadratojugal");
		this.jugal_quadratojugal2 = this.head.getChild("jugal_quadratojugal2");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -18.25F, 4.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(10, 22).addBox(0.5F, -0.7F, -5.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(28, 25).addBox(0.0F, -0.1F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.1F, 2.3F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(48, 21).mirror().addBox(0.3063F, -2.2395F, 2.4711F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.3937F, 2.2604F, -0.7581F, 0.384F, 0.0F, -0.1745F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(13, 31).mirror().addBox(0.3063F, -3.6871F, -2.5932F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(20, 33).mirror().addBox(0.3063F, -4.2871F, -2.9932F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 22).mirror().addBox(0.3063F, -4.2871F, 1.0068F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 0).mirror().addBox(0.3063F, -3.2871F, -0.4932F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.6937F, 2.2604F, -0.7581F, 0.1222F, 0.0F, -0.1309F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(23, 39).mirror().addBox(0.3063F, -1.2334F, -4.7327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.6937F, 2.2604F, -0.7581F, -0.6109F, 0.0F, -0.1309F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(48, 21).mirror().addBox(0.3063F, -2.2395F, 2.4711F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.6937F, 2.2604F, -0.7581F, 0.384F, 0.0F, -0.1309F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(49, 15).mirror().addBox(0.3063F, -5.2841F, -0.3203F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.6937F, 2.2604F, -0.7581F, -0.5411F, 0.0F, -0.1309F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(10, 22).mirror().addBox(0.033F, -0.0624F, -0.8665F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.6937F, 2.2604F, -0.7581F, -0.6417F, 0.181F, 0.3499F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(22, 52).mirror().addBox(-0.0806F, -2.521F, -1.0512F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.6937F, 2.2604F, -0.7581F, 0.0F, 0.0F, 0.1134F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(18, 56).mirror().addBox(-0.7765F, 2.3409F, 2.6062F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.6937F, 2.2604F, -0.7581F, -0.1658F, 0.0F, 0.0087F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(53, 19).mirror().addBox(-0.7765F, 3.5362F, 1.0787F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.6937F, 2.2604F, -0.7581F, 0.3142F, 0.0F, 0.0087F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(12, 46).mirror().addBox(-0.1522F, -0.7192F, 1.734F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.6937F, 2.2604F, -0.7581F, 0.1396F, 0.0F, 0.2356F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(23, 39).addBox(-1.3063F, -1.2334F, -4.7327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6937F, 2.2604F, -0.7581F, -0.6109F, 0.0F, 0.1309F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(13, 31).addBox(-1.3063F, -3.6871F, -2.5932F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F))
				.texOffs(20, 33).addBox(-1.3063F, -4.2871F, -2.9932F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-1.3063F, -3.2871F, -0.4932F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(0, 22).addBox(-1.3063F, -4.2871F, 1.0068F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6937F, 2.2604F, -0.7581F, 0.1222F, 0.0F, 0.1309F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(48, 21).addBox(-1.3063F, -2.2395F, 2.4711F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.6937F, 2.2604F, -0.7581F, 0.384F, 0.0F, 0.1309F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(49, 15).addBox(-1.3063F, -5.2841F, -0.3203F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6937F, 2.2604F, -0.7581F, -0.5411F, 0.0F, 0.1309F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(18, 56).addBox(-0.2235F, 2.3409F, 2.6062F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.6937F, 2.2604F, -0.7581F, -0.1658F, 0.0F, -0.0087F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(53, 19).addBox(-0.2235F, 3.5362F, 1.0787F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6937F, 2.2604F, -0.7581F, 0.3142F, 0.0F, -0.0087F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(10, 22).addBox(-1.033F, -0.0624F, -0.8665F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6937F, 2.2604F, -0.7581F, -0.6417F, -0.181F, -0.3499F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(22, 52).addBox(-0.9194F, -2.521F, -1.0512F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6937F, 2.2604F, -0.7581F, 0.0F, 0.0F, -0.1134F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(12, 46).addBox(-0.8478F, -0.7192F, 1.734F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6937F, 2.2604F, -0.7581F, 0.1396F, 0.0F, -0.2356F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(18, 44).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.201F, 0.6641F, -0.3723F, 0.654F, 0.0F, 0.0F));

		PartDefinition cube_r21 = leftLeg.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(28, 15).addBox(-0.5F, 0.1F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.3F, 0.3F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r22 = leftLeg.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(27, 33).addBox(-0.5F, -0.6F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.4F, 0.384F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(35, 44).addBox(0.0F, 1.9F, -0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 44).addBox(0.0F, -0.1F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.3F, -1.5F, -1.3475F, 0.0F, 0.0F));

		PartDefinition cube_r23 = leftLeg2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(50, 52).addBox(-0.5F, -2.7807F, -0.758F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 2.9443F, 0.3155F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r24 = leftLeg2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(5, 48).addBox(-0.5F, -2.0F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 4.7443F, 0.6155F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(13, 0).addBox(-1.0F, 0.0F, -0.4F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 6.9443F, 0.0155F, 0.6939F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(17, 24).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.2038F, 0.6116F, -0.3458F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r25 = rightLeg.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(24, 0).addBox(-0.5F, 0.1F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.3F, 0.3F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r26 = rightLeg.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(9, 31).addBox(-0.5F, -0.6F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.4F, 0.384F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(23, 44).addBox(-1.0F, 1.9F, -0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 18).addBox(-1.0F, -0.1F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.3F, -1.5F, -1.6131F, 0.0806F, 0.0335F));

		PartDefinition cube_r27 = rightLeg2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(38, 52).addBox(-0.5F, -2.7807F, -0.758F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 2.9443F, 0.3155F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r28 = rightLeg2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(40, 46).addBox(-0.5F, -2.0F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 4.7443F, 0.6155F, 0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, 0.0F, -0.4F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 6.9443F, 0.0155F, 1.0894F, 0.0667F, -0.0536F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r29 = rightLeg4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(24, 0).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5672F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 3.0F, -0.1317F, 0.1304F, -0.0096F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(59, 37).addBox(0.5F, -0.7F, -5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 40).addBox(0.5F, -0.8F, -3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 50).addBox(0.5F, -0.6F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 7).addBox(0.0F, -0.1F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -1.1F, 5.1F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(49, 25).mirror().addBox(0.9239F, -0.3769F, -0.4335F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0807F, 0.6771F, 0.2447F, -0.1208F, 1.1826F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(38, 35).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0807F, 0.6771F, 0.2856F, -0.0848F, 0.7894F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(43, 23).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.3193F, 2.6771F, 0.2022F, -0.0212F, 0.6542F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(52, 32).mirror().addBox(2.4907F, -1.5772F, -0.4335F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.3193F, 2.6771F, 0.1617F, -0.1082F, 1.4774F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(53, 8).mirror().addBox(0.9239F, -0.3769F, -0.4335F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.3193F, 2.6771F, 0.192F, -0.0302F, 1.0469F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(23, 10).mirror().addBox(2.4907F, -1.5772F, -0.4335F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.6193F, 4.6771F, 0.1504F, 0.0134F, 1.4081F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(53, 36).mirror().addBox(0.9239F, -0.3769F, -0.4335F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.6193F, 4.6771F, 0.1308F, 0.0756F, 0.9757F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.6193F, 4.6771F, 0.1052F, 0.0531F, 0.5828F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(49, 25).addBox(-2.9239F, -0.3769F, -0.4335F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0807F, 0.6771F, 0.2447F, 0.1208F, -1.1826F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(38, 35).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0807F, 0.6771F, 0.2856F, 0.0848F, -0.7894F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(43, 23).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3193F, 2.6771F, 0.2022F, 0.0212F, -0.6542F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(53, 8).addBox(-2.9239F, -0.3769F, -0.4335F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3193F, 2.6771F, 0.192F, 0.0302F, -1.0469F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(52, 32).addBox(-4.4907F, -1.5772F, -0.4335F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3193F, 2.6771F, 0.1617F, 0.1082F, -1.4774F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(23, 10).addBox(-5.4907F, -1.5772F, -0.4335F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6193F, 4.6771F, 0.1504F, -0.0134F, -1.4081F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(53, 36).addBox(-2.9239F, -0.3769F, -0.4335F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6193F, 4.6771F, 0.1308F, -0.0756F, -0.9757F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 50).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6193F, 4.6771F, 0.1052F, -0.0531F, -0.5828F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(1, 12).addBox(-2.0F, -1.5F, -3.4F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.0192F, 3.309F, 0.2618F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, 5.2F, -0.0436F, -0.0871F, 0.0076F));

		PartDefinition cube_r48 = chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(57, 59).addBox(0.5F, -0.5F, -3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 60).addBox(0.5F, -0.4F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 33).addBox(0.0F, -0.1F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6F, 3.8F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r49 = chest.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(28, 15).mirror().addBox(-0.5F, 0.4F, -2.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(28, 15).addBox(-4.7F, 0.4F, -2.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, 0.3693F, 1.8326F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r50 = chest.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(36, 15).mirror().addBox(0.5F, -0.6F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(36, 15).addBox(-1.5F, -0.6F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.1663F, 2.0001F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r51 = chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(18, 12).mirror().addBox(-1.0F, -0.8306F, -0.0743F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.6F, 2.3693F, 2.6326F, -0.5866F, -0.4783F, 0.2219F));

		PartDefinition cube_r52 = chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(7, 37).mirror().addBox(-0.5F, -0.0318F, -2.0863F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 5.1189F, 1.6605F, 0.3952F, -1.0322F, -0.5847F));

		PartDefinition cube_r53 = chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(36, 0).mirror().addBox(-0.5F, -0.0318F, -3.2863F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 5.1189F, 1.6605F, 0.2024F, -0.5738F, -0.3715F));

		PartDefinition cube_r54 = chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(18, 12).addBox(0.0F, -0.8306F, -0.0743F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6F, 2.3693F, 2.6326F, -0.5866F, 0.4783F, -0.2219F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(36, 0).addBox(-0.5F, -0.0318F, -3.2863F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.1189F, 1.6605F, 0.2024F, 0.5738F, 0.3715F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(7, 37).addBox(-0.5F, -0.0318F, -2.0863F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.1189F, 1.6605F, 0.3952F, 1.0322F, 0.5847F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(35, 23).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.1193F, 1.2771F, 0.0355F, 0.1059F, 0.5948F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(47, 37).mirror().addBox(0.9239F, -0.3769F, -0.4335F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.1193F, 1.2771F, 0.0866F, 0.151F, 0.9882F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 7).mirror().addBox(2.4907F, -1.5772F, -0.4335F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.1193F, 1.2771F, 0.1422F, 0.1003F, 1.4251F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 27).mirror().addBox(2.4907F, -1.5772F, -0.4335F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.1193F, 3.2771F, 0.121F, 0.3175F, 1.5952F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(20, 31).mirror().addBox(0.9239F, -0.3769F, -0.4335F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.1193F, 3.2771F, -0.0297F, 0.3378F, 1.1344F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(23, 12).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.1193F, 3.2771F, -0.143F, 0.2351F, 0.7389F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(23, 12).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1193F, 3.2771F, -0.143F, -0.2351F, -0.7389F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(20, 31).addBox(-2.9239F, -0.3769F, -0.4335F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1193F, 3.2771F, -0.0297F, -0.3378F, -1.1344F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 27).addBox(-4.4907F, -1.5772F, -0.4335F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1193F, 3.2771F, 0.121F, -0.3175F, -1.5952F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(0, 7).addBox(-5.4907F, -1.5772F, -0.4335F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1193F, 1.2771F, 0.1422F, -0.1003F, -1.4251F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(47, 37).addBox(-2.9239F, -0.3769F, -0.4335F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1193F, 1.2771F, 0.0866F, -0.151F, -0.9882F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(35, 23).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1193F, 1.2771F, 0.0355F, -0.1059F, -0.5948F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(26, 39).addBox(-1.0F, -0.5F, -2.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 3.3807F, 2.7771F, 0.7218F, 0.2143F, 0.2194F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(17, 39).addBox(-0.2F, -1.0F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(47, 33).addBox(-0.2F, -0.2F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.8F, 0.0F, -2.5F, 0.6144F, -0.116F, -0.0607F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(45, 3).addBox(-0.1F, -1.1F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.9F, 0.0F, -0.1745F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(37, 22).addBox(0.0F, -0.5F, -2.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 3.3807F, 2.7771F, 0.5909F, -0.2143F, -0.2194F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(11, 37).addBox(-0.8F, -1.0F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(45, 46).addBox(-0.8F, -0.2F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8F, 0.0F, -2.5F, 0.6981F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(44, 25).addBox(-0.9F, -1.1F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.9F, 0.0F, 0.1745F, 0.0F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.3033F, -0.2211F, 0.024F));

		PartDefinition cube_r69 = neck3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(60, 0).addBox(-0.5F, -1.3F, -1.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 49).addBox(-1.0F, -1.0F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -1.0F, 2.5F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r70 = neck3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(5, 43).mirror().addBox(0.0F, -0.4421F, -2.9201F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.938F, 2.3215F, 1.1285F, -0.0929F, -0.2451F));

		PartDefinition cube_r71 = neck3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(5, 43).addBox(0.0F, -0.4421F, -2.9201F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.938F, 2.3215F, 1.1285F, 0.0929F, 0.2451F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, 1.8F, 0.0013F, 0.1739F, 0.0154F));

		PartDefinition cube_r72 = neck2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(3, 60).addBox(-0.5F, 1.0F, -0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 24).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.0F, 1.2F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r73 = neck2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(54, 56).mirror().addBox(0.0F, -0.0235F, -0.5078F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.6232F, 1.6093F, -0.2408F, -0.042F, -0.1694F));

		PartDefinition cube_r74 = neck2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(54, 56).addBox(0.0F, -0.0235F, -0.5078F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.6232F, 1.6093F, -0.2408F, 0.042F, 0.1694F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.6F, 1.6F, 0.0751F, -0.2653F, 0.047F));

		PartDefinition cube_r75 = neck.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(60, 7).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.739F, -0.0178F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r76 = neck.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(5, 54).mirror().addBox(0.0F, -0.4482F, -1.9886F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.3612F, 0.9797F, 1.1817F, -0.1013F, -0.2418F));

		PartDefinition cube_r77 = neck.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(54, 25).mirror().addBox(0.0F, -0.3772F, -1.9407F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.1547F, 2.191F, 0.7712F, -0.1577F, -0.1514F));

		PartDefinition cube_r78 = neck.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(5, 54).addBox(0.0F, -0.4482F, -1.9886F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3612F, 0.9797F, 1.1817F, 0.1013F, 0.2418F));

		PartDefinition cube_r79 = neck.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(49, 28).addBox(0.0F, -0.0338F, -1.9738F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -1.7F, 1.1F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r80 = neck.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(60, 12).addBox(0.5F, -0.9F, -0.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.4F, 2.0F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r81 = neck.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(54, 25).addBox(0.0F, -0.3772F, -1.9407F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.1547F, 2.191F, 0.7712F, 0.1577F, 0.1514F));

		PartDefinition cube_r82 = neck.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(49, 39).addBox(0.0F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.4F, 2.0F, 0.192F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, 2.5F, 0.4476F, -0.0826F, -0.1313F));

		PartDefinition cube_r83 = head.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(42, 13).addBox(-1.5F, -0.711F, -1.9706F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(40, 30).mirror().addBox(-0.2F, -0.711F, -2.9706F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(40, 30).addBox(-1.8F, -0.711F, -2.9706F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8F, 0.9F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r84 = head.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(58, 33).mirror().addBox(-1.39F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(43, 58).mirror().addBox(-1.39F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(58, 33).addBox(-2.01F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(43, 58).addBox(-2.01F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, 1.1859F, 5.2799F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r85 = head.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(55, 42).mirror().addBox(-0.48F, -1.7725F, -0.8307F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(55, 42).addBox(-1.72F, -1.7725F, -0.8307F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6F, 0.861F, 4.2686F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r86 = head.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(55, 52).mirror().addBox(-0.46F, -1.1F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false)
				.texOffs(55, 52).addBox(-1.74F, -1.1F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.6F, 0.961F, 3.4686F, 1.405F, 0.0F, 0.0F));

		PartDefinition cube_r87 = head.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(57, 22).mirror().addBox(-0.58F, -0.0992F, -0.9052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false)
				.texOffs(56, 47).mirror().addBox(-0.58F, -0.0992F, -1.2052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(56, 47).addBox(-1.82F, -0.0992F, -1.2052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(57, 22).addBox(-1.82F, -0.0992F, -0.9052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.7F, 0.4758F, 1.1634F, 1.9286F, 0.0F, 0.0F));

		PartDefinition cube_r88 = head.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(38, 57).mirror().addBox(-0.58F, -0.7F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(54, 38).mirror().addBox(-0.46F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(32, 39).mirror().addBox(-0.35F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(56, 29).mirror().addBox(-0.28F, -1.8F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.08F)).mirror(false)
				.texOffs(56, 29).addBox(-2.12F, -1.8F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.08F))
				.texOffs(32, 39).addBox(-2.05F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(54, 38).addBox(-1.94F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(38, 57).addBox(-1.82F, -0.7F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7F, 0.3758F, 1.7634F, 1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r89 = head.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(51, 11).mirror().addBox(-0.58F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1F, 0.4872F, 0.4644F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r90 = head.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(56, 10).mirror().addBox(-0.58F, -0.3F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(1.1F, 0.4394F, 0.3765F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r91 = head.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(56, 10).addBox(-0.42F, -0.3F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-1.1F, 0.4394F, 0.3765F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r92 = head.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(51, 11).addBox(-0.42F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1F, 0.4872F, 0.4644F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r93 = head.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(46, 8).addBox(-1.0F, -1.5F, -1.1F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.6839F, 1.289F, 1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r94 = head.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(50, 48).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.7334F, 0.737F, 1.9286F, 0.0F, 0.0F));

		PartDefinition cube_r95 = head.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(37, 7).addBox(-1.5F, -1.9406F, -1.989F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5F, 2.4F, 1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r96 = head.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(15, 51).mirror().addBox(-1.0F, -0.9654F, -1.9811F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(15, 51).addBox(-1.4F, -0.9654F, -1.9811F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 52).addBox(-1.7F, -1.9654F, -1.9811F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.2F, 4.3F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r97 = head.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(52, 4).mirror().addBox(-1.0F, -0.9943F, -1.9442F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 4).addBox(-1.4F, -0.9943F, -1.9442F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7F, 0.7F, 5.2F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r98 = head.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(57, 56).mirror().addBox(-0.8F, -1.0426F, 0.2418F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(19, 60).mirror().addBox(0.1F, -0.6426F, 0.0418F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(19, 60).addBox(-1.1F, -0.6426F, 0.0418F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 56).addBox(-1.2F, -1.0426F, 0.2418F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 19).mirror().addBox(-0.8F, -1.0426F, 0.0418F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(58, 19).addBox(-1.2F, -1.0426F, 0.0418F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 2.5F, 4.8F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r99 = head.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(5, 58).addBox(0.0F, 0.0057F, -0.9442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.7F, 5.2F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r100 = head.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(37, 27).addBox(-1.0F, -0.4955F, -0.0594F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(43, 0).addBox(-1.0F, -0.9955F, -0.0594F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5F, 3.9F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r101 = head.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(9, 42).addBox(-1.0F, -0.6F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.1245F, 2.9093F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r102 = head.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(42, 42).addBox(-1.0F, -0.9729F, -0.3441F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.9F, 2.4F, -0.3665F, 0.0F, 0.0F));

		PartDefinition crest = head.addOrReplaceChild("crest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 0.4828F, 5.0783F, 0.0F, -0.0175F, 0.0F));

		PartDefinition cube_r103 = crest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(30, 55).addBox(-0.7156F, -0.3042F, -0.8686F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.7F, -1.3F, 1.0362F, 0.1054F, 0.0444F));

		PartDefinition cube_r104 = crest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(56, 15).addBox(-0.5769F, -3.1174F, -0.3595F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, -0.7F, -1.3F, 1.485F, 0.0995F, 0.0159F));

		PartDefinition cube_r105 = crest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(0, 56).addBox(-0.1716F, -1.6561F, -0.8189F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, -0.7F, -1.3F, 1.1263F, 0.3536F, -0.1035F));

		PartDefinition crest2 = head.addOrReplaceChild("crest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 0.4828F, 5.0783F, 0.0F, 0.0175F, 0.0F));

		PartDefinition cube_r106 = crest2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(30, 55).mirror().addBox(-0.2844F, -0.3042F, -0.8686F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7F, -1.3F, 1.0362F, -0.1054F, -0.0444F));

		PartDefinition cube_r107 = crest2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(56, 15).mirror().addBox(-0.4231F, -3.1174F, -0.3595F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.7F, -1.3F, 1.485F, -0.0995F, -0.0159F));

		PartDefinition cube_r108 = crest2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-0.8284F, -1.6561F, -0.8189F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.7F, -1.3F, 1.1263F, -0.3536F, 0.1035F));

		PartDefinition jugal_quadratojugal = head.addOrReplaceChild("jugal_quadratojugal", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2F, 0.8F, -0.4F, -0.0886F, 0.2157F, -0.2215F));

		PartDefinition cube_r109 = jugal_quadratojugal.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(16, 24).addBox(-0.4695F, 0.551F, 0.6586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.114F, -0.0538F, -0.1288F, 0.1923F, 0.1603F, 0.7537F));

		PartDefinition cube_r110 = jugal_quadratojugal.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(31, 51).addBox(-1.107F, -0.443F, -1.7504F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.114F, 1.1462F, 0.9712F, -0.6192F, 0.0543F, 0.8231F));

		PartDefinition cube_r111 = jugal_quadratojugal.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(41, 36).addBox(-0.4027F, -0.5971F, -0.3689F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4997F, 0.7124F, 1.4347F, 0.0134F, -0.0425F, 0.8437F));

		PartDefinition jugal_quadratojugal2 = head.addOrReplaceChild("jugal_quadratojugal2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2F, 0.8F, -0.4F, -0.0886F, -0.2157F, 0.2215F));

		PartDefinition cube_r112 = jugal_quadratojugal2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(16, 24).mirror().addBox(-0.5305F, 0.551F, 0.6586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.114F, -0.0538F, -0.1288F, 0.1923F, -0.1603F, -0.7537F));

		PartDefinition cube_r113 = jugal_quadratojugal2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(31, 51).mirror().addBox(0.107F, -0.443F, -1.7504F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.114F, 1.1462F, 0.9712F, -0.6192F, -0.0543F, -0.8231F));

		PartDefinition cube_r114 = jugal_quadratojugal2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(41, 36).mirror().addBox(-0.5973F, -0.5971F, -0.3689F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4997F, 0.7124F, 1.4347F, 0.0134F, 0.0425F, -0.8437F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(0, 37).addBox(-1.3F, -0.3F, -0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F))
				.texOffs(0, 37).mirror().addBox(0.3F, -0.3F, -0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.8F, -0.95F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r115 = jaw.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(43, 54).mirror().addBox(0.5F, -1.3909F, -0.0176F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(43, 54).addBox(-0.5F, -1.3909F, -0.0176F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(43, 50).addBox(-0.7F, -0.9909F, -0.0176F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 4.8F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r116 = jaw.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(13, 55).mirror().addBox(0.0F, -0.5F, -1.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9246F, 0.0332F, 4.0599F, -0.0796F, -0.087F, 0.0069F));

		PartDefinition cube_r117 = jaw.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(35, 39).mirror().addBox(0.0F, 0.0127F, -0.044F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, -0.6F, 2.1F, -0.2102F, -0.0854F, 0.0182F));

		PartDefinition cube_r118 = jaw.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(50, 0).mirror().addBox(-0.5F, -1.6F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.02F, 1.2522F, 1.5518F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r119 = jaw.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(50, 44).mirror().addBox(0.0F, -0.0945F, -1.9198F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(50, 44).addBox(-1.6F, -0.0945F, -1.9198F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3F, -0.5F, 2.1F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r120 = jaw.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(13, 55).addBox(0.0F, -0.5F, -1.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9246F, 0.0332F, 4.0599F, -0.0796F, 0.087F, -0.0069F));

		PartDefinition cube_r121 = jaw.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(35, 39).addBox(-1.0F, 0.0127F, -0.044F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -0.6F, 2.1F, -0.2102F, 0.0854F, -0.0182F));

		PartDefinition cube_r122 = jaw.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(50, 0).addBox(-0.5F, -1.6F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.02F, 1.2522F, 1.5518F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(13, 0).addBox(-0.5F, -0.3F, -7.8F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.003F))
				.texOffs(31, 59).addBox(0.0F, -1.0F, -0.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 59).addBox(0.0F, -0.9F, -2.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 25).addBox(0.0F, -0.8F, -4.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 59).addBox(0.0F, -0.8F, -6.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -3.6F, 0.0887F, -0.1734F, -0.0192F));

		PartDefinition cube_r123 = tail.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(57, 0).addBox(0.0F, 0.8284F, -3.3284F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 52).addBox(0.0F, -0.6565F, -1.9849F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 53).addBox(0.0F, -2.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2225F, -3.5578F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r124 = tail.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(10, 58).addBox(0.0F, -1.0F, -1.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2F, -0.3F, -0.7418F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, -0.3F, -7.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(46, 30).addBox(0.0F, -0.5514F, -4.9848F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 43).addBox(0.0F, -0.5514F, -6.9848F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.7F, -0.2568F, 0.1689F, -0.0441F));

		PartDefinition cube_r125 = tail2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(59, 4).addBox(0.0F, -0.5F, -2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 59).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -0.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r126 = tail2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(0, 37).addBox(0.0F, 1.2289F, -3.1202F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 57).addBox(0.0F, 0.1548F, -1.7929F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 55).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2249F, -3.4858F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r127 = tail2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(48, 56).addBox(0.0F, -1.6521F, -0.3701F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3782F, -1.4519F, -0.7418F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(17, 14).addBox(-0.5F, -0.3F, -8.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.003F))
				.texOffs(17, 37).addBox(0.0F, -0.5F, -2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 15).addBox(0.0F, -0.4F, -4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -6.9F, -0.2701F, 0.3006F, -0.0547F));

		PartDefinition cube_r128 = tail3.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(6, 0).addBox(0.0F, 6.3641F, -7.6974F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 31).addBox(0.0F, 3.9738F, -6.0521F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 0).addBox(0.0F, 2.5365F, -4.4951F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2249F, 3.4142F, -0.7854F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.3F, -10.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 0.4241F, 0.0942F, -0.0089F));

		PartDefinition cube_r129 = tail4.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 7.5443F, -9.5608F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2249F, 11.4142F, -0.7854F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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