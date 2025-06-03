package fossils.fossils.client.blockentity.model.stegouros;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class StegourosFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart tail1;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail;
	private final ModelPart torso;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart lefthand;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart righthand;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart leftleg;
	private final ModelPart leftleg2;
	private final ModelPart leftleg3;
	private final ModelPart leftfoot;
	private final ModelPart rightleg;
	private final ModelPart rightleg2;
	private final ModelPart rightleg3;
	private final ModelPart rightfoot;

	public StegourosFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.tail1 = this.hips.getChild("tail1");
		this.tail6 = this.tail1.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail = this.tail8.getChild("tail");
		this.torso = this.hips.getChild("torso");
		this.chest = this.torso.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.lefthand = this.leftarm2.getChild("lefthand");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.righthand = this.rightarm2.getChild("righthand");
		this.neck4 = this.chest.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.head = this.neck6.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.leftleg = this.hips.getChild("leftleg");
		this.leftleg2 = this.leftleg.getChild("leftleg2");
		this.leftleg3 = this.leftleg2.getChild("leftleg3");
		this.leftfoot = this.leftleg3.getChild("leftfoot");
		this.rightleg = this.hips.getChild("rightleg");
		this.rightleg2 = this.rightleg.getChild("rightleg2");
		this.rightleg3 = this.rightleg2.getChild("rightleg3");
		this.rightfoot = this.rightleg3.getChild("rightfoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -11.0F, 2.9F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.4F, -1.0F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-3.2F, -9.0F, -10.8F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(0.6F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-3.2F, -9.0F, -10.8F, 0.3927F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-2.1F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -9.0F, 3.4F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -10.8071F, 2.3501F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(3, 3).addBox(-2.0F, 0.3821F, 4.3996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 0).addBox(-2.0F, 0.3821F, -0.3004F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5F, -1.2F, -1.3F, -0.192F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, 0.2607F, -0.0927F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1313F, 3.5715F, -0.1386F, -0.3702F, 0.134F));

		PartDefinition tail6 = tail1.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(13, 0).addBox(-0.5F, 0.0983F, -0.5739F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(17, 4).addBox(-0.5F, 0.0983F, 4.1261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0514F, 4.8415F, 0.4089F, -0.4215F, -0.1162F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(22, 27).addBox(-0.5F, 0.2411F, -0.3184F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(25, 30).addBox(-0.5F, 0.2411F, 3.3817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1168F, 4.7565F, 0.3695F, -0.3272F, -0.1238F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(26, 9).addBox(-0.5F, 0.1289F, -0.1992F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(29, 12).addBox(-0.5F, 0.1289F, 3.5008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1107F, 3.8849F, 0.3794F, -0.1355F, -0.0058F));

		PartDefinition tail = tail8.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(26, 15).addBox(-1.0F, 0.25F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.1174F, 4.0008F, 0.3542F, -0.2129F, -0.0479F));

		PartDefinition torso = hips.addOrReplaceChild("torso", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, -1.1F, 0.0352F, 0.1308F, 0.0046F));

		PartDefinition cube_r5 = torso.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(11, 27).addBox(-2.5F, 0.65F, 1.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.0F, -0.7F, -6.1F, -0.0524F, 0.0F, 0.0F));

		PartDefinition chest = torso.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1431F, -3.9826F, 0.1506F, 0.1726F, 0.0261F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(29, 3).addBox(-1.0F, 0.7033F, -0.6242F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(26, 0).addBox(-1.0F, 0.7033F, -4.3242F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.3164F, -5.9259F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(18, 33).addBox(-2.0F, 0.7172F, -2.9181F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5F, -0.6307F, -2.9507F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(9, 33).addBox(-2.0F, 0.4204F, 3.5755F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5F, -0.4307F, -6.6507F, -0.0262F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.609F, 3.0685F, -8.981F, -0.3927F, 0.0F, -0.2618F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4053F, 3.891F, 2.3325F, -0.0393F, 0.0774F, 0.2579F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0872F, -1.3854F, 0.288F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.609F, 3.0685F, -8.981F, 0.48F, 0.0F, 0.2618F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4053F, 3.891F, 2.3325F, -0.4756F, -0.0774F, -0.2579F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0872F, -1.3854F, 0.7243F, 0.0F, 0.0F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7241F, -9.4545F, 1.121F, 0.2368F, -0.1128F));

		PartDefinition cube_r9 = neck4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(43, 4).addBox(-0.575F, 0.3867F, 1.7278F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.5391F, -0.7008F, -1.3614F, 0.0F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7594F, -0.2229F, -0.7968F, 0.2462F, -0.0047F));

		PartDefinition cube_r10 = neck5.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(54, 1).addBox(-0.5F, -0.4744F, 1.4207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(53, 0).addBox(-0.5F, -0.4744F, -0.2793F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5028F, -2.2153F, -0.6612F, 0.0461F, -0.051F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9229F, -2.0725F, -0.6488F, 0.3557F, -0.2582F));

		PartDefinition cube_r11 = neck6.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 33).addBox(-0.5F, 0.5889F, -2.5757F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6469F, 0.1113F, -0.2356F, 0.0F, 0.0F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, -0.8185F, -2.922F, -0.0616F, 0.4205F, 0.1201F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.3F, 0.0838F, -2.3755F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.0838F, -2.3755F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 0.8071F, 0.2247F, 1.0559F, 0.0F, 0.0F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5F, -0.0005F, 1.1644F, 0.2443F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 4.3439F, -2.0633F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.3397F, 2.5677F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6F, -1.2F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.5F, -0.0005F, 1.1644F, -0.2356F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offset(-0.1F, 4.3439F, -2.0633F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.3397F, 2.5677F, 0.5672F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6F, -1.2F, -0.2182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 84, 84);
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