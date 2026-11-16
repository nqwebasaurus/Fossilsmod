package fossils.fossils.client.blockentity.model.cartorhynchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CartorhynchusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Cartorhynchus;
	private final ModelPart Body1;
	private final ModelPart Body2;
	private final ModelPart HindlimbL3;
	private final ModelPart HindlimbL4;
	private final ModelPart HindlimbL5;
	private final ModelPart HindlimbL6;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart body;
	private final ModelPart body12;
	private final ModelPart Body3;
	private final ModelPart body13;
	private final ModelPart Body10;
	private final ModelPart body14;
	private final ModelPart Body11;
	private final ModelPart Body4;
	private final ModelPart tail;
	private final ModelPart Body5;
	private final ModelPart Body6;
	private final ModelPart Body7;
	private final ModelPart Body8;
	private final ModelPart Body15;
	private final ModelPart Body16;
	private final ModelPart Body17;
	private final ModelPart Body18;
	private final ModelPart Body9;
	private final ModelPart Body19;
	private final ModelPart Body20;
	private final ModelPart Body21;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart HindlimbL;
	private final ModelPart HindlimbL2;
	private final ModelPart HindlimbL7;
	private final ModelPart HindlimbL8;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;

	public CartorhynchusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Cartorhynchus = this.fossil.getChild("Cartorhynchus");
		this.Body1 = this.Cartorhynchus.getChild("Body1");
		this.Body2 = this.Body1.getChild("Body2");
		this.HindlimbL3 = this.Body2.getChild("HindlimbL3");
		this.HindlimbL4 = this.HindlimbL3.getChild("HindlimbL4");
		this.HindlimbL5 = this.Body2.getChild("HindlimbL5");
		this.HindlimbL6 = this.HindlimbL5.getChild("HindlimbL6");
		this.bone2 = this.Body2.getChild("bone2");
		this.bone3 = this.Body2.getChild("bone3");
		this.body = this.Body2.getChild("body");
		this.body12 = this.body.getChild("body12");
		this.Body3 = this.body12.getChild("Body3");
		this.body13 = this.Body3.getChild("body13");
		this.Body10 = this.body13.getChild("Body10");
		this.body14 = this.Body10.getChild("body14");
		this.Body11 = this.body14.getChild("Body11");
		this.Body4 = this.Body11.getChild("Body4");
		this.tail = this.Body4.getChild("tail");
		this.Body5 = this.tail.getChild("Body5");
		this.Body6 = this.Body5.getChild("Body6");
		this.Body7 = this.Body6.getChild("Body7");
		this.Body8 = this.Body7.getChild("Body8");
		this.Body15 = this.Body8.getChild("Body15");
		this.Body16 = this.Body15.getChild("Body16");
		this.Body17 = this.Body16.getChild("Body17");
		this.Body18 = this.Body17.getChild("Body18");
		this.Body9 = this.Body18.getChild("Body9");
		this.Body19 = this.Body9.getChild("Body19");
		this.Body20 = this.Body19.getChild("Body20");
		this.Body21 = this.Body20.getChild("Body21");
		this.bone = this.Body4.getChild("bone");
		this.bone4 = this.Body4.getChild("bone4");
		this.HindlimbL = this.Body4.getChild("HindlimbL");
		this.HindlimbL2 = this.HindlimbL.getChild("HindlimbL2");
		this.HindlimbL7 = this.Body4.getChild("HindlimbL7");
		this.HindlimbL8 = this.HindlimbL7.getChild("HindlimbL8");
		this.Head = this.Cartorhynchus.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Cartorhynchus = fossil.addOrReplaceChild("Cartorhynchus", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.1306F, 1.6799F, 0.3002F, -0.0298F, 0.3478F));

		PartDefinition Body1 = Cartorhynchus.addOrReplaceChild("Body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0693F, -17.3373F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Body1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(36, 108).addBox(0.0F, -0.941F, 0.0015F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6693F, 1.7623F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Body1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(109, 41).addBox(0.0F, -0.849F, 0.0263F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0307F, -0.1377F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Body1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(38, 38).addBox(-0.5F, -0.5F, -4.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, -0.4693F, 2.2623F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Body1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(88, 87).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4534F, 2.4477F, 0.6849F, 0.3661F, -0.4042F));

		PartDefinition cube_r5 = Body1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(89, 37).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4534F, 2.4477F, 0.4875F, 0.6049F, -0.8196F));

		PartDefinition cube_r6 = Body1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(26, 44).mirror().addBox(-5.9916F, -2.5101F, -0.4853F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4534F, 2.4477F, 0.1085F, 0.7509F, -1.4116F));

		PartDefinition cube_r7 = Body1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(60, 95).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2466F, 0.6477F, 0.1099F, 0.7423F, -1.1243F));

		PartDefinition cube_r8 = Body1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(53, 95).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2466F, 0.6477F, 0.4596F, 0.6235F, -0.5793F));

		PartDefinition cube_r9 = Body1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(53, 95).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2466F, 0.6477F, 0.4596F, -0.6235F, 0.5793F));

		PartDefinition cube_r10 = Body1.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(60, 95).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2466F, 0.6477F, 0.1099F, -0.7423F, 1.1243F));

		PartDefinition cube_r11 = Body1.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(26, 44).addBox(2.9916F, -2.5101F, -0.4853F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4534F, 2.4477F, 0.1085F, -0.7509F, 1.4116F));

		PartDefinition cube_r12 = Body1.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(89, 37).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4534F, 2.4477F, 0.4875F, -0.6049F, 0.8196F));

		PartDefinition cube_r13 = Body1.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(88, 87).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4534F, 2.4477F, 0.6849F, -0.3661F, 0.4042F));

		PartDefinition Body2 = Body1.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.626F, 3.6368F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r14 = Body2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(89, 39).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8273F, 2.4109F, 0.4309F, 0.4132F, -0.7412F));

		PartDefinition cube_r15 = Body2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(40, 29).mirror().addBox(-10.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8273F, 2.4109F, 0.1829F, 0.5619F, -1.2599F));

		PartDefinition cube_r16 = Body2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(89, 53).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8273F, 2.4109F, 0.5579F, 0.21F, -0.3343F));

		PartDefinition cube_r17 = Body2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(89, 55).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4273F, 0.4109F, 0.5431F, 0.2511F, -0.3385F));

		PartDefinition cube_r18 = Body2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(57, 89).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4273F, 0.4109F, 0.3983F, 0.4452F, -0.7555F));

		PartDefinition cube_r19 = Body2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(52, 0).mirror().addBox(-8.9916F, -2.5101F, -0.4852F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4273F, 0.4109F, 0.1334F, 0.5747F, -1.2873F));

		PartDefinition cube_r20 = Body2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(52, 0).addBox(2.9916F, -2.5101F, -0.4852F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4273F, 0.4109F, 0.1334F, -0.5747F, 1.2873F));

		PartDefinition cube_r21 = Body2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(57, 89).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4273F, 0.4109F, 0.3983F, -0.4452F, 0.7555F));

		PartDefinition cube_r22 = Body2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(89, 55).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4273F, 0.4109F, 0.5431F, -0.2511F, 0.3385F));

		PartDefinition cube_r23 = Body2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(89, 53).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8273F, 2.4109F, 0.5579F, -0.21F, 0.3343F));

		PartDefinition cube_r24 = Body2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(40, 29).addBox(2.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8273F, 2.4109F, 0.1829F, -0.5619F, 1.2599F));

		PartDefinition cube_r25 = Body2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(89, 39).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8273F, 2.4109F, 0.4309F, -0.4132F, 0.7412F));

		PartDefinition cube_r26 = Body2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(67, 0).addBox(-0.5F, 2.2F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 6.1066F, 1.3264F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r27 = Body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(107, 67).addBox(-1.0F, -1.4245F, 0.0355F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2432F, 1.7005F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r28 = Body2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(65, 107).addBox(-1.0F, -1.15F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.7432F, -0.1995F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r29 = Body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(67, 68).addBox(-1.5F, -0.05F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.7432F, -0.1995F, 0.2443F, 0.0F, 0.0F));

		PartDefinition HindlimbL3 = Body2.addOrReplaceChild("HindlimbL3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8067F, 8.4022F, 2.3403F, 0.5341F, -0.431F, -0.1594F));

		PartDefinition cube_r30 = HindlimbL3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(40, 83).addBox(-0.7F, -0.5F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.4981F, 1.1602F, 0.3501F, 0.0F, -1.021F, 0.6109F));

		PartDefinition cube_r31 = HindlimbL3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(92, 95).addBox(0.0F, -0.5F, 0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(21, 85).addBox(0.0F, -0.5F, 0.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.5003F, 2.5598F, -0.67F, -3.1416F, -0.5236F, -2.5307F));

		PartDefinition cube_r32 = HindlimbL3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(35, 105).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.6233F, 2.6459F, 0.3062F, 0.0F, -0.6545F, 0.6109F));

		PartDefinition cube_r33 = HindlimbL3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(78, 98).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.481F, 2.5463F, -0.6786F, 0.0F, -1.3963F, 0.6109F));

		PartDefinition cube_r34 = HindlimbL3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(82, 37).addBox(-0.9F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3673F, 1.7664F, 0.4584F, -3.1416F, -1.4835F, -2.5307F));

		PartDefinition cube_r35 = HindlimbL3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(74, 73).addBox(-1.7F, -0.5F, -0.775F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.6143F, 1.2416F, -1.132F, 3.1416F, -0.3491F, -2.5307F));

		PartDefinition cube_r36 = HindlimbL3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(59, 86).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.8666F, 0.1077F, -1.155F, 0.0F, 1.3963F, 0.6109F));

		PartDefinition cube_r37 = HindlimbL3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(15, 105).addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(10, 105).addBox(0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.148F, 0.0076F, 0.318F, 0.0F, -0.829F, 0.6109F));

		PartDefinition cube_r38 = HindlimbL3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(5, 105).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.255F, -0.0673F, -0.6734F, 0.0F, 0.1309F, 0.6109F));

		PartDefinition cube_r39 = HindlimbL3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(105, 32).addBox(0.0F, 0.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2391F, -0.3317F, -0.5122F, 0.0F, 1.0036F, 0.6109F));

		PartDefinition HindlimbL4 = HindlimbL3.addOrReplaceChild("HindlimbL4", CubeListBuilder.create(), PartPose.offset(8.3077F, 5.8284F, -1.4122F));

		PartDefinition cube_r40 = HindlimbL4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(82, 57).addBox(-0.2F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-2.0289F, -1.2673F, -0.9571F, 0.7523F, -1.3884F, -0.1686F));

		PartDefinition cube_r41 = HindlimbL4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(82, 53).addBox(-0.2F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.2203F, -1.3069F, -1.5244F, 0.3905F, -1.239F, 0.2043F));

		PartDefinition cube_r42 = HindlimbL4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(28, 85).addBox(-0.2F, -0.5F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-2.5261F, -1.4306F, -2.0256F, 2.9942F, -0.5653F, -2.4868F));

		PartDefinition cube_r43 = HindlimbL4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(81, 8).addBox(-0.5F, -0.5F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-2.8295F, -1.624F, -2.0483F, 2.9857F, 0.6456F, -2.6605F));

		PartDefinition cube_r44 = HindlimbL4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(72, 10).addBox(-1.55F, -0.5F, -1.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-3.6348F, -2.4275F, -0.161F, 0.3905F, -1.239F, 0.2043F));

		PartDefinition cube_r45 = HindlimbL4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(25, 105).addBox(-0.2F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-4.9968F, -3.182F, -1.0265F, 0.3529F, 1.2039F, 0.9066F));

		PartDefinition cube_r46 = HindlimbL4.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(105, 24).addBox(-0.2F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-4.9768F, -3.2576F, -0.4316F, 0.1244F, -0.0403F, 0.5704F));

		PartDefinition cube_r47 = HindlimbL4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(20, 105).addBox(-0.8F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-4.7454F, -3.1893F, 0.1178F, 0.3135F, -1.157F, 0.2869F));

		PartDefinition cube_r48 = HindlimbL4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 87).addBox(-1.475F, -0.5F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(0, 96).addBox(-0.475F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-4.1104F, -2.7624F, 0.0168F, 2.7444F, -1.2445F, -2.188F));

		PartDefinition cube_r49 = HindlimbL4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(79, 41).addBox(0.4F, -0.5F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F))
				.texOffs(79, 33).addBox(-0.2F, -0.5F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.0974F, -0.7684F, 0.5019F, -3.1416F, 0.2618F, -2.5307F));

		PartDefinition cube_r50 = HindlimbL4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(40, 101).addBox(-0.8F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2037F, -0.8429F, -0.0839F, -3.1416F, 1.3526F, -2.5307F));

		PartDefinition cube_r51 = HindlimbL4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(86, 12).addBox(-1.8F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-1.6397F, -1.1481F, -0.361F, 0.0F, 1.0908F, 0.6109F));

		PartDefinition cube_r52 = HindlimbL4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(85, 80).addBox(0.05F, -0.5F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-2.7636F, -1.9351F, 0.9049F, 0.0F, 0.6109F, 0.6109F));

		PartDefinition cube_r53 = HindlimbL4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(70, 26).addBox(-0.2F, -0.5F, -2.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-2.9945F, -2.0968F, 2.6715F, 0.0F, 0.3054F, 0.6109F));

		PartDefinition cube_r54 = HindlimbL4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(106, 27).addBox(-0.2F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.4785F, -2.4357F, 2.7756F, -3.1416F, 1.3963F, -2.5307F));

		PartDefinition cube_r55 = HindlimbL4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(105, 105).addBox(-0.8F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-3.9532F, -2.7681F, 2.6203F, -3.1416F, 0.2618F, -2.5307F));

		PartDefinition cube_r56 = HindlimbL4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(101, 39).addBox(-0.8F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-4.199F, -2.9402F, 2.1007F, -3.1416F, -0.5236F, -2.5307F));

		PartDefinition cube_r57 = HindlimbL4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 72).addBox(-0.6F, -0.5F, -3.075F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-4.8442F, -3.392F, 0.537F, -3.1416F, -1.2217F, -2.5307F));

		PartDefinition cube_r58 = HindlimbL4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 0.0F, -3.3F, 9.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.6109F));

		PartDefinition HindlimbL5 = Body2.addOrReplaceChild("HindlimbL5", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8067F, 8.4022F, 2.3403F, 0.8724F, -0.0901F, -0.0353F));

		PartDefinition cube_r59 = HindlimbL5.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(40, 83).mirror().addBox(-0.3F, -0.5F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4981F, 1.1602F, 0.3501F, 0.0F, 1.021F, -0.6109F));

		PartDefinition cube_r60 = HindlimbL5.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(92, 95).mirror().addBox(-1.0F, -0.5F, 0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(21, 85).mirror().addBox(-2.0F, -0.5F, 0.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.5003F, 2.5598F, -0.67F, -3.1416F, 0.5236F, 2.5307F));

		PartDefinition cube_r61 = HindlimbL5.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(35, 105).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.6233F, 2.6459F, 0.3062F, 0.0F, 0.6545F, -0.6109F));

		PartDefinition cube_r62 = HindlimbL5.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(78, 98).mirror().addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.481F, 2.5463F, -0.6786F, 0.0F, 1.3963F, -0.6109F));

		PartDefinition cube_r63 = HindlimbL5.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(82, 37).mirror().addBox(-0.1F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3673F, 1.7664F, 0.4584F, -3.1416F, 1.4835F, 2.5307F));

		PartDefinition cube_r64 = HindlimbL5.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(74, 73).mirror().addBox(-1.3F, -0.5F, -0.775F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.6143F, 1.2416F, -1.132F, 3.1416F, 0.3491F, 2.5307F));

		PartDefinition cube_r65 = HindlimbL5.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(59, 86).mirror().addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8666F, 0.1077F, -1.155F, 0.0F, -1.3963F, -0.6109F));

		PartDefinition cube_r66 = HindlimbL5.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(15, 105).mirror().addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(10, 105).mirror().addBox(-1.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.148F, 0.0076F, 0.318F, 0.0F, 0.829F, -0.6109F));

		PartDefinition cube_r67 = HindlimbL5.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(5, 105).mirror().addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.255F, -0.0673F, -0.6734F, 0.0F, -0.1309F, -0.6109F));

		PartDefinition cube_r68 = HindlimbL5.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(105, 32).mirror().addBox(-1.0F, 0.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2391F, -0.3317F, -0.5122F, 0.0F, -1.0036F, -0.6109F));

		PartDefinition HindlimbL6 = HindlimbL5.addOrReplaceChild("HindlimbL6", CubeListBuilder.create(), PartPose.offset(-8.3077F, 5.8284F, -1.4122F));

		PartDefinition cube_r69 = HindlimbL6.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(82, 57).mirror().addBox(-0.8F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(2.0289F, -1.2673F, -0.9571F, 0.7523F, 1.3884F, 0.1686F));

		PartDefinition cube_r70 = HindlimbL6.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(82, 53).mirror().addBox(-0.8F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.2203F, -1.3069F, -1.5244F, 0.3905F, 1.239F, -0.2043F));

		PartDefinition cube_r71 = HindlimbL6.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(28, 85).mirror().addBox(-1.8F, -0.5F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(2.5261F, -1.4306F, -2.0256F, 2.9942F, 0.5653F, 2.4868F));

		PartDefinition cube_r72 = HindlimbL6.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(81, 8).mirror().addBox(-0.5F, -0.5F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(2.8295F, -1.624F, -2.0483F, 2.9857F, -0.6456F, 2.6605F));

		PartDefinition cube_r73 = HindlimbL6.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(72, 10).mirror().addBox(-0.45F, -0.5F, -1.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(3.6348F, -2.4275F, -0.161F, 0.3905F, 1.239F, -0.2043F));

		PartDefinition cube_r74 = HindlimbL6.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(25, 105).mirror().addBox(-0.8F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(4.9968F, -3.182F, -1.0265F, 0.3529F, -1.2039F, -0.9066F));

		PartDefinition cube_r75 = HindlimbL6.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(105, 24).mirror().addBox(-0.8F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(4.9768F, -3.2576F, -0.4316F, 0.1244F, 0.0403F, -0.5704F));

		PartDefinition cube_r76 = HindlimbL6.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(20, 105).mirror().addBox(-0.2F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(4.7454F, -3.1893F, 0.1178F, 0.3135F, 1.157F, -0.2869F));

		PartDefinition cube_r77 = HindlimbL6.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(-0.525F, -0.5F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(0, 96).mirror().addBox(-0.525F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(4.1104F, -2.7624F, 0.0168F, 2.7444F, 1.2445F, 2.188F));

		PartDefinition cube_r78 = HindlimbL6.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(79, 41).mirror().addBox(-1.4F, -0.5F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(79, 33).mirror().addBox(-0.8F, -0.5F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.0974F, -0.7684F, 0.5019F, -3.1416F, -0.2618F, 2.5307F));

		PartDefinition cube_r79 = HindlimbL6.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(40, 101).mirror().addBox(-0.2F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2037F, -0.8429F, -0.0839F, -3.1416F, -1.3526F, 2.5307F));

		PartDefinition cube_r80 = HindlimbL6.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(86, 12).mirror().addBox(-0.2F, -0.5F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(1.6397F, -1.1481F, -0.361F, 0.0F, -1.0908F, -0.6109F));

		PartDefinition cube_r81 = HindlimbL6.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(85, 80).mirror().addBox(-2.05F, -0.5F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(2.7636F, -1.9351F, 0.9049F, 0.0F, -0.6109F, -0.6109F));

		PartDefinition cube_r82 = HindlimbL6.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(70, 26).mirror().addBox(-1.8F, -0.5F, -2.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(2.9945F, -2.0968F, 2.6715F, 0.0F, -0.3054F, -0.6109F));

		PartDefinition cube_r83 = HindlimbL6.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(106, 27).mirror().addBox(-0.8F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(3.4785F, -2.4357F, 2.7756F, -3.1416F, -1.3963F, 2.5307F));

		PartDefinition cube_r84 = HindlimbL6.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(105, 105).mirror().addBox(-0.2F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(3.9532F, -2.7681F, 2.6203F, -3.1416F, -0.2618F, 2.5307F));

		PartDefinition cube_r85 = HindlimbL6.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(101, 39).mirror().addBox(-0.2F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(4.199F, -2.9402F, 2.1007F, -3.1416F, 0.5236F, 2.5307F));

		PartDefinition cube_r86 = HindlimbL6.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-1.4F, -0.5F, -3.075F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(4.8442F, -3.392F, 0.537F, -3.1416F, 1.2217F, 2.5307F));

		PartDefinition cube_r87 = HindlimbL6.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-7.5F, 0.0F, -3.3F, 9.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.6109F));

		PartDefinition bone2 = Body2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-1.5F, 6.3181F, 3.8697F));

		PartDefinition cube_r88 = bone2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(61, 18).addBox(1.5689F, 2.0609F, -1.7549F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.3F, 1.7885F, -3.1433F, -0.076F, -0.2576F, -1.1643F));

		PartDefinition cube_r89 = bone2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(0, 67).addBox(-0.3855F, -1.4475F, -2.5285F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.3397F, 2.1196F, -0.9984F, 0.8566F, 0.2793F, 1.5137F));

		PartDefinition cube_r90 = bone2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(32, 74).addBox(-2.2888F, -0.282F, -0.27F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(2.3F, 1.7885F, -3.1433F, -2.9095F, -0.993F, 2.5944F));

		PartDefinition cube_r91 = bone2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(70, 34).addBox(0.1664F, -0.282F, -2.2033F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.3F, 1.7885F, -3.1433F, -0.1303F, -0.2579F, -0.3184F));

		PartDefinition cube_r92 = bone2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(19, 75).addBox(-0.0232F, 0.7182F, -1.0187F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.3397F, 2.1196F, -0.9984F, 2.1752F, -0.1121F, 0.6571F));

		PartDefinition cube_r93 = bone2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(98, 12).addBox(-0.0232F, 0.7413F, -0.0214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3397F, 2.1196F, -0.9984F, 1.128F, -0.1121F, 0.6571F));

		PartDefinition cube_r94 = bone2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(63, 51).addBox(-0.3855F, -1.2587F, -2.2455F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.3397F, 2.1196F, -0.9984F, 1.2057F, 0.2793F, 1.5137F));

		PartDefinition cube_r95 = bone2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(55, 103).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(6.0F, 1.5055F, -0.5282F, -1.5621F, 0.0F, 0.0F));

		PartDefinition cube_r96 = bone2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(64, 78).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(6.0F, 1.6023F, -1.4583F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r97 = bone2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(103, 83).addBox(-0.5F, 0.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(81, 76).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(6.0F, 0.7596F, -1.6314F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r98 = bone2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(101, 36).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(6.0F, -1.3498F, 0.4958F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r99 = bone2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(101, 29).addBox(-0.5F, -1.0F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(100, 86).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(6.0F, -0.0696F, 0.27F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r100 = bone2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(39, 77).addBox(5.5F, 0.3F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.2936F, -1.0224F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r101 = bone2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(66, 58).addBox(-0.5F, -1.3F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -0.9338F, -0.1059F, 1.2479F, 0.0F, 0.0F));

		PartDefinition bone3 = Body2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(1.5F, 6.3181F, 3.8697F));

		PartDefinition cube_r102 = bone3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(61, 18).mirror().addBox(-5.5689F, 2.0609F, -1.7549F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 1.7885F, -3.1433F, -0.076F, 0.2576F, 1.1643F));

		PartDefinition cube_r103 = bone3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-0.6145F, -1.4475F, -2.5285F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.3397F, 2.1196F, -0.9984F, 0.8566F, -0.2793F, -1.5137F));

		PartDefinition cube_r104 = bone3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(32, 74).mirror().addBox(-0.7112F, -0.282F, -0.27F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 1.7885F, -3.1433F, -2.9095F, 0.993F, -2.5944F));

		PartDefinition cube_r105 = bone3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(70, 34).mirror().addBox(-3.1664F, -0.282F, -2.2033F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 1.7885F, -3.1433F, -0.1303F, 0.2579F, 0.3184F));

		PartDefinition cube_r106 = bone3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(19, 75).mirror().addBox(-0.9768F, 0.7182F, -1.0187F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.3397F, 2.1196F, -0.9984F, 2.1752F, 0.1121F, -0.6571F));

		PartDefinition cube_r107 = bone3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(98, 12).mirror().addBox(-0.9768F, 0.7413F, -0.0214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3397F, 2.1196F, -0.9984F, 1.128F, 0.1121F, -0.6571F));

		PartDefinition cube_r108 = bone3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(63, 51).mirror().addBox(-0.6145F, -1.2587F, -2.2455F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.3397F, 2.1196F, -0.9984F, 1.2057F, -0.2793F, -1.5137F));

		PartDefinition cube_r109 = bone3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(55, 103).mirror().addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 1.5055F, -0.5282F, -1.5621F, 0.0F, 0.0F));

		PartDefinition cube_r110 = bone3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(64, 78).mirror().addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 1.6023F, -1.4583F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r111 = bone3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(103, 83).mirror().addBox(-0.5F, 0.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(81, 76).mirror().addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 0.7596F, -1.6314F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r112 = bone3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(101, 36).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-6.0F, -1.3498F, 0.4958F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r113 = bone3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(101, 29).mirror().addBox(-0.5F, -1.0F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(100, 86).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-6.0F, -0.0696F, 0.27F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r114 = bone3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(39, 77).mirror().addBox(-6.5F, 0.3F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2936F, -1.0224F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r115 = bone3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(66, 58).mirror().addBox(-0.5F, -1.3F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0F, -0.9338F, -0.1059F, 1.2479F, 0.0F, 0.0F));

		PartDefinition body = Body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -1.5432F, 2.7005F, 0.0876F, 0.0869F, 0.0076F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(29, 4).mirror().addBox(-11.9916F, -2.5101F, -0.4853F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.6159F, 1.5104F, 0.1528F, 0.4786F, -1.2749F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(89, 57).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.6159F, 1.5104F, 0.3623F, 0.3534F, -0.7668F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(89, 59).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.6159F, 1.5104F, 0.4741F, 0.1806F, -0.3506F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(25, 18).mirror().addBox(-12.9916F, -2.5101F, -0.4853F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.5159F, 3.5104F, 0.1416F, 0.4452F, -1.2799F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(89, 61).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.5159F, 3.5104F, 0.3358F, 0.3291F, -0.7757F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(89, 63).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.5159F, 3.5104F, 0.4408F, 0.1686F, -0.3564F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(89, 63).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5159F, 3.5104F, 0.4408F, -0.1686F, 0.3564F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(89, 61).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5159F, 3.5104F, 0.3358F, -0.3291F, 0.7757F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(25, 18).addBox(2.9916F, -2.5101F, -0.4853F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5159F, 3.5104F, 0.1416F, -0.4452F, 1.2799F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(89, 59).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6159F, 1.5104F, 0.4741F, -0.1806F, 0.3506F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(89, 57).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6159F, 1.5104F, 0.3623F, -0.3534F, 0.7668F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(29, 4).addBox(2.9916F, -2.5101F, -0.4853F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6159F, 1.5104F, 0.1528F, -0.4786F, 1.2749F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(71, 107).addBox(-1.0F, -1.9277F, -0.0069F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(68, 107).addBox(-1.0F, -1.5678F, -0.0072F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(22, 53).addBox(-1.5F, 0.0247F, -0.0074F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition body12 = body.addOrReplaceChild("body12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.035F, 0.0872F, -0.0031F));

		PartDefinition cube_r131 = body12.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(88, 18).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.4159F, 1.5104F, 0.4574F, 0.1746F, -0.3536F));

		PartDefinition cube_r132 = body12.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(24, 88).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.4159F, 1.5104F, 0.349F, 0.3413F, -0.7714F));

		PartDefinition cube_r133 = body12.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(25, 20).mirror().addBox(-12.9916F, -2.5101F, -0.4853F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.4159F, 1.5104F, 0.1472F, 0.4619F, -1.2774F));

		PartDefinition cube_r134 = body12.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(25, 20).addBox(2.9916F, -2.5101F, -0.4853F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4159F, 1.5104F, 0.1472F, -0.4619F, 1.2774F));

		PartDefinition cube_r135 = body12.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(24, 88).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4159F, 1.5104F, 0.349F, -0.3413F, 0.7714F));

		PartDefinition cube_r136 = body12.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(9, 68).addBox(-1.5F, 0.0247F, 3.9926F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r137 = body12.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(88, 18).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4159F, 1.5104F, 0.4574F, -0.1746F, 0.3536F));

		PartDefinition cube_r138 = body12.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(0, 29).addBox(-2.5F, -2.0F, -5.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-1.0F, 12.4533F, 2.302F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r139 = body12.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(107, 63).addBox(-1.0F, -1.9626F, -0.0066F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Body3 = body12.addOrReplaceChild("Body3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.3503F, 2.858F, 0.1577F, 0.0862F, 0.0137F));

		PartDefinition cube_r140 = Body3.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(74, 107).addBox(-1.0F, -1.9551F, 0.0086F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0509F, 2.0297F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r141 = Body3.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(24, 108).addBox(-1.0F, -1.9F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 38).addBox(-1.5F, 0.0F, 0.05F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.4734F, 0.0323F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r142 = Body3.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(21, 29).addBox(-3.5F, -4.0F, -0.25F, 5.0F, 2.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, 13.8584F, -2.7535F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r143 = Body3.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(64, 89).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4425F, 2.3427F, 0.2683F, 0.1024F, -0.3798F));

		PartDefinition cube_r144 = Body3.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(91, 4).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4425F, 2.3427F, 0.2027F, 0.1983F, -0.8106F));

		PartDefinition cube_r145 = Body3.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(93, 28).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1425F, 0.4427F, 0.3009F, 0.1153F, -0.3762F));

		PartDefinition cube_r146 = Body3.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(93, 34).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1425F, 0.4427F, 0.2273F, 0.2236F, -0.8054F));

		PartDefinition cube_r147 = Body3.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(29, 2).mirror().addBox(-12.9916F, -2.5101F, -0.4852F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1425F, 0.4427F, 0.0971F, 0.3027F, -1.2962F));

		PartDefinition cube_r148 = Body3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(29, 0).mirror().addBox(-12.9916F, -2.5101F, -0.4852F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4425F, 2.3427F, 0.0873F, 0.2691F, -1.2989F));

		PartDefinition cube_r149 = Body3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(29, 0).addBox(2.9916F, -2.5101F, -0.4852F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4425F, 2.3427F, 0.0873F, -0.2691F, 1.2989F));

		PartDefinition cube_r150 = Body3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(29, 2).addBox(2.9916F, -2.5101F, -0.4852F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1425F, 0.4427F, 0.0971F, -0.3027F, 1.2962F));

		PartDefinition cube_r151 = Body3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(93, 34).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1425F, 0.4427F, 0.2273F, -0.2236F, 0.8054F));

		PartDefinition cube_r152 = Body3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(93, 28).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1425F, 0.4427F, 0.3009F, -0.1153F, 0.3762F));

		PartDefinition cube_r153 = Body3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(91, 4).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4425F, 2.3427F, 0.2027F, -0.1983F, 0.8106F));

		PartDefinition cube_r154 = Body3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(64, 89).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4425F, 2.3427F, 0.2683F, -0.1024F, 0.3798F));

		PartDefinition body13 = Body3.addOrReplaceChild("body13", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.3675F, 3.9427F, -0.0524F, 0.0436F, -0.0023F));

		PartDefinition cube_r155 = body13.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(25, 16).mirror().addBox(-12.9916F, -2.5101F, -0.4852F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6F, 0.4F, 0.104F, 0.3191F, -1.2939F));

		PartDefinition cube_r156 = body13.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(17, 88).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6F, 0.4F, 0.318F, 0.12F, -0.3741F));

		PartDefinition cube_r157 = body13.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(66, 87).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6F, 0.4F, 0.2411F, 0.2349F, -0.8021F));

		PartDefinition cube_r158 = body13.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(38, 36).mirror().addBox(-11.9916F, -2.5101F, -0.4853F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.15F, 2.4F, 0.1062F, 0.3098F, -1.2931F));

		PartDefinition cube_r159 = body13.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(93, 51).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.15F, 2.4F, 0.3118F, 0.1127F, -0.3747F));

		PartDefinition cube_r160 = body13.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(95, 18).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.15F, 2.4F, 0.2385F, 0.2257F, -0.8026F));

		PartDefinition cube_r161 = body13.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(38, 36).addBox(2.9916F, -2.5101F, -0.4853F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.15F, 2.4F, 0.1062F, -0.3098F, 1.2931F));

		PartDefinition cube_r162 = body13.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(30, 108).addBox(-1.0F, -1.8F, -0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.323F, 2.0775F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r163 = body13.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(106, 51).addBox(-1.0F, -1.9368F, 0.0235F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0365F, 0.0351F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r164 = body13.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(0, 22).addBox(-3.5F, -2.0F, 0.0F, 7.0F, 2.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.5F, 12.7176F, -1.8772F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r165 = body13.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(33, 53).addBox(-1.5F, 0.0F, 4.05F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.5F, -0.8409F, -3.9104F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r166 = body13.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(95, 18).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.15F, 2.4F, 0.2385F, -0.2257F, 0.8026F));

		PartDefinition cube_r167 = body13.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(93, 51).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.15F, 2.4F, 0.3118F, -0.1127F, 0.3747F));

		PartDefinition cube_r168 = body13.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(66, 87).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 0.4F, 0.2411F, -0.2349F, 0.8021F));

		PartDefinition cube_r169 = body13.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(17, 88).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 0.4F, 0.318F, -0.12F, 0.3741F));

		PartDefinition cube_r170 = body13.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(25, 16).addBox(2.9916F, -2.5101F, -0.4852F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, 0.4F, 0.104F, -0.3191F, 1.2939F));

		PartDefinition Body10 = body13.addOrReplaceChild("Body10", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.8621F, 4.0428F, -0.0611F, 0.0436F, -0.0027F));

		PartDefinition cube_r171 = Body10.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(106, 39).addBox(-1.0F, -1.5F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.193F, 1.8623F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r172 = Body10.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(77, 107).addBox(-1.0F, -1.6F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1886F, -0.101F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r173 = Body10.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(52, 46).addBox(-1.5F, 0.0F, 0.05F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.1886F, -0.101F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r174 = Body10.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(86, 51).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7273F, 2.2094F, 0.3336F, 0.1281F, -0.3723F));

		PartDefinition cube_r175 = Body10.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(86, 35).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7273F, 2.2094F, 0.2523F, 0.2487F, -0.7996F));

		PartDefinition cube_r176 = Body10.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(89, 65).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4273F, 0.3094F, 0.3336F, 0.1281F, -0.3723F));

		PartDefinition cube_r177 = Body10.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(88, 89).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4273F, 0.3094F, 0.2523F, 0.2487F, -0.7996F));

		PartDefinition cube_r178 = Body10.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(-11.9916F, -2.5101F, -0.4852F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4273F, 0.3094F, 0.1072F, 0.3363F, -1.293F));

		PartDefinition cube_r179 = Body10.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(0, 39).mirror().addBox(-10.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7273F, 2.2094F, 0.1072F, 0.3363F, -1.293F));

		PartDefinition cube_r180 = Body10.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(0, 39).addBox(2.9916F, -2.5101F, -0.4852F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7273F, 2.2094F, 0.1072F, -0.3363F, 1.293F));

		PartDefinition cube_r181 = Body10.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(0, 37).addBox(2.9916F, -2.5101F, -0.4852F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4273F, 0.3094F, 0.1072F, -0.3363F, 1.293F));

		PartDefinition cube_r182 = Body10.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(88, 89).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4273F, 0.3094F, 0.2523F, -0.2487F, 0.7996F));

		PartDefinition cube_r183 = Body10.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(89, 65).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4273F, 0.3094F, 0.3336F, -0.1281F, 0.3723F));

		PartDefinition cube_r184 = Body10.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(23, 22).addBox(-3.5F, -2.0F, 0.0F, 7.0F, 2.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 12.5086F, -1.1975F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r185 = Body10.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(86, 35).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7273F, 2.2094F, 0.2523F, -0.2487F, 0.7996F));

		PartDefinition cube_r186 = Body10.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(86, 51).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7273F, 2.2094F, 0.3336F, -0.1281F, 0.3723F));

		PartDefinition body14 = Body10.addOrReplaceChild("body14", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.7273F, 3.8094F, -0.0438F, -0.0872F, 0.0038F));

		PartDefinition cube_r187 = body14.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(50, 4).mirror().addBox(-9.9916F, -2.5101F, -0.4852F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4F, 0.3F, 0.127F, 0.4036F, -1.3382F));

		PartDefinition cube_r188 = body14.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(0, 90).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4F, 0.3F, 0.3991F, 0.154F, -0.4154F));

		PartDefinition cube_r189 = body14.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(90, 0).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4F, 0.3F, 0.3025F, 0.299F, -0.8384F));

		PartDefinition cube_r190 = body14.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(52, 2).mirror().addBox(-7.9916F, -2.5101F, -0.4852F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9F, 2.4F, 0.1235F, 0.4132F, -1.3396F));

		PartDefinition cube_r191 = body14.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(90, 2).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9F, 2.4F, 0.4049F, 0.1624F, -0.4145F));

		PartDefinition cube_r192 = body14.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(17, 90).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.9F, 2.4F, 0.3043F, 0.309F, -0.8378F));

		PartDefinition cube_r193 = body14.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(52, 2).addBox(2.9916F, -2.5101F, -0.4852F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, 2.4F, 0.1235F, -0.4132F, 1.3396F));

		PartDefinition cube_r194 = body14.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(52, 52).addBox(-1.5F, 0.0F, 4.05F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.5F, -0.9159F, -3.9104F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r195 = body14.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(80, 107).addBox(-1.0F, -1.275F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2289F, 1.9793F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r196 = body14.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(21, 108).addBox(-1.0F, -1.3F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1527F, 0.0161F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r197 = body14.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(17, 90).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, 2.4F, 0.3043F, -0.309F, 0.8378F));

		PartDefinition cube_r198 = body14.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(0, 6).addBox(-3.5F, -2.0F, 0.0F, 7.0F, 2.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.5F, 11.7792F, -0.4938F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r199 = body14.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(90, 2).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, 2.4F, 0.4049F, -0.1624F, 0.4145F));

		PartDefinition cube_r200 = body14.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(90, 0).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 0.3F, 0.3025F, -0.299F, 0.8384F));

		PartDefinition cube_r201 = body14.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(0, 90).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 0.3F, 0.3991F, -0.154F, 0.4154F));

		PartDefinition cube_r202 = body14.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(50, 4).addBox(2.9916F, -2.5101F, -0.4852F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 0.3F, 0.127F, -0.4036F, 1.3382F));

		PartDefinition Body11 = body14.addOrReplaceChild("Body11", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.9985F, 3.9191F, 0.0088F, -0.0873F, -0.0008F));

		PartDefinition cube_r203 = Body11.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(53, 106).addBox(-1.0F, -1.2F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.751F, 5.8325F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r204 = Body11.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(27, 108).addBox(-1.0F, -1.2F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3693F, 3.8693F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r205 = Body11.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(106, 35).addBox(-1.0F, -1.3F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0123F, 1.906F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r206 = Body11.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(83, 107).addBox(-1.0F, -1.275F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3939F, -0.0572F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r207 = Body11.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(25, 6).addBox(-1.5F, 0.0F, 0.05F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0F, -0.3939F, -0.0572F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r208 = Body11.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(91, 49).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.522F, 2.2532F, 0.6001F, 0.2241F, -0.3252F));

		PartDefinition cube_r209 = Body11.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(48, 92).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.522F, 2.2532F, 0.4665F, 0.4424F, -0.7264F));

		PartDefinition cube_r210 = Body11.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(24, 90).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.222F, 0.2532F, 0.5158F, 0.1955F, -0.3428F));

		PartDefinition cube_r211 = Body11.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(31, 90).mirror().addBox(-3.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.222F, 0.2532F, 0.3962F, 0.3835F, -0.7546F));

		PartDefinition cube_r212 = Body11.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(53, 44).mirror().addBox(-5.9916F, -2.5101F, -0.4853F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.222F, 0.2532F, 0.1675F, 0.5203F, -1.2678F));

		PartDefinition cube_r213 = Body11.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(81, 12).mirror().addBox(-3.9916F, -2.5101F, -0.4853F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.522F, 2.2532F, 0.1991F, 0.6034F, -1.251F));

		PartDefinition cube_r214 = Body11.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(83, 74).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.922F, 4.2532F, 0.2689F, 0.1311F, -0.3303F));

		PartDefinition cube_r215 = Body11.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(90, 67).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.422F, 6.2532F, 0.3348F, 0.1169F, -0.4543F));

		PartDefinition cube_r216 = Body11.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(90, 67).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.422F, 6.2532F, 0.3348F, -0.1169F, 0.4543F));

		PartDefinition cube_r217 = Body11.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(83, 74).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.922F, 4.2532F, 0.2689F, -0.1311F, 0.3303F));

		PartDefinition cube_r218 = Body11.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(81, 12).addBox(2.9916F, -2.5101F, -0.4853F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.522F, 2.2532F, 0.1991F, -0.6034F, 1.251F));

		PartDefinition cube_r219 = Body11.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(53, 44).addBox(2.9916F, -2.5101F, -0.4853F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.222F, 0.2532F, 0.1675F, -0.5203F, 1.2678F));

		PartDefinition cube_r220 = Body11.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(31, 90).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.222F, 0.2532F, 0.3962F, -0.3835F, 0.7546F));

		PartDefinition cube_r221 = Body11.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(24, 90).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.222F, 0.2532F, 0.5158F, -0.1955F, 0.3428F));

		PartDefinition cube_r222 = Body11.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(0, 14).addBox(-3.5F, -2.0F, 0.0F, 7.0F, 2.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 9.8735F, 0.4172F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r223 = Body11.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(48, 92).addBox(1.8126F, -0.8451F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.522F, 2.2532F, 0.4665F, -0.4424F, 0.7264F));

		PartDefinition cube_r224 = Body11.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(91, 49).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.522F, 2.2532F, 0.6001F, -0.2241F, 0.3252F));

		PartDefinition Body4 = Body11.addOrReplaceChild("Body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5468F, 7.7055F, 0.044F, -0.1308F, -0.0057F));

		PartDefinition cube_r225 = Body4.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(90, 69).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1272F, 0.3271F, 0.1969F, 0.2335F, -0.4668F));

		PartDefinition cube_r226 = Body4.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(72, 19).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5272F, 2.3271F, 0.5623F, 0.3258F, -0.672F));

		PartDefinition cube_r227 = Body4.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(72, 19).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5272F, 2.3271F, 0.5623F, -0.3258F, 0.672F));

		PartDefinition cube_r228 = Body4.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(90, 69).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1272F, 0.3271F, 0.1969F, -0.2335F, 0.4668F));

		PartDefinition cube_r229 = Body4.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(108, 47).addBox(-1.0F, -0.9648F, 0.0357F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0479F, 1.9708F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r230 = Body4.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(106, 43).addBox(-1.0F, -1.1648F, 0.0356F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.368F, 0.0145F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r231 = Body4.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(11, 52).addBox(-1.5F, -0.0648F, 0.1357F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3887F, -0.0833F, -0.2094F, 0.0F, 0.0F));

		PartDefinition tail = Body4.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5204F, 3.9477F, -0.1051F, -0.0868F, 0.0091F));

		PartDefinition cube_r232 = tail.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(68, 5).addBox(-1.5F, -1.0354F, 0.0445F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, 0.8908F, -0.231F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r233 = tail.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(90, 71).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5067F, 0.2794F, 0.5493F, 0.3489F, -0.7112F));

		PartDefinition cube_r234 = tail.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(90, 73).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5067F, 1.8794F, 0.4679F, 0.4555F, -0.9183F));

		PartDefinition cube_r235 = tail.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(90, 73).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5067F, 1.8794F, 0.4679F, -0.4555F, 0.9183F));

		PartDefinition cube_r236 = tail.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(90, 71).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5067F, 0.2794F, 0.5493F, -0.3489F, 0.7112F));

		PartDefinition cube_r237 = tail.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(108, 79).addBox(0.0F, -0.7F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1806F, 2.3866F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r238 = tail.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(108, 76).addBox(0.0F, -0.4F, -0.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.6F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Body5 = tail.addOrReplaceChild("Body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3726F, 2.8652F, 0.0345F, -0.0897F, 0.0137F));

		PartDefinition cube_r239 = Body5.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(41, 74).addBox(-1.0F, -0.95F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 49).addBox(-1.5F, 0.05F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3629F, -0.0655F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r240 = Body5.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(64, 75).addBox(-1.0F, -1.025F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2455F, 0.9326F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r241 = Body5.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(86, 107).addBox(0.0F, -0.4002F, -0.4825F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.713F, 1.3985F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r242 = Body5.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(50, 106).addBox(0.0F, 0.0998F, -0.4825F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.513F, 3.3985F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r243 = Body5.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(59, 33).mirror().addBox(-1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, 0.9248F, -0.0164F, 0.0289F, -0.3496F));

		PartDefinition cube_r244 = Body5.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(59, 33).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, 0.9248F, -0.0164F, -0.0289F, 0.3496F));

		PartDefinition Body6 = Body5.addOrReplaceChild("Body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0725F, 3.9045F, 0.044F, -0.1308F, -0.0057F));

		PartDefinition cube_r245 = Body6.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(56, 106).addBox(-1.0F, -1.125F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 108).addBox(-1.0F, -1.025F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 12).addBox(-1.5F, 0.05F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3629F, -0.0655F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r246 = Body6.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(107, 93).addBox(0.0F, -0.1002F, -0.4826F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.713F, 1.3985F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r247 = Body6.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(107, 89).addBox(0.0F, 0.0998F, -0.4826F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.513F, 3.3985F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r248 = Body6.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(11, 64).mirror().addBox(-1.275F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, 0.9248F, -0.0171F, 0.0398F, -0.2189F));

		PartDefinition cube_r249 = Body6.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(11, 64).addBox(-0.725F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, 0.9248F, -0.0171F, -0.0398F, 0.2189F));

		PartDefinition Body7 = Body6.addOrReplaceChild("Body7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0611F, 3.9796F, 0.0903F, -0.2608F, -0.0233F));

		PartDefinition cube_r250 = Body7.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(106, 59).addBox(-1.0F, -1.1F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 107).addBox(-1.0F, -1.075F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 55).addBox(-1.5F, 0.05F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3629F, -0.0655F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r251 = Body7.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(0, 108).addBox(0.0F, -0.4002F, -0.4826F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.713F, 1.3985F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r252 = Body7.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(107, 101).addBox(0.0F, -0.2001F, -0.4826F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.513F, 3.3985F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r253 = Body7.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(64, 37).mirror().addBox(-1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2044F, 0.9248F, -0.0172F, 0.0406F, -0.1753F));

		PartDefinition cube_r254 = Body7.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(64, 37).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2044F, 0.9248F, -0.0172F, -0.0406F, 0.1753F));

		PartDefinition Body8 = Body7.addOrReplaceChild("Body8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0603F, 4.0045F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r255 = Body8.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(108, 4).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6018F, 3.4392F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r256 = Body8.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(3, 108).addBox(-1.0F, -1.125F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3455F, 0.9344F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r257 = Body8.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(106, 72).addBox(0.0F, 0.6999F, 1.2174F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 0).addBox(0.0F, -0.5001F, -0.4826F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7129F, 1.3985F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r258 = Body8.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(57, 6).addBox(-1.5F, 0.05F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3629F, -0.0655F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Body15 = Body8.addOrReplaceChild("Body15", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0638F, 3.9046F, -0.0177F, 0.1745F, -0.0031F));

		PartDefinition cube_r259 = Body15.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(108, 8).addBox(-1.0F, -1.05F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 108).addBox(-1.0F, -1.075F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 58).addBox(-1.5F, 0.05F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3629F, 0.0345F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r260 = Body15.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(43, 107).addBox(0.0F, 2.8999F, 4.3175F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 107).addBox(0.0F, 1.7999F, 2.8175F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6492F, -2.5061F, 0.637F, 0.0F, 0.0F));

		PartDefinition Body16 = Body15.addOrReplaceChild("Body16", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0698F, 3.9994F, -0.0903F, 0.2608F, -0.0233F));

		PartDefinition cube_r261 = Body16.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(12, 108).addBox(-1.0F, -1.075F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 108).addBox(-1.0F, -1.1F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 58).addBox(-1.5F, 0.05F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3629F, 0.0345F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r262 = Body16.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(59, 107).addBox(0.0F, 5.5998F, 7.4674F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 107).addBox(0.0F, 4.2999F, 5.9674F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5794F, -6.5055F, 0.637F, 0.0F, 0.0F));

		PartDefinition Body17 = Body16.addOrReplaceChild("Body17", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.25F, 4.0F, -0.0715F, 0.2176F, -0.0155F));

		PartDefinition cube_r263 = Body17.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(15, 108).addBox(-1.0F, -1.025F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 12).addBox(-1.0F, -1.05F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 58).addBox(-1.5F, 0.05F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.063F, 0.0293F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r264 = Body17.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(40, 65).addBox(0.0F, 7.5998F, 10.6675F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 55).addBox(0.0F, 6.9999F, 9.0675F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8294F, -10.5055F, 0.637F, 0.0F, 0.0F));

		PartDefinition Body18 = Body17.addOrReplaceChild("Body18", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3797F, 3.9718F, -0.0181F, 0.2618F, -0.0047F));

		PartDefinition cube_r265 = Body18.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(89, 108).addBox(-1.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3106F, 3.0341F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r266 = Body18.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(108, 82).addBox(-1.0F, -0.925F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 21).addBox(-1.5F, 0.05F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3629F, 0.0345F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r267 = Body18.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(103, 72).addBox(0.0F, 10.1999F, 13.8674F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 70).addBox(0.0F, 8.7998F, 12.2674F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4497F, -14.4773F, 0.637F, 0.0F, 0.0F));

		PartDefinition Body9 = Body18.addOrReplaceChild("Body9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2122F, 3.942F, -0.1139F, 0.0867F, -0.0099F));

		PartDefinition cube_r268 = Body9.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(109, 38).addBox(-1.0F, -0.925F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0364F, 3.0579F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r269 = Body9.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(92, 108).addBox(-1.0F, -1.45F, 0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 59).addBox(-1.5F, -0.55F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 0.5141F, 0.1671F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r270 = Body9.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(18, 108).addBox(0.0F, 12.8999F, 17.0924F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 16).addBox(0.0F, 12.0998F, 15.4674F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6618F, -18.4193F, 0.637F, 0.0F, 0.0F));

		PartDefinition Body19 = Body9.addOrReplaceChild("Body19", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0007F, 4.0244F, -0.0975F, 0.1737F, -0.0169F));

		PartDefinition cube_r271 = Body19.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(108, 97).addBox(-1.0F, -0.775F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.1357F, 3.037F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r272 = Body19.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(95, 108).addBox(-1.0F, -1.325F, 0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 61).addBox(-1.5F, -0.55F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, 0.4149F, 0.1461F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r273 = Body19.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(109, 35).addBox(0.0F, -0.1F, -0.575F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8557F, 3.6895F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r274 = Body19.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(108, 20).addBox(0.0F, 13.6998F, 18.7925F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6625F, -22.4437F, 0.637F, 0.0F, 0.0F));

		PartDefinition Body20 = Body19.addOrReplaceChild("Body20", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1209F, 4.003F, -0.0177F, 0.1745F, -0.0031F));

		PartDefinition cube_r275 = Body20.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(101, 108).addBox(-1.0F, -0.6912F, 0.9904F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.012F, 2.0319F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r276 = Body20.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(98, 108).addBox(-1.0F, -0.7412F, 0.9904F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0644F, 0.0326F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r277 = Body20.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(79, 53).addBox(0.0F, 1.3F, 2.825F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 79).addBox(0.0F, 0.5F, 1.125F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9766F, -0.3136F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r278 = Body20.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(46, 22).addBox(-1.5F, -0.0162F, -0.0096F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0644F, 0.0326F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body21 = Body20.addOrReplaceChild("Body21", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.125F, 5.0F, -0.0886F, 0.1739F, -0.0154F));

		PartDefinition cube_r279 = Body21.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(107, 108).addBox(-1.0F, -0.2162F, -0.0096F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.012F, 2.0319F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r280 = Body21.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(104, 108).addBox(-1.0F, -0.3912F, -0.0096F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0644F, 0.0326F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r281 = Body21.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(26, 46).addBox(-1.5F, -0.0162F, -0.0096F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0644F, 0.0326F, -0.0262F, 0.0F, 0.0F));

		PartDefinition bone = Body4.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4927F, 3.8325F, 0.1828F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r282 = bone.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(98, 74).addBox(-0.7551F, 0.5655F, -3.3823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9874F, -0.5318F, 0.1159F, 1.656F, -0.2056F, 0.9617F));

		PartDefinition cube_r283 = bone.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(105, 86).addBox(-0.7551F, -1.7399F, -3.3208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.9874F, -0.5318F, 0.1159F, 2.5723F, -0.2056F, 0.9617F));

		PartDefinition cube_r284 = bone.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(31, 65).addBox(-0.7551F, -0.2767F, -3.3277F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.9874F, -0.5318F, 0.1159F, 2.0051F, -0.2056F, 0.9617F));

		PartDefinition cube_r285 = bone.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(79, 21).addBox(-0.7652F, -1.1311F, -3.2124F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.9874F, -0.5318F, -0.3841F, 1.1262F, 0.7392F, 0.7355F));

		PartDefinition cube_r286 = bone.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(98, 20).addBox(-0.7652F, -0.2952F, -4.1369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 104).addBox(-0.7652F, -1.2952F, -4.1369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 70).addBox(-0.7652F, -0.7952F, -3.1369F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.9874F, -0.5318F, -0.3841F, 0.8644F, 0.7392F, 0.7355F));

		PartDefinition cube_r287 = bone.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(19, 79).addBox(-0.7652F, -0.4098F, -3.3689F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.9874F, -0.5318F, -0.3841F, 0.5938F, 0.7392F, 0.7355F));

		PartDefinition cube_r288 = bone.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(98, 48).addBox(-0.5F, 0.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.4624F, -0.0517F, 1.0374F, -1.5553F, -0.0607F, -0.2118F));

		PartDefinition cube_r289 = bone.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(47, 98).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.2663F, -0.9113F, 1.2182F, -1.7735F, -0.0607F, -0.2118F));

		PartDefinition cube_r290 = bone.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(42, 98).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0482F, -1.8308F, 1.545F, 2.808F, -0.0607F, -0.2118F));

		PartDefinition cube_r291 = bone.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(98, 23).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8124F, -2.9236F, 1.5582F, 2.0226F, -0.0607F, -0.2118F));

		PartDefinition cube_r292 = bone.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(22, 65).addBox(-0.6F, 0.25F, -0.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.3819F, -1.3298F, -0.4413F, 1.1936F, -0.0607F, -0.2118F));

		PartDefinition cube_r293 = bone.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(79, 14).addBox(-0.6F, -0.975F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(1.5073F, -0.5372F, 0.2839F, 0.9318F, -0.0607F, -0.2118F));

		PartDefinition bone4 = Body4.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4927F, 3.8325F, 0.1828F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r294 = bone4.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(98, 74).mirror().addBox(-0.2449F, 0.5655F, -3.3823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9874F, -0.5318F, 0.1159F, 1.656F, 0.2056F, -0.9617F));

		PartDefinition cube_r295 = bone4.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(105, 86).mirror().addBox(-0.2449F, -1.7399F, -3.3208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9874F, -0.5318F, 0.1159F, 2.5723F, 0.2056F, -0.9617F));

		PartDefinition cube_r296 = bone4.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(31, 65).mirror().addBox(-0.2449F, -0.2767F, -3.3277F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9874F, -0.5318F, 0.1159F, 2.0051F, 0.2056F, -0.9617F));

		PartDefinition cube_r297 = bone4.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(79, 21).mirror().addBox(-0.2348F, -1.1311F, -3.2124F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9874F, -0.5318F, -0.3841F, 1.1262F, -0.7392F, -0.7355F));

		PartDefinition cube_r298 = bone4.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(98, 20).mirror().addBox(-0.2348F, -0.2952F, -4.1369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(70, 104).mirror().addBox(-0.2348F, -1.2952F, -4.1369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(18, 70).mirror().addBox(-0.2348F, -0.7952F, -3.1369F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9874F, -0.5318F, -0.3841F, 0.8644F, -0.7392F, -0.7355F));

		PartDefinition cube_r299 = bone4.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(19, 79).mirror().addBox(-0.2348F, -0.4098F, -3.3689F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9874F, -0.5318F, -0.3841F, 0.5938F, -0.7392F, -0.7355F));

		PartDefinition cube_r300 = bone4.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(98, 48).mirror().addBox(-0.5F, 0.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.4624F, -0.0517F, 1.0374F, -1.5553F, 0.0607F, 0.2118F));

		PartDefinition cube_r301 = bone4.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(47, 98).mirror().addBox(-0.5F, 0.0F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2663F, -0.9113F, 1.2182F, -1.7735F, 0.0607F, 0.2118F));

		PartDefinition cube_r302 = bone4.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(42, 98).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0482F, -1.8308F, 1.545F, 2.808F, 0.0607F, 0.2118F));

		PartDefinition cube_r303 = bone4.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(98, 23).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8124F, -2.9236F, 1.5582F, 2.0226F, 0.0607F, 0.2118F));

		PartDefinition cube_r304 = bone4.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(22, 65).mirror().addBox(-0.4F, 0.25F, -0.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.3819F, -1.3298F, -0.4413F, 1.1936F, 0.0607F, 0.2118F));

		PartDefinition cube_r305 = bone4.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(79, 14).mirror().addBox(-0.4F, -0.975F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-1.5073F, -0.5372F, 0.2839F, 0.9318F, 0.0607F, 0.2118F));

		PartDefinition HindlimbL = Body4.addOrReplaceChild("HindlimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.189F, 3.7291F, 0.2526F, 0.5782F, -0.8588F, -0.1187F));

		PartDefinition cube_r306 = HindlimbL.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(70, 21).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0303F, 0.2223F, 0.7466F, 0.0F, -1.2392F, 0.6109F));

		PartDefinition cube_r307 = HindlimbL.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(75, 104).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2391F, -0.3317F, 0.4877F, 0.0F, -0.2618F, 0.6109F));

		PartDefinition cube_r308 = HindlimbL.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(25, 96).addBox(0.0F, -0.5F, 0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(20, 96).addBox(0.0F, -0.5F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.5003F, 2.5598F, -0.67F, -3.1416F, -0.829F, -2.5307F));

		PartDefinition cube_r309 = HindlimbL.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(30, 99).addBox(0.0F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0385F, 2.2364F, -0.8752F, -3.1416F, -1.2217F, -2.5307F));

		PartDefinition cube_r310 = HindlimbL.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(79, 29).addBox(0.1F, -0.5F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(3.0385F, 2.2364F, -0.8752F, -3.1416F, -1.4835F, -2.5307F));

		PartDefinition cube_r311 = HindlimbL.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(103, 80).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4598F, 1.8312F, -0.9061F, 3.1416F, -0.7418F, -2.5307F));

		PartDefinition cube_r312 = HindlimbL.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(103, 77).addBox(-0.8F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.6733F, 0.6725F, -0.9814F, 3.1416F, -0.1745F, -2.5307F));

		PartDefinition cube_r313 = HindlimbL.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(0, 105).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.8666F, 0.1077F, -1.155F, 0.0F, 1.3963F, 0.6109F));

		PartDefinition cube_r314 = HindlimbL.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(80, 104).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2391F, -0.3317F, -0.5123F, 0.0F, 0.6981F, 0.6109F));

		PartDefinition cube_r315 = HindlimbL.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(98, 77).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2391F, -0.3317F, 0.4877F, 0.0F, 0.0F, 0.6109F));

		PartDefinition HindlimbL2 = HindlimbL.addOrReplaceChild("HindlimbL2", CubeListBuilder.create(), PartPose.offset(7.6077F, 5.3283F, -1.4123F));

		PartDefinition cube_r316 = HindlimbL2.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(97, 71).addBox(-1.025F, 0.1F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.3627F, -2.1781F, -1.2344F, 0.3972F, 1.2445F, 0.9536F));

		PartDefinition cube_r317 = HindlimbL2.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(57, 100).addBox(-0.2F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-2.601F, -1.7113F, -0.5671F, 2.1958F, 1.4173F, 2.7768F));

		PartDefinition cube_r318 = HindlimbL2.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(97, 68).addBox(-0.2F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-2.4338F, -1.6564F, -0.2079F, 2.8559F, 1.1153F, -2.8241F));

		PartDefinition cube_r319 = HindlimbL2.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(96, 36).addBox(-0.625F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-2.9737F, -2.0301F, -0.0494F, 2.9857F, 0.6456F, -2.6605F));

		PartDefinition cube_r320 = HindlimbL2.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(97, 65).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.9737F, -2.0301F, -0.0494F, 3.0172F, 0.0403F, -2.5712F));

		PartDefinition cube_r321 = HindlimbL2.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(81, 84).addBox(-1.5F, -0.5F, -0.95F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-4.1104F, -2.7624F, -0.0832F, 3.0044F, -0.4357F, -2.508F));

		PartDefinition cube_r322 = HindlimbL2.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(52, 100).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-4.1104F, -2.7624F, -0.0832F, 0.7523F, -1.3884F, -0.1686F));

		PartDefinition cube_r323 = HindlimbL2.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(75, 56).addBox(-0.55F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-3.6348F, -2.4275F, -0.261F, 0.3905F, -1.239F, 0.2043F));

		PartDefinition cube_r324 = HindlimbL2.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(96, 30).addBox(-0.275F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(30, 96).addBox(-0.275F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-4.1104F, -2.7624F, -0.0832F, 2.9662F, -0.7807F, -2.4421F));

		PartDefinition cube_r325 = HindlimbL2.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(100, 33).addBox(-0.2F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(-2.5876F, -1.8119F, 1.531F, -3.1416F, 0.3491F, -2.5307F));

		PartDefinition cube_r326 = HindlimbL2.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(58, 97).addBox(-0.6F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.0694F, -1.449F, 1.1848F, 0.0F, 1.4835F, 0.6109F));

		PartDefinition cube_r327 = HindlimbL2.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(100, 26).addBox(-0.8F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(-1.9115F, -1.3384F, 0.955F, 0.0F, 0.8727F, 0.6109F));

		PartDefinition cube_r328 = HindlimbL2.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(98, 99).addBox(-0.8F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-2.1384F, -1.4973F, 0.4228F, 0.0F, 0.48F, 0.6109F));

		PartDefinition cube_r329 = HindlimbL2.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(93, 99).addBox(-0.2F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-2.6257F, -1.8385F, 0.3445F, 0.0F, -0.1309F, 0.6109F));

		PartDefinition cube_r330 = HindlimbL2.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(53, 97).addBox(-0.575F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.6508F, -1.8561F, 0.8237F, 0.0F, -0.9599F, 0.6109F));

		PartDefinition cube_r331 = HindlimbL2.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(75, 60).addBox(-0.9F, -0.5F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-3.562F, -2.4941F, 1.426F, 0.0F, -1.3963F, 0.6109F));

		PartDefinition cube_r332 = HindlimbL2.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(57, 75).addBox(-0.8F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-3.562F, -2.4941F, 1.426F, 0.0F, -1.5708F, 0.6109F));

		PartDefinition cube_r333 = HindlimbL2.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(35, 99).addBox(-0.5F, -0.5F, -1.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-4.8442F, -3.392F, 0.537F, -3.1416F, -1.2217F, -2.5307F));

		PartDefinition cube_r334 = HindlimbL2.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(40, 31).addBox(-2.5F, 0.0F, -1.9F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1309F, 0.6109F));

		PartDefinition HindlimbL7 = Body4.addOrReplaceChild("HindlimbL7", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.189F, 3.7291F, 0.2526F, 0.3721F, 0.1897F, -0.2667F));

		PartDefinition cube_r335 = HindlimbL7.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(70, 21).mirror().addBox(0.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0303F, 0.2223F, 0.7466F, 0.0F, 1.2392F, -0.6109F));

		PartDefinition cube_r336 = HindlimbL7.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(75, 104).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2391F, -0.3317F, 0.4877F, 0.0F, 0.2618F, -0.6109F));

		PartDefinition cube_r337 = HindlimbL7.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(25, 96).mirror().addBox(-1.0F, -0.5F, 0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(20, 96).mirror().addBox(-1.0F, -0.5F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.5003F, 2.5598F, -0.67F, -3.1416F, 0.829F, 2.5307F));

		PartDefinition cube_r338 = HindlimbL7.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(30, 99).mirror().addBox(-1.0F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0385F, 2.2364F, -0.8752F, -3.1416F, 1.2217F, 2.5307F));

		PartDefinition cube_r339 = HindlimbL7.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(79, 29).mirror().addBox(-1.1F, -0.5F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-3.0385F, 2.2364F, -0.8752F, -3.1416F, 1.4835F, 2.5307F));

		PartDefinition cube_r340 = HindlimbL7.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(103, 80).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4598F, 1.8312F, -0.9061F, 3.1416F, 0.7418F, 2.5307F));

		PartDefinition cube_r341 = HindlimbL7.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(103, 77).mirror().addBox(-0.2F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6733F, 0.6725F, -0.9814F, 3.1416F, 0.1745F, 2.5307F));

		PartDefinition cube_r342 = HindlimbL7.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(0, 105).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8666F, 0.1077F, -1.155F, 0.0F, -1.3963F, -0.6109F));

		PartDefinition cube_r343 = HindlimbL7.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(80, 104).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2391F, -0.3317F, -0.5123F, 0.0F, -0.6981F, -0.6109F));

		PartDefinition cube_r344 = HindlimbL7.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(98, 77).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2391F, -0.3317F, 0.4877F, 0.0F, 0.0F, -0.6109F));

		PartDefinition HindlimbL8 = HindlimbL7.addOrReplaceChild("HindlimbL8", CubeListBuilder.create(), PartPose.offset(-7.6077F, 5.3283F, -1.4123F));

		PartDefinition cube_r345 = HindlimbL8.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(97, 71).mirror().addBox(0.025F, 0.1F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.3627F, -2.1781F, -1.2344F, 0.3972F, -1.2445F, -0.9536F));

		PartDefinition cube_r346 = HindlimbL8.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(57, 100).mirror().addBox(-0.8F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(2.601F, -1.7113F, -0.5671F, 2.1958F, -1.4173F, -2.7768F));

		PartDefinition cube_r347 = HindlimbL8.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(97, 68).mirror().addBox(-0.8F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(2.4338F, -1.6564F, -0.2079F, 2.8559F, -1.1153F, 2.8241F));

		PartDefinition cube_r348 = HindlimbL8.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(96, 36).mirror().addBox(-0.375F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(2.9737F, -2.0301F, -0.0494F, 2.9857F, -0.6456F, 2.6605F));

		PartDefinition cube_r349 = HindlimbL8.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(97, 65).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.9737F, -2.0301F, -0.0494F, 3.0172F, -0.0403F, 2.5712F));

		PartDefinition cube_r350 = HindlimbL8.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(81, 84).mirror().addBox(-0.5F, -0.5F, -0.95F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(4.1104F, -2.7624F, -0.0832F, 3.0044F, 0.4357F, 2.508F));

		PartDefinition cube_r351 = HindlimbL8.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(52, 100).mirror().addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(4.1104F, -2.7624F, -0.0832F, 0.7523F, 1.3884F, 0.1686F));

		PartDefinition cube_r352 = HindlimbL8.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(75, 56).mirror().addBox(-0.45F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(3.6348F, -2.4275F, -0.261F, 0.3905F, 1.239F, -0.2043F));

		PartDefinition cube_r353 = HindlimbL8.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(96, 30).mirror().addBox(-0.725F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(30, 96).mirror().addBox(-0.725F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(4.1104F, -2.7624F, -0.0832F, 2.9662F, 0.7807F, 2.4421F));

		PartDefinition cube_r354 = HindlimbL8.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(100, 33).mirror().addBox(-0.8F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(2.5876F, -1.8119F, 1.531F, -3.1416F, -0.3491F, 2.5307F));

		PartDefinition cube_r355 = HindlimbL8.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(58, 97).mirror().addBox(-0.4F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.0694F, -1.449F, 1.1848F, 0.0F, -1.4835F, -0.6109F));

		PartDefinition cube_r356 = HindlimbL8.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(100, 26).mirror().addBox(-0.2F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(1.9115F, -1.3384F, 0.955F, 0.0F, -0.8727F, -0.6109F));

		PartDefinition cube_r357 = HindlimbL8.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(98, 99).mirror().addBox(-0.2F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(2.1384F, -1.4973F, 0.4228F, 0.0F, -0.48F, -0.6109F));

		PartDefinition cube_r358 = HindlimbL8.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(93, 99).mirror().addBox(-0.8F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(2.6257F, -1.8385F, 0.3445F, 0.0F, 0.1309F, -0.6109F));

		PartDefinition cube_r359 = HindlimbL8.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(53, 97).mirror().addBox(-0.425F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.6508F, -1.8561F, 0.8237F, 0.0F, 0.9599F, -0.6109F));

		PartDefinition cube_r360 = HindlimbL8.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(75, 60).mirror().addBox(-0.1F, -0.5F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(3.562F, -2.4941F, 1.426F, 0.0F, 1.3963F, -0.6109F));

		PartDefinition cube_r361 = HindlimbL8.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(57, 75).mirror().addBox(-0.2F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(3.562F, -2.4941F, 1.426F, 0.0F, 1.5708F, -0.6109F));

		PartDefinition cube_r362 = HindlimbL8.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(35, 99).mirror().addBox(-0.5F, -0.5F, -1.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(4.8442F, -3.392F, 0.537F, -3.1416F, 1.2217F, 2.5307F));

		PartDefinition cube_r363 = HindlimbL8.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(40, 31).mirror().addBox(-2.5F, 0.0F, -1.9F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1309F, -0.6109F));

		PartDefinition Head = Cartorhynchus.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0536F, 1.0848F, -19.2102F, -0.2629F, -0.1815F, -0.0716F));

		PartDefinition cube_r364 = Head.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(86, 15).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(45, 101).addBox(0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5536F, -1.8975F, -4.7928F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r365 = Head.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(33, 59).addBox(-0.5F, -0.4F, -0.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0536F, 0.9231F, -0.7434F, -3.0369F, 0.0F, 0.0F));

		PartDefinition cube_r366 = Head.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(78, 80).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0536F, -0.695F, -1.919F, 2.1991F, 0.0F, 0.0F));

		PartDefinition cube_r367 = Head.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(101, 45).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0536F, -0.695F, -1.919F, -3.1241F, 0.0F, 0.0F));

		PartDefinition cube_r368 = Head.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(101, 42).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0536F, -0.6775F, -2.9188F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r369 = Head.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(21, 36).addBox(-1.0F, -0.4F, 1.1F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0536F, -1.8364F, -5.7909F, -1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r370 = Head.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(64, 64).addBox(-0.5F, -1.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0536F, -1.8364F, -5.7909F, -1.5097F, 0.0F, 0.0F));

		PartDefinition cube_r371 = Head.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(27, 70).addBox(-0.5F, -2.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0536F, -1.6886F, -6.7799F, -2.9932F, 0.0F, 0.0F));

		PartDefinition cube_r372 = Head.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(70, 30).addBox(-0.5F, 0.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0536F, -1.413F, -7.7412F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r373 = Head.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(53, 64).addBox(-0.5F, 0.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0536F, -1.413F, -7.7412F, 1.85F, 0.0F, 0.0F));

		PartDefinition cube_r374 = Head.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(91, 30).addBox(0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0536F, -0.9746F, -8.64F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r375 = Head.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(60, 68).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0536F, 2.3959F, -4.0422F, -1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r376 = Head.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(46, 79).addBox(0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0536F, -0.3521F, -9.4226F, -0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r377 = Head.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(44, 64).addBox(0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0536F, 1.7221F, -10.2579F, -2.4173F, 0.0F, 0.0F));

		PartDefinition cube_r378 = Head.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(74, 76).addBox(-0.5F, -1.0F, -0.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0536F, 2.332F, -11.0507F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r379 = Head.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(97, 93).addBox(-0.5F, -1.0F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0536F, 2.7782F, -11.9457F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r380 = Head.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(97, 90).addBox(0.0F, 0.0F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5536F, 2.0498F, -13.1579F, 1.8151F, 0.0F, 0.0F));

		PartDefinition cube_r381 = Head.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(90, 105).addBox(-0.75F, -1.607F, -0.4091F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(40, 104).addBox(-0.75F, -0.9156F, -0.5035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1964F, 1.7771F, -14.9068F, -2.138F, 0.0F, 0.0F));

		PartDefinition cube_r382 = Head.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(45, 104).addBox(-0.75F, -1.2372F, -0.5299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(102, 66).addBox(-0.75F, -0.8872F, -0.5299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1964F, 1.7771F, -14.9068F, -2.2689F, 0.0F, 0.0F));

		PartDefinition cube_r383 = Head.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(96, 59).addBox(-0.75F, -0.6725F, -1.228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1964F, 1.7771F, -14.9068F, 2.8798F, 0.0F, 0.0F));

		PartDefinition cube_r384 = Head.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(96, 56).addBox(-0.75F, 0.592F, -0.752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1964F, 1.7771F, -14.9068F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r385 = Head.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(101, 60).addBox(0.5F, -0.425F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0536F, 2.4285F, -13.4586F, -3.0281F, 0.0F, 0.0F));

		PartDefinition cube_r386 = Head.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(101, 57).addBox(0.5F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0536F, 2.4285F, -13.4586F, 3.0805F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.4464F, 0.454F, -6.2482F));

		PartDefinition cube_r387 = leftFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(67, 73).addBox(-0.5F, -1.025F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9883F, -0.669F, 2.5231F, -2.0595F, 0.1745F, -0.0175F));

		PartDefinition cube_r388 = leftFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(0, 92).addBox(-0.6F, -0.1F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7801F, 3.711F, 2.738F, -1.359F, 0.1877F, 0.3424F));

		PartDefinition cube_r389 = leftFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(88, 83).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6592F, 4.2511F, -1.4578F, -1.6907F, 0.1877F, 0.1329F));

		PartDefinition cube_r390 = leftFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(88, 76).addBox(-1.5F, -0.3F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6592F, 4.2511F, -1.4578F, -1.6887F, 0.0578F, 0.1485F));

		PartDefinition cube_r391 = leftFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(73, 87).addBox(-0.3F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9108F, 3.8616F, -3.0739F, -1.9156F, 0.0578F, 0.1485F));

		PartDefinition cube_r392 = leftFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(35, 85).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9949F, 3.965F, -3.4086F, -1.9525F, 0.1877F, 0.1329F));

		PartDefinition cube_r393 = leftFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(36, 70).addBox(-2.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2291F, 4.5136F, -0.1245F, -0.052F, 0.1864F, 0.172F));

		PartDefinition cube_r394 = leftFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(86, 24).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4302F, 4.5046F, 0.855F, -1.5034F, 0.1913F, 0.2963F));

		PartDefinition cube_r395 = leftFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(33, 81).addBox(-0.575F, -0.1F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7801F, 3.711F, 2.738F, -1.3628F, 0.017F, 0.3058F));

		PartDefinition cube_r396 = leftFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(26, 81).addBox(-1.0F, -1.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.1878F, -4.2978F, -2.6873F, 0.5854F, -0.847F));

		PartDefinition cube_r397 = leftFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(57, 91).addBox(-0.9F, -0.6F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, 0.8056F, -5.0276F, -1.1456F, 0.5489F, -0.856F));

		PartDefinition cube_r398 = leftFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(103, 6).addBox(-0.3904F, -0.7084F, 0.0638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.018F, 2.2679F, -6.6136F, 2.6381F, 0.2918F, -0.0724F));

		PartDefinition cube_r399 = leftFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(67, 91).addBox(-0.6232F, -0.0782F, -0.4235F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.018F, 2.2679F, -6.6136F, 1.7248F, 0.2283F, -0.0379F));

		PartDefinition cube_r400 = leftFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(12, 91).addBox(-0.5982F, -0.3782F, -0.4235F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.018F, 2.2679F, -6.6136F, 1.2916F, 0.2674F, -0.0258F));

		PartDefinition cube_r401 = leftFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(103, 21).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.4499F, 0.5916F, 5.0158F, -1.4399F, 0.1745F, -0.0175F));

		PartDefinition cube_r402 = leftFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(62, 91).addBox(-0.675F, 0.7343F, -0.8506F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(96, 53).addBox(-0.675F, 0.3343F, -0.8506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-1.275F, 1.2707F, -8.3876F, 1.3912F, 0.2964F, -0.141F));

		PartDefinition cube_r403 = leftFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(97, 96).addBox(-0.675F, -0.7932F, -0.9799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-1.275F, 1.2707F, -8.3876F, 2.8747F, 0.2964F, -0.141F));

		PartDefinition cube_r404 = leftFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(103, 98).addBox(-0.675F, -0.7152F, -0.3138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(100, 105).addBox(-0.675F, -1.5066F, -0.2193F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(95, 105).addBox(-0.675F, -1.4066F, -0.2193F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.275F, 1.2707F, -8.3876F, -2.1431F, 0.2964F, -0.141F));

		PartDefinition cube_r405 = leftFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(101, 54).addBox(-0.675F, -0.7133F, -0.3156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(101, 51).addBox(-0.675F, -1.0633F, -0.3156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-1.275F, 1.2707F, -8.3876F, -2.274F, 0.2964F, -0.141F));

		PartDefinition cube_r406 = leftFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(103, 3).addBox(-1.0F, -0.874F, -1.9878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6128F, -4.5554F, -0.4974F, 0.2443F, -0.0349F));

		PartDefinition cube_r407 = leftFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(79, 45).addBox(-1.0F, -0.005F, -1.9606F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.6128F, -4.5554F, -1.9809F, 0.2443F, -0.0349F));

		PartDefinition cube_r408 = leftFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(103, 18).addBox(-1.0269F, -1.2019F, -0.589F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.9231F, -0.6799F, 4.7909F, -2.7015F, -0.0436F, -0.0172F));

		PartDefinition cube_r409 = leftFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(15, 102).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0696F, -1.0992F, -2.2311F, -0.2948F, 0.3502F, -2.2953F));

		PartDefinition cube_r410 = leftFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(10, 102).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.4286F, -2.3918F, 0.1769F, 0.4201F, -1.1577F));

		PartDefinition cube_r411 = leftFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(102, 63).addBox(-0.8F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0761F, -0.5066F, -2.9362F, -0.7113F, 0.4768F, -2.4347F));

		PartDefinition cube_r412 = leftFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(30, 102).addBox(-0.8F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(25, 102).addBox(-0.8F, -1.125F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0761F, -0.5066F, -2.9362F, -2.0639F, 0.4768F, -2.4347F));

		PartDefinition cube_r413 = leftFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(35, 102).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.8061F, -3.1744F, -1.2557F, -0.6939F, -1.4628F));

		PartDefinition cube_r414 = leftFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(20, 102).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.8061F, -3.1744F, -1.2753F, 0.6128F, -1.084F));

		PartDefinition cube_r415 = leftFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(103, 48).addBox(-1.0269F, -0.9838F, -1.8792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 15).addBox(-1.0269F, -0.9838F, -0.8792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9231F, -0.6799F, 4.7909F, -3.0069F, -0.0436F, -0.0172F));

		PartDefinition cube_r416 = leftFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(103, 12).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2486F, 0.236F, 3.9099F, -1.6581F, 0.1745F, -0.0175F));

		PartDefinition cube_r417 = leftFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(72, 91).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0399F, -0.5897F, 2.8078F, -1.8413F, 0.1745F, -0.0175F));

		PartDefinition cube_r418 = leftFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(53, 68).addBox(-0.5F, -2.0914F, -1.7108F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5809F, 2.3668F, -1.7104F, 0.1745F, -0.0175F));

		PartDefinition cube_r419 = leftFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(102, 102).addBox(-0.5F, -0.8499F, 0.9251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(0, 41).addBox(-0.5F, -0.6499F, -3.0749F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 1.5809F, 2.3668F, -0.6894F, 0.1745F, -0.0175F));

		PartDefinition cube_r420 = leftFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(76, 68).addBox(-0.5F, -1.8298F, -2.6251F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0F, 1.5809F, 2.3668F, 1.7977F, 0.1745F, -0.0175F));

		PartDefinition cube_r421 = leftFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(45, 70).addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.01F, 4.3256F, 2.1521F, 0.5149F, 0.1745F, -0.0175F));

		PartDefinition cube_r422 = leftFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(5, 99).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.3F, 3.0486F, 6.2982F, 3.1241F, 0.0F, 0.0F));

		PartDefinition cube_r423 = leftFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(0, 99).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.3F, 4.0286F, 6.4976F, 1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r424 = leftFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(27, 74).addBox(-0.1F, -4.8F, -0.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7608F, 3.7077F, 6.8598F, 1.0808F, -0.0843F, -1.5394F));

		PartDefinition cube_r425 = leftFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(88, 98).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.3F, 3.7466F, 7.8834F, 0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r426 = leftFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(98, 83).addBox(-0.5F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.3F, 3.578F, 7.101F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r427 = leftFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(102, 0).addBox(-1.0F, 0.0F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 102).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.3515F, 1.4554F, -0.1063F, -0.3935F, 0.0143F));

		PartDefinition cube_r428 = leftFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(5, 102).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -1.7415F, 2.3924F, -0.1382F, -0.6064F, 0.0791F));

		PartDefinition cube_r429 = leftFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(86, 21).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2577F, -1.637F, 6.1733F, -0.1732F, -0.5609F, 0.3412F));

		PartDefinition cube_r430 = leftFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(86, 27).addBox(-2.0F, -0.05F, -0.825F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.525F, -0.9313F, 6.7688F, -0.1846F, -0.3878F, 0.3659F));

		PartDefinition cube_r431 = leftFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(10, 99).addBox(-0.5F, -0.4F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.3F, 0.1483F, 6.4032F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r432 = leftFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(9, 73).addBox(-0.5F, -0.675F, -0.275F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.3F, -0.1253F, 6.1179F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r433 = leftFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(72, 51).addBox(-0.4444F, -1.2974F, -1.1274F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(63, 44).addBox(-0.4694F, -1.7974F, -1.6274F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.713F, 1.0527F, 0.6152F, 1.6041F, 0.2051F, -0.0177F));

		PartDefinition cube_r434 = leftFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(91, 45).addBox(-0.4944F, -2.7845F, -0.9333F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.713F, 1.0527F, 0.6152F, 1.2551F, 0.2051F, -0.0177F));

		PartDefinition cube_r435 = leftFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(72, 41).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.324F, -1.6911F, 2.1452F, -1.5084F, 0.9005F, -0.0117F));

		PartDefinition cube_r436 = leftFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(7, 80).addBox(-1.0F, -1.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(0, 80).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9035F, -1.6424F, -0.0139F, -1.4427F, -0.0546F, 0.4058F));

		PartDefinition cube_r437 = leftFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(71, 80).addBox(-1.0F, -1.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(53, 79).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9035F, -1.6424F, -0.0139F, -1.4412F, 0.1618F, 0.4338F));

		PartDefinition cube_r438 = leftFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(72, 14).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9035F, -1.6424F, -0.0139F, -1.5312F, 0.2032F, -0.0526F));

		PartDefinition cube_r439 = leftFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(72, 46).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5704F, -0.866F, -1.8267F, -2.7056F, -0.0108F, 0.4285F));

		PartDefinition cube_r440 = leftFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(44, 53).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5704F, -0.866F, -1.8267F, -2.753F, 0.2032F, -0.0526F));

		PartDefinition cube_r441 = leftFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(48, 14).addBox(-1.0F, -1.0F, -2.55F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0831F, 0.5499F, -3.8286F, -2.5029F, -0.072F, 0.4281F));

		PartDefinition cube_r442 = leftFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(13, 44).addBox(-0.5F, -0.8F, -3.7F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4252F, 2.2345F, -4.012F, -2.5482F, 0.2618F, -0.0349F));

		PartDefinition cube_r443 = leftFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(93, 14).addBox(-0.5F, -1.167F, -0.1024F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.0053F, 3.2835F, -3.0285F, 2.9253F, 0.2522F, 0.1106F));

		PartDefinition cube_r444 = leftFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(93, 79).addBox(-0.5F, -1.2014F, -0.8863F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.0053F, 3.2835F, -3.0285F, 3.0126F, 0.2522F, 0.1106F));

		PartDefinition cube_r445 = leftFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(93, 10).addBox(-0.5F, -1.253F, -1.6764F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.0053F, 3.2835F, -3.0285F, 3.0562F, 0.2522F, 0.1106F));

		PartDefinition cube_r446 = leftFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(93, 6).addBox(-0.5F, -1.3389F, -2.4635F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.0053F, 3.2835F, -3.0285F, 3.0999F, 0.2522F, 0.1106F));

		PartDefinition cube_r447 = leftFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(93, 75).addBox(-0.5F, -1.0941F, 1.4903F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(93, 24).addBox(-0.5F, -1.1941F, 0.6903F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4803F, 3.4085F, -2.7785F, 2.8589F, 0.2796F, 0.1152F));

		PartDefinition cube_r448 = leftFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(37, 95).addBox(-0.5F, -1.167F, -0.1024F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4803F, 3.4085F, -2.7785F, 2.9025F, 0.2796F, 0.1152F));

		PartDefinition cube_r449 = leftFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(10, 95).addBox(-0.5F, -1.2014F, -0.8863F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4803F, 3.4085F, -2.7785F, 2.9898F, 0.2796F, 0.1152F));

		PartDefinition cube_r450 = leftFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(48, 94).addBox(-0.5F, -1.253F, -1.6764F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4803F, 3.4085F, -2.7785F, 3.0334F, 0.2796F, 0.1152F));

		PartDefinition cube_r451 = leftFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(93, 83).addBox(-0.5F, -1.3389F, -2.4635F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4803F, 3.4085F, -2.7785F, 3.0771F, 0.2796F, 0.1152F));

		PartDefinition cube_r452 = leftFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(92, 91).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2809F, 3.8914F, -1.4012F, 2.9932F, 0.2618F, -0.0349F));

		PartDefinition cube_r453 = leftFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(17, 92).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0724F, 3.746F, -2.1597F, 2.9496F, 0.2618F, -0.0349F));

		PartDefinition cube_r454 = leftFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(32, 92).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1353F, 3.5663F, -2.9111F, 2.906F, 0.2618F, -0.0349F));

		PartDefinition cube_r455 = leftFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(27, 92).addBox(-0.5F, -0.9F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(22, 92).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5443F, 3.0489F, -4.369F, 2.7751F, 0.2618F, -0.0349F));

		PartDefinition cube_r456 = leftFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(5, 95).addBox(-1.6F, -0.3872F, 0.9962F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.075F, 4.3266F, -2.7459F, 2.8187F, 0.2618F, -0.0349F));

		PartDefinition cube_r457 = leftFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(7, 91).addBox(-1.0F, -0.0872F, 0.9962F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 4.1766F, -2.7459F, 2.8187F, 0.2618F, -0.0349F));

		PartDefinition cube_r458 = leftFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(59, 27).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.1766F, -2.7459F, 1.3352F, 0.2618F, -0.0349F));

		PartDefinition cube_r459 = leftFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(83, 98).addBox(-0.4944F, -0.118F, -2.367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.713F, 1.0527F, 0.6152F, -1.4502F, 0.2051F, -0.0177F));

		PartDefinition cube_r460 = leftFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(87, 101).addBox(-0.4944F, 1.518F, -0.2009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.713F, 1.0527F, 0.6152F, -2.5846F, 0.2051F, -0.0177F));

		PartDefinition cube_r461 = leftFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(82, 101).addBox(-0.4944F, -0.8897F, 1.6394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.713F, 1.0527F, 0.6152F, 2.4768F, 0.2051F, -0.0177F));

		PartDefinition cube_r462 = leftFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(85, 104).addBox(-0.55F, -0.325F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4574F, 1.8663F, -5.1082F, -0.5438F, 0.241F, -0.0606F));

		PartDefinition cube_r463 = leftFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(39, 46).addBox(-0.4944F, 0.0528F, -2.9363F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.713F, 1.0527F, 0.6152F, -0.0103F, 0.2051F, -0.0177F));

		PartDefinition cube_r464 = leftFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(52, 88).addBox(-0.4944F, 1.0421F, -0.6898F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.713F, 1.0527F, 0.6152F, -1.0138F, 0.2051F, -0.0177F));

		PartDefinition cube_r465 = leftFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(98, 80).addBox(-0.4944F, -0.2511F, 1.9647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.713F, 1.0527F, 0.6152F, -2.2356F, 0.2051F, -0.0177F));

		PartDefinition cube_r466 = leftFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(43, 91).addBox(-0.4944F, -2.903F, -0.348F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.713F, 1.0527F, 0.6152F, 2.7822F, 0.2051F, -0.0177F));

		PartDefinition cube_r467 = leftFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(79, 49).addBox(-0.4944F, -0.9115F, -2.7781F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.713F, 1.0527F, 0.6152F, 1.6478F, 0.2051F, -0.0177F));

		PartDefinition cube_r468 = leftFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(91, 41).addBox(-0.4944F, 0.6761F, -0.751F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.713F, 1.0527F, 0.6152F, 0.3824F, 0.2051F, -0.0177F));

		PartDefinition cube_r469 = leftFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(77, 101).addBox(-0.4944F, -0.5479F, 1.6494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.713F, 1.0527F, 0.6152F, -0.9266F, 0.2051F, -0.0177F));

		PartDefinition cube_r470 = leftFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(72, 101).addBox(-0.4944F, -2.5684F, -0.1498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.713F, 1.0527F, 0.6152F, -1.9738F, 0.2051F, -0.0177F));

		PartDefinition cube_r471 = leftFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(67, 101).addBox(-0.4944F, -0.8445F, -2.4302F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.713F, 1.0527F, 0.6152F, 3.1313F, 0.2051F, -0.0177F));

		PartDefinition cube_r472 = leftFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(38, 91).addBox(-0.4944F, 0.2682F, -0.8861F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.713F, 1.0527F, 0.6152F, 1.9968F, 0.2051F, -0.0177F));

		PartDefinition cube_r473 = leftFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(103, 9).addBox(-0.4944F, -0.2372F, 1.1392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.713F, 1.0527F, 0.6152F, 0.8188F, 0.2051F, -0.0177F));

		PartDefinition cube_r474 = leftFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(62, 101).addBox(-0.4944F, -2.1277F, -0.6755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.713F, 1.0527F, 0.6152F, -0.4902F, 0.2051F, -0.0177F));

		PartDefinition cube_r475 = leftFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(14, 75).addBox(-0.9809F, -4.5948F, -3.9938F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.325F, 4.541F, 1.1536F, -0.1923F, 0.2094F, -0.0175F));

		PartDefinition cube_r476 = leftFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(44, 6).addBox(-0.9809F, 1.0177F, -4.8573F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.325F, 4.541F, 1.1536F, -1.6758F, 0.2094F, -0.0175F));

		PartDefinition cube_r477 = leftFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(54, 83).addBox(-0.9809F, -0.0087F, 0.0276F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.325F, 4.541F, 1.1536F, -3.1157F, 0.2094F, -0.0175F));

		PartDefinition cube_r478 = leftFace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(79, 25).addBox(-0.4944F, -0.0929F, -2.2304F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.713F, 1.0527F, 0.6152F, -1.712F, 0.2051F, -0.0177F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.5536F, 0.454F, -6.2482F));

		PartDefinition cube_r479 = rightFace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(67, 73).mirror().addBox(-0.5F, -1.025F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9883F, -0.669F, 2.5231F, -2.0595F, -0.1745F, 0.0175F));

		PartDefinition cube_r480 = rightFace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(0, 92).mirror().addBox(-0.4F, -0.1F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7801F, 3.711F, 2.738F, -1.359F, -0.1877F, -0.3424F));

		PartDefinition cube_r481 = rightFace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(88, 83).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6592F, 4.2511F, -1.4578F, -1.6907F, -0.1877F, -0.1329F));

		PartDefinition cube_r482 = rightFace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(88, 76).mirror().addBox(0.5F, -0.3F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6592F, 4.2511F, -1.4578F, -1.6887F, -0.0578F, -0.1485F));

		PartDefinition cube_r483 = rightFace.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(73, 87).mirror().addBox(-0.7F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9108F, 3.8616F, -3.0739F, -1.9156F, -0.0578F, -0.1485F));

		PartDefinition cube_r484 = rightFace.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(35, 85).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9949F, 3.965F, -3.4086F, -1.9525F, -0.1877F, -0.1329F));

		PartDefinition cube_r485 = rightFace.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(36, 70).mirror().addBox(0.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2291F, 4.5136F, -0.1245F, -0.052F, -0.1864F, -0.172F));

		PartDefinition cube_r486 = rightFace.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(86, 24).mirror().addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4302F, 4.5046F, 0.855F, -1.5034F, -0.1913F, -0.2963F));

		PartDefinition cube_r487 = rightFace.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(33, 81).mirror().addBox(-1.425F, -0.1F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7801F, 3.711F, 2.738F, -1.3628F, -0.017F, -0.3058F));

		PartDefinition cube_r488 = rightFace.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(26, 81).mirror().addBox(0.0F, -1.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.1878F, -4.2978F, -2.6873F, -0.5854F, 0.847F));

		PartDefinition cube_r489 = rightFace.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(57, 91).mirror().addBox(-0.1F, -0.6F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.8056F, -5.0276F, -1.1456F, -0.5489F, 0.856F));

		PartDefinition cube_r490 = rightFace.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(103, 6).mirror().addBox(-0.6096F, -0.7084F, 0.0638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.018F, 2.2679F, -6.6136F, 2.6381F, -0.2918F, 0.0724F));

		PartDefinition cube_r491 = rightFace.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(67, 91).mirror().addBox(-0.3768F, -0.0782F, -0.4235F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.018F, 2.2679F, -6.6136F, 1.7248F, -0.2283F, 0.0379F));

		PartDefinition cube_r492 = rightFace.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(12, 91).mirror().addBox(-0.4018F, -0.3782F, -0.4235F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.018F, 2.2679F, -6.6136F, 1.2916F, -0.2674F, 0.0258F));

		PartDefinition cube_r493 = rightFace.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(103, 21).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4499F, 0.5916F, 5.0158F, -1.4399F, -0.1745F, 0.0175F));

		PartDefinition cube_r494 = rightFace.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(62, 91).mirror().addBox(-0.325F, 0.7343F, -0.8506F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(96, 53).mirror().addBox(-0.325F, 0.3343F, -0.8506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(1.275F, 1.2707F, -8.3876F, 1.3912F, -0.2964F, 0.141F));

		PartDefinition cube_r495 = rightFace.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(97, 96).mirror().addBox(-0.325F, -0.7932F, -0.9799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(1.275F, 1.2707F, -8.3876F, 2.8747F, -0.2964F, 0.141F));

		PartDefinition cube_r496 = rightFace.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(103, 98).mirror().addBox(-0.325F, -0.7152F, -0.3138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(100, 105).mirror().addBox(-0.325F, -1.5066F, -0.2193F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(95, 105).mirror().addBox(-0.325F, -1.4066F, -0.2193F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.275F, 1.2707F, -8.3876F, -2.1431F, -0.2964F, 0.141F));

		PartDefinition cube_r497 = rightFace.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(101, 54).mirror().addBox(-0.325F, -0.7133F, -0.3156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(101, 51).mirror().addBox(-0.325F, -1.0633F, -0.3156F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(1.275F, 1.2707F, -8.3876F, -2.274F, -0.2964F, 0.141F));

		PartDefinition cube_r498 = rightFace.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(103, 3).mirror().addBox(0.0F, -0.874F, -1.9878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.6128F, -4.5554F, -0.4974F, -0.2443F, 0.0349F));

		PartDefinition cube_r499 = rightFace.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(79, 45).mirror().addBox(0.0F, -0.005F, -1.9606F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.6128F, -4.5554F, -1.9809F, -0.2443F, 0.0349F));

		PartDefinition cube_r500 = rightFace.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(103, 18).mirror().addBox(0.0269F, -1.2019F, -0.589F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9231F, -0.6799F, 4.7909F, -2.7015F, 0.0436F, 0.0172F));

		PartDefinition cube_r501 = rightFace.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(15, 102).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0696F, -1.0992F, -2.2311F, -0.2948F, -0.3502F, 2.2953F));

		PartDefinition cube_r502 = rightFace.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(10, 102).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.4286F, -2.3918F, 0.1769F, -0.4201F, 1.1577F));

		PartDefinition cube_r503 = rightFace.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(102, 63).mirror().addBox(-0.2F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0761F, -0.5066F, -2.9362F, -0.7113F, -0.4768F, 2.4347F));

		PartDefinition cube_r504 = rightFace.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(30, 102).mirror().addBox(-0.2F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(25, 102).mirror().addBox(-0.2F, -1.125F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0761F, -0.5066F, -2.9362F, -2.0639F, -0.4768F, 2.4347F));

		PartDefinition cube_r505 = rightFace.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(35, 102).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -0.8061F, -3.1744F, -1.2557F, 0.6939F, 1.4628F));

		PartDefinition cube_r506 = rightFace.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(20, 102).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -0.8061F, -3.1744F, -1.2753F, -0.6128F, 1.084F));

		PartDefinition cube_r507 = rightFace.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(103, 48).mirror().addBox(0.0269F, -0.9838F, -1.8792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(103, 15).mirror().addBox(0.0269F, -0.9838F, -0.8792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9231F, -0.6799F, 4.7909F, -3.0069F, 0.0436F, 0.0172F));

		PartDefinition cube_r508 = rightFace.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(103, 12).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2486F, 0.236F, 3.9099F, -1.6581F, -0.1745F, 0.0175F));

		PartDefinition cube_r509 = rightFace.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(72, 91).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0399F, -0.5897F, 2.8078F, -1.8413F, -0.1745F, 0.0175F));

		PartDefinition cube_r510 = rightFace.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(53, 68).mirror().addBox(-0.5F, -2.0914F, -1.7108F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.5809F, 2.3668F, -1.7104F, -0.1745F, 0.0175F));

		PartDefinition cube_r511 = rightFace.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(102, 102).mirror().addBox(-0.5F, -0.8499F, 0.9251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(0, 41).mirror().addBox(-0.5F, -0.6499F, -3.0749F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.5809F, 2.3668F, -0.6894F, -0.1745F, 0.0175F));

		PartDefinition cube_r512 = rightFace.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(76, 68).mirror().addBox(-0.5F, -1.8298F, -2.6251F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.5809F, 2.3668F, 1.7977F, -0.1745F, 0.0175F));

		PartDefinition cube_r513 = rightFace.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(45, 70).mirror().addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.01F, 4.3256F, 2.1521F, 0.5149F, -0.1745F, 0.0175F));

		PartDefinition cube_r514 = rightFace.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(5, 99).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 3.0486F, 6.2982F, 3.1241F, 0.0F, 0.0F));

		PartDefinition cube_r515 = rightFace.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(0, 99).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 4.0286F, 6.4976F, 1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r516 = rightFace.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(27, 74).mirror().addBox(-0.9F, -4.8F, -0.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7608F, 3.7077F, 6.8598F, 1.0808F, 0.0843F, 1.5394F));

		PartDefinition cube_r517 = rightFace.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(88, 98).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 3.7466F, 7.8834F, 0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r518 = rightFace.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(98, 83).mirror().addBox(-0.5F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 3.578F, 7.101F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r519 = rightFace.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(102, 0).mirror().addBox(0.0F, 0.0F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 102).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.3515F, 1.4554F, -0.1063F, 0.3935F, -0.0143F));

		PartDefinition cube_r520 = rightFace.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(5, 102).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, -1.7415F, 2.3924F, -0.1382F, 0.6064F, -0.0791F));

		PartDefinition cube_r521 = rightFace.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(86, 21).mirror().addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.2577F, -1.637F, 6.1733F, -0.1732F, 0.5609F, -0.3412F));

		PartDefinition cube_r522 = rightFace.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(86, 27).mirror().addBox(0.0F, -0.05F, -0.825F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.525F, -0.9313F, 6.7688F, -0.1846F, 0.3878F, -0.3659F));

		PartDefinition cube_r523 = rightFace.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(10, 99).mirror().addBox(-0.5F, -0.4F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.1483F, 6.4032F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r524 = rightFace.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(9, 73).mirror().addBox(-0.5F, -0.675F, -0.275F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -0.1253F, 6.1179F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r525 = rightFace.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(72, 51).mirror().addBox(-0.5556F, -1.2974F, -1.1274F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(63, 44).mirror().addBox(-0.5306F, -1.7974F, -1.6274F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.713F, 1.0527F, 0.6152F, 1.6041F, -0.2051F, 0.0177F));

		PartDefinition cube_r526 = rightFace.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(91, 45).mirror().addBox(-0.5056F, -2.7845F, -0.9333F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.713F, 1.0527F, 0.6152F, 1.2551F, -0.2051F, 0.0177F));

		PartDefinition cube_r527 = rightFace.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(72, 41).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.324F, -1.6911F, 2.1452F, -1.5084F, -0.9005F, 0.0117F));

		PartDefinition cube_r528 = rightFace.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(7, 80).mirror().addBox(0.0F, -1.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(0, 80).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9035F, -1.6424F, -0.0139F, -1.4427F, 0.0546F, -0.4058F));

		PartDefinition cube_r529 = rightFace.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(71, 80).mirror().addBox(0.0F, -1.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(53, 79).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9035F, -1.6424F, -0.0139F, -1.4412F, -0.1618F, -0.4338F));

		PartDefinition cube_r530 = rightFace.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(72, 14).mirror().addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9035F, -1.6424F, -0.0139F, -1.5312F, -0.2032F, 0.0526F));

		PartDefinition cube_r531 = rightFace.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(72, 46).mirror().addBox(0.0F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, -0.866F, -1.8267F, -2.7056F, 0.0108F, -0.4285F));

		PartDefinition cube_r532 = rightFace.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(44, 53).mirror().addBox(0.0F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, -0.866F, -1.8267F, -2.753F, -0.2032F, 0.0526F));

		PartDefinition cube_r533 = rightFace.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(48, 14).mirror().addBox(0.0F, -1.0F, -2.55F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0831F, 0.5499F, -3.8286F, -2.5029F, 0.072F, -0.4281F));

		PartDefinition cube_r534 = rightFace.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(13, 44).mirror().addBox(-0.5F, -0.8F, -3.7F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.4252F, 2.2345F, -4.012F, -2.5482F, -0.2618F, 0.0349F));

		PartDefinition cube_r535 = rightFace.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(93, 14).mirror().addBox(-0.5F, -1.167F, -0.1024F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.0053F, 3.2835F, -3.0285F, 2.9253F, -0.2522F, -0.1106F));

		PartDefinition cube_r536 = rightFace.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(93, 79).mirror().addBox(-0.5F, -1.2014F, -0.8863F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.0053F, 3.2835F, -3.0285F, 3.0126F, -0.2522F, -0.1106F));

		PartDefinition cube_r537 = rightFace.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(93, 10).mirror().addBox(-0.5F, -1.253F, -1.6764F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.0053F, 3.2835F, -3.0285F, 3.0562F, -0.2522F, -0.1106F));

		PartDefinition cube_r538 = rightFace.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(93, 6).mirror().addBox(-0.5F, -1.3389F, -2.4635F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.0053F, 3.2835F, -3.0285F, 3.0999F, -0.2522F, -0.1106F));

		PartDefinition cube_r539 = rightFace.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(93, 75).mirror().addBox(-0.5F, -1.0941F, 1.4903F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(93, 24).mirror().addBox(-0.5F, -1.1941F, 0.6903F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.4803F, 3.4085F, -2.7785F, 2.8589F, -0.2796F, -0.1152F));

		PartDefinition cube_r540 = rightFace.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(37, 95).mirror().addBox(-0.5F, -1.167F, -0.1024F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.4803F, 3.4085F, -2.7785F, 2.9025F, -0.2796F, -0.1152F));

		PartDefinition cube_r541 = rightFace.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(10, 95).mirror().addBox(-0.5F, -1.2014F, -0.8863F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.4803F, 3.4085F, -2.7785F, 2.9898F, -0.2796F, -0.1152F));

		PartDefinition cube_r542 = rightFace.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(48, 94).mirror().addBox(-0.5F, -1.253F, -1.6764F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.4803F, 3.4085F, -2.7785F, 3.0334F, -0.2796F, -0.1152F));

		PartDefinition cube_r543 = rightFace.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(93, 83).mirror().addBox(-0.5F, -1.3389F, -2.4635F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.4803F, 3.4085F, -2.7785F, 3.0771F, -0.2796F, -0.1152F));

		PartDefinition cube_r544 = rightFace.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(92, 91).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2809F, 3.8914F, -1.4012F, 2.9932F, -0.2618F, 0.0349F));

		PartDefinition cube_r545 = rightFace.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(17, 92).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0724F, 3.746F, -2.1597F, 2.9496F, -0.2618F, 0.0349F));

		PartDefinition cube_r546 = rightFace.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(32, 92).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1353F, 3.5663F, -2.9111F, 2.906F, -0.2618F, 0.0349F));

		PartDefinition cube_r547 = rightFace.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(27, 92).mirror().addBox(-0.5F, -0.9F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(22, 92).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5443F, 3.0489F, -4.369F, 2.7751F, -0.2618F, 0.0349F));

		PartDefinition cube_r548 = rightFace.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(5, 95).mirror().addBox(0.6F, -0.3872F, 0.9962F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.075F, 4.3266F, -2.7459F, 2.8187F, -0.2618F, 0.0349F));

		PartDefinition cube_r549 = rightFace.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(7, 91).mirror().addBox(0.0F, -0.0872F, 0.9962F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.1766F, -2.7459F, 2.8187F, -0.2618F, 0.0349F));

		PartDefinition cube_r550 = rightFace.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(59, 27).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.1766F, -2.7459F, 1.3352F, -0.2618F, 0.0349F));

		PartDefinition cube_r551 = rightFace.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(83, 98).mirror().addBox(-0.5056F, -0.118F, -2.367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.713F, 1.0527F, 0.6152F, -1.4502F, -0.2051F, 0.0177F));

		PartDefinition cube_r552 = rightFace.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(87, 101).mirror().addBox(-0.5056F, 1.518F, -0.2009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.713F, 1.0527F, 0.6152F, -2.5846F, -0.2051F, 0.0177F));

		PartDefinition cube_r553 = rightFace.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(82, 101).mirror().addBox(-0.5056F, -0.8897F, 1.6394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.713F, 1.0527F, 0.6152F, 2.4768F, -0.2051F, 0.0177F));

		PartDefinition cube_r554 = rightFace.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(85, 104).mirror().addBox(-0.45F, -0.325F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4574F, 1.8663F, -5.1082F, -0.5438F, -0.241F, 0.0606F));

		PartDefinition cube_r555 = rightFace.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(39, 46).mirror().addBox(-0.5056F, 0.0528F, -2.9363F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.713F, 1.0527F, 0.6152F, -0.0103F, -0.2051F, 0.0177F));

		PartDefinition cube_r556 = rightFace.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(52, 88).mirror().addBox(-0.5056F, 1.0421F, -0.6898F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.713F, 1.0527F, 0.6152F, -1.0138F, -0.2051F, 0.0177F));

		PartDefinition cube_r557 = rightFace.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(98, 80).mirror().addBox(-0.5056F, -0.2511F, 1.9647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.713F, 1.0527F, 0.6152F, -2.2356F, -0.2051F, 0.0177F));

		PartDefinition cube_r558 = rightFace.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(43, 91).mirror().addBox(-0.5056F, -2.903F, -0.348F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.713F, 1.0527F, 0.6152F, 2.7822F, -0.2051F, 0.0177F));

		PartDefinition cube_r559 = rightFace.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(79, 49).mirror().addBox(-0.5056F, -0.9115F, -2.7781F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.713F, 1.0527F, 0.6152F, 1.6478F, -0.2051F, 0.0177F));

		PartDefinition cube_r560 = rightFace.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(91, 41).mirror().addBox(-0.5056F, 0.6761F, -0.751F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.713F, 1.0527F, 0.6152F, 0.3824F, -0.2051F, 0.0177F));

		PartDefinition cube_r561 = rightFace.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(77, 101).mirror().addBox(-0.5056F, -0.5479F, 1.6494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.713F, 1.0527F, 0.6152F, -0.9266F, -0.2051F, 0.0177F));

		PartDefinition cube_r562 = rightFace.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(72, 101).mirror().addBox(-0.5056F, -2.5684F, -0.1498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.713F, 1.0527F, 0.6152F, -1.9738F, -0.2051F, 0.0177F));

		PartDefinition cube_r563 = rightFace.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(67, 101).mirror().addBox(-0.5056F, -0.8445F, -2.4302F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.713F, 1.0527F, 0.6152F, 3.1313F, -0.2051F, 0.0177F));

		PartDefinition cube_r564 = rightFace.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(38, 91).mirror().addBox(-0.5056F, 0.2682F, -0.8861F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.713F, 1.0527F, 0.6152F, 1.9968F, -0.2051F, 0.0177F));

		PartDefinition cube_r565 = rightFace.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(103, 9).mirror().addBox(-0.5056F, -0.2372F, 1.1392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.713F, 1.0527F, 0.6152F, 0.8188F, -0.2051F, 0.0177F));

		PartDefinition cube_r566 = rightFace.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(62, 101).mirror().addBox(-0.5056F, -2.1277F, -0.6755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.713F, 1.0527F, 0.6152F, -0.4902F, -0.2051F, 0.0177F));

		PartDefinition cube_r567 = rightFace.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(14, 75).mirror().addBox(-0.0191F, -4.5948F, -3.9938F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 4.541F, 1.1536F, -0.1923F, -0.2094F, 0.0175F));

		PartDefinition cube_r568 = rightFace.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(44, 6).mirror().addBox(-0.0191F, 1.0177F, -4.8573F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 4.541F, 1.1536F, -1.6758F, -0.2094F, 0.0175F));

		PartDefinition cube_r569 = rightFace.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(54, 83).mirror().addBox(-0.0191F, -0.0087F, 0.0276F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 4.541F, 1.1536F, -3.1157F, -0.2094F, 0.0175F));

		PartDefinition cube_r570 = rightFace.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(79, 25).mirror().addBox(-0.5056F, -0.0929F, -2.2304F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.713F, 1.0527F, 0.6152F, -1.712F, -0.2051F, 0.0177F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0536F, 5.0324F, 1.2273F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r571 = Jaw.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(95, 87).mirror().addBox(0.0F, -0.1291F, -0.7982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)).mirror(false), PartPose.offsetAndRotation(-3.2F, -0.1776F, 0.4442F, 0.4664F, -0.0192F, -0.3136F));

		PartDefinition cube_r572 = Jaw.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(72, 95).mirror().addBox(0.0F, -0.0105F, -0.7554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-3.2F, -0.1776F, 0.4442F, 0.9987F, -0.0192F, -0.3136F));

		PartDefinition cube_r573 = Jaw.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(50, 75).mirror().addBox(-1.1702F, -1.7645F, -12.1577F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.3224F, -4.8558F, -0.1555F, -0.3402F, -0.3293F));

		PartDefinition cube_r574 = Jaw.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(75, 37).mirror().addBox(-0.4511F, -1.7645F, -12.1613F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.3224F, -4.8558F, -0.1531F, -0.2927F, -0.3371F));

		PartDefinition cube_r575 = Jaw.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(60, 82).mirror().addBox(-1.1702F, -0.5192F, -12.204F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(82, 61).mirror().addBox(-0.9702F, -0.5192F, -12.379F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.293F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.3224F, -4.8558F, -0.2602F, -0.3402F, -0.3293F));

		PartDefinition cube_r576 = Jaw.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(75, 64).mirror().addBox(-1.1702F, -0.9348F, -12.2031F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.3224F, -4.8558F, -0.2253F, -0.3402F, -0.3293F));

		PartDefinition cube_r577 = Jaw.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(77, 95).mirror().addBox(0.0F, -0.9146F, -1.2334F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-3.2F, -0.1776F, 0.4442F, 1.8714F, -0.0192F, -0.3136F));

		PartDefinition cube_r578 = Jaw.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(42, 95).mirror().addBox(0.0F, -1.2334F, 0.8646F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-3.2F, -0.1776F, 0.4442F, -2.841F, -0.0192F, -0.3136F));

		PartDefinition cube_r579 = Jaw.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(67, 95).mirror().addBox(0.0F, -1.1449F, 0.46F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-3.2F, -0.1776F, 0.4442F, 3.1368F, -0.0192F, -0.3136F));

		PartDefinition cube_r580 = Jaw.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(82, 95).mirror().addBox(0.0F, -1.3818F, 1.1977F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-3.2F, -0.1776F, 0.4442F, 2.9622F, -0.0192F, -0.3136F));

		PartDefinition cube_r581 = Jaw.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(77, 4).mirror().addBox(0.0F, 2.1538F, 0.2869F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-3.2F, -0.1776F, 0.4442F, -1.7065F, -0.0192F, -0.3136F));

		PartDefinition cube_r582 = Jaw.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(40, 87).mirror().addBox(0.0F, 0.1503F, -4.1048F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-3.2F, -0.1776F, 0.4442F, -0.0921F, -0.0192F, -0.3136F));

		PartDefinition cube_r583 = Jaw.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(0.0F, 3.996F, -0.7369F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-3.2F, -0.1776F, 0.4442F, -1.4447F, -0.0192F, -0.3136F));

		PartDefinition cube_r584 = Jaw.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(12, 87).mirror().addBox(0.0F, -1.2631F, 4.946F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-3.2F, -0.1776F, 0.4442F, -3.0155F, -0.0192F, -0.3136F));

		PartDefinition cube_r585 = Jaw.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(76, 0).mirror().addBox(-0.0996F, -1.0065F, 0.7527F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.3224F, -4.8558F, 1.8361F, -0.2055F, -0.3352F));

		PartDefinition cube_r586 = Jaw.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(78, 87).mirror().addBox(-0.0996F, -2.744F, -1.9802F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.3224F, -4.8558F, 0.2566F, -0.2055F, -0.3352F));

		PartDefinition cube_r587 = Jaw.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(83, 87).mirror().addBox(-0.0996F, -2.5512F, -2.7645F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.019F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.3224F, -4.8558F, 0.1431F, -0.2055F, -0.3352F));

		PartDefinition cube_r588 = Jaw.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(7, 87).mirror().addBox(-0.0996F, -2.4031F, -3.7406F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.3224F, -4.8558F, 0.0908F, -0.2055F, -0.3352F));

		PartDefinition cube_r589 = Jaw.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(102, 69).mirror().addBox(-0.0996F, -2.1113F, -4.7374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.3224F, -4.8558F, 0.0122F, -0.2055F, -0.3352F));

		PartDefinition cube_r590 = Jaw.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(15, 99).mirror().addBox(-0.4985F, -1.6971F, -5.7618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.3224F, -4.8558F, -0.0746F, -0.2927F, -0.3371F));

		PartDefinition cube_r591 = Jaw.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(96, 62).mirror().addBox(-0.4985F, -1.4451F, -6.7628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.3224F, -4.8558F, -0.1182F, -0.2927F, -0.3371F));

		PartDefinition cube_r592 = Jaw.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(15, 96).mirror().addBox(-0.4985F, -1.1497F, -7.7519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.3224F, -4.8558F, -0.1618F, -0.2927F, -0.3371F));

		PartDefinition cube_r593 = Jaw.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(32, 77).mirror().addBox(0.0F, -1.2764F, 0.9449F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-3.2F, -0.1776F, 0.4442F, -2.8672F, -0.0192F, -0.3136F));

		PartDefinition cube_r594 = Jaw.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(98, 3).mirror().addBox(0.0F, 3.0156F, -0.1422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-3.2F, -0.1776F, 0.4442F, -1.1567F, -0.0192F, -0.3136F));

		PartDefinition cube_r595 = Jaw.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(98, 15).mirror().addBox(0.0F, 0.4731F, -4.8027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-3.2F, -0.1776F, 0.4442F, 0.257F, -0.0192F, -0.3136F));

		PartDefinition cube_r596 = Jaw.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(98, 6).mirror().addBox(0.0F, -5.5922F, -1.9655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-3.2F, -0.1776F, 0.4442F, 1.7231F, -0.0192F, -0.3136F));

		PartDefinition cube_r597 = Jaw.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(98, 9).mirror().addBox(-0.0996F, -0.9002F, -0.111F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.3224F, -4.8558F, 1.7052F, -0.2055F, -0.3352F));

		PartDefinition cube_r598 = Jaw.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(96, 45).mirror().addBox(-0.0996F, -1.8463F, -0.2332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.3224F, -4.8558F, 1.5656F, -0.2055F, -0.3352F));

		PartDefinition cube_r599 = Jaw.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(63, 98).mirror().addBox(-0.0996F, -2.7947F, -0.3603F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.3224F, -4.8558F, 1.4958F, -0.2055F, -0.3352F));

		PartDefinition cube_r600 = Jaw.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(102, 89).mirror().addBox(-0.0996F, -3.7409F, -0.5053F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.3224F, -4.8558F, 1.4434F, -0.2055F, -0.3352F));

		PartDefinition cube_r601 = Jaw.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(60, 104).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-1.2202F, 1.384F, -8.8139F, 1.3561F, -0.2055F, -0.3352F));

		PartDefinition cube_r602 = Jaw.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(97, 0).mirror().addBox(-0.4985F, -5.5583F, -0.9809F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.3224F, -4.8558F, 1.3217F, -0.2927F, -0.3371F));

		PartDefinition cube_r603 = Jaw.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(96, 39).mirror().addBox(-0.4985F, -6.4455F, -1.3651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.3224F, -4.8558F, 1.2519F, -0.2927F, -0.3371F));

		PartDefinition cube_r604 = Jaw.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(93, 20).mirror().addBox(-0.4985F, -8.2714F, -1.9204F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.3224F, -4.8558F, 1.1646F, -0.2927F, -0.3371F));

		PartDefinition cube_r605 = Jaw.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(87, 95).mirror().addBox(-0.4985F, -0.473F, -8.6585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.3224F, -4.8558F, -0.2491F, -0.2927F, -0.3371F));

		PartDefinition cube_r606 = Jaw.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(92, 102).mirror().addBox(-1.1702F, -1.307F, -10.8117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false)
				.texOffs(97, 102).mirror().addBox(-0.9702F, -1.307F, -10.8117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.3224F, -4.8558F, -0.1991F, -0.3402F, -0.3293F));

		PartDefinition cube_r607 = Jaw.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(30, 105).mirror().addBox(-1.0703F, -0.6759F, -10.3553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.3224F, -4.8558F, -0.2515F, -0.3402F, -0.3293F));

		PartDefinition cube_r608 = Jaw.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(88, 7).mirror().addBox(-1.0703F, -9.7645F, -0.5744F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.3224F, -4.8558F, 1.2931F, -0.3402F, -0.3293F));

		PartDefinition cube_r609 = Jaw.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(102, 92).mirror().addBox(-1.0703F, -9.4579F, -2.6697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.3224F, -4.8558F, 1.0924F, -0.3402F, -0.3293F));

		PartDefinition cube_r610 = Jaw.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(50, 103).mirror().addBox(-1.0703F, 1.366F, -8.9388F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.3224F, -4.8558F, -0.4435F, -0.3402F, -0.3293F));

		PartDefinition cube_r611 = Jaw.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(102, 95).mirror().addBox(-1.0703F, -3.0712F, 8.9414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.3224F, -4.8558F, 2.6196F, -0.3402F, -0.3293F));

		PartDefinition cube_r612 = Jaw.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(83, 0).mirror().addBox(-1.1702F, 1.1393F, -11.1986F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(14, 83).mirror().addBox(-0.9702F, 1.1393F, -11.1986F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.3224F, -4.8558F, -0.4173F, -0.3402F, -0.3293F));

		PartDefinition cube_r613 = Jaw.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(65, 104).mirror().addBox(-0.0996F, -4.6521F, -0.3281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.3224F, -4.8558F, 1.3561F, -0.2055F, -0.3352F));

		PartDefinition cube_r614 = Jaw.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(96, 42).mirror().addBox(9.8161F, -1.7645F, -6.5472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 2.3224F, -4.8558F, -0.1985F, 0.737F, -0.516F));

		PartDefinition cube_r615 = Jaw.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(64, 41).mirror().addBox(-1.5F, -0.9F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4149F, 0.0165F, -9.5053F, 0.1362F, -0.2702F, -1.0648F));

		PartDefinition cube_r616 = Jaw.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(81, 18).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1856F, 0.3656F, -8.9273F, 0.155F, -0.26F, -1.1364F));

		PartDefinition cube_r617 = Jaw.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(82, 65).mirror().addBox(-0.95F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(47, 83).mirror().addBox(-0.95F, -0.5F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4819F, 0.5641F, -7.7815F, 0.152F, -0.1738F, -1.1227F));

		PartDefinition cube_r618 = Jaw.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(83, 68).mirror().addBox(-1.05F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7905F, 0.1008F, -10.455F, 0.1162F, -0.2611F, -1.1547F));

		PartDefinition cube_r619 = Jaw.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(20, 99).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3146F, -0.5601F, -11.8891F, 0.1603F, -0.237F, -1.3331F));

		PartDefinition cube_r620 = Jaw.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(83, 71).mirror().addBox(-1.1F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6228F, -0.0493F, -11.2226F, 0.1276F, -0.2558F, -1.1995F));

		PartDefinition cube_r621 = Jaw.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(25, 99).mirror().addBox(-0.5F, -0.725F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1469F, -0.7102F, -12.6568F, -0.0579F, -0.237F, -1.3331F));

		PartDefinition cube_r622 = Jaw.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(-1.6131F, -0.2125F, 1.259F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(84, 4).mirror().addBox(-1.6131F, -0.2125F, 0.459F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8439F, -0.0192F, -9.1159F, 0.1435F, 0.0174F, -2.0383F));

		PartDefinition cube_r623 = Jaw.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(7, 84).mirror().addBox(-1.5421F, -0.2125F, -0.2884F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8439F, -0.0192F, -9.1159F, 0.1438F, -0.069F, -2.0508F));

		PartDefinition cube_r624 = Jaw.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(13, 41).mirror().addBox(-1.2216F, -0.3487F, -0.1186F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3439F, -0.0192F, -10.0159F, 0.3024F, -0.1014F, -2.0024F));

		PartDefinition cube_r625 = Jaw.addOrReplaceChild("cube_r625", CubeListBuilder.create().texOffs(67, 84).mirror().addBox(-1.2855F, -0.3505F, -0.9116F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3439F, -0.0192F, -10.0159F, 0.2663F, -0.0787F, -2.087F));

		PartDefinition cube_r626 = Jaw.addOrReplaceChild("cube_r626", CubeListBuilder.create().texOffs(74, 84).mirror().addBox(-1.3418F, -0.3609F, -1.7116F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3439F, -0.0192F, -10.0159F, 0.2694F, -0.0671F, -2.1292F));

		PartDefinition cube_r627 = Jaw.addOrReplaceChild("cube_r627", CubeListBuilder.create().texOffs(68, 98).mirror().addBox(-0.3613F, -0.3415F, -2.5116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(73, 98).mirror().addBox(-0.3613F, -0.3415F, -3.3116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3439F, -0.0192F, -10.0159F, 0.2757F, -0.0319F, -2.2554F));

		PartDefinition cube_r628 = Jaw.addOrReplaceChild("cube_r628", CubeListBuilder.create().texOffs(86, 30).mirror().addBox(0.0F, -2.5F, -0.65F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-1.2202F, 1.384F, -8.8139F, 1.5941F, -0.2952F, -1.2335F));

		PartDefinition cube_r629 = Jaw.addOrReplaceChild("cube_r629", CubeListBuilder.create().texOffs(86, 41).mirror().addBox(0.0F, -0.1F, -0.475F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-1.2202F, 1.384F, -8.8139F, 1.6804F, -0.0771F, -1.2285F));

		PartDefinition cube_r630 = Jaw.addOrReplaceChild("cube_r630", CubeListBuilder.create().texOffs(86, 46).mirror().addBox(0.0F, -0.1F, -0.65F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-1.2202F, 1.384F, -8.8139F, 1.5931F, -0.0771F, -1.2285F));

		PartDefinition cube_r631 = Jaw.addOrReplaceChild("cube_r631", CubeListBuilder.create().texOffs(47, 86).mirror().addBox(0.2F, -2.8F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6424F, 0.8183F, -11.1985F, 1.4608F, -0.3479F, -1.2497F));

		PartDefinition cube_r632 = Jaw.addOrReplaceChild("cube_r632", CubeListBuilder.create().texOffs(77, 91).mirror().addBox(-0.5F, -0.4091F, -0.3958F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1515F, -1.2604F, -14.5627F, 1.4459F, -0.3892F, -1.2443F));

		PartDefinition cube_r633 = Jaw.addOrReplaceChild("cube_r633", CubeListBuilder.create().texOffs(82, 91).mirror().addBox(-0.5F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1515F, -1.2604F, -14.5627F, 1.6204F, -0.3892F, -1.2443F));

		PartDefinition cube_r634 = Jaw.addOrReplaceChild("cube_r634", CubeListBuilder.create().texOffs(87, 91).mirror().addBox(-0.5F, -1.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1515F, -1.2604F, -14.5627F, 1.6198F, -0.3544F, -1.2425F));

		PartDefinition cube_r635 = Jaw.addOrReplaceChild("cube_r635", CubeListBuilder.create().texOffs(75, 64).addBox(0.1702F, -0.9348F, -12.2031F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.2F, 2.3224F, -4.8558F, -0.2253F, 0.3402F, 0.3293F));

		PartDefinition cube_r636 = Jaw.addOrReplaceChild("cube_r636", CubeListBuilder.create().texOffs(82, 61).addBox(-0.0298F, -0.5192F, -12.379F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.293F))
				.texOffs(60, 82).addBox(0.1702F, -0.5192F, -12.204F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(2.2F, 2.3224F, -4.8558F, -0.2602F, 0.3402F, 0.3293F));

		PartDefinition cube_r637 = Jaw.addOrReplaceChild("cube_r637", CubeListBuilder.create().texOffs(75, 37).addBox(-0.5489F, -1.7645F, -12.1613F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(2.2F, 2.3224F, -4.8558F, -0.1531F, 0.2927F, 0.3371F));

		PartDefinition cube_r638 = Jaw.addOrReplaceChild("cube_r638", CubeListBuilder.create().texOffs(50, 103).addBox(0.0703F, 1.366F, -8.9388F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(2.2F, 2.3224F, -4.8558F, -0.4435F, 0.3402F, 0.3293F));

		PartDefinition cube_r639 = Jaw.addOrReplaceChild("cube_r639", CubeListBuilder.create().texOffs(102, 95).addBox(0.0703F, -3.0712F, 8.9414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(2.2F, 2.3224F, -4.8558F, 2.6196F, 0.3402F, 0.3293F));

		PartDefinition cube_r640 = Jaw.addOrReplaceChild("cube_r640", CubeListBuilder.create().texOffs(102, 92).addBox(0.0703F, -9.4579F, -2.6697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2F, 2.3224F, -4.8558F, 1.0924F, 0.3402F, 0.3293F));

		PartDefinition cube_r641 = Jaw.addOrReplaceChild("cube_r641", CubeListBuilder.create().texOffs(88, 7).addBox(0.0703F, -9.7645F, -0.5744F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.2F, 2.3224F, -4.8558F, 1.2931F, 0.3402F, 0.3293F));

		PartDefinition cube_r642 = Jaw.addOrReplaceChild("cube_r642", CubeListBuilder.create().texOffs(30, 105).addBox(0.0703F, -0.6759F, -10.3553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2F, 2.3224F, -4.8558F, -0.2515F, 0.3402F, 0.3293F));

		PartDefinition cube_r643 = Jaw.addOrReplaceChild("cube_r643", CubeListBuilder.create().texOffs(14, 83).addBox(-0.0298F, 1.1393F, -11.1986F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F))
				.texOffs(83, 0).addBox(0.1702F, 1.1393F, -11.1986F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(2.2F, 2.3224F, -4.8558F, -0.4173F, 0.3402F, 0.3293F));

		PartDefinition cube_r644 = Jaw.addOrReplaceChild("cube_r644", CubeListBuilder.create().texOffs(97, 102).addBox(-0.0298F, -1.307F, -10.8117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(92, 102).addBox(0.1702F, -1.307F, -10.8117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(2.2F, 2.3224F, -4.8558F, -0.1991F, 0.3402F, 0.3293F));

		PartDefinition cube_r645 = Jaw.addOrReplaceChild("cube_r645", CubeListBuilder.create().texOffs(96, 42).addBox(-10.8161F, -1.7645F, -6.5472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(2.2F, 2.3224F, -4.8558F, -0.1985F, -0.737F, 0.516F));

		PartDefinition cube_r646 = Jaw.addOrReplaceChild("cube_r646", CubeListBuilder.create().texOffs(50, 75).addBox(0.1702F, -1.7645F, -12.1577F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(2.2F, 2.3224F, -4.8558F, -0.1555F, 0.3402F, 0.3293F));

		PartDefinition cube_r647 = Jaw.addOrReplaceChild("cube_r647", CubeListBuilder.create().texOffs(87, 95).addBox(-0.5015F, -0.473F, -8.6585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(2.2F, 2.3224F, -4.8558F, -0.2491F, 0.2927F, 0.3371F));

		PartDefinition cube_r648 = Jaw.addOrReplaceChild("cube_r648", CubeListBuilder.create().texOffs(15, 96).addBox(-0.5015F, -1.1497F, -7.7519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(2.2F, 2.3224F, -4.8558F, -0.1618F, 0.2927F, 0.3371F));

		PartDefinition cube_r649 = Jaw.addOrReplaceChild("cube_r649", CubeListBuilder.create().texOffs(96, 62).addBox(-0.5015F, -1.4451F, -6.7628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(2.2F, 2.3224F, -4.8558F, -0.1182F, 0.2927F, 0.3371F));

		PartDefinition cube_r650 = Jaw.addOrReplaceChild("cube_r650", CubeListBuilder.create().texOffs(73, 98).addBox(-0.6387F, -0.3415F, -3.3116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(68, 98).addBox(-0.6387F, -0.3415F, -2.5116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3439F, -0.0192F, -10.0159F, 0.2757F, 0.0319F, 2.2554F));

		PartDefinition cube_r651 = Jaw.addOrReplaceChild("cube_r651", CubeListBuilder.create().texOffs(74, 84).addBox(-0.6582F, -0.3609F, -1.7116F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3439F, -0.0192F, -10.0159F, 0.2694F, 0.0671F, 2.1292F));

		PartDefinition cube_r652 = Jaw.addOrReplaceChild("cube_r652", CubeListBuilder.create().texOffs(67, 84).addBox(-0.7145F, -0.3505F, -0.9116F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3439F, -0.0192F, -10.0159F, 0.2663F, 0.0787F, 2.087F));

		PartDefinition cube_r653 = Jaw.addOrReplaceChild("cube_r653", CubeListBuilder.create().texOffs(13, 41).addBox(-0.7784F, -0.3487F, -0.1186F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3439F, -0.0192F, -10.0159F, 0.3024F, 0.1014F, 2.0024F));

		PartDefinition cube_r654 = Jaw.addOrReplaceChild("cube_r654", CubeListBuilder.create().texOffs(7, 84).addBox(-0.4579F, -0.2125F, -0.2884F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8439F, -0.0192F, -9.1159F, 0.1438F, 0.069F, 2.0508F));

		PartDefinition cube_r655 = Jaw.addOrReplaceChild("cube_r655", CubeListBuilder.create().texOffs(84, 4).addBox(-0.3869F, -0.2125F, 0.459F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 84).addBox(-0.3869F, -0.2125F, 1.259F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8439F, -0.0192F, -9.1159F, 0.1435F, -0.0174F, 2.0383F));

		PartDefinition cube_r656 = Jaw.addOrReplaceChild("cube_r656", CubeListBuilder.create().texOffs(47, 83).addBox(-1.05F, -0.5F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(82, 65).addBox(-1.05F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4819F, 0.5641F, -7.7815F, 0.152F, 0.1738F, 1.1227F));

		PartDefinition cube_r657 = Jaw.addOrReplaceChild("cube_r657", CubeListBuilder.create().texOffs(81, 18).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1856F, 0.3656F, -8.9273F, 0.155F, 0.26F, 1.1364F));

		PartDefinition cube_r658 = Jaw.addOrReplaceChild("cube_r658", CubeListBuilder.create().texOffs(83, 71).addBox(-0.9F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6228F, -0.0493F, -11.2226F, 0.1276F, 0.2558F, 1.1995F));

		PartDefinition cube_r659 = Jaw.addOrReplaceChild("cube_r659", CubeListBuilder.create().texOffs(25, 99).addBox(-0.5F, -0.725F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1469F, -0.7102F, -12.6568F, -0.0579F, 0.237F, 1.3331F));

		PartDefinition cube_r660 = Jaw.addOrReplaceChild("cube_r660", CubeListBuilder.create().texOffs(20, 99).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3146F, -0.5601F, -11.8891F, 0.1603F, 0.237F, 1.3331F));

		PartDefinition cube_r661 = Jaw.addOrReplaceChild("cube_r661", CubeListBuilder.create().texOffs(83, 68).addBox(-0.95F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7905F, 0.1008F, -10.455F, 0.1162F, 0.2611F, 1.1547F));

		PartDefinition cube_r662 = Jaw.addOrReplaceChild("cube_r662", CubeListBuilder.create().texOffs(64, 41).addBox(-0.5F, -0.9F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4149F, 0.0165F, -9.5053F, 0.1362F, 0.2702F, 1.0648F));

		PartDefinition cube_r663 = Jaw.addOrReplaceChild("cube_r663", CubeListBuilder.create().texOffs(15, 99).addBox(-0.5015F, -1.6971F, -5.7618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(2.2F, 2.3224F, -4.8558F, -0.0746F, 0.2927F, 0.3371F));

		PartDefinition cube_r664 = Jaw.addOrReplaceChild("cube_r664", CubeListBuilder.create().texOffs(102, 69).addBox(-0.9004F, -2.1113F, -4.7374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(2.2F, 2.3224F, -4.8558F, 0.0122F, 0.2055F, 0.3352F));

		PartDefinition cube_r665 = Jaw.addOrReplaceChild("cube_r665", CubeListBuilder.create().texOffs(7, 87).addBox(-0.9004F, -2.4031F, -3.7406F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(2.2F, 2.3224F, -4.8558F, 0.0908F, 0.2055F, 0.3352F));

		PartDefinition cube_r666 = Jaw.addOrReplaceChild("cube_r666", CubeListBuilder.create().texOffs(83, 87).addBox(-0.9004F, -2.5512F, -2.7645F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.019F)), PartPose.offsetAndRotation(2.2F, 2.3224F, -4.8558F, 0.1431F, 0.2055F, 0.3352F));

		PartDefinition cube_r667 = Jaw.addOrReplaceChild("cube_r667", CubeListBuilder.create().texOffs(78, 87).addBox(-0.9004F, -2.744F, -1.9802F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(2.2F, 2.3224F, -4.8558F, 0.2566F, 0.2055F, 0.3352F));

		PartDefinition cube_r668 = Jaw.addOrReplaceChild("cube_r668", CubeListBuilder.create().texOffs(76, 0).addBox(-0.9004F, -1.0065F, 0.7527F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(2.2F, 2.3224F, -4.8558F, 1.8361F, 0.2055F, 0.3352F));

		PartDefinition cube_r669 = Jaw.addOrReplaceChild("cube_r669", CubeListBuilder.create().texOffs(12, 87).addBox(-1.0F, -1.2631F, 4.946F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(3.2F, -0.1776F, 0.4442F, -3.0155F, 0.0192F, 0.3136F));

		PartDefinition cube_r670 = Jaw.addOrReplaceChild("cube_r670", CubeListBuilder.create().texOffs(0, 76).addBox(-1.0F, 3.996F, -0.7369F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(3.2F, -0.1776F, 0.4442F, -1.4447F, 0.0192F, 0.3136F));

		PartDefinition cube_r671 = Jaw.addOrReplaceChild("cube_r671", CubeListBuilder.create().texOffs(40, 87).addBox(-1.0F, 0.1503F, -4.1048F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(3.2F, -0.1776F, 0.4442F, -0.0921F, 0.0192F, 0.3136F));

		PartDefinition cube_r672 = Jaw.addOrReplaceChild("cube_r672", CubeListBuilder.create().texOffs(93, 20).addBox(-0.5015F, -8.2714F, -1.9204F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(2.2F, 2.3224F, -4.8558F, 1.1646F, 0.2927F, 0.3371F));

		PartDefinition cube_r673 = Jaw.addOrReplaceChild("cube_r673", CubeListBuilder.create().texOffs(96, 39).addBox(-0.5015F, -6.4455F, -1.3651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(2.2F, 2.3224F, -4.8558F, 1.2519F, 0.2927F, 0.3371F));

		PartDefinition cube_r674 = Jaw.addOrReplaceChild("cube_r674", CubeListBuilder.create().texOffs(97, 0).addBox(-0.5015F, -5.5583F, -0.9809F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(2.2F, 2.3224F, -4.8558F, 1.3217F, 0.2927F, 0.3371F));

		PartDefinition cube_r675 = Jaw.addOrReplaceChild("cube_r675", CubeListBuilder.create().texOffs(65, 104).addBox(-0.9004F, -4.6521F, -0.3281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(2.2F, 2.3224F, -4.8558F, 1.3561F, 0.2055F, 0.3352F));

		PartDefinition cube_r676 = Jaw.addOrReplaceChild("cube_r676", CubeListBuilder.create().texOffs(86, 46).addBox(-1.0F, -0.1F, -0.65F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(1.2202F, 1.384F, -8.8139F, 1.5931F, 0.0771F, 1.2285F));

		PartDefinition cube_r677 = Jaw.addOrReplaceChild("cube_r677", CubeListBuilder.create().texOffs(86, 41).addBox(-1.0F, -0.1F, -0.475F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(1.2202F, 1.384F, -8.8139F, 1.6804F, 0.0771F, 1.2285F));

		PartDefinition cube_r678 = Jaw.addOrReplaceChild("cube_r678", CubeListBuilder.create().texOffs(87, 91).addBox(-0.5F, -1.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1515F, -1.2604F, -14.5627F, 1.6198F, 0.3544F, 1.2425F));

		PartDefinition cube_r679 = Jaw.addOrReplaceChild("cube_r679", CubeListBuilder.create().texOffs(82, 91).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1515F, -1.2604F, -14.5627F, 1.6204F, 0.3892F, 1.2443F));

		PartDefinition cube_r680 = Jaw.addOrReplaceChild("cube_r680", CubeListBuilder.create().texOffs(77, 91).addBox(-0.5F, -0.4091F, -0.3958F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1515F, -1.2604F, -14.5627F, 1.4459F, 0.3892F, 1.2443F));

		PartDefinition cube_r681 = Jaw.addOrReplaceChild("cube_r681", CubeListBuilder.create().texOffs(47, 86).addBox(-1.2F, -2.8F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6424F, 0.8183F, -11.1985F, 1.4608F, 0.3479F, 1.2497F));

		PartDefinition cube_r682 = Jaw.addOrReplaceChild("cube_r682", CubeListBuilder.create().texOffs(86, 30).addBox(-1.0F, -2.5F, -0.65F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(1.2202F, 1.384F, -8.8139F, 1.5941F, 0.2952F, 1.2335F));

		PartDefinition cube_r683 = Jaw.addOrReplaceChild("cube_r683", CubeListBuilder.create().texOffs(60, 104).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(1.2202F, 1.384F, -8.8139F, 1.3561F, 0.2055F, 0.3352F));

		PartDefinition cube_r684 = Jaw.addOrReplaceChild("cube_r684", CubeListBuilder.create().texOffs(102, 89).addBox(-0.9004F, -3.7409F, -0.5053F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(2.2F, 2.3224F, -4.8558F, 1.4434F, 0.2055F, 0.3352F));

		PartDefinition cube_r685 = Jaw.addOrReplaceChild("cube_r685", CubeListBuilder.create().texOffs(63, 98).addBox(-0.9004F, -2.7947F, -0.3603F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(2.2F, 2.3224F, -4.8558F, 1.4958F, 0.2055F, 0.3352F));

		PartDefinition cube_r686 = Jaw.addOrReplaceChild("cube_r686", CubeListBuilder.create().texOffs(96, 45).addBox(-0.9004F, -1.8463F, -0.2332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(2.2F, 2.3224F, -4.8558F, 1.5656F, 0.2055F, 0.3352F));

		PartDefinition cube_r687 = Jaw.addOrReplaceChild("cube_r687", CubeListBuilder.create().texOffs(98, 9).addBox(-0.9004F, -0.9002F, -0.111F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(2.2F, 2.3224F, -4.8558F, 1.7052F, 0.2055F, 0.3352F));

		PartDefinition cube_r688 = Jaw.addOrReplaceChild("cube_r688", CubeListBuilder.create().texOffs(98, 6).addBox(-1.0F, -5.5922F, -1.9655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(3.2F, -0.1776F, 0.4442F, 1.7231F, 0.0192F, 0.3136F));

		PartDefinition cube_r689 = Jaw.addOrReplaceChild("cube_r689", CubeListBuilder.create().texOffs(98, 15).addBox(-1.0F, 0.4731F, -4.8027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(3.2F, -0.1776F, 0.4442F, 0.257F, 0.0192F, 0.3136F));

		PartDefinition cube_r690 = Jaw.addOrReplaceChild("cube_r690", CubeListBuilder.create().texOffs(98, 3).addBox(-1.0F, 3.0156F, -0.1422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(3.2F, -0.1776F, 0.4442F, -1.1567F, 0.0192F, 0.3136F));

		PartDefinition cube_r691 = Jaw.addOrReplaceChild("cube_r691", CubeListBuilder.create().texOffs(32, 77).addBox(-1.0F, -1.2764F, 0.9449F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(3.2F, -0.1776F, 0.4442F, -2.8672F, 0.0192F, 0.3136F));

		PartDefinition cube_r692 = Jaw.addOrReplaceChild("cube_r692", CubeListBuilder.create().texOffs(77, 4).addBox(-1.0F, 2.1538F, 0.2869F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(3.2F, -0.1776F, 0.4442F, -1.7065F, 0.0192F, 0.3136F));

		PartDefinition cube_r693 = Jaw.addOrReplaceChild("cube_r693", CubeListBuilder.create().texOffs(82, 95).addBox(-1.0F, -1.3818F, 1.1977F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(3.2F, -0.1776F, 0.4442F, 2.9622F, 0.0192F, 0.3136F));

		PartDefinition cube_r694 = Jaw.addOrReplaceChild("cube_r694", CubeListBuilder.create().texOffs(67, 95).addBox(-1.0F, -1.1449F, 0.46F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(3.2F, -0.1776F, 0.4442F, 3.1368F, 0.0192F, 0.3136F));

		PartDefinition cube_r695 = Jaw.addOrReplaceChild("cube_r695", CubeListBuilder.create().texOffs(42, 95).addBox(-1.0F, -1.2334F, 0.8646F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(3.2F, -0.1776F, 0.4442F, -2.841F, 0.0192F, 0.3136F));

		PartDefinition cube_r696 = Jaw.addOrReplaceChild("cube_r696", CubeListBuilder.create().texOffs(77, 95).addBox(-1.0F, -0.9146F, -1.2334F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(3.2F, -0.1776F, 0.4442F, 1.8714F, 0.0192F, 0.3136F));

		PartDefinition cube_r697 = Jaw.addOrReplaceChild("cube_r697", CubeListBuilder.create().texOffs(72, 95).addBox(-1.0F, -0.0105F, -0.7554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(3.2F, -0.1776F, 0.4442F, 0.9987F, 0.0192F, 0.3136F));

		PartDefinition cube_r698 = Jaw.addOrReplaceChild("cube_r698", CubeListBuilder.create().texOffs(95, 87).addBox(-1.0F, -0.1291F, -0.7982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(3.2F, -0.1776F, 0.4442F, 0.4664F, 0.0192F, 0.3136F));

		return LayerDefinition.create(meshdefinition, 112, 112);
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