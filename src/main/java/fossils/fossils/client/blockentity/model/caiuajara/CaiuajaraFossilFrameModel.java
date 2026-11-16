package fossils.fossils.client.blockentity.model.caiuajara;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CaiuajaraFossilFrameModel extends SkullModelBase {
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
	private final ModelPart bone3;
	private final ModelPart bone;
	private final ModelPart bone4;

	public CaiuajaraFossilFrameModel(ModelPart root) {
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
		this.bone3 = this.body1.getChild("bone3");
		this.bone = this.chest1.getChild("bone");
		this.bone4 = this.chest1.getChild("bone4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -26.054F, 0.9051F, 0.262F, 0.0421F, 0.0113F));

		PartDefinition chest1 = root.addOrReplaceChild("chest1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0357F, -9.6015F, -2.1671F, -0.4492F, 0.549F, -0.4324F));

		PartDefinition cube_r1 = chest1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(36, 81).addBox(-0.5F, -0.1F, -3.8F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, 1.0651F, 1.1783F, 1.5272F, -1.4661F, -1.5708F));

		PartDefinition cube_r2 = chest1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(42, 87).addBox(-0.5357F, 0.3377F, 0.8102F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4212F, -0.7096F, 0.1047F, 0.0F, 0.0F));

		PartDefinition neck1 = chest1.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4982F, -0.0053F, -0.0763F, 0.1376F, 0.0763F));

		PartDefinition cube_r3 = neck1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(59, 79).addBox(-0.5357F, -0.275F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(57, 77).addBox(-0.5357F, -0.275F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4445F, -0.5867F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck5 = neck1.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4695F, -2.9617F, 0.0114F, 0.0865F, 0.1314F));

		PartDefinition cube_r4 = neck5.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 73).addBox(-0.5357F, -0.2F, -3.225F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck = neck5.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1858F, -2.7405F, 0.1136F, 0.0428F, 0.0087F));

		PartDefinition cube_r5 = neck.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(62, 22).addBox(-0.5357F, -0.1759F, -0.6266F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(59, 19).addBox(-0.5357F, -0.1759F, -4.3266F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1044F, -0.0591F, -0.1658F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(60, 51).addBox(-0.5357F, -0.1179F, -3.9187F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.8062F, -4.0307F, -0.2793F, 0.1259F, -0.036F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3553F, -3.8145F, -0.0755F, 0.174F, -0.0131F));

		PartDefinition cube_r6 = neck3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(61, 15).addBox(-0.5357F, 0.4F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(59, 13).addBox(-0.5357F, 0.4F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.198F, -0.4517F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0568F, -3.9345F, -0.4522F, 0.2073F, -0.0684F));

		PartDefinition cube_r7 = neck4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(49, 37).addBox(-0.5357F, 0.4F, -11.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.026F, 6.5022F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8581F, -5.2491F, 1.5097F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0001F, 1.0218F, -4.2568F, -0.1125F, -0.0006F, -0.0013F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3693F, -10.615F, -35.8902F, 0.0F, 0.0175F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2979F, -10.615F, -35.8902F, 0.0F, -0.0175F, 0.0F));

		PartDefinition leftwing1 = chest1.addOrReplaceChild("leftwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5483F, 2.0289F, 1.8168F, -0.4873F, -0.1119F, -0.5405F));

		PartDefinition leftwing2 = leftwing1.addOrReplaceChild("leftwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(9.27F, 0.6146F, -2.6512F, -2.2496F, 0.7876F, 2.5664F));

		PartDefinition leftwing3 = leftwing2.addOrReplaceChild("leftwing3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.875F, 15.0329F, -0.6503F, -0.1202F, 0.0723F, 0.3287F));

		PartDefinition lefthand2 = leftwing3.addOrReplaceChild("lefthand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7456F, 14.8417F, 0.4278F, -1.439F, -0.3453F, -0.4281F));

		PartDefinition leftwing4 = leftwing3.addOrReplaceChild("leftwing4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2595F, 14.386F, 0.4123F, 1.6681F, -0.1071F, -2.9851F));

		PartDefinition leftwing5 = leftwing4.addOrReplaceChild("leftwing5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6304F, 0.1112F, 17.265F, 0.2201F, -0.0794F, 0.6809F));

		PartDefinition leftwing6 = leftwing5.addOrReplaceChild("leftwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.037F, -0.0515F, 10.6267F, 0.1925F, 0.0317F, -0.0493F));

		PartDefinition leftwing7 = leftwing6.addOrReplaceChild("leftwing7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3519F, -0.2145F, 7.8393F, 0.0865F, 0.0005F, -0.0114F));

		PartDefinition rightwing1 = chest1.addOrReplaceChild("rightwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6198F, 2.0289F, 1.8168F, -0.2468F, 0.4757F, -0.0832F));

		PartDefinition rightwing2 = rightwing1.addOrReplaceChild("rightwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-9.27F, 0.6146F, -2.6512F, -2.1314F, -0.8357F, -2.7126F));

		PartDefinition rightwing3 = rightwing2.addOrReplaceChild("rightwing3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.875F, 15.0329F, -0.6503F, -0.0788F, 0.0757F, -0.5619F));

		PartDefinition righthand2 = rightwing3.addOrReplaceChild("righthand2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5927F, 14.8333F, 0.0314F, 1.2475F, -0.1773F, -2.2436F));

		PartDefinition rightwing4 = rightwing3.addOrReplaceChild("rightwing4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6337F, 13.7343F, 0.5695F, 1.5925F, -0.5126F, 3.0599F));

		PartDefinition rightwing5 = rightwing4.addOrReplaceChild("rightwing5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6304F, 0.1112F, 17.265F, 0.0902F, -0.2257F, -0.6949F));

		PartDefinition rightwing6 = rightwing5.addOrReplaceChild("rightwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.037F, -0.0515F, 10.6267F, 0.2008F, -0.2885F, -0.0023F));

		PartDefinition rightwing7 = rightwing6.addOrReplaceChild("rightwing7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3519F, -0.2145F, 7.8393F, 0.0907F, -0.3047F, -0.0159F));

		PartDefinition body = chest1.addOrReplaceChild("body", CubeListBuilder.create().texOffs(59, 31).addBox(-0.5357F, 0.1669F, -0.1434F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3212F, 1.9887F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(62, 34).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, 0.3169F, 3.7066F, -0.1134F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1157F, 3.8999F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(76, 63).addBox(-0.5357F, 0.7076F, 0.3318F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.0872F, 0.0012F, -0.0018F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2457F, 2.9524F, -0.0964F, 0.0869F, -0.0084F));

		PartDefinition cube_r10 = body3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(92, 58).addBox(-0.5357F, 0.7076F, 0.0818F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.0872F, 0.0012F, -0.0018F));

		PartDefinition body1 = body3.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0819F, 2.0442F, -0.129F, 0.1298F, -0.0168F));

		PartDefinition cube_r11 = body1.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(35, 40).addBox(-1.8F, -0.9F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, 1.1748F, 2.6949F, -1.5708F, 1.5359F, -1.5708F));

		PartDefinition cube_r12 = body1.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(34, 39).addBox(-0.5357F, 0.625F, -3.625F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0723F, 3.3588F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail1 = body1.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(49, 44).addBox(-0.5357F, 0.1972F, -0.5329F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6441F, 5.9475F, -0.1874F, -0.1286F, 0.0243F));

		PartDefinition leftleg1 = body1.addOrReplaceChild("leftleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.27F, 1.0165F, 4.1942F, 0.5438F, 0.4426F, -1.5128F));

		PartDefinition leftleg2 = leftleg1.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1991F, 11.4972F, 2.5446F, 0.5426F, 0.0609F, 0.2316F));

		PartDefinition leftfoot = leftleg2.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7425F, 14.4622F, 1.7082F, 1.2587F, -0.1595F, -0.0806F));

		PartDefinition leftlegwing2 = leftleg2.addOrReplaceChild("leftlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4691F, 0.0921F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition leftlegwing1 = leftleg1.addOrReplaceChild("leftlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5279F, -0.2807F, 1.0914F, 0.1367F, 0.0F, 0.0F));

		PartDefinition rightleg1 = body1.addOrReplaceChild("rightleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3415F, 1.0165F, 4.1942F, 0.6253F, -0.3801F, 1.0534F));

		PartDefinition rightleg2 = rightleg1.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1991F, 11.4972F, 2.5446F, 0.2372F, -0.0609F, -0.2316F));

		PartDefinition rightfoot = rightleg2.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7425F, 14.4622F, 1.7082F, 1.3023F, 0.1595F, 0.0806F));

		PartDefinition rightlegwing2 = rightleg2.addOrReplaceChild("rightlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4691F, 0.0921F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition rightlegwing1 = rightleg1.addOrReplaceChild("rightlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5279F, -0.2807F, 1.0914F, 0.1367F, 0.0F, 0.0F));

		PartDefinition bone2 = body1.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4F, 0.2749F, 3.9153F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone3 = body1.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4715F, 0.2749F, 3.9153F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone = chest1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7781F, 0.5416F, 2.9737F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone4 = chest1.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8496F, 0.5416F, 2.9737F, -0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 116, 116);
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