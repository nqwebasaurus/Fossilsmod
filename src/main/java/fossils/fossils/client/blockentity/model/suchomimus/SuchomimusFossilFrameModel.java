package fossils.fossils.client.blockentity.model.suchomimus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SuchomimusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart rightthigh;
	private final ModelPart rightshin;
	private final ModelPart rightankle;
	private final ModelPart rightfoot;
	private final ModelPart righttoes;
	private final ModelPart leftthigh;
	private final ModelPart leftshin;
	private final ModelPart leftankle;
	private final ModelPart leftfoot;
	private final ModelPart lefttoes;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart lefthand;
	private final ModelPart leftfingers;
	private final ModelPart leftclaw;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart righthand;
	private final ModelPart rightfingers;
	private final ModelPart rightclaw;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftAngularSurangular;
	private final ModelPart leftDentary;

	public SuchomimusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.rightthigh = this.hips.getChild("rightthigh");
		this.rightshin = this.rightthigh.getChild("rightshin");
		this.rightankle = this.rightshin.getChild("rightankle");
		this.rightfoot = this.rightankle.getChild("rightfoot");
		this.righttoes = this.rightfoot.getChild("righttoes");
		this.leftthigh = this.hips.getChild("leftthigh");
		this.leftshin = this.leftthigh.getChild("leftshin");
		this.leftankle = this.leftshin.getChild("leftankle");
		this.leftfoot = this.leftankle.getChild("leftfoot");
		this.lefttoes = this.leftfoot.getChild("lefttoes");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.lefthand = this.leftarm2.getChild("lefthand");
		this.leftfingers = this.lefthand.getChild("leftfingers");
		this.leftclaw = this.lefthand.getChild("leftclaw");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.righthand = this.rightarm2.getChild("righthand");
		this.rightfingers = this.righthand.getChild("rightfingers");
		this.rightclaw = this.righthand.getChild("rightclaw");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.head = this.neck5.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.leftAngularSurangular = this.jaw.getChild("leftAngularSurangular");
		this.leftDentary = this.leftAngularSurangular.getChild("leftDentary");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -36.0F, 1.3F, 1.0F, 36.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.4F, -3.5F, -0.5F, 1.0F, 31.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-2.7F, -27.5F, -31.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-5.2F, -4.5F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.7F, -27.5F, -31.0F, -0.1745F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(0.9F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -33.5F, 1.8F, 0.0F, 0.0F, -1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -38.1882F, 0.6534F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(48, 19).addBox(-1.5F, 0.6F, -0.1F, 1.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5F, -6.2F, -0.1047F, 0.0F, 0.0F));

		PartDefinition rightthigh = hips.addOrReplaceChild("rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(4.077F, 4.1469F, 1.0529F, -0.6117F, -0.0243F, -0.0347F));

		PartDefinition rightshin = rightthigh.addOrReplaceChild("rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3439F, 15.8243F, -2.7602F, 0.796F, 0.0F, 0.0424F));

		PartDefinition rightankle = rightshin.addOrReplaceChild("rightankle", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0524F, 16.5383F, 0.1517F, -0.5056F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightankle.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.4743F, -0.8039F, 0.2358F, 0.0F, 0.0F));

		PartDefinition righttoes = rightfoot.addOrReplaceChild("righttoes", CubeListBuilder.create(), PartPose.offset(0.0F, 0.6962F, -2.1762F));

		PartDefinition leftthigh = hips.addOrReplaceChild("leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.077F, 4.1469F, 1.0529F, 0.1301F, 0.0243F, 0.0347F));

		PartDefinition leftshin = leftthigh.addOrReplaceChild("leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3439F, 15.8243F, -2.7602F, 0.5342F, 0.0F, -0.0424F));

		PartDefinition leftankle = leftshin.addOrReplaceChild("leftankle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0524F, 16.5383F, 0.1517F, -0.9856F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftankle.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.4743F, -0.8039F, 0.2358F, 0.0F, 0.0F));

		PartDefinition lefttoes = leftfoot.addOrReplaceChild("lefttoes", CubeListBuilder.create(), PartPose.offset(0.0F, 0.6962F, -2.1762F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5559F, 9.5933F, 0.1625F, 0.2585F, 0.0419F));

		PartDefinition cube_r5 = tail.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 78).addBox(-0.5F, 3.7F, 1.5F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.6485F, -1.2552F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6822F, 9.2232F, -0.062F, -0.1742F, 0.0108F));

		PartDefinition cube_r6 = tail2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(45, 0).addBox(-0.5F, 0.8F, -9.0F, 1.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2694F, 8.9704F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, 0.3F, 0.0F, 1.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3577F, 15.7924F, -0.0542F, 0.2614F, -0.014F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.21F, 18.1275F, 0.1806F, 0.2577F, 0.0465F));

		PartDefinition cube_r7 = tail4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(40, 39).addBox(0.5F, -4.2F, -10.1F, 1.0F, 1.0F, 20.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, 5.1974F, 8.7124F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4663F, 18.8959F, -0.0037F, -0.5265F, 0.1204F));

		PartDefinition cube_r8 = tail5.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(33, 61).addBox(0.0F, -1.2F, -12.0F, 1.0F, 1.0F, 15.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 4.0904F, 11.1196F, -0.2182F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.4718F, 14.0564F, -0.0567F, -0.3921F, 0.0217F));

		PartDefinition cube_r9 = tail6.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.7F, -5.7F, 1.0F, 1.0F, 21.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.8282F, 5.135F, -0.3927F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0501F, -6.5075F, 0.0175F, 0.0873F, 0.0015F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(66, 87).addBox(-0.5F, 0.9406F, -6.001F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0501F, -13.6925F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(1, 61).addBox(-0.5F, 0.9406F, -0.001F, 1.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0501F, -13.6925F, 0.0611F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1662F, -19.6337F, 0.0349F, 0.0436F, 0.0015F));

		PartDefinition cube_r12 = chest.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(43, 78).addBox(0.5F, -2.1F, -4.5F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 3.1F, -4.0F, 0.1571F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5432F, 10.2151F, -7.4352F, -1.133F, 0.1966F, -0.2699F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2598F, 3.8898F, 8.0395F, 0.1329F, -0.4386F, -0.8718F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9727F, 4.9738F, -0.9538F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftfingers = lefthand.addOrReplaceChild("leftfingers", CubeListBuilder.create(), PartPose.offset(-0.2273F, 4.0462F, -0.3604F));

		PartDefinition leftclaw = lefthand.addOrReplaceChild("leftclaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6951F, 0.3403F, -1.4667F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5432F, 10.2151F, -7.4352F, -0.9148F, -0.1966F, 0.2699F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2598F, 3.8898F, 8.0395F, 0.0946F, 0.1827F, 0.9256F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9727F, 4.9738F, -0.9538F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightfingers = righthand.addOrReplaceChild("rightfingers", CubeListBuilder.create(), PartPose.offset(0.2273F, 4.0462F, -0.3604F));

		PartDefinition rightclaw = righthand.addOrReplaceChild("rightclaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6951F, 0.3403F, -1.4667F, -0.1302F, 0.1304F, 0.0115F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4391F, -8.8957F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r13 = neck.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(104, 66).addBox(-0.5F, -0.1974F, -0.5778F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.7814F, -3.933F, -0.5061F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0115F, -3.733F, -0.0947F, -0.2555F, 0.0579F));

		PartDefinition cube_r14 = neck2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(106, 75).addBox(-1.0F, 0.7179F, 0.9454F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -5.25F, -2.3938F, -1.0297F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.1855F, -2.2293F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r15 = neck3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(82, 94).addBox(-1.0F, 0.5F, -1.9787F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -3.2293F, -2.4464F, -0.8901F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.4459F, -3.7399F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r16 = neck4.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(95, 25).addBox(-1.0F, 0.5112F, -0.9487F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -1.509F, -3.6302F, -0.2967F, 0.0F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7472F, -4.6625F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r17 = neck5.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(99, 87).addBox(0.5F, 0.2224F, -1.4687F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, 0.0F, -3.45F, -0.0611F, 0.0F, 0.0F));

		PartDefinition head = neck5.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2756F, -5.2684F, -0.6649F, -0.2721F, 0.2382F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4321F, 2.0731F, 0.3927F, 0.0F, 0.0F));

		PartDefinition leftAngularSurangular = jaw.addOrReplaceChild("leftAngularSurangular", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.1091F, -0.4042F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftDentary = leftAngularSurangular.addOrReplaceChild("leftDentary", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 4.1F, -4.9F, 0.7243F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 147, 147);
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