package fossils.fossils.client.blockentity.model.dracoraptor;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DracoraptorFossilModel extends SkullModelBase {
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
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
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
	private final ModelPart jaw;

	public DracoraptorFossilModel(ModelPart root) {
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
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
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
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -15.3F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(29, 11).addBox(0.0F, -3.0F, 1.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 38).addBox(0.0F, -3.0F, -1.9F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 21).addBox(0.0F, -2.9F, -3.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 8).mirror().addBox(-1.2F, -2.3F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(35, 8).addBox(0.2F, -2.3F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F))
				.texOffs(29, 0).addBox(-0.5F, -2.3F, -3.6F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(7, 22).addBox(0.0F, -0.8F, -1.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.407F, 4.5002F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(29, 0).mirror().addBox(-0.69F, -0.3626F, -0.6441F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.4763F, 0.8407F, 0.5534F, 0.2946F, -0.4394F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(43, 26).mirror().addBox(-0.28F, 3.7344F, -1.3998F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.0F, -0.3F, -0.5061F, -0.4014F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(8, 0).mirror().addBox(-0.28F, 1.2358F, -0.9629F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.0F, -0.3F, -0.6109F, -0.4014F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(13, 28).mirror().addBox(-0.28F, -0.2989F, -0.5636F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.0F, -0.3F, -0.8727F, -0.4014F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(43, 32).mirror().addBox(-2.5F, -0.0499F, -1.7259F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(43, 20).mirror().addBox(-2.5F, -0.0499F, -1.1259F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(43, 32).addBox(0.7F, -0.0499F, -1.7259F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(43, 20).addBox(0.7F, -0.0499F, -1.1259F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.4F, -0.5F, 1.4F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(18, 28).mirror().addBox(-2.5F, -0.05F, -1.0595F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(18, 28).addBox(0.7F, -0.05F, -1.0595F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.4F, -1.5F, 0.0F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(38, 0).mirror().addBox(-2.5F, -1.0587F, -2.8367F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(38, 0).addBox(0.7F, -1.0587F, -2.8367F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.3F, 2.7F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(43, 26).addBox(-0.72F, 3.7344F, -1.3998F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9F, 0.0F, -0.3F, -0.5061F, 0.4014F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(8, 0).addBox(-0.72F, 1.2358F, -0.9629F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.9F, 0.0F, -0.3F, -0.6109F, 0.4014F, 0.0F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(29, 0).addBox(-0.31F, -0.3626F, -0.6441F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6F, 0.4763F, 0.8407F, 0.5534F, -0.2946F, 0.4394F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(13, 28).addBox(-0.72F, -0.2989F, -0.5636F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.9F, 0.0F, -0.3F, -0.8727F, 0.4014F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(14, 43).addBox(-0.5F, -0.3739F, -0.4945F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.6F, -0.2F, 0.5F, -1.0903F, 0.0497F, -0.0573F));

		PartDefinition cube_r14 = leftLeg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.1F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 3.5261F, -0.4945F, 0.2269F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(9, 37).addBox(-1.3F, 1.0992F, -0.2561F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 16).addBox(-1.3F, 0.0992F, -0.7561F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(33, 35).addBox(0.0F, 0.1992F, -0.2561F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1F, 6.8261F, 0.4055F, 1.1838F, -0.1213F, 0.0493F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(13, 16).addBox(-1.0F, -0.1494F, -0.5949F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2F, 8.1188F, 0.1069F, -1.1326F, -0.0643F, -0.059F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(18, 26).addBox(-1.5F, -0.3F, -4.4F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7506F, -0.0949F, 0.7854F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(14, 43).mirror().addBox(-0.5F, -0.3739F, -0.4945F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.6F, -0.2F, 0.5F, -0.2856F, -0.0371F, -0.1256F));

		PartDefinition cube_r15 = rightLeg.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, 0.1F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.5261F, -0.4945F, 0.2269F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(9, 37).mirror().addBox(0.3F, 1.0992F, -0.2561F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(43, 16).mirror().addBox(0.3F, 0.0992F, -0.7561F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(33, 35).mirror().addBox(-1.0F, 0.1992F, -0.2561F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 6.8261F, 0.4055F, 1.1432F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(13, 16).mirror().addBox(-1.0F, -0.1494F, -0.5949F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.2F, 8.1188F, 0.1069F, -0.8273F, 0.0201F, 0.0274F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(18, 26).mirror().addBox(-1.5F, -0.3F, -4.4F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.7506F, -0.0949F, -0.0101F, 0.0284F, 0.0712F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(13, 16).addBox(-1.0F, -0.3981F, -0.0051F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.005F))
				.texOffs(6, 16).addBox(-0.5F, -1.0981F, 0.9949F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 16).addBox(-0.5F, -0.9981F, 2.9949F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 7).addBox(-0.5F, -0.8981F, 4.9949F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 7).addBox(-0.5F, -0.8981F, 6.9949F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2F, 3.5F, -0.1415F, -0.1308F, 0.0109F));

		PartDefinition cube_r16 = tail.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(14, 38).addBox(0.0F, 2.484F, 5.8794F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 28).addBox(0.0F, 1.884F, 3.8794F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 28).addBox(0.0F, 0.484F, 1.8794F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 52).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6019F, 0.9949F, 0.4014F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, -0.4998F, 0.0087F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(0, 35).addBox(0.0F, -0.8998F, 1.0087F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 52).addBox(0.0F, -0.7998F, 3.0087F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 52).addBox(0.0F, -0.7998F, 5.0087F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 34).addBox(0.0F, -0.7998F, 7.0087F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.1019F, 7.9949F, 0.0861F, -0.087F, -0.0302F));

		PartDefinition cube_r17 = tail2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(35, 13).addBox(0.0F, 4.484F, 11.8794F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 21).addBox(0.0F, 3.784F, 9.8794F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 0).addBox(0.0F, 3.084F, 7.8794F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5007F, -6.9695F, 0.4014F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, -0.5942F, -0.1208F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.005F))
				.texOffs(17, 5).addBox(0.0F, -0.8942F, -0.1208F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 0).addBox(0.0F, -0.8942F, 1.8792F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 5).addBox(0.0F, -0.7942F, 3.8792F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 0).addBox(0.0F, -0.7942F, 5.8792F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1002F, 9.1087F, -0.1836F, 0.1267F, -0.0408F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.4418F, -0.3455F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0942F, 9.9792F, -0.2706F, 0.2527F, -0.0692F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8F, -2.3F, 0.0003F, 0.0035F, 0.0031F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(53, 31).addBox(0.0F, -1.5752F, 6.0203F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 53).addBox(0.0F, -1.5752F, 4.0203F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 53).addBox(0.0F, -1.5752F, 2.0203F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 53).addBox(0.0F, -1.4752F, 0.0203F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 11).addBox(-0.5F, -0.9752F, 0.0203F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.5F, -8.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 7).addBox(-1.5F, -0.9852F, -2.9972F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0048F, -5.4472F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 28).addBox(-2.0F, -1.9649F, -4.0171F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4048F, -1.4472F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(6, 35).mirror().addBox(-3.6736F, -1.29F, -0.4463F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0989F, -3.4655F, 0.139F, 0.0653F, -1.5233F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(22, 11).mirror().addBox(-2.9537F, -0.3007F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0989F, -1.4655F, 0.1006F, -0.0304F, -1.2285F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(8, 51).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0989F, -1.4655F, 0.0869F, -0.0592F, -0.9241F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(13, 22).mirror().addBox(-2.9537F, -0.3007F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0989F, -3.4655F, 0.1351F, 0.0303F, -1.1762F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(51, 9).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0989F, -3.4655F, 0.1379F, -0.0116F, -0.8736F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(51, 12).mirror().addBox(-3.6736F, -1.29F, -0.4463F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0989F, -5.4655F, 0.139F, 0.0653F, -1.5058F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(24, 16).mirror().addBox(-2.9537F, -0.3007F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0989F, -5.4655F, 0.1351F, 0.0303F, -1.1587F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(51, 41).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0989F, -5.4655F, 0.1379F, -0.0116F, -0.8561F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(42, 51).mirror().addBox(-3.6736F, -1.29F, -0.4463F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0989F, -7.4655F, 0.1599F, 0.1856F, -1.3985F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(24, 21).mirror().addBox(-2.9537F, -0.3007F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0989F, -7.4655F, 0.1959F, 0.1364F, -1.0489F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(52, 3).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0989F, -7.4655F, 0.2273F, 0.0718F, -0.7487F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(8, 51).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0989F, -1.4655F, 0.0869F, 0.0592F, 0.9241F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(22, 11).addBox(0.9537F, -0.3007F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0989F, -1.4655F, 0.1006F, 0.0304F, 1.2285F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(51, 9).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0989F, -3.4655F, 0.1379F, 0.0116F, 0.8736F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(13, 22).addBox(0.9537F, -0.3007F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0989F, -3.4655F, 0.1351F, -0.0303F, 1.1762F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(6, 35).addBox(2.6736F, -1.29F, -0.4463F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0989F, -3.4655F, 0.139F, -0.0653F, 1.5233F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(51, 41).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0989F, -5.4655F, 0.1379F, 0.0116F, 0.8561F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(24, 16).addBox(0.9537F, -0.3007F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0989F, -5.4655F, 0.1351F, -0.0303F, 1.1587F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(51, 12).addBox(2.6736F, -1.29F, -0.4463F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0989F, -5.4655F, 0.139F, -0.0653F, 1.5058F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(52, 3).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0989F, -7.4655F, 0.2273F, -0.0718F, 0.7487F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(24, 21).addBox(0.9537F, -0.3007F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0989F, -7.4655F, 0.1959F, -0.1364F, 1.0489F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(42, 51).addBox(2.6736F, -1.29F, -0.4463F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0989F, -7.4655F, 0.1599F, -0.1856F, 1.3985F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -8.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r43 = chest.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(27, 53).addBox(0.0F, -2.1F, -2.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 53).addBox(0.0F, -2.1F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 29).addBox(-0.5F, -1.7F, -2.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -1.2F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r44 = chest.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(13, 33).mirror().addBox(-0.5F, 0.0449F, -0.0607F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.0261F, -0.7531F, -0.0842F, -0.492F, 0.3958F));

		PartDefinition cube_r45 = chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(17, 5).mirror().addBox(-0.5F, 0.0449F, 0.1393F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.0261F, -0.7531F, -0.1914F, -0.8883F, 0.4803F));

		PartDefinition cube_r46 = chest.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(17, 11).mirror().addBox(-0.5F, 0.0449F, 0.1393F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.0261F, -0.7531F, -0.7681F, -1.3184F, 1.0139F));

		PartDefinition cube_r47 = chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(37, 43).mirror().addBox(0.0217F, -0.9621F, 0.2247F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 3.1281F, -2.8922F, 0.8398F, -0.3679F, -0.3814F));

		PartDefinition cube_r48 = chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(35, 13).mirror().addBox(-0.5F, -0.8913F, -0.26F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(35, 13).addBox(4.1F, -0.8913F, -0.26F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.3F, 2.4281F, -1.5922F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r49 = chest.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(11, 35).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3011F, -3.4655F, 0.5278F, 0.4443F, -0.7783F));

		PartDefinition cube_r50 = chest.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 12).mirror().addBox(-2.9537F, -0.3007F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3011F, -3.4655F, 0.3721F, 0.5784F, -1.0937F));

		PartDefinition cube_r51 = chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(18, 38).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1011F, -1.4655F, 0.344F, 0.178F, -0.7691F));

		PartDefinition cube_r52 = chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(7, 12).mirror().addBox(-2.9537F, -0.3007F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1011F, -1.4655F, 0.2769F, 0.272F, -1.0674F));

		PartDefinition cube_r53 = chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(26, 38).mirror().addBox(-3.6736F, -1.29F, -0.4463F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1011F, -1.4655F, 0.1884F, 0.3403F, -1.426F));

		PartDefinition cube_r54 = chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(37, 43).addBox(-1.0217F, -0.9621F, 0.2247F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3F, 3.1281F, -2.8922F, 0.8398F, 0.3679F, 0.3814F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(13, 33).addBox(-0.5F, 0.0449F, -0.0607F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0261F, -0.7531F, -0.0842F, 0.492F, -0.3958F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(17, 5).addBox(-0.5F, 0.0449F, 0.1393F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0261F, -0.7531F, -0.1914F, 0.8883F, -0.4803F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(17, 11).addBox(-0.5F, 0.0449F, 0.1393F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0261F, -0.7531F, -0.7681F, 1.3184F, -1.0139F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, -0.9093F, -0.2032F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.9009F, -2.4254F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 12).addBox(0.9537F, -0.3007F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3011F, -3.4655F, 0.3721F, -0.5784F, 1.0937F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(11, 35).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3011F, -3.4655F, 0.5278F, -0.4443F, 0.7783F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(26, 38).addBox(2.6736F, -1.29F, -0.4463F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1011F, -1.4655F, 0.1884F, -0.3403F, 1.426F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(7, 12).addBox(0.9537F, -0.3007F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1011F, -1.4655F, 0.2769F, -0.272F, 1.0674F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(18, 38).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1011F, -1.4655F, 0.344F, -0.178F, 0.7691F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(30, 22).addBox(-0.5887F, -0.9728F, -0.5471F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7F, 3.5F, -2.0F, -1.3493F, 0.1611F, -0.0674F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(0, 35).addBox(0.0F, -0.7F, 0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F))
				.texOffs(24, 33).addBox(0.0F, 0.1F, 0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-0.5887F, -0.8728F, 3.2529F, -1.2579F, -0.252F, -0.2177F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(0, 16).addBox(-0.9F, -0.7F, 0.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.0F, 3.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(30, 22).mirror().addBox(-0.4113F, -0.9728F, -0.5471F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 3.5F, -2.0F, -1.0003F, -0.1611F, 0.0674F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(0, 35).mirror().addBox(-1.0F, -0.7F, 0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(24, 33).mirror().addBox(-1.0F, 0.1F, 0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(0.5887F, -0.8728F, 3.2529F, -1.0577F, 0.3463F, 0.189F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-0.1F, -0.7F, 0.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.0F, 3.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, -3.5F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r64 = neck3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(24, 53).addBox(0.0F, -1.1512F, 0.9655F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 0).addBox(-0.5F, -0.9512F, -0.0345F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.9F, -2.8F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r65 = neck3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(12, 52).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4989F, -1.4655F, 0.3671F, 0.495F, -1.0473F));

		PartDefinition cube_r66 = neck3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(12, 52).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4989F, -1.4655F, 0.3671F, -0.495F, 1.0473F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2F, -2.4F, -0.6617F, 0.1427F, -0.1008F));

		PartDefinition cube_r67 = neck2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(8, 53).addBox(0.0F, -0.1986F, -0.0082F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 14).addBox(0.0F, -0.1986F, 1.9918F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 53).addBox(0.0F, -0.1986F, 3.9918F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, 0.0014F, -0.0082F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, -3.1F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r68 = neck2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(17, 52).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.2989F, -3.5655F, 0.2917F, 0.5403F, -1.1994F));

		PartDefinition cube_r69 = neck2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(52, 22).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.8989F, -2.2655F, 0.34F, 0.5132F, -1.1034F));

		PartDefinition cube_r70 = neck2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(52, 24).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3989F, -0.8655F, 0.2917F, 0.5403F, -1.1994F));

		PartDefinition cube_r71 = neck2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(17, 52).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.2989F, -3.5655F, 0.2917F, -0.5403F, 1.1994F));

		PartDefinition cube_r72 = neck2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(52, 22).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8989F, -2.2655F, 0.34F, -0.5132F, 1.1034F));

		PartDefinition cube_r73 = neck2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(52, 24).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3989F, -0.8655F, 0.2917F, -0.5403F, 1.1994F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.6F, -3.2F, -0.2898F, 0.3625F, -0.2154F));

		PartDefinition cube_r74 = neck.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(46, 52).addBox(0.0F, -0.2379F, -1.9756F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(37, 21).addBox(-0.5F, -0.0379F, -2.9756F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.3578F, 0.0688F, -0.1222F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -2.1F, -0.1309F, 0.3491F, 0.0F));

		PartDefinition cube_r75 = head.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(38, 35).mirror().addBox(-0.3F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-0.2278F, 0.7488F, -3.3205F, 0.2288F, 0.0F, -0.0215F));

		PartDefinition cube_r76 = head.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(31, 44).mirror().addBox(-0.3F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.342F)).mirror(false)
				.texOffs(44, 38).mirror().addBox(-0.43F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.34F)).mirror(false), PartPose.offsetAndRotation(-0.33F, 0.7081F, -4.6028F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r77 = head.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(5, 45).mirror().addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false)
				.texOffs(47, 3).mirror().addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(9, 47).mirror().addBox(-0.5F, -0.1F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 47).mirror().addBox(-0.5F, -0.7F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false)
				.texOffs(19, 46).mirror().addBox(-0.5F, -0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(41, 46).mirror().addBox(-0.5F, -0.1F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(0, 47).addBox(0.16F, -0.7F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F))
				.texOffs(47, 3).addBox(0.16F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(5, 45).addBox(0.16F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F))
				.texOffs(19, 46).addBox(0.16F, -0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(41, 46).addBox(0.16F, -0.1F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(9, 47).addBox(0.16F, -0.1F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.33F, 0.0793F, -3.1521F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r78 = head.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(46, 45).mirror().addBox(-0.5F, -0.3102F, -0.7345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(46, 45).addBox(0.16F, -0.3102F, -0.7345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.33F, -0.3207F, -3.0521F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r79 = head.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(46, 41).mirror().addBox(-0.5F, -0.325F, -0.7105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(46, 41).addBox(0.16F, -0.325F, -0.7105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.33F, -0.0207F, -3.3521F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r80 = head.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(38, 35).addBox(-0.7F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(0.2278F, 0.7488F, -3.3205F, 0.2288F, 0.0F, 0.0215F));

		PartDefinition cube_r81 = head.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(48, 26).mirror().addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(48, 26).addBox(0.16F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.33F, -0.0097F, -1.7411F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r82 = head.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(47, 35).mirror().addBox(-0.5F, -0.862F, -0.9409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false)
				.texOffs(47, 35).addBox(0.16F, -0.862F, -0.9409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.33F, 0.1903F, -0.9411F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r83 = head.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(48, 20).mirror().addBox(-0.5F, -0.2357F, -0.8908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.33F, -0.5097F, -1.1411F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r84 = head.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(26, 44).mirror().addBox(-0.52F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(44, 0).mirror().addBox(-0.74F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(44, 0).addBox(0.4F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(26, 44).addBox(0.18F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.33F, -0.0097F, -1.7411F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r85 = head.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(34, 47).mirror().addBox(-0.5F, -0.9331F, -0.8493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.33F, 0.5903F, -1.7411F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r86 = head.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(48, 14).mirror().addBox(-0.5F, -0.0801F, -0.8998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.33F, -0.6097F, -1.9411F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r87 = head.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(48, 32).mirror().addBox(0.0989F, -0.8379F, -0.8588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(42, 11).mirror().addBox(0.2989F, -0.8379F, -2.6588F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.7F, -1.8F, 0.124F, 0.0F, -0.0215F));

		PartDefinition cube_r88 = head.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(19, 42).mirror().addBox(-1.0F, -0.9299F, -1.8709F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.3F, 1.0F, -0.2F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r89 = head.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(47, 10).mirror().addBox(-0.5F, 0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false)
				.texOffs(29, 47).mirror().addBox(-0.5F, -0.3F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false)
				.texOffs(47, 29).mirror().addBox(-0.5F, 0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(29, 47).addBox(0.56F, -0.3F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F))
				.texOffs(47, 10).addBox(0.56F, 0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F))
				.texOffs(47, 29).addBox(0.56F, 0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.53F, 0.0905F, -0.2885F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r90 = head.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(47, 23).mirror().addBox(-0.5F, -0.6845F, -0.6187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(47, 23).addBox(0.56F, -0.6845F, -0.6187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.53F, 0.0905F, -0.4885F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r91 = head.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(24, 47).mirror().addBox(-0.5F, -0.6752F, -0.661F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(24, 47).addBox(0.56F, -0.6752F, -0.661F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.53F, 0.1905F, -0.4885F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r92 = head.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(28, 50).mirror().addBox(-1.0F, -0.1417F, 0.0305F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(28, 50).addBox(-0.6F, -0.1417F, 0.0305F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.3F, -0.4F, -0.7F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r93 = head.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(20, 33).mirror().addBox(-0.51F, -0.5095F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false)
				.texOffs(42, 43).mirror().addBox(-0.51F, -0.5095F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false)
				.texOffs(20, 33).addBox(0.37F, -0.5095F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F))
				.texOffs(42, 43).addBox(0.37F, -0.5095F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-0.43F, -0.2505F, -0.461F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r94 = head.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(50, 17).mirror().addBox(-0.5F, -0.0022F, 0.5914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(23, 50).mirror().addBox(-0.5F, -0.0022F, -0.0086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(50, 17).addBox(-0.1F, -0.0022F, 0.5914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(23, 50).addBox(-0.1F, -0.0022F, -0.0086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2F, -0.6F, -2.8F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r95 = head.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(50, 47).mirror().addBox(-1.0F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(50, 47).addBox(-0.6F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.7F, -1.3F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r96 = head.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(48, 32).addBox(-1.0989F, -0.8379F, -0.8588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(42, 11).addBox(-1.2989F, -0.8379F, -2.6588F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.9F, 0.7F, -1.8F, 0.124F, 0.0F, 0.0215F));

		PartDefinition cube_r97 = head.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(49, 38).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(49, 50).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.5417F, -4.1533F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r98 = head.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(49, 0).addBox(-0.5F, -0.2F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F))
				.texOffs(18, 49).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.8782F, -4.6518F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r99 = head.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(45, 48).addBox(-0.5F, -0.05F, -1.2605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.256F))
				.texOffs(13, 49).addBox(-0.5F, -0.25F, -1.2605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(38, 49).addBox(-0.5F, -0.25F, -0.7605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.252F)), PartPose.offsetAndRotation(0.0F, 0.4417F, -4.6533F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r100 = head.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(48, 14).addBox(-0.5F, -0.0801F, -0.8998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.33F, -0.6097F, -1.9411F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r101 = head.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(48, 20).addBox(-0.5F, -0.2357F, -0.8908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.33F, -0.5097F, -1.1411F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r102 = head.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(34, 47).addBox(-0.5F, -0.9331F, -0.8493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.33F, 0.5903F, -1.7411F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r103 = head.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(31, 44).addBox(-0.7F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.342F))
				.texOffs(44, 38).addBox(-0.57F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.34F)), PartPose.offsetAndRotation(0.33F, 0.7081F, -4.6028F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r104 = head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(0, 51).addBox(-1.0F, 0.0239F, -0.2811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.4F, -3.5F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r105 = head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(33, 50).addBox(-0.5F, -0.0023F, -0.4163F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.8F, -0.9F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r106 = head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(19, 42).addBox(0.0F, -0.9299F, -1.8709F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3F, 1.0F, -0.2F, -0.2269F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(50, 43).addBox(-0.1F, -0.2F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(30, 28).addBox(-0.1F, -0.2F, -2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(50, 43).mirror().addBox(-0.9F, -0.2F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(30, 28).mirror().addBox(-0.9F, -0.2F, -2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9F, 0.4F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r107 = jaw.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(38, 28).addBox(-0.5F, -0.9165F, -1.6194F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.253F))
				.texOffs(38, 39).addBox(-0.5F, -0.6165F, -1.6194F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 1.0F, -4.2F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r108 = jaw.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(21, 38).mirror().addBox(-0.7F, -0.2032F, -0.1801F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.22F)).mirror(false)
				.texOffs(21, 38).addBox(-0.3F, -0.2032F, -0.1801F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(0.0F, 0.3F, -4.3F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r109 = jaw.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(42, 6).mirror().addBox(-0.7F, -0.8227F, -1.7204F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(42, 6).addBox(-0.3F, -0.8227F, -1.7204F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.9F, -2.7F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r110 = jaw.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(26, 40).mirror().addBox(-1.04F, -0.4722F, -1.6632F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(26, 40).addBox(-0.16F, -0.4722F, -1.6632F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.1F, -0.1F, 0.0F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r111 = jaw.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(0, 40).mirror().addBox(-1.0F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(0, 40).addBox(-0.2F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1F, 0.8F, -1.1F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r112 = jaw.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-0.73F, 1.7F, 1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.34F)).mirror(false), PartPose.offsetAndRotation(-0.33F, -0.1919F, -5.0028F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r113 = jaw.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(4, 49).mirror().addBox(-1.0F, -0.2F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(49, 6).mirror().addBox(-1.0F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(4, 49).addBox(-0.2F, -0.2F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(49, 6).addBox(-0.2F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.1F, 0.0F, -1.9F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r114 = jaw.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(0, 44).addBox(-0.27F, 1.7F, 1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.34F)), PartPose.offsetAndRotation(0.33F, -0.1919F, -5.0028F, 0.5585F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 58, 58);
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