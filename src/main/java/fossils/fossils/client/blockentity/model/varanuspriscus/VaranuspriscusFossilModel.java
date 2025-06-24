package fossils.fossils.client.blockentity.model.varanuspriscus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class VaranuspriscusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart chest;
	private final ModelPart FrontFlipperR2;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart FrontFlipperR4;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart FrontFlipperR3;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart FrontFlipperR5;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
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
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public VaranuspriscusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.chest = this.fossil.getChild("chest");
		this.FrontFlipperR2 = this.chest.getChild("FrontFlipperR2");
		this.leftArm = this.FrontFlipperR2.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.FrontFlipperR4 = this.chest.getChild("FrontFlipperR4");
		this.rightArm = this.FrontFlipperR4.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.body = this.chest.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.hips = this.body3.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.FrontFlipperR3 = this.bone.getChild("FrontFlipperR3");
		this.leftArm3 = this.FrontFlipperR3.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.FrontFlipperR5 = this.bone.getChild("FrontFlipperR5");
		this.rightArm3 = this.FrontFlipperR5.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
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
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition chest = fossil.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -13.2566F, -16.9804F, -0.1251F, -0.4333F, 0.0527F));

		PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(46, 85).addBox(0.0F, -1.8599F, 0.0026F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -2.0F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r2 = chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(67, 6).mirror().addBox(-0.5241F, -0.5271F, 0.6159F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(84, 13).mirror().addBox(-0.5241F, -0.2271F, 1.6159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8323F, 1.9815F, -0.293F, 1.8182F, -0.2556F, 0.3132F));

		PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(56, 62).mirror().addBox(-0.5241F, 0.5836F, -1.1455F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-2.8323F, 1.9815F, -0.293F, 2.7781F, -0.2556F, 0.3132F));

		PartDefinition cube_r4 = chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(18, 83).mirror().addBox(-0.5241F, 1.7615F, -0.3097F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.8323F, 1.9815F, -0.293F, 2.1236F, -0.2556F, 0.3132F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(82, 79).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3249F, -1.4059F, 0.3316F, 0.1768F, -0.3042F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(64, 4).mirror().addBox(-5.2375F, -1.8712F, -0.5599F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3249F, -1.4059F, 0.0054F, 0.391F, -1.341F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(7, 74).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3249F, -1.4059F, 0.2136F, 0.3301F, -0.7653F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(25, 60).mirror().addBox(-0.5241F, 0.0782F, -0.1095F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.8323F, 1.9815F, -0.293F, 1.251F, -0.2556F, 0.3132F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(58, 19).mirror().addBox(-0.5241F, -1.5595F, -0.1509F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8323F, 1.9815F, -0.293F, -2.6673F, -0.2556F, 0.3132F));

		PartDefinition cube_r10 = chest.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-0.5241F, -0.3286F, 1.3383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(70, 65).mirror().addBox(-0.5241F, 0.0502F, 0.3434F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.8323F, 1.9815F, -0.293F, 2.8218F, -0.2556F, 0.3132F));

		PartDefinition cube_r11 = chest.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(29, 55).mirror().addBox(-0.5241F, -0.1739F, -0.4172F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.8323F, 1.9815F, -0.293F, 2.3331F, -0.2556F, 0.3132F));

		PartDefinition cube_r12 = chest.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(18, 60).mirror().addBox(-0.5241F, 1.1531F, -1.0164F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.8323F, 1.9815F, -0.293F, 0.0292F, -0.2556F, 0.3132F));

		PartDefinition cube_r13 = chest.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(39, 61).mirror().addBox(-0.5241F, -0.0572F, -1.2715F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.8323F, 1.9815F, -0.293F, 0.8583F, -0.2556F, 0.3132F));

		PartDefinition cube_r14 = chest.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(65, 41).mirror().addBox(-0.8031F, -0.5F, -1.3707F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4107F, 5.3657F, -0.1604F, -0.2982F, -0.9386F, 0.8103F));

		PartDefinition cube_r15 = chest.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(65, 37).mirror().addBox(-0.1331F, -0.5F, -1.3396F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4107F, 5.3657F, -0.1604F, -2.6656F, -1.1821F, -3.0195F));

		PartDefinition cube_r16 = chest.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(20, 55).mirror().addBox(-0.4783F, -0.5F, -1.3019F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.4107F, 5.3657F, -0.1604F, -0.9336F, -1.353F, 1.4893F));

		PartDefinition cube_r17 = chest.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(67, 53).mirror().addBox(-1.4867F, -0.8436F, -1.6092F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(67, 53).addBox(1.5133F, -0.8436F, -1.6092F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(43, 14).addBox(-0.4867F, -0.8436F, -3.6092F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5133F, 6.3274F, 0.0647F, -0.1222F, 0.1396F, 0.0F));

		PartDefinition cube_r18 = chest.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(41, 34).mirror().addBox(-2.0789F, -0.7889F, 1.7867F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-0.5133F, 6.3274F, 0.0647F, 0.0191F, 0.4363F, 0.0056F));

		PartDefinition cube_r19 = chest.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(45, 32).mirror().addBox(-5.8F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9412F, 6.0117F, 6.8881F, 0.1712F, 1.1466F, 0.2535F));

		PartDefinition cube_r20 = chest.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(13, 47).mirror().addBox(-6.652F, 0.1688F, 5.8401F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5133F, 6.3274F, 0.0647F, 0.1243F, 0.5058F, 0.0201F));

		PartDefinition cube_r21 = chest.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(19, 8).mirror().addBox(-5.7403F, 0.6601F, 4.7935F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5133F, 6.3274F, 0.0647F, 0.2293F, 0.3442F, 0.0657F));

		PartDefinition cube_r22 = chest.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(32, 24).mirror().addBox(-5.3927F, 0.6093F, 3.4607F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5133F, 6.3274F, 0.0647F, 0.2351F, 0.3395F, 0.0528F));

		PartDefinition cube_r23 = chest.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(65, 28).mirror().addBox(-3.9241F, 0.8887F, 2.2578F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5133F, 6.3274F, 0.0647F, 0.3428F, 0.1052F, 0.1879F));

		PartDefinition cube_r24 = chest.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(82, 79).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3249F, -1.4059F, 0.3316F, -0.1768F, 0.3042F));

		PartDefinition cube_r25 = chest.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(64, 4).addBox(2.2375F, -1.8712F, -0.5599F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3249F, -1.4059F, 0.0054F, -0.391F, 1.341F));

		PartDefinition cube_r26 = chest.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(7, 74).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3249F, -1.4059F, 0.2136F, -0.3301F, 0.7653F));

		PartDefinition cube_r27 = chest.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(56, 62).addBox(-0.4759F, 0.5836F, -1.1455F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(2.8323F, 1.9815F, -0.293F, 2.7781F, 0.2556F, -0.3132F));

		PartDefinition cube_r28 = chest.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(18, 83).addBox(-0.4759F, 1.7615F, -0.3097F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.8323F, 1.9815F, -0.293F, 2.1236F, 0.2556F, -0.3132F));

		PartDefinition cube_r29 = chest.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(25, 60).addBox(-0.4759F, 0.0782F, -0.1095F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.8323F, 1.9815F, -0.293F, 1.251F, 0.2556F, -0.3132F));

		PartDefinition cube_r30 = chest.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(58, 19).addBox(-0.4759F, -1.5595F, -0.1509F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8323F, 1.9815F, -0.293F, -2.6673F, 0.2556F, -0.3132F));

		PartDefinition cube_r31 = chest.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 86).addBox(-0.4759F, -0.3286F, 1.3383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(70, 65).addBox(-0.4759F, 0.0502F, 0.3434F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.8323F, 1.9815F, -0.293F, 2.8218F, 0.2556F, -0.3132F));

		PartDefinition cube_r32 = chest.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(67, 6).addBox(-0.4759F, -0.5271F, 0.6159F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F))
				.texOffs(84, 13).addBox(-0.4759F, -0.2271F, 1.6159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8323F, 1.9815F, -0.293F, 1.8182F, 0.2556F, -0.3132F));

		PartDefinition cube_r33 = chest.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(29, 55).addBox(-0.4759F, -0.1739F, -0.4172F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.8323F, 1.9815F, -0.293F, 2.3331F, 0.2556F, -0.3132F));

		PartDefinition cube_r34 = chest.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(18, 60).addBox(-0.4759F, 1.1531F, -1.0164F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.8323F, 1.9815F, -0.293F, 0.0292F, 0.2556F, -0.3132F));

		PartDefinition cube_r35 = chest.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(39, 61).addBox(-0.4759F, -0.0572F, -1.2715F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.8323F, 1.9815F, -0.293F, 0.8583F, 0.2556F, -0.3132F));

		PartDefinition cube_r36 = chest.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(65, 41).addBox(-0.1969F, -0.5F, -1.3707F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4107F, 5.3657F, -0.1604F, -0.2982F, 0.9386F, -0.8103F));

		PartDefinition cube_r37 = chest.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(65, 37).addBox(-0.8669F, -0.5F, -1.3396F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4107F, 5.3657F, -0.1604F, -2.6656F, 1.1821F, 3.0195F));

		PartDefinition cube_r38 = chest.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(20, 55).addBox(-0.5217F, -0.5F, -1.3019F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.4107F, 5.3657F, -0.1604F, -0.9336F, 1.353F, -1.4893F));

		PartDefinition cube_r39 = chest.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(41, 34).addBox(2.0606F, -0.7889F, 1.4866F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0124F)), PartPose.offsetAndRotation(-0.5133F, 6.3274F, 0.0647F, 0.0175F, -0.157F, -0.0052F));

		PartDefinition cube_r40 = chest.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(14, 69).addBox(0.0133F, -0.7889F, 4.3558F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(58, 54).addBox(-0.4867F, -0.7889F, 2.3558F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(49, 0).addBox(-1.4867F, -0.7889F, 0.3558F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5133F, 6.3274F, 0.0647F, 0.0175F, 0.1396F, 0.0F));

		PartDefinition cube_r41 = chest.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(45, 32).addBox(0.0F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8231F, 6.0281F, 6.7668F, 0.0154F, -0.4382F, -0.0968F));

		PartDefinition cube_r42 = chest.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(13, 47).addBox(-0.3F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1707F, 5.7324F, 6.5593F, 0.1176F, -0.1833F, -0.0128F));

		PartDefinition cube_r43 = chest.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(19, 8).addBox(1.7434F, 0.6779F, 4.576F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5133F, 6.3274F, 0.0647F, 0.2111F, -0.0655F, -0.062F));

		PartDefinition cube_r44 = chest.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(32, 24).addBox(2.3974F, 0.6141F, 3.2504F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5133F, 6.3274F, 0.0647F, 0.2205F, -0.0606F, -0.0499F));

		PartDefinition cube_r45 = chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(65, 28).addBox(1.9322F, 1.08F, 2.229F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5133F, 6.3274F, 0.0647F, 0.2906F, 0.1691F, -0.1896F));

		PartDefinition cube_r46 = chest.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(65, 24).addBox(-0.5F, -0.8F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.1F, 0.2618F, 0.0F, 0.0F));

		PartDefinition FrontFlipperR2 = chest.addOrReplaceChild("FrontFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.8017F, 4.6361F, 0.9384F, 0.7801F, -0.4129F, 0.7059F));

		PartDefinition cube_r47 = FrontFlipperR2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(67, 34).addBox(-2.236F, -0.5F, -0.9313F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.4255F, -0.0601F, -0.5658F, 0.0F, 0.1396F, 0.0F));

		PartDefinition cube_r48 = FrontFlipperR2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(59, 74).addBox(11.3777F, 2.1028F, 13.2399F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.8972F, -3.1629F, -17.7979F, 0.0F, -0.9163F, 0.0F));

		PartDefinition cube_r49 = FrontFlipperR2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(56, 67).addBox(0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.3151F, -0.0601F, 1.2895F, 0.0F, -0.2531F, 0.0F));

		PartDefinition cube_r50 = FrontFlipperR2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(72, 13).addBox(-0.027F, -0.5F, -0.4733F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.0255F, -0.0601F, -1.4658F, 0.0F, -1.3177F, 0.0F));

		PartDefinition cube_r51 = FrontFlipperR2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(54, 34).addBox(-1.3F, -0.5F, 0.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.9043F, -0.0601F, -0.2998F, 0.0F, -0.7418F, 0.0F));

		PartDefinition cube_r52 = FrontFlipperR2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(72, 19).addBox(-1.025F, -0.5F, -0.325F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4057F, -0.0601F, -0.2344F, 0.0F, -0.0436F, 0.0F));

		PartDefinition leftArm = FrontFlipperR2.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(72, 22).addBox(0.0F, -0.5F, -1.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5184F, -0.4618F, 2.8194F, 0.8145F, 0.361F, 0.331F));

		PartDefinition cube_r53 = leftArm.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(24, 52).addBox(-1.5F, -0.5F, -0.2F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.5512F, 0.0F, -2.4207F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r54 = leftArm.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(54, 45).addBox(-0.0041F, -1.0F, -0.5644F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 0.5F, -0.5F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r55 = leftArm.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(19, 73).addBox(-1.65F, 0.0F, -1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.9F, -0.5F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(30, 34).addBox(-0.1028F, -4.9748F, -2.0665F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2038F, 0.1426F, -2.6142F, 0.0154F, 0.3621F, -0.1285F));

		PartDefinition FrontFlipperR4 = chest.addOrReplaceChild("FrontFlipperR4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.8017F, 4.6361F, 0.9384F, 0.7155F, -0.2637F, -0.8128F));

		PartDefinition cube_r56 = FrontFlipperR4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(67, 34).mirror().addBox(0.236F, -0.5F, -0.9313F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.4255F, -0.0601F, -0.5658F, 0.0F, -0.1396F, 0.0F));

		PartDefinition cube_r57 = FrontFlipperR4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(59, 74).mirror().addBox(-12.3777F, 2.1028F, 13.2399F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.8972F, -3.1629F, -17.7979F, 0.0F, 0.9163F, 0.0F));

		PartDefinition cube_r58 = FrontFlipperR4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(56, 67).mirror().addBox(-1.5F, -0.5F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.3151F, -0.0601F, 1.2895F, 0.0F, 0.2531F, 0.0F));

		PartDefinition cube_r59 = FrontFlipperR4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(72, 13).mirror().addBox(-1.973F, -0.5F, -0.4733F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0255F, -0.0601F, -1.4658F, 0.0F, 1.3177F, 0.0F));

		PartDefinition cube_r60 = FrontFlipperR4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(54, 34).mirror().addBox(-3.7F, -0.5F, 0.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9043F, -0.0601F, -0.2998F, 0.0F, 0.7418F, 0.0F));

		PartDefinition cube_r61 = FrontFlipperR4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(72, 19).mirror().addBox(-0.975F, -0.5F, -0.325F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4057F, -0.0601F, -0.2344F, 0.0F, 0.0436F, 0.0F));

		PartDefinition rightArm = FrontFlipperR4.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(72, 22).mirror().addBox(-2.0F, -0.5F, -1.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5184F, -0.4618F, 2.8194F, 0.6408F, -0.5924F, 0.098F));

		PartDefinition cube_r62 = rightArm.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(24, 52).mirror().addBox(-3.5F, -0.5F, -0.2F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5512F, 0.0F, -2.4207F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r63 = rightArm.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(54, 45).mirror().addBox(-3.9959F, -1.0F, -0.5644F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.5F, -0.5F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r64 = rightArm.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(19, 73).mirror().addBox(-0.35F, 0.0F, -1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -0.5F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(30, 34).mirror().addBox(-0.8972F, -4.9748F, -2.0665F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2038F, 0.1426F, -2.6142F, 0.4263F, -0.335F, -1.0681F));

		PartDefinition body = chest.addOrReplaceChild("body", CubeListBuilder.create().texOffs(45, 50).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2214F, 0.1704F, 0.0381F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(89, 13).addBox(0.0F, -1.4715F, -0.0741F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 2.0F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(30, 88).addBox(0.0F, -1.7001F, 0.007F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -0.1F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(37, 48).mirror().addBox(-8.2375F, -1.8712F, -0.5599F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0249F, 6.3941F, -0.0395F, 0.0622F, -1.2812F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(52, 74).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0249F, 6.3941F, -0.0018F, 0.0736F, -0.739F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(18, 86).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0249F, 6.3941F, 0.0261F, 0.0427F, -0.2679F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(87, 38).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1751F, 4.3941F, 0.042F, 0.0499F, -0.2148F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(77, 40).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1751F, 4.3941F, 0.0091F, 0.0873F, -0.6857F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(49, 4).mirror().addBox(-8.2375F, -1.8712F, -0.5599F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1751F, 4.3941F, -0.0372F, 0.0795F, -1.2287F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(85, 70).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1751F, 2.3941F, 0.0899F, 0.0714F, -0.2119F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(74, 34).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1751F, 2.3941F, 0.0422F, 0.1281F, -0.6822F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(47, 12).mirror().addBox(-8.2375F, -1.8712F, -0.5599F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1751F, 2.3941F, -0.0302F, 0.1314F, -1.2279F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(84, 43).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0249F, 0.3941F, 0.1048F, 0.0752F, -0.255F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(74, 28).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0249F, 0.3941F, 0.0444F, 0.1501F, -0.7173F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(34, 6).mirror().addBox(-7.2375F, -1.8712F, -0.5598F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0249F, 0.3941F, -0.0399F, 0.1513F, -1.2647F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(37, 48).addBox(2.2375F, -1.8712F, -0.5599F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0249F, 6.3941F, -0.0395F, -0.0622F, 1.2812F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(52, 74).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0249F, 6.3941F, -0.0018F, -0.0736F, 0.739F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(18, 86).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0249F, 6.3941F, 0.0261F, -0.0427F, 0.2679F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(87, 38).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1751F, 4.3941F, 0.042F, -0.0499F, 0.2148F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(77, 40).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1751F, 4.3941F, 0.0091F, -0.0873F, 0.6857F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(49, 4).addBox(2.2375F, -1.8712F, -0.5599F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1751F, 4.3941F, -0.0372F, -0.0795F, 1.2287F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(85, 70).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1751F, 2.3941F, 0.0899F, -0.0714F, 0.2119F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(74, 34).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1751F, 2.3941F, 0.0422F, -0.1281F, 0.6822F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(47, 12).addBox(2.2375F, -1.8712F, -0.5599F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1751F, 2.3941F, -0.0302F, -0.1314F, 1.2279F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(84, 43).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0249F, 0.3941F, 0.1048F, -0.0752F, 0.255F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(74, 28).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0249F, 0.3941F, 0.0444F, -0.1501F, 0.7173F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(34, 6).addBox(2.2375F, -1.8712F, -0.5598F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0249F, 0.3941F, -0.0399F, -0.1513F, 1.2647F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(18, 88).addBox(0.0F, -1.6001F, -0.0616F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3087F, 5.9004F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(88, 87).addBox(0.0F, -1.6023F, 0.0479F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5087F, 3.8004F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(47, 6).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0087F, 3.8004F, -0.096F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.2784F, 7.7024F, -0.1355F, 0.2595F, -0.035F));

		PartDefinition cube_r94 = body2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(55, 87).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 4.0F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r95 = body2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(0, 89).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 2.0F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r96 = body2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(86, 28).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r97 = body2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(73, 87).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0534F, 4.5917F, 0.2344F, 0.1347F, -0.4065F));

		PartDefinition cube_r98 = body2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(77, 63).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0534F, 4.5917F, 0.1437F, 0.2494F, -0.8725F));

		PartDefinition cube_r99 = body2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(30, 50).mirror().addBox(-8.2375F, -1.8712F, -0.5598F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0534F, 4.5917F, -0.0085F, 0.287F, -1.4328F));

		PartDefinition cube_r100 = body2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(87, 45).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0534F, 2.5917F, 0.2021F, 0.1208F, -0.4106F));

		PartDefinition cube_r101 = body2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(77, 61).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0534F, 2.5917F, 0.1207F, 0.2227F, -0.8779F));

		PartDefinition cube_r102 = body2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(15, 50).mirror().addBox(-8.2375F, -1.8712F, -0.5598F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0534F, 2.5917F, -0.0135F, 0.2524F, -1.4342F));

		PartDefinition cube_r103 = body2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(26, 86).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0534F, 0.5917F, 0.1847F, 0.1172F, -0.308F));

		PartDefinition cube_r104 = body2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(74, 53).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0534F, 0.5917F, 0.1066F, 0.2117F, -0.7762F));

		PartDefinition cube_r105 = body2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(-8.2375F, -1.8712F, -0.5599F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0534F, 0.5917F, -0.0196F, 0.2358F, -1.331F));

		PartDefinition cube_r106 = body2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(30, 50).addBox(2.2375F, -1.8712F, -0.5598F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0534F, 4.5917F, -0.0085F, -0.287F, 1.4328F));

		PartDefinition cube_r107 = body2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(77, 63).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0534F, 4.5917F, 0.1437F, -0.2494F, 0.8725F));

		PartDefinition cube_r108 = body2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(73, 87).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0534F, 4.5917F, 0.2344F, -0.1347F, 0.4065F));

		PartDefinition cube_r109 = body2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(87, 45).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0534F, 2.5917F, 0.2021F, -0.1208F, 0.4106F));

		PartDefinition cube_r110 = body2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(77, 61).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0534F, 2.5917F, 0.1207F, -0.2227F, 0.8779F));

		PartDefinition cube_r111 = body2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(15, 50).addBox(2.2375F, -1.8712F, -0.5598F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0534F, 2.5917F, -0.0135F, -0.2524F, 1.4342F));

		PartDefinition cube_r112 = body2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(26, 86).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0534F, 0.5917F, 0.1847F, -0.1172F, 0.308F));

		PartDefinition cube_r113 = body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(74, 53).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0534F, 0.5917F, 0.1066F, -0.2117F, 0.7762F));

		PartDefinition cube_r114 = body2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(0, 49).addBox(2.2375F, -1.8712F, -0.5599F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0534F, 0.5917F, -0.0196F, -0.2358F, 1.331F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(0, 10).addBox(-1.0F, -0.4F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 6.0F, -0.1418F, 0.1728F, -0.0245F));

		PartDefinition cube_r115 = body3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(70, 87).addBox(-0.5F, -1.6779F, 0.0037F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 6.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r116 = body3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(64, 87).addBox(-0.5F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 4.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r117 = body3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(3, 89).addBox(-0.5F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 2.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r118 = body3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(53, 63).addBox(-0.5F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r119 = body3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(83, 87).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0534F, 6.4917F, 0.3979F, 0.2016F, -0.4837F));

		PartDefinition cube_r120 = body3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(31, 78).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0534F, 6.4917F, 0.2643F, 0.3812F, -0.9397F));

		PartDefinition cube_r121 = body3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(87, 79).mirror().addBox(-3.2375F, -1.8712F, -0.5598F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0534F, 6.4917F, 0.0181F, 0.4598F, -1.5278F));

		PartDefinition cube_r122 = body3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(24, 78).mirror().addBox(-4.2375F, -1.8712F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0534F, 4.4917F, 0.0181F, 0.4598F, -1.5278F));

		PartDefinition cube_r123 = body3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(12, 78).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0534F, 4.4917F, 0.2643F, 0.3812F, -0.9397F));

		PartDefinition cube_r124 = body3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(78, 87).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0534F, 4.4917F, 0.3979F, 0.2016F, -0.4837F));

		PartDefinition cube_r125 = body3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(87, 77).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0534F, 2.4917F, 0.3814F, 0.1951F, -0.4346F));

		PartDefinition cube_r126 = body3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(77, 67).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0534F, 2.4917F, 0.2517F, 0.3682F, -0.892F));

		PartDefinition cube_r127 = body3.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(58, 10).mirror().addBox(-6.2375F, -1.8712F, -0.5598F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0534F, 2.4917F, 0.0153F, 0.4425F, -1.4767F));

		PartDefinition cube_r128 = body3.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(87, 75).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0534F, 0.5917F, 0.3485F, 0.182F, -0.3885F));

		PartDefinition cube_r129 = body3.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(77, 65).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0534F, 0.5917F, 0.227F, 0.3421F, -0.8482F));

		PartDefinition cube_r130 = body3.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(52, 48).mirror().addBox(-7.2375F, -1.8712F, -0.5598F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0534F, 0.5917F, 0.0097F, 0.408F, -1.4266F));

		PartDefinition cube_r131 = body3.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(87, 79).addBox(2.2375F, -1.8712F, -0.5598F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0534F, 6.4917F, 0.0181F, -0.4598F, 1.5278F));

		PartDefinition cube_r132 = body3.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(31, 78).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0534F, 6.4917F, 0.2643F, -0.3812F, 0.9397F));

		PartDefinition cube_r133 = body3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(83, 87).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0534F, 6.4917F, 0.3979F, -0.2016F, 0.4837F));

		PartDefinition cube_r134 = body3.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(78, 87).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0534F, 4.4917F, 0.3979F, -0.2016F, 0.4837F));

		PartDefinition cube_r135 = body3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(12, 78).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0534F, 4.4917F, 0.2643F, -0.3812F, 0.9397F));

		PartDefinition cube_r136 = body3.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(24, 78).addBox(2.2375F, -1.8712F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0534F, 4.4917F, 0.0181F, -0.4598F, 1.5278F));

		PartDefinition cube_r137 = body3.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(58, 10).addBox(2.2375F, -1.8712F, -0.5598F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0534F, 2.4917F, 0.0153F, -0.4425F, 1.4767F));

		PartDefinition cube_r138 = body3.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(77, 67).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0534F, 2.4917F, 0.2517F, -0.3682F, 0.892F));

		PartDefinition cube_r139 = body3.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(87, 77).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0534F, 2.4917F, 0.3814F, -0.1951F, 0.4346F));

		PartDefinition cube_r140 = body3.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(52, 48).addBox(2.2375F, -1.8712F, -0.5598F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0534F, 0.5917F, 0.0097F, -0.408F, 1.4266F));

		PartDefinition cube_r141 = body3.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(77, 65).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0534F, 0.5917F, 0.227F, -0.3421F, 0.8482F));

		PartDefinition cube_r142 = body3.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(87, 75).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0534F, 0.5917F, 0.3485F, -0.182F, 0.3885F));

		PartDefinition hips = body3.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.3834F, 0.0594F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.0522F, 6.8665F, -0.2011F, 0.2996F, -0.0601F));

		PartDefinition cube_r143 = hips.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(27, 88).addBox(-0.5F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3834F, 7.0594F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r144 = hips.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(89, 17).addBox(-0.5F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3834F, 5.0594F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r145 = hips.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(24, 88).addBox(-0.5F, -1.6499F, -0.0513F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3834F, 1.0594F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r146 = hips.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(61, 87).addBox(-0.5F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3834F, 3.0594F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r147 = hips.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(31, 86).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0369F, 3.6511F, 0.0739F, 0.0642F, -0.7366F));

		PartDefinition cube_r148 = hips.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(58, 58).mirror().addBox(-1.0F, 0.0F, -1.5F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1203F, 6.4984F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r149 = hips.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(31, 86).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0369F, 3.6511F, 0.0739F, -0.0642F, 0.7366F));

		PartDefinition cube_r150 = hips.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(58, 58).addBox(0.0F, 0.0F, -1.5F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1203F, 6.4984F, 0.0F, 0.0F, 0.4363F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.0025F, 1.9668F, 4.9705F));

		PartDefinition cube_r151 = bone.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(31, 74).mirror().addBox(-0.1986F, 0.4421F, -1.6273F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.305F, -0.3138F, -0.0389F, 1.5877F, 0.2356F, -0.3316F));

		PartDefinition cube_r152 = bone.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(76, 0).mirror().addBox(-0.1986F, 1.4941F, -2.2317F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-3.305F, -0.3138F, -0.0389F, 1.9018F, 0.2356F, -0.3316F));

		PartDefinition cube_r153 = bone.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(75, 69).mirror().addBox(-0.1986F, 1.3314F, -1.4306F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-3.305F, -0.3138F, -0.0389F, 1.64F, 0.2356F, -0.3316F));

		PartDefinition cube_r154 = bone.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(74, 74).mirror().addBox(-0.1986F, -0.3509F, -1.7743F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(69, 74).mirror().addBox(-0.1986F, 0.1491F, -1.3743F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-3.305F, -0.3138F, -0.0389F, 1.8669F, 0.2356F, -0.3316F));

		PartDefinition cube_r155 = bone.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(64, 74).mirror().addBox(-0.1986F, -0.2719F, -0.3893F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.305F, -0.3138F, -0.0389F, 1.0379F, 0.2356F, -0.3316F));

		PartDefinition cube_r156 = bone.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-0.5F, -0.6479F, -2.0317F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.005F, 0.0F, 0.0F, 0.27F, -0.0436F, 0.0F));

		PartDefinition cube_r157 = bone.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(72, 37).mirror().addBox(-0.1834F, -0.1784F, -0.1469F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.2215F, 0.7334F, -2.2993F, 0.044F, -0.025F, -0.5236F));

		PartDefinition cube_r158 = bone.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(67, 57).mirror().addBox(-0.5F, 0.1656F, -2.3465F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-3.005F, 0.0F, 0.0F, -0.0966F, -0.0436F, 0.0F));

		PartDefinition cube_r159 = bone.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(21, 65).mirror().addBox(-0.5F, -1.6665F, -1.143F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 42).mirror().addBox(-0.5F, -2.2271F, -1.5578F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.005F, 0.0F, 0.0F, 0.427F, -0.0436F, 0.0F));

		PartDefinition cube_r160 = bone.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(32, 61).mirror().addBox(-0.5F, -0.7244F, -2.0734F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-3.005F, 0.0F, 0.0F, -0.4456F, -0.0436F, 0.0F));

		PartDefinition cube_r161 = bone.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(14, 73).mirror().addBox(-0.5F, -2.06F, -0.7066F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-3.005F, 0.0F, 0.0F, -0.1402F, -0.0436F, 0.0F));

		PartDefinition cube_r162 = bone.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(0, 42).addBox(-0.5F, -2.2271F, -1.5578F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F))
				.texOffs(21, 65).addBox(-0.5F, -1.6665F, -1.143F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.427F, 0.0436F, 0.0F));

		PartDefinition cube_r163 = bone.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(31, 74).addBox(-0.8014F, 0.4421F, -1.6273F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, -0.3138F, -0.0389F, 1.5877F, -0.2356F, 0.3316F));

		PartDefinition cube_r164 = bone.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(76, 0).addBox(-0.8014F, 1.4941F, -2.2317F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3F, -0.3138F, -0.0389F, 1.9018F, -0.2356F, 0.3316F));

		PartDefinition cube_r165 = bone.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(75, 69).addBox(-0.8014F, 1.3314F, -1.4306F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.3F, -0.3138F, -0.0389F, 1.64F, -0.2356F, 0.3316F));

		PartDefinition cube_r166 = bone.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(74, 74).addBox(-0.8014F, -0.3509F, -1.7743F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(69, 74).addBox(-0.8014F, 0.1491F, -1.3743F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.3F, -0.3138F, -0.0389F, 1.8669F, -0.2356F, 0.3316F));

		PartDefinition cube_r167 = bone.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(64, 74).addBox(-0.8014F, -0.2719F, -0.3893F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3F, -0.3138F, -0.0389F, 1.0379F, -0.2356F, 0.3316F));

		PartDefinition cube_r168 = bone.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(0, 61).addBox(-0.5F, -0.6479F, -2.0317F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.27F, 0.0436F, 0.0F));

		PartDefinition cube_r169 = bone.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(72, 37).addBox(-0.8166F, -0.1784F, -0.1469F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2165F, 0.7334F, -2.2993F, 0.044F, 0.025F, 0.5236F));

		PartDefinition cube_r170 = bone.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(67, 57).addBox(-0.5F, 0.1656F, -2.3465F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0966F, 0.0436F, 0.0F));

		PartDefinition cube_r171 = bone.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(32, 61).addBox(-0.5F, -0.7244F, -2.0734F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4456F, 0.0436F, 0.0F));

		PartDefinition cube_r172 = bone.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(14, 73).addBox(-0.5F, -2.06F, -0.7066F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1402F, 0.0436F, 0.0F));

		PartDefinition FrontFlipperR3 = bone.addOrReplaceChild("FrontFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0127F, 0.0242F, -0.2046F, -0.1999F, -0.4527F, 0.5618F));

		PartDefinition cube_r173 = FrontFlipperR3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(43, 20).addBox(-1.5F, -0.5F, 0.2F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.3593F, -0.1811F, -1.2566F, 0.0F, 0.096F, 0.0F));

		PartDefinition cube_r174 = FrontFlipperR3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(72, 25).addBox(-1.0F, -0.5F, -0.325F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.1055F, -0.1811F, 0.1033F, 0.0F, -2.7489F, 0.0F));

		PartDefinition cube_r175 = FrontFlipperR3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(35, 70).addBox(10.4777F, 2.1028F, 13.2399F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.9266F, -3.2839F, -17.5565F, 0.0F, -0.9163F, 0.0F));

		PartDefinition cube_r176 = FrontFlipperR3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(69, 0).addBox(-0.7F, -0.5F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.3436F, -0.1811F, 0.0929F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r177 = FrontFlipperR3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(47, 56).addBox(-0.5F, -0.5F, -0.95F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.9337F, -0.1811F, -0.0585F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r178 = FrontFlipperR3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(0, 74).addBox(-2.5F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9337F, -0.1811F, -0.0585F, 0.0F, 0.0436F, 0.0F));

		PartDefinition leftArm3 = FrontFlipperR3.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5127F, 0.0374F, -0.6176F, -2.6346F, -0.7801F, 2.1973F));

		PartDefinition cube_r179 = leftArm3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(43, 23).addBox(-1.625F, -0.5F, 0.35F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8023F, 0.0F, -3.6037F, -0.0416F, 0.6129F, -0.0478F));

		PartDefinition cube_r180 = leftArm3.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(11, 52).addBox(-1.1F, -0.5F, -0.7F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.2287F, 0.0F, -1.4193F, 0.0279F, 0.6526F, 0.0256F));

		PartDefinition cube_r181 = leftArm3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(65, 45).addBox(-1.05F, -1.0F, -1.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 0.0F, 0.0F, 0.0F, 0.6981F, 0.0F));

		PartDefinition cube_r182 = leftArm3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(26, 74).addBox(0.6F, -1.0F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3648F, -0.1298F, -4.2817F, 0.1803F, 0.2581F, 0.5411F));

		PartDefinition cube_r183 = leftArm4.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(32, 14).addBox(0.6F, 0.0F, -3.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2455F, -0.374F, 1.2458F, 0.0F, 0.2618F, 0.0F));

		PartDefinition FrontFlipperR5 = bone.addOrReplaceChild("FrontFlipperR5", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0177F, 0.0242F, -0.2046F, 0.0403F, -0.4833F, -0.6992F));

		PartDefinition cube_r184 = FrontFlipperR5.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(43, 20).mirror().addBox(-4.5F, -0.5F, 0.2F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.3593F, -0.1811F, -1.2566F, 0.0F, -0.096F, 0.0F));

		PartDefinition cube_r185 = FrontFlipperR5.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(72, 25).mirror().addBox(-1.0F, -0.5F, -0.325F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.1055F, -0.1811F, 0.1033F, 0.0F, 2.7489F, 0.0F));

		PartDefinition cube_r186 = FrontFlipperR5.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(35, 70).mirror().addBox(-12.4777F, 2.1028F, 13.2399F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.9266F, -3.2839F, -17.5565F, 0.0F, 0.9163F, 0.0F));

		PartDefinition cube_r187 = FrontFlipperR5.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(69, 0).mirror().addBox(-0.3F, -0.5F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-6.3436F, -0.1811F, 0.0929F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r188 = FrontFlipperR5.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(47, 56).mirror().addBox(-3.5F, -0.5F, -0.95F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.9337F, -0.1811F, -0.0585F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r189 = FrontFlipperR5.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(0.5F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9337F, -0.1811F, -0.0585F, 0.0F, -0.0436F, 0.0F));

		PartDefinition rightArm3 = FrontFlipperR5.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5127F, 0.0374F, -0.6176F, -2.0874F, -0.0401F, -1.3906F));

		PartDefinition cube_r190 = rightArm3.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(43, 23).mirror().addBox(-4.375F, -0.5F, 0.35F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8023F, 0.0F, -3.6037F, -0.0416F, -0.6129F, 0.0478F));

		PartDefinition cube_r191 = rightArm3.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(11, 52).mirror().addBox(-3.9F, -0.5F, -0.7F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.2287F, 0.0F, -1.4193F, 0.0279F, -0.6526F, -0.0256F));

		PartDefinition cube_r192 = rightArm3.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(65, 45).mirror().addBox(-0.95F, -1.0F, -1.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.0F, 0.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r193 = rightArm3.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(26, 74).mirror().addBox(-1.6F, -1.0F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.3648F, -0.1298F, -4.2817F, -0.1049F, -0.3352F, 0.4644F));

		PartDefinition cube_r194 = rightArm4.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(32, 14).mirror().addBox(-1.6F, 0.0F, -3.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.2455F, -0.374F, 1.2458F, 0.0F, -0.2618F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(17, 10).addBox(-1.0F, -0.4F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0235F, 7.9596F, -0.1155F, 0.4338F, -0.0487F));

		PartDefinition cube_r195 = tail.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(6, 89).addBox(-0.5F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 5.0F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r196 = tail.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(67, 87).addBox(-0.5F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 3.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r197 = tail.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(33, 88).addBox(-0.5F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 1.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r198 = tail.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(23, 83).addBox(0.0F, -0.6036F, -0.1454F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.7F, 3.4F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r199 = tail.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(36, 86).addBox(0.0F, -0.5F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.1F, 1.5F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r200 = tail.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(32, 8).mirror().addBox(-1.7F, 0.0F, -2.5F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1F, 3.5F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r201 = tail.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(32, 8).addBox(-0.3F, 0.0F, -2.5F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 3.5F, 0.0F, 0.0F, 0.3491F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(19, 0).addBox(-1.0F, -0.4F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.0661F, 0.3919F, 0.0253F));

		PartDefinition cube_r202 = tail2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(89, 9).addBox(-0.5F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 5.0F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r203 = tail2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(9, 89).addBox(-0.5F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 3.0F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r204 = tail2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(89, 21).addBox(-0.5F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.0F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r205 = tail2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(49, 86).addBox(0.0F, 4.4964F, 5.8546F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 87).addBox(0.0F, 3.1964F, 3.8546F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.7F, -2.6F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r206 = tail2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(0, 81).addBox(0.0F, -0.748F, -0.0622F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.7F, -0.2F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r207 = tail2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(34, 0).mirror().addBox(-1.3525F, -0.9546F, -0.1067F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.1159F, 1.1067F, 0.0F, 0.1222F, -0.3491F));

		PartDefinition cube_r208 = tail2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(34, 0).addBox(-0.6475F, -0.9546F, -0.1067F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1159F, 1.1067F, 0.0F, -0.1222F, 0.3491F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(15, 26).addBox(-1.0F, -0.4F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.124F, 0.1732F, 0.0215F));

		PartDefinition cube_r209 = tail3.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(12, 89).addBox(-0.5F, -1.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 5.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r210 = tail3.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(42, 88).addBox(-0.5F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 3.0F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r211 = tail3.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(86, 51).addBox(0.0F, -0.2263F, -0.1284F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.7F, 3.9F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r212 = tail3.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(26, 40).addBox(0.0F, 5.9964F, 7.8546F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.7F, -8.6F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r213 = tail3.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(39, 88).addBox(-0.5F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.0F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r214 = tail3.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(15, 34).mirror().addBox(-0.8643F, -0.6475F, -0.0968F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7891F, 1.0968F, 0.0F, 0.0873F, -0.3491F));

		PartDefinition cube_r215 = tail3.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(15, 34).addBox(-1.1357F, -0.6475F, -0.0968F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7891F, 1.0968F, 0.0F, -0.0873F, 0.3491F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(17, 18).addBox(-1.0F, -0.4F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.0632F, -0.2613F, -0.0164F));

		PartDefinition cube_r216 = tail4.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(89, 47).addBox(-0.5F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 5.0F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r217 = tail4.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(89, 3).addBox(-0.5F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 3.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r218 = tail4.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(89, 40).addBox(-0.5F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r219 = tail4.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(89, 53).addBox(0.0F, 0.4805F, 0.0404F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.3F, 4.9F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r220 = tail4.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(52, 86).addBox(0.0F, -0.6989F, -0.0023F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6628F, 2.7226F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r221 = tail4.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(37, 44).addBox(0.0F, -0.6105F, 0.0347F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.7F, 0.2F, 0.384F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(26, 44).addBox(-1.0F, -0.4F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0174F, 5.9015F, 0.1207F, -0.3467F, -0.0412F));

		PartDefinition cube_r222 = tail5.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(89, 25).addBox(-0.5F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 3.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r223 = tail5.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(90, 34).addBox(-0.5F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r224 = tail5.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(36, 90).addBox(0.0F, 0.3449F, -0.0279F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.3174F, 1.6985F, 0.3491F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 35).addBox(-1.0F, -0.4F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.0292F, 3.9044F, 0.1439F, -0.3921F, -0.0217F));

		PartDefinition cube_r225 = tail6.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(89, 62).addBox(-0.5F, -0.3436F, -0.0123F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 3.0F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r226 = tail6.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(85, 89).addBox(-0.5F, -0.5302F, -0.0024F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.0F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r227 = tail6.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(89, 59).addBox(0.0F, 0.1515F, -0.1485F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4533F, 3.9795F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r228 = tail6.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(89, 56).addBox(0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4533F, 2.7795F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r229 = tail6.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(89, 28).addBox(0.0F, 0.2886F, 0.0823F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.3466F, -0.3059F, 0.3491F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(0, 27).addBox(-1.0F, -0.4F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0259F, 4.9034F, 0.0969F, -0.6102F, -0.0305F));

		PartDefinition cube_r230 = tail7.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(82, 89).addBox(-0.5F, -0.3F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r231 = tail7.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(76, 89).addBox(0.0F, 3.1515F, 4.8515F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 89).addBox(0.0F, 1.9515F, 3.1515F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 72).addBox(0.0F, 1.0515F, 1.4515F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4791F, -0.9239F, 0.5934F, 0.0F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(30, 26).addBox(-1.0F, -0.4F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0131F, 5.9008F, 0.2381F, -0.5187F, -0.0752F));

		PartDefinition cube_r232 = tail8.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(79, 89).addBox(0.0F, -0.1221F, -0.0808F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4791F, 1.0761F, 0.7156F, 0.0F, 0.0F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1412F, -0.0553F, 5.4924F, -0.1922F, 0.4293F, -0.0808F));

		PartDefinition cube_r233 = tail9.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(0, 51).addBox(-1.0F, -0.4F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1138F, -0.2917F, 3.4392F, -0.2875F, 0.4205F, -0.1201F));

		PartDefinition cube_r234 = tail10.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(13, 40).addBox(-1.0F, -0.4F, 3.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2615F, -3.915F, 0.1047F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -1.9F, -0.0353F, -0.346F, -0.0475F));

		PartDefinition cube_r235 = neck.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(15, 86).addBox(0.5F, -1.7515F, 0.0548F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1F, -2.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r236 = neck.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(11, 55).addBox(0.0F, -0.6F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.5F, -2.8F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r237 = neck.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(74, 55).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1249F, -1.5059F, 0.4124F, 0.5195F, -1.0321F));

		PartDefinition cube_r238 = neck.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(86, 81).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1249F, -1.5059F, 0.5829F, 0.269F, -0.5976F));

		PartDefinition cube_r239 = neck.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(86, 32).mirror().addBox(-3.2375F, -1.8712F, -0.5599F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1249F, -1.5059F, 0.0534F, 0.6494F, -1.6662F));

		PartDefinition cube_r240 = neck.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(74, 55).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1249F, -1.5059F, 0.4124F, -0.5195F, 1.0321F));

		PartDefinition cube_r241 = neck.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(86, 81).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1249F, -1.5059F, 0.5829F, -0.269F, 0.5976F));

		PartDefinition cube_r242 = neck.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(86, 32).addBox(2.2375F, -1.8712F, -0.5599F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1249F, -1.5059F, 0.0534F, -0.6494F, 1.6662F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -2.9F, -0.0436F, -0.4363F, 0.0F));

		PartDefinition cube_r243 = neck2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(87, 34).addBox(0.5F, -1.5028F, -0.0885F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6F, -0.8F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r244 = neck2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(21, 88).addBox(0.5F, -1.7012F, -2.8651F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 26).addBox(0.0F, -0.6F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r245 = neck2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(89, 50).mirror().addBox(0.0F, -0.4781F, -0.0121F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1F, -2.5F, -0.7311F, -0.4539F, 0.7292F));

		PartDefinition cube_r246 = neck2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(46, 78).mirror().addBox(0.0F, -0.4781F, -0.0121F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.1F, -0.9F, -0.7311F, -0.4539F, 0.7292F));

		PartDefinition cube_r247 = neck2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(89, 50).addBox(0.0F, -0.4781F, -0.0121F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1F, -2.5F, -0.7311F, 0.4539F, -0.7292F));

		PartDefinition cube_r248 = neck2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(46, 78).addBox(0.0F, -0.4781F, -0.0121F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.1F, -0.9F, -0.7311F, 0.4539F, -0.7292F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4297F, -3.9997F, -0.0406F, -0.2608F, -0.0233F));

		PartDefinition cube_r249 = head.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(70, 84).addBox(-1.4337F, -1.5F, -0.7523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9337F, -0.2409F, 0.0249F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r250 = head.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(42, 71).addBox(-0.4997F, -1.7867F, 0.1544F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(70, 69).addBox(-0.4997F, -2.1867F, -0.4456F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1378F, 0.4945F, -0.2683F, 0.532F, -0.0088F, 0.0043F));

		PartDefinition cube_r251 = head.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(72, 42).addBox(-1.9337F, -1.5575F, -1.3349F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(60, 31).addBox(-2.4337F, -1.5575F, -0.9349F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9337F, -0.2409F, 0.0249F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r252 = head.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(71, 81).addBox(-0.0876F, -0.3128F, -0.2755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4124F, -1.3714F, -8.2992F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r253 = head.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(72, 10).addBox(-0.5876F, -0.3848F, -0.4737F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4124F, -1.0417F, -8.0322F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r254 = head.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(61, 81).addBox(-0.0876F, -0.5624F, -0.3997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.4124F, -1.0417F, -8.0322F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r255 = head.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(7, 71).addBox(-1.0F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.9871F, -7.811F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r256 = head.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(58, 6).addBox(-0.0818F, -0.9433F, -1.1284F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F))
				.texOffs(54, 37).addBox(-0.5818F, -0.9433F, -0.1284F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 57).addBox(-0.0818F, -0.9683F, -0.1284F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.9182F, -0.3254F, -7.0231F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r257 = head.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(54, 41).addBox(-2.5465F, -0.9366F, -0.9119F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.0465F, -0.1577F, -5.0651F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r258 = head.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(47, 59).addBox(-2.0465F, -0.9866F, -1.5119F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0465F, -0.1327F, -5.0651F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r259 = head.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(47, 71).addBox(-1.0F, -0.1694F, -0.1471F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(0.0F, -1.4054F, -2.8271F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r260 = head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(46, 63).addBox(-0.5F, -0.3187F, -0.7375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1497F)), PartPose.offsetAndRotation(0.0F, -1.2131F, -2.1938F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r261 = head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(14, 65).addBox(-0.375F, -0.1786F, -0.6315F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -1.225F, -4.4748F, 0.1153F, 0.3296F, 0.0375F));

		PartDefinition cube_r262 = head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(65, 12).addBox(-0.5F, -0.1786F, -0.8565F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.158F))
				.texOffs(54, 71).addBox(-1.0F, -0.1786F, 0.8435F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.225F, -4.4748F, 0.1091F, 0.0F, 0.0F));

		PartDefinition cube_r263 = head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(70, 61).addBox(-1.0F, -0.1415F, -1.7551F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -1.2946F, -6.1476F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r264 = head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(21, 69).addBox(-1.0F, -0.1415F, -0.1551F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -1.2946F, -6.1476F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.9F, -1.1701F, 1.2894F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(41, 85).addBox(-1.1383F, 0.8907F, 0.5129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-1.7663F, 0.8665F, -1.8612F, 1.4714F, 0.9968F, 0.1728F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(72, 45).addBox(-0.5469F, -2.5614F, -0.464F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4722F, 2.499F, -1.2023F, 1.571F, 0.69F, 0.0467F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(10, 86).addBox(-0.9333F, 0.6261F, 0.5129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(86, 6).addBox(-0.9333F, 0.2261F, 0.5129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-1.7663F, 0.8665F, -1.8612F, 1.4914F, 0.823F, 0.1981F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(80, 84).addBox(-0.9333F, 0.0547F, 0.3819F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.7663F, 0.8665F, -1.8612F, 1.7009F, 0.823F, 0.1981F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(85, 84).addBox(-0.6048F, -0.1707F, 0.454F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.7663F, 0.8665F, -1.8612F, 1.537F, 0.4615F, 0.0686F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(36, 83).addBox(-0.6048F, -0.3912F, 0.4157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-1.7663F, 0.8665F, -1.8612F, 1.6941F, 0.4615F, 0.0686F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(85, 67).addBox(-0.8375F, -0.2341F, 0.454F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-1.7663F, 0.8665F, -1.8612F, 1.5261F, 0.8277F, 0.0507F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(77, 36).addBox(-0.55F, -0.25F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.2499F, 1.2587F, -0.2162F, -2.5008F, 0.3028F, -1.1477F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(52, 76).addBox(-0.4751F, -1.3925F, -0.4622F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.3058F, 1.5238F, -0.5038F, -0.7419F, 0.1266F, -0.022F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(84, 48).addBox(-0.5F, -0.9923F, -0.4999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.1289F, 1.1944F, -0.3632F, -0.7069F, 0.1266F, -0.3711F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(55, 84).addBox(-0.4751F, -0.9678F, -0.647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(0, 77).addBox(-0.4751F, -0.4678F, -0.647F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.3058F, 1.5238F, -0.5038F, -0.3143F, 0.1266F, -0.022F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(31, 83).addBox(-0.5F, -1.0452F, -0.6884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-0.1289F, 1.1944F, -0.3632F, -0.3143F, 0.1266F, -0.3711F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(81, 81).addBox(-0.6091F, -0.8854F, -0.2836F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(76, 81).addBox(-0.6091F, -1.2854F, -0.2836F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5485F, 0.1142F, -1.319F, 1.5891F, 0.0495F, -0.4474F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(82, 37).addBox(-0.5F, -0.45F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7358F, 0.1488F, -2.8235F, 2.1127F, 0.0495F, -0.4474F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(82, 34).addBox(-0.5F, -0.45F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.784F, 0.0114F, -2.5014F, 1.8509F, 0.0495F, -0.4474F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(13, 83).addBox(-0.59F, -0.5528F, -0.3103F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5485F, 0.1142F, -1.319F, 1.4497F, 0.1368F, -0.4458F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(8, 83).addBox(-0.59F, -0.1919F, -0.2946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.5485F, 0.1142F, -1.319F, 1.3449F, 0.1368F, -0.4458F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(3, 83).addBox(-0.59F, 0.1559F, -0.2341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5485F, 0.1142F, -1.319F, 1.2228F, 0.1368F, -0.4458F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(82, 76).addBox(-0.59F, 0.2364F, 0.1209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.5485F, 0.1142F, -1.319F, 0.7428F, 0.1368F, -0.4458F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(45, 82).addBox(-0.59F, 0.3894F, 0.3257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5485F, 0.1142F, -1.319F, 0.481F, 0.1368F, -0.4458F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(72, 50).addBox(-0.775F, -0.65F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.5798F, 0.1545F, -2.5562F, 0.1622F, -0.8626F, -0.1149F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(75, 84).addBox(-0.3235F, -0.3187F, -0.6532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.9F, -0.043F, -3.4831F, -0.0243F, -0.7678F, 0.0169F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(72, 16).addBox(-1.5831F, -0.425F, -0.9165F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.6966F, 0.2614F, -4.8298F, 0.1307F, 0.1219F, 0.0253F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(81, 28).addBox(-0.3458F, -0.575F, -0.1042F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6966F, 0.2614F, -4.8298F, 0.1299F, -0.0511F, 0.0026F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(81, 0).addBox(-0.4198F, -0.575F, -0.4053F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.6966F, 0.2614F, -4.8298F, 0.134F, 0.2517F, 0.0429F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(79, 49).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-1.4F, 0.5256F, -6.2537F, 0.2348F, -0.7279F, -0.1578F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(15, 80).addBox(-0.6234F, -0.4872F, -0.0536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.404F))
				.texOffs(10, 80).addBox(-0.6234F, -0.4872F, -0.1786F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.1773F, 1.1845F, -3.7874F, 0.5015F, 0.096F, 0.0425F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(40, 80).addBox(-0.6234F, -0.2479F, -0.0395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.1773F, 1.1845F, -3.7874F, 0.9815F, 0.096F, 0.0425F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(30, 80).addBox(-0.6147F, -0.3346F, -0.337F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.396F))
				.texOffs(5, 80).addBox(-0.6147F, -0.3346F, -0.162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.1773F, 1.1845F, -3.7874F, 0.7767F, 0.1004F, 0.0F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(51, 80).addBox(-0.6636F, -0.499F, -0.3981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.345F)), PartPose.offsetAndRotation(-0.1773F, 1.1845F, -3.7874F, 0.3403F, 0.1004F, 0.0F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(35, 80).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.3286F, 1.2226F, -3.6562F, 0.733F, 0.1004F, 0.0F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(25, 80).addBox(-0.5F, -0.55F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4751F, 1.3879F, -4.2629F, -0.1888F, 0.2022F, -0.055F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(20, 80).addBox(-0.2978F, -0.2731F, -0.6417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.6162F, 1.067F, -3.8571F, 0.2475F, 0.2022F, -0.055F));

		PartDefinition cube_r298 = leftFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(79, 73).addBox(-0.3968F, -0.6566F, 0.1104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(79, 57).addBox(-0.3968F, -0.6566F, -0.2896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6162F, 1.7711F, -4.3333F, 0.5149F, 0.2094F, 0.0F));

		PartDefinition cube_r299 = leftFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(84, 22).addBox(-0.5F, -0.7F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1496F)), PartPose.offsetAndRotation(-0.7477F, 1.5508F, -4.7271F, -0.5149F, 0.2094F, 0.0F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(26, 83).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.7463F, 1.5748F, -4.7205F, 0.2705F, 0.2094F, 0.0F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(47, 74).addBox(-0.5F, -0.875F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.8519F, 0.9754F, -5.2814F, -0.0611F, 0.1745F, 0.0F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(79, 16).addBox(-0.4375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(79, 4).addBox(-0.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5981F, 0.7103F, -4.1017F, 0.0698F, 0.1745F, 0.0F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(74, 4).addBox(-0.8486F, -1.7902F, -2.3388F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.2F, 2.1259F, -3.592F, -0.192F, 0.1745F, 0.0F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(0, 70).addBox(-0.5465F, -0.5366F, -0.9525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-0.8535F, 1.0124F, -6.3545F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(63, 70).addBox(-0.5465F, -0.0583F, -0.9441F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.8535F, 1.0124F, -6.3545F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(81, 52).addBox(-0.8389F, 0.567F, -0.4242F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F))
				.texOffs(81, 31).addBox(-0.8389F, 0.567F, -0.4992F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1506F)), PartPose.offsetAndRotation(-0.5682F, 0.0648F, -8.0797F, -0.623F, 0.3141F, -0.0794F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(5, 86).addBox(0.9182F, -0.1796F, -0.2442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-2.3182F, 0.8447F, -8.3125F, -0.2274F, 0.0F, -0.0092F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(84, 72).addBox(0.9182F, -0.1166F, 0.3699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1506F)), PartPose.offsetAndRotation(-2.3182F, 0.8447F, -8.3125F, -0.1052F, 0.0F, -0.0092F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(9, 60).addBox(-1.5F, -0.75F, -0.625F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.9F, 1.041F, -7.9795F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(79, 10).addBox(0.9182F, -0.3933F, -0.0284F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(79, 42).addBox(0.9182F, -0.3933F, 0.5716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-2.3182F, 0.8447F, -8.3125F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(79, 25).addBox(-0.8318F, -0.1299F, -0.8585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1497F))
				.texOffs(79, 22).addBox(-0.8318F, -0.1299F, -1.1585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.5682F, 0.0648F, -8.0797F, -0.2531F, 0.3142F, -0.0698F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(86, 0).addBox(-0.4997F, -0.2726F, -0.2233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-1.7622F, 1.6646F, -1.5577F, 0.6717F, -0.0088F, 0.0043F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(41, 41).addBox(-0.0653F, -0.845F, -5.6701F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.7536F, 2.4679F, -4.0263F, -0.2615F, 0.0353F, 0.0009F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(7, 67).addBox(-0.75F, -0.25F, -1.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.1597F, 2.1926F, -3.4827F, -0.9961F, -0.6024F, 0.3776F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(49, 67).addBox(-0.3771F, -0.7694F, -0.323F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.5536F, 2.4679F, -4.0263F, -0.1836F, -0.1123F, -0.0911F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(42, 67).addBox(-0.3771F, -0.7694F, -1.423F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.5536F, 2.4679F, -4.0263F, -0.3232F, -0.1123F, -0.0911F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(65, 49).addBox(-0.7F, -0.45F, -0.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.1597F, 2.1926F, -3.4827F, -0.1895F, -0.27F, -0.0729F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(56, 26).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-1.5653F, 1.032F, -2.8437F, 1.1309F, -0.4533F, 0.0684F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(69, 30).addBox(-0.1F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-1.761F, 2.2083F, -1.9229F, 0.3455F, -0.4533F, 0.0684F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(77, 45).addBox(-0.5F, -1.0F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1672F, 1.519F, -0.8803F, 0.5692F, -0.3447F, -0.2035F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(66, 81).addBox(-0.5F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-1.303F, 0.1477F, -9.1941F, -0.9551F, 0.3922F, -0.1096F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(56, 81).addBox(-0.5F, -0.55F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-1.2713F, 0.2066F, -9.1336F, -0.1697F, 0.3922F, -0.1096F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(84, 40).addBox(-0.2F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.9453F, 0.4969F, -9.5776F, -0.5672F, 0.1222F, 0.0F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(84, 25).addBox(-0.1F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(84, 16).addBox(-0.1F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.7309F, 0.7478F, -9.4723F, -0.3054F, 0.1222F, 0.0F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(84, 19).addBox(-0.2398F, -0.4301F, 3.6039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(41, 76).addBox(-0.2398F, -1.2301F, 3.0039F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(76, 30).addBox(-0.1398F, -1.2301F, 2.3039F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(19, 76).addBox(-0.0398F, -1.2301F, 1.8039F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(7, 76).addBox(-0.1398F, -1.3301F, 1.3039F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(74, 57).addBox(-0.2648F, -1.7301F, 0.8039F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.5F, 1.5047F, -10.3804F, -0.0873F, 0.1222F, 0.0F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(80, 69).addBox(-0.7818F, 0.6785F, -0.8186F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5682F, 0.0648F, -8.0797F, -0.829F, 0.3142F, -0.0698F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.9F, -1.1701F, 1.2894F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(41, 85).mirror().addBox(0.1383F, 0.8907F, 0.5129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(1.7663F, 0.8665F, -1.8612F, 1.4714F, -0.9968F, -0.1728F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(72, 45).mirror().addBox(-0.4531F, -2.5614F, -0.464F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.4722F, 2.499F, -1.2023F, 1.571F, -0.69F, -0.0467F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(10, 86).mirror().addBox(-0.0667F, 0.6261F, 0.5129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(86, 6).mirror().addBox(-0.0667F, 0.2261F, 0.5129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(1.7663F, 0.8665F, -1.8612F, 1.4914F, -0.823F, -0.1981F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(80, 84).mirror().addBox(-0.0667F, 0.0547F, 0.3819F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.7663F, 0.8665F, -1.8612F, 1.7009F, -0.823F, -0.1981F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(85, 84).mirror().addBox(-0.3952F, -0.1707F, 0.454F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.7663F, 0.8665F, -1.8612F, 1.537F, -0.4615F, -0.0686F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(36, 83).mirror().addBox(-0.3952F, -0.3912F, 0.4157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(1.7663F, 0.8665F, -1.8612F, 1.6941F, -0.4615F, -0.0686F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(85, 67).mirror().addBox(-0.1625F, -0.2341F, 0.454F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(1.7663F, 0.8665F, -1.8612F, 1.5261F, -0.8277F, -0.0507F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(77, 36).mirror().addBox(-0.45F, -0.25F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.2499F, 1.2587F, -0.2162F, -2.5008F, -0.3028F, 1.1477F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(52, 76).mirror().addBox(-0.5249F, -1.3925F, -0.4622F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(0.3058F, 1.5238F, -0.5038F, -0.7419F, -0.1266F, 0.022F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(84, 48).mirror().addBox(-0.5F, -0.9923F, -0.4999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.1289F, 1.1944F, -0.3632F, -0.7069F, -0.1266F, 0.3711F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(55, 84).mirror().addBox(-0.5249F, -0.9678F, -0.647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(0, 77).mirror().addBox(-0.5249F, -0.4678F, -0.647F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.3058F, 1.5238F, -0.5038F, -0.3143F, -0.1266F, 0.022F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(31, 83).mirror().addBox(-0.5F, -1.0452F, -0.6884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(0.1289F, 1.1944F, -0.3632F, -0.3143F, -0.1266F, 0.3711F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(81, 81).mirror().addBox(-0.3909F, -0.8854F, -0.2836F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(76, 81).mirror().addBox(-0.3909F, -1.2854F, -0.2836F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5485F, 0.1142F, -1.319F, 1.5891F, -0.0495F, 0.4474F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(82, 37).mirror().addBox(-0.5F, -0.45F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.7358F, 0.1488F, -2.8235F, 2.1127F, -0.0495F, 0.4474F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(82, 34).mirror().addBox(-0.5F, -0.45F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.784F, 0.0114F, -2.5014F, 1.8509F, -0.0495F, 0.4474F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(13, 83).mirror().addBox(-0.41F, -0.5528F, -0.3103F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5485F, 0.1142F, -1.319F, 1.4497F, -0.1368F, 0.4458F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(8, 83).mirror().addBox(-0.41F, -0.1919F, -0.2946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.5485F, 0.1142F, -1.319F, 1.3449F, -0.1368F, 0.4458F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(3, 83).mirror().addBox(-0.41F, 0.1559F, -0.2341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5485F, 0.1142F, -1.319F, 1.2228F, -0.1368F, 0.4458F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(82, 76).mirror().addBox(-0.41F, 0.2364F, 0.1209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.5485F, 0.1142F, -1.319F, 0.7428F, -0.1368F, 0.4458F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(45, 82).mirror().addBox(-0.41F, 0.3894F, 0.3257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5485F, 0.1142F, -1.319F, 0.481F, -0.1368F, 0.4458F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(72, 50).mirror().addBox(-1.225F, -0.65F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.5798F, 0.1545F, -2.5562F, 0.1622F, 0.8626F, 0.1149F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(75, 84).mirror().addBox(-0.6765F, -0.3187F, -0.6532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.9F, -0.043F, -3.4831F, -0.0243F, 0.7678F, -0.0169F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(72, 16).mirror().addBox(-0.4169F, -0.425F, -0.9165F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.6966F, 0.2614F, -4.8298F, 0.1307F, -0.1219F, -0.0253F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(81, 28).mirror().addBox(-0.6542F, -0.575F, -0.1042F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.6966F, 0.2614F, -4.8298F, 0.1299F, 0.0511F, -0.0026F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(81, 0).mirror().addBox(-0.5802F, -0.575F, -0.4053F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(0.6966F, 0.2614F, -4.8298F, 0.134F, -0.2517F, -0.0429F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(79, 49).mirror().addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(1.4F, 0.5256F, -6.2537F, 0.2348F, 0.7279F, 0.1578F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(15, 80).mirror().addBox(-0.3766F, -0.4872F, -0.0536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.404F)).mirror(false)
				.texOffs(10, 80).mirror().addBox(-0.3766F, -0.4872F, -0.1786F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.1773F, 1.1845F, -3.7874F, 0.5015F, -0.096F, -0.0425F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(40, 80).mirror().addBox(-0.3766F, -0.2479F, -0.0395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.1773F, 1.1845F, -3.7874F, 0.9815F, -0.096F, -0.0425F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(30, 80).mirror().addBox(-0.3853F, -0.3346F, -0.337F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.396F)).mirror(false)
				.texOffs(5, 80).mirror().addBox(-0.3853F, -0.3346F, -0.162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.1773F, 1.1845F, -3.7874F, 0.7767F, -0.1004F, 0.0F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(51, 80).mirror().addBox(-0.3364F, -0.499F, -0.3981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.345F)).mirror(false), PartPose.offsetAndRotation(0.1773F, 1.1845F, -3.7874F, 0.3403F, -0.1004F, 0.0F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(35, 80).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.3286F, 1.2226F, -3.6562F, 0.733F, -0.1004F, 0.0F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(25, 80).mirror().addBox(-0.5F, -0.55F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.4751F, 1.3879F, -4.2629F, -0.1888F, -0.2022F, 0.055F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(20, 80).mirror().addBox(-0.7022F, -0.2731F, -0.6417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(0.6162F, 1.067F, -3.8571F, 0.2475F, -0.2022F, 0.055F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(79, 73).mirror().addBox(-0.6032F, -0.6566F, 0.1104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(79, 57).mirror().addBox(-0.6032F, -0.6566F, -0.2896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.6162F, 1.7711F, -4.3333F, 0.5149F, -0.2094F, 0.0F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(84, 22).mirror().addBox(-0.5F, -0.7F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1496F)).mirror(false), PartPose.offsetAndRotation(0.7477F, 1.5508F, -4.7271F, -0.5149F, -0.2094F, 0.0F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(26, 83).mirror().addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.7463F, 1.5748F, -4.7205F, 0.2705F, -0.2094F, 0.0F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(47, 74).mirror().addBox(-0.5F, -0.875F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.8519F, 0.9754F, -5.2814F, -0.0611F, -0.1745F, 0.0F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(79, 16).mirror().addBox(-0.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(79, 4).mirror().addBox(-0.4375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5981F, 0.7103F, -4.1017F, 0.0698F, -0.1745F, 0.0F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(74, 4).mirror().addBox(-0.1514F, -1.7902F, -2.3388F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.2F, 2.1259F, -3.592F, -0.192F, -0.1745F, 0.0F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-0.4535F, -0.5366F, -0.9525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(0.8535F, 1.0124F, -6.3545F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(63, 70).mirror().addBox(-0.4535F, -0.0583F, -0.9441F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.8535F, 1.0124F, -6.3545F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(81, 52).mirror().addBox(-0.1611F, 0.567F, -0.4242F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false)
				.texOffs(81, 31).mirror().addBox(-0.1611F, 0.567F, -0.4992F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1506F)).mirror(false), PartPose.offsetAndRotation(0.5682F, 0.0648F, -8.0797F, -0.623F, -0.3141F, 0.0794F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(5, 86).mirror().addBox(-1.9182F, -0.1796F, -0.2442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(2.3182F, 0.8447F, -8.3125F, -0.2274F, 0.0F, 0.0092F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(84, 72).mirror().addBox(-1.9182F, -0.1166F, 0.3699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1506F)).mirror(false), PartPose.offsetAndRotation(2.3182F, 0.8447F, -8.3125F, -0.1052F, 0.0F, 0.0092F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(9, 60).mirror().addBox(-1.5F, -0.75F, -0.625F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(1.9F, 1.041F, -7.9795F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(79, 10).mirror().addBox(-1.9182F, -0.3933F, -0.0284F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(79, 42).mirror().addBox(-1.9182F, -0.3933F, 0.5716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(2.3182F, 0.8447F, -8.3125F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(79, 25).mirror().addBox(-0.1682F, -0.1299F, -0.8585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1497F)).mirror(false)
				.texOffs(79, 22).mirror().addBox(-0.1682F, -0.1299F, -1.1585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.5682F, 0.0648F, -8.0797F, -0.2531F, -0.3142F, 0.0698F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(-0.5003F, -0.2726F, -0.2233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(1.7622F, 1.6646F, -1.5577F, 0.6717F, 0.0088F, -0.0043F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(41, 41).mirror().addBox(-0.9346F, -0.845F, -5.6701F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.7536F, 2.4679F, -4.0263F, -0.2615F, -0.0353F, -0.0009F));

		PartDefinition cube_r376 = rightFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(7, 67).mirror().addBox(-0.25F, -0.25F, -1.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.1597F, 2.1926F, -3.4827F, -0.9961F, 0.6024F, -0.3776F));

		PartDefinition cube_r377 = rightFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(49, 67).mirror().addBox(-0.6229F, -0.7694F, -0.323F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.5536F, 2.4679F, -4.0263F, -0.1836F, 0.1123F, 0.0911F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(42, 67).mirror().addBox(-0.6229F, -0.7694F, -1.423F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.5536F, 2.4679F, -4.0263F, -0.3232F, 0.1123F, 0.0911F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(65, 49).mirror().addBox(-0.3F, -0.45F, -0.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.1597F, 2.1926F, -3.4827F, -0.1895F, 0.27F, 0.0729F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(56, 26).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(1.5653F, 1.032F, -2.8437F, 1.1309F, 0.4533F, -0.0684F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(69, 30).mirror().addBox(-0.9F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(1.761F, 2.2083F, -1.9229F, 0.3455F, 0.4533F, -0.0684F));

		PartDefinition cube_r382 = rightFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(77, 45).mirror().addBox(-0.5F, -1.0F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1672F, 1.519F, -0.8803F, 0.5692F, 0.3447F, 0.2035F));

		PartDefinition cube_r383 = rightFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(66, 81).mirror().addBox(-0.5F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(1.303F, 0.1477F, -9.1941F, -0.9551F, -0.3922F, 0.1096F));

		PartDefinition cube_r384 = rightFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(56, 81).mirror().addBox(-0.5F, -0.55F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(1.2713F, 0.2066F, -9.1336F, -0.1697F, -0.3922F, 0.1096F));

		PartDefinition cube_r385 = rightFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(84, 40).mirror().addBox(-0.8F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.9453F, 0.4969F, -9.5776F, -0.5672F, -0.1222F, 0.0F));

		PartDefinition cube_r386 = rightFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(84, 25).mirror().addBox(-0.9F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(84, 16).mirror().addBox(-0.9F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.7309F, 0.7478F, -9.4723F, -0.3054F, -0.1222F, 0.0F));

		PartDefinition cube_r387 = rightFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(84, 19).mirror().addBox(-0.7602F, -0.4301F, 3.6039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(41, 76).mirror().addBox(-0.7602F, -1.2301F, 3.0039F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(76, 30).mirror().addBox(-0.8602F, -1.2301F, 2.3039F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(19, 76).mirror().addBox(-0.9602F, -1.2301F, 1.8039F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(7, 76).mirror().addBox(-0.8602F, -1.3301F, 1.3039F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(74, 57).mirror().addBox(-0.7352F, -1.7301F, 0.8039F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.5F, 1.5047F, -10.3804F, -0.0873F, -0.1222F, 0.0F));

		PartDefinition cube_r388 = rightFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(80, 69).mirror().addBox(-0.2182F, 0.6785F, -0.8186F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5682F, 0.0648F, -8.0797F, -0.829F, -0.3142F, 0.0698F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4036F, 0.1427F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r389 = jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(38, 56).mirror().addBox(1.1346F, -0.3877F, -0.0969F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 1.3261F, -1.592F, -0.0492F, -0.1915F, 0.0889F));

		PartDefinition cube_r390 = jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(63, 62).mirror().addBox(1.1776F, -0.3593F, -1.6503F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 1.3261F, -1.592F, -0.1449F, -0.4046F, 0.0815F));

		PartDefinition cube_r391 = jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(84, 58).mirror().addBox(-0.3321F, 1.9665F, -2.9309F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(36, 74).mirror().addBox(-0.3321F, 1.8665F, -3.5059F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.0105F, 0.2965F, -0.7335F, -0.1172F, 0.0145F));

		PartDefinition cube_r392 = jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(65, 84).mirror().addBox(-0.1415F, -0.7422F, -0.5848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.534F, -4.799F, -0.2172F, -0.0125F, 0.0144F));

		PartDefinition cube_r393 = jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(81, 7).mirror().addBox(-0.3321F, -0.9525F, -5.1103F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.0105F, 0.2965F, 0.1566F, -0.1172F, 0.0145F));

		PartDefinition cube_r394 = jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(60, 84).mirror().addBox(0.0315F, -0.966F, -1.4743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(84, 61).mirror().addBox(0.0315F, -1.266F, -1.4743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.534F, -4.799F, 0.2177F, 0.0394F, -0.0049F));

		PartDefinition cube_r395 = jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(79, 19).mirror().addBox(-0.0314F, -0.894F, -0.6445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.548F, -6.3989F, 0.0005F, -0.1526F, -0.005F));

		PartDefinition cube_r396 = jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(79, 13).mirror().addBox(-0.0379F, -0.6734F, -1.398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.548F, -6.3989F, -0.3937F, -0.1523F, 0.01F));

		PartDefinition cube_r397 = jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(62, 78).mirror().addBox(-0.1643F, -1.1183F, -0.7968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(72, 78).mirror().addBox(-0.1643F, -0.8183F, -0.7968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(82, 45).mirror().addBox(-0.1643F, -0.9933F, -1.2968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.2576F, -7.6015F, -0.5291F, -0.5537F, 0.0116F));

		PartDefinition cube_r398 = jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(84, 64).mirror().addBox(-0.577F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.236F)).mirror(false)
				.texOffs(84, 64).addBox(-0.177F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.23F)), PartPose.offsetAndRotation(-0.123F, -0.6332F, -8.5267F, -0.5684F, 0.0F, 0.0F));

		PartDefinition cube_r399 = jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(62, 0).mirror().addBox(-0.1643F, -0.563F, -1.5772F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.23F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.2576F, -7.6015F, -0.5684F, -0.5537F, 0.0116F));

		PartDefinition cube_r400 = jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(7, 63).mirror().addBox(-0.1643F, -0.4867F, -1.5907F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.2576F, -7.6015F, -0.6339F, -0.5537F, 0.0116F));

		PartDefinition cube_r401 = jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(67, 78).mirror().addBox(-0.1217F, -0.4287F, -0.7275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.548F, -6.3989F, -0.2025F, -0.2044F, 0.0147F));

		PartDefinition cube_r402 = jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(77, 78).mirror().addBox(-0.1217F, -0.3491F, -0.7228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.548F, -6.3989F, -0.3334F, -0.2044F, 0.0147F));

		PartDefinition cube_r403 = jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(38, 52).mirror().addBox(-0.1415F, -0.0885F, -1.7935F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.534F, -4.799F, -0.1473F, -0.0125F, 0.0144F));

		PartDefinition cube_r404 = jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(65, 20).mirror().addBox(-0.1415F, -0.5256F, -1.8433F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.534F, -4.799F, 0.0621F, -0.0125F, 0.0144F));

		PartDefinition cube_r405 = jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(57, 78).mirror().addBox(-0.1217F, -0.3048F, -1.2638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.548F, -6.3989F, -0.4381F, -0.2044F, 0.0147F));

		PartDefinition cube_r406 = jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(84, 10).mirror().addBox(-0.1415F, -0.839F, -0.7014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.534F, -4.799F, 0.5857F, -0.0125F, 0.0144F));

		PartDefinition cube_r407 = jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(65, 16).mirror().addBox(-0.3321F, -0.1263F, -5.3933F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F)).mirror(false)
				.texOffs(35, 66).mirror().addBox(-0.3321F, -0.5254F, -4.5791F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.0105F, 0.2965F, 0.0868F, -0.1172F, 0.0145F));

		PartDefinition cube_r408 = jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(63, 66).mirror().addBox(-0.3321F, -0.9999F, -2.8692F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.0105F, 0.2965F, 0.2875F, -0.1172F, 0.0145F));

		PartDefinition cube_r409 = jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(84, 55).mirror().addBox(-0.1415F, -0.1036F, -0.4001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.534F, -4.799F, 0.001F, -0.0125F, 0.0144F));

		PartDefinition cube_r410 = jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(84, 3).mirror().addBox(-0.3321F, -1.2724F, -5.0865F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.0105F, 0.2965F, 0.3486F, -0.1172F, 0.0145F));

		PartDefinition cube_r411 = jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(56, 14).mirror().addBox(-0.3321F, -0.3135F, -3.9484F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.0105F, 0.2965F, 0.1391F, -0.1172F, 0.0145F));

		PartDefinition cube_r412 = jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(28, 70).mirror().addBox(-0.3321F, -0.7676F, -3.0674F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.0105F, 0.2965F, 0.174F, -0.1172F, 0.0145F));

		PartDefinition cube_r413 = jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(28, 66).mirror().addBox(-0.3321F, -0.1722F, -1.3085F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.0105F, 0.2965F, -0.0005F, -0.1172F, 0.0145F));

		PartDefinition cube_r414 = jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(50, 83).mirror().addBox(-0.3321F, -0.4813F, -1.5403F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.0105F, 0.2965F, 0.2613F, -0.1172F, 0.0145F));

		PartDefinition cube_r415 = jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-0.3321F, -0.2111F, -0.9919F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.0105F, 0.2965F, -0.0878F, -0.1172F, 0.0145F));

		PartDefinition cube_r416 = jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(38, 56).addBox(-2.1346F, -0.3877F, -0.0969F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.9F, 1.3261F, -1.592F, -0.0492F, 0.1915F, -0.0889F));

		PartDefinition cube_r417 = jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(63, 62).addBox(-2.1776F, -0.3593F, -1.6503F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.9F, 1.3261F, -1.592F, -0.1449F, 0.4046F, -0.0815F));

		PartDefinition cube_r418 = jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(84, 58).addBox(-0.6679F, 1.9665F, -2.9309F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(36, 74).addBox(-0.6679F, 1.8665F, -3.5059F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(1.8F, -0.0105F, 0.2965F, -0.7335F, 0.1172F, -0.0145F));

		PartDefinition cube_r419 = jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(65, 84).addBox(-0.8585F, -0.7422F, -0.5848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, 0.534F, -4.799F, -0.2172F, 0.0125F, -0.0144F));

		PartDefinition cube_r420 = jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(81, 7).addBox(-0.6679F, -0.9525F, -5.1103F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.8F, -0.0105F, 0.2965F, 0.1566F, 0.1172F, -0.0145F));

		PartDefinition cube_r421 = jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(60, 84).addBox(-1.0315F, -0.966F, -1.4743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(84, 61).addBox(-1.0315F, -1.266F, -1.4743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.4F, 0.534F, -4.799F, 0.2177F, -0.0394F, 0.0049F));

		PartDefinition cube_r422 = jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(79, 19).addBox(-0.9686F, -0.894F, -0.6445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.4F, 0.548F, -6.3989F, 0.0005F, 0.1526F, 0.005F));

		PartDefinition cube_r423 = jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(79, 13).addBox(-0.9621F, -0.6734F, -1.398F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.4F, 0.548F, -6.3989F, -0.3937F, 0.1523F, -0.01F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(62, 78).addBox(-0.8357F, -1.1183F, -0.7968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(72, 78).addBox(-0.8357F, -0.8183F, -0.7968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(82, 45).addBox(-0.8357F, -0.9933F, -1.2968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.1F, 0.2576F, -7.6015F, -0.5291F, 0.5537F, -0.0116F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(62, 0).addBox(-0.8357F, -0.563F, -1.5772F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.23F)), PartPose.offsetAndRotation(1.1F, 0.2576F, -7.6015F, -0.5684F, 0.5537F, -0.0116F));

		PartDefinition cube_r426 = jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(7, 63).addBox(-0.8357F, -0.4867F, -1.5907F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.1F, 0.2576F, -7.6015F, -0.6339F, 0.5537F, -0.0116F));

		PartDefinition cube_r427 = jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(67, 78).addBox(-0.8783F, -0.4287F, -0.7275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.4F, 0.548F, -6.3989F, -0.2025F, 0.2044F, -0.0147F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(77, 78).addBox(-0.8783F, -0.3491F, -0.7228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.4F, 0.548F, -6.3989F, -0.3334F, 0.2044F, -0.0147F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(38, 52).addBox(-0.8585F, -0.0885F, -1.7935F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, 0.534F, -4.799F, -0.1473F, 0.0125F, -0.0144F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(65, 20).addBox(-0.8585F, -0.5256F, -1.8433F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.4F, 0.534F, -4.799F, 0.0621F, 0.0125F, -0.0144F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(57, 78).addBox(-0.8783F, -0.3048F, -1.2638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.4F, 0.548F, -6.3989F, -0.4381F, 0.2044F, -0.0147F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(84, 10).addBox(-0.8585F, -0.839F, -0.7014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.4F, 0.534F, -4.799F, 0.5857F, 0.0125F, -0.0144F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(65, 16).addBox(-0.6679F, -0.1263F, -5.3933F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F))
				.texOffs(35, 66).addBox(-0.6679F, -0.5254F, -4.5791F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.8F, -0.0105F, 0.2965F, 0.0868F, 0.1172F, -0.0145F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(63, 66).addBox(-0.6679F, -0.9999F, -2.8692F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8F, -0.0105F, 0.2965F, 0.2875F, 0.1172F, -0.0145F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(84, 55).addBox(-0.8585F, -0.1036F, -0.4001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(1.4F, 0.534F, -4.799F, 0.001F, 0.0125F, -0.0144F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(84, 3).addBox(-0.6679F, -1.2724F, -5.0865F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8F, -0.0105F, 0.2965F, 0.3486F, 0.1172F, -0.0145F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(56, 14).addBox(-0.6679F, -0.3135F, -3.9484F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.8F, -0.0105F, 0.2965F, 0.1391F, 0.1172F, -0.0145F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(28, 70).addBox(-0.6679F, -0.7676F, -3.0674F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.8F, -0.0105F, 0.2965F, 0.174F, 0.1172F, -0.0145F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(28, 66).addBox(-0.6679F, -0.1722F, -1.3085F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(1.8F, -0.0105F, 0.2965F, -0.0005F, 0.1172F, -0.0145F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(50, 83).addBox(-0.6679F, -0.4813F, -1.5403F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(1.8F, -0.0105F, 0.2965F, 0.2613F, 0.1172F, -0.0145F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(0, 66).addBox(-0.6679F, -0.2111F, -0.9919F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.8F, -0.0105F, 0.2965F, -0.0878F, 0.1172F, -0.0145F));

		return LayerDefinition.create(meshdefinition, 94, 94);
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