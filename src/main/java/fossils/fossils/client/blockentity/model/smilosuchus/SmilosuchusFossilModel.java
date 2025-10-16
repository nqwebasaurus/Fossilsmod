package fossils.fossils.client.blockentity.model.smilosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SmilosuchusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart frontLeftLeg;
	private final ModelPart frontLeftLeg2;
	private final ModelPart frontLeftLeg3;
	private final ModelPart frontLeftLeg4;
	private final ModelPart frontRightLeg;
	private final ModelPart frontRightLeg2;
	private final ModelPart frontRightLeg3;
	private final ModelPart frontRightLeg4;
	private final ModelPart body2;
	private final ModelPart tail;
	private final ModelPart backLeftLeg;
	private final ModelPart backLeftLeg2;
	private final ModelPart backLeftLeg3;
	private final ModelPart backLeftLeg4;
	private final ModelPart backRightLeg;
	private final ModelPart backRightLeg2;
	private final ModelPart backRightLeg3;
	private final ModelPart backRightLeg4;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftFace;
	private final ModelPart rightFace;

	public SmilosuchusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.frontLeftLeg = this.body.getChild("frontLeftLeg");
		this.frontLeftLeg2 = this.frontLeftLeg.getChild("frontLeftLeg2");
		this.frontLeftLeg3 = this.frontLeftLeg2.getChild("frontLeftLeg3");
		this.frontLeftLeg4 = this.frontLeftLeg3.getChild("frontLeftLeg4");
		this.frontRightLeg = this.body.getChild("frontRightLeg");
		this.frontRightLeg2 = this.frontRightLeg.getChild("frontRightLeg2");
		this.frontRightLeg3 = this.frontRightLeg2.getChild("frontRightLeg3");
		this.frontRightLeg4 = this.frontRightLeg3.getChild("frontRightLeg4");
		this.body2 = this.body.getChild("body2");
		this.tail = this.body2.getChild("tail");
		this.backLeftLeg = this.tail.getChild("backLeftLeg");
		this.backLeftLeg2 = this.backLeftLeg.getChild("backLeftLeg2");
		this.backLeftLeg3 = this.backLeftLeg2.getChild("backLeftLeg3");
		this.backLeftLeg4 = this.backLeftLeg3.getChild("backLeftLeg4");
		this.backRightLeg = this.tail.getChild("backRightLeg");
		this.backRightLeg2 = this.backRightLeg.getChild("backRightLeg2");
		this.backRightLeg3 = this.backRightLeg2.getChild("backRightLeg3");
		this.backRightLeg4 = this.backRightLeg3.getChild("backRightLeg4");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.neck = this.body.getChild("neck");
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

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.9473F, -11.6417F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(99, 61).addBox(-1.5F, -0.0208F, -0.039F, 3.0F, 3.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -4.5158F, -6.8887F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(82, 23).addBox(-1.5F, -1.0208F, 0.161F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3F, -13.05F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(80, 53).addBox(-1.5F, -0.6F, -3.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -3.6274F, -15.8621F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(99, 59).mirror().addBox(-9.5748F, -0.1973F, 0.0884F, 10.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7086F, 9.7757F, -9.7224F, 1.6857F, 0.7784F, 0.2007F));

		PartDefinition body16_r1 = body.addOrReplaceChild("body16_r1", CubeListBuilder.create().texOffs(116, 5).mirror().addBox(-6.4538F, -1.309F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.538F, -17.5433F, 0.3331F, 0.5701F, -1.2349F));

		PartDefinition body15_r1 = body.addOrReplaceChild("body15_r1", CubeListBuilder.create().texOffs(139, 20).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.538F, -17.5433F, 0.5685F, 0.336F, -0.7107F));

		PartDefinition body14_r1 = body.addOrReplaceChild("body14_r1", CubeListBuilder.create().texOffs(139, 51).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.538F, -17.5433F, 0.6449F, 0.0947F, -0.3593F));

		PartDefinition body15_r2 = body.addOrReplaceChild("body15_r2", CubeListBuilder.create().texOffs(103, 9).mirror().addBox(-8.4538F, -1.309F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.138F, -15.5433F, 0.2851F, 0.4935F, -1.1368F));

		PartDefinition body14_r2 = body.addOrReplaceChild("body14_r2", CubeListBuilder.create().texOffs(139, 16).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.138F, -15.5433F, 0.4906F, 0.2905F, -0.6123F));

		PartDefinition body13_r1 = body.addOrReplaceChild("body13_r1", CubeListBuilder.create().texOffs(139, 49).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.138F, -15.5433F, 0.5592F, 0.0781F, -0.2441F));

		PartDefinition body14_r3 = body.addOrReplaceChild("body14_r3", CubeListBuilder.create().texOffs(97, 19).mirror().addBox(-11.4538F, -1.309F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.138F, -13.5433F, 0.2683F, 0.4624F, -1.092F));

		PartDefinition body13_r2 = body.addOrReplaceChild("body13_r2", CubeListBuilder.create().texOffs(139, 14).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.138F, -13.5433F, 0.4608F, 0.271F, -0.568F));

		PartDefinition body12_r1 = body.addOrReplaceChild("body12_r1", CubeListBuilder.create().texOffs(139, 47).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.138F, -13.5433F, 0.5254F, 0.0703F, -0.1941F));

		PartDefinition body13_r3 = body.addOrReplaceChild("body13_r3", CubeListBuilder.create().texOffs(97, 17).mirror().addBox(-11.4538F, -1.309F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.138F, -11.5433F, 0.2689F, 0.4622F, -1.0742F));

		PartDefinition body12_r2 = body.addOrReplaceChild("body12_r2", CubeListBuilder.create().texOffs(139, 12).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.138F, -11.5433F, 0.4613F, 0.2706F, -0.5504F));

		PartDefinition body11_r1 = body.addOrReplaceChild("body11_r1", CubeListBuilder.create().texOffs(139, 45).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.138F, -11.5433F, 0.5256F, 0.0698F, -0.1766F));

		PartDefinition body12_r3 = body.addOrReplaceChild("body12_r3", CubeListBuilder.create().texOffs(97, 15).mirror().addBox(-11.4538F, -1.309F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.138F, -9.5433F, 0.2691F, 0.4624F, -1.0044F));

		PartDefinition body11_r2 = body.addOrReplaceChild("body11_r2", CubeListBuilder.create().texOffs(139, 10).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.138F, -9.5433F, 0.4615F, 0.2707F, -0.4805F));

		PartDefinition body10_r1 = body.addOrReplaceChild("body10_r1", CubeListBuilder.create().texOffs(139, 43).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.138F, -9.5433F, 0.5259F, 0.0698F, -0.1068F));

		PartDefinition body10_r2 = body.addOrReplaceChild("body10_r2", CubeListBuilder.create().texOffs(139, 8).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.038F, -7.5433F, 0.4468F, 0.2605F, -0.5018F));

		PartDefinition body9_r1 = body.addOrReplaceChild("body9_r1", CubeListBuilder.create().texOffs(139, 41).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.038F, -7.5433F, 0.5089F, 0.0655F, -0.1253F));

		PartDefinition body11_r3 = body.addOrReplaceChild("body11_r3", CubeListBuilder.create().texOffs(97, 13).mirror().addBox(-11.4538F, -1.309F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.038F, -7.5433F, 0.261F, 0.4465F, -1.0253F));

		PartDefinition body10_r3 = body.addOrReplaceChild("body10_r3", CubeListBuilder.create().texOffs(95, 87).mirror().addBox(-11.4538F, -1.309F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.038F, -5.5433F, 0.2531F, 0.4305F, -1.0461F));

		PartDefinition body9_r2 = body.addOrReplaceChild("body9_r2", CubeListBuilder.create().texOffs(83, 99).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.038F, -5.5433F, 0.4321F, 0.2502F, -0.5229F));

		PartDefinition body8_r1 = body.addOrReplaceChild("body8_r1", CubeListBuilder.create().texOffs(118, 75).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.038F, -5.5433F, 0.4918F, 0.0612F, -0.1438F));

		PartDefinition body7_r1 = body.addOrReplaceChild("body7_r1", CubeListBuilder.create().texOffs(139, 36).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.162F, -3.5433F, 0.4577F, 0.0538F, -0.1457F));

		PartDefinition body9_r3 = body.addOrReplaceChild("body9_r3", CubeListBuilder.create().texOffs(95, 89).mirror().addBox(-11.4538F, -1.309F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.162F, -3.5433F, 0.2364F, 0.3991F, -1.0527F));

		PartDefinition body8_r2 = body.addOrReplaceChild("body8_r2", CubeListBuilder.create().texOffs(139, 6).mirror().addBox(-1.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.162F, -3.5433F, 0.4023F, 0.2306F, -0.5299F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(129, 31).mirror().addBox(-1.1749F, -0.3385F, 2.0098F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 5.5429F, -16.2788F, -0.5465F, -0.0322F, -0.8295F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(129, 14).mirror().addBox(-1.1749F, -2.0115F, 1.9131F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 5.5429F, -16.2788F, -0.9479F, -0.0322F, -0.8295F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(120, 31).mirror().addBox(-1.1749F, 1.3565F, 1.0214F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 5.5429F, -16.2788F, -0.145F, -0.0322F, -0.8295F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(90, 114).mirror().addBox(-1.1749F, -0.7213F, -1.2002F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 5.5429F, -16.2788F, 0.7276F, -0.0322F, -0.8295F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(37, 116).mirror().addBox(-0.5F, -1.1533F, -1.0747F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.713F, 4.3312F, -16.1773F, -0.0055F, -0.1566F, -0.0341F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(117, 120).mirror().addBox(-0.5F, -1.5059F, 1.0923F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(127, 26).mirror().addBox(-0.5F, -2.1133F, -2.9503F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, 2.5627F, -13.2476F, 0.4832F, -0.1566F, 0.1578F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(117, 91).mirror().addBox(-0.5F, -2.8725F, 1.7991F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2F, 2.5627F, -13.2476F, -0.0579F, -0.1566F, 0.1578F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(125, 134).mirror().addBox(-0.5F, -1.4198F, -1.8312F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.2F, 2.5627F, -13.2476F, -0.0055F, -0.1566F, 0.1578F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(99, 75).mirror().addBox(-8.5748F, -0.1973F, 0.0884F, 9.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7086F, 9.7757F, -9.7224F, 1.67F, 0.5946F, 0.1983F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(101, 37).mirror().addBox(-6.7956F, 0.1245F, 0.0908F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1715F, 9.7569F, -10.2472F, 1.6598F, 0.4412F, 0.1586F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(112, 83).mirror().addBox(-6.4408F, -0.5677F, 0.0919F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6273F, 9.545F, -10.8617F, 1.3744F, 0.3176F, 0.1606F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(116, 7).mirror().addBox(-5.4261F, -0.4677F, 0.0575F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5383F, 9.2913F, -11.9735F, 1.3584F, -0.0153F, 0.5202F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(22, 117).mirror().addBox(-0.5F, -1.5363F, -1.3842F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-4.713F, 4.3312F, -16.1773F, 1.094F, -0.1566F, -0.0341F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(66, 105).mirror().addBox(-0.5F, -1.6078F, -2.0944F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-5.2F, 2.5627F, -13.2476F, 0.3784F, -0.1566F, 0.1578F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(117, 120).addBox(-0.5F, -1.5059F, 1.0923F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F))
				.texOffs(127, 26).addBox(-0.5F, -2.1133F, -2.9503F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, 2.5627F, -13.2476F, 0.4832F, 0.1566F, -0.1578F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(117, 91).addBox(-0.5F, -2.8725F, 1.7991F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, 2.5627F, -13.2476F, -0.0579F, 0.1566F, -0.1578F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(66, 105).addBox(-0.5F, -1.6078F, -2.0944F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(5.2F, 2.5627F, -13.2476F, 0.3784F, 0.1566F, -0.1578F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(22, 117).addBox(-0.5F, -1.5363F, -1.3842F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(4.713F, 4.3312F, -16.1773F, 1.094F, 0.1566F, 0.0341F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(129, 31).addBox(0.1749F, -0.3385F, 2.0098F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.7F, 5.5429F, -16.2788F, -0.5465F, 0.0322F, 0.8295F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(129, 14).addBox(0.1749F, -2.0115F, 1.9131F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7F, 5.5429F, -16.2788F, -0.9479F, 0.0322F, 0.8295F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(120, 31).addBox(0.1749F, 1.3565F, 1.0214F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.7F, 5.5429F, -16.2788F, -0.145F, 0.0322F, 0.8295F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(90, 114).addBox(0.1749F, -0.7213F, -1.2002F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.7F, 5.5429F, -16.2788F, 0.7276F, 0.0322F, 0.8295F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(37, 116).addBox(-0.5F, -1.1533F, -1.0747F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.713F, 4.3312F, -16.1773F, -0.0055F, 0.1566F, 0.0341F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(125, 134).addBox(-0.5F, -1.4198F, -1.8312F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.2F, 2.5627F, -13.2476F, -0.0055F, 0.1566F, -0.1578F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(11, 118).addBox(-2.0F, -1.0F, -0.4F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.4355F, -18.8199F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(114, 61).addBox(-2.5301F, -5.3407F, 0.0732F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0301F, 9.3824F, -13.3365F, 1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(60, 107).addBox(-1.5301F, -2.8328F, -0.9967F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0301F, 9.0788F, -10.3477F, 1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(116, 7).addBox(-0.5739F, -0.4677F, 0.0575F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5383F, 9.2913F, -11.9735F, 1.3584F, 0.0153F, -0.5202F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(112, 83).addBox(-0.5592F, -0.5677F, 0.0919F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6273F, 9.545F, -10.8617F, 1.3744F, -0.3176F, -0.1606F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(101, 37).addBox(-1.2044F, 0.1245F, 0.0908F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1715F, 9.7569F, -10.2472F, 1.6598F, -0.4412F, -0.1586F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(99, 59).addBox(-0.4252F, -0.1973F, 0.0884F, 10.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7086F, 9.7757F, -9.7224F, 1.6857F, -0.7784F, -0.2007F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(99, 75).addBox(-0.4252F, -0.1973F, 0.0884F, 9.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7086F, 9.7757F, -9.7224F, 1.67F, -0.5946F, -0.1983F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(70, 63).addBox(-1.0F, -1.1728F, -0.1329F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4112F, -14.8333F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(66, 138).addBox(0.0F, -2.0973F, -0.561F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 136).addBox(0.0F, -2.4973F, 1.439F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(109, 135).addBox(0.0F, -2.8973F, 3.439F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 135).addBox(0.0F, -2.8973F, 5.439F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 135).addBox(0.0F, -2.8973F, 7.439F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6653F, -15.4741F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(101, 127).addBox(0.0F, -2.8974F, 3.4608F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4039F, -21.6125F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body13_r4 = body.addOrReplaceChild("body13_r4", CubeListBuilder.create().texOffs(139, 51).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.538F, -17.5433F, 0.6449F, -0.0947F, 0.3593F));

		PartDefinition body14_r4 = body.addOrReplaceChild("body14_r4", CubeListBuilder.create().texOffs(139, 20).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.538F, -17.5433F, 0.5685F, -0.336F, 0.7107F));

		PartDefinition body15_r3 = body.addOrReplaceChild("body15_r3", CubeListBuilder.create().texOffs(116, 5).addBox(1.4538F, -1.309F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.538F, -17.5433F, 0.3331F, -0.5701F, 1.2349F));

		PartDefinition body12_r4 = body.addOrReplaceChild("body12_r4", CubeListBuilder.create().texOffs(139, 49).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.138F, -15.5433F, 0.5592F, -0.0781F, 0.2441F));

		PartDefinition body13_r5 = body.addOrReplaceChild("body13_r5", CubeListBuilder.create().texOffs(139, 16).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.138F, -15.5433F, 0.4906F, -0.2905F, 0.6123F));

		PartDefinition body14_r5 = body.addOrReplaceChild("body14_r5", CubeListBuilder.create().texOffs(103, 9).addBox(1.4538F, -1.309F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.138F, -15.5433F, 0.2851F, -0.4935F, 1.1368F));

		PartDefinition body11_r4 = body.addOrReplaceChild("body11_r4", CubeListBuilder.create().texOffs(139, 47).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.138F, -13.5433F, 0.5254F, -0.0703F, 0.1941F));

		PartDefinition body12_r5 = body.addOrReplaceChild("body12_r5", CubeListBuilder.create().texOffs(139, 14).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.138F, -13.5433F, 0.4608F, -0.271F, 0.568F));

		PartDefinition body13_r6 = body.addOrReplaceChild("body13_r6", CubeListBuilder.create().texOffs(97, 19).addBox(1.4538F, -1.309F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.138F, -13.5433F, 0.2683F, -0.4624F, 1.092F));

		PartDefinition body10_r4 = body.addOrReplaceChild("body10_r4", CubeListBuilder.create().texOffs(139, 45).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.138F, -11.5433F, 0.5256F, -0.0698F, 0.1766F));

		PartDefinition body11_r5 = body.addOrReplaceChild("body11_r5", CubeListBuilder.create().texOffs(139, 12).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.138F, -11.5433F, 0.4613F, -0.2706F, 0.5504F));

		PartDefinition body12_r6 = body.addOrReplaceChild("body12_r6", CubeListBuilder.create().texOffs(97, 17).addBox(1.4538F, -1.309F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.138F, -11.5433F, 0.2689F, -0.4622F, 1.0742F));

		PartDefinition body9_r4 = body.addOrReplaceChild("body9_r4", CubeListBuilder.create().texOffs(139, 43).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.138F, -9.5433F, 0.5259F, -0.0698F, 0.1068F));

		PartDefinition body10_r5 = body.addOrReplaceChild("body10_r5", CubeListBuilder.create().texOffs(139, 10).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.138F, -9.5433F, 0.4615F, -0.2707F, 0.4805F));

		PartDefinition body11_r6 = body.addOrReplaceChild("body11_r6", CubeListBuilder.create().texOffs(97, 15).addBox(1.4538F, -1.309F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.138F, -9.5433F, 0.2691F, -0.4624F, 1.0044F));

		PartDefinition body10_r6 = body.addOrReplaceChild("body10_r6", CubeListBuilder.create().texOffs(97, 13).addBox(1.4538F, -1.309F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.038F, -7.5433F, 0.261F, -0.4465F, 1.0253F));

		PartDefinition body8_r3 = body.addOrReplaceChild("body8_r3", CubeListBuilder.create().texOffs(139, 41).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.038F, -7.5433F, 0.5089F, -0.0655F, 0.1253F));

		PartDefinition body9_r5 = body.addOrReplaceChild("body9_r5", CubeListBuilder.create().texOffs(139, 8).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.038F, -7.5433F, 0.4468F, -0.2605F, 0.5018F));

		PartDefinition body7_r2 = body.addOrReplaceChild("body7_r2", CubeListBuilder.create().texOffs(118, 75).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.038F, -5.5433F, 0.4918F, -0.0612F, 0.1438F));

		PartDefinition body8_r4 = body.addOrReplaceChild("body8_r4", CubeListBuilder.create().texOffs(83, 99).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.038F, -5.5433F, 0.4321F, -0.2502F, 0.5229F));

		PartDefinition body9_r6 = body.addOrReplaceChild("body9_r6", CubeListBuilder.create().texOffs(95, 87).addBox(1.4538F, -1.309F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.038F, -5.5433F, 0.2531F, -0.4305F, 1.0461F));

		PartDefinition body6_r1 = body.addOrReplaceChild("body6_r1", CubeListBuilder.create().texOffs(139, 36).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.162F, -3.5433F, 0.4577F, -0.0538F, 0.1457F));

		PartDefinition body8_r5 = body.addOrReplaceChild("body8_r5", CubeListBuilder.create().texOffs(95, 89).addBox(1.4538F, -1.309F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.162F, -3.5433F, 0.2364F, -0.3991F, 1.0527F));

		PartDefinition body7_r3 = body.addOrReplaceChild("body7_r3", CubeListBuilder.create().texOffs(139, 6).addBox(0.9135F, -0.4067F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.162F, -3.5433F, 0.4023F, -0.2306F, 0.5299F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(118, 135).addBox(0.0F, -2.5998F, -0.514F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 136).addBox(0.0F, -2.6998F, 1.486F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8152F, -5.5099F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(51, 99).addBox(-1.0F, -1.4F, 4.2F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 2.0F, -23.95F, 0.1484F, 0.0F, 0.0F));

		PartDefinition frontLeftLeg = body.addOrReplaceChild("frontLeftLeg", CubeListBuilder.create().texOffs(64, 127).addBox(-0.9061F, 0.7865F, -0.5464F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(123, 64).addBox(-1.4061F, -1.2135F, -1.0464F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(25, 123).addBox(-1.4061F, 5.7865F, -1.0464F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.071F, 6.9187F, -14.0009F, 1.579F, 0.3629F, -0.2344F));

		PartDefinition frontLeftLeg2 = frontLeftLeg.addOrReplaceChild("frontLeftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2144F, 7.9822F, -1.227F, -2.3024F, -0.0014F, 0.2752F));

		PartDefinition cube_r42 = frontLeftLeg2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 122).addBox(-1.5F, -1.9F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0731F, 1.0027F, 1.3438F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r43 = frontLeftLeg2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(131, 124).addBox(-1.5F, -1.9F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0731F, 2.7893F, 1.1245F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r44 = frontLeftLeg2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(89, 121).addBox(-1.5F, -0.7F, -0.4F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0731F, 3.2514F, 0.4128F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r45 = frontLeftLeg2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(112, 125).addBox(-1.0353F, -0.3375F, -0.4224F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5202F, 4.0437F, -1.2174F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r46 = frontLeftLeg2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(57, 126).addBox(-1.0353F, -3.7166F, -0.4676F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5202F, 4.0437F, -1.2174F, -0.1658F, 0.0F, 0.0F));

		PartDefinition frontLeftLeg3 = frontLeftLeg2.addOrReplaceChild("frontLeftLeg3", CubeListBuilder.create().texOffs(113, 104).addBox(-3.0F, -0.5F, -1.6F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2688F, 7.7494F, 0.1964F, 0.8136F, -0.2138F, 0.1598F));

		PartDefinition frontLeftLeg4 = frontLeftLeg3.addOrReplaceChild("frontLeftLeg4", CubeListBuilder.create().texOffs(66, 99).addBox(1.5F, -0.6F, -3.8F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offset(-4.5F, 0.1F, -1.3F));

		PartDefinition frontRightLeg = body.addOrReplaceChild("frontRightLeg", CubeListBuilder.create().texOffs(69, 127).addBox(-0.0939F, 0.7865F, -0.5464F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(123, 75).addBox(-0.5939F, -1.2135F, -1.0464F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(34, 123).addBox(-0.5939F, 5.7865F, -1.0464F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.071F, 6.9187F, -14.0009F, -0.4717F, -0.3629F, 0.2344F));

		PartDefinition frontRightLeg2 = frontRightLeg.addOrReplaceChild("frontRightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1415F, 7.7498F, -1.4022F, -0.9329F, -0.1964F, -0.4478F));

		PartDefinition cube_r47 = frontRightLeg2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(66, 122).addBox(-0.5F, -1.9F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0731F, 1.0027F, 1.3438F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r48 = frontRightLeg2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(131, 128).addBox(-0.5F, -1.9F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0731F, 2.7893F, 1.1245F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r49 = frontRightLeg2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(9, 122).addBox(-0.5F, -0.7F, -0.4F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0731F, 3.2514F, 0.4128F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r50 = frontRightLeg2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(119, 125).addBox(-0.9647F, -0.3375F, -0.4224F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5202F, 4.0437F, -1.2174F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r51 = frontRightLeg2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(126, 91).addBox(-0.9647F, -3.7166F, -0.4676F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5202F, 4.0437F, -1.2174F, -0.1658F, 0.0F, 0.0F));

		PartDefinition frontRightLeg3 = frontRightLeg2.addOrReplaceChild("frontRightLeg3", CubeListBuilder.create().texOffs(114, 47).addBox(-1.0F, -0.5F, -1.6F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2549F, 7.6644F, -0.1943F, 1.4094F, -0.0369F, -0.0065F));

		PartDefinition frontRightLeg4 = frontRightLeg3.addOrReplaceChild("frontRightLeg4", CubeListBuilder.create().texOffs(99, 69).addBox(-5.5F, -0.6F, -3.8F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offset(4.5F, 0.1F, -1.3F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.35F, -0.035F, -0.0872F, 0.0031F));

		PartDefinition cube_r52 = body2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 75).addBox(-5.0F, -2.0F, 0.0F, 9.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 10.7639F, 5.6123F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r53 = body2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 64).addBox(-5.0F, -1.8F, 0.0F, 9.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 10.9829F, -2.3872F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r54 = body2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 23).addBox(-1.51F, -0.1F, 0.0F, 3.0F, 3.0F, 17.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.01F, -4.2246F, 0.2906F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r55 = body2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(89, 136).addBox(0.0F, -2.5311F, 17.7844F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 136).addBox(0.0F, -2.5311F, 15.7844F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(138, 90).addBox(0.0F, -2.4311F, 13.7844F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 82).addBox(0.0F, -2.5311F, 11.7844F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 28).addBox(0.0F, -2.7311F, 9.7844F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 13).addBox(0.0F, -2.7311F, 7.7844F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 4).addBox(0.0F, -2.7311F, 5.7844F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 136).addBox(0.0F, -2.7311F, 3.7844F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8152F, -2.1599F, -0.1047F, 0.0F, 0.0F));

		PartDefinition body13_r7 = body2.addOrReplaceChild("body13_r7", CubeListBuilder.create().texOffs(139, 4).mirror().addBox(-1.9144F, -0.3889F, -0.3008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.038F, 13.7067F, 0.0892F, 0.0043F, -0.8458F));

		PartDefinition body12_r7 = body2.addOrReplaceChild("body12_r7", CubeListBuilder.create().texOffs(139, 34).mirror().addBox(-0.9935F, 0.0166F, -0.3008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.038F, 13.7067F, 0.0833F, -0.0323F, -0.4285F));

		PartDefinition body14_r6 = body2.addOrReplaceChild("body14_r6", CubeListBuilder.create().texOffs(125, 71).mirror().addBox(-5.4635F, -1.294F, -0.3008F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.038F, 13.7067F, 0.0752F, 0.0483F, -1.3678F));

		PartDefinition body11_r7 = body2.addOrReplaceChild("body11_r7", CubeListBuilder.create().texOffs(139, 32).mirror().addBox(-0.9973F, 0.0335F, -0.3028F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.838F, 11.7067F, 0.1684F, -0.0133F, -0.3606F));

		PartDefinition body12_r8 = body2.addOrReplaceChild("body12_r8", CubeListBuilder.create().texOffs(139, 2).mirror().addBox(-1.9248F, -0.375F, -0.3028F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.838F, 11.7067F, 0.1595F, 0.0561F, -0.7739F));

		PartDefinition body13_r8 = body2.addOrReplaceChild("body13_r8", CubeListBuilder.create().texOffs(114, 57).mirror().addBox(-6.4794F, -1.2872F, -0.3028F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.838F, 11.7067F, 0.1104F, 0.1282F, -1.2949F));

		PartDefinition body11_r8 = body2.addOrReplaceChild("body11_r8", CubeListBuilder.create().texOffs(139, 0).mirror().addBox(-1.935F, -0.3614F, -0.3064F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.638F, 9.7067F, 0.2301F, 0.1076F, -0.7332F));

		PartDefinition body10_r7 = body2.addOrReplaceChild("body10_r7", CubeListBuilder.create().texOffs(139, 30).mirror().addBox(-1.0012F, 0.0502F, -0.3064F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.638F, 9.7067F, 0.2536F, 0.0059F, -0.326F));

		PartDefinition body12_r9 = body2.addOrReplaceChild("body12_r9", CubeListBuilder.create().texOffs(112, 85).mirror().addBox(-6.4951F, -1.2805F, -0.3064F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.638F, 9.7067F, 0.1464F, 0.2079F, -1.254F));

		PartDefinition body11_r9 = body2.addOrReplaceChild("body11_r9", CubeListBuilder.create().texOffs(103, 11).mirror().addBox(-7.5074F, -1.2753F, -0.3103F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.538F, 7.7067F, 0.176F, 0.2715F, -1.2469F));

		PartDefinition body10_r8 = body2.addOrReplaceChild("body10_r8", CubeListBuilder.create().texOffs(138, 138).mirror().addBox(-1.9431F, -0.3507F, -0.3103F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.538F, 7.7067F, 0.2872F, 0.1485F, -0.7259F));

		PartDefinition body9_r7 = body2.addOrReplaceChild("body9_r7", CubeListBuilder.create().texOffs(139, 28).mirror().addBox(-1.0042F, 0.0632F, -0.3103F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.538F, 7.7067F, 0.3217F, 0.0212F, -0.3251F));

		PartDefinition body10_r9 = body2.addOrReplaceChild("body10_r9", CubeListBuilder.create().texOffs(101, 39).mirror().addBox(-8.5165F, -1.2715F, -0.3138F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.338F, 5.7067F, 0.1989F, 0.3191F, -1.2054F));

		PartDefinition body9_r8 = body2.addOrReplaceChild("body9_r8", CubeListBuilder.create().texOffs(138, 136).mirror().addBox(-1.9491F, -0.3429F, -0.3138F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.338F, 5.7067F, 0.3305F, 0.1788F, -0.684F));

		PartDefinition body8_r6 = body2.addOrReplaceChild("body8_r6", CubeListBuilder.create().texOffs(139, 26).mirror().addBox(-1.0065F, 0.0728F, -0.3138F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.338F, 5.7067F, 0.3728F, 0.0326F, -0.2888F));

		PartDefinition body9_r9 = body2.addOrReplaceChild("body9_r9", CubeListBuilder.create().texOffs(101, 35).mirror().addBox(-9.5284F, -1.2666F, -0.3193F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.138F, 3.8067F, 0.2306F, 0.3822F, -1.1246F));

		PartDefinition body8_r7 = body2.addOrReplaceChild("body8_r7", CubeListBuilder.create().texOffs(138, 105).mirror().addBox(-1.9569F, -0.3327F, -0.3193F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.138F, 3.8067F, 0.3889F, 0.2187F, -0.6026F));

		PartDefinition body7_r4 = body2.addOrReplaceChild("body7_r4", CubeListBuilder.create().texOffs(139, 24).mirror().addBox(-1.0123F, 0.0852F, -0.3195F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.138F, 3.8067F, 0.441F, 0.0618F, -0.2266F));

		PartDefinition body8_r8 = body2.addOrReplaceChild("body8_r8", CubeListBuilder.create().texOffs(97, 21).mirror().addBox(-10.5371F, -1.2631F, -0.3241F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.038F, 1.8067F, 0.2555F, 0.4293F, -1.045F));

		PartDefinition body7_r5 = body2.addOrReplaceChild("body7_r5", CubeListBuilder.create().texOffs(138, 18).mirror().addBox(-1.9627F, -0.3253F, -0.3241F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.038F, 1.8067F, 0.4334F, 0.2482F, -0.5225F));

		PartDefinition body6_r2 = body2.addOrReplaceChild("body6_r2", CubeListBuilder.create().texOffs(139, 22).mirror().addBox(-1.0118F, 0.0944F, -0.3241F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.038F, 1.8067F, 0.4923F, 0.0588F, -0.1437F));

		PartDefinition body13_r9 = body2.addOrReplaceChild("body13_r9", CubeListBuilder.create().texOffs(125, 71).addBox(1.4635F, -1.294F, -0.3008F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.038F, 13.7067F, 0.0752F, -0.0483F, 1.3678F));

		PartDefinition body11_r10 = body2.addOrReplaceChild("body11_r10", CubeListBuilder.create().texOffs(139, 34).addBox(-0.0065F, 0.0166F, -0.3008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.038F, 13.7067F, 0.0833F, 0.0323F, 0.4285F));

		PartDefinition body12_r10 = body2.addOrReplaceChild("body12_r10", CubeListBuilder.create().texOffs(139, 4).addBox(0.9144F, -0.3889F, -0.3008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.038F, 13.7067F, 0.0892F, -0.0043F, 0.8458F));

		PartDefinition body12_r11 = body2.addOrReplaceChild("body12_r11", CubeListBuilder.create().texOffs(114, 57).addBox(1.4794F, -1.2872F, -0.3028F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.838F, 11.7067F, 0.1104F, -0.1282F, 1.2949F));

		PartDefinition body11_r11 = body2.addOrReplaceChild("body11_r11", CubeListBuilder.create().texOffs(139, 2).addBox(0.9248F, -0.375F, -0.3028F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.838F, 11.7067F, 0.1595F, -0.0561F, 0.7739F));

		PartDefinition body10_r10 = body2.addOrReplaceChild("body10_r10", CubeListBuilder.create().texOffs(139, 32).addBox(-0.0027F, 0.0335F, -0.3028F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.838F, 11.7067F, 0.1684F, 0.0133F, 0.3606F));

		PartDefinition body11_r12 = body2.addOrReplaceChild("body11_r12", CubeListBuilder.create().texOffs(112, 85).addBox(1.4951F, -1.2805F, -0.3064F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.638F, 9.7067F, 0.1464F, -0.2079F, 1.254F));

		PartDefinition body9_r10 = body2.addOrReplaceChild("body9_r10", CubeListBuilder.create().texOffs(139, 30).addBox(0.0012F, 0.0502F, -0.3064F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.638F, 9.7067F, 0.2536F, -0.0059F, 0.326F));

		PartDefinition body10_r11 = body2.addOrReplaceChild("body10_r11", CubeListBuilder.create().texOffs(139, 0).addBox(0.935F, -0.3614F, -0.3064F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.638F, 9.7067F, 0.2301F, -0.1076F, 0.7332F));

		PartDefinition body8_r9 = body2.addOrReplaceChild("body8_r9", CubeListBuilder.create().texOffs(139, 28).addBox(0.0042F, 0.0632F, -0.3103F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.538F, 7.7067F, 0.3217F, -0.0212F, 0.3251F));

		PartDefinition body9_r11 = body2.addOrReplaceChild("body9_r11", CubeListBuilder.create().texOffs(138, 138).addBox(0.9431F, -0.3507F, -0.3103F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.538F, 7.7067F, 0.2872F, -0.1485F, 0.7259F));

		PartDefinition body10_r12 = body2.addOrReplaceChild("body10_r12", CubeListBuilder.create().texOffs(103, 11).addBox(1.5074F, -1.2753F, -0.3103F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.538F, 7.7067F, 0.176F, -0.2715F, 1.2469F));

		PartDefinition body7_r6 = body2.addOrReplaceChild("body7_r6", CubeListBuilder.create().texOffs(139, 26).addBox(0.0065F, 0.0728F, -0.3138F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.338F, 5.7067F, 0.3728F, -0.0326F, 0.2888F));

		PartDefinition body8_r10 = body2.addOrReplaceChild("body8_r10", CubeListBuilder.create().texOffs(138, 136).addBox(0.9491F, -0.3429F, -0.3138F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.338F, 5.7067F, 0.3305F, -0.1788F, 0.684F));

		PartDefinition body9_r12 = body2.addOrReplaceChild("body9_r12", CubeListBuilder.create().texOffs(101, 39).addBox(1.5165F, -1.2715F, -0.3138F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.338F, 5.7067F, 0.1989F, -0.3191F, 1.2054F));

		PartDefinition body6_r3 = body2.addOrReplaceChild("body6_r3", CubeListBuilder.create().texOffs(139, 24).addBox(0.0123F, 0.0852F, -0.3195F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.138F, 3.8067F, 0.441F, -0.0618F, 0.2266F));

		PartDefinition body7_r7 = body2.addOrReplaceChild("body7_r7", CubeListBuilder.create().texOffs(138, 105).addBox(0.9569F, -0.3327F, -0.3193F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.138F, 3.8067F, 0.3889F, -0.2187F, 0.6026F));

		PartDefinition body8_r11 = body2.addOrReplaceChild("body8_r11", CubeListBuilder.create().texOffs(101, 35).addBox(1.5284F, -1.2666F, -0.3193F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.138F, 3.8067F, 0.2306F, -0.3822F, 1.1246F));

		PartDefinition body5_r1 = body2.addOrReplaceChild("body5_r1", CubeListBuilder.create().texOffs(139, 22).addBox(0.0118F, 0.0944F, -0.3241F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.038F, 1.8067F, 0.4923F, -0.0588F, 0.1437F));

		PartDefinition body6_r4 = body2.addOrReplaceChild("body6_r4", CubeListBuilder.create().texOffs(138, 18).addBox(0.9627F, -0.3253F, -0.3241F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.038F, 1.8067F, 0.4334F, -0.2482F, 0.5225F));

		PartDefinition body7_r8 = body2.addOrReplaceChild("body7_r8", CubeListBuilder.create().texOffs(97, 21).addBox(1.5371F, -1.2631F, -0.3241F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.038F, 1.8067F, 0.2555F, -0.4293F, 1.045F));

		PartDefinition cube_r56 = body2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(41, 43).addBox(-1.0F, -1.0F, 0.2F, 2.0F, 2.0F, 17.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.05F, -0.6F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail = body2.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 118).addBox(1.0F, 0.7862F, 0.5207F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 118).mirror().addBox(-3.0F, 0.7862F, 0.5207F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4F, 16.1F, -0.0962F, -0.2172F, 0.0208F));

		PartDefinition cube_r57 = tail.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(71, 113).mirror().addBox(-1.738F, -1.759F, 0.8868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.7161F, 3.0161F, 0.6778F, -1.3265F, 0.0F, -0.4189F));

		PartDefinition cube_r58 = tail.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(134, 9).mirror().addBox(-1.738F, -0.9214F, 0.7168F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7161F, 3.0161F, 0.6778F, -0.7156F, 0.0F, -0.4189F));

		PartDefinition cube_r59 = tail.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(26, 133).mirror().addBox(-0.153F, 1.0754F, 0.3629F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.3161F, 5.1161F, -0.2222F, -0.7418F, 0.0F, -0.576F));

		PartDefinition cube_r60 = tail.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(26, 128).mirror().addBox(-0.153F, -0.4814F, -1.0676F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3161F, 5.1161F, -0.2222F, -0.4189F, 0.0F, -0.576F));

		PartDefinition cube_r61 = tail.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(125, 41).mirror().addBox(-0.3392F, -0.6066F, -0.3365F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3161F, 4.7161F, 1.7778F, -0.7679F, 0.0F, -0.6283F));

		PartDefinition cube_r62 = tail.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(7, 129).mirror().addBox(-0.3392F, 1.6196F, 0.2316F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3161F, 4.7161F, 1.7778F, -0.1745F, 0.0F, -0.6283F));

		PartDefinition cube_r63 = tail.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(118, 21).mirror().addBox(-0.3392F, 2.198F, 1.2246F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3161F, 4.7161F, 1.7778F, 0.1571F, 0.0F, -0.6283F));

		PartDefinition cube_r64 = tail.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(79, 109).mirror().addBox(-2.0F, -0.1F, -2.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.8632F, 2.3308F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r65 = tail.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(127, 46).mirror().addBox(-2.0F, -0.0945F, -0.0474F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -0.3835F, 1.9148F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r66 = tail.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(26, 110).mirror().addBox(-2.0F, -0.0945F, -0.0474F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 2.1338F, -1.1938F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r67 = tail.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(129, 5).mirror().addBox(-1.738F, 0.7246F, -0.5738F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7161F, 3.0161F, 0.6778F, -0.8552F, 0.0F, -0.4189F));

		PartDefinition cube_r68 = tail.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(126, 104).mirror().addBox(-1.738F, -1.0486F, -0.9413F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.7161F, 3.0161F, 0.6778F, -0.2094F, 0.0F, -0.4189F));

		PartDefinition cube_r69 = tail.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(134, 0).mirror().addBox(-0.153F, 1.287F, -1.3378F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.3161F, 5.1161F, -0.2222F, -0.2269F, 0.0F, -0.576F));

		PartDefinition cube_r70 = tail.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(118, 26).mirror().addBox(-0.3392F, 1.0441F, 1.0216F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.3161F, 4.7161F, 1.7778F, -0.1396F, 0.0F, -0.6283F));

		PartDefinition cube_r71 = tail.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(33, 128).mirror().addBox(-0.3392F, -0.2235F, 0.2006F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3161F, 4.7161F, 1.7778F, -1.1345F, 0.0F, -0.6283F));

		PartDefinition cube_r72 = tail.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(119, 89).mirror().addBox(-1.5173F, 0.1046F, -3.8969F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(118, 87).mirror().addBox(-2.2173F, 0.1046F, -1.8969F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9892F, 10.9603F, -0.0879F, 0.1217F, -0.0107F));

		PartDefinition cube_r73 = tail.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(119, 89).addBox(-1.4827F, 0.1046F, -3.8969F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(118, 87).addBox(-1.7827F, 0.1046F, -1.8969F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9892F, 10.9603F, -0.0879F, -0.1217F, 0.0107F));

		PartDefinition cube_r74 = tail.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(33, 128).addBox(-0.6608F, -0.2235F, 0.2006F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.3161F, 4.7161F, 1.7778F, -1.1345F, 0.0F, 0.6283F));

		PartDefinition cube_r75 = tail.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(7, 129).addBox(-0.6608F, 1.6196F, 0.2316F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.3161F, 4.7161F, 1.7778F, -0.1745F, 0.0F, 0.6283F));

		PartDefinition cube_r76 = tail.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(33, 79).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1573F, 0.1309F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r77 = tail.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(118, 21).addBox(-0.6608F, 2.198F, 1.2246F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.3161F, 4.7161F, 1.7778F, 0.1571F, 0.0F, 0.6283F));

		PartDefinition cube_r78 = tail.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(125, 41).addBox(-0.6608F, -0.6066F, -0.3365F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.3161F, 4.7161F, 1.7778F, -0.7679F, 0.0F, 0.6283F));

		PartDefinition cube_r79 = tail.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(118, 26).addBox(-0.6608F, 1.0441F, 1.0216F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.3161F, 4.7161F, 1.7778F, -0.1396F, 0.0F, 0.6283F));

		PartDefinition cube_r80 = tail.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(26, 128).addBox(-0.847F, -0.4814F, -1.0676F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.3161F, 5.1161F, -0.2222F, -0.4189F, 0.0F, 0.576F));

		PartDefinition cube_r81 = tail.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(26, 133).addBox(-0.847F, 1.0754F, 0.3629F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.3161F, 5.1161F, -0.2222F, -0.7418F, 0.0F, 0.576F));

		PartDefinition cube_r82 = tail.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(134, 0).addBox(-0.847F, 1.287F, -1.3378F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.3161F, 5.1161F, -0.2222F, -0.2269F, 0.0F, 0.576F));

		PartDefinition cube_r83 = tail.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(71, 113).addBox(0.738F, -1.759F, 0.8868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.7161F, 3.0161F, 0.6778F, -1.3265F, 0.0F, 0.4189F));

		PartDefinition cube_r84 = tail.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(134, 9).addBox(0.738F, -0.9214F, 0.7168F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.7161F, 3.0161F, 0.6778F, -0.7156F, 0.0F, 0.4189F));

		PartDefinition cube_r85 = tail.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(126, 104).addBox(0.738F, -1.0486F, -0.9413F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.7161F, 3.0161F, 0.6778F, -0.2094F, 0.0F, 0.4189F));

		PartDefinition cube_r86 = tail.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(129, 5).addBox(0.738F, 0.7246F, -0.5738F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7161F, 3.0161F, 0.6778F, -0.8552F, 0.0F, 0.4189F));

		PartDefinition cube_r87 = tail.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(79, 109).addBox(1.0F, -0.1F, -2.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 0.8632F, 2.3308F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r88 = tail.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(127, 46).addBox(1.0F, -0.0945F, -0.0474F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, -0.3835F, 1.9148F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r89 = tail.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(26, 110).addBox(1.0F, -0.0945F, -0.0474F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.7F, 2.1338F, -1.1938F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r90 = tail.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(37, 136).addBox(0.0F, -2.8472F, -0.3046F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0916F, 9.4436F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r91 = tail.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(34, 136).addBox(0.0F, -2.7302F, -0.4816F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2084F, 7.6436F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r92 = tail.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(136, 33).addBox(0.0F, -3.1392F, 23.8821F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 112).addBox(0.0F, -2.9392F, 21.8821F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 136).addBox(0.0F, -2.4392F, 19.8821F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4579F, -18.629F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r93 = tail.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(76, 0).addBox(-1.51F, -0.1F, -0.1F, 3.0F, 2.0F, 10.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.01F, -3.879F, 0.7991F, -0.0873F, 0.0F, 0.0F));

		PartDefinition backLeftLeg = tail.addOrReplaceChild("backLeftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4367F, 3.9623F, 0.9793F, -1.6996F, -0.0235F, -0.1859F));

		PartDefinition cube_r94 = backLeftLeg.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(26, 104).addBox(-0.3035F, 0.2361F, -1.8908F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6053F, 0.7915F, 1.4661F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r95 = backLeftLeg.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(16, 123).addBox(-0.3035F, -1.264F, -1.4095F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1053F, 0.6385F, 0.7758F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r96 = backLeftLeg.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(123, 113).addBox(-0.312F, -1.5868F, -0.4099F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1053F, 9.195F, 0.5046F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r97 = backLeftLeg.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(126, 127).addBox(-0.3035F, -5.7683F, -0.2804F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.6053F, 8.8873F, -0.3999F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r98 = backLeftLeg.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(96, 127).addBox(-0.3035F, -5.7659F, -0.285F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.6053F, 8.8873F, -0.3999F, -0.1047F, 0.0F, 0.0F));

		PartDefinition backLeftLeg2 = backLeftLeg.addOrReplaceChild("backLeftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6189F, 9.6341F, 0.6427F, 2.3514F, -0.0557F, 0.1196F));

		PartDefinition cube_r99 = backLeftLeg2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(133, 95).addBox(-0.5F, -0.1F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0631F, 5.1594F, 1.1453F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r100 = backLeftLeg2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(84, 122).addBox(-0.5F, -3.0F, -0.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0631F, 3.2641F, 1.2778F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r101 = backLeftLeg2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(115, 131).addBox(-0.9988F, 0.0765F, -0.0742F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0631F, 4.7167F, -1.0067F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r102 = backLeftLeg2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(59, 119).addBox(-0.9988F, -3.228F, -0.7792F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0631F, 3.1641F, -0.0222F, -0.1745F, 0.0F, 0.0F));

		PartDefinition backLeftLeg3 = backLeftLeg2.addOrReplaceChild("backLeftLeg3", CubeListBuilder.create().texOffs(101, 23).addBox(-2.0988F, -0.0124F, -3.9766F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0602F, 6.9434F, 0.9818F, -0.3732F, -0.0358F, 0.0619F));

		PartDefinition backLeftLeg4 = backLeftLeg3.addOrReplaceChild("backLeftLeg4", CubeListBuilder.create().texOffs(51, 92).addBox(-2.0981F, -0.496F, -4.9564F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0007F, 0.4836F, -3.7202F));

		PartDefinition backRightLeg = tail.addOrReplaceChild("backRightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4367F, 3.9623F, 0.9793F, -1.2074F, 0.301F, 0.785F));

		PartDefinition cube_r103 = backRightLeg.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(43, 125).addBox(-0.6965F, 0.2361F, -1.8908F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6053F, 0.7915F, 1.4661F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r104 = backRightLeg.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(123, 59).addBox(-1.6965F, -1.264F, -1.4095F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1053F, 0.6385F, 0.7758F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r105 = backRightLeg.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(124, 97).addBox(-1.688F, -1.5868F, -0.4099F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1053F, 9.195F, 0.5046F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r106 = backRightLeg.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(21, 128).addBox(-0.6965F, -5.7683F, -0.2804F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6053F, 8.8873F, -0.3999F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r107 = backRightLeg.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(16, 128).addBox(-0.6965F, -5.7659F, -0.285F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6053F, 8.8873F, -0.3999F, -0.1047F, 0.0F, 0.0F));

		PartDefinition backRightLeg2 = backRightLeg.addOrReplaceChild("backRightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6189F, 9.6341F, 0.6427F, 2.3077F, 0.0557F, -0.1196F));

		PartDefinition cube_r108 = backRightLeg2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(133, 104).addBox(-0.5F, -0.1F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0631F, 5.1594F, 1.1453F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r109 = backRightLeg2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(126, 120).addBox(-0.5F, -3.0F, -0.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0631F, 3.2641F, 1.2778F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r110 = backRightLeg2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(131, 120).addBox(-1.0012F, 0.0765F, -0.0742F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0631F, 4.7167F, -1.0067F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r111 = backRightLeg2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(120, 9).addBox(-1.0012F, -3.228F, -0.7792F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0631F, 3.1641F, -0.0222F, -0.1745F, 0.0F, 0.0F));

		PartDefinition backRightLeg3 = backRightLeg2.addOrReplaceChild("backRightLeg3", CubeListBuilder.create().texOffs(101, 29).addBox(-1.9012F, -0.0124F, -3.9766F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0602F, 6.9434F, 0.9818F, -0.0362F, 0.0767F, -0.2765F));

		PartDefinition backRightLeg4 = backRightLeg3.addOrReplaceChild("backRightLeg4", CubeListBuilder.create().texOffs(70, 92).addBox(-1.9019F, -0.496F, -4.9564F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0007F, 0.4836F, -3.7202F, -0.4207F, -0.3172F, -0.3665F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0073F, 9.6309F, 0.0573F, -0.3372F, 0.3509F));

		PartDefinition cube_r112 = tail2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(138, 132).addBox(0.0F, 5.2886F, 12.5615F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(135, 99).addBox(0.0F, 3.8886F, 10.8615F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0974F, 1.2751F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r113 = tail2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(27, 138).addBox(0.0F, -0.2114F, 0.0615F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9198F, 10.9711F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r114 = tail2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(24, 138).addBox(0.0F, 0.0886F, -0.1385F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.668F, 9.1093F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r115 = tail2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(9, 138).addBox(0.0F, 0.0886F, 0.0615F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5065F, 6.9613F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r116 = tail2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(138, 100).addBox(0.0F, -0.2114F, -0.0385F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.32F, 5.2248F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r117 = tail2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(6, 138).addBox(0.0F, -1.0114F, -0.1385F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0983F, 3.2676F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r118 = tail2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(121, 138).addBox(0.0F, -0.4114F, -0.1385F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0974F, 1.2751F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r119 = tail2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(126, 55).mirror().addBox(-3.0173F, 0.2046F, 13.5531F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(126, 53).mirror().addBox(-3.0173F, 0.2046F, 11.5531F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(126, 51).mirror().addBox(-3.0173F, 0.2046F, 9.5531F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(125, 102).mirror().addBox(-3.0173F, 0.2046F, 7.8031F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(125, 73).mirror().addBox(-3.1173F, 0.2046F, 5.8031F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(123, 118).mirror().addBox(-3.3173F, 0.2046F, 3.8031F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(125, 85).mirror().addBox(-3.0173F, 0.2046F, 1.8031F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(123, 80).mirror().addBox(-2.7173F, 0.1046F, -0.1969F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0181F, 1.3294F, -0.0879F, 0.1217F, -0.0107F));

		PartDefinition cube_r120 = tail2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(126, 55).addBox(0.0173F, 0.2046F, 13.5531F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(126, 53).addBox(0.0173F, 0.2046F, 11.5531F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(126, 51).addBox(0.0173F, 0.2046F, 9.5531F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(125, 102).addBox(0.0173F, 0.2046F, 7.8031F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(125, 73).addBox(-0.8827F, 0.2046F, 5.8031F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(123, 118).addBox(-0.6827F, 0.2046F, 3.8031F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(125, 85).addBox(-0.9827F, 0.2046F, 1.8031F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(123, 80).addBox(-1.2827F, 0.1046F, -0.1969F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0181F, 1.3294F, -0.0879F, -0.1217F, 0.0107F));

		PartDefinition cube_r121 = tail2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(0, 44).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 17.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0181F, 0.1294F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r122 = tail2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(49, 135).addBox(0.0F, -4.1009F, 15.5008F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(122, 131).addBox(0.0F, -3.9009F, 13.5008F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 85).addBox(0.0F, -4.1009F, 11.5008F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 71).addBox(0.0F, -4.1009F, 9.5008F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 64).addBox(0.0F, -4.1009F, 7.5008F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 132).addBox(0.0F, -3.8009F, 5.5008F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 134).addBox(0.0F, -3.5009F, 3.5008F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 120).addBox(0.0F, -3.2009F, 1.5008F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9338F, -0.3579F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r123 = tail2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(70, 78).addBox(-1.01F, -0.1F, 0.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.51F, -4.5638F, 6.41F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r124 = tail2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(95, 78).addBox(-1.51F, -0.1F, -0.2F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.51F, -4.0583F, 0.632F, 0.0873F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3329F, 17.3282F, -0.2546F, -0.5558F, 0.0754F));

		PartDefinition cube_r125 = tail3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0943F, -0.3801F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r126 = tail3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(138, 95).addBox(0.0F, -2.0079F, 0.1883F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2477F, 13.6079F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r127 = tail3.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(138, 120).addBox(0.0F, -2.3079F, 0.0883F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2578F, 11.5979F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r128 = tail3.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(136, 49).addBox(0.0F, -2.1079F, -0.0117F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4564F, 9.7083F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r129 = tail3.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(46, 135).addBox(0.0F, -2.5079F, 0.0883F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5765F, 7.6094F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r130 = tail3.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(43, 135).addBox(0.0F, -2.6079F, 0.0883F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6861F, 5.6099F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r131 = tail3.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(40, 135).addBox(0.0F, -3.1079F, 2.9883F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 135).addBox(0.0F, -3.0079F, 0.9883F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8005F, 0.6949F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r132 = tail3.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(139, 84).addBox(0.0F, -0.1F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4984F, 18.3354F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r133 = tail3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(139, 116).addBox(0.0F, -0.2F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7222F, 16.5051F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r134 = tail3.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(12, 139).addBox(0.0F, -1.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0402F, 14.7082F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r135 = tail3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(138, 124).addBox(0.0F, 2.8005F, 6.3063F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(124, 138).addBox(0.0F, 2.6005F, 4.2063F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 135).addBox(0.0F, 0.4005F, 2.5063F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(130, 136).addBox(0.0F, 0.2005F, 0.6063F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 138).addBox(0.0F, -0.3995F, -1.2937F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6099F, 4.9656F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r136 = tail3.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(52, 136).addBox(0.0F, 5.8886F, 15.8615F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3901F, -15.4344F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r137 = tail3.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(92, 136).addBox(0.0F, -1.0977F, -1.5852F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9302F, 1.283F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r138 = tail3.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(136, 73).mirror().addBox(-1.5611F, 0.0139F, 5.441F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(126, 69).mirror().addBox(-1.6084F, -0.0139F, -6.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(136, 57).mirror().addBox(-1.5611F, 0.0139F, 3.441F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(130, 18).mirror().addBox(-1.5611F, 0.0139F, 1.441F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(128, 82).mirror().addBox(-1.5611F, 0.0139F, -0.559F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(128, 57).mirror().addBox(-1.5611F, 0.0139F, -2.559F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(130, 39).mirror().addBox(-1.5611F, 0.0139F, -4.559F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0222F, 0.6624F, 6.0661F, -0.0875F, 0.0695F, -0.0061F));

		PartDefinition cube_r139 = tail3.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(136, 73).addBox(0.5611F, 0.0139F, 5.441F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(126, 69).addBox(-1.3916F, -0.0139F, -6.4741F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(136, 57).addBox(0.5611F, 0.0139F, 3.441F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(130, 18).addBox(-0.4389F, 0.0139F, 1.441F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(128, 82).addBox(-0.4389F, 0.0139F, -0.559F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(128, 57).addBox(-0.4389F, 0.0139F, -2.559F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(130, 39).addBox(-0.4389F, 0.0139F, -4.559F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0222F, 0.6624F, 6.0661F, -0.0875F, -0.0695F, 0.0061F));

		PartDefinition cube_r140 = tail3.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(21, 135).addBox(0.0F, -3.1079F, -0.0117F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.905F, -0.2996F, -0.2356F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5218F, 19.6218F, -0.3561F, -0.8555F, -0.0361F));

		PartDefinition cube_r141 = tail4.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(41, 23).addBox(-0.5F, -1.0F, 0.5F, 1.0F, 1.0F, 18.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.4621F, -0.6281F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r142 = tail4.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(139, 81).addBox(0.0F, 16.2886F, 45.7615F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(139, 75).addBox(0.0F, 15.7886F, 43.7615F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 139).addBox(0.0F, 14.9886F, 41.7615F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(139, 62).addBox(0.0F, 14.2886F, 39.7615F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(138, 128).addBox(0.0F, 12.8886F, 37.7615F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 105).addBox(0.0F, 12.2886F, 35.7615F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(127, 138).addBox(0.0F, 11.4886F, 33.7615F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0224F, -35.1824F, 0.3054F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(39, 63).addBox(-0.5F, -0.453F, -0.112F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6152F, 17.8821F, -0.213F, -0.6515F, 0.0592F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(45, 0).addBox(-0.5F, -0.5104F, -0.0759F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.047F, 13.5897F, -0.3705F, -0.6452F, 0.1188F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.698F, -19.4115F, -0.1874F, -0.581F, -0.0138F));

		PartDefinition cube_r143 = neck.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(76, 13).addBox(-2.51F, -3.8271F, -3.9062F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.01F, 5.4537F, -0.8343F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r144 = neck.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(80, 43).addBox(-1.51F, -0.2271F, 0.0938F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -6.1727F, -5.0941F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r145 = neck.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(139, 59).addBox(0.0F, 0.0039F, -0.3847F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.4312F, -6.481F, -0.0395F, 0.0184F, 0.436F));

		PartDefinition cube_r146 = neck.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(139, 113).addBox(0.0541F, 0.0976F, -0.4779F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.2312F, -8.581F, -0.1687F, 0.0218F, 0.5232F));

		PartDefinition cube_r147 = neck.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(55, 139).mirror().addBox(0.042F, 0.0653F, -0.1852F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(64, 134).mirror().addBox(0.042F, 1.0556F, -0.3286F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5312F, -2.481F, -0.0309F, 0.0308F, 0.7849F));

		PartDefinition cube_r148 = neck.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(134, 45).mirror().addBox(0.031F, 0.8071F, -0.6087F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6312F, -0.481F, -0.2996F, 0.0218F, 1.1341F));

		PartDefinition cube_r149 = neck.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(40, 128).mirror().addBox(0.031F, 0.0575F, -0.5877F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6312F, -0.481F, -0.0378F, 0.0218F, 1.1341F));

		PartDefinition cube_r150 = neck.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(134, 24).mirror().addBox(0.0155F, 1.021F, -1.3296F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(139, 107).mirror().addBox(0.0155F, 0.0307F, -1.1862F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5312F, -3.481F, -0.0368F, 0.0234F, 0.5668F));

		PartDefinition cube_r151 = neck.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(40, 128).addBox(-0.031F, 0.0575F, -0.5877F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6312F, -0.481F, -0.0378F, -0.0218F, -1.1341F));

		PartDefinition cube_r152 = neck.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(134, 45).addBox(-0.031F, 0.8071F, -0.6087F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6312F, -0.481F, -0.2996F, -0.0218F, -1.1341F));

		PartDefinition cube_r153 = neck.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(64, 134).addBox(-0.042F, 1.0556F, -0.3286F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(55, 139).addBox(-0.042F, 0.0653F, -0.1852F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5312F, -2.481F, -0.0309F, -0.0308F, -0.7849F));

		PartDefinition cube_r154 = neck.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(134, 24).addBox(-0.0155F, 1.021F, -1.3296F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(139, 107).addBox(-0.0155F, 0.0307F, -1.1862F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5312F, -3.481F, -0.0368F, -0.0234F, -0.5668F));

		PartDefinition cube_r155 = neck.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(106, 135).addBox(0.0F, -3.099F, 5.4564F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 133).addBox(0.0F, -3.599F, 3.4564F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 135).addBox(0.0F, -3.599F, 1.4564F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0676F, -6.4784F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r156 = neck.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(34, 102).addBox(-1.0F, -1.5F, 5.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2773F, -10.0841F, -0.0436F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3227F, -5.0841F, -0.1309F, -0.2182F, 0.0F));

		PartDefinition cube_r157 = neck2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(132, 75).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 103).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5229F, -4.6055F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r158 = neck2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(83, 101).addBox(-1.0F, -0.7F, -4.8F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r159 = neck2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(139, 110).mirror().addBox(0.0541F, 0.0976F, -0.4779F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5539F, -3.4968F, -0.1687F, 0.0218F, 0.5232F));

		PartDefinition cube_r160 = neck2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(134, 41).mirror().addBox(0.0F, 0.9942F, -0.6281F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(105, 122).mirror().addBox(0.0F, 0.0039F, -0.3847F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7539F, -1.3968F, -0.0395F, 0.0184F, 0.436F));

		PartDefinition cube_r161 = neck2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(139, 110).addBox(-0.0541F, 0.0976F, -0.4779F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5539F, -3.4968F, -0.1687F, -0.0218F, -0.5232F));

		PartDefinition cube_r162 = neck2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(105, 122).addBox(0.0F, 0.0039F, -0.3847F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(134, 41).addBox(0.0F, 0.9942F, -0.6281F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7539F, -1.3968F, -0.0395F, -0.0184F, -0.436F));

		PartDefinition cube_r163 = neck2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(114, 108).addBox(-1.51F, 0.0293F, -2.0524F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -5.35F, -4.81F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r164 = neck2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(82, 33).addBox(-2.51F, -3.9289F, 0.0129F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 5.1511F, -3.6178F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r165 = neck2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(89, 92).addBox(-1.51F, -0.1289F, -4.8871F, 3.0F, 3.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.01F, -5.95F, -0.01F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r166 = neck2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(63, 138).addBox(0.0F, -2.799F, -2.5436F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 135).addBox(0.0F, -3.199F, -0.5436F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.745F, -1.3943F, -0.1309F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.2711F, -7.2601F, 0.5357F, -0.2947F, -0.0814F));

		PartDefinition cube_r167 = head.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(0, 97).addBox(-2.0F, 0.0298F, 0.0026F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.6F, -1.2F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r168 = head.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(90, 109).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -3.8743F, -2.0526F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r169 = head.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(45, 16).addBox(-3.5F, -0.1906F, -0.1864F, 7.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -2.3689F, -3.6475F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r170 = head.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(48, 114).mirror().addBox(-1.9F, 0.1F, -0.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -3.7662F, -3.562F, -0.0267F, -0.0305F, -0.5228F));

		PartDefinition cube_r171 = head.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(48, 114).addBox(-0.1F, 0.1F, -0.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.0F, -3.7662F, -3.562F, -0.0267F, 0.0305F, 0.5228F));

		PartDefinition cube_r172 = head.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(116, 0).addBox(-1.5F, -0.9F, -0.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -3.0676F, -3.6047F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r173 = head.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(136, 87).addBox(-0.5F, -0.0509F, 0.003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.3288F, -10.9337F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r174 = head.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(54, 132).addBox(-0.5F, -0.0496F, -0.0272F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5288F, -12.7337F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r175 = head.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(46, 120).addBox(-1.5F, 0.0187F, -1.8881F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.391F, -9.418F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r176 = head.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(103, 0).addBox(-2.0F, -0.079F, -1.4852F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.4573F, -7.8929F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r177 = head.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(33, 132).addBox(-1.5F, 0.0394F, -1.038F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, -3.7573F, -6.9429F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r178 = head.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(129, 87).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -2.6564F, -6.5714F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r179 = head.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(120, 16).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0586F, -14.507F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r180 = head.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(0, 104).addBox(-1.0F, -0.0651F, -4.0003F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.0527F, -10.7378F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r181 = head.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(112, 77).addBox(-1.5F, -1.1651F, 0.4997F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9F, -11.1F, 0.1222F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 2.3726F, 1.8295F, 0.3732F, -0.0034F, -0.0127F));

		PartDefinition cube_r182 = jaw.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(17, 85).mirror().addBox(-0.5F, -0.3F, -2.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-4.3252F, 0.9576F, -4.4974F, -0.0785F, -0.1396F, 0.0F));

		PartDefinition cube_r183 = jaw.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(103, 109).mirror().addBox(0.1688F, 2.2483F, -7.082F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-5.6688F, -0.822F, 0.4012F, -0.2007F, -0.1396F, 0.0F));

		PartDefinition cube_r184 = jaw.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(105, 125).mirror().addBox(0.1688F, 1.019F, -3.7334F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-5.6688F, -0.822F, 0.4012F, -0.1396F, -0.1396F, 0.0F));

		PartDefinition cube_r185 = jaw.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(55, 136).mirror().addBox(0.1688F, 0.1579F, -0.8949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(81, 129).mirror().addBox(0.1688F, 1.1579F, -1.8949F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.6688F, -0.822F, 0.4012F, 0.0524F, -0.1396F, 0.0F));

		PartDefinition cube_r186 = jaw.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(134, 108).mirror().addBox(0.1688F, 0.9191F, -3.2043F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-5.6688F, -0.822F, 0.4012F, 0.2793F, -0.1396F, 0.0F));

		PartDefinition cube_r187 = jaw.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(129, 35).mirror().addBox(0.1688F, 1.286F, -2.8378F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-5.6688F, -0.822F, 0.4012F, 0.5236F, -0.1396F, 0.0F));

		PartDefinition cube_r188 = jaw.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(80, 116).mirror().addBox(-0.4F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.0418F, 0.2221F, -6.3701F, 0.0879F, -0.1831F, -0.0039F));

		PartDefinition cube_r189 = jaw.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(13, 104).mirror().addBox(0.1688F, 0.7988F, -5.5046F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-5.6688F, -0.822F, 0.4012F, -0.1571F, -0.1396F, 0.0F));

		PartDefinition cube_r190 = jaw.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(37, 110).mirror().addBox(-0.0632F, 0.8477F, -8.0158F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-4.2688F, -0.222F, -7.5988F, -0.1246F, -0.3663F, 0.0116F));

		PartDefinition cube_r191 = jaw.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(0, 112).mirror().addBox(-0.0458F, -0.4311F, -8.1374F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-4.2688F, -0.222F, -7.5988F, -0.038F, -0.3683F, -0.0352F));

		PartDefinition cube_r192 = jaw.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(136, 70).mirror().addBox(-0.0812F, 0.5428F, -0.1534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(95, 134).mirror().addBox(-0.0632F, -0.0572F, -0.167F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-4.2688F, -0.222F, -7.5988F, -0.238F, -0.3663F, 0.0116F));

		PartDefinition cube_r193 = jaw.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(106, 91).mirror().addBox(-0.0632F, -0.0731F, -4.1566F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-4.2688F, -0.222F, -7.5988F, -0.1421F, -0.3663F, 0.0116F));

		PartDefinition cube_r194 = jaw.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(81, 133).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4304F, -1.4043F, -21.4486F, -0.2566F, -0.0228F, -0.1402F));

		PartDefinition cube_r195 = jaw.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(108, 116).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4238F, -1.4549F, -22.0464F, -0.2217F, -0.0228F, -0.1402F));

		PartDefinition cube_r196 = jaw.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(95, 138).mirror().addBox(0.0884F, 0.0275F, -0.9703F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.6552F, -0.9501F, -21.5579F, -0.0697F, -0.0523F, -0.0027F));

		PartDefinition cube_r197 = jaw.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(138, 38).mirror().addBox(0.0884F, 0.0275F, -0.8703F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.696F, -0.5415F, -20.7571F, -0.4712F, -0.0523F, -0.0027F));

		PartDefinition cube_r198 = jaw.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(136, 67).mirror().addBox(0.0884F, -0.9725F, -0.9703F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5742F, 0.0519F, -23.0527F, -1.5184F, -0.0523F, -0.0027F));

		PartDefinition cube_r199 = jaw.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(80, 137).mirror().addBox(0.0884F, -0.9725F, -0.9703F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6012F, 0.881F, -22.4942F, -0.9773F, -0.0523F, -0.0027F));

		PartDefinition cube_r200 = jaw.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(88, 132).mirror().addBox(0.0884F, -0.8725F, -1.8703F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.5504F, -20.6231F, 0.1222F, -0.0523F, -0.0027F));

		PartDefinition cube_r201 = jaw.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(114, 51).mirror().addBox(0.0884F, -0.8686F, -0.0823F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.5504F, -20.6231F, 0.0001F, -0.0523F, -0.0027F));

		PartDefinition cube_r202 = jaw.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(0, 132).mirror().addBox(-0.5F, -0.2274F, -0.8275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.6622F, -0.0922F, -15.8538F, 0.0007F, -0.2705F, -0.0028F));

		PartDefinition cube_r203 = jaw.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(139, 78).mirror().addBox(0.1F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7647F, -0.8992F, -15.8636F, 0.1593F, -0.1729F, -0.0221F));

		PartDefinition cube_r204 = jaw.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(71, 116).mirror().addBox(0.3884F, -1.7832F, 0.0197F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.6504F, -20.6231F, 0.035F, -0.0523F, -0.0027F));

		PartDefinition cube_r205 = jaw.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(133, 136).mirror().addBox(-0.5F, -0.8025F, 0.1879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(132, 63).mirror().addBox(-0.5F, -0.8025F, -1.3121F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6622F, -0.0922F, -15.8538F, 0.2101F, -0.2705F, -0.0028F));

		PartDefinition cube_r206 = jaw.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(11, 112).mirror().addBox(0.0884F, -1.0662F, -0.4578F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.5504F, -20.6231F, 0.035F, -0.0523F, -0.0027F));

		PartDefinition cube_r207 = jaw.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(34, 92).mirror().addBox(-0.1F, -0.4F, -3.3F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8772F, -0.8732F, -12.1643F, -0.0734F, -0.3836F, 0.0167F));

		PartDefinition cube_r208 = jaw.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(58, 86).mirror().addBox(-0.0632F, -0.4641F, -4.1443F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-4.2688F, -0.222F, -7.5988F, -0.0373F, -0.3663F, 0.0116F));

		PartDefinition cube_r209 = jaw.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(17, 85).addBox(-0.5F, -0.3F, -2.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(4.3252F, 0.9576F, -4.4974F, -0.0785F, 0.1396F, 0.0F));

		PartDefinition cube_r210 = jaw.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(103, 109).addBox(-1.1688F, 2.2483F, -7.082F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(5.6688F, -0.822F, 0.4012F, -0.2007F, 0.1396F, 0.0F));

		PartDefinition cube_r211 = jaw.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(105, 125).addBox(-1.1688F, 1.019F, -3.7334F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(5.6688F, -0.822F, 0.4012F, -0.1396F, 0.1396F, 0.0F));

		PartDefinition cube_r212 = jaw.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(55, 136).addBox(-1.1688F, 0.1579F, -0.8949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(81, 129).addBox(-1.1688F, 1.1579F, -1.8949F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.6688F, -0.822F, 0.4012F, 0.0524F, 0.1396F, 0.0F));

		PartDefinition cube_r213 = jaw.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(134, 108).addBox(-1.1688F, 0.9191F, -3.2043F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(5.6688F, -0.822F, 0.4012F, 0.2793F, 0.1396F, 0.0F));

		PartDefinition cube_r214 = jaw.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(129, 35).addBox(-1.1688F, 1.286F, -2.8378F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.6688F, -0.822F, 0.4012F, 0.5236F, 0.1396F, 0.0F));

		PartDefinition cube_r215 = jaw.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(80, 116).addBox(-0.6F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.0418F, 0.2221F, -6.3701F, 0.0879F, 0.1831F, 0.0039F));

		PartDefinition cube_r216 = jaw.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(13, 104).addBox(-1.1688F, 0.7988F, -5.5046F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(5.6688F, -0.822F, 0.4012F, -0.1571F, 0.1396F, 0.0F));

		PartDefinition cube_r217 = jaw.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(37, 110).addBox(-0.9368F, 0.8477F, -8.0158F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(4.2688F, -0.222F, -7.5988F, -0.1246F, 0.3663F, -0.0116F));

		PartDefinition cube_r218 = jaw.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(0, 112).addBox(-0.9542F, -0.4311F, -8.1374F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(4.2688F, -0.222F, -7.5988F, -0.038F, 0.3683F, 0.0352F));

		PartDefinition cube_r219 = jaw.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(136, 70).addBox(-0.9188F, 0.5428F, -0.1534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(95, 134).addBox(-0.9368F, -0.0572F, -0.167F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(4.2688F, -0.222F, -7.5988F, -0.238F, 0.3663F, -0.0116F));

		PartDefinition cube_r220 = jaw.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(106, 91).addBox(-0.9368F, -0.0731F, -4.1566F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(4.2688F, -0.222F, -7.5988F, -0.1421F, 0.3663F, -0.0116F));

		PartDefinition cube_r221 = jaw.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(81, 133).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4304F, -1.4043F, -21.4486F, -0.2566F, 0.0228F, 0.1402F));

		PartDefinition cube_r222 = jaw.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(108, 116).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4238F, -1.4549F, -22.0464F, -0.2217F, 0.0228F, 0.1402F));

		PartDefinition cube_r223 = jaw.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(95, 138).addBox(-1.0884F, 0.0275F, -0.9703F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.6552F, -0.9501F, -21.5579F, -0.0697F, 0.0523F, 0.0027F));

		PartDefinition cube_r224 = jaw.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(138, 38).addBox(-1.0884F, 0.0275F, -0.8703F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.696F, -0.5415F, -20.7571F, -0.4712F, 0.0523F, 0.0027F));

		PartDefinition cube_r225 = jaw.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(136, 67).addBox(-1.0884F, -0.9725F, -0.9703F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5742F, 0.0519F, -23.0527F, -1.5184F, 0.0523F, 0.0027F));

		PartDefinition cube_r226 = jaw.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(80, 137).addBox(-1.0884F, -0.9725F, -0.9703F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.6012F, 0.881F, -22.4942F, -0.9773F, 0.0523F, 0.0027F));

		PartDefinition cube_r227 = jaw.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(88, 132).addBox(-1.0884F, -0.8725F, -1.8703F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.7F, 0.5504F, -20.6231F, 0.1222F, 0.0523F, 0.0027F));

		PartDefinition cube_r228 = jaw.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(114, 51).addBox(-1.0884F, -0.8686F, -0.0823F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.7F, 0.5504F, -20.6231F, 0.0001F, 0.0523F, 0.0027F));

		PartDefinition cube_r229 = jaw.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(0, 132).addBox(-0.5F, -0.2274F, -0.8275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.6622F, -0.0922F, -15.8538F, 0.0007F, 0.2705F, 0.0028F));

		PartDefinition cube_r230 = jaw.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(139, 78).addBox(-0.1F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7647F, -0.8992F, -15.8636F, 0.1593F, 0.1729F, 0.0221F));

		PartDefinition cube_r231 = jaw.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(71, 116).addBox(-0.3884F, -1.7832F, 0.0197F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.6504F, -20.6231F, 0.035F, 0.0523F, 0.0027F));

		PartDefinition cube_r232 = jaw.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(133, 136).addBox(-0.5F, -0.8025F, 0.1879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(132, 63).addBox(-0.5F, -0.8025F, -1.3121F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6622F, -0.0922F, -15.8538F, 0.2101F, 0.2705F, 0.0028F));

		PartDefinition cube_r233 = jaw.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(11, 112).addBox(-1.0884F, -1.0662F, -0.4578F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.5504F, -20.6231F, 0.035F, 0.0523F, 0.0027F));

		PartDefinition cube_r234 = jaw.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(34, 92).addBox(0.1F, -0.4F, -3.3F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8772F, -0.8732F, -12.1643F, -0.0734F, 0.3836F, -0.0167F));

		PartDefinition cube_r235 = jaw.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(58, 86).addBox(-0.9368F, -0.4641F, -4.1443F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(4.2688F, -0.222F, -7.5988F, -0.0373F, 0.3663F, -0.0116F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5F, -2.5771F, 0.8983F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(132, 59).addBox(-0.2F, -0.4098F, -1.1382F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.4F, 0.3F, 0.0F, -0.3709F, -0.0378F, -0.524F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(7, 133).addBox(-0.2F, -0.9665F, 0.3754F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 0.3F, 0.0F, -0.1789F, -0.0378F, -0.524F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(134, 117).addBox(-0.2F, -0.9F, -0.5035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.4F, 0.3F, 0.0F, -0.0393F, -0.0378F, -0.524F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(89, 128).addBox(0.5F, -0.5038F, -1.4928F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, 4.9613F, -4.8681F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(0, 127).addBox(-0.1621F, -0.2603F, -1.5951F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4965F, 4.5816F, -8.1153F, 0.0211F, -0.2603F, -0.028F));

		PartDefinition cube_r241 = leftFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(58, 79).addBox(0.8F, -0.3F, -2.4F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.581F, 4.8583F, -11.6662F, 0.0802F, 0.4955F, 0.043F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(76, 113).addBox(0.0F, -0.5F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0627F, 5.6618F, -14.515F, 0.3313F, -0.0302F, -0.0293F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(116, 69).addBox(-0.2F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2166F, 5.4782F, -19.2195F, -0.0351F, 0.1221F, -0.0034F));

		PartDefinition cube_r244 = leftFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(133, 91).addBox(0.2F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9741F, 5.5832F, -16.2045F, -0.0351F, -0.1221F, 0.0052F));

		PartDefinition cube_r245 = leftFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(131, 132).addBox(-0.1F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0178F, 6.6616F, -21.2984F, 2.408F, -0.0746F, -0.3624F));

		PartDefinition cube_r246 = leftFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(66, 119).addBox(-0.3F, -0.2F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(132, 113).addBox(-0.3F, -0.2F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4F, 6.9746F, -22.3013F, 2.4017F, -0.1393F, -0.3034F));

		PartDefinition cube_r247 = leftFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(106, 98).addBox(-1.0F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7729F, 5.8751F, -22.3247F, 0.5209F, -0.1761F, -0.4226F));

		PartDefinition cube_r248 = leftFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(136, 54).addBox(-0.5F, -7.9367F, -4.5424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 3.7771F, -14.2983F, 1.2566F, 0.0F, -0.0009F));

		PartDefinition cube_r249 = leftFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(101, 131).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7F, 5.0231F, -21.6361F, 0.7957F, -0.24F, -0.4943F));

		PartDefinition cube_r250 = leftFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(47, 131).addBox(-0.5F, -3.2508F, -8.077F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 3.7771F, -14.2983F, 0.4887F, 0.0F, -0.0009F));

		PartDefinition cube_r251 = leftFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(108, 131).addBox(-0.9996F, -1.0225F, -2.0208F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.3F, 5.4771F, -15.1983F, -0.0348F, -0.1571F, -0.3325F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(127, 9).addBox(-0.5F, -0.8F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3419F, 3.742F, -16.2433F, 0.1921F, -0.1571F, -0.3325F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(113, 98).addBox(-0.9984F, -1.846F, -3.8797F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.6F, 5.4771F, -17.0983F, 0.0997F, 0.1215F, -0.3505F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(99, 51).addBox(-0.4641F, -0.0312F, -5.2204F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0359F, 2.5198F, -16.1126F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(60, 113).addBox(-0.9996F, -1.0889F, -4.122F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.6F, 5.4771F, -17.0983F, -0.0399F, 0.1215F, -0.3505F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(50, 125).addBox(-0.789F, -2.8833F, -1.7989F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.299F, 4.7765F, -13.635F, 0.3229F, 0.2158F, -0.2697F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(114, 113).addBox(-1.0151F, -2.8659F, -0.7999F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5F, 4.7771F, -14.0983F, -0.1468F, 0.467F, -0.4112F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(31, 117).addBox(-1.0733F, -2.6202F, 0.1849F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3873F, 4.4821F, -12.3304F, -0.1126F, 0.6622F, -0.4346F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(127, 0).addBox(-1.0427F, -1.9581F, -0.11F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2F, 4.6771F, -11.3983F, -0.1346F, 0.3977F, -0.3884F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(127, 21).addBox(-0.6F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3049F, 3.9407F, -7.7594F, -0.0216F, -0.1823F, -0.3921F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(134, 20).addBox(-0.4F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1904F, 3.9587F, -9.058F, -0.0223F, 0.3063F, -0.4027F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(0, 85).addBox(-0.1F, -0.6F, -3.8F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.8587F, 0.6487F, -7.6611F, 0.2507F, 0.1228F, -0.0211F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(108, 120).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.8025F, 1.9919F, -7.8353F, 0.3038F, 0.3856F, -0.523F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(17, 92).addBox(-0.8121F, -2.5676F, -6.621F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(3.5644F, 1.866F, -4.7032F, 0.0857F, 0.3856F, -0.523F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(99, 116).addBox(-1.1F, -1.5192F, -0.5359F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(4.0F, 4.2587F, -7.232F, -0.128F, 0.4245F, -0.4193F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(74, 132).addBox(-0.5F, -0.0092F, -0.0362F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(3.9028F, 1.8348F, -3.1596F, 0.8627F, 0.2283F, -0.5232F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(72, 136).addBox(-0.5F, -2.036F, 0.4655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.9028F, 1.8348F, -3.1596F, -0.1409F, 0.2283F, -0.5232F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(114, 41).addBox(-0.5F, -1.0718F, -2.3789F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(3.9028F, 1.8348F, -3.1596F, 0.6271F, 0.2283F, -0.5232F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(120, 36).addBox(-0.5F, 1.0688F, -2.4113F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(3.9028F, 1.8348F, -3.1596F, -0.1758F, 0.2283F, -0.5232F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(74, 127).addBox(-0.5F, -0.3566F, -0.8117F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.9028F, 1.8348F, -3.1596F, -0.4725F, 0.2283F, -0.5232F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(66, 16).addBox(-0.7F, -2.0F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(4.1701F, 1.9555F, -2.9014F, -0.1145F, 0.2132F, -0.6085F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(49, 107).addBox(-1.0F, -1.6857F, -0.6491F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(5.1715F, 4.3675F, -4.4723F, -0.0546F, 0.2354F, -0.3409F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(125, 110).addBox(-1.5F, -0.5F, -1.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.93F, 4.0888F, 0.0778F, -1.1974F, -0.1525F, 0.4011F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(99, 42).addBox(-0.5F, -1.0F, -3.5F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7065F, 2.7849F, -1.0299F, -1.181F, 0.0188F, -0.5858F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(134, 79).addBox(-0.5F, -0.4F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3653F, -0.6176F, -5.0935F, 0.3167F, 0.0266F, 0.7209F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(96, 122).addBox(-2.0895F, -1.1254F, -2.8025F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2165F, -0.2431F, -5.0939F, 0.1644F, 0.0521F, -0.0248F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(40, 131).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4F, -0.7075F, -8.6437F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(75, 122).addBox(-1.9298F, -1.1451F, -1.6272F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.2165F, -0.2431F, -5.0939F, 0.1859F, 0.2245F, 0.0013F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.5F, -2.5771F, 0.8983F));

		PartDefinition cube_r279 = rightFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(132, 59).mirror().addBox(-0.8F, -0.4098F, -1.1382F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 0.3F, 0.0F, -0.3709F, 0.0378F, 0.524F));

		PartDefinition cube_r280 = rightFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(7, 133).mirror().addBox(-0.8F, -0.9665F, 0.3754F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 0.3F, 0.0F, -0.1789F, 0.0378F, 0.524F));

		PartDefinition cube_r281 = rightFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(134, 117).mirror().addBox(-0.8F, -0.9F, -0.5035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 0.3F, 0.0F, -0.0393F, 0.0378F, 0.524F));

		PartDefinition cube_r282 = rightFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(89, 128).mirror().addBox(-1.5F, -0.5038F, -1.4928F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 4.9613F, -4.8681F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r283 = rightFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(0, 127).mirror().addBox(0.1621F, -0.2603F, -1.5951F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4965F, 4.5816F, -8.1153F, 0.0211F, 0.2603F, 0.028F));

		PartDefinition cube_r284 = rightFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(58, 79).mirror().addBox(-0.8F, -0.3F, -2.4F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.581F, 4.8583F, -11.6662F, 0.0802F, -0.4955F, -0.043F));

		PartDefinition cube_r285 = rightFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(76, 113).mirror().addBox(0.0F, -0.5F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0627F, 5.6618F, -14.515F, 0.3313F, 0.0302F, 0.0293F));

		PartDefinition cube_r286 = rightFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(116, 69).mirror().addBox(0.2F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2166F, 5.4782F, -19.2195F, -0.0351F, -0.1221F, 0.0034F));

		PartDefinition cube_r287 = rightFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(133, 91).mirror().addBox(-0.2F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9741F, 5.5832F, -16.2045F, -0.0351F, 0.1221F, -0.0052F));

		PartDefinition cube_r288 = rightFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(131, 132).mirror().addBox(-0.9F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0178F, 6.6616F, -21.2984F, 2.408F, 0.0746F, 0.3624F));

		PartDefinition cube_r289 = rightFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(66, 119).mirror().addBox(-0.7F, -0.2F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(132, 113).mirror().addBox(-0.7F, -0.2F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 6.9746F, -22.3013F, 2.4017F, 0.1393F, 0.3034F));

		PartDefinition cube_r290 = rightFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(106, 98).mirror().addBox(-1.0F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7729F, 5.8751F, -22.3247F, 0.5209F, 0.1761F, 0.4226F));

		PartDefinition cube_r291 = rightFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(136, 54).mirror().addBox(-0.5F, -7.9367F, -4.5424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.7771F, -14.2983F, 1.2566F, 0.0F, 0.0009F));

		PartDefinition cube_r292 = rightFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(101, 131).mirror().addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 5.0231F, -21.6361F, 0.7957F, 0.24F, 0.4943F));

		PartDefinition cube_r293 = rightFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(47, 131).mirror().addBox(-0.5F, -3.2508F, -8.077F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.7771F, -14.2983F, 0.4887F, 0.0F, 0.0009F));

		PartDefinition cube_r294 = rightFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(108, 131).mirror().addBox(-0.0004F, -1.0225F, -2.0208F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 5.4771F, -15.1983F, -0.0348F, 0.1571F, 0.3325F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(127, 9).mirror().addBox(-0.5F, -0.8F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3419F, 3.742F, -16.2433F, 0.1921F, 0.1571F, 0.3325F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(113, 98).mirror().addBox(-0.0016F, -1.846F, -3.8797F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 5.4771F, -17.0983F, 0.0997F, -0.1215F, 0.3505F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(99, 51).mirror().addBox(-0.5359F, -0.0312F, -5.2204F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0359F, 2.5198F, -16.1126F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(60, 113).mirror().addBox(-0.0004F, -1.0889F, -4.122F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 5.4771F, -17.0983F, -0.0399F, -0.1215F, 0.3505F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(50, 125).mirror().addBox(-0.211F, -2.8833F, -1.7989F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.299F, 4.7765F, -13.635F, 0.3229F, -0.2158F, 0.2697F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(114, 113).mirror().addBox(0.0151F, -2.8659F, -0.7999F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 4.7771F, -14.0983F, -0.1468F, -0.467F, 0.4112F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(31, 117).mirror().addBox(0.0733F, -2.6202F, 0.1849F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3873F, 4.4821F, -12.3304F, -0.1126F, -0.6622F, 0.4346F));

		PartDefinition cube_r302 = rightFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(127, 0).mirror().addBox(0.0427F, -1.9581F, -0.11F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, 4.6771F, -11.3983F, -0.1346F, -0.3977F, 0.3884F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(127, 21).mirror().addBox(-0.4F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3049F, 3.9407F, -7.7594F, -0.0216F, 0.1823F, 0.3921F));

		PartDefinition cube_r304 = rightFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(134, 20).mirror().addBox(-0.6F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1904F, 3.9587F, -9.058F, -0.0223F, -0.3063F, 0.4027F));

		PartDefinition cube_r305 = rightFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(-0.9F, -0.6F, -3.8F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.8587F, 0.6487F, -7.6611F, 0.2507F, -0.1228F, 0.0211F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(108, 120).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.8025F, 1.9919F, -7.8353F, 0.3038F, -0.3856F, 0.523F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(17, 92).mirror().addBox(-0.1879F, -2.5676F, -6.621F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-3.5644F, 1.866F, -4.7032F, 0.0857F, -0.3856F, 0.523F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(99, 116).mirror().addBox(0.1F, -1.5192F, -0.5359F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 4.2587F, -7.232F, -0.128F, -0.4245F, 0.4193F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(74, 132).mirror().addBox(-0.5F, -0.0092F, -0.0362F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-3.9028F, 1.8348F, -3.1596F, 0.8627F, -0.2283F, 0.5232F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(72, 136).mirror().addBox(-0.5F, -2.036F, 0.4655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.9028F, 1.8348F, -3.1596F, -0.1409F, -0.2283F, 0.5232F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(114, 41).mirror().addBox(-0.5F, -1.0718F, -2.3789F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-3.9028F, 1.8348F, -3.1596F, 0.6271F, -0.2283F, 0.5232F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(120, 36).mirror().addBox(-0.5F, 1.0688F, -2.4113F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-3.9028F, 1.8348F, -3.1596F, -0.1758F, -0.2283F, 0.5232F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(74, 127).mirror().addBox(-0.5F, -0.3566F, -0.8117F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.9028F, 1.8348F, -3.1596F, -0.4725F, -0.2283F, 0.5232F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(66, 16).mirror().addBox(-0.3F, -2.0F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-4.1701F, 1.9555F, -2.9014F, -0.1145F, -0.2132F, 0.6085F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(49, 107).mirror().addBox(0.0F, -1.6857F, -0.6491F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-5.1715F, 4.3675F, -4.4723F, -0.0546F, -0.2354F, 0.3409F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(125, 110).mirror().addBox(-1.5F, -0.5F, -1.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.93F, 4.0888F, 0.0778F, -1.1974F, 0.1525F, -0.4011F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(99, 42).mirror().addBox(-0.5F, -1.0F, -3.5F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7065F, 2.7849F, -1.0299F, -1.181F, -0.0188F, 0.5858F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(134, 79).mirror().addBox(-0.5F, -0.4F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3653F, -0.6176F, -5.0935F, 0.3167F, -0.0266F, -0.7209F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(96, 122).mirror().addBox(0.0895F, -1.1254F, -2.8025F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2165F, -0.2431F, -5.0939F, 0.1644F, -0.0521F, 0.0248F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(40, 131).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.7075F, -8.6437F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(75, 122).mirror().addBox(-0.0702F, -1.1451F, -1.6272F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.2165F, -0.2431F, -5.0939F, 0.1859F, -0.2245F, -0.0013F));

		return LayerDefinition.create(meshdefinition, 144, 144);
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