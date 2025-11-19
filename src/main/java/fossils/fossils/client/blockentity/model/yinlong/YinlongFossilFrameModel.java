package fossils.fossils.client.blockentity.model.yinlong;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class YinlongFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart leftleg;
	private final ModelPart leftleg2;
	private final ModelPart leftleg3;
	private final ModelPart leftleg4;
	private final ModelPart leftleg5;
	private final ModelPart rightleg;
	private final ModelPart rightleg2;
	private final ModelPart rightleg3;
	private final ModelPart rightleg4;
	private final ModelPart rightleg5;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart chest;
	private final ModelPart chest2;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck4;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftface;
	private final ModelPart rightface;
	private final ModelPart jaw;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftarm3;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightarm3;
	private final ModelPart tail;
	private final ModelPart tail8;
	private final ModelPart tail2;
	private final ModelPart tail6;
	private final ModelPart tail3;
	private final ModelPart tail7;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail9;

	public YinlongFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone4 = this.hips.getChild("bone4");
		this.leftleg = this.hips.getChild("leftleg");
		this.leftleg2 = this.leftleg.getChild("leftleg2");
		this.leftleg3 = this.leftleg2.getChild("leftleg3");
		this.leftleg4 = this.leftleg3.getChild("leftleg4");
		this.leftleg5 = this.leftleg4.getChild("leftleg5");
		this.rightleg = this.hips.getChild("rightleg");
		this.rightleg2 = this.rightleg.getChild("rightleg2");
		this.rightleg3 = this.rightleg2.getChild("rightleg3");
		this.rightleg4 = this.rightleg3.getChild("rightleg4");
		this.rightleg5 = this.rightleg4.getChild("rightleg5");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.chest = this.body2.getChild("chest");
		this.chest2 = this.chest.getChild("chest2");
		this.neck3 = this.chest2.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck4 = this.neck2.getChild("neck4");
		this.neck = this.neck4.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftface = this.head.getChild("leftface");
		this.rightface = this.head.getChild("rightface");
		this.jaw = this.head.getChild("jaw");
		this.bone2 = this.chest.getChild("bone2");
		this.bone3 = this.chest.getChild("bone3");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftarm3 = this.leftarm2.getChild("leftarm3");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightarm3 = this.rightarm2.getChild("rightarm3");
		this.tail = this.hips.getChild("tail");
		this.tail8 = this.tail.getChild("tail8");
		this.tail2 = this.tail8.getChild("tail2");
		this.tail6 = this.tail2.getChild("tail6");
		this.tail3 = this.tail6.getChild("tail3");
		this.tail7 = this.tail3.getChild("tail7");
		this.tail4 = this.tail7.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail9 = this.tail5.getChild("tail9");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -25.0F, 3.825F, 1.0F, 25.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -5.9F, -0.5F, 1.0F, 23.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -17.1F, -9.7F, 0.0F, 0.1571F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-2.7F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -17.1F, -9.7F, 0.1571F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-9.9F, -3.6F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -15.5F, 4.325F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -24.4976F, 4.8698F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(5, 5).addBox(-1.0F, 0.7F, 5.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 0).addBox(-1.0F, 0.7F, -0.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -1.8F, -2.8F, -0.1222F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.9F, 0.2435F, 0.4505F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-1.9F, -0.7541F, 0.5203F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2F, -0.2183F, 0.0374F, -1.3509F, -0.0736F, -0.047F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.8971F, 2.505F, 1.7017F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.5022F, 0.362F, -0.4102F, 0.0F, 0.0F));

		PartDefinition leftleg4 = leftleg3.addOrReplaceChild("leftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 4.0762F, 0.0703F, 0.4189F, 0.0F, 0.0F));

		PartDefinition leftleg5 = leftleg4.addOrReplaceChild("leftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -1.8F, -0.0175F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2F, -0.2183F, 0.0374F, -1.2327F, -0.0886F, 0.2467F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.8971F, 2.505F, 2.5884F, 0.1198F, 0.2333F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.5022F, 0.362F, -0.7765F, -0.1889F, 0.1824F));

		PartDefinition rightleg4 = rightleg3.addOrReplaceChild("rightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 4.0762F, 0.0703F, 1.117F, 0.0F, 0.0F));

		PartDefinition rightleg5 = rightleg4.addOrReplaceChild("rightleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -1.8F, -0.0175F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3245F, -2.9952F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(11, 39).addBox(-1.0F, 0.2F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -1.4538F, -2.3822F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(15, 0).addBox(-1.0F, 0.686F, -4.9763F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.8538F, 0.0072F, 0.2007F, 0.0F, 0.0F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 1.2504F, -4.9092F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(36, 9).addBox(-1.0F, -0.2916F, 3.4687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(33, 6).addBox(-1.0F, -0.2916F, -0.2313F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 3.4976F, -3.2697F, 0.5061F, 0.0F, 0.0F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7981F, -3.6412F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r8 = chest2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(52, 50).addBox(-1.0F, -0.3F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 2.3976F, -1.7698F, 0.3665F, 0.0F, 0.0F));

		PartDefinition neck3 = chest2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.8646F, -1.6621F));

		PartDefinition cube_r9 = neck3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(55, 46).addBox(-1.0F, -0.3F, 2.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(54, 45).addBox(-1.0F, -0.3F, 0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.9976F, -3.0698F, -0.1745F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0164F, -2.2286F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r10 = neck2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(39, 12).addBox(-0.5F, 0.6F, 0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.5024F, -1.7698F, -0.7505F, 0.0F, 0.0F));

		PartDefinition neck4 = neck2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4628F, -2.2113F, -1.8131F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r11 = neck4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(53, 54).addBox(-0.5F, 0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4628F, 0.6402F, -0.7361F, -0.2618F, 0.0F, 0.0F));

		PartDefinition neck = neck4.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4628F, -0.5845F, -1.6958F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r12 = neck.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(23, 53).addBox(-0.5F, 0.5015F, -3.0751F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.2247F, 0.9597F, -0.2618F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2888F, -1.7432F, -0.2566F, 0.056F, 0.2538F));

		PartDefinition leftface = head.addOrReplaceChild("leftface", CubeListBuilder.create(), PartPose.offset(0.2373F, 4.7351F, -7.6352F));

		PartDefinition rightface = head.addOrReplaceChild("rightface", CubeListBuilder.create(), PartPose.offset(-0.2373F, 4.7351F, -7.6352F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5784F, 2.2668F, 0.4276F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2F, 2.8367F, -2.0398F, 0.1833F, 0.0F, 0.0F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, 2.8367F, -2.0398F, 0.1833F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.7345F, 5.9403F, -2.452F, -1.1073F, 0.171F, -0.0778F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.262F, -1.2887F, 3.6841F, 0.48F, 0.0F, 0.0F));

		PartDefinition leftarm3 = leftarm2.addOrReplaceChild("leftarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 3.7715F, -0.2819F, 0.0F, 0.0F, 0.4363F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7345F, 5.9403F, -2.452F, 0.1581F, -0.171F, 0.0778F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.262F, -1.2887F, 3.6841F, -0.2182F, 0.0F, 0.0F));

		PartDefinition rightarm3 = rightarm2.addOrReplaceChild("rightarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 3.7715F, -0.2819F, 0.0F, 0.0F, -0.4363F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(15, 14).addBox(-0.5F, 0.3F, -0.175F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6661F, 3.1153F, -0.0785F, 0.0F, 0.0F));

		PartDefinition tail8 = tail.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(15, 7).addBox(-0.5F, 0.3F, -0.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(19, 11).addBox(-0.5F, 0.3F, 4.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0076F, -0.0177F, -0.0871F, 0.0053F));

		PartDefinition tail2 = tail8.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(11, 33).addBox(-0.5F, 0.3F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0033F, 4.8628F, 0.1924F, -0.0868F, -0.0091F));

		PartDefinition tail6 = tail2.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(28, 12).addBox(-0.5F, 0.3F, -0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(31, 15).addBox(-0.5F, 0.3F, 3.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0039F, 3.9251F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail3 = tail6.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(13, 27).addBox(-0.5F, 0.3F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0191F, 3.9018F, 0.1747F, -0.043F, -0.0076F));

		PartDefinition tail7 = tail3.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(35, 31).addBox(-0.5F, 0.3F, -0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(38, 34).addBox(-0.5F, 0.3F, 3.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition tail4 = tail7.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(24, 31).addBox(-0.5F, 0.3F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0111F, 4.0012F, -0.0615F, -0.0868F, 0.0091F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 32).addBox(-0.5F, 0.3F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.04F, 3.9299F, -0.1488F, -0.0868F, 0.0091F));

		PartDefinition tail9 = tail5.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0379F, 3.8638F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r13 = tail9.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, 0.3F, -0.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0437F, -0.0436F, 0.0019F));

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