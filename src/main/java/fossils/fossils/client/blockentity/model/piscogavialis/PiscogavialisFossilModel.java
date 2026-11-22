package fossils.fossils.client.blockentity.model.piscogavialis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PiscogavialisFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone9;
	private final ModelPart backleftleg;
	private final ModelPart backleftleg2;
	private final ModelPart backleftleg3;
	private final ModelPart backleftleg4;
	private final ModelPart backrightleg;
	private final ModelPart backrightleg2;
	private final ModelPart backrightleg3;
	private final ModelPart backrightleg4;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body5;
	private final ModelPart body6;
	private final ModelPart body7;
	private final ModelPart body3;
	private final ModelPart frontleftleg;
	private final ModelPart frontleftleg2;
	private final ModelPart frontleftleg3;
	private final ModelPart frontrightleg;
	private final ModelPart frontrightleg2;
	private final ModelPart frontrightleg3;
	private final ModelPart bone2;
	private final ModelPart bone13;
	private final ModelPart body4;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart bone8;
	private final ModelPart tail7;
	private final ModelPart bone10;
	private final ModelPart tail3;
	private final ModelPart bone7;
	private final ModelPart tail4;
	private final ModelPart bone6;
	private final ModelPart tail5;
	private final ModelPart bone5;
	private final ModelPart tail6;
	private final ModelPart bone4;
	private final ModelPart tail8;
	private final ModelPart bone3;
	private final ModelPart tail9;
	private final ModelPart bone11;
	private final ModelPart tail10;
	private final ModelPart bone12;

	public PiscogavialisFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone9 = this.hips.getChild("bone9");
		this.backleftleg = this.hips.getChild("backleftleg");
		this.backleftleg2 = this.backleftleg.getChild("backleftleg2");
		this.backleftleg3 = this.backleftleg2.getChild("backleftleg3");
		this.backleftleg4 = this.backleftleg3.getChild("backleftleg4");
		this.backrightleg = this.hips.getChild("backrightleg");
		this.backrightleg2 = this.backrightleg.getChild("backrightleg2");
		this.backrightleg3 = this.backrightleg2.getChild("backrightleg3");
		this.backrightleg4 = this.backrightleg3.getChild("backrightleg4");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body5 = this.body2.getChild("body5");
		this.body6 = this.body5.getChild("body6");
		this.body7 = this.body6.getChild("body7");
		this.body3 = this.body7.getChild("body3");
		this.frontleftleg = this.body3.getChild("frontleftleg");
		this.frontleftleg2 = this.frontleftleg.getChild("frontleftleg2");
		this.frontleftleg3 = this.frontleftleg2.getChild("frontleftleg3");
		this.frontrightleg = this.body3.getChild("frontrightleg");
		this.frontrightleg2 = this.frontrightleg.getChild("frontrightleg2");
		this.frontrightleg3 = this.frontrightleg2.getChild("frontrightleg3");
		this.bone2 = this.body3.getChild("bone2");
		this.bone13 = this.body3.getChild("bone13");
		this.body4 = this.body3.getChild("body4");
		this.neck = this.body4.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.bone8 = this.tail2.getChild("bone8");
		this.tail7 = this.tail2.getChild("tail7");
		this.bone10 = this.tail7.getChild("bone10");
		this.tail3 = this.tail7.getChild("tail3");
		this.bone7 = this.tail3.getChild("bone7");
		this.tail4 = this.tail3.getChild("tail4");
		this.bone6 = this.tail4.getChild("bone6");
		this.tail5 = this.tail4.getChild("tail5");
		this.bone5 = this.tail5.getChild("bone5");
		this.tail6 = this.tail5.getChild("tail6");
		this.bone4 = this.tail6.getChild("bone4");
		this.tail8 = this.tail6.getChild("tail8");
		this.bone3 = this.tail8.getChild("bone3");
		this.tail9 = this.tail8.getChild("tail9");
		this.bone11 = this.tail9.getChild("bone11");
		this.tail10 = this.tail9.getChild("tail10");
		this.bone12 = this.tail10.getChild("bone12");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.5F, 2.4F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -13.7131F, 38.5269F, 0.2749F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(74, 26).mirror().addBox(-0.4F, 0.2947F, -0.4671F, 2.0F, 0.0F, 11.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(159, 23).addBox(2.5F, -3.1176F, 2.7432F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(74, 26).addBox(3.4F, 0.2947F, -0.4671F, 2.0F, 0.0F, 11.0F, new CubeDeformation(0.001F))
				.texOffs(0, 46).addBox(1.5F, -0.5176F, -0.2568F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.5F, -1.0F, -4.9F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-6.6393F, -0.6211F, 0.1157F, 7.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -4.6042F, -5.5934F, -0.0564F, -0.0086F, -0.3013F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 32).addBox(-0.3607F, -0.6211F, 0.1157F, 7.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -4.6042F, -5.5934F, -0.0564F, 0.0086F, 0.3013F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(153, 54).addBox(0.0F, -2.5F, -1.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6652F, 4.9014F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(33, 159).addBox(0.0F, -2.3F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0097F, 1.9196F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(14, 159).addBox(0.5F, -2.9176F, -0.2568F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0F, -4.9F, -0.1047F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, 0.5307F, 1.8944F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(179, 9).addBox(0.5F, -0.0176F, -1.9568F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.1F, 0.4186F, 3.2729F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(157, 173).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.9F, 2.8079F, -3.5466F, -1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(155, 177).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.9F, 1.8662F, -3.489F, -2.1904F, 0.0F, 0.0F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(168, 151).addBox(0.0F, -0.2361F, -1.5757F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4F, 1.76F, -2.1795F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(153, 34).addBox(0.0F, -0.2611F, -0.9007F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.4F, -0.0888F, -2.5559F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(153, 63).addBox(0.0F, 0.6639F, -1.6007F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4F, -0.9879F, -0.3306F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(38, 152).addBox(0.0F, -0.0361F, -2.0007F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4F, -0.9879F, -0.3306F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(7, 159).addBox(0.0F, -0.0361F, -2.0007F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.4F, -0.7096F, 1.6499F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(78, 177).addBox(0.0857F, 0.9144F, -3.6629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(177, 63).addBox(0.0857F, 0.9144F, -4.0629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.1644F, 4.1732F, -3.6932F, 0.6249F, 0.0989F, 0.3818F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(70, 158).addBox(0.0857F, 2.3863F, -4.5764F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1644F, 4.1732F, -3.6932F, 0.1886F, 0.0989F, 0.3818F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(53, 170).addBox(0.0857F, 2.8785F, 0.3174F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.1644F, 4.1732F, -3.6932F, -0.9022F, 0.0989F, 0.3818F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(75, 166).addBox(0.0857F, 0.3888F, -0.0111F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1644F, 4.1732F, -3.6932F, -0.7975F, 0.0989F, 0.3818F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(173, 169).addBox(0.0857F, -1.1141F, -0.1077F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1644F, 4.1732F, -3.6932F, -0.6666F, 0.0989F, 0.3818F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(178, 119).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.9F, 0.2198F, 0.3468F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(22, 172).addBox(-0.5F, -1.0F, -2.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9F, 2.1044F, 1.2405F, -1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(144, 55).addBox(-0.5F, -1.5204F, -0.9359F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.65F, 2.8891F, -1.81F, 0.0262F, 0.0F, 0.2443F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(131, 171).addBox(-0.5068F, -0.1725F, -1.3489F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5517F, 5.0053F, 0.1884F, -0.3277F, -0.0929F, 0.4822F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(110, 171).addBox(-0.5068F, -0.2913F, -0.7361F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(159, 5).addBox(-0.5068F, 0.7001F, 0.2402F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5517F, 5.0053F, 0.1884F, -0.1096F, -0.0929F, 0.4822F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(37, 174).addBox(-0.5068F, -0.5281F, -0.2874F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5517F, 5.0053F, 0.1884F, 0.5886F, -0.0929F, 0.4822F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(66, 150).addBox(-0.5068F, -2.9915F, -1.2405F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5517F, 5.0053F, 0.1884F, 0.3268F, -0.0929F, 0.4822F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(169, 70).addBox(-0.5F, -0.2783F, 0.336F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(169, 66).addBox(-0.5F, -0.2783F, -0.164F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.65F, 2.8891F, -1.81F, -1.2392F, 0.0F, 0.2443F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(26, 152).addBox(-0.5F, -0.9578F, -1.3802F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.65F, 2.8891F, -1.81F, -0.4102F, 0.0F, 0.2443F));

		PartDefinition bone9 = hips.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, 0.5307F, 1.8944F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r29 = bone9.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(179, 9).mirror().addBox(-1.5F, -0.0176F, -1.9568F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.4186F, 3.2729F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r30 = bone9.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(157, 173).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 2.8079F, -3.5466F, -1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r31 = bone9.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(155, 177).mirror().addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.8662F, -3.489F, -2.1904F, 0.0F, 0.0F));

		PartDefinition cube_r32 = bone9.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(168, 151).mirror().addBox(-1.0F, -0.2361F, -1.5757F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.76F, -2.1795F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r33 = bone9.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(153, 34).mirror().addBox(-1.0F, -0.2611F, -0.9007F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0888F, -2.5559F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r34 = bone9.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(153, 63).mirror().addBox(-1.0F, 0.6639F, -1.6007F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.9879F, -0.3306F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r35 = bone9.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(38, 152).mirror().addBox(-1.0F, -0.0361F, -2.0007F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.9879F, -0.3306F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r36 = bone9.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(7, 159).mirror().addBox(-1.0F, -0.0361F, -2.0007F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.7096F, 1.6499F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r37 = bone9.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(78, 177).mirror().addBox(-1.0857F, 0.9144F, -3.6629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(177, 63).mirror().addBox(-1.0857F, 0.9144F, -4.0629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.1644F, 4.1732F, -3.6932F, 0.6249F, -0.0989F, -0.3818F));

		PartDefinition cube_r38 = bone9.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(70, 158).mirror().addBox(-1.0857F, 2.3863F, -4.5764F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1644F, 4.1732F, -3.6932F, 0.1886F, -0.0989F, -0.3818F));

		PartDefinition cube_r39 = bone9.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(53, 170).mirror().addBox(-1.0857F, 2.8785F, 0.3174F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.1644F, 4.1732F, -3.6932F, -0.9022F, -0.0989F, -0.3818F));

		PartDefinition cube_r40 = bone9.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(75, 166).mirror().addBox(-1.0857F, 0.3888F, -0.0111F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1644F, 4.1732F, -3.6932F, -0.7975F, -0.0989F, -0.3818F));

		PartDefinition cube_r41 = bone9.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(173, 169).mirror().addBox(-1.0857F, -1.1141F, -0.1077F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1644F, 4.1732F, -3.6932F, -0.6666F, -0.0989F, -0.3818F));

		PartDefinition cube_r42 = bone9.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(178, 119).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2198F, 0.3468F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r43 = bone9.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(22, 172).mirror().addBox(-0.5F, -1.0F, -2.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 2.1044F, 1.2405F, -1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r44 = bone9.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(144, 55).mirror().addBox(-0.5F, -1.5204F, -0.9359F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.65F, 2.8891F, -1.81F, 0.0262F, 0.0F, -0.2443F));

		PartDefinition cube_r45 = bone9.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(131, 171).mirror().addBox(-0.4932F, -0.1725F, -1.3489F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.5517F, 5.0053F, 0.1884F, -0.3277F, 0.0929F, -0.4822F));

		PartDefinition cube_r46 = bone9.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(110, 171).mirror().addBox(-0.4932F, -0.2913F, -0.7361F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(159, 5).mirror().addBox(-0.4932F, 0.7001F, 0.2402F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.5517F, 5.0053F, 0.1884F, -0.1096F, 0.0929F, -0.4822F));

		PartDefinition cube_r47 = bone9.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(37, 174).mirror().addBox(-0.4932F, -0.5281F, -0.2874F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.5517F, 5.0053F, 0.1884F, 0.5886F, 0.0929F, -0.4822F));

		PartDefinition cube_r48 = bone9.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(66, 150).mirror().addBox(-0.4932F, -2.9915F, -1.2405F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.5517F, 5.0053F, 0.1884F, 0.3268F, 0.0929F, -0.4822F));

		PartDefinition cube_r49 = bone9.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(169, 70).mirror().addBox(-0.5F, -0.2783F, 0.336F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(169, 66).mirror().addBox(-0.5F, -0.2783F, -0.164F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.65F, 2.8891F, -1.81F, -1.2392F, 0.0F, -0.2443F));

		PartDefinition cube_r50 = bone9.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(26, 152).mirror().addBox(-0.5F, -0.9578F, -1.3802F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.65F, 2.8891F, -1.81F, -0.4102F, 0.0F, -0.2443F));

		PartDefinition backleftleg = hips.addOrReplaceChild("backleftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.8123F, 3.8742F, 1.0811F, 0.6971F, -0.0381F, -1.0396F));

		PartDefinition cube_r51 = backleftleg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(163, 75).addBox(-0.5F, 0.8F, -1.35F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(163, 45).addBox(-0.5F, 1.4F, -1.35F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0169F, -1.037F, 0.0506F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r52 = backleftleg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(156, 39).addBox(-0.5F, -0.4F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0169F, -1.037F, 0.0506F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r53 = backleftleg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(172, 62).addBox(-0.5F, 0.0F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0169F, 0.5672F, -0.1408F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r54 = backleftleg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 171).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0169F, 0.4119F, 0.4388F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r55 = backleftleg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(148, 106).addBox(-0.5F, -3.3F, -0.425F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-0.0169F, 5.008F, 0.9469F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r56 = backleftleg.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(155, 96).addBox(-0.5F, -1.4F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0169F, 11.1635F, 1.9218F, 1.9111F, 0.0F, 0.0F));

		PartDefinition cube_r57 = backleftleg.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(155, 0).addBox(-0.5F, -0.8F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0169F, 11.1635F, 1.9218F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r58 = backleftleg.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(174, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-0.0169F, 9.8517F, 0.8405F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r59 = backleftleg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(174, 13).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0009F)), PartPose.offsetAndRotation(-0.0169F, 8.7041F, 0.4897F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r60 = backleftleg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(55, 151).addBox(-0.5F, 0.2F, -0.775F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0169F, 4.2489F, 0.8456F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r61 = backleftleg.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(52, 174).addBox(-0.5F, 0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0169F, 2.266F, 0.5845F, 0.1309F, 0.0F, 0.0F));

		PartDefinition backleftleg2 = backleftleg.addOrReplaceChild("backleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.164F, 13.4336F, 3.3888F, 0.8886F, -0.2587F, 0.5623F));

		PartDefinition cube_r62 = backleftleg2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(151, 40).addBox(-0.5F, -5.7F, -0.2F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.9456F, 5.2556F, -0.2371F, -0.2618F, 0.0F, 0.0436F));

		PartDefinition cube_r63 = backleftleg2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(9, 151).addBox(-0.5F, -5.7F, -0.2F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9456F, 5.2556F, -0.2371F, -0.1745F, 0.0F, 0.0436F));

		PartDefinition cube_r64 = backleftleg2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(158, 112).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.0728F, 8.168F, -0.191F, -0.0873F, 0.0F, 0.0436F));

		PartDefinition cube_r65 = backleftleg2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(158, 106).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9132F, 4.5138F, -1.4326F, -0.0436F, 0.0F, 0.0436F));

		PartDefinition cube_r66 = backleftleg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(146, 154).addBox(-0.5F, -2.5F, -0.625F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.8087F, 2.1191F, -0.4866F, -0.1309F, 0.0F, 0.0436F));

		PartDefinition backleftleg3 = backleftleg2.addOrReplaceChild("backleftleg3", CubeListBuilder.create().texOffs(137, 121).addBox(-1.0372F, 0.1135F, -4.0058F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.1784F, 9.2152F, 0.0363F, 1.2305F, -0.1571F, 0.0873F));

		PartDefinition cube_r67 = backleftleg3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(75, 132).addBox(-0.5F, -0.5F, -4.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3685F, 0.6135F, -0.0664F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r68 = backleftleg3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(88, 138).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1685F, 0.6135F, -3.1841F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r69 = backleftleg3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(28, 128).addBox(-0.5F, -0.5F, -1.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5628F, 0.6135F, -3.1058F, 0.0F, -0.1309F, 0.0F));

		PartDefinition backleftleg4 = backleftleg3.addOrReplaceChild("backleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1628F, 0.1135F, -4.6058F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r70 = backleftleg4.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(101, 115).addBox(0.1F, -0.5F, -5.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.1F, 0.5F, -1.3F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r71 = backleftleg4.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(114, 64).addBox(-0.3484F, -0.5F, -6.9619F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.8502F, 0.5F, 1.1844F, 0.0F, -0.7418F, 0.0F));

		PartDefinition cube_r72 = backleftleg4.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(57, 116).addBox(-0.9471F, -0.5F, -6.4908F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.1932F, 0.5F, -0.6956F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r73 = backleftleg4.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(63, 106).addBox(0.0529F, -0.5F, -8.0908F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.02F, 0.5F, 0.0855F, 0.0F, -0.3927F, 0.0F));

		PartDefinition backrightleg = hips.addOrReplaceChild("backrightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.8123F, 3.8742F, 1.0811F, -1.0665F, -0.1477F, 1.3694F));

		PartDefinition cube_r74 = backrightleg.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(103, 163).addBox(-0.5F, 0.8F, -1.35F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(89, 163).addBox(-0.5F, 1.4F, -1.35F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0169F, -1.037F, 0.0506F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r75 = backrightleg.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(156, 44).addBox(-0.5F, -0.4F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0169F, -1.037F, 0.0506F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r76 = backrightleg.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(173, 138).addBox(-0.5F, 0.0F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0169F, 0.5672F, -0.1408F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r77 = backrightleg.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(74, 171).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0169F, 0.4119F, 0.4388F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r78 = backrightleg.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(148, 121).addBox(-0.5F, -3.3F, -0.425F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0169F, 5.008F, 0.9469F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r79 = backrightleg.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(155, 101).addBox(-0.5F, -1.4F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0169F, 11.1635F, 1.9218F, 1.9111F, 0.0F, 0.0F));

		PartDefinition cube_r80 = backrightleg.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(155, 13).addBox(-0.5F, -0.8F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0169F, 11.1635F, 1.9218F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r81 = backrightleg.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(8, 174).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0169F, 9.8517F, 0.8405F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r82 = backrightleg.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(32, 174).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0009F)), PartPose.offsetAndRotation(0.0169F, 8.7041F, 0.4897F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r83 = backrightleg.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(60, 151).addBox(-0.5F, 0.2F, -0.775F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0169F, 4.2489F, 0.8456F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r84 = backrightleg.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(174, 66).addBox(-0.5F, 0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0169F, 2.266F, 0.5845F, 0.1309F, 0.0F, 0.0F));

		PartDefinition backrightleg2 = backrightleg.addOrReplaceChild("backrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.164F, 13.4336F, 3.3888F, 1.7177F, 0.2587F, -0.5623F));

		PartDefinition cube_r85 = backrightleg2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(50, 151).addBox(-0.5F, -5.7F, -0.2F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.9456F, 5.2556F, -0.2371F, -0.2618F, 0.0F, -0.0436F));

		PartDefinition cube_r86 = backrightleg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(45, 151).addBox(-0.5F, -5.7F, -0.2F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9456F, 5.2556F, -0.2371F, -0.1745F, 0.0F, -0.0436F));

		PartDefinition cube_r87 = backrightleg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(158, 130).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.0728F, 8.168F, -0.191F, -0.0873F, 0.0F, -0.0436F));

		PartDefinition cube_r88 = backrightleg2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(158, 118).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9132F, 4.5138F, -1.4326F, -0.0436F, 0.0F, -0.0436F));

		PartDefinition cube_r89 = backrightleg2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(155, 68).addBox(-0.5F, -2.5F, -0.625F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8087F, 2.1191F, -0.4866F, -0.1309F, 0.0F, -0.0436F));

		PartDefinition backrightleg3 = backrightleg2.addOrReplaceChild("backrightleg3", CubeListBuilder.create().texOffs(135, 138).addBox(0.0372F, 0.1135F, -4.0058F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.1784F, 9.2152F, 0.0363F, 0.925F, 0.1571F, -0.0873F));

		PartDefinition cube_r90 = backrightleg3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(109, 132).addBox(-0.5F, -0.5F, -4.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3685F, 0.6135F, -0.0664F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r91 = backrightleg3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(59, 139).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1685F, 0.6135F, -3.1841F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r92 = backrightleg3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(129, 73).addBox(-0.5F, -0.5F, -1.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5628F, 0.6135F, -3.1058F, 0.0F, 0.1309F, 0.0F));

		PartDefinition backrightleg4 = backrightleg3.addOrReplaceChild("backrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1628F, 0.1135F, -4.6058F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r93 = backrightleg4.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(116, 32).addBox(-1.1F, -0.5F, -5.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.1F, 0.5F, -1.3F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r94 = backrightleg4.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(17, 116).addBox(-0.6516F, -0.5F, -6.9619F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.8502F, 0.5F, 1.1844F, 0.0F, 0.7418F, 0.0F));

		PartDefinition cube_r95 = backrightleg4.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(74, 116).addBox(-0.0529F, -0.5F, -6.4908F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.1932F, 0.5F, -0.6956F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r96 = backrightleg4.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(82, 106).addBox(-1.0529F, -0.5F, -8.0908F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.02F, 0.5F, 0.0855F, 0.0F, 0.3927F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.35F, -4.9F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(37, 0).mirror().addBox(-5.82F, -0.371F, -1.3392F, 7.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -3.9301F, -9.9485F, -0.0666F, -0.021F, -0.3047F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(37, 0).addBox(-1.18F, -0.371F, -1.3392F, 7.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.9301F, -9.9485F, -0.0666F, 0.021F, 0.3047F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(163, 116).addBox(0.0F, -2.8F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0411F, -2.0457F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(163, 104).addBox(0.0F, -2.9F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2156F, -4.9986F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(163, 110).addBox(0.0F, -2.8F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.594F, -7.9897F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(0, 19).addBox(-6.0F, -1.8F, -0.5F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, 10.9885F, -10.3842F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(50, 86).addBox(-2.0F, 0.0F, -0.1F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, -0.6005F, -9.8782F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(23, 96).addBox(-1.0F, -0.4F, -8.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.001F))
				.texOffs(39, 32).addBox(-5.0F, 9.4F, -8.0F, 10.0F, 2.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.1505F, -9.9782F, 0.0176F, 0.1309F, 0.0023F));

		PartDefinition cube_r104 = body2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(131, 71).mirror().addBox(-10.3036F, -3.6003F, 0.0F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6F, -7.5F, 0.2198F, 0.4201F, -1.0603F));

		PartDefinition cube_r105 = body2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(160, 37).mirror().addBox(-4.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6F, -7.5F, 0.4277F, 0.2038F, -0.4085F));

		PartDefinition cube_r106 = body2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(172, 157).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6F, -7.5F, 0.471F, 0.0118F, -0.0137F));

		PartDefinition cube_r107 = body2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(133, 32).mirror().addBox(-10.3036F, -3.6003F, 0.0F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, -4.3F, 0.2069F, 0.4265F, -1.0979F));

		PartDefinition cube_r108 = body2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(160, 67).mirror().addBox(-4.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, -4.3F, 0.4221F, 0.216F, -0.4419F));

		PartDefinition cube_r109 = body2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(172, 159).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, -4.3F, 0.4706F, 0.0251F, -0.046F));

		PartDefinition cube_r110 = body2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(142, 73).mirror().addBox(-8.3036F, -3.6003F, 0.0F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, -1.4F, 0.226F, 0.4959F, -1.1207F));

		PartDefinition cube_r111 = body2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(160, 69).mirror().addBox(-4.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, -1.4F, 0.4798F, 0.2605F, -0.4595F));

		PartDefinition cube_r112 = body2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(172, 161).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, -1.4F, 0.5394F, 0.0449F, -0.0749F));

		PartDefinition cube_r113 = body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(56, 66).mirror().addBox(-3.0F, -0.5F, -8.0F, 7.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7108F, -3.0004F, -0.5908F, -0.0187F, 0.0079F, -0.3053F));

		PartDefinition cube_r114 = body2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(56, 66).addBox(-4.0F, -0.5F, -8.0F, 7.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7108F, -3.0004F, -0.5908F, -0.0187F, -0.0079F, 0.3053F));

		PartDefinition cube_r115 = body2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(172, 161).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, -1.4F, 0.5394F, -0.0449F, 0.0749F));

		PartDefinition cube_r116 = body2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(160, 69).addBox(1.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, -1.4F, 0.4798F, -0.2605F, 0.4595F));

		PartDefinition cube_r117 = body2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(142, 73).addBox(3.3036F, -3.6003F, 0.0F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, -1.4F, 0.226F, -0.4959F, 1.1207F));

		PartDefinition cube_r118 = body2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(172, 159).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, -4.3F, 0.4706F, -0.0251F, 0.046F));

		PartDefinition cube_r119 = body2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(160, 67).addBox(1.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, -4.3F, 0.4221F, -0.216F, 0.4419F));

		PartDefinition cube_r120 = body2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(133, 32).addBox(3.3036F, -3.6003F, 0.0F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, -4.3F, 0.2069F, -0.4265F, 1.0979F));

		PartDefinition cube_r121 = body2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(172, 157).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6F, -7.5F, 0.471F, -0.0118F, 0.0137F));

		PartDefinition cube_r122 = body2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(160, 37).addBox(1.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6F, -7.5F, 0.4277F, -0.2038F, 0.4085F));

		PartDefinition cube_r123 = body2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(131, 71).addBox(3.3036F, -3.6003F, 0.0F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6F, -7.5F, 0.2198F, -0.4201F, 1.0603F));

		PartDefinition cube_r124 = body2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(65, 156).addBox(0.0F, -2.9F, -1.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.32F, -0.9721F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r125 = body2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(153, 106).addBox(0.0F, -3.2546F, 6.0321F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3282F, -11.0075F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r126 = body2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(103, 156).addBox(0.0F, -3.0F, -1.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4771F, -6.9701F, -0.0698F, 0.0F, 0.0F));

		PartDefinition body5 = body2.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(117, 92).addBox(-2.0F, -0.6F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, 0.2F, -8.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r127 = body5.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(168, 31).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.0F, -4.5F, 0.3486F, 0.0163F, -0.0314F));

		PartDefinition cube_r128 = body5.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(168, 87).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.0F, -1.5F, 0.3835F, 0.0174F, -0.0308F));

		PartDefinition cube_r129 = body5.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(157, 61).mirror().addBox(-4.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.0F, -1.5F, 0.3436F, 0.1747F, -0.4402F));

		PartDefinition cube_r130 = body5.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(120, 113).mirror().addBox(-10.3036F, -3.6003F, -1.0F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.0F, -1.5F, 0.1681F, 0.3468F, -1.0955F));

		PartDefinition cube_r131 = body5.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(158, 124).mirror().addBox(-4.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.0F, -4.5F, 0.3116F, 0.1598F, -0.4455F));

		PartDefinition cube_r132 = body5.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(74, 38).mirror().addBox(-11.3036F, -3.6003F, -1.0F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.0F, -4.5F, 0.1513F, 0.3157F, -1.101F));

		PartDefinition cube_r133 = body5.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(89, 56).mirror().addBox(-3.0F, -0.5F, -6.0F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8156F, -3.3331F, -0.522F, -0.0623F, 0.0079F, -0.3053F));

		PartDefinition cube_r134 = body5.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(89, 56).addBox(-4.0F, -0.5F, -6.0F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8156F, -3.3331F, -0.522F, -0.0623F, -0.0079F, 0.3053F));

		PartDefinition cube_r135 = body5.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(56, 57).addBox(-5.0F, -2.0F, -6.0F, 10.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, 11.2F, -0.2F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r136 = body5.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(74, 38).addBox(3.3036F, -3.6003F, -1.0F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.5F, 0.1513F, -0.3157F, 1.101F));

		PartDefinition cube_r137 = body5.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(158, 124).addBox(1.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.5F, 0.3116F, -0.1598F, 0.4455F));

		PartDefinition cube_r138 = body5.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(120, 113).addBox(3.3036F, -3.6003F, -1.0F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.5F, 0.1681F, -0.3468F, 1.0955F));

		PartDefinition cube_r139 = body5.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(157, 61).addBox(1.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.5F, 0.3436F, -0.1747F, 0.4402F));

		PartDefinition cube_r140 = body5.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(168, 87).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.5F, 0.3835F, -0.0174F, 0.0308F));

		PartDefinition cube_r141 = body5.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(151, 154).addBox(0.0F, -3.3546F, 0.0321F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.6067F, -6.0065F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r142 = body5.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(153, 113).addBox(0.0F, -3.2296F, 0.0321F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.5282F, -3.0075F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r143 = body5.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(168, 31).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.5F, 0.3486F, -0.0163F, 0.0314F));

		PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(118, 10).addBox(-2.0F, -0.6F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.044F, 0.1308F, 0.0057F));

		PartDefinition cube_r144 = body6.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(173, 4).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.0F, -4.5F, 0.4882F, 0.0205F, -0.0289F));

		PartDefinition cube_r145 = body6.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(173, 27).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.0F, -1.5F, 0.3835F, 0.0174F, -0.0308F));

		PartDefinition cube_r146 = body6.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(160, 71).mirror().addBox(-4.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.0F, -1.5F, 0.3436F, 0.1747F, -0.4402F));

		PartDefinition cube_r147 = body6.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(87, 74).mirror().addBox(-11.3036F, -3.6003F, -1.0F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.0F, -1.5F, 0.1681F, 0.3468F, -1.0955F));

		PartDefinition cube_r148 = body6.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(160, 73).mirror().addBox(-4.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.0F, -4.5F, 0.4406F, 0.2185F, -0.4212F));

		PartDefinition cube_r149 = body6.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(89, 64).mirror().addBox(-11.3036F, -3.6003F, -1.0F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.0F, -4.5F, 0.221F, 0.4394F, -1.0753F));

		PartDefinition cube_r150 = body6.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(87, 66).mirror().addBox(-3.0F, -0.5F, -6.0F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.9723F, -3.6913F, -0.3375F, -0.0623F, 0.0079F, -0.3053F));

		PartDefinition cube_r151 = body6.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(87, 66).addBox(-4.0F, -0.5F, -6.0F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9723F, -3.6913F, -0.3375F, -0.0623F, -0.0079F, 0.3053F));

		PartDefinition cube_r152 = body6.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(89, 64).addBox(3.3036F, -3.6003F, -1.0F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.5F, 0.221F, -0.4394F, 1.0753F));

		PartDefinition cube_r153 = body6.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(160, 73).addBox(1.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.5F, 0.4406F, -0.2185F, 0.4212F));

		PartDefinition cube_r154 = body6.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(87, 74).addBox(3.3036F, -3.6003F, -1.0F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.5F, 0.1681F, -0.3468F, 1.0955F));

		PartDefinition cube_r155 = body6.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(160, 71).addBox(1.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.5F, 0.3436F, -0.1747F, 0.4402F));

		PartDefinition cube_r156 = body6.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(173, 27).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.5F, 0.3835F, -0.0174F, 0.0308F));

		PartDefinition cube_r157 = body6.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(14, 152).addBox(0.0F, -3.7546F, 0.0321F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.6067F, -6.0065F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r158 = body6.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(154, 86).addBox(0.0F, -3.7296F, 0.0321F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.5282F, -3.0075F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r159 = body6.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(173, 4).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.5F, 0.4882F, -0.0205F, 0.0289F));

		PartDefinition body7 = body6.addOrReplaceChild("body7", CubeListBuilder.create().texOffs(118, 41).addBox(-2.0F, -0.6F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r160 = body7.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(173, 29).mirror().addBox(-2.0029F, 0.0111F, -0.4616F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.2F, -5.0F, 0.7151F, 0.0265F, -0.0235F));

		PartDefinition cube_r161 = body7.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(173, 38).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.0F, -1.5F, 0.5929F, 0.0234F, -0.0266F));

		PartDefinition cube_r162 = body7.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(19, 161).mirror().addBox(-4.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.0F, -1.5F, 0.5395F, 0.2602F, -0.3977F));

		PartDefinition cube_r163 = body7.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(120, 8).mirror().addBox(-11.3036F, -3.6003F, -1.0F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.0F, -1.5F, 0.2786F, 0.5309F, -1.0483F));

		PartDefinition cube_r164 = body7.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(50, 161).mirror().addBox(-4.8199F, -0.8364F, -0.4616F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.2F, -5.0F, 0.6576F, 0.3057F, -0.3647F));

		PartDefinition cube_r165 = body7.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(41, 30).mirror().addBox(-12.3147F, -3.5977F, -0.4616F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.2F, -5.0F, 0.3543F, 0.6355F, -1.0066F));

		PartDefinition cube_r166 = body7.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(75, 89).mirror().addBox(-3.0F, -0.5F, -6.0F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.1289F, -4.0393F, -0.1324F, -0.0623F, 0.0079F, -0.3053F));

		PartDefinition cube_r167 = body7.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(75, 89).addBox(-4.0F, -0.5F, -6.0F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1289F, -4.0393F, -0.1324F, -0.0623F, -0.0079F, 0.3053F));

		PartDefinition cube_r168 = body7.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(41, 30).addBox(3.3147F, -3.5977F, -0.4616F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -5.0F, 0.3543F, -0.6355F, 1.0066F));

		PartDefinition cube_r169 = body7.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(50, 161).addBox(1.8199F, -0.8364F, -0.4616F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -5.0F, 0.6576F, -0.3057F, 0.3647F));

		PartDefinition cube_r170 = body7.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(120, 8).addBox(3.3036F, -3.6003F, -1.0F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.5F, 0.2786F, -0.5309F, 1.0483F));

		PartDefinition cube_r171 = body7.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(19, 161).addBox(1.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.5F, 0.5395F, -0.2602F, 0.3977F));

		PartDefinition cube_r172 = body7.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(173, 38).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.5F, 0.5929F, -0.0234F, 0.0266F));

		PartDefinition cube_r173 = body7.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(83, 150).addBox(0.0F, -4.3546F, 0.0321F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.6067F, -6.0065F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r174 = body7.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(78, 150).addBox(0.0F, -4.1296F, 0.0321F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.5282F, -3.0075F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r175 = body7.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(173, 29).addBox(0.0029F, 0.0111F, -0.4616F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -5.0F, 0.7151F, -0.0265F, 0.0235F));

		PartDefinition body3 = body7.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.0316F, -6.0182F, -0.0476F, 0.0852F, -0.0476F));

		PartDefinition cube_r176 = body3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(168, 120).mirror().addBox(-1.9957F, -0.0266F, -0.4464F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.05F, -2.1F, 0.7762F, 0.0187F, -0.0069F));

		PartDefinition cube_r177 = body3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(158, 152).mirror().addBox(-4.7975F, -0.8675F, -0.4464F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.05F, -2.1F, 0.721F, 0.3183F, -0.33F));

		PartDefinition cube_r178 = body3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(137, 28).mirror().addBox(-12.7047F, 5.2992F, 4.5839F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 6.8363F, -11.4257F, 0.5089F, 0.4774F, 0.4458F));

		PartDefinition cube_r179 = body3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(142, 75).mirror().addBox(-8.8669F, 2.9702F, 4.5839F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 6.8363F, -11.4257F, 0.3571F, 0.5956F, 0.1507F));

		PartDefinition cube_r180 = body3.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(159, 29).mirror().addBox(-4.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0061F, -13.0068F, 1.1536F, 0.4857F, -0.204F));

		PartDefinition cube_r181 = body3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(144, 69).mirror().addBox(-8.4608F, 1.9172F, -0.7251F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 6.8363F, -6.5257F, 0.4712F, 0.4573F, 0.5441F));

		PartDefinition cube_r182 = body3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(142, 77).mirror().addBox(-4.8164F, 0.6134F, -0.7251F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 6.8363F, -6.5257F, 0.3255F, 0.5665F, 0.2488F));

		PartDefinition cube_r183 = body3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(102, 92).mirror().addBox(-10.2613F, 1.2525F, -0.3817F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.767F, 7.8013F, -2.3609F, 0.442F, 0.5584F, 0.3285F));

		PartDefinition cube_r184 = body3.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(135, 6).mirror().addBox(-4.4414F, 0.0294F, -0.3817F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.767F, 7.8013F, -2.3609F, 0.2584F, 0.6552F, 0.0089F));

		PartDefinition cube_r185 = body3.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(120, 111).mirror().addBox(-11.6141F, 1.3231F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.8091F, 8.3426F, -0.4174F, 0.3055F, 0.7099F, 0.3586F));

		PartDefinition cube_r186 = body3.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(144, 61).mirror().addBox(-4.8F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.8091F, 8.3426F, -0.4174F, 0.0547F, 0.7607F, -0.0128F));

		PartDefinition cube_r187 = body3.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(135, 53).mirror().addBox(-4.6F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.9607F, 8.4434F, 1.6961F, 0.2106F, 0.8279F, -0.0199F));

		PartDefinition cube_r188 = body3.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(101, 10).mirror().addBox(-11.4218F, 1.2679F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.9607F, 8.4434F, 1.6961F, 0.4735F, 0.7329F, 0.3512F));

		PartDefinition cube_r189 = body3.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(137, 30).mirror().addBox(-4.6865F, 0.0932F, -0.5337F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.8876F, 8.4888F, 3.6434F, 0.159F, 0.8265F, -0.0561F));

		PartDefinition cube_r190 = body3.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(127, 90).mirror().addBox(-11.4793F, 1.3813F, -0.5337F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.8876F, 8.4888F, 3.6434F, 0.4288F, 0.7444F, 0.3229F));

		PartDefinition cube_r191 = body3.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(139, 8).mirror().addBox(-4.9F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.7527F, 8.6061F, 3.5212F, -0.0642F, 1.0188F, -0.2452F));

		PartDefinition cube_r192 = body3.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(41, 28).mirror().addBox(-14.7102F, 1.3506F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.7527F, 8.6061F, 3.5212F, 0.3689F, 0.9751F, 0.2671F));

		PartDefinition cube_r193 = body3.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(74, 40).mirror().addBox(-11.278F, -3.6088F, -0.4464F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.05F, -2.1F, 0.4062F, 0.6815F, -0.9595F));

		PartDefinition cube_r194 = body3.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(129, 80).mirror().addBox(-10.3036F, -3.6003F, 0.0F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.65F, -5.5F, 0.4317F, 0.7318F, -0.9549F));

		PartDefinition cube_r195 = body3.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(159, 31).mirror().addBox(-4.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.65F, -5.5F, 0.7688F, 0.3476F, -0.3262F));

		PartDefinition cube_r196 = body3.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(168, 146).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.65F, -5.5F, 0.8284F, 0.0325F, -0.0174F));

		PartDefinition cube_r197 = body3.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(102, 94).mirror().addBox(-9.3036F, -3.6003F, 0.0F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.75F, -8.5F, 0.4415F, 0.8009F, -0.9887F));

		PartDefinition cube_r198 = body3.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(50, 159).mirror().addBox(-4.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.75F, -8.5F, 0.8189F, 0.3991F, -0.3485F));

		PartDefinition cube_r199 = body3.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(168, 155).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.75F, -8.5F, 0.8883F, 0.0678F, -0.055F));

		PartDefinition cube_r200 = body3.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(169, 36).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.65F, -10.8F, 1.1155F, 0.0784F, -0.0383F));

		PartDefinition cube_r201 = body3.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(159, 85).mirror().addBox(-6.3036F, -3.6003F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.65F, -10.8F, 0.6653F, 0.9798F, -0.8137F));

		PartDefinition cube_r202 = body3.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(159, 87).mirror().addBox(-4.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.65F, -10.8F, 1.0579F, 0.4661F, -0.2479F));

		PartDefinition cube_r203 = body3.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(171, 11).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0061F, -13.0068F, 1.203F, 0.0815F, -0.0313F));

		PartDefinition cube_r204 = body3.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(89, 159).mirror().addBox(-4.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.206F, -15.0068F, 0.9182F, 0.4301F, -0.3085F));

		PartDefinition cube_r205 = body3.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(171, 25).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.206F, -15.0068F, 0.9844F, 0.0727F, -0.0483F));

		PartDefinition cube_r206 = body3.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(56, 76).mirror().addBox(-2.5F, -0.5F, -7.7F, 6.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8088F, -4.475F, -0.5852F, 0.0166F, 0.0052F, -0.3054F));

		PartDefinition cube_r207 = body3.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(118, 50).mirror().addBox(-1.5F, -0.5F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.855F, -4.6617F, -8.0868F, 0.0004F, 0.0548F, -0.3006F));

		PartDefinition cube_r208 = body3.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(120, 109).mirror().addBox(-12.7102F, 1.3506F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.7527F, 8.6061F, 3.5212F, 0.3783F, 0.8649F, 0.2728F));

		PartDefinition cube_r209 = body3.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(140, 88).mirror().addBox(-4.9F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.7527F, 8.6061F, 3.5212F, 0.0341F, 0.9233F, -0.1658F));

		PartDefinition cube_r210 = body3.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(118, 50).addBox(-2.5F, -0.5F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.855F, -4.6617F, -8.0868F, 0.0004F, -0.0548F, 0.3006F));

		PartDefinition cube_r211 = body3.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(56, 76).addBox(-3.5F, -0.5F, -7.7F, 6.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8088F, -4.475F, -0.5852F, 0.0166F, -0.0052F, 0.3054F));

		PartDefinition cube_r212 = body3.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(116, 56).addBox(-1.9F, 0.2001F, 9.1829F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.9F, 6.8363F, -11.4257F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r213 = body3.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(96, 124).addBox(-1.9F, -0.5376F, 4.3733F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.9F, 6.8363F, -11.4257F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r214 = body3.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(95, 49).addBox(-3.9F, -0.9933F, 0.1359F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.9F, 6.8363F, -11.4257F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r215 = body3.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(171, 25).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.206F, -15.0068F, 0.9844F, -0.0727F, 0.0483F));

		PartDefinition cube_r216 = body3.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(89, 159).addBox(1.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.206F, -15.0068F, 0.9182F, -0.4301F, 0.3085F));

		PartDefinition cube_r217 = body3.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(171, 11).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0061F, -13.0068F, 1.203F, -0.0815F, 0.0313F));

		PartDefinition cube_r218 = body3.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, -7.1F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, 0.0F, -8.9F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r219 = body3.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(73, 150).addBox(0.0F, -4.8F, 0.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3551F, -2.9705F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r220 = body3.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(130, 145).addBox(-1.0F, -5.0F, 0.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2023F, -6.0071F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r221 = body3.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(96, 116).addBox(-1.0F, -4.6F, -0.1F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2093F, -11.8927F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r222 = body3.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(146, 40).addBox(-1.0F, -5.1F, -0.1F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -8.9F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r223 = body3.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(159, 87).addBox(1.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.65F, -10.8F, 1.0579F, -0.4661F, 0.2479F));

		PartDefinition cube_r224 = body3.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(159, 85).addBox(3.3036F, -3.6003F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.65F, -10.8F, 0.6653F, -0.9798F, 0.8137F));

		PartDefinition cube_r225 = body3.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(169, 36).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.65F, -10.8F, 1.1155F, -0.0784F, 0.0383F));

		PartDefinition cube_r226 = body3.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(168, 155).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.75F, -8.5F, 0.8883F, -0.0678F, 0.055F));

		PartDefinition cube_r227 = body3.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(50, 159).addBox(1.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.75F, -8.5F, 0.8189F, -0.3991F, 0.3485F));

		PartDefinition cube_r228 = body3.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(102, 94).addBox(3.3036F, -3.6003F, 0.0F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.75F, -8.5F, 0.4415F, -0.8009F, 0.9887F));

		PartDefinition cube_r229 = body3.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(168, 146).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.65F, -5.5F, 0.8284F, -0.0325F, 0.0174F));

		PartDefinition cube_r230 = body3.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(159, 31).addBox(1.8126F, -0.8452F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.65F, -5.5F, 0.7688F, -0.3476F, 0.3262F));

		PartDefinition cube_r231 = body3.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(129, 80).addBox(3.3036F, -3.6003F, 0.0F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.65F, -5.5F, 0.4317F, -0.7318F, 0.9549F));

		PartDefinition cube_r232 = body3.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(74, 40).addBox(3.278F, -3.6088F, -0.4464F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.05F, -2.1F, 0.4062F, -0.6815F, 0.9595F));

		PartDefinition cube_r233 = body3.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(140, 88).addBox(-0.1F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.7527F, 8.6061F, 3.5212F, 0.0341F, -0.9233F, 0.1658F));

		PartDefinition cube_r234 = body3.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(120, 109).addBox(4.7102F, 1.3506F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.7527F, 8.6061F, 3.5212F, 0.3783F, -0.8649F, -0.2728F));

		PartDefinition cube_r235 = body3.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(41, 28).addBox(4.7102F, 1.3506F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.7527F, 8.6061F, 3.5212F, 0.3689F, -0.9751F, -0.2671F));

		PartDefinition cube_r236 = body3.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(139, 8).addBox(-0.1F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.7527F, 8.6061F, 3.5212F, -0.0642F, -1.0188F, 0.2452F));

		PartDefinition cube_r237 = body3.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(127, 90).addBox(4.4793F, 1.3813F, -0.5337F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.8876F, 8.4888F, 3.6434F, 0.4288F, -0.7444F, -0.3229F));

		PartDefinition cube_r238 = body3.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(137, 30).addBox(-0.3135F, 0.0932F, -0.5337F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.8876F, 8.4888F, 3.6434F, 0.159F, -0.8265F, 0.0561F));

		PartDefinition cube_r239 = body3.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(101, 10).addBox(4.4218F, 1.2679F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.9607F, 8.4434F, 1.6961F, 0.4735F, -0.7329F, -0.3512F));

		PartDefinition cube_r240 = body3.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(135, 53).addBox(-0.4F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.9607F, 8.4434F, 1.6961F, 0.2106F, -0.8279F, 0.0199F));

		PartDefinition cube_r241 = body3.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(144, 61).addBox(-0.2F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.8091F, 8.3426F, -0.4174F, 0.0547F, -0.7607F, 0.0128F));

		PartDefinition cube_r242 = body3.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(120, 111).addBox(4.6141F, 1.3231F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.8091F, 8.3426F, -0.4174F, 0.3055F, -0.7099F, -0.3586F));

		PartDefinition cube_r243 = body3.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(135, 6).addBox(-0.5586F, 0.0294F, -0.3817F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.767F, 7.8013F, -2.3609F, 0.2584F, -0.6552F, -0.0089F));

		PartDefinition cube_r244 = body3.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(102, 92).addBox(4.2613F, 1.2525F, -0.3817F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.767F, 7.8013F, -2.3609F, 0.442F, -0.5584F, -0.3285F));

		PartDefinition cube_r245 = body3.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(88, 125).addBox(-0.5F, -4.4F, 0.05F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.577F, -16.0238F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r246 = body3.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(36, 46).addBox(-0.5F, -4.8F, 0.075F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3552F, -14.0666F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r247 = body3.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(142, 77).addBox(-0.1836F, 0.6134F, -0.7251F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.9F, 6.8363F, -6.5257F, 0.3255F, -0.5665F, -0.2488F));

		PartDefinition cube_r248 = body3.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(144, 69).addBox(4.4608F, 1.9172F, -0.7251F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.9F, 6.8363F, -6.5257F, 0.4712F, -0.4573F, -0.5441F));

		PartDefinition cube_r249 = body3.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(159, 29).addBox(1.8126F, -0.8452F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0061F, -13.0068F, 1.1536F, -0.4857F, 0.204F));

		PartDefinition cube_r250 = body3.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(142, 75).addBox(3.8669F, 2.9702F, 4.5839F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.9F, 6.8363F, -11.4257F, 0.3571F, -0.5956F, -0.1507F));

		PartDefinition cube_r251 = body3.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(137, 28).addBox(7.7047F, 5.2992F, 4.5839F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.9F, 6.8363F, -11.4257F, 0.5089F, -0.4774F, -0.4458F));

		PartDefinition cube_r252 = body3.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(158, 152).addBox(1.7975F, -0.8675F, -0.4464F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.05F, -2.1F, 0.721F, -0.3183F, 0.33F));

		PartDefinition cube_r253 = body3.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(168, 120).addBox(-0.0043F, -0.0266F, -0.4464F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.05F, -2.1F, 0.7762F, -0.0187F, 0.0069F));

		PartDefinition frontleftleg = body3.addOrReplaceChild("frontleftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(6.8098F, 4.7997F, -10.3F, 1.4854F, 0.1117F, -0.5456F));

		PartDefinition cube_r254 = frontleftleg.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(127, 165).addBox(-0.5F, -1.7F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.1464F, 3.5338F, -0.7153F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r255 = frontleftleg.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(70, 162).addBox(-0.5F, -3.4F, -1.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1464F, 5.3166F, 0.1746F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r256 = frontleftleg.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(80, 169).addBox(-0.5F, -1.2F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.1464F, 11.5711F, -1.4127F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r257 = frontleftleg.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(33, 165).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1464F, 9.9242F, 0.0999F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r258 = frontleftleg.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(45, 159).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.1464F, 5.9249F, 0.1697F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r259 = frontleftleg.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(5, 169).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1464F, 0.2502F, 0.9145F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r260 = frontleftleg.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(82, 164).addBox(-0.5F, -1.5F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1464F, 1.3916F, -0.0754F, -0.8727F, 0.0F, 0.0F));

		PartDefinition frontleftleg2 = frontleftleg.addOrReplaceChild("frontleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7887F, 12.1042F, -1.3687F, -0.5287F, -0.6854F, 0.635F));

		PartDefinition cube_r261 = frontleftleg2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(93, 151).addBox(-0.8F, -0.8F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2411F, 1.8128F, 0.18F, 0.0F, 0.0F, 0.2182F));

		PartDefinition cube_r262 = frontleftleg2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(150, 174).addBox(-0.6F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0184F, 1.7629F, 0.18F, 0.0F, 0.0F, 3.098F));

		PartDefinition cube_r263 = frontleftleg2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(145, 174).addBox(0.3F, -1.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(179, 15).addBox(-0.2F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.2632F, 0.6584F, 0.18F, 0.0F, 0.0F, 2.5744F));

		PartDefinition cube_r264 = frontleftleg2.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(14, 179).addBox(-1.1F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(179, 12).addBox(-0.8F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.9394F, 1.5027F, 0.18F, 0.0F, 0.0F, 1.4835F));

		PartDefinition cube_r265 = frontleftleg2.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(174, 126).addBox(-0.8F, -1.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.4583F, 3.0286F, 0.18F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r266 = frontleftleg2.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(108, 156).addBox(-0.075F, -0.3F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.7589F, 2.8128F, 0.18F, 0.0F, 0.0F, 0.4363F));

		PartDefinition frontleftleg3 = frontleftleg2.addOrReplaceChild("frontleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2098F, 6.8588F, 0.059F, 1.7888F, -0.0056F, 0.0699F));

		PartDefinition cube_r267 = frontleftleg3.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(134, 92).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5797F, 0.0984F, -2.6117F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r268 = frontleftleg3.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(9, 146).addBox(1.6F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4385F, 0.0984F, -3.2592F, 0.0F, -1.0472F, 0.0F));

		PartDefinition cube_r269 = frontleftleg3.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(135, 98).addBox(0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.4385F, 0.0984F, -3.2592F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r270 = frontleftleg3.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(127, 83).addBox(-1.6F, -0.5F, -3.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1268F, 0.0984F, -1.7839F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r271 = frontleftleg3.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(122, 132).addBox(-0.8F, -0.5F, -3.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.013F))
				.texOffs(166, 89).addBox(-1.4F, -0.5F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7088F, 0.0984F, -2.4393F, 0.0F, -0.0436F, 0.0F));

		PartDefinition frontrightleg = body3.addOrReplaceChild("frontrightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.8098F, 4.7997F, -10.3F, 1.6614F, -0.2851F, 0.4899F));

		PartDefinition cube_r272 = frontrightleg.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(0, 166).addBox(-0.5F, -1.7F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.1464F, 3.5338F, -0.7153F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r273 = frontrightleg.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(7, 163).addBox(-0.5F, -3.4F, -1.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1464F, 5.3166F, 0.1746F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r274 = frontrightleg.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(170, 51).addBox(-0.5F, -1.2F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.1464F, 11.5711F, -1.4127F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r275 = frontrightleg.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(43, 165).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1464F, 9.9242F, 0.0999F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r276 = frontrightleg.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(162, 158).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.1464F, 5.9249F, 0.1697F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r277 = frontrightleg.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(169, 13).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1464F, 0.2502F, 0.9145F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r278 = frontrightleg.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(162, 164).addBox(-0.5F, -1.5F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1464F, 1.3916F, -0.0754F, -0.8727F, 0.0F, 0.0F));

		PartDefinition frontrightleg2 = frontrightleg.addOrReplaceChild("frontrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7887F, 12.1042F, -1.3687F, -0.4119F, 0.6392F, -0.7289F));

		PartDefinition cube_r279 = frontrightleg2.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(98, 151).addBox(-0.2F, -0.8F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2411F, 1.8128F, 0.18F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r280 = frontrightleg2.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(0, 175).addBox(-0.4F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0184F, 1.7629F, 0.18F, 0.0F, 0.0F, -3.098F));

		PartDefinition cube_r281 = frontrightleg2.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(167, 174).addBox(-1.3F, -1.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(179, 66).addBox(-0.8F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.2632F, 0.6584F, 0.18F, 0.0F, 0.0F, -2.5744F));

		PartDefinition cube_r282 = frontrightleg2.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(62, 179).addBox(0.1F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(179, 18).addBox(-0.2F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-1.9394F, 1.5027F, 0.18F, 0.0F, 0.0F, -1.4835F));

		PartDefinition cube_r283 = frontrightleg2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(162, 174).addBox(-0.2F, -1.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.4583F, 3.0286F, 0.18F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r284 = frontrightleg2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(156, 154).addBox(-0.925F, -0.3F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.7589F, 2.8128F, 0.18F, 0.0F, 0.0F, -0.4363F));

		PartDefinition frontrightleg3 = frontrightleg2.addOrReplaceChild("frontrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2098F, 6.8588F, 0.059F, 1.3166F, 0.261F, -0.0119F));

		PartDefinition cube_r285 = frontrightleg3.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(0, 135).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5797F, 0.0984F, -2.6117F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r286 = frontrightleg3.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(146, 10).addBox(-2.6F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4385F, 0.0984F, -3.2592F, 0.0F, 1.0472F, 0.0F));

		PartDefinition cube_r287 = frontrightleg3.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(137, 22).addBox(-1.5F, -0.5F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.4385F, 0.0984F, -3.2592F, 0.0F, 0.6981F, 0.0F));

		PartDefinition cube_r288 = frontrightleg3.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(0, 128).addBox(0.6F, -0.5F, -3.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1268F, 0.0984F, -1.7839F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r289 = frontrightleg3.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(13, 133).addBox(-0.2F, -0.5F, -3.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.013F))
				.texOffs(167, 33).addBox(-0.6F, -0.5F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.7088F, 0.0984F, -2.4393F, 0.0F, 0.0436F, 0.0F));

		PartDefinition bone2 = body3.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(6.0F, -1.0518F, -7.4195F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r290 = bone2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(177, 177).addBox(-1.6276F, 0.1554F, 0.4576F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 2.1504F, -0.3061F, 2.3387F, 0.0F, -0.3491F));

		PartDefinition cube_r291 = bone2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(120, 161).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F))
				.texOffs(38, 161).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.8707F, -1.0661F, -0.4327F, -1.3265F, 0.0F, -0.3491F));

		PartDefinition cube_r292 = bone2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(47, 173).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8201F, -0.9272F, 0.5563F, -0.1484F, 0.0F, -0.3491F));

		PartDefinition cube_r293 = bone2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(178, 82).addBox(-0.5F, -1.0F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(178, 24).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.2361F, 0.6774F, 0.7671F, 1.0734F, 0.0F, -0.3491F));

		PartDefinition cube_r294 = bone2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(172, 177).addBox(-0.5F, -0.625F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.2377F, 0.673F, 0.0806F, 2.5569F, 0.0F, -0.3491F));

		PartDefinition cube_r295 = bone2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(68, 172).addBox(-1.6276F, -0.0446F, 0.5826F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, 2.1504F, -0.3061F, 2.9496F, 0.0F, -0.3491F));

		PartDefinition cube_r296 = bone2.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(159, 89).addBox(-1.6276F, -1.7986F, -1.5104F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(146, 96).addBox(-1.6276F, -1.2986F, -1.9103F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 2.1504F, -0.3061F, 1.0734F, 0.0F, -0.3491F));

		PartDefinition cube_r297 = bone2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(108, 139).addBox(-0.5F, 0.6803F, -1.1475F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.7073F, 7.1988F, -0.6915F, 0.2647F, 0.2499F, 1.1218F));

		PartDefinition cube_r298 = bone2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(38, 141).addBox(-0.5F, -0.0532F, -2.0675F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.7073F, 7.1988F, -0.6915F, 0.832F, 0.2499F, 1.1218F));

		PartDefinition cube_r299 = bone2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(169, 17).addBox(-0.5F, -1.8508F, -0.1903F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.7073F, 7.1988F, -0.6915F, 0.352F, 0.2499F, 1.1218F));

		PartDefinition cube_r300 = bone2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(49, 125).addBox(-0.5F, -1.4255F, -0.8367F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.7073F, 7.1988F, -0.6915F, 1.7919F, 0.2499F, 1.1218F));

		PartDefinition cube_r301 = bone2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(59, 159).addBox(-1.6276F, -4.5251F, -2.0223F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 2.1504F, -0.3061F, 1.6668F, 0.0F, -0.3491F));

		PartDefinition cube_r302 = bone2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(47, 146).addBox(-0.5F, -0.55F, -1.725F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2432F, 3.4055F, -2.5726F, 0.637F, 0.0F, -0.3491F));

		PartDefinition bone13 = body3.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.0F, -1.0518F, -7.4195F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r303 = bone13.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(177, 177).mirror().addBox(0.6276F, 0.1554F, 0.4576F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.1504F, -0.3061F, 2.3387F, 0.0F, 0.3491F));

		PartDefinition cube_r304 = bone13.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(120, 161).mirror().addBox(-0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(38, 161).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.8707F, -1.0661F, -0.4327F, -1.3265F, 0.0F, 0.3491F));

		PartDefinition cube_r305 = bone13.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(47, 173).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8201F, -0.9272F, 0.5563F, -0.1484F, 0.0F, 0.3491F));

		PartDefinition cube_r306 = bone13.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(178, 82).mirror().addBox(-0.5F, -1.0F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(178, 24).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.2361F, 0.6774F, 0.7671F, 1.0734F, 0.0F, 0.3491F));

		PartDefinition cube_r307 = bone13.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(172, 177).mirror().addBox(-0.5F, -0.625F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.2377F, 0.673F, 0.0806F, 2.5569F, 0.0F, 0.3491F));

		PartDefinition cube_r308 = bone13.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(68, 172).mirror().addBox(0.6276F, -0.0446F, 0.5826F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.1504F, -0.3061F, 2.9496F, 0.0F, 0.3491F));

		PartDefinition cube_r309 = bone13.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(159, 89).mirror().addBox(0.6276F, -1.7986F, -1.5104F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(146, 96).mirror().addBox(0.6276F, -1.2986F, -1.9103F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.1504F, -0.3061F, 1.0734F, 0.0F, 0.3491F));

		PartDefinition cube_r310 = bone13.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(108, 139).mirror().addBox(-0.5F, 0.6803F, -1.1475F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(2.7073F, 7.1988F, -0.6915F, 0.2647F, -0.2499F, -1.1218F));

		PartDefinition cube_r311 = bone13.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(38, 141).mirror().addBox(-0.5F, -0.0532F, -2.0675F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.7073F, 7.1988F, -0.6915F, 0.832F, -0.2499F, -1.1218F));

		PartDefinition cube_r312 = bone13.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(169, 17).mirror().addBox(-0.5F, -1.8508F, -0.1903F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(2.7073F, 7.1988F, -0.6915F, 0.352F, -0.2499F, -1.1218F));

		PartDefinition cube_r313 = bone13.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(49, 125).mirror().addBox(-0.5F, -1.4255F, -0.8367F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.7073F, 7.1988F, -0.6915F, 1.7919F, -0.2499F, -1.1218F));

		PartDefinition cube_r314 = bone13.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(59, 159).mirror().addBox(0.6276F, -4.5251F, -2.0223F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.1504F, -0.3061F, 1.6668F, 0.0F, 0.3491F));

		PartDefinition cube_r315 = bone13.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(47, 146).mirror().addBox(-0.5F, -0.55F, -1.725F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.2432F, 3.4055F, -2.5726F, 0.637F, 0.0F, 0.3491F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(131, 64).addBox(-1.0F, -1.7F, -3.8F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 2.1912F, -16.1284F, -0.0893F, 0.173F, -0.023F));

		PartDefinition cube_r316 = body4.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(139, 172).addBox(-0.5F, -3.5F, -0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.9078F, -3.6457F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r317 = body4.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(136, 172).addBox(-0.5F, -3.8F, -0.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.6019F, -1.7436F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r318 = body4.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(172, 122).mirror().addBox(-1.6136F, -0.2115F, -0.8526F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.3F, -2.7F, 0.6043F, 0.7289F, -0.6689F));

		PartDefinition cube_r319 = body4.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(113, 159).mirror().addBox(-0.0968F, -1.8044F, 2.1247F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9831F, -4.764F, -4.8054F, 0.1327F, -0.0948F, -1.2212F));

		PartDefinition cube_r320 = body4.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(164, 9).mirror().addBox(-0.878F, -2.1547F, -0.6882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5175F, -5.3215F, 1.7694F, 0.2212F, 0.1087F, -1.2283F));

		PartDefinition cube_r321 = body4.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(110, 163).mirror().addBox(-0.397F, -0.572F, -0.9989F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2576F, -7.6741F, -2.0856F, 0.0341F, -0.1247F, 0.4674F));

		PartDefinition cube_r322 = body4.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(134, 163).mirror().addBox(-0.6053F, -0.5685F, -1.0003F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2576F, -7.6741F, -2.0856F, 0.1293F, -0.0222F, -0.719F));

		PartDefinition cube_r323 = body4.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(158, 57).mirror().addBox(0.7369F, -0.6113F, -1.0082F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5175F, -6.9215F, 1.4694F, 0.1627F, 0.0053F, -0.711F));

		PartDefinition cube_r324 = body4.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(134, 159).mirror().addBox(0.0663F, -1.8324F, -0.9975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5175F, -6.9215F, 1.4694F, 0.0725F, -0.1452F, 0.4705F));

		PartDefinition cube_r325 = body4.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(89, 161).mirror().addBox(-2.7941F, 0.2637F, -0.4398F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4021F, -0.4914F, -1.4786F, 0.4637F, 0.8849F, -0.6954F));

		PartDefinition cube_r326 = body4.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(134, 159).addBox(-1.0663F, -1.8324F, -0.9975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5175F, -6.9215F, 1.4694F, 0.0725F, 0.1452F, -0.4705F));

		PartDefinition cube_r327 = body4.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(158, 57).addBox(-1.7369F, -0.6113F, -1.0082F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5175F, -6.9215F, 1.4694F, 0.1627F, -0.0053F, 0.711F));

		PartDefinition cube_r328 = body4.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(134, 163).addBox(-0.3947F, -0.5685F, -1.0003F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2576F, -7.6741F, -2.0856F, 0.1293F, 0.0222F, 0.719F));

		PartDefinition cube_r329 = body4.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(110, 163).addBox(-0.603F, -0.572F, -0.9989F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2576F, -7.6741F, -2.0856F, 0.0341F, 0.1247F, -0.4674F));

		PartDefinition cube_r330 = body4.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(164, 9).addBox(-0.122F, -2.1547F, -0.6882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5175F, -5.3215F, 1.7694F, 0.2212F, -0.1087F, 1.2283F));

		PartDefinition cube_r331 = body4.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(113, 159).addBox(-0.9033F, -1.8044F, 2.1247F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9831F, -4.764F, -4.8054F, 0.1327F, 0.0948F, 1.2212F));

		PartDefinition cube_r332 = body4.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(89, 161).addBox(-0.2059F, 0.2637F, -0.4398F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4021F, -0.4914F, -1.4786F, 0.4637F, -0.8849F, 0.6954F));

		PartDefinition cube_r333 = body4.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(172, 122).addBox(-0.3864F, -0.2115F, -0.8526F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.3F, -2.7F, 0.6043F, -0.7289F, 0.6689F));

		PartDefinition neck = body4.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7045F, -3.388F, 0.0552F, 0.4175F, 0.0964F));

		PartDefinition cube_r334 = neck.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(172, 124).mirror().addBox(-1.7271F, -0.1303F, -0.8362F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3F, -2.3F, 0.9426F, 0.9173F, -0.5058F));

		PartDefinition cube_r335 = neck.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(19, 157).mirror().addBox(-0.6723F, 0.1738F, -2.1791F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.484F, -6.8615F, -2.7856F, 0.1916F, -0.2034F, 0.4498F));

		PartDefinition cube_r336 = neck.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(157, 49).mirror().addBox(-1.4081F, -0.5452F, -2.1749F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.484F, -6.8615F, -2.7856F, 0.2621F, 0.0906F, -0.7062F));

		PartDefinition cube_r337 = neck.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(127, 161).mirror().addBox(-0.5968F, -1.8044F, -2.8753F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9831F, -4.0595F, -1.4175F, 0.1327F, -0.0948F, -1.2212F));

		PartDefinition cube_r338 = neck.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(172, 124).addBox(-0.273F, -0.1303F, -0.8362F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3F, -2.3F, 0.9426F, -0.9173F, 0.5058F));

		PartDefinition cube_r339 = neck.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(142, 172).addBox(0.0F, -3.1F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1426F, -2.9292F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r340 = neck.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(19, 157).addBox(-0.3277F, 0.1738F, -2.1791F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.484F, -6.8615F, -2.7856F, 0.1916F, 0.2034F, -0.4498F));

		PartDefinition cube_r341 = neck.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(157, 49).addBox(0.4081F, -0.5452F, -2.1749F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.484F, -6.8615F, -2.7856F, 0.2621F, -0.0906F, 0.7062F));

		PartDefinition cube_r342 = neck.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(127, 161).addBox(-0.4033F, -1.8044F, -2.8753F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9831F, -4.0595F, -1.4175F, 0.1327F, 0.0948F, 1.2212F));

		PartDefinition cube_r343 = neck.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(75, 125).addBox(-1.5F, -0.85F, 5.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -0.6F, -9.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -4.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r344 = neck2.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(172, 148).mirror().addBox(-1.6834F, -0.2308F, -0.54F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8573F, -0.0107F, -1.2155F, 1.0819F, 1.1142F, -0.4468F));

		PartDefinition cube_r345 = neck2.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(108, 64).mirror().addBox(-1.0F, -0.125F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.844F, -0.1398F, -3.436F, 0.869F, 0.8808F, -0.5442F));

		PartDefinition cube_r346 = neck2.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(108, 64).addBox(0.0F, -0.125F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.844F, -0.1398F, -3.436F, 0.869F, -0.8808F, 0.5442F));

		PartDefinition cube_r347 = neck2.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(172, 148).addBox(-0.3166F, -0.2308F, -0.54F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8573F, -0.0107F, -1.2155F, 1.0819F, -1.1142F, 0.4468F));

		PartDefinition cube_r348 = neck2.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(49, 119).addBox(0.0F, -1.7F, -2.3F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7697F, -3.0294F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r349 = neck2.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(8, 178).addBox(0.0F, -2.5F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.733F, -0.9297F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r350 = neck2.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(120, 19).addBox(-1.5F, -0.85F, 4.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, -1.3F, -9.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9F, -5.0F, 0.2284F, 0.298F, 0.0681F));

		PartDefinition cube_r351 = neck3.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(148, 71).mirror().addBox(-1.6834F, -0.2308F, -0.54F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8573F, 1.6893F, -1.2155F, 1.0819F, 1.1142F, -0.4468F));

		PartDefinition cube_r352 = neck3.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(148, 71).addBox(-0.3166F, -0.2308F, -0.54F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8573F, 1.6893F, -1.2155F, 1.0819F, -1.1142F, 0.4468F));

		PartDefinition cube_r353 = neck3.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(158, 165).addBox(0.0F, -0.8F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.033F, -0.9297F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r354 = neck3.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(38, 157).mirror().addBox(-1.4081F, -0.5452F, -2.1749F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.484F, -3.0222F, -0.8915F, 0.1957F, 0.0338F, -0.7104F));

		PartDefinition cube_r355 = neck3.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(26, 157).mirror().addBox(-0.6723F, 0.1738F, -2.1791F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.484F, -3.0222F, -0.8915F, 0.1119F, -0.1649F, 0.4644F));

		PartDefinition cube_r356 = neck3.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(26, 157).addBox(-0.3277F, 0.1738F, -2.1791F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.484F, -3.0222F, -0.8915F, 0.1119F, 0.1649F, -0.4644F));

		PartDefinition cube_r357 = neck3.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(38, 157).addBox(0.4081F, -0.5452F, -2.1749F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.484F, -3.0222F, -0.8915F, 0.1957F, -0.0338F, 0.7104F));

		PartDefinition cube_r358 = neck3.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(0, 120).addBox(-1.5F, -0.85F, 4.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -9.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1307F, -0.2889F, -3.9705F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r359 = head.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(38, 110).addBox(0.0F, -0.775F, -6.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.1307F, 1.0762F, -9.2831F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r360 = head.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(0, 61).addBox(0.5F, -0.6978F, -12.4987F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.1307F, 1.4555F, -15.2393F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r361 = head.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(165, 178).addBox(-0.5F, -0.35F, -1.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.1307F, -1.8303F, -1.5691F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r362 = head.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(163, 79).addBox(-0.5F, -0.475F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1307F, -1.8303F, -1.5691F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r363 = head.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(120, 27).addBox(-3.5F, 2.0F, 0.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(99, 138).addBox(-1.5F, 0.0F, 0.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.8693F, -1.8174F, -3.5628F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r364 = head.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(146, 101).addBox(-2.5F, 0.0F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8693F, -1.8958F, -4.4594F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r365 = head.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(163, 93).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8693F, -1.8087F, -5.4556F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r366 = head.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(160, 178).addBox(0.0F, -0.6871F, -13.7958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(178, 150).addBox(0.0F, -0.6871F, -13.1958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(18, 147).addBox(0.0F, -0.5685F, -14.396F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F))
				.texOffs(68, 42).addBox(0.0F, -0.5935F, -12.096F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6307F, 1.0851F, -26.0088F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r367 = head.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(95, 38).addBox(0.0F, -0.7699F, -9.5114F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6307F, 1.028F, -17.0084F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r368 = head.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(61, 15).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8693F, 0.2261F, -15.9657F, 0.0346F, 0.1223F, -0.0001F));

		PartDefinition cube_r369 = head.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(62, 132).addBox(-1.0F, 0.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8693F, 0.2261F, -15.9657F, 0.035F, 0.0523F, 0.0018F));

		PartDefinition cube_r370 = head.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(96, 131).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1307F, 0.6944F, -15.0489F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r371 = head.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(19, 107).addBox(-1.0F, -0.325F, -3.5F, 2.0F, 1.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1307F, 0.3661F, -12.5573F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r372 = head.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(137, 127).addBox(-1.0F, -0.6F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1307F, -0.0663F, -8.0945F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r373 = head.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(121, 150).addBox(-1.0F, -0.9871F, 0.0316F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1307F, -0.0947F, -6.8972F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r374 = head.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(150, 30).addBox(-1.0F, -0.9871F, 0.0316F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1307F, 0.3157F, -8.0249F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r375 = head.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(135, 104).addBox(-1.0F, -1.0F, 2.25F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F))
				.texOffs(135, 104).addBox(-1.0F, -1.0F, 0.25F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1307F, 1.2532F, -8.7461F, -0.096F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3693F, 1.0769F, -36.8723F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r376 = leftFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(105, 171).addBox(-0.6952F, 1.472F, 4.5468F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(100, 171).addBox(-0.6952F, 1.672F, 3.6468F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(85, 171).addBox(-0.6952F, 1.772F, 2.7468F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -2.4193F, 24.9095F, -0.0801F, 0.2977F, -0.2078F));

		PartDefinition cube_r377 = leftFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(121, 170).addBox(-0.3162F, 1.772F, 1.6336F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -2.4193F, 24.9095F, -0.0775F, 0.1585F, -0.1965F));

		PartDefinition cube_r378 = leftFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(116, 170).addBox(-0.55F, -1.9F, 4.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5947F, 0.9694F, 20.5173F, -0.0605F, 0.0729F, -0.1946F));

		PartDefinition cube_r379 = leftFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(170, 92).addBox(-0.3683F, -1.4047F, -1.0781F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(92, 170).addBox(-0.3683F, -1.3047F, -1.9781F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(170, 78).addBox(-0.3683F, -1.3047F, -2.8781F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(170, 74).addBox(-0.3683F, -1.1047F, -3.7781F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(170, 55).addBox(-0.3683F, -1.0047F, -4.6781F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5947F, 0.9694F, 25.4173F, -0.081F, 0.1756F, -0.1971F));

		PartDefinition cube_r380 = leftFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(110, 175).addBox(-0.5821F, 0.2472F, -3.134F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.064F, -0.3173F, -0.4411F, -0.3687F, 0.021F, -0.1843F));

		PartDefinition cube_r381 = leftFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(175, 74).addBox(-0.666F, -0.3687F, -3.3415F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.667F, -0.3163F, 0.4339F, -0.152F, 0.0012F, -0.3137F));

		PartDefinition cube_r382 = leftFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(105, 175).addBox(-1.6535F, -0.3766F, -3.104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4248F, -0.1033F, 1.5275F, -0.1618F, -0.3503F, -0.3018F));

		PartDefinition cube_r383 = leftFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(175, 163).addBox(-0.5432F, 2.2315F, -15.8652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(130, 175).addBox(-0.5432F, 2.2315F, -14.6652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(100, 175).addBox(-0.5432F, 2.2315F, -13.4652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(175, 90).addBox(-0.5432F, 2.1315F, -12.4652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(175, 86).addBox(-0.5432F, 1.6315F, -11.5652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(84, 175).addBox(-0.5432F, 1.6315F, -10.6652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(179, 94).addBox(-0.5432F, 2.3315F, -9.6652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(175, 78).addBox(-0.5432F, 1.4315F, -8.5652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(167, 62).addBox(-0.5432F, 1.1315F, -7.6652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(120, 174).addBox(-0.5432F, 1.1315F, -6.7652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(170, 47).addBox(-0.5432F, 1.1315F, -5.8652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(170, 43).addBox(-0.5432F, 0.8315F, -5.0652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(39, 170).addBox(-0.5432F, 0.8315F, -4.1652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(34, 170).addBox(-0.5432F, 0.7315F, -3.2652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(29, 170).addBox(-0.5432F, 0.6315F, -2.2652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(10, 170).addBox(-0.5432F, 0.5315F, -1.3652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.225F, -1.0157F, 15.2317F, -0.1505F, 0.021F, -0.1843F));

		PartDefinition cube_r384 = leftFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(126, 170).addBox(0.289F, 0.4315F, -5.9683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0947F, -0.1306F, 20.8173F, -0.1511F, 0.09F, -0.1948F));

		PartDefinition cube_r385 = leftFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(158, 169).addBox(0.3165F, -0.0223F, -4.5056F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(169, 126).addBox(0.3165F, -0.3223F, -3.7056F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0053F, 0.2694F, 20.8173F, -0.1511F, 0.09F, -0.1948F));

		PartDefinition cube_r386 = leftFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(169, 100).addBox(0.3165F, -0.613F, -2.7521F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(169, 96).addBox(0.3165F, -0.613F, -1.6521F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(48, 169).addBox(0.3165F, -0.413F, -0.7521F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0053F, 0.2694F, 20.8173F, -0.0639F, 0.09F, -0.1948F));

		PartDefinition cube_r387 = leftFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(158, 53).addBox(0.0F, -2.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F))
				.texOffs(146, 0).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.9495F, 2.3698F, 33.8113F, 1.7502F, -0.6166F, -1.0161F));

		PartDefinition cube_r388 = leftFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(44, 96).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(3.8126F, 1.1438F, 33.8557F, 0.5751F, 0.4568F, 0.217F));

		PartDefinition cube_r389 = leftFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(50, 83).addBox(-0.1728F, -0.4747F, -0.16F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.1302F, 0.906F, 33.1375F, -0.603F, 0.4568F, 0.217F));

		PartDefinition cube_r390 = leftFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(165, 49).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.5799F, 0.5118F, 33.1165F, -1.7897F, 0.2527F, 0.2673F));

		PartDefinition cube_r391 = leftFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(171, 21).addBox(-1.0F, 0.0F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5601F, -2.2402F, 36.0022F, -2.4012F, 1.0376F, -0.7624F));

		PartDefinition cube_r392 = leftFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(148, 165).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0347F, -0.9606F, 37.9331F, -2.3029F, 0.6121F, -0.4648F));

		PartDefinition cube_r393 = leftFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(24, 167).addBox(-0.4525F, -5.1578F, -3.5767F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.7F, -0.4193F, 32.7095F, -2.0683F, 0.0611F, -0.1526F));

		PartDefinition cube_r394 = leftFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(155, 10).addBox(-3.4F, -0.6F, -0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.6266F, -2.7594F, 31.2561F, 1.9461F, 0.2424F, 0.0283F));

		PartDefinition cube_r395 = leftFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(141, 165).addBox(-2.4F, 0.3F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(153, 127).addBox(-3.4F, -0.5F, -0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.323F, -2.2912F, 30.0819F, 1.9577F, 0.2229F, 0.0782F));

		PartDefinition cube_r396 = leftFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(75, 86).addBox(-1.7836F, -1.1989F, -0.3384F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(166, 4).addBox(-0.7836F, 0.0011F, -1.1384F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(165, 148).addBox(-0.7836F, 0.0011F, -0.3384F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(154, 93).addBox(-1.7836F, -0.3989F, -0.3384F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(2.1265F, -1.8083F, 31.3089F, 1.8564F, 0.3293F, -0.2246F));

		PartDefinition cube_r397 = leftFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(64, 28).addBox(-0.7836F, -0.8355F, -1.0517F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(2.1265F, -1.8083F, 31.3089F, 2.8164F, 0.3293F, -0.2246F));

		PartDefinition cube_r398 = leftFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(148, 20).addBox(-1.9378F, 4.4257F, -4.5193F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(134, 154).addBox(-1.9378F, 1.4565F, -3.5091F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.8193F, 24.9095F, 1.9002F, 0.3028F, -0.1418F));

		PartDefinition cube_r399 = leftFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(162, 13).addBox(-1.4378F, -4.1637F, -7.7829F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0F, -2.8193F, 24.9095F, -2.9867F, 0.3028F, -0.1418F));

		PartDefinition cube_r400 = leftFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(115, 174).addBox(-0.4525F, -1.9415F, -2.3996F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.7F, -0.5193F, 32.2095F, -1.728F, 0.0611F, -0.1526F));

		PartDefinition cube_r401 = leftFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(169, 0).addBox(-0.4525F, -4.122F, -2.064F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7F, -0.5193F, 32.2095F, -1.5534F, 0.0611F, -0.1526F));

		PartDefinition cube_r402 = leftFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(178, 145).addBox(-0.4525F, -6.2558F, -1.6498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7F, -0.4193F, 32.7095F, -1.728F, 0.0611F, -0.1526F));

		PartDefinition cube_r403 = leftFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(166, 59).addBox(-0.7F, -0.5F, 0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0198F, 0.0238F, 37.6589F, -0.2874F, 0.1173F, 0.622F));

		PartDefinition cube_r404 = leftFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(135, 132).addBox(-1.0F, -0.3F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(5.1152F, -0.3355F, 35.5985F, -0.4345F, 0.0756F, -0.0814F));

		PartDefinition cube_r405 = leftFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(162, 0).addBox(-0.5F, -0.425F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4383F, -0.1741F, 34.843F, -0.0971F, 0.2336F, -0.1566F));

		PartDefinition cube_r406 = leftFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(141, 154).addBox(-0.275F, -3.625F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.9703F, -0.4106F, 23.6867F, 1.6363F, 0.1721F, -0.1508F));

		PartDefinition cube_r407 = leftFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(129, 154).addBox(-0.5F, -3.4F, -0.45F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0326F, -0.7645F, 27.2135F, 1.6384F, 0.3028F, -0.1418F));

		PartDefinition cube_r408 = leftFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(173, 142).addBox(-0.1055F, 2.594F, -0.7888F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.1013F, -0.7551F, 0.5279F, -1.5471F, -0.0187F, 3.0F));

		PartDefinition cube_r409 = leftFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(171, 7).addBox(-3.2827F, 1.1684F, -0.7888F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1013F, -0.7551F, 0.5279F, -1.5284F, -0.9782F, 2.9652F));

		PartDefinition cube_r410 = leftFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(173, 116).addBox(-3.3592F, -0.9257F, -0.7888F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1013F, -0.7551F, 0.5279F, 0.6673F, -1.5406F, 0.7622F));

		PartDefinition cube_r411 = leftFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(146, 178).addBox(-1.4868F, -2.4871F, -0.7888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1013F, -0.7551F, 0.5279F, 1.543F, -0.5484F, -0.1267F));

		PartDefinition cube_r412 = leftFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(91, 116).addBox(-0.775F, -16.9F, -0.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6222F, -0.1103F, 15.2983F, 1.5471F, 0.0318F, -0.011F));

		PartDefinition cube_r413 = leftFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(88, 150).addBox(0.2407F, -5.8641F, -0.183F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0197F, 0.2694F, 20.8173F, 1.5648F, 0.076F, -0.0448F));

		PartDefinition cube_r414 = leftFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(33, 152).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1389F, -0.107F, 23.2994F, 1.5855F, 0.1627F, -0.001F));

		PartDefinition cube_r415 = leftFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(153, 165).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.93F, 0.4083F, 29.493F, 1.5424F, 0.3028F, -0.1418F));

		PartDefinition cube_r416 = leftFace.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(124, 154).addBox(-0.4378F, 0.0121F, -2.8599F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, -2.4193F, 24.9095F, 1.5075F, 0.3028F, -0.1418F));

		PartDefinition cube_r417 = leftFace.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(176, 35).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9433F, -1.0639F, 31.2756F, -2.1317F, 0.1569F, -0.0737F));

		PartDefinition cube_r418 = leftFace.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(176, 21).addBox(-1.0192F, -0.921F, -0.9084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7069F, -1.237F, 30.4119F, 2.8286F, 0.2599F, -0.1409F));

		PartDefinition cube_r419 = leftFace.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(38, 165).addBox(-0.5F, -3.3034F, -0.2545F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4068F, -0.537F, 30.8119F, 1.5448F, 0.3808F, -0.1467F));

		PartDefinition cube_r420 = leftFace.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(0, 179).addBox(-2.4348F, 0.2379F, -3.3556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(179, 0).addBox(-2.4348F, 0.2379F, -4.1556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1F, -1.2443F, 1.5015F, -0.0403F, -0.5232F, 0.0201F));

		PartDefinition cube_r421 = leftFace.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(146, 141).addBox(-1.0F, -0.75F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3132F, -2.1723F, 32.83F, -0.0308F, 0.518F, 0.0559F));

		PartDefinition cube_r422 = leftFace.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(88, 135).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7742F, -2.9768F, 32.3025F, -0.2711F, 0.1139F, -0.1253F));

		PartDefinition cube_r423 = leftFace.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(177, 60).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8872F, -2.1805F, 31.4033F, -0.6632F, 0.0097F, -0.1152F));

		PartDefinition cube_r424 = leftFace.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(162, 100).addBox(-1.0F, 0.0F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4826F, -1.6261F, 28.1293F, -0.0264F, 0.2107F, -1.5336F));

		PartDefinition cube_r425 = leftFace.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(0, 147).addBox(-1.0F, -1.0F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.5577F, -1.6531F, 28.5676F, -0.166F, 0.2107F, -1.5336F));

		PartDefinition cube_r426 = leftFace.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(102, 89).addBox(-0.925F, -0.4F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.7575F, -2.622F, 31.7698F, -0.096F, 0.0097F, -0.1152F));

		PartDefinition cube_r427 = leftFace.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(144, 150).addBox(-2.0F, -1.525F, -1.075F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1275F, -2.0022F, 29.4023F, -0.1847F, 0.3497F, -1.5557F));

		PartDefinition cube_r428 = leftFace.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(101, 32).addBox(-3.0F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(3.2105F, -0.8308F, 34.6299F, -0.0226F, 0.0511F, 0.4802F));

		PartDefinition cube_r429 = leftFace.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(135, 150).addBox(-1.4F, -0.85F, -1.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.1758F, 0.3747F, 37.0384F, -0.3017F, 0.3262F, 0.5572F));

		PartDefinition cube_r430 = leftFace.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(162, 96).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3204F, -1.4272F, 35.1961F, -0.3017F, 0.3262F, 0.5572F));

		PartDefinition cube_r431 = leftFace.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(162, 126).addBox(-0.3F, -0.5F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.3204F, -1.4272F, 35.1961F, -0.376F, 0.6973F, 0.4083F));

		PartDefinition cube_r432 = leftFace.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(75, 162).addBox(-1.0F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5285F, -2.0415F, 29.4438F, -0.0276F, 0.3497F, -1.5557F));

		PartDefinition cube_r433 = leftFace.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(57, 177).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5961F, -2.8856F, 31.3801F, 0.0638F, -0.4865F, -0.0493F));

		PartDefinition cube_r434 = leftFace.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(160, 33).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.3568F, 0.3403F, 34.1673F, -0.0273F, 0.2336F, -0.1566F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6307F, 1.0769F, -36.8723F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r435 = rightFace.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(105, 171).mirror().addBox(-0.3048F, 1.472F, 4.5468F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(100, 171).mirror().addBox(-0.3048F, 1.672F, 3.6468F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(85, 171).mirror().addBox(-0.3048F, 1.772F, 2.7468F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.4193F, 24.9095F, -0.0801F, -0.2977F, 0.2078F));

		PartDefinition cube_r436 = rightFace.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(121, 170).mirror().addBox(-0.6838F, 1.772F, 1.6336F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.4193F, 24.9095F, -0.0775F, -0.1585F, 0.1965F));

		PartDefinition cube_r437 = rightFace.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(116, 170).mirror().addBox(-0.45F, -1.9F, 4.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5947F, 0.9694F, 20.5173F, -0.0605F, -0.0729F, 0.1946F));

		PartDefinition cube_r438 = rightFace.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(170, 92).mirror().addBox(-0.6317F, -1.4047F, -1.0781F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(92, 170).mirror().addBox(-0.6317F, -1.3047F, -1.9781F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(170, 78).mirror().addBox(-0.6317F, -1.3047F, -2.8781F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(170, 74).mirror().addBox(-0.6317F, -1.1047F, -3.7781F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(170, 55).mirror().addBox(-0.6317F, -1.0047F, -4.6781F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5947F, 0.9694F, 25.4173F, -0.081F, -0.1756F, 0.1971F));

		PartDefinition cube_r439 = rightFace.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(110, 175).mirror().addBox(-0.4178F, 0.2472F, -3.134F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.064F, -0.3173F, -0.4411F, -0.3687F, -0.021F, 0.1843F));

		PartDefinition cube_r440 = rightFace.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(175, 74).mirror().addBox(-0.334F, -0.3687F, -3.3415F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.667F, -0.3163F, 0.4339F, -0.152F, -0.0012F, 0.3137F));

		PartDefinition cube_r441 = rightFace.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(105, 175).mirror().addBox(0.6535F, -0.3766F, -3.104F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4248F, -0.1033F, 1.5275F, -0.1618F, 0.3503F, 0.3018F));

		PartDefinition cube_r442 = rightFace.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(175, 163).mirror().addBox(-0.4568F, 2.2315F, -15.8652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(130, 175).mirror().addBox(-0.4568F, 2.2315F, -14.6652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(100, 175).mirror().addBox(-0.4568F, 2.2315F, -13.4652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(175, 90).mirror().addBox(-0.4568F, 2.1315F, -12.4652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(175, 86).mirror().addBox(-0.4568F, 1.6315F, -11.5652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(84, 175).mirror().addBox(-0.4568F, 1.6315F, -10.6652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(179, 94).mirror().addBox(-0.4568F, 2.3315F, -9.6652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(175, 78).mirror().addBox(-0.4568F, 1.4315F, -8.5652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(167, 62).mirror().addBox(-0.4568F, 1.1315F, -7.6652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(120, 174).mirror().addBox(-0.4568F, 1.1315F, -6.7652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(170, 47).mirror().addBox(-0.4568F, 1.1315F, -5.8652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(170, 43).mirror().addBox(-0.4568F, 0.8315F, -5.0652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(39, 170).mirror().addBox(-0.4568F, 0.8315F, -4.1652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(34, 170).mirror().addBox(-0.4568F, 0.7315F, -3.2652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(29, 170).mirror().addBox(-0.4568F, 0.6315F, -2.2652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(10, 170).mirror().addBox(-0.4568F, 0.5315F, -1.3652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.225F, -1.0157F, 15.2317F, -0.1505F, -0.021F, 0.1843F));

		PartDefinition cube_r443 = rightFace.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(126, 170).mirror().addBox(-1.289F, 0.4315F, -5.9683F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0947F, -0.1306F, 20.8173F, -0.1511F, -0.09F, 0.1948F));

		PartDefinition cube_r444 = rightFace.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(158, 169).mirror().addBox(-1.3165F, -0.0223F, -4.5056F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(169, 126).mirror().addBox(-1.3165F, -0.3223F, -3.7056F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0053F, 0.2694F, 20.8173F, -0.1511F, -0.09F, 0.1948F));

		PartDefinition cube_r445 = rightFace.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(169, 100).mirror().addBox(-1.3165F, -0.613F, -2.7521F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(169, 96).mirror().addBox(-1.3165F, -0.613F, -1.6521F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(48, 169).mirror().addBox(-1.3165F, -0.413F, -0.7521F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0053F, 0.2694F, 20.8173F, -0.0639F, -0.09F, 0.1948F));

		PartDefinition cube_r446 = rightFace.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(158, 53).mirror().addBox(-1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(146, 0).mirror().addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.9495F, 2.3698F, 33.8113F, 1.7502F, 0.6166F, 1.0161F));

		PartDefinition cube_r447 = rightFace.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(44, 96).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-3.8126F, 1.1438F, 33.8557F, 0.5751F, -0.4568F, -0.217F));

		PartDefinition cube_r448 = rightFace.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(50, 83).mirror().addBox(-0.8272F, -0.4747F, -0.16F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.1302F, 0.906F, 33.1375F, -0.603F, -0.4568F, -0.217F));

		PartDefinition cube_r449 = rightFace.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(165, 49).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.5799F, 0.5118F, 33.1165F, -1.7897F, -0.2527F, -0.2673F));

		PartDefinition cube_r450 = rightFace.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(171, 21).mirror().addBox(0.0F, 0.0F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5601F, -2.2402F, 36.0022F, -2.4012F, -1.0376F, 0.7624F));

		PartDefinition cube_r451 = rightFace.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(148, 165).mirror().addBox(-0.5F, -0.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0347F, -0.9606F, 37.9331F, -2.3029F, -0.6121F, 0.4648F));

		PartDefinition cube_r452 = rightFace.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(24, 167).mirror().addBox(-0.5476F, -5.1578F, -3.5767F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.7F, -0.4193F, 32.7095F, -2.0683F, -0.0611F, 0.1526F));

		PartDefinition cube_r453 = rightFace.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(155, 10).mirror().addBox(0.4F, -0.6F, -0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.6266F, -2.7594F, 31.2561F, 1.9461F, -0.2424F, -0.0283F));

		PartDefinition cube_r454 = rightFace.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(141, 165).mirror().addBox(0.4F, 0.3F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(153, 127).mirror().addBox(0.4F, -0.5F, -0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.323F, -2.2912F, 30.0819F, 1.9577F, -0.2229F, -0.0782F));

		PartDefinition cube_r455 = rightFace.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(75, 86).mirror().addBox(-1.2164F, -1.1989F, -0.3384F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(166, 4).mirror().addBox(-1.2164F, 0.0011F, -1.1384F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(165, 148).mirror().addBox(-1.2164F, 0.0011F, -0.3384F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(154, 93).mirror().addBox(-1.2164F, -0.3989F, -0.3384F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.1265F, -1.8083F, 31.3089F, 1.8564F, -0.3293F, 0.2246F));

		PartDefinition cube_r456 = rightFace.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(64, 28).mirror().addBox(-1.2164F, -0.8355F, -1.0517F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-2.1265F, -1.8083F, 31.3089F, 2.8164F, -0.3293F, 0.2246F));

		PartDefinition cube_r457 = rightFace.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(148, 20).mirror().addBox(-0.0622F, 4.4257F, -4.5193F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(134, 154).mirror().addBox(-0.0622F, 1.4565F, -3.5091F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.8193F, 24.9095F, 1.9002F, -0.3028F, 0.1418F));

		PartDefinition cube_r458 = rightFace.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(162, 13).mirror().addBox(-0.5622F, -4.1637F, -7.7829F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.8193F, 24.9095F, -2.9867F, -0.3028F, 0.1418F));

		PartDefinition cube_r459 = rightFace.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(115, 174).mirror().addBox(-0.5476F, -1.9415F, -2.3996F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.7F, -0.5193F, 32.2095F, -1.728F, -0.0611F, 0.1526F));

		PartDefinition cube_r460 = rightFace.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(169, 0).mirror().addBox(-0.5476F, -4.122F, -2.064F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7F, -0.5193F, 32.2095F, -1.5534F, -0.0611F, 0.1526F));

		PartDefinition cube_r461 = rightFace.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(178, 145).mirror().addBox(-0.5476F, -6.2558F, -1.6498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7F, -0.4193F, 32.7095F, -1.728F, -0.0611F, 0.1526F));

		PartDefinition cube_r462 = rightFace.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(166, 59).mirror().addBox(-1.3F, -0.5F, 0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0198F, 0.0238F, 37.6589F, -0.2874F, -0.1173F, -0.622F));

		PartDefinition cube_r463 = rightFace.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(135, 132).mirror().addBox(0.0F, -0.3F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-5.1152F, -0.3355F, 35.5985F, -0.4345F, -0.0756F, 0.0814F));

		PartDefinition cube_r464 = rightFace.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(162, 0).mirror().addBox(-0.5F, -0.425F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4383F, -0.1741F, 34.843F, -0.0971F, -0.2336F, 0.1566F));

		PartDefinition cube_r465 = rightFace.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(141, 154).mirror().addBox(-0.725F, -3.625F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9703F, -0.4106F, 23.6867F, 1.6363F, -0.1721F, 0.1508F));

		PartDefinition cube_r466 = rightFace.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(129, 154).mirror().addBox(-0.5F, -3.4F, -0.45F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0326F, -0.7645F, 27.2135F, 1.6384F, -0.3028F, 0.1418F));

		PartDefinition cube_r467 = rightFace.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(173, 142).mirror().addBox(-0.8945F, 2.594F, -0.7888F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1013F, -0.7551F, 0.5279F, -1.5471F, 0.0187F, -3.0F));

		PartDefinition cube_r468 = rightFace.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(171, 7).mirror().addBox(2.2826F, 1.1684F, -0.7888F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1013F, -0.7551F, 0.5279F, -1.5284F, 0.9782F, -2.9652F));

		PartDefinition cube_r469 = rightFace.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(173, 116).mirror().addBox(2.3592F, -0.9257F, -0.7888F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1013F, -0.7551F, 0.5279F, 0.6673F, 1.5406F, -0.7622F));

		PartDefinition cube_r470 = rightFace.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(146, 178).mirror().addBox(0.4868F, -2.4871F, -0.7888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1013F, -0.7551F, 0.5279F, 1.543F, 0.5484F, 0.1267F));

		PartDefinition cube_r471 = rightFace.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(91, 116).mirror().addBox(-0.225F, -16.9F, -0.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6222F, -0.1103F, 15.2983F, 1.5471F, -0.0318F, 0.011F));

		PartDefinition cube_r472 = rightFace.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(88, 150).mirror().addBox(-1.2407F, -5.8641F, -0.183F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0197F, 0.2694F, 20.8173F, 1.5648F, -0.076F, 0.0448F));

		PartDefinition cube_r473 = rightFace.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(33, 152).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1389F, -0.107F, 23.2994F, 1.5855F, -0.1627F, 0.001F));

		PartDefinition cube_r474 = rightFace.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(153, 165).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.93F, 0.4083F, 29.493F, 1.5424F, -0.3028F, 0.1418F));

		PartDefinition cube_r475 = rightFace.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(124, 154).mirror().addBox(-0.5622F, 0.0121F, -2.8599F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.4193F, 24.9095F, 1.5075F, -0.3028F, 0.1418F));

		PartDefinition cube_r476 = rightFace.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(176, 35).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9433F, -1.0639F, 31.2756F, -2.1317F, -0.1569F, 0.0737F));

		PartDefinition cube_r477 = rightFace.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(176, 21).mirror().addBox(0.0192F, -0.921F, -0.9084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7069F, -1.237F, 30.4119F, 2.8286F, -0.2599F, 0.1409F));

		PartDefinition cube_r478 = rightFace.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(38, 165).mirror().addBox(-0.5F, -3.3034F, -0.2545F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4068F, -0.537F, 30.8119F, 1.5448F, -0.3808F, 0.1467F));

		PartDefinition cube_r479 = rightFace.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(0, 179).mirror().addBox(1.4348F, 0.2379F, -3.3556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(179, 0).mirror().addBox(1.4348F, 0.2379F, -4.1556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1F, -1.2443F, 1.5015F, -0.0403F, 0.5232F, -0.0201F));

		PartDefinition cube_r480 = rightFace.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(146, 141).mirror().addBox(-1.0F, -0.75F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3132F, -2.1723F, 32.83F, -0.0308F, -0.518F, -0.0559F));

		PartDefinition cube_r481 = rightFace.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(88, 135).mirror().addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7742F, -2.9768F, 32.3025F, -0.2711F, -0.1139F, 0.1253F));

		PartDefinition cube_r482 = rightFace.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(177, 60).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8872F, -2.1805F, 31.4033F, -0.6632F, -0.0097F, 0.1152F));

		PartDefinition cube_r483 = rightFace.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(162, 100).mirror().addBox(0.0F, 0.0F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4826F, -1.6261F, 28.1293F, -0.0264F, -0.2107F, 1.5336F));

		PartDefinition cube_r484 = rightFace.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(0, 147).mirror().addBox(0.0F, -1.0F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5577F, -1.6531F, 28.5676F, -0.166F, -0.2107F, 1.5336F));

		PartDefinition cube_r485 = rightFace.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(102, 89).mirror().addBox(-1.075F, -0.4F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.7575F, -2.622F, 31.7698F, -0.096F, -0.0097F, 0.1152F));

		PartDefinition cube_r486 = rightFace.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(144, 150).mirror().addBox(0.0F, -1.525F, -1.075F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1275F, -2.0022F, 29.4023F, -0.1847F, -0.3497F, 1.5557F));

		PartDefinition cube_r487 = rightFace.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(101, 32).mirror().addBox(0.0F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-3.2105F, -0.8308F, 34.6299F, -0.0226F, -0.0511F, -0.4802F));

		PartDefinition cube_r488 = rightFace.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(135, 150).mirror().addBox(-0.6F, -0.85F, -1.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.1758F, 0.3747F, 37.0384F, -0.3017F, -0.3262F, -0.5572F));

		PartDefinition cube_r489 = rightFace.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(162, 96).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3204F, -1.4272F, 35.1961F, -0.3017F, -0.3262F, -0.5572F));

		PartDefinition cube_r490 = rightFace.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(162, 126).mirror().addBox(-0.7F, -0.5F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.3204F, -1.4272F, 35.1961F, -0.376F, -0.6973F, -0.4083F));

		PartDefinition cube_r491 = rightFace.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(75, 162).mirror().addBox(0.0F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5285F, -2.0415F, 29.4438F, -0.0276F, -0.3497F, 1.5557F));

		PartDefinition cube_r492 = rightFace.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(57, 177).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5961F, -2.8856F, 31.3801F, 0.0638F, 0.4865F, 0.0493F));

		PartDefinition cube_r493 = rightFace.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(160, 33).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.3568F, 0.3403F, 34.1673F, -0.0273F, -0.2336F, 0.1566F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1307F, 2.9547F, 2.1105F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r494 = jaw.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(160, 63).mirror().addBox(-0.511F, -1.2157F, -2.0185F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(150, 25).mirror().addBox(-0.511F, 0.087F, -0.0598F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.1111F, 0.7911F, 0.9726F, -0.0361F, -0.082F, -0.0224F));

		PartDefinition cube_r495 = jaw.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(112, 145).mirror().addBox(-0.5318F, 0.1001F, -3.6383F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.1111F, 0.7911F, 0.9726F, -0.2985F, -0.0994F, -0.0224F));

		PartDefinition cube_r496 = jaw.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(60, 169).mirror().addBox(0.0922F, -2.9113F, -1.4932F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.3554F, 1.4693F, -3.069F, -0.3987F, -0.239F, 0.0307F));

		PartDefinition cube_r497 = jaw.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(133, 34).mirror().addBox(0.0922F, -2.955F, -5.3327F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.3554F, 1.4693F, -3.069F, -0.3638F, -0.239F, 0.0307F));

		PartDefinition cube_r498 = jaw.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(20, 141).mirror().addBox(0.0922F, -3.5918F, -7.9054F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.3554F, 1.4693F, -3.069F, -0.2417F, -0.239F, 0.0307F));

		PartDefinition cube_r499 = jaw.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(63, 99).mirror().addBox(0.0922F, -1.5849F, -6.765F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3554F, 1.4693F, -3.069F, -0.4336F, -0.239F, 0.0307F));

		PartDefinition cube_r500 = jaw.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(120, 101).mirror().addBox(0.0401F, -0.1643F, -5.4428F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3554F, -2.6307F, -10.569F, -0.4109F, -0.2085F, 0.0305F));

		PartDefinition cube_r501 = jaw.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(120, 0).mirror().addBox(0.0347F, -1.4043F, -5.3587F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3554F, -2.6307F, -10.569F, -0.2712F, -0.2094F, 0.0299F));

		PartDefinition cube_r502 = jaw.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(101, 0).mirror().addBox(-1.0018F, -0.9338F, -7.8815F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0446F, -5.2307F, -18.269F, -0.3301F, 0.0096F, 0.0298F));

		PartDefinition cube_r503 = jaw.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(62, 125).mirror().addBox(-1.0018F, -0.5907F, -12.8406F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(135, 0).mirror().addBox(-1.0018F, -0.5907F, -16.8406F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0446F, -5.2307F, -18.269F, -0.3737F, 0.0096F, 0.0298F));

		PartDefinition cube_r504 = jaw.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(173, 173).mirror().addBox(-1.0018F, -2.1301F, -7.5083F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(174, 96).mirror().addBox(-1.0018F, -2.0301F, -6.5083F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(101, 167).mirror().addBox(-1.0018F, -2.0301F, -5.5083F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(174, 100).mirror().addBox(-1.0018F, -2.1301F, -4.5083F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(142, 168).mirror().addBox(-1.0018F, -2.0801F, -3.5083F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(106, 167).mirror().addBox(-1.0018F, -2.0301F, -2.5083F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(87, 167).mirror().addBox(-1.0018F, -2.0301F, -1.5083F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(111, 167).mirror().addBox(-1.0018F, -1.9301F, -0.5083F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0446F, -5.2307F, -18.269F, -0.2952F, 0.0096F, 0.0298F));

		PartDefinition cube_r505 = jaw.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(175, 31).mirror().addBox(-1.0018F, -1.5796F, -8.5682F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(175, 40).mirror().addBox(-1.0018F, -1.5796F, -9.5682F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(179, 69).mirror().addBox(-1.0018F, -1.4796F, -10.5682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(71, 179).mirror().addBox(-1.0018F, -1.4796F, -11.5682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(83, 179).mirror().addBox(-1.0018F, -1.4796F, -12.5682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(179, 97).mirror().addBox(-1.0018F, -1.4796F, -13.5682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(98, 179).mirror().addBox(-1.0018F, -1.4796F, -14.4682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(179, 100).mirror().addBox(-1.0018F, -1.4796F, -15.4682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0446F, -5.2307F, -18.269F, -0.365F, 0.0096F, 0.0298F));

		PartDefinition cube_r506 = jaw.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(167, 122).mirror().addBox(-1.0465F, -2.2009F, -2.2737F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(167, 158).mirror().addBox(-1.0465F, -2.1009F, -1.2737F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1554F, -4.3308F, -15.469F, -0.1756F, -0.0776F, 0.0299F));

		PartDefinition cube_r507 = jaw.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(103, 151).mirror().addBox(-0.536F, -0.1179F, -1.1891F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.1111F, 0.7911F, 0.9726F, -0.0027F, -0.0869F, -0.0249F));

		PartDefinition cube_r508 = jaw.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(135, 10).mirror().addBox(-0.511F, 1.0079F, 0.4218F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-4.1111F, 0.7911F, 0.9726F, 0.1733F, -0.082F, -0.0224F));

		PartDefinition cube_r509 = jaw.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(19, 152).mirror().addBox(-0.5318F, -0.4664F, -3.9643F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.1111F, 0.7911F, 0.9726F, -0.4643F, -0.0994F, -0.0224F));

		PartDefinition cube_r510 = jaw.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(139, 109).mirror().addBox(0.0922F, -1.7056F, -2.7696F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3554F, 1.4693F, -3.069F, -0.39F, -0.239F, 0.0307F));

		PartDefinition cube_r511 = jaw.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(164, 23).mirror().addBox(-0.511F, -0.8603F, -0.5554F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.1111F, 0.7911F, 0.9726F, -0.5161F, -0.082F, -0.0224F));

		PartDefinition cube_r512 = jaw.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(179, 6).mirror().addBox(-0.511F, 1.009F, 2.5808F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.1111F, 0.7911F, 0.9726F, 0.3129F, -0.082F, -0.0224F));

		PartDefinition cube_r513 = jaw.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(152, 5).mirror().addBox(0.0922F, -1.5168F, -8.7611F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3554F, 1.4693F, -3.069F, -0.4511F, -0.239F, 0.0307F));

		PartDefinition cube_r514 = jaw.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(133, 115).mirror().addBox(-0.5F, -0.8F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4316F, -11.1685F, -33.9524F, -0.4086F, 0.0096F, 0.0298F));

		PartDefinition cube_r515 = jaw.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(178, 167).mirror().addBox(-0.9315F, 0.1548F, -0.735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7508F, -13.6882F, -38.2148F, 1.0367F, 0.5074F, -0.2462F));

		PartDefinition cube_r516 = jaw.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(147, 170).mirror().addBox(0.0401F, -2.8028F, -5.6433F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(17, 169).mirror().addBox(0.0401F, -2.6028F, -4.5433F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(152, 170).mirror().addBox(0.0401F, -2.4028F, -3.6433F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(163, 170).mirror().addBox(0.0401F, -2.3028F, -2.7432F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(168, 170).mirror().addBox(0.0401F, -2.3028F, -1.8432F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(173, 150).mirror().addBox(0.0401F, -2.2028F, -0.9432F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3554F, -2.6307F, -10.569F, -0.1796F, -0.2085F, 0.0305F));

		PartDefinition cube_r517 = jaw.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(90, 174).mirror().addBox(0.5916F, -4.726F, -7.4703F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(174, 70).mirror().addBox(0.5916F, -4.826F, -8.3703F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.3554F, 1.4693F, -3.069F, -0.1785F, -0.1736F, 0.0303F));

		PartDefinition cube_r518 = jaw.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(158, 148).mirror().addBox(0.0401F, -0.5643F, -1.4428F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.3554F, -2.6307F, -10.569F, -0.3891F, -0.2085F, 0.0305F));

		PartDefinition cube_r519 = jaw.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(63, 175).mirror().addBox(-1.0018F, -7.7775F, -14.9854F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0446F, -5.2307F, -18.269F, 0.0277F, 0.0096F, 0.0298F));

		PartDefinition cube_r520 = jaw.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(175, 48).mirror().addBox(-0.575F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(175, 52).mirror().addBox(-0.575F, -1.7F, -1.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(175, 56).mirror().addBox(-0.575F, -2.2F, -2.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4002F, -12.2514F, -34.0445F, 0.0244F, -0.1057F, -0.2349F));

		PartDefinition cube_r521 = jaw.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(175, 44).mirror().addBox(-0.7408F, -1.3261F, -0.1475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7508F, -13.6882F, -38.2148F, -0.2265F, -0.0397F, -0.5613F));

		PartDefinition cube_r522 = jaw.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(73, 175).mirror().addBox(-0.0863F, -1.7028F, -0.6145F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7508F, -13.6882F, -38.2148F, 0.5126F, 0.5088F, -0.2798F));

		PartDefinition cube_r523 = jaw.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(121, 145).mirror().addBox(-1.0465F, -0.567F, -2.926F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1554F, -4.3308F, -15.469F, -0.3851F, -0.0776F, 0.0299F));

		PartDefinition cube_r524 = jaw.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(148, 49).mirror().addBox(-1.0481F, -1.107F, -2.8379F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1554F, -4.3308F, -15.469F, -0.2672F, -0.0785F, 0.0294F));

		PartDefinition cube_r525 = jaw.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(173, 130).mirror().addBox(-0.1516F, -0.7084F, -0.735F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(173, 134).mirror().addBox(-0.1516F, -1.4084F, -0.735F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7508F, -13.6882F, -38.2148F, 1.1097F, 0.0056F, 0.0308F));

		PartDefinition cube_r526 = jaw.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(178, 170).mirror().addBox(-0.5998F, -0.7293F, -0.735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7508F, -13.6882F, -38.2148F, -0.1001F, 1.1072F, -1.649F));

		PartDefinition cube_r527 = jaw.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(178, 173).mirror().addBox(-0.2706F, -0.4001F, -0.735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7508F, -13.6882F, -38.2148F, -0.8615F, 0.8189F, -2.548F));

		PartDefinition cube_r528 = jaw.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(101, 22).mirror().addBox(-1.0018F, -0.7588F, -7.8815F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0446F, -5.2307F, -18.269F, -0.3606F, 0.0096F, 0.0298F));

		PartDefinition cube_r529 = jaw.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(135, 10).addBox(-0.489F, 1.0079F, 0.4218F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(4.1111F, 0.7911F, 0.9726F, 0.1733F, 0.082F, 0.0224F));

		PartDefinition cube_r530 = jaw.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(164, 23).addBox(-0.489F, -0.8603F, -0.5554F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.1111F, 0.7911F, 0.9726F, -0.5161F, 0.082F, 0.0224F));

		PartDefinition cube_r531 = jaw.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(179, 6).addBox(-0.489F, 1.009F, 2.5808F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.1111F, 0.7911F, 0.9726F, 0.3129F, 0.082F, 0.0224F));

		PartDefinition cube_r532 = jaw.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(150, 25).addBox(-0.489F, 0.087F, -0.0598F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(160, 63).addBox(-0.489F, -1.2157F, -2.0185F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.1111F, 0.7911F, 0.9726F, -0.0361F, 0.082F, 0.0224F));

		PartDefinition cube_r533 = jaw.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(103, 151).addBox(-0.464F, -0.1179F, -1.1891F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.1111F, 0.7911F, 0.9726F, -0.0027F, 0.0869F, 0.0249F));

		PartDefinition cube_r534 = jaw.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(174, 70).addBox(-1.5916F, -4.826F, -8.3703F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(90, 174).addBox(-1.5916F, -4.726F, -7.4703F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.3554F, 1.4693F, -3.069F, -0.1785F, 0.1736F, -0.0303F));

		PartDefinition cube_r535 = jaw.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(173, 150).addBox(-1.0401F, -2.2028F, -0.9432F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(168, 170).addBox(-1.0401F, -2.3028F, -1.8432F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(163, 170).addBox(-1.0401F, -2.3028F, -2.7432F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(152, 170).addBox(-1.0401F, -2.4028F, -3.6433F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(17, 169).addBox(-1.0401F, -2.6028F, -4.5433F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(147, 170).addBox(-1.0401F, -2.8028F, -5.6433F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3554F, -2.6307F, -10.569F, -0.1796F, 0.2085F, -0.0305F));

		PartDefinition cube_r536 = jaw.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(167, 158).addBox(0.0465F, -2.1009F, -1.2737F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(167, 122).addBox(0.0465F, -2.2009F, -2.2737F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1554F, -4.3308F, -15.469F, -0.1756F, 0.0776F, -0.0299F));

		PartDefinition cube_r537 = jaw.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(111, 167).addBox(0.0018F, -1.9301F, -0.5083F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(87, 167).addBox(0.0018F, -2.0301F, -1.5083F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(106, 167).addBox(0.0018F, -2.0301F, -2.5083F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(142, 168).addBox(0.0018F, -2.0801F, -3.5083F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(174, 100).addBox(0.0018F, -2.1301F, -4.5083F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(101, 167).addBox(0.0018F, -2.0301F, -5.5083F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(174, 96).addBox(0.0018F, -2.0301F, -6.5083F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(173, 173).addBox(0.0018F, -2.1301F, -7.5083F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0446F, -5.2307F, -18.269F, -0.2952F, -0.0096F, -0.0298F));

		PartDefinition cube_r538 = jaw.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(73, 175).addBox(-0.9137F, -1.7028F, -0.6145F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7508F, -13.6882F, -38.2148F, 0.5126F, -0.5088F, 0.2798F));

		PartDefinition cube_r539 = jaw.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(175, 44).addBox(-0.2592F, -1.3261F, -0.1475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7508F, -13.6882F, -38.2148F, -0.2265F, 0.0397F, 0.5613F));

		PartDefinition cube_r540 = jaw.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(175, 56).addBox(-0.425F, -2.2F, -2.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(175, 52).addBox(-0.425F, -1.7F, -1.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(175, 48).addBox(-0.425F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4002F, -12.2514F, -34.0445F, 0.0244F, 0.1057F, 0.2349F));

		PartDefinition cube_r541 = jaw.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(63, 175).addBox(0.0018F, -7.7775F, -14.9854F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0446F, -5.2307F, -18.269F, 0.0277F, -0.0096F, -0.0298F));

		PartDefinition cube_r542 = jaw.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(179, 100).addBox(0.0018F, -1.4796F, -15.4682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(98, 179).addBox(0.0018F, -1.4796F, -14.4682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(179, 97).addBox(0.0018F, -1.4796F, -13.5682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(83, 179).addBox(0.0018F, -1.4796F, -12.5682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(71, 179).addBox(0.0018F, -1.4796F, -11.5682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(179, 69).addBox(0.0018F, -1.4796F, -10.5682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(175, 40).addBox(0.0018F, -1.5796F, -9.5682F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(175, 31).addBox(0.0018F, -1.5796F, -8.5682F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0446F, -5.2307F, -18.269F, -0.365F, -0.0096F, -0.0298F));

		PartDefinition cube_r543 = jaw.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(173, 134).addBox(-0.8484F, -1.4084F, -0.735F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(173, 130).addBox(-0.8484F, -0.7084F, -0.735F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7508F, -13.6882F, -38.2148F, 1.1097F, -0.0056F, -0.0308F));

		PartDefinition cube_r544 = jaw.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(178, 173).addBox(-0.7294F, -0.4001F, -0.735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7508F, -13.6882F, -38.2148F, -0.8615F, -0.8189F, 2.548F));

		PartDefinition cube_r545 = jaw.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(178, 170).addBox(-0.4002F, -0.7293F, -0.735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7508F, -13.6882F, -38.2148F, -0.1001F, -1.1072F, 1.649F));

		PartDefinition cube_r546 = jaw.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(178, 167).addBox(-0.0685F, 0.1548F, -0.735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7508F, -13.6882F, -38.2148F, 1.0367F, -0.5074F, 0.2462F));

		PartDefinition cube_r547 = jaw.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(133, 115).addBox(-0.5F, -0.8F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4316F, -11.1685F, -33.9524F, -0.4086F, -0.0096F, -0.0298F));

		PartDefinition cube_r548 = jaw.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(135, 0).addBox(0.0018F, -0.5907F, -16.8406F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F))
				.texOffs(62, 125).addBox(0.0018F, -0.5907F, -12.8406F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0446F, -5.2307F, -18.269F, -0.3737F, -0.0096F, -0.0298F));

		PartDefinition cube_r549 = jaw.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(101, 22).addBox(0.0018F, -0.7588F, -7.8815F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0446F, -5.2307F, -18.269F, -0.3606F, -0.0096F, -0.0298F));

		PartDefinition cube_r550 = jaw.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(101, 0).addBox(0.0018F, -0.9338F, -7.8815F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0446F, -5.2307F, -18.269F, -0.3301F, -0.0096F, -0.0298F));

		PartDefinition cube_r551 = jaw.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(148, 49).addBox(0.048F, -1.107F, -2.8379F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1554F, -4.3308F, -15.469F, -0.2672F, 0.0785F, -0.0294F));

		PartDefinition cube_r552 = jaw.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(120, 0).addBox(-1.0347F, -1.4043F, -5.3587F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3554F, -2.6307F, -10.569F, -0.2712F, 0.2094F, -0.0299F));

		PartDefinition cube_r553 = jaw.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(158, 148).addBox(-1.0401F, -0.5643F, -1.4428F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.3554F, -2.6307F, -10.569F, -0.3891F, 0.2085F, -0.0305F));

		PartDefinition cube_r554 = jaw.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(121, 145).addBox(0.0465F, -0.567F, -2.926F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1554F, -4.3308F, -15.469F, -0.3851F, 0.0776F, -0.0299F));

		PartDefinition cube_r555 = jaw.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(120, 101).addBox(-1.0401F, -0.1643F, -5.4428F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.3554F, -2.6307F, -10.569F, -0.4109F, 0.2085F, -0.0305F));

		PartDefinition cube_r556 = jaw.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(139, 109).addBox(-1.0922F, -1.7056F, -2.7696F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3554F, 1.4693F, -3.069F, -0.39F, 0.239F, -0.0307F));

		PartDefinition cube_r557 = jaw.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(152, 5).addBox(-1.0922F, -1.5168F, -8.7611F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3554F, 1.4693F, -3.069F, -0.4511F, 0.239F, -0.0307F));

		PartDefinition cube_r558 = jaw.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(63, 99).addBox(-1.0922F, -1.5849F, -6.765F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3554F, 1.4693F, -3.069F, -0.4336F, 0.239F, -0.0307F));

		PartDefinition cube_r559 = jaw.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(20, 141).addBox(-1.0922F, -3.5918F, -7.9054F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.3554F, 1.4693F, -3.069F, -0.2417F, 0.239F, -0.0307F));

		PartDefinition cube_r560 = jaw.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(133, 34).addBox(-1.0922F, -2.955F, -5.3327F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.3554F, 1.4693F, -3.069F, -0.3638F, 0.239F, -0.0307F));

		PartDefinition cube_r561 = jaw.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(19, 152).addBox(-0.4682F, -0.4664F, -3.9643F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.1111F, 0.7911F, 0.9726F, -0.4643F, 0.0994F, 0.0224F));

		PartDefinition cube_r562 = jaw.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(60, 169).addBox(-1.0922F, -2.9113F, -1.4932F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.3554F, 1.4693F, -3.069F, -0.3987F, 0.239F, -0.0307F));

		PartDefinition cube_r563 = jaw.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(112, 145).addBox(-0.4682F, 0.1001F, -3.6383F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.1111F, 0.7911F, 0.9726F, -0.2985F, 0.0994F, 0.0224F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 89).addBox(-1.0F, -1.8038F, -0.0408F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.005F))
				.texOffs(153, 140).addBox(0.0F, -5.0038F, 2.9592F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.95F, 6.4F, -0.035F, -0.0872F, 0.0031F));

		PartDefinition cube_r564 = tail.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(153, 147).addBox(0.0F, -3.1F, -0.1F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7935F, 6.0486F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r565 = tail.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(59, 133).addBox(0.0F, -0.3522F, -0.5333F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1962F, 1.4592F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r566 = tail.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(44, 170).addBox(0.0F, 2.6478F, 3.7346F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 101).addBox(0.0F, 1.4478F, 1.7346F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 13).addBox(0.0F, 0.0478F, -0.2654F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1962F, 3.4592F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r567 = tail.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(153, 120).addBox(0.5F, -3.4F, -0.3F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.7038F, 0.2592F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r568 = tail.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(75, 97).mirror().addBox(-2.0014F, -0.014F, -0.8005F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.9986F, 0.8442F, -0.0178F, 0.0068F, -0.1394F));

		PartDefinition cube_r569 = tail.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(27, 72).mirror().addBox(-4.6393F, -0.4131F, 11.916F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -6.5542F, -11.9934F, -0.0389F, -0.0086F, -0.3001F));

		PartDefinition cube_r570 = tail.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(75, 97).addBox(0.0014F, -0.014F, -0.8005F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.9986F, 0.8442F, -0.0178F, -0.0068F, 0.1394F));

		PartDefinition cube_r571 = tail.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(27, 72).addBox(-0.3607F, -0.4131F, 11.916F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -6.5542F, -11.9934F, -0.0389F, 0.0086F, 0.3001F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(39, 42).addBox(-1.0F, -0.1594F, 0.1708F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.6038F, 8.7592F, 0.0093F, -0.3491F, -0.0032F));

		PartDefinition cube_r572 = tail2.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(96, 97).mirror().addBox(-1.6014F, -0.014F, -0.0005F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(87, 105).mirror().addBox(-1.6014F, -0.014F, 3.9995F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9243F, 0.7415F, 0.1835F, -0.0178F, 0.0243F, -0.1397F));

		PartDefinition cube_r573 = tail2.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(87, 105).addBox(-0.3986F, -0.014F, 3.9995F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(96, 97).addBox(-0.3986F, -0.014F, -0.0005F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9243F, 0.7415F, 0.1835F, -0.0178F, -0.0243F, 0.1397F));

		PartDefinition cube_r574 = tail2.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(117, 101).addBox(0.5F, -3.7F, 10.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 178).addBox(0.5F, -3.6F, 8.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 178).addBox(0.5F, -3.55F, 6.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 173).addBox(0.5F, -3.5F, 4.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 173).addBox(0.5F, -3.4F, 2.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 173).addBox(0.5F, -3.2F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1594F, 0.1708F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r575 = tail2.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(97, 170).addBox(0.0F, 8.1478F, 11.7346F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(172, 163).addBox(0.0F, 6.8478F, 9.7346F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 169).addBox(0.0F, 5.9478F, 7.7346F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 135).addBox(0.0F, 4.4478F, 5.7346F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8F, -5.3F, 0.6545F, 0.0F, 0.0F));

		PartDefinition bone8 = tail2.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(110, 74).addBox(-0.5F, -1.5F, 11.3F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offset(-0.5F, -1.4594F, -11.0292F));

		PartDefinition cube_r576 = bone8.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(124, 124).mirror().addBox(-0.0597F, -1.236F, -4.997F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.5F, 23.3F, -0.0496F, 0.0377F, -0.4189F));

		PartDefinition cube_r577 = bone8.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(145, 90).mirror().addBox(-0.0597F, -1.6097F, -0.314F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.5F, 23.3F, 0.5177F, 0.0377F, -0.4189F));

		PartDefinition cube_r578 = bone8.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(57, 145).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5925F, -2.5742F, 20.9625F, 0.2559F, 0.0377F, -0.4189F));

		PartDefinition cube_r579 = bone8.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(144, 63).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7317F, -2.5238F, 17.0488F, 0.3431F, 0.0377F, -0.4189F));

		PartDefinition cube_r580 = bone8.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(85, 144).mirror().addBox(-0.5F, -1.0F, -0.8F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-0.7757F, -2.0261F, 12.6108F, 0.2995F, 0.0377F, -0.4189F));

		PartDefinition cube_r581 = bone8.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(118, 115).mirror().addBox(0.0149F, -1.4846F, -10.8993F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.5F, 23.3F, 0.0001F, 0.0526F, -0.4193F));

		PartDefinition cube_r582 = bone8.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(118, 115).addBox(-1.0149F, -1.4846F, -10.8993F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.5F, -1.5F, 23.3F, 0.0001F, -0.0526F, 0.4193F));

		PartDefinition cube_r583 = bone8.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(85, 144).addBox(-0.5F, -1.0F, -0.8F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(1.7757F, -2.0261F, 12.6108F, 0.2995F, -0.0377F, 0.4189F));

		PartDefinition cube_r584 = bone8.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(144, 63).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.7317F, -2.5238F, 17.0488F, 0.3431F, -0.0377F, 0.4189F));

		PartDefinition cube_r585 = bone8.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(57, 145).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5925F, -2.5742F, 20.9625F, 0.2559F, -0.0377F, 0.4189F));

		PartDefinition cube_r586 = bone8.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(145, 90).addBox(-0.9403F, -1.6097F, -0.314F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.5F, -1.5F, 23.3F, 0.5177F, -0.0377F, 0.4189F));

		PartDefinition cube_r587 = bone8.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(124, 124).addBox(-0.9403F, -1.236F, -4.997F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.5F, -1.5F, 23.3F, -0.0496F, -0.0377F, 0.4189F));

		PartDefinition tail7 = tail2.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(41, 13).addBox(-1.0F, -0.1594F, 0.1708F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 12.0F, -0.004F, -0.35F, 0.0834F));

		PartDefinition cube_r588 = tail7.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(97, 13).mirror().addBox(-1.6014F, -0.014F, -0.0005F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9243F, 0.7415F, 0.1835F, -0.0178F, 0.0243F, -0.1397F));

		PartDefinition cube_r589 = tail7.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(97, 13).addBox(-0.3986F, -0.014F, -0.0005F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9243F, 0.7415F, 0.1835F, -0.0178F, -0.0243F, 0.1397F));

		PartDefinition cube_r590 = tail7.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(66, 145).addBox(0.5F, -3.1F, 10.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(178, 140).addBox(0.5F, -3.1F, 8.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(138, 178).addBox(0.5F, -3.05F, 6.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(178, 135).addBox(0.5F, -2.9F, 4.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(135, 178).addBox(0.5F, -2.9F, 2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(178, 130).addBox(0.5F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1594F, 0.1708F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r591 = tail7.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(48, 177).addBox(0.0F, 9.1478F, 12.1346F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 177).addBox(0.0F, 7.3478F, 10.1346F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 176).addBox(0.0F, 6.1478F, 8.1346F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 176).addBox(0.0F, 4.9478F, 6.1346F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(127, 178).addBox(0.0F, 3.4478F, 4.1346F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8F, -5.3F, 0.6545F, 0.0F, 0.0F));

		PartDefinition bone10 = tail7.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(101, 106).addBox(-0.5F, -1.5F, 11.3F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offset(-0.5F, -1.4594F, -11.0292F));

		PartDefinition cube_r592 = bone10.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(111, 124).mirror().addBox(-0.0597F, -1.236F, -4.997F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.5F, 23.3F, -0.0496F, 0.0377F, -0.4189F));

		PartDefinition cube_r593 = bone10.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(144, 144).mirror().addBox(-0.0597F, -2.4347F, -1.614F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.5F, 23.3F, 0.5177F, 0.0377F, -0.4189F));

		PartDefinition cube_r594 = bone10.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(48, 133).mirror().addBox(-0.5F, -1.1F, -2.8F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.6518F, -2.5372F, 19.1281F, 0.2559F, 0.0377F, -0.4189F));

		PartDefinition cube_r595 = bone10.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(133, 56).mirror().addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.8935F, -2.791F, 16.0132F, 0.2995F, 0.0377F, -0.4189F));

		PartDefinition cube_r596 = bone10.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(34, 119).mirror().addBox(0.0149F, -1.4846F, -10.8993F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.5F, 23.3F, 0.0001F, 0.0526F, -0.4193F));

		PartDefinition cube_r597 = bone10.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(34, 119).addBox(-1.0149F, -1.4846F, -10.8993F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.5F, -1.5F, 23.3F, 0.0001F, -0.0526F, 0.4193F));

		PartDefinition cube_r598 = bone10.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(133, 56).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.8935F, -2.791F, 16.0132F, 0.2995F, -0.0377F, 0.4189F));

		PartDefinition cube_r599 = bone10.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(48, 133).addBox(-0.5F, -1.1F, -2.8F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.6518F, -2.5372F, 19.1281F, 0.2559F, -0.0377F, 0.4189F));

		PartDefinition cube_r600 = bone10.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(144, 144).addBox(-0.9403F, -2.4347F, -1.614F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.5F, -1.5F, 23.3F, 0.5177F, -0.0377F, 0.4189F));

		PartDefinition cube_r601 = bone10.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(111, 124).addBox(-0.9403F, -1.236F, -4.997F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.5F, -1.5F, 23.3F, -0.0496F, -0.0377F, 0.4189F));

		PartDefinition tail3 = tail7.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(70, 13).addBox(-1.0F, -0.0381F, -0.2468F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.0913F, 12.4291F, -0.0361F, -0.2616F, 0.0094F));

		PartDefinition cube_r602 = tail3.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(54, 178).addBox(1.0F, -2.7996F, 3.5393F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 178).addBox(1.0F, -2.3996F, 1.5393F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 178).addBox(1.0F, -2.1996F, -0.4607F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.0381F, 6.2532F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r603 = tail3.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(36, 178).addBox(1.0F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.236F, 3.7352F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r604 = tail3.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(33, 178).addBox(1.0F, -2.4F, 0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.0381F, 1.6532F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r605 = tail3.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(30, 178).addBox(1.0F, -2.3F, -0.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.0381F, -0.0468F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r606 = tail3.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(103, 179).addBox(0.0F, 0.9F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 176).addBox(0.0F, -1.2F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3828F, 7.3725F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r607 = tail3.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(24, 176).addBox(0.0F, -1.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4897F, 4.9336F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r608 = tail3.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(176, 6).addBox(0.0F, 11.1478F, 15.7346F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 176).addBox(0.0F, 10.1478F, 13.7346F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9214F, -17.7194F, 0.6545F, 0.0F, 0.0F));

		PartDefinition bone7 = tail3.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(0.8F, -3.3291F, 5.1975F));

		PartDefinition cube_r609 = bone7.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-0.475F, -0.775F, -5.5F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.0F, 0.0F, -0.019F, 0.0018F, -0.3042F));

		PartDefinition cube_r610 = bone7.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(135, 16).mirror().addBox(-0.5F, -4.3F, -6.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.713F, -0.4549F, 1.9349F, 0.5918F, 0.0018F, -0.3042F));

		PartDefinition cube_r611 = bone7.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(141, 161).mirror().addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8986F, -1.0153F, -3.2815F, 1.1154F, 0.0018F, -0.3042F));

		PartDefinition cube_r612 = bone7.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(148, 161).mirror().addBox(-0.5F, 0.0F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(28, 125).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.8986F, -1.2153F, -0.0815F, 1.4208F, 0.0018F, -0.3042F));

		PartDefinition cube_r613 = bone7.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(26, 135).mirror().addBox(-0.5F, -4.3F, -6.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.713F, -0.6549F, 5.1349F, 0.5918F, 0.0018F, -0.3042F));

		PartDefinition cube_r614 = bone7.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(175, 154).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(161, 154).mirror().addBox(-0.5F, 0.0F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8986F, -1.2153F, 2.8185F, 1.4208F, 0.0018F, -0.3042F));

		PartDefinition cube_r615 = bone7.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(135, 41).mirror().addBox(-0.5F, -4.3F, -6.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.713F, -0.6549F, 8.0349F, 0.5918F, 0.0018F, -0.3042F));

		PartDefinition cube_r616 = bone7.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(155, 161).mirror().addBox(-0.5F, 0.0F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(38, 107).mirror().addBox(-0.5F, -0.9F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.8986F, -1.4153F, 5.8185F, 1.4208F, 0.0018F, -0.3042F));

		PartDefinition cube_r617 = bone7.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(135, 47).mirror().addBox(-0.5F, -4.3F, -6.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.713F, -0.8549F, 11.0349F, 0.5918F, 0.0018F, -0.3042F));

		PartDefinition cube_r618 = bone7.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(38, 107).addBox(-0.5F, -0.9F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(155, 161).addBox(-0.5F, 0.0F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2986F, -1.4153F, 5.8185F, 1.4208F, -0.0018F, 0.3042F));

		PartDefinition cube_r619 = bone7.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(135, 47).addBox(-0.5F, -4.3F, -6.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.113F, -0.8549F, 11.0349F, 0.5918F, -0.0018F, 0.3042F));

		PartDefinition cube_r620 = bone7.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(161, 154).addBox(-0.5F, 0.0F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F))
				.texOffs(175, 154).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.2986F, -1.2153F, 2.8185F, 1.4208F, -0.0018F, 0.3042F));

		PartDefinition cube_r621 = bone7.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(135, 41).addBox(-0.5F, -4.3F, -6.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.113F, -0.6549F, 8.0349F, 0.5918F, -0.0018F, 0.3042F));

		PartDefinition cube_r622 = bone7.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(26, 135).addBox(-0.5F, -4.3F, -6.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.113F, -0.6549F, 5.1349F, 0.5918F, -0.0018F, 0.3042F));

		PartDefinition cube_r623 = bone7.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(28, 125).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(148, 161).addBox(-0.5F, 0.0F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2986F, -1.2153F, -0.0815F, 1.4208F, -0.0018F, 0.3042F));

		PartDefinition cube_r624 = bone7.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(135, 16).addBox(-0.5F, -4.3F, -6.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.113F, -0.4549F, 1.9349F, 0.5918F, -0.0018F, 0.3042F));

		PartDefinition cube_r625 = bone7.addOrReplaceChild("cube_r625", CubeListBuilder.create().texOffs(141, 161).addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2986F, -1.0153F, -3.2815F, 1.1154F, -0.0018F, 0.3042F));

		PartDefinition cube_r626 = bone7.addOrReplaceChild("cube_r626", CubeListBuilder.create().texOffs(0, 75).addBox(-0.525F, -0.775F, -5.5F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.019F, -0.0018F, 0.3042F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(74, 0).addBox(-1.0F, -0.413F, -0.1774F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.3785F, 10.9345F, -0.0366F, 0.3052F, -0.011F));

		PartDefinition cube_r627 = tail4.addOrReplaceChild("cube_r627", CubeListBuilder.create().texOffs(178, 109).addBox(0.0F, -3.6523F, 3.9986F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(178, 104).addBox(0.0F, -2.9523F, 1.9986F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 178).addBox(0.0F, -2.3523F, -0.0014F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.323F, 4.8303F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r628 = tail4.addOrReplaceChild("cube_r628", CubeListBuilder.create().texOffs(89, 178).addBox(0.0F, -2.6784F, 1.9927F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(130, 179).addBox(0.0F, -1.9784F, -0.0073F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.413F, 0.8226F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r629 = tail4.addOrReplaceChild("cube_r629", CubeListBuilder.create().texOffs(179, 126).addBox(0.0F, -1.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4995F, 10.5803F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r630 = tail4.addOrReplaceChild("cube_r630", CubeListBuilder.create().texOffs(179, 122).addBox(0.0F, 4.9F, 9.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 179).addBox(0.0F, 4.0F, 7.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(109, 179).addBox(0.0F, 2.9F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 179).addBox(0.0F, 1.8F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0043F, -3.562F, 0.5236F, 0.0F, 0.0F));

		PartDefinition bone6 = tail4.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(-0.5F, -4.6162F, 7.32F));

		PartDefinition cube_r631 = bone6.addOrReplaceChild("cube_r631", CubeListBuilder.create().texOffs(156, 80).mirror().addBox(-0.462F, -2.1477F, -1.429F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.0096F, 0.5982F, -4.1953F, 1.0209F, 0.0832F, -0.3065F));

		PartDefinition cube_r632 = bone6.addOrReplaceChild("cube_r632", CubeListBuilder.create().texOffs(44, 99).mirror().addBox(-0.5115F, -0.4697F, -4.084F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0096F, 0.5982F, -4.1953F, 0.0153F, 0.0963F, -0.3066F));

		PartDefinition cube_r633 = bone6.addOrReplaceChild("cube_r633", CubeListBuilder.create().texOffs(174, 17).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(27, 174).mirror().addBox(-0.5F, 0.0F, -1.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5613F, -0.909F, -5.7259F, 2.1117F, 0.0832F, -0.3065F));

		PartDefinition cube_r634 = bone6.addOrReplaceChild("cube_r634", CubeListBuilder.create().texOffs(12, 165).mirror().addBox(-0.5F, -1.8F, -2.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5613F, -0.909F, -5.7259F, 3.1153F, 0.0832F, -0.3065F));

		PartDefinition cube_r635 = bone6.addOrReplaceChild("cube_r635", CubeListBuilder.create().texOffs(0, 152).mirror().addBox(-0.4558F, -1.2936F, -1.3986F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1567F, -1.2019F, -1.2327F, 2.0985F, 0.1248F, -0.3079F));

		PartDefinition cube_r636 = bone6.addOrReplaceChild("cube_r636", CubeListBuilder.create().texOffs(19, 163).mirror().addBox(-0.4558F, -1.9676F, -1.4845F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1567F, -1.2019F, -1.2327F, 3.102F, 0.1248F, -0.3079F));

		PartDefinition cube_r637 = bone6.addOrReplaceChild("cube_r637", CubeListBuilder.create().texOffs(168, 142).mirror().addBox(-0.4558F, -0.2601F, 0.1673F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.1567F, -1.2019F, -1.2327F, 2.273F, 0.1248F, -0.3079F));

		PartDefinition cube_r638 = bone6.addOrReplaceChild("cube_r638", CubeListBuilder.create().texOffs(144, 115).mirror().addBox(-0.479F, -1.1964F, -2.8662F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.1567F, -1.2019F, -1.2327F, 1.0076F, 0.1248F, -0.3079F));

		PartDefinition cube_r639 = bone6.addOrReplaceChild("cube_r639", CubeListBuilder.create().texOffs(44, 99).addBox(-0.4885F, -0.4697F, -4.084F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.9904F, 0.5982F, -4.1953F, 0.0153F, -0.0963F, 0.3066F));

		PartDefinition cube_r640 = bone6.addOrReplaceChild("cube_r640", CubeListBuilder.create().texOffs(168, 142).addBox(-0.5442F, -0.2601F, 0.1673F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.1567F, -1.2019F, -1.2327F, 2.273F, -0.1248F, 0.3079F));

		PartDefinition cube_r641 = bone6.addOrReplaceChild("cube_r641", CubeListBuilder.create().texOffs(19, 163).addBox(-0.5442F, -1.9676F, -1.4845F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1567F, -1.2019F, -1.2327F, 3.102F, -0.1248F, 0.3079F));

		PartDefinition cube_r642 = bone6.addOrReplaceChild("cube_r642", CubeListBuilder.create().texOffs(0, 152).addBox(-0.5442F, -1.2936F, -1.3986F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1567F, -1.2019F, -1.2327F, 2.0985F, -0.1248F, 0.3079F));

		PartDefinition cube_r643 = bone6.addOrReplaceChild("cube_r643", CubeListBuilder.create().texOffs(12, 165).addBox(-0.5F, -1.8F, -2.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5613F, -0.909F, -5.7259F, 3.1153F, -0.0832F, 0.3065F));

		PartDefinition cube_r644 = bone6.addOrReplaceChild("cube_r644", CubeListBuilder.create().texOffs(27, 174).addBox(-0.5F, 0.0F, -1.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(174, 17).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.5613F, -0.909F, -5.7259F, 2.1117F, -0.0832F, 0.3065F));

		PartDefinition cube_r645 = bone6.addOrReplaceChild("cube_r645", CubeListBuilder.create().texOffs(144, 115).addBox(-0.521F, -1.1964F, -2.8662F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.1567F, -1.2019F, -1.2327F, 1.0076F, -0.1248F, 0.3079F));

		PartDefinition cube_r646 = bone6.addOrReplaceChild("cube_r646", CubeListBuilder.create().texOffs(156, 80).addBox(-0.5381F, -2.1477F, -1.429F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.9904F, 0.5982F, -4.1953F, 1.0209F, -0.0832F, 0.3065F));

		PartDefinition cube_r647 = bone6.addOrReplaceChild("cube_r647", CubeListBuilder.create().texOffs(149, 79).addBox(-0.5F, -2.0F, -1.1F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 0.9499F, 2.4797F, -1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r648 = bone6.addOrReplaceChild("cube_r648", CubeListBuilder.create().texOffs(151, 130).addBox(-0.5116F, -1.2019F, -1.484F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5116F, -1.5932F, 5.4827F, 1.9661F, 0.0F, 0.0F));

		PartDefinition cube_r649 = bone6.addOrReplaceChild("cube_r649", CubeListBuilder.create().texOffs(163, 39).addBox(-0.5116F, -1.4597F, -1.4697F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5116F, -1.5932F, 5.4827F, 2.9697F, 0.0F, 0.0F));

		PartDefinition cube_r650 = bone6.addOrReplaceChild("cube_r650", CubeListBuilder.create().texOffs(167, 162).addBox(-0.5116F, -0.2657F, 0.1831F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5116F, -1.5932F, 5.4827F, 2.1407F, 0.0F, 0.0F));

		PartDefinition cube_r651 = bone6.addOrReplaceChild("cube_r651", CubeListBuilder.create().texOffs(126, 139).addBox(-0.4884F, -1.2132F, -2.8667F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5116F, -1.5932F, 5.4827F, 0.8753F, 0.0F, 0.0F));

		PartDefinition cube_r652 = bone6.addOrReplaceChild("cube_r652", CubeListBuilder.create().texOffs(110, 151).addBox(-0.5467F, -1.1872F, -1.5073F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5467F, -1.6049F, 2.2578F, 2.1407F, 0.0F, 0.0F));

		PartDefinition cube_r653 = bone6.addOrReplaceChild("cube_r653", CubeListBuilder.create().texOffs(57, 110).addBox(-0.5467F, -1.9715F, -1.4945F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5467F, -1.6049F, 2.2578F, -3.139F, 0.0F, 0.0F));

		PartDefinition cube_r654 = bone6.addOrReplaceChild("cube_r654", CubeListBuilder.create().texOffs(132, 167).addBox(-0.5467F, -0.2553F, 0.1577F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5467F, -1.6049F, 2.2578F, 2.3152F, 0.0F, 0.0F));

		PartDefinition cube_r655 = bone6.addOrReplaceChild("cube_r655", CubeListBuilder.create().texOffs(117, 139).addBox(-0.5235F, -1.1858F, -2.8645F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5467F, -1.6049F, 2.2578F, 1.0498F, 0.0F, 0.0F));

		PartDefinition cube_r656 = bone6.addOrReplaceChild("cube_r656", CubeListBuilder.create().texOffs(15, 125).addBox(0.0F, -0.0231F, -0.3295F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(25, 83).addBox(-0.5F, -0.1322F, -0.0375F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3213F, 10.8101F, -0.0149F, 0.0899F, -0.0374F));

		PartDefinition cube_r657 = tail5.addOrReplaceChild("cube_r657", CubeListBuilder.create().texOffs(124, 178).addBox(0.0F, -2.2538F, -0.0126F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2322F, 10.1625F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r658 = tail5.addOrReplaceChild("cube_r658", CubeListBuilder.create().texOffs(121, 178).addBox(0.0F, -2.2735F, 0.047F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2322F, 7.9625F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r659 = tail5.addOrReplaceChild("cube_r659", CubeListBuilder.create().texOffs(118, 178).addBox(0.0F, -2.1551F, 0.0102F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2322F, 5.9625F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r660 = tail5.addOrReplaceChild("cube_r660", CubeListBuilder.create().texOffs(115, 178).addBox(0.0F, -2.4368F, 0.0735F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2322F, 3.9625F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r661 = tail5.addOrReplaceChild("cube_r661", CubeListBuilder.create().texOffs(151, 178).addBox(0.0F, -2.3184F, 0.0367F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2322F, 1.9625F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r662 = tail5.addOrReplaceChild("cube_r662", CubeListBuilder.create().texOffs(178, 114).addBox(0.0F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2322F, -0.0375F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r663 = tail5.addOrReplaceChild("cube_r663", CubeListBuilder.create().texOffs(36, 54).addBox(0.0F, 5.0F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(180, 46).addBox(0.0F, 2.8F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(180, 42).addBox(0.0F, 1.2F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 179).addBox(0.0F, -0.2F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8208F, -0.2297F, 0.6545F, 0.0F, 0.0F));

		PartDefinition bone5 = tail5.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-0.5F, -4.2949F, -3.49F));

		PartDefinition cube_r664 = bone5.addOrReplaceChild("cube_r664", CubeListBuilder.create().texOffs(41, 128).addBox(-0.5F, -7.1F, -1.7F, 1.0F, 10.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.5F, 1.2391F, 9.5348F, -1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r665 = bone5.addOrReplaceChild("cube_r665", CubeListBuilder.create().texOffs(77, 158).addBox(-0.5116F, -0.6019F, -1.484F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5116F, -1.2932F, 14.2827F, 1.4862F, 0.0F, 0.0F));

		PartDefinition cube_r666 = bone5.addOrReplaceChild("cube_r666", CubeListBuilder.create().texOffs(98, 159).addBox(-0.5116F, -1.7598F, -1.1697F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5116F, -1.2932F, 14.2827F, 2.8388F, 0.0F, 0.0F));

		PartDefinition cube_r667 = bone5.addOrReplaceChild("cube_r667", CubeListBuilder.create().texOffs(168, 39).addBox(-0.5116F, -0.2657F, 0.0831F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5116F, -1.2932F, 14.2827F, 2.1407F, 0.0F, 0.0F));

		PartDefinition cube_r668 = bone5.addOrReplaceChild("cube_r668", CubeListBuilder.create().texOffs(140, 82).addBox(-0.4884F, -1.1132F, -2.8667F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5116F, -1.2932F, 14.2827F, 0.8753F, 0.0F, 0.0F));

		PartDefinition cube_r669 = bone5.addOrReplaceChild("cube_r669", CubeListBuilder.create().texOffs(144, 34).addBox(-0.4884F, -1.1132F, -2.8667F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5116F, -1.2932F, 11.5827F, 0.8753F, 0.0F, 0.0F));

		PartDefinition cube_r670 = bone5.addOrReplaceChild("cube_r670", CubeListBuilder.create().texOffs(168, 83).addBox(-0.5116F, -0.2657F, 0.0831F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5116F, -1.2932F, 11.5827F, 2.1407F, 0.0F, 0.0F));

		PartDefinition cube_r671 = bone5.addOrReplaceChild("cube_r671", CubeListBuilder.create().texOffs(50, 163).addBox(-0.5116F, -1.7598F, -1.1697F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5116F, -1.2932F, 11.5827F, 2.8388F, 0.0F, 0.0F));

		PartDefinition cube_r672 = bone5.addOrReplaceChild("cube_r672", CubeListBuilder.create().texOffs(0, 162).addBox(-0.5116F, -0.6019F, -1.484F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5116F, -1.2932F, 11.5827F, 1.4862F, 0.0F, 0.0F));

		PartDefinition cube_r673 = bone5.addOrReplaceChild("cube_r673", CubeListBuilder.create().texOffs(11, 140).addBox(-0.4884F, -1.2132F, -2.8667F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5116F, -1.5932F, 8.6827F, 0.8753F, 0.0F, 0.0F));

		PartDefinition cube_r674 = bone5.addOrReplaceChild("cube_r674", CubeListBuilder.create().texOffs(167, 166).addBox(-0.5116F, -0.2657F, 0.1831F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5116F, -1.5932F, 8.6827F, 2.1407F, 0.0F, 0.0F));

		PartDefinition cube_r675 = bone5.addOrReplaceChild("cube_r675", CubeListBuilder.create().texOffs(158, 136).addBox(-0.5116F, -1.7597F, -1.4697F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5116F, -1.5932F, 8.6827F, 2.9697F, 0.0F, 0.0F));

		PartDefinition cube_r676 = bone5.addOrReplaceChild("cube_r676", CubeListBuilder.create().texOffs(151, 135).addBox(-0.5116F, -1.2019F, -1.484F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5116F, -1.5932F, 8.6827F, 1.9661F, 0.0F, 0.0F));

		PartDefinition cube_r677 = bone5.addOrReplaceChild("cube_r677", CubeListBuilder.create().texOffs(29, 57).addBox(0.0F, -1.1631F, 4.5253F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 101).addBox(-0.5F, -0.1689F, -0.2745F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0515F, 11.2098F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r678 = tail6.addOrReplaceChild("cube_r678", CubeListBuilder.create().texOffs(148, 5).addBox(0.0F, 6.3F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7693F, -11.4395F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r679 = tail6.addOrReplaceChild("cube_r679", CubeListBuilder.create().texOffs(60, 165).addBox(0.0F, -1.8423F, 0.0761F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1689F, 4.7255F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r680 = tail6.addOrReplaceChild("cube_r680", CubeListBuilder.create().texOffs(24, 163).addBox(0.0F, -1.6607F, 0.1128F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1689F, 6.7255F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r681 = tail6.addOrReplaceChild("cube_r681", CubeListBuilder.create().texOffs(97, 22).addBox(0.0F, -1.7857F, -0.157F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1689F, 2.9255F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r682 = tail6.addOrReplaceChild("cube_r682", CubeListBuilder.create().texOffs(85, 139).addBox(0.0F, -2.2055F, 0.0026F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1689F, 0.7255F, -0.4102F, 0.0F, 0.0F));

		PartDefinition bone4 = tail6.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-0.5F, -0.5805F, 1.3849F));

		PartDefinition cube_r683 = bone4.addOrReplaceChild("cube_r683", CubeListBuilder.create().texOffs(36, 147).addBox(-0.5116F, -0.3019F, -2.484F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5116F, -4.2591F, 5.798F, 1.4862F, 0.0F, 0.0F));

		PartDefinition cube_r684 = bone4.addOrReplaceChild("cube_r684", CubeListBuilder.create().texOffs(158, 142).addBox(-0.5116F, -1.8597F, -1.1697F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5116F, -4.2591F, 5.798F, 2.9697F, 0.0F, 0.0F));

		PartDefinition cube_r685 = bone4.addOrReplaceChild("cube_r685", CubeListBuilder.create().texOffs(168, 104).addBox(-0.5116F, -0.2657F, 0.0831F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5116F, -4.2591F, 5.898F, 2.2716F, 0.0F, 0.0F));

		PartDefinition cube_r686 = bone4.addOrReplaceChild("cube_r686", CubeListBuilder.create().texOffs(0, 141).addBox(-0.4884F, -1.1132F, -2.8667F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5116F, -4.2591F, 5.898F, 1.0062F, 0.0F, 0.0F));

		PartDefinition cube_r687 = bone4.addOrReplaceChild("cube_r687", CubeListBuilder.create().texOffs(29, 141).addBox(-0.4884F, -1.1132F, -2.8667F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5116F, -4.3591F, 3.498F, 0.8753F, 0.0F, 0.0F));

		PartDefinition cube_r688 = bone4.addOrReplaceChild("cube_r688", CubeListBuilder.create().texOffs(69, 168).addBox(-0.5116F, -0.2657F, 0.0831F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5116F, -4.3591F, 3.498F, 2.2716F, 0.0F, 0.0F));

		PartDefinition cube_r689 = bone4.addOrReplaceChild("cube_r689", CubeListBuilder.create().texOffs(28, 161).addBox(-0.5116F, -1.8598F, -1.1697F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5116F, -4.3591F, 3.498F, 2.9697F, 0.0F, 0.0F));

		PartDefinition cube_r690 = bone4.addOrReplaceChild("cube_r690", CubeListBuilder.create().texOffs(27, 147).addBox(-0.5116F, -0.3019F, -2.484F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5116F, -4.3591F, 3.498F, 1.4862F, 0.0F, 0.0F));

		PartDefinition cube_r691 = bone4.addOrReplaceChild("cube_r691", CubeListBuilder.create().texOffs(48, 140).addBox(-0.4884F, -1.1132F, -2.8667F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5116F, -4.7591F, 0.898F, 0.8753F, 0.0F, 0.0F));

		PartDefinition cube_r692 = bone4.addOrReplaceChild("cube_r692", CubeListBuilder.create().texOffs(168, 27).addBox(-0.5116F, -0.2657F, 0.0831F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5116F, -4.7591F, 0.898F, 2.1407F, 0.0F, 0.0F));

		PartDefinition cube_r693 = bone4.addOrReplaceChild("cube_r693", CubeListBuilder.create().texOffs(84, 158).addBox(-0.5116F, -1.8597F, -1.4697F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5116F, -4.7591F, 0.898F, 2.9697F, 0.0F, 0.0F));

		PartDefinition cube_r694 = bone4.addOrReplaceChild("cube_r694", CubeListBuilder.create().texOffs(146, 15).addBox(-0.5116F, -0.3019F, -2.484F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5116F, -4.7591F, 0.898F, 1.4862F, 0.0F, 0.0F));

		PartDefinition cube_r695 = bone4.addOrReplaceChild("cube_r695", CubeListBuilder.create().texOffs(29, 46).addBox(0.0F, -6.8516F, -3.0156F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.6493F, 0.0F, 0.0F));

		PartDefinition tail8 = tail6.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(110, 83).addBox(-1.0F, -0.6F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 0.4311F, 7.7255F, 0.0361F, 0.2616F, 0.0094F));

		PartDefinition cube_r696 = tail8.addOrReplaceChild("cube_r696", CubeListBuilder.create().texOffs(180, 38).addBox(0.0F, -2.5F, 3.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(180, 31).addBox(0.0F, -2.1F, 1.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(179, 157).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6F, 1.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition bone3 = tail8.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-1.0F, -1.0116F, -7.0406F));

		PartDefinition cube_r697 = bone3.addOrReplaceChild("cube_r697", CubeListBuilder.create().texOffs(75, 139).addBox(-0.5F, -8.1F, -2.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.5F, 0.5124F, 7.5239F, -1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r698 = bone3.addOrReplaceChild("cube_r698", CubeListBuilder.create().texOffs(0, 157).addBox(-0.4884F, -1.0467F, -1.726F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5116F, -2.6758F, 15.3665F, 0.8753F, 0.0F, 0.0F));

		PartDefinition cube_r699 = bone3.addOrReplaceChild("cube_r699", CubeListBuilder.create().texOffs(125, 174).addBox(-0.5116F, -0.1115F, 0.062F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5116F, -2.6758F, 15.3665F, 2.2716F, 0.0F, 0.0F));

		PartDefinition cube_r700 = bone3.addOrReplaceChild("cube_r700", CubeListBuilder.create().texOffs(163, 142).addBox(-0.5116F, -1.7723F, -0.9864F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5116F, -2.6758F, 15.3665F, 2.8388F, 0.0F, 0.0F));

		PartDefinition cube_r701 = bone3.addOrReplaceChild("cube_r701", CubeListBuilder.create().texOffs(163, 136).addBox(-0.5116F, -1.7723F, -1.0864F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5116F, -3.1758F, 13.1665F, 2.8388F, 0.0F, 0.0F));

		PartDefinition cube_r702 = bone3.addOrReplaceChild("cube_r702", CubeListBuilder.create().texOffs(168, 116).addBox(-0.5116F, -0.1115F, 0.062F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5116F, -3.1758F, 13.1665F, 2.2279F, 0.0F, 0.0F));

		PartDefinition cube_r703 = bone3.addOrReplaceChild("cube_r703", CubeListBuilder.create().texOffs(103, 145).addBox(-0.4884F, -1.0467F, -2.726F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5116F, -3.1758F, 13.1665F, 0.8753F, 0.0F, 0.0F));

		PartDefinition cube_r704 = bone3.addOrReplaceChild("cube_r704", CubeListBuilder.create().texOffs(94, 145).addBox(-0.4884F, -1.0467F, -2.726F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5116F, -3.3758F, 11.0665F, 0.8753F, 0.0F, 0.0F));

		PartDefinition cube_r705 = bone3.addOrReplaceChild("cube_r705", CubeListBuilder.create().texOffs(168, 112).addBox(-0.5116F, -0.1115F, 0.062F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5116F, -3.3758F, 11.0665F, 2.2716F, 0.0F, 0.0F));

		PartDefinition cube_r706 = bone3.addOrReplaceChild("cube_r706", CubeListBuilder.create().texOffs(163, 130).addBox(-0.5116F, -1.7723F, -0.9864F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5116F, -3.3758F, 11.0665F, 2.8388F, 0.0F, 0.0F));

		PartDefinition cube_r707 = bone3.addOrReplaceChild("cube_r707", CubeListBuilder.create().texOffs(135, 144).addBox(-0.4884F, -1.1132F, -2.8667F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5116F, -3.9591F, 8.998F, 1.0062F, 0.0F, 0.0F));

		PartDefinition cube_r708 = bone3.addOrReplaceChild("cube_r708", CubeListBuilder.create().texOffs(168, 108).addBox(-0.5116F, -0.2657F, 0.0831F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5116F, -3.9591F, 8.998F, 2.3588F, 0.0F, 0.0F));

		PartDefinition cube_r709 = bone3.addOrReplaceChild("cube_r709", CubeListBuilder.create().texOffs(64, 163).addBox(-0.5116F, -1.8598F, -1.0697F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5116F, -3.9591F, 8.898F, 2.9697F, 0.0F, 0.0F));

		PartDefinition cube_r710 = bone3.addOrReplaceChild("cube_r710", CubeListBuilder.create().texOffs(70, 139).addBox(0.0F, -15.6303F, -3.4083F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.693F, 0.0F, 0.0F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(0, 111).addBox(-1.0F, -0.6F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, -0.0202F, 0.1296F, -0.0892F));

		PartDefinition cube_r711 = tail9.addOrReplaceChild("cube_r711", CubeListBuilder.create().texOffs(146, 79).addBox(0.0F, -2.05F, 4.775F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 121).addBox(0.0F, -1.625F, 2.875F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 132).addBox(0.0F, -1.2F, 0.975F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(180, 27).addBox(0.0F, -0.9F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6F, 1.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition bone11 = tail9.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offset(-1.0F, -1.0116F, -7.0406F));

		PartDefinition cube_r712 = bone11.addOrReplaceChild("cube_r712", CubeListBuilder.create().texOffs(117, 154).addBox(-0.4884F, -1.0467F, -1.726F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5116F, -1.3758F, 14.3665F, 0.8753F, 0.0F, 0.0F));

		PartDefinition cube_r713 = bone11.addOrReplaceChild("cube_r713", CubeListBuilder.create().texOffs(137, 168).addBox(-0.5116F, -0.1115F, 0.062F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5116F, -1.3758F, 14.3665F, 2.1407F, 0.0F, 0.0F));

		PartDefinition cube_r714 = bone11.addOrReplaceChild("cube_r714", CubeListBuilder.create().texOffs(55, 165).addBox(-0.5116F, -0.7723F, -0.9864F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5116F, -1.3758F, 14.3665F, 2.7515F, 0.0F, 0.0F));

		PartDefinition cube_r715 = bone11.addOrReplaceChild("cube_r715", CubeListBuilder.create().texOffs(165, 54).addBox(-0.5116F, -0.7723F, -0.9864F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5116F, -1.7758F, 12.3665F, 2.7515F, 0.0F, 0.0F));

		PartDefinition cube_r716 = bone11.addOrReplaceChild("cube_r716", CubeListBuilder.create().texOffs(168, 134).addBox(-0.5116F, -0.1115F, 0.062F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5116F, -1.7758F, 12.3665F, 2.1407F, 0.0F, 0.0F));

		PartDefinition cube_r717 = bone11.addOrReplaceChild("cube_r717", CubeListBuilder.create().texOffs(156, 75).addBox(-0.4884F, -1.0467F, -1.726F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5116F, -1.7758F, 12.3665F, 0.8753F, 0.0F, 0.0F));

		PartDefinition cube_r718 = bone11.addOrReplaceChild("cube_r718", CubeListBuilder.create().texOffs(164, 17).addBox(-0.5116F, -1.7723F, -0.9864F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5116F, -2.1758F, 10.3665F, 2.7515F, 0.0F, 0.0F));

		PartDefinition cube_r719 = bone11.addOrReplaceChild("cube_r719", CubeListBuilder.create().texOffs(168, 130).addBox(-0.5116F, -0.1115F, 0.062F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5116F, -2.1758F, 10.3665F, 2.1407F, 0.0F, 0.0F));

		PartDefinition cube_r720 = bone11.addOrReplaceChild("cube_r720", CubeListBuilder.create().texOffs(157, 18).addBox(-0.4884F, -1.0467F, -1.726F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5116F, -2.1758F, 10.3665F, 0.8753F, 0.0F, 0.0F));

		PartDefinition cube_r721 = bone11.addOrReplaceChild("cube_r721", CubeListBuilder.create().texOffs(146, 132).addBox(-0.5F, -3.5F, -0.4F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -0.5377F, 11.2799F, -1.6493F, 0.0F, 0.0F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(85, 76).addBox(-1.0F, -0.6F, 0.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, -0.0638F, 0.2132F, -0.0989F));

		PartDefinition cube_r722 = tail10.addOrReplaceChild("cube_r722", CubeListBuilder.create().texOffs(34, 116).addBox(0.0F, -0.325F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6F, 1.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition bone12 = tail10.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offset(-1.0F, -1.0116F, -7.0406F));

		PartDefinition cube_r723 = bone12.addOrReplaceChild("cube_r723", CubeListBuilder.create().texOffs(173, 112).addBox(-0.5116F, -0.2365F, -0.163F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5116F, 0.9242F, 15.1665F, 2.3152F, 0.0F, 0.0F));

		PartDefinition cube_r724 = bone12.addOrReplaceChild("cube_r724", CubeListBuilder.create().texOffs(141, 178).addBox(-0.5116F, 0.5277F, -0.9864F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5116F, 0.9242F, 15.1665F, 2.7515F, 0.0F, 0.0F));

		PartDefinition cube_r725 = bone12.addOrReplaceChild("cube_r725", CubeListBuilder.create().texOffs(173, 108).addBox(-0.5116F, -0.4723F, -0.9864F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5116F, 0.2242F, 13.7665F, 2.7515F, 0.0F, 0.0F));

		PartDefinition cube_r726 = bone12.addOrReplaceChild("cube_r726", CubeListBuilder.create().texOffs(173, 104).addBox(-0.5116F, -0.2365F, -0.163F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5116F, 0.2242F, 13.7665F, 2.3152F, 0.0F, 0.0F));

		PartDefinition cube_r727 = bone12.addOrReplaceChild("cube_r727", CubeListBuilder.create().texOffs(173, 82).addBox(-0.5116F, -0.2365F, -0.163F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5116F, 0.2242F, 12.0665F, 2.3152F, 0.0F, 0.0F));

		PartDefinition cube_r728 = bone12.addOrReplaceChild("cube_r728", CubeListBuilder.create().texOffs(79, 173).addBox(-0.5116F, 0.2277F, -0.9864F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5116F, 0.2242F, 12.0665F, 2.7515F, 0.0F, 0.0F));

		PartDefinition cube_r729 = bone12.addOrReplaceChild("cube_r729", CubeListBuilder.create().texOffs(122, 165).addBox(-0.5116F, -0.7723F, -0.9864F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5116F, -0.3758F, 10.5665F, 2.7515F, 0.0F, 0.0F));

		PartDefinition cube_r730 = bone12.addOrReplaceChild("cube_r730", CubeListBuilder.create().texOffs(117, 165).addBox(-0.5116F, -1.2365F, -0.163F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5116F, -0.3758F, 10.5665F, 2.3152F, 0.0F, 0.0F));

		PartDefinition cube_r731 = bone12.addOrReplaceChild("cube_r731", CubeListBuilder.create().texOffs(96, 165).addBox(-0.5116F, -0.7723F, -0.9864F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5116F, -0.9758F, 8.9665F, 2.7515F, 0.0F, 0.0F));

		PartDefinition cube_r732 = bone12.addOrReplaceChild("cube_r732", CubeListBuilder.create().texOffs(168, 138).addBox(-0.5116F, -0.2365F, -0.163F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5116F, -0.9758F, 8.9665F, 2.3152F, 0.0F, 0.0F));

		PartDefinition cube_r733 = bone12.addOrReplaceChild("cube_r733", CubeListBuilder.create().texOffs(58, 173).addBox(-0.4884F, -1.0467F, -0.726F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5116F, -0.9758F, 8.9665F, 1.3116F, 0.0F, 0.0F));

		PartDefinition cube_r734 = bone12.addOrReplaceChild("cube_r734", CubeListBuilder.create().texOffs(80, 139).addBox(-0.5F, -8.3F, -1.2F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.5F, 0.5124F, 7.5239F, -1.6057F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 186, 186);
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