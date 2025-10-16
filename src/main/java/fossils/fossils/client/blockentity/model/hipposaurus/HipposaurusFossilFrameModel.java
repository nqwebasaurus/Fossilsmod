package fossils.fossils.client.blockentity.model.hipposaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HipposaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart proburnetia;
	private final ModelPart main;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart scapula;
	private final ModelPart scapula2;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;
	private final ModelPart RFrontLeg2;
	private final ModelPart LowerRFrontLeg2;
	private final ModelPart RFrontFoot2;
	private final ModelPart RFrontFoot3;
	private final ModelPart RFrontLeg3;
	private final ModelPart LowerRFrontLeg3;
	private final ModelPart RFrontFoot4;
	private final ModelPart RFrontFoot5;
	private final ModelPart sacrum;
	private final ModelPart sacrum2;
	private final ModelPart RBackLeg2;
	private final ModelPart LowerRBackLeg2;
	private final ModelPart RBackFoot2;
	private final ModelPart RBackFoot3;
	private final ModelPart RBackLeg3;
	private final ModelPart LowerRBackLeg3;
	private final ModelPart RBackFoot4;
	private final ModelPart RBackFoot5;
	private final ModelPart Tail;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;

	public HipposaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.proburnetia = this.fossil.getChild("proburnetia");
		this.main = this.proburnetia.getChild("main");
		this.body = this.main.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.scapula = this.chest.getChild("scapula");
		this.scapula2 = this.chest.getChild("scapula2");
		this.Neck2 = this.chest.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.Head = this.Neck4.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
		this.RFrontLeg2 = this.chest.getChild("RFrontLeg2");
		this.LowerRFrontLeg2 = this.RFrontLeg2.getChild("LowerRFrontLeg2");
		this.RFrontFoot2 = this.LowerRFrontLeg2.getChild("RFrontFoot2");
		this.RFrontFoot3 = this.RFrontFoot2.getChild("RFrontFoot3");
		this.RFrontLeg3 = this.chest.getChild("RFrontLeg3");
		this.LowerRFrontLeg3 = this.RFrontLeg3.getChild("LowerRFrontLeg3");
		this.RFrontFoot4 = this.LowerRFrontLeg3.getChild("RFrontFoot4");
		this.RFrontFoot5 = this.RFrontFoot4.getChild("RFrontFoot5");
		this.sacrum = this.main.getChild("sacrum");
		this.sacrum2 = this.main.getChild("sacrum2");
		this.RBackLeg2 = this.main.getChild("RBackLeg2");
		this.LowerRBackLeg2 = this.RBackLeg2.getChild("LowerRBackLeg2");
		this.RBackFoot2 = this.LowerRBackLeg2.getChild("RBackFoot2");
		this.RBackFoot3 = this.RBackFoot2.getChild("RBackFoot3");
		this.RBackLeg3 = this.main.getChild("RBackLeg3");
		this.LowerRBackLeg3 = this.RBackLeg3.getChild("LowerRBackLeg3");
		this.RBackFoot4 = this.LowerRBackLeg3.getChild("RBackFoot4");
		this.RBackFoot5 = this.RBackFoot4.getChild("RBackFoot5");
		this.Tail = this.main.getChild("Tail");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(3.9F, -10.5F, -10.6F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-1.3F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.9F, -10.5F, -10.6F, -0.3927F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-0.85F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -10.85F, 8.025F, 0.1047F, 0.0F, 1.5708F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -2.15F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -10.85F, 8.025F, 0.0F, 0.1047F, 0.0F));

		PartDefinition proburnetia = fossil.addOrReplaceChild("proburnetia", CubeListBuilder.create(), PartPose.offset(0.5F, -12.1F, 3.0F));

		PartDefinition main = proburnetia.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.1995F, -3.3105F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r5 = main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, 0.0169F, -0.3056F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.5769F, 7.2014F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = main.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.0186F, 6.9189F, -0.0701F, -0.0871F, 0.0061F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(3, 15).addBox(-0.5F, -0.0792F, 8.9939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 12).addBox(-0.5F, -0.0792F, 4.2939F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -9.6F, -0.0611F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.0406F, -4.9571F, 0.0352F, -0.1308F, -0.0046F));

		PartDefinition cube_r7 = body2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(13, 19).addBox(-0.5F, -0.0792F, -0.4061F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.0406F, -4.6429F, -0.0611F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.3516F, -5.0172F, -0.0175F, -0.0436F, 0.0008F));

		PartDefinition cube_r8 = body3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(13, 12).addBox(-0.5F, 0.4963F, 4.1957F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.8F, -9.0F, 0.1134F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.5202F, -4.8266F, 0.1496F, -0.1295F, -0.0195F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(29, 14).addBox(-0.5F, 0.4963F, 3.3957F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(26, 11).addBox(-0.5F, 0.4963F, -0.3043F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.2499F, -4.0959F, 0.1134F, 0.0F, 0.0F));

		PartDefinition scapula = chest.addOrReplaceChild("scapula", CubeListBuilder.create(), PartPose.offset(-0.2F, 0.5499F, -3.9959F));

		PartDefinition scapula2 = chest.addOrReplaceChild("scapula2", CubeListBuilder.create(), PartPose.offset(-0.8F, 0.5499F, -3.9959F));

		PartDefinition Neck2 = chest.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.5237F, -3.9361F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Neck2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(46, 9).addBox(-0.5F, 0.3648F, 1.4653F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.1F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1324F, -1.5559F, 0.0338F, -0.3908F, -0.0972F));

		PartDefinition cube_r11 = Neck3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(15, 47).addBox(-0.5F, 0.3648F, 2.8653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(14, 46).addBox(-0.5F, 0.3648F, 1.3653F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.5F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1636F, -1.984F, 0.0632F, -0.2613F, -0.0164F));

		PartDefinition cube_r12 = Neck4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(28, 0).addBox(-0.5F, 0.3648F, -0.3347F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.5F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Head = Neck4.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5276F, -3.0519F, 0.3031F, -0.2504F, -0.0773F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9899F, -1.2722F, 0.0383F, 0.0F, -0.0873F, 0.0F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9899F, -1.2722F, 0.0383F, 0.0F, 0.0873F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9656F, -0.2218F, 0.6109F, 0.0F, 0.0F));

		PartDefinition RFrontLeg2 = chest.addOrReplaceChild("RFrontLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0205F, 3.4565F, -3.0777F, 0.913F, -0.0552F, 0.1188F));

		PartDefinition LowerRFrontLeg2 = RFrontLeg2.addOrReplaceChild("LowerRFrontLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.349F, 6.471F, -0.5626F, -0.75F, -0.053F, -0.0491F));

		PartDefinition RFrontFoot2 = LowerRFrontLeg2.addOrReplaceChild("RFrontFoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1459F, 4.5825F, -1.191F, 0.3401F, 0.0182F, -0.0487F));

		PartDefinition RFrontFoot3 = RFrontFoot2.addOrReplaceChild("RFrontFoot3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5649F, -0.9039F, -0.3927F, 0.0F, 0.0F));

		PartDefinition RFrontLeg3 = chest.addOrReplaceChild("RFrontLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0205F, 3.4565F, -3.0777F, -0.1342F, 0.0552F, -0.1188F));

		PartDefinition LowerRFrontLeg3 = RFrontLeg3.addOrReplaceChild("LowerRFrontLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.349F, 6.471F, -0.5626F, -0.4446F, 0.053F, 0.0491F));

		PartDefinition RFrontFoot4 = LowerRFrontLeg3.addOrReplaceChild("RFrontFoot4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1459F, 4.5825F, -1.191F, 0.5146F, -0.0182F, 0.0487F));

		PartDefinition RFrontFoot5 = RFrontFoot4.addOrReplaceChild("RFrontFoot5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5649F, -0.9039F));

		PartDefinition sacrum = main.addOrReplaceChild("sacrum", CubeListBuilder.create(), PartPose.offset(-1.1F, 0.4769F, 6.6014F));

		PartDefinition sacrum2 = main.addOrReplaceChild("sacrum2", CubeListBuilder.create(), PartPose.offset(0.1F, 0.4769F, 6.6014F));

		PartDefinition RBackLeg2 = main.addOrReplaceChild("RBackLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0321F, 1.935F, 9.1626F, -0.4298F, -0.1578F, -0.1579F));

		PartDefinition LowerRBackLeg2 = RBackLeg2.addOrReplaceChild("LowerRBackLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7058F, 7.3429F, -0.3685F, 0.7786F, 0.0706F, 0.194F));

		PartDefinition RBackFoot2 = LowerRBackLeg2.addOrReplaceChild("RBackFoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3426F, 5.5429F, 0.3447F, -0.3285F, -0.0199F, 0.0356F));

		PartDefinition RBackFoot3 = RBackFoot2.addOrReplaceChild("RBackFoot3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5F, -2.4F));

		PartDefinition RBackLeg3 = main.addOrReplaceChild("RBackLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0321F, 1.935F, 9.1626F, 0.2247F, 0.1578F, 0.1579F));

		PartDefinition LowerRBackLeg3 = RBackLeg3.addOrReplaceChild("LowerRBackLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7058F, 7.3429F, -0.3685F, 0.9931F, -0.0536F, -0.1916F));

		PartDefinition RBackFoot4 = LowerRBackLeg3.addOrReplaceChild("RBackFoot4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3426F, 5.5429F, 0.3447F, -0.1976F, 0.0199F, -0.0356F));

		PartDefinition RBackFoot5 = RBackFoot4.addOrReplaceChild("RBackFoot5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -2.4F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Tail = main.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 1.2763F, 11.7253F, -0.2201F, 0.1704F, -0.0379F));

		PartDefinition cube_r13 = Tail.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(13, 26).addBox(-0.5F, 0.2F, 3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1801F, -3.9607F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(17, 0).addBox(-1.0F, 0.1588F, -0.3904F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(20, 3).addBox(-1.0F, 0.1588F, 3.3096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.3949F, 3.766F, -0.1124F, 0.1735F, -0.0195F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(26, 17).addBox(-0.5F, 0.1524F, -0.1273F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.0447F, 4.1516F, -0.0841F, 0.1817F, 0.071F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(26, 23).addBox(-0.5F, 0.217F, -0.2206F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.056F, 3.8517F, -0.1591F, 0.2586F, -0.041F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, 0.2429F, -0.4901F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0314F, 3.8504F, 0.0225F, 0.2617F, 0.0058F));

		return LayerDefinition.create(meshdefinition, 73, 73);
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