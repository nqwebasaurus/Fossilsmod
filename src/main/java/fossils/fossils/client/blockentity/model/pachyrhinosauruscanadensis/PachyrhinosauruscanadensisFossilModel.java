package fossils.fossils.client.blockentity.model.pachyrhinosauruscanadensis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PachyrhinosauruscanadensisFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftleg;
	private final ModelPart leftleg2;
	private final ModelPart leftleg3;
	private final ModelPart leftfoot;
	private final ModelPart leftfoot2;
	private final ModelPart rightleg;
	private final ModelPart rightleg2;
	private final ModelPart rightleg3;
	private final ModelPart rightfoot;
	private final ModelPart rightfoot2;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart lefthand;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart righthand;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftCheek;
	private final ModelPart rightCheek;
	private final ModelPart leftBeak;
	private final ModelPart rightBeak;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart leftLowerbeak;
	private final ModelPart rightLowerbeak;
	private final ModelPart frill;
	private final ModelPart leftFrill;
	private final ModelPart rightFrill;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public PachyrhinosauruscanadensisFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftleg = this.hips.getChild("leftleg");
		this.leftleg2 = this.leftleg.getChild("leftleg2");
		this.leftleg3 = this.leftleg2.getChild("leftleg3");
		this.leftfoot = this.leftleg3.getChild("leftfoot");
		this.leftfoot2 = this.leftfoot.getChild("leftfoot2");
		this.rightleg = this.hips.getChild("rightleg");
		this.rightleg2 = this.rightleg.getChild("rightleg2");
		this.rightleg3 = this.rightleg2.getChild("rightleg3");
		this.rightfoot = this.rightleg3.getChild("rightfoot");
		this.rightfoot2 = this.rightfoot.getChild("rightfoot2");
		this.bone = this.hips.getChild("bone");
		this.bone2 = this.hips.getChild("bone2");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.lefthand = this.leftarm2.getChild("lefthand");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.righthand = this.rightarm2.getChild("righthand");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftCheek = this.head.getChild("leftCheek");
		this.rightCheek = this.head.getChild("rightCheek");
		this.leftBeak = this.head.getChild("leftBeak");
		this.rightBeak = this.head.getChild("rightBeak");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.leftLowerbeak = this.jaw.getChild("leftLowerbeak");
		this.rightLowerbeak = this.jaw.getChild("rightLowerbeak");
		this.frill = this.head.getChild("frill");
		this.leftFrill = this.frill.getChild("leftFrill");
		this.rightFrill = this.frill.getChild("rightFrill");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 1.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, -1.2889F, -5.6091F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -26.9642F, 3.441F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(29, 9).addBox(-0.2863F, -3.0014F, -5.1563F, 0.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8323F, 1.2351F, 0.0087F, 0.0349F, 1.5708F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(29, 16).addBox(0.0F, 0.2287F, -9.4177F, 0.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.8769F, 6.0243F, -0.2443F, 0.0F, 0.0F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(15, 76).addBox(-1.5F, 11.7833F, -5.8553F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.9F, -1.3442F, 1.2219F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r3 = leftleg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(63, 96).addBox(0.5F, -0.5872F, 0.6264F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.0F, 10.1705F, -5.7817F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r4 = leftleg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(55, 115).addBox(0.5F, -2.0872F, -0.9736F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.0F, 11.8705F, -1.8817F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r5 = leftleg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(82, 15).addBox(-1.5F, -1.3F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r6 = leftleg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(66, 70).addBox(-0.5F, -0.1075F, -1.9404F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 2.2114F, 0.1013F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r7 = leftleg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(67, 84).addBox(-0.5F, -5.9225F, -1.5513F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 7.5114F, -2.2987F, -0.3927F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.776F, -4.3925F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r8 = leftleg2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(19, 120).addBox(-0.1F, -1.4383F, -0.6279F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F))
				.texOffs(81, 104).addBox(-0.1F, -0.4383F, -0.1279F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 0.3503F, 1.0988F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r9 = leftleg2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(81, 61).addBox(-1.5F, -2.1773F, 0.1893F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 1.7007F, -0.2687F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r10 = leftleg2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(95, 86).addBox(-1.0F, -0.3F, -1.8F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 8.9595F, 5.4154F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r11 = leftleg2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(52, 106).addBox(-1.0F, -3.5F, -1.3F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(33, 93).addBox(-1.0F, -3.5F, -0.5F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.6F, 3.6774F, 3.4611F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r12 = leftleg2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(33, 121).addBox(-1.0F, -1.0F, -0.3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-0.6F, 7.9691F, 3.8221F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r13 = leftleg2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(117, 80).addBox(-1.0F, -0.6F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-0.6F, 5.8322F, 4.8238F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r14 = leftleg2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(101, 105).addBox(-0.601F, -0.0989F, -0.0792F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.499F, 1.3879F, 0.5086F, 0.4712F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.7174F, 4.4837F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r15 = leftleg3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(103, 68).addBox(-1.102F, -2.4938F, -0.3569F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(118, 45).addBox(-1.102F, -0.4938F, 0.1431F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.499F, 2.0848F, -1.2602F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2542F, 0.3595F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r16 = leftfoot.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(119, 77).addBox(-1.0F, -2.1328F, 1.6483F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.499F, 3.5993F, -1.6813F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leftfoot2 = leftfoot.addOrReplaceChild("leftfoot2", CubeListBuilder.create().texOffs(58, 8).addBox(-1.999F, -0.5853F, -4.8253F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3686F, -1.7616F, -0.1484F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(77, 8).addBox(-1.5F, 11.7833F, -5.8553F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.9F, -1.3442F, 1.2219F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r17 = rightleg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(100, 27).addBox(-3.5F, -0.5872F, 0.6264F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(2.0F, 10.1705F, -5.7817F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r18 = rightleg.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(75, 115).addBox(-3.5F, -2.0872F, -0.9736F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.0F, 11.8705F, -1.8817F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r19 = rightleg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(13, 83).addBox(-1.5F, -1.3F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r20 = rightleg.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(30, 71).addBox(-1.5F, -0.1075F, -1.9404F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 2.2114F, 0.1013F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r21 = rightleg.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(88, 86).addBox(-1.5F, -5.9225F, -1.5513F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, 7.5114F, -2.2987F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.776F, -4.3925F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r22 = rightleg2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(120, 27).addBox(-0.9F, -1.4383F, -0.6279F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F))
				.texOffs(86, 104).addBox(-0.9F, -0.4383F, -0.1279F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 0.3503F, 1.0988F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r23 = rightleg2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 82).addBox(-0.5F, -2.1773F, 0.1893F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 1.7007F, -0.2687F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r24 = rightleg2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(95, 92).addBox(-1.0F, -0.3F, -1.8F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 8.9595F, 5.4154F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r25 = rightleg2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(73, 106).addBox(-1.0F, -3.5F, -1.3F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(74, 95).addBox(-1.0F, -3.5F, -0.5F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.6F, 3.6774F, 3.4611F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r26 = rightleg2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(47, 121).addBox(-1.0F, -1.0F, -0.3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.6F, 7.9691F, 3.8221F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r27 = rightleg2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(117, 91).addBox(-1.0F, -0.6F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.6F, 5.8322F, 4.8238F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r28 = rightleg2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(106, 5).addBox(-0.399F, -0.0989F, -0.0792F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.499F, 1.3879F, 0.5086F, 0.4712F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.7174F, 4.4837F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r29 = rightleg3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(104, 37).addBox(-1.898F, -2.4938F, -0.3569F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(118, 49).addBox(-1.898F, -0.4938F, 0.1431F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.499F, 2.0848F, -1.2602F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2542F, 0.3595F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r30 = rightfoot.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(115, 121).addBox(-2.0F, -2.1328F, 1.6483F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.499F, 3.5993F, -1.6813F, 0.9599F, 0.0F, 0.0F));

		PartDefinition rightfoot2 = rightfoot.addOrReplaceChild("rightfoot2", CubeListBuilder.create().texOffs(32, 64).addBox(-2.001F, -0.5853F, -4.8253F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3686F, -1.7616F, 0.5061F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(83, 136).addBox(3.0F, 0.9457F, 3.5168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1324F, 5.2071F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(103, 0).addBox(-0.5F, -0.1272F, 0.045F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.5F, -0.9439F, -0.7753F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(81, 98).addBox(-0.4436F, -0.0757F, -3.7529F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0923F, -0.9154F, -6.914F, 0.3482F, -0.2452F, -0.0615F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(32, 55).addBox(-1.4713F, -0.0614F, -6.2977F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0923F, -0.9154F, -6.914F, 0.3542F, -0.2909F, -0.0945F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(83, 123).addBox(-0.7823F, 7.1288F, 5.3606F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, 3.7248F, -2.4781F, 0.1429F, -0.1955F, 0.1629F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(106, 113).addBox(-0.7823F, -3.1363F, 6.0067F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.3F, 3.7248F, -2.4781F, -1.0352F, -0.1955F, 0.1629F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(88, 73).addBox(-0.9233F, -0.934F, 1.637F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, 3.7248F, -2.4781F, -0.683F, -0.2012F, 0.1172F));

		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(66, 114).addBox(-0.9039F, -0.2249F, -0.9552F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, 3.7248F, -2.4781F, -0.3577F, -0.2002F, 0.0827F));

		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(100, 55).addBox(-0.9039F, -1.6321F, -1.2497F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.3F, 3.7248F, -2.4781F, -0.9162F, -0.2002F, 0.0827F));

		PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(132, 23).addBox(0.5F, -0.2068F, 2.9826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(124, 15).addBox(-0.5F, -0.2068F, 2.9826F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -0.9439F, -0.7753F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(124, 36).addBox(2.888F, -0.3532F, 1.7766F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -0.9439F, -0.7753F, -0.5468F, -0.6219F, 0.3408F));

		PartDefinition cube_r41 = bone.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(39, 73).addBox(-0.5F, 1.5723F, -1.4194F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.5F, -0.9439F, -0.7753F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r42 = bone.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(13, 96).addBox(1.3435F, -0.0927F, -0.3694F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.5F, -0.9439F, -0.7753F, -0.3787F, -0.1289F, 0.0537F));

		PartDefinition cube_r43 = bone.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(67, 15).addBox(-0.8879F, 0.8704F, 1.8422F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(54, 0).addBox(-0.8879F, -0.1296F, -0.1578F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4923F, -0.9154F, -6.614F, -0.0014F, 0.0492F, 0.0211F));

		PartDefinition cube_r44 = bone.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(111, 27).addBox(-0.5F, -0.379F, -1.9851F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.5F, -0.1581F, -5.9218F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r45 = bone.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(51, 100).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9895F, 4.2391F, -4.4683F, 0.1766F, -0.2173F, -0.0193F));

		PartDefinition cube_r46 = bone.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(75, 70).addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1963F, 1.9781F, -4.9741F, -0.0221F, -0.0404F, 0.1367F));

		PartDefinition cube_r47 = bone.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(113, 32).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.7662F, 7.215F, -9.3664F, 0.7685F, -0.0462F, -0.0246F));

		PartDefinition cube_r48 = bone.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(88, 125).addBox(-0.5F, -0.3F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7733F, 6.657F, -9.8155F, 1.9466F, -0.0462F, -0.0246F));

		PartDefinition cube_r49 = bone.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(26, 120).addBox(-0.3896F, -0.0277F, -7.1966F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(54, 84).addBox(-0.3896F, 0.4723F, -4.8966F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.4F, 3.4642F, -5.8347F, 0.5503F, -0.0462F, -0.0246F));

		PartDefinition cube_r50 = bone.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(111, 53).addBox(-0.3896F, -0.7892F, -2.8562F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, 3.4642F, -5.8347F, 0.9867F, -0.0462F, -0.0246F));

		PartDefinition cube_r51 = bone.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(49, 55).addBox(0.4898F, -0.082F, -6.3045F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0923F, -0.9154F, -6.914F, 0.3381F, -0.0643F, 0.0038F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(83, 136).mirror().addBox(-4.0F, 0.9457F, 3.5168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.1324F, 5.2071F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r52 = bone2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(103, 0).mirror().addBox(-1.5F, -0.1272F, 0.045F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -0.9439F, -0.7753F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r53 = bone2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(81, 98).mirror().addBox(-0.5564F, -0.0757F, -3.7529F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0923F, -0.9154F, -6.914F, 0.3482F, 0.2452F, 0.0615F));

		PartDefinition cube_r54 = bone2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(32, 55).mirror().addBox(0.4713F, -0.0614F, -6.2977F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0923F, -0.9154F, -6.914F, 0.3542F, 0.2909F, 0.0945F));

		PartDefinition cube_r55 = bone2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(83, 123).mirror().addBox(-0.2177F, 7.1288F, 5.3606F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 3.7248F, -2.4781F, 0.1429F, 0.1955F, -0.1629F));

		PartDefinition cube_r56 = bone2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(106, 113).mirror().addBox(-0.2177F, -3.1363F, 6.0067F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 3.7248F, -2.4781F, -1.0352F, 0.1955F, -0.1629F));

		PartDefinition cube_r57 = bone2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(88, 73).mirror().addBox(-0.0767F, -0.934F, 1.637F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 3.7248F, -2.4781F, -0.683F, 0.2012F, -0.1172F));

		PartDefinition cube_r58 = bone2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(66, 114).mirror().addBox(-0.0961F, -0.2249F, -0.9552F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 3.7248F, -2.4781F, -0.3577F, 0.2002F, -0.0827F));

		PartDefinition cube_r59 = bone2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(100, 55).mirror().addBox(-0.0961F, -1.6321F, -1.2497F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 3.7248F, -2.4781F, -0.9162F, 0.2002F, -0.0827F));

		PartDefinition cube_r60 = bone2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(132, 23).mirror().addBox(-1.5F, -0.2068F, 2.9826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(124, 15).mirror().addBox(-0.5F, -0.2068F, 2.9826F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -0.9439F, -0.7753F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r61 = bone2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(124, 36).mirror().addBox(-3.888F, -0.3532F, 1.7766F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -0.9439F, -0.7753F, -0.5468F, 0.6219F, -0.3408F));

		PartDefinition cube_r62 = bone2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(39, 73).mirror().addBox(-0.5F, 1.5723F, -1.4194F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -0.9439F, -0.7753F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r63 = bone2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(13, 96).mirror().addBox(-2.3435F, -0.0927F, -0.3694F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -0.9439F, -0.7753F, -0.3787F, 0.1289F, -0.0537F));

		PartDefinition cube_r64 = bone2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(67, 15).mirror().addBox(-0.1121F, 0.8704F, 1.8422F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 0).mirror().addBox(-2.1121F, -0.1296F, -0.1578F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4923F, -0.9154F, -6.614F, -0.0014F, -0.0492F, -0.0211F));

		PartDefinition cube_r65 = bone2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(111, 27).mirror().addBox(-0.5F, -0.379F, -1.9851F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -0.1581F, -5.9218F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r66 = bone2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(51, 100).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9895F, 4.2391F, -4.4683F, 0.1766F, 0.2173F, 0.0193F));

		PartDefinition cube_r67 = bone2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(75, 70).mirror().addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1963F, 1.9781F, -4.9741F, -0.0221F, 0.0404F, -0.1367F));

		PartDefinition cube_r68 = bone2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(113, 32).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.7662F, 7.215F, -9.3664F, 0.7685F, 0.0462F, 0.0246F));

		PartDefinition cube_r69 = bone2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(88, 125).mirror().addBox(-0.5F, -0.3F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7733F, 6.657F, -9.8155F, 1.9466F, 0.0462F, 0.0246F));

		PartDefinition cube_r70 = bone2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(26, 120).mirror().addBox(-0.6104F, -0.0277F, -7.1966F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(54, 84).mirror().addBox(-0.6104F, 0.4723F, -4.8966F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 3.4642F, -5.8347F, 0.5503F, 0.0462F, 0.0246F));

		PartDefinition cube_r71 = bone2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(111, 53).mirror().addBox(-0.6104F, -0.7892F, -2.8562F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, 3.4642F, -5.8347F, 0.9867F, 0.0462F, 0.0246F));

		PartDefinition cube_r72 = bone2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(49, 55).mirror().addBox(-1.4898F, -0.082F, -6.3045F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0923F, -0.9154F, -6.914F, 0.3381F, 0.0643F, -0.0038F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5213F, -5.4155F, 0.1854F, 0.1728F, 0.0245F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(109, 122).addBox(0.0F, -6.0976F, -0.0647F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7877F, -0.9747F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(106, 122).addBox(0.0F, -6.9616F, -2.8978F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 121).addBox(0.0F, -6.8616F, -4.6978F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4123F, -0.3747F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(96, 119).addBox(0.0F, -6.8908F, -0.3637F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9877F, -6.5747F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(103, 122).addBox(0.0F, -6.9749F, -0.1539F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2123F, -12.8747F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(100, 116).addBox(0.0F, -6.9105F, -0.135F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3877F, -10.8747F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(16, 120).addBox(0.0F, -6.8762F, -0.8887F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5877F, -8.0747F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(131, 122).mirror().addBox(-5.2728F, -3.7551F, -3.8674F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.2877F, -0.7747F, -0.0743F, 0.3403F, -1.4196F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(105, 66).mirror().addBox(-5.5404F, -3.7531F, -1.3509F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.2877F, -0.7747F, -0.0802F, -0.1638F, -1.3855F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(131, 88).mirror().addBox(-4.3201F, -1.8312F, -0.3873F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.2877F, -0.7747F, -0.3878F, -0.4083F, -0.7776F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(131, 86).mirror().addBox(-2.9365F, -0.3355F, -0.2682F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.2877F, -0.7747F, -0.5848F, -0.1986F, -0.2448F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(128, 75).mirror().addBox(-0.8705F, -0.3797F, 3.4961F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(26, 128).mirror().addBox(-0.9353F, -0.4398F, 1.4981F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(59, 127).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4464F, -0.7624F, -4.5842F, -0.0072F, -0.0098F, 0.5446F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(86, 39).mirror().addBox(-2.9663F, 0.0137F, -0.0729F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8818F, 3.4411F, -3.8107F, -0.0395F, 0.2075F, -1.3935F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(123, 24).mirror().addBox(-5.4552F, -3.7693F, -1.3415F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.2877F, -2.7747F, -0.0482F, 0.0078F, -1.388F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(131, 96).mirror().addBox(-4.2564F, -1.8861F, -0.4108F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.2877F, -2.7747F, -0.2586F, -0.283F, -0.8215F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(131, 69).mirror().addBox(-2.9118F, -0.4142F, -0.2965F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.2877F, -2.7747F, -0.4135F, -0.1537F, -0.2749F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(129, 124).mirror().addBox(-2.8704F, -0.5454F, -0.334F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.6877F, -8.9747F, 0.0637F, -0.0065F, -0.3139F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(5, 130).mirror().addBox(-4.1722F, -1.9589F, -0.4082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.6877F, -8.9747F, 0.0165F, 0.0243F, -0.8576F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(31, 14).mirror().addBox(-14.5532F, -3.7826F, -0.7844F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.6877F, -8.9747F, 0.0022F, 0.1864F, -1.3811F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(81, 57).mirror().addBox(-14.4485F, -3.766F, -1.5118F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0877F, -10.7747F, 0.0211F, 0.2981F, -1.3763F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(65, 41).mirror().addBox(-6.5641F, -3.7871F, -0.784F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0877F, -10.7747F, 0.0206F, 0.1934F, -1.3786F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(131, 17).mirror().addBox(-4.1516F, -1.9761F, -0.5635F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0877F, -10.7747F, 0.0796F, 0.0968F, -0.8538F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(131, 15).mirror().addBox(-2.8645F, -0.5764F, -0.4884F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0877F, -10.7747F, 0.155F, 0.0231F, -0.3132F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(31, 12).mirror().addBox(-14.8265F, -3.7453F, -0.5175F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1877F, -12.9747F, 0.0477F, 0.2606F, -1.3748F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(131, 98).mirror().addBox(-4.3205F, -1.8302F, -0.5175F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1877F, -12.9747F, 0.1731F, 0.2015F, -0.8399F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(130, 67).mirror().addBox(-2.9327F, -0.3626F, -0.449F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1877F, -12.9747F, 0.2881F, 0.0658F, -0.3072F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(81, 59).mirror().addBox(-10.37F, -3.7856F, -1.3321F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.2877F, -4.7747F, -0.0323F, 0.0936F, -1.3872F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(131, 90).mirror().addBox(-4.1928F, -1.941F, -0.4342F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.2877F, -4.7747F, -0.1977F, -0.2186F, -0.8366F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(130, 65).mirror().addBox(-2.8871F, -0.493F, -0.3247F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.2877F, -4.7747F, -0.3288F, -0.1295F, -0.2869F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(50, 28).mirror().addBox(-12.5514F, -3.7553F, -1.2655F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7877F, -6.5747F, -0.0275F, 0.1193F, -1.3867F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(129, 126).mirror().addBox(-4.2788F, -1.8659F, -0.5984F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7877F, -6.5747F, -0.0864F, -0.0944F, -0.854F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(81, 95).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3464F, -1.0624F, -6.5842F, -0.0072F, -0.0098F, 0.5446F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(26, 125).mirror().addBox(-1.6633F, -0.9132F, -0.9878F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(127, 53).mirror().addBox(-1.8257F, -1.2627F, -2.9906F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5877F, -8.0747F, 0.2664F, -0.1385F, 0.558F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(119, 128).mirror().addBox(-1.8257F, -1.6761F, -4.8972F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5877F, -8.0747F, 0.3537F, -0.1385F, 0.558F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(66, 129).mirror().addBox(-2.929F, -0.3768F, -0.482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7877F, -6.5747F, -0.1693F, -0.0811F, -0.3037F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(129, 124).addBox(0.8704F, -0.5454F, -0.334F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6877F, -8.9747F, 0.0637F, 0.0065F, 0.3139F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(5, 130).addBox(2.1722F, -1.9589F, -0.4082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6877F, -8.9747F, 0.0165F, -0.0243F, 0.8576F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(31, 14).addBox(2.5532F, -3.7826F, -0.7844F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6877F, -8.9747F, 0.0022F, -0.1864F, 1.3811F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(81, 57).addBox(6.4485F, -3.766F, -1.5118F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0877F, -10.7747F, 0.0211F, -0.2981F, 1.3763F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(65, 41).addBox(2.5641F, -3.7871F, -0.784F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0877F, -10.7747F, 0.0206F, -0.1934F, 1.3786F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(131, 17).addBox(2.1516F, -1.9761F, -0.5635F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0877F, -10.7747F, 0.0796F, -0.0968F, 0.8538F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(131, 15).addBox(0.8646F, -0.5764F, -0.4884F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0877F, -10.7747F, 0.155F, -0.0231F, 0.3132F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(31, 12).addBox(2.8266F, -3.7453F, -0.5175F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1877F, -12.9747F, 0.0477F, -0.2606F, 1.3748F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(131, 98).addBox(2.3205F, -1.8302F, -0.5175F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1877F, -12.9747F, 0.1731F, -0.2015F, 0.8399F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(130, 67).addBox(0.9327F, -0.3626F, -0.449F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1877F, -12.9747F, 0.2881F, -0.0658F, 0.3072F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(128, 75).addBox(-1.1295F, -0.3797F, 3.4961F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 128).addBox(-1.0647F, -0.4398F, 1.4981F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 127).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4464F, -0.7624F, -4.5842F, -0.0072F, 0.0098F, -0.5446F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(131, 86).addBox(0.9366F, -0.3355F, -0.2682F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.2877F, -0.7747F, -0.5848F, 0.1986F, 0.2448F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(131, 88).addBox(2.3201F, -1.8312F, -0.3873F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.2877F, -0.7747F, -0.3878F, 0.4083F, 0.7776F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(105, 66).addBox(2.5404F, -3.7531F, -1.3509F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.2877F, -0.7747F, -0.0802F, 0.1638F, 1.3855F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(131, 122).addBox(4.2728F, -3.7551F, -3.8674F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.2877F, -0.7747F, -0.0743F, -0.3403F, 1.4196F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(131, 69).addBox(0.9118F, -0.4142F, -0.2965F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.2877F, -2.7747F, -0.4135F, 0.1537F, 0.2749F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(131, 96).addBox(2.2564F, -1.8861F, -0.4108F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.2877F, -2.7747F, -0.2586F, 0.283F, 0.8215F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(123, 24).addBox(2.4552F, -3.7693F, -1.3415F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.2877F, -2.7747F, -0.0482F, -0.0078F, 1.388F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(86, 39).addBox(-0.0337F, 0.0137F, -0.0729F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8818F, 3.4411F, -3.8107F, -0.0395F, -0.2075F, 1.3935F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(81, 59).addBox(2.37F, -3.7856F, -1.3321F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.2877F, -4.7747F, -0.0323F, -0.0936F, 1.3872F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(131, 90).addBox(2.1928F, -1.941F, -0.4342F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.2877F, -4.7747F, -0.1977F, 0.2186F, 0.8366F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(130, 65).addBox(0.8871F, -0.493F, -0.3247F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -1.2877F, -4.7747F, -0.3288F, 0.1295F, 0.2869F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(50, 28).addBox(2.5514F, -3.7553F, -1.2655F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7877F, -6.5747F, -0.0275F, -0.1193F, 1.3867F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(129, 126).addBox(2.2788F, -1.8659F, -0.5984F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7877F, -6.5747F, -0.0864F, 0.0944F, 0.854F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(81, 95).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3464F, -1.0624F, -6.5842F, -0.0072F, 0.0098F, -0.5446F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(26, 125).addBox(-0.3367F, -0.9132F, -0.9878F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(127, 53).addBox(-0.1743F, -1.2627F, -2.9906F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5877F, -8.0747F, 0.2664F, 0.1385F, -0.558F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(119, 128).addBox(-0.1743F, -1.6761F, -4.8972F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5877F, -8.0747F, 0.3537F, 0.1385F, -0.558F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(66, 129).addBox(0.929F, -0.3768F, -0.482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7877F, -6.5747F, -0.1693F, 0.0811F, 0.3037F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(63, 43).addBox(-1.0F, -0.3573F, -5.8422F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.5877F, -8.0747F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(21, 44).addBox(-1.0F, -1.3073F, -7.6535F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.4123F, -0.3747F, -0.0087F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7627F, -14.1322F, -0.1316F, 0.1744F, -0.0077F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(0, 121).addBox(0.0F, -6.8931F, -0.1509F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0141F, -2.3216F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(80, 119).addBox(0.0F, -7.0054F, 0.0064F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.914F, -0.6216F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(112, 118).addBox(0.0F, -6.6802F, -0.2265F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2859F, -4.0216F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(98, 106).addBox(0.0F, -6.7823F, -0.0234F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.1859F, -6.0216F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(101, 83).mirror().addBox(0.9737F, -0.1026F, 8.9214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(75, 23).mirror().addBox(-0.0263F, -0.1026F, 3.9214F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(101, 83).addBox(2.3737F, -0.1026F, 8.9214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(75, 23).addBox(2.3737F, -0.1026F, 3.9214F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.1737F, 10.115F, -6.2548F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(109, 47).mirror().addBox(-2.0461F, -1.9226F, -2.9565F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(-4.0464F, 3.7259F, -2.4217F, 1.5509F, -0.0554F, 0.0889F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(15, 67).mirror().addBox(-0.5F, 0.0F, -6.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-5.1853F, -1.1258F, -2.1207F, 0.9226F, -0.0554F, 0.0889F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(66, 61).mirror().addBox(-0.5F, 0.0F, -6.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-5.0193F, -5.6578F, 2.1505F, 0.8789F, -0.0554F, 0.0889F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(80, 41).mirror().addBox(-0.7271F, 0.8487F, 0.1605F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7246F, 9.3367F, 2.7985F, 0.5371F, -1.1231F, -0.477F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(0, 89).mirror().addBox(-0.7271F, 0.8487F, 0.1605F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7246F, 9.3367F, 2.7985F, 1.1221F, -1.2311F, -0.9029F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(101, 73).mirror().addBox(-0.7271F, 0.6486F, 0.1605F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4684F, 9.7925F, 0.9987F, 0.9F, -1.1195F, -0.5498F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(115, 20).mirror().addBox(-2.9138F, -0.4154F, -0.1482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.6939F, 0.2541F, -0.2826F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(81, 68).mirror().addBox(-4.2761F, -1.8779F, -0.2185F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.4502F, 0.5626F, -0.7755F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(50, 30).mirror().addBox(-8.7642F, -3.7644F, -0.2185F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.0683F, 0.7023F, -1.4062F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(47, 129).mirror().addBox(-2.9789F, -0.2358F, -0.5082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7952F, -3.8299F, 0.6425F, 0.1686F, -0.2998F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(128, 78).mirror().addBox(-4.426F, -1.7433F, -0.5728F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7952F, -3.8299F, 0.4454F, 0.4635F, -0.7843F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(81, 55).mirror().addBox(-10.9613F, -3.7227F, -0.5728F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7952F, -3.8299F, 0.1357F, 0.6186F, -1.3712F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(131, 35).mirror().addBox(-2.9152F, -0.4179F, -0.4639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3141F, -2.0216F, 0.523F, 0.1372F, -0.2833F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(65, 39).mirror().addBox(-11.77F, -3.756F, -0.5341F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3141F, -2.0216F, 0.1014F, 0.4999F, -1.3547F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(25, 131).mirror().addBox(-4.2769F, -1.8678F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3141F, -2.0216F, 0.3478F, 0.3797F, -0.7895F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(127, 56).mirror().addBox(-2.8886F, -0.5014F, -0.4794F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.8141F, -0.5216F, 0.4555F, 0.1174F, -0.2919F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(50, 26).mirror().addBox(-13.6845F, -3.7724F, -0.5521F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.8141F, -0.5216F, 0.0849F, 0.4316F, -1.3621F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(117, 111).mirror().addBox(-4.211F, -1.9247F, -0.5521F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.8141F, -0.5216F, 0.2959F, 0.3297F, -0.8075F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(106, 16).mirror().addBox(-4.5106F, -7.0063F, -2.24F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9512F, 2.7523F, -2.5739F, 2.6325F, -0.1136F, -0.8266F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(20, 103).mirror().addBox(-4.5106F, -5.6486F, -4.1181F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.9512F, 2.7523F, -2.5739F, 1.8907F, -0.1136F, -0.8266F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(54, 91).mirror().addBox(-3.6399F, -3.7025F, -5.1503F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9512F, 2.7523F, -2.5739F, 1.281F, -0.1635F, -0.4997F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(66, 52).mirror().addBox(-0.5F, -1.0F, -3.5F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-5.0763F, -3.8001F, 0.2022F, 1.1407F, -0.0554F, 0.0889F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-2.0461F, -1.1422F, 1.7994F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9512F, 2.7523F, -2.5739F, 0.9662F, -0.0554F, 0.0889F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(51, 64).mirror().addBox(-2.0461F, -1.2226F, -4.0565F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.9512F, 2.7523F, -2.5739F, 0.94F, -0.0554F, 0.0889F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(50, 16).mirror().addBox(-2.0461F, -1.7749F, -5.1044F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.9512F, 2.7523F, -2.5739F, 0.7917F, -0.0554F, 0.0889F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(101, 78).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3638F, 10.1811F, -0.7469F, 0.9499F, -1.0609F, -0.4094F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(88, 80).mirror().addBox(-0.0263F, -1.0354F, -0.0942F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(88, 80).addBox(2.3737F, -1.0354F, -0.0942F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1737F, 10.115F, -6.2548F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(67, 23).mirror().addBox(-0.8F, -0.2F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(127, 50).mirror().addBox(-0.7F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5818F, -2.1266F, 0.4373F, -0.2635F, 0.5083F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(115, 20).addBox(0.9138F, -0.4154F, -0.1482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.6939F, -0.2541F, 0.2826F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(81, 68).addBox(2.2761F, -1.8779F, -0.2185F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.4502F, -0.5626F, 0.7755F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(50, 30).addBox(2.7642F, -3.7644F, -0.2185F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6231F, -5.5709F, 0.0683F, -0.7023F, 1.4062F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(47, 129).addBox(0.9789F, -0.2358F, -0.5082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7952F, -3.8299F, 0.6425F, -0.1686F, 0.2998F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(128, 78).addBox(2.426F, -1.7433F, -0.5728F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7952F, -3.8299F, 0.4454F, -0.4635F, 0.7843F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(81, 55).addBox(2.9613F, -3.7227F, -0.5728F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7952F, -3.8299F, 0.1357F, -0.6186F, 1.3712F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(131, 35).addBox(0.9152F, -0.4179F, -0.4639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3141F, -2.0216F, 0.523F, -0.1372F, 0.2833F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(65, 39).addBox(2.77F, -3.756F, -0.5341F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3141F, -2.0216F, 0.1014F, -0.4999F, 1.3547F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(25, 131).addBox(2.2769F, -1.8678F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3141F, -2.0216F, 0.3478F, -0.3797F, 0.7895F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(127, 56).addBox(0.8886F, -0.5014F, -0.4794F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8141F, -0.5216F, 0.4555F, -0.1174F, 0.2919F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(50, 26).addBox(2.6845F, -3.7724F, -0.5521F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8141F, -0.5216F, 0.0849F, -0.4316F, 1.3621F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(117, 111).addBox(2.211F, -1.9247F, -0.5521F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8141F, -0.5216F, 0.2959F, -0.3297F, 0.8075F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(106, 16).addBox(3.5106F, -7.0063F, -2.24F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9512F, 2.7523F, -2.5739F, 2.6325F, 0.1136F, 0.8266F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(20, 103).addBox(3.5106F, -5.6486F, -4.1181F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.9512F, 2.7523F, -2.5739F, 1.8907F, 0.1136F, 0.8266F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(54, 91).addBox(2.6399F, -3.7025F, -5.1503F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9512F, 2.7523F, -2.5739F, 1.281F, 0.1635F, 0.4997F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(66, 61).addBox(-0.5F, 0.0F, -6.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(5.0193F, -5.6578F, 2.1505F, 0.8789F, 0.0554F, -0.0889F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(15, 67).addBox(-0.5F, 0.0F, -6.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(5.1853F, -1.1258F, -2.1207F, 0.9226F, 0.0554F, -0.0889F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(66, 52).addBox(-0.5F, -1.0F, -3.5F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(5.0763F, -3.8001F, 0.2022F, 1.1407F, 0.0554F, -0.0889F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(0, 65).addBox(1.0461F, -1.1422F, 1.7994F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9512F, 2.7523F, -2.5739F, 0.9662F, 0.0554F, -0.0889F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(109, 47).addBox(1.0461F, -1.9226F, -2.9565F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(4.0464F, 3.7259F, -2.4217F, 1.5509F, 0.0554F, -0.0889F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(51, 64).addBox(1.0461F, -1.2226F, -4.0565F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.9512F, 2.7523F, -2.5739F, 0.94F, 0.0554F, -0.0889F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(50, 16).addBox(1.0461F, -1.7749F, -5.1044F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.9512F, 2.7523F, -2.5739F, 0.7917F, 0.0554F, -0.0889F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(80, 41).addBox(-0.2728F, 0.8487F, 0.1605F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7246F, 9.3367F, 2.7985F, 0.5371F, 1.1231F, 0.477F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(0, 89).addBox(-0.2728F, 0.8487F, 0.1605F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7246F, 9.3367F, 2.7985F, 1.1221F, 1.2311F, 0.9029F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(101, 73).addBox(-0.2729F, 0.6486F, 0.1605F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4684F, 9.7925F, 0.9987F, 0.9F, 1.1195F, 0.5498F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(101, 78).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3638F, 10.1811F, -0.7469F, 0.9499F, 1.0609F, 0.4094F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(67, 23).addBox(-1.2F, -0.2F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(127, 50).addBox(-1.3F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5818F, -2.1266F, 0.4373F, 0.2635F, -0.5083F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(25, 33).addBox(-1.0F, -0.907F, -0.4667F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.1859F, -6.0216F, 0.5061F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.1874F, 7.7792F, -3.4424F, 0.0436F, 0.0F, -0.1745F));

		PartDefinition cube_r198 = leftarm.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(120, 5).addBox(-0.5F, -0.675F, 0.45F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.2434F, -1.0021F, -1.4663F, -0.714F, -0.5672F, -0.0056F));

		PartDefinition cube_r199 = leftarm.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(38, 106).addBox(-0.5F, -1.9F, -1.8F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2838F, 1.4054F, 0.0611F, 0.3769F, -0.5672F, -0.0056F));

		PartDefinition cube_r200 = leftarm.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(130, 19).addBox(-0.1791F, -0.4311F, -1.6052F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0289F, 3.3523F, -0.097F, 1.4939F, -0.5672F, -0.0056F));

		PartDefinition cube_r201 = leftarm.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(92, 98).addBox(-1.5F, -2.5F, -1.3F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 1.0521F, 0.6065F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r202 = leftarm.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(9, 102).addBox(-2.0F, 0.9F, -0.7F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 7.1432F, 3.4116F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r203 = leftarm.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(120, 53).addBox(-0.9824F, -2.9907F, -1.0712F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.7735F, 5.7059F, 3.4765F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r204 = leftarm.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(124, 40).addBox(-0.9824F, -1.6907F, -1.5712F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(66, 107).addBox(-0.9824F, -4.6907F, -1.0712F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.7735F, 6.775F, 4.8896F, 0.637F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1062F, 8.1112F, 3.8051F, -0.1478F, -0.6836F, 0.548F));

		PartDefinition cube_r205 = leftarm2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(34, 114).addBox(-0.1933F, -4.0546F, 0.3397F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.808F, 4.1708F, -2.2954F, -0.303F, 0.0393F, 0.1249F));

		PartDefinition cube_r206 = leftarm2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(0, 114).addBox(-1.1933F, -0.6546F, 0.3397F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.192F, 4.5523F, -2.4156F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r207 = leftarm2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(62, 123).addBox(-1.6F, 0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F))
				.texOffs(96, 47).addBox(-1.6F, -0.9F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.6732F, 1.3745F, -0.009F, -0.1789F, -0.2489F, -0.9375F));

		PartDefinition cube_r208 = leftarm2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(91, 106).addBox(0.3067F, -2.4546F, 0.3397F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(26, 92).addBox(0.6067F, -5.4546F, 0.3397F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.192F, 4.5523F, -2.4156F, -0.3011F, 0.0522F, 0.1666F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1479F, 7.9656F, -2.8375F, 1.0463F, 0.6267F, -0.3359F));

		PartDefinition cube_r209 = lefthand.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(106, 93).addBox(-0.9935F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0013F, 1.3347F, -2.5899F, -0.0242F, 0.2026F, -0.2301F));

		PartDefinition cube_r210 = lefthand.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(90, 22).addBox(-1.5205F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -1.1382F, 0.0511F, -0.1759F));

		PartDefinition cube_r211 = lefthand.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(7, 115).addBox(0.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -0.9763F, -0.3374F, 0.2997F));

		PartDefinition cube_r212 = lefthand.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(103, 118).addBox(0.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.1013F, 1.2347F, -2.7899F, -0.0166F, -0.1742F, 0.1964F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.1874F, 7.7792F, -3.4424F, 0.6939F, -0.084F, 0.275F));

		PartDefinition cube_r213 = rightarm.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(120, 10).addBox(-0.5F, -0.675F, 0.45F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.2434F, -1.0021F, -1.4663F, -0.714F, 0.5672F, 0.0056F));

		PartDefinition cube_r214 = rightarm.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(45, 106).addBox(-0.5F, -1.9F, -1.8F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2838F, 1.4054F, 0.0611F, 0.3769F, 0.5672F, 0.0056F));

		PartDefinition cube_r215 = rightarm.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(54, 130).addBox(-0.8209F, -0.4311F, -1.6052F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0289F, 3.3523F, -0.097F, 1.4939F, 0.5672F, 0.0056F));

		PartDefinition cube_r216 = rightarm.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(0, 100).addBox(-0.5F, -2.5F, -1.3F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2559F, 1.0521F, 0.6065F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r217 = rightarm.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(62, 102).addBox(-1.0F, 0.9F, -0.7F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2559F, 7.1432F, 3.4116F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r218 = rightarm.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(40, 121).addBox(-1.0176F, -2.9907F, -1.0712F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7735F, 5.7059F, 3.4765F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r219 = rightarm.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(124, 80).addBox(-1.0176F, -1.6907F, -1.5712F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(112, 73).addBox(-1.0176F, -4.6907F, -1.0712F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.7735F, 6.775F, 4.8896F, 0.637F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1062F, 8.1112F, 3.8051F, -0.1041F, 0.6836F, -0.548F));

		PartDefinition cube_r220 = rightarm2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(48, 114).addBox(-0.8067F, -4.0546F, 0.3397F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.808F, 4.1708F, -2.2954F, -0.303F, -0.0393F, -0.1249F));

		PartDefinition cube_r221 = rightarm2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(41, 114).addBox(0.1933F, -0.6546F, 0.3397F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.192F, 4.5523F, -2.4156F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r222 = rightarm2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(123, 66).addBox(0.6F, 0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F))
				.texOffs(96, 51).addBox(-2.4F, -0.9F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.6732F, 1.3745F, -0.009F, -0.1789F, 0.2489F, 0.9375F));

		PartDefinition cube_r223 = rightarm2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(9, 107).addBox(-1.3067F, -2.4546F, 0.3397F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(93, 27).addBox(-1.6067F, -5.4546F, 0.3397F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.192F, 4.5523F, -2.4156F, -0.3011F, -0.0522F, -0.1666F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1479F, 7.9656F, -2.8375F, 1.439F, -0.6267F, 0.3359F));

		PartDefinition cube_r224 = righthand.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(106, 105).addBox(-2.0065F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.0013F, 1.3347F, -2.5899F, -0.0242F, -0.2026F, 0.2301F));

		PartDefinition cube_r225 = righthand.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(92, 5).addBox(-1.4795F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -0.44F, -0.0511F, 0.1759F));

		PartDefinition cube_r226 = righthand.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(115, 16).addBox(-2.0983F, -1.0372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, 0.1582F, 0.3374F, -0.2997F));

		PartDefinition cube_r227 = righthand.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(7, 119).addBox(-2.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.1013F, 1.2347F, -2.7899F, -0.0166F, 0.1742F, -0.1964F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.4859F, -6.1216F, -0.1611F, 0.5214F, 0.0503F));

		PartDefinition cube_r228 = neck2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(51, 93).addBox(0.0F, -4.4703F, -0.1461F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -1.8F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r229 = neck2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(13, 123).addBox(0.0F, -4.9F, -2.3F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 74).addBox(-1.0F, -1.1F, -3.3F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2F, -1.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r230 = neck2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(135, 78).mirror().addBox(-2.7107F, -1.0354F, -0.5375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4156F, -3.4754F, 0.1041F, 0.9361F, -1.3476F));

		PartDefinition cube_r231 = neck2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(131, 116).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4156F, -3.4754F, 0.6995F, 0.7021F, -0.6109F));

		PartDefinition cube_r232 = neck2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(131, 114).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0156F, -1.4754F, 0.739F, 0.4429F, -0.3033F));

		PartDefinition cube_r233 = neck2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(112, 131).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0156F, -1.4754F, 0.3779F, 0.7475F, -0.8558F));

		PartDefinition cube_r234 = neck2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(39, 71).mirror().addBox(-6.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0156F, -1.4754F, -0.1536F, 0.8096F, -1.5951F));

		PartDefinition cube_r235 = neck2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(135, 78).addBox(1.7107F, -1.0354F, -0.5375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4156F, -3.4754F, 0.1041F, -0.9361F, 1.3476F));

		PartDefinition cube_r236 = neck2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(131, 116).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4156F, -3.4754F, 0.6995F, -0.7021F, 0.6109F));

		PartDefinition cube_r237 = neck2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(131, 114).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0156F, -1.4754F, 0.739F, -0.4429F, 0.3033F));

		PartDefinition cube_r238 = neck2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(112, 131).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0156F, -1.4754F, 0.3779F, -0.7475F, 0.8558F));

		PartDefinition cube_r239 = neck2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(39, 71).addBox(2.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0156F, -1.4754F, -0.1536F, -0.8096F, 1.5951F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -4.6F, -0.1223F, 0.185F, 0.138F));

		PartDefinition cube_r240 = neck.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(74, 123).addBox(0.0F, -1.7F, -2.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4781F, -4.6234F, 0.023F, 0.0117F, -0.0255F));

		PartDefinition cube_r241 = neck.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(69, 131).addBox(0.0F, -3.3F, 0.3F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5099F, -4.0213F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r242 = neck.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(100, 126).addBox(0.0F, -5.0F, -1.7F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 44).addBox(-1.0F, -1.4F, -7.7F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.2F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r243 = neck.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(131, 118).mirror().addBox(-2.7792F, 0.2788F, 0.0614F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0844F, -2.7754F, 0.3928F, 0.8184F, -1.059F));

		PartDefinition cube_r244 = neck.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(131, 118).addBox(0.7792F, 0.2788F, 0.0614F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0844F, -2.7754F, 0.3928F, -0.8184F, 1.059F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 55).addBox(-2.5F, -5.1799F, -3.0581F, 5.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(65, 30).addBox(-2.5F, -5.1799F, -4.9581F, 5.0F, 6.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.07F, -6.9254F, 0.0425F, -0.0698F, -0.1549F));

		PartDefinition cube_r245 = head.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(54, 73).addBox(-1.5F, -3.928F, -0.1053F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.2681F, -2.0628F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r246 = head.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(115, 124).addBox(-1.0F, 0.05F, 0.025F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.1758F, -12.9107F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r247 = head.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(126, 101).addBox(-1.0F, -1.75F, -0.975F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(114, 0).addBox(-1.0F, -1.95F, -0.075F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 0.1012F, -12.8138F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r248 = head.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(40, 100).addBox(-1.0F, 0.0F, -2.9F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.6056F, -9.3093F, 2.8449F, 0.0F, 0.0F));

		PartDefinition cube_r249 = head.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(124, 108).addBox(-1.0F, -1.2F, -0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.4012F, -8.8197F, -3.1329F, 0.0F, 0.0F));

		PartDefinition cube_r250 = head.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(124, 104).addBox(-1.0F, -2.067F, -0.9594F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.3285F, -10.9359F, -1.8239F, 0.0F, 0.0F));

		PartDefinition cube_r251 = head.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(100, 33).addBox(-2.0F, -1.0F, -0.075F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -5.8345F, -5.8492F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r252 = head.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(88, 68).addBox(-2.5F, -2.0F, -0.075F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0098F)), PartPose.offsetAndRotation(0.0F, -5.053F, -7.6903F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r253 = head.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(39, 88).addBox(-2.0F, -2.0F, -2.075F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, -2.2263F, -7.789F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r254 = head.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(13, 90).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.2804F, -7.1323F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r255 = head.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(74, 89).addBox(-2.0F, -2.9F, -2.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.8085F, -9.6311F, -1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r256 = head.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(88, 0).addBox(-2.0F, -2.0F, 0.025F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -3.6055F, -10.34F, -1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r257 = head.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(0, 95).addBox(-1.5F, 0.6F, -0.275F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.824F, -12.181F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r258 = head.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(106, 109).addBox(-1.5F, 0.0F, 0.025F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.824F, -12.181F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r259 = head.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(92, 10).addBox(-2.0F, -1.0F, -0.875F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.3863F, -10.9089F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r260 = head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(114, 22).addBox(-1.0F, -2.067F, -0.0094F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -1.1474F, -11.4174F, -1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r261 = head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(17, 55).addBox(-1.0F, -2.367F, -0.0594F, 2.0F, 6.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -3.6942F, -6.3941F, -1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r262 = head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(135, 61).addBox(-0.5F, 0.466F, -0.7567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7769F, -12.8871F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r263 = head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(23, 133).addBox(-0.5F, -0.405F, -0.6532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.7769F, -12.8871F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r264 = head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(131, 71).addBox(-0.5F, -0.5F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4486F, -10.694F, -1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r265 = head.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(131, 39).addBox(-0.5F, -0.9F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3255F, -10.7636F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r266 = head.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(126, 70).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 3.3496F, -9.7518F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r267 = head.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(55, 119).addBox(-0.5F, -1.2F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2088F, -9.6831F, 1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r268 = head.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(0, 108).addBox(-0.5F, -1.0F, -1.3F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 3.6456F, -11.4315F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r269 = head.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(117, 105).addBox(-0.5F, -0.8F, -1.1F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 1.7529F, -11.5273F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r270 = head.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(47, 126).addBox(-1.0F, -1.4626F, -0.7691F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 126).addBox(-1.0F, -1.0626F, -0.7691F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.7769F, -12.8871F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r271 = head.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(94, 61).mirror().addBox(0.173F, -0.0113F, -3.9837F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7324F, -4.9765F, -5.0519F, 0.8567F, -0.1536F, -0.1578F));

		PartDefinition cube_r272 = head.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(94, 61).addBox(-1.173F, -0.0113F, -3.9837F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7324F, -4.9765F, -5.0519F, 0.8567F, 0.1536F, 0.1578F));

		PartDefinition cube_r273 = head.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(46, 33).addBox(-2.5F, -2.9F, -1.5F, 5.0F, 5.0F, 4.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -3.2241F, -3.2226F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r274 = head.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(26, 85).addBox(-2.5F, -2.1622F, 1.6248F, 5.0F, 5.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, -3.6567F, -2.9625F, 0.2967F, 0.0F, 0.0F));

		PartDefinition leftCheek = head.addOrReplaceChild("leftCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4319F, -0.3695F, -0.8156F, -1.6997F, -0.2905F, -0.0709F));

		PartDefinition cube_r275 = leftCheek.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(122, 32).addBox(-0.5F, -0.335F, -0.6967F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2592F, 0.1163F, 1.1218F, 0.2579F, 0.6816F, 0.3825F));

		PartDefinition cube_r276 = leftCheek.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(25, 111).addBox(-0.5F, -0.55F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.9986F, -0.3771F, 1.8268F, 0.1211F, 0.6509F, 0.3741F));

		PartDefinition cube_r277 = leftCheek.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(122, 135).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.9387F, -0.7339F, 2.8788F, 0.6477F, 0.6586F, 0.2645F));

		PartDefinition cube_r278 = leftCheek.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(123, 0).addBox(-1.3416F, -1.5783F, -0.7747F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.326F, 1.1018F, 2.637F, 1.1698F, 0.6627F, 0.2584F));

		PartDefinition cube_r279 = leftCheek.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(40, 93).addBox(-0.8737F, -1.4468F, -5.8576F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.326F, -0.2982F, 2.637F, 1.0513F, 0.6867F, 0.4214F));

		PartDefinition cube_r280 = leftCheek.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(29, 104).addBox(-0.5F, -1.0274F, -2.3442F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2592F, 0.1163F, 1.1218F, -0.0737F, 0.6816F, 0.3825F));

		PartDefinition rightCheek = head.addOrReplaceChild("rightCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4319F, -0.3695F, -0.8156F, -1.6997F, 0.2905F, 0.0709F));

		PartDefinition cube_r281 = rightCheek.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(122, 32).mirror().addBox(-0.5F, -0.335F, -0.6967F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2592F, 0.1163F, 1.1218F, 0.2579F, -0.6816F, -0.3825F));

		PartDefinition cube_r282 = rightCheek.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(25, 111).mirror().addBox(-0.5F, -0.55F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.9986F, -0.3771F, 1.8268F, 0.1211F, -0.6509F, -0.3741F));

		PartDefinition cube_r283 = rightCheek.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(122, 135).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.9387F, -0.7339F, 2.8788F, 0.6477F, -0.6586F, -0.2645F));

		PartDefinition cube_r284 = rightCheek.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(123, 0).mirror().addBox(0.3416F, -1.5783F, -0.7747F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.326F, 1.1018F, 2.637F, 1.1698F, -0.6627F, -0.2584F));

		PartDefinition cube_r285 = rightCheek.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(40, 93).mirror().addBox(-0.1263F, -1.4468F, -5.8576F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.326F, -0.2982F, 2.637F, 1.0513F, -0.6867F, -0.4214F));

		PartDefinition cube_r286 = rightCheek.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(29, 104).mirror().addBox(-0.5F, -1.0274F, -2.3442F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2592F, 0.1163F, 1.1218F, -0.0737F, -0.6816F, -0.3825F));

		PartDefinition leftBeak = head.addOrReplaceChild("leftBeak", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5296F, 7.017F, -11.1805F, -0.0873F, 0.0484F, -0.048F));

		PartDefinition cube_r287 = leftBeak.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(73, 129).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.1057F, -1.7475F, -0.0927F, -2.0894F, 0.0636F, 0.0753F));

		PartDefinition cube_r288 = leftBeak.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(83, 129).addBox(-0.5F, -1.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.1737F, -1.3181F, -0.6504F, -1.6967F, 0.0636F, 0.0753F));

		PartDefinition cube_r289 = leftBeak.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(32, 132).addBox(-0.7505F, -0.022F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3249F, -0.8537F, 1.464F, -2.4778F, 0.1224F, -0.0352F));

		PartDefinition cube_r290 = leftBeak.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(96, 135).addBox(-0.7506F, -1.022F, -0.1297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1525F, -1.3101F, 0.1944F, -1.2561F, 0.1224F, -0.0352F));

		PartDefinition cube_r291 = leftBeak.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(117, 135).addBox(-1.3695F, -1.0543F, -0.0031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.6249F, -2.6167F, -2.6317F, 0.1966F, 0.0876F, 0.0452F));

		PartDefinition cube_r292 = leftBeak.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(18, 136).addBox(-1.3695F, -1.0543F, -0.0031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5976F, -1.67F, -2.3108F, 0.3278F, 0.0809F, 0.0563F));

		PartDefinition cube_r293 = leftBeak.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(135, 75).addBox(-1.3695F, -1.0543F, -0.0031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5704F, -0.7934F, -1.8304F, 0.5025F, 0.0699F, 0.0695F));

		PartDefinition cube_r294 = leftBeak.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(18, 133).addBox(-1.2852F, -0.8206F, -0.0906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5704F, -0.1934F, -0.0304F, 0.8428F, 0.0699F, 0.0695F));

		PartDefinition cube_r295 = leftBeak.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(83, 133).addBox(-1.376F, 0.0185F, -0.0074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5704F, -0.0934F, -1.2304F, 0.8254F, 0.0699F, 0.0695F));

		PartDefinition cube_r296 = leftBeak.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(78, 133).addBox(-1.3697F, 0.3628F, 0.0478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5704F, -1.0934F, -2.1304F, 0.6945F, 0.0699F, 0.0695F));

		PartDefinition rightBeak = head.addOrReplaceChild("rightBeak", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5296F, 7.017F, -11.1805F, -0.0873F, -0.0484F, 0.048F));

		PartDefinition cube_r297 = rightBeak.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(73, 129).mirror().addBox(-0.5F, -0.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.1057F, -1.7475F, -0.0927F, -2.0894F, -0.0636F, -0.0753F));

		PartDefinition cube_r298 = rightBeak.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(83, 129).mirror().addBox(-0.5F, -1.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.1737F, -1.3181F, -0.6504F, -1.6967F, -0.0636F, -0.0753F));

		PartDefinition cube_r299 = rightBeak.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(32, 132).mirror().addBox(-0.2494F, -0.022F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3249F, -0.8537F, 1.464F, -2.4778F, -0.1224F, 0.0352F));

		PartDefinition cube_r300 = rightBeak.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(96, 135).mirror().addBox(-0.2495F, -1.022F, -0.1297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1525F, -1.3101F, 0.1944F, -1.2561F, -0.1224F, 0.0352F));

		PartDefinition cube_r301 = rightBeak.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(117, 135).mirror().addBox(0.3695F, -1.0543F, -0.0031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.6249F, -2.6167F, -2.6317F, 0.1966F, -0.0876F, -0.0452F));

		PartDefinition cube_r302 = rightBeak.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(18, 136).mirror().addBox(0.3695F, -1.0543F, -0.0031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5976F, -1.67F, -2.3108F, 0.3278F, -0.0809F, -0.0563F));

		PartDefinition cube_r303 = rightBeak.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(135, 75).mirror().addBox(0.3695F, -1.0543F, -0.0031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, -0.7934F, -1.8304F, 0.5025F, -0.0699F, -0.0695F));

		PartDefinition cube_r304 = rightBeak.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(18, 133).mirror().addBox(0.2852F, -0.8206F, -0.0906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, -0.1934F, -0.0304F, 0.8428F, -0.0699F, -0.0695F));

		PartDefinition cube_r305 = rightBeak.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(83, 133).mirror().addBox(0.376F, 0.0185F, -0.0074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, -0.0934F, -1.2304F, 0.8254F, -0.0699F, -0.0695F));

		PartDefinition cube_r306 = rightBeak.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(78, 133).mirror().addBox(0.3697F, 0.3628F, 0.0478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, -1.0934F, -2.1304F, 0.6945F, -0.0699F, -0.0695F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.3F, 5.1433F, -6.3625F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(115, 117).addBox(-1.0F, -0.2F, 0.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0287F, -4.9928F, 1.4102F, -0.1889F, 0.1988F, 0.0708F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(80, 30).addBox(-2.0447F, 1.3726F, -4.6887F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.3959F, -9.6728F, 1.5317F, 0.291F, 0.1988F, 0.0708F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(16, 110).addBox(-1.3F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2567F, -6.8494F, 2.4969F, 2.9559F, 0.0734F, 0.0627F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(75, 80).addBox(-0.5F, -1.7F, -4.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6443F, -8.1425F, 2.1517F, -2.7757F, 0.0F, 0.1309F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(19, 125).addBox(-1.771F, -1.0024F, -1.2413F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.4337F, -7.9419F, 3.6444F, 0.1978F, 0.0676F, -0.194F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(122, 124).addBox(-1.6288F, -1.4782F, -1.5515F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.4337F, -7.9419F, 3.6444F, 0.7047F, 0.2195F, -0.1197F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(91, 114).addBox(-1.37F, -2.7348F, -0.6863F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(105, 61).addBox(-1.73F, -2.7348F, -0.6863F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F))
				.texOffs(114, 66).addBox(-1.06F, -2.7348F, -0.6863F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.7683F, -6.2837F, 2.8222F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(95, 15).addBox(0.3907F, 0.5091F, -2.6038F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4041F, -3.15F, 1.0923F, 0.3995F, 0.2086F, -0.0185F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(101, 135).addBox(-0.7255F, -0.8453F, 1.8628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1F, -0.2F, 0.7F, 2.6878F, 0.0349F, 0.0F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(136, 32).addBox(-0.7255F, -2.1614F, 1.6669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.2F, 0.7F, 2.5133F, 0.0349F, 0.0F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(127, 135).addBox(-0.9196F, -1.5248F, -0.9934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.2F, -2.0F, 1.3975F, 0.1048F, -0.0697F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(91, 133).addBox(-0.9196F, -0.9004F, -0.8448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2F, -0.2F, -2.0F, 1.572F, 0.1048F, -0.0697F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(98, 132).addBox(-0.4F, -0.7055F, -0.5591F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -1.9996F, -1.2994F, 2.8972F, 0.0F, 0.0F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(121, 97).addBox(-0.4F, 0.0978F, -0.625F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -1.9996F, -1.2994F, -3.0369F, 0.0F, 0.0F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(132, 58).addBox(-0.9122F, -2.3988F, -0.9749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2F, -0.2F, -2.0F, 1.3885F, 0.087F, -0.0733F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(136, 71).addBox(-0.9122F, -3.0578F, -1.5624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.2F, -2.0F, 1.1267F, 0.087F, -0.0733F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(136, 103).addBox(-0.191F, -3.5473F, -2.1987F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2F, -0.2F, -2.0F, 0.8855F, 0.2973F, -0.1475F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(136, 82).addBox(-0.2305F, -4.444F, -3.5874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.2F, -2.0F, 0.4866F, 0.2882F, -0.1453F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(88, 136).addBox(-0.2305F, -4.1552F, -2.7584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2F, -0.2F, -2.0F, 0.7047F, 0.2882F, -0.1453F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(124, 84).addBox(-0.7549F, -1.398F, 2.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4041F, -1.55F, -0.0077F, 0.2273F, 0.2094F, 0.0037F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(111, 5).addBox(-0.7549F, -2.0045F, -0.1529F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4041F, -1.55F, -0.0077F, 0.3844F, 0.2094F, 0.0037F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(131, 82).addBox(-0.5091F, -0.981F, -2.6845F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4041F, -3.15F, 1.0923F, 0.42F, 0.2091F, 0.0111F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(124, 112).addBox(0.0F, -1.3F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.3F, -10.4222F, 2.587F, -1.213F, 0.0F, 0.0F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(6, 127).addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3F, -11.1137F, 1.5811F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(116, 62).addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3F, -10.4514F, 3.8324F, -2.522F, 0.0F, 0.0F));

		PartDefinition cube_r332 = leftFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(127, 4).addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3F, -11.8141F, 3.4545F, -2.0857F, 0.0F, 0.0F));

		PartDefinition cube_r333 = leftFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(95, 38).addBox(-0.8F, -2.5F, -2.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8281F, -6.3331F, 5.7613F, -0.4478F, 0.5999F, -0.0949F));

		PartDefinition cube_r334 = leftFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(71, 119).addBox(-1.9762F, -0.04F, -0.172F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8506F, -9.4563F, 4.044F, -0.3062F, 0.1688F, -0.177F));

		PartDefinition cube_r335 = leftFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(110, 101).addBox(-2.9962F, -0.0828F, -1.9452F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8506F, -9.4563F, 3.944F, 0.6419F, 0.128F, -0.1663F));

		PartDefinition cube_r336 = leftFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(135, 0).addBox(-0.5F, -0.6325F, 0.3547F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(-0.3F, -5.2459F, -5.834F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(134, 52).addBox(-0.5F, 0.0425F, -0.0203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -5.9372F, -6.8374F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(52, 134).addBox(-0.5F, -0.7645F, -1.0605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -5.5459F, -5.834F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(106, 87).addBox(-0.5592F, -1.065F, -0.3976F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -9.0497F, 5.8393F, -0.1195F, 0.6629F, -0.0816F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(73, 0).addBox(-0.4372F, -0.398F, -0.0513F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5898F, -9.4821F, 7.6938F, 0.2184F, 0.5771F, -0.1008F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(104, 42).addBox(-2.0597F, -0.8298F, 0.001F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -8.8497F, 3.9393F, 0.0244F, 0.3959F, -0.222F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.3F, 5.1433F, -6.3625F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(115, 117).mirror().addBox(-1.0F, -0.2F, 0.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0287F, -4.9928F, 1.4102F, -0.1889F, -0.1988F, -0.0708F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(80, 30).mirror().addBox(0.0447F, 1.3726F, -4.6887F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3959F, -9.6728F, 1.5317F, 0.291F, -0.1988F, -0.0708F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(16, 110).mirror().addBox(-0.7F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2567F, -6.8494F, 2.4969F, 2.9559F, -0.0734F, -0.0627F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(75, 80).mirror().addBox(-0.5F, -1.7F, -4.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6443F, -8.1425F, 2.1517F, -2.7757F, 0.0F, -0.1309F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(19, 125).mirror().addBox(-0.229F, -1.0024F, -1.2413F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4337F, -7.9419F, 3.6444F, 0.1978F, -0.0676F, 0.194F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(122, 124).mirror().addBox(-0.3712F, -1.4782F, -1.5515F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4337F, -7.9419F, 3.6444F, 0.7047F, -0.2195F, 0.1197F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(91, 114).mirror().addBox(-0.63F, -2.7348F, -0.6863F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(105, 61).mirror().addBox(-1.27F, -2.7348F, -0.6863F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false)
				.texOffs(114, 66).mirror().addBox(-0.94F, -2.7348F, -0.6863F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.7683F, -6.2837F, 2.8222F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(95, 15).mirror().addBox(-0.3907F, 0.5091F, -2.6038F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4041F, -3.15F, 1.0923F, 0.3995F, -0.2086F, 0.0185F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(101, 135).mirror().addBox(-0.2745F, -0.8453F, 1.8628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.2F, 0.7F, 2.6878F, -0.0349F, 0.0F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(136, 32).mirror().addBox(-0.2745F, -2.1614F, 1.6669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.2F, 0.7F, 2.5133F, -0.0349F, 0.0F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(127, 135).mirror().addBox(-0.0804F, -1.5248F, -0.9934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.2F, -2.0F, 1.3975F, -0.1048F, 0.0697F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(91, 133).mirror().addBox(-0.0804F, -0.9004F, -0.8448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.2F, -2.0F, 1.572F, -0.1048F, 0.0697F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(98, 132).mirror().addBox(-0.6F, -0.7055F, -0.5591F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, -1.9996F, -1.2994F, 2.8972F, 0.0F, 0.0F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(121, 97).mirror().addBox(-0.6F, 0.0978F, -0.625F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, -1.9996F, -1.2994F, -3.0369F, 0.0F, 0.0F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(132, 58).mirror().addBox(-0.0878F, -2.3988F, -0.9749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.2F, -2.0F, 1.3885F, -0.087F, 0.0733F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(136, 71).mirror().addBox(-0.0878F, -3.0578F, -1.5624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.2F, -2.0F, 1.1267F, -0.087F, 0.0733F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(136, 103).mirror().addBox(-0.809F, -3.5473F, -2.1987F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.2F, -2.0F, 0.8855F, -0.2973F, 0.1475F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(136, 82).mirror().addBox(-0.7695F, -4.444F, -3.5874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.2F, -2.0F, 0.4866F, -0.2882F, 0.1453F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(88, 136).mirror().addBox(-0.7695F, -4.1552F, -2.7584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.2F, -2.0F, 0.7047F, -0.2882F, 0.1453F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(124, 84).mirror().addBox(-0.2451F, -1.398F, 2.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.4041F, -1.55F, -0.0077F, 0.2273F, -0.2094F, -0.0037F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(111, 5).mirror().addBox(-0.2451F, -2.0045F, -0.1529F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.4041F, -1.55F, -0.0077F, 0.3844F, -0.2094F, -0.0037F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(131, 82).mirror().addBox(-0.4909F, -0.981F, -2.6845F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.4041F, -3.15F, 1.0923F, 0.42F, -0.2091F, -0.0111F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(124, 112).mirror().addBox(-2.0F, -1.3F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.3F, -10.4222F, 2.587F, -1.213F, 0.0F, 0.0F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(6, 127).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3F, -11.1137F, 1.5811F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(116, 62).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.3F, -10.4514F, 3.8324F, -2.522F, 0.0F, 0.0F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(127, 4).mirror().addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3F, -11.8141F, 3.4545F, -2.0857F, 0.0F, 0.0F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(95, 38).mirror().addBox(-0.2F, -2.5F, -2.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8281F, -6.3331F, 5.7613F, -0.4478F, -0.5999F, 0.0949F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(71, 119).mirror().addBox(-0.0238F, -0.04F, -0.172F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8506F, -9.4563F, 4.044F, -0.3062F, -0.1688F, 0.177F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(110, 101).mirror().addBox(-0.0038F, -0.0828F, -1.9452F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8506F, -9.4563F, 3.944F, 0.6419F, -0.128F, 0.1663F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(135, 0).mirror().addBox(-0.5F, -0.6325F, 0.3547F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(0.3F, -5.2459F, -5.834F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(134, 52).mirror().addBox(-0.5F, 0.0425F, -0.0203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.5F, -5.9372F, -6.8374F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(52, 134).mirror().addBox(-0.5F, -0.7645F, -1.0605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5F, -5.5459F, -5.834F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(106, 87).mirror().addBox(-0.4408F, -1.065F, -0.3976F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -9.0497F, 5.8393F, -0.1195F, -0.6629F, 0.0816F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(-0.5628F, -0.398F, -0.0513F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5898F, -9.4821F, 7.6938F, 0.2184F, -0.5771F, 0.1008F));

		PartDefinition cube_r376 = rightFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(104, 42).mirror().addBox(0.0597F, -0.8298F, 0.001F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -8.8497F, 3.9393F, 0.0244F, -0.3959F, 0.222F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 1.0637F, -2.5017F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r377 = jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(137, 7).mirror().addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5808F, 5.1618F, -2.0147F, -0.7801F, -0.0881F, -0.138F));

		PartDefinition cube_r378 = jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(37, 132).mirror().addBox(0.5F, -2.0F, -0.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1987F, 4.2984F, -0.977F, -0.9547F, -0.0881F, -0.138F));

		PartDefinition cube_r379 = jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(135, 19).mirror().addBox(-0.5F, -1.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1226F, 6.4349F, -2.9014F, -0.8617F, -0.0386F, -0.159F));

		PartDefinition cube_r380 = jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(124, 92).mirror().addBox(-0.5F, -0.425F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.239F, 5.8364F, -2.3806F, -0.2508F, -0.0386F, -0.159F));

		PartDefinition cube_r381 = jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(133, 128).mirror().addBox(-0.5F, -0.3F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1009F, 6.8902F, -1.589F, -1.0362F, -0.0386F, -0.159F));

		PartDefinition cube_r382 = jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(112, 133).mirror().addBox(-0.5F, -1.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.0552F, 7.2923F, -1.1104F, -0.7744F, -0.0386F, -0.159F));

		PartDefinition cube_r383 = jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(133, 100).mirror().addBox(-0.5F, -0.4F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3355F, 5.6995F, -0.448F, -0.6849F, -0.072F, -0.147F));

		PartDefinition cube_r384 = jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(62, 135).mirror().addBox(0.6472F, -0.452F, -1.1419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.6382F, 4.9235F, -0.0528F, -0.9402F, -0.0386F, -0.159F));

		PartDefinition cube_r385 = jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(69, 123).mirror().addBox(-0.5F, -2.275F, -1.55F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(31, 135).mirror().addBox(-0.5F, -0.275F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.409F, 5.5893F, 0.5695F, -0.7831F, -0.0386F, -0.159F));

		PartDefinition cube_r386 = jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(130, 61).mirror().addBox(-0.5F, -1.5F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5432F, 4.774F, 0.6585F, -0.8704F, -0.0386F, -0.159F));

		PartDefinition cube_r387 = jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(59, 130).mirror().addBox(-0.5F, -2.075F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.31F, 5.4078F, -2.7057F, -0.8966F, -0.0386F, -0.159F));

		PartDefinition cube_r388 = jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(64, 131).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2386F, 2.1575F, 2.1234F, -1.0481F, -0.116F, -0.1593F));

		PartDefinition cube_r389 = jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(40, 132).mirror().addBox(-0.5F, -0.325F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.1843F, 2.7376F, 2.4526F, 0.0777F, -0.116F, -0.1593F));

		PartDefinition cube_r390 = jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(40, 135).mirror().addBox(-0.5F, -2.975F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false)
				.texOffs(54, 125).mirror().addBox(-0.5F, -2.375F, -0.575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.0174F, 3.5406F, 2.1316F, -0.5768F, -0.116F, -0.1593F));

		PartDefinition cube_r391 = jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(124, 88).mirror().addBox(-0.5F, -1.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.8216F, 3.5552F, 0.6666F, -0.062F, -0.116F, -0.1593F));

		PartDefinition cube_r392 = jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(0, 130).mirror().addBox(-0.5F, -0.9F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8272F, 3.1914F, 0.6931F, -0.9453F, -0.0502F, -0.209F));

		PartDefinition cube_r393 = jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(124, 120).mirror().addBox(-0.5F, -0.15F, -1.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-2.3545F, 1.0179F, 2.2311F, -0.3992F, -0.1104F, -0.1847F));

		PartDefinition cube_r394 = jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(124, 116).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.1552F, 0.771F, 0.0541F, -0.0938F, -0.1104F, -0.1847F));

		PartDefinition cube_r395 = jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(47, 131).mirror().addBox(-0.6399F, -1.2915F, -0.4446F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9164F, 1.8547F, 1.0027F, 0.6043F, -0.1104F, -0.1847F));

		PartDefinition cube_r396 = jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(126, 96).mirror().addBox(-0.5F, -0.85F, -0.475F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1893F, 1.3706F, 1.3508F, 1.3636F, -0.1104F, -0.1847F));

		PartDefinition cube_r397 = jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(137, 7).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3809F, 5.1618F, -2.0147F, -0.7801F, 0.0881F, 0.138F));

		PartDefinition cube_r398 = jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(37, 132).addBox(-0.5F, -2.0F, -0.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9988F, 4.2984F, -0.977F, -0.9547F, 0.0881F, 0.138F));

		PartDefinition cube_r399 = jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(135, 19).addBox(-0.5F, -1.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0773F, 6.4349F, -2.9014F, -0.8617F, 0.0386F, 0.159F));

		PartDefinition cube_r400 = jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(124, 92).addBox(-0.5F, -0.425F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0391F, 5.8364F, -2.3806F, -0.2508F, 0.0386F, 0.159F));

		PartDefinition cube_r401 = jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(133, 128).addBox(-0.5F, -0.3F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.099F, 6.8902F, -1.589F, -1.0362F, 0.0386F, 0.159F));

		PartDefinition cube_r402 = jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(112, 133).addBox(-0.5F, -1.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1448F, 7.2923F, -1.1104F, -0.7744F, 0.0386F, 0.159F));

		PartDefinition cube_r403 = jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(133, 100).addBox(-0.5F, -0.4F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1356F, 5.6995F, -0.448F, -0.6849F, 0.072F, 0.147F));

		PartDefinition cube_r404 = jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(62, 135).addBox(-1.6472F, -0.452F, -1.1419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.4382F, 4.9235F, -0.0528F, -0.9402F, 0.0386F, 0.159F));

		PartDefinition cube_r405 = jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(69, 123).addBox(-0.5F, -2.275F, -1.55F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(31, 135).addBox(-0.5F, -0.275F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2091F, 5.5893F, 0.5695F, -0.7831F, 0.0386F, 0.159F));

		PartDefinition cube_r406 = jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(130, 61).addBox(-0.5F, -1.5F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3433F, 4.774F, 0.6585F, -0.8704F, 0.0386F, 0.159F));

		PartDefinition cube_r407 = jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(59, 130).addBox(-0.5F, -2.075F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1101F, 5.4078F, -2.7057F, -0.8966F, 0.0386F, 0.159F));

		PartDefinition cube_r408 = jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(64, 131).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0387F, 2.1575F, 2.1234F, -1.0481F, 0.116F, 0.1593F));

		PartDefinition cube_r409 = jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(40, 132).addBox(-0.5F, -0.325F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9844F, 2.7376F, 2.4526F, 0.0777F, 0.116F, 0.1593F));

		PartDefinition cube_r410 = jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(40, 135).addBox(-0.5F, -2.975F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F))
				.texOffs(54, 125).addBox(-0.5F, -2.375F, -0.575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.8175F, 3.5406F, 2.1316F, -0.5768F, 0.116F, 0.1593F));

		PartDefinition cube_r411 = jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(124, 88).addBox(-0.5F, -1.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.6217F, 3.5552F, 0.6666F, -0.062F, 0.116F, 0.1593F));

		PartDefinition cube_r412 = jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(0, 130).addBox(-0.5F, -0.9F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.6273F, 3.1914F, 0.6931F, -0.9453F, 0.0502F, 0.209F));

		PartDefinition cube_r413 = jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(124, 120).addBox(-0.5F, -0.15F, -1.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(1.1546F, 1.0179F, 2.2311F, -0.3992F, 0.1104F, 0.1847F));

		PartDefinition cube_r414 = jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(124, 116).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.9553F, 0.771F, 0.0541F, -0.0938F, 0.1104F, 0.1847F));

		PartDefinition cube_r415 = jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(47, 131).addBox(-0.3601F, -1.2915F, -0.4446F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.7165F, 1.8547F, 1.0027F, 0.6043F, 0.1104F, 0.1847F));

		PartDefinition cube_r416 = jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(126, 96).addBox(-0.5F, -0.85F, -0.475F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9894F, 1.3706F, 1.3508F, 1.3636F, 0.1104F, 0.1847F));

		PartDefinition leftLowerbeak = jaw.addOrReplaceChild("leftLowerbeak", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0967F, 7.6878F, -1.6427F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r417 = leftLowerbeak.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(134, 49).addBox(-1.0F, 0.1047F, -1.1971F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1947F, -1.0786F, -0.0682F, -1.0559F, 0.0873F, 0.0F));

		PartDefinition cube_r418 = leftLowerbeak.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(134, 46).addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4196F, -1.1315F, -1.3527F, -1.2043F, 0.0873F, 0.0F));

		PartDefinition cube_r419 = leftLowerbeak.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(103, 131).addBox(-1.3312F, -1.5997F, -0.2256F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.1947F, -1.7786F, -3.8682F, -2.3387F, 0.0873F, 0.0F));

		PartDefinition cube_r420 = leftLowerbeak.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(5, 135).addBox(-1.0017F, -1.3541F, -1.3247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(134, 43).addBox(-1.0017F, -1.3541F, -0.7497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.0497F, -0.4271F, -3.2366F, -1.9106F, 0.0865F, 0.0114F));

		PartDefinition cube_r421 = leftLowerbeak.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(10, 135).addBox(-0.5F, -0.55F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5002F, -0.984F, -2.6976F, -1.4307F, 0.0865F, 0.0114F));

		PartDefinition cube_r422 = leftLowerbeak.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(134, 29).addBox(-1.0017F, -0.755F, -0.7728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(-0.0497F, -0.4271F, -3.2366F, -1.9543F, 0.0865F, 0.0114F));

		PartDefinition cube_r423 = leftLowerbeak.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(124, 131).addBox(-1.0F, -1.5776F, -0.2066F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.216F)), PartPose.offsetAndRotation(-0.0672F, -1.3958F, -3.0624F, -1.5179F, 0.0865F, 0.0114F));

		PartDefinition cube_r424 = leftLowerbeak.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(134, 26).addBox(-1.0F, -1.2276F, -0.0566F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.215F)), PartPose.offsetAndRotation(-0.1465F, -1.7978F, -3.969F, -1.8675F, 0.0873F, 0.0F));

		PartDefinition cube_r425 = leftLowerbeak.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(134, 10).addBox(-1.0F, 0.0515F, -0.9483F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.102F, 0.1891F, -1.1285F, -1.7977F, 0.0873F, 0.0F));

		PartDefinition cube_r426 = leftLowerbeak.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(134, 4).addBox(-1.09F, -0.9801F, -1.0024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2403F, 0.0286F, -0.2091F, -0.8136F, 0.0343F, -0.0455F));

		PartDefinition cube_r427 = leftLowerbeak.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(0, 134).addBox(-1.09F, -0.9801F, -1.0024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.2153F, 0.2188F, -1.1905F, -1.3808F, 0.0343F, -0.0455F));

		PartDefinition rightLowerbeak = jaw.addOrReplaceChild("rightLowerbeak", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2967F, 7.6878F, -1.6427F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r428 = rightLowerbeak.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(134, 49).mirror().addBox(0.0F, 0.1047F, -1.1971F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, -1.0786F, -0.0682F, -1.0559F, -0.0873F, 0.0F));

		PartDefinition cube_r429 = rightLowerbeak.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(134, 46).mirror().addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4196F, -1.1315F, -1.3527F, -1.2043F, -0.0873F, 0.0F));

		PartDefinition cube_r430 = rightLowerbeak.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(103, 131).mirror().addBox(0.3312F, -1.5997F, -0.2256F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.1947F, -1.7786F, -3.8682F, -2.3387F, -0.0873F, 0.0F));

		PartDefinition cube_r431 = rightLowerbeak.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(5, 135).mirror().addBox(0.0017F, -1.3541F, -1.3247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(134, 43).mirror().addBox(0.0017F, -1.3541F, -0.7497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.0497F, -0.4271F, -3.2366F, -1.9106F, -0.0865F, -0.0114F));

		PartDefinition cube_r432 = rightLowerbeak.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(10, 135).mirror().addBox(-0.5F, -0.55F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5002F, -0.984F, -2.6976F, -1.4307F, -0.0865F, -0.0114F));

		PartDefinition cube_r433 = rightLowerbeak.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(134, 29).mirror().addBox(0.0017F, -0.755F, -0.7728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(0.0497F, -0.4271F, -3.2366F, -1.9543F, -0.0865F, -0.0114F));

		PartDefinition cube_r434 = rightLowerbeak.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(124, 131).mirror().addBox(0.0F, -1.5776F, -0.2066F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.216F)).mirror(false), PartPose.offsetAndRotation(0.0672F, -1.3958F, -3.0624F, -1.5179F, -0.0865F, -0.0114F));

		PartDefinition cube_r435 = rightLowerbeak.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(134, 26).mirror().addBox(0.0F, -1.2276F, -0.0566F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.215F)).mirror(false), PartPose.offsetAndRotation(0.1465F, -1.7978F, -3.969F, -1.8675F, -0.0873F, 0.0F));

		PartDefinition cube_r436 = rightLowerbeak.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(134, 10).mirror().addBox(0.0F, 0.0515F, -0.9483F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.102F, 0.1891F, -1.1285F, -1.7977F, -0.0873F, 0.0F));

		PartDefinition cube_r437 = rightLowerbeak.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(134, 4).mirror().addBox(0.09F, -0.9801F, -1.0024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2403F, 0.0286F, -0.2091F, -0.8136F, -0.0343F, 0.0455F));

		PartDefinition cube_r438 = rightLowerbeak.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(0, 134).mirror().addBox(0.09F, -0.9801F, -1.0024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2153F, 0.2188F, -1.1905F, -1.3808F, -0.0343F, 0.0455F));

		PartDefinition frill = head.addOrReplaceChild("frill", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6857F, -1.5926F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r439 = frill.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(132, 7).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -7.4336F, 1.3577F, -2.7576F, 0.0F, 0.0F));

		PartDefinition cube_r440 = frill.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(5, 132).addBox(-0.5F, -0.25F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -6.7526F, 1.6114F, -2.3213F, 0.0F, 0.0F));

		PartDefinition cube_r441 = frill.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(112, 80).addBox(-0.5F, -0.4238F, -0.7152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -6.3746F, 0.454F, -2.8885F, 0.0F, 0.0F));

		PartDefinition cube_r442 = frill.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(111, 58).addBox(-0.5F, -0.4108F, -0.2899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -6.3746F, 0.454F, -2.1468F, 0.0F, 0.0F));

		PartDefinition cube_r443 = frill.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(127, 7).addBox(-0.5F, -2.4848F, -1.0086F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -11.4153F, 6.885F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r444 = frill.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(84, 115).addBox(-0.5F, -5.8848F, -0.0086F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.7823F, 2.1298F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r445 = frill.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(101, 98).addBox(-1.5F, -5.0568F, 0.3861F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -5.5823F, -0.4702F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r446 = frill.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(59, 107).addBox(-1.0F, 2.0432F, -0.9139F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -14.2259F, 9.2298F, -0.7156F, 0.0F, 0.0F));

		PartDefinition leftFrill = frill.addOrReplaceChild("leftFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3796F, -8.6565F, 5.5009F, -0.5043F, -0.4415F, 0.3258F));

		PartDefinition cube_r447 = leftFrill.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(39, 81).addBox(-4.1F, -2.8F, -0.5F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7459F, 3.7253F, -1.64F, -0.0075F, -0.2318F, -0.9756F));

		PartDefinition cube_r448 = leftFrill.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(81, 48).addBox(-4.8F, -1.7F, 0.05F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4483F, 3.6741F, -1.91F, -0.1617F, -0.1241F, -0.2433F));

		PartDefinition cube_r449 = leftFrill.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(126, 128).addBox(-1.3648F, -0.783F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.112F)), PartPose.offsetAndRotation(4.1599F, -4.7351F, 0.9532F, -0.3653F, -0.1693F, 0.1405F));

		PartDefinition cube_r450 = leftFrill.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(127, 47).addBox(-0.6448F, -0.7949F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(4.1599F, -4.7351F, 0.9532F, -0.2557F, 0.3124F, 1.4213F));

		PartDefinition cube_r451 = leftFrill.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(129, 32).addBox(-1.3648F, -0.783F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.112F)), PartPose.offsetAndRotation(4.9599F, -3.5351F, 0.7032F, -0.3566F, -0.1705F, 0.139F));

		PartDefinition cube_r452 = leftFrill.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(127, 44).addBox(-0.6448F, -0.7949F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(4.9599F, -3.5351F, 0.7032F, -0.2543F, 0.3038F, 1.4217F));

		PartDefinition cube_r453 = leftFrill.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(33, 129).addBox(-1.3648F, -0.783F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.112F)), PartPose.offsetAndRotation(5.6849F, -2.5101F, 0.5532F, -0.3083F, -0.0833F, 0.3513F));

		PartDefinition cube_r454 = leftFrill.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(33, 126).addBox(-0.6448F, -0.7949F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(5.6849F, -2.5101F, 0.5532F, -0.1533F, 0.2809F, 1.6693F));

		PartDefinition cube_r455 = leftFrill.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(13, 129).addBox(-1.3648F, -0.783F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.112F)), PartPose.offsetAndRotation(6.2849F, -1.5101F, 0.3532F, -0.3083F, -0.0833F, 0.3513F));

		PartDefinition cube_r456 = leftFrill.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(127, 29).addBox(-0.6448F, -0.7949F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(6.2849F, -1.5101F, 0.3532F, -0.1533F, 0.2809F, 1.6693F));

		PartDefinition cube_r457 = leftFrill.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(93, 128).addBox(-0.174F, -0.167F, -0.485F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(7.7351F, -0.5897F, 0.2382F, -0.0188F, 0.2424F, 1.8327F));

		PartDefinition cube_r458 = leftFrill.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(40, 129).addBox(-1.8511F, -0.1684F, -0.485F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.112F)), PartPose.offsetAndRotation(7.7217F, -0.6174F, 0.2435F, -0.2407F, 0.0341F, 0.4782F));

		PartDefinition cube_r459 = leftFrill.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(127, 26).addBox(-1.5511F, -0.6684F, -0.485F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.112F)), PartPose.offsetAndRotation(7.8035F, 1.9302F, -0.3572F, -0.227F, 0.1518F, 1.1333F));

		PartDefinition cube_r460 = leftFrill.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(134, 131).addBox(0.026F, -0.742F, -0.485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.115F))
				.texOffs(134, 134).addBox(-0.274F, -0.742F, -0.485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(7.8035F, 1.9302F, -0.3572F, -0.0523F, 0.2675F, 1.929F));

		PartDefinition cube_r461 = leftFrill.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(127, 12).addBox(-1.175F, 0.05F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.112F)), PartPose.offsetAndRotation(8.5084F, 3.8418F, -0.6261F, -0.227F, 0.1518F, 1.3514F));

		PartDefinition cube_r462 = leftFrill.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(134, 108).addBox(-0.5F, -0.725F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F))
				.texOffs(134, 111).addBox(-0.2F, -0.725F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.115F)), PartPose.offsetAndRotation(7.796F, 4.5253F, -0.9017F, -0.0523F, 0.2675F, 2.1472F));

		PartDefinition cube_r463 = leftFrill.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(112, 128).addBox(-1.175F, 0.05F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.112F)), PartPose.offsetAndRotation(8.2083F, 5.8418F, -1.1261F, -0.227F, 0.1518F, 1.3514F));

		PartDefinition cube_r464 = leftFrill.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(57, 134).addBox(-0.2F, -0.725F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.115F))
				.texOffs(134, 55).addBox(-0.5F, -0.725F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(7.4961F, 6.5253F, -1.4017F, -0.0523F, 0.2675F, 2.1472F));

		PartDefinition cube_r465 = leftFrill.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(103, 22).addBox(1.2386F, -2.5647F, -0.7027F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.9131F, 1.9549F, -0.5707F, -0.1522F, 0.2268F, 1.7441F));

		PartDefinition cube_r466 = leftFrill.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(110, 97).addBox(-2.1F, -1.5F, -0.6F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.3297F, 0.6914F, -0.3908F, -0.126F, 0.3326F, 1.8246F));

		PartDefinition cube_r467 = leftFrill.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(54, 80).addBox(-4.8851F, -2.4278F, -0.6448F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.9131F, 1.9549F, -0.5707F, -0.2819F, 0.1865F, 1.0617F));

		PartDefinition cube_r468 = leftFrill.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(89, 119).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(7.9879F, 1.7498F, -0.2937F, -0.1839F, 0.2117F, 1.3267F));

		PartDefinition cube_r469 = leftFrill.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(119, 71).addBox(-0.3F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.0487F, 2.1893F, -0.6629F, -0.1547F, 0.2338F, 1.459F));

		PartDefinition cube_r470 = leftFrill.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(116, 58).addBox(-1.3372F, 0.3688F, -0.0013F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.9746F, -4.8774F, 0.6675F, -0.3647F, 0.108F, 0.839F));

		PartDefinition cube_r471 = leftFrill.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(115, 37).addBox(-2.6489F, -0.2998F, -0.1339F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.6385F, -5.2945F, 0.6846F, -0.3556F, -0.0321F, 0.4325F));

		PartDefinition cube_r472 = leftFrill.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(130, 0).addBox(-0.5171F, -2.2434F, -0.8392F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.5176F, -5.8022F, 1.4565F, -0.1809F, 0.1742F, 0.8179F));

		PartDefinition cube_r473 = leftFrill.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(125, 61).addBox(-0.9915F, -2.2627F, -0.8392F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.5176F, -5.8022F, 1.4565F, -0.1651F, 0.1892F, 0.9053F));

		PartDefinition cube_r474 = leftFrill.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(119, 131).addBox(-1.6209F, -3.841F, -0.8258F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.5176F, -5.8022F, 1.4565F, -0.1542F, 0.1627F, 1.2111F));

		PartDefinition cube_r475 = leftFrill.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(131, 104).addBox(-1.1809F, -3.8781F, -0.8258F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.5176F, -5.8022F, 1.4565F, -0.1678F, 0.1487F, 1.1239F));

		PartDefinition cube_r476 = leftFrill.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(136, 39).addBox(-0.2512F, -1.02F, -0.4669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.2228F, -6.3232F, 1.2171F, -0.2398F, -0.2765F, -1.0303F));

		PartDefinition cube_r477 = leftFrill.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(78, 136).addBox(-0.7224F, -0.4462F, -0.4669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2228F, -6.3232F, 1.2171F, -0.3632F, -0.0253F, -0.2564F));

		PartDefinition cube_r478 = leftFrill.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(129, 131).addBox(-0.3417F, -0.4642F, -0.4669F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2228F, -6.3232F, 1.2171F, -0.3501F, -0.1017F, -0.4612F));

		PartDefinition cube_r479 = leftFrill.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(111, 11).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.8979F, 2.0121F, -1.2596F, -0.2112F, -0.1917F, -0.3907F));

		PartDefinition cube_r480 = leftFrill.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(16, 116).addBox(-0.3F, -0.5F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(4.0962F, -0.1277F, -0.4689F, 0.282F, -0.215F, -1.8599F));

		PartDefinition cube_r481 = leftFrill.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(25, 116).addBox(-3.0F, -0.6F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(4.0962F, -0.1277F, -0.4689F, 0.0281F, -0.3518F, -1.0053F));

		PartDefinition cube_r482 = leftFrill.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(62, 119).addBox(-4.0F, -2.5F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7971F, -1.1815F, -0.043F, 0.1264F, -0.2996F, -2.1305F));

		PartDefinition cube_r483 = leftFrill.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(106, 83).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.4807F, -0.7956F, -0.6095F, -0.1746F, -0.269F, -1.447F));

		PartDefinition cube_r484 = leftFrill.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(6, 123).addBox(-1.2F, -0.55F, -0.425F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4157F, -4.2687F, 0.4088F, -0.2645F, 0.3195F, 0.6286F));

		PartDefinition cube_r485 = leftFrill.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(123, 20).addBox(-1.0F, -1.3F, -0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1135F, -2.9427F, -0.0875F, -0.2974F, -0.2383F, -0.9713F));

		PartDefinition cube_r486 = leftFrill.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(115, 113).addBox(-0.9F, -1.5F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(2.4944F, -3.4703F, 0.2541F, -0.2974F, 0.2012F, 0.9246F));

		PartDefinition cube_r487 = leftFrill.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(115, 41).addBox(-1.5F, -1.1F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7074F, -4.0185F, 0.3468F, -0.3194F, -0.1631F, -0.1097F));

		PartDefinition cube_r488 = leftFrill.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(115, 87).addBox(-0.685F, -1.3539F, -0.4076F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3681F, -3.4114F, 0.0544F, -0.3246F, -0.2176F, -0.699F));

		PartDefinition cube_r489 = leftFrill.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(10, 132).addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.8416F, -4.8551F, 0.7255F, -0.3956F, -0.1392F, -0.6577F));

		PartDefinition cube_r490 = leftFrill.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(125, 58).addBox(-1.85F, 0.35F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5285F, -5.6608F, 0.862F, -0.3955F, 0.1395F, -0.0155F));

		PartDefinition cube_r491 = leftFrill.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(78, 129).addBox(-0.95F, -0.75F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F))
				.texOffs(20, 129).addBox(0.05F, -0.75F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5285F, -5.6608F, 0.862F, -0.4124F, 0.0707F, -0.1768F));

		PartDefinition rightFrill = frill.addOrReplaceChild("rightFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3796F, -8.6565F, 5.5009F, -0.5043F, 0.4415F, -0.3258F));

		PartDefinition cube_r492 = rightFrill.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(39, 81).mirror().addBox(-1.9F, -2.8F, -0.5F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7459F, 3.7253F, -1.64F, -0.0075F, 0.2318F, 0.9756F));

		PartDefinition cube_r493 = rightFrill.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(81, 48).mirror().addBox(-1.2F, -1.7F, 0.05F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4483F, 3.6741F, -1.91F, -0.1617F, 0.1241F, 0.2433F));

		PartDefinition cube_r494 = rightFrill.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(126, 128).mirror().addBox(-0.6352F, -0.783F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.112F)).mirror(false), PartPose.offsetAndRotation(-4.1599F, -4.7351F, 0.9532F, -0.3653F, 0.1693F, -0.1405F));

		PartDefinition cube_r495 = rightFrill.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(127, 47).mirror().addBox(-1.3552F, -0.7949F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-4.1599F, -4.7351F, 0.9532F, -0.2557F, -0.3124F, -1.4213F));

		PartDefinition cube_r496 = rightFrill.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(129, 32).mirror().addBox(-0.6352F, -0.783F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.112F)).mirror(false), PartPose.offsetAndRotation(-4.9599F, -3.5351F, 0.7032F, -0.3566F, 0.1705F, -0.139F));

		PartDefinition cube_r497 = rightFrill.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(127, 44).mirror().addBox(-1.3552F, -0.7949F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-4.9599F, -3.5351F, 0.7032F, -0.2543F, -0.3038F, -1.4217F));

		PartDefinition cube_r498 = rightFrill.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(33, 129).mirror().addBox(-0.6352F, -0.783F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.112F)).mirror(false), PartPose.offsetAndRotation(-5.6849F, -2.5101F, 0.5532F, -0.3083F, 0.0833F, -0.3513F));

		PartDefinition cube_r499 = rightFrill.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(33, 126).mirror().addBox(-1.3552F, -0.7949F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-5.6849F, -2.5101F, 0.5532F, -0.1533F, -0.2809F, -1.6693F));

		PartDefinition cube_r500 = rightFrill.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(13, 129).mirror().addBox(-0.6352F, -0.783F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.112F)).mirror(false), PartPose.offsetAndRotation(-6.2849F, -1.5101F, 0.3532F, -0.3083F, 0.0833F, -0.3513F));

		PartDefinition cube_r501 = rightFrill.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(127, 29).mirror().addBox(-1.3552F, -0.7949F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-6.2849F, -1.5101F, 0.3532F, -0.1533F, -0.2809F, -1.6693F));

		PartDefinition cube_r502 = rightFrill.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(93, 128).mirror().addBox(-1.826F, -0.167F, -0.485F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-7.7351F, -0.5897F, 0.2382F, -0.0188F, -0.2424F, -1.8327F));

		PartDefinition cube_r503 = rightFrill.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(40, 129).mirror().addBox(-0.1489F, -0.1684F, -0.485F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.112F)).mirror(false), PartPose.offsetAndRotation(-7.7217F, -0.6174F, 0.2435F, -0.2407F, -0.0341F, -0.4782F));

		PartDefinition cube_r504 = rightFrill.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(127, 26).mirror().addBox(-0.4489F, -0.6684F, -0.485F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.112F)).mirror(false), PartPose.offsetAndRotation(-7.8035F, 1.9302F, -0.3572F, -0.227F, -0.1518F, -1.1333F));

		PartDefinition cube_r505 = rightFrill.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(134, 131).mirror().addBox(-1.026F, -0.742F, -0.485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.115F)).mirror(false)
				.texOffs(134, 134).mirror().addBox(-0.726F, -0.742F, -0.485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-7.8035F, 1.9302F, -0.3572F, -0.0523F, -0.2675F, -1.929F));

		PartDefinition cube_r506 = rightFrill.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(127, 12).mirror().addBox(-0.825F, 0.05F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.112F)).mirror(false), PartPose.offsetAndRotation(-8.5084F, 3.8418F, -0.6261F, -0.227F, -0.1518F, -1.3514F));

		PartDefinition cube_r507 = rightFrill.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(134, 108).mirror().addBox(-0.5F, -0.725F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false)
				.texOffs(134, 111).mirror().addBox(-0.8F, -0.725F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.115F)).mirror(false), PartPose.offsetAndRotation(-7.796F, 4.5253F, -0.9017F, -0.0523F, -0.2675F, -2.1472F));

		PartDefinition cube_r508 = rightFrill.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(112, 128).mirror().addBox(-0.825F, 0.05F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.112F)).mirror(false), PartPose.offsetAndRotation(-8.2083F, 5.8418F, -1.1261F, -0.227F, -0.1518F, -1.3514F));

		PartDefinition cube_r509 = rightFrill.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(57, 134).mirror().addBox(-0.8F, -0.725F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.115F)).mirror(false)
				.texOffs(134, 55).mirror().addBox(-0.5F, -0.725F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-7.4961F, 6.5253F, -1.4017F, -0.0523F, -0.2675F, -2.1472F));

		PartDefinition cube_r510 = rightFrill.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(103, 22).mirror().addBox(-5.2386F, -2.5647F, -0.7027F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.9131F, 1.9549F, -0.5707F, -0.1522F, -0.2268F, -1.7441F));

		PartDefinition cube_r511 = rightFrill.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(110, 97).mirror().addBox(-1.9F, -1.5F, -0.6F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.3297F, 0.6914F, -0.3908F, -0.126F, -0.3326F, -1.8246F));

		PartDefinition cube_r512 = rightFrill.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(54, 80).mirror().addBox(0.8851F, -2.4278F, -0.6448F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.9131F, 1.9549F, -0.5707F, -0.2819F, -0.1865F, -1.0617F));

		PartDefinition cube_r513 = rightFrill.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(89, 119).mirror().addBox(0.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-7.9879F, 1.7498F, -0.2937F, -0.1839F, -0.2117F, -1.3267F));

		PartDefinition cube_r514 = rightFrill.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(119, 71).mirror().addBox(-1.7F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-6.0487F, 2.1893F, -0.6629F, -0.1547F, -0.2338F, -1.459F));

		PartDefinition cube_r515 = rightFrill.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(116, 58).mirror().addBox(-1.6628F, 0.3688F, -0.0013F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.9746F, -4.8774F, 0.6675F, -0.3647F, -0.108F, -0.839F));

		PartDefinition cube_r516 = rightFrill.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(115, 37).mirror().addBox(-0.3511F, -0.2998F, -0.1339F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.6385F, -5.2945F, 0.6846F, -0.3556F, 0.0321F, -0.4325F));

		PartDefinition cube_r517 = rightFrill.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(130, 0).mirror().addBox(-0.4829F, -2.2434F, -0.8392F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.5176F, -5.8022F, 1.4565F, -0.1809F, -0.1742F, -0.8179F));

		PartDefinition cube_r518 = rightFrill.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(125, 61).mirror().addBox(-0.0085F, -2.2627F, -0.8392F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.5176F, -5.8022F, 1.4565F, -0.1651F, -0.1892F, -0.9053F));

		PartDefinition cube_r519 = rightFrill.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(119, 131).mirror().addBox(0.6209F, -3.841F, -0.8258F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.5176F, -5.8022F, 1.4565F, -0.1542F, -0.1627F, -1.2111F));

		PartDefinition cube_r520 = rightFrill.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(131, 104).mirror().addBox(0.1809F, -3.8781F, -0.8258F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.5176F, -5.8022F, 1.4565F, -0.1678F, -0.1487F, -1.1239F));

		PartDefinition cube_r521 = rightFrill.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(136, 39).mirror().addBox(-0.7488F, -1.02F, -0.4669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2228F, -6.3232F, 1.2171F, -0.2398F, 0.2765F, 1.0303F));

		PartDefinition cube_r522 = rightFrill.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(78, 136).mirror().addBox(-0.2776F, -0.4462F, -0.4669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2228F, -6.3232F, 1.2171F, -0.3632F, 0.0253F, 0.2564F));

		PartDefinition cube_r523 = rightFrill.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(129, 131).mirror().addBox(-0.6583F, -0.4642F, -0.4669F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2228F, -6.3232F, 1.2171F, -0.3501F, 0.1017F, 0.4612F));

		PartDefinition cube_r524 = rightFrill.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(111, 11).mirror().addBox(-1.5F, -1.0F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.8979F, 2.0121F, -1.2596F, -0.2112F, 0.1917F, 0.3907F));

		PartDefinition cube_r525 = rightFrill.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(16, 116).mirror().addBox(-2.7F, -0.5F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-4.0962F, -0.1277F, -0.4689F, 0.282F, 0.215F, 1.8599F));

		PartDefinition cube_r526 = rightFrill.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(25, 116).mirror().addBox(0.0F, -0.6F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-4.0962F, -0.1277F, -0.4689F, 0.0281F, 0.3518F, 1.0053F));

		PartDefinition cube_r527 = rightFrill.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(62, 119).mirror().addBox(1.0F, -2.5F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.7971F, -1.1815F, -0.043F, 0.1264F, 0.2996F, 2.1305F));

		PartDefinition cube_r528 = rightFrill.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(106, 83).mirror().addBox(-2.0F, -1.5F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(0.4807F, -0.7956F, -0.6095F, -0.1746F, 0.269F, 1.447F));

		PartDefinition cube_r529 = rightFrill.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(6, 123).mirror().addBox(-0.8F, -0.55F, -0.425F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4157F, -4.2687F, 0.4088F, -0.2645F, -0.3195F, -0.6286F));

		PartDefinition cube_r530 = rightFrill.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(123, 20).mirror().addBox(-1.0F, -1.3F, -0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1135F, -2.9427F, -0.0875F, -0.2974F, 0.2383F, 0.9713F));

		PartDefinition cube_r531 = rightFrill.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(115, 113).mirror().addBox(-2.1F, -1.5F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-2.4944F, -3.4703F, 0.2541F, -0.2974F, -0.2012F, -0.9246F));

		PartDefinition cube_r532 = rightFrill.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(115, 41).mirror().addBox(-1.5F, -1.1F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.7074F, -4.0185F, 0.3468F, -0.3194F, 0.1631F, 0.1097F));

		PartDefinition cube_r533 = rightFrill.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(115, 87).mirror().addBox(-2.315F, -1.3539F, -0.4076F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3681F, -3.4114F, 0.0544F, -0.3246F, 0.2176F, 0.699F));

		PartDefinition cube_r534 = rightFrill.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(10, 132).mirror().addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.8416F, -4.8551F, 0.7255F, -0.3956F, 0.1392F, 0.6577F));

		PartDefinition cube_r535 = rightFrill.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(125, 58).mirror().addBox(-0.15F, 0.35F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5285F, -5.6608F, 0.862F, -0.3955F, -0.1395F, 0.0155F));

		PartDefinition cube_r536 = rightFrill.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(78, 129).mirror().addBox(-0.05F, -0.75F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false)
				.texOffs(20, 129).mirror().addBox(-1.05F, -0.75F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5285F, -5.6608F, 0.862F, -0.4124F, -0.0707F, 0.1768F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(31, 0).addBox(-1.0F, -0.1961F, 0.0069F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.004F))
				.texOffs(131, 37).addBox(1.0F, 0.8039F, 2.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 80).addBox(0.8F, 0.8039F, 4.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 120).addBox(0.6F, 0.8039F, 6.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 131).addBox(0.5F, 0.8039F, 8.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 37).mirror().addBox(-3.0F, 0.8039F, 2.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(131, 80).mirror().addBox(-2.8F, 0.8039F, 4.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(131, 120).mirror().addBox(-2.6F, 0.8039F, 6.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(91, 131).mirror().addBox(-2.5F, 0.8039F, 8.0069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0994F, 6.3032F, -0.4598F, 0.1567F, -0.0771F));

		PartDefinition cube_r537 = tail.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(23, 136).addBox(0.0F, -4.4783F, 1.4815F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 91).addBox(0.0F, -3.8783F, -0.4185F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7301F, 6.0938F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r538 = tail.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(28, 133).addBox(0.0F, -0.0541F, -0.0285F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8972F, 8.3283F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r539 = tail.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(106, 135).addBox(0.0F, 0.0616F, -0.0148F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7972F, 6.0282F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r540 = tail.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(54, 8).addBox(0.0F, -0.1585F, -0.0752F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1035F, 4.0702F, 0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r541 = tail.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(131, 108).addBox(0.0F, -3.1473F, -0.0968F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2081F, 4.2394F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r542 = tail.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(109, 130).addBox(0.0F, -5.482F, 1.192F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7357F, 0.4245F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r543 = tail.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(88, 130).addBox(0.0F, -4.982F, -0.808F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7357F, 0.4245F, -0.1222F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 31).addBox(-1.0F, -1.1697F, -0.1085F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(131, 92).addBox(0.3F, -0.1697F, 0.8915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 94).addBox(0.1F, -0.1697F, 2.8915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(114, 71).addBox(1.0F, -0.1697F, 4.8915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(134, 13).addBox(0.8F, -0.1697F, 6.8915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 92).mirror().addBox(-2.3F, -0.1697F, 0.8915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(131, 94).mirror().addBox(-2.1F, -0.1697F, 2.8915F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(114, 71).mirror().addBox(-2.0F, -0.1697F, 4.8915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(134, 13).mirror().addBox(-1.8F, -0.1697F, 6.8915F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9361F, 8.8961F, -0.0804F, 0.2175F, -0.0174F));

		PartDefinition cube_r544 = tail2.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(36, 137).addBox(0.0F, -5.1544F, 7.2508F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 132).addBox(0.0F, -4.8544F, 5.2508F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 133).addBox(0.0F, -4.6544F, 3.2508F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 135).addBox(0.0F, -4.6544F, 1.2508F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7791F, 1.3414F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r545 = tail2.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(136, 122).addBox(0.0F, 4.5024F, 10.8768F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 136).addBox(0.0F, 3.4024F, 8.8768F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(109, 136).addBox(0.0F, 2.3024F, 6.8768F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 135).addBox(0.0F, 0.3024F, 4.8768F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5469F, -2.2129F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r546 = tail2.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(72, 133).addBox(0.0F, -2.8547F, 0.0262F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0209F, 0.8414F, -0.2443F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(42, 44).addBox(-0.5F, -0.203F, -0.0166F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.9272F, 9.6761F, 0.2796F, -0.2521F, -0.0715F));

		PartDefinition cube_r547 = tail3.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(137, 58).addBox(0.0F, 9.7423F, 17.0451F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(137, 22).addBox(0.0F, 7.8423F, 15.4451F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4559F, -11.8198F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r548 = tail3.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(0, 137).addBox(0.0F, 0.3186F, -0.1258F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6559F, 3.0802F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r549 = tail3.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(93, 136).addBox(0.0F, 0.0606F, -0.0133F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8559F, 1.1802F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r550 = tail3.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(51, 137).addBox(0.0F, -3.5976F, 5.1233F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 137).addBox(0.0F, -3.3976F, 3.1233F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 137).addBox(0.0F, -3.3976F, 1.1233F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6881F, 1.6345F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r551 = tail3.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(15, 137).addBox(0.0F, -1.7849F, -0.0497F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2119F, 1.0345F, -0.3403F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.2532F, -0.1914F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0741F, 8.8502F, 0.303F, -0.4611F, -0.1382F));

		PartDefinition cube_r552 = tail4.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(90, 27).addBox(0.0F, -2.1407F, -1.4848F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5011F, 3.0578F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r553 = tail4.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(93, 125).addBox(0.0F, -2.282F, -1.408F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8011F, 5.0578F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r554 = tail4.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(63, 52).addBox(0.0F, 8.4206F, 15.884F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 111).addBox(0.0F, 10.8574F, 19.2002F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 5).addBox(0.0F, 9.739F, 17.5421F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.501F, -17.6618F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r555 = tail4.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(16, 107).addBox(0.0F, -0.5F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4558F, 0.2694F, -0.2182F, 0.0F, 0.0F));

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