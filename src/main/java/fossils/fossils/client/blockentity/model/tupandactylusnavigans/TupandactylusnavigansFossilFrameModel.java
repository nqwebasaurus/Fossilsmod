package fossils.fossils.client.blockentity.model.tupandactylusnavigans;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TupandactylusnavigansFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart chest1;
	private final ModelPart neck1;
	private final ModelPart neck5;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart crest1;
	private final ModelPart crest2;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart leftwing1;
	private final ModelPart leftwing2;
	private final ModelPart leftwing3;
	private final ModelPart lefthand2;
	private final ModelPart leftwing4;
	private final ModelPart leftwing5;
	private final ModelPart leftwing6;
	private final ModelPart leftwing7;
	private final ModelPart rightwing1;
	private final ModelPart rightwing2;
	private final ModelPart rightwing3;
	private final ModelPart righthand2;
	private final ModelPart rightwing4;
	private final ModelPart rightwing5;
	private final ModelPart rightwing6;
	private final ModelPart rightwing7;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body1;
	private final ModelPart tail1;
	private final ModelPart leftleg1;
	private final ModelPart leftleg2;
	private final ModelPart leftfoot;
	private final ModelPart leftlegwing2;
	private final ModelPart leftlegwing1;
	private final ModelPart rightleg1;
	private final ModelPart rightleg2;
	private final ModelPart rightfoot;
	private final ModelPart rightlegwing2;
	private final ModelPart rightlegwing1;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart bone;
	private final ModelPart bone3;

	public TupandactylusnavigansFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.chest1 = this.root.getChild("chest1");
		this.neck1 = this.chest1.getChild("neck1");
		this.neck5 = this.neck1.getChild("neck5");
		this.neck = this.neck5.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.crest1 = this.head.getChild("crest1");
		this.crest2 = this.crest1.getChild("crest2");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.leftwing1 = this.chest1.getChild("leftwing1");
		this.leftwing2 = this.leftwing1.getChild("leftwing2");
		this.leftwing3 = this.leftwing2.getChild("leftwing3");
		this.lefthand2 = this.leftwing3.getChild("lefthand2");
		this.leftwing4 = this.leftwing3.getChild("leftwing4");
		this.leftwing5 = this.leftwing4.getChild("leftwing5");
		this.leftwing6 = this.leftwing5.getChild("leftwing6");
		this.leftwing7 = this.leftwing6.getChild("leftwing7");
		this.rightwing1 = this.chest1.getChild("rightwing1");
		this.rightwing2 = this.rightwing1.getChild("rightwing2");
		this.rightwing3 = this.rightwing2.getChild("rightwing3");
		this.righthand2 = this.rightwing3.getChild("righthand2");
		this.rightwing4 = this.rightwing3.getChild("rightwing4");
		this.rightwing5 = this.rightwing4.getChild("rightwing5");
		this.rightwing6 = this.rightwing5.getChild("rightwing6");
		this.rightwing7 = this.rightwing6.getChild("rightwing7");
		this.body = this.chest1.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body1 = this.body3.getChild("body1");
		this.tail1 = this.body1.getChild("tail1");
		this.leftleg1 = this.body1.getChild("leftleg1");
		this.leftleg2 = this.leftleg1.getChild("leftleg2");
		this.leftfoot = this.leftleg2.getChild("leftfoot");
		this.leftlegwing2 = this.leftleg2.getChild("leftlegwing2");
		this.leftlegwing1 = this.leftleg1.getChild("leftlegwing1");
		this.rightleg1 = this.body1.getChild("rightleg1");
		this.rightleg2 = this.rightleg1.getChild("rightleg2");
		this.rightfoot = this.rightleg2.getChild("rightfoot");
		this.rightlegwing2 = this.rightleg2.getChild("rightlegwing2");
		this.rightlegwing1 = this.rightleg1.getChild("rightlegwing1");
		this.bone2 = this.body1.getChild("bone2");
		this.bone4 = this.body1.getChild("bone4");
		this.bone = this.chest1.getChild("bone");
		this.bone3 = this.chest1.getChild("bone3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -26.054F, 0.9051F, 0.3491F, 0.0F, 0.0F));

		PartDefinition chest1 = root.addOrReplaceChild("chest1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0357F, -8.2722F, -2.7689F, -0.5044F, 0.0F, 0.0F));

		PartDefinition cube_r1 = chest1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(31, 98).addBox(-0.5F, -0.8F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-0.3357F, 2.0466F, 1.4071F, 3.1416F, -1.4661F, -1.5708F));

		PartDefinition cube_r2 = chest1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(25, 92).addBox(-0.3F, 0.4F, -3.2F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, 1.1724F, 1.1142F, 1.5708F, -1.4661F, -1.5708F));

		PartDefinition cube_r3 = chest1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(30, 97).addBox(-0.5357F, 0.4377F, 0.7352F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4212F, -0.7096F, 0.1047F, 0.0F, 0.0F));

		PartDefinition neck1 = chest1.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4982F, -0.0053F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(113, 39).addBox(-0.5357F, -0.1F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(113, 39).addBox(-0.5357F, -0.1F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4445F, -0.5867F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck5 = neck1.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4445F, -0.9867F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r5 = neck5.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(9, 71).addBox(-0.5107F, -0.2F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(5, 67).addBox(-0.5107F, -0.2F, -5.6F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck = neck5.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2668F, -4.8196F, 0.1848F, -0.1287F, -0.024F));

		PartDefinition cube_r6 = neck.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(78, 0).addBox(-0.5357F, -0.1258F, -4.0016F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3956F, -0.0591F, -0.1658F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(78, 24).addBox(-0.5357F, -0.1429F, -4.3187F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(81, 27).addBox(-0.5357F, -0.1429F, -0.6187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2953F, -4.0192F, -0.2508F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3474F, -3.8445F, -0.0918F, 0.0F, 0.0F));

		PartDefinition cube_r7 = neck3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(78, 6).addBox(-0.5357F, 0.4F, -3.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.198F, -0.4517F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2166F, -3.9886F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(67, 54).addBox(-0.5357F, 0.35F, -10.15F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2033F, 5.5443F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8551F, -3.9424F, 0.8988F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0009F, 0.7233F, -3.1204F, -0.0514F, -0.0006F, -0.0013F));

		PartDefinition crest1 = head.addOrReplaceChild("crest1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.8125F, 7.031F, -0.0911F, 0.0F, 0.0F));

		PartDefinition crest2 = crest1.addOrReplaceChild("crest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, 1.3F, 0.0456F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3693F, -10.615F, -35.8902F, 0.0F, 0.0175F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2979F, -10.615F, -35.8902F, 0.0F, -0.0175F, 0.0F));

		PartDefinition leftwing1 = chest1.addOrReplaceChild("leftwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2854F, 2.6925F, 1.3731F, 0.4659F, -0.2502F, -0.1848F));

		PartDefinition leftwing2 = leftwing1.addOrReplaceChild("leftwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(8.1932F, 0.0533F, -3.0544F, -1.7333F, 0.6239F, -2.9739F));

		PartDefinition leftwing3 = leftwing2.addOrReplaceChild("leftwing3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3474F, 13.4936F, -0.2083F, -0.2686F, 0.1392F, 0.4116F));

		PartDefinition lefthand2 = leftwing3.addOrReplaceChild("lefthand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4232F, 13.2557F, 0.2718F, -1.5033F, -0.3627F, -0.243F));

		PartDefinition leftwing4 = leftwing3.addOrReplaceChild("leftwing4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9896F, 12.6841F, 0.573F, 1.6365F, 0.4965F, -2.981F));

		PartDefinition leftwing5 = leftwing4.addOrReplaceChild("leftwing5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6421F, 0.1007F, 21.1733F, 0.2229F, 0.176F, 0.7383F));

		PartDefinition leftwing6 = leftwing5.addOrReplaceChild("leftwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1201F, 0.0389F, 13.7384F, 0.2008F, 0.2885F, 0.0023F));

		PartDefinition leftwing7 = leftwing6.addOrReplaceChild("leftwing7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.082F, -0.3354F, 8.8757F, 0.0886F, 0.2178F, 0.0078F));

		PartDefinition rightwing1 = chest1.addOrReplaceChild("rightwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3569F, 2.6925F, 1.3731F, 0.2308F, 0.3352F, -0.1405F));

		PartDefinition rightwing2 = rightwing1.addOrReplaceChild("rightwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.1932F, 0.0533F, -3.0544F, -2.0075F, -0.6667F, 3.1283F));

		PartDefinition rightwing3 = rightwing2.addOrReplaceChild("rightwing3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3474F, 13.4936F, -0.2083F, -0.0194F, -0.1799F, -0.5796F));

		PartDefinition righthand2 = rightwing3.addOrReplaceChild("righthand2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4592F, 13.2577F, 0.3651F, -1.4869F, 0.3594F, 0.2895F));

		PartDefinition rightwing4 = rightwing3.addOrReplaceChild("rightwing4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7414F, 12.7202F, 0.3288F, 1.7029F, -0.7979F, 3.0565F));

		PartDefinition rightwing5 = rightwing4.addOrReplaceChild("rightwing5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6421F, 0.1007F, 21.1733F, 0.3102F, -0.176F, -0.7383F));

		PartDefinition rightwing6 = rightwing5.addOrReplaceChild("rightwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1201F, 0.0389F, 13.7384F, 0.2008F, -0.2885F, -0.0023F));

		PartDefinition rightwing7 = rightwing6.addOrReplaceChild("rightwing7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.082F, -0.3354F, 8.8757F, 0.0886F, -0.2178F, -0.0078F));

		PartDefinition body = chest1.addOrReplaceChild("body", CubeListBuilder.create().texOffs(78, 12).addBox(-0.5357F, 0.2669F, -0.1934F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3212F, 1.9887F, -0.0175F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1157F, 3.8999F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(91, 7).addBox(-0.5357F, 0.8076F, 2.3318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(89, 5).addBox(-0.5357F, 0.8076F, -0.3682F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.0872F, 0.0012F, -0.0018F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2457F, 2.9524F, -0.0964F, 0.0869F, -0.0084F));

		PartDefinition cube_r10 = body3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(34, 92).addBox(-0.5357F, 0.8076F, 0.0818F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.0872F, 0.0012F, -0.0018F));

		PartDefinition body1 = body3.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0039F, 3.0424F, -0.1722F, 0.086F, -0.0149F));

		PartDefinition cube_r11 = body1.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(20, 64).addBox(-0.5107F, 0.7F, 3.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(15, 59).addBox(-0.5107F, 0.7F, -2.6F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0723F, 2.3588F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r12 = body1.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(16, 60).addBox(1.2F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0107F, 1.2855F, 2.7167F, -1.5708F, -1.5359F, 1.5708F));

		PartDefinition tail1 = body1.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(0, 86).addBox(-0.5357F, 0.2222F, -0.0329F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6638F, 5.9585F, 0.0509F, 0.2179F, 0.011F));

		PartDefinition leftleg1 = body1.addOrReplaceChild("leftleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.304F, 1.6809F, 4.0472F, 0.6451F, 0.3741F, -1.3915F));

		PartDefinition leftleg2 = leftleg1.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2556F, 11.0069F, 1.6021F, 0.9178F, 0.0609F, 0.2316F));

		PartDefinition leftfoot = leftleg2.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5434F, 17.5344F, 1.1801F, 0.7629F, -0.1629F, -0.0365F));

		PartDefinition leftlegwing2 = leftleg2.addOrReplaceChild("leftlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4691F, 0.0921F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition leftlegwing1 = leftleg1.addOrReplaceChild("leftlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5279F, -0.2807F, 1.0914F, 0.1367F, 0.0F, 0.0F));

		PartDefinition rightleg1 = body1.addOrReplaceChild("rightleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3754F, 1.6809F, 4.0472F, 0.2975F, -0.0989F, 1.3145F));

		PartDefinition rightleg2 = rightleg1.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2556F, 11.0069F, 1.6021F, 0.9178F, -0.0609F, -0.2316F));

		PartDefinition rightfoot = rightleg2.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5434F, 17.5344F, 1.1801F, 1.112F, 0.1629F, 0.0365F));

		PartDefinition rightlegwing2 = rightleg2.addOrReplaceChild("rightlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4691F, 0.0921F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition rightlegwing1 = rightleg1.addOrReplaceChild("rightlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5279F, -0.2807F, 1.0914F, 0.1367F, 0.0F, 0.0F));

		PartDefinition bone2 = body1.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4F, 0.8888F, 3.5179F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone4 = body1.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4715F, 0.8888F, 3.5179F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone = chest1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.7781F, 1.2287F, 1.6873F));

		PartDefinition bone3 = chest1.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-1.8496F, 1.2287F, 1.6873F));

		return LayerDefinition.create(meshdefinition, 120, 120);
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