package fossils.fossils.client.blockentity.model.eustreptospondylus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EustreptospondylusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart head2;
	private final ModelPart headsep;
	private final ModelPart head3;
	private final ModelPart head5;
	private final ModelPart Tteeth2;
	private final ModelPart Tteeth1;
	private final ModelPart head6;
	private final ModelPart Rcrest;
	private final ModelPart Rcrest2;
	private final ModelPart Rcrest3;
	private final ModelPart Rcrest4;
	private final ModelPart jaw;
	private final ModelPart jaw2;
	private final ModelPart jaw3;
	private final ModelPart jaw4;
	private final ModelPart Bteeth2;
	private final ModelPart Bteeth1;
	private final ModelPart masseter;
	private final ModelPart throat;
	private final ModelPart leftArm3;
	private final ModelPart leftArm2;
	private final ModelPart leftArm;
	private final ModelPart rightArm3;
	private final ModelPart rightArm2;
	private final ModelPart rightArm;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart leftLeg4;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg;
	private final ModelPart rightLeg4;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg;

	public EustreptospondylusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.head2 = this.head.getChild("head2");
		this.headsep = this.head2.getChild("headsep");
		this.head3 = this.headsep.getChild("head3");
		this.head5 = this.headsep.getChild("head5");
		this.Tteeth2 = this.head5.getChild("Tteeth2");
		this.Tteeth1 = this.headsep.getChild("Tteeth1");
		this.head6 = this.headsep.getChild("head6");
		this.Rcrest = this.headsep.getChild("Rcrest");
		this.Rcrest2 = this.Rcrest.getChild("Rcrest2");
		this.Rcrest3 = this.headsep.getChild("Rcrest3");
		this.Rcrest4 = this.Rcrest3.getChild("Rcrest4");
		this.jaw = this.head.getChild("jaw");
		this.jaw2 = this.jaw.getChild("jaw2");
		this.jaw3 = this.jaw2.getChild("jaw3");
		this.jaw4 = this.jaw2.getChild("jaw4");
		this.Bteeth2 = this.jaw4.getChild("Bteeth2");
		this.Bteeth1 = this.jaw2.getChild("Bteeth1");
		this.masseter = this.jaw.getChild("masseter");
		this.throat = this.neck3.getChild("throat");
		this.leftArm3 = this.chest.getChild("leftArm3");
		this.leftArm2 = this.leftArm3.getChild("leftArm2");
		this.leftArm = this.leftArm2.getChild("leftArm");
		this.rightArm3 = this.chest.getChild("rightArm3");
		this.rightArm2 = this.rightArm3.getChild("rightArm2");
		this.rightArm = this.rightArm2.getChild("rightArm");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.leftLeg4 = this.hips.getChild("leftLeg4");
		this.leftLeg2 = this.leftLeg4.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg = this.leftLeg3.getChild("leftLeg");
		this.rightLeg4 = this.hips.getChild("rightLeg4");
		this.rightLeg2 = this.rightLeg4.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg = this.rightLeg3.getChild("rightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(0, 35).addBox(-0.5F, -1.6525F, -4.2215F, 1.0F, 2.0F, 11.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 0).addBox(0.0F, -3.6525F, -4.2215F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 56).addBox(0.0F, -3.6525F, -2.2215F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -30.45F, 4.0F, -0.03F, 0.0F, 0.0F));

		PartDefinition Box_r1 = hips.addOrReplaceChild("Box_r1", CubeListBuilder.create().texOffs(47, 50).mirror().addBox(0.036F, 8.6407F, -1.0476F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(41, 67).mirror().addBox(0.036F, -0.1593F, -0.7476F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.1484F, 2.9799F, -2.4884F, -0.3491F, 0.0F, -0.1484F));

		PartDefinition Box_r2 = hips.addOrReplaceChild("Box_r2", CubeListBuilder.create().texOffs(54, 0).mirror().addBox(-0.1179F, -1.8396F, 0.3515F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0484F, 2.9799F, 0.8116F, -1.6675F, 0.262F, 0.0402F));

		PartDefinition Box_r3 = hips.addOrReplaceChild("Box_r3", CubeListBuilder.create().texOffs(11, 0).mirror().addBox(-0.1179F, 0.3061F, -1.1271F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0484F, 2.9799F, 0.8116F, -3.0812F, 0.262F, 0.0402F));

		PartDefinition Box_r4 = hips.addOrReplaceChild("Box_r4", CubeListBuilder.create().texOffs(24, 56).mirror().addBox(-0.1179F, -1.6593F, -1.2267F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)).mirror(false), PartPose.offsetAndRotation(-2.0484F, 2.9799F, 0.8116F, -2.575F, 0.262F, 0.0402F));

		PartDefinition Box_r5 = hips.addOrReplaceChild("Box_r5", CubeListBuilder.create().texOffs(11, 7).mirror().addBox(-0.1179F, -8.6789F, -0.9199F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0484F, 2.9799F, 0.8116F, -2.2958F, 0.262F, 0.0402F));

		PartDefinition Box_r6 = hips.addOrReplaceChild("Box_r6", CubeListBuilder.create().texOffs(36, 45).mirror().addBox(-0.1179F, -2.9694F, -0.5326F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-2.0484F, 2.9799F, 0.8116F, -2.1561F, 0.262F, 0.0402F));

		PartDefinition Box_r7 = hips.addOrReplaceChild("Box_r7", CubeListBuilder.create().texOffs(57, 41).mirror().addBox(0.036F, -1.2967F, 0.0405F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-2.1484F, 2.9799F, -2.4884F, -0.6458F, 0.0F, -0.1484F));

		PartDefinition Box_r8 = hips.addOrReplaceChild("Box_r8", CubeListBuilder.create().texOffs(19, 66).mirror().addBox(-1.8516F, -3.2293F, 4.1328F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5484F, 4.8799F, -0.6884F, 0.5061F, 0.0F, 0.1309F));

		PartDefinition Box_r9 = hips.addOrReplaceChild("Box_r9", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-1.8516F, -6.1053F, -2.9425F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5484F, 4.8799F, -0.6884F, -0.3316F, 0.0F, 0.1309F));

		PartDefinition Box_r10 = hips.addOrReplaceChild("Box_r10", CubeListBuilder.create().texOffs(49, 13).mirror().addBox(-1.8516F, -7.0875F, -0.2897F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5484F, 4.8799F, -0.6884F, 0.5236F, 0.0F, 0.1309F));

		PartDefinition Box_r11 = hips.addOrReplaceChild("Box_r11", CubeListBuilder.create().texOffs(14, 40).mirror().addBox(-1.8516F, -7.0966F, -1.6627F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5484F, 4.8799F, -0.6884F, 0.0524F, 0.0F, 0.1309F));

		PartDefinition Box_r12 = hips.addOrReplaceChild("Box_r12", CubeListBuilder.create().texOffs(64, 17).mirror().addBox(-1.8516F, -7.4137F, 0.9549F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5484F, 4.8799F, -0.6884F, -0.1396F, 0.0F, 0.1309F));

		PartDefinition Box_r13 = hips.addOrReplaceChild("Box_r13", CubeListBuilder.create().texOffs(48, 31).mirror().addBox(-1.8516F, -6.1154F, -1.6158F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5484F, 4.8799F, -0.6884F, 0.0698F, 0.0F, 0.1309F));

		PartDefinition Box_r14 = hips.addOrReplaceChild("Box_r14", CubeListBuilder.create().texOffs(49, 13).addBox(0.8516F, -7.0875F, -0.2897F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5484F, 4.8799F, -0.6884F, 0.5236F, 0.0F, -0.1309F));

		PartDefinition Box_r15 = hips.addOrReplaceChild("Box_r15", CubeListBuilder.create().texOffs(14, 40).addBox(0.8516F, -7.0966F, -1.6627F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5484F, 4.8799F, -0.6884F, 0.0524F, 0.0F, -0.1309F));

		PartDefinition Box_r16 = hips.addOrReplaceChild("Box_r16", CubeListBuilder.create().texOffs(64, 17).addBox(0.8516F, -7.4137F, 0.9549F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5484F, 4.8799F, -0.6884F, -0.1396F, 0.0F, -0.1309F));

		PartDefinition Box_r17 = hips.addOrReplaceChild("Box_r17", CubeListBuilder.create().texOffs(47, 50).addBox(-1.036F, 8.6407F, -1.0476F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.104F))
				.texOffs(41, 67).addBox(-1.036F, -0.1593F, -0.7476F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.1484F, 2.9799F, -2.4884F, -0.3491F, 0.0F, 0.1484F));

		PartDefinition Box_r18 = hips.addOrReplaceChild("Box_r18", CubeListBuilder.create().texOffs(11, 7).addBox(-0.8821F, -8.6789F, -0.9199F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0484F, 2.9799F, 0.8116F, -2.2958F, -0.262F, -0.0402F));

		PartDefinition Box_r19 = hips.addOrReplaceChild("Box_r19", CubeListBuilder.create().texOffs(11, 0).addBox(-0.8821F, 0.3061F, -1.1271F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0484F, 2.9799F, 0.8116F, -3.0812F, -0.262F, -0.0402F));

		PartDefinition Box_r20 = hips.addOrReplaceChild("Box_r20", CubeListBuilder.create().texOffs(54, 0).addBox(-0.8821F, -1.8396F, 0.3515F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0484F, 2.9799F, 0.8116F, -1.6675F, -0.262F, -0.0402F));

		PartDefinition Box_r21 = hips.addOrReplaceChild("Box_r21", CubeListBuilder.create().texOffs(24, 56).addBox(-0.8821F, -1.6593F, -1.2267F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(2.0484F, 2.9799F, 0.8116F, -2.575F, -0.262F, -0.0402F));

		PartDefinition Box_r22 = hips.addOrReplaceChild("Box_r22", CubeListBuilder.create().texOffs(36, 45).addBox(-0.8821F, -2.9694F, -0.5326F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(2.0484F, 2.9799F, 0.8116F, -2.1561F, -0.262F, -0.0402F));

		PartDefinition Box_r23 = hips.addOrReplaceChild("Box_r23", CubeListBuilder.create().texOffs(57, 41).addBox(-1.036F, -1.2967F, 0.0405F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(2.1484F, 2.9799F, -2.4884F, -0.6458F, 0.0F, 0.1484F));

		PartDefinition Box_r24 = hips.addOrReplaceChild("Box_r24", CubeListBuilder.create().texOffs(0, 18).addBox(0.8516F, -6.1053F, -2.9425F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5484F, 4.8799F, -0.6884F, -0.3316F, 0.0F, -0.1309F));

		PartDefinition Box_r25 = hips.addOrReplaceChild("Box_r25", CubeListBuilder.create().texOffs(19, 66).addBox(0.8516F, -3.2293F, 4.1328F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5484F, 4.8799F, -0.6884F, 0.5061F, 0.0F, -0.1309F));

		PartDefinition Box_r26 = hips.addOrReplaceChild("Box_r26", CubeListBuilder.create().texOffs(48, 31).addBox(0.8516F, -6.1154F, -1.6158F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5484F, 4.8799F, -0.6884F, 0.0698F, 0.0F, -0.1309F));

		PartDefinition Box_r27 = hips.addOrReplaceChild("Box_r27", CubeListBuilder.create().texOffs(31, 80).mirror().addBox(-2.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3525F, -3.7215F, -0.0562F, -0.0668F, -1.2373F));

		PartDefinition Box_r28 = hips.addOrReplaceChild("Box_r28", CubeListBuilder.create().texOffs(84, 42).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3525F, -3.7215F, -0.082F, -0.0298F, -0.7144F));

		PartDefinition Box_r29 = hips.addOrReplaceChild("Box_r29", CubeListBuilder.create().texOffs(84, 42).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3525F, -3.7215F, -0.082F, 0.0298F, 0.7144F));

		PartDefinition Box_r30 = hips.addOrReplaceChild("Box_r30", CubeListBuilder.create().texOffs(31, 80).addBox(0.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3525F, -3.7215F, -0.0562F, 0.0668F, 1.2373F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, -0.7736F, -13.032F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(74, 80).addBox(0.0F, -2.9736F, -12.032F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 63).addBox(0.0F, -3.1736F, -10.032F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 80).addBox(0.0F, -3.3736F, -8.032F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 80).addBox(0.0F, -3.3736F, -6.032F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 50).addBox(0.0F, -3.3736F, -4.032F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 80).addBox(0.0F, -3.1736F, -2.032F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8525F, -4.1215F, 0.1588F, -0.1792F, 0.0156F));

		PartDefinition Box_r31 = body.addOrReplaceChild("Box_r31", CubeListBuilder.create().texOffs(67, 39).mirror().addBox(-3.2321F, -1.866F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2264F, -1.532F, -0.0152F, -0.0859F, -1.5352F));

		PartDefinition Box_r32 = body.addOrReplaceChild("Box_r32", CubeListBuilder.create().texOffs(48, 37).mirror().addBox(-2.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2264F, -1.532F, -0.0562F, -0.0668F, -1.0104F));

		PartDefinition Box_r33 = body.addOrReplaceChild("Box_r33", CubeListBuilder.create().texOffs(65, 15).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2264F, -1.532F, -0.082F, -0.0298F, -0.4875F));

		PartDefinition Box_r34 = body.addOrReplaceChild("Box_r34", CubeListBuilder.create().texOffs(64, 23).mirror().addBox(-4.2321F, -1.866F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2264F, -3.532F, -0.0091F, -0.0516F, -1.4484F));

		PartDefinition Box_r35 = body.addOrReplaceChild("Box_r35", CubeListBuilder.create().texOffs(59, 37).mirror().addBox(-2.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2264F, -3.532F, -0.0337F, -0.0401F, -0.9243F));

		PartDefinition Box_r36 = body.addOrReplaceChild("Box_r36", CubeListBuilder.create().texOffs(70, 30).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2264F, -3.532F, -0.0492F, -0.0179F, -0.401F));

		PartDefinition Box_r37 = body.addOrReplaceChild("Box_r37", CubeListBuilder.create().texOffs(12, 56).mirror().addBox(-5.2321F, -1.866F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2264F, -5.532F, -0.003F, -0.0172F, -1.3962F));

		PartDefinition Box_r38 = body.addOrReplaceChild("Box_r38", CubeListBuilder.create().texOffs(78, 13).mirror().addBox(-2.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2264F, -5.532F, -0.0112F, -0.0134F, -0.8726F));

		PartDefinition Box_r39 = body.addOrReplaceChild("Box_r39", CubeListBuilder.create().texOffs(7, 73).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2264F, -5.532F, -0.0164F, -0.006F, -0.349F));

		PartDefinition Box_r40 = body.addOrReplaceChild("Box_r40", CubeListBuilder.create().texOffs(19, 10).mirror().addBox(-6.2321F, -1.866F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2264F, -7.532F, 0.0061F, 0.0344F, -1.3438F));

		PartDefinition Box_r41 = body.addOrReplaceChild("Box_r41", CubeListBuilder.create().texOffs(78, 27).mirror().addBox(-2.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2264F, -7.532F, 0.0224F, 0.0267F, -0.82F));

		PartDefinition Box_r42 = body.addOrReplaceChild("Box_r42", CubeListBuilder.create().texOffs(73, 34).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2264F, -7.532F, 0.0328F, 0.0119F, -0.2965F));

		PartDefinition Box_r43 = body.addOrReplaceChild("Box_r43", CubeListBuilder.create().texOffs(0, 28).mirror().addBox(-8.232F, -1.866F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2264F, -9.532F, 0.0091F, 0.0516F, -1.3611F));

		PartDefinition Box_r44 = body.addOrReplaceChild("Box_r44", CubeListBuilder.create().texOffs(31, 78).mirror().addBox(-2.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2264F, -9.532F, 0.0337F, 0.0401F, -0.8371F));

		PartDefinition Box_r45 = body.addOrReplaceChild("Box_r45", CubeListBuilder.create().texOffs(80, 68).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2264F, -9.532F, 0.0492F, 0.0179F, -0.3137F));

		PartDefinition Box_r46 = body.addOrReplaceChild("Box_r46", CubeListBuilder.create().texOffs(35, 11).mirror().addBox(-10.232F, -1.866F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2264F, -11.532F, 0.0152F, 0.0859F, -1.3433F));

		PartDefinition Box_r47 = body.addOrReplaceChild("Box_r47", CubeListBuilder.create().texOffs(38, 78).mirror().addBox(-2.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2264F, -11.532F, 0.0562F, 0.0668F, -0.8184F));

		PartDefinition Box_r48 = body.addOrReplaceChild("Box_r48", CubeListBuilder.create().texOffs(81, 3).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2264F, -11.532F, 0.082F, 0.0298F, -0.2955F));

		PartDefinition Box_r49 = body.addOrReplaceChild("Box_r49", CubeListBuilder.create().texOffs(65, 15).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2264F, -1.532F, -0.082F, 0.0298F, 0.4875F));

		PartDefinition Box_r50 = body.addOrReplaceChild("Box_r50", CubeListBuilder.create().texOffs(48, 37).addBox(0.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2264F, -1.532F, -0.0562F, 0.0668F, 1.0104F));

		PartDefinition Box_r51 = body.addOrReplaceChild("Box_r51", CubeListBuilder.create().texOffs(67, 39).addBox(2.2321F, -1.866F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2264F, -1.532F, -0.0152F, 0.0859F, 1.5352F));

		PartDefinition Box_r52 = body.addOrReplaceChild("Box_r52", CubeListBuilder.create().texOffs(70, 30).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2264F, -3.532F, -0.0492F, 0.0179F, 0.401F));

		PartDefinition Box_r53 = body.addOrReplaceChild("Box_r53", CubeListBuilder.create().texOffs(59, 37).addBox(0.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2264F, -3.532F, -0.0337F, 0.0401F, 0.9243F));

		PartDefinition Box_r54 = body.addOrReplaceChild("Box_r54", CubeListBuilder.create().texOffs(64, 23).addBox(2.2321F, -1.866F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2264F, -3.532F, -0.0091F, 0.0516F, 1.4484F));

		PartDefinition Box_r55 = body.addOrReplaceChild("Box_r55", CubeListBuilder.create().texOffs(7, 73).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2264F, -5.532F, -0.0164F, 0.006F, 0.349F));

		PartDefinition Box_r56 = body.addOrReplaceChild("Box_r56", CubeListBuilder.create().texOffs(78, 13).addBox(0.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2264F, -5.532F, -0.0112F, 0.0134F, 0.8726F));

		PartDefinition Box_r57 = body.addOrReplaceChild("Box_r57", CubeListBuilder.create().texOffs(12, 56).addBox(2.2321F, -1.866F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2264F, -5.532F, -0.003F, 0.0172F, 1.3962F));

		PartDefinition Box_r58 = body.addOrReplaceChild("Box_r58", CubeListBuilder.create().texOffs(73, 34).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2264F, -7.532F, 0.0328F, -0.0119F, 0.2965F));

		PartDefinition Box_r59 = body.addOrReplaceChild("Box_r59", CubeListBuilder.create().texOffs(78, 27).addBox(0.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2264F, -7.532F, 0.0224F, -0.0267F, 0.82F));

		PartDefinition Box_r60 = body.addOrReplaceChild("Box_r60", CubeListBuilder.create().texOffs(19, 10).addBox(2.2321F, -1.866F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2264F, -7.532F, 0.0061F, -0.0344F, 1.3438F));

		PartDefinition Box_r61 = body.addOrReplaceChild("Box_r61", CubeListBuilder.create().texOffs(80, 68).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2264F, -9.532F, 0.0492F, -0.0179F, 0.3137F));

		PartDefinition Box_r62 = body.addOrReplaceChild("Box_r62", CubeListBuilder.create().texOffs(31, 78).addBox(0.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2264F, -9.532F, 0.0337F, -0.0401F, 0.8371F));

		PartDefinition Box_r63 = body.addOrReplaceChild("Box_r63", CubeListBuilder.create().texOffs(0, 28).addBox(2.2321F, -1.866F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2264F, -9.532F, 0.0091F, -0.0516F, 1.3611F));

		PartDefinition Box_r64 = body.addOrReplaceChild("Box_r64", CubeListBuilder.create().texOffs(35, 11).addBox(2.2321F, -1.866F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2264F, -11.532F, 0.0152F, -0.0859F, 1.3433F));

		PartDefinition Box_r65 = body.addOrReplaceChild("Box_r65", CubeListBuilder.create().texOffs(38, 78).addBox(0.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2264F, -11.532F, 0.0562F, -0.0668F, 0.8184F));

		PartDefinition Box_r66 = body.addOrReplaceChild("Box_r66", CubeListBuilder.create().texOffs(81, 3).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2264F, -11.532F, 0.082F, -0.0298F, 0.2955F));

		PartDefinition Box_r67 = body.addOrReplaceChild("Box_r67", CubeListBuilder.create().texOffs(14, 35).addBox(-3.5F, -2.1191F, -1.9953F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.9264F, -13.032F, -0.2793F, 0.0F, 0.0F));

		PartDefinition Box_r68 = body.addOrReplaceChild("Box_r68", CubeListBuilder.create().texOffs(25, 33).addBox(-3.5F, -3.0F, -8.0F, 7.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.2264F, -5.032F, -0.0524F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0736F, -12.932F, 0.0646F, 0.0435F, 0.0028F));

		PartDefinition Box_r69 = chest.addOrReplaceChild("Box_r69", CubeListBuilder.create().texOffs(49, 11).mirror().addBox(-4.0F, 0.2336F, -0.2427F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(49, 11).addBox(3.0F, 0.2336F, -0.2427F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.8798F, -8.0783F, 0.9774F, 0.0F, 0.0F));

		PartDefinition Box_r70 = chest.addOrReplaceChild("Box_r70", CubeListBuilder.create().texOffs(13, 56).mirror().addBox(-4.0F, -0.9F, -6.4F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(13, 56).addBox(3.0F, -0.9F, -6.4F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.9798F, -4.2783F, 1.0297F, 0.0F, 0.0F));

		PartDefinition Box_r71 = chest.addOrReplaceChild("Box_r71", CubeListBuilder.create().texOffs(48, 31).mirror().addBox(0.0F, -0.9901F, -1.9111F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 6.2798F, -8.0783F, 1.0794F, -0.3474F, -0.5666F));

		PartDefinition Box_r72 = chest.addOrReplaceChild("Box_r72", CubeListBuilder.create().texOffs(35, 0).mirror().addBox(-0.0436F, -1.9967F, -1.9967F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 8.0798F, -8.0783F, 1.241F, -0.5027F, -0.953F));

		PartDefinition Box_r73 = chest.addOrReplaceChild("Box_r73", CubeListBuilder.create().texOffs(35, 0).addBox(-0.9564F, -1.9967F, -1.9967F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.8F, 8.0798F, -8.0783F, 1.241F, 0.5027F, 0.953F));

		PartDefinition Box_r74 = chest.addOrReplaceChild("Box_r74", CubeListBuilder.create().texOffs(48, 31).addBox(-1.0F, -0.9901F, -1.9111F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 6.2798F, -8.0783F, 1.0794F, 0.3474F, 0.5666F));

		PartDefinition Box_r75 = chest.addOrReplaceChild("Box_r75", CubeListBuilder.create().texOffs(83, 52).addBox(0.0F, -2.1023F, -0.8523F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 56).addBox(0.0F, -2.1023F, -2.8523F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 62).addBox(0.0F, -2.1023F, -4.8523F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 83).addBox(0.0F, -2.1023F, -6.8523F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 83).addBox(0.0F, -2.1023F, -8.8523F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 49).addBox(-0.5F, -0.1023F, -8.8523F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5877F, -0.12F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Box_r76 = chest.addOrReplaceChild("Box_r76", CubeListBuilder.create().texOffs(57, 49).mirror().addBox(-10.232F, -1.866F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3123F, -0.52F, 0.0091F, 0.0516F, -1.3437F));

		PartDefinition Box_r77 = chest.addOrReplaceChild("Box_r77", CubeListBuilder.create().texOffs(80, 29).mirror().addBox(-2.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3123F, -0.52F, 0.0337F, 0.0401F, -0.8196F));

		PartDefinition Box_r78 = chest.addOrReplaceChild("Box_r78", CubeListBuilder.create().texOffs(84, 34).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3123F, -0.52F, 0.0492F, 0.0179F, -0.2963F));

		PartDefinition Box_r79 = chest.addOrReplaceChild("Box_r79", CubeListBuilder.create().texOffs(80, 17).mirror().addBox(-2.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5123F, -2.52F, 0.0337F, 0.0401F, -0.8196F));

		PartDefinition Box_r80 = chest.addOrReplaceChild("Box_r80", CubeListBuilder.create().texOffs(22, 84).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5123F, -2.52F, 0.0492F, 0.0179F, -0.2963F));

		PartDefinition Box_r81 = chest.addOrReplaceChild("Box_r81", CubeListBuilder.create().texOffs(57, 51).mirror().addBox(-9.232F, -1.866F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5123F, -2.52F, 0.0091F, 0.0516F, -1.3437F));

		PartDefinition Box_r82 = chest.addOrReplaceChild("Box_r82", CubeListBuilder.create().texOffs(0, 30).mirror().addBox(-8.232F, -1.866F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7123F, -4.42F, 0.0091F, 0.0516F, -1.3611F));

		PartDefinition Box_r83 = chest.addOrReplaceChild("Box_r83", CubeListBuilder.create().texOffs(80, 15).mirror().addBox(-2.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7123F, -4.42F, 0.0337F, 0.0401F, -0.8371F));

		PartDefinition Box_r84 = chest.addOrReplaceChild("Box_r84", CubeListBuilder.create().texOffs(17, 84).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7123F, -4.42F, 0.0492F, 0.0179F, -0.3137F));

		PartDefinition Box_r85 = chest.addOrReplaceChild("Box_r85", CubeListBuilder.create().texOffs(18, 28).mirror().addBox(-6.2321F, -1.866F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2123F, -6.42F, 0.0182F, 0.1031F, -1.3953F));

		PartDefinition Box_r86 = chest.addOrReplaceChild("Box_r86", CubeListBuilder.create().texOffs(84, 12).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2123F, -6.42F, 0.0984F, 0.0358F, -0.3473F));

		PartDefinition Box_r87 = chest.addOrReplaceChild("Box_r87", CubeListBuilder.create().texOffs(7, 80).mirror().addBox(-2.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2123F, -6.42F, 0.0675F, 0.0802F, -0.87F));

		PartDefinition Box_r88 = chest.addOrReplaceChild("Box_r88", CubeListBuilder.create().texOffs(76, 75).mirror().addBox(-5.2321F, -1.866F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.5123F, -8.22F, 0.0401F, 0.2234F, -1.5139F));

		PartDefinition Box_r89 = chest.addOrReplaceChild("Box_r89", CubeListBuilder.create().texOffs(79, 19).mirror().addBox(-2.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.5123F, -8.22F, 0.1473F, 0.1732F, -0.982F));

		PartDefinition Box_r90 = chest.addOrReplaceChild("Box_r90", CubeListBuilder.create().texOffs(83, 66).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.5123F, -8.22F, 0.2136F, 0.077F, -0.463F));

		PartDefinition Box_r91 = chest.addOrReplaceChild("Box_r91", CubeListBuilder.create().texOffs(83, 66).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5123F, -8.22F, 0.2136F, -0.077F, 0.463F));

		PartDefinition Box_r92 = chest.addOrReplaceChild("Box_r92", CubeListBuilder.create().texOffs(79, 19).addBox(0.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5123F, -8.22F, 0.1473F, -0.1732F, 0.982F));

		PartDefinition Box_r93 = chest.addOrReplaceChild("Box_r93", CubeListBuilder.create().texOffs(76, 75).addBox(2.2321F, -1.866F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5123F, -8.22F, 0.0401F, -0.2234F, 1.5139F));

		PartDefinition Box_r94 = chest.addOrReplaceChild("Box_r94", CubeListBuilder.create().texOffs(84, 12).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2123F, -6.42F, 0.0984F, -0.0358F, 0.3473F));

		PartDefinition Box_r95 = chest.addOrReplaceChild("Box_r95", CubeListBuilder.create().texOffs(7, 80).addBox(0.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2123F, -6.42F, 0.0675F, -0.0802F, 0.87F));

		PartDefinition Box_r96 = chest.addOrReplaceChild("Box_r96", CubeListBuilder.create().texOffs(18, 28).addBox(2.2321F, -1.866F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2123F, -6.42F, 0.0182F, -0.1031F, 1.3953F));

		PartDefinition Box_r97 = chest.addOrReplaceChild("Box_r97", CubeListBuilder.create().texOffs(17, 84).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7123F, -4.42F, 0.0492F, -0.0179F, 0.3137F));

		PartDefinition Box_r98 = chest.addOrReplaceChild("Box_r98", CubeListBuilder.create().texOffs(80, 15).addBox(0.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7123F, -4.42F, 0.0337F, -0.0401F, 0.8371F));

		PartDefinition Box_r99 = chest.addOrReplaceChild("Box_r99", CubeListBuilder.create().texOffs(0, 30).addBox(2.2321F, -1.866F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7123F, -4.42F, 0.0091F, -0.0516F, 1.3611F));

		PartDefinition Box_r100 = chest.addOrReplaceChild("Box_r100", CubeListBuilder.create().texOffs(57, 51).addBox(2.2321F, -1.866F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5123F, -2.52F, 0.0091F, -0.0516F, 1.3437F));

		PartDefinition Box_r101 = chest.addOrReplaceChild("Box_r101", CubeListBuilder.create().texOffs(80, 17).addBox(0.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5123F, -2.52F, 0.0337F, -0.0401F, 0.8196F));

		PartDefinition Box_r102 = chest.addOrReplaceChild("Box_r102", CubeListBuilder.create().texOffs(22, 84).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5123F, -2.52F, 0.0492F, -0.0179F, 0.2963F));

		PartDefinition Box_r103 = chest.addOrReplaceChild("Box_r103", CubeListBuilder.create().texOffs(57, 49).addBox(2.2321F, -1.866F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3123F, -0.52F, 0.0091F, -0.0516F, 1.3437F));

		PartDefinition Box_r104 = chest.addOrReplaceChild("Box_r104", CubeListBuilder.create().texOffs(80, 29).addBox(0.866F, -0.5F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3123F, -0.52F, 0.0337F, -0.0401F, 0.8196F));

		PartDefinition Box_r105 = chest.addOrReplaceChild("Box_r105", CubeListBuilder.create().texOffs(84, 34).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3123F, -0.52F, 0.0492F, -0.0179F, 0.2963F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0123F, -8.62F, -0.1864F, 0.0F, 0.0F));

		PartDefinition Box_r106 = neck1.addOrReplaceChild("Box_r106", CubeListBuilder.create().texOffs(84, 7).addBox(0.0F, -2.7F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 84).addBox(0.0F, -2.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 45).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0155F, -4.1812F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Box_r107 = neck1.addOrReplaceChild("Box_r107", CubeListBuilder.create().texOffs(74, 25).mirror().addBox(-3.866F, -0.5F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4155F, -1.6812F, 0.1407F, 0.7556F, -1.1984F));

		PartDefinition Box_r108 = neck1.addOrReplaceChild("Box_r108", CubeListBuilder.create().texOffs(83, 40).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4155F, -1.6812F, 0.5393F, 0.5738F, -0.568F));

		PartDefinition Box_r109 = neck1.addOrReplaceChild("Box_r109", CubeListBuilder.create().texOffs(69, 10).mirror().addBox(-3.866F, -0.5F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4155F, -3.6812F, 0.1763F, 0.8208F, -1.1906F));

		PartDefinition Box_r110 = neck1.addOrReplaceChild("Box_r110", CubeListBuilder.create().texOffs(83, 37).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4155F, -3.6812F, 0.6104F, 0.6112F, -0.5457F));

		PartDefinition Box_r111 = neck1.addOrReplaceChild("Box_r111", CubeListBuilder.create().texOffs(83, 37).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4155F, -3.6812F, 0.6104F, -0.6112F, 0.5457F));

		PartDefinition Box_r112 = neck1.addOrReplaceChild("Box_r112", CubeListBuilder.create().texOffs(69, 10).addBox(0.866F, -0.5F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4155F, -3.6812F, 0.1763F, -0.8208F, 1.1906F));

		PartDefinition Box_r113 = neck1.addOrReplaceChild("Box_r113", CubeListBuilder.create().texOffs(74, 25).addBox(0.866F, -0.5F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4155F, -1.6812F, 0.1407F, -0.7556F, 1.1984F));

		PartDefinition Box_r114 = neck1.addOrReplaceChild("Box_r114", CubeListBuilder.create().texOffs(83, 40).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4155F, -1.6812F, 0.5393F, -0.5738F, 0.568F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4155F, -3.9812F, -0.1807F, 0.2305F, 0.0448F));

		PartDefinition Box_r115 = neck2.addOrReplaceChild("Box_r115", CubeListBuilder.create().texOffs(70, 84).addBox(0.0F, -1.0F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 84).addBox(0.0F, -1.0F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 56).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.0095F, -4.9029F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Box_r116 = neck2.addOrReplaceChild("Box_r116", CubeListBuilder.create().texOffs(83, 25).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2905F, -1.6029F, 0.9328F, 0.7326F, -0.3435F));

		PartDefinition Box_r117 = neck2.addOrReplaceChild("Box_r117", CubeListBuilder.create().texOffs(9, 61).mirror().addBox(-3.866F, -0.5F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2905F, -1.6029F, 0.3915F, 1.0713F, -1.0144F));

		PartDefinition Box_r118 = neck2.addOrReplaceChild("Box_r118", CubeListBuilder.create().texOffs(81, 77).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2095F, -3.6029F, 0.776F, 0.7796F, -0.4475F));

		PartDefinition Box_r119 = neck2.addOrReplaceChild("Box_r119", CubeListBuilder.create().texOffs(57, 53).mirror().addBox(-3.866F, -0.5F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2095F, -3.6029F, 0.1561F, 1.0311F, -1.2152F));

		PartDefinition Box_r120 = neck2.addOrReplaceChild("Box_r120", CubeListBuilder.create().texOffs(81, 77).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2095F, -3.6029F, 0.776F, -0.7796F, 0.4475F));

		PartDefinition Box_r121 = neck2.addOrReplaceChild("Box_r121", CubeListBuilder.create().texOffs(57, 53).addBox(0.866F, -0.5F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2095F, -3.6029F, 0.1561F, -1.0311F, 1.2152F));

		PartDefinition Box_r122 = neck2.addOrReplaceChild("Box_r122", CubeListBuilder.create().texOffs(83, 25).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2905F, -1.6029F, 0.9328F, -0.7326F, 0.3435F));

		PartDefinition Box_r123 = neck2.addOrReplaceChild("Box_r123", CubeListBuilder.create().texOffs(9, 61).addBox(0.866F, -0.5F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2905F, -1.6029F, 0.3915F, -1.0713F, 1.0144F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4095F, -4.8029F, 0.4446F, 0.2496F, 0.08F));

		PartDefinition Box_r124 = neck3.addOrReplaceChild("Box_r124", CubeListBuilder.create().texOffs(79, 84).addBox(0.0F, -1.4F, 2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 84).addBox(0.0F, -1.4F, 0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 33).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -1.2874F, -3.2898F, -0.3142F, 0.0F, 0.0F));

		PartDefinition Box_r125 = neck3.addOrReplaceChild("Box_r125", CubeListBuilder.create().texOffs(78, 70).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1874F, -0.9898F, 0.2661F, 0.8016F, -1.0669F));

		PartDefinition Box_r126 = neck3.addOrReplaceChild("Box_r126", CubeListBuilder.create().texOffs(78, 60).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6874F, -2.5898F, 0.2308F, 0.8102F, -1.1158F));

		PartDefinition Box_r127 = neck3.addOrReplaceChild("Box_r127", CubeListBuilder.create().texOffs(78, 60).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6874F, -2.5898F, 0.2308F, -0.8102F, 1.1158F));

		PartDefinition Box_r128 = neck3.addOrReplaceChild("Box_r128", CubeListBuilder.create().texOffs(78, 70).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1874F, -0.9898F, 0.2661F, -0.8016F, 1.0669F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8874F, -3.1898F, -0.3478F, 0.1719F, 0.0304F));

		PartDefinition Box_r129 = head.addOrReplaceChild("Box_r129", CubeListBuilder.create().texOffs(7, 18).mirror().addBox(-0.5F, -0.0343F, -2.0659F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(7, 18).addBox(3.5F, -0.0343F, -2.0659F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.0F, 1.1278F, 0.5199F, -1.3614F, 0.0F, 0.0F));

		PartDefinition Box_r130 = head.addOrReplaceChild("Box_r130", CubeListBuilder.create().texOffs(60, 15).mirror().addBox(-0.5F, -0.0757F, -1.9314F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 15).addBox(3.5F, -0.0757F, -1.9314F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 2.1278F, 1.1199F, -0.9948F, 0.0F, 0.0F));

		PartDefinition head2 = head.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1278F, 0.0199F));

		PartDefinition Box_r131 = head2.addOrReplaceChild("Box_r131", CubeListBuilder.create().texOffs(12, 49).addBox(-2.5F, -0.017F, -1.0766F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1F, -3.7F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Box_r132 = head2.addOrReplaceChild("Box_r132", CubeListBuilder.create().texOffs(49, 21).addBox(-2.5F, -0.0072F, -3.997F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7F, 0.2F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Box_r133 = head2.addOrReplaceChild("Box_r133", CubeListBuilder.create().texOffs(77, 34).mirror().addBox(-0.94F, -0.3F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(77, 34).addBox(0.14F, -0.3F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -0.2529F, -11.0075F, 0.2967F, 0.0F, 0.0F));

		PartDefinition Box_r134 = head2.addOrReplaceChild("Box_r134", CubeListBuilder.create().texOffs(21, 77).mirror().addBox(-2.6F, -0.1089F, -0.0419F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(21, 77).addBox(-0.4F, -0.1089F, -0.0419F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5F, -7.8F, 0.5411F, 0.0F, 0.0F));

		PartDefinition Box_r135 = head2.addOrReplaceChild("Box_r135", CubeListBuilder.create().texOffs(0, 82).mirror().addBox(-2.6F, -0.0385F, -0.174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(0, 82).addBox(-0.4F, -0.0385F, -0.174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, -1.6F, -6.0F, 0.2443F, 0.0F, 0.0F));

		PartDefinition Box_r136 = head2.addOrReplaceChild("Box_r136", CubeListBuilder.create().texOffs(77, 81).mirror().addBox(-2.6F, 0.962F, -0.6986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(79, 41).mirror().addBox(-2.6F, -0.038F, 0.0014F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(77, 81).addBox(-0.4F, 0.962F, -0.6986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(79, 41).addBox(-0.4F, -0.038F, 0.0014F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.0F, -1.8F, -5.2F, -0.3316F, 0.0F, 0.0F));

		PartDefinition Box_r137 = head2.addOrReplaceChild("Box_r137", CubeListBuilder.create().texOffs(72, 70).mirror().addBox(-2.6F, -1.4F, -8.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(66, 79).mirror().addBox(-3.52F, -2.5F, -4.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 56).mirror().addBox(-3.52F, -2.4F, -2.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 56).addBox(0.52F, -2.4F, -2.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 70).addBox(-0.4F, -1.4F, -8.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F))
				.texOffs(66, 79).addBox(0.52F, -2.5F, -4.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 0).addBox(-3.5F, -2.0F, -5.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0F, 1.9F, 0.0F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Box_r138 = head2.addOrReplaceChild("Box_r138", CubeListBuilder.create().texOffs(59, 58).mirror().addBox(-2.62F, -2.0402F, -1.0049F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(59, 58).addBox(1.42F, -2.0402F, -1.0049F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1F, 1.0F, -3.1F, -0.4538F, 0.0F, 0.0F));

		PartDefinition Box_r139 = head2.addOrReplaceChild("Box_r139", CubeListBuilder.create().texOffs(81, 45).mirror().addBox(-2.62F, -0.938F, -0.9809F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(81, 45).addBox(1.42F, -0.938F, -0.9809F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9F, -2.2F, 0.5934F, 0.0F, 0.0F));

		PartDefinition Box_r140 = head2.addOrReplaceChild("Box_r140", CubeListBuilder.create().texOffs(13, 81).mirror().addBox(-2.82F, -0.7951F, -1.4138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(18, 81).mirror().addBox(-2.6F, -0.7951F, -1.4138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(23, 81).mirror().addBox(-2.52F, -0.9951F, -1.0138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(13, 81).addBox(1.82F, -0.7951F, -1.4138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(18, 81).addBox(1.6F, -0.7951F, -1.4138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 81).addBox(1.52F, -0.9951F, -1.0138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.7F, -2.7F, 1.4137F, 0.0F, 0.0F));

		PartDefinition Box_r141 = head2.addOrReplaceChild("Box_r141", CubeListBuilder.create().texOffs(47, 81).mirror().addBox(-2.62F, -0.9907F, 0.3573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(81, 72).mirror().addBox(-2.62F, -0.9907F, -0.0427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(47, 81).addBox(1.42F, -0.9907F, 0.3573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 72).addBox(1.42F, -0.9907F, -0.0427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1F, -0.8F, -1.9F, -0.6283F, 0.0F, 0.0F));

		PartDefinition Box_r142 = head2.addOrReplaceChild("Box_r142", CubeListBuilder.create().texOffs(7, 67).mirror().addBox(-2.62F, -2.2327F, -1.0324F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(7, 67).addBox(1.42F, -2.2327F, -1.0324F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1F, 1.4F, -0.2F, 0.1571F, 0.0F, 0.0F));

		PartDefinition headsep = head2.addOrReplaceChild("headsep", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, -7.8F, 0.0859F, 0.0F, 0.0F));

		PartDefinition Box_r143 = headsep.addOrReplaceChild("Box_r143", CubeListBuilder.create().texOffs(19, 72).addBox(-1.5F, -2.1F, -0.3F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, 2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Box_r144 = headsep.addOrReplaceChild("Box_r144", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -2.0F, -4.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, 2.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition head3 = headsep.addOrReplaceChild("head3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -2.9F, 0.488F, 0.0F, 0.0F));

		PartDefinition Box_r145 = head3.addOrReplaceChild("Box_r145", CubeListBuilder.create().texOffs(74, 21).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.3F, -0.2F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Box_r146 = head3.addOrReplaceChild("Box_r146", CubeListBuilder.create().texOffs(0, 78).addBox(-1.0F, -0.0423F, -0.9548F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.5F, -3.1F, 1.117F, 0.0F, 0.0F));

		PartDefinition Box_r147 = head3.addOrReplaceChild("Box_r147", CubeListBuilder.create().texOffs(78, 10).addBox(-1.0F, -0.066F, -0.9985F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.2F, -2.1F, 0.3142F, 0.0F, 0.0F));

		PartDefinition head5 = headsep.addOrReplaceChild("head5", CubeListBuilder.create().texOffs(78, 5).addBox(-1.0F, -1.9F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -3.0F, -0.2405F, 0.0F, 0.0F));

		PartDefinition Box_r148 = head5.addOrReplaceChild("Box_r148", CubeListBuilder.create().texOffs(0, 73).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.8F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Tteeth2 = head5.addOrReplaceChild("Tteeth2", CubeListBuilder.create().texOffs(30, 73).addBox(-0.5F, -0.8F, 0.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.3F, -2.8F));

		PartDefinition Tteeth1 = headsep.addOrReplaceChild("Tteeth1", CubeListBuilder.create(), PartPose.offset(0.0F, 1.9F, -3.0F));

		PartDefinition Box_r149 = Tteeth1.addOrReplaceChild("Box_r149", CubeListBuilder.create().texOffs(0, 61).addBox(-1.0F, -0.2F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 1.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition head6 = headsep.addOrReplaceChild("head6", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition Box_r150 = head6.addOrReplaceChild("Box_r150", CubeListBuilder.create().texOffs(67, 53).addBox(-1.0F, 0.0037F, -2.9618F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Box_r151 = head6.addOrReplaceChild("Box_r151", CubeListBuilder.create().texOffs(60, 8).addBox(-1.0F, 0.0001F, -0.707F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Rcrest = headsep.addOrReplaceChild("Rcrest", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -1.5F, -1.9F, 0.0681F, 0.1634F, 0.0F));

		PartDefinition Box_r152 = Rcrest.addOrReplaceChild("Box_r152", CubeListBuilder.create().texOffs(30, 67).addBox(-0.5F, -0.4F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4229F, -0.0045F, 2.5654F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Rcrest2 = Rcrest.addOrReplaceChild("Rcrest2", CubeListBuilder.create().texOffs(76, 77).addBox(-0.8878F, -0.3323F, 0.1276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0229F, -0.2045F, 3.4654F, -0.0618F, 0.411F, 0.0F));

		PartDefinition Rcrest3 = headsep.addOrReplaceChild("Rcrest3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -1.5F, -1.9F, 0.0681F, -0.1634F, 0.0F));

		PartDefinition Box_r153 = Rcrest3.addOrReplaceChild("Box_r153", CubeListBuilder.create().texOffs(30, 67).mirror().addBox(-0.5F, -0.4F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4229F, -0.0045F, 2.5654F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Rcrest4 = Rcrest3.addOrReplaceChild("Rcrest4", CubeListBuilder.create().texOffs(76, 77).mirror().addBox(-0.1122F, -0.3323F, 0.1276F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0229F, -0.2045F, 3.4654F, -0.0618F, -0.411F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(67, 24).addBox(1.5017F, -0.2945F, -3.4795F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F))
				.texOffs(67, 24).mirror().addBox(-2.5017F, -0.2945F, -3.4795F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.4278F, 1.0199F, 0.5672F, 0.0017F, 0.0F));

		PartDefinition Box_r154 = jaw.addOrReplaceChild("Box_r154", CubeListBuilder.create().texOffs(73, 71).mirror().addBox(-1.4F, -0.4F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(73, 71).addBox(2.6F, -0.4F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.1F, 1.0206F, -3.8252F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Box_r155 = jaw.addOrReplaceChild("Box_r155", CubeListBuilder.create().texOffs(26, 66).mirror().addBox(-2.5F, 0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)).mirror(false)
				.texOffs(0, 67).mirror().addBox(-2.5F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(26, 66).addBox(1.5035F, 0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F))
				.texOffs(0, 67).addBox(1.5035F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0018F, -0.2945F, -3.4795F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Box_r156 = jaw.addOrReplaceChild("Box_r156", CubeListBuilder.create().texOffs(32, 56).mirror().addBox(-2.5F, -1.994F, -1.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.0018F, 2.4055F, -4.0795F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Box_r157 = jaw.addOrReplaceChild("Box_r157", CubeListBuilder.create().texOffs(59, 58).mirror().addBox(-2.5F, -0.5F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.03F)).mirror(false)
				.texOffs(59, 58).addBox(1.5035F, -0.5F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-0.0018F, 0.2055F, 0.5205F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Box_r158 = jaw.addOrReplaceChild("Box_r158", CubeListBuilder.create().texOffs(32, 56).addBox(1.5F, -1.994F, -1.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0018F, 2.4055F, -4.0795F, -0.2618F, 0.0F, 0.0F));

		PartDefinition jaw2 = jaw.addOrReplaceChild("jaw2", CubeListBuilder.create().texOffs(44, 45).addBox(0.5F, -0.8F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F))
				.texOffs(44, 45).mirror().addBox(-1.5035F, -0.8F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0018F, 0.3055F, -5.3295F, 0.0782F, 0.0F, 0.0F));

		PartDefinition Box_r159 = jaw2.addOrReplaceChild("Box_r159", CubeListBuilder.create().texOffs(7, 76).mirror().addBox(-1.5F, 0.0F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(7, 76).addBox(0.5035F, 0.0F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0035F, -0.8F, -3.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Box_r160 = jaw2.addOrReplaceChild("Box_r160", CubeListBuilder.create().texOffs(71, 75).mirror().addBox(-1.5F, 0.0004F, -1.8974F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(71, 75).addBox(0.5035F, 0.0004F, -1.8974F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0035F, -0.9F, -4.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition jaw3 = jaw2.addOrReplaceChild("jaw3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -1.1F, -0.1955F, 0.0F, 0.0F));

		PartDefinition Box_r161 = jaw3.addOrReplaceChild("Box_r161", CubeListBuilder.create().texOffs(72, 5).mirror().addBox(-1.5F, -1.0054F, -2.9163F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.025F)).mirror(false)
				.texOffs(72, 5).addBox(0.5035F, -1.0054F, -2.9163F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.025F)), PartPose.offsetAndRotation(-0.0035F, 1.4F, -2.7F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Box_r162 = jaw3.addOrReplaceChild("Box_r162", CubeListBuilder.create().texOffs(56, 76).mirror().addBox(-1.5F, -0.9351F, -1.9178F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(56, 76).addBox(0.5035F, -0.9351F, -1.9178F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.0035F, 1.3F, -1.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Box_r163 = jaw3.addOrReplaceChild("Box_r163", CubeListBuilder.create().texOffs(72, 59).mirror().addBox(-1.5F, -0.9601F, -1.9577F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.025F)).mirror(false)
				.texOffs(72, 59).addBox(0.5035F, -0.9601F, -1.9577F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.025F)), PartPose.offsetAndRotation(-0.0035F, 1.6F, 0.1F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Box_r164 = jaw3.addOrReplaceChild("Box_r164", CubeListBuilder.create().texOffs(14, 77).mirror().addBox(-1.5F, -1.5F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(14, 77).addBox(0.5035F, -1.5F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.0035F, 1.9F, 1.1F, -0.1571F, 0.0F, 0.0F));

		PartDefinition jaw4 = jaw2.addOrReplaceChild("jaw4", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, -5.9F));

		PartDefinition Box_r165 = jaw4.addOrReplaceChild("Box_r165", CubeListBuilder.create().texOffs(67, 59).addBox(-1.0F, -1.0314F, -0.3736F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.0F, 1.1F, -1.5F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Box_r166 = jaw4.addOrReplaceChild("Box_r166", CubeListBuilder.create().texOffs(77, 38).addBox(-1.0F, 0.6698F, -1.4988F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(78, 0).addBox(-1.0F, 0.0698F, 0.0012F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.3F, -0.4F, -0.3665F, 0.0F, 0.0F));

		PartDefinition Box_r167 = jaw4.addOrReplaceChild("Box_r167", CubeListBuilder.create().texOffs(73, 30).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -2.4F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bteeth2 = jaw4.addOrReplaceChild("Bteeth2", CubeListBuilder.create().texOffs(76, 46).addBox(-0.5F, 0.0F, 0.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.8F, -3.0F));

		PartDefinition Bteeth1 = jaw2.addOrReplaceChild("Bteeth1", CubeListBuilder.create(), PartPose.offset(0.5F, -1.7F, -5.99F));

		PartDefinition Box_r168 = Bteeth1.addOrReplaceChild("Box_r168", CubeListBuilder.create().texOffs(70, 0).addBox(-1.0F, -0.8F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.8F, -0.05F, -0.1047F, 0.0F, 0.0F));

		PartDefinition masseter = jaw.addOrReplaceChild("masseter", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0018F, -2.1945F, -0.1795F, -0.3519F, 0.0F, 0.0F));

		PartDefinition throat = neck3.addOrReplaceChild("throat", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.2126F, -1.6898F, -0.0782F, 0.0F, 0.0F));

		PartDefinition leftArm3 = chest.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(51, 73).addBox(-0.5F, -0.8F, -0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 8.5123F, -6.82F, 1.0482F, 0.0F, -0.1564F));

		PartDefinition Box_r169 = leftArm3.addOrReplaceChild("Box_r169", CubeListBuilder.create().texOffs(36, 73).addBox(-0.5F, 0.4F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.7F, -0.6F, -0.3142F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm3.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(75, 64).addBox(-0.6F, 0.2343F, 0.0445F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(75, 50).addBox(-0.6F, 0.5343F, -0.9555F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1F, 5.0F, 0.0F, -1.2919F, 0.0F, 0.0F));

		PartDefinition leftArm = leftArm2.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(59, 28).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 4.2343F, -0.2555F, 0.1017F, -0.0369F, 0.5427F));

		PartDefinition rightArm3 = chest.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(46, 73).addBox(-0.5F, -0.8F, -0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 8.5123F, -6.82F, 0.7428F, 0.0F, 0.1564F));

		PartDefinition Box_r170 = rightArm3.addOrReplaceChild("Box_r170", CubeListBuilder.create().texOffs(12, 53).addBox(-0.5F, 0.4F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.7F, -0.6F, -0.3142F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm3.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(66, 73).addBox(-0.4F, 0.2343F, 0.0445F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(41, 58).addBox(-0.4F, 0.5343F, -0.9555F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1F, 5.0F, 0.0F, -0.8992F, 0.0F, 0.0F));

		PartDefinition rightArm = rightArm2.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 4.2343F, -0.2555F, 0.1032F, 0.0325F, -0.4992F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(44, 45).addBox(-0.5F, -0.66F, -0.0193F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(54, 11).addBox(0.0F, -2.36F, -0.0193F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 21).addBox(0.0F, -2.26F, 1.9807F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 40).addBox(0.0F, -2.16F, 3.9807F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 40).addBox(0.0F, -1.96F, 5.9807F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 18).addBox(0.0F, -1.86F, 7.9807F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9525F, 6.7785F, -0.0926F, 0.1664F, -0.1023F));

		PartDefinition Box_r171 = tail1.addOrReplaceChild("Box_r171", CubeListBuilder.create().texOffs(43, 16).addBox(0.0F, 4.2F, 5.6F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 76).addBox(0.0F, 2.2F, 3.6F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 22).addBox(0.0F, 0.5F, 1.6F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 23).addBox(0.0F, -1.5F, -0.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6071F, 1.9225F, 0.7418F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(34, 16).addBox(-0.5F, -0.9013F, -0.0453F, 1.0F, 2.0F, 12.0F, new CubeDeformation(-0.003F))
				.texOffs(5, 82).addBox(0.0F, -2.0013F, -0.0453F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 81).addBox(0.0F, -2.0013F, 1.9547F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 67).addBox(0.0F, -2.0013F, 3.9547F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 67).addBox(0.0F, -2.0013F, 5.9547F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 66).addBox(0.0F, -2.0013F, 7.9547F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 61).addBox(0.0F, -2.0013F, 9.9547F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.24F, 9.9807F, 0.1056F, 0.1302F, 0.0138F));

		PartDefinition Box_r172 = tail2.addOrReplaceChild("Box_r172", CubeListBuilder.create().texOffs(38, 80).addBox(0.0F, 3.1F, 7.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 80).addBox(0.0F, 2.5F, 5.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 58).addBox(0.0F, 0.9F, 3.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 67).addBox(0.0F, 0.3F, 1.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 77).addBox(0.0F, -0.6F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8334F, 2.4193F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(18, 18).addBox(-0.5F, -0.5024F, -0.0848F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(61, 82).addBox(0.0F, -1.7024F, -0.0848F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 82).addBox(0.0F, -1.7024F, 1.9152F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 31).addBox(0.0F, -1.8024F, 3.9152F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 82).addBox(0.0F, -1.8024F, 5.9152F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 82).addBox(0.0F, -1.7024F, 7.9152F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 7).addBox(0.0F, -1.5024F, 9.9152F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 7).addBox(0.0F, -1.5024F, 11.9152F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4013F, 11.6547F, 0.0769F, 0.2119F, 0.1016F));

		PartDefinition Box_r173 = tail3.addOrReplaceChild("Box_r173", CubeListBuilder.create().texOffs(82, 80).addBox(0.0F, 9.9F, 19.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 83).addBox(0.0F, 8.6F, 17.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 21).addBox(0.0F, 7.6F, 15.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 83).addBox(0.0F, 6.5F, 13.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 48).addBox(0.0F, 5.7F, 11.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 79).addBox(0.0F, 3.7F, 9.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2347F, -9.2353F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.4376F, -0.2428F, 1.0F, 1.0F, 16.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.1024F, 13.0152F, -0.1781F, 0.344F, -0.0606F));

		PartDefinition Box_r174 = tail4.addOrReplaceChild("Box_r174", CubeListBuilder.create().texOffs(44, 45).addBox(0.0F, -0.5F, 7.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 45).addBox(0.0F, -0.5F, 11.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 52).addBox(0.0F, -0.5F, 9.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 61).addBox(0.0F, -0.5F, 5.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 61).addBox(0.0F, -0.5F, 3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 53).addBox(0.0F, -0.5F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 25).addBox(0.0F, -0.5F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9376F, 0.8572F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Box_r175 = tail4.addOrReplaceChild("Box_r175", CubeListBuilder.create().texOffs(70, 0).addBox(0.0F, 17.4F, 31.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 73).addBox(0.0F, 16.0F, 29.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 73).addBox(0.0F, 14.8F, 27.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 84).addBox(0.0F, 13.7F, 25.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 84).addBox(0.0F, 12.7F, 23.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 84).addBox(0.0F, 11.6F, 21.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3371F, -22.2505F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -0.3687F, -0.0381F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0376F, 15.3572F, -0.2702F, -0.2527F, 0.0691F));

		PartDefinition leftLeg4 = hips.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8027F, 1.9475F, 0.3739F, -0.785F, 0.0F, 0.0F));

		PartDefinition Box_r176 = leftLeg4.addOrReplaceChild("Box_r176", CubeListBuilder.create().texOffs(66, 65).addBox(-1.5F, -0.0616F, -0.0759F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5471F, 6.9298F, -1.604F, 0.2356F, 0.0F, 0.0F));

		PartDefinition Box_r177 = leftLeg4.addOrReplaceChild("Box_r177", CubeListBuilder.create().texOffs(0, 35).addBox(-1.5F, -4.0F, -1.4F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5471F, 2.9298F, -0.104F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg4.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(12, 66).addBox(-2.0F, 3.8046F, 0.399F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 13).addBox(-2.0F, -0.1954F, -0.301F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(54, 58).addBox(0.5F, -0.1954F, 0.299F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0471F, 11.9298F, 0.696F, 1.2645F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(19, 0).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.9046F, 1.699F, -1.7448F, 0.0F, 0.0F));

		PartDefinition leftLeg = leftLeg3.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(17, 45).addBox(-2.5F, -1.3584F, -7.1452F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.9F, -0.5F, 2.0009F, -0.0211F, -0.0578F));

		PartDefinition rightLeg4 = hips.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8186F, 1.6874F, 0.3974F, -0.093F, 0.0F, 0.0F));

		PartDefinition Box_r178 = rightLeg4.addOrReplaceChild("Box_r178", CubeListBuilder.create().texOffs(0, 49).addBox(-0.5F, -0.0616F, -0.0759F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5471F, 6.9298F, -1.604F, 0.2356F, 0.0F, 0.0F));

		PartDefinition Box_r179 = rightLeg4.addOrReplaceChild("Box_r179", CubeListBuilder.create().texOffs(34, 16).addBox(-0.5F, -4.0F, -1.4F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5471F, 2.9298F, -0.104F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg4.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(59, 65).addBox(0.0F, 3.8046F, 0.399F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 39).addBox(0.0F, -0.1954F, -0.301F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(49, 58).addBox(-1.5F, -0.1954F, 0.299F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0471F, 11.9298F, 0.696F, 0.7036F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(18, 18).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.9046F, 1.699F, -0.9592F, 0.0F, 0.0F));

		PartDefinition rightLeg = rightLeg3.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(35, 0).addBox(-2.5F, -1.3584F, -7.1452F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.9F, -0.5F, 0.3906F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 90, 90);
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