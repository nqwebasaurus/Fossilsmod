package fossils.fossils.client.blockentity.model.berthasaura;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BerthasauraFossilFrameModel extends SkullModelBase {
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

	public BerthasauraFossilFrameModel(ModelPart root) {
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -30.0F, -1.6F, 1.0F, 30.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(2, 1).addBox(1.575F, -27.7F, -21.8F, 1.0F, 28.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.9F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.2F, -23.1F, -21.3F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-5.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -21.5F, -1.1F, 0.0F, 0.0F, 1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.289F, -0.4366F, 0.0183F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(23, 10).addBox(-0.5F, 0.225F, 1.8F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4F, -5.9F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -4.0F, 0.0393F, -0.1308F, -0.0051F));

		PartDefinition cube_r4 = Bodymiddle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(36, 47).addBox(-0.5F, 0.2F, 6.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6619F, -10.7266F, -0.0698F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.2504F, -4.8608F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(19, 52).addBox(-0.5F, 0.225F, 5.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(15, 48).addBox(-0.5F, 0.225F, 0.55F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.4114F, -5.8658F, -0.0698F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(55, 28).addBox(-2.4531F, 0.3463F, -3.9901F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4531F, -0.4804F, -5.0607F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body2.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(49, 47).addBox(-0.5F, 0.1F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.9531F, 0.2309F, -3.7428F, 0.1499F, 0.0431F, 0.0065F));

		PartDefinition Neckbase = Bodyfront.addOrReplaceChild("Neckbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -5.097F, -0.3283F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Neckbase.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(79, 1).addBox(-0.85F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3465F, 0.9775F, -0.0932F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Neckbase.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(78, 0).addBox(-0.5F, -0.5F, -1.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6275F, -0.0378F, 0.0F, 0.0873F, 0.0F));

		PartDefinition Neckmiddlebase = Neckbase.addOrReplaceChild("Neckmiddlebase", CubeListBuilder.create().texOffs(77, 76).addBox(-0.475F, 0.3297F, -1.7987F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1341F, -1.541F, -0.2073F, 0.2827F, 0.1374F));

		PartDefinition Neckmiddlefront = Neckmiddlebase.addOrReplaceChild("Neckmiddlefront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4561F, -1.9237F, -0.0813F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Neckmiddlefront.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(80, 72).addBox(-0.5F, -0.825F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0029F, 0.6605F, -0.3533F, -0.0088F, 0.0347F, -0.0033F));

		PartDefinition cube_r9 = Neckmiddlefront.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(79, 71).addBox(-0.5F, -0.5F, -1.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.025F, 0.2603F, -1.118F, -0.0961F, 0.0347F, -0.0033F));

		PartDefinition Neckfront = Neckmiddlefront.addOrReplaceChild("Neckfront", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -1.0102F, -1.7894F, -0.2823F, 0.1336F, 0.1423F));

		PartDefinition cube_r10 = Neckfront.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(81, 13).addBox(-0.5F, -0.5F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(80, 12).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.015F, 1.2117F, -2.094F, 0.0F, 0.0698F, 0.0F));

		PartDefinition Neckfront2 = Neckfront.addOrReplaceChild("Neckfront2", CubeListBuilder.create().texOffs(79, 67).addBox(-0.49F, 0.6617F, -1.994F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.038F, -2.0003F, 0.05F, 0.1307F, 0.0065F));

		PartDefinition Neckfront3 = Neckfront2.addOrReplaceChild("Neckfront3", CubeListBuilder.create().texOffs(9, 61).addBox(-0.49F, 0.6867F, -3.019F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0183F, -1.9672F, 0.3114F, 0.0F, 0.0F));

		PartDefinition Head = Neckfront3.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 0.3198F, -2.0955F, 0.2855F, 0.2993F, -0.095F));

		PartDefinition Lowerjawbase = Head.addOrReplaceChild("Lowerjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.994F, -0.0371F, 0.5236F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0274F, 2.4301F, -8.1142F, -0.0037F, 0.0522F, -0.0699F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0274F, 2.4301F, -8.1142F, -0.0037F, -0.0522F, 0.0699F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3562F, 3.8299F, -6.0207F, 0.7732F, 0.2326F, -0.0247F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1597F, 6.5657F, -0.3372F, -0.8633F, -0.1247F, 0.1106F));

		PartDefinition Righthand = Rightlowerarm.addOrReplaceChild("Righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3761F, 2.5659F, -0.1435F, 0.0637F, 0.0F, 0.2759F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3562F, 3.8299F, -6.0207F, 1.1223F, -0.2326F, 0.0247F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1597F, 6.5657F, -0.3372F, -0.8633F, 0.1247F, -0.1106F));

		PartDefinition Lefthand = Leftlowerarm.addOrReplaceChild("Lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3761F, 2.5659F, -0.1435F, 0.0637F, 0.0F, -0.2759F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(3.0F, 3.3844F, -6.0808F));

		PartDefinition bone4 = Bodyfront.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-3.0F, 3.3844F, -6.0808F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1872F, 3.8984F, -0.1588F, -0.0794F, 0.0567F));

		PartDefinition cube_r11 = Tailbase.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(23, 20).addBox(-0.5F, 0.275F, -0.525F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1007F, 0.283F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Tailbase.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(30, 27).addBox(-0.85F, -0.825F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.8159F, 7.6556F, 0.053F, -0.1569F, -0.0083F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6078F, 8.0702F, 0.0408F, -0.1348F, 0.0811F));

		PartDefinition cube_r13 = Tailmiddlebase.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, 0.3F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2831F, -0.0986F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Tailmiddle = Tailmiddlebase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0222F, 7.9699F, 0.0837F, -0.2347F, 0.1514F));

		PartDefinition cube_r14 = Tailmiddle.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(25, 45).addBox(-0.45F, 0.1F, 6.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(19, 39).addBox(-0.45F, 0.1F, -0.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2652F, -0.1284F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = Tailmiddle.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(0, 12).addBox(-0.45F, 0.1F, -0.2F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0227F, 6.8731F, 0.0136F, -0.1745F, -0.0024F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(0, 0).addBox(-0.45F, 0.2444F, -0.2967F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1498F, 9.8048F, -0.1773F, -0.1718F, 0.0306F));

		PartDefinition Tailend2 = Tailend.addOrReplaceChild("Tailend2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0168F, 9.8826F, -0.2918F, 0.3777F, -0.1103F));

		PartDefinition cube_r15 = Tailend2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(42, 0).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, 0.7444F, -0.1217F, 0.0F, -0.0175F, 0.0F));

		PartDefinition Tailend3 = Tailend2.addOrReplaceChild("Tailend3", CubeListBuilder.create().texOffs(38, 30).addBox(-0.375F, 0.3194F, -0.6967F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0191F, 5.9255F, -0.1717F, 0.2581F, -0.0442F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3F, 3.6587F, -0.6761F, 0.2194F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 11.3308F, -4.0215F, 0.8311F, 0.0F, 0.0F));

		PartDefinition Rightankle = Rightshin.addOrReplaceChild("Rightankle", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 12.9094F, -0.1655F, -0.7229F, 0.0F, 0.0F));

		PartDefinition Rightfoot = Rightankle.addOrReplaceChild("Rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.9801F, 0.0722F, 0.23F, 0.0F, 0.0F));

		PartDefinition Righttoes = Rightfoot.addOrReplaceChild("Righttoes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.01F, -2.5F, -0.48F, 0.0F, 0.0F));

		PartDefinition Righttoes2 = Rightankle.addOrReplaceChild("Righttoes2", CubeListBuilder.create(), PartPose.offset(-0.9F, 0.2435F, 0.356F));

		PartDefinition Righttoes3 = Righttoes2.addOrReplaceChild("Righttoes3", CubeListBuilder.create(), PartPose.offset(-0.1659F, 3.8015F, 0.0322F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3F, 3.6587F, -0.6761F, -0.5224F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 11.3308F, -4.0215F, 0.8271F, 0.0752F, -0.1073F));

		PartDefinition Leftankle = Leftshin.addOrReplaceChild("Leftankle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 12.9094F, -0.1655F, -0.9837F, -0.0186F, 0.016F));

		PartDefinition Leftfoot = Leftankle.addOrReplaceChild("Leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.9801F, 0.0722F, 0.9185F, -0.0665F, 0.124F));

		PartDefinition Lefttoes = Leftfoot.addOrReplaceChild("Lefttoes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.01F, -2.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Lefttoes2 = Leftankle.addOrReplaceChild("Lefttoes2", CubeListBuilder.create(), PartPose.offset(0.9F, 0.2435F, 0.356F));

		PartDefinition Lefttoes3 = Lefttoes2.addOrReplaceChild("Lefttoes3", CubeListBuilder.create(), PartPose.offset(0.1659F, 3.8015F, 0.0322F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8813F, 3.8336F, -0.7812F, 0.0F, 0.0F, -0.1222F));

		PartDefinition bone3 = Hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8813F, 7.583F, -0.8499F, 0.0F, 0.0F, 0.1222F));

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