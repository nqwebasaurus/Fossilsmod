package fossils.fossils.client.blockentity.model.elaphrosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ElaphrosaurusFossilModel extends SkullModelBase {
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
	private final ModelPart Neckfront4;
	private final ModelPart Neckfront5;
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
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart Leftankle;
	private final ModelPart Leftfoot;
	private final ModelPart Lefttoes;
	private final ModelPart bone2;
	private final ModelPart bone3;

	public ElaphrosaurusFossilModel(ModelPart root) {
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
		this.Neckfront4 = this.Neckfront3.getChild("Neckfront4");
		this.Neckfront5 = this.Neckfront4.getChild("Neckfront5");
		this.Head = this.Neckfront5.getChild("Head");
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
		this.Leftthigh = this.Hips.getChild("Leftthigh");
		this.Leftshin = this.Leftthigh.getChild("Leftshin");
		this.Leftankle = this.Leftshin.getChild("Leftankle");
		this.Leftfoot = this.Leftankle.getChild("Leftfoot");
		this.Lefttoes = this.Leftfoot.getChild("Lefttoes");
		this.bone2 = this.Hips.getChild("bone2");
		this.bone3 = this.Hips.getChild("bone3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -8.72F, 1.0F, -0.1562F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r1 = Hips.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(36, 40).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7893F, -2.6168F, -0.096F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, -0.5F, 1.9F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -5.9F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -4.0F, -0.0134F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = Bodymiddle.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(98, 49).addBox(0.0F, -1.7F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6149F, -0.3322F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = Bodymiddle.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(85, 39).mirror().addBox(-2.8926F, -0.2651F, -0.5929F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0018F, -0.4433F, -0.18F, -0.2575F, -1.2524F));

		PartDefinition Bodyfront_r4 = Bodymiddle.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(97, 79).mirror().addBox(-0.9156F, 0.169F, -0.5929F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0018F, -0.4433F, -0.2764F, -0.1489F, -0.7838F));

		PartDefinition Bodyfront_r5 = Bodymiddle.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(97, 71).mirror().addBox(-0.8777F, 0.0726F, -0.4171F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0783F, -2.5494F, -0.1967F, -0.0714F, -0.6394F));

		PartDefinition Bodyfront_r6 = Bodymiddle.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(85, 37).mirror().addBox(-2.815F, -0.3338F, -0.4171F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0783F, -2.5494F, -0.1435F, -0.1527F, -1.1067F));

		PartDefinition Bodyfront_r7 = Bodymiddle.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(97, 73).mirror().addBox(-3.271F, -1.6966F, -0.4171F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0783F, -2.5494F, -0.0474F, -0.2038F, -1.6364F));

		PartDefinition Bodyfront_r8 = Bodymiddle.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(81, 84).mirror().addBox(-4.4376F, -1.7211F, -0.4491F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3356F, -4.4554F, -0.0348F, -0.1175F, -1.5162F));

		PartDefinition Bodyfront_r9 = Bodymiddle.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(15, 85).mirror().addBox(-2.9716F, -0.2717F, -0.4491F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3356F, -4.4554F, -0.089F, -0.0844F, -0.9909F));

		PartDefinition Bodyfront_r10 = Bodymiddle.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(97, 69).mirror().addBox(-0.989F, 0.199F, -0.4491F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3356F, -4.4554F, -0.1175F, -0.0349F, -0.5214F));

		PartDefinition Bodyfront_r11 = Bodymiddle.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(97, 79).addBox(-0.0844F, 0.169F, -0.5929F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0018F, -0.4433F, -0.2764F, 0.1489F, 0.7838F));

		PartDefinition Bodyfront_r12 = Bodymiddle.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(85, 39).addBox(0.8926F, -0.2651F, -0.5929F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0018F, -0.4433F, -0.18F, 0.2575F, 1.2524F));

		PartDefinition Bodyfront_r13 = Bodymiddle.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(98, 29).addBox(0.0F, -1.3985F, -1.9864F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7513F, -0.8883F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r14 = Bodymiddle.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(97, 75).addBox(0.0F, -1.2107F, 4.0086F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4797F, -8.8601F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r15 = Bodymiddle.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(97, 73).addBox(2.271F, -1.6966F, -0.4171F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0783F, -2.5494F, -0.0474F, 0.2038F, 1.6364F));

		PartDefinition Bodyfront_r16 = Bodymiddle.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(85, 37).addBox(0.815F, -0.3338F, -0.4171F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0783F, -2.5494F, -0.1435F, 0.1527F, 1.1067F));

		PartDefinition Bodyfront_r17 = Bodymiddle.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(97, 71).addBox(-0.1223F, 0.0726F, -0.4171F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0783F, -2.5494F, -0.1967F, 0.0714F, 0.6394F));

		PartDefinition Bodyfront_r18 = Bodymiddle.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(97, 69).addBox(-0.011F, 0.199F, -0.4491F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3356F, -4.4554F, -0.1175F, 0.0349F, 0.5214F));

		PartDefinition Bodyfront_r19 = Bodymiddle.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(15, 85).addBox(0.9716F, -0.2717F, -0.4491F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3356F, -4.4554F, -0.089F, 0.0844F, 0.9909F));

		PartDefinition Bodyfront_r20 = Bodymiddle.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(81, 84).addBox(2.4377F, -1.7211F, -0.4491F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3356F, -4.4554F, -0.0348F, 0.1175F, 1.5162F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(19, 40).addBox(-2.0F, -2.8245F, -3.8162F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.4881F, -2.9814F, -0.3403F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r2 = Bodymiddle.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(17, 48).addBox(-0.5F, -0.5F, 5.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.6619F, -10.7266F, -0.0698F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.2504F, -4.8608F, 0.0704F, -0.1306F, -0.0092F));

		PartDefinition Bodymiddle_r3 = body.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(42, 11).addBox(-2.0F, -1.9F, -3.9F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 8.6022F, -1.6844F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r4 = body.addOrReplaceChild("Bodymiddle_r4", CubeListBuilder.create().texOffs(0, 49).addBox(-0.5F, -0.5F, 0.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, -0.4114F, -5.8658F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r21 = body.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(97, 45).addBox(0.0F, -1.4279F, -0.0013F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6908F, -2.0321F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r22 = body.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(58, 79).addBox(0.0F, -0.8455F, -0.0021F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2293F, -3.9993F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r23 = body.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(66, 61).mirror().addBox(-5.4058F, -1.7416F, -0.6329F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2426F, -1.3962F, -0.0269F, -0.1013F, -1.4124F));

		PartDefinition Bodyfront_r24 = body.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(80, 43).mirror().addBox(-2.9543F, -0.3053F, -0.6329F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2426F, -1.3962F, -0.074F, -0.0743F, -0.8875F));

		PartDefinition Bodyfront_r25 = body.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(30, 48).mirror().addBox(-0.9889F, 0.1612F, -0.6329F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2426F, -1.3962F, -0.0996F, -0.0326F, -0.4173F));

		PartDefinition Bodyfront_r26 = body.addOrReplaceChild("Bodyfront_r26", CubeListBuilder.create().texOffs(59, 16).mirror().addBox(-6.6597F, -2.1988F, -0.6008F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4F, -3.4F, -0.0057F, -0.0166F, -1.4311F));

		PartDefinition Bodyfront_r27 = body.addOrReplaceChild("Bodyfront_r27", CubeListBuilder.create().texOffs(80, 29).mirror().addBox(-3.4028F, -0.5744F, -0.6008F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4F, -3.4F, -0.0133F, -0.0115F, -0.9075F));

		PartDefinition Bodyfront_r28 = body.addOrReplaceChild("Bodyfront_r28", CubeListBuilder.create().texOffs(79, 70).mirror().addBox(-1.5107F, 0.1251F, -0.6008F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4F, -3.4F, -0.0171F, -0.0043F, -0.4363F));

		PartDefinition Bodyfront_r29 = body.addOrReplaceChild("Bodyfront_r29", CubeListBuilder.create().texOffs(66, 61).addBox(2.4058F, -1.7416F, -0.6329F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2426F, -1.3962F, -0.0269F, 0.1013F, 1.4124F));

		PartDefinition Bodyfront_r30 = body.addOrReplaceChild("Bodyfront_r30", CubeListBuilder.create().texOffs(80, 43).addBox(0.9543F, -0.3053F, -0.6329F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2426F, -1.3962F, -0.074F, 0.0743F, 0.8875F));

		PartDefinition Bodyfront_r31 = body.addOrReplaceChild("Bodyfront_r31", CubeListBuilder.create().texOffs(30, 48).addBox(-0.0111F, 0.1612F, -0.6329F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2426F, -1.3962F, -0.0996F, 0.0326F, 0.4173F));

		PartDefinition Bodyfront_r32 = body.addOrReplaceChild("Bodyfront_r32", CubeListBuilder.create().texOffs(59, 16).addBox(2.6597F, -2.1988F, -0.6008F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.4F, -0.0057F, 0.0166F, 1.4311F));

		PartDefinition Bodyfront_r33 = body.addOrReplaceChild("Bodyfront_r33", CubeListBuilder.create().texOffs(80, 29).addBox(1.4028F, -0.5744F, -0.6008F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.4F, -0.0133F, 0.0115F, 0.9075F));

		PartDefinition Bodyfront_r34 = body.addOrReplaceChild("Bodyfront_r34", CubeListBuilder.create().texOffs(79, 70).addBox(-0.4893F, 0.1251F, -0.6008F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.4F, -0.0171F, 0.0043F, 0.4363F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(51, 40).addBox(-2.4531F, -0.3537F, -3.8651F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(48, 97).addBox(-1.9531F, -1.3956F, -2.7827F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 97).addBox(-1.9531F, -1.4258F, -0.7814F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.4531F, -0.4804F, -5.0607F));

		PartDefinition Bodyfront_r35 = body2.addOrReplaceChild("Bodyfront_r35", CubeListBuilder.create().texOffs(57, 28).mirror().addBox(-7.5553F, -2.2226F, -0.6654F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4531F, -0.072F, -0.1007F, 0.0112F, 0.0511F, -1.4134F));

		PartDefinition Bodyfront_r36 = body2.addOrReplaceChild("Bodyfront_r36", CubeListBuilder.create().texOffs(5, 81).mirror().addBox(-3.3242F, -0.6472F, -0.6654F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4531F, -0.072F, -0.1007F, 0.0353F, 0.0387F, -0.8894F));

		PartDefinition Bodyfront_r37 = body2.addOrReplaceChild("Bodyfront_r37", CubeListBuilder.create().texOffs(80, 63).mirror().addBox(-1.4737F, 0.0246F, -0.6654F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4531F, -0.072F, -0.1007F, 0.049F, 0.0185F, -0.4184F));

		PartDefinition Bodyfront_r38 = body2.addOrReplaceChild("Bodyfront_r38", CubeListBuilder.create().texOffs(55, 37).mirror().addBox(-7.5432F, -2.2203F, -0.5679F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4531F, 0.0755F, -2.1942F, 0.0211F, 0.1381F, -1.4298F));

		PartDefinition Bodyfront_r39 = body2.addOrReplaceChild("Bodyfront_r39", CubeListBuilder.create().texOffs(80, 45).mirror().addBox(-3.3126F, -0.6513F, -0.5679F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4531F, 0.0755F, -2.1942F, 0.0875F, 0.109F, -0.9029F));

		PartDefinition Bodyfront_r40 = body2.addOrReplaceChild("Bodyfront_r40", CubeListBuilder.create().texOffs(75, 61).mirror().addBox(-1.4652F, 0.0156F, -0.5679F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4531F, 0.0755F, -2.1942F, 0.1273F, 0.0575F, -0.4327F));

		PartDefinition Bodyfront_r41 = body2.addOrReplaceChild("Bodyfront_r41", CubeListBuilder.create().texOffs(57, 28).addBox(2.5553F, -2.2226F, -0.6654F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4531F, -0.072F, -0.1007F, 0.0112F, -0.0511F, 1.4134F));

		PartDefinition Bodyfront_r42 = body2.addOrReplaceChild("Bodyfront_r42", CubeListBuilder.create().texOffs(5, 81).addBox(1.3242F, -0.6472F, -0.6654F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4531F, -0.072F, -0.1007F, 0.0353F, -0.0387F, 0.8894F));

		PartDefinition Bodyfront_r43 = body2.addOrReplaceChild("Bodyfront_r43", CubeListBuilder.create().texOffs(80, 63).addBox(-0.5263F, 0.0246F, -0.6654F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4531F, -0.072F, -0.1007F, 0.049F, -0.0185F, 0.4184F));

		PartDefinition Bodyfront_r44 = body2.addOrReplaceChild("Bodyfront_r44", CubeListBuilder.create().texOffs(55, 37).addBox(2.5432F, -2.2203F, -0.5679F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4531F, 0.0755F, -2.1942F, 0.0211F, -0.1381F, 1.4298F));

		PartDefinition Bodyfront_r45 = body2.addOrReplaceChild("Bodyfront_r45", CubeListBuilder.create().texOffs(80, 45).addBox(1.3126F, -0.6513F, -0.5679F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4531F, 0.0755F, -2.1942F, 0.0875F, -0.109F, 0.9029F));

		PartDefinition Bodyfront_r46 = body2.addOrReplaceChild("Bodyfront_r46", CubeListBuilder.create().texOffs(75, 61).addBox(-0.5348F, 0.0156F, -0.5679F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4531F, 0.0755F, -2.1942F, 0.1273F, -0.0575F, 0.4327F));

		PartDefinition Bodyfront_r47 = body2.addOrReplaceChild("Bodyfront_r47", CubeListBuilder.create().texOffs(57, 50).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9531F, 8.5463F, -0.4651F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body2.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(30, 50).addBox(-0.5F, -0.6F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(95, 98).addBox(0.0F, -1.4829F, -4.954F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9531F, 0.2309F, -3.7428F, 0.151F, -0.1294F, -0.0196F));

		PartDefinition Bodyfront_r48 = Bodyfront.addOrReplaceChild("Bodyfront_r48", CubeListBuilder.create().texOffs(64, 47).mirror().addBox(-4.0F, 0.0F, -0.4F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.372F, 6.1081F, -3.0644F, -1.0171F, 1.0591F, -0.0659F));

		PartDefinition Bodyfront_r49 = Bodyfront.addOrReplaceChild("Bodyfront_r49", CubeListBuilder.create().texOffs(71, 30).mirror().addBox(-3.0F, 0.0F, -0.4F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.372F, 6.1081F, -3.0644F, -0.3778F, 0.7429F, 0.6584F));

		PartDefinition Bodyfront_r50 = Bodyfront.addOrReplaceChild("Bodyfront_r50", CubeListBuilder.create().texOffs(70, 70).mirror().addBox(-2.7F, 0.0F, -0.1F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 5.6556F, -3.9557F, -0.1626F, 0.4436F, 1.1438F));

		PartDefinition Bodyfront_r51 = Bodyfront.addOrReplaceChild("Bodyfront_r51", CubeListBuilder.create().texOffs(70, 16).mirror().addBox(-2.4F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 5.6556F, -3.9557F, -0.2605F, 0.029F, 1.2027F));

		PartDefinition Bodyfront_r52 = Bodyfront.addOrReplaceChild("Bodyfront_r52", CubeListBuilder.create().texOffs(11, 61).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 5.0216F, -5.3152F, -0.4548F, 0.276F, -0.1325F));

		PartDefinition Bodyfront_r53 = Bodyfront.addOrReplaceChild("Bodyfront_r53", CubeListBuilder.create().texOffs(97, 67).mirror().addBox(-0.8895F, 0.0874F, -0.4079F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1111F, -4.3486F, 0.4035F, 0.1711F, -0.5056F));

		PartDefinition Bodyfront_r54 = Bodyfront.addOrReplaceChild("Bodyfront_r54", CubeListBuilder.create().texOffs(84, 12).mirror().addBox(-2.8323F, -0.3259F, -0.4079F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1111F, -4.3486F, 0.287F, 0.3335F, -0.9632F));

		PartDefinition Bodyfront_r55 = Bodyfront.addOrReplaceChild("Bodyfront_r55", CubeListBuilder.create().texOffs(24, 84).mirror().addBox(-4.2898F, -1.6984F, -0.4079F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1111F, -4.3486F, 0.0748F, 0.4304F, -1.5191F));

		PartDefinition Bodyfront_r56 = Bodyfront.addOrReplaceChild("Bodyfront_r56", CubeListBuilder.create().texOffs(53, 64).mirror().addBox(-6.4356F, -2.2322F, -0.4305F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0579F, -0.4381F, 0.0137F, 0.0862F, -1.448F));

		PartDefinition Bodyfront_r57 = Bodyfront.addOrReplaceChild("Bodyfront_r57", CubeListBuilder.create().texOffs(84, 26).mirror().addBox(-1.4166F, -0.0811F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0579F, -0.4381F, 0.0798F, 0.0355F, -0.4524F));

		PartDefinition Bodyfront_r58 = Bodyfront.addOrReplaceChild("Bodyfront_r58", CubeListBuilder.create().texOffs(51, 84).mirror().addBox(-3.2254F, -0.7154F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0579F, -0.4381F, 0.055F, 0.0678F, -0.9232F));

		PartDefinition Bodyfront_r59 = Bodyfront.addOrReplaceChild("Bodyfront_r59", CubeListBuilder.create().texOffs(71, 63).mirror().addBox(-5.2943F, -1.6923F, -0.2809F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1111F, -2.5486F, 0.0624F, 0.2562F, -1.3662F));

		PartDefinition Bodyfront_r60 = Bodyfront.addOrReplaceChild("Bodyfront_r60", CubeListBuilder.create().texOffs(83, 35).mirror().addBox(-2.8331F, -0.3184F, -0.2809F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1111F, -2.5486F, 0.1833F, 0.1905F, -0.8331F));

		PartDefinition Bodyfront_r61 = Bodyfront.addOrReplaceChild("Bodyfront_r61", CubeListBuilder.create().texOffs(97, 21).mirror().addBox(-0.8868F, 0.0945F, -0.2809F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1111F, -2.5486F, 0.2489F, 0.0875F, -0.3685F));

		PartDefinition Bodyfront_r62 = Bodyfront.addOrReplaceChild("Bodyfront_r62", CubeListBuilder.create().texOffs(51, 84).addBox(1.2254F, -0.7154F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0579F, -0.4381F, 0.055F, -0.0678F, 0.9232F));

		PartDefinition Bodyfront_r63 = Bodyfront.addOrReplaceChild("Bodyfront_r63", CubeListBuilder.create().texOffs(84, 26).addBox(-0.5834F, -0.0811F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0579F, -0.4381F, 0.0798F, -0.0355F, 0.4524F));

		PartDefinition Bodyfront_r64 = Bodyfront.addOrReplaceChild("Bodyfront_r64", CubeListBuilder.create().texOffs(53, 64).addBox(2.4356F, -2.2322F, -0.4305F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0579F, -0.4381F, 0.0137F, -0.0862F, 1.448F));

		PartDefinition Bodyfront_r65 = Bodyfront.addOrReplaceChild("Bodyfront_r65", CubeListBuilder.create().texOffs(24, 84).addBox(2.2898F, -1.6984F, -0.4079F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1111F, -4.3486F, 0.0748F, -0.4304F, 1.5191F));

		PartDefinition Bodyfront_r66 = Bodyfront.addOrReplaceChild("Bodyfront_r66", CubeListBuilder.create().texOffs(84, 12).addBox(0.8322F, -0.3259F, -0.4079F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1111F, -4.3486F, 0.287F, -0.3335F, 0.9632F));

		PartDefinition Bodyfront_r67 = Bodyfront.addOrReplaceChild("Bodyfront_r67", CubeListBuilder.create().texOffs(97, 67).addBox(-0.1105F, 0.0874F, -0.4079F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1111F, -4.3486F, 0.4035F, -0.1711F, 0.5056F));

		PartDefinition Bodyfront_r68 = Bodyfront.addOrReplaceChild("Bodyfront_r68", CubeListBuilder.create().texOffs(97, 21).addBox(-0.1132F, 0.0945F, -0.2809F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1111F, -2.5486F, 0.2489F, -0.0875F, 0.3685F));

		PartDefinition Bodyfront_r69 = Bodyfront.addOrReplaceChild("Bodyfront_r69", CubeListBuilder.create().texOffs(83, 35).addBox(0.8331F, -0.3184F, -0.2809F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1111F, -2.5486F, 0.1833F, -0.1905F, 0.8331F));

		PartDefinition Bodyfront_r70 = Bodyfront.addOrReplaceChild("Bodyfront_r70", CubeListBuilder.create().texOffs(71, 63).addBox(2.2943F, -1.6923F, -0.2809F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1111F, -2.5486F, 0.0624F, -0.2562F, 1.3662F));

		PartDefinition Bodyfront_r71 = Bodyfront.addOrReplaceChild("Bodyfront_r71", CubeListBuilder.create().texOffs(99, 0).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5074F, -0.9301F, -0.096F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r72 = Bodyfront.addOrReplaceChild("Bodyfront_r72", CubeListBuilder.create().texOffs(98, 98).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.612F, -2.9273F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r73 = Bodyfront.addOrReplaceChild("Bodyfront_r73", CubeListBuilder.create().texOffs(11, 61).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.0F, 5.0216F, -5.3152F, -0.4548F, -0.276F, 0.1325F));

		PartDefinition Bodyfront_r74 = Bodyfront.addOrReplaceChild("Bodyfront_r74", CubeListBuilder.create().texOffs(51, 46).addBox(-2.0F, 0.8F, -4.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(57, 18).addBox(-1.0F, 0.8F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.9F, -2.5F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r75 = Bodyfront.addOrReplaceChild("Bodyfront_r75", CubeListBuilder.create().texOffs(64, 47).addBox(0.0F, 0.0F, -0.4F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.372F, 6.1081F, -3.0644F, -1.0171F, -1.0591F, 0.0659F));

		PartDefinition Bodyfront_r76 = Bodyfront.addOrReplaceChild("Bodyfront_r76", CubeListBuilder.create().texOffs(71, 30).addBox(0.0F, 0.0F, -0.4F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.372F, 6.1081F, -3.0644F, -0.3778F, -0.7429F, -0.6584F));

		PartDefinition Bodyfront_r77 = Bodyfront.addOrReplaceChild("Bodyfront_r77", CubeListBuilder.create().texOffs(70, 70).addBox(-0.3F, 0.0F, -0.1F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 5.6556F, -3.9557F, -0.1626F, -0.4436F, -1.1438F));

		PartDefinition Bodyfront_r78 = Bodyfront.addOrReplaceChild("Bodyfront_r78", CubeListBuilder.create().texOffs(70, 16).addBox(-0.6F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 5.6556F, -3.9557F, -0.2605F, -0.029F, -1.2027F));

		PartDefinition Neckbase = Bodyfront.addOrReplaceChild("Neckbase", CubeListBuilder.create().texOffs(13, 55).addBox(-0.5F, -0.5725F, -3.8378F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F))
				.texOffs(89, 98).addBox(0.0F, -1.1725F, -3.8378F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 98).addBox(0.0F, -1.1725F, -1.8378F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.097F, -0.0671F, -0.1306F, 0.0087F));

		PartDefinition Bodyfront_r79 = Neckbase.addOrReplaceChild("Bodyfront_r79", CubeListBuilder.create().texOffs(82, 22).mirror().addBox(-2.1376F, 0.0388F, -0.5418F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0132F, -3.5992F, 0.5453F, 0.8024F, -0.8727F));

		PartDefinition Bodyfront_r80 = Neckbase.addOrReplaceChild("Bodyfront_r80", CubeListBuilder.create().texOffs(82, 24).mirror().addBox(-3.9222F, -0.9359F, -0.5418F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0132F, -3.5992F, -0.0089F, 0.9345F, -1.5846F));

		PartDefinition Bodyfront_r81 = Neckbase.addOrReplaceChild("Bodyfront_r81", CubeListBuilder.create().texOffs(82, 20).mirror().addBox(-2.0638F, 0.0034F, -0.42F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0132F, -1.5992F, 0.5096F, 0.5208F, -0.8086F));

		PartDefinition Bodyfront_r82 = Neckbase.addOrReplaceChild("Bodyfront_r82", CubeListBuilder.create().texOffs(68, 37).mirror().addBox(-4.8405F, -0.9339F, -0.42F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0132F, -1.5992F, 0.197F, 0.6885F, -1.3475F));

		PartDefinition Bodyfront_r83 = Neckbase.addOrReplaceChild("Bodyfront_r83", CubeListBuilder.create().texOffs(82, 24).addBox(1.9222F, -0.9359F, -0.5418F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0132F, -3.5992F, -0.0089F, -0.9345F, 1.5846F));

		PartDefinition Bodyfront_r84 = Neckbase.addOrReplaceChild("Bodyfront_r84", CubeListBuilder.create().texOffs(82, 22).addBox(0.1376F, 0.0388F, -0.5418F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0132F, -3.5992F, 0.5453F, -0.8024F, 0.8727F));

		PartDefinition Bodyfront_r85 = Neckbase.addOrReplaceChild("Bodyfront_r85", CubeListBuilder.create().texOffs(82, 20).addBox(0.0638F, 0.0034F, -0.42F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0132F, -1.5992F, 0.5096F, -0.5208F, 0.8086F));

		PartDefinition Bodyfront_r86 = Neckbase.addOrReplaceChild("Bodyfront_r86", CubeListBuilder.create().texOffs(68, 37).addBox(1.8405F, -0.9339F, -0.42F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0132F, -1.5992F, 0.197F, -0.6885F, 1.3475F));

		PartDefinition Neckmiddlebase = Neckbase.addOrReplaceChild("Neckmiddlebase", CubeListBuilder.create().texOffs(61, 0).addBox(-0.5F, -0.3703F, -2.9737F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(98, 87).addBox(0.0F, -0.9703F, -1.9737F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1575F, -3.6441F, -0.4571F, -0.0549F, -0.0713F));

		PartDefinition Bodyfront_r87 = Neckmiddlebase.addOrReplaceChild("Bodyfront_r87", CubeListBuilder.create().texOffs(12, 81).mirror().addBox(-1.9494F, -0.0552F, -0.56F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2443F, -1.5552F, 0.5528F, 1.0255F, -0.8789F));

		PartDefinition Bodyfront_r88 = Neckmiddlebase.addOrReplaceChild("Bodyfront_r88", CubeListBuilder.create().texOffs(24, 55).mirror().addBox(-2.7119F, -0.9342F, -0.56F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2443F, -1.5552F, -0.3183F, 1.0874F, -1.8603F));

		PartDefinition Bodyfront_r89 = Neckmiddlebase.addOrReplaceChild("Bodyfront_r89", CubeListBuilder.create().texOffs(24, 55).addBox(1.7119F, -0.9342F, -0.56F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2443F, -1.5552F, -0.3183F, -1.0874F, 1.8603F));

		PartDefinition Bodyfront_r90 = Neckmiddlebase.addOrReplaceChild("Bodyfront_r90", CubeListBuilder.create().texOffs(12, 81).addBox(-0.0506F, -0.0552F, -0.56F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2443F, -1.5552F, 0.5528F, -1.0255F, 0.8789F));

		PartDefinition Neckmiddlefront = Neckmiddlebase.addOrReplaceChild("Neckmiddlefront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.067F, -3.1102F, -0.3875F, -0.1305F, 0.0107F));

		PartDefinition Neckmiddlefront_r1 = Neckmiddlefront.addOrReplaceChild("Neckmiddlefront_r1", CubeListBuilder.create().texOffs(86, 98).addBox(0.0F, -0.7725F, 3.9084F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 59).addBox(-0.5F, -0.4725F, 2.9084F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.4295F, -5.5842F, -0.096F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r91 = Neckmiddlefront.addOrReplaceChild("Bodyfront_r91", CubeListBuilder.create().texOffs(68, 10).mirror().addBox(-2.9614F, 0.0297F, -0.4167F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.546F, 0.3174F, -1.5635F, 0.3154F, 1.2107F, -1.2015F));

		PartDefinition Bodyfront_r92 = Neckmiddlefront.addOrReplaceChild("Bodyfront_r92", CubeListBuilder.create().texOffs(68, 10).addBox(-0.0386F, 0.0297F, -0.4167F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.546F, 0.3174F, -1.5635F, 0.3154F, -1.2107F, 1.2015F));

		PartDefinition Neckfront = Neckmiddlefront.addOrReplaceChild("Neckfront", CubeListBuilder.create().texOffs(57, 54).addBox(-0.49F, -0.5383F, -2.894F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F))
				.texOffs(53, 61).addBox(0.01F, -0.8383F, -1.894F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -0.1039F, -2.6035F, -0.5198F, -0.1266F, 0.0333F));

		PartDefinition Bodyfront_r93 = Neckfront.addOrReplaceChild("Bodyfront_r93", CubeListBuilder.create().texOffs(68, 12).mirror().addBox(-2.6883F, -0.0703F, -0.6883F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.0886F, -1.533F, 0.5277F, 1.3306F, -0.9459F));

		PartDefinition Bodyfront_r94 = Neckfront.addOrReplaceChild("Bodyfront_r94", CubeListBuilder.create().texOffs(68, 12).addBox(-0.3117F, -0.0703F, -0.6883F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.0886F, -1.533F, 0.5277F, -1.3306F, 0.9459F));

		PartDefinition Neckfront2 = Neckfront.addOrReplaceChild("Neckfront2", CubeListBuilder.create().texOffs(59, 6).addBox(-0.49F, -0.5383F, -2.894F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(80, 98).addBox(0.01F, -0.7383F, -0.894F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0314F, -2.886F, -0.125F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r95 = Neckfront2.addOrReplaceChild("Bodyfront_r95", CubeListBuilder.create().texOffs(68, 14).mirror().addBox(-3.027F, -0.0163F, -0.4842F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.2752F, -1.7339F, 0.4298F, 1.3228F, -1.0697F));

		PartDefinition Bodyfront_r96 = Neckfront2.addOrReplaceChild("Bodyfront_r96", CubeListBuilder.create().texOffs(68, 14).addBox(0.027F, -0.0163F, -0.4842F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.2752F, -1.7339F, 0.4298F, -1.3228F, 1.0697F));

		PartDefinition Neckfront3 = Neckfront2.addOrReplaceChild("Neckfront3", CubeListBuilder.create().texOffs(35, 57).addBox(-0.49F, -0.5383F, -1.894F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F))
				.texOffs(98, 81).addBox(0.01F, -0.7383F, -0.894F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0322F, -2.8158F, -0.1945F, -0.0959F, -0.2478F));

		PartDefinition Bodyfront_r97 = Neckfront3.addOrReplaceChild("Bodyfront_r97", CubeListBuilder.create().texOffs(82, 4).mirror().addBox(-1.953F, -0.0097F, -0.6852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.1225F, -1.0998F, 0.415F, 1.3747F, -1.1156F));

		PartDefinition Bodyfront_r98 = Neckfront3.addOrReplaceChild("Bodyfront_r98", CubeListBuilder.create().texOffs(82, 4).addBox(-0.047F, -0.0097F, -0.6852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.1225F, -1.0998F, 0.415F, -1.3747F, 1.1156F));

		PartDefinition Neckfront4 = Neckfront3.addOrReplaceChild("Neckfront4", CubeListBuilder.create().texOffs(59, 11).addBox(-0.49F, -0.5383F, -2.894F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(83, 98).addBox(0.01F, -0.7383F, -0.894F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0398F, -1.8464F, 0.3587F, 0.1586F, 0.0832F));

		PartDefinition Bodyfront_r99 = Neckfront4.addOrReplaceChild("Bodyfront_r99", CubeListBuilder.create().texOffs(82, 6).mirror().addBox(-2.0609F, 0.0085F, -0.3656F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.2937F, -1.8862F, 0.3332F, 1.2821F, -1.2744F));

		PartDefinition Bodyfront_r100 = Neckfront4.addOrReplaceChild("Bodyfront_r100", CubeListBuilder.create().texOffs(82, 6).addBox(0.0609F, 0.0085F, -0.3656F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.2937F, -1.8862F, 0.3332F, -1.2821F, 1.2744F));

		PartDefinition Neckfront5 = Neckfront4.addOrReplaceChild("Neckfront5", CubeListBuilder.create().texOffs(68, 18).addBox(-0.49F, -0.5383F, -1.894F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F))
				.texOffs(98, 84).addBox(0.01F, -0.7383F, -0.894F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0488F, -2.6921F, 0.355F, 0.0F, 0.0F));

		PartDefinition Neckfront_r1 = Neckfront5.addOrReplaceChild("Neckfront_r1", CubeListBuilder.create().texOffs(87, 28).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -0.5383F, -1.894F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r101 = Neckfront5.addOrReplaceChild("Bodyfront_r101", CubeListBuilder.create().texOffs(82, 18).mirror().addBox(-2.0403F, -0.0241F, -0.438F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.2574F, -1.5963F, 0.2769F, 1.2246F, -1.2434F));

		PartDefinition Bodyfront_r102 = Neckfront5.addOrReplaceChild("Bodyfront_r102", CubeListBuilder.create().texOffs(82, 18).addBox(0.0403F, -0.0241F, -0.438F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.2574F, -1.5963F, 0.2769F, -1.2246F, 1.2434F));

		PartDefinition Head = Neckfront5.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 0.1782F, -2.4142F, 0.3958F, 0.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(64, 43).addBox(-0.5F, -0.45F, -1.625F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(-0.5F, 0.6203F, -0.1896F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(15, 94).addBox(-0.5F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(10, 94).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, 1.0535F, -4.9377F, 1.3439F, 0.0F, 0.0F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(94, 9).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.5281F, -4.8193F, 0.9687F, 0.0F, 0.0F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(94, 6).addBox(-0.5F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.2101F, -4.4335F, 0.6894F, 0.0F, 0.0F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(70, 26).addBox(-0.5F, -0.15F, -0.85F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.5F, -0.9204F, -1.1755F, 0.0262F, 0.0F, 0.0F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(70, 0).addBox(-0.5F, -0.15F, -0.85F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.829F, -0.4815F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(77, 12).addBox(-0.5F, -0.75F, -0.475F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.5F, -0.1729F, -0.294F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(62, 39).addBox(-0.5F, -0.9F, -1.45F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.5F, 0.5277F, -0.2522F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase = Head.addOrReplaceChild("Lowerjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2729F, -0.2089F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r1 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r1", CubeListBuilder.create().texOffs(90, 34).mirror().addBox(-0.25F, -0.7339F, -0.9993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(32, 90).mirror().addBox(-0.25F, -0.7339F, -0.6994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.4551F, 1.0532F, -3.6675F, 0.5419F, -0.2495F, -0.0457F));

		PartDefinition Lowerjawbase_r2 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r2", CubeListBuilder.create().texOffs(20, 90).mirror().addBox(-0.25F, -0.6133F, -2.042F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.75F, 0.4881F, -1.9952F, 0.2531F, -0.1745F, 0.0F));

		PartDefinition Lowerjawbase_r3 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r3", CubeListBuilder.create().texOffs(88, 89).mirror().addBox(-0.25F, -0.8954F, -2.0414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.75F, 0.4881F, -1.9952F, 0.4102F, -0.1745F, 0.0F));

		PartDefinition Lowerjawbase_r4 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r4", CubeListBuilder.create().texOffs(66, 89).mirror().addBox(-0.25F, -0.3452F, -0.8151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(61, 89).mirror().addBox(-0.25F, -0.3452F, -1.0151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-0.75F, 0.4881F, -1.9952F, 0.0087F, -0.1745F, 0.0F));

		PartDefinition Lowerjawbase_r5 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r5", CubeListBuilder.create().texOffs(89, 21).mirror().addBox(-0.25F, -0.4115F, -1.5039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.75F, 0.4881F, -1.9952F, 0.096F, -0.1745F, 0.0F));

		PartDefinition Lowerjawbase_r6 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r6", CubeListBuilder.create().texOffs(89, 18).mirror().addBox(-0.25F, -0.7094F, -1.6186F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.75F, 0.4881F, -1.9952F, 0.2705F, -0.1745F, 0.0F));

		PartDefinition Lowerjawbase_r7 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r7", CubeListBuilder.create().texOffs(89, 9).mirror().addBox(-0.25F, -0.6633F, -1.1415F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.75F, 0.4881F, -1.9952F, 0.2182F, -0.1745F, 0.0F));

		PartDefinition Lowerjawbase_r8 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r8", CubeListBuilder.create().texOffs(89, 6).mirror().addBox(-0.25F, -0.6458F, -0.6591F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.75F, 0.4881F, -1.9952F, 0.1745F, -0.1745F, 0.0F));

		PartDefinition Lowerjawbase_r9 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r9", CubeListBuilder.create().texOffs(89, 3).mirror().addBox(-0.5F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(89, 3).addBox(0.5F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.5F, 0.4881F, -1.3952F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r10 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r10", CubeListBuilder.create().texOffs(89, 0).mirror().addBox(-0.5F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(89, 0).addBox(0.5F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-0.5F, -0.1243F, -1.0416F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r11 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r11", CubeListBuilder.create().texOffs(88, 86).mirror().addBox(-0.5F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(88, 86).addBox(0.5F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.5F, -0.2111F, -0.5492F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r12 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r12", CubeListBuilder.create().texOffs(88, 83).mirror().addBox(-0.5F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(88, 83).addBox(0.5F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.5F, -0.1675F, -0.0511F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r13 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r13", CubeListBuilder.create().texOffs(88, 64).mirror().addBox(-0.5F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(88, 64).addBox(0.5F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.5F, 0.8676F, -1.1479F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r14 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r14", CubeListBuilder.create().texOffs(88, 61).mirror().addBox(-0.5F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(88, 61).addBox(0.5F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-0.5F, 0.9112F, -1.646F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r15 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r15", CubeListBuilder.create().texOffs(88, 58).mirror().addBox(-0.325F, -0.5185F, -0.6242F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.75F, 0.4881F, -1.9952F, 0.48F, -0.1745F, 0.0F));

		PartDefinition Lowerjawbase_r16 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r16", CubeListBuilder.create().texOffs(88, 55).mirror().addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(88, 52).mirror().addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(88, 55).addBox(0.65F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(88, 52).addBox(0.65F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.575F, 0.2463F, -1.0798F, 0.1353F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r17 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r17", CubeListBuilder.create().texOffs(26, 69).mirror().addBox(-0.5F, -0.425F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(26, 69).addBox(0.65F, -0.425F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.575F, 0.3778F, -2.0459F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Lowerjawbase.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(68, 49).mirror().addBox(-0.5491F, -0.497F, -0.3908F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.2064F, 0.9456F, -0.5813F, 0.2557F, -0.1949F, 0.0123F));

		PartDefinition cube_r2 = Lowerjawbase.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(68, 22).mirror().addBox(0.0648F, -0.47F, -0.5379F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.4845F, 0.9833F, -1.7357F, 0.0477F, -0.3031F, -0.0839F));

		PartDefinition Lowerjawbase_r18 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r18", CubeListBuilder.create().texOffs(88, 49).mirror().addBox(-0.5F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(88, 49).addBox(0.5F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.5F, 0.7808F, -0.6555F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r19 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r19", CubeListBuilder.create().texOffs(88, 31).mirror().addBox(-0.5F, -0.725F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(88, 31).addBox(0.5F, -0.725F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-0.5F, 0.6272F, -0.179F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r20 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r20", CubeListBuilder.create().texOffs(27, 88).mirror().addBox(-0.5F, -0.725F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(27, 88).addBox(0.5F, -0.725F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.5F, 0.4359F, 0.2829F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r21 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r21", CubeListBuilder.create().texOffs(87, 80).mirror().addBox(-0.5F, -0.525F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(87, 77).mirror().addBox(-0.5F, -0.525F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(87, 80).addBox(0.5F, -0.525F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F))
				.texOffs(87, 77).addBox(0.5F, -0.525F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.5F, 0.2F, 0.2F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r22 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r22", CubeListBuilder.create().texOffs(90, 34).addBox(-0.75F, -0.7339F, -0.9993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(32, 90).addBox(-0.75F, -0.7339F, -0.6994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.4551F, 1.0532F, -3.6675F, 0.5419F, 0.2495F, 0.0457F));

		PartDefinition Lowerjawbase_r23 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r23", CubeListBuilder.create().texOffs(20, 90).addBox(-0.75F, -0.6133F, -2.042F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.75F, 0.4881F, -1.9952F, 0.2531F, 0.1745F, 0.0F));

		PartDefinition Lowerjawbase_r24 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r24", CubeListBuilder.create().texOffs(88, 89).addBox(-0.75F, -0.8954F, -2.0414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.75F, 0.4881F, -1.9952F, 0.4102F, 0.1745F, 0.0F));

		PartDefinition Lowerjawbase_r25 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r25", CubeListBuilder.create().texOffs(66, 89).addBox(-0.75F, -0.3452F, -0.8151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F))
				.texOffs(61, 89).addBox(-0.75F, -0.3452F, -1.0151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.75F, 0.4881F, -1.9952F, 0.0087F, 0.1745F, 0.0F));

		PartDefinition Lowerjawbase_r26 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r26", CubeListBuilder.create().texOffs(89, 21).addBox(-0.75F, -0.4115F, -1.5039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.75F, 0.4881F, -1.9952F, 0.096F, 0.1745F, 0.0F));

		PartDefinition Lowerjawbase_r27 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r27", CubeListBuilder.create().texOffs(89, 18).addBox(-0.75F, -0.7094F, -1.6186F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.75F, 0.4881F, -1.9952F, 0.2705F, 0.1745F, 0.0F));

		PartDefinition Lowerjawbase_r28 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r28", CubeListBuilder.create().texOffs(89, 9).addBox(-0.75F, -0.6633F, -1.1415F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.75F, 0.4881F, -1.9952F, 0.2182F, 0.1745F, 0.0F));

		PartDefinition Lowerjawbase_r29 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r29", CubeListBuilder.create().texOffs(89, 6).addBox(-0.75F, -0.6458F, -0.6591F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.75F, 0.4881F, -1.9952F, 0.1745F, 0.1745F, 0.0F));

		PartDefinition Lowerjawbase_r30 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r30", CubeListBuilder.create().texOffs(88, 58).addBox(-0.675F, -0.5185F, -0.6242F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.75F, 0.4881F, -1.9952F, 0.48F, 0.1745F, 0.0F));

		PartDefinition cube_r3 = Lowerjawbase.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(68, 49).addBox(-0.4509F, -0.497F, -0.3908F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.2064F, 0.9456F, -0.5813F, 0.2557F, 0.1949F, -0.0123F));

		PartDefinition cube_r4 = Lowerjawbase.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(68, 22).addBox(-1.0648F, -0.47F, -0.5379F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.4845F, 0.9833F, -1.7357F, 0.0477F, 0.3031F, 0.0839F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5F, -0.8557F, -1.8367F));

		PartDefinition Head_r9 = leftFace.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(5, 94).addBox(-0.8F, -0.2062F, -0.1218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0463F, 0.2221F, -0.6622F, 0.2506F, 0.4015F, 0.0387F));

		PartDefinition Head_r10 = leftFace.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(94, 3).addBox(-0.5F, -0.25F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)), PartPose.offsetAndRotation(-0.5F, 1.0658F, -2.5968F, 0.6894F, 0.0F, 0.0F));

		PartDefinition Head_r11 = leftFace.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(94, 0).addBox(0.6F, -0.45F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.0F, 0.3113F, 2.0915F, 1.1257F, 0.0F, 0.0F));

		PartDefinition Head_r12 = leftFace.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(0, 94).addBox(0.525F, -0.4F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, 1.5686F, 1.7097F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Head_r13 = leftFace.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(93, 88).addBox(-0.525F, -0.325F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.358F, 1.2716F, -2.5372F, 0.724F, 0.2705F, -0.002F));

		PartDefinition Head_r14 = leftFace.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(93, 85).addBox(-0.525F, -0.375F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.3222F, 1.2594F, -2.408F, 0.4709F, 0.2705F, -0.002F));

		PartDefinition Head_r15 = leftFace.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(63, 70).addBox(-0.5F, -0.3F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.1889F, 0.6309F, -0.9861F, 0.4189F, 0.1571F, 0.0F));

		PartDefinition Head_r16 = leftFace.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(93, 82).addBox(-0.8F, -0.2124F, -0.9644F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.275F, 0.3F, 0.025F, 0.3578F, 0.1571F, 0.0F));

		PartDefinition Head_r17 = leftFace.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(77, 93).addBox(-0.85F, -0.9412F, -1.2372F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(72, 93).addBox(-0.85F, -0.9412F, -1.7372F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.35F, 1.653F, 0.0059F, 0.1484F, 0.1571F, 0.0F));

		PartDefinition Head_r18 = leftFace.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(67, 93).addBox(-0.8846F, -0.3608F, -0.8388F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.125F, 1.3205F, -1.6357F, 0.1565F, 0.2341F, -0.0157F));

		PartDefinition Head_r19 = leftFace.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(93, 64).addBox(-0.7655F, -0.67F, -0.7458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.025F, 1.831F, -2.2404F, -0.0091F, 0.3011F, -0.0022F));

		PartDefinition Head_r20 = leftFace.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(93, 61).addBox(-0.6945F, -0.7632F, -1.0172F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.025F, 1.831F, -2.2404F, 0.3578F, 0.2967F, 0.0F));

		PartDefinition Head_r21 = leftFace.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(93, 58).addBox(-0.5096F, -0.7668F, -1.3144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.025F, 1.831F, -2.2404F, 0.486F, 0.4919F, 0.1059F));

		PartDefinition Head_r22 = leftFace.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(93, 55).addBox(-0.8F, -0.5981F, -2.921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5498F, 0.0698F, 0.0F));

		PartDefinition Head_r23 = leftFace.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(93, 52).addBox(-0.8F, -0.3055F, -2.2632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4102F, 0.0698F, 0.0F));

		PartDefinition Head_r24 = leftFace.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(93, 49).addBox(-0.8F, -0.2314F, -1.5695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3578F, 0.0698F, 0.0F));

		PartDefinition Head_r25 = leftFace.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(45, 93).addBox(-0.8F, -0.3473F, -0.8795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.275F, 0.3F, 0.025F, 0.288F, 0.1571F, 0.0F));

		PartDefinition Head_r26 = leftFace.addOrReplaceChild("Head_r26", CubeListBuilder.create().texOffs(40, 93).addBox(-0.85F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.35F, 1.653F, 0.0059F, 0.0262F, 0.1571F, 0.0F));

		PartDefinition Head_r27 = leftFace.addOrReplaceChild("Head_r27", CubeListBuilder.create().texOffs(35, 93).addBox(0.5F, -0.875F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(93, 30).addBox(0.5F, -0.875F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-1.0F, 0.6828F, 1.5426F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Head_r28 = leftFace.addOrReplaceChild("Head_r28", CubeListBuilder.create().texOffs(30, 93).addBox(0.0F, -0.8F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.425F, 1.3993F, -0.064F, 0.4669F, 0.0F, 0.0F));

		PartDefinition Head_r29 = leftFace.addOrReplaceChild("Head_r29", CubeListBuilder.create().texOffs(20, 93).addBox(-0.075F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(91, 92).addBox(0.1F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(86, 92).addBox(0.05F, 0.175F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.425F, 0.8276F, 0.4037F, 0.0742F, 0.0F, 0.0F));

		PartDefinition Head_r30 = leftFace.addOrReplaceChild("Head_r30", CubeListBuilder.create().texOffs(92, 79).addBox(-0.5F, -0.4407F, -0.0557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(-0.05F, 1.2453F, -1.6136F, 0.4669F, 0.1614F, 0.0F));

		PartDefinition Head_r31 = leftFace.addOrReplaceChild("Head_r31", CubeListBuilder.create().texOffs(92, 76).addBox(-0.5F, -0.4614F, 0.2408F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(91, 24).addBox(-0.5F, -0.4614F, 0.4408F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(-0.05F, 1.2453F, -1.6136F, 0.432F, 0.1614F, 0.0F));

		PartDefinition Head_r32 = leftFace.addOrReplaceChild("Head_r32", CubeListBuilder.create().texOffs(92, 73).addBox(-0.5F, -0.5725F, 0.4011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F))
				.texOffs(62, 92).addBox(-0.5F, -0.5725F, 0.1261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F))
				.texOffs(25, 91).addBox(-0.5F, -0.5725F, -0.1489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-0.05F, 1.2453F, -1.6136F, -0.1789F, 0.1614F, 0.0F));

		PartDefinition Head_r33 = leftFace.addOrReplaceChild("Head_r33", CubeListBuilder.create().texOffs(92, 70).addBox(-0.5F, -0.6397F, 0.4243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.355F))
				.texOffs(92, 67).addBox(-0.5F, -0.6397F, 0.1493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-0.05F, 1.2453F, -1.6136F, 0.0393F, 0.1614F, 0.0F));

		PartDefinition Head_r34 = leftFace.addOrReplaceChild("Head_r34", CubeListBuilder.create().texOffs(57, 92).addBox(-0.6763F, -0.3204F, -0.5686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.125F, 1.3205F, -1.6357F, -0.1795F, 0.2384F, -0.0157F));

		PartDefinition Head_r35 = leftFace.addOrReplaceChild("Head_r35", CubeListBuilder.create().texOffs(92, 46).addBox(-0.5F, -0.6228F, -0.43F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.2215F, 1.4296F, -2.3599F, 0.2574F, 0.2531F, 0.0F));

		PartDefinition Head_r36 = leftFace.addOrReplaceChild("Head_r36", CubeListBuilder.create().texOffs(92, 43).addBox(-0.5F, -0.4291F, -0.623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(-0.2215F, 1.4296F, -2.3599F, -0.7461F, 0.2531F, 0.0F));

		PartDefinition Head_r37 = leftFace.addOrReplaceChild("Head_r37", CubeListBuilder.create().texOffs(92, 40).addBox(-0.5F, -0.301F, -0.3104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.349F)), PartPose.offsetAndRotation(-0.2215F, 1.4296F, -2.3599F, -1.7497F, 0.2531F, 0.0F));

		PartDefinition Head_r38 = leftFace.addOrReplaceChild("Head_r38", CubeListBuilder.create().texOffs(92, 37).addBox(-0.5F, -0.6371F, -0.4621F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.2215F, 1.4296F, -2.3599F, -2.8842F, 0.2531F, 0.0F));

		PartDefinition Head_r39 = leftFace.addOrReplaceChild("Head_r39", CubeListBuilder.create().texOffs(92, 27).addBox(-0.5F, -0.4358F, -0.646F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.349F)), PartPose.offsetAndRotation(-0.2215F, 1.4296F, -2.3599F, 2.4827F, 0.2531F, 0.0F));

		PartDefinition Head_r40 = leftFace.addOrReplaceChild("Head_r40", CubeListBuilder.create().texOffs(52, 91).addBox(-0.5F, -0.2853F, -0.3284F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(-0.2215F, 1.4296F, -2.3599F, 1.4792F, 0.2531F, 0.0F));

		PartDefinition Head_r41 = leftFace.addOrReplaceChild("Head_r41", CubeListBuilder.create().texOffs(91, 15).addBox(-0.5F, -0.725F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.175F, 1.2193F, 1.2059F, -0.2313F, 0.0F, 0.0F));

		PartDefinition Head_r42 = leftFace.addOrReplaceChild("Head_r42", CubeListBuilder.create().texOffs(15, 91).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(91, 12).addBox(-0.5F, -0.9F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.175F, 0.7999F, 1.279F, -0.3185F, 0.0F, 0.0F));

		PartDefinition Head_r43 = leftFace.addOrReplaceChild("Head_r43", CubeListBuilder.create().texOffs(10, 91).addBox(0.0F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.425F, 1.4193F, -0.0904F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Head_r44 = leftFace.addOrReplaceChild("Head_r44", CubeListBuilder.create().texOffs(5, 91).addBox(0.0F, -0.65F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.425F, 1.4997F, 0.6619F, -1.1083F, 0.0F, 0.0F));

		PartDefinition Head_r45 = leftFace.addOrReplaceChild("Head_r45", CubeListBuilder.create().texOffs(0, 91).addBox(0.0F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(81, 90).addBox(0.0F, -0.2F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.425F, 1.2541F, 1.0423F, -1.8064F, 0.0F, 0.0F));

		PartDefinition Head_r46 = leftFace.addOrReplaceChild("Head_r46", CubeListBuilder.create().texOffs(76, 90).addBox(0.0F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.425F, 0.4519F, 1.2349F, -2.2427F, 0.0F, 0.0F));

		PartDefinition Head_r47 = leftFace.addOrReplaceChild("Head_r47", CubeListBuilder.create().texOffs(71, 90).addBox(0.0F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.425F, 0.0784F, 0.7654F, -3.0281F, 0.0F, 0.0F));

		PartDefinition Head_r48 = leftFace.addOrReplaceChild("Head_r48", CubeListBuilder.create().texOffs(47, 90).addBox(0.0F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.425F, 0.1463F, 0.1692F, 2.0333F, 0.0F, 0.0F));

		PartDefinition Head_r49 = leftFace.addOrReplaceChild("Head_r49", CubeListBuilder.create().texOffs(42, 90).addBox(0.0F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.425F, 0.414F, -0.3677F, 1.597F, 0.0F, 0.0F));

		PartDefinition Head_r50 = leftFace.addOrReplaceChild("Head_r50", CubeListBuilder.create().texOffs(37, 90).addBox(-0.8F, -0.2062F, -0.8719F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3229F, 0.0698F, 0.0F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5F, -0.8557F, -1.8367F));

		PartDefinition Head_r51 = rightFace.addOrReplaceChild("Head_r51", CubeListBuilder.create().texOffs(5, 94).mirror().addBox(-0.2F, -0.2062F, -0.1218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0463F, 0.2221F, -0.6622F, 0.2506F, -0.4015F, -0.0387F));

		PartDefinition Head_r52 = rightFace.addOrReplaceChild("Head_r52", CubeListBuilder.create().texOffs(94, 3).mirror().addBox(-0.5F, -0.25F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.0658F, -2.5968F, 0.6894F, 0.0F, 0.0F));

		PartDefinition Head_r53 = rightFace.addOrReplaceChild("Head_r53", CubeListBuilder.create().texOffs(94, 0).mirror().addBox(-1.6F, -0.45F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.3113F, 2.0915F, 1.1257F, 0.0F, 0.0F));

		PartDefinition Head_r54 = rightFace.addOrReplaceChild("Head_r54", CubeListBuilder.create().texOffs(0, 94).mirror().addBox(-1.525F, -0.4F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.0F, 1.5686F, 1.7097F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Head_r55 = rightFace.addOrReplaceChild("Head_r55", CubeListBuilder.create().texOffs(93, 88).mirror().addBox(-0.475F, -0.325F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.358F, 1.2716F, -2.5372F, 0.724F, -0.2705F, 0.002F));

		PartDefinition Head_r56 = rightFace.addOrReplaceChild("Head_r56", CubeListBuilder.create().texOffs(93, 85).mirror().addBox(-0.475F, -0.375F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.3222F, 1.2594F, -2.408F, 0.4709F, -0.2705F, 0.002F));

		PartDefinition Head_r57 = rightFace.addOrReplaceChild("Head_r57", CubeListBuilder.create().texOffs(63, 70).mirror().addBox(-0.5F, -0.3F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.1889F, 0.6309F, -0.9861F, 0.4189F, -0.1571F, 0.0F));

		PartDefinition Head_r58 = rightFace.addOrReplaceChild("Head_r58", CubeListBuilder.create().texOffs(93, 82).mirror().addBox(-0.2F, -0.2124F, -0.9644F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.275F, 0.3F, 0.025F, 0.3578F, -0.1571F, 0.0F));

		PartDefinition Head_r59 = rightFace.addOrReplaceChild("Head_r59", CubeListBuilder.create().texOffs(77, 93).mirror().addBox(-0.15F, -0.9412F, -1.2372F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(72, 93).mirror().addBox(-0.15F, -0.9412F, -1.7372F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 1.653F, 0.0059F, 0.1484F, -0.1571F, 0.0F));

		PartDefinition Head_r60 = rightFace.addOrReplaceChild("Head_r60", CubeListBuilder.create().texOffs(67, 93).mirror().addBox(-0.1154F, -0.3608F, -0.8388F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.125F, 1.3205F, -1.6357F, 0.1565F, -0.2341F, 0.0157F));

		PartDefinition Head_r61 = rightFace.addOrReplaceChild("Head_r61", CubeListBuilder.create().texOffs(93, 64).mirror().addBox(-0.2345F, -0.67F, -0.7458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.025F, 1.831F, -2.2404F, -0.0091F, -0.3011F, 0.0022F));

		PartDefinition Head_r62 = rightFace.addOrReplaceChild("Head_r62", CubeListBuilder.create().texOffs(93, 61).mirror().addBox(-0.3055F, -0.7632F, -1.0172F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.025F, 1.831F, -2.2404F, 0.3578F, -0.2967F, 0.0F));

		PartDefinition Head_r63 = rightFace.addOrReplaceChild("Head_r63", CubeListBuilder.create().texOffs(93, 58).mirror().addBox(-0.4904F, -0.7668F, -1.3144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.025F, 1.831F, -2.2404F, 0.486F, -0.4919F, -0.1059F));

		PartDefinition Head_r64 = rightFace.addOrReplaceChild("Head_r64", CubeListBuilder.create().texOffs(93, 55).mirror().addBox(-0.2F, -0.5981F, -2.921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5498F, -0.0698F, 0.0F));

		PartDefinition Head_r65 = rightFace.addOrReplaceChild("Head_r65", CubeListBuilder.create().texOffs(93, 52).mirror().addBox(-0.2F, -0.3055F, -2.2632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4102F, -0.0698F, 0.0F));

		PartDefinition Head_r66 = rightFace.addOrReplaceChild("Head_r66", CubeListBuilder.create().texOffs(93, 49).mirror().addBox(-0.2F, -0.2314F, -1.5695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3578F, -0.0698F, 0.0F));

		PartDefinition Head_r67 = rightFace.addOrReplaceChild("Head_r67", CubeListBuilder.create().texOffs(45, 93).mirror().addBox(-0.2F, -0.3473F, -0.8795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.275F, 0.3F, 0.025F, 0.288F, -0.1571F, 0.0F));

		PartDefinition Head_r68 = rightFace.addOrReplaceChild("Head_r68", CubeListBuilder.create().texOffs(40, 93).mirror().addBox(-0.15F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 1.653F, 0.0059F, 0.0262F, -0.1571F, 0.0F));

		PartDefinition Head_r69 = rightFace.addOrReplaceChild("Head_r69", CubeListBuilder.create().texOffs(35, 93).mirror().addBox(-1.5F, -0.875F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(93, 30).mirror().addBox(-1.5F, -0.875F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.6828F, 1.5426F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Head_r70 = rightFace.addOrReplaceChild("Head_r70", CubeListBuilder.create().texOffs(30, 93).mirror().addBox(-1.0F, -0.8F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.425F, 1.3993F, -0.064F, 0.4669F, 0.0F, 0.0F));

		PartDefinition Head_r71 = rightFace.addOrReplaceChild("Head_r71", CubeListBuilder.create().texOffs(20, 93).mirror().addBox(-0.925F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(91, 92).mirror().addBox(-1.1F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(86, 92).mirror().addBox(-1.05F, 0.175F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.425F, 0.8276F, 0.4037F, 0.0742F, 0.0F, 0.0F));

		PartDefinition Head_r72 = rightFace.addOrReplaceChild("Head_r72", CubeListBuilder.create().texOffs(92, 79).mirror().addBox(-0.5F, -0.4407F, -0.0557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)).mirror(false), PartPose.offsetAndRotation(0.05F, 1.2453F, -1.6136F, 0.4669F, -0.1614F, 0.0F));

		PartDefinition Head_r73 = rightFace.addOrReplaceChild("Head_r73", CubeListBuilder.create().texOffs(92, 76).mirror().addBox(-0.5F, -0.4614F, 0.2408F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(91, 24).mirror().addBox(-0.5F, -0.4614F, 0.4408F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)).mirror(false), PartPose.offsetAndRotation(0.05F, 1.2453F, -1.6136F, 0.432F, -0.1614F, 0.0F));

		PartDefinition Head_r74 = rightFace.addOrReplaceChild("Head_r74", CubeListBuilder.create().texOffs(92, 73).mirror().addBox(-0.5F, -0.5725F, 0.4011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false)
				.texOffs(62, 92).mirror().addBox(-0.5F, -0.5725F, 0.1261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false)
				.texOffs(25, 91).mirror().addBox(-0.5F, -0.5725F, -0.1489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(0.05F, 1.2453F, -1.6136F, -0.1789F, -0.1614F, 0.0F));

		PartDefinition Head_r75 = rightFace.addOrReplaceChild("Head_r75", CubeListBuilder.create().texOffs(92, 70).mirror().addBox(-0.5F, -0.6397F, 0.4243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.355F)).mirror(false)
				.texOffs(92, 67).mirror().addBox(-0.5F, -0.6397F, 0.1493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(0.05F, 1.2453F, -1.6136F, 0.0393F, -0.1614F, 0.0F));

		PartDefinition Head_r76 = rightFace.addOrReplaceChild("Head_r76", CubeListBuilder.create().texOffs(57, 92).mirror().addBox(-0.3237F, -0.3204F, -0.5686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.125F, 1.3205F, -1.6357F, -0.1795F, -0.2384F, 0.0157F));

		PartDefinition Head_r77 = rightFace.addOrReplaceChild("Head_r77", CubeListBuilder.create().texOffs(92, 46).mirror().addBox(-0.5F, -0.6228F, -0.43F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.2215F, 1.4296F, -2.3599F, 0.2574F, -0.2531F, 0.0F));

		PartDefinition Head_r78 = rightFace.addOrReplaceChild("Head_r78", CubeListBuilder.create().texOffs(92, 43).mirror().addBox(-0.5F, -0.4291F, -0.623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)).mirror(false), PartPose.offsetAndRotation(0.2215F, 1.4296F, -2.3599F, -0.7461F, -0.2531F, 0.0F));

		PartDefinition Head_r79 = rightFace.addOrReplaceChild("Head_r79", CubeListBuilder.create().texOffs(92, 40).mirror().addBox(-0.5F, -0.301F, -0.3104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.349F)).mirror(false), PartPose.offsetAndRotation(0.2215F, 1.4296F, -2.3599F, -1.7497F, -0.2531F, 0.0F));

		PartDefinition Head_r80 = rightFace.addOrReplaceChild("Head_r80", CubeListBuilder.create().texOffs(92, 37).mirror().addBox(-0.5F, -0.6371F, -0.4621F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.2215F, 1.4296F, -2.3599F, -2.8842F, -0.2531F, 0.0F));

		PartDefinition Head_r81 = rightFace.addOrReplaceChild("Head_r81", CubeListBuilder.create().texOffs(92, 27).mirror().addBox(-0.5F, -0.4358F, -0.646F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.349F)).mirror(false), PartPose.offsetAndRotation(0.2215F, 1.4296F, -2.3599F, 2.4827F, -0.2531F, 0.0F));

		PartDefinition Head_r82 = rightFace.addOrReplaceChild("Head_r82", CubeListBuilder.create().texOffs(52, 91).mirror().addBox(-0.5F, -0.2853F, -0.3284F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)).mirror(false), PartPose.offsetAndRotation(0.2215F, 1.4296F, -2.3599F, 1.4792F, -0.2531F, 0.0F));

		PartDefinition Head_r83 = rightFace.addOrReplaceChild("Head_r83", CubeListBuilder.create().texOffs(91, 15).mirror().addBox(-0.5F, -0.725F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.175F, 1.2193F, 1.2059F, -0.2313F, 0.0F, 0.0F));

		PartDefinition Head_r84 = rightFace.addOrReplaceChild("Head_r84", CubeListBuilder.create().texOffs(15, 91).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(91, 12).mirror().addBox(-0.5F, -0.9F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.175F, 0.7999F, 1.279F, -0.3185F, 0.0F, 0.0F));

		PartDefinition Head_r85 = rightFace.addOrReplaceChild("Head_r85", CubeListBuilder.create().texOffs(10, 91).mirror().addBox(-1.0F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.425F, 1.4193F, -0.0904F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Head_r86 = rightFace.addOrReplaceChild("Head_r86", CubeListBuilder.create().texOffs(5, 91).mirror().addBox(-1.0F, -0.65F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.425F, 1.4997F, 0.6619F, -1.1083F, 0.0F, 0.0F));

		PartDefinition Head_r87 = rightFace.addOrReplaceChild("Head_r87", CubeListBuilder.create().texOffs(0, 91).mirror().addBox(-1.0F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(81, 90).mirror().addBox(-1.0F, -0.2F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.425F, 1.2541F, 1.0423F, -1.8064F, 0.0F, 0.0F));

		PartDefinition Head_r88 = rightFace.addOrReplaceChild("Head_r88", CubeListBuilder.create().texOffs(76, 90).mirror().addBox(-1.0F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.425F, 0.4519F, 1.2349F, -2.2427F, 0.0F, 0.0F));

		PartDefinition Head_r89 = rightFace.addOrReplaceChild("Head_r89", CubeListBuilder.create().texOffs(71, 90).mirror().addBox(-1.0F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.425F, 0.0784F, 0.7654F, -3.0281F, 0.0F, 0.0F));

		PartDefinition Head_r90 = rightFace.addOrReplaceChild("Head_r90", CubeListBuilder.create().texOffs(47, 90).mirror().addBox(-1.0F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.425F, 0.1463F, 0.1692F, 2.0333F, 0.0F, 0.0F));

		PartDefinition Head_r91 = rightFace.addOrReplaceChild("Head_r91", CubeListBuilder.create().texOffs(42, 90).mirror().addBox(-1.0F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.425F, 0.414F, -0.3677F, 1.597F, 0.0F, 0.0F));

		PartDefinition Head_r92 = rightFace.addOrReplaceChild("Head_r92", CubeListBuilder.create().texOffs(37, 90).mirror().addBox(-0.2F, -0.2062F, -0.8719F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3229F, -0.0698F, 0.0F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4041F, 4.1954F, -4.9892F, 0.2528F, -0.5301F, -0.6749F));

		PartDefinition Rightupperarm_r1 = Rightupperarm.addOrReplaceChild("Rightupperarm_r1", CubeListBuilder.create().texOffs(38, 77).addBox(-0.5F, -0.1F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.0297F, 2.9847F, 0.3083F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r2 = Rightupperarm.addOrReplaceChild("Rightupperarm_r2", CubeListBuilder.create().texOffs(0, 83).addBox(-0.5F, -1.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0297F, 2.3484F, -0.45F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r3 = Rightupperarm.addOrReplaceChild("Rightupperarm_r3", CubeListBuilder.create().texOffs(82, 80).addBox(-0.5F, -1.7F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.0297F, 3.016F, -0.2395F, 0.1833F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r4 = Rightupperarm.addOrReplaceChild("Rightupperarm_r4", CubeListBuilder.create().texOffs(82, 76).addBox(-0.5F, -1.1F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.0297F, 1.0132F, -0.029F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r5 = Rightupperarm.addOrReplaceChild("Rightupperarm_r5", CubeListBuilder.create().texOffs(76, 82).addBox(-0.5F, -1.1F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.0297F, 1.0132F, -0.029F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1174F, 5.9587F, -0.1377F, -1.1324F, -0.6093F, -0.105F));

		PartDefinition Rightlowerarm_r1 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r1", CubeListBuilder.create().texOffs(82, 72).addBox(-0.5F, -0.4F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.0614F, 1.2506F, 0.1274F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r2 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r2", CubeListBuilder.create().texOffs(82, 47).addBox(-0.5F, -1.8F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0614F, 1.2506F, 0.1274F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r3 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r3", CubeListBuilder.create().texOffs(46, 82).addBox(-0.5F, -0.4F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.0614F, 1.2506F, -0.6726F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r4 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r4", CubeListBuilder.create().texOffs(41, 82).addBox(-0.5F, -1.8F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0614F, 1.2506F, -0.6726F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Righthand = Rightlowerarm.addOrReplaceChild("Righthand", CubeListBuilder.create().texOffs(36, 82).addBox(-1.0F, 0.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3761F, 2.5659F, -0.1435F, 0.0599F, -0.0218F, 0.6244F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4041F, 4.1954F, -4.9892F, -0.1663F, 0.4469F, 0.6515F));

		PartDefinition Leftupperarm_r1 = Leftupperarm.addOrReplaceChild("Leftupperarm_r1", CubeListBuilder.create().texOffs(43, 77).addBox(-0.5F, -0.1F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0297F, 2.9847F, 0.3083F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r2 = Leftupperarm.addOrReplaceChild("Leftupperarm_r2", CubeListBuilder.create().texOffs(84, 0).addBox(-0.5F, -1.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0297F, 2.3484F, -0.45F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r3 = Leftupperarm.addOrReplaceChild("Leftupperarm_r3", CubeListBuilder.create().texOffs(83, 65).addBox(-0.5F, -1.7F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0297F, 3.016F, -0.2395F, 0.1833F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r4 = Leftupperarm.addOrReplaceChild("Leftupperarm_r4", CubeListBuilder.create().texOffs(83, 59).addBox(-0.5F, -1.1F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.0297F, 1.0132F, -0.029F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r5 = Leftupperarm.addOrReplaceChild("Leftupperarm_r5", CubeListBuilder.create().texOffs(58, 83).addBox(-0.5F, -1.1F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0297F, 1.0132F, -0.029F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1174F, 5.9587F, -0.1377F, -0.9981F, -0.0587F, -0.2291F));

		PartDefinition Leftlowerarm_r1 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r1", CubeListBuilder.create().texOffs(83, 55).addBox(-0.5F, -0.4F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.0614F, 1.2506F, 0.1274F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r2 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r2", CubeListBuilder.create().texOffs(83, 51).addBox(-0.5F, -1.8F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0614F, 1.2506F, 0.1274F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r3 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r3", CubeListBuilder.create().texOffs(83, 31).addBox(-0.5F, -0.4F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.0614F, 1.2506F, -0.6726F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r4 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r4", CubeListBuilder.create().texOffs(10, 83).addBox(-0.5F, -1.8F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0614F, 1.2506F, -0.6726F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Lefthand = Leftlowerarm.addOrReplaceChild("Lefthand", CubeListBuilder.create().texOffs(5, 83).addBox(0.0F, 0.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3761F, 2.5659F, -0.1435F, 0.0627F, 0.0111F, -0.4501F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(3.0F, 2.8844F, -5.7808F));

		PartDefinition Bodyfront_r103 = bone.addOrReplaceChild("Bodyfront_r103", CubeListBuilder.create().texOffs(71, 57).addBox(-0.5F, -1.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0452F, -0.3141F, 1.2194F, 2.3217F, 0.0415F, -0.2505F));

		PartDefinition Bodyfront_r104 = bone.addOrReplaceChild("Bodyfront_r104", CubeListBuilder.create().texOffs(56, 71).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0452F, -0.3141F, 1.2194F, 1.0563F, 0.0415F, -0.2505F));

		PartDefinition Bodyfront_r105 = bone.addOrReplaceChild("Bodyfront_r105", CubeListBuilder.create().texOffs(55, 31).addBox(-0.5F, -0.35F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.0076F)), PartPose.offsetAndRotation(-0.329F, -1.6428F, 2.5318F, 0.6549F, 0.0415F, -0.2505F));

		PartDefinition Bodyfront_r106 = bone.addOrReplaceChild("Bodyfront_r106", CubeListBuilder.create().texOffs(35, 61).addBox(-0.5F, 0.0931F, -0.0716F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.6185F, -2.8537F, 3.0086F, 0.3931F, 0.0415F, -0.2505F));

		PartDefinition Bodyfront_r107 = bone.addOrReplaceChild("Bodyfront_r107", CubeListBuilder.create().texOffs(71, 53).addBox(-0.5F, 0.0931F, -0.0716F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4197F, -1.7946F, 1.3237F, 0.5676F, 0.0415F, -0.2505F));

		PartDefinition Bodyfront_r108 = bone.addOrReplaceChild("Bodyfront_r108", CubeListBuilder.create().texOffs(71, 39).addBox(-0.5F, -0.7069F, -0.1716F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.4F, 0.7073F, 0.0415F, -0.2505F));

		PartDefinition Bodyfront_r109 = bone.addOrReplaceChild("Bodyfront_r109", CubeListBuilder.create().texOffs(33, 71).addBox(-1.411F, -1.2901F, -0.4215F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.625F, 0.6465F, -0.3024F, 0.5359F, -0.9821F, -0.0453F));

		PartDefinition Bodyfront_r110 = bone.addOrReplaceChild("Bodyfront_r110", CubeListBuilder.create().texOffs(71, 32).addBox(-1.3777F, -0.7474F, -0.4215F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.625F, 0.6465F, -0.3024F, 1.056F, -0.2473F, -0.8584F));

		PartDefinition Bodyfront_r111 = bone.addOrReplaceChild("Bodyfront_r111", CubeListBuilder.create().texOffs(84, 8).addBox(-0.0448F, -0.8886F, -0.4215F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.625F, 0.6465F, -0.3024F, 0.9924F, -0.5089F, -0.6881F));

		PartDefinition bone4 = Bodyfront.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-3.0F, 2.8844F, -5.7808F));

		PartDefinition Bodyfront_r112 = bone4.addOrReplaceChild("Bodyfront_r112", CubeListBuilder.create().texOffs(71, 57).mirror().addBox(-0.5F, -1.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0452F, -0.3141F, 1.2194F, 2.3217F, -0.0415F, 0.2505F));

		PartDefinition Bodyfront_r113 = bone4.addOrReplaceChild("Bodyfront_r113", CubeListBuilder.create().texOffs(56, 71).mirror().addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0452F, -0.3141F, 1.2194F, 1.0563F, -0.0415F, 0.2505F));

		PartDefinition Bodyfront_r114 = bone4.addOrReplaceChild("Bodyfront_r114", CubeListBuilder.create().texOffs(55, 31).mirror().addBox(-0.5F, -0.35F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.0076F)).mirror(false), PartPose.offsetAndRotation(0.329F, -1.6428F, 2.5318F, 0.6549F, -0.0415F, 0.2505F));

		PartDefinition Bodyfront_r115 = bone4.addOrReplaceChild("Bodyfront_r115", CubeListBuilder.create().texOffs(35, 61).mirror().addBox(-0.5F, 0.0931F, -0.0716F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.6185F, -2.8537F, 3.0086F, 0.3931F, -0.0415F, 0.2505F));

		PartDefinition Bodyfront_r116 = bone4.addOrReplaceChild("Bodyfront_r116", CubeListBuilder.create().texOffs(71, 53).mirror().addBox(-0.5F, 0.0931F, -0.0716F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4197F, -1.7946F, 1.3237F, 0.5676F, -0.0415F, 0.2505F));

		PartDefinition Bodyfront_r117 = bone4.addOrReplaceChild("Bodyfront_r117", CubeListBuilder.create().texOffs(71, 39).mirror().addBox(-0.5F, -0.7069F, -0.1716F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.4F, 0.7073F, -0.0415F, 0.2505F));

		PartDefinition Bodyfront_r118 = bone4.addOrReplaceChild("Bodyfront_r118", CubeListBuilder.create().texOffs(33, 71).mirror().addBox(-0.589F, -1.2901F, -0.4215F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.625F, 0.6465F, -0.3024F, 0.5359F, 0.9821F, 0.0453F));

		PartDefinition Bodyfront_r119 = bone4.addOrReplaceChild("Bodyfront_r119", CubeListBuilder.create().texOffs(71, 32).mirror().addBox(-0.6223F, -0.7474F, -0.4215F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.625F, 0.6465F, -0.3024F, 1.056F, 0.2473F, 0.8584F));

		PartDefinition Bodyfront_r120 = bone4.addOrReplaceChild("Bodyfront_r120", CubeListBuilder.create().texOffs(84, 8).mirror().addBox(-0.9552F, -0.8886F, -0.4215F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.625F, 0.6465F, -0.3024F, 0.9924F, 0.5089F, 0.6881F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1872F, 3.8984F, -0.1373F, 0.0432F, -0.006F));

		PartDefinition Bodyfront_r121 = Tailbase.addOrReplaceChild("Bodyfront_r121", CubeListBuilder.create().texOffs(98, 61).addBox(0.0F, -1.1F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 98).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.836F, 5.5758F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r122 = Tailbase.addOrReplaceChild("Bodyfront_r122", CubeListBuilder.create().texOffs(98, 57).addBox(0.0F, -1.5F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4167F, 1.5367F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r123 = Tailbase.addOrReplaceChild("Bodyfront_r123", CubeListBuilder.create().texOffs(25, 94).addBox(0.0F, 0.1F, 0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4519F, 6.7517F, 0.6021F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r124 = Tailbase.addOrReplaceChild("Bodyfront_r124", CubeListBuilder.create().texOffs(13, 49).addBox(0.0F, 0.0F, -0.2F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1575F, 4.632F, 0.5847F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r125 = Tailbase.addOrReplaceChild("Bodyfront_r125", CubeListBuilder.create().texOffs(19, 24).addBox(0.0F, 0.1F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3453F, 2.7176F, 0.5847F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r126 = Tailbase.addOrReplaceChild("Bodyfront_r126", CubeListBuilder.create().texOffs(94, 18).addBox(0.0F, -1.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6574F, 1.2082F, 0.7156F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r127 = Tailbase.addOrReplaceChild("Bodyfront_r127", CubeListBuilder.create().texOffs(57, 98).addBox(0.0F, -1.4F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4167F, 1.5367F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Tailbase_r1 = Tailbase.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(0, 34).mirror().addBox(-1.0F, 0.0F, -0.2F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1007F, 0.2831F, 0.0524F, 0.0349F, 0.0018F));

		PartDefinition Tailbase_r2 = Tailbase.addOrReplaceChild("Tailbase_r2", CubeListBuilder.create().texOffs(0, 34).addBox(0.0F, 0.0F, -0.2F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1007F, 0.2831F, 0.0524F, -0.0349F, -0.0018F));

		PartDefinition Tailbase_r3 = Tailbase.addOrReplaceChild("Tailbase_r3", CubeListBuilder.create().texOffs(23, 21).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.1007F, 0.2831F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6078F, 8.0702F, 0.1787F, 0.2868F, 0.1383F));

		PartDefinition Bodyfront_r128 = Tailmiddlebase.addOrReplaceChild("Bodyfront_r128", CubeListBuilder.create().texOffs(63, 99).addBox(0.0F, -0.9F, 10.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 99).addBox(0.0F, -0.9F, 8.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1536F, -3.9058F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r129 = Tailmiddlebase.addOrReplaceChild("Bodyfront_r129", CubeListBuilder.create().texOffs(41, 99).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0244F, 2.8918F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r130 = Tailmiddlebase.addOrReplaceChild("Bodyfront_r130", CubeListBuilder.create().texOffs(38, 99).addBox(0.0F, -1.2F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.028F, 0.8925F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r1 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(19, 31).mirror().addBox(-0.7F, 0.0F, 0.0F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2831F, -0.0986F, 0.0175F, 0.0349F, 0.0006F));

		PartDefinition Tailmiddlebase_r2 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r2", CubeListBuilder.create().texOffs(19, 31).addBox(-0.3F, 0.0F, 0.0F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2831F, -0.0986F, 0.0175F, -0.0349F, -0.0006F));

		PartDefinition Tailmiddlebase_r3 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r3", CubeListBuilder.create().texOffs(23, 11).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2831F, -0.0986F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r131 = Tailmiddlebase.addOrReplaceChild("Bodyfront_r131", CubeListBuilder.create().texOffs(54, 98).addBox(0.0F, 2.0F, 3.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 53).addBox(0.0F, 1.4F, 1.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 93).addBox(0.0F, -0.2F, -0.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4378F, 1.2021F, 0.4712F, 0.0F, 0.0F));

		PartDefinition Tailmiddle = Tailmiddlebase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0222F, 7.9698F, 0.0336F, 0.0872F, 0.0029F));

		PartDefinition Tailmiddle_r1 = Tailmiddle.addOrReplaceChild("Tailmiddle_r1", CubeListBuilder.create().texOffs(35, 99).addBox(0.0F, -0.8F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 99).addBox(0.0F, -0.9F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 99).addBox(0.0F, -0.9F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 31).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.2652F, -0.1284F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r132 = Tailmiddle.addOrReplaceChild("Bodyfront_r132", CubeListBuilder.create().texOffs(99, 9).addBox(0.0F, 5.0F, 9.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 6).addBox(0.0F, 4.3F, 7.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 3).addBox(0.0F, 3.5F, 5.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.46F, -6.7678F, 0.4712F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = Tailmiddle.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0227F, 6.8731F, -0.075F, 0.1741F, -0.013F));

		PartDefinition Bodyfront_r133 = Tailmiddleend.addOrReplaceChild("Bodyfront_r133", CubeListBuilder.create().texOffs(26, 99).addBox(0.0F, 7.5F, 15.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 99).addBox(0.0F, 6.6F, 13.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 99).addBox(0.0F, 5.7F, 11.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4373F, -13.6408F, 0.4712F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.4556F, -0.0967F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.1498F, 9.8048F, -0.1322F, 0.1298F, -0.0172F));

		PartDefinition Tailend2 = Tailend.addOrReplaceChild("Tailend2", CubeListBuilder.create().texOffs(42, 18).addBox(-0.5F, -0.4556F, -0.0967F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0168F, 9.8826F, -0.0995F, -0.2606F, 0.0257F));

		PartDefinition Tailend3 = Tailend2.addOrReplaceChild("Tailend3", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -0.4556F, -0.0967F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.0191F, 5.9256F, -0.1794F, -0.387F, 0.0683F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3F, 0.7993F, 0.3828F, 0.1758F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r1 = Rightthigh.addOrReplaceChild("Rightthigh_r1", CubeListBuilder.create().texOffs(51, 86).addBox(-0.5F, 0.2385F, 0.0538F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 8.5604F, -2.4812F, 0.6981F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r2 = Rightthigh.addOrReplaceChild("Rightthigh_r2", CubeListBuilder.create().texOffs(5, 73).addBox(-1.0F, 0.0385F, 0.0538F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 8.5604F, -2.4812F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r3 = Rightthigh.addOrReplaceChild("Rightthigh_r3", CubeListBuilder.create().texOffs(46, 86).addBox(-1.0F, 0.0385F, 0.0538F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 6.5623F, -2.5685F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r4 = Rightthigh.addOrReplaceChild("Rightthigh_r4", CubeListBuilder.create().texOffs(60, 95).addBox(-1.0F, 0.0F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 7.5902F, -2.3016F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r5 = Rightthigh.addOrReplaceChild("Rightthigh_r5", CubeListBuilder.create().texOffs(55, 95).addBox(-1.0F, 0.0F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 6.5912F, -2.258F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r6 = Rightthigh.addOrReplaceChild("Rightthigh_r6", CubeListBuilder.create().texOffs(95, 33).addBox(-1.0F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 6.1682F, -1.7772F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r7 = Rightthigh.addOrReplaceChild("Rightthigh_r7", CubeListBuilder.create().texOffs(50, 94).addBox(-1.0F, 0.0385F, 0.0538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 5.5661F, -2.4813F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r8 = Rightthigh.addOrReplaceChild("Rightthigh_r8", CubeListBuilder.create().texOffs(41, 86).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.9133F, -1.4578F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r9 = Rightthigh.addOrReplaceChild("Rightthigh_r9", CubeListBuilder.create().texOffs(36, 86).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 3.7399F, -1.7941F, -0.3316F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r10 = Rightthigh.addOrReplaceChild("Rightthigh_r10", CubeListBuilder.create().texOffs(78, 56).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.7399F, -1.7941F, -0.4625F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r11 = Rightthigh.addOrReplaceChild("Rightthigh_r11", CubeListBuilder.create().texOffs(78, 51).addBox(-1.0F, -0.3F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 2.0F, 0.5F, -0.5149F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r12 = Rightthigh.addOrReplaceChild("Rightthigh_r12", CubeListBuilder.create().texOffs(78, 37).addBox(-1.0F, -1.6F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(77, 26).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.2659F, 1.3435F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r13 = Rightthigh.addOrReplaceChild("Rightthigh_r13", CubeListBuilder.create().texOffs(22, 86).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 2.0785F, 0.4982F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r14 = Rightthigh.addOrReplaceChild("Rightthigh_r14", CubeListBuilder.create().texOffs(78, 32).addBox(-1.0F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 0.5F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create().texOffs(57, 23).addBox(-1.9F, -0.0965F, -0.8026F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.5F, 11.0F, -1.5F, 0.8017F, -0.158F, 0.1511F));

		PartDefinition Rightshin_r1 = Rightshin.addOrReplaceChild("Rightshin_r1", CubeListBuilder.create().texOffs(86, 14).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 2.1957F, 1.6186F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Rightshin_r2 = Rightshin.addOrReplaceChild("Rightshin_r2", CubeListBuilder.create().texOffs(70, 72).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 0.8099F, 2.1926F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Rightshin_r3 = Rightshin.addOrReplaceChild("Rightshin_r3", CubeListBuilder.create().texOffs(68, 85).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 1.5949F, 0.6847F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Rightshin_r4 = Rightshin.addOrReplaceChild("Rightshin_r4", CubeListBuilder.create().texOffs(19, 72).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 0.9035F, -0.8026F, 0.48F, 0.0F, 0.0F));

		PartDefinition Rightshin_r5 = Rightshin.addOrReplaceChild("Rightshin_r5", CubeListBuilder.create().texOffs(34, 66).addBox(-0.5F, -2.2F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.7F, 1.7618F, 0.8128F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Rightshin_r6 = Rightshin.addOrReplaceChild("Rightshin_r6", CubeListBuilder.create().texOffs(66, 30).addBox(-0.5F, -1.8F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.7F, 1.7618F, 0.8128F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Rightshin_r7 = Rightshin.addOrReplaceChild("Rightshin_r7", CubeListBuilder.create().texOffs(63, 85).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.7F, 3.6604F, 0.0088F, 0.192F, 0.0F, 0.0F));

		PartDefinition Rightshin_r8 = Rightshin.addOrReplaceChild("Rightshin_r8", CubeListBuilder.create().texOffs(31, 84).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.7F, 2.9568F, 0.4934F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Rightshin_r9 = Rightshin.addOrReplaceChild("Rightshin_r9", CubeListBuilder.create().texOffs(0, 78).addBox(-0.5F, -2.3F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.7F, 1.7618F, 0.8128F, 0.2793F, 0.0F, 0.0F));

		PartDefinition Rightshin_r10 = Rightshin.addOrReplaceChild("Rightshin_r10", CubeListBuilder.create().texOffs(77, 77).addBox(-0.5F, -2.4F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, 1.7618F, 0.8128F, -0.3316F, 0.0F, 0.0F));

		PartDefinition Rightshin_r11 = Rightshin.addOrReplaceChild("Rightshin_r11", CubeListBuilder.create().texOffs(77, 72).addBox(-0.5F, -2.8F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.7F, 4.3183F, 0.339F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Rightshin_r12 = Rightshin.addOrReplaceChild("Rightshin_r12", CubeListBuilder.create().texOffs(14, 66).addBox(-0.5F, -4.8F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.7F, 8.9512F, 0.5762F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Rightshin_r13 = Rightshin.addOrReplaceChild("Rightshin_r13", CubeListBuilder.create().texOffs(9, 66).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, 12.1838F, -0.152F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Rightshin_r14 = Rightshin.addOrReplaceChild("Rightshin_r14", CubeListBuilder.create().texOffs(48, 77).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.9F, 10.8F, 0.613F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Rightshin_r15 = Rightshin.addOrReplaceChild("Rightshin_r15", CubeListBuilder.create().texOffs(29, 62).addBox(0.0F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 5.823F, 1.0922F, -0.096F, 0.0F, 0.0F));

		PartDefinition Rightshin_r16 = Rightshin.addOrReplaceChild("Rightshin_r16", CubeListBuilder.create().texOffs(0, 72).addBox(0.0F, -1.6F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(71, 65).addBox(-0.5F, -2.6F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.4F, 3.4035F, 0.6974F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Rightankle = Rightshin.addOrReplaceChild("Rightankle", CubeListBuilder.create().texOffs(43, 50).addBox(-1.0F, -0.2565F, -0.444F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 14.2593F, -0.4937F, -0.7623F, -0.0907F, -0.0945F));

		PartDefinition Rightfoot = Rightankle.addOrReplaceChild("Rightfoot", CubeListBuilder.create().texOffs(42, 26).addBox(-2.0F, -0.5F, -2.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.7242F, -0.0177F, 0.6286F, 0.1825F, -0.0295F));

		PartDefinition Righttoes = Rightfoot.addOrReplaceChild("Righttoes", CubeListBuilder.create().texOffs(0, 43).addBox(-2.0F, -0.5F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.01F, -2.5F, -0.6545F, 0.0F, 0.0F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3F, 0.7993F, 0.3828F, -0.6096F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r1 = Leftthigh.addOrReplaceChild("Leftthigh_r1", CubeListBuilder.create().texOffs(87, 45).addBox(-0.5F, 0.2385F, 0.0538F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 8.5604F, -2.4812F, 0.6981F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r2 = Leftthigh.addOrReplaceChild("Leftthigh_r2", CubeListBuilder.create().texOffs(47, 73).addBox(-1.0F, 0.0385F, 0.0538F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 8.5604F, -2.4812F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r3 = Leftthigh.addOrReplaceChild("Leftthigh_r3", CubeListBuilder.create().texOffs(87, 41).addBox(0.0F, 0.0385F, 0.0538F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 6.5623F, -2.5685F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r4 = Leftthigh.addOrReplaceChild("Leftthigh_r4", CubeListBuilder.create().texOffs(96, 12).addBox(0.0F, 0.0F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 7.5902F, -2.3016F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r5 = Leftthigh.addOrReplaceChild("Leftthigh_r5", CubeListBuilder.create().texOffs(95, 95).addBox(0.0F, 0.0F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 6.5912F, -2.258F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r6 = Leftthigh.addOrReplaceChild("Leftthigh_r6", CubeListBuilder.create().texOffs(90, 95).addBox(0.0F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 6.1682F, -1.7772F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r7 = Leftthigh.addOrReplaceChild("Leftthigh_r7", CubeListBuilder.create().texOffs(85, 95).addBox(0.0F, 0.0385F, 0.0538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 5.5661F, -2.4813F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r8 = Leftthigh.addOrReplaceChild("Leftthigh_r8", CubeListBuilder.create().texOffs(15, 87).addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.9133F, -1.4578F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r9 = Leftthigh.addOrReplaceChild("Leftthigh_r9", CubeListBuilder.create().texOffs(10, 87).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 3.7399F, -1.7941F, -0.3316F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r10 = Leftthigh.addOrReplaceChild("Leftthigh_r10", CubeListBuilder.create().texOffs(66, 80).addBox(0.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.7399F, -1.7941F, -0.4625F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r11 = Leftthigh.addOrReplaceChild("Leftthigh_r11", CubeListBuilder.create().texOffs(19, 80).addBox(0.0F, -0.3F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 2.0F, 0.5F, -0.5149F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r12 = Leftthigh.addOrReplaceChild("Leftthigh_r12", CubeListBuilder.create().texOffs(79, 15).addBox(-1.0F, -1.6F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(78, 40).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.2659F, 1.3435F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r13 = Leftthigh.addOrReplaceChild("Leftthigh_r13", CubeListBuilder.create().texOffs(5, 87).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 2.0785F, 0.4982F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r14 = Leftthigh.addOrReplaceChild("Leftthigh_r14", CubeListBuilder.create().texOffs(53, 79).addBox(0.0F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 0.5F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create().texOffs(24, 57).addBox(-0.1F, -0.0965F, -0.8026F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.5F, 11.0F, -1.5F, 0.9864F, 0.052F, -0.0701F));

		PartDefinition Leftshin_r1 = Leftshin.addOrReplaceChild("Leftshin_r1", CubeListBuilder.create().texOffs(0, 87).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 2.1957F, 1.6186F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Leftshin_r2 = Leftshin.addOrReplaceChild("Leftshin_r2", CubeListBuilder.create().texOffs(73, 43).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.8099F, 2.1926F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Leftshin_r3 = Leftshin.addOrReplaceChild("Leftshin_r3", CubeListBuilder.create().texOffs(83, 86).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.5949F, 0.6847F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Leftshin_r4 = Leftshin.addOrReplaceChild("Leftshin_r4", CubeListBuilder.create().texOffs(40, 73).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.9035F, -0.8026F, 0.48F, 0.0F, 0.0F));

		PartDefinition Leftshin_r5 = Leftshin.addOrReplaceChild("Leftshin_r5", CubeListBuilder.create().texOffs(56, 66).addBox(-0.5F, -2.2F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.7F, 1.7618F, 0.8128F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Leftshin_r6 = Leftshin.addOrReplaceChild("Leftshin_r6", CubeListBuilder.create().texOffs(66, 54).addBox(-0.5F, -1.8F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.7F, 1.7618F, 0.8128F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Leftshin_r7 = Leftshin.addOrReplaceChild("Leftshin_r7", CubeListBuilder.create().texOffs(78, 86).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.7F, 3.6604F, 0.0088F, 0.192F, 0.0F, 0.0F));

		PartDefinition Leftshin_r8 = Leftshin.addOrReplaceChild("Leftshin_r8", CubeListBuilder.create().texOffs(73, 86).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.7F, 2.9568F, 0.4934F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Leftshin_r9 = Leftshin.addOrReplaceChild("Leftshin_r9", CubeListBuilder.create().texOffs(31, 79).addBox(-0.5F, -2.3F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.7F, 1.7618F, 0.8128F, 0.2793F, 0.0F, 0.0F));

		PartDefinition Leftshin_r10 = Leftshin.addOrReplaceChild("Leftshin_r10", CubeListBuilder.create().texOffs(26, 79).addBox(-0.5F, -2.4F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7F, 1.7618F, 0.8128F, -0.3316F, 0.0F, 0.0F));

		PartDefinition Leftshin_r11 = Leftshin.addOrReplaceChild("Leftshin_r11", CubeListBuilder.create().texOffs(78, 65).addBox(-0.5F, -2.8F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.7F, 4.3183F, 0.339F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Leftshin_r12 = Leftshin.addOrReplaceChild("Leftshin_r12", CubeListBuilder.create().texOffs(51, 66).addBox(-0.5F, -4.8F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.7F, 8.9512F, 0.5762F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Leftshin_r13 = Leftshin.addOrReplaceChild("Leftshin_r13", CubeListBuilder.create().texOffs(46, 66).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7F, 12.1838F, -0.152F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Leftshin_r14 = Leftshin.addOrReplaceChild("Leftshin_r14", CubeListBuilder.create().texOffs(61, 78).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9F, 10.8F, 0.613F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Leftshin_r15 = Leftshin.addOrReplaceChild("Leftshin_r15", CubeListBuilder.create().texOffs(41, 66).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 5.823F, 1.0922F, -0.096F, 0.0F, 0.0F));

		PartDefinition Leftshin_r16 = Leftshin.addOrReplaceChild("Leftshin_r16", CubeListBuilder.create().texOffs(26, 73).addBox(-1.0F, -1.6F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(12, 73).addBox(-1.5F, -2.6F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.4F, 3.4035F, 0.6974F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Leftankle = Leftshin.addOrReplaceChild("Leftankle", CubeListBuilder.create().texOffs(50, 50).addBox(-1.0F, -0.2565F, -0.444F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 14.2593F, -0.4937F, -1.3132F, -0.0691F, 0.1393F));

		PartDefinition Leftfoot = Leftankle.addOrReplaceChild("Leftfoot", CubeListBuilder.create().texOffs(44, 6).addBox(-2.0F, -0.5F, -2.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.7242F, -0.0177F, 2.1904F, 0.0527F, 0.0327F));

		PartDefinition Lefttoes = Leftfoot.addOrReplaceChild("Lefttoes", CubeListBuilder.create().texOffs(44, 0).addBox(-2.0F, -0.5F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.01F, -2.5F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, 2.3692F, 0.4188F, 0.0F, 0.0F, -0.1222F));

		PartDefinition Hips_r2 = bone2.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(68, 5).addBox(-0.9995F, -1.1403F, -2.7576F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4F, -3.101F, 1.3451F, 1.5795F, 0.0F, 0.2182F));

		PartDefinition Hips_r3 = bone2.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(19, 67).addBox(-0.9995F, -1.5521F, -1.4988F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(97, 42).addBox(-0.9995F, -3.4707F, -1.3095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4F, -3.101F, 1.3451F, 1.6668F, 0.0F, 0.2182F));

		PartDefinition Hips_r4 = bone2.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(71, 80).addBox(-0.9995F, -2.3586F, -2.6436F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4F, -3.101F, 1.3451F, 1.2741F, 0.0F, 0.2182F));

		PartDefinition Hips_r5 = bone2.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(97, 39).addBox(-0.9995F, -3.0651F, -2.7107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.4F, -3.101F, 1.3451F, 1.405F, 0.0F, 0.2182F));

		PartDefinition Hips_r6 = bone2.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(97, 36).addBox(-0.1815F, 0.9214F, -3.3673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.1F, 3.099F, -4.8549F, 0.4169F, -0.0289F, 0.1655F));

		PartDefinition Hips_r7 = bone2.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(97, 26).addBox(-0.1815F, -0.3761F, -4.1553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(12, 77).addBox(-0.1815F, -0.0761F, -4.1553F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.1F, 3.099F, -4.8549F, 0.8096F, -0.0289F, 0.1655F));

		PartDefinition Hips_r8 = bone2.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(87, 73).addBox(-0.1815F, 0.6226F, -2.8475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-2.1F, 3.099F, -4.8549F, 0.5914F, -0.0289F, 0.1655F));

		PartDefinition Hips_r9 = bone2.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(97, 18).addBox(-0.1815F, -1.5756F, -3.4552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F))
				.texOffs(87, 69).addBox(-0.1815F, -1.8756F, -3.8552F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-2.1F, 3.099F, -4.8549F, 1.4205F, -0.0289F, 0.1655F));

		PartDefinition Hips_r10 = bone2.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(0, 56).addBox(-0.1815F, -0.4935F, -3.719F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(-2.1F, 3.099F, -4.8549F, 0.9405F, -0.0289F, 0.1655F));

		PartDefinition Hips_r11 = bone2.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(77, 8).addBox(-0.256F, -2.4069F, -2.714F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3F, 0.099F, 4.0451F, -3.0456F, 0.0F, 0.3142F));

		PartDefinition Hips_r12 = bone2.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(5, 77).addBox(-0.256F, -1.1938F, -3.1576F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.3F, 0.099F, 4.0451F, 2.8013F, 0.0F, 0.3142F));

		PartDefinition Hips_r13 = bone2.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(15, 97).addBox(-0.256F, 0.1918F, -3.614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F))
				.texOffs(10, 97).addBox(-0.256F, -0.0082F, -3.614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.3F, 0.099F, 4.0451F, 2.33F, 0.0F, 0.3142F));

		PartDefinition Hips_r14 = bone2.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(56, 87).addBox(-0.256F, 0.3153F, -2.8866F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.3F, 0.099F, 4.0451F, 1.7191F, 0.0F, 0.3142F));

		PartDefinition Hips_r15 = bone2.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(20, 62).addBox(-0.256F, -0.8404F, -2.3035F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.3F, 0.099F, 4.0451F, 2.5482F, 0.0F, 0.3142F));

		PartDefinition Hips_r16 = bone2.addOrReplaceChild("Hips_r16", CubeListBuilder.create().texOffs(5, 97).addBox(-0.256F, -0.7165F, -0.4158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3F, 0.099F, 4.0451F, 2.1118F, 0.0F, 0.3142F));

		PartDefinition Hips_r17 = bone2.addOrReplaceChild("Hips_r17", CubeListBuilder.create().texOffs(0, 62).addBox(-0.729F, -0.5519F, -2.7755F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2F, 1.199F, -3.1549F, 0.9063F, -0.0468F, 0.2176F));

		PartDefinition Hips_r18 = bone2.addOrReplaceChild("Hips_r18", CubeListBuilder.create().texOffs(0, 97).addBox(-0.8139F, -0.5202F, -1.1331F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, -0.801F, -1.7549F, 1.0985F, 0.1197F, 0.3068F));

		PartDefinition Hips_r19 = bone2.addOrReplaceChild("Hips_r19", CubeListBuilder.create().texOffs(96, 91).addBox(-0.8139F, -0.5568F, -0.5651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.3F, -0.801F, -1.7549F, 1.2206F, 0.1197F, 0.3068F));

		PartDefinition Hips_r20 = bone2.addOrReplaceChild("Hips_r20", CubeListBuilder.create().texOffs(44, 61).addBox(-0.8139F, -0.373F, -2.7812F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1988F)), PartPose.offsetAndRotation(-0.3F, -0.801F, -1.7549F, 0.9239F, 0.1197F, 0.3068F));

		PartDefinition Hips_r21 = bone2.addOrReplaceChild("Hips_r21", CubeListBuilder.create().texOffs(77, 0).addBox(-0.8572F, 0.1038F, -0.8877F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F))
				.texOffs(19, 76).addBox(-0.8572F, -0.4962F, -0.8877F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3F, -0.601F, 1.3451F, 0.4887F, 0.0F, 0.4451F));

		PartDefinition Hips_r22 = bone2.addOrReplaceChild("Hips_r22", CubeListBuilder.create().texOffs(75, 96).addBox(-0.8572F, -1.2129F, 1.5486F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F))
				.texOffs(43, 96).addBox(-0.8572F, -1.2129F, 1.0486F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.3F, -0.601F, 1.3451F, -0.6894F, 0.0F, 0.4451F));

		PartDefinition Hips_r23 = bone2.addOrReplaceChild("Hips_r23", CubeListBuilder.create().texOffs(70, 96).addBox(-0.8572F, -0.4407F, 1.562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F))
				.texOffs(65, 96).addBox(-0.8572F, -0.4407F, 1.062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3F, -0.601F, 1.3451F, -0.5149F, 0.0F, 0.4451F));

		PartDefinition Hips_r24 = bone2.addOrReplaceChild("Hips_r24", CubeListBuilder.create().texOffs(38, 96).addBox(-0.8572F, -0.1511F, 0.6818F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.3F, -0.601F, 1.3451F, 0.0524F, 0.0F, 0.4451F));

		PartDefinition Hips_r25 = bone2.addOrReplaceChild("Hips_r25", CubeListBuilder.create().texOffs(70, 76).addBox(-0.8572F, 0.2734F, -0.6011F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.3F, -0.601F, 1.3451F, 0.2269F, 0.0F, 0.4451F));

		PartDefinition Hips_r26 = bone2.addOrReplaceChild("Hips_r26", CubeListBuilder.create().texOffs(54, 75).addBox(-0.9995F, -1.645F, -3.8441F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(64, 64).addBox(-0.9995F, -1.945F, -2.4441F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -3.101F, 1.3451F, 0.9687F, 0.0F, 0.2182F));

		PartDefinition Hips_r27 = bone2.addOrReplaceChild("Hips_r27", CubeListBuilder.create().texOffs(75, 47).addBox(-0.5F, -0.9302F, -1.9738F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -2.9221F, 2.9013F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Hips_r28 = bone2.addOrReplaceChild("Hips_r28", CubeListBuilder.create().texOffs(31, 75).addBox(-0.5F, 0.4698F, 0.0262F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(75, 22).addBox(-0.5F, -0.0302F, 0.0262F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -4.48F, 2.7495F, -0.3665F, 0.0F, 0.0F));

		PartDefinition Hips_r29 = bone2.addOrReplaceChild("Hips_r29", CubeListBuilder.create().texOffs(33, 96).addBox(-0.5F, -0.0302F, 0.0262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -4.7556F, 1.7882F, -0.2793F, 0.0F, 0.0F));

		PartDefinition Hips_r30 = bone2.addOrReplaceChild("Hips_r30", CubeListBuilder.create().texOffs(28, 96).addBox(-0.7F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2034F))
				.texOffs(96, 23).addBox(-0.3F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -4.2649F, -3.0893F, -1.3701F, 0.0F, 0.0F));

		PartDefinition Hips_r31 = bone2.addOrReplaceChild("Hips_r31", CubeListBuilder.create().texOffs(75, 18).addBox(-0.5F, 0.1F, -1.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -3.4811F, -1.1206F, -0.6807F, 0.0F, 0.0F));

		PartDefinition Hips_r32 = bone2.addOrReplaceChild("Hips_r32", CubeListBuilder.create().texOffs(20, 96).addBox(1.5F, 0.0041F, -0.9633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.0F, -4.7477F, -2.1386F, 0.2269F, 0.0F, 0.0F));

		PartDefinition Hips_r33 = bone2.addOrReplaceChild("Hips_r33", CubeListBuilder.create().texOffs(96, 15).addBox(1.5F, 0.9041F, -0.9633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(75, 4).addBox(1.5F, 0.5041F, -1.9633F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(63, 74).addBox(1.5F, 0.0041F, -1.9633F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.0F, -5.026F, -0.1581F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Hips_r34 = bone2.addOrReplaceChild("Hips_r34", CubeListBuilder.create().texOffs(0, 67).addBox(-0.5F, -0.975F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -3.9171F, 0.9257F, -0.1222F, 0.0F, 0.0F));

		PartDefinition bone3 = Hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, 2.3692F, 0.4188F, 0.0F, 0.0F, 0.1222F));

		PartDefinition Hips_r35 = bone3.addOrReplaceChild("Hips_r35", CubeListBuilder.create().texOffs(68, 5).mirror().addBox(-0.0005F, -1.1403F, -2.7576F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -3.101F, 1.3451F, 1.5795F, 0.0F, -0.2182F));

		PartDefinition Hips_r36 = bone3.addOrReplaceChild("Hips_r36", CubeListBuilder.create().texOffs(19, 67).mirror().addBox(-0.0005F, -1.5521F, -1.4988F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(97, 42).mirror().addBox(-0.0005F, -3.4707F, -1.3095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -3.101F, 1.3451F, 1.6668F, 0.0F, -0.2182F));

		PartDefinition Hips_r37 = bone3.addOrReplaceChild("Hips_r37", CubeListBuilder.create().texOffs(71, 80).mirror().addBox(-0.0005F, -2.3586F, -2.6436F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -3.101F, 1.3451F, 1.2741F, 0.0F, -0.2182F));

		PartDefinition Hips_r38 = bone3.addOrReplaceChild("Hips_r38", CubeListBuilder.create().texOffs(97, 39).mirror().addBox(-0.0005F, -3.0651F, -2.7107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -3.101F, 1.3451F, 1.405F, 0.0F, -0.2182F));

		PartDefinition Hips_r39 = bone3.addOrReplaceChild("Hips_r39", CubeListBuilder.create().texOffs(97, 36).mirror().addBox(-0.8185F, 0.9214F, -3.3673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.1F, 3.099F, -4.8549F, 0.4169F, 0.0289F, -0.1655F));

		PartDefinition Hips_r40 = bone3.addOrReplaceChild("Hips_r40", CubeListBuilder.create().texOffs(97, 26).mirror().addBox(-0.8185F, -0.3761F, -4.1553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(12, 77).mirror().addBox(-0.8185F, -0.0761F, -4.1553F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.1F, 3.099F, -4.8549F, 0.8096F, 0.0289F, -0.1655F));

		PartDefinition Hips_r41 = bone3.addOrReplaceChild("Hips_r41", CubeListBuilder.create().texOffs(87, 73).mirror().addBox(-0.8185F, 0.6226F, -2.8475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(2.1F, 3.099F, -4.8549F, 0.5914F, 0.0289F, -0.1655F));

		PartDefinition Hips_r42 = bone3.addOrReplaceChild("Hips_r42", CubeListBuilder.create().texOffs(97, 18).mirror().addBox(-0.8185F, -1.5756F, -3.4552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(87, 69).mirror().addBox(-0.8185F, -1.8756F, -3.8552F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(2.1F, 3.099F, -4.8549F, 1.4205F, 0.0289F, -0.1655F));

		PartDefinition Hips_r43 = bone3.addOrReplaceChild("Hips_r43", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-0.8185F, -0.4935F, -3.719F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(2.1F, 3.099F, -4.8549F, 0.9405F, 0.0289F, -0.1655F));

		PartDefinition Hips_r44 = bone3.addOrReplaceChild("Hips_r44", CubeListBuilder.create().texOffs(77, 8).mirror().addBox(-0.744F, -2.4069F, -2.714F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3F, 0.099F, 4.0451F, -3.0456F, 0.0F, -0.3142F));

		PartDefinition Hips_r45 = bone3.addOrReplaceChild("Hips_r45", CubeListBuilder.create().texOffs(5, 77).mirror().addBox(-0.744F, -1.1938F, -3.1576F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.3F, 0.099F, 4.0451F, 2.8013F, 0.0F, -0.3142F));

		PartDefinition Hips_r46 = bone3.addOrReplaceChild("Hips_r46", CubeListBuilder.create().texOffs(15, 97).mirror().addBox(-0.744F, 0.1918F, -3.614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false)
				.texOffs(10, 97).mirror().addBox(-0.744F, -0.0082F, -3.614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.3F, 0.099F, 4.0451F, 2.33F, 0.0F, -0.3142F));

		PartDefinition Hips_r47 = bone3.addOrReplaceChild("Hips_r47", CubeListBuilder.create().texOffs(56, 87).mirror().addBox(-0.744F, 0.3153F, -2.8866F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.3F, 0.099F, 4.0451F, 1.7191F, 0.0F, -0.3142F));

		PartDefinition Hips_r48 = bone3.addOrReplaceChild("Hips_r48", CubeListBuilder.create().texOffs(20, 62).mirror().addBox(-0.744F, -0.8404F, -2.3035F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.3F, 0.099F, 4.0451F, 2.5482F, 0.0F, -0.3142F));

		PartDefinition Hips_r49 = bone3.addOrReplaceChild("Hips_r49", CubeListBuilder.create().texOffs(5, 97).mirror().addBox(-0.744F, -0.7165F, -0.4158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3F, 0.099F, 4.0451F, 2.1118F, 0.0F, -0.3142F));

		PartDefinition Hips_r50 = bone3.addOrReplaceChild("Hips_r50", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-0.271F, -0.5519F, -2.7755F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.2F, 1.199F, -3.1549F, 0.9063F, 0.0468F, -0.2176F));

		PartDefinition Hips_r51 = bone3.addOrReplaceChild("Hips_r51", CubeListBuilder.create().texOffs(0, 97).mirror().addBox(-0.1861F, -0.5202F, -1.1331F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3F, -0.801F, -1.7549F, 1.0985F, -0.1197F, -0.3068F));

		PartDefinition Hips_r52 = bone3.addOrReplaceChild("Hips_r52", CubeListBuilder.create().texOffs(96, 91).mirror().addBox(-0.1861F, -0.5568F, -0.5651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.3F, -0.801F, -1.7549F, 1.2206F, -0.1197F, -0.3068F));

		PartDefinition Hips_r53 = bone3.addOrReplaceChild("Hips_r53", CubeListBuilder.create().texOffs(44, 61).mirror().addBox(-0.1861F, -0.373F, -2.7812F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1988F)).mirror(false), PartPose.offsetAndRotation(0.3F, -0.801F, -1.7549F, 0.9239F, -0.1197F, -0.3068F));

		PartDefinition Hips_r54 = bone3.addOrReplaceChild("Hips_r54", CubeListBuilder.create().texOffs(77, 0).mirror().addBox(-0.1428F, 0.1038F, -0.8877F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(19, 76).mirror().addBox(-0.1428F, -0.4962F, -0.8877F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3F, -0.601F, 1.3451F, 0.4887F, 0.0F, -0.4451F));

		PartDefinition Hips_r55 = bone3.addOrReplaceChild("Hips_r55", CubeListBuilder.create().texOffs(75, 96).mirror().addBox(-0.1428F, -1.2129F, 1.5486F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false)
				.texOffs(43, 96).mirror().addBox(-0.1428F, -1.2129F, 1.0486F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.3F, -0.601F, 1.3451F, -0.6894F, 0.0F, -0.4451F));

		PartDefinition Hips_r56 = bone3.addOrReplaceChild("Hips_r56", CubeListBuilder.create().texOffs(70, 96).mirror().addBox(-0.1428F, -0.4407F, 1.562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(65, 96).mirror().addBox(-0.1428F, -0.4407F, 1.062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3F, -0.601F, 1.3451F, -0.5149F, 0.0F, -0.4451F));

		PartDefinition Hips_r57 = bone3.addOrReplaceChild("Hips_r57", CubeListBuilder.create().texOffs(38, 96).mirror().addBox(-0.1428F, -0.1511F, 0.6818F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.3F, -0.601F, 1.3451F, 0.0524F, 0.0F, -0.4451F));

		PartDefinition Hips_r58 = bone3.addOrReplaceChild("Hips_r58", CubeListBuilder.create().texOffs(70, 76).mirror().addBox(-0.1428F, 0.2734F, -0.6011F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(0.3F, -0.601F, 1.3451F, 0.2269F, 0.0F, -0.4451F));

		PartDefinition Hips_r59 = bone3.addOrReplaceChild("Hips_r59", CubeListBuilder.create().texOffs(54, 75).mirror().addBox(-0.0005F, -1.645F, -3.8441F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(64, 64).mirror().addBox(-0.0005F, -1.945F, -2.4441F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -3.101F, 1.3451F, 0.9687F, 0.0F, -0.2182F));

		PartDefinition Hips_r60 = bone3.addOrReplaceChild("Hips_r60", CubeListBuilder.create().texOffs(75, 47).mirror().addBox(-0.5F, -0.9302F, -1.9738F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.9221F, 2.9013F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Hips_r61 = bone3.addOrReplaceChild("Hips_r61", CubeListBuilder.create().texOffs(31, 75).mirror().addBox(-0.5F, 0.4698F, 0.0262F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(75, 22).mirror().addBox(-0.5F, -0.0302F, 0.0262F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.48F, 2.7495F, -0.3665F, 0.0F, 0.0F));

		PartDefinition Hips_r62 = bone3.addOrReplaceChild("Hips_r62", CubeListBuilder.create().texOffs(33, 96).mirror().addBox(-0.5F, -0.0302F, 0.0262F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.7556F, 1.7882F, -0.2793F, 0.0F, 0.0F));

		PartDefinition Hips_r63 = bone3.addOrReplaceChild("Hips_r63", CubeListBuilder.create().texOffs(28, 96).mirror().addBox(-0.3F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2034F)).mirror(false)
				.texOffs(96, 23).mirror().addBox(-0.7F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.2649F, -3.0893F, -1.3701F, 0.0F, 0.0F));

		PartDefinition Hips_r64 = bone3.addOrReplaceChild("Hips_r64", CubeListBuilder.create().texOffs(75, 18).mirror().addBox(-0.5F, 0.1F, -1.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.4811F, -1.1206F, -0.6807F, 0.0F, 0.0F));

		PartDefinition Hips_r65 = bone3.addOrReplaceChild("Hips_r65", CubeListBuilder.create().texOffs(20, 96).mirror().addBox(-2.5F, 0.0041F, -0.9633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(2.0F, -4.7477F, -2.1386F, 0.2269F, 0.0F, 0.0F));

		PartDefinition Hips_r66 = bone3.addOrReplaceChild("Hips_r66", CubeListBuilder.create().texOffs(96, 15).mirror().addBox(-2.5F, 0.9041F, -0.9633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(75, 4).mirror().addBox(-2.5F, 0.5041F, -1.9633F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(63, 74).mirror().addBox(-2.5F, 0.0041F, -1.9633F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.0F, -5.026F, -0.1581F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Hips_r67 = bone3.addOrReplaceChild("Hips_r67", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-0.5F, -0.975F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.9171F, 0.9257F, -0.1222F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 103, 103);
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