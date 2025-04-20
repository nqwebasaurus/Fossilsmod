package fossils.fossils.client.blockentity.model.anurognathus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AnurognathusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart leftWing;
	private final ModelPart leftWing2;
	private final ModelPart leftWing3;
	private final ModelPart hand;
	private final ModelPart leftWing4;
	private final ModelPart leftWing5;
	private final ModelPart leftWing6;
	private final ModelPart rightWing;
	private final ModelPart rightWing2;
	private final ModelPart rightWing3;
	private final ModelPart hand2;
	private final ModelPart rightWing4;
	private final ModelPart rightWing5;
	private final ModelPart rightWing6;
	private final ModelPart leftLeg;
	private final ModelPart leftLegMembrane;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart finger;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLegMembrane;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart finger2;
	private final ModelPart rightLeg4;
	private final ModelPart neck;
	private final ModelPart Head;
	private final ModelPart lefFace;
	private final ModelPart lefFace2;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;

	public AnurognathusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.leftWing = this.main.getChild("leftWing");
		this.leftWing2 = this.leftWing.getChild("leftWing2");
		this.leftWing3 = this.leftWing2.getChild("leftWing3");
		this.hand = this.leftWing3.getChild("hand");
		this.leftWing4 = this.leftWing3.getChild("leftWing4");
		this.leftWing5 = this.leftWing4.getChild("leftWing5");
		this.leftWing6 = this.leftWing5.getChild("leftWing6");
		this.rightWing = this.main.getChild("rightWing");
		this.rightWing2 = this.rightWing.getChild("rightWing2");
		this.rightWing3 = this.rightWing2.getChild("rightWing3");
		this.hand2 = this.rightWing3.getChild("hand2");
		this.rightWing4 = this.rightWing3.getChild("rightWing4");
		this.rightWing5 = this.rightWing4.getChild("rightWing5");
		this.rightWing6 = this.rightWing5.getChild("rightWing6");
		this.leftLeg = this.main.getChild("leftLeg");
		this.leftLegMembrane = this.leftLeg.getChild("leftLegMembrane");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.finger = this.leftLeg3.getChild("finger");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.main.getChild("rightLeg");
		this.rightLegMembrane = this.rightLeg.getChild("rightLegMembrane");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.finger2 = this.rightLeg3.getChild("finger2");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.neck = this.main.getChild("neck");
		this.Head = this.neck.getChild("Head");
		this.lefFace = this.Head.getChild("lefFace");
		this.lefFace2 = this.Head.getChild("lefFace2");
		this.jaw = this.Head.getChild("jaw");
		this.tail = this.main.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -13.75F, -2.5F, 0.3127F, 0.2033F, 0.6402F));

		PartDefinition cube_r1 = main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-0.4491F, -0.5157F, -0.4357F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 1.0211F, 5.8141F, -0.4036F, 0.6475F, -1.9337F));

		PartDefinition cube_r2 = main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(51, 55).mirror().addBox(-0.4358F, -0.7968F, -0.2283F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.0981F, 1.0359F, 7.7588F, 0.4303F, 0.2106F, -0.0573F));

		PartDefinition cube_r3 = main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(35, 55).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.0981F, 0.6359F, 7.5588F, -0.39F, 0.2106F, -0.0573F));

		PartDefinition cube_r4 = main.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(30, 55).mirror().addBox(-0.5F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(55, 28).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0332F, -0.1289F, 8.0667F, 0.283F, 0.2154F, 0.0347F));

		PartDefinition cube_r5 = main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(55, 15).mirror().addBox(-0.8F, -0.225F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.5742F, 6.9062F, -0.1457F, 0.2106F, -0.0573F));

		PartDefinition cube_r6 = main.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(55, 12).mirror().addBox(-1.2028F, -0.7897F, -1.5062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(55, 9).mirror().addBox(-1.2028F, -0.7897F, -1.0062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.6742F, 5.0062F, -0.5995F, 0.2106F, -0.0573F));

		PartDefinition cube_r7 = main.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(5, 50).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -1.0F, 4.8F, -0.1515F, -0.0869F, -0.517F));

		PartDefinition cube_r8 = main.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(5, 64).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -1.0F, 4.8F, -0.1739F, -0.0151F, -0.0859F));

		PartDefinition cube_r9 = main.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-0.5262F, -0.4027F, -0.451F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7029F, 1.241F, -1.6596F, 0.0528F, 0.6553F, -0.9465F));

		PartDefinition cube_r10 = main.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(53, 19).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7801F, 1.5422F, 0.5513F, -0.1507F, -0.3882F, 0.4369F));

		PartDefinition cube_r11 = main.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(32, 30).mirror().addBox(-2.3053F, -1.0949F, -1.4409F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.7317F, -0.0706F, -0.1443F, 0.4323F, 0.201F));

		PartDefinition cube_r12 = main.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(12, 43).mirror().addBox(-0.2653F, -0.5916F, -0.2136F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.4F, -1.2654F, 0.3986F, -0.0696F, 0.565F, -0.0862F));

		PartDefinition cube_r13 = main.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(34, 14).mirror().addBox(-1.5455F, -0.5F, -0.7035F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.359F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1711F, 5.8141F, 0.1321F, 0.3029F, 0.0396F));

		PartDefinition cube_r14 = main.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(46, 4).mirror().addBox(-0.5F, -0.625F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.139F, 1.0243F, 6.5064F, 0.4053F, 0.1346F, -0.1008F));

		PartDefinition cube_r15 = main.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(53, 25).mirror().addBox(-0.8F, 0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(19, 47).mirror().addBox(-0.8F, 0.1F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.5742F, 6.9062F, -0.2679F, 0.2106F, -0.0573F));

		PartDefinition cube_r16 = main.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(23, 29).mirror().addBox(-0.8F, -0.3F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.5742F, 6.9062F, -0.3202F, 0.2106F, -0.0573F));

		PartDefinition cube_r17 = main.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(48, 51).mirror().addBox(-0.425F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.7801F, 1.5422F, 0.5513F, -0.142F, 0.1906F, 0.3524F));

		PartDefinition cube_r18 = main.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(5, 32).mirror().addBox(-2.0F, -1.0949F, -0.5783F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.7317F, -0.0706F, -0.1309F, 0.0F, 0.2618F));

		PartDefinition cube_r19 = main.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(47, 46).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.4029F, 0.141F, -1.6596F, 0.0548F, 0.7071F, -0.5403F));

		PartDefinition cube_r20 = main.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 27).mirror().addBox(-0.631F, -0.214F, -0.3257F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -1.2654F, -2.0014F, 0.1418F, 0.3793F, -0.0566F));

		PartDefinition cube_r21 = main.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(48, 31).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.4F, 2.8F, -0.1515F, -0.0869F, -0.517F));

		PartDefinition cube_r22 = main.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(63, 52).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.4F, 2.8F, -0.1739F, -0.0151F, -0.0859F));

		PartDefinition cube_r23 = main.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(63, 50).mirror().addBox(-3.1383F, -2.0132F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.5F, 0.8F, 0.037F, 0.0791F, -1.133F));

		PartDefinition cube_r24 = main.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(48, 29).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.5F, 0.8F, 0.0756F, 0.0436F, -0.5219F));

		PartDefinition cube_r25 = main.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(63, 48).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.5F, 0.8F, 0.0869F, 0.0076F, -0.0869F));

		PartDefinition cube_r26 = main.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(62, 46).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.5F, -1.2F, 0.1548F, 0.2325F, -0.0883F));

		PartDefinition cube_r27 = main.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(26, 48).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.5F, -1.2F, 0.0401F, 0.2757F, -0.5372F));

		PartDefinition cube_r28 = main.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5508F, -0.5157F, -0.4357F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)), PartPose.offsetAndRotation(1.2F, 1.0211F, 5.8141F, -0.4036F, -0.6475F, 1.9337F));

		PartDefinition cube_r29 = main.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(34, 14).addBox(-0.4545F, -0.5F, -0.7035F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)), PartPose.offsetAndRotation(0.0F, 1.1711F, 5.8141F, 0.1321F, -0.3029F, -0.0396F));

		PartDefinition cube_r30 = main.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(46, 4).addBox(-0.5F, -0.625F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.139F, 1.0243F, 6.5064F, 0.4053F, -0.1346F, 0.1008F));

		PartDefinition cube_r31 = main.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(51, 55).addBox(-0.5642F, -0.7968F, -0.2283F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.0981F, 1.0359F, 7.7588F, 0.4303F, -0.2106F, 0.0573F));

		PartDefinition cube_r32 = main.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(35, 55).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.0981F, 0.6359F, 7.5588F, -0.39F, -0.2106F, 0.0573F));

		PartDefinition cube_r33 = main.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(53, 25).addBox(-0.2F, 0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(19, 47).addBox(-0.2F, 0.1F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -0.5742F, 6.9062F, -0.2679F, -0.2106F, 0.0573F));

		PartDefinition cube_r34 = main.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(55, 12).addBox(0.2028F, -0.7897F, -1.5062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(55, 9).addBox(0.2028F, -0.7897F, -1.0062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.0F, -0.6742F, 5.0062F, -0.5995F, -0.2106F, 0.0573F));

		PartDefinition cube_r35 = main.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(30, 55).addBox(-0.5F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(55, 28).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0332F, -0.1289F, 8.0667F, 0.283F, -0.2154F, -0.0347F));

		PartDefinition cube_r36 = main.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(55, 15).addBox(-0.2F, -0.225F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.0F, -0.5742F, 6.9062F, -0.1457F, -0.2106F, 0.0573F));

		PartDefinition cube_r37 = main.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(23, 29).addBox(-0.2F, -0.3F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.0F, -0.5742F, 6.9062F, -0.3202F, -0.2106F, 0.0573F));

		PartDefinition cube_r38 = main.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(43, 48).addBox(0.0F, -0.2004F, 0.0553F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 38).addBox(-0.5F, -0.0004F, 0.0553F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.05F, 6.4F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r39 = main.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(64, 33).addBox(0.0F, -0.506F, 0.9549F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 6).addBox(-0.5F, -0.2059F, -0.0451F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.25F, 3.5F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r40 = main.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(33, 64).addBox(0.0F, -0.7059F, 2.1529F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 64).addBox(0.0F, -0.7059F, 0.1529F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 6).addBox(-0.5F, -0.4059F, 0.1529F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.3F, 0.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r41 = main.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(19, 11).addBox(-1.5F, -1.149F, -3.2652F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 5.3F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r42 = main.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(5, 64).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -1.0F, 4.8F, -0.1739F, 0.0151F, 0.0859F));

		PartDefinition cube_r43 = main.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(5, 50).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -1.0F, 4.8F, -0.1515F, 0.0869F, 0.517F));

		PartDefinition cube_r44 = main.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(63, 52).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4F, 2.8F, -0.1739F, 0.0151F, 0.0859F));

		PartDefinition cube_r45 = main.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(48, 31).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4F, 2.8F, -0.1515F, 0.0869F, 0.517F));

		PartDefinition cube_r46 = main.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(63, 48).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5F, 0.8F, 0.0869F, -0.0076F, 0.0869F));

		PartDefinition cube_r47 = main.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(48, 29).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5F, 0.8F, 0.0756F, -0.0436F, 0.5219F));

		PartDefinition cube_r48 = main.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(63, 50).addBox(2.1383F, -2.0132F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5F, 0.8F, 0.037F, -0.0791F, 1.133F));

		PartDefinition cube_r49 = main.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(62, 46).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5F, -1.2F, 0.1548F, -0.2325F, 0.0883F));

		PartDefinition cube_r50 = main.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(26, 48).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5F, -1.2F, 0.0401F, -0.2757F, 0.5372F));

		PartDefinition cube_r51 = main.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 48).addBox(-0.4738F, -0.4027F, -0.451F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7029F, 1.241F, -1.6596F, 0.0528F, -0.6553F, 0.9465F));

		PartDefinition cube_r52 = main.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(47, 46).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.4029F, 0.141F, -1.6596F, 0.0548F, -0.7071F, 0.5403F));

		PartDefinition cube_r53 = main.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(12, 43).addBox(-0.7347F, -0.5916F, -0.2136F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.4F, -1.2654F, 0.3986F, -0.0696F, -0.565F, 0.0862F));

		PartDefinition cube_r54 = main.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 27).addBox(-0.369F, -0.214F, -0.3257F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.0F, -1.2654F, -2.0014F, 0.1418F, -0.3793F, 0.0566F));

		PartDefinition cube_r55 = main.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(53, 19).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7801F, 1.5422F, 0.5513F, -0.1507F, 0.3882F, -0.4369F));

		PartDefinition cube_r56 = main.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(48, 51).addBox(-0.575F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.7801F, 1.5422F, 0.5513F, -0.142F, -0.1906F, -0.3524F));

		PartDefinition cube_r57 = main.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(32, 30).addBox(-0.6947F, -1.0949F, -1.4409F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 2.7317F, -0.0706F, -0.1443F, -0.4323F, -0.201F));

		PartDefinition cube_r58 = main.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(5, 55).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(19, 43).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.1317F, -0.0706F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r59 = main.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(5, 32).addBox(0.0F, -1.0949F, -0.5783F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 2.7317F, -0.0706F, -0.1309F, 0.0F, -0.2618F));

		PartDefinition cube_r60 = main.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(64, 36).addBox(0.5F, -0.9262F, -1.405F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 64).addBox(0.496F, -0.9262F, -1.005F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.8317F, -2.0706F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r61 = main.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(55, 6).addBox(-0.004F, -0.9906F, -0.0436F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.2317F, -0.0706F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r62 = main.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(26, 40).addBox(0.0F, -0.9906F, -2.0436F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.2317F, -0.0706F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r63 = main.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(9, 27).addBox(0.0F, -1.3368F, -0.0552F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 35).addBox(-0.5F, -1.0368F, -0.0552F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.85F, -1.525F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r64 = main.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(12, 51).addBox(-0.5F, -0.95F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.3F, -2.7F, -0.2967F, 0.0F, 0.0F));

		PartDefinition leftWing = main.addOrReplaceChild("leftWing", CubeListBuilder.create().texOffs(48, 19).addBox(-0.5F, 0.85F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 44).addBox(-0.5F, -0.15F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4061F, -0.2488F, -1.5373F, 0.2834F, 0.1327F, -1.7233F));

		PartDefinition cube_r65 = leftWing.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(26, 50).addBox(-0.5F, 0.2F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 3.65F, 0.3F, -0.1571F, 0.0F, 0.0F));

		PartDefinition leftWing2 = leftWing.addOrReplaceChild("leftWing2", CubeListBuilder.create().texOffs(18, 24).addBox(-0.7001F, -0.1808F, -0.0248F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(13, 21).addBox(-0.7001F, -0.1808F, -0.8248F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2412F, 5.8727F, -0.2435F, -0.6224F, -0.3717F, -0.1701F));

		PartDefinition cube_r66 = leftWing2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(50, 8).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.2001F, 7.9458F, -1.1263F, 0.4363F, 0.0F, 0.0F));

		PartDefinition leftWing3 = leftWing2.addOrReplaceChild("leftWing3", CubeListBuilder.create().texOffs(48, 24).addBox(-0.9656F, -0.1774F, -0.3857F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3122F, 8.8961F, -0.1544F, 0.3552F, 0.0407F, 0.145F));

		PartDefinition hand = leftWing3.addOrReplaceChild("hand", CubeListBuilder.create().texOffs(23, 34).addBox(-0.6299F, -1.8109F, 0.1631F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5681F, 2.6135F, -0.4817F, 1.1191F, -0.0329F, -2.8332F));

		PartDefinition leftWing4 = leftWing3.addOrReplaceChild("leftWing4", CubeListBuilder.create().texOffs(0, 11).addBox(-1.0F, -1.0F, -0.4F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1275F, 2.7906F, -0.3423F, -1.0491F, 0.3686F, 0.2225F));

		PartDefinition cube_r67 = leftWing4.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(21, 0).addBox(-0.5F, -0.9F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.5F, -0.1F, 7.5F, 0.1571F, 0.0F, 0.0F));

		PartDefinition leftWing5 = leftWing4.addOrReplaceChild("leftWing5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3844F, -0.9491F, 10.6873F, 0.0826F, -0.2075F, -0.0505F));

		PartDefinition cube_r68 = leftWing5.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.9F, -3.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1082F, -0.2042F, 2.9052F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftWing6 = leftWing5.addOrReplaceChild("leftWing6", CubeListBuilder.create().texOffs(19, 17).addBox(-0.5073F, -0.6863F, -0.2623F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0697F, -1.7249F, 8.5816F, 0.4795F, -0.1455F, -0.0965F));

		PartDefinition rightWing = main.addOrReplaceChild("rightWing", CubeListBuilder.create().texOffs(48, 19).mirror().addBox(-0.5F, 0.85F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(33, 44).mirror().addBox(-0.5F, -0.15F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4061F, -0.2488F, -1.5373F, 0.4111F, -0.2309F, 1.732F));

		PartDefinition cube_r69 = rightWing.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(26, 50).mirror().addBox(-0.5F, 0.2F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.65F, 0.3F, -0.1571F, 0.0F, 0.0F));

		PartDefinition rightWing2 = rightWing.addOrReplaceChild("rightWing2", CubeListBuilder.create().texOffs(18, 24).mirror().addBox(-0.2999F, -0.1808F, -0.0248F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(13, 21).mirror().addBox(-0.2999F, -0.1808F, -0.8248F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2412F, 5.8727F, -0.2435F, -0.6224F, 0.3717F, 0.1701F));

		PartDefinition cube_r70 = rightWing2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(50, 8).mirror().addBox(-0.5F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.2001F, 7.9458F, -1.1263F, 0.4363F, 0.0F, 0.0F));

		PartDefinition rightWing3 = rightWing2.addOrReplaceChild("rightWing3", CubeListBuilder.create().texOffs(48, 24).mirror().addBox(-0.0344F, -0.1774F, -0.3857F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3122F, 8.8961F, -0.1544F, 0.3552F, -0.0407F, -0.145F));

		PartDefinition hand2 = rightWing3.addOrReplaceChild("hand2", CubeListBuilder.create().texOffs(23, 34).mirror().addBox(-0.3701F, -1.8109F, 0.1631F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.5681F, 2.6135F, -0.4817F, 1.1191F, 0.0329F, 2.8332F));

		PartDefinition rightWing4 = rightWing3.addOrReplaceChild("rightWing4", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(0.0F, -1.0F, -0.4F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1275F, 2.7906F, -0.3423F, -1.4505F, 0.0212F, -0.1733F));

		PartDefinition cube_r71 = rightWing4.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(21, 0).mirror().addBox(-0.5F, -0.9F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.1F, 7.5F, 0.1571F, 0.0F, 0.0F));

		PartDefinition rightWing5 = rightWing4.addOrReplaceChild("rightWing5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3844F, -0.9491F, 10.6873F, 0.0826F, 0.2075F, 0.0505F));

		PartDefinition cube_r72 = rightWing5.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -0.9F, -3.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1082F, -0.2042F, 2.9052F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightWing6 = rightWing5.addOrReplaceChild("rightWing6", CubeListBuilder.create().texOffs(19, 17).mirror().addBox(-0.4927F, -0.6863F, -0.2623F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0697F, -1.7249F, 8.5816F, 0.4795F, 0.1455F, 0.0965F));

		PartDefinition leftLeg = main.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(7, 44).addBox(-0.4F, 0.0F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3529F, 0.2138F, 7.2672F, 0.4728F, 0.0378F, -1.1719F));

		PartDefinition leftLegMembrane = leftLeg.addOrReplaceChild("leftLegMembrane", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 1.6F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(0, 32).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.462F, 4.078F, -0.3473F, 0.4954F, -0.0413F, 0.3525F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(0, 21).addBox(-1.0F, 0.0F, -3.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.536F, 6.8471F, 0.3961F, 1.2482F, 0.0868F, -0.0091F));

		PartDefinition finger = leftLeg3.addOrReplaceChild("finger", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.5F, 0.3F, -0.288F, 0.103F, -1.2367F));

		PartDefinition cube_r73 = finger.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(26, 44).addBox(-0.4984F, -0.5F, -1.7902F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.3F, 0.0F, -2.0F, 0.0F, 1.7977F, 0.0F));

		PartDefinition cube_r74 = finger.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(32, 0).addBox(-0.6545F, -0.5F, -2.892F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1F, 0.0F, -1.1F, 0.0F, 1.1694F, 0.0F));

		PartDefinition cube_r75 = finger.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(0, 44).addBox(-0.3039F, -0.5F, -1.7478F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.2F, 0.0F, 0.3491F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(32, 17).addBox(-1.0F, -0.0101F, -1.9001F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0133F, -3.6149F, 0.4632F, 0.0F, 0.0F));

		PartDefinition rightLeg = main.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(7, 44).mirror().addBox(-0.6F, 0.0F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3529F, 0.2138F, 7.2672F, 0.1673F, -0.0378F, 1.1719F));

		PartDefinition rightLegMembrane = rightLeg.addOrReplaceChild("rightLegMembrane", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 1.6F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.462F, 4.078F, -0.3473F, 0.8444F, 0.0413F, -0.3525F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(0, 21).mirror().addBox(-1.0F, 0.0F, -3.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.536F, 6.8471F, 0.3961F, 0.9864F, -0.0868F, 0.0091F));

		PartDefinition finger2 = rightLeg3.addOrReplaceChild("finger2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.5F, 0.3F, -0.288F, -0.103F, 1.2367F));

		PartDefinition cube_r76 = finger2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(26, 44).mirror().addBox(-0.5016F, -0.5F, -1.7902F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.3F, 0.0F, -2.0F, 0.0F, -1.7977F, 0.0F));

		PartDefinition cube_r77 = finger2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(32, 0).mirror().addBox(-0.3455F, -0.5F, -2.892F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.0F, -1.1F, 0.0F, -1.1694F, 0.0F));

		PartDefinition cube_r78 = finger2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-0.6961F, -0.5F, -1.7478F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.2F, 0.0F, -0.3491F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(32, 17).mirror().addBox(-1.0F, -0.0101F, -1.9001F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0133F, -3.6149F, 0.4632F, 0.0F, 0.0F));

		PartDefinition neck = main.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, -2.525F, -1.0406F, -0.0869F, -0.1515F));

		PartDefinition cube_r79 = neck.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(64, 39).addBox(0.0F, -1.3F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 18).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.4543F, -3.819F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r80 = neck.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(22, 51).addBox(0.0F, -1.22F, -0.0396F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 0).addBox(-0.5F, -1.02F, -0.0396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3431F, -0.7856F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r81 = neck.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(14, 32).addBox(0.0F, -1.2782F, -0.8438F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 24).addBox(-0.5F, -0.8782F, -1.8438F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.2431F, -1.9856F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Head = neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(41, 14).addBox(-1.5F, -0.8945F, -0.8469F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(41, 22).addBox(-1.5F, -0.8945F, -1.2469F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, 0.1931F, -4.4106F, 0.7163F, -0.079F, -0.4783F));

		PartDefinition cube_r82 = Head.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(53, 52).addBox(-1.0F, -0.7748F, -0.1811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0805F, -4.6469F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r83 = Head.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(53, 49).addBox(-1.0F, -0.7576F, -0.2018F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.0F, 0.5805F, -4.9469F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r84 = Head.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(53, 22).addBox(-1.0F, -0.6674F, -0.2079F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.0805F, -5.0469F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r85 = Head.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(32, 27).addBox(-2.0F, -0.1823F, -0.6984F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.1195F, -1.1469F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r86 = Head.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(32, 21).addBox(-1.5F, -0.5F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -0.7657F, -0.5658F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r87 = Head.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(32, 24).addBox(-1.5F, -0.1191F, 0.4066F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.5F, -1.2195F, -1.7469F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r88 = Head.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(35, 58).addBox(-0.5F, -0.2736F, -0.7436F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.5F, -0.5873F, -3.8095F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r89 = Head.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(56, 55).addBox(-0.5F, -0.2326F, -1.4512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -1.0873F, -2.7095F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r90 = Head.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(34, 11).addBox(-1.5F, -0.1531F, -0.172F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.5F, -1.2873F, -1.9095F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r91 = Head.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(32, 33).addBox(-1.0F, -0.2326F, 0.0488F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(48, 16).addBox(-0.5F, -0.2326F, -0.2512F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.0F, -1.0873F, -2.7095F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r92 = Head.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(33, 40).addBox(-0.5082F, -0.4406F, -1.7325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4672F, 1.3805F, -3.0576F, 0.1789F, 0.0F, 0.0F));

		PartDefinition cube_r93 = Head.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(48, 13).addBox(-1.5F, -0.7227F, -0.2027F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(48, 0).addBox(-1.5F, -0.9477F, -0.2027F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.9305F, -5.0469F, 0.0524F, 0.0F, 0.0F));

		PartDefinition lefFace = Head.addOrReplaceChild("lefFace", CubeListBuilder.create(), PartPose.offset(-0.4672F, 0.8055F, -1.0576F));

		PartDefinition cube_r94 = lefFace.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(41, 0).addBox(0.5207F, -0.292F, -2.232F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.238F, 0.4512F, 0.1054F));

		PartDefinition cube_r95 = lefFace.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(56, 31).addBox(0.3F, -0.2326F, -0.8512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(20, 57).addBox(0.3F, -0.2326F, -1.4512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5329F, -1.8927F, -1.6519F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r96 = lefFace.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(40, 44).addBox(0.7579F, -0.292F, 0.0717F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.8842F, 1.2929F, 0.865F));

		PartDefinition cube_r97 = lefFace.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(44, 34).addBox(0.406F, -0.3766F, -0.363F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.575F, -2.0F, 1.6294F, 1.4965F, 1.6296F));

		PartDefinition cube_r98 = lefFace.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(41, 18).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(38, 48).addBox(-0.5F, -0.8F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(33, 48).addBox(-0.5F, -1.0F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(12, 39).addBox(-0.5F, 0.2F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.5425F, -0.5954F, -1.6294F, 0.024F, 0.3393F, -0.3472F));

		PartDefinition cube_r99 = lefFace.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(60, 61).addBox(-0.9525F, -0.3232F, -0.6718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(63, 21).addBox(-0.6525F, -0.3232F, -0.6718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(1.6989F, -1.5979F, 0.8554F, 0.2654F, -0.4435F, 0.6655F));

		PartDefinition cube_r100 = lefFace.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(55, 61).addBox(-0.7732F, -0.4451F, -0.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(25, 63).addBox(-0.4732F, -0.4451F, -0.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.8989F, -0.6729F, 1.2554F, -0.0823F, -0.2484F, 1.3928F));

		PartDefinition cube_r101 = lefFace.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(63, 24).addBox(-0.7024F, -0.3883F, -0.5913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F))
				.texOffs(20, 63).addBox(-1.0024F, -0.3883F, -0.5913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.8989F, -1.0229F, 1.1054F, 0.0529F, -0.5098F, 1.122F));

		PartDefinition cube_r102 = lefFace.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(61, 54).addBox(0.1645F, -0.469F, -0.3959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F))
				.texOffs(63, 18).addBox(0.4645F, -0.469F, -0.3959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(50, 61).addBox(-0.1355F, -0.469F, -0.3959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(30, 61).addBox(-0.4355F, -0.469F, -0.3959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(1.8989F, -0.6729F, 0.9554F, -0.0834F, 0.2953F, 1.3483F));

		PartDefinition cube_r103 = lefFace.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(35, 61).addBox(-1.65F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(15, 63).addBox(-1.35F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(10, 63).addBox(-0.75F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(63, 3).addBox(-1.05F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.985F, -0.822F, -0.2375F, -1.6794F, 1.4287F, -0.5185F));

		PartDefinition cube_r104 = lefFace.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(60, 58).addBox(-0.35F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(61, 30).addBox(-0.65F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(2.1662F, -0.0144F, -0.3177F, -0.1481F, 0.1747F, 1.5572F));

		PartDefinition cube_r105 = lefFace.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(5, 61).addBox(-0.2767F, -1.2622F, -0.5803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.3172F, -0.5771F, -0.2614F, -0.1682F, 0.1554F, 1.4348F));

		PartDefinition cube_r106 = lefFace.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(62, 43).addBox(0.1416F, -1.0096F, -0.6013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F))
				.texOffs(0, 62).addBox(-0.1584F, -1.0096F, -0.6013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.3172F, -1.0771F, -0.2614F, -0.142F, -0.1056F, 1.177F));

		PartDefinition cube_r107 = lefFace.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(40, 60).addBox(0.3031F, -0.694F, -0.5787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(1.3172F, -1.8771F, -0.4614F, -0.0729F, -0.2664F, 1.1642F));

		PartDefinition cube_r108 = lefFace.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(10, 60).addBox(0.0619F, -0.4734F, -0.5787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(60, 9).addBox(-0.2381F, -0.4734F, -0.5787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(1.3172F, -1.8771F, -0.4614F, 0.0151F, -0.2756F, 0.8381F));

		PartDefinition cube_r109 = lefFace.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(45, 60).addBox(-0.4748F, -0.4076F, -0.5787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.3172F, -1.8771F, -0.4614F, 0.1533F, -0.2304F, 0.2989F));

		PartDefinition cube_r110 = lefFace.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(15, 54).addBox(-0.45F, -0.875F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0328F, -0.7232F, -3.1683F, -0.6188F, 0.3858F, 0.4862F));

		PartDefinition cube_r111 = lefFace.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(0, 59).addBox(-0.4653F, -0.8653F, -0.4237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.5671F, -0.5271F, -2.8614F, 1.292F, 0.7491F, 1.4888F));

		PartDefinition cube_r112 = lefFace.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(30, 58).addBox(-0.3195F, -0.9038F, -0.4237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(58, 24).addBox(-0.0195F, -0.9038F, -0.4237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F))
				.texOffs(58, 21).addBox(0.2805F, -0.9038F, -0.4237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5671F, -0.5271F, -2.8614F, 1.3457F, 0.4446F, 1.5832F));

		PartDefinition cube_r113 = lefFace.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(60, 27).addBox(0.3837F, -1.1477F, -0.4237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F))
				.texOffs(25, 60).addBox(0.6837F, -1.1477F, -0.4237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5671F, -0.5271F, -2.8614F, 1.3654F, 0.1546F, 1.6493F));

		PartDefinition cube_r114 = lefFace.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(20, 60).addBox(1.3404F, -1.1291F, -0.5788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(60, 15).addBox(1.0404F, -1.1291F, -0.5788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.5671F, -1.2271F, -2.8614F, 0.8121F, -0.141F, 1.3841F));

		PartDefinition cube_r115 = lefFace.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(60, 6).addBox(0.9031F, -0.694F, -0.5788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(60, 0).addBox(0.6031F, -0.694F, -0.5788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F))
				.texOffs(59, 40).addBox(0.3031F, -0.694F, -0.5788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5671F, -1.2271F, -2.8614F, 0.8188F, 0.0758F, 1.181F));

		PartDefinition cube_r116 = lefFace.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(59, 37).addBox(-0.4748F, -0.4076F, -0.5788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5671F, -1.4021F, -2.5114F, 0.3881F, 1.0616F, 0.5095F));

		PartDefinition cube_r117 = lefFace.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(60, 12).addBox(-0.238F, -0.4734F, -0.5788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F))
				.texOffs(15, 60).addBox(0.062F, -0.4734F, -0.5788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5671F, -1.4021F, -2.5114F, 0.923F, 0.726F, 1.1768F));

		PartDefinition cube_r118 = lefFace.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(55, 58).addBox(0.062F, -0.4734F, -0.5788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F))
				.texOffs(58, 51).addBox(-0.238F, -0.4734F, -0.5788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5671F, -1.2271F, -2.8614F, 0.7766F, 0.3016F, 0.9581F));

		PartDefinition cube_r119 = lefFace.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(50, 58).addBox(-0.4748F, -0.4076F, -0.5788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.5671F, -1.2271F, -2.8614F, 0.5642F, 0.6334F, 0.4997F));

		PartDefinition cube_r120 = lefFace.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(58, 48).addBox(-0.2F, -0.2736F, -0.7436F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0328F, -1.3927F, -2.7519F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r121 = lefFace.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(15, 57).addBox(-0.2F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.0328F, -1.2817F, -2.4284F, 0.4152F, 0.3215F, 0.1384F));

		PartDefinition cube_r122 = lefFace.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(10, 57).addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.8671F, -1.6651F, -1.3663F, 0.2F, 0.7317F, 0.1346F));

		PartDefinition cube_r123 = lefFace.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(59, 34).addBox(-1.3186F, -0.1938F, -0.8335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.4672F, -1.5113F, -2.674F, 2.4914F, 0.8864F, 2.6091F));

		PartDefinition cube_r124 = lefFace.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(51, 33).addBox(-0.773F, -0.148F, -0.8925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(17, 51).addBox(-0.773F, -0.648F, -0.8925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1684F, 1.0056F, -3.6684F, 0.151F, 0.9909F, 0.1067F));

		PartDefinition cube_r125 = lefFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(53, 3).addBox(-0.7038F, -0.1869F, -0.789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(10, 54).addBox(-0.7538F, -0.6869F, -0.789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4684F, 1.0056F, -3.2684F, 0.1109F, 0.7312F, 0.0544F));

		PartDefinition cube_r126 = lefFace.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(31, 52).addBox(-0.5417F, -0.7835F, -1.3051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 53).addBox(-0.4417F, -0.2835F, -1.3051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(52, 46).addBox(-0.4417F, -0.2835F, -0.7051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(5, 52).addBox(-0.5417F, -0.7835F, -0.7051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7684F, 1.0056F, -2.1684F, 0.0918F, 0.4534F, 0.0204F));

		PartDefinition cube_r127 = lefFace.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(25, 57).addBox(-0.7F, -0.2227F, -0.2527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4672F, 1.125F, -3.9893F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r128 = lefFace.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(40, 40).addBox(0.4547F, -0.292F, 1.2502F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.8449F, 0.7587F, 2.9343F));

		PartDefinition cube_r129 = lefFace.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(5, 36).addBox(0.5809F, -0.292F, -0.6771F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2576F, 0.5866F, 0.1448F));

		PartDefinition cube_r130 = lefFace.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(30, 36).addBox(-0.575F, -0.7F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9738F, 0.8F, -0.5078F, 0.7418F, -0.48F, 0.0F));

		PartDefinition cube_r131 = lefFace.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(36, 52).addBox(-0.4F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.7684F, 1.0056F, -1.9684F, 0.1716F, 0.21F, -0.0022F));

		PartDefinition cube_r132 = lefFace.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(5, 40).addBox(-0.5F, -0.8F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7684F, 1.0056F, -1.9684F, 0.0844F, 0.21F, -0.0022F));

		PartDefinition cube_r133 = lefFace.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(39, 5).addBox(-0.8F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3672F, 0.425F, -0.7893F, 0.0F, -0.0873F, 0.0F));

		PartDefinition lefFace2 = Head.addOrReplaceChild("lefFace2", CubeListBuilder.create(), PartPose.offset(-0.5329F, 0.8055F, -1.0576F));

		PartDefinition cube_r134 = lefFace2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(41, 0).mirror().addBox(-1.5207F, -0.292F, -2.232F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.238F, -0.4512F, -0.1054F));

		PartDefinition cube_r135 = lefFace2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(56, 31).mirror().addBox(-1.3F, -0.2326F, -0.8512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(20, 57).mirror().addBox(-1.3F, -0.2326F, -1.4512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5329F, -1.8927F, -1.6519F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r136 = lefFace2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(40, 44).mirror().addBox(-1.7579F, -0.292F, 0.0717F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.8842F, -1.2929F, -0.865F));

		PartDefinition cube_r137 = lefFace2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(44, 34).mirror().addBox(-1.406F, -0.3766F, -0.363F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.575F, -2.0F, 1.6294F, -1.4965F, -1.6296F));

		PartDefinition cube_r138 = lefFace2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(41, 18).mirror().addBox(-0.5F, -1.0F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(38, 48).mirror().addBox(-0.5F, -0.8F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(33, 48).mirror().addBox(-0.5F, -1.0F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(12, 39).mirror().addBox(-0.5F, 0.2F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.5425F, -0.5954F, -1.6294F, 0.024F, -0.3393F, 0.3472F));

		PartDefinition cube_r139 = lefFace2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(60, 61).mirror().addBox(-0.0475F, -0.3232F, -0.6718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(63, 21).mirror().addBox(-0.3475F, -0.3232F, -0.6718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(-1.6989F, -1.5979F, 0.8554F, 0.2654F, 0.4435F, -0.6655F));

		PartDefinition cube_r140 = lefFace2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(55, 61).mirror().addBox(-0.2268F, -0.4451F, -0.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(25, 63).mirror().addBox(-0.5268F, -0.4451F, -0.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.8989F, -0.6729F, 1.2554F, -0.0823F, 0.2484F, -1.3928F));

		PartDefinition cube_r141 = lefFace2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(63, 24).mirror().addBox(-0.2976F, -0.3883F, -0.5913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false)
				.texOffs(20, 63).mirror().addBox(0.0024F, -0.3883F, -0.5913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.8989F, -1.0229F, 1.1054F, 0.0529F, 0.5098F, -1.122F));

		PartDefinition cube_r142 = lefFace2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(61, 54).mirror().addBox(-1.1645F, -0.469F, -0.3959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false)
				.texOffs(63, 18).mirror().addBox(-1.4645F, -0.469F, -0.3959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(50, 61).mirror().addBox(-0.8645F, -0.469F, -0.3959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(30, 61).mirror().addBox(-0.5645F, -0.469F, -0.3959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(-1.8989F, -0.6729F, 0.9554F, -0.0834F, -0.2953F, -1.3483F));

		PartDefinition cube_r143 = lefFace2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(35, 61).mirror().addBox(0.65F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(15, 63).mirror().addBox(0.35F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(10, 63).mirror().addBox(-0.25F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(63, 3).mirror().addBox(0.05F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.985F, -0.822F, -0.2375F, -1.6794F, -1.4287F, 0.5185F));

		PartDefinition cube_r144 = lefFace2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(60, 58).mirror().addBox(-0.65F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(61, 30).mirror().addBox(-0.35F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(-2.1662F, -0.0144F, -0.3177F, -0.1481F, -0.1747F, -1.5572F));

		PartDefinition cube_r145 = lefFace2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(5, 61).mirror().addBox(-0.7233F, -1.2622F, -0.5803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.3172F, -0.5771F, -0.2614F, -0.1682F, -0.1554F, -1.4348F));

		PartDefinition cube_r146 = lefFace2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(62, 43).mirror().addBox(-1.1416F, -1.0096F, -0.6013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false)
				.texOffs(0, 62).mirror().addBox(-0.8416F, -1.0096F, -0.6013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.3172F, -1.0771F, -0.2614F, -0.142F, 0.1056F, -1.177F));

		PartDefinition cube_r147 = lefFace2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(40, 60).mirror().addBox(-1.3031F, -0.694F, -0.5787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(-1.3172F, -1.8771F, -0.4614F, -0.0729F, 0.2664F, -1.1642F));

		PartDefinition cube_r148 = lefFace2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(10, 60).mirror().addBox(-1.0619F, -0.4734F, -0.5787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(60, 9).mirror().addBox(-0.762F, -0.4734F, -0.5787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(-1.3172F, -1.8771F, -0.4614F, 0.0151F, 0.2756F, -0.8381F));

		PartDefinition cube_r149 = lefFace2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(45, 60).mirror().addBox(-0.5252F, -0.4076F, -0.5787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.3172F, -1.8771F, -0.4614F, 0.1533F, 0.2304F, -0.2989F));

		PartDefinition cube_r150 = lefFace2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(15, 54).mirror().addBox(-0.55F, -0.875F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0328F, -0.7232F, -3.1683F, -0.6188F, -0.3858F, -0.4862F));

		PartDefinition cube_r151 = lefFace2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-0.5347F, -0.8653F, -0.4237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-0.5671F, -0.5271F, -2.8614F, 1.292F, -0.7491F, -1.4888F));

		PartDefinition cube_r152 = lefFace2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(30, 58).mirror().addBox(-0.6805F, -0.9038F, -0.4237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(58, 24).mirror().addBox(-0.9805F, -0.9038F, -0.4237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false)
				.texOffs(58, 21).mirror().addBox(-1.2805F, -0.9038F, -0.4237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.5671F, -0.5271F, -2.8614F, 1.3457F, -0.4446F, -1.5832F));

		PartDefinition cube_r153 = lefFace2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(60, 27).mirror().addBox(-1.3837F, -1.1477F, -0.4237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false)
				.texOffs(25, 60).mirror().addBox(-1.6837F, -1.1477F, -0.4237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.5671F, -0.5271F, -2.8614F, 1.3654F, -0.1546F, -1.6493F));

		PartDefinition cube_r154 = lefFace2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(20, 60).mirror().addBox(-2.3404F, -1.1291F, -0.5788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(60, 15).mirror().addBox(-2.0404F, -1.1291F, -0.5788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-0.5671F, -1.2271F, -2.8614F, 0.8121F, 0.141F, -1.3841F));

		PartDefinition cube_r155 = lefFace2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(60, 6).mirror().addBox(-1.9031F, -0.694F, -0.5788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(60, 0).mirror().addBox(-1.6031F, -0.694F, -0.5788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false)
				.texOffs(59, 40).mirror().addBox(-1.3031F, -0.694F, -0.5788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.5671F, -1.2271F, -2.8614F, 0.8188F, -0.0758F, -1.181F));

		PartDefinition cube_r156 = lefFace2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(59, 37).mirror().addBox(-0.5252F, -0.4076F, -0.5788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.5671F, -1.4021F, -2.5114F, 0.3881F, -1.0616F, -0.5095F));

		PartDefinition cube_r157 = lefFace2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(60, 12).mirror().addBox(-0.762F, -0.4734F, -0.5788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false)
				.texOffs(15, 60).mirror().addBox(-1.0619F, -0.4734F, -0.5788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.5671F, -1.4021F, -2.5114F, 0.923F, -0.726F, -1.1768F));

		PartDefinition cube_r158 = lefFace2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(55, 58).mirror().addBox(-1.0619F, -0.4734F, -0.5788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false)
				.texOffs(58, 51).mirror().addBox(-0.762F, -0.4734F, -0.5788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.5671F, -1.2271F, -2.8614F, 0.7766F, -0.3016F, -0.9581F));

		PartDefinition cube_r159 = lefFace2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(50, 58).mirror().addBox(-0.5252F, -0.4076F, -0.5788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-0.5671F, -1.2271F, -2.8614F, 0.5642F, -0.6334F, -0.4997F));

		PartDefinition cube_r160 = lefFace2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(58, 48).mirror().addBox(-0.8F, -0.2736F, -0.7436F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0328F, -1.3927F, -2.7519F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r161 = lefFace2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(15, 57).mirror().addBox(-0.8F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.0328F, -1.2817F, -2.4284F, 0.4152F, -0.3215F, -0.1384F));

		PartDefinition cube_r162 = lefFace2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(10, 57).mirror().addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.8671F, -1.6651F, -1.3663F, 0.2F, -0.7317F, -0.1346F));

		PartDefinition cube_r163 = lefFace2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(59, 34).mirror().addBox(0.3186F, -0.1938F, -0.8335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.4672F, -1.5113F, -2.674F, 2.4914F, -0.8864F, -2.6091F));

		PartDefinition cube_r164 = lefFace2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(51, 33).mirror().addBox(-0.227F, -0.148F, -0.8925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(17, 51).mirror().addBox(-0.227F, -0.648F, -0.8925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1684F, 1.0056F, -3.6684F, 0.151F, -0.9909F, -0.1067F));

		PartDefinition cube_r165 = lefFace2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(53, 3).mirror().addBox(-0.2962F, -0.1869F, -0.789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(10, 54).mirror().addBox(-0.2462F, -0.6869F, -0.789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4684F, 1.0056F, -3.2684F, 0.1109F, -0.7312F, -0.0544F));

		PartDefinition cube_r166 = lefFace2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(31, 52).mirror().addBox(-0.4583F, -0.7835F, -1.3051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 53).mirror().addBox(-0.5583F, -0.2835F, -1.3051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(52, 46).mirror().addBox(-0.5583F, -0.2835F, -0.7051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(5, 52).mirror().addBox(-0.4583F, -0.7835F, -0.7051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7684F, 1.0056F, -2.1684F, 0.0918F, -0.4534F, -0.0204F));

		PartDefinition cube_r167 = lefFace2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(25, 57).mirror().addBox(-0.3F, -0.2227F, -0.2527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4672F, 1.125F, -3.9893F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r168 = lefFace2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(40, 40).mirror().addBox(-1.4547F, -0.292F, 1.2502F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.8449F, -0.7587F, -2.9343F));

		PartDefinition cube_r169 = lefFace2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(5, 36).mirror().addBox(-1.5809F, -0.292F, -0.6771F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2576F, -0.5866F, -0.1448F));

		PartDefinition cube_r170 = lefFace2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(30, 36).mirror().addBox(-0.425F, -0.7F, 0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9738F, 0.8F, -0.5078F, 0.7418F, 0.48F, 0.0F));

		PartDefinition cube_r171 = lefFace2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(36, 52).mirror().addBox(-0.6F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.7684F, 1.0056F, -1.9684F, 0.1716F, -0.21F, 0.0022F));

		PartDefinition cube_r172 = lefFace2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(5, 40).mirror().addBox(-0.5F, -0.8F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7684F, 1.0056F, -1.9684F, 0.0844F, -0.21F, 0.0022F));

		PartDefinition cube_r173 = lefFace2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(39, 5).mirror().addBox(-0.2F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3672F, 0.425F, -0.7893F, 0.0F, 0.0873F, 0.0F));

		PartDefinition jaw = Head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4741F, -0.2871F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r174 = jaw.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(54, 42).mirror().addBox(-0.588F, 0.0808F, -2.4523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(41, 54).mirror().addBox(-0.588F, 0.1308F, -1.8523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(43, 9).mirror().addBox(-0.688F, 0.4308F, -2.2773F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.55F, -1.5761F, -0.6146F, -0.587F, -0.248F, 0.1814F));

		PartDefinition cube_r175 = jaw.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(43, 51).mirror().addBox(-0.225F, -0.925F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(58, 3).mirror().addBox(-0.325F, -0.525F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(57, 45).mirror().addBox(-0.325F, -0.525F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.3395F, -2.6729F, -3.8164F, -1.1159F, -0.6735F, 0.8848F));

		PartDefinition cube_r176 = jaw.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(54, 39).mirror().addBox(-0.8071F, 1.92F, -1.3922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(46, 54).mirror().addBox(-0.7071F, 1.52F, -1.7922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(54, 36).mirror().addBox(-0.8071F, 1.92F, -1.7922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-2.15F, -3.0761F, -0.6146F, -0.7893F, -0.3208F, 0.3266F));

		PartDefinition cube_r177 = jaw.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-0.2286F, -1.0328F, -0.8647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(45, 57).mirror().addBox(-0.3286F, -0.6328F, -0.8647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(40, 57).mirror().addBox(-0.3286F, -0.6328F, -0.7147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.9684F, -2.2234F, -3.4727F, -0.9038F, -0.5436F, 0.5494F));

		PartDefinition cube_r178 = jaw.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(19, 39).mirror().addBox(-0.688F, 0.7083F, -2.2198F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.55F, -1.5761F, -0.6146F, -0.7004F, -0.248F, 0.1814F));

		PartDefinition cube_r179 = jaw.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(25, 54).mirror().addBox(-0.5F, -1.307F, -0.5686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(20, 54).mirror().addBox(-0.5F, -1.307F, -0.9686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.8239F, -0.6146F, -0.4451F, 0.0089F, -0.015F));

		PartDefinition cube_r180 = jaw.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(41, 30).mirror().addBox(-0.5F, -1.1661F, -2.4785F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(41, 26).mirror().addBox(-0.5F, -1.4661F, -2.4785F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.8239F, -0.6146F, -0.6546F, 0.0089F, -0.015F));

		PartDefinition cube_r181 = jaw.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(37, 36).mirror().addBox(-0.5F, -1.2261F, -1.3553F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.8239F, -0.6146F, -0.9164F, 0.0089F, -0.015F));

		PartDefinition cube_r182 = jaw.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(54, 42).addBox(-0.412F, 0.0808F, -2.4523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(41, 54).addBox(-0.412F, 0.1308F, -1.8523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(43, 9).addBox(-0.312F, 0.4308F, -2.2773F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.55F, -1.5761F, -0.6146F, -0.587F, 0.248F, -0.1814F));

		PartDefinition cube_r183 = jaw.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(45, 63).addBox(-0.6512F, -0.8885F, -1.6941F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(40, 63).addBox(-0.6512F, -0.8885F, -1.1941F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4719F, -2.7028F, -3.7424F, -1.5226F, 0.9182F, -1.5258F));

		PartDefinition cube_r184 = jaw.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(47, 42).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5219F, -2.6367F, -3.7024F, -1.5767F, 0.9185F, -1.5815F));

		PartDefinition cube_r185 = jaw.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(43, 51).addBox(-0.775F, -0.925F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(58, 3).addBox(-0.675F, -0.525F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(57, 45).addBox(-0.675F, -0.525F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3395F, -2.6729F, -3.8164F, -1.1159F, 0.6735F, -0.8848F));

		PartDefinition cube_r186 = jaw.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(54, 39).addBox(-0.1929F, 1.92F, -1.3922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(46, 54).addBox(-0.2929F, 1.52F, -1.7922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(54, 36).addBox(-0.1929F, 1.92F, -1.7922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(1.15F, -3.0761F, -0.6146F, -0.7893F, 0.3208F, -0.3266F));

		PartDefinition cube_r187 = jaw.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(0, 41).addBox(-0.7714F, -1.0328F, -0.8647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(45, 57).addBox(-0.6714F, -0.6328F, -0.8647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(40, 57).addBox(-0.6714F, -0.6328F, -0.7147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9684F, -2.2234F, -3.4727F, -0.9038F, 0.5436F, -0.5494F));

		PartDefinition cube_r188 = jaw.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(19, 39).addBox(-0.312F, 0.7083F, -2.2198F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(1.55F, -1.5761F, -0.6146F, -0.7004F, 0.248F, -0.1814F));

		PartDefinition cube_r189 = jaw.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(25, 54).addBox(-0.5F, -1.307F, -0.5686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(20, 54).addBox(-0.5F, -1.307F, -0.9686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(1.5F, 0.8239F, -0.6146F, -0.4451F, -0.0089F, 0.015F));

		PartDefinition cube_r190 = jaw.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(41, 30).addBox(-0.5F, -1.1661F, -2.4785F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(41, 26).addBox(-0.5F, -1.4661F, -2.4785F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(1.5F, 0.8239F, -0.6146F, -0.6546F, -0.0089F, 0.015F));

		PartDefinition cube_r191 = jaw.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(37, 36).addBox(-0.5F, -1.2261F, -1.3553F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(1.5F, 0.8239F, -0.6146F, -0.9164F, -0.0089F, 0.015F));

		PartDefinition tail = main.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(12, 47).addBox(-0.5F, -0.4588F, 0.0042F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0945F, 8.1607F, 0.2531F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(5, 58).addBox(-0.5F, -0.3442F, 0.1913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.05F, 1.725F, 0.1745F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 68, 68);
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