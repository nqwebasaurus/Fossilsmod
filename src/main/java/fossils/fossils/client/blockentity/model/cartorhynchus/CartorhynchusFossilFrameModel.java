package fossils.fossils.client.blockentity.model.cartorhynchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CartorhynchusFossilFrameModel extends SkullModelBase {
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

	public CartorhynchusFossilFrameModel(ModelPart root) {
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

		PartDefinition cube_r1 = Body1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(38, 38).addBox(-0.5F, 0.2F, -4.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4693F, 2.2623F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Body2 = Body1.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.626F, 3.6368F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Body2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(60, 61).addBox(3.6F, -0.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, 4.4647F, 3.0171F, -1.5708F, 0.1484F, 1.5708F));

		PartDefinition cube_r3 = Body2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(61, 62).addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.1F, -0.6782F, 3.7857F, -1.7191F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Body2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(67, 68).addBox(-1.5F, 0.65F, -0.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.7432F, -0.1995F, 0.2443F, 0.0F, 0.0F));

		PartDefinition HindlimbL3 = Body2.addOrReplaceChild("HindlimbL3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8067F, 8.4022F, 2.3403F, 0.5341F, -0.431F, -0.1594F));

		PartDefinition HindlimbL4 = HindlimbL3.addOrReplaceChild("HindlimbL4", CubeListBuilder.create(), PartPose.offset(8.3077F, 5.8284F, -1.4122F));

		PartDefinition HindlimbL5 = Body2.addOrReplaceChild("HindlimbL5", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8067F, 8.4022F, 2.3403F, 0.8724F, -0.0901F, -0.0353F));

		PartDefinition HindlimbL6 = HindlimbL5.addOrReplaceChild("HindlimbL6", CubeListBuilder.create(), PartPose.offset(-8.3077F, 5.8284F, -1.4122F));

		PartDefinition bone2 = Body2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-1.5F, 6.3181F, 3.8697F));

		PartDefinition bone3 = Body2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(1.5F, 6.3181F, 3.8697F));

		PartDefinition body = Body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -1.5432F, 2.7005F, 0.0876F, 0.0869F, 0.0076F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(25, 56).addBox(-1.5F, 0.7497F, 3.3426F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(22, 53).addBox(-1.5F, 0.7497F, -0.3574F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition body12 = body.addOrReplaceChild("body12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.035F, 0.0872F, -0.0031F));

		PartDefinition cube_r6 = body12.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(9, 68).addBox(-1.5F, 0.7247F, 3.9676F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Body3 = body12.addOrReplaceChild("Body3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.3503F, 2.858F, 0.1577F, 0.0862F, 0.0137F));

		PartDefinition cube_r7 = Body3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(53, 38).addBox(-1.475F, 0.725F, -0.125F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.4734F, 0.0323F, -0.192F, 0.0F, 0.0F));

		PartDefinition body13 = Body3.addOrReplaceChild("body13", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.3675F, 3.9427F, -0.0524F, 0.0436F, -0.0023F));

		PartDefinition cube_r8 = body13.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(36, 56).addBox(-1.45F, 0.75F, 7.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(33, 53).addBox(-1.45F, 0.75F, 3.575F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.8409F, -3.9104F, -0.192F, 0.0F, 0.0F));

		PartDefinition Body10 = body13.addOrReplaceChild("Body10", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.8621F, 4.0428F, -0.0611F, 0.0436F, -0.0027F));

		PartDefinition cube_r9 = Body10.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(52, 46).addBox(-1.45F, 0.775F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.1886F, -0.101F, -0.192F, 0.0F, 0.0F));

		PartDefinition body14 = Body10.addOrReplaceChild("body14", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.7273F, 3.8094F, -0.0438F, -0.0872F, 0.0038F));

		PartDefinition cube_r10 = body14.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(55, 55).addBox(-1.5F, 0.775F, 7.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(52, 52).addBox(-1.5F, 0.775F, 3.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.9159F, -3.9104F, -0.192F, 0.0F, 0.0F));

		PartDefinition Body11 = body14.addOrReplaceChild("Body11", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.9985F, 3.9191F, 0.0088F, -0.0873F, -0.0008F));

		PartDefinition cube_r11 = Body11.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(25, 6).addBox(-1.5F, 0.8F, 0.175F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.3939F, -0.0572F, -0.192F, 0.0F, 0.0F));

		PartDefinition Body4 = Body11.addOrReplaceChild("Body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5468F, 7.7055F, 0.044F, -0.1308F, -0.0057F));

		PartDefinition cube_r12 = Body4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(14, 55).addBox(-1.5F, 0.7352F, 3.6357F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(11, 52).addBox(-1.5F, 0.7352F, -0.0644F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.3887F, -0.0833F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r13 = Body4.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(8, 49).addBox(0.4F, -0.5F, -3.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.2035F, 0.9242F, -1.5708F, 0.2094F, 1.5708F));

		PartDefinition cube_r14 = Body4.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(12, 53).addBox(-0.5F, 0.8F, 0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 1.3219F, 2.6532F, -1.7802F, 0.0F, 0.0F));

		PartDefinition tail = Body4.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5204F, 3.9477F, -0.1051F, -0.0868F, 0.0091F));

		PartDefinition cube_r15 = tail.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(68, 5).addBox(-1.5F, -0.2354F, 0.2445F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.8908F, -0.231F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Body5 = tail.addOrReplaceChild("Body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3726F, 2.8652F, 0.0345F, -0.0897F, 0.0137F));

		PartDefinition cube_r16 = Body5.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 49).addBox(-1.5F, 0.85F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.3629F, -0.0655F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Body6 = Body5.addOrReplaceChild("Body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0725F, 3.9045F, 0.044F, -0.1308F, -0.0057F));

		PartDefinition cube_r17 = Body6.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(64, 14).addBox(-1.55F, 0.85F, 3.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(61, 12).addBox(-1.55F, 0.85F, -0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.3629F, -0.0655F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Body7 = Body6.addOrReplaceChild("Body7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0611F, 3.9796F, 0.0903F, -0.2608F, -0.0233F));

		PartDefinition cube_r18 = Body7.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(3, 58).addBox(-0.5F, -0.5F, 1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 55).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.025F, 1.0165F, 1.6107F, -0.0175F, 0.0349F, -0.0006F));

		PartDefinition Body8 = Body7.addOrReplaceChild("Body8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0603F, 4.0045F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r19 = Body8.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(57, 6).addBox(-1.45F, 0.85F, 0.075F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.3629F, -0.0655F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Body15 = Body8.addOrReplaceChild("Body15", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0638F, 3.9046F, -0.0177F, 0.1745F, -0.0031F));

		PartDefinition cube_r20 = Body15.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(14, 61).addBox(-0.15F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3987F, 1.3985F, 3.5399F, -0.0177F, 0.1658F, -0.0029F));

		PartDefinition cube_r21 = Body15.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(11, 58).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.075F, 0.9869F, 0.0109F, -0.0175F, -0.0349F, 0.0006F));

		PartDefinition Body16 = Body15.addOrReplaceChild("Body16", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0698F, 3.9994F, -0.0903F, 0.2608F, -0.0233F));

		PartDefinition cube_r22 = Body16.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(44, 58).addBox(-1.5F, 0.85F, 0.05F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.3629F, 0.0345F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Body17 = Body16.addOrReplaceChild("Body17", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.25F, 4.0F, -0.0715F, 0.2176F, -0.0155F));

		PartDefinition cube_r23 = Body17.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(58, 61).addBox(-0.15F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.35F, 1.7246F, 3.5986F, -0.0175F, 0.1047F, -0.0018F));

		PartDefinition cube_r24 = Body17.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(55, 58).addBox(-1.5F, 0.875F, -0.25F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.063F, 0.0293F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Body18 = Body17.addOrReplaceChild("Body18", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3797F, 3.9718F, -0.0181F, 0.2618F, -0.0047F));

		PartDefinition cube_r25 = Body18.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(59, 21).addBox(-1.5F, 0.85F, 0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.3629F, 0.0345F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Body9 = Body18.addOrReplaceChild("Body9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2122F, 3.942F, -0.1139F, 0.0867F, -0.0099F));

		PartDefinition cube_r26 = Body9.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(25, 62).addBox(-0.15F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.35F, 1.5512F, 3.7857F, 0.0176F, 0.1309F, 0.0023F));

		PartDefinition cube_r27 = Body9.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(22, 59).addBox(-1.5F, 0.25F, -0.25F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.5141F, 0.1671F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Body19 = Body9.addOrReplaceChild("Body19", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0007F, 4.0244F, -0.0975F, 0.1737F, -0.0169F));

		PartDefinition cube_r28 = Body19.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 61).addBox(-1.5F, 0.25F, 0.175F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.4149F, 0.1461F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Body20 = Body19.addOrReplaceChild("Body20", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1209F, 4.003F, -0.0177F, 0.1745F, -0.0031F));

		PartDefinition cube_r29 = Body20.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(46, 22).addBox(-1.5F, 0.7838F, -0.0096F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.0644F, 0.0326F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body21 = Body20.addOrReplaceChild("Body21", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.125F, 5.0F, -0.0886F, 0.1739F, -0.0154F));

		PartDefinition cube_r30 = Body21.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(26, 46).addBox(-1.5F, 0.7838F, -0.3096F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.0644F, 0.0326F, -0.0262F, 0.0F, 0.0F));

		PartDefinition bone = Body4.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4927F, 3.8325F, 0.1828F, 0.2182F, 0.0F, 0.0F));

		PartDefinition bone4 = Body4.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4927F, 3.8325F, 0.1828F, 0.2182F, 0.0F, 0.0F));

		PartDefinition HindlimbL = Body4.addOrReplaceChild("HindlimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.189F, 3.7291F, 0.2526F, 0.5782F, -0.8588F, -0.1187F));

		PartDefinition HindlimbL2 = HindlimbL.addOrReplaceChild("HindlimbL2", CubeListBuilder.create(), PartPose.offset(7.6077F, 5.3283F, -1.4123F));

		PartDefinition HindlimbL7 = Body4.addOrReplaceChild("HindlimbL7", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.189F, 3.7291F, 0.2526F, 0.3721F, 0.1897F, -0.2667F));

		PartDefinition HindlimbL8 = HindlimbL7.addOrReplaceChild("HindlimbL8", CubeListBuilder.create(), PartPose.offset(-7.6077F, 5.3283F, -1.4123F));

		PartDefinition Head = Cartorhynchus.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0536F, 1.0848F, -19.2102F, -0.2629F, -0.1815F, -0.0716F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.4464F, 0.454F, -6.2482F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.5536F, 0.454F, -6.2482F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0536F, 5.0324F, 1.2273F, 0.384F, 0.0F, 0.0F));

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