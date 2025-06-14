package fossils.fossils.client.blockentity.model.ctenochasma;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CtenochasmaFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart body1;
	private final ModelPart leftleg;
	private final ModelPart leftleg2;
	private final ModelPart leftleg3;
	private final ModelPart rightleg;
	private final ModelPart rightleg2;
	private final ModelPart rightleg3;
	private final ModelPart tail;
	private final ModelPart chest;
	private final ModelPart leftwing6;
	private final ModelPart leftwing7;
	private final ModelPart leftwing8;
	private final ModelPart leftmembrane;
	private final ModelPart lefthand;
	private final ModelPart rightwing6;
	private final ModelPart rightwing7;
	private final ModelPart rightwing8;
	private final ModelPart rightmembrane;
	private final ModelPart righthand;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftHead;
	private final ModelPart rightHead;

	public CtenochasmaFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.body1 = this.root.getChild("body1");
		this.leftleg = this.body1.getChild("leftleg");
		this.leftleg2 = this.leftleg.getChild("leftleg2");
		this.leftleg3 = this.leftleg2.getChild("leftleg3");
		this.rightleg = this.body1.getChild("rightleg");
		this.rightleg2 = this.rightleg.getChild("rightleg2");
		this.rightleg3 = this.rightleg2.getChild("rightleg3");
		this.tail = this.body1.getChild("tail");
		this.chest = this.root.getChild("chest");
		this.leftwing6 = this.chest.getChild("leftwing6");
		this.leftwing7 = this.leftwing6.getChild("leftwing7");
		this.leftwing8 = this.leftwing7.getChild("leftwing8");
		this.leftmembrane = this.leftwing8.getChild("leftmembrane");
		this.lefthand = this.leftwing8.getChild("lefthand");
		this.rightwing6 = this.chest.getChild("rightwing6");
		this.rightwing7 = this.rightwing6.getChild("rightwing7");
		this.rightwing8 = this.rightwing7.getChild("rightwing8");
		this.rightmembrane = this.rightwing8.getChild("rightmembrane");
		this.righthand = this.rightwing8.getChild("righthand");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.leftHead = this.head.getChild("leftHead");
		this.rightHead = this.head.getChild("rightHead");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.0F, 1.1F, 0.4974F, 0.0F, 0.0F));

		PartDefinition body1 = root.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.25F, 1.75F, -0.2456F, 0.2543F, -0.063F));

		PartDefinition body3_r1 = body1.addOrReplaceChild("body3_r1", CubeListBuilder.create().texOffs(-2, 42).addBox(-0.4F, -0.1F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.3515F, 0.5304F, -1.5708F, -1.2915F, 1.5708F));

		PartDefinition body2_r1 = body1.addOrReplaceChild("body2_r1", CubeListBuilder.create().texOffs(0, 44).addBox(-0.5F, 0.1052F, -0.5203F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.7898F, 0.1974F, -0.2793F, 0.0F, 0.0F));

		PartDefinition leftleg = body1.addOrReplaceChild("leftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -1.05F, 0.8F, 0.5633F, -0.0702F, -1.242F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0276F, 1.6927F, -0.4558F, 0.4808F, -0.2184F, 0.1965F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0694F, 3.4345F, -0.0498F, 1.2162F, 0.2407F, 0.2122F));

		PartDefinition rightleg = body1.addOrReplaceChild("rightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -1.05F, 0.8F, 0.5633F, 0.0702F, 1.242F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0276F, 1.6927F, -0.4558F, 0.4808F, 0.2184F, -0.1965F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0694F, 3.4345F, -0.0498F, 1.2162F, -0.2407F, -0.2122F));

		PartDefinition tail = body1.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(58, 41).addBox(-0.5F, 0.1F, 0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(0.0F, -1.425F, 1.8F, -0.2633F, 0.2615F, -0.0117F));

		PartDefinition cube_r1 = tail.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(7, 41).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2F, 0.6F, -0.55F, 0.0F, -0.1396F, 0.0F));

		PartDefinition chest = root.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, 2.05F, 0.0418F, 0.3917F, -0.0123F));

		PartDefinition chest_r1 = chest.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(25, 19).addBox(0.0F, 0.1246F, -0.3133F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-0.5F, -0.8898F, -2.1305F, -0.3403F, 0.0F, 0.0F));

		PartDefinition chest_r2 = chest.addOrReplaceChild("chest_r2", CubeListBuilder.create().texOffs(-2, 25).addBox(-1.3F, -0.4F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.442F, -3.5141F, -1.5708F, -1.4399F, 1.5708F));

		PartDefinition chest_r3 = chest.addOrReplaceChild("chest_r3", CubeListBuilder.create().texOffs(0, 27).addBox(0.0F, -0.4131F, -0.2617F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5F, -0.6898F, -4.7305F, -0.1309F, 0.0F, 0.0F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -0.442F, -3.5141F));

		PartDefinition leftwing6 = chest.addOrReplaceChild("leftwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4F, -0.45F, -3.8F, -0.2622F, -0.1731F, -0.2911F));

		PartDefinition leftwing7 = leftwing6.addOrReplaceChild("leftwing7", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9F, -0.1F, -0.7F, -0.0126F, 0.2245F, -0.0662F));

		PartDefinition leftwing8 = leftwing7.addOrReplaceChild("leftwing8", CubeListBuilder.create(), PartPose.offsetAndRotation(6.493F, 0.5826F, -0.2007F, -3.0893F, 0.2525F, -2.9859F));

		PartDefinition leftmembrane = leftwing8.addOrReplaceChild("leftmembrane", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.75F, 0.0F, -0.5F, 0.0041F, -0.2525F, -0.0801F));

		PartDefinition lefthand = leftwing8.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.0F, -0.25F, 0.0922F, 0.0606F, 0.0084F));

		PartDefinition rightwing6 = chest.addOrReplaceChild("rightwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4F, -0.45F, -3.8F, -0.2876F, 0.1256F, 0.1212F));

		PartDefinition rightwing7 = rightwing6.addOrReplaceChild("rightwing7", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9F, -0.1F, -0.7F, -0.0126F, -0.2245F, 0.0662F));

		PartDefinition rightwing8 = rightwing7.addOrReplaceChild("rightwing8", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.493F, 0.5826F, -0.2007F, -3.0893F, -0.2525F, 2.9859F));

		PartDefinition rightmembrane = rightwing8.addOrReplaceChild("rightmembrane", CubeListBuilder.create(), PartPose.offsetAndRotation(4.75F, 0.0F, -0.5F, 0.0041F, 0.2525F, 0.0801F));

		PartDefinition righthand = rightwing8.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.0F, -0.25F, 0.0922F, -0.0606F, -0.0084F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(42, 14).addBox(-0.5F, -0.011F, -2.0302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(43, 15).addBox(-0.5F, -0.011F, -0.6302F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.1398F, -4.6805F, -0.1294F, 0.2615F, 0.0117F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0862F, -1.4431F, -0.0982F, 0.1261F, -0.0352F));

		PartDefinition cube_r2 = neck2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(32, 21).addBox(-0.5F, 0.0131F, -0.3955F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.4186F, -2.3315F, -0.1396F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3186F, -2.4315F, 0.2242F, 0.2577F, 0.0465F));

		PartDefinition cube_r3 = neck3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(-2, 31).addBox(-0.5F, 0.2F, -0.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.7F, -2.2F, -0.5411F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.35F, -2.05F, 0.2182F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1459F, -0.6076F, 0.3142F, 0.0F, 0.0F));

		PartDefinition leftHead = head.addOrReplaceChild("leftHead", CubeListBuilder.create(), PartPose.offset(0.2F, 0.5172F, -7.2542F));

		PartDefinition rightHead = head.addOrReplaceChild("rightHead", CubeListBuilder.create(), PartPose.offset(-0.2F, 0.5172F, -7.2542F));

		return LayerDefinition.create(meshdefinition, 65, 65);
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