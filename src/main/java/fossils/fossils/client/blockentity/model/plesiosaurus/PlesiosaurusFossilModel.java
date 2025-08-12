package fossils.fossils.client.blockentity.model.plesiosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PlesiosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Hips;
	private final ModelPart BackFlipperR2;
	private final ModelPart BackFlipperMiddleR2;
	private final ModelPart BackFlipperEndR2;
	private final ModelPart BackFlipperR3;
	private final ModelPart BackFlipperMiddleR3;
	private final ModelPart BackFlipperEndR3;
	private final ModelPart bone2;
	private final ModelPart bone6;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart tailfin;
	private final ModelPart Bodymiddle;
	private final ModelPart body;
	private final ModelPart Bodyfront;
	private final ModelPart chest;
	private final ModelPart FrontFlipperR2;
	private final ModelPart FrontFlipperMiddleR2;
	private final ModelPart FrontFlipperEndR2;
	private final ModelPart FrontFlipperR3;
	private final ModelPart FrontFlipperMiddleR3;
	private final ModelPart FrontFlipperEndR3;
	private final ModelPart bone;
	private final ModelPart bone5;
	private final ModelPart neck;
	private final ModelPart Neck1;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart Neck5;
	private final ModelPart Neck6;
	private final ModelPart Neck7;
	private final ModelPart Head;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart Lowerjaw;

	public PlesiosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Hips = this.fossil.getChild("Hips");
		this.BackFlipperR2 = this.Hips.getChild("BackFlipperR2");
		this.BackFlipperMiddleR2 = this.BackFlipperR2.getChild("BackFlipperMiddleR2");
		this.BackFlipperEndR2 = this.BackFlipperMiddleR2.getChild("BackFlipperEndR2");
		this.BackFlipperR3 = this.Hips.getChild("BackFlipperR3");
		this.BackFlipperMiddleR3 = this.BackFlipperR3.getChild("BackFlipperMiddleR3");
		this.BackFlipperEndR3 = this.BackFlipperMiddleR3.getChild("BackFlipperEndR3");
		this.bone2 = this.Hips.getChild("bone2");
		this.bone6 = this.Hips.getChild("bone6");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.tailfin = this.Tail3.getChild("tailfin");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body = this.Bodymiddle.getChild("body");
		this.Bodyfront = this.body.getChild("Bodyfront");
		this.chest = this.Bodyfront.getChild("chest");
		this.FrontFlipperR2 = this.chest.getChild("FrontFlipperR2");
		this.FrontFlipperMiddleR2 = this.FrontFlipperR2.getChild("FrontFlipperMiddleR2");
		this.FrontFlipperEndR2 = this.FrontFlipperMiddleR2.getChild("FrontFlipperEndR2");
		this.FrontFlipperR3 = this.chest.getChild("FrontFlipperR3");
		this.FrontFlipperMiddleR3 = this.FrontFlipperR3.getChild("FrontFlipperMiddleR3");
		this.FrontFlipperEndR3 = this.FrontFlipperMiddleR3.getChild("FrontFlipperEndR3");
		this.bone = this.chest.getChild("bone");
		this.bone5 = this.chest.getChild("bone5");
		this.neck = this.chest.getChild("neck");
		this.Neck1 = this.neck.getChild("Neck1");
		this.Neck2 = this.Neck1.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.Neck5 = this.Neck4.getChild("Neck5");
		this.Neck6 = this.Neck5.getChild("Neck6");
		this.Neck7 = this.Neck6.getChild("Neck7");
		this.Head = this.Neck7.getChild("Head");
		this.bone3 = this.Head.getChild("bone3");
		this.bone4 = this.Head.getChild("bone4");
		this.Lowerjaw = this.Head.getChild("Lowerjaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Hips = fossil.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -12.2128F, 11.1812F, -0.1298F, -0.017F, -0.1298F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(85, 89).addBox(0.0F, -1.6411F, -0.9508F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3591F, 4.8486F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(82, 89).addBox(0.0F, -1.5411F, 3.9492F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 89).addBox(0.0F, -1.6411F, 1.9492F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, -2.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(80, 13).mirror().addBox(-1.9F, 0.1F, 7.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(80, 13).addBox(-0.1F, 0.1F, 7.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 24).addBox(-1.0F, -0.4F, 2.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.8F, -3.1F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(88, 60).mirror().addBox(-3.599F, -1.311F, -0.4161F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9478F, -0.5157F, 1.8427F, 0.3204F, 0.5483F, -0.5585F));

		PartDefinition cube_r5 = Hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(73, 13).mirror().addBox(-2.91F, -0.0899F, -0.4375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9478F, -0.5157F, 1.8427F, 0.5231F, 0.3734F, -0.1104F));

		PartDefinition cube_r6 = Hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(36, 61).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7478F, -0.5157F, -0.1573F, 0.3204F, 0.5483F, -0.5585F));

		PartDefinition cube_r7 = Hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(70, 53).mirror().addBox(-2.91F, -0.0899F, -0.4375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7478F, -0.5157F, -0.1573F, 0.5231F, 0.3734F, -0.1104F));

		PartDefinition cube_r8 = Hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(73, 13).addBox(0.91F, -0.0899F, -0.4375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9478F, -0.5157F, 1.8427F, 0.5231F, -0.3734F, 0.1104F));

		PartDefinition cube_r9 = Hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(88, 60).addBox(2.599F, -1.311F, -0.4161F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9478F, -0.5157F, 1.8427F, 0.3204F, -0.5483F, 0.5585F));

		PartDefinition cube_r10 = Hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(70, 53).addBox(0.91F, -0.0899F, -0.4375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7478F, -0.5157F, -0.1573F, 0.5231F, -0.3734F, 0.1104F));

		PartDefinition cube_r11 = Hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(36, 61).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7478F, -0.5157F, -0.1573F, 0.3204F, -0.5483F, 0.5585F));

		PartDefinition BackFlipperR2 = Hips.addOrReplaceChild("BackFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.2304F, 3.5608F, 0.9712F, -0.0525F, -0.4174F, 0.8599F));

		PartDefinition cube_r12 = BackFlipperR2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(9, 66).addBox(3.8F, 0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F))
				.texOffs(11, 58).addBox(-0.3F, 0.5F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5029F, -0.9811F, 0.5426F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r13 = BackFlipperR2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(71, 61).addBox(-1.7F, -0.5F, -0.775F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.7029F, 0.0189F, 0.4426F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r14 = BackFlipperR2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(57, 55).addBox(0.3F, -0.5F, -0.425F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.9304F, 0.0189F, 1.0702F, 0.0F, 2.8798F, 0.0F));

		PartDefinition cube_r15 = BackFlipperR2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(71, 26).addBox(-1.0F, -0.5F, -0.575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.9304F, 0.0189F, 1.0702F, 0.0F, 2.3126F, 0.0F));

		PartDefinition cube_r16 = BackFlipperR2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(24, 47).addBox(-0.4F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.7029F, 0.0189F, 0.4426F, 0.0F, 0.829F, 0.0F));

		PartDefinition BackFlipperMiddleR2 = BackFlipperR2.addOrReplaceChild("BackFlipperMiddleR2", CubeListBuilder.create().texOffs(0, 32).addBox(1.1407F, 0.0F, -1.5261F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(78, 59).addBox(-1.7343F, -0.5F, 0.2739F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.164F, 0.0189F, 1.6447F, -0.0411F, -0.3027F, 0.1372F));

		PartDefinition cube_r17 = BackFlipperMiddleR2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(79, 7).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.624F, 0.0F, 1.2648F, 0.0F, 1.1345F, 0.0F));

		PartDefinition cube_r18 = BackFlipperMiddleR2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 79).addBox(0.7F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(75, 78).addBox(-0.4F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5343F, 0.0F, 0.6739F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r19 = BackFlipperMiddleR2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(70, 78).addBox(-0.35F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5343F, 0.0F, 0.7739F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r20 = BackFlipperMiddleR2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(72, 7).addBox(-1.0F, -0.5F, -0.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7593F, 0.0F, -0.6261F, 0.0F, 0.1309F, 0.0F));

		PartDefinition BackFlipperEndR2 = BackFlipperMiddleR2.addOrReplaceChild("BackFlipperEndR2", CubeListBuilder.create().texOffs(0, 44).addBox(0.0F, 0.0149F, -0.6F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.6407F, 0.0F, -0.9261F, -0.0172F, -0.1298F, 0.132F));

		PartDefinition BackFlipperR3 = Hips.addOrReplaceChild("BackFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.2304F, 3.5608F, 0.9712F, 0.1022F, 0.4086F, -0.4786F));

		PartDefinition cube_r21 = BackFlipperR3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(66, 11).addBox(-4.8F, 0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F))
				.texOffs(58, 40).addBox(-3.7F, 0.5F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5029F, -0.9811F, 0.5426F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r22 = BackFlipperR3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 73).addBox(-0.3F, -0.5F, -0.775F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-4.7029F, 0.0189F, 0.4426F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r23 = BackFlipperR3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(58, 37).addBox(-4.3F, -0.5F, -0.425F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-3.9304F, 0.0189F, 1.0702F, 0.0F, -2.8798F, 0.0F));

		PartDefinition cube_r24 = BackFlipperR3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(49, 72).addBox(-1.0F, -0.5F, -0.575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-3.9304F, 0.0189F, 1.0702F, 0.0F, -2.3126F, 0.0F));

		PartDefinition cube_r25 = BackFlipperR3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(22, 79).addBox(-0.6F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-4.7029F, 0.0189F, 0.4426F, 0.0F, -0.829F, 0.0F));

		PartDefinition BackFlipperMiddleR3 = BackFlipperR3.addOrReplaceChild("BackFlipperMiddleR3", CubeListBuilder.create().texOffs(19, 32).addBox(-7.1407F, 0.0F, -1.5261F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(55, 79).addBox(0.7343F, -0.5F, 0.2739F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.164F, 0.0189F, 1.6447F, -0.0275F, 0.3042F, -0.0915F));

		PartDefinition cube_r26 = BackFlipperMiddleR3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(27, 80).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.624F, 0.0F, 1.2648F, 0.0F, -1.1345F, 0.0F));

		PartDefinition cube_r27 = BackFlipperMiddleR3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(80, 10).addBox(-1.7F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(65, 79).addBox(-0.6F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5343F, 0.0F, 0.6739F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r28 = BackFlipperMiddleR3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(60, 79).addBox(-0.65F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5343F, 0.0F, 0.7739F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r29 = BackFlipperMiddleR3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(73, 10).addBox(-1.0F, -0.5F, -0.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7593F, 0.0F, -0.6261F, 0.0F, -0.1309F, 0.0F));

		PartDefinition BackFlipperEndR3 = BackFlipperMiddleR3.addOrReplaceChild("BackFlipperEndR3", CubeListBuilder.create().texOffs(15, 44).addBox(-5.0F, 0.0149F, -0.6F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.6407F, 0.0F, -0.9261F, -0.0341F, 0.1264F, -0.264F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(2.7616F, 5.6239F, -5.7982F));

		PartDefinition basin_r1 = bone2.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(43, 67).addBox(-0.4336F, -0.5096F, -0.2271F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.3996F, -3.5577F, 8.1575F, -1.7261F, -0.226F, -0.2448F));

		PartDefinition basin_r2 = bone2.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(81, 4).addBox(-0.4336F, 0.7212F, 0.6591F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(80, 78).addBox(-0.4336F, 0.8212F, -0.3409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.3996F, -3.5577F, 8.1575F, -1.028F, -0.226F, -0.2448F));

		PartDefinition basin_r3 = bone2.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(38, 31).addBox(-0.4336F, -0.9863F, -0.6217F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3996F, -3.5577F, 8.1575F, -0.6353F, -0.226F, -0.2448F));

		PartDefinition basin_r4 = bone2.addOrReplaceChild("basin_r4", CubeListBuilder.create().texOffs(80, 73).addBox(-0.4336F, -1.7772F, -0.0626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.3996F, -3.5577F, 8.1575F, 0.0192F, -0.226F, -0.2448F));

		PartDefinition basin_r5 = bone2.addOrReplaceChild("basin_r5", CubeListBuilder.create().texOffs(80, 70).addBox(-0.4336F, -1.7313F, 0.5698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.3996F, -3.5577F, 8.1575F, 0.3683F, -0.226F, -0.2448F));

		PartDefinition basin_r6 = bone2.addOrReplaceChild("basin_r6", CubeListBuilder.create().texOffs(42, 80).addBox(-0.4336F, -0.7657F, 1.3948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3996F, -3.5577F, 8.1575F, 0.8482F, -0.226F, -0.2448F));

		PartDefinition basin_r7 = bone2.addOrReplaceChild("basin_r7", CubeListBuilder.create().texOffs(13, 47).addBox(-0.4336F, -0.3934F, -1.9176F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3996F, -3.5577F, 8.1575F, 1.0228F, -0.226F, -0.2448F));

		PartDefinition basin_r8 = bone2.addOrReplaceChild("basin_r8", CubeListBuilder.create().texOffs(36, 67).addBox(-0.75F, -0.5F, -1.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0883F, -1.3538F, 8.1036F, 0.4202F, 0.9616F, 0.3512F));

		PartDefinition basin_r9 = bone2.addOrReplaceChild("basin_r9", CubeListBuilder.create().texOffs(67, 29).addBox(-1.2F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1329F, -1.4011F, 8.3006F, 0.3148F, 0.7167F, 0.2107F));

		PartDefinition basin_r10 = bone2.addOrReplaceChild("basin_r10", CubeListBuilder.create().texOffs(62, 58).addBox(-1.3081F, -0.3573F, 1.544F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2402F, -0.9405F, 5.7712F, 0.2643F, -0.4656F, -0.1209F));

		PartDefinition basin_r11 = bone2.addOrReplaceChild("basin_r11", CubeListBuilder.create().texOffs(61, 66).addBox(-1.4F, -0.5F, -2.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.1366F, -1.0495F, 6.8364F, 0.3964F, -0.9215F, -0.3218F));

		PartDefinition basin_r12 = bone2.addOrReplaceChild("basin_r12", CubeListBuilder.create().texOffs(59, 0).addBox(-2.8768F, -0.3573F, -0.4388F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F))
				.texOffs(18, 65).addBox(-2.9018F, -0.3573F, 1.9862F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2402F, -0.9405F, 5.7712F, 0.2356F, 0.0F, 0.0F));

		PartDefinition basin_r13 = bone2.addOrReplaceChild("basin_r13", CubeListBuilder.create().texOffs(37, 80).addBox(-0.2979F, -0.3573F, -0.1396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2402F, -0.9405F, 5.7712F, 0.2501F, 0.339F, 0.0848F));

		PartDefinition basin_r14 = bone2.addOrReplaceChild("basin_r14", CubeListBuilder.create().texOffs(53, 58).addBox(0.4021F, -0.3573F, -0.4396F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2402F, -0.9405F, 5.7712F, 0.2939F, -0.6335F, -0.1772F));

		PartDefinition basin_r15 = bone2.addOrReplaceChild("basin_r15", CubeListBuilder.create().texOffs(44, 58).addBox(-0.6F, -0.5F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.1384F, -1.1254F, 7.1524F, 0.2643F, -0.4656F, -0.1209F));

		PartDefinition basin_r16 = bone2.addOrReplaceChild("basin_r16", CubeListBuilder.create().texOffs(62, 16).addBox(2.4581F, -0.99F, -0.5104F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.278F, 0.2358F, 3.044F, 0.2208F, -0.427F, -0.0927F));

		PartDefinition basin_r17 = bone2.addOrReplaceChild("basin_r17", CubeListBuilder.create().texOffs(73, 70).addBox(2.2414F, -0.99F, 0.4413F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.278F, 0.2358F, 3.044F, 0.2007F, 0.0F, 0.0F));

		PartDefinition basin_r18 = bone2.addOrReplaceChild("basin_r18", CubeListBuilder.create().texOffs(32, 80).addBox(-0.4242F, -0.5035F, -2.1425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2402F, -0.8155F, 5.7712F, 0.2055F, 0.2137F, 0.0442F));

		PartDefinition basin_r19 = bone2.addOrReplaceChild("basin_r19", CubeListBuilder.create().texOffs(27, 61).addBox(-0.0941F, -0.5035F, -2.9179F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.2402F, -0.8155F, 5.7712F, 0.415F, 1.0536F, 0.3658F));

		PartDefinition basin_r20 = bone2.addOrReplaceChild("basin_r20", CubeListBuilder.create().texOffs(43, 45).addBox(1.0333F, -0.99F, -1.1105F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.278F, 0.2358F, 3.044F, 0.2307F, -0.512F, -0.1146F));

		PartDefinition basin_r21 = bone2.addOrReplaceChild("basin_r21", CubeListBuilder.create().texOffs(11, 53).addBox(-0.1671F, -0.99F, -3.8341F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.278F, 0.2358F, 3.044F, 0.5366F, -1.1702F, -0.5011F));

		PartDefinition basin_r22 = bone2.addOrReplaceChild("basin_r22", CubeListBuilder.create().texOffs(52, 6).addBox(-2.8672F, -0.5035F, -3.4142F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2402F, -0.8155F, 5.7712F, 0.2008F, 0.0257F, 0.0052F));

		PartDefinition basin_r23 = bone2.addOrReplaceChild("basin_r23", CubeListBuilder.create().texOffs(18, 61).addBox(-1.3F, -0.5F, -1.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.1119F, -0.1227F, 2.3485F, 0.3159F, 0.874F, 0.2456F));

		PartDefinition basin_r24 = bone2.addOrReplaceChild("basin_r24", CubeListBuilder.create().texOffs(0, 52).addBox(0.0197F, -0.99F, -1.9023F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-1.278F, 0.2358F, 3.044F, 0.2031F, 0.1539F, 0.0316F));

		PartDefinition basin_r25 = bone2.addOrReplaceChild("basin_r25", CubeListBuilder.create().texOffs(51, 16).addBox(0.7053F, -0.99F, -2.6847F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.278F, 0.2358F, 3.044F, 0.2168F, -0.3844F, -0.0824F));

		PartDefinition bone6 = Hips.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(-2.7616F, 5.6239F, -5.7982F));

		PartDefinition basin_r26 = bone6.addOrReplaceChild("basin_r26", CubeListBuilder.create().texOffs(43, 67).mirror().addBox(-0.5664F, -0.5096F, -0.2271F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3996F, -3.5577F, 8.1575F, -1.7261F, 0.226F, 0.2448F));

		PartDefinition basin_r27 = bone6.addOrReplaceChild("basin_r27", CubeListBuilder.create().texOffs(81, 4).mirror().addBox(-0.5664F, 0.7212F, 0.6591F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(80, 78).mirror().addBox(-0.5664F, 0.8212F, -0.3409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3996F, -3.5577F, 8.1575F, -1.028F, 0.226F, 0.2448F));

		PartDefinition basin_r28 = bone6.addOrReplaceChild("basin_r28", CubeListBuilder.create().texOffs(38, 31).mirror().addBox(-0.5664F, -0.9863F, -0.6217F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3996F, -3.5577F, 8.1575F, -0.6353F, 0.226F, 0.2448F));

		PartDefinition basin_r29 = bone6.addOrReplaceChild("basin_r29", CubeListBuilder.create().texOffs(80, 73).mirror().addBox(-0.5664F, -1.7772F, -0.0626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3996F, -3.5577F, 8.1575F, 0.0192F, 0.226F, 0.2448F));

		PartDefinition basin_r30 = bone6.addOrReplaceChild("basin_r30", CubeListBuilder.create().texOffs(80, 70).mirror().addBox(-0.5664F, -1.7313F, 0.5698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.3996F, -3.5577F, 8.1575F, 0.3683F, 0.226F, 0.2448F));

		PartDefinition basin_r31 = bone6.addOrReplaceChild("basin_r31", CubeListBuilder.create().texOffs(42, 80).mirror().addBox(-0.5664F, -0.7657F, 1.3948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3996F, -3.5577F, 8.1575F, 0.8482F, 0.226F, 0.2448F));

		PartDefinition basin_r32 = bone6.addOrReplaceChild("basin_r32", CubeListBuilder.create().texOffs(13, 47).mirror().addBox(-0.5664F, -0.3934F, -1.9176F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3996F, -3.5577F, 8.1575F, 1.0228F, 0.226F, 0.2448F));

		PartDefinition basin_r33 = bone6.addOrReplaceChild("basin_r33", CubeListBuilder.create().texOffs(36, 67).mirror().addBox(-0.25F, -0.5F, -1.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0883F, -1.3538F, 8.1036F, 0.4202F, -0.9616F, -0.3512F));

		PartDefinition basin_r34 = bone6.addOrReplaceChild("basin_r34", CubeListBuilder.create().texOffs(67, 29).mirror().addBox(0.2F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1329F, -1.4011F, 8.3006F, 0.3148F, -0.7167F, -0.2107F));

		PartDefinition basin_r35 = bone6.addOrReplaceChild("basin_r35", CubeListBuilder.create().texOffs(62, 58).mirror().addBox(-0.6919F, -0.3573F, 1.544F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2402F, -0.9405F, 5.7712F, 0.2643F, 0.4656F, 0.1209F));

		PartDefinition basin_r36 = bone6.addOrReplaceChild("basin_r36", CubeListBuilder.create().texOffs(61, 66).mirror().addBox(0.4F, -0.5F, -2.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.1366F, -1.0495F, 6.8364F, 0.3964F, 0.9215F, 0.3218F));

		PartDefinition basin_r37 = bone6.addOrReplaceChild("basin_r37", CubeListBuilder.create().texOffs(59, 0).mirror().addBox(1.8768F, -0.3573F, -0.4388F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(18, 65).mirror().addBox(-0.0982F, -0.3573F, 1.9862F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2402F, -0.9405F, 5.7712F, 0.2356F, 0.0F, 0.0F));

		PartDefinition basin_r38 = bone6.addOrReplaceChild("basin_r38", CubeListBuilder.create().texOffs(37, 80).mirror().addBox(-0.7021F, -0.3573F, -0.1396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2402F, -0.9405F, 5.7712F, 0.2501F, -0.339F, -0.0848F));

		PartDefinition basin_r39 = bone6.addOrReplaceChild("basin_r39", CubeListBuilder.create().texOffs(53, 58).mirror().addBox(-1.4021F, -0.3573F, -0.4396F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2402F, -0.9405F, 5.7712F, 0.2939F, 0.6335F, 0.1772F));

		PartDefinition basin_r40 = bone6.addOrReplaceChild("basin_r40", CubeListBuilder.create().texOffs(44, 58).mirror().addBox(-0.4F, -0.5F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1384F, -1.1254F, 7.1524F, 0.2643F, 0.4656F, 0.1209F));

		PartDefinition basin_r41 = bone6.addOrReplaceChild("basin_r41", CubeListBuilder.create().texOffs(62, 16).mirror().addBox(-4.4581F, -0.99F, -0.5104F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.278F, 0.2358F, 3.044F, 0.2208F, 0.427F, 0.0927F));

		PartDefinition basin_r42 = bone6.addOrReplaceChild("basin_r42", CubeListBuilder.create().texOffs(73, 70).mirror().addBox(-4.2414F, -0.99F, 0.4413F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.278F, 0.2358F, 3.044F, 0.2007F, 0.0F, 0.0F));

		PartDefinition basin_r43 = bone6.addOrReplaceChild("basin_r43", CubeListBuilder.create().texOffs(32, 80).mirror().addBox(-0.5758F, -0.5035F, -2.1425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2402F, -0.8155F, 5.7712F, 0.2055F, -0.2137F, -0.0442F));

		PartDefinition basin_r44 = bone6.addOrReplaceChild("basin_r44", CubeListBuilder.create().texOffs(27, 61).mirror().addBox(-1.9059F, -0.5035F, -2.9179F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(-0.2402F, -0.8155F, 5.7712F, 0.415F, -1.0536F, -0.3658F));

		PartDefinition basin_r45 = bone6.addOrReplaceChild("basin_r45", CubeListBuilder.create().texOffs(43, 45).mirror().addBox(-4.0333F, -0.99F, -1.1105F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.278F, 0.2358F, 3.044F, 0.2307F, 0.512F, 0.1146F));

		PartDefinition basin_r46 = bone6.addOrReplaceChild("basin_r46", CubeListBuilder.create().texOffs(11, 53).mirror().addBox(-1.8329F, -0.99F, -3.8341F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.278F, 0.2358F, 3.044F, 0.5366F, 1.1702F, 0.5011F));

		PartDefinition basin_r47 = bone6.addOrReplaceChild("basin_r47", CubeListBuilder.create().texOffs(52, 6).mirror().addBox(0.8672F, -0.5035F, -3.4142F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2402F, -0.8155F, 5.7712F, 0.2008F, -0.0257F, -0.0052F));

		PartDefinition basin_r48 = bone6.addOrReplaceChild("basin_r48", CubeListBuilder.create().texOffs(18, 61).mirror().addBox(-0.7F, -0.5F, -1.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(1.1119F, -0.1227F, 2.3485F, 0.3159F, -0.874F, -0.2456F));

		PartDefinition basin_r49 = bone6.addOrReplaceChild("basin_r49", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-2.0197F, -0.99F, -1.9023F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(1.278F, 0.2358F, 3.044F, 0.2031F, -0.1539F, -0.0316F));

		PartDefinition basin_r50 = bone6.addOrReplaceChild("basin_r50", CubeListBuilder.create().texOffs(51, 16).mirror().addBox(-2.7052F, -0.99F, -2.6847F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(1.278F, 0.2358F, 3.044F, 0.2168F, 0.3844F, 0.0824F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(48, 0).addBox(-0.5F, -0.2606F, -0.0485F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 5.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r30 = Tail1.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(90, 13).addBox(0.0F, -1.7F, -2.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 9).addBox(0.0F, -1.5F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4668F, 3.3669F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r31 = Tail1.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 90).addBox(0.0F, -1.3489F, 1.9738F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 89).addBox(0.0F, -1.3489F, -0.0262F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2117F, 0.9777F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r32 = Tail1.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(62, 62).mirror().addBox(-0.7F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2394F, 0.9515F, 0.0F, 0.0698F, 0.0F));

		PartDefinition cube_r33 = Tail1.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(62, 62).addBox(-0.3F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2394F, 0.9515F, 0.0F, -0.0698F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(33, 0).addBox(-0.5F, -0.9509F, 0.0452F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7003F, 3.9057F, 0.0792F, -0.1305F, -0.0103F));

		PartDefinition cube_r34 = Tail2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(9, 92).addBox(0.0F, -0.4904F, 4.0531F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 92).addBox(0.0F, -0.6904F, 2.0531F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8606F, 0.9921F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r35 = Tail2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(3, 92).addBox(0.0F, 0.6F, 7.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 91).addBox(0.0F, 0.4F, 5.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 88).addBox(0.0F, 0.2F, 3.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7785F, -2.5107F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r36 = Tail2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(15, 29).addBox(0.0F, -0.9904F, 0.0531F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8606F, 0.9921F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r37 = Tail2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(43, 31).mirror().addBox(-0.9F, 0.4096F, 0.0531F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8606F, 0.9921F, 0.0F, 0.0698F, 0.0F));

		PartDefinition cube_r38 = Tail2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(43, 31).addBox(-0.1F, 0.4096F, 0.0531F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8606F, 0.9921F, 0.0F, -0.0698F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(19, 14).addBox(-0.5F, -0.6014F, 0.0445F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3649F, 5.992F, 0.0268F, -0.2181F, -0.0058F));

		PartDefinition tailfin = Tail3.addOrReplaceChild("tailfin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7151F, 7.2008F, -0.9163F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(36, 24).addBox(-0.5F, -0.6F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4539F, -0.9251F, 0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r39 = Bodymiddle.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(90, 72).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r40 = Bodymiddle.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(90, 68).addBox(0.5F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5F, -3.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r41 = Bodymiddle.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(67, 47).mirror().addBox(-2.91F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0478F, -0.0118F, -2.6322F, 0.5791F, 0.3787F, -0.0899F));

		PartDefinition cube_r42 = Bodymiddle.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(76, 38).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0478F, -0.0118F, -2.6322F, 0.3733F, 0.5754F, -0.5303F));

		PartDefinition cube_r43 = Bodymiddle.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(76, 40).mirror().addBox(-5.474F, -3.2864F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0478F, -0.0118F, -2.6322F, 0.0257F, 0.6738F, -1.1129F));

		PartDefinition cube_r44 = Bodymiddle.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(76, 34).mirror().addBox(-2.91F, -0.0899F, -0.4375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4478F, -0.0618F, -1.0322F, 0.5791F, 0.3787F, -0.0899F));

		PartDefinition cube_r45 = Bodymiddle.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(76, 36).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4478F, -0.0618F, -1.0322F, 0.3733F, 0.5754F, -0.5303F));

		PartDefinition cube_r46 = Bodymiddle.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(89, 55).mirror().addBox(-4.474F, -3.2864F, -0.4161F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4478F, -0.0618F, -1.0322F, 0.0257F, 0.6738F, -1.1129F));

		PartDefinition cube_r47 = Bodymiddle.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(67, 33).mirror().addBox(-6.474F, -3.2864F, -0.4161F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, -0.0118F, -4.6322F, 0.0257F, 0.6738F, -1.1129F));

		PartDefinition cube_r48 = Bodymiddle.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(76, 32).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, -0.0118F, -4.6322F, 0.3733F, 0.5754F, -0.5303F));

		PartDefinition cube_r49 = Bodymiddle.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(67, 45).mirror().addBox(-2.91F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, -0.0118F, -4.6322F, 0.5791F, 0.3787F, -0.0899F));

		PartDefinition cube_r50 = Bodymiddle.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(76, 40).addBox(3.474F, -3.2864F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0478F, -0.0118F, -2.6322F, 0.0257F, -0.6738F, 1.1129F));

		PartDefinition cube_r51 = Bodymiddle.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(76, 38).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0478F, -0.0118F, -2.6322F, 0.3733F, -0.5754F, 0.5303F));

		PartDefinition cube_r52 = Bodymiddle.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(67, 47).addBox(-0.09F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0478F, -0.0118F, -2.6322F, 0.5791F, -0.3787F, 0.0899F));

		PartDefinition cube_r53 = Bodymiddle.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(89, 55).addBox(3.474F, -3.2864F, -0.4161F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4478F, -0.0618F, -1.0322F, 0.0257F, -0.6738F, 1.1129F));

		PartDefinition cube_r54 = Bodymiddle.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(76, 36).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4478F, -0.0618F, -1.0322F, 0.3733F, -0.5754F, 0.5303F));

		PartDefinition cube_r55 = Bodymiddle.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(76, 34).addBox(0.91F, -0.0899F, -0.4375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4478F, -0.0618F, -1.0322F, 0.5791F, -0.3787F, 0.0899F));

		PartDefinition cube_r56 = Bodymiddle.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(67, 45).addBox(-0.09F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, -0.0118F, -4.6322F, 0.5791F, -0.3787F, 0.0899F));

		PartDefinition cube_r57 = Bodymiddle.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(76, 32).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, -0.0118F, -4.6322F, 0.3733F, -0.5754F, 0.5303F));

		PartDefinition cube_r58 = Bodymiddle.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(67, 33).addBox(3.474F, -3.2864F, -0.4161F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, -0.0118F, -4.6322F, 0.0257F, -0.6738F, 1.1129F));

		PartDefinition cube_r59 = Bodymiddle.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(90, 22).addBox(0.5F, -2.1F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5F, -4.9F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(30, 36).addBox(-0.5F, -0.1F, -5.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -4.9F, 0.0876F, 0.0869F, 0.0076F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(47, 80).addBox(0.5F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -2.1F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(15, 24).addBox(0.5F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -4.1F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(68, 2).mirror().addBox(-2.91F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.5882F, -1.7322F, 0.5418F, 0.3753F, -0.1036F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(76, 47).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.5882F, -1.7322F, 0.3378F, 0.5575F, -0.5493F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(16, 68).mirror().addBox(-6.474F, -3.2864F, -0.4161F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.5882F, -1.7322F, 0.0065F, 0.6424F, -1.1247F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(68, 0).mirror().addBox(-2.91F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.4882F, -3.7322F, 0.5791F, 0.3787F, -0.0899F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(76, 45).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.4882F, -3.7322F, 0.3733F, 0.5754F, -0.5303F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(58, 43).mirror().addBox(-7.474F, -3.2864F, -0.4161F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.4882F, -3.7322F, 0.0257F, 0.6738F, -1.1129F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(16, 68).addBox(3.474F, -3.2864F, -0.4161F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.5882F, -1.7322F, 0.0065F, -0.6424F, 1.1247F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(76, 47).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.5882F, -1.7322F, 0.3378F, -0.5575F, 0.5493F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(68, 2).addBox(-0.09F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.5882F, -1.7322F, 0.5418F, -0.3753F, 0.1036F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(68, 0).addBox(-0.09F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.4882F, -3.7322F, 0.5791F, -0.3787F, 0.0899F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(76, 45).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.4882F, -3.7322F, 0.3733F, -0.5754F, 0.5303F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(58, 43).addBox(3.474F, -3.2864F, -0.4161F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.4882F, -3.7322F, 0.0257F, -0.6738F, 1.1129F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(0, 0).addBox(-5.5F, -2.1F, 0.0F, 12.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 7.4F, -5.1F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offset(0.0F, 0.4F, -5.05F));

		PartDefinition cube_r75 = Bodyfront.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(11, 81).addBox(0.5F, -2.6F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4741F, -1.024F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r76 = Bodyfront.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(8, 81).addBox(0.5F, -2.6F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5043F, -3.0263F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r77 = Bodyfront.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(5, 81).addBox(0.5F, -2.6F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3345F, -5.0215F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r78 = Bodyfront.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(50, 68).mirror().addBox(-2.91F, -0.0899F, -0.4374F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.0882F, -0.6822F, 0.5604F, 0.377F, -0.0968F));

		PartDefinition cube_r79 = Bodyfront.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(77, 2).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.0882F, -0.6822F, 0.3554F, 0.5665F, -0.5399F));

		PartDefinition cube_r80 = Bodyfront.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(63, 5).mirror().addBox(-7.474F, -3.2864F, -0.4161F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.0882F, -0.6822F, 0.016F, 0.6581F, -1.1189F));

		PartDefinition cube_r81 = Bodyfront.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(68, 49).mirror().addBox(-2.91F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.0882F, -2.6822F, 0.5604F, 0.377F, -0.0968F));

		PartDefinition cube_r82 = Bodyfront.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(77, 0).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.0882F, -2.6822F, 0.3554F, 0.5665F, -0.5399F));

		PartDefinition cube_r83 = Bodyfront.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(44, 56).mirror().addBox(-8.474F, -3.2864F, -0.4161F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.0882F, -2.6822F, 0.016F, 0.6581F, -1.1189F));

		PartDefinition cube_r84 = Bodyfront.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(56, 35).mirror().addBox(-8.474F, -3.2864F, -0.4161F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.0882F, -4.6822F, 0.0257F, 0.6738F, -1.1129F));

		PartDefinition cube_r85 = Bodyfront.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(70, 76).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.0882F, -4.6822F, 0.3733F, 0.5754F, -0.5303F));

		PartDefinition cube_r86 = Bodyfront.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(25, 68).mirror().addBox(-2.91F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.0882F, -4.6822F, 0.5791F, 0.3787F, -0.0899F));

		PartDefinition cube_r87 = Bodyfront.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(63, 5).addBox(3.474F, -3.2864F, -0.4161F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.0882F, -0.6822F, 0.016F, -0.6581F, 1.1189F));

		PartDefinition cube_r88 = Bodyfront.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(77, 2).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.0882F, -0.6822F, 0.3554F, -0.5665F, 0.5399F));

		PartDefinition cube_r89 = Bodyfront.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(50, 68).addBox(-0.09F, -0.0899F, -0.4374F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.0882F, -0.6822F, 0.5604F, -0.377F, 0.0968F));

		PartDefinition cube_r90 = Bodyfront.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(44, 56).addBox(3.474F, -3.2864F, -0.4161F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.0882F, -2.6822F, 0.016F, -0.6581F, 1.1189F));

		PartDefinition cube_r91 = Bodyfront.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(77, 0).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.0882F, -2.6822F, 0.3554F, -0.5665F, 0.5399F));

		PartDefinition cube_r92 = Bodyfront.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(68, 49).addBox(-0.09F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.0882F, -2.6822F, 0.5604F, -0.377F, 0.0968F));

		PartDefinition cube_r93 = Bodyfront.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(25, 68).addBox(-0.09F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.0882F, -4.6822F, 0.5791F, -0.3787F, 0.0899F));

		PartDefinition cube_r94 = Bodyfront.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(70, 76).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.0882F, -4.6822F, 0.3733F, -0.5754F, 0.5303F));

		PartDefinition cube_r95 = Bodyfront.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(56, 35).addBox(3.474F, -3.2864F, -0.4161F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.0882F, -4.6822F, 0.0257F, -0.6738F, 1.1129F));

		PartDefinition cube_r96 = Bodyfront.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(0, 7).addBox(-6.0F, -1.9F, -4.0F, 12.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.797F, -0.0697F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r97 = Bodyfront.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(0, 36).addBox(0.0F, -0.6F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.3F, -6.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition chest = Bodyfront.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.2939F, -5.9504F, 0.1223F, 0.0433F, 0.0053F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(14, 84).addBox(0.5F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5647F, -1.0203F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(83, 44).addBox(0.5F, -2.6F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4949F, -3.0191F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(42, 83).addBox(0.5F, -2.6F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4251F, -5.0179F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(77, 53).mirror().addBox(-5.474F, -3.2864F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5478F, 0.1943F, -6.7318F, 0.026F, 0.6348F, -1.113F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(77, 55).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5478F, 0.1943F, -6.7318F, 0.3484F, 0.5426F, -0.5438F));

		PartDefinition cube_r103 = chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(50, 70).mirror().addBox(-2.91F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5478F, 0.1943F, -6.7318F, 0.5437F, 0.3579F, -0.1029F));

		PartDefinition cube_r104 = chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(69, 43).mirror().addBox(-2.91F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3478F, 0.0943F, -4.7318F, 0.5418F, 0.3753F, -0.1036F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(64, 20).mirror().addBox(-7.474F, -3.2864F, -0.4161F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3478F, 0.0943F, -4.7318F, 0.0065F, 0.6424F, -1.1247F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(77, 51).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3478F, 0.0943F, -4.7318F, 0.3378F, 0.5575F, -0.5493F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(68, 55).mirror().addBox(-2.91F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, -0.0057F, -2.7318F, 0.5231F, 0.3734F, -0.1104F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(77, 49).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, -0.0057F, -2.7318F, 0.3204F, 0.5483F, -0.5585F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(51, 21).mirror().addBox(-8.474F, -3.2864F, -0.4161F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, -0.0057F, -2.7318F, -0.0028F, 0.6266F, -1.1302F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(68, 51).mirror().addBox(-2.91F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, -0.0057F, -0.7318F, 0.5045F, 0.3714F, -0.1172F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(22, 77).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, -0.0057F, -0.7318F, 0.3031F, 0.539F, -0.5674F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(57, 53).mirror().addBox(-8.474F, -3.2864F, -0.4161F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, -0.0057F, -0.7318F, -0.0119F, 0.6108F, -1.1355F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(50, 70).addBox(-0.09F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1943F, -6.7318F, 0.5437F, -0.3579F, 0.1029F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(77, 55).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1943F, -6.7318F, 0.3484F, -0.5426F, 0.5438F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(77, 53).addBox(3.474F, -3.2864F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1943F, -6.7318F, 0.026F, -0.6348F, 1.113F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(77, 51).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6522F, 0.0943F, -4.7318F, 0.3378F, -0.5575F, 0.5493F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(64, 20).addBox(3.474F, -3.2864F, -0.4161F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6522F, 0.0943F, -4.7318F, 0.0065F, -0.6424F, 1.1247F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(69, 43).addBox(-0.09F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6522F, 0.0943F, -4.7318F, 0.5418F, -0.3753F, 0.1036F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(51, 21).addBox(3.474F, -3.2864F, -0.4161F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8522F, -0.0057F, -2.7318F, -0.0028F, -0.6266F, 1.1302F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(77, 49).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8522F, -0.0057F, -2.7318F, 0.3204F, -0.5483F, 0.5585F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(68, 55).addBox(-0.09F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8522F, -0.0057F, -2.7318F, 0.5231F, -0.3734F, 0.1104F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(57, 53).addBox(3.474F, -3.2864F, -0.4161F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8522F, -0.0057F, -0.7318F, -0.0119F, -0.6108F, 1.1355F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(22, 77).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8522F, -0.0057F, -0.7318F, 0.3031F, -0.539F, 0.5674F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(68, 51).addBox(-0.09F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8522F, -0.0057F, -0.7318F, 0.5045F, -0.3714F, 0.1172F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(39, 83).addBox(0.5F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3553F, -7.0167F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(0, 14).addBox(0.0F, -0.6F, -8.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition FrontFlipperR2 = chest.addOrReplaceChild("FrontFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.3067F, 3.9779F, -6.4399F, -0.0526F, -0.4935F, -0.2819F));

		PartDefinition cube_r127 = FrontFlipperR2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(63, 7).addBox(-0.2715F, -1.0F, 0.4403F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.5734F, 0.4291F, -1.5916F, 0.0F, 0.6632F, 0.0F));

		PartDefinition cube_r128 = FrontFlipperR2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(27, 65).addBox(-1.4273F, -1.0F, 0.5365F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(21, 74).addBox(-0.8273F, -1.0F, 1.0365F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.0734F, 0.4291F, 1.1084F, 0.0F, 2.4871F, 0.0F));

		PartDefinition cube_r129 = FrontFlipperR2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(14, 74).addBox(-1.7F, -0.5F, 0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.2004F, -0.0709F, -0.445F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r130 = FrontFlipperR2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(7, 74).addBox(-1.5F, -1.0F, 1.225F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.2066F, 0.4291F, -0.0886F, 0.0F, -0.9163F, 0.0F));

		PartDefinition cube_r131 = FrontFlipperR2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(74, 4).addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2689F, -0.0709F, -1.0598F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r132 = FrontFlipperR2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(73, 73).addBox(0.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3771F, -0.0709F, -0.5717F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r133 = FrontFlipperR2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(60, 23).addBox(-1.575F, -1.0F, -0.3F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.1522F, 0.4291F, 0.1284F, 0.0F, 0.3054F, 0.0F));

		PartDefinition FrontFlipperMiddleR2 = FrontFlipperR2.addOrReplaceChild("FrontFlipperMiddleR2", CubeListBuilder.create().texOffs(14, 81).addBox(1.1332F, -0.5F, -1.4343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(81, 28).addBox(0.9332F, -0.5F, -0.0343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(70, 81).addBox(1.0332F, -0.5F, 1.1657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(74, 29).addBox(-1.0531F, -0.5F, -1.5308F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(7.7239F, -0.0709F, -1.5197F, -0.054F, 0.3892F, -0.1415F));

		PartDefinition cube_r134 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(0, 69).addBox(0.1F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0531F, 0.0F, -1.0308F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r135 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(68, 66).addBox(-1.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(56, 74).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0531F, 0.0F, -1.0308F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r136 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(82, 19).addBox(-0.45F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3469F, 0.0F, 1.3788F, 0.0F, 0.8727F, 0.0F));

		PartDefinition cube_r137 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(19, 82).addBox(0.175F, -0.5F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3003F, 0.0F, 2.5002F, 0.0F, 0.8727F, 0.0F));

		PartDefinition cube_r138 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(0, 82).addBox(-0.7F, -0.5F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3003F, 0.0F, 2.5002F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r139 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(80, 81).addBox(-0.35F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1849F, 0.0F, 1.7587F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r140 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(28, 74).addBox(-1.5F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.3017F, 0.0F, 1.6177F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r141 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(75, 81).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.5469F, 0.0F, 0.7692F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r142 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(43, 37).addBox(-0.0589F, 1.0399F, -0.3697F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3244F, -0.9941F, -0.6578F, 0.0017F, -0.0869F, 0.0076F));

		PartDefinition FrontFlipperEndR2 = FrontFlipperMiddleR2.addOrReplaceChild("FrontFlipperEndR2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.3469F, 0.0F, -0.8308F, 0.0341F, -0.1264F, -0.264F));

		PartDefinition cube_r143 = FrontFlipperEndR2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(33, 8).addBox(-0.1099F, 1.0565F, -0.4278F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9624F, -0.9652F, 0.5202F, 0.0028F, -0.2614F, 0.0068F));

		PartDefinition FrontFlipperR3 = chest.addOrReplaceChild("FrontFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.3067F, 3.9779F, -6.4399F, 0.4709F, 0.372F, 0.5911F));

		PartDefinition cube_r144 = FrontFlipperR3.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(36, 63).addBox(-1.7285F, -1.0F, 0.4403F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-3.5734F, 0.4291F, -1.5916F, 0.0F, -0.6632F, 0.0F));

		PartDefinition cube_r145 = FrontFlipperR3.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(0, 66).addBox(-1.5727F, -1.0F, 0.5365F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(49, 75).addBox(-1.1727F, -1.0F, 1.0365F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-4.0734F, 0.4291F, 1.1084F, 0.0F, -2.4871F, 0.0F));

		PartDefinition cube_r146 = FrontFlipperR3.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(42, 75).addBox(-0.3F, -0.5F, 0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-5.2004F, -0.0709F, -0.445F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r147 = FrontFlipperR3.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(35, 75).addBox(-0.5F, -1.0F, 1.225F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.2066F, 0.4291F, -0.0886F, 0.0F, 0.9163F, 0.0F));

		PartDefinition cube_r148 = FrontFlipperR3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(75, 19).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2689F, -0.0709F, -1.0598F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r149 = FrontFlipperR3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(63, 74).addBox(-2.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3771F, -0.0709F, -0.5717F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r150 = FrontFlipperR3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(60, 26).addBox(-2.425F, -1.0F, -0.3F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.1522F, 0.4291F, 0.1284F, 0.0F, -0.3054F, 0.0F));

		PartDefinition FrontFlipperMiddleR3 = FrontFlipperR3.addOrReplaceChild("FrontFlipperMiddleR3", CubeListBuilder.create().texOffs(50, 82).addBox(-2.1332F, -0.5F, -1.4343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(55, 82).addBox(-1.9332F, -0.5F, -0.0343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(60, 82).addBox(-2.0332F, -0.5F, 1.1657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(75, 67).addBox(-0.9469F, -0.5F, -1.5308F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-7.7239F, -0.0709F, -1.5197F, -0.0894F, -0.3829F, 0.2355F));

		PartDefinition cube_r151 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(69, 39).addBox(-1.1F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0531F, 0.0F, -1.0308F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r152 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(69, 35).addBox(0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 76).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0531F, 0.0F, -1.0308F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r153 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(29, 83).addBox(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3469F, 0.0F, 1.3788F, 0.0F, -0.8727F, 0.0F));

		PartDefinition cube_r154 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(24, 83).addBox(-1.175F, -0.5F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3003F, 0.0F, 2.5002F, 0.0F, -0.8727F, 0.0F));

		PartDefinition cube_r155 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(82, 65).addBox(-0.3F, -0.5F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3003F, 0.0F, 2.5002F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r156 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(65, 82).addBox(-0.65F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1849F, 0.0F, 1.7587F, 0.0F, 0.6109F, 0.0F));

		PartDefinition cube_r157 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(75, 64).addBox(-0.5F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3017F, 0.0F, 1.6177F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r158 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(82, 62).addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.5469F, 0.0F, 0.7692F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r159 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(43, 41).addBox(-3.9411F, 1.0399F, -0.3697F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3244F, -0.9941F, -0.6578F, 0.0017F, 0.0869F, -0.0076F));

		PartDefinition FrontFlipperEndR3 = FrontFlipperMiddleR3.addOrReplaceChild("FrontFlipperEndR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.3469F, 0.0F, -0.8308F, 0.0057F, 0.1308F, 0.044F));

		PartDefinition cube_r160 = FrontFlipperEndR3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(36, 12).addBox(-5.8901F, 1.0565F, -0.4278F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9624F, -0.9652F, 0.5202F, 0.0028F, 0.2614F, -0.0068F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(7.5986F, 8.4659F, -6.4739F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r161 = bone.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(28, 70).addBox(-1.025F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-5.8986F, -3.7252F, -0.8899F, -0.3035F, 0.2085F, -0.0647F));

		PartDefinition cube_r162 = bone.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(0, 61).addBox(-4.41F, -0.9349F, -0.9358F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 47).addBox(-4.31F, -0.9349F, 1.2642F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F))
				.texOffs(45, 63).addBox(-4.31F, -0.9349F, 3.7642F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.6886F, -3.3866F, -1.2697F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r163 = bone.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(57, 49).addBox(-0.8824F, -0.1431F, 2.0249F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-4.6471F, -2.578F, 3.9902F, -0.3009F, -0.3767F, 0.1137F));

		PartDefinition cube_r164 = bone.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(33, 56).addBox(-2.3515F, -0.1343F, 0.3724F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.6471F, -2.578F, 3.9902F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r165 = bone.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(21, 70).addBox(-0.7761F, -0.1343F, 2.5188F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-4.6471F, -2.578F, 3.9902F, -0.3114F, 0.4516F, -0.1395F));

		PartDefinition cube_r166 = bone.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(14, 70).addBox(-0.2627F, -0.1343F, 2.5253F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.6471F, -2.578F, 3.9902F, -0.2819F, 0.1342F, -0.0387F));

		PartDefinition cube_r167 = bone.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(56, 30).addBox(-1.5F, -0.5F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.2685F, -1.7184F, 5.6738F, -0.298F, 0.0918F, -0.0281F));

		PartDefinition cube_r168 = bone.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(0, 57).addBox(-1.9F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-4.9826F, -2.6986F, 2.4678F, -0.5422F, 0.9684F, -0.4607F));

		PartDefinition cube_r169 = bone.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(22, 56).addBox(-1.5F, -0.5F, -1.8F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0643F, -2.9426F, 1.6699F, -0.3903F, 0.6944F, -0.2574F));

		PartDefinition cube_r170 = bone.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(83, 37).addBox(-0.2592F, -1.6837F, -1.8749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.3393F, -5.7415F, -0.1759F, -2.1712F, 0.2239F, 0.2467F));

		PartDefinition cube_r171 = bone.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(17, 77).addBox(-0.2592F, -1.7035F, -0.2242F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.3393F, -5.7415F, -0.1759F, -1.2178F, 0.1406F, 0.3013F));

		PartDefinition cube_r172 = bone.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(83, 34).addBox(-0.2592F, 0.0549F, -0.6614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.3393F, -5.7415F, -0.1759F, -1.1415F, 0.2239F, 0.2467F));

		PartDefinition cube_r173 = bone.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(12, 77).addBox(-0.2592F, -1.8384F, -0.6444F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-3.3393F, -5.7415F, -0.1759F, -1.2986F, 0.2239F, 0.2467F));

		PartDefinition cube_r174 = bone.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(7, 77).addBox(0.312F, 0.2111F, 0.3223F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.7393F, -6.4414F, -0.7759F, 0.0594F, 0.5256F, 0.7416F));

		PartDefinition cube_r175 = bone.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(54, 63).addBox(0.312F, 0.2818F, -1.8194F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.7393F, -6.4414F, -0.7759F, 0.4957F, 0.5256F, 0.7416F));

		PartDefinition cube_r176 = bone.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(55, 11).addBox(-1.0F, -0.5F, -1.6F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-4.1069F, -3.2906F, 0.4277F, -0.3909F, -0.2778F, 0.0244F));

		PartDefinition cube_r177 = bone.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(56, 45).addBox(-1.5F, -0.5F, -1.325F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-4.8297F, -4.0395F, -1.3289F, -0.8745F, -0.8491F, 0.6365F));

		PartDefinition cube_r178 = bone.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(34, 83).addBox(-0.2F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-6.3712F, -4.3131F, -2.0411F, -1.0557F, -0.949F, 0.8673F));

		PartDefinition cube_r179 = bone.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(83, 31).addBox(-0.3F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-6.5469F, -4.3551F, -2.1406F, -0.7215F, -0.696F, 0.4184F));

		PartDefinition cube_r180 = bone.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(7, 70).addBox(-1.0F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.9745F, -4.5193F, -2.1646F, -1.0557F, -0.949F, 0.8673F));

		PartDefinition bone5 = chest.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5986F, 8.4659F, -6.4739F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r181 = bone5.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(28, 70).mirror().addBox(0.025F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(5.8986F, -3.7252F, -0.8899F, -0.3035F, -0.2085F, 0.0647F));

		PartDefinition cube_r182 = bone5.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(3.41F, -0.9349F, -0.9358F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(0, 47).mirror().addBox(1.31F, -0.9349F, 1.2642F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(45, 63).mirror().addBox(2.31F, -0.9349F, 3.7642F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.6886F, -3.3866F, -1.2697F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r183 = bone5.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(57, 49).mirror().addBox(-2.1176F, -0.1431F, 2.0249F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(4.6471F, -2.578F, 3.9902F, -0.3009F, 0.3767F, -0.1137F));

		PartDefinition cube_r184 = bone5.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(33, 56).mirror().addBox(0.3515F, -0.1343F, 0.3724F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(4.6471F, -2.578F, 3.9902F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r185 = bone5.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(21, 70).mirror().addBox(-0.2239F, -0.1343F, 2.5188F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(4.6471F, -2.578F, 3.9902F, -0.3114F, -0.4516F, 0.1395F));

		PartDefinition cube_r186 = bone5.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(14, 70).mirror().addBox(-0.7373F, -0.1343F, 2.5253F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.6471F, -2.578F, 3.9902F, -0.2819F, -0.1342F, 0.0387F));

		PartDefinition cube_r187 = bone5.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(56, 30).mirror().addBox(-0.5F, -0.5F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.2685F, -1.7184F, 5.6738F, -0.298F, -0.0918F, 0.0281F));

		PartDefinition cube_r188 = bone5.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(-1.1F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(4.9826F, -2.6986F, 2.4678F, -0.5422F, -0.9684F, 0.4607F));

		PartDefinition cube_r189 = bone5.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(22, 56).mirror().addBox(-0.5F, -0.5F, -1.8F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.0643F, -2.9426F, 1.6699F, -0.3903F, -0.6944F, 0.2574F));

		PartDefinition cube_r190 = bone5.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(83, 37).mirror().addBox(-0.7408F, -1.6837F, -1.8749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(3.3393F, -5.7415F, -0.1759F, -2.1712F, -0.2239F, -0.2467F));

		PartDefinition cube_r191 = bone5.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(17, 77).mirror().addBox(-0.7408F, -1.7035F, -0.2242F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.3393F, -5.7415F, -0.1759F, -1.2178F, -0.1406F, -0.3013F));

		PartDefinition cube_r192 = bone5.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(83, 34).mirror().addBox(-0.7408F, 0.0549F, -0.6614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.3393F, -5.7415F, -0.1759F, -1.1415F, -0.2239F, -0.2467F));

		PartDefinition cube_r193 = bone5.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(12, 77).mirror().addBox(-0.7408F, -1.8384F, -0.6444F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(3.3393F, -5.7415F, -0.1759F, -1.2986F, -0.2239F, -0.2467F));

		PartDefinition cube_r194 = bone5.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(7, 77).mirror().addBox(-1.312F, 0.2111F, 0.3223F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.7393F, -6.4414F, -0.7759F, 0.0594F, -0.5256F, -0.7416F));

		PartDefinition cube_r195 = bone5.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(54, 63).mirror().addBox(-1.312F, 0.2818F, -1.8194F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(3.7393F, -6.4414F, -0.7759F, 0.4957F, -0.5256F, -0.7416F));

		PartDefinition cube_r196 = bone5.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(55, 11).mirror().addBox(-1.0F, -0.5F, -1.6F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(4.1069F, -3.2906F, 0.4277F, -0.3909F, 0.2778F, -0.0244F));

		PartDefinition cube_r197 = bone5.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(56, 45).mirror().addBox(-1.5F, -0.5F, -1.325F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(4.8297F, -4.0395F, -1.3289F, -0.8745F, 0.8491F, -0.6365F));

		PartDefinition cube_r198 = bone5.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(34, 83).mirror().addBox(-0.8F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(6.3712F, -4.3131F, -2.0411F, -1.0557F, 0.949F, -0.8673F));

		PartDefinition cube_r199 = bone5.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(83, 31).mirror().addBox(-0.7F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(6.5469F, -4.3551F, -2.1406F, -0.7215F, 0.696F, -0.4184F));

		PartDefinition cube_r200 = bone5.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(7, 70).mirror().addBox(0.0F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(4.9745F, -4.5193F, -2.1646F, -1.0557F, 0.949F, -0.8673F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5292F, -7.9951F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r201 = neck.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(70, 84).addBox(0.5F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5101F, -3.0251F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r202 = neck.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(77, 76).mirror().addBox(-3.9394F, -0.7376F, -0.2014F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, 0.0651F, -3.0367F, 0.4281F, 0.7807F, -0.5098F));

		PartDefinition cube_r203 = neck.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(78, 15).mirror().addBox(-2.0715F, 0.1515F, -0.2169F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, 0.0651F, -3.0367F, 0.7226F, 0.5445F, -0.0397F));

		PartDefinition cube_r204 = neck.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(63, 77).mirror().addBox(-2.91F, -0.0899F, -0.4375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0478F, -0.2349F, -1.0367F, 0.73F, 0.3701F, -0.0364F));

		PartDefinition cube_r205 = neck.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(56, 77).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0478F, -0.2349F, -1.0367F, 0.5328F, 0.6254F, -0.4419F));

		PartDefinition cube_r206 = neck.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(90, 17).mirror().addBox(-4.474F, -3.2864F, -0.4161F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0478F, -0.2349F, -1.0367F, 0.1351F, 0.7887F, -1.0415F));

		PartDefinition cube_r207 = neck.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(78, 15).addBox(0.0715F, 0.1515F, -0.2169F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8522F, 0.0651F, -3.0367F, 0.7226F, -0.5445F, 0.0397F));

		PartDefinition cube_r208 = neck.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(77, 76).addBox(1.9394F, -0.7376F, -0.2014F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8522F, 0.0651F, -3.0367F, 0.4281F, -0.7807F, 0.5098F));

		PartDefinition cube_r209 = neck.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(63, 77).addBox(0.91F, -0.0899F, -0.4375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0478F, -0.2349F, -1.0367F, 0.73F, -0.3701F, 0.0364F));

		PartDefinition cube_r210 = neck.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(56, 77).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0478F, -0.2349F, -1.0367F, 0.5328F, -0.6254F, 0.4419F));

		PartDefinition cube_r211 = neck.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(90, 17).addBox(3.474F, -3.2864F, -0.4161F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0478F, -0.2349F, -1.0367F, 0.1351F, -0.7887F, 1.0415F));

		PartDefinition cube_r212 = neck.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(84, 49).addBox(0.5F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7538F, -1.04F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r213 = neck.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(49, 24).addBox(0.0F, 0.1F, 4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Neck1 = neck.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.0126F, -4.0727F, -0.0175F, 0.0873F, -0.0015F));

		PartDefinition cube_r214 = Neck1.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(76, 84).addBox(0.5F, -2.6F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2663F, -0.9102F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r215 = Neck1.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(73, 84).addBox(0.5F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.0226F, -2.8953F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r216 = Neck1.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(78, 22).mirror().addBox(-1.7975F, -0.1326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.4777F, -2.464F, 0.4718F, 0.2617F, -0.6542F));

		PartDefinition cube_r217 = Neck1.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(78, 17).mirror().addBox(-1.7975F, -0.1326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.2777F, -0.264F, 0.5295F, 0.368F, -0.4223F));

		PartDefinition cube_r218 = Neck1.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(78, 22).addBox(-0.2025F, -0.1326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.4777F, -2.464F, 0.4718F, -0.2617F, 0.6542F));

		PartDefinition cube_r219 = Neck1.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(78, 17).addBox(-0.2025F, -0.1326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.2777F, -0.264F, 0.5295F, -0.368F, 0.4223F));

		PartDefinition cube_r220 = Neck1.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(24, 50).addBox(0.0F, 0.1F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -3.9F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7F, -4.2F, 0.0528F, 0.1307F, 0.0069F));

		PartDefinition cube_r221 = Neck2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(82, 84).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5919F, -0.6087F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r222 = Neck2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(79, 84).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.557F, -2.6084F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r223 = Neck2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(78, 26).mirror().addBox(-1.7975F, -0.1326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.0223F, -2.0639F, 0.0963F, -0.042F, -0.6964F));

		PartDefinition cube_r224 = Neck2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(78, 24).mirror().addBox(-1.7975F, -0.1326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.0223F, -0.0639F, 0.264F, 0.0979F, -0.6917F));

		PartDefinition cube_r225 = Neck2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(78, 26).addBox(-0.2025F, -0.1326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.0223F, -2.0639F, 0.0963F, 0.042F, 0.6964F));

		PartDefinition cube_r226 = Neck2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(78, 24).addBox(-0.2025F, -0.1326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.0223F, -0.0639F, 0.264F, -0.0979F, 0.6917F));

		PartDefinition cube_r227 = Neck2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(35, 50).addBox(0.0F, -0.4F, 8.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -11.6F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(15, 36).addBox(-0.5F, -0.5F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(90, 76).addBox(0.0F, -2.4F, -5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 80).addBox(0.0F, -2.4F, -3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 85).addBox(0.0F, -2.7F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0435F, -3.5253F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r228 = Neck3.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(78, 42).mirror().addBox(-1.3975F, -0.1326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1212F, -4.4387F, 0.0291F, -0.0978F, -0.6917F));

		PartDefinition cube_r229 = Neck3.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(36, 78).mirror().addBox(-1.4975F, -0.1326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1212F, -2.4387F, 0.0291F, -0.0978F, -0.6917F));

		PartDefinition cube_r230 = Neck3.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(29, 78).mirror().addBox(-1.5975F, -0.1326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1212F, -0.4387F, 0.0963F, -0.042F, -0.6964F));

		PartDefinition cube_r231 = Neck3.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(78, 42).addBox(-0.6025F, -0.1326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1212F, -4.4387F, 0.0291F, 0.0978F, 0.6917F));

		PartDefinition cube_r232 = Neck3.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(36, 78).addBox(-0.5025F, -0.1326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1212F, -2.4387F, 0.0291F, 0.0978F, 0.6917F));

		PartDefinition cube_r233 = Neck3.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(29, 78).addBox(-0.4025F, -0.1326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1212F, -0.4387F, 0.0963F, 0.042F, 0.6964F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.275F, -6.175F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r234 = Neck4.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(19, 91).addBox(0.0F, -2.4F, 7.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(16, 91).addBox(0.0F, -2.3F, 5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(90, 84).addBox(0.0F, -2.3F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(36, 16).addBox(-0.5F, -0.6F, 2.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.8F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r235 = Neck4.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(90, 26).mirror().addBox(-0.8742F, -0.1961F, -0.5303F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.2962F, -4.2637F, -0.0048F, -0.1256F, -0.6879F));

		PartDefinition cube_r236 = Neck4.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(78, 57).mirror().addBox(-1.1975F, -0.1326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.3962F, -2.2637F, -0.0048F, -0.1256F, -0.6879F));

		PartDefinition cube_r237 = Neck4.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(43, 78).mirror().addBox(-1.2975F, -0.1326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.3962F, -0.2637F, 0.0291F, -0.0978F, -0.6917F));

		PartDefinition cube_r238 = Neck4.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(90, 26).addBox(-0.1258F, -0.1961F, -0.5303F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.2962F, -4.2637F, -0.0048F, 0.1256F, 0.6879F));

		PartDefinition cube_r239 = Neck4.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(78, 57).addBox(-0.8025F, -0.1326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.3962F, -2.2637F, -0.0048F, 0.1256F, 0.6879F));

		PartDefinition cube_r240 = Neck4.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(43, 78).addBox(-0.7025F, -0.1326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.3962F, -0.2637F, 0.0291F, 0.0978F, 0.6917F));

		PartDefinition Neck5 = Neck4.addOrReplaceChild("Neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0724F, -5.7501F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r241 = Neck5.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(91, 42).addBox(0.0F, -2.3F, 7.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(40, 91).addBox(0.0F, -2.1F, 5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(37, 91).addBox(0.0F, -1.8F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(30, 43).addBox(-0.5F, -0.6F, 3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2F, -8.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r242 = Neck5.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(91, 28).mirror().addBox(-0.8742F, -0.1961F, -0.5303F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.0685F, -4.5136F, -0.0048F, -0.1256F, -0.6879F));

		PartDefinition cube_r243 = Neck5.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(91, 3).mirror().addBox(-0.8742F, -0.1961F, -0.5303F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1685F, -2.5136F, -0.0048F, -0.1256F, -0.6879F));

		PartDefinition cube_r244 = Neck5.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(90, 40).mirror().addBox(-0.8742F, -0.1961F, -0.5303F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.2685F, -0.5136F, -0.0048F, -0.1256F, -0.6879F));

		PartDefinition cube_r245 = Neck5.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(91, 28).addBox(-0.1258F, -0.1961F, -0.5303F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.0685F, -4.5136F, -0.0048F, 0.1256F, 0.6879F));

		PartDefinition cube_r246 = Neck5.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(91, 3).addBox(-0.1258F, -0.1961F, -0.5303F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1685F, -2.5136F, -0.0048F, 0.1256F, 0.6879F));

		PartDefinition cube_r247 = Neck5.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(90, 40).addBox(-0.1258F, -0.1961F, -0.5303F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.2685F, -0.5136F, -0.0048F, 0.1256F, 0.6879F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2091F, -4.9458F, 0.0609F, -0.0053F, 0.0871F));

		PartDefinition cube_r248 = Neck6.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(48, 91).addBox(0.0F, -1.625F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(92, 19).addBox(0.0F, -1.425F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(46, 50).addBox(-0.5F, -0.6F, 4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2F, -8.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r249 = Neck6.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(91, 46).mirror().addBox(-0.7975F, -0.1326F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.2777F, -3.5678F, -0.0048F, -0.1256F, -0.6879F));

		PartDefinition cube_r250 = Neck6.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(43, 91).mirror().addBox(-0.6975F, -0.1326F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.2777F, -1.5678F, -0.0048F, -0.1256F, -0.6879F));

		PartDefinition cube_r251 = Neck6.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(91, 46).addBox(-0.2025F, -0.1326F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.2777F, -3.5678F, -0.0048F, 0.1256F, 0.6879F));

		PartDefinition cube_r252 = Neck6.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(43, 91).addBox(-0.3025F, -0.1326F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.2777F, -1.5678F, -0.0048F, 0.1256F, 0.6879F));

		PartDefinition Neck7 = Neck6.addOrReplaceChild("Neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1861F, -3.9187F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r253 = Neck7.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(28, 92).addBox(0.0F, -1.35F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(25, 92).addBox(0.0F, -1.3F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(22, 92).addBox(0.0F, -1.1F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(19, 23).addBox(-0.5F, -0.6F, 1.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2F, -8.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r254 = Neck7.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(61, 91).mirror().addBox(-0.7975F, -0.1326F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.0638F, -5.4491F, -0.0048F, -0.1256F, -0.6879F));

		PartDefinition cube_r255 = Neck7.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(56, 91).mirror().addBox(-0.7975F, -0.1326F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.2638F, -3.4491F, -0.0048F, -0.1256F, -0.6879F));

		PartDefinition cube_r256 = Neck7.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(51, 91).mirror().addBox(-0.7975F, -0.1326F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.2638F, -1.4491F, -0.0048F, -0.1256F, -0.6879F));

		PartDefinition cube_r257 = Neck7.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(61, 91).addBox(-0.2025F, -0.1326F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.0638F, -5.4491F, -0.0048F, 0.1256F, 0.6879F));

		PartDefinition cube_r258 = Neck7.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(56, 91).addBox(-0.2025F, -0.1326F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.2638F, -3.4491F, -0.0048F, 0.1256F, 0.6879F));

		PartDefinition cube_r259 = Neck7.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(51, 91).addBox(-0.2025F, -0.1326F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.2638F, -1.4491F, -0.0048F, 0.1256F, 0.6879F));

		PartDefinition Head = Neck7.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(59, 70).addBox(-0.5F, -0.475F, -2.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offset(0.0F, -0.5324F, -7.1854F));

		PartDefinition cube_r260 = Head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(88, 34).addBox(-0.5F, -0.6F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, -0.151F, -0.2676F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r261 = Head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(88, 31).addBox(-0.5F, -0.15F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.325F, -1.1F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r262 = Head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(84, 7).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.7163F, -4.5729F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r263 = Head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(84, 0).addBox(-0.5F, -0.3F, -1.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(83, 59).addBox(-0.5F, -0.25F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.1436F, -3.5841F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r264 = Head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(66, 70).addBox(-0.5F, -0.15F, -1.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.325F, -1.95F, 0.2793F, 0.0F, 0.0F));

		PartDefinition bone3 = Head.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.7778F, 0.6821F, -3.3824F));

		PartDefinition cube_r265 = bone3.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(35, 71).addBox(-0.7F, -0.65F, -1.675F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.096F, 0.4014F, 0.0F));

		PartDefinition cube_r266 = bone3.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(17, 88).addBox(-0.5F, -0.65F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2058F, 0.015F, 0.0192F, 0.1745F, 0.3491F, 0.0F));

		PartDefinition cube_r267 = bone3.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(87, 65).addBox(-0.5F, -0.5F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(87, 62).addBox(-0.5F, -0.5F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F)), PartPose.offsetAndRotation(-0.044F, -0.1246F, 0.5369F, 0.0611F, 0.3491F, 0.0F));

		PartDefinition cube_r268 = bone3.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(87, 49).addBox(-0.725F, -0.4422F, -1.7665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F))
				.texOffs(87, 19).addBox(-0.725F, -0.4422F, -1.3665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(85, 25).addBox(-0.825F, -0.5422F, -0.7665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5472F, 0.0F, 1.5035F, -0.0262F, 0.3491F, 0.0F));

		PartDefinition cube_r269 = bone3.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(85, 86).addBox(-0.5F, -0.425F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.3916F, -0.558F, 0.4407F, -1.4313F, 0.3311F, -1.0965F));

		PartDefinition cube_r270 = bone3.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(86, 46).addBox(-0.3661F, -0.525F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(86, 43).addBox(-0.475F, -0.525F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1917F, -0.56F, 1.2021F, -1.622F, 0.2249F, -0.9759F));

		PartDefinition cube_r271 = bone3.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(32, 86).addBox(-0.5F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(3, 86).addBox(-0.5F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2363F, -0.5836F, 1.1531F, 0.1233F, 0.2249F, -0.9759F));

		PartDefinition cube_r272 = bone3.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(86, 28).addBox(-0.5F, -0.3F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.0337F, -0.3698F, 1.0405F, -2.0583F, 0.2249F, -0.9759F));

		PartDefinition cube_r273 = bone3.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(27, 86).addBox(-0.5F, -0.575F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-0.1917F, -0.56F, 1.1771F, -1.622F, 0.2249F, -0.9759F));

		PartDefinition cube_r274 = bone3.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(22, 86).addBox(-0.5F, -0.575F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1213F, -0.5785F, 1.4163F, -1.0548F, 0.2249F, -0.9759F));

		PartDefinition cube_r275 = bone3.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(8, 86).addBox(-0.3326F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2261F, -0.6301F, 1.6096F, 0.0502F, -0.4628F, 0.5192F));

		PartDefinition cube_r276 = bone3.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(86, 3).addBox(-0.67F, -0.5F, -0.5404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.2261F, -0.6301F, 1.6096F, 0.045F, 0.0602F, 0.5444F));

		PartDefinition cube_r277 = bone3.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(85, 83).addBox(-0.5F, -0.65F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(0.2729F, -0.3488F, 1.756F, -0.6013F, 0.0692F, -0.9145F));

		PartDefinition cube_r278 = bone3.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(85, 80).addBox(-0.725F, -0.725F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6222F, -0.4059F, 2.2313F, -0.0341F, 0.0692F, -0.9145F));

		PartDefinition cube_r279 = bone3.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(85, 77).addBox(-0.5F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0094F, -0.301F, 1.4705F, 1.1269F, 0.2249F, -0.9759F));

		PartDefinition cube_r280 = bone3.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(85, 74).addBox(-0.875F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4028F, -0.7383F, 0.4952F, -0.1768F, 0.4163F, -1.0416F));

		PartDefinition cube_r281 = bone3.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(85, 71).addBox(-0.85F, -0.15F, -1.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F))
				.texOffs(65, 85).addBox(-0.85F, -0.15F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4278F, -1.0071F, 1.4324F, 0.167F, 0.2249F, -0.9759F));

		PartDefinition cube_r282 = bone3.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(85, 68).addBox(-0.85F, 0.2384F, -0.5863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.4278F, -1.0071F, 1.4324F, -0.313F, 0.2249F, -0.9759F));

		PartDefinition cube_r283 = bone3.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(60, 85).addBox(-0.425F, -0.8F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(55, 85).addBox(-0.425F, -0.8F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2222F, -0.0718F, 3.8894F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r284 = bone3.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(50, 78).addBox(-0.575F, -1.0F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1778F, -0.5341F, 3.3852F, 0.7252F, 0.3567F, -0.5612F));

		PartDefinition cube_r285 = bone3.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(50, 85).addBox(-0.5F, -0.2F, 0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(45, 85).addBox(-0.5F, -0.2F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.2222F, -0.4931F, 3.2275F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r286 = bone3.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(71, 22).addBox(-0.5F, -0.5F, -0.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2222F, -0.1071F, 2.2574F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r287 = bone3.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(85, 40).addBox(-0.5F, -0.475F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2058F, 0.015F, 0.0192F, -0.1745F, 0.3491F, 0.0F));

		PartDefinition cube_r288 = bone3.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(85, 22).addBox(-0.5F, -0.65F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(17, 85).addBox(-0.5F, -0.65F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.221F, 0.467F, 0.7972F, -0.1551F, 0.3016F, -0.4049F));

		PartDefinition cube_r289 = bone3.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(85, 16).addBox(-0.525F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0632F, 0.4041F, 0.3263F, -0.2424F, 0.3016F, -0.4049F));

		PartDefinition cube_r290 = bone3.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(85, 13).addBox(-0.525F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.1674F, 0.3117F, -0.119F, -0.3984F, 0.3F, -0.3496F));

		PartDefinition cube_r291 = bone3.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(85, 10).addBox(-0.4F, -0.575F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(84, 54).addBox(-0.4F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.6432F, 0.35F, -1.0035F, -0.161F, 0.3693F, -0.4228F));

		PartDefinition cube_r292 = bone3.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(71, 15).addBox(-0.7F, -0.5F, -1.675F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.4014F, 0.0F));

		PartDefinition bone4 = Head.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-0.7778F, 0.6821F, -3.3824F));

		PartDefinition cube_r293 = bone4.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(35, 71).mirror().addBox(-0.3F, -0.65F, -1.675F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.096F, -0.4014F, 0.0F));

		PartDefinition cube_r294 = bone4.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(17, 88).mirror().addBox(-0.5F, -0.65F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2058F, 0.015F, 0.0192F, 0.1745F, -0.3491F, 0.0F));

		PartDefinition cube_r295 = bone4.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(87, 65).mirror().addBox(-0.5F, -0.5F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(87, 62).mirror().addBox(-0.5F, -0.5F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F)).mirror(false), PartPose.offsetAndRotation(0.044F, -0.1246F, 0.5369F, 0.0611F, -0.3491F, 0.0F));

		PartDefinition cube_r296 = bone4.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(87, 49).mirror().addBox(-0.275F, -0.4422F, -1.7665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(87, 19).mirror().addBox(-0.275F, -0.4422F, -1.3665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(85, 25).mirror().addBox(-0.175F, -0.5422F, -0.7665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5472F, 0.0F, 1.5035F, -0.0262F, -0.3491F, 0.0F));

		PartDefinition cube_r297 = bone4.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(85, 86).mirror().addBox(-0.5F, -0.425F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.3916F, -0.558F, 0.4407F, -1.4313F, -0.3311F, 1.0965F));

		PartDefinition cube_r298 = bone4.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(86, 46).mirror().addBox(-0.6339F, -0.525F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(86, 43).mirror().addBox(-0.525F, -0.525F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1917F, -0.56F, 1.2021F, -1.622F, -0.2249F, 0.9759F));

		PartDefinition cube_r299 = bone4.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(32, 86).mirror().addBox(-0.5F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(3, 86).mirror().addBox(-0.5F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2363F, -0.5836F, 1.1531F, 0.1233F, -0.2249F, 0.9759F));

		PartDefinition cube_r300 = bone4.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(86, 28).mirror().addBox(-0.5F, -0.3F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.0337F, -0.3698F, 1.0405F, -2.0583F, -0.2249F, 0.9759F));

		PartDefinition cube_r301 = bone4.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(27, 86).mirror().addBox(-0.5F, -0.575F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(0.1917F, -0.56F, 1.1771F, -1.622F, -0.2249F, 0.9759F));

		PartDefinition cube_r302 = bone4.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(22, 86).mirror().addBox(-0.5F, -0.575F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1213F, -0.5785F, 1.4163F, -1.0548F, -0.2249F, 0.9759F));

		PartDefinition cube_r303 = bone4.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(8, 86).mirror().addBox(-0.6674F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2261F, -0.6301F, 1.6096F, 0.0502F, 0.4628F, -0.5192F));

		PartDefinition cube_r304 = bone4.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(86, 3).mirror().addBox(-0.33F, -0.5F, -0.5404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.2261F, -0.6301F, 1.6096F, 0.045F, -0.0602F, -0.5444F));

		PartDefinition cube_r305 = bone4.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(85, 83).mirror().addBox(-0.5F, -0.65F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(-0.2729F, -0.3488F, 1.756F, -0.6013F, -0.0692F, 0.9145F));

		PartDefinition cube_r306 = bone4.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(85, 80).mirror().addBox(-0.275F, -0.725F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6222F, -0.4059F, 2.2313F, -0.0341F, -0.0692F, 0.9145F));

		PartDefinition cube_r307 = bone4.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(85, 77).mirror().addBox(-0.5F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0094F, -0.301F, 1.4705F, 1.1269F, -0.2249F, 0.9759F));

		PartDefinition cube_r308 = bone4.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(85, 74).mirror().addBox(-0.125F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.4028F, -0.7383F, 0.4952F, -0.1768F, -0.4163F, 1.0416F));

		PartDefinition cube_r309 = bone4.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(85, 71).mirror().addBox(-0.15F, -0.15F, -1.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false)
				.texOffs(65, 85).mirror().addBox(-0.15F, -0.15F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.4278F, -1.0071F, 1.4324F, 0.167F, -0.2249F, 0.9759F));

		PartDefinition cube_r310 = bone4.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(85, 68).mirror().addBox(-0.15F, 0.2384F, -0.5863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.4278F, -1.0071F, 1.4324F, -0.313F, -0.2249F, 0.9759F));

		PartDefinition cube_r311 = bone4.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(60, 85).mirror().addBox(-0.575F, -0.8F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(55, 85).mirror().addBox(-0.575F, -0.8F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.2222F, -0.0718F, 3.8894F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r312 = bone4.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(50, 78).mirror().addBox(-0.425F, -1.0F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1778F, -0.5341F, 3.3852F, 0.7252F, -0.3567F, 0.5612F));

		PartDefinition cube_r313 = bone4.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(50, 85).mirror().addBox(-0.5F, -0.2F, 0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(45, 85).mirror().addBox(-0.5F, -0.2F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.2222F, -0.4931F, 3.2275F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r314 = bone4.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(71, 22).mirror().addBox(-0.5F, -0.5F, -0.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2222F, -0.1071F, 2.2574F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r315 = bone4.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(85, 40).mirror().addBox(-0.5F, -0.475F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2058F, 0.015F, 0.0192F, -0.1745F, -0.3491F, 0.0F));

		PartDefinition cube_r316 = bone4.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(85, 22).mirror().addBox(-0.5F, -0.65F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(17, 85).mirror().addBox(-0.5F, -0.65F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.221F, 0.467F, 0.7972F, -0.1551F, -0.3016F, 0.4049F));

		PartDefinition cube_r317 = bone4.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(85, 16).mirror().addBox(-0.475F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.0632F, 0.4041F, 0.3263F, -0.2424F, -0.3016F, 0.4049F));

		PartDefinition cube_r318 = bone4.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(85, 13).mirror().addBox(-0.475F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.1674F, 0.3117F, -0.119F, -0.3984F, -0.3F, 0.3496F));

		PartDefinition cube_r319 = bone4.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(85, 10).mirror().addBox(-0.6F, -0.575F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(84, 54).mirror().addBox(-0.6F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.6432F, 0.35F, -1.0035F, -0.161F, -0.3693F, 0.4228F));

		PartDefinition cube_r320 = bone4.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(71, 15).mirror().addBox(-0.3F, -0.5F, -1.675F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.309F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.4014F, 0.0F));

		PartDefinition Lowerjaw = Head.addOrReplaceChild("Lowerjaw", CubeListBuilder.create().texOffs(9, 61).addBox(0.5F, -0.3F, -1.625F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F))
				.texOffs(9, 61).mirror().addBox(-1.5F, -0.3F, -1.625F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0773F, 0.7917F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r321 = Lowerjaw.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(71, 57).mirror().addBox(-2.5F, -0.85F, -0.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(71, 57).addBox(-0.5F, -0.85F, -0.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.0F, 0.7333F, -1.3636F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r322 = Lowerjaw.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(77, 89).mirror().addBox(-0.3F, -0.9409F, -1.2502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.8879F, -2.5423F, 0.1396F, -0.3054F, 0.0F));

		PartDefinition cube_r323 = Lowerjaw.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(72, 89).mirror().addBox(-0.3F, -0.8529F, -1.681F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.8879F, -2.5423F, 0.0524F, -0.3054F, 0.0F));

		PartDefinition cube_r324 = Lowerjaw.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(67, 89).mirror().addBox(-0.2755F, -0.729F, -1.1021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.8879F, -3.8923F, -0.0873F, -0.4276F, 0.0F));

		PartDefinition cube_r325 = Lowerjaw.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(89, 52).mirror().addBox(-0.2755F, -0.7624F, -0.6632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.8879F, -3.8923F, 0.0F, -0.4276F, 0.0F));

		PartDefinition cube_r326 = Lowerjaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(32, 89).mirror().addBox(-0.425F, -0.475F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(27, 89).mirror().addBox(-0.425F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.21F, 0.2222F, -2.3725F, 0.1556F, 0.0338F, -0.3461F));

		PartDefinition cube_r327 = Lowerjaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(22, 89).mirror().addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.0808F, 0.2554F, -2.855F, 0.1613F, -0.2679F, -0.3944F));

		PartDefinition cube_r328 = Lowerjaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(8, 89).mirror().addBox(-0.45F, -0.475F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(89, 6).mirror().addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.7917F, 0.2824F, -3.8135F, 0.1634F, -0.3109F, -0.4017F));

		PartDefinition cube_r329 = Lowerjaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(3, 89).mirror().addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.6077F, 0.2936F, -4.2843F, 0.1757F, -0.483F, -0.4336F));

		PartDefinition cube_r330 = Lowerjaw.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(89, 0).mirror().addBox(-0.6F, -0.575F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(62, 88).mirror().addBox(-0.6F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.0913F, 0.0903F, -5.1255F, -0.0424F, -0.483F, -0.4336F));

		PartDefinition cube_r331 = Lowerjaw.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(42, 71).mirror().addBox(-0.2755F, -0.6103F, -2.1034F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.8879F, -3.8923F, -0.2356F, -0.4276F, 0.0F));

		PartDefinition cube_r332 = Lowerjaw.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(88, 57).mirror().addBox(-0.2755F, -0.6637F, -0.7117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.8879F, -3.8923F, -0.1047F, -0.4276F, 0.0F));

		PartDefinition cube_r333 = Lowerjaw.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(57, 88).mirror().addBox(-0.3F, -0.6155F, -1.7212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.8879F, -2.5423F, -0.0349F, -0.3054F, 0.0F));

		PartDefinition cube_r334 = Lowerjaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(52, 88).mirror().addBox(-0.3F, -0.669F, -1.3242F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.8879F, -2.5423F, 0.0175F, -0.3054F, 0.0F));

		PartDefinition cube_r335 = Lowerjaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(47, 88).mirror().addBox(-0.2F, -0.8017F, -0.8249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.8879F, -2.5423F, 0.0698F, -0.3054F, 0.0F));

		PartDefinition cube_r336 = Lowerjaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(42, 88).mirror().addBox(-0.5F, -0.8F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(88, 37).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(42, 88).addBox(1.5F, -0.8F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(88, 37).addBox(1.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.0F, 0.6795F, -1.3856F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r337 = Lowerjaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(37, 88).mirror().addBox(-2.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(37, 88).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -0.1F, -1.425F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r338 = Lowerjaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(77, 89).addBox(-0.7F, -0.9409F, -1.2502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(1.3F, 0.8879F, -2.5423F, 0.1396F, 0.3054F, 0.0F));

		PartDefinition cube_r339 = Lowerjaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(72, 89).addBox(-0.7F, -0.8529F, -1.681F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3F, 0.8879F, -2.5423F, 0.0524F, 0.3054F, 0.0F));

		PartDefinition cube_r340 = Lowerjaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(67, 89).addBox(-0.7245F, -0.729F, -1.1021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9F, 0.8879F, -3.8923F, -0.0873F, 0.4276F, 0.0F));

		PartDefinition cube_r341 = Lowerjaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(89, 52).addBox(-0.7245F, -0.7624F, -0.6632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.9F, 0.8879F, -3.8923F, 0.0F, 0.4276F, 0.0F));

		PartDefinition cube_r342 = Lowerjaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(32, 89).addBox(-0.575F, -0.475F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(27, 89).addBox(-0.575F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.21F, 0.2222F, -2.3725F, 0.1556F, -0.0338F, 0.3461F));

		PartDefinition cube_r343 = Lowerjaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(22, 89).addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.0808F, 0.2554F, -2.855F, 0.1613F, 0.2679F, 0.3944F));

		PartDefinition cube_r344 = Lowerjaw.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(8, 89).addBox(-0.55F, -0.475F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(89, 6).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.7917F, 0.2824F, -3.8135F, 0.1634F, 0.3109F, 0.4017F));

		PartDefinition cube_r345 = Lowerjaw.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(3, 89).addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.6077F, 0.2936F, -4.2843F, 0.1757F, 0.483F, 0.4336F));

		PartDefinition cube_r346 = Lowerjaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(89, 0).addBox(-0.4F, -0.575F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(62, 88).addBox(-0.4F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0913F, 0.0903F, -5.1255F, -0.0424F, 0.483F, 0.4336F));

		PartDefinition cube_r347 = Lowerjaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(42, 71).addBox(-0.7245F, -0.6103F, -2.1034F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.9F, 0.8879F, -3.8923F, -0.2356F, 0.4276F, 0.0F));

		PartDefinition cube_r348 = Lowerjaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(88, 57).addBox(-0.7245F, -0.6637F, -0.7117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)), PartPose.offsetAndRotation(0.9F, 0.8879F, -3.8923F, -0.1047F, 0.4276F, 0.0F));

		PartDefinition cube_r349 = Lowerjaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(57, 88).addBox(-0.7F, -0.6155F, -1.7212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(1.3F, 0.8879F, -2.5423F, -0.0349F, 0.3054F, 0.0F));

		PartDefinition cube_r350 = Lowerjaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(52, 88).addBox(-0.7F, -0.669F, -1.3242F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(1.3F, 0.8879F, -2.5423F, 0.0175F, 0.3054F, 0.0F));

		PartDefinition cube_r351 = Lowerjaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(47, 88).addBox(-0.8F, -0.8017F, -0.8249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(1.3F, 0.8879F, -2.5423F, 0.0698F, 0.3054F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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