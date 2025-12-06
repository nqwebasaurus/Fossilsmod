package fossils.fossils.client.blockentity.model.tanycolagreus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TanycolagreusFossilFrameModel extends SkullModelBase {
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
	private final ModelPart bone3;
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
	private final ModelPart Tailend7;
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
	private final ModelPart bone4;

	public TanycolagreusFossilFrameModel(ModelPart root) {
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
		this.bone3 = this.Bodyfront.getChild("bone3");
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
		this.Tailend7 = this.Tailend6.getChild("Tailend7");
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
		this.bone4 = this.Hips.getChild("bone4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -33.0F, 2.8F, 1.0F, 33.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(2, 1).addBox(-0.5F, -42.0F, -23.2F, 1.0F, 42.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(3.6F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -30.8F, -22.7F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(4.5F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -27.0F, 3.3F, 0.0F, 0.0F, -1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -21.1F, 12.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.9154F, -7.835F, -0.404F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(42, 58).addBox(-0.5F, -2.1F, 1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(36, 52).addBox(-0.5F, -2.1F, -4.9F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.9702F, 0.4353F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.3678F, -3.6167F, 0.0325F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(16, 78).addBox(-0.49F, -1.8F, 2.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.1892F, -5.8242F, 0.0436F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0392F, -3.4242F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r2 = body.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(53, 60).addBox(-0.49F, -1.8F, -3.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.15F, -2.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2641F, -5.9944F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r3 = body2.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(22, 59).addBox(-0.49F, -1.8F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(17, 54).addBox(-0.49F, -1.8F, -3.7F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.15F, -2.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body2.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1501F, -5.955F, 0.1155F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(0, 53).addBox(-0.49F, -0.05F, -6.9F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4128F, -0.1452F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Neckbase = Bodyfront.addOrReplaceChild("Neckbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4918F, -6.917F, 0.0531F, 0.0F, 0.0F));

		PartDefinition Neckbase_r1 = Neckbase.addOrReplaceChild("Neckbase_r1", CubeListBuilder.create().texOffs(14, 71).addBox(-0.49F, -0.3987F, 2.6368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(11, 68).addBox(-0.49F, -0.3987F, -1.0632F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0343F, -3.3609F, -0.1745F, 0.0F, 0.0F));

		PartDefinition neck = Neckbase.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6206F, -3.709F, -0.2623F, -0.0865F, 0.0114F));

		PartDefinition Neckmiddle_r1 = neck.addOrReplaceChild("Neckmiddle_r1", CubeListBuilder.create().texOffs(58, 74).addBox(-0.49F, 0.018F, -3.4524F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1828F, 0.3121F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Neckmiddle = neck.addOrReplaceChild("Neckmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0618F, -2.6729F, -0.2269F, -0.0402F, 0.017F));

		PartDefinition Neckmiddle_r2 = Neckmiddle.addOrReplaceChild("Neckmiddle_r2", CubeListBuilder.create().texOffs(60, 68).addBox(-0.49F, 0.0171F, -3.4025F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2422F, -0.5849F, 0.1571F, 0.0F, 0.0F));

		PartDefinition neck2 = Neckmiddle.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6861F, -4.0023F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r3 = neck2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(45, 82).addBox(-0.49F, 0.1F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(43, 80).addBox(-0.49F, 0.1F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4451F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1646F, -2.6112F, 0.1395F, -0.0061F, 0.0432F));

		PartDefinition cube_r4 = neck3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(67, 77).addBox(-0.49F, 0.1F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5193F, -0.9489F, 0.4451F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2409F, -2.6234F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r5 = neck4.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(76, 77).addBox(-0.49F, 0.1F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5193F, -0.9489F, 0.4451F, 0.0F, 0.0F));

		PartDefinition Neckend = neck4.addOrReplaceChild("Neckend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 1.1319F, -2.6727F, 0.53F, 0.0F, 0.0F));

		PartDefinition Neckend_r1 = Neckend.addOrReplaceChild("Neckend_r1", CubeListBuilder.create().texOffs(7, 78).addBox(-0.5F, 0.1013F, -0.1332F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.0345F, -2.542F, 0.3142F, 0.0F, 0.0F));

		PartDefinition Head = Neckend.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0807F, -2.5005F, 0.4899F, 0.3207F, -0.362F));

		PartDefinition Lowerjawbase = Head.addOrReplaceChild("Lowerjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6302F, -0.0445F, 0.1571F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.3F, -0.4936F, -2.4747F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.3F, -0.4936F, -2.4747F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8275F, 7.5812F, -7.8271F, 0.1996F, 0.1421F, -0.46F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.602F, 5.3535F, 3.609F, -0.9631F, -0.5176F, -0.2606F));

		PartDefinition Righthand = Rightlowerarm.addOrReplaceChild("Righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9519F, 5.7281F, -0.1712F, 0.0324F, 0.0393F, 0.2329F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8075F, 7.5812F, -7.8271F, 0.2209F, -0.1056F, 0.288F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.602F, 5.3535F, 3.609F, -0.897F, 0.6784F, 0.4418F));

		PartDefinition Lefthand = Leftlowerarm.addOrReplaceChild("Lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9519F, 5.7281F, -0.1712F, 0.076F, -0.0393F, -0.2329F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1712F, 4.8569F, -8.8163F, -0.0147F, 0.0183F, -0.0692F));

		PartDefinition bone3 = Bodyfront.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1512F, 4.8569F, -8.8163F, -0.0147F, -0.0183F, 0.0692F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(42, 11).addBox(-0.5F, 0.0698F, -0.2406F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(49, 18).addBox(-0.5F, 0.0698F, 7.4594F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1562F, 2.932F, 0.253F, 0.1281F, 0.0214F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2569F, 7.8363F, 0.0888F, 0.1742F, 0.0078F));

		PartDefinition Tailmiddlebase_r1 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(19, 45).addBox(-0.5F, 0.2F, -0.9F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1038F, 0.9873F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail = Tailmiddlebase.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0229F, 7.0076F, 0.1659F, 0.0435F, 0.0034F));

		PartDefinition Tailmiddlebase_r2 = tail.addOrReplaceChild("Tailmiddlebase_r2", CubeListBuilder.create().texOffs(58, 57).addBox(-0.5F, 0.2F, 11.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(53, 52).addBox(-0.5F, 0.2F, 5.6F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1267F, -6.0203F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = tail.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, 6.0F, 0.1475F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend_r1 = Tailmiddleend.addOrReplaceChild("Tailmiddleend_r1", CubeListBuilder.create().texOffs(8, 20).addBox(-0.5F, 0.1F, 8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 12).addBox(-0.5F, 0.1F, -0.7F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0456F, 0.4856F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5519F, 8.8376F, 0.1777F, 0.0F, 0.0F));

		PartDefinition Tailend_r1 = Tailend.addOrReplaceChild("Tailend_r1", CubeListBuilder.create().texOffs(21, 12).addBox(-0.5F, 0.2F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend2 = Tailend.addOrReplaceChild("Tailend2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3392F, 8.921F, 0.0817F, 0.0F, 0.0F));

		PartDefinition Tailend_r2 = Tailend2.addOrReplaceChild("Tailend_r2", CubeListBuilder.create().texOffs(29, 31).addBox(-0.5F, 0.2F, 8.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(21, 23).addBox(-0.5F, 0.2F, -0.4F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend3 = Tailend2.addOrReplaceChild("Tailend3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2923F, 8.909F, -0.0928F, 0.0F, 0.0F));

		PartDefinition Tailend_r3 = Tailend3.addOrReplaceChild("Tailend_r3", CubeListBuilder.create().texOffs(0, 34).addBox(-0.5F, 0.2F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend4 = Tailend3.addOrReplaceChild("Tailend4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3279F, 8.9316F, -0.1616F, 0.0642F, 0.1222F));

		PartDefinition Tailend_r4 = Tailend4.addOrReplaceChild("Tailend_r4", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, 0.2F, -0.2F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend5 = Tailend4.addOrReplaceChild("Tailend5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2974F, 8.9411F, -0.0842F, 0.0433F, -0.0056F));

		PartDefinition Tailend_r5 = Tailend5.addOrReplaceChild("Tailend_r5", CubeListBuilder.create().texOffs(29, 42).addBox(-0.5F, 0.2F, 8.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(21, 34).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend6 = Tailend5.addOrReplaceChild("Tailend6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3094F, 8.8484F, -0.1279F, 0.0433F, -0.0056F));

		PartDefinition Tailend_r6 = Tailend6.addOrReplaceChild("Tailend_r6", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, 0.2F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend7 = Tailend6.addOrReplaceChild("Tailend7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3167F, 8.8899F, -0.1715F, -0.043F, 0.0074F));

		PartDefinition Tailend_r7 = Tailend7.addOrReplaceChild("Tailend_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.2F, -0.2F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3F, 0.5247F, -0.4708F, 0.1028F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 12.1545F, 2.566F, 1.4699F, 0.0F, 0.0F));

		PartDefinition Rightankle = Rightshin.addOrReplaceChild("Rightankle", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 16.1915F, -1.8499F, -1.3774F, 0.0F, 0.0F));

		PartDefinition Rightfoot = Rightankle.addOrReplaceChild("Rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.8279F, 0.0386F, 1.4294F, 0.0189F, 0.0393F));

		PartDefinition Rightfoot2 = Rightfoot.addOrReplaceChild("Rightfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4112F, -1.704F, -0.2377F, 0.0F, 0.0F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3F, 0.5247F, -0.4708F, -0.3321F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 12.1545F, 2.566F, 1.2081F, 0.0F, 0.0F));

		PartDefinition Leftankle = Leftshin.addOrReplaceChild("Leftankle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 16.1915F, -1.8499F, -0.9411F, 0.0F, 0.0F));

		PartDefinition Leftfoot = Leftankle.addOrReplaceChild("Leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.8279F, 0.0386F, 0.5128F, 0.0F, 0.0F));

		PartDefinition Leftfoot2 = Leftfoot.addOrReplaceChild("Leftfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4112F, -1.704F, -0.0195F, 0.0F, 0.0F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9404F, -1.524F, -0.7751F, -0.0524F, 0.0F, 0.1745F));

		PartDefinition bone4 = Hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9404F, -1.524F, -0.7751F, -0.0524F, 0.0F, -0.1745F));

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