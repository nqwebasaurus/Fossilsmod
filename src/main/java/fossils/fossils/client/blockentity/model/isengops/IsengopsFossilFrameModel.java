package fossils.fossils.client.blockentity.model.isengops;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class IsengopsFossilFrameModel extends SkullModelBase {
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
	private final ModelPart Tail6;
	private final ModelPart Tail7;

	public IsengopsFossilFrameModel(ModelPart root) {
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
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.7F, -3.0F, -0.5F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-1.9F, -11.0F, -11.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(0.3F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.9F, -11.0F, -11.0F, -0.3054F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-0.35F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -11.15F, 9.0F, 0.0873F, 0.0F, -1.5708F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(2, 1).addBox(-1.0F, -1.85F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.5F, -11.15F, 9.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition proburnetia = fossil.addOrReplaceChild("proburnetia", CubeListBuilder.create(), PartPose.offset(0.5F, -12.1F, 3.0F));

		PartDefinition main = proburnetia.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.4668F, -3.1567F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r5 = main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(13, 19).addBox(-0.5F, 0.0169F, -0.3056F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.5769F, 7.2014F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = main.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.0186F, 6.9189F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(3, 15).addBox(-0.5F, -0.0792F, 8.9939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 12).addBox(-0.5F, -0.0792F, 4.2939F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -9.6F, -0.0611F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.0406F, -4.9571F, 0.0701F, 0.0871F, 0.0061F));

		PartDefinition cube_r7 = body2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(13, 12).addBox(-0.5F, -0.0792F, -0.5061F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.0406F, -4.6429F, -0.0611F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.3516F, -5.0172F, -0.0175F, 0.0873F, -0.0015F));

		PartDefinition cube_r8 = body3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, 0.4963F, 4.1957F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.8F, -9.0F, 0.1134F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.5202F, -4.8266F, 0.219F, 0.0852F, 0.0189F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(16, 29).addBox(-0.5F, 0.4963F, 3.2957F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(13, 26).addBox(-0.5F, 0.4963F, -0.4043F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.2499F, -4.0959F, 0.1134F, 0.0F, 0.0F));

		PartDefinition scapula = chest.addOrReplaceChild("scapula", CubeListBuilder.create(), PartPose.offset(-0.2F, 0.4499F, -4.3959F));

		PartDefinition scapula2 = chest.addOrReplaceChild("scapula2", CubeListBuilder.create(), PartPose.offset(-0.8F, 0.4499F, -4.3959F));

		PartDefinition Neck2 = chest.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.5237F, -3.9361F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Neck2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(41, 53).addBox(-0.5F, 0.3648F, 1.4653F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.1F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1324F, -1.5559F, 0.0447F, 0.218F, 0.0097F));

		PartDefinition cube_r11 = Neck3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(48, 53).addBox(-0.5F, 0.3648F, 1.7653F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.5F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1636F, -1.984F, 0.2364F, 0.1863F, 0.1547F));

		PartDefinition cube_r12 = Neck4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(3, 22).addBox(-0.5F, 0.3648F, 3.1653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 19).addBox(-0.5F, 0.3648F, -1.5347F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.5F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Head = Neck4.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5276F, -3.0519F, 0.4725F, 0.185F, -0.0018F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.7874F, -0.7722F, -0.9007F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.7874F, -0.7722F, -0.9007F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4149F, -0.9706F, 0.6109F, 0.0F, 0.0F));

		PartDefinition RFrontLeg2 = chest.addOrReplaceChild("RFrontLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1F, 3.2877F, -3.5977F, 1.0003F, -0.0552F, 0.1188F));

		PartDefinition LowerRFrontLeg2 = RFrontLeg2.addOrReplaceChild("LowerRFrontLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.349F, 6.471F, -0.5626F, -1.3776F, 0.0069F, -0.1095F));

		PartDefinition RFrontFoot2 = LowerRFrontLeg2.addOrReplaceChild("RFrontFoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1459F, 4.5825F, -1.191F, 0.7322F, 0.0214F, -0.0583F));

		PartDefinition RFrontFoot3 = RFrontFoot2.addOrReplaceChild("RFrontFoot3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5649F, -0.9039F, 0.3927F, 0.0F, 0.0F));

		PartDefinition RFrontLeg3 = chest.addOrReplaceChild("RFrontLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1F, 3.2877F, -3.5977F, 0.4767F, 0.0552F, -0.1188F));

		PartDefinition LowerRFrontLeg3 = RFrontLeg3.addOrReplaceChild("LowerRFrontLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.349F, 6.471F, -0.5626F, -0.5486F, -0.0069F, 0.1095F));

		PartDefinition RFrontFoot4 = LowerRFrontLeg3.addOrReplaceChild("RFrontFoot4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1459F, 4.5825F, -1.191F, 0.0777F, -0.0214F, 0.0583F));

		PartDefinition RFrontFoot5 = RFrontFoot4.addOrReplaceChild("RFrontFoot5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5649F, -0.9039F, -0.1309F, 0.0F, 0.0F));

		PartDefinition sacrum = main.addOrReplaceChild("sacrum", CubeListBuilder.create(), PartPose.offset(-1.1F, 0.5769F, 7.2014F));

		PartDefinition sacrum2 = main.addOrReplaceChild("sacrum2", CubeListBuilder.create(), PartPose.offset(0.1F, 0.5769F, 7.2014F));

		PartDefinition RBackLeg2 = main.addOrReplaceChild("RBackLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1495F, 1.707F, 10.0904F, 0.0502F, -0.1578F, -0.1579F));

		PartDefinition LowerRBackLeg2 = RBackLeg2.addOrReplaceChild("LowerRBackLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7058F, 7.3429F, -0.3685F, 1.1255F, 0.0827F, 0.1941F));

		PartDefinition RBackFoot2 = LowerRBackLeg2.addOrReplaceChild("RBackFoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3426F, 5.5429F, 0.3447F, -0.3721F, -0.0199F, 0.0356F));

		PartDefinition RBackFoot3 = RBackFoot2.addOrReplaceChild("RBackFoot3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -2.4F, -0.6545F, 0.0F, 0.0F));

		PartDefinition RBackLeg3 = main.addOrReplaceChild("RBackLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1495F, 1.707F, 10.0904F, -0.4298F, 0.1578F, 0.1579F));

		PartDefinition LowerRBackLeg3 = RBackLeg3.addOrReplaceChild("LowerRBackLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7058F, 7.3429F, -0.3685F, 0.6019F, -0.0827F, -0.1941F));

		PartDefinition RBackFoot4 = LowerRBackLeg3.addOrReplaceChild("RBackFoot4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3426F, 5.5429F, 0.3447F, -0.1103F, 0.0199F, -0.0356F));

		PartDefinition RBackFoot5 = RBackFoot4.addOrReplaceChild("RBackFoot5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5F, -2.4F));

		PartDefinition Tail = main.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 1.2763F, 11.7253F, -0.2082F, 0.0F, 0.0F));

		PartDefinition cube_r13 = Tail.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(30, 0).addBox(-0.5F, 0.2F, 3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1801F, -3.9607F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(26, 12).addBox(-1.0F, 0.1588F, -0.1904F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(29, 15).addBox(-1.0F, 0.1588F, 3.5096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.3949F, 3.766F, -0.1124F, -0.1735F, 0.0195F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(30, 6).addBox(-0.5F, 0.1524F, -0.0273F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.0447F, 4.1516F, -0.0808F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 32).addBox(-0.5F, 0.217F, -0.2206F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.056F, 3.8517F, -0.1383F, -0.1729F, 0.0239F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(11, 32).addBox(-0.5F, 0.2429F, -0.4901F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(14, 35).addBox(-0.5F, 0.2429F, 3.2099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0314F, 3.8504F, 0.0231F, 0.349F, 0.0079F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(22, 32).addBox(-0.5F, 0.2429F, -0.2901F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(25, 35).addBox(-0.5F, 0.2429F, 3.4099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.013F, 3.9447F, 0.1159F, 0.3469F, 0.0396F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create().texOffs(33, 32).addBox(-0.5F, 0.2429F, -0.0901F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0011F, 3.8982F, 0.2119F, 0.3848F, 0.0806F));

		return LayerDefinition.create(meshdefinition, 80, 80);
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