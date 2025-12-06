package fossils.fossils.client.blockentity.model.vancleavea;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class VancleaveaFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart FrontFlipperR3;
	private final ModelPart leftArm2;
	private final ModelPart FrontFlipperMiddleR3;
	private final ModelPart FrontFlipperR5;
	private final ModelPart rightArm2;
	private final ModelPart FrontFlipperMiddleR5;
	private final ModelPart bone2;
	private final ModelPart bone5;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;
	private final ModelPart tail10;
	private final ModelPart body;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart body5;
	private final ModelPart chest;
	private final ModelPart FrontFlipperR2;
	private final ModelPart leftArm;
	private final ModelPart FrontFlipperMiddleR2;
	private final ModelPart FrontFlipperR4;
	private final ModelPart rightArm;
	private final ModelPart FrontFlipperMiddleR4;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart lower_jaw;
	private final ModelPart bone3;

	public VancleaveaFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.FrontFlipperR3 = this.hips.getChild("FrontFlipperR3");
		this.leftArm2 = this.FrontFlipperR3.getChild("leftArm2");
		this.FrontFlipperMiddleR3 = this.leftArm2.getChild("FrontFlipperMiddleR3");
		this.FrontFlipperR5 = this.hips.getChild("FrontFlipperR5");
		this.rightArm2 = this.FrontFlipperR5.getChild("rightArm2");
		this.FrontFlipperMiddleR5 = this.rightArm2.getChild("FrontFlipperMiddleR5");
		this.bone2 = this.hips.getChild("bone2");
		this.bone5 = this.hips.getChild("bone5");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
		this.tail10 = this.tail9.getChild("tail10");
		this.body = this.hips.getChild("body");
		this.body3 = this.body.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.body5 = this.body4.getChild("body5");
		this.chest = this.body5.getChild("chest");
		this.FrontFlipperR2 = this.chest.getChild("FrontFlipperR2");
		this.leftArm = this.FrontFlipperR2.getChild("leftArm");
		this.FrontFlipperMiddleR2 = this.leftArm.getChild("FrontFlipperMiddleR2");
		this.FrontFlipperR4 = this.chest.getChild("FrontFlipperR4");
		this.rightArm = this.FrontFlipperR4.getChild("rightArm");
		this.FrontFlipperMiddleR4 = this.rightArm.getChild("FrontFlipperMiddleR4");
		this.bone = this.chest.getChild("bone");
		this.bone4 = this.chest.getChild("bone4");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.lower_jaw = this.head.getChild("lower_jaw");
		this.bone3 = root.getChild("bone3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -15.9623F, 9.9865F, 0.1028F, -0.0305F, 0.1273F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(5, 37).addBox(-0.5F, -0.3904F, 7.266F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 31).addBox(-0.5F, -0.3904F, 0.566F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.2266F, -3.0755F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 33).addBox(-2.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.2248F, -0.2407F, -1.5708F, 0.2618F, 1.5708F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(5, 36).addBox(-0.5F, -4.3904F, 0.066F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -1.2266F, -3.0755F, -1.8326F, 0.0F, 0.0F));

		PartDefinition FrontFlipperR3 = hips.addOrReplaceChild("FrontFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5657F, 1.3527F, -0.2456F, -0.4452F, -1.1312F, 1.322F));

		PartDefinition leftArm2 = FrontFlipperR3.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(6.8631F, -0.1811F, -1.2056F, 3.1416F, 0.6109F, 0.0F));

		PartDefinition FrontFlipperMiddleR3 = leftArm2.addOrReplaceChild("FrontFlipperMiddleR3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1626F, -0.0346F, -3.1141F, -0.0418F, 0.7409F, -0.0591F));

		PartDefinition FrontFlipperR5 = hips.addOrReplaceChild("FrontFlipperR5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5657F, 1.3527F, -0.2456F, -0.0607F, 1.0464F, -1.3333F));

		PartDefinition rightArm2 = FrontFlipperR5.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.8631F, -0.1811F, -1.2056F, 3.1416F, -0.6109F, 0.0F));

		PartDefinition FrontFlipperMiddleR5 = rightArm2.addOrReplaceChild("FrontFlipperMiddleR5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1626F, -0.0346F, -3.1141F, -0.0418F, -0.7409F, 0.0591F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2328F, -1.5262F, 1.1557F, 0.0F, 0.0F, 0.1309F));

		PartDefinition bone5 = hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2328F, -1.5262F, 1.1557F, 0.0F, 0.0F, -0.1309F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6542F, 4.6243F, 0.12F, -0.13F, -0.0156F));

		PartDefinition cube_r4 = tail.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(44, 7).addBox(-0.5F, -0.2432F, -0.4009F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1844F, 0.3155F, -0.4363F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.1641F, 5.6001F, -0.1711F, -0.0715F, 0.1006F));

		PartDefinition cube_r5 = tail2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(5, 45).addBox(-0.5F, 0.4F, 0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 40).addBox(-0.5F, 0.4F, -4.8F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9117F, 5.6011F, -0.0311F, -0.1732F, 0.0488F));

		PartDefinition cube_r6 = tail3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(40, 29).addBox(-1.0F, -0.25F, -2.75F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 1.2749F, 2.4865F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8214F, 5.7215F, -0.0867F, -0.1704F, 0.0579F));

		PartDefinition cube_r7 = tail4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(52, 4).addBox(-0.5F, 2.45F, -1.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(48, 0).addBox(-0.5F, 2.45F, -6.65F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.8166F, 6.3062F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(49, 37).addBox(-0.5F, 0.1675F, -0.0812F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.343F, 4.8318F, -0.0616F, -0.0871F, 0.0054F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0146F, 4.9356F, 0.0618F, 0.1742F, 0.0107F));

		PartDefinition cube_r8 = tail6.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(17, 55).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(13, 51).addBox(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6675F, 4.5188F, 0.0F, -0.0131F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(0, 48).addBox(-0.5F, 0.1675F, -0.1812F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0111F, 5.0006F, -0.0061F, 0.2617F, -0.0448F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(39, 52).addBox(-0.5F, 0.1675F, -0.3812F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(43, 56).addBox(-0.5F, 0.1675F, 4.3188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0194F, 4.9264F, -0.1213F, 0.1636F, -0.1064F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0097F, 4.8979F, -0.2278F, 0.2463F, -0.0997F));

		PartDefinition cube_r9 = tail9.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(59, 7).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6675F, 2.1188F, 0.0F, 0.0524F, 0.0F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(59, 21).addBox(-0.5F, 0.42F, -0.2033F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2525F, 4.0221F, -0.1806F, 0.2577F, -0.0465F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2823F, -2.1294F, -0.2132F, 0.1689F, -0.0441F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(23, 29).addBox(-0.5F, -0.6F, 8.8974F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.197F, -15.9052F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4524F, -6.868F, -0.1431F, 0.1307F, -0.0073F));

		PartDefinition cube_r11 = body3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(39, 43).addBox(-0.5F, 0.3284F, 9.2779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(34, 38).addBox(-0.5F, 0.3284F, 3.5779F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.498F, -9.9468F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2962F, -5.9764F, -0.0548F, 0.1744F, 0.0056F));

		PartDefinition cube_r12 = body4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(26, 52).addBox(-0.5F, 0.3284F, 3.8779F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.425F, -4.85F, -0.0392F, 0.2616F, -0.0101F));

		PartDefinition cube_r13 = body5.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(24, 59).addBox(-0.5F, 0.3285F, 5.1529F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition chest = body5.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3346F, -3.9803F, 0.0319F, 0.0F, 0.0F));

		PartDefinition cube_r14 = chest.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(54, 60).addBox(-0.5F, 0.3285F, 8.4779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(52, 58).addBox(-0.5F, 0.3285F, 4.7779F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r15 = chest.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(47, 53).addBox(-2.2F, -0.5F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.5764F, -1.2169F, -1.5708F, 0.0785F, -1.5708F));

		PartDefinition cube_r16 = chest.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(51, 57).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 0.8847F, -1.4287F, -1.4923F, 0.0F, 0.0F));

		PartDefinition FrontFlipperR2 = chest.addOrReplaceChild("FrontFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0653F, 5.0721F, -1.4495F, 2.8217F, -0.6972F, -1.6355F));

		PartDefinition leftArm = FrontFlipperR2.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3981F, 0.0189F, -2.4096F, 0.0F, 0.7854F, 0.0F));

		PartDefinition FrontFlipperMiddleR2 = leftArm.addOrReplaceChild("FrontFlipperMiddleR2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0757F, -0.0334F, -1.7771F, 0.2114F, 0.4067F, 0.3618F));

		PartDefinition FrontFlipperR4 = chest.addOrReplaceChild("FrontFlipperR4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0653F, 5.0721F, -1.4495F, 2.0217F, 0.782F, 0.6839F));

		PartDefinition rightArm = FrontFlipperR4.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3981F, 0.0189F, -2.4096F, 0.0F, -0.7418F, 0.0F));

		PartDefinition FrontFlipperMiddleR4 = rightArm.addOrReplaceChild("FrontFlipperMiddleR4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0757F, -0.0334F, -1.7771F, 0.051F, -0.453F, 0.0192F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.7367F, 4.9202F, -1.2658F, -0.0115F, 0.1304F, -0.088F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7367F, 4.9202F, -1.2658F, -0.0115F, -0.1304F, 0.088F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3832F, -3.7571F, -0.1318F, 0.2616F, -0.0115F));

		PartDefinition cube_r17 = neck.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(16, 61).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(13, 58).addBox(-0.5F, -0.5F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.588F, -0.4933F, -0.0873F, 0.0304F, -0.0027F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.387F, -3.8692F, -0.1392F, 0.4346F, -0.0403F));

		PartDefinition cube_r18 = neck2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(55, 27).addBox(-1.0F, -2.2F, -2.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 2.2293F, -1.2392F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3445F, -3.8761F, -0.2287F, 0.305F, -0.0163F));

		PartDefinition cube_r19 = neck3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(65, 60).addBox(-1.0F, -2.2F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(63, 58).addBox(-1.0F, -2.2F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 2.2293F, -1.2392F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.269F, -2.9305F, -0.1332F, 0.2581F, 0.0444F));

		PartDefinition cube_r20 = neck4.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(62, 39).addBox(-1.0F, -2.2F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 2.2293F, -1.2392F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0503F, -3.7083F, -0.0231F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.2548F, 0.2675F, 0.315F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.2548F, 0.2675F, 0.315F));

		PartDefinition lower_jaw = head.addOrReplaceChild("lower_jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2551F, 1.1322F, 0.48F, 0.0F, 0.0F));

		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 114, 114);
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