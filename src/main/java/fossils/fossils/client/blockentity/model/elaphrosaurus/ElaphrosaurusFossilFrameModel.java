package fossils.fossils.client.blockentity.model.elaphrosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ElaphrosaurusFossilFrameModel extends SkullModelBase {
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

	public ElaphrosaurusFossilFrameModel(ModelPart root) {
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -32.0F, 1.4F, 1.0F, 32.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -8.75F, -0.5F, 1.0F, 35.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(2.3F, -26.25F, -20.8F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(4.15F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.3F, -26.25F, -20.8F, 0.3054F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-0.2F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -31.7F, 1.9F, 0.0F, 0.0F, -1.6144F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -8.72F, 1.0F, -0.1562F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(6, 31).addBox(-0.5F, 0.2F, 9.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 24).addBox(-0.5F, 0.2F, 1.7F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4F, -5.9F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -4.0F, -0.0134F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(17, 48).addBox(-0.5F, 0.2F, 5.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6619F, -10.7266F, -0.0698F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.2504F, -4.8608F, 0.0704F, -0.1306F, -0.0092F));

		PartDefinition Bodymiddle_r2 = body.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(0, 49).addBox(-0.5F, 0.2F, 1.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.4114F, -5.8658F, -0.0698F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(51, 40).addBox(-2.4531F, 0.3463F, -3.9651F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(53, 42).addBox(-2.4531F, 0.3463F, -0.2651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offset(1.4531F, -0.4804F, -5.0607F));

		PartDefinition Bodyfront = body2.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(30, 50).addBox(-0.5F, 0.1F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.9531F, 0.2309F, -3.7428F, 0.151F, -0.1294F, -0.0196F));

		PartDefinition Neckbase = Bodyfront.addOrReplaceChild("Neckbase", CubeListBuilder.create().texOffs(13, 55).addBox(-0.5F, 0.1275F, -4.1378F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(16, 58).addBox(-0.5F, 0.1275F, -0.4378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.097F, -0.0671F, -0.1306F, 0.0087F));

		PartDefinition Neckmiddlebase = Neckbase.addOrReplaceChild("Neckmiddlebase", CubeListBuilder.create().texOffs(61, 0).addBox(-0.5F, 0.3297F, -3.3737F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(63, 2).addBox(-0.5F, 0.3297F, -0.6737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1575F, -3.6441F, -0.4571F, -0.0549F, -0.0713F));

		PartDefinition Neckmiddlefront = Neckmiddlebase.addOrReplaceChild("Neckmiddlefront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.067F, -3.1102F, -0.3875F, -0.1305F, 0.0107F));

		PartDefinition Neckmiddlefront_r1 = Neckmiddlefront.addOrReplaceChild("Neckmiddlefront_r1", CubeListBuilder.create().texOffs(59, 61).addBox(-0.5F, 0.1275F, 5.2084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(57, 59).addBox(-0.5F, 0.1275F, 2.5084F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4295F, -5.5842F, -0.096F, 0.0F, 0.0F));

		PartDefinition Neckfront = Neckmiddlefront.addOrReplaceChild("Neckfront", CubeListBuilder.create().texOffs(57, 54).addBox(-0.49F, 0.1617F, -2.794F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.01F, -0.1039F, -2.6035F, -0.5198F, -0.1266F, 0.0333F));

		PartDefinition Neckfront2 = Neckfront.addOrReplaceChild("Neckfront2", CubeListBuilder.create().texOffs(59, 6).addBox(-0.49F, 0.1617F, -3.194F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(61, 8).addBox(-0.49F, 0.1617F, -0.494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0314F, -2.886F, -0.125F, 0.0F, 0.0F));

		PartDefinition Neckfront3 = Neckfront2.addOrReplaceChild("Neckfront3", CubeListBuilder.create().texOffs(35, 57).addBox(-0.49F, 0.1617F, -1.794F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0322F, -2.8158F, -0.1945F, -0.0959F, -0.2478F));

		PartDefinition Neckfront4 = Neckfront3.addOrReplaceChild("Neckfront4", CubeListBuilder.create().texOffs(59, 11).addBox(-0.49F, 0.1617F, -2.694F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0398F, -1.8464F, 0.3587F, 0.1586F, 0.0832F));

		PartDefinition Neckfront5 = Neckfront4.addOrReplaceChild("Neckfront5", CubeListBuilder.create().texOffs(68, 18).addBox(-0.49F, 0.1617F, -1.894F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0488F, -2.6921F, 0.355F, 0.0F, 0.0F));

		PartDefinition Neckfront_r1 = Neckfront5.addOrReplaceChild("Neckfront_r1", CubeListBuilder.create().texOffs(87, 28).addBox(-0.5F, 0.7F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.01F, -0.5383F, -1.894F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Head = Neckfront5.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 0.1782F, -2.4142F, 0.3958F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase = Head.addOrReplaceChild("Lowerjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2729F, -0.2089F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5F, -0.8557F, -1.8367F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5F, -0.8557F, -1.8367F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4041F, 4.1954F, -4.9892F, 0.2528F, -0.5301F, -0.6749F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1174F, 5.9587F, -0.1377F, -1.1324F, -0.6093F, -0.105F));

		PartDefinition Righthand = Rightlowerarm.addOrReplaceChild("Righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3761F, 2.5659F, -0.1435F, 0.0599F, -0.0218F, 0.6244F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4041F, 4.1954F, -4.9892F, -0.1663F, 0.4469F, 0.6515F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1174F, 5.9587F, -0.1377F, -0.9981F, -0.0587F, -0.2291F));

		PartDefinition Lefthand = Leftlowerarm.addOrReplaceChild("Lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3761F, 2.5659F, -0.1435F, 0.0627F, 0.0111F, -0.4501F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(3.0F, 2.8844F, -5.7808F));

		PartDefinition bone4 = Bodyfront.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-3.0F, 2.8844F, -5.7808F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1872F, 3.8984F, -0.1373F, 0.0432F, -0.006F));

		PartDefinition Tailbase_r1 = Tailbase.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(23, 21).addBox(-0.5F, 0.2F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1007F, 0.2831F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6078F, 8.0702F, 0.1787F, 0.2868F, 0.1383F));

		PartDefinition Tailmiddlebase_r1 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(30, 18).addBox(-0.5F, 0.2F, 7.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(23, 11).addBox(-0.5F, 0.2F, -0.3F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2831F, -0.0986F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Tailmiddle = Tailmiddlebase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0222F, 7.9698F, 0.0336F, 0.0872F, 0.0029F));

		PartDefinition Tailmiddle_r1 = Tailmiddle.addOrReplaceChild("Tailmiddle_r1", CubeListBuilder.create().texOffs(38, 31).addBox(-0.5F, 0.1F, 0.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2652F, -0.1284F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = Tailmiddle.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, 0.1F, -0.2F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0227F, 6.8731F, -0.075F, 0.1741F, -0.013F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.2444F, -0.2967F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1498F, 9.8048F, -0.1322F, 0.1298F, -0.0172F));

		PartDefinition Tailend2 = Tailend.addOrReplaceChild("Tailend2", CubeListBuilder.create().texOffs(42, 18).addBox(-0.5F, 0.2444F, -0.4967F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(47, 23).addBox(-0.5F, 0.2444F, 5.2033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0168F, 9.8826F, -0.0995F, -0.2606F, 0.0257F));

		PartDefinition Tailend3 = Tailend2.addOrReplaceChild("Tailend3", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, 0.2444F, -0.0967F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0191F, 5.9256F, -0.1794F, -0.387F, 0.0683F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3F, 0.7993F, 0.3828F, 0.1758F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 11.0F, -1.5F, 0.8017F, -0.158F, 0.1511F));

		PartDefinition Rightankle = Rightshin.addOrReplaceChild("Rightankle", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 14.2593F, -0.4937F, -0.7623F, -0.0907F, -0.0945F));

		PartDefinition Rightfoot = Rightankle.addOrReplaceChild("Rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.7242F, -0.0177F, 0.6286F, 0.1825F, -0.0295F));

		PartDefinition Righttoes = Rightfoot.addOrReplaceChild("Righttoes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.01F, -2.5F, -0.6545F, 0.0F, 0.0F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3F, 0.7993F, 0.3828F, -0.6096F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 11.0F, -1.5F, 0.9864F, 0.052F, -0.0701F));

		PartDefinition Leftankle = Leftshin.addOrReplaceChild("Leftankle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 14.2593F, -0.4937F, -1.3132F, -0.0691F, 0.1393F));

		PartDefinition Leftfoot = Leftankle.addOrReplaceChild("Leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.7242F, -0.0177F, 2.1904F, 0.0527F, 0.0327F));

		PartDefinition Lefttoes = Leftfoot.addOrReplaceChild("Lefttoes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.01F, -2.5F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, 2.3692F, 0.4188F, 0.0F, 0.0F, -0.1222F));

		PartDefinition bone3 = Hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, 2.3692F, 0.4188F, 0.0F, 0.0F, 0.1222F));

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