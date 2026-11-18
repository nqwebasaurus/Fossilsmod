package fossils.fossils.client.blockentity.model.berthasaura;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BerthasauraFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart Bodyfront;
	private final ModelPart Neckbase;
	private final ModelPart Neckmiddlebase;
	private final ModelPart Neckmiddlefront;
	private final ModelPart Neckfront;
	private final ModelPart Neckfront2;
	private final ModelPart Neckfront3;
	private final ModelPart Head;
	private final ModelPart Lowerjawbase;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Rightupperarm;
	private final ModelPart Rightlowerarm;
	private final ModelPart Righthand;
	private final ModelPart Leftupperarm;
	private final ModelPart Leftlowerarm;
	private final ModelPart Lefthand;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart Tailbase;
	private final ModelPart Tailmiddlebase;
	private final ModelPart Tailmiddle;
	private final ModelPart Tailmiddleend;
	private final ModelPart Tailend;
	private final ModelPart Tailend2;
	private final ModelPart Tailend3;
	private final ModelPart Rightthigh;
	private final ModelPart Rightshin;
	private final ModelPart Rightankle;
	private final ModelPart Rightfoot;
	private final ModelPart Righttoes;
	private final ModelPart Righttoes2;
	private final ModelPart Righttoes3;
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart Leftankle;
	private final ModelPart Leftfoot;
	private final ModelPart Lefttoes;
	private final ModelPart Lefttoes2;
	private final ModelPart Lefttoes3;
	private final ModelPart bone2;
	private final ModelPart bone3;

	public BerthasauraFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body = this.Bodymiddle.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.Bodyfront = this.body2.getChild("Bodyfront");
		this.Neckbase = this.Bodyfront.getChild("Neckbase");
		this.Neckmiddlebase = this.Neckbase.getChild("Neckmiddlebase");
		this.Neckmiddlefront = this.Neckmiddlebase.getChild("Neckmiddlefront");
		this.Neckfront = this.Neckmiddlefront.getChild("Neckfront");
		this.Neckfront2 = this.Neckfront.getChild("Neckfront2");
		this.Neckfront3 = this.Neckfront2.getChild("Neckfront3");
		this.Head = this.Neckfront3.getChild("Head");
		this.Lowerjawbase = this.Head.getChild("Lowerjawbase");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Rightupperarm = this.Bodyfront.getChild("Rightupperarm");
		this.Rightlowerarm = this.Rightupperarm.getChild("Rightlowerarm");
		this.Righthand = this.Rightlowerarm.getChild("Righthand");
		this.Leftupperarm = this.Bodyfront.getChild("Leftupperarm");
		this.Leftlowerarm = this.Leftupperarm.getChild("Leftlowerarm");
		this.Lefthand = this.Leftlowerarm.getChild("Lefthand");
		this.bone = this.Bodyfront.getChild("bone");
		this.bone4 = this.Bodyfront.getChild("bone4");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.Tailmiddlebase = this.Tailbase.getChild("Tailmiddlebase");
		this.Tailmiddle = this.Tailmiddlebase.getChild("Tailmiddle");
		this.Tailmiddleend = this.Tailmiddle.getChild("Tailmiddleend");
		this.Tailend = this.Tailmiddleend.getChild("Tailend");
		this.Tailend2 = this.Tailend.getChild("Tailend2");
		this.Tailend3 = this.Tailend2.getChild("Tailend3");
		this.Rightthigh = this.Hips.getChild("Rightthigh");
		this.Rightshin = this.Rightthigh.getChild("Rightshin");
		this.Rightankle = this.Rightshin.getChild("Rightankle");
		this.Rightfoot = this.Rightankle.getChild("Rightfoot");
		this.Righttoes = this.Rightfoot.getChild("Righttoes");
		this.Righttoes2 = this.Rightankle.getChild("Righttoes2");
		this.Righttoes3 = this.Righttoes2.getChild("Righttoes3");
		this.Leftthigh = this.Hips.getChild("Leftthigh");
		this.Leftshin = this.Leftthigh.getChild("Leftshin");
		this.Leftankle = this.Leftshin.getChild("Leftankle");
		this.Leftfoot = this.Leftankle.getChild("Leftfoot");
		this.Lefttoes = this.Leftfoot.getChild("Lefttoes");
		this.Lefttoes2 = this.Leftankle.getChild("Lefttoes2");
		this.Lefttoes3 = this.Lefttoes2.getChild("Lefttoes3");
		this.bone2 = this.Hips.getChild("bone2");
		this.bone3 = this.Hips.getChild("bone3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.289F, -0.4366F, 0.0183F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 41).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7892F, -2.6168F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(23, 10).addBox(-0.5F, -0.5F, 1.9F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -5.9F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -4.0F, 0.0393F, -0.1308F, -0.0051F));

		PartDefinition cube_r3 = Bodymiddle.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(100, 0).addBox(0.0F, -0.7F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6149F, -0.3322F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Bodymiddle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(82, 80).mirror().addBox(-4.4376F, -1.7211F, -0.4492F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3356F, -4.4553F, -0.0348F, -0.1175F, -1.5162F));

		PartDefinition cube_r5 = Bodymiddle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(33, 58).mirror().addBox(-2.9716F, -0.2717F, -0.4492F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3356F, -4.4553F, -0.089F, -0.0844F, -0.9909F));

		PartDefinition cube_r6 = Bodymiddle.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(66, 37).mirror().addBox(-0.989F, 0.199F, -0.4492F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3356F, -4.4553F, -0.1175F, -0.0349F, -0.5214F));

		PartDefinition cube_r7 = Bodymiddle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(99, 49).mirror().addBox(-0.8777F, 0.0726F, -0.4171F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0783F, -2.5494F, -0.1967F, -0.0714F, -0.6394F));

		PartDefinition cube_r8 = Bodymiddle.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(27, 85).mirror().addBox(-2.815F, -0.3338F, -0.4171F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0783F, -2.5494F, -0.1435F, -0.1527F, -1.1067F));

		PartDefinition cube_r9 = Bodymiddle.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(99, 51).mirror().addBox(-3.271F, -1.6966F, -0.4171F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0783F, -2.5494F, -0.0474F, -0.2038F, -1.6364F));

		PartDefinition cube_r10 = Bodymiddle.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(85, 28).mirror().addBox(-2.8926F, -0.2651F, -0.5929F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0018F, -0.4433F, -0.18F, -0.2575F, -1.2524F));

		PartDefinition cube_r11 = Bodymiddle.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(99, 53).mirror().addBox(-0.9156F, 0.169F, -0.5929F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0018F, -0.4433F, -0.2764F, -0.1489F, -0.7838F));

		PartDefinition cube_r12 = Bodymiddle.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(99, 53).addBox(-0.0844F, 0.169F, -0.5929F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0018F, -0.4433F, -0.2764F, 0.1489F, 0.7838F));

		PartDefinition cube_r13 = Bodymiddle.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(85, 28).addBox(0.8926F, -0.2651F, -0.5929F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0018F, -0.4433F, -0.18F, 0.2575F, 1.2524F));

		PartDefinition cube_r14 = Bodymiddle.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(78, 99).addBox(0.0F, -0.3985F, -1.9864F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7513F, -0.8883F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r15 = Bodymiddle.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(24, 55).addBox(0.0F, -0.2107F, 4.0086F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4797F, -8.8601F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r16 = Bodymiddle.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(99, 51).addBox(2.271F, -1.6966F, -0.4171F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0783F, -2.5494F, -0.0474F, 0.2038F, 1.6364F));

		PartDefinition cube_r17 = Bodymiddle.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(27, 85).addBox(0.815F, -0.3338F, -0.4171F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0783F, -2.5494F, -0.1435F, 0.1527F, 1.1067F));

		PartDefinition cube_r18 = Bodymiddle.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(99, 49).addBox(-0.1223F, 0.0726F, -0.4171F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0783F, -2.5494F, -0.1967F, 0.0714F, 0.6394F));

		PartDefinition cube_r19 = Bodymiddle.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(66, 37).addBox(-0.011F, 0.199F, -0.4492F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3356F, -4.4553F, -0.1175F, 0.0349F, 0.5214F));

		PartDefinition cube_r20 = Bodymiddle.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(33, 58).addBox(0.9716F, -0.2717F, -0.4492F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3356F, -4.4553F, -0.089F, 0.0844F, 0.9909F));

		PartDefinition cube_r21 = Bodymiddle.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(82, 80).addBox(2.4377F, -1.7211F, -0.4492F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3356F, -4.4553F, -0.0348F, 0.1175F, 1.5162F));

		PartDefinition cube_r22 = Bodymiddle.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(36, 47).addBox(-0.5F, -0.5F, 5.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.6619F, -10.7266F, -0.0698F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.2504F, -4.8608F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 33).addBox(-2.0F, 0.961F, -4.2472F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 8.6022F, -1.6844F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(15, 48).addBox(-0.5F, -0.5F, 0.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, -0.4114F, -5.8658F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(35, 101).addBox(0.0F, -0.7529F, -0.0013F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6908F, -2.0321F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(32, 101).addBox(0.0F, -0.3705F, -0.0021F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2293F, -3.9993F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(20, 83).mirror().addBox(-1.5107F, 0.1251F, -0.6008F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4F, -3.4F, -0.0171F, -0.0043F, -0.4363F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(27, 83).mirror().addBox(-3.4028F, -0.5744F, -0.6008F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4F, -3.4F, -0.0133F, -0.0115F, -0.9075F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(62, 14).mirror().addBox(-6.6597F, -2.1988F, -0.6008F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4F, -3.4F, -0.0057F, -0.0166F, -1.4311F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 73).mirror().addBox(-0.9889F, 0.1612F, -0.6329F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2426F, -1.3962F, -0.0996F, -0.0326F, -0.4173F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(83, 36).mirror().addBox(-2.9543F, -0.3053F, -0.6329F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2426F, -1.3962F, -0.074F, -0.0743F, -0.8875F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(58, 74).mirror().addBox(-5.4058F, -1.7416F, -0.6329F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2426F, -1.3962F, -0.0269F, -0.1013F, -1.4124F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(58, 74).addBox(2.4058F, -1.7416F, -0.6329F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2426F, -1.3962F, -0.0269F, 0.1013F, 1.4124F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(83, 36).addBox(0.9543F, -0.3053F, -0.6329F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2426F, -1.3962F, -0.074F, 0.0743F, 0.8875F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 73).addBox(-0.0111F, 0.1612F, -0.6329F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2426F, -1.3962F, -0.0996F, 0.0326F, 0.4173F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(62, 14).addBox(2.6597F, -2.1988F, -0.6008F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.4F, -0.0057F, 0.0166F, 1.4311F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(27, 83).addBox(1.4028F, -0.5744F, -0.6008F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.4F, -0.0133F, 0.0115F, 0.9075F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(20, 83).addBox(-0.4893F, 0.1251F, -0.6008F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.4F, -0.0171F, 0.0043F, 0.4363F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(55, 28).addBox(-2.4531F, -0.3537F, -3.8651F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(63, 99).addBox(-1.9531F, -0.9956F, -2.7827F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 99).addBox(-1.9531F, -1.0758F, -0.7814F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4531F, -0.4804F, -5.0607F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r39 = body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(83, 38).mirror().addBox(-1.4652F, 0.0156F, -0.5679F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4531F, 0.0755F, -2.1942F, 0.1273F, 0.0575F, -0.4327F));

		PartDefinition cube_r40 = body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(83, 40).mirror().addBox(-3.3126F, -0.6513F, -0.5679F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4531F, 0.0755F, -2.1942F, 0.0875F, 0.109F, -0.9029F));

		PartDefinition cube_r41 = body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(42, 28).mirror().addBox(-7.5432F, -2.2203F, -0.5679F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4531F, 0.0755F, -2.1942F, 0.0211F, 0.1381F, -1.4298F));

		PartDefinition cube_r42 = body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(83, 42).mirror().addBox(-1.4737F, 0.0246F, -0.6654F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4531F, -0.072F, -0.1007F, 0.049F, 0.0185F, -0.4184F));

		PartDefinition cube_r43 = body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(83, 44).mirror().addBox(-3.3242F, -0.6472F, -0.6654F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4531F, -0.072F, -0.1007F, 0.0353F, 0.0387F, -0.8894F));

		PartDefinition cube_r44 = body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(53, 45).mirror().addBox(-7.5553F, -2.2226F, -0.6654F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4531F, -0.072F, -0.1007F, 0.0112F, 0.0511F, -1.4134F));

		PartDefinition cube_r45 = body2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(53, 45).addBox(2.5553F, -2.2226F, -0.6654F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4531F, -0.072F, -0.1007F, 0.0112F, -0.0511F, 1.4134F));

		PartDefinition cube_r46 = body2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(83, 44).addBox(1.3242F, -0.6472F, -0.6654F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4531F, -0.072F, -0.1007F, 0.0353F, -0.0387F, 0.8894F));

		PartDefinition cube_r47 = body2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(83, 42).addBox(-0.5263F, 0.0246F, -0.6654F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4531F, -0.072F, -0.1007F, 0.049F, -0.0185F, 0.4184F));

		PartDefinition cube_r48 = body2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(42, 28).addBox(2.5432F, -2.2203F, -0.5679F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4531F, 0.0755F, -2.1942F, 0.0211F, -0.1381F, 1.4298F));

		PartDefinition cube_r49 = body2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(83, 40).addBox(1.3126F, -0.6513F, -0.5679F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4531F, 0.0755F, -2.1942F, 0.0875F, -0.109F, 0.9029F));

		PartDefinition cube_r50 = body2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(83, 38).addBox(-0.5348F, 0.0156F, -0.5679F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4531F, 0.0755F, -2.1942F, 0.1273F, -0.0575F, 0.4327F));

		PartDefinition cube_r51 = body2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(36, 39).mirror().addBox(-1.5F, -1.2F, -1.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9531F, 9.1649F, -5.089F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body2.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(49, 47).addBox(-0.5F, -0.6F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(99, 72).addBox(0.0F, -1.1829F, -4.954F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9531F, 0.2309F, -3.7428F, 0.1499F, 0.0431F, 0.0065F));

		PartDefinition cube_r52 = Bodyfront.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(18, 75).mirror().addBox(-2.4901F, 0.7138F, 2.949F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.9F, -8.1F, -0.4289F, 0.4339F, 1.1632F));

		PartDefinition cube_r53 = Bodyfront.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(62, 16).mirror().addBox(-3.6F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4262F, 6.172F, -5.2494F, -0.3136F, 0.8656F, 1.1325F));

		PartDefinition cube_r54 = Bodyfront.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(57, 20).mirror().addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3448F, 6.7906F, -4.9196F, -0.4123F, 0.9851F, 0.8079F));

		PartDefinition cube_r55 = Bodyfront.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(42, 26).mirror().addBox(-5.9F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3695F, 6.8253F, -4.8866F, -0.7863F, 1.1854F, 0.2968F));

		PartDefinition cube_r56 = Bodyfront.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(42, 60).mirror().addBox(-2.4093F, -1.1441F, 0.9904F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.9F, -8.1F, -0.8959F, 0.1945F, -0.237F));

		PartDefinition cube_r57 = Bodyfront.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(41, 75).mirror().addBox(-5.2943F, -1.6923F, -0.2809F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1111F, -2.5486F, 0.0624F, 0.2562F, -1.3662F));

		PartDefinition cube_r58 = Bodyfront.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(83, 60).mirror().addBox(-2.8331F, -0.3184F, -0.2809F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1111F, -2.5486F, 0.1833F, 0.1905F, -0.8331F));

		PartDefinition cube_r59 = Bodyfront.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(21, 77).mirror().addBox(-0.8868F, 0.0945F, -0.2809F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1111F, -2.5486F, 0.2489F, 0.0875F, -0.3685F));

		PartDefinition cube_r60 = Bodyfront.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(97, 87).mirror().addBox(-0.8895F, 0.0874F, -0.4079F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1111F, -4.3486F, 0.4035F, 0.1711F, -0.5056F));

		PartDefinition cube_r61 = Bodyfront.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(20, 85).mirror().addBox(-2.8323F, -0.3259F, -0.4079F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1111F, -4.3486F, 0.287F, 0.3335F, -0.9632F));

		PartDefinition cube_r62 = Bodyfront.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(85, 22).mirror().addBox(-4.2898F, -1.6984F, -0.4079F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1111F, -4.3486F, 0.0748F, 0.4304F, -1.5191F));

		PartDefinition cube_r63 = Bodyfront.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(62, 18).mirror().addBox(-6.4356F, -2.2322F, -0.4305F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0579F, -0.4381F, 0.0137F, 0.0862F, -1.448F));

		PartDefinition cube_r64 = Bodyfront.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(85, 24).mirror().addBox(-1.4166F, -0.0811F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0579F, -0.4381F, 0.0798F, 0.0355F, -0.4524F));

		PartDefinition cube_r65 = Bodyfront.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(85, 26).mirror().addBox(-3.2254F, -0.7154F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0579F, -0.4381F, 0.055F, 0.0678F, -0.9232F));

		PartDefinition cube_r66 = Bodyfront.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(85, 26).addBox(1.2254F, -0.7154F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0579F, -0.4381F, 0.055F, -0.0678F, 0.9232F));

		PartDefinition cube_r67 = Bodyfront.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(85, 24).addBox(-0.5834F, -0.0811F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0579F, -0.4381F, 0.0798F, -0.0355F, 0.4524F));

		PartDefinition cube_r68 = Bodyfront.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(62, 18).addBox(2.4356F, -2.2322F, -0.4305F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0579F, -0.4381F, 0.0137F, -0.0862F, 1.448F));

		PartDefinition cube_r69 = Bodyfront.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(85, 22).addBox(2.2898F, -1.6984F, -0.4079F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1111F, -4.3486F, 0.0748F, -0.4304F, 1.5191F));

		PartDefinition cube_r70 = Bodyfront.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(20, 85).addBox(0.8322F, -0.3259F, -0.4079F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1111F, -4.3486F, 0.287F, -0.3335F, 0.9632F));

		PartDefinition cube_r71 = Bodyfront.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(97, 87).addBox(-0.1105F, 0.0874F, -0.4079F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1111F, -4.3486F, 0.4035F, -0.1711F, 0.5056F));

		PartDefinition cube_r72 = Bodyfront.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(21, 77).addBox(-0.1132F, 0.0945F, -0.2809F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1111F, -2.5486F, 0.2489F, -0.0875F, 0.3685F));

		PartDefinition cube_r73 = Bodyfront.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(83, 60).addBox(0.8331F, -0.3184F, -0.2809F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1111F, -2.5486F, 0.1833F, -0.1905F, 0.8331F));

		PartDefinition cube_r74 = Bodyfront.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(41, 75).addBox(2.2943F, -1.6923F, -0.2809F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1111F, -2.5486F, 0.0624F, -0.2562F, 1.3662F));

		PartDefinition cube_r75 = Bodyfront.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(99, 75).addBox(0.0F, -0.6F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5074F, -0.9301F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r76 = Bodyfront.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(26, 100).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.612F, -2.9274F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r77 = Bodyfront.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(42, 60).addBox(1.4093F, -1.1441F, 0.9904F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 3.9F, -8.1F, -0.8959F, -0.1945F, 0.237F));

		PartDefinition cube_r78 = Bodyfront.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(28, 54).addBox(-2.0F, -1.1441F, -0.331F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 56).addBox(-1.0F, -1.1441F, 1.669F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.9F, -8.1F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r79 = Bodyfront.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(42, 26).addBox(-0.1F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3695F, 6.8253F, -4.8866F, -0.7863F, -1.1854F, -0.2968F));

		PartDefinition cube_r80 = Bodyfront.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(57, 20).addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3448F, 6.7906F, -4.9196F, -0.4123F, -0.9851F, -0.8079F));

		PartDefinition cube_r81 = Bodyfront.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(62, 16).addBox(-0.4F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4262F, 6.172F, -5.2494F, -0.3136F, -0.8656F, -1.1325F));

		PartDefinition cube_r82 = Bodyfront.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(18, 75).addBox(-0.5099F, 0.7138F, 2.949F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.9F, -8.1F, -0.4289F, -0.4339F, -1.1632F));

		PartDefinition Neckbase = Bodyfront.addOrReplaceChild("Neckbase", CubeListBuilder.create().texOffs(78, 0).addBox(-0.5F, -0.5724F, -1.8378F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(23, 100).addBox(0.0F, -1.1725F, -1.8378F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.097F, -0.3283F, 0.0F, 0.0F));

		PartDefinition cube_r83 = Neckbase.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(9, 75).mirror().addBox(-4.8405F, -0.9339F, -0.42F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0132F, -1.5993F, 0.197F, 0.6885F, -1.3475F));

		PartDefinition cube_r84 = Neckbase.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(83, 58).mirror().addBox(-2.0638F, 0.0034F, -0.42F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0132F, -1.5993F, 0.5096F, 0.5208F, -0.8086F));

		PartDefinition cube_r85 = Neckbase.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(83, 58).addBox(0.0638F, 0.0034F, -0.42F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0132F, -1.5993F, 0.5096F, -0.5208F, 0.8086F));

		PartDefinition cube_r86 = Neckbase.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(9, 75).addBox(1.8405F, -0.9339F, -0.42F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0132F, -1.5993F, 0.197F, -0.6885F, 1.3475F));

		PartDefinition Neckmiddlebase = Neckbase.addOrReplaceChild("Neckmiddlebase", CubeListBuilder.create().texOffs(77, 76).addBox(-0.5F, -0.3703F, -1.9737F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(38, 101).addBox(0.0F, -0.9703F, -1.9737F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1341F, -1.541F, -0.2073F, 0.2827F, 0.1374F));

		PartDefinition cube_r87 = Neckmiddlebase.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(45, 83).mirror().addBox(-1.9494F, -0.0552F, -0.56F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2443F, -1.5552F, 0.5528F, 1.0255F, -0.8789F));

		PartDefinition cube_r88 = Neckmiddlebase.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(12, 73).mirror().addBox(-2.7119F, -0.9342F, -0.56F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2443F, -1.5552F, -0.3183F, 1.0874F, -1.8603F));

		PartDefinition cube_r89 = Neckmiddlebase.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(12, 73).addBox(1.7119F, -0.9342F, -0.56F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2443F, -1.5552F, -0.3183F, -1.0874F, 1.8603F));

		PartDefinition cube_r90 = Neckmiddlebase.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(45, 83).addBox(-0.0506F, -0.0552F, -0.56F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2443F, -1.5552F, 0.5528F, -1.0255F, 0.8789F));

		PartDefinition Neckmiddlefront = Neckmiddlebase.addOrReplaceChild("Neckmiddlefront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4561F, -1.9237F, -0.0813F, 0.0F, 0.0F));

		PartDefinition cube_r91 = Neckmiddlefront.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(41, 101).addBox(0.0F, -0.7725F, 3.9084F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 71).addBox(-0.5F, -0.4725F, 3.9084F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.9295F, -5.8842F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r92 = Neckmiddlefront.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-2.9614F, 0.0297F, -0.4167F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.546F, -0.1826F, -1.8635F, 0.3154F, 1.2107F, -1.2015F));

		PartDefinition cube_r93 = Neckmiddlefront.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(0, 75).addBox(-0.0386F, 0.0297F, -0.4167F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.546F, -0.1826F, -1.8635F, 0.3154F, -1.2107F, 1.2015F));

		PartDefinition Neckfront = Neckmiddlefront.addOrReplaceChild("Neckfront", CubeListBuilder.create().texOffs(80, 12).addBox(-0.49F, 0.0117F, -1.994F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F))
				.texOffs(101, 58).addBox(0.01F, -0.2883F, -1.994F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -1.0102F, -1.7894F, -0.2823F, 0.1336F, 0.1423F));

		PartDefinition cube_r94 = Neckfront.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(77, 56).mirror().addBox(-2.6883F, -0.0703F, -0.6883F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.6386F, -1.633F, 0.5277F, 1.3306F, -0.9459F));

		PartDefinition cube_r95 = Neckfront.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(77, 56).addBox(-0.3117F, -0.0703F, -0.6883F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.6386F, -1.633F, 0.5277F, -1.3306F, 0.9459F));

		PartDefinition Neckfront2 = Neckfront.addOrReplaceChild("Neckfront2", CubeListBuilder.create().texOffs(79, 67).addBox(-0.49F, -0.0383F, -1.994F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(101, 61).addBox(0.01F, -0.2383F, -1.994F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.038F, -2.0003F, 0.05F, 0.1307F, 0.0065F));

		PartDefinition cube_r96 = Neckfront2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(80, 16).mirror().addBox(-3.027F, -0.0163F, -0.4842F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.7752F, -1.8339F, 0.4298F, 1.3228F, -1.0697F));

		PartDefinition cube_r97 = Neckfront2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(80, 16).addBox(0.027F, -0.0163F, -0.4842F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.7752F, -1.8339F, 0.4298F, -1.3228F, 1.0697F));

		PartDefinition Neckfront3 = Neckfront2.addOrReplaceChild("Neckfront3", CubeListBuilder.create().texOffs(9, 61).addBox(-0.49F, -0.0133F, -3.019F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F))
				.texOffs(56, 101).addBox(0.01F, -0.2133F, -2.019F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0183F, -1.9672F, 0.3114F, 0.0F, 0.0F));

		PartDefinition cube_r98 = Neckfront3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(83, 46).mirror().addBox(-1.953F, -0.0097F, -0.6852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.6475F, -1.2248F, 0.415F, 1.3747F, -1.1156F));

		PartDefinition cube_r99 = Neckfront3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(83, 46).addBox(-0.047F, -0.0097F, -0.6852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.6475F, -1.2248F, 0.415F, -1.3747F, 1.1156F));

		PartDefinition Head = Neckfront3.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 0.3198F, -2.0955F, 0.2855F, 0.2993F, -0.095F));

		PartDefinition cube_r100 = Head.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(18, 64).addBox(-1.0F, -3.5F, 0.1F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.3851F, -0.8419F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r101 = Head.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(95, 34).addBox(-0.5F, -0.3557F, -0.3296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(30, 95).addBox(-0.5F, -0.3557F, -0.2296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, 2.6601F, -8.3835F, 1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r102 = Head.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(90, 34).addBox(-0.5F, -0.4557F, 0.0812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 2.6601F, -8.3835F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r103 = Head.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(90, 19).addBox(-0.5F, -0.615F, 0.458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 2.6601F, -8.3835F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r104 = Head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(58, 70).addBox(0.0F, -0.9F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 0.9818F, -7.7643F, 2.618F, 0.0F, 0.0F));

		PartDefinition cube_r105 = Head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(18, 61).addBox(0.0F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 1.217F, -6.6576F, -2.5656F, 0.0F, 0.0F));

		PartDefinition cube_r106 = Head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(58, 65).addBox(0.0F, -1.9F, -0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, -0.1183F, -6.3987F, -2.3911F, 0.0F, 0.0F));

		PartDefinition cube_r107 = Head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(65, 70).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.6639F, -5.8136F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r108 = Head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(62, 47).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.1503F, -4.8056F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r109 = Head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(80, 33).addBox(-1.0F, -0.1F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.4629F, -4.0692F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r110 = Head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(66, 32).addBox(-1.0F, -0.1F, -0.9F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.526F, -3.6822F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r111 = Head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(0, 50).addBox(-1.0F, -0.9F, -3.9F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.7996F, -2.9305F, 1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r112 = Head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(76, 36).addBox(-1.0F, -1.9F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.7473F, -2.3328F, 3.0543F, 0.0F, 0.0F));

		PartDefinition cube_r113 = Head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(50, 75).addBox(-0.5F, -1.275F, -0.15F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, -1.4412F, -1.5937F, -1.9635F, 0.0F, 0.0F));

		PartDefinition cube_r114 = Head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(91, 69).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.8347F, -1.7322F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r115 = Head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(85, 91).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.4926F, -0.7925F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r116 = Head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(63, 53).addBox(-0.5F, -1.475F, -1.05F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.3458F, -1.3695F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r117 = Head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(41, 54).addBox(-0.5F, -1.075F, -1.75F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, -0.0723F, -0.2522F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase = Head.addOrReplaceChild("Lowerjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.994F, -0.0371F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r118 = Lowerjawbase.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(89, 51).mirror().addBox(-0.3F, -0.525F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.4F, 0.6F, 0.5236F, -0.0524F, 0.0F));

		PartDefinition cube_r119 = Lowerjawbase.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(0, 77).mirror().addBox(0.0768F, -0.6462F, -0.5406F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.4845F, 1.4833F, -0.2357F, 0.2649F, -0.2789F, -0.1465F));

		PartDefinition cube_r120 = Lowerjawbase.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(7, 77).mirror().addBox(-0.5F, -0.6F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.2625F, 1.1247F, 0.8865F, 0.6873F, -0.1931F, -0.029F));

		PartDefinition cube_r121 = Lowerjawbase.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(95, 37).mirror().addBox(-0.5F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(40, 95).mirror().addBox(-0.5F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.4625F, 0.3688F, 1.7968F, 1.1297F, -0.1626F, -0.1086F));

		PartDefinition cube_r122 = Lowerjawbase.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(78, 96).mirror().addBox(-0.3F, -1.2069F, -0.37F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.4F, 0.6F, -0.7418F, -0.0524F, 0.0F));

		PartDefinition cube_r123 = Lowerjawbase.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(90, 91).mirror().addBox(-0.3F, -0.3119F, -0.5226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.243F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.4F, 0.6F, -1.0036F, -0.0524F, 0.0F));

		PartDefinition cube_r124 = Lowerjawbase.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(92, 12).mirror().addBox(-0.3F, -0.4853F, -1.1666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.4F, 0.6F, 0.48F, -0.0524F, 0.0F));

		PartDefinition cube_r125 = Lowerjawbase.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(92, 22).mirror().addBox(-0.3F, -1.64F, -0.5936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.4F, 0.6F, 1.9635F, -0.0524F, 0.0F));

		PartDefinition cube_r126 = Lowerjawbase.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(89, 54).mirror().addBox(-0.3F, -0.6539F, 1.1237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.4F, 0.6F, -2.7925F, -0.0524F, 0.0F));

		PartDefinition cube_r127 = Lowerjawbase.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(76, 40).mirror().addBox(-0.3F, 1.6043F, -1.2647F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.243F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.4F, 0.6F, -1.2654F, -0.0524F, 0.0F));

		PartDefinition cube_r128 = Lowerjawbase.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(49, 85).mirror().addBox(-0.3F, -0.9616F, -3.0208F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.24F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.4F, 0.6F, 0.1745F, -0.0524F, 0.0F));

		PartDefinition cube_r129 = Lowerjawbase.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(92, 25).mirror().addBox(-0.3F, -0.447F, -0.7871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.4F, 0.6F, -0.8727F, -0.0524F, 0.0F));

		PartDefinition cube_r130 = Lowerjawbase.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(92, 28).mirror().addBox(-0.3F, 0.074F, -0.5953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(76, 44).mirror().addBox(-0.3F, 2.1534F, -1.1675F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(45, 95).mirror().addBox(-0.3F, 0.574F, -0.3953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.243F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.4F, 0.6F, -1.5708F, -0.0524F, 0.0F));

		PartDefinition cube_r131 = Lowerjawbase.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(95, 43).mirror().addBox(-0.3F, 0.3453F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.4F, 0.6F, -2.0071F, -0.0524F, 0.0F));

		PartDefinition cube_r132 = Lowerjawbase.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(86, 62).mirror().addBox(-0.3F, -1.5798F, 0.8346F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.246F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.4F, 0.6F, 2.7925F, -0.0524F, 0.0F));

		PartDefinition cube_r133 = Lowerjawbase.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(48, 79).mirror().addBox(-0.3F, -2.3256F, -1.5109F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.4F, 0.6F, 1.2654F, -0.0524F, 0.0F));

		PartDefinition cube_r134 = Lowerjawbase.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(54, 85).mirror().addBox(-0.3F, -0.8459F, -2.7526F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.246F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.4F, 0.6F, -0.1309F, -0.0524F, 0.0F));

		PartDefinition cube_r135 = Lowerjawbase.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(59, 85).mirror().addBox(-0.3F, -0.7568F, 2.6284F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.24F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.4F, 0.6F, -3.1154F, -0.0524F, 0.0F));

		PartDefinition cube_r136 = Lowerjawbase.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(77, 48).mirror().addBox(-0.2022F, -0.8301F, -0.8432F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-1.625F, 0.4F, -2.7F, 1.597F, -0.1222F, 0.0F));

		PartDefinition cube_r137 = Lowerjawbase.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(30, 92).mirror().addBox(-0.2022F, -1.1813F, -1.29F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)).mirror(false)
				.texOffs(73, 92).mirror().addBox(-0.2022F, 0.6844F, -1.7846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(95, 3).mirror().addBox(-0.1772F, 0.2387F, -1.9438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.625F, 0.4F, -2.7F, 0.0698F, -0.1222F, 0.0F));

		PartDefinition cube_r138 = Lowerjawbase.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(92, 31).mirror().addBox(-0.2022F, 0.7049F, -1.2684F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(95, 0).mirror().addBox(-0.1772F, 0.4299F, 0.1351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.625F, 0.4F, -2.7F, -1.4137F, -0.1222F, 0.0F));

		PartDefinition cube_r139 = Lowerjawbase.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(55, 89).mirror().addBox(-0.2022F, 0.2683F, 1.2049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)).mirror(false)
				.texOffs(70, 86).mirror().addBox(-0.2022F, -1.6106F, -0.0938F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(95, 15).mirror().addBox(-0.1772F, -0.1034F, 0.6989F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.625F, 0.4F, -2.7F, -2.9845F, -0.1222F, 0.0F));

		PartDefinition cube_r140 = Lowerjawbase.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(86, 66).mirror().addBox(-0.2066F, -1.6835F, -0.0492F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-1.375F, 0.4F, -4.7F, 1.7715F, -0.2443F, 0.0F));

		PartDefinition cube_r141 = Lowerjawbase.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(35, 92).mirror().addBox(-0.2066F, -0.1749F, 1.1955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-1.375F, 0.4F, -4.7F, -3.0281F, -0.2443F, 0.0F));

		PartDefinition cube_r142 = Lowerjawbase.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(87, 82).mirror().addBox(-0.2066F, -2.3815F, 0.4558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)).mirror(false), PartPose.offsetAndRotation(-1.375F, 0.4F, -4.7F, 2.0333F, -0.2443F, 0.0F));

		PartDefinition cube_r143 = Lowerjawbase.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(89, 74).mirror().addBox(-0.2066F, 0.1716F, 1.9554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-1.375F, 0.4F, -4.7F, -2.81F, -0.2443F, 0.0F));

		PartDefinition cube_r144 = Lowerjawbase.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(40, 92).mirror().addBox(-0.2066F, 2.4569F, -0.3385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(95, 9).mirror().addBox(-0.1816F, 0.5117F, -0.2545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.375F, 0.4F, -4.7F, -1.5446F, -0.2443F, 0.0F));

		PartDefinition cube_r145 = Lowerjawbase.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(50, 95).mirror().addBox(-0.2066F, 0.8758F, 2.0447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)).mirror(false), PartPose.offsetAndRotation(-1.375F, 0.4F, -4.7F, -2.4609F, -0.2443F, 0.0F));

		PartDefinition cube_r146 = Lowerjawbase.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(97, 12).mirror().addBox(-0.2066F, -2.1074F, 1.6224F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(10, 90).mirror().addBox(-0.1816F, -1.3612F, -0.3765F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.375F, 0.4F, -4.7F, 2.7751F, -0.2443F, 0.0F));

		PartDefinition cube_r147 = Lowerjawbase.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(45, 92).mirror().addBox(-0.2066F, -2.8662F, -0.5837F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.243F)).mirror(false), PartPose.offsetAndRotation(-1.375F, 0.4F, -4.7F, 1.8588F, -0.2443F, 0.0F));

		PartDefinition cube_r148 = Lowerjawbase.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(73, 24).mirror().addBox(-0.2066F, -0.7207F, 1.052F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.375F, 0.4F, -4.7F, -3.0718F, -0.2443F, 0.0F));

		PartDefinition cube_r149 = Lowerjawbase.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(77, 52).mirror().addBox(-0.2066F, 0.5081F, -0.1881F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.24F)).mirror(false), PartPose.offsetAndRotation(-1.375F, 0.4F, -4.7F, -1.9809F, -0.2443F, 0.0F));

		PartDefinition cube_r150 = Lowerjawbase.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(55, 95).mirror().addBox(-0.2066F, 0.8439F, -0.9611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-1.375F, 0.4F, -4.7F, -0.4538F, -0.2443F, 0.0F));

		PartDefinition cube_r151 = Lowerjawbase.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(50, 92).mirror().addBox(-0.2066F, -0.3327F, 0.8027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)).mirror(false), PartPose.offsetAndRotation(-1.375F, 0.4F, -4.7F, -1.8937F, -0.2443F, 0.0F));

		PartDefinition cube_r152 = Lowerjawbase.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(55, 92).mirror().addBox(-0.2066F, -1.7712F, -0.428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(97, 21).mirror().addBox(-0.2066F, -1.3175F, 1.2954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-1.375F, 0.4F, -4.7F, 3.0805F, -0.2443F, 0.0F));

		PartDefinition cube_r153 = Lowerjawbase.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(20, 97).mirror().addBox(-0.2022F, -2.1538F, -1.8127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)).mirror(false), PartPose.offsetAndRotation(-1.625F, 0.4F, -2.7F, 1.5533F, -0.1222F, 0.0F));

		PartDefinition cube_r154 = Lowerjawbase.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(95, 57).mirror().addBox(-0.2022F, 0.3462F, 0.6379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)).mirror(false), PartPose.offsetAndRotation(-1.625F, 0.4F, -2.7F, -1.4573F, -0.1222F, 0.0F));

		PartDefinition cube_r155 = Lowerjawbase.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(57, 76).mirror().addBox(-0.3F, -3.6722F, -1.0646F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.24F)).mirror(false)
				.texOffs(76, 59).mirror().addBox(-0.3F, -3.4722F, -1.0646F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.4F, 0.6F, 1.7366F, -0.0524F, 0.0F));

		PartDefinition cube_r156 = Lowerjawbase.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(87, 30).mirror().addBox(-0.1772F, -2.3218F, -0.5802F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false)
				.texOffs(35, 98).mirror().addBox(-0.1772F, -0.7218F, -0.5802F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.625F, 0.4F, -2.7F, 1.7802F, -0.1222F, 0.0F));

		PartDefinition cube_r157 = Lowerjawbase.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(87, 85).mirror().addBox(-0.275F, -0.2337F, 2.5399F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.4F, 0.6F, 3.1329F, -0.0524F, 0.0F));

		PartDefinition cube_r158 = Lowerjawbase.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(5, 90).mirror().addBox(-0.275F, 1.962F, -0.6463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.4F, 0.6F, -1.6232F, -0.0524F, 0.0F));

		PartDefinition cube_r159 = Lowerjawbase.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(93, 94).mirror().addBox(-0.275F, 0.9316F, -2.0955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.4F, 0.6F, -0.7941F, -0.0524F, 0.0F));

		PartDefinition cube_r160 = Lowerjawbase.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(90, 6).mirror().addBox(-0.275F, -1.69F, -2.7709F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.4F, 0.6F, 0.5585F, -0.0524F, 0.0F));

		PartDefinition cube_r161 = Lowerjawbase.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(90, 9).mirror().addBox(-0.275F, -3.4698F, 0.3235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.4F, 0.6F, 1.9897F, -0.0524F, 0.0F));

		PartDefinition cube_r162 = Lowerjawbase.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(35, 89).mirror().addBox(-0.1772F, -1.0449F, -0.0534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.625F, 0.4F, -2.7F, -2.8536F, -0.1222F, 0.0F));

		PartDefinition cube_r163 = Lowerjawbase.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(40, 98).mirror().addBox(-0.2F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.3998F, 1.2579F, -4.3466F, 1.5533F, -0.1571F, 0.0006F));

		PartDefinition cube_r164 = Lowerjawbase.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(95, 6).mirror().addBox(-0.1816F, -0.0915F, 0.4313F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-1.375F, 0.4F, -4.7F, -2.1991F, -0.2443F, 0.0F));

		PartDefinition cube_r165 = Lowerjawbase.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(40, 89).mirror().addBox(-0.1816F, 0.4139F, -0.6998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.375F, 0.4F, -4.7F, -1.1956F, -0.2443F, 0.0F));

		PartDefinition cube_r166 = Lowerjawbase.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(45, 89).mirror().addBox(-0.1816F, -0.5856F, -0.8914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.375F, 0.4F, -4.7F, 0.2007F, -0.2443F, 0.0F));

		PartDefinition cube_r167 = Lowerjawbase.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(60, 96).mirror().addBox(-0.1772F, -2.2989F, -0.1034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.625F, 0.4F, -2.7F, 1.7279F, -0.1222F, 0.0F));

		PartDefinition cube_r168 = Lowerjawbase.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(89, 48).mirror().addBox(-0.1772F, 0.148F, -0.8281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.625F, 0.4F, -2.7F, -1.4879F, -0.1222F, 0.0F));

		PartDefinition cube_r169 = Lowerjawbase.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(50, 89).mirror().addBox(-0.1772F, -0.6406F, -0.2049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.625F, 0.4F, -2.7F, 1.5621F, -0.1222F, 0.0F));

		PartDefinition cube_r170 = Lowerjawbase.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(95, 18).mirror().addBox(-0.1816F, -0.9503F, -0.9993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.375F, 0.4F, -4.7F, 1.7802F, -0.2443F, 0.0F));

		PartDefinition cube_r171 = Lowerjawbase.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(15, 90).mirror().addBox(-0.275F, -3.5491F, 0.1058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.4F, 0.6F, 1.7802F, -0.0524F, 0.0F));

		PartDefinition cube_r172 = Lowerjawbase.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(92, 80).mirror().addBox(-0.25F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(92, 83).mirror().addBox(-0.1F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.243F)).mirror(false), PartPose.offsetAndRotation(-0.5599F, 0.8953F, -7.7897F, -1.5419F, 0.4972F, 0.0201F));

		PartDefinition cube_r173 = Lowerjawbase.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(92, 86).mirror().addBox(-0.25F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(0, 93).mirror().addBox(-0.1F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.5599F, 0.8953F, -7.7897F, -2.1964F, 0.4972F, 0.0201F));

		PartDefinition cube_r174 = Lowerjawbase.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(40, 95).addBox(-0.5F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(95, 37).addBox(-0.5F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.4625F, 0.3688F, 1.7968F, 1.1297F, 0.1626F, 0.1086F));

		PartDefinition cube_r175 = Lowerjawbase.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(7, 77).addBox(-0.5F, -0.6F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.2625F, 1.1247F, 0.8865F, 0.6873F, 0.1931F, 0.029F));

		PartDefinition cube_r176 = Lowerjawbase.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(0, 77).addBox(-1.0768F, -0.6462F, -0.5406F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.4845F, 1.4833F, -0.2357F, 0.2649F, 0.2789F, 0.1465F));

		PartDefinition cube_r177 = Lowerjawbase.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(78, 96).addBox(-0.7F, -1.2069F, -0.37F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(1.7F, 0.4F, 0.6F, -0.7418F, 0.0524F, 0.0F));

		PartDefinition cube_r178 = Lowerjawbase.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(49, 85).addBox(-0.7F, -0.9616F, -3.0208F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(1.7F, 0.4F, 0.6F, 0.1745F, 0.0524F, 0.0F));

		PartDefinition cube_r179 = Lowerjawbase.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(76, 40).addBox(-0.7F, 1.6043F, -1.2647F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.243F)), PartPose.offsetAndRotation(1.7F, 0.4F, 0.6F, -1.2654F, 0.0524F, 0.0F));

		PartDefinition cube_r180 = Lowerjawbase.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(89, 54).addBox(-0.7F, -0.6539F, 1.1237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(1.7F, 0.4F, 0.6F, -2.7925F, 0.0524F, 0.0F));

		PartDefinition cube_r181 = Lowerjawbase.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(92, 22).addBox(-0.7F, -1.64F, -0.5936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(1.7F, 0.4F, 0.6F, 1.9635F, 0.0524F, 0.0F));

		PartDefinition cube_r182 = Lowerjawbase.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(92, 12).addBox(-0.7F, -0.4853F, -1.1666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(1.7F, 0.4F, 0.6F, 0.48F, 0.0524F, 0.0F));

		PartDefinition cube_r183 = Lowerjawbase.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(76, 59).addBox(-0.7F, -3.4722F, -1.0646F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.248F))
				.texOffs(57, 76).addBox(-0.7F, -3.6722F, -1.0646F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(1.7F, 0.4F, 0.6F, 1.7366F, 0.0524F, 0.0F));

		PartDefinition cube_r184 = Lowerjawbase.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(70, 86).addBox(-0.7978F, -1.6106F, -0.0938F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.248F))
				.texOffs(55, 89).addBox(-0.7978F, 0.2683F, 1.2049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F))
				.texOffs(95, 15).addBox(-0.8228F, -0.1034F, 0.6989F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.625F, 0.4F, -2.7F, -2.9845F, 0.1222F, 0.0F));

		PartDefinition cube_r185 = Lowerjawbase.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(95, 57).addBox(-0.7978F, 0.3462F, 0.6379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(1.625F, 0.4F, -2.7F, -1.4573F, 0.1222F, 0.0F));

		PartDefinition cube_r186 = Lowerjawbase.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(73, 92).addBox(-0.7978F, 0.6844F, -1.7846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F))
				.texOffs(30, 92).addBox(-0.7978F, -1.1813F, -1.29F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F))
				.texOffs(95, 3).addBox(-0.8228F, 0.2387F, -1.9438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.625F, 0.4F, -2.7F, 0.0698F, 0.1222F, 0.0F));

		PartDefinition cube_r187 = Lowerjawbase.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(20, 97).addBox(-0.7978F, -2.1538F, -1.8127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(1.625F, 0.4F, -2.7F, 1.5533F, 0.1222F, 0.0F));

		PartDefinition cube_r188 = Lowerjawbase.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(55, 92).addBox(-0.7934F, -1.7712F, -0.428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F))
				.texOffs(97, 21).addBox(-0.7934F, -1.3175F, 1.2954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(1.375F, 0.4F, -4.7F, 3.0805F, 0.2443F, 0.0F));

		PartDefinition cube_r189 = Lowerjawbase.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(50, 92).addBox(-0.7934F, -0.3327F, 0.8027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(1.375F, 0.4F, -4.7F, -1.8937F, 0.2443F, 0.0F));

		PartDefinition cube_r190 = Lowerjawbase.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(55, 95).addBox(-0.7934F, 0.8439F, -0.9611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(1.375F, 0.4F, -4.7F, -0.4538F, 0.2443F, 0.0F));

		PartDefinition cube_r191 = Lowerjawbase.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(77, 52).addBox(-0.7934F, 0.5081F, -0.1881F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(1.375F, 0.4F, -4.7F, -1.9809F, 0.2443F, 0.0F));

		PartDefinition cube_r192 = Lowerjawbase.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(73, 24).addBox(-0.7934F, -0.7207F, 1.052F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.375F, 0.4F, -4.7F, -3.0718F, 0.2443F, 0.0F));

		PartDefinition cube_r193 = Lowerjawbase.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(45, 92).addBox(-0.7934F, -2.8662F, -0.5837F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.243F)), PartPose.offsetAndRotation(1.375F, 0.4F, -4.7F, 1.8588F, 0.2443F, 0.0F));

		PartDefinition cube_r194 = Lowerjawbase.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(97, 12).addBox(-0.7934F, -2.1074F, 1.6224F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F))
				.texOffs(10, 90).addBox(-0.8184F, -1.3612F, -0.3765F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.375F, 0.4F, -4.7F, 2.7751F, 0.2443F, 0.0F));

		PartDefinition cube_r195 = Lowerjawbase.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(50, 95).addBox(-0.7934F, 0.8758F, 2.0447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(1.375F, 0.4F, -4.7F, -2.4609F, 0.2443F, 0.0F));

		PartDefinition cube_r196 = Lowerjawbase.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(0, 93).addBox(-0.9F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F))
				.texOffs(92, 86).addBox(-0.75F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.5599F, 0.8953F, -7.7897F, -2.1964F, -0.4972F, -0.0201F));

		PartDefinition cube_r197 = Lowerjawbase.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(92, 83).addBox(-0.9F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.243F))
				.texOffs(92, 80).addBox(-0.75F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.5599F, 0.8953F, -7.7897F, -1.5419F, -0.4972F, -0.0201F));

		PartDefinition cube_r198 = Lowerjawbase.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(40, 92).addBox(-0.7934F, 2.4569F, -0.3385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F))
				.texOffs(95, 9).addBox(-0.8184F, 0.5117F, -0.2545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.375F, 0.4F, -4.7F, -1.5446F, 0.2443F, 0.0F));

		PartDefinition cube_r199 = Lowerjawbase.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(89, 74).addBox(-0.7934F, 0.1716F, 1.9554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(1.375F, 0.4F, -4.7F, -2.81F, 0.2443F, 0.0F));

		PartDefinition cube_r200 = Lowerjawbase.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(87, 82).addBox(-0.7934F, -2.3815F, 0.4558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(1.375F, 0.4F, -4.7F, 2.0333F, 0.2443F, 0.0F));

		PartDefinition cube_r201 = Lowerjawbase.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(35, 92).addBox(-0.7934F, -0.1749F, 1.1955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(1.375F, 0.4F, -4.7F, -3.0281F, 0.2443F, 0.0F));

		PartDefinition cube_r202 = Lowerjawbase.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(86, 66).addBox(-0.7934F, -1.6835F, -0.0492F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(1.375F, 0.4F, -4.7F, 1.7715F, 0.2443F, 0.0F));

		PartDefinition cube_r203 = Lowerjawbase.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(92, 31).addBox(-0.7978F, 0.7049F, -1.2684F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F))
				.texOffs(95, 0).addBox(-0.8228F, 0.4299F, 0.1351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.625F, 0.4F, -2.7F, -1.4137F, 0.1222F, 0.0F));

		PartDefinition cube_r204 = Lowerjawbase.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(89, 48).addBox(-0.8228F, 0.148F, -0.8281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.625F, 0.4F, -2.7F, -1.4879F, 0.1222F, 0.0F));

		PartDefinition cube_r205 = Lowerjawbase.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(60, 96).addBox(-0.8228F, -2.2989F, -0.1034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.625F, 0.4F, -2.7F, 1.7279F, 0.1222F, 0.0F));

		PartDefinition cube_r206 = Lowerjawbase.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(45, 89).addBox(-0.8184F, -0.5856F, -0.8914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.375F, 0.4F, -4.7F, 0.2007F, 0.2443F, 0.0F));

		PartDefinition cube_r207 = Lowerjawbase.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(40, 89).addBox(-0.8184F, 0.4139F, -0.6998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.375F, 0.4F, -4.7F, -1.1956F, 0.2443F, 0.0F));

		PartDefinition cube_r208 = Lowerjawbase.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(95, 6).addBox(-0.8184F, -0.0915F, 0.4313F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(1.375F, 0.4F, -4.7F, -2.1991F, 0.2443F, 0.0F));

		PartDefinition cube_r209 = Lowerjawbase.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(40, 98).addBox(-0.8F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.3998F, 1.2579F, -4.3466F, 1.5533F, 0.1571F, -0.0006F));

		PartDefinition cube_r210 = Lowerjawbase.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(35, 89).addBox(-0.8228F, -1.0449F, -0.0534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.625F, 0.4F, -2.7F, -2.8536F, 0.1222F, 0.0F));

		PartDefinition cube_r211 = Lowerjawbase.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(90, 9).addBox(-0.725F, -3.4698F, 0.3235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.7F, 0.4F, 0.6F, 1.9897F, 0.0524F, 0.0F));

		PartDefinition cube_r212 = Lowerjawbase.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(90, 6).addBox(-0.725F, -1.69F, -2.7709F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(1.7F, 0.4F, 0.6F, 0.5585F, 0.0524F, 0.0F));

		PartDefinition cube_r213 = Lowerjawbase.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(93, 94).addBox(-0.725F, 0.9316F, -2.0955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.7F, 0.4F, 0.6F, -0.7941F, 0.0524F, 0.0F));

		PartDefinition cube_r214 = Lowerjawbase.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(5, 90).addBox(-0.725F, 1.962F, -0.6463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7F, 0.4F, 0.6F, -1.6232F, 0.0524F, 0.0F));

		PartDefinition cube_r215 = Lowerjawbase.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(87, 85).addBox(-0.725F, -0.2337F, 2.5399F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.7F, 0.4F, 0.6F, 3.1329F, 0.0524F, 0.0F));

		PartDefinition cube_r216 = Lowerjawbase.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(50, 89).addBox(-0.8228F, -0.6406F, -0.2049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.625F, 0.4F, -2.7F, 1.5621F, 0.1222F, 0.0F));

		PartDefinition cube_r217 = Lowerjawbase.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(95, 18).addBox(-0.8184F, -0.9503F, -0.9993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.375F, 0.4F, -4.7F, 1.7802F, 0.2443F, 0.0F));

		PartDefinition cube_r218 = Lowerjawbase.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(35, 98).addBox(-0.8228F, -0.7218F, -0.5802F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(87, 30).addBox(-0.8228F, -2.3218F, -0.5802F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(1.625F, 0.4F, -2.7F, 1.7802F, 0.1222F, 0.0F));

		PartDefinition cube_r219 = Lowerjawbase.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(15, 90).addBox(-0.725F, -3.5491F, 0.1058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(1.7F, 0.4F, 0.6F, 1.7802F, 0.0524F, 0.0F));

		PartDefinition cube_r220 = Lowerjawbase.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(77, 48).addBox(-0.7978F, -0.8301F, -0.8432F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(1.625F, 0.4F, -2.7F, 1.597F, 0.1222F, 0.0F));

		PartDefinition cube_r221 = Lowerjawbase.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(59, 85).addBox(-0.7F, -0.7568F, 2.6284F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(1.7F, 0.4F, 0.6F, -3.1154F, 0.0524F, 0.0F));

		PartDefinition cube_r222 = Lowerjawbase.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(76, 44).addBox(-0.7F, 2.1534F, -1.1675F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.248F))
				.texOffs(45, 95).addBox(-0.7F, 0.574F, -0.3953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.243F))
				.texOffs(92, 28).addBox(-0.7F, 0.074F, -0.5953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.7F, 0.4F, 0.6F, -1.5708F, 0.0524F, 0.0F));

		PartDefinition cube_r223 = Lowerjawbase.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(54, 85).addBox(-0.7F, -0.8459F, -2.7526F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.246F)), PartPose.offsetAndRotation(1.7F, 0.4F, 0.6F, -0.1309F, 0.0524F, 0.0F));

		PartDefinition cube_r224 = Lowerjawbase.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(48, 79).addBox(-0.7F, -2.3256F, -1.5109F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(1.7F, 0.4F, 0.6F, 1.2654F, 0.0524F, 0.0F));

		PartDefinition cube_r225 = Lowerjawbase.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(86, 62).addBox(-0.7F, -1.5798F, 0.8346F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.246F)), PartPose.offsetAndRotation(1.7F, 0.4F, 0.6F, 2.7925F, 0.0524F, 0.0F));

		PartDefinition cube_r226 = Lowerjawbase.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(95, 43).addBox(-0.7F, 0.3453F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(1.7F, 0.4F, 0.6F, -2.0071F, 0.0524F, 0.0F));

		PartDefinition cube_r227 = Lowerjawbase.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(92, 25).addBox(-0.7F, -0.447F, -0.7871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(1.7F, 0.4F, 0.6F, -0.8727F, 0.0524F, 0.0F));

		PartDefinition cube_r228 = Lowerjawbase.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(90, 91).addBox(-0.7F, -0.3119F, -0.5226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.243F)), PartPose.offsetAndRotation(1.7F, 0.4F, 0.6F, -1.0036F, 0.0524F, 0.0F));

		PartDefinition cube_r229 = Lowerjawbase.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(89, 51).addBox(-0.7F, -0.525F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(1.7F, 0.4F, 0.6F, 0.5236F, 0.0524F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0274F, 2.4301F, -8.1142F, -0.0037F, 0.0522F, -0.0699F));

		PartDefinition cube_r230 = leftFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(96, 60).addBox(0.525F, -0.4F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2274F, -0.3172F, 7.9872F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(80, 90).addBox(-0.7764F, -0.1673F, -1.1973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F))
				.texOffs(90, 16).addBox(-0.7764F, 0.0327F, -1.1973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7476F, -0.7717F, 0.6098F, 0.2269F, 0.3927F, 0.0F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(30, 89).addBox(-0.525F, -0.2205F, 0.0744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.7476F, -0.7717F, 0.6098F, -2.2944F, 0.5873F, 0.1122F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(64, 87).addBox(-0.525F, -1.2643F, -0.0739F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.7476F, -0.7717F, 0.6098F, 2.6362F, 0.5873F, 0.1122F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(88, 94).addBox(-0.525F, -1.1744F, -1.3487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.7476F, -0.7717F, 0.6098F, 1.3708F, 0.5873F, 0.1122F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(39, 72).addBox(-0.525F, -0.1149F, -1.6235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.7476F, -0.7717F, 0.6098F, 0.4981F, 0.5873F, 0.1122F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(28, 48).addBox(-0.193F, -0.1402F, -0.8954F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6726F, -0.2327F, 7.4835F, -3.0281F, 0.0F, 0.0F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(91, 66).addBox(-0.193F, -1.2362F, -0.4342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6726F, -0.2327F, 7.4835F, -2.1991F, 0.0F, 0.0F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(68, 90).addBox(-0.193F, -0.8612F, -0.3342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.6726F, -0.2327F, 7.4835F, -1.8064F, 0.0F, 0.0F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(65, 96).addBox(-0.193F, -0.6627F, -0.0921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6726F, -0.2327F, 7.4835F, 3.0369F, 0.0F, 0.0F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(5, 81).addBox(-0.9F, -0.1F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.372F, 0.263F, 6.1799F, -3.072F, 0.0089F, -0.0049F));

		PartDefinition cube_r241 = leftFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(10, 81).addBox(-0.068F, -1.826F, 0.0856F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5476F, -1.4717F, 6.3098F, -3.0718F, 0.0785F, 0.0F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(25, 94).addBox(-0.068F, 0.8094F, 0.8673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.5476F, -1.4717F, 6.3098F, -1.5446F, 0.0785F, 0.0F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(63, 90).addBox(-0.068F, 1.1954F, -2.1864F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5476F, -1.4717F, 6.3098F, -0.192F, 0.0785F, 0.0F));

		PartDefinition cube_r244 = leftFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(21, 79).addBox(-0.9109F, 0.214F, -0.1924F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F))
				.texOffs(78, 8).addBox(-0.9109F, 0.4139F, -0.1924F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.1726F, -1.4717F, 3.1348F, 1.9548F, 0.096F, 0.0F));

		PartDefinition cube_r245 = leftFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(51, 60).addBox(-0.9109F, -0.7964F, -1.1053F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1726F, -1.4717F, 3.1348F, -1.4137F, 0.096F, 0.0F));

		PartDefinition cube_r246 = leftFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(73, 98).addBox(-0.9732F, -1.023F, -0.7014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7476F, -0.7717F, 0.6098F, 2.8274F, 0.2531F, 0.0F));

		PartDefinition cube_r247 = leftFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(83, 97).addBox(-0.7469F, -3.4208F, -1.4692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.1726F, -1.4717F, 4.0098F, 1.693F, 0.1833F, 0.0F));

		PartDefinition cube_r248 = leftFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(65, 65).addBox(-0.9F, -1.625F, -0.125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.386F, -3.7988F, 6.6244F, -1.8842F, -0.0015F, 0.0212F));

		PartDefinition cube_r249 = leftFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(28, 79).addBox(-0.5F, -1.096F, -1.0323F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.8942F, -3.1282F, 4.8898F, 1.9984F, 0.0611F, 0.0F));

		PartDefinition cube_r250 = leftFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(50, 98).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.9556F, -4.1157F, 5.894F, -1.9373F, 0.0611F, 0.0F));

		PartDefinition cube_r251 = leftFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(45, 98).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.9068F, -4.1296F, 5.0956F, 3.1241F, 0.0611F, 0.0F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(79, 63).addBox(-0.5F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8614F, -3.8364F, 4.3526F, 1.946F, 0.0611F, 0.0F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(70, 49).addBox(-0.9F, -0.1F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.9882F, -3.0669F, 2.2414F, 1.9009F, 0.1472F, -0.0128F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(94, 51).addBox(-0.9732F, -0.8301F, -0.2806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.7476F, -0.7717F, 0.6098F, -2.9758F, 0.2531F, 0.0F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(97, 84).addBox(-0.9732F, -0.3806F, -0.5554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.7476F, -0.7717F, 0.6098F, -2.1031F, 0.2531F, 0.0F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(94, 48).addBox(-0.7469F, 2.0274F, -2.2509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1726F, -1.4717F, 4.0098F, -0.925F, 0.1833F, 0.0F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(64, 39).addBox(-0.5F, -0.1F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5949F, -3.0631F, 2.3142F, 0.7496F, 0.183F, -0.0097F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(69, 44).addBox(-0.7469F, -3.2009F, -2.0458F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(1.1726F, -1.4717F, 4.0098F, 1.4748F, 0.1833F, 0.0F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(86, 70).addBox(-0.7469F, -0.1303F, -1.6281F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1726F, -1.4717F, 4.0098F, 0.0262F, 0.1833F, 0.0F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(90, 3).addBox(-0.05F, -1.3583F, -1.6547F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 70).addBox(-0.075F, -1.8583F, -2.1547F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5476F, -1.4717F, 6.3098F, 0.0742F, 0.0785F, 0.0F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(68, 93).addBox(-0.5F, -0.8F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F))
				.texOffs(63, 93).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0976F, -3.0253F, 6.7651F, -1.0603F, 0.0F, 0.0F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(93, 40).addBox(-0.5F, -1.1F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F))
				.texOffs(15, 93).addBox(-0.5F, -1.1F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(10, 93).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.0976F, -2.5676F, 7.1264F, -0.3622F, 0.0F, 0.0F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(78, 4).addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.0976F, -1.0493F, 7.9103F, -1.453F, 0.0F, 0.0F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(78, 93).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0976F, -0.852F, 7.5312F, 2.6922F, 0.0F, 0.0F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(97, 27).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(1.0976F, -0.7656F, 7.1158F, -2.1511F, 0.0F, 0.0F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(75, 89).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.0976F, 0.1807F, 7.1463F, 2.7358F, 0.0F, 0.0F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(25, 97).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0976F, 0.1102F, 7.7422F, 1.6886F, 0.0F, 0.0F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(97, 24).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.0976F, -0.4509F, 7.9548F, 1.2086F, 0.0F, 0.0F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(97, 78).addBox(-0.5F, -0.4F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1976F, -0.6593F, 6.7109F, -0.8858F, 0.0F, 0.0F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(30, 98).addBox(-0.6826F, -0.4958F, -0.6273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(97, 81).addBox(-0.6826F, -0.4958F, -1.0273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.384F, -0.2211F, 6.7369F, 0.2487F, 0.0305F, 0.0F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(97, 30).addBox(-0.6826F, -0.6529F, -0.7054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.384F, -0.2211F, 6.7369F, 0.5978F, 0.0305F, 0.0F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(20, 94).addBox(0.05F, -0.1F, 0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(5, 93).addBox(0.05F, -0.1F, 0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5476F, -1.0582F, 6.6812F, 0.0742F, 0.0F, 0.0F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(98, 95).addBox(0.0F, 0.0643F, -2.9384F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5476F, -1.4717F, 6.3098F, 0.2007F, 0.0785F, 0.0F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(91, 60).addBox(-0.7289F, 0.3658F, -1.756F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(25, 91).addBox(-0.7289F, 0.3658F, -1.656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(20, 91).addBox(-0.7289F, -0.0342F, -1.656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(1.1726F, -1.4717F, 4.0098F, 0.0524F, 0.1833F, 0.0F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(96, 69).addBox(-0.7289F, 0.573F, -1.2507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.1726F, -1.4717F, 4.0098F, -0.9512F, 0.1833F, 0.0F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(96, 66).addBox(-0.7289F, 0.6404F, 0.9588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1726F, -1.4717F, 4.0098F, -2.2166F, 0.1833F, 0.0F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(91, 63).addBox(-0.7289F, -1.4369F, 1.4536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(1.1726F, -1.4717F, 4.0098F, -3.1329F, 0.1833F, 0.0F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(94, 75).addBox(-0.5289F, -3.292F, -0.8355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.1726F, -1.4717F, 4.0098F, 1.4181F, 0.1833F, 0.0F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(87, 88).addBox(-0.6289F, -2.4085F, 1.9019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.1726F, -1.4717F, 4.0098F, 2.5395F, 0.1833F, 0.0F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(94, 72).addBox(-0.6289F, -3.0303F, 1.2251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1726F, -1.4717F, 4.0098F, 2.1904F, 0.1833F, 0.0F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(94, 54).addBox(-0.6289F, -1.2204F, 2.6724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.1726F, -1.4717F, 4.0098F, 3.0194F, 0.1833F, 0.0F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(25, 69).addBox(0.0F, -0.2852F, 0.691F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5476F, -1.4717F, 6.3098F, -3.002F, 0.0785F, 0.0F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(90, 57).addBox(0.0F, 1.9393F, 1.0101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F))
				.texOffs(90, 45).addBox(0.0F, 1.9393F, 0.6101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5476F, -1.4717F, 6.3098F, -2.6529F, 0.0785F, 0.0F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(96, 63).addBox(0.0F, 0.7383F, -2.5252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.5476F, -1.4717F, 6.3098F, -1.4312F, 0.0785F, 0.0F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(98, 40).addBox(0.0F, -1.7811F, -2.0386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5476F, -1.4717F, 6.3098F, -0.384F, 0.0785F, 0.0F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(57, 22).addBox(0.0F, 0.0209F, -2.0066F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.5476F, -1.4717F, 6.3098F, -1.7366F, 0.0785F, 0.0F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(15, 99).addBox(0.0F, -1.0946F, -1.7312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.5476F, -1.4717F, 6.3098F, -1.1257F, 0.0785F, 0.0F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(98, 92).addBox(0.0F, -1.1267F, -0.1089F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5476F, -1.4717F, 6.3098F, 0.2269F, 0.0785F, 0.0F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(10, 99).addBox(0.0F, -0.318F, -0.3181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.5476F, -1.4717F, 6.3098F, 1.2915F, 0.0785F, 0.0F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(5, 99).addBox(0.0F, -0.8517F, -0.7196F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5476F, -1.4717F, 6.3098F, 2.426F, 0.0785F, 0.0F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(0, 99).addBox(0.0F, -0.9394F, 0.3945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(0.5476F, -1.4717F, 6.3098F, -2.6354F, 0.0785F, 0.0F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(99, 46).addBox(0.0F, -0.5722F, 0.7539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5476F, -1.4717F, 6.3098F, -2.33F, 0.0785F, 0.0F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(93, 97).addBox(-0.425F, -0.5F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(88, 97).addBox(-0.425F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5945F, -3.1937F, 7.6979F, -0.2616F, 0.0319F, 0.0472F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(98, 98).addBox(0.0F, 0.8004F, 0.5655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(62, 9).addBox(0.0F, 1.0004F, -1.4345F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.5476F, -1.4717F, 6.3098F, -1.501F, 0.0785F, 0.0F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(0, 81).addBox(0.0F, -1.1268F, -2.5171F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.5476F, -1.4717F, 6.3098F, -0.1047F, 0.0785F, 0.0F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(55, 98).addBox(0.0F, -2.476F, -1.6615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(0.5476F, -1.4717F, 6.3098F, 1.2479F, 0.0785F, 0.0F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0274F, 2.4301F, -8.1142F, -0.0037F, -0.0522F, 0.0699F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(96, 60).mirror().addBox(-1.525F, -0.4F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2274F, -0.3172F, 7.9872F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(80, 90).mirror().addBox(-0.2236F, -0.1673F, -1.1973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false)
				.texOffs(90, 16).mirror().addBox(-0.2236F, 0.0327F, -1.1973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7476F, -0.7717F, 0.6098F, 0.2269F, -0.3927F, 0.0F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(30, 89).mirror().addBox(-0.475F, -0.2205F, 0.0744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.7476F, -0.7717F, 0.6098F, -2.2944F, -0.5873F, -0.1122F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(64, 87).mirror().addBox(-0.475F, -1.2643F, -0.0739F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.7476F, -0.7717F, 0.6098F, 2.6362F, -0.5873F, -0.1122F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(88, 94).mirror().addBox(-0.475F, -1.1744F, -1.3487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.7476F, -0.7717F, 0.6098F, 1.3708F, -0.5873F, -0.1122F));

		PartDefinition cube_r302 = rightFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(39, 72).mirror().addBox(-0.475F, -0.1149F, -1.6235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.7476F, -0.7717F, 0.6098F, 0.4981F, -0.5873F, -0.1122F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(28, 48).mirror().addBox(-0.807F, -0.1402F, -0.8954F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6726F, -0.2327F, 7.4835F, -3.0281F, 0.0F, 0.0F));

		PartDefinition cube_r304 = rightFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(91, 66).mirror().addBox(-0.807F, -1.2362F, -0.4342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6726F, -0.2327F, 7.4835F, -2.1991F, 0.0F, 0.0F));

		PartDefinition cube_r305 = rightFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(68, 90).mirror().addBox(-0.807F, -0.8612F, -0.3342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-0.6726F, -0.2327F, 7.4835F, -1.8064F, 0.0F, 0.0F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(65, 96).mirror().addBox(-0.807F, -0.6627F, -0.0921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6726F, -0.2327F, 7.4835F, 3.0369F, 0.0F, 0.0F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(5, 81).mirror().addBox(-0.1F, -0.1F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.372F, 0.263F, 6.1799F, -3.072F, -0.0089F, 0.0049F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(10, 81).mirror().addBox(-0.932F, -1.826F, 0.0856F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5476F, -1.4717F, 6.3098F, -3.0718F, -0.0785F, 0.0F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(25, 94).mirror().addBox(-0.932F, 0.8094F, 0.8673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.5476F, -1.4717F, 6.3098F, -1.5446F, -0.0785F, 0.0F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(63, 90).mirror().addBox(-0.932F, 1.1954F, -2.1864F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5476F, -1.4717F, 6.3098F, -0.192F, -0.0785F, 0.0F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(21, 79).mirror().addBox(-0.0891F, 0.214F, -0.1924F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false)
				.texOffs(78, 8).mirror().addBox(-0.0891F, 0.4139F, -0.1924F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.1726F, -1.4717F, 3.1348F, 1.9548F, -0.096F, 0.0F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(51, 60).mirror().addBox(-0.0891F, -0.7964F, -1.1053F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1726F, -1.4717F, 3.1348F, -1.4137F, -0.096F, 0.0F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(73, 98).mirror().addBox(-0.0268F, -1.023F, -0.7014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7476F, -0.7717F, 0.6098F, 2.8274F, -0.2531F, 0.0F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(83, 97).mirror().addBox(-0.2531F, -3.4208F, -1.4692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.1726F, -1.4717F, 4.0098F, 1.693F, -0.1833F, 0.0F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(65, 65).mirror().addBox(-0.1F, -1.625F, -0.125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.386F, -3.7988F, 6.6244F, -1.8842F, 0.0015F, -0.0212F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(28, 79).mirror().addBox(-0.5F, -1.096F, -1.0323F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-0.8942F, -3.1282F, 4.8898F, 1.9984F, -0.0611F, 0.0F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(50, 98).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.9556F, -4.1157F, 5.894F, -1.9373F, -0.0611F, 0.0F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(45, 98).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-0.9068F, -4.1296F, 5.0956F, 3.1241F, -0.0611F, 0.0F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(79, 63).mirror().addBox(-0.5F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8614F, -3.8364F, 4.3526F, 1.946F, -0.0611F, 0.0F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(70, 49).mirror().addBox(-0.1F, -0.1F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.9882F, -3.0669F, 2.2414F, 1.9009F, -0.1472F, 0.0128F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(94, 51).mirror().addBox(-0.0268F, -0.8301F, -0.2806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.7476F, -0.7717F, 0.6098F, -2.9758F, -0.2531F, 0.0F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(97, 84).mirror().addBox(-0.0268F, -0.3806F, -0.5554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-0.7476F, -0.7717F, 0.6098F, -2.1031F, -0.2531F, 0.0F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(94, 48).mirror().addBox(-0.2531F, 2.0274F, -2.2509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1726F, -1.4717F, 4.0098F, -0.925F, -0.1833F, 0.0F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(64, 39).mirror().addBox(-0.5F, -0.1F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5949F, -3.0631F, 2.3142F, 0.7496F, -0.183F, 0.0097F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(69, 44).mirror().addBox(-0.2531F, -3.2009F, -2.0458F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-1.1726F, -1.4717F, 4.0098F, 1.4748F, -0.1833F, 0.0F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(86, 70).mirror().addBox(-0.2531F, -0.1303F, -1.6281F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1726F, -1.4717F, 4.0098F, 0.0262F, -0.1833F, 0.0F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(90, 3).mirror().addBox(-0.95F, -1.3583F, -1.6547F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 70).mirror().addBox(-0.925F, -1.8583F, -2.1547F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5476F, -1.4717F, 6.3098F, 0.0742F, -0.0785F, 0.0F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(68, 93).mirror().addBox(-0.5F, -0.8F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false)
				.texOffs(63, 93).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0976F, -3.0253F, 6.7651F, -1.0603F, 0.0F, 0.0F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(93, 40).mirror().addBox(-0.5F, -1.1F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(15, 93).mirror().addBox(-0.5F, -1.1F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(10, 93).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.0976F, -2.5676F, 7.1264F, -0.3622F, 0.0F, 0.0F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(78, 4).mirror().addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.0976F, -1.0493F, 7.9103F, -1.453F, 0.0F, 0.0F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(78, 93).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0976F, -0.852F, 7.5312F, 2.6922F, 0.0F, 0.0F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(97, 27).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-1.0976F, -0.7656F, 7.1158F, -2.1511F, 0.0F, 0.0F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(75, 89).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.0976F, 0.1807F, 7.1463F, 2.7358F, 0.0F, 0.0F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(25, 97).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0976F, 0.1102F, 7.7422F, 1.6886F, 0.0F, 0.0F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(97, 24).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.0976F, -0.4509F, 7.9548F, 1.2086F, 0.0F, 0.0F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(97, 78).mirror().addBox(-0.5F, -0.4F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1976F, -0.6593F, 6.7109F, -0.8858F, 0.0F, 0.0F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(30, 98).mirror().addBox(-0.3174F, -0.4958F, -0.6273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(97, 81).mirror().addBox(-0.3174F, -0.4958F, -1.0273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.384F, -0.2211F, 6.7369F, 0.2487F, -0.0305F, 0.0F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(97, 30).mirror().addBox(-0.3174F, -0.6529F, -0.7054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.384F, -0.2211F, 6.7369F, 0.5978F, -0.0305F, 0.0F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(20, 94).mirror().addBox(-1.05F, -0.1F, 0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(5, 93).mirror().addBox(-1.05F, -0.1F, 0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5476F, -1.0582F, 6.6812F, 0.0742F, 0.0F, 0.0F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(98, 95).mirror().addBox(-1.0F, 0.0643F, -2.9384F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5476F, -1.4717F, 6.3098F, 0.2007F, -0.0785F, 0.0F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(91, 60).mirror().addBox(-0.2711F, 0.3658F, -1.756F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(25, 91).mirror().addBox(-0.2711F, 0.3658F, -1.656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(20, 91).mirror().addBox(-0.2711F, -0.0342F, -1.656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-1.1726F, -1.4717F, 4.0098F, 0.0524F, -0.1833F, 0.0F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(96, 69).mirror().addBox(-0.2711F, 0.573F, -1.2507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.1726F, -1.4717F, 4.0098F, -0.9512F, -0.1833F, 0.0F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(96, 66).mirror().addBox(-0.2711F, 0.6404F, 0.9588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1726F, -1.4717F, 4.0098F, -2.2166F, -0.1833F, 0.0F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(91, 63).mirror().addBox(-0.2711F, -1.4369F, 1.4536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-1.1726F, -1.4717F, 4.0098F, -3.1329F, -0.1833F, 0.0F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(94, 75).mirror().addBox(-0.4711F, -3.292F, -0.8355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.1726F, -1.4717F, 4.0098F, 1.4181F, -0.1833F, 0.0F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(87, 88).mirror().addBox(-0.3711F, -2.4085F, 1.9019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.1726F, -1.4717F, 4.0098F, 2.5395F, -0.1833F, 0.0F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(94, 72).mirror().addBox(-0.3711F, -3.0303F, 1.2251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1726F, -1.4717F, 4.0098F, 2.1904F, -0.1833F, 0.0F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(94, 54).mirror().addBox(-0.3711F, -1.2204F, 2.6724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.1726F, -1.4717F, 4.0098F, 3.0194F, -0.1833F, 0.0F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(25, 69).mirror().addBox(-1.0F, -0.2852F, 0.691F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5476F, -1.4717F, 6.3098F, -3.002F, -0.0785F, 0.0F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(90, 57).mirror().addBox(-1.0F, 1.9393F, 1.0101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false)
				.texOffs(90, 45).mirror().addBox(-1.0F, 1.9393F, 0.6101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5476F, -1.4717F, 6.3098F, -2.6529F, -0.0785F, 0.0F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(96, 63).mirror().addBox(-1.0F, 0.7383F, -2.5252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.5476F, -1.4717F, 6.3098F, -1.4312F, -0.0785F, 0.0F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(98, 40).mirror().addBox(-1.0F, -1.7811F, -2.0386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5476F, -1.4717F, 6.3098F, -0.384F, -0.0785F, 0.0F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(57, 22).mirror().addBox(-1.0F, 0.0209F, -2.0066F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-0.5476F, -1.4717F, 6.3098F, -1.7366F, -0.0785F, 0.0F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(15, 99).mirror().addBox(-1.0F, -1.0946F, -1.7312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.5476F, -1.4717F, 6.3098F, -1.1257F, -0.0785F, 0.0F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(98, 92).mirror().addBox(-1.0F, -1.1267F, -0.1089F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5476F, -1.4717F, 6.3098F, 0.2269F, -0.0785F, 0.0F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(10, 99).mirror().addBox(-1.0F, -0.318F, -0.3181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.5476F, -1.4717F, 6.3098F, 1.2915F, -0.0785F, 0.0F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(5, 99).mirror().addBox(-1.0F, -0.8517F, -0.7196F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5476F, -1.4717F, 6.3098F, 2.426F, -0.0785F, 0.0F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(0, 99).mirror().addBox(-1.0F, -0.9394F, 0.3945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(-0.5476F, -1.4717F, 6.3098F, -2.6354F, -0.0785F, 0.0F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(99, 46).mirror().addBox(-1.0F, -0.5722F, 0.7539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5476F, -1.4717F, 6.3098F, -2.33F, -0.0785F, 0.0F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(93, 97).mirror().addBox(-0.575F, -0.5F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(88, 97).mirror().addBox(-0.575F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5945F, -3.1937F, 7.6979F, -0.2616F, -0.0319F, -0.0472F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(98, 98).mirror().addBox(-1.0F, 0.8004F, 0.5655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(62, 9).mirror().addBox(-1.0F, 1.0004F, -1.4345F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.5476F, -1.4717F, 6.3098F, -1.501F, -0.0785F, 0.0F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-1.0F, -1.1268F, -2.5171F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.5476F, -1.4717F, 6.3098F, -0.1047F, -0.0785F, 0.0F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(55, 98).mirror().addBox(-1.0F, -2.476F, -1.6615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(-0.5476F, -1.4717F, 6.3098F, 1.2479F, -0.0785F, 0.0F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3562F, 3.8299F, -6.0207F, 0.7732F, 0.2326F, -0.0247F));

		PartDefinition cube_r364 = Rightupperarm.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(60, 80).addBox(-0.5F, -0.1F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(90, 37).addBox(-0.5F, 2.475F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0297F, 2.9847F, 0.3083F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r365 = Rightupperarm.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(85, 8).addBox(-0.5F, -1.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0297F, 2.3484F, -0.45F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r366 = Rightupperarm.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(85, 4).addBox(-0.5F, -1.7F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.0297F, 3.016F, -0.2395F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r367 = Rightupperarm.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(10, 86).addBox(-0.5F, -1.1F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.0297F, 1.0132F, -0.029F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r368 = Rightupperarm.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(5, 86).addBox(-0.5F, -1.1F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.0297F, 1.0132F, -0.029F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1597F, 6.5657F, -0.3372F, -0.8633F, -0.1247F, 0.1106F));

		PartDefinition cube_r369 = Rightlowerarm.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(85, 0).addBox(-0.5F, -0.4F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.0614F, 1.2506F, 0.1274F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r370 = Rightlowerarm.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(84, 75).addBox(-0.5F, -1.8F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0614F, 1.2506F, 0.1274F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r371 = Rightlowerarm.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(84, 52).addBox(-0.5F, -0.4F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.0614F, 1.2506F, -0.6726F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r372 = Rightlowerarm.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(84, 48).addBox(-0.5F, -1.8F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0614F, 1.2506F, -0.6726F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Righthand = Rightlowerarm.addOrReplaceChild("Righthand", CubeListBuilder.create().texOffs(65, 83).addBox(-1.0F, 0.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3761F, 2.5659F, -0.1435F, 0.0637F, 0.0F, 0.2759F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3562F, 3.8299F, -6.0207F, 1.1223F, -0.2326F, 0.0247F));

		PartDefinition cube_r373 = Leftupperarm.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(60, 80).mirror().addBox(-0.5F, -0.1F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(90, 37).mirror().addBox(-0.5F, 2.475F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0297F, 2.9847F, 0.3083F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r374 = Leftupperarm.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(85, 8).mirror().addBox(-0.5F, -1.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0297F, 2.3484F, -0.45F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r375 = Leftupperarm.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(85, 4).mirror().addBox(-0.5F, -1.7F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.0297F, 3.016F, -0.2395F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r376 = Leftupperarm.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(10, 86).mirror().addBox(-0.5F, -1.1F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.0297F, 1.0132F, -0.029F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r377 = Leftupperarm.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(5, 86).mirror().addBox(-0.5F, -1.1F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.0297F, 1.0132F, -0.029F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1597F, 6.5657F, -0.3372F, -0.8633F, 0.1247F, -0.1106F));

		PartDefinition cube_r378 = Leftlowerarm.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(85, 0).mirror().addBox(-0.5F, -0.4F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.0614F, 1.2506F, 0.1274F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r379 = Leftlowerarm.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(84, 75).mirror().addBox(-0.5F, -1.8F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0614F, 1.2506F, 0.1274F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r380 = Leftlowerarm.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(84, 52).mirror().addBox(-0.5F, -0.4F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.0614F, 1.2506F, -0.6726F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r381 = Leftlowerarm.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(84, 48).mirror().addBox(-0.5F, -1.8F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0614F, 1.2506F, -0.6726F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Lefthand = Leftlowerarm.addOrReplaceChild("Lefthand", CubeListBuilder.create().texOffs(65, 83).mirror().addBox(0.0F, 0.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3761F, 2.5659F, -0.1435F, 0.0637F, 0.0F, -0.2759F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(3.0F, 3.3844F, -6.0808F));

		PartDefinition cube_r382 = bone.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(5, 71).addBox(-0.4994F, -2.9307F, -1.5684F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.3063F, -0.8507F, 2.6992F, 1.8989F, -0.0671F, -0.0705F));

		PartDefinition cube_r383 = bone.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(34, 75).addBox(-0.4994F, -0.7783F, -2.9215F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3063F, -0.8507F, 2.6992F, 0.6335F, -0.0671F, -0.0705F));

		PartDefinition cube_r384 = bone.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(13, 55).addBox(-0.5044F, -0.3985F, 0.6232F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3063F, -0.8507F, 2.6992F, 0.5375F, -0.0671F, -0.0705F));

		PartDefinition cube_r385 = bone.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(73, 12).addBox(-0.4994F, -0.5213F, -1.2769F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3063F, -0.8507F, 2.6992F, 0.363F, -0.0671F, -0.0705F));

		PartDefinition cube_r386 = bone.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(71, 4).addBox(-0.4994F, -0.2918F, -3.1693F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3063F, -0.8507F, 2.6992F, 0.1972F, -0.0671F, -0.0705F));

		PartDefinition cube_r387 = bone.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(72, 72).addBox(-1.411F, -1.2901F, -0.4215F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.625F, 0.6465F, -0.3024F, 0.5359F, -0.9821F, -0.0453F));

		PartDefinition cube_r388 = bone.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(27, 75).addBox(-1.3777F, -0.7474F, -0.4215F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.625F, 0.6465F, -0.3024F, 1.056F, -0.2473F, -0.8584F));

		PartDefinition cube_r389 = bone.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(85, 18).addBox(-0.0448F, -0.8886F, -0.4215F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.625F, 0.6465F, -0.3024F, 0.9924F, -0.5089F, -0.6881F));

		PartDefinition bone4 = Bodyfront.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-3.0F, 3.3844F, -6.0808F));

		PartDefinition cube_r390 = bone4.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(5, 71).mirror().addBox(-0.5006F, -2.9307F, -1.5684F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.3063F, -0.8507F, 2.6992F, 1.8989F, 0.0671F, 0.0705F));

		PartDefinition cube_r391 = bone4.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(34, 75).mirror().addBox(-0.5006F, -0.7783F, -2.9215F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3063F, -0.8507F, 2.6992F, 0.6335F, 0.0671F, 0.0705F));

		PartDefinition cube_r392 = bone4.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(13, 55).mirror().addBox(-0.4956F, -0.3985F, 0.6232F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.3063F, -0.8507F, 2.6992F, 0.5375F, 0.0671F, 0.0705F));

		PartDefinition cube_r393 = bone4.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(73, 12).mirror().addBox(-0.5006F, -0.5213F, -1.2769F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.3063F, -0.8507F, 2.6992F, 0.363F, 0.0671F, 0.0705F));

		PartDefinition cube_r394 = bone4.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(71, 4).mirror().addBox(-0.5006F, -0.2918F, -3.1693F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.3063F, -0.8507F, 2.6992F, 0.1972F, 0.0671F, 0.0705F));

		PartDefinition cube_r395 = bone4.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(72, 72).mirror().addBox(-0.589F, -1.2901F, -0.4215F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.625F, 0.6465F, -0.3024F, 0.5359F, 0.9821F, 0.0453F));

		PartDefinition cube_r396 = bone4.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(27, 75).mirror().addBox(-0.6223F, -0.7474F, -0.4215F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.625F, 0.6465F, -0.3024F, 1.056F, 0.2473F, 0.8584F));

		PartDefinition cube_r397 = bone4.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(85, 18).mirror().addBox(-0.9552F, -0.8886F, -0.4215F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.625F, 0.6465F, -0.3024F, 0.9924F, 0.5089F, 0.6881F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1872F, 3.8984F, -0.1588F, -0.0794F, 0.0567F));

		PartDefinition cube_r398 = Tailbase.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(90, 100).addBox(0.0F, -0.8F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 89).addBox(0.0F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.836F, 5.5758F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r399 = Tailbase.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(29, 101).addBox(0.0F, -1.1F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4167F, 1.5367F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r400 = Tailbase.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(90, 40).addBox(0.0F, 0.1F, 0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4519F, 6.7517F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r401 = Tailbase.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(15, 41).addBox(0.0F, 0.0F, -0.2F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1575F, 4.632F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r402 = Tailbase.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(19, 24).addBox(0.0F, 0.1F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3453F, 2.7176F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r403 = Tailbase.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(60, 89).addBox(0.0F, -1.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6574F, 1.2082F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r404 = Tailbase.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(87, 100).addBox(0.0F, -0.8F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4167F, 1.5367F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r405 = Tailbase.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(19, 30).mirror().addBox(-1.0F, 0.0F, -0.2F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1007F, 0.283F, 0.0524F, 0.0349F, 0.0018F));

		PartDefinition cube_r406 = Tailbase.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(19, 30).addBox(0.0F, 0.0F, -0.2F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1007F, 0.283F, 0.0524F, -0.0349F, -0.0018F));

		PartDefinition cube_r407 = Tailbase.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(23, 20).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.1007F, 0.283F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6078F, 8.0702F, 0.0408F, -0.1348F, 0.0811F));

		PartDefinition cube_r408 = Tailmiddlebase.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(84, 100).addBox(0.0F, -1.1F, 10.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 100).addBox(0.0F, -1.1F, 8.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1536F, -3.9058F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r409 = Tailmiddlebase.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(66, 44).addBox(0.0F, -1.1F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0244F, 2.8919F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r410 = Tailmiddlebase.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(100, 55).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.028F, 0.8925F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r411 = Tailmiddlebase.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(0, 24).mirror().addBox(-0.7F, 0.0F, 0.0F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2831F, -0.0986F, 0.0175F, 0.0349F, 0.0006F));

		PartDefinition cube_r412 = Tailmiddlebase.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(0, 24).addBox(-0.3F, 0.0F, 0.0F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2831F, -0.0986F, 0.0175F, -0.0349F, -0.0006F));

		PartDefinition cube_r413 = Tailmiddlebase.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2831F, -0.0986F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r414 = Tailmiddlebase.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(60, 99).addBox(0.0F, 2.0F, 3.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 76).addBox(0.0F, 1.4F, 1.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 96).addBox(0.0F, -0.2F, -0.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4378F, 1.2021F, 0.4712F, 0.0F, 0.0F));

		PartDefinition Tailmiddle = Tailmiddlebase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0222F, 7.9699F, 0.0837F, -0.2347F, 0.1514F));

		PartDefinition cube_r415 = Tailmiddle.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(100, 43).addBox(0.0F, -1.1F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 36).addBox(0.0F, -1.1F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 33).addBox(0.0F, -1.1F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 39).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.2652F, -0.1284F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r416 = Tailmiddle.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(100, 9).addBox(0.0F, 5.0F, 9.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 6).addBox(0.0F, 4.3F, 7.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 3).addBox(0.0F, 3.5F, 5.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.46F, -6.7678F, 0.4712F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = Tailmiddle.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0227F, 6.8731F, 0.0136F, -0.1745F, -0.0024F));

		PartDefinition cube_r417 = Tailmiddleend.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(53, 101).addBox(0.0F, -0.4F, 5.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 101).addBox(0.0F, -0.5F, 3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 101).addBox(0.0F, -0.5F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 101).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6212F, 1.9738F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r418 = Tailmiddleend.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(93, 100).addBox(0.0F, -1.1F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2425F, -7.0015F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r419 = Tailmiddleend.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(20, 100).addBox(0.0F, 7.5F, 15.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 18).addBox(0.0F, 6.6F, 13.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 15).addBox(0.0F, 5.7F, 11.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4373F, -13.6408F, 0.4712F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.4556F, -0.0967F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.1498F, 9.8048F, -0.1773F, -0.1718F, 0.0306F));

		PartDefinition Tailend2 = Tailend.addOrReplaceChild("Tailend2", CubeListBuilder.create().texOffs(42, 0).addBox(-0.5F, -0.4556F, -0.0967F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0168F, 9.8826F, -0.2918F, 0.3777F, -0.1103F));

		PartDefinition Tailend3 = Tailend2.addOrReplaceChild("Tailend3", CubeListBuilder.create().texOffs(38, 30).addBox(-0.5F, -0.4556F, -0.0967F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.0191F, 5.9255F, -0.1717F, 0.2581F, -0.0442F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3F, 3.6587F, -0.6761F, 0.2194F, 0.0F, 0.0F));

		PartDefinition cube_r420 = Rightthigh.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(25, 87).addBox(-0.5F, 0.2385F, 0.4538F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(20, 87).addBox(-0.5F, 0.2385F, -0.1212F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 8.5354F, -4.3812F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r421 = Rightthigh.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(41, 77).addBox(-1.0F, 0.0385F, -0.0212F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 8.5354F, -4.3812F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r422 = Rightthigh.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(35, 79).addBox(-1.0F, 0.0F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 5.9661F, -2.1352F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r423 = Rightthigh.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(57, 9).addBox(-1.0F, -0.8F, 0.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 1.771F, -1.2125F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r424 = Rightthigh.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(55, 80).addBox(-1.0F, -0.3F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 2.0F, 0.1F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r425 = Rightthigh.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(65, 80).addBox(-1.0F, -1.6F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(64, 6).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.2659F, 0.9435F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r426 = Rightthigh.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(34, 85).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 2.0785F, 0.0982F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r427 = Rightthigh.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(80, 23).addBox(-1.0F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 0.5F, -0.4F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create().texOffs(55, 34).addBox(-1.9F, -0.0965F, -0.8026F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.5F, 11.3308F, -4.0215F, 0.8311F, 0.0F, 0.0F));

		PartDefinition cube_r428 = Rightshin.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(72, 82).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 2.1957F, 1.6186F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r429 = Rightshin.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(73, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 0.8099F, 2.1926F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r430 = Rightshin.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(15, 86).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 1.5949F, 0.6847F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r431 = Rightshin.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(14, 77).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 0.9035F, -0.8026F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r432 = Rightshin.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(44, 65).addBox(-0.5F, -2.2F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.7F, 1.7618F, 0.8128F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r433 = Rightshin.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(39, 65).addBox(-0.5F, -1.8F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.7F, 1.7618F, 0.8128F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r434 = Rightshin.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(0, 86).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.7F, 3.6604F, 0.0088F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r435 = Rightshin.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(77, 85).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.7F, 2.9568F, 0.4934F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r436 = Rightshin.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(77, 80).addBox(-0.5F, -2.3F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.7F, 1.7618F, 0.8128F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r437 = Rightshin.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(80, 18).addBox(-0.5F, -2.4F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, 1.7618F, 0.8128F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r438 = Rightshin.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(80, 28).addBox(-0.5F, -2.8F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.7F, 4.3183F, 0.3389F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r439 = Rightshin.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(12, 66).addBox(-0.5F, -4.8F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.7F, 8.9512F, 0.5762F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r440 = Rightshin.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(67, 74).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, 12.1838F, -0.152F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r441 = Rightshin.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(82, 86).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.9F, 10.8F, 0.613F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r442 = Rightshin.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(0, 66).addBox(0.0F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 5.823F, 1.0922F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r443 = Rightshin.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(71, 37).addBox(0.0F, -1.6F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(71, 8).addBox(-0.5F, -2.6F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.4F, 3.4035F, 0.6974F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Rightankle = Rightshin.addOrReplaceChild("Rightankle", CubeListBuilder.create().texOffs(57, 0).addBox(-1.0F, -0.2565F, -0.444F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 12.9094F, -0.1655F, -0.7229F, 0.0F, 0.0F));

		PartDefinition Rightfoot = Rightankle.addOrReplaceChild("Rightfoot", CubeListBuilder.create().texOffs(42, 16).addBox(-2.0F, -0.5F, -2.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 6.9801F, 0.0722F, 0.23F, 0.0F, 0.0F));

		PartDefinition Righttoes = Rightfoot.addOrReplaceChild("Righttoes", CubeListBuilder.create().texOffs(42, 21).addBox(-2.0F, -0.5F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.01F, -2.5F, -0.48F, 0.0F, 0.0F));

		PartDefinition Righttoes2 = Rightankle.addOrReplaceChild("Righttoes2", CubeListBuilder.create(), PartPose.offset(-0.9F, 0.2435F, 0.356F));

		PartDefinition cube_r444 = Righttoes2.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(72, 76).addBox(-0.5F, -0.1F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.061F, -0.0019F, 0.0436F));

		PartDefinition Righttoes3 = Righttoes2.addOrReplaceChild("Righttoes3", CubeListBuilder.create(), PartPose.offset(-0.1659F, 3.8015F, 0.0322F));

		PartDefinition cube_r445 = Righttoes3.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(66, 22).addBox(-0.7F, -0.2F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0636F, 1.4405F, 0.4134F, 0.541F, -0.0019F, 0.0436F));

		PartDefinition cube_r446 = Righttoes3.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(44, 85).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2792F, -0.0019F, 0.0436F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3F, 3.6587F, -0.6761F, -0.5224F, 0.0F, 0.0F));

		PartDefinition cube_r447 = Leftthigh.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(25, 87).mirror().addBox(-0.5F, 0.2385F, 0.4538F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(20, 87).mirror().addBox(-0.5F, 0.2385F, -0.1212F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.5354F, -4.3812F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r448 = Leftthigh.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(41, 77).mirror().addBox(-1.0F, 0.0385F, -0.0212F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.5354F, -4.3812F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r449 = Leftthigh.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(35, 79).mirror().addBox(0.0F, 0.0F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 5.9661F, -2.1352F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r450 = Leftthigh.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(57, 9).mirror().addBox(0.0F, -0.8F, 0.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.771F, -1.2125F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r451 = Leftthigh.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(55, 80).mirror().addBox(0.0F, -0.3F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.0F, 0.1F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r452 = Leftthigh.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(65, 80).mirror().addBox(-1.0F, -1.6F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(64, 6).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2659F, 0.9435F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r453 = Leftthigh.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(34, 85).mirror().addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.0785F, 0.0982F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r454 = Leftthigh.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(80, 23).mirror().addBox(0.0F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5F, -0.4F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create().texOffs(55, 34).mirror().addBox(-0.1F, -0.0965F, -0.8026F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 11.3308F, -4.0215F, 0.8271F, 0.0752F, -0.1073F));

		PartDefinition cube_r455 = Leftshin.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(72, 82).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4F, 2.1957F, 1.6186F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r456 = Leftshin.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(73, 16).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9F, 0.8099F, 2.1926F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r457 = Leftshin.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(15, 86).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4F, 1.5949F, 0.6847F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r458 = Leftshin.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(14, 77).mirror().addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9F, 0.9035F, -0.8026F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r459 = Leftshin.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(44, 65).mirror().addBox(-0.5F, -2.2F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 1.7618F, 0.8128F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r460 = Leftshin.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(39, 65).mirror().addBox(-0.5F, -1.8F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 1.7618F, 0.8128F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r461 = Leftshin.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 3.6604F, 0.0088F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r462 = Leftshin.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(77, 85).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 2.9568F, 0.4934F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r463 = Leftshin.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(77, 80).mirror().addBox(-0.5F, -2.3F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 1.7618F, 0.8128F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r464 = Leftshin.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(80, 18).mirror().addBox(-0.5F, -2.4F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 1.7618F, 0.8128F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r465 = Leftshin.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(80, 28).mirror().addBox(-0.5F, -2.8F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 4.3183F, 0.3389F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r466 = Leftshin.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(12, 66).mirror().addBox(-0.5F, -4.8F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 8.9512F, 0.5762F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r467 = Leftshin.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(67, 74).mirror().addBox(-0.5F, -3.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 12.1838F, -0.152F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r468 = Leftshin.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(82, 86).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.9F, 10.8F, 0.613F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r469 = Leftshin.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4F, 5.823F, 1.0922F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r470 = Leftshin.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(71, 37).mirror().addBox(-1.0F, -1.6F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(71, 8).mirror().addBox(-1.5F, -2.6F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.4F, 3.4035F, 0.6974F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Leftankle = Leftshin.addOrReplaceChild("Leftankle", CubeListBuilder.create().texOffs(57, 0).mirror().addBox(-1.0F, -0.2565F, -0.444F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 12.9094F, -0.1655F, -0.9837F, -0.0186F, 0.016F));

		PartDefinition Leftfoot = Leftankle.addOrReplaceChild("Leftfoot", CubeListBuilder.create().texOffs(42, 16).mirror().addBox(-2.0F, -0.5F, -2.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.9801F, 0.0722F, 0.9185F, -0.0665F, 0.124F));

		PartDefinition Lefttoes = Leftfoot.addOrReplaceChild("Lefttoes", CubeListBuilder.create().texOffs(42, 21).mirror().addBox(-2.0F, -0.5F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.01F, -2.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Lefttoes2 = Leftankle.addOrReplaceChild("Lefttoes2", CubeListBuilder.create(), PartPose.offset(0.9F, 0.2435F, 0.356F));

		PartDefinition cube_r471 = Lefttoes2.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(72, 76).mirror().addBox(-0.5F, -0.1F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.061F, 0.0019F, -0.0436F));

		PartDefinition Lefttoes3 = Lefttoes2.addOrReplaceChild("Lefttoes3", CubeListBuilder.create(), PartPose.offset(0.1659F, 3.8015F, 0.0322F));

		PartDefinition cube_r472 = Lefttoes3.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(66, 22).mirror().addBox(-0.3F, -0.2F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0636F, 1.4405F, 0.4134F, 0.541F, 0.0019F, -0.0436F));

		PartDefinition cube_r473 = Lefttoes3.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(44, 85).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2792F, 0.0019F, -0.0436F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8813F, 3.8336F, -0.7812F, 0.0F, 0.0F, -0.1222F));

		PartDefinition cube_r474 = bone2.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(24, 58).addBox(-0.5F, -1.0F, -2.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4594F, -1.5327F, 1.0245F, 0.2705F, 0.0F, 0.2182F));

		PartDefinition cube_r475 = bone2.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(64, 0).addBox(-1.0745F, -1.5521F, -1.5988F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4F, -3.101F, 1.3451F, 1.6666F, 0.0067F, 0.1487F));

		PartDefinition cube_r476 = bone2.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(15, 81).addBox(-0.9995F, -2.3586F, -2.6436F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4F, -3.101F, 1.3451F, 1.2741F, 0.0F, 0.2182F));

		PartDefinition cube_r477 = bone2.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(53, 39).addBox(-3.1376F, -0.6454F, -0.3104F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.4F, 6.399F, -6.6549F, 0.9922F, -0.0375F, 0.1638F));

		PartDefinition cube_r478 = bone2.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(90, 0).addBox(-0.3032F, -5.6697F, -4.3549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.5764F, 1.2858F, 2.4836F, -3.0779F, -0.0007F, 0.227F));

		PartDefinition cube_r479 = bone2.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(73, 32).addBox(-0.8474F, -0.2481F, -2.5918F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.2764F, -0.2142F, 0.6836F, 2.1555F, 0.0F, 0.4363F));

		PartDefinition cube_r480 = bone2.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(40, 81).addBox(-0.8474F, -2.2143F, 0.1526F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-0.2764F, -0.2142F, 0.6836F, -2.7314F, 0.0F, 0.4363F));

		PartDefinition cube_r481 = bone2.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(87, 12).addBox(-0.8474F, -1.3852F, -1.5469F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(25, 64).addBox(-0.8474F, -1.3852F, -1.0469F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.2764F, -0.2142F, 0.6836F, 2.2864F, 0.0F, 0.4363F));

		PartDefinition cube_r482 = bone2.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(70, 54).addBox(-0.8474F, -0.4075F, -1.3334F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.2764F, -0.2142F, 0.6836F, 1.6319F, 0.0F, 0.4363F));

		PartDefinition cube_r483 = bone2.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(72, 68).addBox(-0.8474F, 0.1028F, -2.58F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2764F, -0.2142F, 0.6836F, 2.0246F, 0.0F, 0.4363F));

		PartDefinition cube_r484 = bone2.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(33, 60).addBox(-0.3032F, -0.7098F, -2.7666F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.5764F, 1.2858F, 2.4836F, 2.2454F, -0.0007F, 0.227F));

		PartDefinition cube_r485 = bone2.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(71, 0).addBox(-0.3032F, -0.7241F, -1.6294F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-1.5764F, 1.2858F, 2.4836F, 2.1145F, -0.0007F, 0.227F));

		PartDefinition cube_r486 = bone2.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(42, 8).addBox(-0.3032F, -1.1297F, -7.0056F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5764F, 1.2858F, 2.4836F, 2.4199F, -0.0007F, 0.227F));

		PartDefinition cube_r487 = bone2.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(0, 61).addBox(-3.2473F, -0.6186F, 3.183F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4F, 6.399F, -6.6549F, 0.9575F, -0.0581F, 0.215F));

		PartDefinition cube_r488 = bone2.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(73, 28).addBox(-0.5F, -0.425F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.8506F, -0.4714F, -2.4381F, -0.0294F, 0.1037F, 0.3124F));

		PartDefinition cube_r489 = bone2.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(73, 20).addBox(-0.5F, -0.225F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8506F, -0.4714F, -2.4381F, 0.5378F, 0.1037F, 0.3124F));

		PartDefinition cube_r490 = bone2.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(72, 64).addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.3985F, -1.6688F, -1.8409F, 2.0649F, 0.1037F, 0.3124F));

		PartDefinition cube_r491 = bone2.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(39, 85).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1988F)), PartPose.offsetAndRotation(-0.5755F, -1.2551F, -2.2378F, 0.8432F, 0.1037F, 0.3124F));

		PartDefinition cube_r492 = bone2.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(60, 60).addBox(-4.2205F, -0.7709F, 5.2547F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.4F, 6.399F, -6.6549F, 0.9741F, 0.1037F, 0.3124F));

		PartDefinition cube_r493 = bone2.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(66, 27).addBox(-0.5F, -1.6F, -0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2907F, -2.2933F, 0.1604F, 2.1903F, -0.0862F, 0.2639F));

		PartDefinition cube_r494 = bone2.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(89, 77).addBox(-0.4992F, -0.4322F, -2.4407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 54).addBox(-0.4992F, -0.6322F, -2.4407F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1758F, -2.6518F, 4.2112F, 2.6298F, 0.0348F, 0.1397F));

		PartDefinition cube_r495 = bone2.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(0, 90).addBox(-0.4992F, 0.5622F, -1.5049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1758F, -2.6518F, 4.2112F, -0.4682F, 0.0348F, 0.1397F));

		PartDefinition cube_r496 = bone2.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(51, 65).addBox(-0.4992F, -1.1182F, -0.6204F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1758F, -2.6518F, 4.2112F, -1.7772F, 0.0348F, 0.1397F));

		PartDefinition cube_r497 = bone2.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(73, 95).addBox(-0.4992F, -1.4273F, -2.0687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1758F, -2.6518F, 4.2112F, 2.9788F, 0.0348F, 0.1397F));

		PartDefinition cube_r498 = bone2.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(35, 95).addBox(-0.4992F, 1.4876F, -0.4325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(17, 70).addBox(-0.4992F, -1.2979F, 0.0298F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1758F, -2.6518F, 4.2112F, 1.4517F, 0.0348F, 0.1397F));

		PartDefinition cube_r499 = bone2.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(83, 94).addBox(-0.4992F, 0.7785F, -2.376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1758F, -2.6518F, 4.2112F, 2.8916F, 0.0348F, 0.1397F));

		PartDefinition cube_r500 = bone2.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(32, 70).addBox(-0.4992F, 0.1645F, -2.0354F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1758F, -2.6518F, 4.2112F, 2.717F, 0.0348F, 0.1397F));

		PartDefinition cube_r501 = bone2.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(69, 59).addBox(-0.4992F, -2.1123F, -3.1409F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1758F, -2.6518F, 4.2112F, -0.0319F, 0.0348F, 0.1397F));

		PartDefinition cube_r502 = bone2.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(82, 82).addBox(-1.4777F, 3.1711F, -1.0016F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.3F, -5.1008F, 1.1546F, -0.9599F, -0.5672F, 0.0524F));

		PartDefinition cube_r503 = bone2.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(10, 96).addBox(-1.4777F, 4.7626F, -1.1043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3F, -5.1008F, 1.1546F, -0.829F, -0.5672F, 0.0524F));

		PartDefinition cube_r504 = bone2.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(5, 96).addBox(-1.4777F, -2.1043F, -5.7626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -5.1008F, 1.1546F, 0.7418F, -0.5672F, 0.0524F));

		PartDefinition cube_r505 = bone2.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(15, 96).addBox(-1.4777F, -6.112F, -0.5282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(95, 89).addBox(-1.4777F, -5.8113F, 0.4255F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3F, -5.1008F, 1.1546F, 1.8762F, -0.5672F, 0.0524F));

		PartDefinition cube_r506 = bone2.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(0, 96).addBox(-1.4777F, -5.971F, -1.388F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -5.1008F, 1.1546F, 1.5708F, -0.5672F, 0.0524F));

		PartDefinition cube_r507 = bone2.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(51, 70).addBox(-1.4777F, -1.8683F, 3.0163F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -5.1008F, 1.1546F, -3.098F, -0.5672F, 0.0524F));

		PartDefinition cube_r508 = bone2.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(32, 65).addBox(-0.3681F, 1.2721F, 0.1143F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3F, -5.1008F, 1.1546F, -1.6057F, -0.2182F, 0.0524F));

		PartDefinition cube_r509 = bone2.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(5, 66).addBox(-0.2F, 0.2279F, -1.283F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3F, -5.1008F, 1.1546F, -0.1222F, -0.0873F, 0.0524F));

		PartDefinition bone3 = Hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8813F, 7.583F, -0.8499F, 0.0F, 0.0F, 0.1222F));

		PartDefinition cube_r510 = bone3.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(24, 58).mirror().addBox(-0.5F, -1.0F, -2.2F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.4594F, -5.2821F, 1.0932F, 0.2705F, 0.0F, -0.2182F));

		PartDefinition cube_r511 = bone3.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(64, 0).mirror().addBox(0.0745F, -1.5521F, -1.5988F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -6.8504F, 1.4138F, 1.6666F, -0.0067F, -0.1487F));

		PartDefinition cube_r512 = bone3.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(15, 81).mirror().addBox(-0.0005F, -2.3586F, -2.6436F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -6.8504F, 1.4138F, 1.2741F, 0.0F, -0.2182F));

		PartDefinition cube_r513 = bone3.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(53, 39).mirror().addBox(2.1376F, -0.6454F, -0.3104F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 2.6496F, -6.5862F, 0.9922F, 0.0375F, -0.1638F));

		PartDefinition cube_r514 = bone3.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(90, 0).mirror().addBox(-0.6968F, -5.6697F, -4.3549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.5764F, -2.4635F, 2.5523F, -3.0779F, 0.0007F, -0.227F));

		PartDefinition cube_r515 = bone3.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(73, 32).mirror().addBox(-0.1526F, -0.2481F, -2.5918F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.2764F, -3.9635F, 0.7523F, 2.1555F, 0.0F, -0.4363F));

		PartDefinition cube_r516 = bone3.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(40, 81).mirror().addBox(-0.1526F, -2.2143F, 0.1526F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(0.2764F, -3.9635F, 0.7523F, -2.7314F, 0.0F, -0.4363F));

		PartDefinition cube_r517 = bone3.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(87, 12).mirror().addBox(-0.1526F, -1.3852F, -1.5469F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(25, 64).mirror().addBox(-0.1526F, -1.3852F, -1.0469F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.2764F, -3.9635F, 0.7523F, 2.2864F, 0.0F, -0.4363F));

		PartDefinition cube_r518 = bone3.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(70, 54).mirror().addBox(-0.1526F, -0.4075F, -1.3334F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.2764F, -3.9635F, 0.7523F, 1.6319F, 0.0F, -0.4363F));

		PartDefinition cube_r519 = bone3.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(72, 68).mirror().addBox(-0.1526F, 0.1028F, -2.58F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2764F, -3.9635F, 0.7523F, 2.0246F, 0.0F, -0.4363F));

		PartDefinition cube_r520 = bone3.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(33, 60).mirror().addBox(-0.6968F, -0.7098F, -2.7666F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.5764F, -2.4635F, 2.5523F, 2.2454F, 0.0007F, -0.227F));

		PartDefinition cube_r521 = bone3.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(71, 0).mirror().addBox(-0.6968F, -0.7241F, -1.6294F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(1.5764F, -2.4635F, 2.5523F, 2.1145F, 0.0007F, -0.227F));

		PartDefinition cube_r522 = bone3.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(42, 8).mirror().addBox(-0.6968F, -1.1297F, -7.0056F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5764F, -2.4635F, 2.5523F, 2.4199F, 0.0007F, -0.227F));

		PartDefinition cube_r523 = bone3.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(2.2473F, -0.6186F, 3.183F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 2.6496F, -6.5862F, 0.9575F, 0.0581F, -0.215F));

		PartDefinition cube_r524 = bone3.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(73, 28).mirror().addBox(-0.5F, -0.425F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.8506F, -4.2207F, -2.3694F, -0.0294F, -0.1037F, -0.3124F));

		PartDefinition cube_r525 = bone3.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(73, 20).mirror().addBox(-0.5F, -0.225F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.8506F, -4.2207F, -2.3694F, 0.5378F, -0.1037F, -0.3124F));

		PartDefinition cube_r526 = bone3.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(72, 64).mirror().addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.3985F, -5.4181F, -1.7722F, 2.0649F, -0.1037F, -0.3124F));

		PartDefinition cube_r527 = bone3.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(39, 85).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1988F)).mirror(false), PartPose.offsetAndRotation(0.5755F, -5.0045F, -2.1691F, 0.8432F, -0.1037F, -0.3124F));

		PartDefinition cube_r528 = bone3.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(60, 60).mirror().addBox(3.2205F, -0.7709F, 5.2547F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 2.6496F, -6.5862F, 0.9741F, -0.1037F, -0.3124F));

		PartDefinition cube_r529 = bone3.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(66, 27).mirror().addBox(-0.5F, -1.6F, -0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2907F, -6.0427F, 0.2292F, 2.1903F, 0.0862F, -0.2639F));

		PartDefinition cube_r530 = bone3.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(89, 77).mirror().addBox(-0.5008F, -0.4322F, -2.4407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 54).mirror().addBox(-0.5008F, -0.6322F, -2.4407F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.1758F, -6.4011F, 4.2799F, 2.6298F, -0.0348F, -0.1397F));

		PartDefinition cube_r531 = bone3.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(0, 90).mirror().addBox(-0.5008F, 0.5622F, -1.5049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1758F, -6.4011F, 4.2799F, -0.4682F, -0.0348F, -0.1397F));

		PartDefinition cube_r532 = bone3.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(51, 65).mirror().addBox(-0.5008F, -1.1182F, -0.6204F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.1758F, -6.4011F, 4.2799F, -1.7772F, -0.0348F, -0.1397F));

		PartDefinition cube_r533 = bone3.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(73, 95).mirror().addBox(-0.5008F, -1.4273F, -2.0687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.1758F, -6.4011F, 4.2799F, 2.9788F, -0.0348F, -0.1397F));

		PartDefinition cube_r534 = bone3.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(35, 95).mirror().addBox(-0.5008F, 1.4876F, -0.4325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(17, 70).mirror().addBox(-0.5008F, -1.2979F, 0.0298F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.1758F, -6.4011F, 4.2799F, 1.4517F, -0.0348F, -0.1397F));

		PartDefinition cube_r535 = bone3.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(83, 94).mirror().addBox(-0.5008F, 0.7785F, -2.376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1758F, -6.4011F, 4.2799F, 2.8916F, -0.0348F, -0.1397F));

		PartDefinition cube_r536 = bone3.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(32, 70).mirror().addBox(-0.5008F, 0.1645F, -2.0354F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1758F, -6.4011F, 4.2799F, 2.717F, -0.0348F, -0.1397F));

		PartDefinition cube_r537 = bone3.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(69, 59).mirror().addBox(-0.5008F, -2.1123F, -3.1409F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1758F, -6.4011F, 4.2799F, -0.0319F, -0.0348F, -0.1397F));

		PartDefinition cube_r538 = bone3.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(82, 82).mirror().addBox(0.4777F, 3.1711F, -1.0016F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.3F, -8.8502F, 1.2234F, -0.9599F, 0.5672F, -0.0524F));

		PartDefinition cube_r539 = bone3.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(10, 96).mirror().addBox(0.4777F, 4.7626F, -1.1043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.3F, -8.8502F, 1.2234F, -0.829F, 0.5672F, -0.0524F));

		PartDefinition cube_r540 = bone3.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(5, 96).mirror().addBox(0.4777F, -2.1043F, -5.7626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, -8.8502F, 1.2234F, 0.7418F, 0.5672F, -0.0524F));

		PartDefinition cube_r541 = bone3.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(15, 96).mirror().addBox(0.4777F, -6.112F, -0.5282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(95, 89).mirror().addBox(0.4777F, -5.8113F, 0.4255F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.3F, -8.8502F, 1.2234F, 1.8762F, 0.5672F, -0.0524F));

		PartDefinition cube_r542 = bone3.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(0, 96).mirror().addBox(0.4777F, -5.971F, -1.388F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, -8.8502F, 1.2234F, 1.5708F, 0.5672F, -0.0524F));

		PartDefinition cube_r543 = bone3.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(51, 70).mirror().addBox(0.4777F, -1.8683F, 3.0163F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, -8.8502F, 1.2234F, -3.098F, 0.5672F, -0.0524F));

		PartDefinition cube_r544 = bone3.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(32, 65).mirror().addBox(-0.6319F, 1.2721F, 0.1143F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.3F, -8.8502F, 1.2234F, -1.6057F, 0.2182F, -0.0524F));

		PartDefinition cube_r545 = bone3.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(5, 66).mirror().addBox(-0.8F, 0.2279F, -1.283F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.3F, -8.8502F, 1.2234F, -0.1222F, 0.0873F, -0.0524F));

		return LayerDefinition.create(meshdefinition, 105, 105);
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