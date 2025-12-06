package fossils.fossils.client.blockentity.model.limusaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LimusaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart body2;
	private final ModelPart Bodyfront;
	private final ModelPart Neckbase;
	private final ModelPart Neckmiddlebase;
	private final ModelPart Neckmiddlefront;
	private final ModelPart Neckfront;
	private final ModelPart Neckfront2;
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
	private final ModelPart bone3;
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
	private final ModelPart bone4;

	public LimusaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body2 = this.Bodymiddle.getChild("body2");
		this.Bodyfront = this.body2.getChild("Bodyfront");
		this.Neckbase = this.Bodyfront.getChild("Neckbase");
		this.Neckmiddlebase = this.Neckbase.getChild("Neckmiddlebase");
		this.Neckmiddlefront = this.Neckmiddlebase.getChild("Neckmiddlefront");
		this.Neckfront = this.Neckmiddlefront.getChild("Neckfront");
		this.Neckfront2 = this.Neckfront.getChild("Neckfront2");
		this.Head = this.Neckfront2.getChild("Head");
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
		this.bone3 = this.Bodyfront.getChild("bone3");
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
		this.bone4 = this.Hips.getChild("bone4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -17.0F, -8.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -9.6309F, 7.247F, -0.1475F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r1 = Hips.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(0, 47).addBox(-0.004F, -0.7083F, -0.3908F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7893F, -0.6168F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = Hips.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(44, 75).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7893F, -2.6168F, -0.096F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-1.5F, 0.0F, 2.9F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 32).addBox(0.5F, 0.0F, 2.9F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 12).addBox(-0.5F, -0.5F, 1.9F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -5.9F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -4.0F, 0.0302F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = Bodymiddle.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(83, 88).addBox(0.0F, -0.7F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6149F, -0.3322F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r4 = Bodymiddle.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(88, 13).mirror().addBox(-0.9156F, 0.169F, -0.5929F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0018F, -0.4433F, -0.0428F, 0.0872F, -0.7911F));

		PartDefinition Bodyfront_r5 = Bodymiddle.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(67, 74).mirror().addBox(-2.8926F, -0.2651F, -0.5929F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0018F, -0.4433F, -0.0777F, 0.0583F, -1.2627F));

		PartDefinition Bodyfront_r6 = Bodymiddle.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(88, 11).mirror().addBox(-3.271F, -1.6966F, -0.4171F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0783F, -2.5494F, -0.0677F, 0.1097F, -1.6354F));

		PartDefinition Bodyfront_r7 = Bodymiddle.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(74, 65).mirror().addBox(-2.815F, -0.3338F, -0.4171F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0783F, -2.5494F, -0.0035F, 0.1289F, -1.1084F));

		PartDefinition Bodyfront_r8 = Bodymiddle.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(88, 9).mirror().addBox(-0.8777F, 0.0726F, -0.4171F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0783F, -2.5494F, 0.0556F, 0.1163F, -0.6336F));

		PartDefinition Bodyfront_r9 = Bodymiddle.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(88, 3).mirror().addBox(-0.989F, 0.199F, -0.4492F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3356F, -4.4553F, 0.0947F, 0.0867F, -0.5158F));

		PartDefinition Bodyfront_r10 = Bodymiddle.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(74, 37).mirror().addBox(-2.9716F, -0.2717F, -0.4492F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3356F, -4.4553F, 0.0449F, 0.1202F, -0.9885F));

		PartDefinition Bodyfront_r11 = Bodymiddle.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(76, 4).mirror().addBox(-4.4376F, -1.7211F, -0.4492F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3356F, -4.4553F, -0.0215F, 0.1265F, -1.5161F));

		PartDefinition Bodyfront_r12 = Bodymiddle.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(88, 13).addBox(-0.0844F, 0.169F, -0.5929F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0018F, -0.4433F, -0.0428F, -0.0872F, 0.7911F));

		PartDefinition Bodyfront_r13 = Bodymiddle.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(67, 74).addBox(0.8926F, -0.2651F, -0.5929F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0018F, -0.4433F, -0.0777F, -0.0583F, 1.2627F));

		PartDefinition Bodyfront_r14 = Bodymiddle.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(80, 88).addBox(0.0F, -0.5985F, -1.9864F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7513F, -0.8883F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r15 = Bodymiddle.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(77, 88).addBox(0.0F, -0.5106F, 4.0086F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4797F, -8.8601F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r16 = Bodymiddle.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(88, 11).addBox(2.271F, -1.6966F, -0.4171F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0783F, -2.5494F, -0.0677F, -0.1097F, 1.6354F));

		PartDefinition Bodyfront_r17 = Bodymiddle.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(74, 65).addBox(0.815F, -0.3338F, -0.4171F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0783F, -2.5494F, -0.0035F, -0.1289F, 1.1084F));

		PartDefinition Bodyfront_r18 = Bodymiddle.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(88, 9).addBox(-0.1223F, 0.0726F, -0.4171F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0783F, -2.5494F, 0.0556F, -0.1163F, 0.6336F));

		PartDefinition Bodyfront_r19 = Bodymiddle.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(88, 3).addBox(-0.011F, 0.199F, -0.4492F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3356F, -4.4553F, 0.0947F, -0.0867F, 0.5158F));

		PartDefinition Bodyfront_r20 = Bodymiddle.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(74, 37).addBox(0.9716F, -0.2717F, -0.4492F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3356F, -4.4553F, 0.0449F, -0.1202F, 0.9885F));

		PartDefinition Bodyfront_r21 = Bodymiddle.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(76, 4).addBox(2.4377F, -1.7211F, -0.4492F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3356F, -4.4553F, -0.0215F, -0.1265F, 1.5161F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(36, 22).addBox(-2.0F, -2.8245F, -3.8162F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.4881F, -2.9814F, -0.3403F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r2 = Bodymiddle.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, -0.5F, 5.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.6619F, -10.7266F, -0.0698F, 0.0F, 0.0F));

		PartDefinition body2 = Bodymiddle.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(9, 55).addBox(-2.4531F, -0.3537F, -2.8651F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(89, 45).addBox(-1.9531F, -1.2258F, -1.7814F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9531F, -0.4058F, -4.9216F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r22 = body2.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(62, 34).mirror().addBox(-5.5553F, -2.2226F, -0.6654F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4531F, -0.072F, -1.1007F, 0.0222F, 0.1201F, -1.4125F));

		PartDefinition Bodyfront_r23 = body2.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(76, 14).mirror().addBox(-3.3242F, -0.6472F, -0.6654F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4531F, -0.072F, -1.1007F, 0.0794F, 0.0928F, -0.8865F));

		PartDefinition Bodyfront_r24 = body2.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(76, 12).mirror().addBox(-1.4737F, 0.0246F, -0.6654F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4531F, -0.072F, -1.1007F, 0.1128F, 0.0468F, -0.4163F));

		PartDefinition Bodyfront_r25 = body2.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(62, 34).addBox(2.5553F, -2.2226F, -0.6654F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4531F, -0.072F, -1.1007F, 0.0222F, -0.1201F, 1.4125F));

		PartDefinition Bodyfront_r26 = body2.addOrReplaceChild("Bodyfront_r26", CubeListBuilder.create().texOffs(76, 14).addBox(1.3242F, -0.6472F, -0.6654F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4531F, -0.072F, -1.1007F, 0.0794F, -0.0928F, 0.8865F));

		PartDefinition Bodyfront_r27 = body2.addOrReplaceChild("Bodyfront_r27", CubeListBuilder.create().texOffs(76, 12).addBox(-0.5263F, 0.0246F, -0.6654F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4531F, -0.072F, -1.1007F, 0.1128F, -0.0468F, 0.4163F));

		PartDefinition Bodyfront_r28 = body2.addOrReplaceChild("Bodyfront_r28", CubeListBuilder.create().texOffs(43, 46).addBox(-1.5F, -2.0F, -3.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9531F, 8.7213F, -1.8651F, -0.48F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body2.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(40, 0).addBox(-0.5F, -0.6F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(68, 88).addBox(0.0F, -1.2829F, -4.954F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9531F, 0.2309F, -2.7428F, 0.1847F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r29 = Bodyfront.addOrReplaceChild("Bodyfront_r29", CubeListBuilder.create().texOffs(74, 35).mirror().addBox(-3.2254F, -0.7154F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0579F, -0.4381F, 0.055F, 0.0678F, -0.9232F));

		PartDefinition Bodyfront_r30 = Bodyfront.addOrReplaceChild("Bodyfront_r30", CubeListBuilder.create().texOffs(74, 23).mirror().addBox(-1.4166F, -0.0811F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0579F, -0.4381F, 0.0798F, 0.0355F, -0.4524F));

		PartDefinition Bodyfront_r31 = Bodyfront.addOrReplaceChild("Bodyfront_r31", CubeListBuilder.create().texOffs(62, 28).mirror().addBox(-5.4356F, -2.2322F, -0.4305F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0579F, -0.4381F, 0.0137F, 0.0862F, -1.448F));

		PartDefinition Bodyfront_r32 = Bodyfront.addOrReplaceChild("Bodyfront_r32", CubeListBuilder.create().texOffs(74, 21).mirror().addBox(-4.2898F, -1.6984F, -0.4079F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1111F, -4.3486F, 0.0748F, 0.4304F, -1.5191F));

		PartDefinition Bodyfront_r33 = Bodyfront.addOrReplaceChild("Bodyfront_r33", CubeListBuilder.create().texOffs(15, 74).mirror().addBox(-2.8323F, -0.3259F, -0.4079F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1111F, -4.3486F, 0.287F, 0.3335F, -0.9632F));

		PartDefinition Bodyfront_r34 = Bodyfront.addOrReplaceChild("Bodyfront_r34", CubeListBuilder.create().texOffs(87, 43).mirror().addBox(-0.8895F, 0.0874F, -0.4079F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1111F, -4.3486F, 0.4035F, 0.1711F, -0.5056F));

		PartDefinition Bodyfront_r35 = Bodyfront.addOrReplaceChild("Bodyfront_r35", CubeListBuilder.create().texOffs(76, 19).mirror().addBox(-0.8868F, 0.0945F, -0.2809F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1111F, -2.5486F, 0.2489F, 0.0875F, -0.3685F));

		PartDefinition Bodyfront_r36 = Bodyfront.addOrReplaceChild("Bodyfront_r36", CubeListBuilder.create().texOffs(72, 51).mirror().addBox(-2.8331F, -0.3184F, -0.2809F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1111F, -2.5486F, 0.1833F, 0.1905F, -0.8331F));

		PartDefinition Bodyfront_r37 = Bodyfront.addOrReplaceChild("Bodyfront_r37", CubeListBuilder.create().texOffs(62, 26).mirror().addBox(-5.2943F, -1.6923F, -0.2809F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1111F, -2.5486F, 0.0624F, 0.2562F, -1.3662F));

		PartDefinition Bodyfront_r38 = Bodyfront.addOrReplaceChild("Bodyfront_r38", CubeListBuilder.create().texOffs(53, 21).mirror().addBox(-0.996F, -1.0488F, -3.4922F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.8F, -2.8F, -0.58F, 0.2579F, -0.1656F));

		PartDefinition Bodyfront_r39 = Bodyfront.addOrReplaceChild("Bodyfront_r39", CubeListBuilder.create().texOffs(56, 50).mirror().addBox(-4.4176F, 0.6811F, -1.7389F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.8F, -2.8F, -0.7834F, 0.9694F, 0.3016F));

		PartDefinition Bodyfront_r40 = Bodyfront.addOrReplaceChild("Bodyfront_r40", CubeListBuilder.create().texOffs(62, 16).mirror().addBox(-3.9322F, 0.7197F, -0.8217F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.163F, 6.3471F, -3.1582F, -0.451F, 0.6738F, 0.6589F));

		PartDefinition Bodyfront_r41 = Bodyfront.addOrReplaceChild("Bodyfront_r41", CubeListBuilder.create().texOffs(60, 56).mirror().addBox(-3.6686F, 1.0715F, -0.6872F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.028F, 6.2422F, -3.6295F, -0.2033F, 0.3834F, 1.1566F));

		PartDefinition Bodyfront_r42 = Bodyfront.addOrReplaceChild("Bodyfront_r42", CubeListBuilder.create().texOffs(74, 35).addBox(1.2254F, -0.7154F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0579F, -0.4381F, 0.055F, -0.0678F, 0.9232F));

		PartDefinition Bodyfront_r43 = Bodyfront.addOrReplaceChild("Bodyfront_r43", CubeListBuilder.create().texOffs(74, 23).addBox(-0.5834F, -0.0811F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0579F, -0.4381F, 0.0798F, -0.0355F, 0.4524F));

		PartDefinition Bodyfront_r44 = Bodyfront.addOrReplaceChild("Bodyfront_r44", CubeListBuilder.create().texOffs(62, 28).addBox(2.4356F, -2.2322F, -0.4305F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0579F, -0.4381F, 0.0137F, -0.0862F, 1.448F));

		PartDefinition Bodyfront_r45 = Bodyfront.addOrReplaceChild("Bodyfront_r45", CubeListBuilder.create().texOffs(74, 21).addBox(2.2898F, -1.6984F, -0.4079F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1111F, -4.3486F, 0.0748F, -0.4304F, 1.5191F));

		PartDefinition Bodyfront_r46 = Bodyfront.addOrReplaceChild("Bodyfront_r46", CubeListBuilder.create().texOffs(15, 74).addBox(0.8322F, -0.3259F, -0.4079F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1111F, -4.3486F, 0.287F, -0.3335F, 0.9632F));

		PartDefinition Bodyfront_r47 = Bodyfront.addOrReplaceChild("Bodyfront_r47", CubeListBuilder.create().texOffs(87, 43).addBox(-0.1105F, 0.0874F, -0.4079F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1111F, -4.3486F, 0.4035F, -0.1711F, 0.5056F));

		PartDefinition Bodyfront_r48 = Bodyfront.addOrReplaceChild("Bodyfront_r48", CubeListBuilder.create().texOffs(76, 19).addBox(-0.1132F, 0.0945F, -0.2809F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1111F, -2.5486F, 0.2489F, -0.0875F, 0.3685F));

		PartDefinition Bodyfront_r49 = Bodyfront.addOrReplaceChild("Bodyfront_r49", CubeListBuilder.create().texOffs(72, 51).addBox(0.8331F, -0.3184F, -0.2809F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1111F, -2.5486F, 0.1833F, -0.1905F, 0.8331F));

		PartDefinition Bodyfront_r50 = Bodyfront.addOrReplaceChild("Bodyfront_r50", CubeListBuilder.create().texOffs(62, 26).addBox(2.2943F, -1.6923F, -0.2809F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1111F, -2.5486F, 0.0624F, -0.2562F, 1.3662F));

		PartDefinition Bodyfront_r51 = Bodyfront.addOrReplaceChild("Bodyfront_r51", CubeListBuilder.create().texOffs(74, 88).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5074F, -0.9301F, -0.096F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r52 = Bodyfront.addOrReplaceChild("Bodyfront_r52", CubeListBuilder.create().texOffs(71, 88).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.412F, -2.9274F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r53 = Bodyfront.addOrReplaceChild("Bodyfront_r53", CubeListBuilder.create().texOffs(53, 21).addBox(-0.004F, -1.0488F, -3.4922F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 6.8F, -2.8F, -0.58F, -0.2579F, 0.1656F));

		PartDefinition Bodyfront_r54 = Bodyfront.addOrReplaceChild("Bodyfront_r54", CubeListBuilder.create().texOffs(23, 8).addBox(-2.0F, -1.0488F, -4.0311F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 52).addBox(-1.0F, -1.0488F, -3.0311F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.8F, -2.8F, -0.5585F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r55 = Bodyfront.addOrReplaceChild("Bodyfront_r55", CubeListBuilder.create().texOffs(56, 50).addBox(0.4175F, 0.6811F, -1.7389F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.8F, -2.8F, -0.7834F, -0.9694F, -0.3016F));

		PartDefinition Bodyfront_r56 = Bodyfront.addOrReplaceChild("Bodyfront_r56", CubeListBuilder.create().texOffs(62, 16).addBox(0.9322F, 0.7197F, -0.8217F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.163F, 6.3471F, -3.1582F, -0.451F, -0.6738F, -0.6589F));

		PartDefinition Bodyfront_r57 = Bodyfront.addOrReplaceChild("Bodyfront_r57", CubeListBuilder.create().texOffs(60, 56).addBox(0.6686F, 1.0715F, -0.6872F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.028F, 6.2422F, -3.6295F, -0.2033F, -0.3834F, -1.1566F));

		PartDefinition Neckbase = Bodyfront.addOrReplaceChild("Neckbase", CubeListBuilder.create().texOffs(51, 30).addBox(-0.5F, -0.5724F, -3.8378F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F))
				.texOffs(62, 88).addBox(0.0F, -1.0724F, -3.8378F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 88).addBox(0.0F, -0.8725F, -1.8378F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.097F, -0.487F, -0.0772F, 0.0408F));

		PartDefinition Bodyfront_r58 = Neckbase.addOrReplaceChild("Bodyfront_r58", CubeListBuilder.create().texOffs(72, 49).mirror().addBox(-2.1376F, 0.0388F, -0.5418F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0132F, -3.5993F, 0.6291F, 0.9115F, -0.762F));

		PartDefinition Bodyfront_r59 = Neckbase.addOrReplaceChild("Bodyfront_r59", CubeListBuilder.create().texOffs(72, 47).mirror().addBox(-2.0638F, 0.0034F, -0.42F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0132F, -1.5993F, 0.8988F, 0.7798F, -0.5691F));

		PartDefinition Bodyfront_r60 = Neckbase.addOrReplaceChild("Bodyfront_r60", CubeListBuilder.create().texOffs(22, 49).mirror().addBox(-2.8405F, -0.9339F, -0.42F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0132F, -1.5993F, 0.3795F, 1.074F, -1.2039F));

		PartDefinition Bodyfront_r61 = Neckbase.addOrReplaceChild("Bodyfront_r61", CubeListBuilder.create().texOffs(72, 49).addBox(0.1376F, 0.0388F, -0.5418F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0132F, -3.5993F, 0.6291F, -0.9115F, 0.762F));

		PartDefinition Bodyfront_r62 = Neckbase.addOrReplaceChild("Bodyfront_r62", CubeListBuilder.create().texOffs(72, 47).addBox(0.0638F, 0.0034F, -0.42F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0132F, -1.5993F, 0.8988F, -0.7798F, 0.5691F));

		PartDefinition Bodyfront_r63 = Neckbase.addOrReplaceChild("Bodyfront_r63", CubeListBuilder.create().texOffs(22, 49).addBox(1.8405F, -0.9339F, -0.42F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0132F, -1.5993F, 0.3795F, -1.074F, 1.2039F));

		PartDefinition Neckmiddlebase = Neckbase.addOrReplaceChild("Neckmiddlebase", CubeListBuilder.create().texOffs(53, 16).addBox(-0.5F, -0.3703F, -2.9737F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(59, 88).addBox(0.0F, -0.7703F, -1.9737F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1575F, -3.6441F, -0.3999F, 0.0973F, 0.0063F));

		PartDefinition Bodyfront_r64 = Neckmiddlebase.addOrReplaceChild("Bodyfront_r64", CubeListBuilder.create().texOffs(28, 44).mirror().addBox(-1.9494F, -0.0552F, -0.56F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2443F, -1.5552F, 0.8363F, 1.195F, -0.5641F));

		PartDefinition Bodyfront_r65 = Neckmiddlebase.addOrReplaceChild("Bodyfront_r65", CubeListBuilder.create().texOffs(28, 44).addBox(-0.0506F, -0.0552F, -0.56F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2443F, -1.5552F, 0.8363F, -1.195F, 0.5641F));

		PartDefinition Neckmiddlefront = Neckmiddlebase.addOrReplaceChild("Neckmiddlefront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.067F, -3.1102F, -0.2049F, 0.1034F, 0.0673F));

		PartDefinition Neckmiddlefront_r1 = Neckmiddlefront.addOrReplaceChild("Neckmiddlefront_r1", CubeListBuilder.create().texOffs(24, 89).addBox(0.0F, -0.7725F, 2.9084F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 88).addBox(0.0F, -0.7725F, 4.9084F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 11).addBox(-0.5F, -0.4725F, 2.9084F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.4295F, -5.5842F, -0.096F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r66 = Neckmiddlefront.addOrReplaceChild("Bodyfront_r66", CubeListBuilder.create().texOffs(76, 10).mirror().addBox(-0.7507F, -0.1256F, -0.4167F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(71, 33).mirror().addBox(-2.8242F, 0.1286F, -0.0482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.546F, 0.3174F, -1.5635F, 0.3154F, 1.2107F, -1.2015F));

		PartDefinition Bodyfront_r67 = Neckmiddlefront.addOrReplaceChild("Bodyfront_r67", CubeListBuilder.create().texOffs(76, 10).addBox(-1.2493F, -0.1256F, -0.4167F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 33).addBox(0.8242F, 0.1286F, -0.0482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.546F, 0.3174F, -1.5635F, 0.3154F, -1.2107F, 1.2015F));

		PartDefinition Neckfront = Neckmiddlefront.addOrReplaceChild("Neckfront", CubeListBuilder.create().texOffs(53, 6).addBox(-0.49F, -0.5383F, -2.894F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F))
				.texOffs(50, 88).addBox(0.01F, -0.8383F, -1.894F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -0.1039F, -2.6035F, 0.3635F, 0.0357F, 0.1531F));

		PartDefinition Bodyfront_r68 = Neckfront.addOrReplaceChild("Bodyfront_r68", CubeListBuilder.create().texOffs(72, 39).mirror().addBox(-1.6883F, -0.0703F, -0.6883F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.0886F, -1.533F, 0.5277F, 1.3306F, -0.9459F));

		PartDefinition Bodyfront_r69 = Neckfront.addOrReplaceChild("Bodyfront_r69", CubeListBuilder.create().texOffs(72, 39).addBox(-0.3117F, -0.0703F, -0.6883F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.0886F, -1.533F, 0.5277F, -1.3306F, 0.9459F));

		PartDefinition Neckfront2 = Neckfront.addOrReplaceChild("Neckfront2", CubeListBuilder.create().texOffs(22, 51).addBox(-0.49F, -0.5383F, -3.894F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(53, 88).addBox(0.01F, -0.7383F, -0.894F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 89).addBox(0.01F, -0.7383F, -2.894F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0314F, -2.786F, 0.4173F, 0.0258F, 0.1549F));

		PartDefinition Bodyfront_r70 = Neckfront2.addOrReplaceChild("Bodyfront_r70", CubeListBuilder.create().texOffs(49, 75).mirror().addBox(-1.0515F, -0.1211F, -0.6776F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(72, 41).mirror().addBox(-3.0025F, 0.0885F, -0.2909F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.2752F, -1.7339F, 0.4298F, 1.3228F, -1.0697F));

		PartDefinition Bodyfront_r71 = Neckfront2.addOrReplaceChild("Bodyfront_r71", CubeListBuilder.create().texOffs(49, 75).addBox(-0.9485F, -0.1211F, -0.6776F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 41).addBox(1.0025F, 0.0885F, -0.2909F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.2752F, -1.7339F, 0.4298F, -1.3228F, 1.0697F));

		PartDefinition Head = Neckfront2.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 0.1133F, -3.4198F, 0.538F, 0.1943F, 0.0153F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(62, 12).addBox(-1.0F, -1.1F, -0.05F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(0.0F, 0.2132F, -0.8798F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(84, 79).addBox(-0.5F, -0.35F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(84, 76).addBox(-0.5F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, 0.5286F, -4.9887F, 1.1694F, 0.0F, 0.0F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(84, 73).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.2075F, -4.7635F, 0.9687F, 0.0F, 0.0F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(55, 85).addBox(-0.5F, -0.25F, 0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(50, 85).addBox(-0.5F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -0.0757F, -4.3515F, 0.4276F, 0.0F, 0.0F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(84, 70).addBox(-0.5F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.2075F, -4.7635F, 0.6021F, 0.0F, 0.0F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(7, 69).addBox(-0.5F, -0.15F, -0.85F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.5F, -1.0936F, -1.9365F, 0.4014F, 0.0F, 0.0F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(0, 55).addBox(-1.0F, -1.425F, -0.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.0F, 0.4916F, -1.3603F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(0, 69).addBox(-0.5F, -0.15F, -0.85F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.5F, -1.191F, -1.2433F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(42, 68).addBox(-0.5F, -0.15F, -0.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -1.1914F, -1.2512F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(67, 36).addBox(-0.5F, -0.15F, -0.85F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.5F, -0.9005F, 0.1111F, -0.3011F, 0.0F, 0.0F));

		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(53, 26).addBox(-1.0F, -0.475F, -1.55F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, 0.8138F, -0.3574F, -0.3622F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase = Head.addOrReplaceChild("Lowerjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4892F, -0.6569F, 0.5139F, 0.0743F, -0.0108F));

		PartDefinition Lowerjawbase_r1 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r1", CubeListBuilder.create().texOffs(81, 28).mirror().addBox(-0.3007F, -0.3095F, -1.5587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(81, 25).mirror().addBox(-0.3007F, -0.3095F, -1.2587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.29F, -2.968F, 0.2716F, -0.2527F, 0.0219F));

		PartDefinition Lowerjawbase_r2 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r2", CubeListBuilder.create().texOffs(81, 22).mirror().addBox(-0.5742F, -0.2399F, -2.5508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.315F, -1.068F, 0.0493F, -0.171F, 0.0351F));

		PartDefinition Lowerjawbase_r3 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r3", CubeListBuilder.create().texOffs(81, 19).mirror().addBox(-0.2518F, -0.2468F, -0.7645F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.29F, -2.968F, 0.1445F, -0.1685F, 0.0456F));

		PartDefinition Lowerjawbase_r4 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r4", CubeListBuilder.create().texOffs(77, 43).mirror().addBox(-0.5742F, 0.1403F, -1.2184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(30, 77).mirror().addBox(-0.5742F, 0.1403F, -1.4184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.315F, -1.068F, -0.195F, -0.171F, 0.0351F));

		PartDefinition Lowerjawbase_r5 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r5", CubeListBuilder.create().texOffs(81, 16).mirror().addBox(-0.5742F, 0.037F, -1.948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.315F, -1.068F, -0.1077F, -0.171F, 0.0351F));

		PartDefinition Lowerjawbase_r6 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r6", CubeListBuilder.create().texOffs(81, 0).mirror().addBox(-0.5742F, -0.3449F, -2.1338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.315F, -1.068F, 0.0668F, -0.171F, 0.0351F));

		PartDefinition Lowerjawbase_r7 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r7", CubeListBuilder.create().texOffs(45, 80).mirror().addBox(-0.5742F, -0.2723F, -1.6369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.315F, -1.068F, 0.0144F, -0.171F, 0.0351F));

		PartDefinition Lowerjawbase_r8 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r8", CubeListBuilder.create().texOffs(30, 80).mirror().addBox(-0.5742F, -0.2336F, -1.137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.315F, -1.068F, -0.0292F, -0.171F, 0.0351F));

		PartDefinition Lowerjawbase_r9 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r9", CubeListBuilder.create().texOffs(25, 80).mirror().addBox(-0.5F, -0.2423F, -0.6865F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(25, 80).addBox(0.5F, -0.2423F, -0.6865F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.5F, -0.315F, -1.068F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r10 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r10", CubeListBuilder.create().texOffs(20, 80).mirror().addBox(-0.5F, -0.2581F, -0.7331F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(20, 80).addBox(0.5F, -0.2581F, -0.7331F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-0.5F, -0.265F, -0.568F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r11 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r11", CubeListBuilder.create().texOffs(10, 80).mirror().addBox(-0.5F, -0.2554F, -0.7394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(10, 80).addBox(0.5F, -0.2554F, -0.7394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.5F, -0.19F, -0.068F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r12 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r12", CubeListBuilder.create().texOffs(5, 80).mirror().addBox(-0.5F, -0.245F, -0.7466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(5, 80).addBox(0.5F, -0.245F, -0.7466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.5F, -0.115F, 0.432F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r13 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r13", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.5F, -0.7502F, -0.7542F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(0, 80).addBox(0.5F, -0.7502F, -0.7542F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.5F, 0.5388F, -0.8438F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r14 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r14", CubeListBuilder.create().texOffs(25, 77).mirror().addBox(-0.5F, -0.7595F, -0.8103F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.545F, -1.2838F, -0.1744F, -0.0111F, 0.0374F));

		PartDefinition Lowerjawbase_r15 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r15", CubeListBuilder.create().texOffs(86, 27).mirror().addBox(-0.3F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.775F, 0.055F, -1.4834F, -0.0351F, -0.1047F, 0.0037F));

		PartDefinition Lowerjawbase_r16 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r16", CubeListBuilder.create().texOffs(62, 8).mirror().addBox(-0.5F, -0.5F, -0.3625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(62, 8).addBox(0.65F, -0.5F, -0.3625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.575F, 0.0563F, -1.446F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Lowerjawbase.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(62, 4).mirror().addBox(-0.5317F, -0.4331F, -0.4245F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.2257F, 0.5328F, -0.0825F, 0.0425F, -0.188F, 0.053F));

		PartDefinition cube_r2 = Lowerjawbase.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(62, 0).mirror().addBox(-0.5385F, -0.4333F, -1.5751F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.2257F, 0.5328F, -0.0825F, -0.1718F, -0.3137F, -0.017F));

		PartDefinition Lowerjawbase_r17 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r17", CubeListBuilder.create().texOffs(79, 79).mirror().addBox(-0.5F, -0.7512F, -0.2858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(79, 79).addBox(0.5F, -0.7512F, -0.2858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.5F, 0.5421F, -0.9199F, 0.048F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r18 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r18", CubeListBuilder.create().texOffs(79, 76).mirror().addBox(-0.5F, -0.7739F, -0.2484F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(79, 76).addBox(0.5F, -0.7739F, -0.2484F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-0.5F, 0.5337F, -0.4695F, 0.2269F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r19 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r19", CubeListBuilder.create().texOffs(20, 77).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(20, 77).addBox(0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.5F, 0.1679F, 0.2171F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r20 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r20", CubeListBuilder.create().texOffs(74, 79).mirror().addBox(-0.5F, -0.525F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(79, 73).mirror().addBox(-0.5F, -0.525F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(74, 79).addBox(0.5F, -0.525F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F))
				.texOffs(79, 73).addBox(0.5F, -0.525F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.5F, 0.2578F, 0.686F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r21 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r21", CubeListBuilder.create().texOffs(81, 28).addBox(-0.6993F, -0.3095F, -1.5587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(81, 25).addBox(-0.6993F, -0.3095F, -1.2587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.5F, -0.29F, -2.968F, 0.2716F, 0.2527F, -0.0219F));

		PartDefinition Lowerjawbase_r22 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r22", CubeListBuilder.create().texOffs(81, 22).addBox(-0.4258F, -0.2399F, -2.5508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.5F, -0.315F, -1.068F, 0.0493F, 0.171F, -0.0351F));

		PartDefinition Lowerjawbase_r23 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r23", CubeListBuilder.create().texOffs(81, 19).addBox(-0.7482F, -0.2468F, -0.7645F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5F, -0.29F, -2.968F, 0.1445F, 0.1685F, -0.0456F));

		PartDefinition Lowerjawbase_r24 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r24", CubeListBuilder.create().texOffs(77, 43).addBox(-0.4258F, 0.1403F, -1.2184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F))
				.texOffs(30, 77).addBox(-0.4258F, 0.1403F, -1.4184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.5F, -0.315F, -1.068F, -0.195F, 0.171F, -0.0351F));

		PartDefinition Lowerjawbase_r25 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r25", CubeListBuilder.create().texOffs(81, 16).addBox(-0.4258F, 0.037F, -1.948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5F, -0.315F, -1.068F, -0.1077F, 0.171F, -0.0351F));

		PartDefinition Lowerjawbase_r26 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r26", CubeListBuilder.create().texOffs(81, 0).addBox(-0.4258F, -0.3449F, -2.1338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.5F, -0.315F, -1.068F, 0.0668F, 0.171F, -0.0351F));

		PartDefinition Lowerjawbase_r27 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r27", CubeListBuilder.create().texOffs(45, 80).addBox(-0.4258F, -0.2723F, -1.6369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.5F, -0.315F, -1.068F, 0.0144F, 0.171F, -0.0351F));

		PartDefinition Lowerjawbase_r28 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r28", CubeListBuilder.create().texOffs(30, 80).addBox(-0.4258F, -0.2336F, -1.137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5F, -0.315F, -1.068F, -0.0292F, 0.171F, -0.0351F));

		PartDefinition Lowerjawbase_r29 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r29", CubeListBuilder.create().texOffs(25, 77).addBox(-0.5F, -0.7595F, -0.8103F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.5F, 0.545F, -1.2838F, -0.1744F, 0.0111F, -0.0374F));

		PartDefinition Lowerjawbase_r30 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r30", CubeListBuilder.create().texOffs(86, 27).addBox(-0.7F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.775F, 0.055F, -1.4834F, -0.0351F, 0.1047F, -0.0037F));

		PartDefinition cube_r3 = Lowerjawbase.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(62, 4).addBox(-0.4683F, -0.4331F, -0.4245F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.2257F, 0.5328F, -0.0825F, 0.0425F, 0.188F, -0.053F));

		PartDefinition cube_r4 = Lowerjawbase.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(62, 0).addBox(-0.4616F, -0.4333F, -1.5751F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.2257F, 0.5328F, -0.0825F, -0.1718F, 0.3137F, 0.017F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5F, 0.3016F, 0.4976F));

		PartDefinition Head_r12 = leftFace.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(84, 67).addBox(-0.5F, -0.25F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)), PartPose.offsetAndRotation(-0.5F, -0.2622F, -5.0003F, 0.6894F, 0.0F, 0.0F));

		PartDefinition Head_r13 = leftFace.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(10, 86).addBox(0.6F, -0.675F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.0F, -1.0167F, -0.312F, 1.9111F, 0.0F, 0.0F));

		PartDefinition Head_r14 = leftFace.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(84, 48).addBox(0.6F, -0.55F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.0F, -1.0167F, -0.312F, 1.1257F, 0.0F, 0.0F));

		PartDefinition Head_r15 = leftFace.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(72, 43).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.025F, 0.661F, -0.6136F, 0.48F, 0.0F, 0.0F));

		PartDefinition Head_r16 = leftFace.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(84, 45).addBox(-0.525F, -0.325F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.358F, -0.0563F, -4.9406F, 0.6542F, 0.2705F, -0.002F));

		PartDefinition Head_r17 = leftFace.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(84, 37).addBox(-0.525F, -0.375F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.3222F, -0.0686F, -4.8114F, 0.4709F, 0.2705F, -0.002F));

		PartDefinition Head_r18 = leftFace.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(64, 62).addBox(-0.5F, -0.3F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.1889F, -0.6971F, -3.3895F, 0.4189F, 0.1571F, 0.0F));

		PartDefinition Head_r19 = leftFace.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(84, 6).addBox(-0.8F, 0.0876F, -1.0894F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.275F, -1.028F, -2.3784F, 0.3578F, 0.1571F, 0.0F));

		PartDefinition Head_r20 = leftFace.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(45, 83).addBox(-1.1003F, -0.7076F, 0.3257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(83, 31).addBox(-1.1003F, -0.7076F, -0.1743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.35F, 0.3501F, -3.9975F, 0.007F, 0.1555F, -0.022F));

		PartDefinition Head_r21 = leftFace.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(30, 83).addBox(-0.8846F, -0.8607F, -0.8388F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1508F, 0.4861F, -3.9634F, -0.0181F, 0.2341F, -0.0157F));

		PartDefinition Head_r22 = leftFace.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(76, 16).addBox(-0.7655F, -0.795F, -0.6458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.025F, 0.5031F, -4.6438F, 0.209F, 0.3011F, -0.0022F));

		PartDefinition Head_r23 = leftFace.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(25, 83).addBox(-0.6945F, -0.7882F, -1.0172F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.025F, 0.5031F, -4.6438F, 0.3578F, 0.2967F, 0.0F));

		PartDefinition Head_r24 = leftFace.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(20, 83).addBox(-0.5096F, -0.8169F, -1.2394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.025F, 0.5031F, -4.6438F, 0.486F, 0.4919F, 0.1059F));

		PartDefinition Head_r25 = leftFace.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(83, 12).addBox(-0.8F, -0.5981F, -2.921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -1.3279F, -2.4034F, 0.5498F, 0.0698F, 0.0F));

		PartDefinition Head_r26 = leftFace.addOrReplaceChild("Head_r26", CubeListBuilder.create().texOffs(10, 83).addBox(-0.8F, -0.3056F, -2.2632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.3279F, -2.4034F, 0.4102F, 0.0698F, 0.0F));

		PartDefinition Head_r27 = leftFace.addOrReplaceChild("Head_r27", CubeListBuilder.create().texOffs(86, 51).addBox(-0.85F, -0.15F, -1.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(45, 86).addBox(-0.85F, -0.15F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.1714F, -0.8917F, -3.675F, 0.4344F, 0.2142F, 0.0508F));

		PartDefinition Head_r28 = leftFace.addOrReplaceChild("Head_r28", CubeListBuilder.create().texOffs(86, 34).addBox(-0.85F, -0.15F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.3545F, -1.1229F, -3.0678F, 0.3705F, 0.2656F, 0.0755F));

		PartDefinition Head_r29 = leftFace.addOrReplaceChild("Head_r29", CubeListBuilder.create().texOffs(83, 9).addBox(-0.8F, -0.2314F, -1.5694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -1.3279F, -2.4034F, 0.3578F, 0.0698F, 0.0F));

		PartDefinition Head_r30 = leftFace.addOrReplaceChild("Head_r30", CubeListBuilder.create().texOffs(5, 83).addBox(-0.8F, -0.3473F, -0.8795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.275F, -1.028F, -2.3784F, 0.288F, 0.1571F, 0.0F));

		PartDefinition Head_r31 = leftFace.addOrReplaceChild("Head_r31", CubeListBuilder.create().texOffs(83, 3).addBox(-1.1003F, -0.8086F, 0.7298F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.35F, 0.3501F, -3.9975F, -0.1152F, 0.1555F, -0.022F));

		PartDefinition Head_r32 = leftFace.addOrReplaceChild("Head_r32", CubeListBuilder.create().texOffs(0, 83).addBox(-0.5F, -0.475F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(80, 82).addBox(-0.5F, -0.475F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.0F, -1.1414F, -0.9044F, -0.2967F, 0.0F, 0.0F));

		PartDefinition Head_r33 = leftFace.addOrReplaceChild("Head_r33", CubeListBuilder.create().texOffs(75, 82).addBox(-0.075F, -0.475F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(70, 82).addBox(0.1F, -0.475F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.425F, -0.5004F, -2.1247F, 0.0742F, 0.0F, 0.0F));

		PartDefinition Head_r34 = leftFace.addOrReplaceChild("Head_r34", CubeListBuilder.create().texOffs(65, 82).addBox(-0.49F, -0.695F, -0.6489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(0.0526F, -0.0595F, -3.3998F, 0.573F, 0.1606F, 0.017F));

		PartDefinition Head_r35 = leftFace.addOrReplaceChild("Head_r35", CubeListBuilder.create().texOffs(60, 82).addBox(-0.49F, -0.6914F, -0.4333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0526F, -0.0595F, -3.3998F, 0.3635F, 0.1606F, 0.017F));

		PartDefinition Head_r36 = leftFace.addOrReplaceChild("Head_r36", CubeListBuilder.create().texOffs(55, 82).addBox(-0.49F, -0.2985F, -0.2605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F))
				.texOffs(40, 82).addBox(-0.49F, -0.2985F, -0.5355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(0.0526F, -0.0595F, -3.3998F, -0.0728F, 0.1606F, 0.017F));

		PartDefinition Head_r37 = leftFace.addOrReplaceChild("Head_r37", CubeListBuilder.create().texOffs(50, 82).addBox(-0.49F, -0.5155F, -0.2809F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.355F))
				.texOffs(82, 42).addBox(-0.49F, -0.5155F, -0.5559F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.0526F, -0.0595F, -3.3998F, 0.1454F, 0.1606F, 0.017F));

		PartDefinition Head_r38 = leftFace.addOrReplaceChild("Head_r38", CubeListBuilder.create().texOffs(35, 82).addBox(-0.5F, -0.6228F, -0.43F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.2215F, 0.0517F, -4.7633F, 0.2574F, 0.2531F, 0.0F));

		PartDefinition Head_r39 = leftFace.addOrReplaceChild("Head_r39", CubeListBuilder.create().texOffs(87, 40).addBox(-0.5F, -0.4291F, -0.623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(-0.2215F, 0.0517F, -4.7633F, -0.7461F, 0.2531F, 0.0F));

		PartDefinition Head_r40 = leftFace.addOrReplaceChild("Head_r40", CubeListBuilder.create().texOffs(15, 76).addBox(-0.5F, -0.301F, -0.3104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.349F)), PartPose.offsetAndRotation(-0.2215F, 0.0517F, -4.7633F, -1.7497F, 0.2531F, 0.0F));

		PartDefinition Head_r41 = leftFace.addOrReplaceChild("Head_r41", CubeListBuilder.create().texOffs(15, 82).addBox(-0.5F, -0.6371F, -0.4621F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.2215F, 0.0517F, -4.7633F, -2.8842F, 0.2531F, 0.0F));

		PartDefinition Head_r42 = leftFace.addOrReplaceChild("Head_r42", CubeListBuilder.create().texOffs(81, 64).addBox(-0.5F, -0.4358F, -0.646F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.349F)), PartPose.offsetAndRotation(-0.2215F, 0.0517F, -4.7633F, 2.4827F, 0.2531F, 0.0F));

		PartDefinition Head_r43 = leftFace.addOrReplaceChild("Head_r43", CubeListBuilder.create().texOffs(86, 63).addBox(-0.5F, -0.2853F, -0.3284F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(-0.2215F, 0.0517F, -4.7633F, 1.4792F, 0.2531F, 0.0F));

		PartDefinition Head_r44 = leftFace.addOrReplaceChild("Head_r44", CubeListBuilder.create().texOffs(25, 86).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.0314F, 0.0493F, -4.1259F, -0.0809F, 0.2278F, -0.0195F));

		PartDefinition Head_r45 = leftFace.addOrReplaceChild("Head_r45", CubeListBuilder.create().texOffs(86, 24).addBox(-0.5F, -0.6F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.0151F, 0.0829F, -3.6789F, -0.0728F, 0.1606F, 0.017F));

		PartDefinition Head_r46 = leftFace.addOrReplaceChild("Head_r46", CubeListBuilder.create().texOffs(81, 61).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.0151F, 0.0829F, -3.6789F, -0.4219F, 0.1606F, 0.017F));

		PartDefinition Head_r47 = leftFace.addOrReplaceChild("Head_r47", CubeListBuilder.create().texOffs(81, 58).addBox(-0.5F, -0.65F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(0.1186F, -0.2732F, -3.0777F, 0.922F, 0.1606F, 0.017F));

		PartDefinition Head_r48 = leftFace.addOrReplaceChild("Head_r48", CubeListBuilder.create().texOffs(86, 21).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.175F, 0.3806F, -0.62F, 0.3971F, 0.0F, 0.0F));

		PartDefinition Head_r49 = leftFace.addOrReplaceChild("Head_r49", CubeListBuilder.create().texOffs(20, 86).addBox(-0.5F, -0.5F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(86, 18).addBox(-0.5F, -0.7F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(86, 15).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.175F, 0.1429F, -0.7389F, 1.1825F, 0.0F, 0.0F));

		PartDefinition Head_r50 = leftFace.addOrReplaceChild("Head_r50", CubeListBuilder.create().texOffs(81, 55).addBox(-0.5F, -0.325F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.175F, -0.2304F, -1.1405F, 0.0044F, 0.0F, 0.0F));

		PartDefinition Head_r51 = leftFace.addOrReplaceChild("Head_r51", CubeListBuilder.create().texOffs(81, 52).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(81, 34).addBox(-0.5F, -0.9F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.175F, -0.4281F, -1.0744F, -0.3185F, 0.0F, 0.0F));

		PartDefinition Head_r52 = leftFace.addOrReplaceChild("Head_r52", CubeListBuilder.create().texOffs(5, 86).addBox(0.0F, -0.8F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(86, 0).addBox(0.0F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.425F, -0.5762F, -1.2426F, 2.1293F, 0.0F, 0.0F));

		PartDefinition Head_r53 = leftFace.addOrReplaceChild("Head_r53", CubeListBuilder.create().texOffs(0, 86).addBox(0.0F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.425F, 0.0187F, -1.3209F, 3.0107F, 0.0F, 0.0F));

		PartDefinition Head_r54 = leftFace.addOrReplaceChild("Head_r54", CubeListBuilder.create().texOffs(85, 85).addBox(0.0F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.425F, 0.4681F, -1.7185F, -2.2951F, 0.0F, 0.0F));

		PartDefinition Head_r55 = leftFace.addOrReplaceChild("Head_r55", CubeListBuilder.create().texOffs(85, 82).addBox(0.0F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.425F, 0.4523F, -2.3183F, -1.597F, 0.0F, 0.0F));

		PartDefinition Head_r56 = leftFace.addOrReplaceChild("Head_r56", CubeListBuilder.create().texOffs(80, 85).addBox(0.0F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.425F, 0.1125F, -2.8128F, -0.6021F, 0.0F, 0.0F));

		PartDefinition Head_r57 = leftFace.addOrReplaceChild("Head_r57", CubeListBuilder.create().texOffs(75, 85).addBox(0.0F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.425F, -0.429F, -3.0711F, 0.4451F, 0.0F, 0.0F));

		PartDefinition Head_r58 = leftFace.addOrReplaceChild("Head_r58", CubeListBuilder.create().texOffs(70, 85).addBox(0.0F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.425F, -0.9834F, -2.8415F, 1.1781F, 0.0F, 0.0F));

		PartDefinition Head_r59 = leftFace.addOrReplaceChild("Head_r59", CubeListBuilder.create().texOffs(65, 85).addBox(0.0F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.425F, -1.3232F, -2.347F, 2.1729F, 0.0F, 0.0F));

		PartDefinition Head_r60 = leftFace.addOrReplaceChild("Head_r60", CubeListBuilder.create().texOffs(60, 85).addBox(0.0F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.425F, -1.3232F, -2.347F, -3.1329F, 0.0F, 0.0F));

		PartDefinition Head_r61 = leftFace.addOrReplaceChild("Head_r61", CubeListBuilder.create().texOffs(30, 86).addBox(-0.8F, -0.2062F, -0.8718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.3279F, -2.4034F, 0.3229F, 0.0698F, 0.0F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.3016F, 0.4976F));

		PartDefinition Head_r62 = rightFace.addOrReplaceChild("Head_r62", CubeListBuilder.create().texOffs(84, 67).mirror().addBox(-0.5F, -0.25F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.2622F, -5.0003F, 0.6894F, 0.0F, 0.0F));

		PartDefinition Head_r63 = rightFace.addOrReplaceChild("Head_r63", CubeListBuilder.create().texOffs(10, 86).mirror().addBox(-1.6F, -0.675F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.0167F, -0.312F, 1.9111F, 0.0F, 0.0F));

		PartDefinition Head_r64 = rightFace.addOrReplaceChild("Head_r64", CubeListBuilder.create().texOffs(84, 48).mirror().addBox(-1.6F, -0.55F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.0167F, -0.312F, 1.1257F, 0.0F, 0.0F));

		PartDefinition Head_r65 = rightFace.addOrReplaceChild("Head_r65", CubeListBuilder.create().texOffs(72, 43).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 0.661F, -0.6136F, 0.48F, 0.0F, 0.0F));

		PartDefinition Head_r66 = rightFace.addOrReplaceChild("Head_r66", CubeListBuilder.create().texOffs(84, 45).mirror().addBox(-0.475F, -0.325F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.358F, -0.0563F, -4.9406F, 0.6542F, -0.2705F, 0.002F));

		PartDefinition Head_r67 = rightFace.addOrReplaceChild("Head_r67", CubeListBuilder.create().texOffs(84, 37).mirror().addBox(-0.475F, -0.375F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.3222F, -0.0686F, -4.8114F, 0.4709F, -0.2705F, 0.002F));

		PartDefinition Head_r68 = rightFace.addOrReplaceChild("Head_r68", CubeListBuilder.create().texOffs(64, 62).mirror().addBox(-0.5F, -0.3F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.1889F, -0.6971F, -3.3895F, 0.4189F, -0.1571F, 0.0F));

		PartDefinition Head_r69 = rightFace.addOrReplaceChild("Head_r69", CubeListBuilder.create().texOffs(84, 6).mirror().addBox(-0.2F, 0.0876F, -1.0894F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.275F, -1.028F, -2.3784F, 0.3578F, -0.1571F, 0.0F));

		PartDefinition Head_r70 = rightFace.addOrReplaceChild("Head_r70", CubeListBuilder.create().texOffs(45, 83).mirror().addBox(0.1003F, -0.7076F, 0.3257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(83, 31).mirror().addBox(0.1003F, -0.7076F, -0.1743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.3501F, -3.9975F, 0.007F, -0.1555F, 0.022F));

		PartDefinition Head_r71 = rightFace.addOrReplaceChild("Head_r71", CubeListBuilder.create().texOffs(30, 83).mirror().addBox(-0.1154F, -0.8607F, -0.8388F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1508F, 0.4861F, -3.9634F, -0.0181F, -0.2341F, 0.0157F));

		PartDefinition Head_r72 = rightFace.addOrReplaceChild("Head_r72", CubeListBuilder.create().texOffs(76, 16).mirror().addBox(-0.2345F, -0.795F, -0.6458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.025F, 0.5031F, -4.6438F, 0.209F, -0.3011F, 0.0022F));

		PartDefinition Head_r73 = rightFace.addOrReplaceChild("Head_r73", CubeListBuilder.create().texOffs(25, 83).mirror().addBox(-0.3055F, -0.7882F, -1.0172F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.025F, 0.5031F, -4.6438F, 0.3578F, -0.2967F, 0.0F));

		PartDefinition Head_r74 = rightFace.addOrReplaceChild("Head_r74", CubeListBuilder.create().texOffs(20, 83).mirror().addBox(-0.4904F, -0.8169F, -1.2394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.025F, 0.5031F, -4.6438F, 0.486F, -0.4919F, -0.1059F));

		PartDefinition Head_r75 = rightFace.addOrReplaceChild("Head_r75", CubeListBuilder.create().texOffs(83, 12).mirror().addBox(-0.2F, -0.5981F, -2.921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.3279F, -2.4034F, 0.5498F, -0.0698F, 0.0F));

		PartDefinition Head_r76 = rightFace.addOrReplaceChild("Head_r76", CubeListBuilder.create().texOffs(10, 83).mirror().addBox(-0.2F, -0.3056F, -2.2632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.3279F, -2.4034F, 0.4102F, -0.0698F, 0.0F));

		PartDefinition Head_r77 = rightFace.addOrReplaceChild("Head_r77", CubeListBuilder.create().texOffs(86, 51).mirror().addBox(-0.15F, -0.15F, -1.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(45, 86).mirror().addBox(-0.15F, -0.15F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.1714F, -0.8917F, -3.675F, 0.4344F, -0.2142F, -0.0508F));

		PartDefinition Head_r78 = rightFace.addOrReplaceChild("Head_r78", CubeListBuilder.create().texOffs(86, 34).mirror().addBox(-0.15F, -0.15F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.3545F, -1.1229F, -3.0678F, 0.3705F, -0.2656F, -0.0755F));

		PartDefinition Head_r79 = rightFace.addOrReplaceChild("Head_r79", CubeListBuilder.create().texOffs(83, 9).mirror().addBox(-0.2F, -0.2314F, -1.5694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.3279F, -2.4034F, 0.3578F, -0.0698F, 0.0F));

		PartDefinition Head_r80 = rightFace.addOrReplaceChild("Head_r80", CubeListBuilder.create().texOffs(5, 83).mirror().addBox(-0.2F, -0.3473F, -0.8795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.275F, -1.028F, -2.3784F, 0.288F, -0.1571F, 0.0F));

		PartDefinition Head_r81 = rightFace.addOrReplaceChild("Head_r81", CubeListBuilder.create().texOffs(83, 3).mirror().addBox(0.1003F, -0.8086F, 0.7298F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.3501F, -3.9975F, -0.1152F, -0.1555F, 0.022F));

		PartDefinition Head_r82 = rightFace.addOrReplaceChild("Head_r82", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(-0.5F, -0.475F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(80, 82).mirror().addBox(-0.5F, -0.475F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1414F, -0.9044F, -0.2967F, 0.0F, 0.0F));

		PartDefinition Head_r83 = rightFace.addOrReplaceChild("Head_r83", CubeListBuilder.create().texOffs(75, 82).mirror().addBox(-0.925F, -0.475F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(70, 82).mirror().addBox(-1.1F, -0.475F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.425F, -0.5004F, -2.1247F, 0.0742F, 0.0F, 0.0F));

		PartDefinition Head_r84 = rightFace.addOrReplaceChild("Head_r84", CubeListBuilder.create().texOffs(65, 82).mirror().addBox(-0.51F, -0.695F, -0.6489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)).mirror(false), PartPose.offsetAndRotation(-0.0526F, -0.0595F, -3.3998F, 0.573F, -0.1606F, -0.017F));

		PartDefinition Head_r85 = rightFace.addOrReplaceChild("Head_r85", CubeListBuilder.create().texOffs(60, 82).mirror().addBox(-0.51F, -0.6914F, -0.4333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.0526F, -0.0595F, -3.3998F, 0.3635F, -0.1606F, -0.017F));

		PartDefinition Head_r86 = rightFace.addOrReplaceChild("Head_r86", CubeListBuilder.create().texOffs(55, 82).mirror().addBox(-0.51F, -0.2985F, -0.2605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false)
				.texOffs(40, 82).mirror().addBox(-0.51F, -0.2985F, -0.5355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(-0.0526F, -0.0595F, -3.3998F, -0.0728F, -0.1606F, -0.017F));

		PartDefinition Head_r87 = rightFace.addOrReplaceChild("Head_r87", CubeListBuilder.create().texOffs(50, 82).mirror().addBox(-0.51F, -0.5155F, -0.2809F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.355F)).mirror(false)
				.texOffs(82, 42).mirror().addBox(-0.51F, -0.5155F, -0.5559F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-0.0526F, -0.0595F, -3.3998F, 0.1454F, -0.1606F, -0.017F));

		PartDefinition Head_r88 = rightFace.addOrReplaceChild("Head_r88", CubeListBuilder.create().texOffs(35, 82).mirror().addBox(-0.5F, -0.6228F, -0.43F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.2215F, 0.0517F, -4.7633F, 0.2574F, -0.2531F, 0.0F));

		PartDefinition Head_r89 = rightFace.addOrReplaceChild("Head_r89", CubeListBuilder.create().texOffs(87, 40).mirror().addBox(-0.5F, -0.4291F, -0.623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)).mirror(false), PartPose.offsetAndRotation(0.2215F, 0.0517F, -4.7633F, -0.7461F, -0.2531F, 0.0F));

		PartDefinition Head_r90 = rightFace.addOrReplaceChild("Head_r90", CubeListBuilder.create().texOffs(15, 76).mirror().addBox(-0.5F, -0.301F, -0.3104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.349F)).mirror(false), PartPose.offsetAndRotation(0.2215F, 0.0517F, -4.7633F, -1.7497F, -0.2531F, 0.0F));

		PartDefinition Head_r91 = rightFace.addOrReplaceChild("Head_r91", CubeListBuilder.create().texOffs(15, 82).mirror().addBox(-0.5F, -0.6371F, -0.4621F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.2215F, 0.0517F, -4.7633F, -2.8842F, -0.2531F, 0.0F));

		PartDefinition Head_r92 = rightFace.addOrReplaceChild("Head_r92", CubeListBuilder.create().texOffs(81, 64).mirror().addBox(-0.5F, -0.4358F, -0.646F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.349F)).mirror(false), PartPose.offsetAndRotation(0.2215F, 0.0517F, -4.7633F, 2.4827F, -0.2531F, 0.0F));

		PartDefinition Head_r93 = rightFace.addOrReplaceChild("Head_r93", CubeListBuilder.create().texOffs(86, 63).mirror().addBox(-0.5F, -0.2853F, -0.3284F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)).mirror(false), PartPose.offsetAndRotation(0.2215F, 0.0517F, -4.7633F, 1.4792F, -0.2531F, 0.0F));

		PartDefinition Head_r94 = rightFace.addOrReplaceChild("Head_r94", CubeListBuilder.create().texOffs(25, 86).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.0314F, 0.0493F, -4.1259F, -0.0809F, -0.2278F, 0.0195F));

		PartDefinition Head_r95 = rightFace.addOrReplaceChild("Head_r95", CubeListBuilder.create().texOffs(86, 24).mirror().addBox(-0.5F, -0.6F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-0.0151F, 0.0829F, -3.6789F, -0.0728F, -0.1606F, -0.017F));

		PartDefinition Head_r96 = rightFace.addOrReplaceChild("Head_r96", CubeListBuilder.create().texOffs(81, 61).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-0.0151F, 0.0829F, -3.6789F, -0.4219F, -0.1606F, -0.017F));

		PartDefinition Head_r97 = rightFace.addOrReplaceChild("Head_r97", CubeListBuilder.create().texOffs(81, 58).mirror().addBox(-0.5F, -0.65F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)).mirror(false), PartPose.offsetAndRotation(-0.1186F, -0.2732F, -3.0777F, 0.922F, -0.1606F, -0.017F));

		PartDefinition Head_r98 = rightFace.addOrReplaceChild("Head_r98", CubeListBuilder.create().texOffs(86, 21).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.175F, 0.3806F, -0.62F, 0.3971F, 0.0F, 0.0F));

		PartDefinition Head_r99 = rightFace.addOrReplaceChild("Head_r99", CubeListBuilder.create().texOffs(20, 86).mirror().addBox(-0.5F, -0.5F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(86, 18).mirror().addBox(-0.5F, -0.7F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(86, 15).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.175F, 0.1429F, -0.7389F, 1.1825F, 0.0F, 0.0F));

		PartDefinition Head_r100 = rightFace.addOrReplaceChild("Head_r100", CubeListBuilder.create().texOffs(81, 55).mirror().addBox(-0.5F, -0.325F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.175F, -0.2304F, -1.1405F, 0.0044F, 0.0F, 0.0F));

		PartDefinition Head_r101 = rightFace.addOrReplaceChild("Head_r101", CubeListBuilder.create().texOffs(81, 52).mirror().addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(81, 34).mirror().addBox(-0.5F, -0.9F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.175F, -0.4281F, -1.0744F, -0.3185F, 0.0F, 0.0F));

		PartDefinition Head_r102 = rightFace.addOrReplaceChild("Head_r102", CubeListBuilder.create().texOffs(5, 86).mirror().addBox(-1.0F, -0.8F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(86, 0).mirror().addBox(-1.0F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.425F, -0.5762F, -1.2426F, 2.1293F, 0.0F, 0.0F));

		PartDefinition Head_r103 = rightFace.addOrReplaceChild("Head_r103", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-1.0F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.425F, 0.0187F, -1.3209F, 3.0107F, 0.0F, 0.0F));

		PartDefinition Head_r104 = rightFace.addOrReplaceChild("Head_r104", CubeListBuilder.create().texOffs(85, 85).mirror().addBox(-1.0F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.425F, 0.4681F, -1.7185F, -2.2951F, 0.0F, 0.0F));

		PartDefinition Head_r105 = rightFace.addOrReplaceChild("Head_r105", CubeListBuilder.create().texOffs(85, 82).mirror().addBox(-1.0F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.425F, 0.4523F, -2.3183F, -1.597F, 0.0F, 0.0F));

		PartDefinition Head_r106 = rightFace.addOrReplaceChild("Head_r106", CubeListBuilder.create().texOffs(80, 85).mirror().addBox(-1.0F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.425F, 0.1125F, -2.8128F, -0.6021F, 0.0F, 0.0F));

		PartDefinition Head_r107 = rightFace.addOrReplaceChild("Head_r107", CubeListBuilder.create().texOffs(75, 85).mirror().addBox(-1.0F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.425F, -0.429F, -3.0711F, 0.4451F, 0.0F, 0.0F));

		PartDefinition Head_r108 = rightFace.addOrReplaceChild("Head_r108", CubeListBuilder.create().texOffs(70, 85).mirror().addBox(-1.0F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.425F, -0.9834F, -2.8415F, 1.1781F, 0.0F, 0.0F));

		PartDefinition Head_r109 = rightFace.addOrReplaceChild("Head_r109", CubeListBuilder.create().texOffs(65, 85).mirror().addBox(-1.0F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.425F, -1.3232F, -2.347F, 2.1729F, 0.0F, 0.0F));

		PartDefinition Head_r110 = rightFace.addOrReplaceChild("Head_r110", CubeListBuilder.create().texOffs(60, 85).mirror().addBox(-1.0F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.425F, -1.3232F, -2.347F, -3.1329F, 0.0F, 0.0F));

		PartDefinition Head_r111 = rightFace.addOrReplaceChild("Head_r111", CubeListBuilder.create().texOffs(30, 86).mirror().addBox(-0.2F, -0.2062F, -0.8718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.3279F, -2.4034F, 0.3229F, -0.0698F, 0.0F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2682F, 4.0067F, -3.8085F, 0.6818F, 0.2258F, -0.0614F));

		PartDefinition Rightupperarm_r1 = Rightupperarm.addOrReplaceChild("Rightupperarm_r1", CubeListBuilder.create().texOffs(15, 85).addBox(-0.5F, -0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.0297F, 2.9847F, 0.3083F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r2 = Rightupperarm.addOrReplaceChild("Rightupperarm_r2", CubeListBuilder.create().texOffs(34, 73).addBox(-0.5F, -1.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0297F, 2.3484F, -0.45F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r3 = Rightupperarm.addOrReplaceChild("Rightupperarm_r3", CubeListBuilder.create().texOffs(29, 73).addBox(-0.5F, -1.7F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.0297F, 3.016F, -0.2395F, 0.1833F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r4 = Rightupperarm.addOrReplaceChild("Rightupperarm_r4", CubeListBuilder.create().texOffs(24, 73).addBox(-0.5F, -1.1F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.0297F, 1.0132F, -0.029F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r5 = Rightupperarm.addOrReplaceChild("Rightupperarm_r5", CubeListBuilder.create().texOffs(10, 73).addBox(-0.5F, -1.1F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.0297F, 1.0132F, -0.029F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0703F, 3.8972F, -0.3045F, -1.1687F, -0.1247F, 0.1106F));

		PartDefinition Rightlowerarm_r1 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r1", CubeListBuilder.create().texOffs(54, 79).addBox(-0.5F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.0614F, 1.2506F, 0.1274F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r2 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r2", CubeListBuilder.create().texOffs(62, 71).addBox(-0.5F, -1.8F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0614F, 1.2506F, 0.1274F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r3 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r3", CubeListBuilder.create().texOffs(79, 49).addBox(-0.5F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.0614F, 1.2506F, -0.6726F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r4 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r4", CubeListBuilder.create().texOffs(71, 61).addBox(-0.5F, -1.8F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0614F, 1.2506F, -0.6726F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Righthand = Rightlowerarm.addOrReplaceChild("Righthand", CubeListBuilder.create().texOffs(71, 14).addBox(-1.0F, 0.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3593F, 1.5239F, -0.2072F, 0.0637F, 0.0F, 0.2759F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2682F, 4.0067F, -3.8085F, 0.1583F, -0.2258F, 0.0614F));

		PartDefinition Leftupperarm_r1 = Leftupperarm.addOrReplaceChild("Leftupperarm_r1", CubeListBuilder.create().texOffs(86, 57).addBox(-0.5F, -0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0297F, 2.9847F, 0.3083F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r2 = Leftupperarm.addOrReplaceChild("Leftupperarm_r2", CubeListBuilder.create().texOffs(5, 76).addBox(-0.5F, -1.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0297F, 2.3484F, -0.45F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r3 = Leftupperarm.addOrReplaceChild("Leftupperarm_r3", CubeListBuilder.create().texOffs(76, 0).addBox(-0.5F, -1.7F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0297F, 3.016F, -0.2395F, 0.1833F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r4 = Leftupperarm.addOrReplaceChild("Leftupperarm_r4", CubeListBuilder.create().texOffs(0, 76).addBox(-0.5F, -1.1F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.0297F, 1.0132F, -0.029F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r5 = Leftupperarm.addOrReplaceChild("Leftupperarm_r5", CubeListBuilder.create().texOffs(74, 75).addBox(-0.5F, -1.1F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0297F, 1.0132F, -0.029F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0703F, 3.8972F, -0.3045F, -0.8696F, 0.0249F, -0.1955F));

		PartDefinition Leftlowerarm_r1 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r1", CubeListBuilder.create().texOffs(64, 79).addBox(-0.5F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.0614F, 1.2506F, 0.1274F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r2 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r2", CubeListBuilder.create().texOffs(5, 72).addBox(-0.5F, -1.8F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0614F, 1.2506F, 0.1274F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r3 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r3", CubeListBuilder.create().texOffs(59, 79).addBox(-0.5F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.0614F, 1.2506F, -0.6726F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r4 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r4", CubeListBuilder.create().texOffs(0, 72).addBox(-0.5F, -1.8F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0614F, 1.2506F, -0.6726F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Lefthand = Leftlowerarm.addOrReplaceChild("Lefthand", CubeListBuilder.create().texOffs(52, 71).addBox(0.0F, 0.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3593F, 1.5239F, -0.2072F, 0.0637F, 0.0F, -0.2759F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 3.3761F, -4.7187F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r72 = bone.addOrReplaceChild("Bodyfront_r72", CubeListBuilder.create().texOffs(33, 60).addBox(-0.5F, -1.2F, -0.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0452F, -0.3141F, 1.2194F, 2.3217F, 0.0415F, -0.2505F));

		PartDefinition Bodyfront_r73 = bone.addOrReplaceChild("Bodyfront_r73", CubeListBuilder.create().texOffs(64, 58).addBox(-0.5F, -0.75F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0452F, -0.3141F, 1.2194F, 1.0563F, 0.0415F, -0.2505F));

		PartDefinition Bodyfront_r74 = bone.addOrReplaceChild("Bodyfront_r74", CubeListBuilder.create().texOffs(11, 49).addBox(-0.5F, 0.0431F, -1.0716F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4197F, -1.7946F, 1.3237F, 0.5676F, 0.0415F, -0.2505F));

		PartDefinition Bodyfront_r75 = bone.addOrReplaceChild("Bodyfront_r75", CubeListBuilder.create().texOffs(35, 85).addBox(-0.5F, -0.7569F, 0.0284F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.4F, 0.8818F, 0.0415F, -0.2505F));

		PartDefinition Bodyfront_r76 = bone.addOrReplaceChild("Bodyfront_r76", CubeListBuilder.create().texOffs(62, 22).addBox(-1.411F, -1.2901F, -0.4215F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.625F, 0.6465F, -0.3024F, 0.5359F, -0.9821F, -0.0453F));

		PartDefinition Bodyfront_r77 = bone.addOrReplaceChild("Bodyfront_r77", CubeListBuilder.create().texOffs(62, 18).addBox(-1.3777F, -0.7474F, -0.4215F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.625F, 0.6465F, -0.3024F, 1.056F, -0.2473F, -0.8584F));

		PartDefinition Bodyfront_r78 = bone.addOrReplaceChild("Bodyfront_r78", CubeListBuilder.create().texOffs(74, 6).addBox(-0.0448F, -0.8886F, -0.4215F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.625F, 0.6465F, -0.3024F, 0.9924F, -0.5089F, -0.6881F));

		PartDefinition bone3 = Bodyfront.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 3.3761F, -4.7187F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r79 = bone3.addOrReplaceChild("Bodyfront_r79", CubeListBuilder.create().texOffs(33, 60).mirror().addBox(-0.5F, -1.2F, -0.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0452F, -0.3141F, 1.2194F, 2.3217F, -0.0415F, 0.2505F));

		PartDefinition Bodyfront_r80 = bone3.addOrReplaceChild("Bodyfront_r80", CubeListBuilder.create().texOffs(64, 58).mirror().addBox(-0.5F, -0.75F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0452F, -0.3141F, 1.2194F, 1.0563F, -0.0415F, 0.2505F));

		PartDefinition Bodyfront_r81 = bone3.addOrReplaceChild("Bodyfront_r81", CubeListBuilder.create().texOffs(11, 49).mirror().addBox(-0.5F, 0.0431F, -1.0716F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4197F, -1.7946F, 1.3237F, 0.5676F, -0.0415F, 0.2505F));

		PartDefinition Bodyfront_r82 = bone3.addOrReplaceChild("Bodyfront_r82", CubeListBuilder.create().texOffs(35, 85).mirror().addBox(-0.5F, -0.7569F, 0.0284F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.4F, 0.8818F, -0.0415F, 0.2505F));

		PartDefinition Bodyfront_r83 = bone3.addOrReplaceChild("Bodyfront_r83", CubeListBuilder.create().texOffs(62, 22).mirror().addBox(-0.589F, -1.2901F, -0.4215F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.625F, 0.6465F, -0.3024F, 0.5359F, 0.9821F, 0.0453F));

		PartDefinition Bodyfront_r84 = bone3.addOrReplaceChild("Bodyfront_r84", CubeListBuilder.create().texOffs(62, 18).mirror().addBox(-0.6223F, -0.7474F, -0.4215F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.625F, 0.6465F, -0.3024F, 1.056F, 0.2473F, 0.8584F));

		PartDefinition Bodyfront_r85 = bone3.addOrReplaceChild("Bodyfront_r85", CubeListBuilder.create().texOffs(74, 6).mirror().addBox(-0.9552F, -0.8886F, -0.4215F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.625F, 0.6465F, -0.3024F, 0.9924F, 0.5089F, 0.6881F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1873F, 3.8984F, -0.0939F, 0.0869F, -0.0082F));

		PartDefinition Bodyfront_r86 = Tailbase.addOrReplaceChild("Bodyfront_r86", CubeListBuilder.create().texOffs(35, 88).addBox(0.0F, -1.1F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 30).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.836F, 5.5758F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r87 = Tailbase.addOrReplaceChild("Bodyfront_r87", CubeListBuilder.create().texOffs(13, 40).addBox(0.0F, -1.5F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4167F, 1.5367F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r88 = Tailbase.addOrReplaceChild("Bodyfront_r88", CubeListBuilder.create().texOffs(15, 60).addBox(0.0F, -0.3F, 0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4519F, 6.7517F, 0.6021F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r89 = Tailbase.addOrReplaceChild("Bodyfront_r89", CubeListBuilder.create().texOffs(32, 39).addBox(0.0F, 0.0F, -0.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1575F, 4.632F, 0.5847F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r90 = Tailbase.addOrReplaceChild("Bodyfront_r90", CubeListBuilder.create().texOffs(41, 88).addBox(0.0F, 0.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3453F, 2.7176F, 0.5847F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r91 = Tailbase.addOrReplaceChild("Bodyfront_r91", CubeListBuilder.create().texOffs(38, 88).addBox(0.0F, -1.3F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4167F, 1.5367F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Tailbase_r1 = Tailbase.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(19, 31).mirror().addBox(-1.0F, 0.0F, 0.8F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1007F, 0.283F, 0.0524F, 0.0349F, 0.0018F));

		PartDefinition Tailbase_r2 = Tailbase.addOrReplaceChild("Tailbase_r2", CubeListBuilder.create().texOffs(19, 31).addBox(0.0F, 0.0F, 0.8F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1007F, 0.283F, 0.0524F, -0.0349F, -0.0018F));

		PartDefinition Tailbase_r3 = Tailbase.addOrReplaceChild("Tailbase_r3", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.1007F, 0.283F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6078F, 8.0702F, 0.1048F, 0.0868F, 0.0091F));

		PartDefinition Bodyfront_r92 = Tailmiddlebase.addOrReplaceChild("Bodyfront_r92", CubeListBuilder.create().texOffs(21, 89).addBox(0.0F, -1.1F, 10.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1536F, -3.9058F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r93 = Tailmiddlebase.addOrReplaceChild("Bodyfront_r93", CubeListBuilder.create().texOffs(44, 89).addBox(0.0F, -0.75F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3231F, 4.9016F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r94 = Tailmiddlebase.addOrReplaceChild("Bodyfront_r94", CubeListBuilder.create().texOffs(18, 89).addBox(0.0F, -1.25F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0244F, 2.8918F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r95 = Tailmiddlebase.addOrReplaceChild("Bodyfront_r95", CubeListBuilder.create().texOffs(12, 89).addBox(0.0F, -1.2F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.028F, 0.8925F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r1 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(23, 0).mirror().addBox(-0.7F, 0.0F, 1.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2831F, -0.0986F, 0.0175F, 0.0349F, 0.0006F));

		PartDefinition Tailmiddlebase_r2 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r2", CubeListBuilder.create().texOffs(23, 0).addBox(-0.3F, 0.0F, 1.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2831F, -0.0986F, 0.0175F, -0.0349F, -0.0006F));

		PartDefinition Tailmiddlebase_r3 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r3", CubeListBuilder.create().texOffs(19, 12).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2831F, -0.0986F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r96 = Tailmiddlebase.addOrReplaceChild("Bodyfront_r96", CubeListBuilder.create().texOffs(89, 37).addBox(0.0F, 2.4F, 3.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 8).addBox(0.0F, 0.8F, 1.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 88).addBox(0.0F, 0.3F, -0.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4378F, 1.2021F, 0.4712F, 0.0F, 0.0F));

		PartDefinition Tailmiddle = Tailmiddlebase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create().texOffs(6, 89).addBox(0.0F, -0.8443F, 0.85F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0222F, 7.9699F, 0.1086F, 0.1301F, 0.0141F));

		PartDefinition Tailmiddle_r1 = Tailmiddle.addOrReplaceChild("Tailmiddle_r1", CubeListBuilder.create().texOffs(9, 89).addBox(0.0F, -0.8F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 76).addBox(0.0F, -0.9F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 22).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.2652F, -0.1284F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r97 = Tailmiddle.addOrReplaceChild("Bodyfront_r97", CubeListBuilder.create().texOffs(24, 70).addBox(0.0F, 4.6F, 9.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 89).addBox(0.0F, 3.8F, 7.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 88).addBox(0.0F, 3.0F, 5.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.46F, -6.7678F, 0.4712F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = Tailmiddle.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0227F, 6.8731F, 0.1031F, -0.217F, -0.0223F));

		PartDefinition Bodyfront_r98 = Tailmiddleend.addOrReplaceChild("Bodyfront_r98", CubeListBuilder.create().texOffs(30, 89).addBox(0.0F, 7.4F, 15.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 5).addBox(0.0F, 6.3F, 13.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 89).addBox(0.0F, 5.4F, 11.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4373F, -13.6408F, 0.4712F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(36, 30).addBox(-0.5F, -0.4556F, -0.0967F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.1498F, 9.8048F, -0.1586F, -0.1293F, 0.0206F));

		PartDefinition Tailend2 = Tailend.addOrReplaceChild("Tailend2", CubeListBuilder.create().texOffs(38, 8).addBox(-0.5F, -0.4556F, -0.0967F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0168F, 5.8826F, -0.141F, -0.1296F, 0.0183F));

		PartDefinition Tailend3 = Tailend2.addOrReplaceChild("Tailend3", CubeListBuilder.create().texOffs(36, 38).addBox(-0.5F, -0.4556F, -0.0967F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.0191F, 5.9256F, -0.1699F, -0.2151F, 0.0366F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3F, 2.1176F, -0.1372F, 0.4376F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r1 = Rightthigh.addOrReplaceChild("Rightthigh_r1", CubeListBuilder.create().texOffs(76, 28).addBox(-1.0F, 2.2739F, -1.7658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 3.8108F, -2.6469F, 0.576F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r2 = Rightthigh.addOrReplaceChild("Rightthigh_r2", CubeListBuilder.create().texOffs(65, 46).addBox(-1.5F, 2.6761F, -0.6938F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 3.8108F, -2.6469F, 0.096F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r3 = Rightthigh.addOrReplaceChild("Rightthigh_r3", CubeListBuilder.create().texOffs(69, 66).addBox(-1.0F, 1.0613F, -0.1723F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 3.8108F, -2.6469F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r4 = Rightthigh.addOrReplaceChild("Rightthigh_r4", CubeListBuilder.create().texOffs(76, 59).addBox(-1.0F, 2.0432F, -0.3235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 3.8108F, -2.6469F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r5 = Rightthigh.addOrReplaceChild("Rightthigh_r5", CubeListBuilder.create().texOffs(66, 76).addBox(-1.0F, 1.054F, 0.1253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 3.8108F, -2.6469F, -0.1658F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r6 = Rightthigh.addOrReplaceChild("Rightthigh_r6", CubeListBuilder.create().texOffs(49, 77).addBox(-1.0F, 0.0221F, 0.2613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 3.8108F, -2.6469F, -0.2967F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r7 = Rightthigh.addOrReplaceChild("Rightthigh_r7", CubeListBuilder.create().texOffs(76, 25).addBox(-1.0F, 0.0821F, -0.0369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 3.8108F, -2.6469F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r8 = Rightthigh.addOrReplaceChild("Rightthigh_r8", CubeListBuilder.create().texOffs(74, 71).addBox(-1.0F, 2.7616F, -1.0646F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1892F, -0.0469F, -0.2967F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r9 = Rightthigh.addOrReplaceChild("Rightthigh_r9", CubeListBuilder.create().texOffs(71, 26).addBox(-1.0F, 2.7965F, -0.9346F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -0.1892F, -0.0469F, -0.384F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r10 = Rightthigh.addOrReplaceChild("Rightthigh_r10", CubeListBuilder.create().texOffs(54, 66).addBox(-1.0F, -0.1055F, -0.5616F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1892F, -0.0469F, -0.5149F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r11 = Rightthigh.addOrReplaceChild("Rightthigh_r11", CubeListBuilder.create().texOffs(69, 6).addBox(-1.0F, -3.024F, -0.8694F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 2.4947F, -1.0453F, -0.6021F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r12 = Rightthigh.addOrReplaceChild("Rightthigh_r12", CubeListBuilder.create().texOffs(69, 3).addBox(-1.0F, -1.6F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(69, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.7232F, 1.1965F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r13 = Rightthigh.addOrReplaceChild("Rightthigh_r13", CubeListBuilder.create().texOffs(40, 85).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 1.0894F, 0.3513F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r14 = Rightthigh.addOrReplaceChild("Rightthigh_r14", CubeListBuilder.create().texOffs(74, 67).addBox(-1.0F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -0.4892F, -0.1469F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 9.1562F, -2.372F, 0.8748F, 0.0F, 0.0F));

		PartDefinition Rightshin_r1 = Rightshin.addOrReplaceChild("Rightshin_r1", CubeListBuilder.create().texOffs(69, 30).addBox(-1.0F, 0.225F, -1.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, -0.1793F, 2.0457F, -0.4451F, 0.0F, 0.0F));

		PartDefinition Rightshin_r2 = Rightshin.addOrReplaceChild("Rightshin_r2", CubeListBuilder.create().texOffs(15, 65).addBox(-1.0F, -1.0F, -0.675F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.015F))
				.texOffs(65, 40).addBox(-1.0F, -0.5F, -0.675F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, -0.973F, 0.1078F, 1.1781F, 0.0F, 0.0F));

		PartDefinition Rightshin_r3 = Rightshin.addOrReplaceChild("Rightshin_r3", CubeListBuilder.create().texOffs(65, 43).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 0.0662F, 0.7078F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Rightshin_r4 = Rightshin.addOrReplaceChild("Rightshin_r4", CubeListBuilder.create().texOffs(54, 59).addBox(-0.5F, -4.8F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.7F, 3.7716F, 0.5873F, -0.096F, 0.0F, 0.0F));

		PartDefinition Rightshin_r5 = Rightshin.addOrReplaceChild("Rightshin_r5", CubeListBuilder.create().texOffs(28, 57).addBox(-0.5F, -4.8F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.7F, 7.962F, 0.4293F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Rightshin_r6 = Rightshin.addOrReplaceChild("Rightshin_r6", CubeListBuilder.create().texOffs(22, 65).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, 11.1946F, -0.2989F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Rightshin_r7 = Rightshin.addOrReplaceChild("Rightshin_r7", CubeListBuilder.create().texOffs(18, 57).addBox(0.0F, 0.0F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 4.8339F, 0.9453F, -0.096F, 0.0F, 0.0F));

		PartDefinition Rightshin_r8 = Rightshin.addOrReplaceChild("Rightshin_r8", CubeListBuilder.create().texOffs(0, 60).addBox(0.0F, -1.6F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(60, 52).addBox(-0.5F, -3.3F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.4F, 2.4144F, 0.5505F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Rightshin_r9 = Rightshin.addOrReplaceChild("Rightshin_r9", CubeListBuilder.create().texOffs(40, 57).addBox(-1.0F, -0.725F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.9F, -0.5856F, 0.6504F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Rightankle = Rightshin.addOrReplaceChild("Rightankle", CubeListBuilder.create().texOffs(33, 51).addBox(-1.0F, -1.2456F, -0.5909F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 12.0637F, -0.3229F, -0.7404F, 0.0F, 0.0F));

		PartDefinition Rightfoot = Rightankle.addOrReplaceChild("Rightfoot", CubeListBuilder.create().texOffs(38, 16).addBox(-2.0F, -1.4891F, -2.6469F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 6.8283F, -0.092F, 0.6664F, 0.0F, 0.0F));

		PartDefinition Righttoes = Rightfoot.addOrReplaceChild("Righttoes", CubeListBuilder.create().texOffs(13, 44).addBox(-2.0F, -1.4891F, -3.1469F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.01F, -2.5F, -0.48F, 0.0F, 0.0F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3F, 1.1284F, -0.2841F, -0.4787F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r1 = Leftthigh.addOrReplaceChild("Leftthigh_r1", CubeListBuilder.create().texOffs(76, 56).addBox(0.0F, 2.2739F, -1.7658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 4.8F, -2.5F, 0.576F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r2 = Leftthigh.addOrReplaceChild("Leftthigh_r2", CubeListBuilder.create().texOffs(7, 66).addBox(-0.5F, 2.6761F, -0.6938F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 4.8F, -2.5F, 0.096F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r3 = Leftthigh.addOrReplaceChild("Leftthigh_r3", CubeListBuilder.create().texOffs(19, 70).addBox(0.0F, 1.0613F, -0.1723F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 4.8F, -2.5F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r4 = Leftthigh.addOrReplaceChild("Leftthigh_r4", CubeListBuilder.create().texOffs(76, 62).addBox(0.0F, 2.0432F, -0.3235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 4.8F, -2.5F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r5 = Leftthigh.addOrReplaceChild("Leftthigh_r5", CubeListBuilder.create().texOffs(10, 77).addBox(0.0F, 1.054F, 0.1253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 4.8F, -2.5F, -0.1658F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r6 = Leftthigh.addOrReplaceChild("Leftthigh_r6", CubeListBuilder.create().texOffs(15, 79).addBox(0.0F, 0.0221F, 0.2613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 4.8F, -2.5F, -0.2967F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r7 = Leftthigh.addOrReplaceChild("Leftthigh_r7", CubeListBuilder.create().texOffs(76, 53).addBox(0.0F, 0.0821F, -0.0369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 4.8F, -2.5F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r8 = Leftthigh.addOrReplaceChild("Leftthigh_r8", CubeListBuilder.create().texOffs(61, 75).addBox(0.0F, 2.7616F, -1.0646F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.8F, 0.1F, -0.2967F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r9 = Leftthigh.addOrReplaceChild("Leftthigh_r9", CubeListBuilder.create().texOffs(47, 71).addBox(0.0F, 2.7965F, -0.9346F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 0.8F, 0.1F, -0.384F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r10 = Leftthigh.addOrReplaceChild("Leftthigh_r10", CubeListBuilder.create().texOffs(37, 68).addBox(0.0F, -0.1055F, -0.5616F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.8F, 0.1F, -0.5149F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r11 = Leftthigh.addOrReplaceChild("Leftthigh_r11", CubeListBuilder.create().texOffs(69, 21).addBox(0.0F, -3.024F, -0.8694F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 3.4839F, -0.8984F, -0.6021F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r12 = Leftthigh.addOrReplaceChild("Leftthigh_r12", CubeListBuilder.create().texOffs(69, 18).addBox(-1.0F, -1.6F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(69, 11).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.2659F, 1.3435F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r13 = Leftthigh.addOrReplaceChild("Leftthigh_r13", CubeListBuilder.create().texOffs(86, 54).addBox(0.0F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 2.0785F, 0.4982F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r14 = Leftthigh.addOrReplaceChild("Leftthigh_r14", CubeListBuilder.create().texOffs(56, 75).addBox(0.0F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 0.5F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 9.1562F, -2.372F, 1.2238F, 0.0F, 0.0F));

		PartDefinition Leftshin_r1 = Leftshin.addOrReplaceChild("Leftshin_r1", CubeListBuilder.create().texOffs(69, 54).addBox(-1.0F, 0.225F, -1.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.8099F, 2.1926F, -0.4451F, 0.0F, 0.0F));

		PartDefinition Leftshin_r2 = Leftshin.addOrReplaceChild("Leftshin_r2", CubeListBuilder.create().texOffs(35, 65).addBox(-1.0F, -1.0F, -0.675F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.015F))
				.texOffs(42, 65).addBox(-1.0F, -0.5F, -0.675F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.0161F, 0.2548F, 1.1781F, 0.0F, 0.0F));

		PartDefinition Leftshin_r3 = Leftshin.addOrReplaceChild("Leftshin_r3", CubeListBuilder.create().texOffs(0, 66).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.0554F, 0.8548F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Leftshin_r4 = Leftshin.addOrReplaceChild("Leftshin_r4", CubeListBuilder.create().texOffs(59, 59).addBox(-0.5F, -4.8F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.7F, 4.7608F, 0.7342F, -0.096F, 0.0F, 0.0F));

		PartDefinition Leftshin_r5 = Leftshin.addOrReplaceChild("Leftshin_r5", CubeListBuilder.create().texOffs(49, 59).addBox(-0.5F, -4.8F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.7F, 8.9512F, 0.5762F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Leftshin_r6 = Leftshin.addOrReplaceChild("Leftshin_r6", CubeListBuilder.create().texOffs(49, 66).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7F, 12.1838F, -0.152F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Leftshin_r7 = Leftshin.addOrReplaceChild("Leftshin_r7", CubeListBuilder.create().texOffs(23, 57).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 5.823F, 1.0922F, -0.096F, 0.0F, 0.0F));

		PartDefinition Leftshin_r8 = Leftshin.addOrReplaceChild("Leftshin_r8", CubeListBuilder.create().texOffs(10, 60).addBox(-1.0F, -1.6F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(40, 61).addBox(-1.5F, -3.3F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.4F, 3.4035F, 0.6974F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Leftshin_r9 = Leftshin.addOrReplaceChild("Leftshin_r9", CubeListBuilder.create().texOffs(58, 36).addBox(-1.0F, -0.725F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.9F, 0.4035F, 0.7974F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Leftankle = Leftshin.addOrReplaceChild("Leftankle", CubeListBuilder.create().texOffs(51, 36).addBox(-1.0F, -0.2565F, -0.444F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 12.0637F, -0.3229F, -1.7003F, 0.0F, 0.0F));

		PartDefinition Leftfoot = Leftankle.addOrReplaceChild("Leftfoot", CubeListBuilder.create().texOffs(17, 39).addBox(-2.0F, -0.5F, -2.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 6.8282F, -0.092F, 1.8445F, 0.0F, 0.0F));

		PartDefinition Lefttoes = Leftfoot.addOrReplaceChild("Lefttoes", CubeListBuilder.create().texOffs(28, 46).addBox(-2.0F, -0.5F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.01F, -2.5F, -0.3406F, -0.0626F, 0.0562F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4609F, -0.4345F, 0.1188F, 0.0F, 0.0F, 0.1745F));

		PartDefinition Hips_r2 = bone2.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(86, 60).addBox(-1.0F, -3.8049F, 0.6754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.5F, -0.031F, -0.1466F, -1.1083F, 0.0F, -0.1396F));

		PartDefinition Hips_r3 = bone2.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(58, 40).addBox(-1.0F, -0.2733F, 1.1853F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, -0.031F, -0.1466F, 0.1484F, 0.0F, -0.1396F));

		PartDefinition Hips_r4 = bone2.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(56, 45).addBox(-1.0F, -0.8165F, 1.3665F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -0.031F, -0.1466F, 0.0873F, 0.0F, -0.1396F));

		PartDefinition Hips_r5 = bone2.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(39, 75).addBox(-0.8F, 1.4375F, -0.8831F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2034F)), PartPose.offsetAndRotation(0.5F, -0.031F, -0.1466F, -1.5446F, 0.0F, -0.1396F));

		PartDefinition Hips_r6 = bone2.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(69, 79).addBox(-0.8F, 0.786F, -2.958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -0.031F, -0.1466F, -0.6981F, 0.0F, -0.1396F));

		PartDefinition Hips_r7 = bone2.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(79, 70).addBox(-0.8F, 1.8917F, -1.3138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(79, 67).addBox(-0.8F, 1.6917F, -1.3138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, -0.031F, -0.1466F, -1.5272F, 0.0F, -0.1396F));

		PartDefinition Hips_r8 = bone2.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(69, 70).addBox(-0.1F, -0.517F, 2.4302F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4F, 6.349F, -4.7468F, -1.1345F, 0.0F, -0.1571F));

		PartDefinition Hips_r9 = bone2.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(42, 71).addBox(-0.1F, 0.6026F, 2.604F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.4F, 6.349F, -4.7468F, -1.309F, 0.0F, -0.1571F));

		PartDefinition Hips_r10 = bone2.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(40, 79).addBox(-0.1F, 2.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(67, 49).addBox(-0.1F, -0.1F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.4F, 6.349F, -4.7468F, -0.3927F, 0.0F, -0.1571F));

		PartDefinition Hips_r11 = bone2.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(79, 39).addBox(-0.1F, 2.6568F, 1.0252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F))
				.texOffs(35, 79).addBox(-0.1F, 1.9568F, 1.1502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.4F, 6.349F, -4.7468F, -0.7854F, 0.0F, -0.1571F));

		PartDefinition Hips_r12 = bone2.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(64, 66).addBox(-0.5F, -0.1F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.9541F, -3.5001F, -0.48F, 0.0F, 0.0F));

		PartDefinition Hips_r13 = bone2.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(14, 68).addBox(-0.5F, -2.8F, -0.625F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.0F, 4.1948F, -3.1498F, -0.7767F, 0.0F, 0.0F));

		PartDefinition Hips_r14 = bone2.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(32, 68).addBox(-0.5F, -0.623F, -0.8615F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0F, 2.4906F, 0.6266F, 1.1432F, -0.192F, 0.0F));

		PartDefinition Hips_r15 = bone2.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(79, 6).addBox(-0.2326F, 2.9018F, 0.4124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.7F, 3.7906F, 2.8266F, 0.4272F, -0.1035F, -0.1404F));

		PartDefinition Hips_r16 = bone2.addOrReplaceChild("Hips_r16", CubeListBuilder.create().texOffs(78, 31).addBox(-0.2326F, 2.9802F, 0.3315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.7F, 3.7906F, 2.8266F, 0.5145F, -0.1035F, -0.1404F));

		PartDefinition Hips_r17 = bone2.addOrReplaceChild("Hips_r17", CubeListBuilder.create().texOffs(79, 46).addBox(-0.2326F, 2.0828F, -2.8658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.7F, 3.7906F, 2.8266F, 1.5617F, -0.1035F, -0.1404F));

		PartDefinition Hips_r18 = bone2.addOrReplaceChild("Hips_r18", CubeListBuilder.create().texOffs(5, 60).addBox(-0.2326F, -0.168F, -0.7573F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.7F, 3.7906F, 2.8266F, 0.8199F, -0.1035F, -0.1404F));

		PartDefinition Hips_r19 = bone2.addOrReplaceChild("Hips_r19", CubeListBuilder.create().texOffs(27, 68).addBox(-0.5F, -0.2925F, -0.1867F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.4906F, 0.6266F, 0.8378F, -0.192F, 0.0F));

		PartDefinition Hips_r20 = bone2.addOrReplaceChild("Hips_r20", CubeListBuilder.create().texOffs(59, 66).addBox(-0.5F, -2.0F, -0.625F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, 3.5355F, -2.6967F, -0.6021F, 0.0F, 0.0F));

		PartDefinition Hips_r21 = bone2.addOrReplaceChild("Hips_r21", CubeListBuilder.create().texOffs(71, 57).addBox(-0.5F, -2.0F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(57, 71).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.321F, -1.4106F, -0.4014F, 0.0F, 0.0F));

		PartDefinition Hips_r22 = bone2.addOrReplaceChild("Hips_r22", CubeListBuilder.create().texOffs(53, 0).addBox(-0.5F, -0.3F, -2.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.1882F, 1.1877F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Hips_r23 = bone2.addOrReplaceChild("Hips_r23", CubeListBuilder.create().texOffs(51, 52).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.364F, -0.6455F, -0.3229F, 0.0F, 0.0F));

		PartDefinition Hips_r24 = bone2.addOrReplaceChild("Hips_r24", CubeListBuilder.create().texOffs(28, 64).addBox(-1.0F, -0.9963F, -1.9919F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.031F, -0.1466F, -0.0175F, 0.0F, -0.1396F));

		PartDefinition Hips_r25 = bone2.addOrReplaceChild("Hips_r25", CubeListBuilder.create().texOffs(62, 30).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -0.031F, -0.1466F, 0.0F, 0.0F, -0.1396F));

		PartDefinition bone4 = Hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4609F, 0.5546F, 0.2657F, 0.0F, 0.0F, -0.1745F));

		PartDefinition Hips_r26 = bone4.addOrReplaceChild("Hips_r26", CubeListBuilder.create().texOffs(86, 60).mirror().addBox(0.0F, -3.8049F, 0.6754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0202F, -0.2935F, -1.1083F, 0.0F, 0.1396F));

		PartDefinition Hips_r27 = bone4.addOrReplaceChild("Hips_r27", CubeListBuilder.create().texOffs(58, 40).mirror().addBox(0.0F, -0.2733F, 1.1853F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0202F, -0.2935F, 0.1484F, 0.0F, 0.1396F));

		PartDefinition Hips_r28 = bone4.addOrReplaceChild("Hips_r28", CubeListBuilder.create().texOffs(56, 45).mirror().addBox(0.0F, -0.8165F, 1.3665F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0202F, -0.2935F, 0.0873F, 0.0F, 0.1396F));

		PartDefinition Hips_r29 = bone4.addOrReplaceChild("Hips_r29", CubeListBuilder.create().texOffs(39, 75).mirror().addBox(-0.2F, 1.4375F, -0.8831F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2034F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0202F, -0.2935F, -1.5446F, 0.0F, 0.1396F));

		PartDefinition Hips_r30 = bone4.addOrReplaceChild("Hips_r30", CubeListBuilder.create().texOffs(69, 79).mirror().addBox(-0.2F, 0.786F, -2.958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0202F, -0.2935F, -0.6981F, 0.0F, 0.1396F));

		PartDefinition Hips_r31 = bone4.addOrReplaceChild("Hips_r31", CubeListBuilder.create().texOffs(79, 70).mirror().addBox(-0.2F, 1.8917F, -1.3138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(79, 67).mirror().addBox(-0.2F, 1.6917F, -1.3138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0202F, -0.2935F, -1.5272F, 0.0F, 0.1396F));

		PartDefinition Hips_r32 = bone4.addOrReplaceChild("Hips_r32", CubeListBuilder.create().texOffs(69, 70).mirror().addBox(-0.9F, -0.517F, 2.4302F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.4F, 5.3599F, -4.8937F, -1.1345F, 0.0F, 0.1571F));

		PartDefinition Hips_r33 = bone4.addOrReplaceChild("Hips_r33", CubeListBuilder.create().texOffs(42, 71).mirror().addBox(-0.9F, 0.6026F, 2.604F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.4F, 5.3599F, -4.8937F, -1.309F, 0.0F, 0.1571F));

		PartDefinition Hips_r34 = bone4.addOrReplaceChild("Hips_r34", CubeListBuilder.create().texOffs(40, 79).mirror().addBox(-0.9F, 2.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(67, 49).mirror().addBox(-0.9F, -0.1F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.4F, 5.3599F, -4.8937F, -0.3927F, 0.0F, 0.1571F));

		PartDefinition Hips_r35 = bone4.addOrReplaceChild("Hips_r35", CubeListBuilder.create().texOffs(79, 39).mirror().addBox(-0.9F, 2.6568F, 1.0252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(35, 79).mirror().addBox(-0.9F, 1.9568F, 1.1502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.4F, 5.3599F, -4.8937F, -0.7854F, 0.0F, 0.1571F));

		PartDefinition Hips_r36 = bone4.addOrReplaceChild("Hips_r36", CubeListBuilder.create().texOffs(64, 66).mirror().addBox(-0.5F, -0.1F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.9649F, -3.647F, -0.48F, 0.0F, 0.0F));

		PartDefinition Hips_r37 = bone4.addOrReplaceChild("Hips_r37", CubeListBuilder.create().texOffs(14, 68).mirror().addBox(-0.5F, -2.8F, -0.625F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.2057F, -3.2968F, -0.7767F, 0.0F, 0.0F));

		PartDefinition Hips_r38 = bone4.addOrReplaceChild("Hips_r38", CubeListBuilder.create().texOffs(32, 68).mirror().addBox(-0.5F, -0.623F, -0.8615F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5015F, 0.4797F, 1.1432F, 0.192F, 0.0F));

		PartDefinition Hips_r39 = bone4.addOrReplaceChild("Hips_r39", CubeListBuilder.create().texOffs(79, 6).mirror().addBox(-0.7674F, 2.9018F, 0.4124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.7F, 2.8015F, 2.6796F, 0.4272F, 0.1035F, 0.1404F));

		PartDefinition Hips_r40 = bone4.addOrReplaceChild("Hips_r40", CubeListBuilder.create().texOffs(78, 31).mirror().addBox(-0.7674F, 2.9802F, 0.3315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.7F, 2.8015F, 2.6796F, 0.5145F, 0.1035F, 0.1404F));

		PartDefinition Hips_r41 = bone4.addOrReplaceChild("Hips_r41", CubeListBuilder.create().texOffs(79, 46).mirror().addBox(-0.7674F, 2.0828F, -2.8658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.7F, 2.8015F, 2.6796F, 1.5617F, 0.1035F, 0.1404F));

		PartDefinition Hips_r42 = bone4.addOrReplaceChild("Hips_r42", CubeListBuilder.create().texOffs(5, 60).mirror().addBox(-0.7674F, -0.168F, -0.7573F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.7F, 2.8015F, 2.6796F, 0.8199F, 0.1035F, 0.1404F));

		PartDefinition Hips_r43 = bone4.addOrReplaceChild("Hips_r43", CubeListBuilder.create().texOffs(27, 68).mirror().addBox(-0.5F, -0.2925F, -0.1867F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5015F, 0.4797F, 0.8378F, 0.192F, 0.0F));

		PartDefinition Hips_r44 = bone4.addOrReplaceChild("Hips_r44", CubeListBuilder.create().texOffs(59, 66).mirror().addBox(-0.5F, -2.0F, -0.625F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5464F, -2.8437F, -0.6021F, 0.0F, 0.0F));

		PartDefinition Hips_r45 = bone4.addOrReplaceChild("Hips_r45", CubeListBuilder.create().texOffs(71, 57).mirror().addBox(-0.5F, -2.0F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(57, 71).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.3318F, -1.5576F, -0.4014F, 0.0F, 0.0F));

		PartDefinition Hips_r46 = bone4.addOrReplaceChild("Hips_r46", CubeListBuilder.create().texOffs(53, 0).mirror().addBox(-0.5F, -0.3F, -2.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1991F, 1.0408F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Hips_r47 = bone4.addOrReplaceChild("Hips_r47", CubeListBuilder.create().texOffs(51, 52).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6252F, -0.7924F, -0.3229F, 0.0F, 0.0F));

		PartDefinition Hips_r48 = bone4.addOrReplaceChild("Hips_r48", CubeListBuilder.create().texOffs(28, 64).mirror().addBox(0.0F, -0.9963F, -1.9919F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0202F, -0.2935F, -0.0175F, 0.0F, 0.1396F));

		PartDefinition Hips_r49 = bone4.addOrReplaceChild("Hips_r49", CubeListBuilder.create().texOffs(62, 30).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0202F, -0.2935F, 0.0F, 0.0F, 0.1396F));

		return LayerDefinition.create(meshdefinition, 93, 93);
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