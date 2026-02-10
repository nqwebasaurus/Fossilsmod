package fossils.fossils.client.blockentity.model.olorotitan;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class OlorotitanFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone5;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart leftLeg5;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart rightLeg5;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart chest2;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart neck9;
	private final ModelPart neck10;
	private final ModelPart heads;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart opposablePinkie;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart opposablePinkie4;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;

	public OlorotitanFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone5 = this.hips.getChild("bone5");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.leftLeg5 = this.leftLeg4.getChild("leftLeg5");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.rightLeg5 = this.rightLeg4.getChild("rightLeg5");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.chest2 = this.chest.getChild("chest2");
		this.neck4 = this.chest2.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck5 = this.neck2.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.neck7 = this.neck6.getChild("neck7");
		this.neck8 = this.neck7.getChild("neck8");
		this.neck9 = this.neck8.getChild("neck9");
		this.neck10 = this.neck9.getChild("neck10");
		this.heads = this.neck10.getChild("heads");
		this.leftFace = this.heads.getChild("leftFace");
		this.rightFace = this.heads.getChild("rightFace");
		this.jaw = this.heads.getChild("jaw");
		this.bone2 = this.chest.getChild("bone2");
		this.bone3 = this.chest.getChild("bone3");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.opposablePinkie = this.leftArm3.getChild("opposablePinkie");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.opposablePinkie4 = this.rightArm3.getChild("opposablePinkie4");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(0.3F, -14.0F, 10.0F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.4F, -4.5F, -0.5F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(2.4F, -13.5F, -25.5F, 0.0F, -0.2531F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(4.1194F, -7.0866F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.4F, -13.5F, -25.5F, -0.2345F, -0.096F, 1.1894F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(2.5F, -3.5F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, -14.5F, 10.5F, 0.0F, 0.0F, 0.6545F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -14.5978F, 8.6869F, -0.0937F, -0.0932F, -0.7412F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 0).addBox(-0.5F, 0.9F, 1.0F, 1.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4114F, -5.2615F, -0.1396F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7829F, -1.8225F, 2.204F, -0.0436F, 0.0F, 0.0F));

		PartDefinition bone5 = hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7829F, 1.4775F, 2.204F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, 2.9353F, 1.9589F, -0.8007F, -0.2496F, -0.3978F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.0832F, 0.862F, 2.0525F, 0.1997F, 0.0243F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 21.4775F, -1.5079F, -1.7453F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.5049F, -0.0014F, 1.9236F, -0.0609F, 0.1637F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4935F, -3.7282F, -0.48F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, 2.9353F, 1.9589F, -0.3202F, -0.1624F, -0.4537F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.0832F, 0.862F, 1.0972F, 0.3853F, -0.1903F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 21.4775F, -1.5079F, -0.7418F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.5049F, -0.0014F, 1.7104F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4935F, -3.7282F, -0.2618F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(27, 50).addBox(-0.5F, 0.3445F, -9.7243F, 1.0F, 2.0F, 10.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.7114F, -4.2632F, -0.279F, 0.0053F, 0.0871F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(75, 25).addBox(-0.5F, -1.0F, -6.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3478F, -9.658F, 0.0786F, 0.0522F, 0.0041F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7319F, -15.9168F, -0.167F, -0.1982F, 0.1237F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(103, 87).addBox(-0.5F, 0.9552F, -3.9381F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.6612F, -4.6119F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(73, 89).addBox(-0.5F, 0.9552F, 2.9619F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.0671F, -7.1483F, 0.5061F, 0.0F, 0.0F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 4.7444F, -6.939F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r8 = chest2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(27, 63).addBox(-0.5F, 0.9135F, -2.2046F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 2.943F, -3.7443F, 0.8203F, 0.0F, 0.0F));

		PartDefinition neck4 = chest2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 4.975F, -4.6417F, 0.286F, -0.1856F, 0.0399F));

		PartDefinition cube_r9 = neck4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(90, 8).addBox(-0.5F, -1.075F, -2.35F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.2935F, -1.4671F, 0.4974F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.155F, -3.7114F, 0.7337F, -0.4916F, 0.0247F));

		PartDefinition cube_r10 = neck3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 96).addBox(-0.5F, -0.9487F, 2.0661F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.9164F, -6.5763F, -0.4712F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5698F, -3.8805F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r11 = neck2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(110, 53).addBox(-0.45F, -1.9F, 4.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(106, 49).addBox(-0.45F, -1.9F, -0.1F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.072F, -1.625F, -4.6607F, -0.6984F, -0.0271F, 0.022F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0363F, -2.8389F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r12 = neck5.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(123, 32).addBox(-0.6F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1917F, -1.7416F, -0.9206F, 0.0095F, -0.2267F, 0.0337F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.2939F, 0.002F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r13 = neck6.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(123, 39).addBox(-0.425F, 3.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(123, 39).addBox(-0.425F, -0.1F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1401F, -4.0949F, -0.9572F, -0.004F, -0.2967F, 0.0137F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.6964F, -0.0483F, -0.1607F, -0.3777F, 0.1102F));

		PartDefinition cube_r14 = neck7.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(124, 78).addBox(-0.4822F, 3.3286F, 0.1988F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0178F, -7.2286F, -2.1988F, 0.0035F, 0.133F, 0.0426F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.8F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r15 = neck8.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(124, 85).addBox(-0.4822F, -0.3714F, 0.1988F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0178F, -3.4286F, -2.1988F, 0.0028F, 0.1362F, 0.0308F));

		PartDefinition neck9 = neck8.addOrReplaceChild("neck9", CubeListBuilder.create().texOffs(127, 62).addBox(-0.5F, -2.8F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.775F, 0.0F, 0.3503F, -0.082F, -0.0299F));

		PartDefinition neck10 = neck9.addOrReplaceChild("neck10", CubeListBuilder.create().texOffs(129, 10).addBox(-0.5F, -3.1F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.525F, 0.1F, 0.5236F, 0.0F, 0.0F));

		PartDefinition heads = neck10.addOrReplaceChild("heads", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.647F, 0.6345F, -0.8311F, -0.1813F, 0.1257F));

		PartDefinition leftFace = heads.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.5F, -1.4735F, -2.7839F));

		PartDefinition rightFace = heads.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.5F, -1.4735F, -2.7839F));

		PartDefinition jaw = heads.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.037F, -1.7743F, 0.2094F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, 8.6532F, -1.8449F, -0.2182F, 0.0F, 0.0F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, 8.6532F, -1.8449F, -0.2182F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5484F, 18.3354F, -5.8512F, 0.9324F, 0.0055F, 0.0275F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.89F, 10.3795F, 0.7985F, -1.9603F, 0.0933F, -0.836F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1687F, 11.7783F, -0.4397F, 0.2545F, 0.3983F, 0.157F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1322F, -0.8271F, 0.6955F, 0.1222F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5484F, 18.3354F, -5.8512F, 1.5826F, -0.2952F, -0.3772F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.89F, 10.3795F, 0.7985F, -1.1905F, 0.6988F, 1.7971F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1687F, 11.7783F, -0.4397F, 0.2545F, -0.3983F, -0.157F));

		PartDefinition opposablePinkie4 = rightArm3.addOrReplaceChild("opposablePinkie4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1322F, -0.8271F, 0.6955F, 0.1222F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7049F, 10.2252F, -0.1762F, 0.0738F, 0.0379F));

		PartDefinition cube_r16 = tail.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(1, 35).addBox(-0.5F, -1.0F, 3.0F, 1.0F, 2.0F, 12.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.9283F, -2.9733F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(31, 22).addBox(-0.5F, 0.4F, 0.0F, 1.0F, 2.0F, 13.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2717F, 12.0267F, -0.2427F, 0.3153F, 0.0356F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 12.9F, -0.242F, 0.2405F, 0.127F));

		PartDefinition cube_r17 = tail3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(13, 31).addBox(-0.5F, -1.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0236F, 1.2229F, 13.8001F, 0.0134F, 0.2094F, -0.2939F));

		PartDefinition cube_r18 = tail3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -0.9F, 0.0F, 1.0F, 2.0F, 14.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.3F, 0.0F, 0.0131F, 0.0F, -0.2967F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0371F, 13.9019F, -0.1422F, 0.2171F, -0.0194F));

		PartDefinition cube_r19 = tail4.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(70, 8).addBox(-0.575F, -0.5F, -4.3F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6F, 4.6F, -0.0023F, 0.0173F, -0.1309F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0094F, 8.0654F, 0.0869F, 0.1203F, 0.1407F));

		PartDefinition cube_r20 = tail5.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(45, 70).addBox(-0.425F, -0.5F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6F, 3.8F, 0.0F, -0.0175F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, 0.0352F, 0.212F, 0.182F));

		PartDefinition cube_r21 = tail6.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(71, 77).addBox(-0.5F, 0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(64, 70).addBox(-0.5F, 0.1F, -8.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, 0.0F, -0.0175F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(52, 59).addBox(-0.5F, 0.1F, -0.1F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.0244F, -0.1318F, 0.0259F));

		return LayerDefinition.create(meshdefinition, 156, 156);
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