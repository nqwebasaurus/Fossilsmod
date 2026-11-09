package fossils.fossils.client.blockentity.model.inawentu;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class InawentuFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart bodymiddle;
	private final ModelPart body;
	private final ModelPart bodyfront;
	private final ModelPart chest;
	private final ModelPart neckbase;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neckmiddlebase;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neckmiddlefront;
	private final ModelPart neck5;
	private final ModelPart neckfront;
	private final ModelPart neckflapfront;
	private final ModelPart neckskinfront;
	private final ModelPart neck6;
	private final ModelPart neck7;
	private final ModelPart head;
	private final ModelPart lowerjawbase;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart neckflapmidfront;
	private final ModelPart neckskinmidfront;
	private final ModelPart neckflapmidbase;
	private final ModelPart neckskinmidbase;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;
	private final ModelPart tail10;
	private final ModelPart tail11;
	private final ModelPart tail12;
	private final ModelPart tail13;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart leftLeg8;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart rightLeg8;

	public InawentuFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.bodymiddle = this.hips.getChild("bodymiddle");
		this.body = this.bodymiddle.getChild("body");
		this.bodyfront = this.body.getChild("bodyfront");
		this.chest = this.bodyfront.getChild("chest");
		this.neckbase = this.chest.getChild("neckbase");
		this.neck = this.neckbase.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neckmiddlebase = this.neck2.getChild("neckmiddlebase");
		this.neck3 = this.neckmiddlebase.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neckmiddlefront = this.neck4.getChild("neckmiddlefront");
		this.neck5 = this.neckmiddlefront.getChild("neck5");
		this.neckfront = this.neck5.getChild("neckfront");
		this.neckflapfront = this.neckfront.getChild("neckflapfront");
		this.neckskinfront = this.neckflapfront.getChild("neckskinfront");
		this.neck6 = this.neckfront.getChild("neck6");
		this.neck7 = this.neck6.getChild("neck7");
		this.head = this.neck7.getChild("head");
		this.lowerjawbase = this.head.getChild("lowerjawbase");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.neckflapmidfront = this.neckmiddlefront.getChild("neckflapmidfront");
		this.neckskinmidfront = this.neckflapmidfront.getChild("neckskinmidfront");
		this.neckflapmidbase = this.neckmiddlebase.getChild("neckflapmidbase");
		this.neckskinmidbase = this.neckflapmidbase.getChild("neckskinmidbase");
		this.leftArm = this.bodyfront.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.rightArm = this.bodyfront.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.bone = this.bodyfront.getChild("bone");
		this.bone3 = this.bodyfront.getChild("bone3");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
		this.tail10 = this.tail9.getChild("tail10");
		this.tail11 = this.tail10.getChild("tail11");
		this.tail12 = this.tail11.getChild("tail12");
		this.tail13 = this.tail12.getChild("tail13");
		this.bone2 = this.hips.getChild("bone2");
		this.bone4 = this.hips.getChild("bone4");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg3 = this.leftLeg.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.leftLeg8 = this.leftLeg4.getChild("leftLeg8");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg3 = this.rightLeg.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.rightLeg8 = this.rightLeg4.getChild("rightLeg8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -32.0F, 13.0F, 1.0F, 32.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(2.35F, -8.0F, -0.5F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -21.85F, -12.5F, 0.0436F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -16.15F, -0.5F, 1.0F, 38.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -21.85F, -12.5F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-1.0F, -7.0F, -0.5F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -30.0F, 13.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -23.3F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.7364F, 14.2869F, -0.4465F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(28, 10).addBox(-0.5F, -1.082F, 0.6501F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -7.8F, 0.0349F, 0.0F, 0.0F));

		PartDefinition bodymiddle = hips.addOrReplaceChild("bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -7.7F, 0.1274F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bodymiddle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(74, 8).addBox(-0.5F, 0.8122F, 13.5242F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.9957F, -18.7642F, -0.1047F, 0.0F, 0.0F));

		PartDefinition body = bodymiddle.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6022F, -5.7966F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(41, 73).addBox(-0.5F, 0.9372F, 5.1992F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.205F, -10.9429F, -0.1047F, 0.0F, 0.0F));

		PartDefinition bodyfront = body.addOrReplaceChild("bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4624F, -6.1204F, 0.1012F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bodyfront.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(57, 73).addBox(-0.5F, -0.5749F, 6.1699F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.7074F, -11.8013F, -0.1745F, 0.0F, 0.0F));

		PartDefinition chest = bodyfront.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9562F, -5.2632F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(90, 49).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7809F, -0.6893F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(86, 45).addBox(-0.5F, -0.5999F, 0.6199F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4262F, -5.9807F, -0.1745F, 0.0F, 0.0F));

		PartDefinition neckbase = chest.addOrReplaceChild("neckbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0393F, -5.1723F, -0.1651F, 0.0F, 0.0F));

		PartDefinition cube_r10 = neckbase.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(85, 62).addBox(-0.475F, 0.0F, 6.575F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.8822F, -11.8196F, 0.0175F, 0.0F, 0.0F));

		PartDefinition neck = neckbase.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9335F, -4.912F, -0.0536F, -0.2179F, 0.0116F));

		PartDefinition cube_r11 = neck.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(66, 63).addBox(-0.5F, 0.0F, 0.75F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.064F, -7.8066F, 0.0175F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(90, 32).addBox(-0.5F, 0.5278F, -5.7786F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3849F, -6.6301F, 0.0585F, -0.1283F, -0.0508F));

		PartDefinition neckmiddlebase = neck2.addOrReplaceChild("neckmiddlebase", CubeListBuilder.create().texOffs(0, 104).addBox(-0.5F, 0.67F, -5.2164F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(4, 108).addBox(-0.5F, 0.67F, -0.5164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1119F, -6.0185F, 0.096F, -0.0828F, -0.0516F));

		PartDefinition neck3 = neckmiddlebase.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(17, 85).addBox(-0.5652F, -0.2606F, -5.8208F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0152F, 0.9302F, -4.9997F, 0.0553F, -0.1264F, -0.0936F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(101, 42).addBox(-0.701F, 0.6653F, -4.5555F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1858F, -0.9048F, -5.9477F, 0.0709F, -0.1741F, -0.0123F));

		PartDefinition neckmiddlefront = neck4.addOrReplaceChild("neckmiddlefront", CubeListBuilder.create().texOffs(103, 49).addBox(-0.5F, 0.6643F, -5.1792F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(107, 53).addBox(-0.5F, 0.6643F, -0.4792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.201F, 0.003F, -4.7985F, 0.0822F, -0.1271F, -0.0538F));

		PartDefinition neck5 = neckmiddlefront.addOrReplaceChild("neck5", CubeListBuilder.create().texOffs(46, 103).addBox(-0.5152F, 0.6727F, -4.8625F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0152F, 0.0063F, -5.0512F, 0.1056F, -0.1302F, -0.0138F));

		PartDefinition neckfront = neck5.addOrReplaceChild("neckfront", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5152F, -0.0014F, -4.9505F, 0.0604F, -0.2178F, -0.0131F));

		PartDefinition cube_r12 = neckfront.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(31, 104).addBox(-0.5F, -0.5F, 4.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(28, 101).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5349F, 1.2556F, -5.0344F, 0.0131F, 0.0F, 0.0001F));

		PartDefinition neckflapfront = neckfront.addOrReplaceChild("neckflapfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2212F, -11.5931F, -0.1911F, 0.0F, 0.0F));

		PartDefinition neckskinfront = neckflapfront.addOrReplaceChild("neckskinfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5F, 0.5F, -0.0848F, 0.0F, 0.0F));

		PartDefinition neck6 = neckfront.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9555F, -4.8983F, 0.1207F, -0.1737F, 0.0169F));

		PartDefinition cube_r13 = neck6.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(111, 88).addBox(-0.5F, 0.2F, -4.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.4912F, 0.1064F, 0.1047F, 0.0F, 0.0F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0282F, -0.499F, -4.0293F, -0.0176F, -0.1309F, 0.0023F));

		PartDefinition cube_r14 = neck7.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(93, 119).addBox(-0.5F, 0.2F, -8.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4718F, 0.011F, 4.1365F, 0.1047F, 0.0F, 0.0F));

		PartDefinition head = neck7.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0282F, 0.6443F, -3.7024F, 0.5363F, 0.0F, 0.0F));

		PartDefinition lowerjawbase = head.addOrReplaceChild("lowerjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 2.5939F, -1.8729F, 0.0611F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5F, -5.6646F, -3.1301F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.5F, -5.6646F, -3.1301F));

		PartDefinition neckflapmidfront = neckmiddlefront.addOrReplaceChild("neckflapmidfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 0.0546F, -9.113F, -0.2335F, 0.0F, 0.0F));

		PartDefinition neckskinmidfront = neckflapmidfront.addOrReplaceChild("neckskinmidfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.5F, -0.5F, -0.0424F, 0.0F, 0.0F));

		PartDefinition neckflapmidbase = neckmiddlebase.addOrReplaceChild("neckflapmidbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5539F, -12.2082F, -0.1911F, 0.0F, 0.0F));

		PartDefinition neckskinmidbase = neckflapmidbase.addOrReplaceChild("neckskinmidbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.3F, 0.8F, -0.0637F, 0.0F, 0.0F));

		PartDefinition leftArm = bodyfront.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(6.9412F, 10.3326F, -11.4077F, 0.9599F, 0.0016F, -0.0018F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0921F, 10.6791F, -5.4788F, -1.0821F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8937F, 8.272F, -0.9976F, 0.3403F, 0.0F, 0.0F));

		PartDefinition rightArm = bodyfront.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.9412F, 10.3326F, -11.4077F, 0.3054F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0921F, 10.6791F, -5.4788F, -0.5149F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8937F, 8.272F, -0.9976F, 0.2531F, 0.0F, 0.0F));

		PartDefinition bone = bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(7.0629F, 5.0242F, -8.2224F, 0.2131F, 0.1807F, 0.2131F));

		PartDefinition bone3 = bodyfront.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.0629F, 5.0242F, -8.2224F, 0.2131F, -0.1807F, -0.2131F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(53, 9).addBox(-0.5F, -0.1679F, 0.5261F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.6992F, 2.0273F, 0.1475F, 0.0863F, 0.0128F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(47, 52).addBox(-0.475F, 0.7976F, 0.4231F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9523F, 7.9957F, -0.0051F, -0.0872F, 0.0042F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(51, 32).addBox(-0.425F, -1.1774F, 0.4981F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.9951F, 7.8605F, 0.088F, -0.1304F, -0.0115F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2011F, 7.9372F, 0.2934F, -0.2585F, -0.0419F));

		PartDefinition cube_r15 = tail4.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(28, 71).addBox(-0.5F, -1.0F, 7.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(21, 64).addBox(-0.5F, -1.0F, -0.2F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0226F, 0.4231F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 66).addBox(-0.5F, 0.5226F, 0.0231F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.7896F, 7.9005F, 0.1114F, -0.3471F, -0.038F));

		PartDefinition cube_r16 = tail5.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(7, 73).addBox(-0.85F, -0.85F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 1.3726F, 7.8981F, 0.0888F, -0.3925F, -0.0041F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(67, 52).addBox(-0.5F, 0.5226F, 0.0481F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0156F, 7.9012F, 0.2115F, -0.5222F, -0.0403F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(83, 89).addBox(-0.575F, 0.4226F, -0.6769F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(88, 94).addBox(-0.575F, 0.4226F, 5.0231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.007F, 7.9002F, 0.368F, -0.252F, -0.0657F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0051F, 5.9225F, 0.0452F, -0.2615F, -0.0117F));

		PartDefinition cube_r17 = tail8.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(95, 12).addBox(-0.85F, -0.825F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3486F, 1.3476F, 5.5661F, 0.0F, -0.2443F, 0.0F));

		PartDefinition cube_r18 = tail8.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(90, 7).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, 1.0226F, -0.0769F, 0.0F, 0.0175F, 0.0F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(118, 53).addBox(-0.475F, 0.7949F, -0.0098F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2715F, 6.043F, -0.0801F, -0.4667F, 0.1166F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(82, 118).addBox(-1.0F, 0.7F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(85, 121).addBox(-1.0F, 0.7F, 3.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.5F, 0.0949F, 4.0152F, -0.1158F, -0.1724F, 0.0276F));

		PartDefinition tail11 = tail10.addOrReplaceChild("tail11", CubeListBuilder.create().texOffs(11, 119).addBox(-1.0F, 0.7F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.1293F, -0.2559F, 0.0557F));

		PartDefinition tail12 = tail11.addOrReplaceChild("tail12", CubeListBuilder.create().texOffs(119, 94).addBox(-1.0F, 0.7F, -0.15F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.0933F, -0.2577F, 0.0465F));

		PartDefinition tail13 = tail12.addOrReplaceChild("tail13", CubeListBuilder.create().texOffs(119, 115).addBox(-1.0F, 0.7F, -0.225F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.1787F, -0.2148F, 0.0385F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9814F, 6.5321F, -5.1855F, 0.2182F, 0.0F, 0.0F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9814F, 6.5321F, -5.1855F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(5.9F, 1.9425F, -0.4116F, 1.1781F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 7.3786F, -15.1498F, 0.6981F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0245F, 2.0152F, -10.1854F, 0.0992F, -0.0163F, 0.0386F));

		PartDefinition leftLeg8 = leftLeg4.addOrReplaceChild("leftLeg8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.79F, -2.0694F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.9F, 1.9425F, -0.4116F, 1.6144F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 7.3786F, -15.1498F, 0.6981F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0245F, 2.0152F, -10.1854F, -0.2499F, 0.0163F, -0.0386F));

		PartDefinition rightLeg8 = rightLeg4.addOrReplaceChild("rightLeg8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.79F, -2.0694F, -0.0349F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 160, 160);
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