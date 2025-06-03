package fossils.fossils.client.blockentity.model.neovenator;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class NeovenatorFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart lefthand;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart righthand;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart HEADPART;
	private final ModelPart HEADPART2;
	private final ModelPart HEADPART3;
	private final ModelPart HEADPART5;
	private final ModelPart HEADPART6;
	private final ModelPart HEADPART7;
	private final ModelPart HEADPART8;
	private final ModelPart HEADPART4;
	private final ModelPart HEADPART9;
	private final ModelPart HEADPART10;
	private final ModelPart HEADPART12;
	private final ModelPart jaw;
	private final ModelPart JAWPART;
	private final ModelPart throat;
	private final ModelPart throatpouch;
	private final ModelPart throat2;
	private final ModelPart leftleg;
	private final ModelPart leftleg2;
	private final ModelPart leftleg3;
	private final ModelPart leftfoot;
	private final ModelPart lefttoes;
	private final ModelPart rightleg;
	private final ModelPart rightleg2;
	private final ModelPart rightleg3;
	private final ModelPart rightfoot;
	private final ModelPart righttoes;

	public NeovenatorFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.lefthand = this.leftarm2.getChild("lefthand");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.righthand = this.rightarm2.getChild("righthand");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.HEADPART = this.head.getChild("HEADPART");
		this.HEADPART2 = this.HEADPART.getChild("HEADPART2");
		this.HEADPART3 = this.HEADPART2.getChild("HEADPART3");
		this.HEADPART5 = this.head.getChild("HEADPART5");
		this.HEADPART6 = this.HEADPART5.getChild("HEADPART6");
		this.HEADPART7 = this.HEADPART6.getChild("HEADPART7");
		this.HEADPART8 = this.HEADPART7.getChild("HEADPART8");
		this.HEADPART4 = this.HEADPART5.getChild("HEADPART4");
		this.HEADPART9 = this.HEADPART4.getChild("HEADPART9");
		this.HEADPART10 = this.HEADPART9.getChild("HEADPART10");
		this.HEADPART12 = this.HEADPART5.getChild("HEADPART12");
		this.jaw = this.head.getChild("jaw");
		this.JAWPART = this.jaw.getChild("JAWPART");
		this.throat = this.jaw.getChild("throat");
		this.throatpouch = this.throat.getChild("throatpouch");
		this.throat2 = this.throat.getChild("throat2");
		this.leftleg = this.hips.getChild("leftleg");
		this.leftleg2 = this.leftleg.getChild("leftleg2");
		this.leftleg3 = this.leftleg2.getChild("leftleg3");
		this.leftfoot = this.leftleg3.getChild("leftfoot");
		this.lefttoes = this.leftfoot.getChild("lefttoes");
		this.rightleg = this.hips.getChild("rightleg");
		this.rightleg2 = this.rightleg.getChild("rightleg2");
		this.rightleg3 = this.rightleg2.getChild("rightleg3");
		this.rightfoot = this.rightleg3.getChild("rightfoot");
		this.righttoes = this.rightfoot.getChild("righttoes");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.4F, -2.2F, -3.8F, 1.0F, 25.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 1.2F, -2.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-1.1F, -5.5F, -0.5F, 1.0F, 24.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(5.5F, 4.3F, -22.5F, 0.0F, -0.5061F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(5.5F, 4.3F, -22.5F, -0.5061F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-7.1F, -3.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 4.3F, -3.3F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4318F, -2.5073F, -0.1744F, 0.0076F, 0.043F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(26, 44).addBox(-0.5F, 1.0F, 0.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7F, -5.45F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(32, 16).addBox(-0.5F, 0.9254F, 4.9057F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.4F, 2.3F, 0.1262F, -0.1354F, 0.0265F));

		PartDefinition cube_r5 = tail.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(20, 61).addBox(-0.5F, 0.5533F, -4.7922F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3526F, 5.0072F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(31, 31).addBox(-0.5F, 0.25F, -0.3F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5254F, 16.9057F, 0.0785F, -0.0034F, 0.0435F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(41, 0).addBox(-0.5F, 0.05F, -0.6F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.25F, 11.0F, -0.0447F, -0.218F, 0.0097F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 45).addBox(-0.5F, 0.4535F, -0.5277F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.35F, 9.9F, -0.2803F, -0.5065F, 0.1388F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 32).addBox(-0.5F, 0.5326F, -0.3872F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0465F, 8.8723F, -0.3374F, -0.2892F, 0.0997F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9F, -5.2F, 0.2454F, -0.2446F, -0.1039F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, 0.0F, -7.5F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.1102F, -5.4697F, -0.0524F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(61, 12).addBox(-0.5F, -0.1236F, -4.7348F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.2602F, -12.9697F, 0.1625F, -0.2585F, -0.0419F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6569F, 6.1023F, -4.7122F, 0.5021F, 0.342F, 0.0834F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.1F, -0.2F, -1.0554F, -1.0446F, -0.508F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8007F, 3.5463F, 0.8F, 0.0F, 0.0F, 0.3054F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6569F, 6.1023F, -4.7122F, 0.3275F, -0.342F, -0.0834F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.1F, -0.2F, -1.1195F, 0.9672F, 0.4322F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8007F, 3.5463F, 0.8F, 0.0F, 0.0F, -0.3054F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8067F, -4.7591F, -0.7984F, -0.0916F, 0.0936F));

		PartDefinition cube_r7 = neck.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(74, 15).addBox(-0.5F, -0.0295F, -4.442F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3055F, 0.4757F, 0.3143F, -0.0332F, -0.0108F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0555F, -3.0243F, 0.1099F, -0.3335F, -0.1677F));

		PartDefinition cube_r8 = neck2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(60, 20).addBox(-0.5F, 0.114F, -0.3082F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6124F, -5.924F, 0.0524F, -0.0174F, -0.0009F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(90, 64).addBox(-0.5F, 0.2872F, -2.0845F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4247F, -5.78F, 0.0349F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(79, 81).addBox(-0.5F, 0.234F, -2.8794F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0872F, -2.0345F, 0.4498F, -0.2368F, -0.1128F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.3418F, -2.9517F, 0.287F, -0.2421F, -0.287F));

		PartDefinition HEADPART = head.addOrReplaceChild("HEADPART", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5265F, -1.9709F, 0.1833F, 0.0F, 0.0F));

		PartDefinition HEADPART2 = HEADPART.addOrReplaceChild("HEADPART2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.95F, 0.2618F, 0.0F, 0.0F));

		PartDefinition HEADPART3 = HEADPART2.addOrReplaceChild("HEADPART3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.3665F, 0.0F, 0.0F));

		PartDefinition HEADPART5 = head.addOrReplaceChild("HEADPART5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9235F, -9.9209F, 0.0436F, 0.0F, 0.0F));

		PartDefinition HEADPART6 = HEADPART5.addOrReplaceChild("HEADPART6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8448F, 1.0526F, 0.5849F, 0.0876F, 0.1996F));

		PartDefinition HEADPART7 = HEADPART6.addOrReplaceChild("HEADPART7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition HEADPART8 = HEADPART7.addOrReplaceChild("HEADPART8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1181F, -0.2647F, 2.1783F, 1.0396F, 0.2305F, 0.3008F));

		PartDefinition HEADPART4 = HEADPART5.addOrReplaceChild("HEADPART4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -1.8448F, 1.0526F, 0.5849F, -0.0876F, -0.1996F));

		PartDefinition HEADPART9 = HEADPART4.addOrReplaceChild("HEADPART9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition HEADPART10 = HEADPART9.addOrReplaceChild("HEADPART10", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1181F, -0.2647F, 2.1783F, 1.0396F, -0.2305F, -0.3008F));

		PartDefinition HEADPART12 = HEADPART5.addOrReplaceChild("HEADPART12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.05F, 4.55F, 0.1309F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8274F, 1.3581F, 0.637F, 0.0F, 0.0F));

		PartDefinition JAWPART = jaw.addOrReplaceChild("JAWPART", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4413F, -4.0619F, -0.0436F, 0.0F, 0.0F));

		PartDefinition throat = jaw.addOrReplaceChild("throat", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5587F, -4.2619F, -0.0873F, 0.0F, 0.0F));

		PartDefinition throatpouch = throat.addOrReplaceChild("throatpouch", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 2.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition throat2 = throat.addOrReplaceChild("throat2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, -1.8936F, -1.1868F, 0.1482F, 0.0064F, -0.0432F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.7374F, 0.0771F, 0.8029F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 11.6094F, 0.7265F, -0.8203F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.7238F, -0.0067F, 0.2182F, 0.0F, 0.0F));

		PartDefinition lefttoes = leftfoot.addOrReplaceChild("lefttoes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1585F, -2.2612F, -0.1745F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, -1.8936F, -1.1868F, -0.8618F, 0.1902F, 0.0525F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.7374F, 0.0771F, 1.5882F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 11.6094F, 0.7265F, -1.0821F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.7238F, -0.0067F, 1.0036F, 0.0F, 0.0F));

		PartDefinition righttoes = rightfoot.addOrReplaceChild("righttoes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1585F, -2.2612F, 0.5236F, 0.0F, 0.0F));

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