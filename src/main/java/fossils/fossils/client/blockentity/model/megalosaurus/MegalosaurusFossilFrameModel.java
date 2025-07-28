package fossils.fossils.client.blockentity.model.megalosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MegalosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Hips;
	private final ModelPart Leftleg1;
	private final ModelPart Leftleg2;
	private final ModelPart Leftleg3;
	private final ModelPart Leftleg4;
	private final ModelPart Leftleg5;
	private final ModelPart Rightleg1;
	private final ModelPart Rightleg2;
	private final ModelPart Rightleg3;
	private final ModelPart Rightleg4;
	private final ModelPart Rightleg5;
	private final ModelPart bone3;
	private final ModelPart bone5;
	private final ModelPart Bodymiddle;
	private final ModelPart body;
	private final ModelPart Bodyfront;
	private final ModelPart Leftarm1;
	private final ModelPart Leftarm2;
	private final ModelPart Leftarm3;
	private final ModelPart Rightarm1;
	private final ModelPart Rightarm2;
	private final ModelPart Rightarm3;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart Neck1;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart Neck5;
	private final ModelPart Neck6;
	private final ModelPart Neck7;
	private final ModelPart Head;
	private final ModelPart bone;
	private final ModelPart leftFace2;
	private final ModelPart rightFace2;
	private final ModelPart Upperjaw;
	private final ModelPart leftFace;
	private final ModelPart Lowerjaw;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;
	private final ModelPart Tail8;
	private final ModelPart Tail9;

	public MegalosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Hips = this.fossil.getChild("Hips");
		this.Leftleg1 = this.Hips.getChild("Leftleg1");
		this.Leftleg2 = this.Leftleg1.getChild("Leftleg2");
		this.Leftleg3 = this.Leftleg2.getChild("Leftleg3");
		this.Leftleg4 = this.Leftleg3.getChild("Leftleg4");
		this.Leftleg5 = this.Leftleg4.getChild("Leftleg5");
		this.Rightleg1 = this.Hips.getChild("Rightleg1");
		this.Rightleg2 = this.Rightleg1.getChild("Rightleg2");
		this.Rightleg3 = this.Rightleg2.getChild("Rightleg3");
		this.Rightleg4 = this.Rightleg3.getChild("Rightleg4");
		this.Rightleg5 = this.Rightleg4.getChild("Rightleg5");
		this.bone3 = this.Hips.getChild("bone3");
		this.bone5 = this.Hips.getChild("bone5");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body = this.Bodymiddle.getChild("body");
		this.Bodyfront = this.body.getChild("Bodyfront");
		this.Leftarm1 = this.Bodyfront.getChild("Leftarm1");
		this.Leftarm2 = this.Leftarm1.getChild("Leftarm2");
		this.Leftarm3 = this.Leftarm2.getChild("Leftarm3");
		this.Rightarm1 = this.Bodyfront.getChild("Rightarm1");
		this.Rightarm2 = this.Rightarm1.getChild("Rightarm2");
		this.Rightarm3 = this.Rightarm2.getChild("Rightarm3");
		this.bone2 = this.Bodyfront.getChild("bone2");
		this.bone4 = this.Bodyfront.getChild("bone4");
		this.Neck1 = this.Bodyfront.getChild("Neck1");
		this.Neck2 = this.Neck1.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.Neck5 = this.Neck4.getChild("Neck5");
		this.Neck6 = this.Neck5.getChild("Neck6");
		this.Neck7 = this.Neck6.getChild("Neck7");
		this.Head = this.Neck7.getChild("Head");
		this.bone = this.Head.getChild("bone");
		this.leftFace2 = this.Head.getChild("leftFace2");
		this.rightFace2 = this.Head.getChild("rightFace2");
		this.Upperjaw = this.Head.getChild("Upperjaw");
		this.leftFace = this.Upperjaw.getChild("leftFace");
		this.Lowerjaw = this.Head.getChild("Lowerjaw");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.Tail8 = this.Tail7.getChild("Tail8");
		this.Tail9 = this.Tail8.getChild("Tail9");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -40.0F, 2.5F, 1.0F, 40.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-2.7F, -6.5F, -0.5F, 1.0F, 35.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.5F, -28.5F, -26.6F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(3.5F, -2.5F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -28.5F, -26.6F, 0.1309F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-6.3F, -3.5F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -32.5F, 3.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Hips = fossil.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -40.35F, 3.1F, 0.0663F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(1, 0).addBox(-0.5F, -0.6F, 1.0F, 1.0F, 2.0F, 14.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2991F, -8.1287F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Leftleg1 = Hips.addOrReplaceChild("Leftleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.9F, 1.9F, -0.2409F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Leftleg2 = Leftleg1.addOrReplaceChild("Leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 17.5271F, 1.5181F, 0.7418F, 0.0F, 0.0F));

		PartDefinition Leftleg3 = Leftleg2.addOrReplaceChild("Leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1F, 16.3182F, -0.0942F, -0.7418F, 0.0F, 0.0F));

		PartDefinition Leftleg4 = Leftleg3.addOrReplaceChild("Leftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 6.0273F, -0.7125F, 0.6981F, 0.0F, 0.0F));

		PartDefinition Leftleg5 = Leftleg4.addOrReplaceChild("Leftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, -0.6545F, 0.0F, 0.0F));

		PartDefinition Rightleg1 = Hips.addOrReplaceChild("Rightleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9F, 1.9F, -0.2409F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Rightleg2 = Rightleg1.addOrReplaceChild("Rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 17.5271F, 1.5181F, 0.829F, 0.0F, 0.0F));

		PartDefinition Rightleg3 = Rightleg2.addOrReplaceChild("Rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1F, 16.3182F, -0.0942F, -0.7418F, 0.0F, 0.0F));

		PartDefinition Rightleg4 = Rightleg3.addOrReplaceChild("Rightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6F, 6.0273F, -0.7125F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Rightleg5 = Rightleg4.addOrReplaceChild("Rightleg5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.5F));

		PartDefinition bone3 = Hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(2.0484F, 1.6314F, 1.565F));

		PartDefinition bone5 = Hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-2.0484F, 1.6314F, 1.565F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(32, 47).addBox(-0.5F, -0.2975F, -9.8917F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.0009F, -7.1287F, 0.0384F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(1, 77).addBox(-0.5F, 0.4F, -6.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6975F, -9.6917F, 0.1314F, 0.0865F, 0.0114F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, -7.15F, 0.1438F, 0.0868F, 0.0087F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(22, 60).addBox(-0.5F, -0.6208F, 4.864F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.3274F, -12.7291F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Leftarm1 = Bodyfront.addOrReplaceChild("Leftarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9421F, 9.7126F, -10.3193F, 0.4813F, 0.2264F, -0.1688F));

		PartDefinition Leftarm2 = Leftarm1.addOrReplaceChild("Leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.023F, 5.9669F, 0.6822F, -1.0036F, 0.0F, 0.0F));

		PartDefinition Leftarm3 = Leftarm2.addOrReplaceChild("Leftarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5433F, 4.0048F, 0.5F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Rightarm1 = Bodyfront.addOrReplaceChild("Rightarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9421F, 9.7126F, -10.3193F, 0.0886F, -0.2264F, 0.1688F));

		PartDefinition Rightarm2 = Rightarm1.addOrReplaceChild("Rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.023F, 5.9669F, 0.6822F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Rightarm3 = Rightarm2.addOrReplaceChild("Rightarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5433F, 4.0048F, 0.5F, 0.0F, 0.0F, -0.2182F));

		PartDefinition bone2 = Bodyfront.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(4.5F, 3.1534F, -2.4243F));

		PartDefinition bone4 = Bodyfront.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-4.5F, 3.1534F, -2.4243F));

		PartDefinition Neck1 = Bodyfront.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2124F, -7.9894F, -0.2303F, 0.042F, -0.0118F));

		PartDefinition Neckbase_r1 = Neck1.addOrReplaceChild("Neckbase_r1", CubeListBuilder.create().texOffs(59, 86).addBox(-0.5F, -0.2F, -0.3F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.3859F, -4.4563F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6859F, -4.1563F, 0.0709F, 0.0F, 0.0F));

		PartDefinition Neckmiddlebase_r1 = Neck2.addOrReplaceChild("Neckmiddlebase_r1", CubeListBuilder.create().texOffs(97, 48).addBox(-0.5F, 0.0F, 1.9F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.1243F, -6.363F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3583F, -4.3379F, -0.222F, -0.0744F, 0.0128F));

		PartDefinition Neckmiddlefront_r1 = Neck3.addOrReplaceChild("Neckmiddlefront_r1", CubeListBuilder.create().texOffs(116, 79).addBox(-0.5F, -0.5F, 5.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(114, 77).addBox(-0.5F, -0.5F, 2.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2275F, -5.828F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5745F, -2.4352F, -0.2768F, 0.0F, 0.0F));

		PartDefinition Neckfront_r1 = Neck4.addOrReplaceChild("Neckfront_r1", CubeListBuilder.create().texOffs(86, 0).addBox(-0.5F, -0.5F, -4.6F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.5293F, -0.4848F, -0.0875F, -0.0695F, 0.0061F));

		PartDefinition Neck5 = Neck4.addOrReplaceChild("Neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -4.9F, 0.0372F, -0.1284F, -0.1764F));

		PartDefinition Neckfront_r2 = Neck5.addOrReplaceChild("Neckfront_r2", CubeListBuilder.create().texOffs(69, 97).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2155F, -2.8711F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -3.7F, 0.0458F, -0.2018F, -0.0834F));

		PartDefinition Neckfront_r3 = Neck6.addOrReplaceChild("Neckfront_r3", CubeListBuilder.create().texOffs(114, 92).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.2155F, -2.7711F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Neck7 = Neck6.addOrReplaceChild("Neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, -2.6F, 0.081F, 0.0F, 0.0F));

		PartDefinition Neckfront_r4 = Neck7.addOrReplaceChild("Neckfront_r4", CubeListBuilder.create().texOffs(99, 114).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2155F, -2.7711F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Head = Neck7.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0569F, -1.9857F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone = Head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.0F, 1.4198F, -1.8465F));

		PartDefinition leftFace2 = Head.addOrReplaceChild("leftFace2", CubeListBuilder.create(), PartPose.offset(-0.5F, 2.1697F, 1.3889F));

		PartDefinition rightFace2 = Head.addOrReplaceChild("rightFace2", CubeListBuilder.create(), PartPose.offset(0.5F, 2.1697F, 1.3889F));

		PartDefinition Upperjaw = Head.addOrReplaceChild("Upperjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -4.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftFace = Upperjaw.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.2F, 1.962F, -8.8692F));

		PartDefinition Lowerjaw = Head.addOrReplaceChild("Lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.8231F, 0.2293F, 0.5603F, 0.0F, 0.0F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(34, 0).addBox(-0.5F, -0.4074F, -0.0052F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7991F, 6.8213F, -0.1019F, 0.0913F, 0.0344F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(1, 17).addBox(-0.5F, -0.1028F, -0.075F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3075F, 11.9948F, 0.0303F, 0.1305F, 0.0096F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(1, 33).addBox(-0.5F, -0.4296F, -0.3797F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.2933F, 13.1973F, 0.0654F, 0.0872F, 0.0019F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(32, 17).addBox(-0.5F, -0.0054F, -0.2732F, 1.0F, 2.0F, 13.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.4326F, 12.6838F, 0.1031F, 0.1309F, 0.0021F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(56, 33).addBox(-0.5F, -0.2015F, -0.443F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F))
				.texOffs(64, 41).addBox(-0.5F, -0.2015F, 9.257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0059F, 12.947F, -0.0833F, -0.1739F, 0.0144F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(62, 0).addBox(-0.5F, 0.1577F, -0.2842F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4089F, 10.1684F, -0.0437F, -0.1308F, 0.0057F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create().texOffs(62, 12).addBox(-0.5F, 0.1335F, -0.0849F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.025F, 9.55F, -0.1405F, -0.1296F, 0.0183F));

		PartDefinition Tail8 = Tail7.addOrReplaceChild("Tail8", CubeListBuilder.create().texOffs(17, 72).addBox(-0.5F, 0.1335F, -0.2849F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(24, 79).addBox(-0.5F, 0.1335F, 7.4151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 9.8F, -0.1055F, -0.4342F, 0.0445F));

		PartDefinition Tail9 = Tail8.addOrReplaceChild("Tail9", CubeListBuilder.create().texOffs(36, 75).addBox(-0.5F, 0.1335F, 0.0151F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0182F, 7.9017F, -0.2566F, -0.5522F, 0.1368F));

		return LayerDefinition.create(meshdefinition, 152, 152);
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