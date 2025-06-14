package fossils.fossils.client.blockentity.model.lusovenator;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LusovenatorFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
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

	public LusovenatorFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, -6.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-2.0F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-6.5F, 7.0F, -18.5F, -0.2618F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 27.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-6.5F, 7.0F, -18.5F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(6.0F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 7.0F, 1.9F, -0.3054F, 0.0F, -1.5708F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 1).addBox(-0.1F, -8.0F, -0.5F, 1.0F, 31.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.5F, 7.0F, 1.9F, 0.0F, 0.3054F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, 2.0F, -0.0903F, 0.2608F, -0.0233F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, 1.0F, 0.0F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7F, -5.45F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(25, 1).addBox(-0.5F, 0.2728F, -0.0515F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.4F, 7.3F, 0.0948F, -0.079F, -0.0948F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(-1, 28).addBox(-0.5F, 0.45F, -0.4F, 1.0F, 2.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1272F, 11.9485F, 0.1274F, -0.294F, -0.1209F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(25, 32).addBox(-0.5F, 0.05F, -0.2F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.25F, 11.0F, -0.065F, -0.1839F, -0.1173F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(39, 35).addBox(-0.5F, 0.4535F, -0.2277F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.35F, 9.9F, -0.1439F, -0.1358F, -0.0241F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, 0.4326F, -0.1872F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0465F, 8.8723F, -0.3335F, 0.248F, -0.0848F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(42, 0).addBox(-0.5F, 0.3684F, -0.3028F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1326F, 7.8128F, -0.3512F, 0.3293F, -0.1179F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9F, -5.2F, 0.3503F, 0.082F, 0.0299F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(18, 16).addBox(-0.5F, 0.0F, -7.5F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.1102F, -5.4697F, -0.0524F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(26, 45).addBox(-0.5F, -0.1236F, -5.7348F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2602F, -12.9697F, 0.1752F, -0.0859F, -0.0152F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 4.8264F, -6.7348F, 0.3491F, 0.3491F, -0.0436F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.5F, 0.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 4.5F, 0.8F, 0.0F, 0.0F, 0.48F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 4.8264F, -6.7348F, -0.4034F, -0.2267F, 0.385F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.5F, 0.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 4.5F, 0.8F, 0.0F, 0.0F, -0.6109F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4736F, -5.6848F, -0.6584F, -0.1103F, 0.0706F));

		PartDefinition cube_r7 = neck.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(64, -1).addBox(-0.5F, -0.0295F, -4.942F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1208F, 0.1209F, 0.3142F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1708F, -4.3791F, -0.4391F, -0.123F, 0.045F));

		PartDefinition cube_r8 = neck2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(-1, 62).addBox(-0.5F, -0.3F, -5.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6124F, 0.076F, 0.0524F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(75, 35).addBox(-0.5F, 0.1872F, -3.0845F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3624F, -4.774F, 0.1578F, -0.2467F, -0.1241F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(73, 0).addBox(-0.5F, 0.134F, -2.7794F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0872F, -3.0345F, 0.5509F, -0.3007F, -0.18F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.034F, -2.6794F, 0.0875F, -0.0831F, -0.0511F));

		PartDefinition HEADPART = head.addOrReplaceChild("HEADPART", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.6223F, -2.9663F, 0.1833F, 0.0F, 0.0F));

		PartDefinition HEADPART2 = HEADPART.addOrReplaceChild("HEADPART2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.95F, 0.2618F, 0.0F, 0.0F));

		PartDefinition HEADPART3 = HEADPART2.addOrReplaceChild("HEADPART3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.3665F, 0.0F, 0.0F));

		PartDefinition HEADPART5 = head.addOrReplaceChild("HEADPART5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.8277F, -10.9163F, 0.0436F, 0.0F, 0.0F));

		PartDefinition HEADPART6 = HEADPART5.addOrReplaceChild("HEADPART6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -2.55F, 1.65F, 0.5172F, 0.0757F, 0.245F));

		PartDefinition HEADPART7 = HEADPART6.addOrReplaceChild("HEADPART7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition HEADPART8 = HEADPART7.addOrReplaceChild("HEADPART8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3F, 2.7F, 0.7854F, 0.0F, 0.0F));

		PartDefinition HEADPART4 = HEADPART5.addOrReplaceChild("HEADPART4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, -2.55F, 1.65F, 0.5172F, -0.0757F, -0.245F));

		PartDefinition HEADPART9 = HEADPART4.addOrReplaceChild("HEADPART9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition HEADPART10 = HEADPART9.addOrReplaceChild("HEADPART10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3F, 2.7F, 0.7854F, 0.0F, 0.0F));

		PartDefinition HEADPART12 = HEADPART5.addOrReplaceChild("HEADPART12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.05F, 4.55F, 0.1309F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8777F, 0.8337F, 0.5236F, 0.0F, 0.0F));

		PartDefinition JAWPART = jaw.addOrReplaceChild("JAWPART", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.25F, -3.6F, -0.0436F, 0.0F, 0.0F));

		PartDefinition throat = jaw.addOrReplaceChild("throat", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.75F, -3.8F, -0.0873F, 0.0F, 0.0F));

		PartDefinition throatpouch = throat.addOrReplaceChild("throatpouch", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 2.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition throat2 = throat.addOrReplaceChild("throat2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, -0.6541F, 0.025F, 0.0357F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.0F, 0.0F, 1.2217F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.2627F, 0.1756F, -1.3945F, -0.0715F, -0.0501F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.0F, 0.0F, 1.8326F, 0.0F, 0.0F));

		PartDefinition lefttoes = leftfoot.addOrReplaceChild("lefttoes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0152F, -1.2764F, 0.48F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, -0.0435F, -0.0038F, -0.0872F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.0F, 0.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.2627F, 0.1756F, -0.7376F, 0.0795F, 0.1041F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition righttoes = rightfoot.addOrReplaceChild("righttoes", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0152F, -1.1764F));

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