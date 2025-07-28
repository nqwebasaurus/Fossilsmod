package fossils.fossils.client.blockentity.model.mixosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MixosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Mixosaurus;
	private final ModelPart Body1;
	private final ModelPart chest;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart leftFace2;
	private final ModelPart Jaw;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart ForelimbsL;
	private final ModelPart ForelimbsL2;
	private final ModelPart Body2;
	private final ModelPart Body3;
	private final ModelPart Body4;
	private final ModelPart Body5;
	private final ModelPart HindlimbsL;
	private final ModelPart HindlimbsL2;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart Tail1;
	private final ModelPart tail4;
	private final ModelPart tail3;
	private final ModelPart bone;
	private final ModelPart bone4;

	public MixosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Mixosaurus = this.fossil.getChild("Mixosaurus");
		this.Body1 = this.Mixosaurus.getChild("Body1");
		this.chest = this.Body1.getChild("chest");
		this.Head = this.chest.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.leftFace2 = this.Head.getChild("leftFace2");
		this.Jaw = this.Head.getChild("Jaw");
		this.bone2 = this.Body1.getChild("bone2");
		this.bone3 = this.Body1.getChild("bone3");
		this.ForelimbsL = this.Body1.getChild("ForelimbsL");
		this.ForelimbsL2 = this.Body1.getChild("ForelimbsL2");
		this.Body2 = this.Body1.getChild("Body2");
		this.Body3 = this.Body2.getChild("Body3");
		this.Body4 = this.Body3.getChild("Body4");
		this.Body5 = this.Body4.getChild("Body5");
		this.HindlimbsL = this.Body5.getChild("HindlimbsL");
		this.HindlimbsL2 = this.Body5.getChild("HindlimbsL2");
		this.tail = this.Body5.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.Tail1 = this.tail2.getChild("Tail1");
		this.tail4 = this.Tail1.getChild("tail4");
		this.tail3 = this.tail4.getChild("tail3");
		this.bone = this.Body5.getChild("bone");
		this.bone4 = this.Body5.getChild("bone4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Mixosaurus = fossil.addOrReplaceChild("Mixosaurus", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -10.6F, -4.7F, 0.1106F, 0.0F, 0.0F));

		PartDefinition Body1 = Mixosaurus.addOrReplaceChild("Body1", CubeListBuilder.create(), PartPose.offset(-1.0F, 1.0F, -7.0F));

		PartDefinition cube_r1 = Body1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(48, 29).addBox(-0.5F, 0.4878F, 0.8844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(47, 28).addBox(-0.5F, 0.4878F, -0.6156F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -1.9F, 4.1F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Body1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 47).addBox(-0.5F, 0.3F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -1.3F, 2.4F, 0.2618F, 0.0F, 0.0F));

		PartDefinition chest = Body1.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2008F, 2.5174F, 0.088F, 0.1304F, 0.0115F));

		PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 6).addBox(-1.05F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 3.2317F, -0.6183F, 1.7037F, -0.173F, -1.5938F));

		PartDefinition cube_r4 = chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 7).addBox(-0.425F, -0.5F, -0.95F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.26F)), PartPose.offsetAndRotation(0.0F, 3.2317F, -0.6183F, 1.3963F, -0.1309F, 0.0F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 6).addBox(-0.5F, -0.2F, -2.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 1.4F, -2.5F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Head = chest.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6317F, -3.8176F, -0.0436F, 0.48F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.9F, -0.0595F, -0.2601F));

		PartDefinition leftFace2 = Head.addOrReplaceChild("leftFace2", CubeListBuilder.create(), PartPose.offset(-0.9F, -0.0595F, -0.2601F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1456F, -0.2358F, 0.5323F, 0.0F, 0.0F));

		PartDefinition bone2 = Body1.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4F, 1.2148F, 1.347F, 0.0F, 0.1309F, -0.2182F));

		PartDefinition bone3 = Body1.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4F, 1.2148F, 1.347F, 0.0F, -0.1309F, 0.2182F));

		PartDefinition ForelimbsL = Body1.addOrReplaceChild("ForelimbsL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3404F, 1.9694F, 2.0419F, -0.1598F, -0.017F, -0.3767F));

		PartDefinition ForelimbsL2 = Body1.addOrReplaceChild("ForelimbsL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3404F, 1.9694F, 2.0419F, -0.159F, 0.0239F, 0.4198F));

		PartDefinition Body2 = Body1.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7228F, 5.5026F, 0.1571F, -0.3054F, 0.0F));

		PartDefinition cube_r6 = Body2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(11, 24).addBox(-0.5F, 0.2F, 0.025F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -0.0105F, -0.0495F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Body3 = Body2.addOrReplaceChild("Body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5582F, 3.6772F, -0.1373F, -0.1729F, 0.0238F));

		PartDefinition cube_r7 = Body3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(27, 21).addBox(-0.5F, -0.1F, 3.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(24, 18).addBox(-0.5F, -0.1F, -0.075F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.2622F, -0.2086F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Body4 = Body3.addOrReplaceChild("Body4", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, 0.112F, -0.0744F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.4108F, 3.7152F, -0.0654F, -0.2618F, 0.0F));

		PartDefinition Body5 = Body4.addOrReplaceChild("Body5", CubeListBuilder.create().texOffs(18, 33).addBox(-0.5F, 0.1878F, -0.2996F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -0.0804F, 3.6258F, 0.0352F, -0.1308F, -0.0046F));

		PartDefinition cube_r8 = Body5.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(17, 32).addBox(-0.2F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 1.6878F, 2.5004F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r9 = Body5.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(19, 34).addBox(-0.5F, -1.5F, -0.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.26F)), PartPose.offsetAndRotation(0.0F, 0.6878F, 1.5004F, -1.5708F, 0.0F, 0.0F));

		PartDefinition HindlimbsL = Body5.addOrReplaceChild("HindlimbsL", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5359F, 1.7953F, 2.7329F, 0.3509F, 0.1472F, 0.1374F));

		PartDefinition HindlimbsL2 = Body5.addOrReplaceChild("HindlimbsL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5359F, 1.7953F, 2.7329F, 0.3509F, -0.1472F, -0.1374F));

		PartDefinition tail = Body5.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(35, 0).addBox(-0.5F, 0.0796F, -0.4448F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F))
				.texOffs(37, 2).addBox(-0.5F, 0.0796F, 2.0552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.0934F, 2.6701F, -0.0262F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, 0.097F, -0.2482F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -0.0152F, 2.7303F, 0.0F, -0.3927F, 0.0F));

		PartDefinition Tail1 = tail2.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0428F, 4.6948F, 0.0785F, -0.3927F, 0.0F));

		PartDefinition cube_r10 = Tail1.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(18, 3).addBox(-0.5F, 1.6F, 3.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(15, 0).addBox(-0.5F, 1.6F, -0.475F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -1.3267F, 0.575F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail4 = Tail1.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2983F, 3.375F, 0.0647F, 0.0862F, 0.0323F));

		PartDefinition cube_r11 = tail4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(13, 18).addBox(-0.5F, 0.0958F, -0.1076F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2967F, 0.0F, 0.0F));

		PartDefinition tail3 = tail4.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.025F, 0.95F, 3.475F, 0.047F, 0.3481F, 0.0442F));

		PartDefinition cube_r12 = tail3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(13, 6).addBox(-0.4526F, 0.183F, -0.4804F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone = Body5.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.962F, 1.8748F, 2.3574F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone4 = Body5.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.962F, 1.8748F, 2.3574F, 0.1745F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 77, 77);
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