package fossils.fossils.client.blockentity.model.zupaysaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ZupaysaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart Bodyfront;
	private final ModelPart Neckbase;
	private final ModelPart neck;
	private final ModelPart Neckmiddle;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart Neckend;
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
	private final ModelPart tail;
	private final ModelPart Tailmiddleend;
	private final ModelPart Tailend;
	private final ModelPart Tailend2;
	private final ModelPart Tailend3;
	private final ModelPart Tailend4;
	private final ModelPart Tailend5;
	private final ModelPart Tailend6;
	private final ModelPart Rightthigh;
	private final ModelPart Rightshin;
	private final ModelPart Rightankle;
	private final ModelPart Rightfoot;
	private final ModelPart Rightfoot2;
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart Leftankle;
	private final ModelPart Leftfoot;
	private final ModelPart Leftfoot2;
	private final ModelPart bone2;
	private final ModelPart bone3;

	public ZupaysaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body = this.Bodymiddle.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.Bodyfront = this.body2.getChild("Bodyfront");
		this.Neckbase = this.Bodyfront.getChild("Neckbase");
		this.neck = this.Neckbase.getChild("neck");
		this.Neckmiddle = this.neck.getChild("Neckmiddle");
		this.neck2 = this.Neckmiddle.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.Neckend = this.neck4.getChild("Neckend");
		this.Head = this.Neckend.getChild("Head");
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
		this.tail = this.Tailmiddlebase.getChild("tail");
		this.Tailmiddleend = this.tail.getChild("Tailmiddleend");
		this.Tailend = this.Tailmiddleend.getChild("Tailend");
		this.Tailend2 = this.Tailend.getChild("Tailend2");
		this.Tailend3 = this.Tailend2.getChild("Tailend3");
		this.Tailend4 = this.Tailend3.getChild("Tailend4");
		this.Tailend5 = this.Tailend4.getChild("Tailend5");
		this.Tailend6 = this.Tailend5.getChild("Tailend6");
		this.Rightthigh = this.Hips.getChild("Rightthigh");
		this.Rightshin = this.Rightthigh.getChild("Rightshin");
		this.Rightankle = this.Rightshin.getChild("Rightankle");
		this.Rightfoot = this.Rightankle.getChild("Rightfoot");
		this.Rightfoot2 = this.Rightfoot.getChild("Rightfoot2");
		this.Leftthigh = this.Hips.getChild("Leftthigh");
		this.Leftshin = this.Leftthigh.getChild("Leftshin");
		this.Leftankle = this.Leftshin.getChild("Leftankle");
		this.Leftfoot = this.Leftankle.getChild("Leftfoot");
		this.Leftfoot2 = this.Leftfoot.getChild("Leftfoot2");
		this.bone2 = this.Hips.getChild("bone2");
		this.bone3 = this.Hips.getChild("bone3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-1.575F, -29.0F, -25.5F, 1.0F, 29.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-4.0F, -2.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -19.5F, -25.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-4.5F, -3.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -23.5F, -1.2F, 0.0873F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(0.0F, -5.5F, -0.5F, 1.0F, 29.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.5F, -23.5F, -1.2F, 0.0F, 0.0873F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -20.6F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -8.501F, 0.2682F, -0.0986F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(48, 25).addBox(-0.5F, -2.1F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(42, 19).addBox(-0.5F, -2.1F, -4.7F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.9702F, 0.4353F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.3678F, -3.6167F, -0.0111F, 0.0873F, -0.001F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(43, 72).addBox(-0.49F, -1.8F, 2.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.1892F, -5.8242F, 0.0436F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0392F, -3.4242F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r2 = body.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(5, 56).addBox(-0.49F, -1.8F, 1.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 51).addBox(-0.49F, -1.8F, -3.8F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.15F, -2.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2641F, -5.9944F, 0.0175F, -0.0436F, -0.0008F));

		PartDefinition Bodymiddle_r3 = body2.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(34, 52).addBox(-0.49F, -1.8F, -3.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.15F, -2.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body2.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1501F, -5.955F, 0.0806F, -0.0435F, -0.0035F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(29, 8).addBox(-0.49F, -0.05F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(21, 0).addBox(-0.49F, -0.05F, -9.3F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4128F, -0.1452F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Neckbase = Bodyfront.addOrReplaceChild("Neckbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5816F, -8.8779F, -0.0694F, -0.0871F, 0.006F));

		PartDefinition Neckbase_r1 = Neckbase.addOrReplaceChild("Neckbase_r1", CubeListBuilder.create().texOffs(24, 60).addBox(-0.49F, -0.3987F, -0.5632F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0343F, -3.3609F, -0.1745F, 0.0F, 0.0F));

		PartDefinition neck = Neckbase.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6581F, -3.774F, -0.4454F, -0.0394F, 0.0188F));

		PartDefinition Neckmiddle_r1 = neck.addOrReplaceChild("Neckmiddle_r1", CubeListBuilder.create().texOffs(15, 63).addBox(-0.49F, 0.018F, -0.7524F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(13, 60).addBox(-0.49F, 0.018F, -4.2524F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1828F, 0.3121F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Neckmiddle = neck.addOrReplaceChild("Neckmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0499F, -3.9271F, -0.1831F, 0.0429F, -0.0079F));

		PartDefinition Neckmiddle_r2 = Neckmiddle.addOrReplaceChild("Neckmiddle_r2", CubeListBuilder.create().texOffs(0, 65).addBox(-0.49F, 0.0171F, -3.1775F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2422F, -0.4849F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck2 = Neckmiddle.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6184F, -3.7389F, -0.262F, 0.0421F, -0.0113F));

		PartDefinition cube_r4 = neck2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(27, 74).addBox(-0.49F, 0.1F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(25, 72).addBox(-0.49F, 0.1F, -3.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4451F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1646F, -2.6112F, 0.0299F, 0.0412F, 0.0885F));

		PartDefinition cube_r5 = neck3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(61, 9).addBox(-0.49F, 0.1F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5193F, -0.9489F, 0.4451F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7017F, -3.5525F, 0.1922F, 0.0428F, 0.0083F));

		PartDefinition bone5 = neck4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5193F, -0.9489F));

		PartDefinition Neckend_r1 = bone5.addOrReplaceChild("Neckend_r1", CubeListBuilder.create().texOffs(49, 52).addBox(-0.5F, 0.7F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.01F, 2.568F, -4.6192F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bone5.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(61, 27).addBox(-0.49F, 0.1F, -2.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4451F, 0.0F, 0.0F));

		PartDefinition Neckend = neck4.addOrReplaceChild("Neckend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 1.5943F, -3.5607F, 0.53F, 0.0F, 0.0F));

		PartDefinition Head = Neckend.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4044F, -4.2904F, 0.2039F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase = Head.addOrReplaceChild("Lowerjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.8519F, -0.1313F, 0.7767F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.3F, 0.3064F, -2.4747F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.3F, 0.3064F, -2.4747F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9201F, 6.2368F, -7.1315F, 0.229F, 0.0861F, -0.2025F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4434F, 4.5651F, 3.667F, -0.5146F, 0.2285F, 0.1819F));

		PartDefinition Righthand = Rightlowerarm.addOrReplaceChild("Righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8254F, 4.828F, -0.1049F, 0.0344F, 0.0103F, 0.3153F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9001F, 6.2368F, -7.1315F, 0.4036F, -0.0861F, 0.2025F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4434F, 4.5651F, 3.667F, -0.2528F, -0.2285F, -0.1819F));

		PartDefinition Lefthand = Leftlowerarm.addOrReplaceChild("Lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8254F, 4.828F, -0.1049F, 0.0344F, -0.0103F, -0.3153F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7812F, 4.8888F, -8.4776F, -0.0147F, 0.1056F, -0.0705F));

		PartDefinition bone4 = Bodyfront.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7612F, 4.8888F, -8.4776F, -0.0147F, -0.1056F, 0.0705F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(42, 9).addBox(-0.5F, 0.0698F, 0.1594F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1562F, 2.932F, -0.0396F, -0.1104F, 0.091F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2569F, 7.8363F, 0.0436F, -0.0892F, 0.0388F));

		PartDefinition Tailmiddlebase_r1 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(48, 41).addBox(-0.5F, 0.2F, 5.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(42, 35).addBox(-0.5F, 0.2F, -1.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1038F, 0.9873F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail = Tailmiddlebase.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0229F, 7.0076F, 0.0099F, -0.0442F, 0.0425F));

		PartDefinition Tailmiddlebase_r2 = tail.addOrReplaceChild("Tailmiddlebase_r2", CubeListBuilder.create().texOffs(34, 44).addBox(-0.5F, 0.2F, 6.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1267F, -6.0203F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = tail.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, 6.0F, 0.0864F, -0.0437F, 0.0F));

		PartDefinition Tailmiddleend_r1 = Tailmiddleend.addOrReplaceChild("Tailmiddleend_r1", CubeListBuilder.create().texOffs(8, 8).addBox(-0.5F, 0.1F, 7.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 0).addBox(-0.5F, 0.1F, -0.8F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0456F, 0.4856F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5519F, 8.8376F, 0.0633F, 0.1048F, -0.0085F));

		PartDefinition Tailend_r1 = Tailend.addOrReplaceChild("Tailend_r1", CubeListBuilder.create().texOffs(21, 11).addBox(-0.5F, 0.2F, 0.1F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend2 = Tailend.addOrReplaceChild("Tailend2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3392F, 8.921F, 0.1073F, 0.2181F, -0.0051F));

		PartDefinition Tailend_r2 = Tailend2.addOrReplaceChild("Tailend_r2", CubeListBuilder.create().texOffs(8, 30).addBox(-0.5F, 0.2F, 8.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 22).addBox(-0.5F, 0.2F, -0.4F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend3 = Tailend2.addOrReplaceChild("Tailend3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2674F, 8.9066F, -0.1622F, 0.1749F, -0.0056F));

		PartDefinition Tailend_r3 = Tailend3.addOrReplaceChild("Tailend_r3", CubeListBuilder.create().texOffs(21, 22).addBox(-0.5F, 0.2F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend4 = Tailend3.addOrReplaceChild("Tailend4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2539F, 8.9195F, -0.1801F, 0.0874F, -0.0043F));

		PartDefinition Tailend_r4 = Tailend4.addOrReplaceChild("Tailend_r4", CubeListBuilder.create().texOffs(0, 11).addBox(-0.5F, 0.2F, -0.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend5 = Tailend4.addOrReplaceChild("Tailend5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2974F, 8.9411F, -0.1627F, 0.131F, -0.0061F));

		PartDefinition Tailend_r5 = Tailend5.addOrReplaceChild("Tailend_r5", CubeListBuilder.create().texOffs(8, 41).addBox(-0.5F, 0.2F, 8.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 33).addBox(-0.5F, 0.2F, -0.4F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend6 = Tailend5.addOrReplaceChild("Tailend6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3094F, 8.8484F, -0.1569F, 0.1767F, 0.0095F));

		PartDefinition Tailend_r6 = Tailend6.addOrReplaceChild("Tailend_r6", CubeListBuilder.create().texOffs(21, 33).addBox(-0.5F, 0.2F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3F, 1.063F, -1.3982F, -0.9517F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 11.1303F, 2.2813F, 1.6008F, 0.0F, 0.0F));

		PartDefinition Rightankle = Rightshin.addOrReplaceChild("Rightankle", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 12.1474F, 0.8934F, -1.072F, 0.0F, 0.0F));

		PartDefinition Rightfoot = Rightankle.addOrReplaceChild("Rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.8279F, 0.0386F, 1.1498F, 0.0F, 0.0F));

		PartDefinition Rightfoot2 = Rightfoot.addOrReplaceChild("Rightfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4112F, -1.704F, -0.2377F, 0.0F, 0.0F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3F, 1.063F, -1.3982F, 0.0518F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 11.1303F, 2.2813F, 0.8154F, 0.0F, 0.0F));

		PartDefinition Leftankle = Leftshin.addOrReplaceChild("Leftankle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 12.1474F, 0.8934F, -0.8102F, 0.0F, 0.0F));

		PartDefinition Leftfoot = Leftankle.addOrReplaceChild("Leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.8279F, 0.0386F, 0.9317F, 0.0F, 0.0F));

		PartDefinition Leftfoot2 = Leftfoot.addOrReplaceChild("Leftfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4112F, -1.704F, -0.8046F, 0.0063F, -0.0046F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7668F, -0.5392F, -1.2751F, 0.0F, 0.0F, 0.1745F));

		PartDefinition bone3 = Hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7668F, -0.5392F, -1.2751F, 0.0F, 0.0F, -0.1745F));

		return LayerDefinition.create(meshdefinition, 118, 118);
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